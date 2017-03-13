package live.lqs.com.live2.presenter.Interface;

import live.lqs.com.live2.model.Interface.ILiveListModel;
import live.lqs.com.live2.model.vo.LiveVO;
import live.lqs.com.live2.view.Interface.ILiveListView;

/**
 * Created by dell on 2017/3/13.
 */

public interface ILiveListPresenter<M extends ILiveListModel,V extends ILiveListView> {

    M getModel();

    V getView();

    void showLiveList();

    void playLive(LiveVO liveVO);

    void replaceData();
}
