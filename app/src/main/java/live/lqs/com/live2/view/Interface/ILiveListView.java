package live.lqs.com.live2.view.Interface;

import java.util.List;

import live.lqs.com.live2.model.vo.LiveVO;
import live.lqs.com.live2.presenter.Interface.ILiveListPresenter;

/**
 * Created by dell on 2017/3/13.
 */

public interface ILiveListView<T extends ILiveListPresenter> {

    void showLiveList(List<LiveVO> liveVOs);

    T getPresenter();
}
