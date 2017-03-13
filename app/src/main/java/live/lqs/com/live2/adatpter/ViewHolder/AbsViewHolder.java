package live.lqs.com.live2.adatpter.ViewHolder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import live.lqs.com.live2.adatpter.IRecyclerViewData;

/**
 * Created by dell on 2017/3/10.
 */

public abstract class AbsViewHolder<T extends IRecyclerViewData> extends RecyclerView.ViewHolder {
    public AbsViewHolder(View itemView) {
        super(itemView);
        initItemViewUi(itemView);
    }

    protected abstract View initItemViewUi(View itemView);

    public abstract void bindData(View itemView, T t);

    public static AbsViewHolder getInstance(Context context) {
        return null;
    }
}
