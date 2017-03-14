package live.lqs.com.live2.adatpter.ViewHolder;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import live.lqs.com.live2.adatpter.IRecyclerViewData;
import live.lqs.com.live2.adatpter.RecyclerViewAdatpter;

/**
 * Created by dell on 2017/3/10.
 */

public abstract class AbsViewHolder<T extends IRecyclerViewData> extends RecyclerView.ViewHolder {

    private IRecyclerViewOnclickListener onclickListener;

    private IRecyclerViewOnLongClickListener longClickListener;

    public AbsViewHolder(View itemView) {
        super(itemView);
        initItemClick(itemView);
        initItemViewUi(itemView);
    }

    private void initItemClick(View itemView) {
        int itemViewType = getItemViewType();
        if(onclickListener != null &&(itemViewType & RecyclerViewAdatpter.TYPE_CLICKABLE)!= 0){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onclickListener.onClick(v,getAdapterPosition());
                }
            });
        }

        if(longClickListener != null &&(itemViewType & RecyclerViewAdatpter.TYPE_LONGCLICKABLE)!= 0){
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    longClickListener.onLongClick(v,getLayoutPosition());
                    return false;
                }
            });
        }
    }

    protected abstract void initItemViewUi(View itemView);

    public abstract void bindData(View itemView, T t);

    public static AbsViewHolder getInstance(Context context) {
        return null;
    }

    public void setOnclickListener(IRecyclerViewOnclickListener onclickListener) {
        this.onclickListener = onclickListener;
    }

    public void setLongClickListener(IRecyclerViewOnLongClickListener longClickListener) {
        this.longClickListener = longClickListener;
    }
}
