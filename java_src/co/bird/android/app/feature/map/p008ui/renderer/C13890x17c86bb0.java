package co.bird.android.app.feature.map.p008ui.renderer;

import co.bird.android.model.Point;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$visibleRegionIntersects$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,518:1\n12744#2,2:519\n*S KotlinDebug\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$visibleRegionIntersects$2\n*L\n160#1:519,2\n*E\n"})
/* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$3$filterVisiblePolygonables$1$visibleRegionIntersects$2 */
/* loaded from: classes2.dex */
public final class C13890x17c86bb0 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ Point[] $points;
    final /* synthetic */ VisibleRegion $visibleRegion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13890x17c86bb0(Point[] pointArr, VisibleRegion visibleRegion) {
        super(0);
        this.$points = pointArr;
        this.$visibleRegion = visibleRegion;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r0 != false) goto L15;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke() {
        boolean z;
        LatLngBounds toLatLngBounds;
        boolean contains;
        boolean contains2;
        Point[] points = this.$points;
        Intrinsics.checkNotNullExpressionValue(points, "points");
        VisibleRegion visibleRegion = this.$visibleRegion;
        int length = points.length;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            Point point = points[i];
            Intrinsics.checkNotNullExpressionValue(visibleRegion, "visibleRegion");
            Intrinsics.checkNotNullExpressionValue(point, "point");
            contains2 = MapPolygonableRendererKt.contains(visibleRegion, point);
            if (contains2) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            Point[] points2 = this.$points;
            Intrinsics.checkNotNullExpressionValue(points2, "points");
            toLatLngBounds = MapPolygonableRendererKt.getToLatLngBounds(points2);
            VisibleRegion visibleRegion2 = this.$visibleRegion;
            Intrinsics.checkNotNullExpressionValue(visibleRegion2, "visibleRegion");
            contains = MapPolygonableRendererKt.contains(toLatLngBounds, visibleRegion2);
        }
        z2 = true;
        return Boolean.valueOf(z2);
    }
}
