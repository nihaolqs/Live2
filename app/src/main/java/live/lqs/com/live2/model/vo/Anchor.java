package live.lqs.com.live2.model.vo;

/**
 * Created by dell on 2017/3/13.
 */

public class Anchor {

    private String mAnchorName;  //主播名字

    private String mAnchorAvaAvatarUrl;  //头像地址

    private String mPosiction;  //定位地址

    public Anchor(String mAnchorName, String mAnchorAvaAvatarUrl, String mPosiction) {
        this.mAnchorName = mAnchorName;
        this.mAnchorAvaAvatarUrl = mAnchorAvaAvatarUrl;
        this.mPosiction = mPosiction;
    }

    public String getmAnchorName() {
        return mAnchorName;
    }


    public String getmAnchorAvaAvatarUrl() {
        return mAnchorAvaAvatarUrl;
    }


    public String getmPosiction() {
        return mPosiction;
    }

}
