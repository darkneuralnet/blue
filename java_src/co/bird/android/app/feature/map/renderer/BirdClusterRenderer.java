package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.map.cluster.BaseBirdMarkerClusterManager;
import co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterItemState;
import co.bird.android.model.wire.WireBird;
import com.google.android.gms.maps.model.MarkerOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B=\b\u0007\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018\u0012\u0014\b\u0001\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0004H\u0014J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\tH\u0014J\u001e\u0010\u000f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014J\u001e\u0010\u0010\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001e\u0010\u0011\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001e\u0010\u0012\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;", "LEW0;", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "Lco/bird/android/model/wire/WireBird;", "LDl0;", "cluster", "", "shouldRenderAsCluster", "item", "Lcom/google/android/gms/maps/model/MarkerOptions;", "markerOptions", "", "onBeforeClusterItemRendered", "LfM2;", "marker", "onClusterItemRendered", "selectItem", "deselectItem", "renderMapMarkerState", "Lco/bird/android/app/feature/map/renderer/IconLoader;", "iconLoader", "Lco/bird/android/app/feature/map/renderer/IconLoader;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LcD1;", "map", "LGl0;", "clusterManager", "<init>", "(Lco/bird/android/app/feature/map/renderer/IconLoader;Landroid/content/Context;LcD1;LGl0;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BirdClusterRenderer extends EW0<BirdMarkerClusterItem<WireBird>> {
    private final IconLoader iconLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirdClusterRenderer(IconLoader iconLoader, Context context, C39011cD1 map, C33116Gl0<BirdMarkerClusterItem<WireBird>> clusterManager) {
        super(context, map, clusterManager);
        Intrinsics.checkNotNullParameter(iconLoader, "iconLoader");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(clusterManager, "clusterManager");
        this.iconLoader = iconLoader;
    }

    @Override // p000.EW0
    public boolean shouldRenderAsCluster(InterfaceC32414Dl0<BirdMarkerClusterItem<WireBird>> cluster) {
        Intrinsics.checkNotNullParameter(cluster, "cluster");
        if (cluster.mo75549a() > 20) {
            return true;
        }
        return false;
    }

    @Override // p000.EW0
    public void deselectItem(BirdMarkerClusterItem<WireBird> item, C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(marker, "marker");
        this.iconLoader.renderDeselected(item, new C45633nM2()).m23947b(marker);
        marker.m41530d();
    }

    @Override // p000.EW0
    public void onBeforeClusterItemRendered(BirdMarkerClusterItem<WireBird> item, MarkerOptions markerOptions) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(markerOptions, "markerOptions");
        this.iconLoader.renderForState(item, new C45633nM2()).m23946c(markerOptions);
    }

    @Override // p000.EW0
    public void onClusterItemRendered(BirdMarkerClusterItem<WireBird> item, C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(marker, "marker");
        if (item.getState() == BirdClusterItemState.SELECTED && item.getMarker().getPrivateBird() == null) {
            BaseBirdMarkerClusterManager.Companion.showInfoWindow(marker, item);
        }
    }

    @Override // p000.EW0
    public void renderMapMarkerState(BirdMarkerClusterItem<WireBird> item, C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(marker, "marker");
        this.iconLoader.renderForState(item, new C45633nM2()).m23947b(marker);
    }

    @Override // p000.EW0
    public void selectItem(BirdMarkerClusterItem<WireBird> item, C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(marker, "marker");
        this.iconLoader.renderSelected(item, new C45633nM2()).m23947b(marker);
        if (item.getMarker().getPrivateBird() == null) {
            BaseBirdMarkerClusterManager.Companion.showInfoWindow(marker, item);
        }
    }
}
