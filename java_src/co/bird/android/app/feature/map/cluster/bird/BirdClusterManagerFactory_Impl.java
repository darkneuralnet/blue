package co.bird.android.app.feature.map.cluster.bird;

import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.MapMode;
/* loaded from: classes2.dex */
public final class BirdClusterManagerFactory_Impl implements BirdClusterManagerFactory {
    private final BirdClusterManager_Factory delegateFactory;

    public BirdClusterManagerFactory_Impl(BirdClusterManager_Factory birdClusterManager_Factory) {
        this.delegateFactory = birdClusterManager_Factory;
    }

    @Override // co.bird.android.app.feature.map.cluster.bird.BirdClusterManagerFactory
    public BirdClusterManager create(BaseActivity baseActivity, BK2 bk2, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent, MapMode mapMode, boolean z) {
        return this.delegateFactory.get(baseActivity, bk2, c39011cD1, reactiveMapEvent, mapMode, z);
    }

    public static Y94<BirdClusterManagerFactory> create(BirdClusterManager_Factory birdClusterManager_Factory) {
        return C39546d52.m44621a(new BirdClusterManagerFactory_Impl(birdClusterManager_Factory));
    }
}
