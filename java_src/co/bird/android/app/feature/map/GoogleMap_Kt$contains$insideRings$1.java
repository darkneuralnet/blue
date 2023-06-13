package co.bird.android.app.feature.map;

import co.bird.android.model.Point;
import co.bird.android.model.Polygon;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "Lcom/google/android/gms/maps/model/LatLng;", "i", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nGoogleMap+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMap+.kt\nco/bird/android/app/feature/map/GoogleMap_Kt$contains$insideRings$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,261:1\n11335#2:262\n11670#2,3:263\n*S KotlinDebug\n*F\n+ 1 GoogleMap+.kt\nco/bird/android/app/feature/map/GoogleMap_Kt$contains$insideRings$1\n*L\n94#1:262\n94#1:263,3\n*E\n"})
/* loaded from: classes2.dex */
public final class GoogleMap_Kt$contains$insideRings$1 extends Lambda implements Function1<Integer, List<? extends LatLng>> {
    final /* synthetic */ Polygon $this_contains;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleMap_Kt$contains$insideRings$1(Polygon polygon) {
        super(1);
        this.$this_contains = polygon;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ List<? extends LatLng> invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final List<LatLng> invoke(int i) {
        Point[] points = this.$this_contains.getRing(i).getPoints();
        Intrinsics.checkNotNullExpressionValue(points, "getRing(i).points");
        ArrayList arrayList = new ArrayList(points.length);
        for (Point point : points) {
            arrayList.add(new LatLng(point.f66612y, point.f66611x));
        }
        return arrayList;
    }
}
