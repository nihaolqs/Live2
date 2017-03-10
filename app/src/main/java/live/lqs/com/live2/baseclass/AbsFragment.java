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

    protected abstract void initData(Context context);

    protected abstract void initUi(View mFragmentLayout, Context context);

    protected abstract void init(Context context);

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
