package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem;
import co.bird.android.model.wire.WireBird;
/* loaded from: classes2.dex */
public final class BirdClusterRendererFactory_Impl implements BirdClusterRendererFactory {
    private final BirdClusterRenderer_Factory delegateFactory;

    public BirdClusterRendererFactory_Impl(BirdClusterRenderer_Factory birdClusterRenderer_Factory) {
        this.delegateFactory = birdClusterRenderer_Factory;
    }

    @Override // co.bird.android.app.feature.map.renderer.BirdClusterRendererFactory
    public BirdClusterRenderer create(IconLoader iconLoader, Context context, C39011cD1 c39011cD1, C33116Gl0<BirdMarkerClusterItem<WireBird>> c33116Gl0) {
        return this.delegateFactory.get(iconLoader, context, c39011cD1, c33116Gl0);
    }

    public static Y94<BirdClusterRendererFactory> create(BirdClusterRenderer_Factory birdClusterRenderer_Factory) {
        return C39546d52.m44621a(new BirdClusterRendererFactory_Impl(birdClusterRenderer_Factory));
    }
}
