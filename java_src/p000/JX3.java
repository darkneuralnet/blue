package p000;

import android.location.Location;
import co.bird.android.model.Geometry;
import co.bird.android.model.GeometryBuilder;
import co.bird.android.model.Point;
import co.bird.android.model.Polygon;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a&\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006\u001a-\u0010\u000b\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00000\u000f¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/Polygon;", "Lcom/google/android/gms/maps/model/LatLng;", "location", "", "c", "Landroid/location/Location;", "", "accuracyLimit", "additionalAccuracyBuffer", "b", "meters", "e", "(Lco/bird/android/model/Polygon;DLandroid/location/Location;D)Ljava/lang/Boolean;", "Lco/bird/android/model/Point;", C17296a.f69688o, "Lkotlin/reflect/KClass;", "f", "geo_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPolygon+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Polygon+.kt\nco/bird/android/geo/extension/Polygon_Kt\n+ 2 JtsGeometry.kt\nco/bird/android/geo/extension/JtsGeometryKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,64:1\n35#2:65\n45#2,2:66\n35#2:68\n47#2,3:69\n35#2:72\n1#3:73\n1229#4,2:74\n*S KotlinDebug\n*F\n+ 1 Polygon+.kt\nco/bird/android/geo/extension/Polygon_Kt\n*L\n41#1:65\n57#1:66,2\n57#1:68\n57#1:69,3\n60#1:72\n20#1:74,2\n*E\n"})
/* renamed from: JX3 */
/* loaded from: classes3.dex */
public final class JX3 {

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "Lcom/google/android/gms/maps/model/LatLng;", "i", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPolygon+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Polygon+.kt\nco/bird/android/geo/extension/Polygon_Kt$contains$insideRings$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,64:1\n11335#2:65\n11670#2,3:66\n*S KotlinDebug\n*F\n+ 1 Polygon+.kt\nco/bird/android/geo/extension/Polygon_Kt$contains$insideRings$1\n*L\n19#1:65\n19#1:66,3\n*E\n"})
    /* renamed from: JX3$a */
    /* loaded from: classes3.dex */
    public static final class C4136a extends Lambda implements Function1<Integer, List<? extends LatLng>> {

        /* renamed from: g */
        public final /* synthetic */ Polygon f17731g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4136a(Polygon polygon) {
            super(1);
            this.f17731g = polygon;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends LatLng> invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final List<LatLng> invoke(int i) {
            Point[] points = this.f17731g.getRing(i).getPoints();
            Intrinsics.checkNotNullExpressionValue(points, "getRing(i).points");
            ArrayList arrayList = new ArrayList(points.length);
            for (Point point : points) {
                arrayList.add(new LatLng(point.f66612y, point.f66611x));
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static final Point m100298a(Polygon polygon) {
        Intrinsics.checkNotNullParameter(polygon, "<this>");
        WB1 wb1 = C32866Fj2.m106642d().get(polygon);
        if (wb1 != null) {
            FW3 m78760U = ((CX3) wb1).m78760U();
            return new Point(m78760U.m107067M0(), m78760U.m107066O0());
        }
        throw new NullPointerException("null cannot be cast to non-null type org.locationtech.jts.geom.Polygon");
    }

    /* renamed from: b */
    public static final boolean m100297b(Polygon polygon, Location location, double d, double d2) {
        Intrinsics.checkNotNullParameter(polygon, "<this>");
        Intrinsics.checkNotNullParameter(location, "location");
        double min = Math.min(d, location.getAccuracy()) + d2;
        WB1 wb1 = C32866Fj2.m106642d().get(polygon);
        if (wb1 != null) {
            return ((CX3) wb1).m78747q0(C32866Fj2.m106645a(location, min));
        }
        throw new NullPointerException("null cannot be cast to non-null type org.locationtech.jts.geom.Polygon");
    }

    /* renamed from: c */
    public static final boolean m100296c(Polygon polygon, LatLng location) {
        Intrinsics.checkNotNullParameter(polygon, "<this>");
        Intrinsics.checkNotNullParameter(location, "location");
        if (polygon.numRings() == 0 || !m100295d(location, polygon, 0, 1) || m100295d(location, polygon, 1, polygon.numRings())) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean contains$default(Polygon polygon, Location location, double d, double d2, int i, Object obj) {
        if ((i & 2) != 0) {
            d = Double.MAX_VALUE;
        }
        double d3 = d;
        if ((i & 4) != 0) {
            d2 = 0.0d;
        }
        return m100297b(polygon, location, d3, d2);
    }

    /* renamed from: d */
    public static final boolean m100295d(LatLng latLng, Polygon polygon, int i, int i2) {
        IntRange until;
        Sequence asSequence;
        Sequence<List> map;
        until = RangesKt___RangesKt.until(i, i2);
        asSequence = CollectionsKt___CollectionsKt.asSequence(until);
        map = SequencesKt___SequencesKt.map(asSequence, new C4136a(polygon));
        for (List list : map) {
            if (BX3.m113900b(latLng, list, true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final Boolean m100294e(Polygon polygon, double d, Location location, double d2) {
        CX3 cx3;
        WB1 wb1;
        Intrinsics.checkNotNullParameter(polygon, "<this>");
        Intrinsics.checkNotNullParameter(location, "location");
        double min = Math.min(d2, location.getAccuracy());
        try {
            wb1 = C32866Fj2.m106642d().get(polygon);
        } catch (Exception e) {
            e.printStackTrace();
            cx3 = null;
        }
        if (wb1 != null) {
            cx3 = (CX3) wb1;
            if (cx3 == null) {
                return null;
            }
            return Boolean.valueOf(cx3.m78747q0(C32866Fj2.m106645a(location, min + d)));
        }
        throw new NullPointerException("null cannot be cast to non-null type org.locationtech.jts.geom.Polygon");
    }

    /* renamed from: f */
    public static final Polygon m100293f(KClass<Polygon> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Geometry geomFromString = GeometryBuilder.geomFromString("POLYGON((-146.57092524067605 28.541664128618446,-144.72522211567605 28.541664128618446,-144.72522211567605 26.75108895354207,-146.57092524067605 26.75108895354207,-146.57092524067605 28.541664128618446))");
        Intrinsics.checkNotNull(geomFromString, "null cannot be cast to non-null type co.bird.android.model.Polygon");
        return (Polygon) geomFromString;
    }

    public static /* synthetic */ Boolean maybeWithinMetersOfLocation$default(Polygon polygon, double d, Location location, double d2, int i, Object obj) {
        if ((i & 4) != 0) {
            d2 = Double.MAX_VALUE;
        }
        return m100294e(polygon, d, location, d2);
    }
}
