package co.bird.android.app.feature.map.cluster.bountymarker;

import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.app.feature.map.renderer.BountyMarkerClusterRendererFactory;
import co.bird.android.core.mvp.BaseActivity;
/* loaded from: classes2.dex */
public final class BountyMarkerClusterManager_Factory {
    private final Y94<BountyMarkerClusterRendererFactory> rendererFactoryProvider;

    public BountyMarkerClusterManager_Factory(Y94<BountyMarkerClusterRendererFactory> y94) {
        this.rendererFactoryProvider = y94;
    }

    public static BountyMarkerClusterManager_Factory create(Y94<BountyMarkerClusterRendererFactory> y94) {
        return new BountyMarkerClusterManager_Factory(y94);
    }

    public static BountyMarkerClusterManager newInstance(BaseActivity baseActivity, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent, BountyMarkerClusterRendererFactory bountyMarkerClusterRendererFactory) {
        return new BountyMarkerClusterManager(baseActivity, c39011cD1, reactiveMapEvent, bountyMarkerClusterRendererFactory);
    }

    public BountyMarkerClusterManager get(BaseActivity baseActivity, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent) {
        return newInstance(baseActivity, c39011cD1, reactiveMapEvent, this.rendererFactoryProvider.get());
    }
}
