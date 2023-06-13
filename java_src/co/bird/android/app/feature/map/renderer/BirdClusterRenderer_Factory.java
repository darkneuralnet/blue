package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem;
import co.bird.android.model.wire.WireBird;
/* loaded from: classes2.dex */
public final class BirdClusterRenderer_Factory {
    public static BirdClusterRenderer_Factory create() {
        return new BirdClusterRenderer_Factory();
    }

    public static BirdClusterRenderer newInstance(IconLoader iconLoader, Context context, C39011cD1 c39011cD1, C33116Gl0<BirdMarkerClusterItem<WireBird>> c33116Gl0) {
        return new BirdClusterRenderer(iconLoader, context, c39011cD1, c33116Gl0);
    }

    public BirdClusterRenderer get(IconLoader iconLoader, Context context, C39011cD1 c39011cD1, C33116Gl0<BirdMarkerClusterItem<WireBird>> c33116Gl0) {
        return newInstance(iconLoader, context, c39011cD1, c33116Gl0);
    }
}
