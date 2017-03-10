package live.lqs.com.live2.baseclass;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by dell on 2017/3/10.
 */

public abstract class AbsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResID());
        init();
        initUi();
        initData();
    }

    /**
     * 提供数据初始化等的操作,比如下载数据或者Intent提取数据等
     */
    protected abstract void initData();

    /**
     * 提供预先的初始化操作比如Valley Fresco等
     */
    protected abstract void init();

    /**
     * 提供Ui的初始化操作比如fiandView,setAdatpter等;
     */
    protected abstract void initUi();


    protected abstract int getLayoutResID();
}
