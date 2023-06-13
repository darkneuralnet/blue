package co.bird.android.app.feature.map.cluster.birdmarker;

import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.MapMode;
/* loaded from: classes2.dex */
public final class BirdMarkerClusterManagerFactory_Impl implements BirdMarkerClusterManagerFactory {
    private final BirdMarkerClusterManager_Factory delegateFactory;

    public BirdMarkerClusterManagerFactory_Impl(BirdMarkerClusterManager_Factory birdMarkerClusterManager_Factory) {
        this.delegateFactory = birdMarkerClusterManager_Factory;
    }

    @Override // co.bird.android.app.feature.map.cluster.birdmarker.BirdMarkerClusterManagerFactory
    public BirdMarkerClusterManager create(BaseActivity baseActivity, BK2 bk2, ReactiveMapEvent reactiveMapEvent, C39011cD1 c39011cD1, MapMode mapMode) {
        return this.delegateFactory.get(baseActivity, bk2, reactiveMapEvent, c39011cD1, mapMode);
    }

    public static Y94<BirdMarkerClusterManagerFactory> create(BirdMarkerClusterManager_Factory birdMarkerClusterManager_Factory) {
        return C39546d52.m44621a(new BirdMarkerClusterManagerFactory_Impl(birdMarkerClusterManager_Factory));
    }
}
