package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import co.bird.android.app.feature.map.cluster.zonemarker.ZoneMarkerClusterItem;
/* loaded from: classes2.dex */
public final class ZoneMarkerClusterRenderer_Factory {
    private final Y94<Context> contextProvider;

    public ZoneMarkerClusterRenderer_Factory(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static ZoneMarkerClusterRenderer_Factory create(Y94<Context> y94) {
        return new ZoneMarkerClusterRenderer_Factory(y94);
    }

    public static ZoneMarkerClusterRenderer newInstance(C33116Gl0<ZoneMarkerClusterItem> c33116Gl0, C39011cD1 c39011cD1, Context context) {
        return new ZoneMarkerClusterRenderer(c33116Gl0, c39011cD1, context);
    }

    public ZoneMarkerClusterRenderer get(C33116Gl0<ZoneMarkerClusterItem> c33116Gl0, C39011cD1 c39011cD1) {
        return newInstance(c33116Gl0, c39011cD1, this.contextProvider.get());
    }
}
