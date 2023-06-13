package co.bird.android.app.feature.map.renderer.nestmarker;

import co.bird.android.app.feature.map.cluster.nestmarker.NestMarkerClusterItem;
/* loaded from: classes2.dex */
public final class NestMarkerClusterRendererFactory_Impl implements NestMarkerClusterRendererFactory {
    private final NestMarkerClusterRenderer_Factory delegateFactory;

    public NestMarkerClusterRendererFactory_Impl(NestMarkerClusterRenderer_Factory nestMarkerClusterRenderer_Factory) {
        this.delegateFactory = nestMarkerClusterRenderer_Factory;
    }

    @Override // co.bird.android.app.feature.map.renderer.nestmarker.NestMarkerClusterRendererFactory
    public NestMarkerClusterRenderer create(C33116Gl0<NestMarkerClusterItem> c33116Gl0, C39011cD1 c39011cD1) {
        return this.delegateFactory.get(c33116Gl0, c39011cD1);
    }

    public static Y94<NestMarkerClusterRendererFactory> create(NestMarkerClusterRenderer_Factory nestMarkerClusterRenderer_Factory) {
        return C39546d52.m44621a(new NestMarkerClusterRendererFactory_Impl(nestMarkerClusterRenderer_Factory));
    }
}
