package live.lqs.com.live2.model.vo;

import android.net.Uri;

import live.lqs.com.live2.adatpter.IRecyclerViewData;
import live.lqs.com.live2.adatpter.RecyclerViewAdatpter;

/**
 * Created by dell on 2017/3/13.
 */

public final class LiveVO implements IRecyclerViewData {

    public static final int ITEM_TYPE = 0b1 | RecyclerViewAdatpter.TYPE_CLICKABLE;

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
        return ITEM_TYPE;
    }


    public final static class LiveVoBuilder {

        private Anchor mAnchor;
        private int mWatchNumber;
        private Uri mCoverUrl;
        private Uri mLiveUrl;

        public LiveVoBuilder setAnchor(Anchor anchor) {
            this.mAnchor = anchor;
            return this;
        }

        public LiveVoBuilder setWatchNumber(int watchNumber) {
            this.mWatchNumber = watchNumber;
            return this;
        }

        public LiveVoBuilder setCoverUrl(String coverUrl) {
            this.mCoverUrl = Uri.parse(coverUrl);
            return this;
        }

        public LiveVoBuilder setLiveUrl(String liveUrl) {
            this.mLiveUrl = Uri.parse(liveUrl);
            return this;
        }

        public LiveVoBuilder setCoverUrl(Uri coverUrl) {
            this.mCoverUrl = coverUrl;
            return this;
        }

        public LiveVoBuilder setLiveUrl(Uri liveUrl) {
            this.mLiveUrl = liveUrl;
            return this;
        }

        public LiveVO builder() {
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
