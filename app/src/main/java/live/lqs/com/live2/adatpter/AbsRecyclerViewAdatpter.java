package live.lqs.com.live2.adatpter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import live.lqs.com.live2.adatpter.ViewHolder.ViewHolderPool;

/**
 * Created by dell on 2017/3/10.
 */

public class AbsRecyclerViewAdatpter extends RecyclerView.Adapter {

    private ViewHolderPool mViewHolderPool;



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }
}
