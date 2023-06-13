package co.bird.android.app.feature.map.p008ui.renderer;

import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.app.feature.map.p008ui.renderer.MapPolygonableRenderer;
import co.bird.android.model.Point;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolygonOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/google/android/gms/maps/model/PolygonOptions;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$resettableOptions$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,518:1\n11335#2:519\n11670#2,3:520\n11335#2:524\n11670#2,3:525\n11335#2:530\n11670#2,3:531\n1855#3:523\n1856#3:528\n1855#3:529\n1856#3:534\n*S KotlinDebug\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$resettableOptions$1\n*L\n322#1:519\n322#1:520,3\n332#1:524\n332#1:525,3\n336#1:530\n336#1:531,3\n331#1:523\n331#1:528\n335#1:529\n335#1:534\n*E\n"})
/* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$PolygonWrapper$resettableOptions$1 */
/* loaded from: classes2.dex */
public final class MapPolygonableRenderer$PolygonWrapper$resettableOptions$1 extends Lambda implements Function0<PolygonOptions> {
    final /* synthetic */ MapPolygonableRenderer.PolygonWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPolygonableRenderer$PolygonWrapper$resettableOptions$1(MapPolygonableRenderer.PolygonWrapper polygonWrapper) {
        super(0);
        this.this$0 = polygonWrapper;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PolygonOptions invoke() {
        IntRange until;
        List<CX3> list;
        PolygonOptions polygonOptions = new PolygonOptions();
        Point[] points = this.this$0.getPolygonable().getRegion().getRing(0).getPoints();
        Intrinsics.checkNotNullExpressionValue(points, "polygonable.region.getRing(0).points");
        ArrayList arrayList = new ArrayList(points.length);
        for (Point point : points) {
            Intrinsics.checkNotNullExpressionValue(point, "point");
            arrayList.add(GoogleMap_Kt.toLatLng(point));
        }
        PolygonOptions m50624v = polygonOptions.m50626s(arrayList).m50639E(this.this$0.getPolygonable().getColor()).m50634N0(this.this$0.getPolygonable().getBorderColor()).m50631W0(C49347td3.m12001b(1)).m50630Y0(-((float) this.this$0.getSize())).m50624v(false);
        Intrinsics.checkNotNullExpressionValue(m50624v, "PolygonOptions()\n       …        .clickable(false)");
        until = RangesKt___RangesKt.until(1, this.this$0.getPolygonable().getRegion().numRings());
        MapPolygonableRenderer.PolygonWrapper polygonWrapper = this.this$0;
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            Point[] points2 = polygonWrapper.getPolygonable().getRegion().getRing(((IntIterator) it).nextInt()).getPoints();
            Intrinsics.checkNotNullExpressionValue(points2, "polygonable.region.getRing(idx).points");
            ArrayList arrayList2 = new ArrayList(points2.length);
            for (Point point2 : points2) {
                Intrinsics.checkNotNullExpressionValue(point2, "point");
                arrayList2.add(GoogleMap_Kt.toLatLng(point2));
            }
            m50624v.m50625u(arrayList2);
        }
        list = this.this$0.holes;
        for (CX3 cx3 : list) {
            C52053yB0[] mo77238Y = cx3.m112157L0().mo77238Y();
            Intrinsics.checkNotNullExpressionValue(mo77238Y, "it.exteriorRing.coordinates");
            ArrayList arrayList3 = new ArrayList(mo77238Y.length);
            for (C52053yB0 c52053yB0 : mo77238Y) {
                arrayList3.add(new LatLng(c52053yB0.f118923c, c52053yB0.f118922b));
            }
            m50624v.m50625u(arrayList3);
        }
        return m50624v;
    }
}
