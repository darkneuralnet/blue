package co.bird.android.app.feature.map.renderer;

import co.bird.android.app.feature.map.cluster.zonemarker.ZoneMarkerClusterItem;
/* loaded from: classes2.dex */
public final class ZoneMarkerClusterRendererFactory_Impl implements ZoneMarkerClusterRendererFactory {
    private final ZoneMarkerClusterRenderer_Factory delegateFactory;

    public ZoneMarkerClusterRendererFactory_Impl(ZoneMarkerClusterRenderer_Factory zoneMarkerClusterRenderer_Factory) {
        this.delegateFactory = zoneMarkerClusterRenderer_Factory;
    }

    @Override // co.bird.android.app.feature.map.renderer.ZoneMarkerClusterRendererFactory
    public ZoneMarkerClusterRenderer create(C33116Gl0<ZoneMarkerClusterItem> c33116Gl0, C39011cD1 c39011cD1) {
        return this.delegateFactory.get(c33116Gl0, c39011cD1);
    }

    public static Y94<ZoneMarkerClusterRendererFactory> create(ZoneMarkerClusterRenderer_Factory zoneMarkerClusterRenderer_Factory) {
        return C39546d52.m44621a(new ZoneMarkerClusterRendererFactory_Impl(zoneMarkerClusterRenderer_Factory));
    }
}
