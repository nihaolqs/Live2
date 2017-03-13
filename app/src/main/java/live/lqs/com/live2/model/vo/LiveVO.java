package live.lqs.com.live2.model.vo;

import android.net.Uri;

import live.lqs.com.live2.adatpter.IRecyclerViewData;

/**
 * Created by dell on 2017/3/13.
 */

public final class LiveVO implements IRecyclerViewData{

    public static final int ITEM_TYPE = 0x0;

    private final Anchor mAnchor;

    private int mWatchNumber;

    private final Uri mCoverUrl;

    private final Uri mLiveUrl;

    private LiveVO(Anchor mAnchor, int mWatchNumber, Uri mCoverUrl, Uri mLiveUrl) {
        this.mAnchor = mAnchor;
        this.mWatchNumber = mWatchNumber;
        this.mCoverUrl = mCoverUrl;
        this.mLiveUrl = mLiveUrl;
    }

    public Anchor getmAnchor() {
        return mAnchor;
    }

    public int getmWatchNumber() {
        return mWatchNumber;
    }

    public Uri getmCoverUrl() {
        return mCoverUrl;
    }

    public Uri getmLiveUrl() {
        return mLiveUrl;
    }

    @Override
    public int getType() {
        return 0;
    }


    public final static class LiveVoBuilder {

        private Anchor mAnchor;
        private int mWatchNumber;
        private Uri mCoverUrl;
        private Uri mLiveUrl;

        LiveVoBuilder setAnchor(Anchor anchor) {
            this.mAnchor = anchor;
            return this;
        }

        LiveVoBuilder setWatchNumber(int watchNumber) {
            this.mWatchNumber = watchNumber;
            return this;
        }

        LiveVoBuilder setCoverUrl(String coverUrl) {
            this.mCoverUrl = Uri.parse(coverUrl);
            return this;
        }

        LiveVoBuilder setLiveUrl(String liveUrl) {
            this.mLiveUrl = Uri.parse(liveUrl);
            return this;
        }

        LiveVoBuilder setCoverUrl(Uri coverUrl) {
            this.mCoverUrl = coverUrl;
            return this;
        }

        LiveVoBuilder setLiveUrl(Uri liveUrl) {
            this.mLiveUrl = liveUrl;
            return this;
        }

        LiveVO builder() {
            if (mAnchor == null) {
                throw new NullPointerException("Anchor is  null");
            }
            if (mLiveUrl == null) {
                throw new NullPointerException("LiveUrl is  null");
            }
            if (mCoverUrl == null) {
                throw new NullPointerException("CoverUrl is  null");
            }
            return new LiveVO(mAnchor, mWatchNumber, mCoverUrl, mLiveUrl);
        }
    }
}
