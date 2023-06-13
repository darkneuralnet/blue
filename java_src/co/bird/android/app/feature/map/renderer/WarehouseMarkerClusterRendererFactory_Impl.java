package co.bird.android.app.feature.map.renderer;

import co.bird.android.app.feature.map.cluster.warehousemarker.WarehouseMarkerClusterItem;
/* loaded from: classes2.dex */
public final class WarehouseMarkerClusterRendererFactory_Impl implements WarehouseMarkerClusterRendererFactory {
    private final WarehouseMarkerClusterRenderer_Factory delegateFactory;

    public WarehouseMarkerClusterRendererFactory_Impl(WarehouseMarkerClusterRenderer_Factory warehouseMarkerClusterRenderer_Factory) {
        this.delegateFactory = warehouseMarkerClusterRenderer_Factory;
    }

    @Override // co.bird.android.app.feature.map.renderer.WarehouseMarkerClusterRendererFactory
    public WarehouseMarkerClusterRenderer create(C33116Gl0<WarehouseMarkerClusterItem> c33116Gl0, C39011cD1 c39011cD1) {
        return this.delegateFactory.get(c33116Gl0, c39011cD1);
    }

    public static Y94<WarehouseMarkerClusterRendererFactory> create(WarehouseMarkerClusterRenderer_Factory warehouseMarkerClusterRenderer_Factory) {
        return C39546d52.m44621a(new WarehouseMarkerClusterRendererFactory_Impl(warehouseMarkerClusterRenderer_Factory));
    }
}
