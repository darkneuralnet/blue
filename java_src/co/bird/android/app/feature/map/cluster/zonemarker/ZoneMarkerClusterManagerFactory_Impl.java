package co.bird.android.app.feature.map.cluster.zonemarker;

import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.core.mvp.BaseActivity;
/* loaded from: classes2.dex */
public final class ZoneMarkerClusterManagerFactory_Impl implements ZoneMarkerClusterManagerFactory {
    private final ZoneMarkerClusterManager_Factory delegateFactory;

    public ZoneMarkerClusterManagerFactory_Impl(ZoneMarkerClusterManager_Factory zoneMarkerClusterManager_Factory) {
        this.delegateFactory = zoneMarkerClusterManager_Factory;
    }

    @Override // co.bird.android.app.feature.map.cluster.zonemarker.ZoneMarkerClusterManagerFactory
    public ZoneMarkerClusterManager create(BaseActivity baseActivity, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent) {
        return this.delegateFactory.get(baseActivity, c39011cD1, reactiveMapEvent);
    }

    public static Y94<ZoneMarkerClusterManagerFactory> create(ZoneMarkerClusterManager_Factory zoneMarkerClusterManager_Factory) {
        return C39546d52.m44621a(new ZoneMarkerClusterManagerFactory_Impl(zoneMarkerClusterManager_Factory));
    }
}
