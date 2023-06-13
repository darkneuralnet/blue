package co.bird.android.app.feature.map.renderer;

import co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem;
import co.bird.android.model.persistence.BirdMapMarker;
/* loaded from: classes2.dex */
public final class OperatorBirdMarkerClusterRendererFactory_Impl implements OperatorBirdMarkerClusterRendererFactory {
    private final OperatorBirdMarkerClusterRenderer_Factory delegateFactory;

    public OperatorBirdMarkerClusterRendererFactory_Impl(OperatorBirdMarkerClusterRenderer_Factory operatorBirdMarkerClusterRenderer_Factory) {
        this.delegateFactory = operatorBirdMarkerClusterRenderer_Factory;
    }

    @Override // co.bird.android.app.feature.map.renderer.OperatorBirdMarkerClusterRendererFactory
    public OperatorBirdMarkerClusterRenderer create(C39011cD1 c39011cD1, C33116Gl0<BirdMarkerClusterItem<BirdMapMarker>> c33116Gl0, BirdMarkerClusterItemOptionProvider birdMarkerClusterItemOptionProvider) {
        return this.delegateFactory.get(c39011cD1, c33116Gl0, birdMarkerClusterItemOptionProvider);
    }

    public static Y94<OperatorBirdMarkerClusterRendererFactory> create(OperatorBirdMarkerClusterRenderer_Factory operatorBirdMarkerClusterRenderer_Factory) {
        return C39546d52.m44621a(new OperatorBirdMarkerClusterRendererFactory_Impl(operatorBirdMarkerClusterRenderer_Factory));
    }
}
