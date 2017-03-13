package live.lqs.com.live2.adatpter.ViewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import live.lqs.com.live2.model.vo.LiveVO;

/**
 * Created by dell on 2017/3/13.
 */

public class LiveViewHolder extends AbsViewHolder<LiveVO>{
    public LiveViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    protected View initItemViewUi(View itemView) {
        return null;
    }

    @Override
    public void bindData(View itemView, LiveVO liveVO) {

    }

    public static AbsViewHolder getInstance(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(0, null);
        LiveViewHolder liveViewHolder = new LiveViewHolder(view);
        return liveViewHolder;
    }
}
