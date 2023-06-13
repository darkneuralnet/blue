package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import android.view.View;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem;
import co.bird.android.model.constant.BirdBadgeType;
import co.bird.android.model.constant.MapMarkerKind;
import co.bird.android.model.wire.WireBird;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B3\b\u0007\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010#\u001a\u00020\"\u0012\u0014\b\u0001\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020$¢\u0006\u0004\b&\u0010'J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0007H\u0014J\u001e\u0010\u000e\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014J\u001e\u0010\u0011\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001e\u0010\u0012\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00050\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006("}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/OperatorClusterRenderer;", "LEW0;", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "Lco/bird/android/model/wire/WireBird;", "item", "LPT;", "fromMarker", "LDl0;", "cluster", "", "shouldRenderAsCluster", "Lcom/google/android/gms/maps/model/MarkerOptions;", "markerOptions", "", "onBeforeClusterItemRendered", "LfM2;", "marker", "selectItem", "deselectItem", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "", "", "Landroid/graphics/drawable/Drawable;", "iconCache", "Ljava/util/Map;", "Landroid/util/LruCache;", "", "bitmapCache", "Landroid/util/LruCache;", "Landroid/view/View;", "bountyMarkerView", "Landroid/view/View;", "LcD1;", "map", "LGl0;", "clusterManager", "<init>", "(Landroid/content/Context;LcD1;LGl0;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorClusterRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/OperatorClusterRenderer\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n361#2,7:91\n1#3:98\n*S KotlinDebug\n*F\n+ 1 OperatorClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/OperatorClusterRenderer\n*L\n79#1:91,7\n*E\n"})
/* loaded from: classes2.dex */
public final class OperatorClusterRenderer extends EW0<BirdMarkerClusterItem<WireBird>> {
    private final LruCache<String, C6378PT> bitmapCache;
    private View bountyMarkerView;
    private final Context context;
    private Map<Integer, Drawable> iconCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperatorClusterRenderer(Context context, C39011cD1 map, C33116Gl0<BirdMarkerClusterItem<WireBird>> clusterManager) {
        super(context, map, clusterManager);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(clusterManager, "clusterManager");
        this.context = context;
        this.iconCache = new LinkedHashMap();
        this.bitmapCache = new LruCache<>(30);
    }

    private final C6378PT fromMarker(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem) {
        boolean z;
        MapMarkerKind.Companion companion = MapMarkerKind.Companion;
        String str = companion.from(birdMarkerClusterItem.getMarker().getLabel().getMarker()) + " " + birdMarkerClusterItem.getMarker().getLabel().getBadgeType();
        C6378PT c6378pt = this.bitmapCache.get(str);
        if (c6378pt == null) {
            View view = this.bountyMarkerView;
            if (view == null) {
                view = C40788fB0.m41762t(this.context, C45258mj4.view_operator_marker, null);
                this.bountyMarkerView = view;
            }
            View view2 = view;
            int m3672a = C52136yK2.m3672a(companion.from(birdMarkerClusterItem.getMarker().getLabel().getMarker()));
            Map<Integer, Drawable> map = this.iconCache;
            Integer valueOf = Integer.valueOf(m3672a);
            Drawable drawable = map.get(valueOf);
            if (drawable == null) {
                drawable = NA0.m94299e(this.context, m3672a);
                map.put(valueOf, drawable);
            }
            Drawable drawable2 = drawable;
            View findViewById = view2.findViewById(C31680Ah4.cannotAccessBadge);
            Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById<ImageV…>(R.id.cannotAccessBadge)");
            if (birdMarkerClusterItem.getMarker().getLabel().getBadgeType() == BirdBadgeType.CANNOT_ACCESS_REPORT) {
                z = true;
            } else {
                z = false;
            }
            C49520tu6.show$default(findViewById, z, 0, 2, null);
            ((ImageView) view2.findViewById(C31680Ah4.markerIcon)).setImageDrawable(drawable2);
            C6378PT iconBitmapDescriptor$default = C40788fB0.iconBitmapDescriptor$default(this.context, view2, (Drawable) null, (AP1) null, 4, (Object) null);
            this.bitmapCache.put(str, iconBitmapDescriptor$default);
            return iconBitmapDescriptor$default;
        }
        return c6378pt;
    }

    @Override // p000.EW0
    public boolean shouldRenderAsCluster(InterfaceC32414Dl0<BirdMarkerClusterItem<WireBird>> cluster) {
        Intrinsics.checkNotNullParameter(cluster, "cluster");
        if (cluster.mo75549a() > 30) {
            return true;
        }
        return false;
    }

    @Override // p000.EW0
    public void deselectItem(BirdMarkerClusterItem<WireBird> item, C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(marker, "marker");
        super.selectItem((OperatorClusterRenderer) item, marker);
        marker.m41530d();
    }

    @Override // p000.EW0
    public void onBeforeClusterItemRendered(BirdMarkerClusterItem<WireBird> item, MarkerOptions markerOptions) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(markerOptions, "markerOptions");
        super.onBeforeClusterItemRendered((OperatorClusterRenderer) item, markerOptions);
        markerOptions.m50657N0(fromMarker(item)).m50645s(item.getMarker().getCaptive() ? 0.3f : 1.0f);
    }

    @Override // p000.EW0
    public void selectItem(BirdMarkerClusterItem<WireBird> item, C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(marker, "marker");
        super.selectItem((OperatorClusterRenderer) item, marker);
        marker.m41514t();
    }
}
