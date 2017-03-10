package live.lqs.com.live2.adatpter.ViewHolder;

import android.support.v7.widget.RecyclerView;

/**
 * Created by dell on 2017/3/10.
 */

public class ViewHolderFactory<VH extends AbsViewHolder> {

   public AbsViewHolder getViewHolder() {
        return VH.getInstance();
    }
}
