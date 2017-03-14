package live.lqs.com.live2.view.impl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import live.lqs.com.live2.R;
import live.lqs.com.live2.adatpter.RecyclerViewAdatpter;
import live.lqs.com.live2.adatpter.ViewHolder.IRecyclerViewOnclickListener;
import live.lqs.com.live2.adatpter.ViewHolder.LiveViewHolder;
import live.lqs.com.live2.adatpter.ViewHolder.ViewHolderFactory;
import live.lqs.com.live2.baseclass.AbsFragment;
import live.lqs.com.live2.model.vo.Anchor;
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
        mAdatpter.getViewHolderPool()
                .registeredViewHolder(LiveVO.ITEM_TYPE, new ViewHolderFactory<LiveViewHolder>());
        mAdatpter.setmOnclickListener(new IRecyclerViewOnclickListener() {
            @Override
            public void onClick(View view, int posiction) {
                Toast.makeText(getContext(), "posiction : " + posiction, Toast.LENGTH_SHORT);
            }
        });
        mRVLiveList.setAdapter(mAdatpter);
    }

    @Override
    protected void initData(Context context) {
        ArrayList<LiveVO> liveVOs = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Anchor anchor = new Anchor("大王", "", "上海");
            LiveVO liveVO = new LiveVO.LiveVoBuilder().setAnchor(anchor)
                    .setCoverUrl("")
                    .setLiveUrl("")
                    .setWatchNumber(1000 * i)
                    .builder();
            liveVOs.add(liveVO);
        }
        mAdatpter.setDataList(liveVOs);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_live_list;
    }
}
