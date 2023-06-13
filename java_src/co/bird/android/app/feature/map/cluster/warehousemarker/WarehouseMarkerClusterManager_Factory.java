package co.bird.android.app.feature.map.cluster.warehousemarker;

import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.app.feature.map.renderer.WarehouseMarkerClusterRendererFactory;
import co.bird.android.core.mvp.BaseActivity;
/* loaded from: classes2.dex */
public final class WarehouseMarkerClusterManager_Factory {
    private final Y94<WarehouseMarkerClusterRendererFactory> rendererFactoryProvider;

    public WarehouseMarkerClusterManager_Factory(Y94<WarehouseMarkerClusterRendererFactory> y94) {
        this.rendererFactoryProvider = y94;
    }

    public static WarehouseMarkerClusterManager_Factory create(Y94<WarehouseMarkerClusterRendererFactory> y94) {
        return new WarehouseMarkerClusterManager_Factory(y94);
    }

    public static WarehouseMarkerClusterManager newInstance(BaseActivity baseActivity, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent, WarehouseMarkerClusterRendererFactory warehouseMarkerClusterRendererFactory) {
        return new WarehouseMarkerClusterManager(baseActivity, c39011cD1, reactiveMapEvent, warehouseMarkerClusterRendererFactory);
    }

    public WarehouseMarkerClusterManager get(BaseActivity baseActivity, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent) {
        return newInstance(baseActivity, c39011cD1, reactiveMapEvent, this.rendererFactoryProvider.get());
    }
}
