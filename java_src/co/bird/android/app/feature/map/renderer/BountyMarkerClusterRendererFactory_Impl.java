package co.bird.android.app.feature.map.renderer;

import co.bird.android.app.feature.map.cluster.bountymarker.BountyMarkerClusterItem;
/* loaded from: classes2.dex */
public final class BountyMarkerClusterRendererFactory_Impl implements BountyMarkerClusterRendererFactory {
    private final BountyMarkerClusterRenderer_Factory delegateFactory;

    public BountyMarkerClusterRendererFactory_Impl(BountyMarkerClusterRenderer_Factory bountyMarkerClusterRenderer_Factory) {
        this.delegateFactory = bountyMarkerClusterRenderer_Factory;
    }

    @Override // co.bird.android.app.feature.map.renderer.BountyMarkerClusterRendererFactory
    public BountyMarkerClusterRenderer create(C33116Gl0<BountyMarkerClusterItem> c33116Gl0, C39011cD1 c39011cD1) {
        return this.delegateFactory.get(c33116Gl0, c39011cD1);
    }

    public static Y94<BountyMarkerClusterRendererFactory> create(BountyMarkerClusterRenderer_Factory bountyMarkerClusterRenderer_Factory) {
        return C39546d52.m44621a(new BountyMarkerClusterRendererFactory_Impl(bountyMarkerClusterRenderer_Factory));
    }
}
