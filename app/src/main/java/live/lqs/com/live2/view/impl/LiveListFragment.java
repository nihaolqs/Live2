package live.lqs.com.live2.view.impl;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import live.lqs.com.live2.R;
import live.lqs.com.live2.adatpter.RecyclerViewAdatpter;
import live.lqs.com.live2.adatpter.ViewHolder.ViewHolderFactory;
import live.lqs.com.live2.baseclass.AbsFragment;
import live.lqs.com.live2.model.vo.LiveVO;

/**
 * Created by dell on 2017/3/13.
 */

public class LiveListFragment extends AbsFragment {


    private RecyclerView mRVLiveList;
    private RecyclerViewAdatpter<LiveVO> mAdatpter;


    @Override
    protected void init(Context context) {

    }

    @Override
    protected void initUi(View fragmentLayout, Context context) {
        initRecyclerView(fragmentLayout, context);
    }

    private void initRecyclerView(View fragmentLayout, Context context) {
        mRVLiveList = (RecyclerView) fragmentLayout.findViewById(R.id.RV_FLL_LiveList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mRVLiveList.setLayoutManager(linearLayoutManager);
        mAdatpter = new RecyclerViewAdatpter<>(context);
        mAdatpter.getViewHolderPool().registeredViewHolder(LiveVO.ITEM_TYPE,new ViewHolderFactory<   >());
        mRVLiveList.setAdapter(mAdatpter);
    }

    @Override
    protected void initData(Context context) {

    }

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_live_list;
    }
}
