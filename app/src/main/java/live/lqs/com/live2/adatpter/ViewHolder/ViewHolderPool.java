package live.lqs.com.live2.adatpter.ViewHolder;

import android.content.Context;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by dell on 2017/3/10.
 */

public final class ViewHolderPool {

    private  Context mContext;
    private ConcurrentHashMap<Integer, ViewHolderFactory> mViewHolderPool = new ConcurrentHashMap();

    private ViewHolderPool(){}

    public static ViewHolderPool getInstance(Context context) {

        ViewHolderPool viewHolderPool = new ViewHolderPool();
        viewHolderPool.mContext = context;
        return viewHolderPool;
    }

    public ViewHolderPool registeredViewHolder(Integer viewType, ViewHolderFactory factory) {
        mViewHolderPool.put(viewType, factory);
        return this;
    }

    public AbsViewHolder getViewHolder(Integer viewType) {
        ViewHolderFactory viewHolderFactory = mViewHolderPool.get(viewType);
        AbsViewHolder viewHolder = viewHolderFactory.getViewHolder(mContext);
        return viewHolder;
    }
}
