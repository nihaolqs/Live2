package live.lqs.com.live2.adatpter.ViewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import live.lqs.com.live2.R;
import live.lqs.com.live2.model.vo.Anchor;
import live.lqs.com.live2.model.vo.LiveVO;
import live.lqs.com.live2.utils.ImageUtils;

/**
 * Created by dell on 2017/3/13.
 */

public final class LiveViewHolder extends AbsViewHolder<LiveVO> {

    private ImageView mIvAvatar;
    private TextView mTvName;
    private TextView mTvPosiction;
    private TextView mTvNumber;
    private ImageView mIvCover;

    public LiveViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    protected void initItemViewUi(View itemView) {
        mIvAvatar = (ImageView) itemView.findViewById(R.id.iv_anchor_avatar);
        mTvName = (TextView) itemView.findViewById(R.id.tv_anchor_name);
        mTvPosiction = (TextView) itemView.findViewById(R.id.tv_anchor_posiction);
        mTvNumber = (TextView) itemView.findViewById(R.id.tv_live_watchnumber);
        mIvCover = (ImageView) itemView.findViewById(R.id.iv_livecover);
    }

    @Override
    public void bindData(View itemView, LiveVO liveVO) {
        Anchor anchor = liveVO.getmAnchor();
        ImageUtils.LoadImage(mIvAvatar, anchor.getmAnchorAvatarUrl());
        ImageUtils.LoadImage(mIvCover, liveVO.getmCoverUrl());
        mTvName.setText(anchor.getmAnchorName());
        mTvPosiction.setText(anchor.getmPosiction());
        mTvNumber.setText(liveVO.getmWatchNumber());
    }

    public static AbsViewHolder getInstance(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_livelist, null);
        LiveViewHolder liveViewHolder = new LiveViewHolder(view);
        return liveViewHolder;
    }
}
