package p000;

import android.location.Location;
import android.util.LruCache;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Geometry;
import co.bird.android.model.LinearRing;
import co.bird.android.model.Point;
import co.bird.android.model.Polygon;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a \u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a\"\u0010\t\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a\u0014\u0010\r\u001a\u00020\u0000*\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\n\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000b\"#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00128\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m28432d2 = {"LWB1;", "T", "", "wkt", "geometryFromWkt", "(Ljava/lang/String;)LWB1;", "Lco/bird/android/model/Geometry;", "toJtsGeometry", "(Lco/bird/android/model/Geometry;)LWB1;", "maybeToJtsGeometry", "Landroid/location/Location;", "", "radius", C17296a.f69688o, "LFW3;", "c", "Lco/bird/android/model/Polygon;", "b", "Landroid/util/LruCache;", "Landroid/util/LruCache;", DateTokenConverter.CONVERTER_KEY, "()Landroid/util/LruCache;", "geometryCache", "geo_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nJtsGeometry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JtsGeometry.kt\nco/bird/android/geo/extension/JtsGeometryKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,87:1\n35#1:88\n11335#2:89\n11670#2,3:90\n37#3,2:93\n*S KotlinDebug\n*F\n+ 1 JtsGeometry.kt\nco/bird/android/geo/extension/JtsGeometryKt\n*L\n46#1:88\n82#1:89\n82#1:90,3\n82#1:93,2\n*E\n"})
/* renamed from: Fj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32866Fj2 {

    /* renamed from: a */
    public static final LruCache<Geometry, WB1> f10033a = new C2417a();

    @Metadata(m28433d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0006"}, m28432d2 = {"Fj2$a", "Landroid/util/LruCache;", "Lco/bird/android/model/Geometry;", "LWB1;", "key", C17296a.f69688o, "geo_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nJtsGeometry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JtsGeometry.kt\nco/bird/android/geo/extension/JtsGeometryKt$geometryCache$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 JtsGeometry.kt\nco/bird/android/geo/extension/JtsGeometryKt\n*L\n1#1,87:1\n1#2:88\n16#3:89\n*S KotlinDebug\n*F\n+ 1 JtsGeometry.kt\nco/bird/android/geo/extension/JtsGeometryKt$geometryCache$1\n*L\n24#1:89\n*E\n"})
    /* renamed from: Fj2$a */
    /* loaded from: classes3.dex */
    public static final class C2417a extends LruCache<Geometry, WB1> {
        public C2417a() {
            super(9216);
        }

        @Override // android.util.LruCache
        /* renamed from: a */
        public WB1 create(Geometry geometry) {
            if (geometry == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder(8192);
            geometry.outerWKT(sb);
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
            WB1 m29686v = new C43611jw6().m29686v(sb2);
            if (m29686v != null) {
                return m29686v;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.locationtech.jts.geom.Geometry");
        }
    }

    /* renamed from: a */
    public static final WB1 m106645a(Location location, double d) {
        boolean z;
        Intrinsics.checkNotNullParameter(location, "<this>");
        if (d == 0.0d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            FW3 m64835t = new C38409bC1().m64835t(new C52053yB0(location.getLongitude(), location.getLatitude()));
            Intrinsics.checkNotNullExpressionValue(m64835t, "GeometryFactory().create…ate(longitude, latitude))");
            return m64835t;
        }
        double d2 = d * 2.0d;
        VB1 vb1 = new VB1();
        vb1.m80251f(128);
        vb1.m80253d(new C52053yB0(location.getLongitude(), location.getLatitude()));
        vb1.m80252e(d2 / 111320.0d);
        vb1.m80250g(d2 / ((40075000 * Math.cos(Math.toRadians(location.getLatitude()))) / 360));
        CX3 m80255b = vb1.m80255b();
        Intrinsics.checkNotNullExpressionValue(m80255b, "with(GeometricShapeFacto…)\n    createEllipse()\n  }");
        return m80255b;
    }

    /* renamed from: b */
    public static final Polygon m106644b(Location location, double d) {
        Point[] pointArr;
        Intrinsics.checkNotNullParameter(location, "<this>");
        WB1 m106645a = m106645a(location, d);
        if (m106645a instanceof CX3) {
            C52053yB0[] mo77238Y = ((CX3) m106645a).m112157L0().mo77238Y();
            Intrinsics.checkNotNullExpressionValue(mo77238Y, "geometry.exteriorRing.coordinates");
            ArrayList arrayList = new ArrayList(mo77238Y.length);
            for (C52053yB0 c52053yB0 : mo77238Y) {
                arrayList.add(new Point(c52053yB0.f118922b, c52053yB0.f118923c));
            }
            pointArr = (Point[]) arrayList.toArray(new Point[0]);
        } else {
            pointArr = new Point[]{new Point(m106645a.mo77239W().f118922b, m106645a.mo77239W().f118923c)};
        }
        return new Polygon(new LinearRing[]{new LinearRing(pointArr)});
    }

    /* renamed from: c */
    public static final FW3 m106643c(Location location) {
        Intrinsics.checkNotNullParameter(location, "<this>");
        FW3 m64835t = new C38409bC1().m64835t(new C52053yB0(location.getLongitude(), location.getLatitude()));
        Intrinsics.checkNotNullExpressionValue(m64835t, "GeometryFactory().create…ate(longitude, latitude))");
        return m64835t;
    }

    public static /* synthetic */ WB1 createCircleGeometry$default(Location location, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = location.getAccuracy();
        }
        return m106645a(location, d);
    }

    public static /* synthetic */ Polygon createCirclePolygon$default(Location location, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = location.getAccuracy();
        }
        return m106644b(location, d);
    }

    /* renamed from: d */
    public static final LruCache<Geometry, WB1> m106642d() {
        return f10033a;
    }

    public static final /* synthetic */ <T extends WB1> T geometryFromWkt(String wkt) {
        Intrinsics.checkNotNullParameter(wkt, "wkt");
        T t = (T) new C43611jw6().m29686v(wkt);
        Intrinsics.reifiedOperationMarker(1, "T");
        return t;
    }

    public static final /* synthetic */ <T extends WB1> T maybeToJtsGeometry(Geometry geometry) {
        Intrinsics.checkNotNullParameter(geometry, "<this>");
        try {
            WB1 wb1 = m106642d().get(geometry);
            Intrinsics.reifiedOperationMarker(1, "T");
            return (T) wb1;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final /* synthetic */ <T extends WB1> T toJtsGeometry(Geometry geometry) {
        Intrinsics.checkNotNullParameter(geometry, "<this>");
        WB1 wb1 = m106642d().get(geometry);
        Intrinsics.reifiedOperationMarker(1, "T");
        return (T) wb1;
    }
}
