package live.lqs.com.live2.adatpter.ViewHolder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by dell on 2017/3/10.
 */

public abstract class AbsViewHolder extends RecyclerView.ViewHolder{
    public AbsViewHolder(View itemView) {
        super(itemView);
    }

    public static AbsViewHolder getInstance(Context context){
        return null;
    }
}
