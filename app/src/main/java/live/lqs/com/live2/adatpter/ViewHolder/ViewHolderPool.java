package live.lqs.com.live2.adatpter.ViewHolder;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by dell on 2017/3/10.
 */

public final class ViewHolderPool {

    private ConcurrentHashMap<Integer, ViewHolderFactory> mViewHolderPool = new ConcurrentHashMap();

    public static ViewHolderPool getInstance() {
        return new ViewHolderPool();
    }

    public void registeredViewHolder(Integer viewType, ViewHolderFactory factory) {
        mViewHolderPool.put(viewType, factory);
    }

    public AbsViewHolder getViewHolder(Integer viewType) {
        ViewHolderFactory viewHolderFactory = mViewHolderPool.get(viewType);
        AbsViewHolder viewHolder = viewHolderFactory.getViewHolder();
        return viewHolder;
    }
}
