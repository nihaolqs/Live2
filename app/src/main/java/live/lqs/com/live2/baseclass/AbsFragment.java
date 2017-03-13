package live.lqs.com.live2.baseclass;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import live.lqs.com.live2.EvenBus.SingleBus;

/**
 * Created by dell on 2017/3/10.
 */

public abstract class AbsFragment extends Fragment {

    private View mFragmentLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        mFragmentLayout = inflater.inflate(getLayoutResId(), null);

        Context context = getContext();

        init(context);

        initUi(mFragmentLayout,context);

        initData(context);

        return mFragmentLayout;
    }

    /**
     * 在于所以初始化方法中最先调用的方法用于做控件之类的与数据无关部分的初始化操作
     * @param context
     */
    protected abstract void init(Context context);

    /**
     * 提供作为UI的初始化操作
     * @param fragmentLayout
     * @param context
     */
    protected abstract void initUi(View fragmentLayout, Context context);

    /**
     * 数据下载等的操作
     * @param context
     */
    protected abstract void initData(Context context);

    protected abstract int getLayoutResId();

    @Override
    public void onResume() {
        super.onResume();
        SingleBus.getInstance().register(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        SingleBus.getInstance().unregister(this);
    }
}
