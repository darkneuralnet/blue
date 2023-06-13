package co.bird.android.app.feature.map.cluster.warehousemarker;

import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.core.mvp.BaseActivity;
/* loaded from: classes2.dex */
public final class WarehouseMarkerClusterManagerFactory_Impl implements WarehouseMarkerClusterManagerFactory {
    private final WarehouseMarkerClusterManager_Factory delegateFactory;

    public WarehouseMarkerClusterManagerFactory_Impl(WarehouseMarkerClusterManager_Factory warehouseMarkerClusterManager_Factory) {
        this.delegateFactory = warehouseMarkerClusterManager_Factory;
    }

    @Override // co.bird.android.app.feature.map.cluster.warehousemarker.WarehouseMarkerClusterManagerFactory
    public WarehouseMarkerClusterManager create(BaseActivity baseActivity, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent) {
        return this.delegateFactory.get(baseActivity, c39011cD1, reactiveMapEvent);
    }

    public static Y94<WarehouseMarkerClusterManagerFactory> create(WarehouseMarkerClusterManager_Factory warehouseMarkerClusterManager_Factory) {
        return C39546d52.m44621a(new WarehouseMarkerClusterManagerFactory_Impl(warehouseMarkerClusterManager_Factory));
    }
}
