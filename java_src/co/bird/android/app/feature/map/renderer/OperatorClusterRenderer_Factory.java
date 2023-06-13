package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem;
import co.bird.android.model.wire.WireBird;
/* loaded from: classes2.dex */
public final class OperatorClusterRenderer_Factory {
    public static OperatorClusterRenderer_Factory create() {
        return new OperatorClusterRenderer_Factory();
    }

    public static OperatorClusterRenderer newInstance(Context context, C39011cD1 c39011cD1, C33116Gl0<BirdMarkerClusterItem<WireBird>> c33116Gl0) {
        return new OperatorClusterRenderer(context, c39011cD1, c33116Gl0);
    }

    public OperatorClusterRenderer get(Context context, C39011cD1 c39011cD1, C33116Gl0<BirdMarkerClusterItem<WireBird>> c33116Gl0) {
        return newInstance(context, c39011cD1, c33116Gl0);
    }
}
