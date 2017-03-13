package live.lqs.com.live2.adatpter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import live.lqs.com.live2.adatpter.ViewHolder.AbsViewHolder;
import live.lqs.com.live2.adatpter.ViewHolder.ViewHolderPool;

/**
 * Created by dell on 2017/3/10.
 */

public class RecyclerViewAdatpter<T extends IRecyclerViewData> extends RecyclerView.Adapter<AbsViewHolder> {

    private ViewHolderPool mViewHolderPool;

    private ArrayList<T> mDataList = new ArrayList<>();

    public RecyclerViewAdatpter(Context context) {
        mViewHolderPool = ViewHolderPool.getInstance(context);
    }

    @Override
    public AbsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AbsViewHolder holder = mViewHolderPool.getViewHolder(viewType);
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
}
