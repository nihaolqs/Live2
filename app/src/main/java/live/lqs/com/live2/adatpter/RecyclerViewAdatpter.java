package live.lqs.com.live2.adatpter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import live.lqs.com.live2.adatpter.ViewHolder.AbsViewHolder;
import live.lqs.com.live2.adatpter.ViewHolder.IRecyclerViewOnLongClickListener;
import live.lqs.com.live2.adatpter.ViewHolder.IRecyclerViewOnclickListener;
import live.lqs.com.live2.adatpter.ViewHolder.ViewHolderPool;

/**
 * Created by dell on 2017/3/10.
 */

public class RecyclerViewAdatpter<T extends IRecyclerViewData> extends RecyclerView.Adapter<AbsViewHolder> {

    public static final int TYPE_CLICKABLE =        0b10000000000000000000000000000000; //位域 采取位与运算判断是否选中

    public static final int TYPE_LONGCLICKABLE =    0b01000000000000000000000000000000; //位域 采取位与运算判断是否选中

    private ViewHolderPool mViewHolderPool;

    private IRecyclerViewOnclickListener mOnclickListener;

    private IRecyclerViewOnLongClickListener mOnLongClickListener;

    private ArrayList<T> mDataList = new ArrayList<>();

    public RecyclerViewAdatpter(Context context) {
        mViewHolderPool = ViewHolderPool.getInstance(context);
    }

    @Override
    public AbsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AbsViewHolder holder = mViewHolderPool.getViewHolder(viewType);
        if (mOnclickListener != null && (viewType & TYPE_CLICKABLE) != 0) {
            holder.setOnclickListener(mOnclickListener);
        }
        if (mOnLongClickListener != null && (viewType & TYPE_LONGCLICKABLE) != 0) {
            holder.setLongClickListener(mOnLongClickListener);
        }
        return holder;
    }


    @Override
    public void onBindViewHolder(AbsViewHolder holder, int position) {
        T t = mDataList.get(position);
        holder.bindData(holder.itemView, t);
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return mDataList.get(position).getType();
    }

    public void setDataList(List<T> list) {
        this.mDataList.clear();
        addDatalist(list);
    }

    public void addDatalist(List list) {
        this.mDataList.addAll(list);
        notifyDataSetChanged();
    }

    public ViewHolderPool getViewHolderPool() {
        return mViewHolderPool;
    }

    public void setmOnclickListener(IRecyclerViewOnclickListener listener) {
        this.mOnclickListener = listener;
    }

    public void setmOnLongClickListener(IRecyclerViewOnLongClickListener mOnLongClickListener) {
        this.mOnLongClickListener = mOnLongClickListener;
    }

    public ArrayList<T> getmDataList() {
        return mDataList;
    }
}
