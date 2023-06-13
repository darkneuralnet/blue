package co.bird.android.app.feature.map.cluster.bountymarker;

import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.core.mvp.BaseActivity;
/* loaded from: classes2.dex */
public final class BountyMarkerClusterManagerFactory_Impl implements BountyMarkerClusterManagerFactory {
    private final BountyMarkerClusterManager_Factory delegateFactory;

    public BountyMarkerClusterManagerFactory_Impl(BountyMarkerClusterManager_Factory bountyMarkerClusterManager_Factory) {
        this.delegateFactory = bountyMarkerClusterManager_Factory;
    }

    @Override // co.bird.android.app.feature.map.cluster.bountymarker.BountyMarkerClusterManagerFactory
    public BountyMarkerClusterManager create(BaseActivity baseActivity, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent) {
        return this.delegateFactory.get(baseActivity, c39011cD1, reactiveMapEvent);
    }

    public static Y94<BountyMarkerClusterManagerFactory> create(BountyMarkerClusterManager_Factory bountyMarkerClusterManager_Factory) {
        return C39546d52.m44621a(new BountyMarkerClusterManagerFactory_Impl(bountyMarkerClusterManager_Factory));
    }
}
