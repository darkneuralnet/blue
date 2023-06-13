package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import co.bird.android.app.feature.map.cluster.warehousemarker.WarehouseMarkerClusterItem;
/* loaded from: classes2.dex */
public final class WarehouseMarkerClusterRenderer_Factory {
    private final Y94<Context> contextProvider;

    public WarehouseMarkerClusterRenderer_Factory(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static WarehouseMarkerClusterRenderer_Factory create(Y94<Context> y94) {
        return new WarehouseMarkerClusterRenderer_Factory(y94);
    }

    public static WarehouseMarkerClusterRenderer newInstance(C33116Gl0<WarehouseMarkerClusterItem> c33116Gl0, C39011cD1 c39011cD1, Context context) {
        return new WarehouseMarkerClusterRenderer(c33116Gl0, c39011cD1, context);
    }

    public WarehouseMarkerClusterRenderer get(C33116Gl0<WarehouseMarkerClusterItem> c33116Gl0, C39011cD1 c39011cD1) {
        return newInstance(c33116Gl0, c39011cD1, this.contextProvider.get());
    }
}
