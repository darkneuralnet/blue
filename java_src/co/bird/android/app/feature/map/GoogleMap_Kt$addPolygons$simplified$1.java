package co.bird.android.app.feature.map;

import co.bird.android.model.Polygon;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"", "LVO4;", "invoke", "()Ljava/util/List;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGoogleMap+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMap+.kt\nco/bird/android/app/feature/map/GoogleMap_Kt$addPolygons$simplified$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n1549#2:262\n1620#2,3:263\n*S KotlinDebug\n*F\n+ 1 GoogleMap+.kt\nco/bird/android/app/feature/map/GoogleMap_Kt$addPolygons$simplified$1\n*L\n133#1:262\n133#1:263,3\n*E\n"})
/* loaded from: classes2.dex */
public final class GoogleMap_Kt$addPolygons$simplified$1 extends Lambda implements Function0<List<? extends VO4>> {
    final /* synthetic */ Polygon $region;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleMap_Kt$addPolygons$simplified$1(Polygon polygon) {
        super(0);
        this.$region = polygon;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends VO4> invoke() {
        int collectionSizeOrDefault;
        List mutableList;
        List<LatLng> points = GoogleMap_Kt.toPoints(this.$region);
        if (points.size() > 32) {
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) points);
            points = BX3.m113895g(mutableList, 5.0d);
        }
        Intrinsics.checkNotNullExpressionValue(points, "if (points.size > 32) {\n…         points\n        }");
        List<LatLng> list = points;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (LatLng latLng : list) {
            arrayList.add(new VO4(latLng));
        }
        return arrayList;
    }
}
