package live.lqs.com.live2.EvenBus;

import com.squareup.otto.Bus;

/**
 * Created by dell on 2017/3/10.
 */

public final class SingleBus {

    private static Bus sSinggleBus;

    public static Bus getInstance() {
        if (sSinggleBus == null) {
            sSinggleBus = new Bus();
        }
        return sSinggleBus;
    }

}
