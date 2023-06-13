package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem;
import co.bird.android.model.wire.WireBird;
/* loaded from: classes2.dex */
public final class OperatorClusterRendererFactory_Impl implements OperatorClusterRendererFactory {
    private final OperatorClusterRenderer_Factory delegateFactory;

    public OperatorClusterRendererFactory_Impl(OperatorClusterRenderer_Factory operatorClusterRenderer_Factory) {
        this.delegateFactory = operatorClusterRenderer_Factory;
    }

    @Override // co.bird.android.app.feature.map.renderer.OperatorClusterRendererFactory
    public OperatorClusterRenderer create(Context context, C39011cD1 c39011cD1, C33116Gl0<BirdMarkerClusterItem<WireBird>> c33116Gl0) {
        return this.delegateFactory.get(context, c39011cD1, c33116Gl0);
    }

    public static Y94<OperatorClusterRendererFactory> create(OperatorClusterRenderer_Factory operatorClusterRenderer_Factory) {
        return C39546d52.m44621a(new OperatorClusterRendererFactory_Impl(operatorClusterRenderer_Factory));
    }
}
