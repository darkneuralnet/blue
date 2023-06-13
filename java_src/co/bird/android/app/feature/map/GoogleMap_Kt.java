package co.bird.android.app.feature.map;

import android.graphics.Paint;
import android.location.Location;
import android.util.LruCache;
import co.bird.android.app.feature.map.renderer.RichLayer;
import co.bird.android.model.Point;
import co.bird.android.model.Polygon;
import co.bird.android.model.constant.ZoomBehavior;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.wire.WireLocation;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;
import io.reactivex.AbstractC23442F;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
@Metadata(m28433d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0001\u001a\u0010\u0010\n\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\t\u001a\u0015\u0010\r\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0086\u0002\u001a\u0015\u0010\r\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000fH\u0086\u0002\u001a\u001a\u0010\r\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001\u001a$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015*\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013\u001a$\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005\u001a\f\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002\u001a\f\u0010!\u001a\u00020\u001f*\u00020\u001eH\u0002\u001a\n\u0010#\u001a\u00020\u0003*\u00020\"\u001a\u0016\u0010%\u001a\u0004\u0018\u00010\u0003*\u00020$2\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u001a\u0010\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00000'*\u00020&\u001a\n\u0010#\u001a\u00020\u0003*\u00020)\u001a\u0010\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013*\u00020\u000b\u001a\n\u0010,\u001a\u00020+*\u00020\u000e\u001a\u0012\u0010/\u001a\u00020\u0003*\u00020\u00032\u0006\u0010.\u001a\u00020-\u001a\u0016\u00102\u001a\u0002012\u0006\u0010\n\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0001\u001a\u0010\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013*\u000201\"\u0014\u00104\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00105\"\u0014\u00106\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107\"\u0014\u00108\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00107\")\u0010<\u001a\u0014\u0012\u0004\u0012\u00020:\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u0013098\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, m28432d2 = {"LcD1;", "", "visibleRadius", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "", "visibleRegionContains", "nearbyRadius", "adjustedNearbyRadius", "", "center", "Lco/bird/android/model/Polygon;", "location", "contains", "Lco/bird/android/model/persistence/Area;", "Landroid/location/Location;", "latitude", "longitude", "Lco/bird/android/app/feature/map/renderer/RichLayer;", "", "areas", "", "Lzp0;", "addPolygons", "LPT;", "bitmapDescriptor", "selected", "visible", "Lcom/google/android/gms/maps/model/GroundOverlayOptions;", "groundOverLayOptions", "", "", "inDemandAreaLabelOverlayWidth", "areaLabelOverlayWidth", "Lco/bird/android/model/Point;", "toLatLng", "LDX3;", "locationWithinClosestTo", "Lcom/google/android/gms/maps/MapView;", "Lio/reactivex/F;", "getMap", "Lco/bird/android/model/wire/WireLocation;", "toPoints", "Lco/bird/android/app/feature/map/ZIndexZoneType;", "zIndexType", "Lcom/google/android/gms/maps/model/LatLngBounds$a;", "builder", "includeInBounds", "radiusMeters", "Lcom/google/android/gms/maps/model/LatLngBounds;", "createBounds", "points", "AREA_BORDER_STROKE_THICKNESS_PX", "F", "NEARBY_RADIUS_PADDING_MULTIPLIER", "D", "METERS_IN_DEGREE_LATITUDE", "Landroid/util/LruCache;", "", "LVO4;", "simplifiedPolyCache", "Landroid/util/LruCache;", "getSimplifiedPolyCache", "()Landroid/util/LruCache;", "co.bird.android.feature.map"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGoogleMap+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMap+.kt\nco/bird/android/app/feature/map/GoogleMap_Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,261:1\n11335#2:262\n11670#2,3:263\n11335#2:266\n11670#2,3:267\n1#3:270\n1229#4,2:271\n*S KotlinDebug\n*F\n+ 1 GoogleMap+.kt\nco/bird/android/app/feature/map/GoogleMap_Kt\n*L\n145#1:262\n145#1:263,3\n230#1:266\n230#1:267,3\n95#1:271,2\n*E\n"})
/* loaded from: classes2.dex */
public final class GoogleMap_Kt {
    private static final float AREA_BORDER_STROKE_THICKNESS_PX = 3.0f;
    private static final double METERS_IN_DEGREE_LATITUDE = 111319.9d;
    private static final double NEARBY_RADIUS_PADDING_MULTIPLIER = 1.2d;
    private static final LruCache<String, List<VO4>> simplifiedPolyCache = new LruCache<>(512);

    public static final Map<Area, C53021zp0> addPolygons(RichLayer richLayer, List<Area> areas) {
        Intrinsics.checkNotNullParameter(richLayer, "<this>");
        Intrinsics.checkNotNullParameter(areas, "areas");
        int i = 0;
        C41318g46.m40163a("Number of areas: " + areas.size(), new Object[0]);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Area area : areas) {
            if (area.getZoomBehavior() != ZoomBehavior.ALWAYS_HIDDEN) {
                try {
                    Polygon region = area.getRegion();
                    XO4 m77031g = new XO4((List) C50896wE2.m7192a(simplifiedPolyCache, area.getId(), new GoogleMap_Kt$addPolygons$simplified$1(region))).m77032f(Integer.valueOf(area.getBorderColor())).m77033e(Integer.valueOf(area.getColor())).m77030h(Paint.Style.FILL_AND_STROKE).m77031g(3);
                    m77031g.m77029i(zIndexType(area).zIndex());
                    int numRings = region.numRings();
                    int i2 = 1;
                    while (i2 < numRings) {
                        Point[] points = region.getRing(i2).getPoints();
                        Intrinsics.checkNotNullExpressionValue(points, "region.getRing(i).points");
                        ArrayList arrayList = new ArrayList(points.length);
                        int length = points.length;
                        for (int i3 = i; i3 < length; i3++) {
                            Point it = points[i3];
                            Intrinsics.checkNotNullExpressionValue(it, "it");
                            arrayList.add(new VO4(toLatLng(it)));
                        }
                        m77031g.m77035c(arrayList);
                        i2++;
                        i = 0;
                    }
                    WO4 m77034d = m77031g.m77034d();
                    if (area.isOperationalInverse()) {
                        m77034d.f48481k = true;
                    }
                    richLayer.addShape(m77034d);
                    linkedHashMap.put(area, new C53021zp0(m77034d));
                    i = 0;
                } catch (Exception e) {
                    C41318g46.m40158f(e, "Failed to add area: " + area, new Object[0]);
                    i = 0;
                }
            }
        }
        return linkedHashMap;
    }

    public static final double adjustedNearbyRadius(double d) {
        return Math.max(d * NEARBY_RADIUS_PADDING_MULTIPLIER, 5000.0d);
    }

    private static final float areaLabelOverlayWidth(int i) {
        return i * 100.0f;
    }

    public static final LatLng center(List<LatLng> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        LatLngBounds.C17620a c17620a = new LatLngBounds.C17620a();
        for (LatLng latLng : list) {
            c17620a.m50666b(latLng);
        }
        LatLngBounds m50667a = c17620a.m50667a();
        Intrinsics.checkNotNullExpressionValue(m50667a, "builder.build()");
        LatLng m50668v = m50667a.m50668v();
        Intrinsics.checkNotNullExpressionValue(m50668v, "bounds.center");
        return m50668v;
    }

    public static final boolean contains(Polygon polygon, LatLng location) {
        Intrinsics.checkNotNullParameter(polygon, "<this>");
        Intrinsics.checkNotNullParameter(location, "location");
        return (polygon.numRings() == 0 || !contains$insideRings(location, polygon, 0, 1) || contains$insideRings(location, polygon, 1, polygon.numRings())) ? false : true;
    }

    private static final boolean contains$insideRings(LatLng latLng, Polygon polygon, int i, int i2) {
        IntRange until;
        Sequence asSequence;
        Sequence<List> map;
        until = RangesKt___RangesKt.until(i, i2);
        asSequence = CollectionsKt___CollectionsKt.asSequence(until);
        map = SequencesKt___SequencesKt.map(asSequence, new GoogleMap_Kt$contains$insideRings$1(polygon));
        for (List list : map) {
            if (BX3.m113900b(latLng, list, true)) {
                return true;
            }
        }
        return false;
    }

    public static final LatLngBounds createBounds(LatLng center, double d) {
        Intrinsics.checkNotNullParameter(center, "center");
        double d2 = d / METERS_IN_DEGREE_LATITUDE;
        double d3 = center.f71430b;
        double d4 = center.f71431c;
        return new LatLngBounds(new LatLng(d3 - d2, d4 - d2), new LatLng(d3 + d2, d4 + d2));
    }

    public static final AbstractC23442F<C39011cD1> getMap(MapView mapView) {
        Intrinsics.checkNotNullParameter(mapView, "<this>");
        return C45832nh5.m23305k(new GoogleMap_Kt$getMap$1(mapView));
    }

    public static final LruCache<String, List<VO4>> getSimplifiedPolyCache() {
        return simplifiedPolyCache;
    }

    public static final GroundOverlayOptions groundOverLayOptions(Area area, C6378PT bitmapDescriptor, boolean z, boolean z2) {
        String overlayLabel;
        Integer valueOf;
        float areaLabelOverlayWidth;
        float f;
        Intrinsics.checkNotNullParameter(area, "<this>");
        Intrinsics.checkNotNullParameter(bitmapDescriptor, "bitmapDescriptor");
        if (!z ? (overlayLabel = area.getOverlayLabel()) != null : (overlayLabel = area.getSelectedOverlayLabel()) != null) {
            valueOf = Integer.valueOf(overlayLabel.length());
        } else {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        int intValue = valueOf.intValue();
        GroundOverlayOptions m50690D0 = new GroundOverlayOptions().m50690D0(bitmapDescriptor);
        LatLng latLng = toLatLng(JX3.m100298a(area.getRegion()));
        if (area.isDemandArea()) {
            areaLabelOverlayWidth = inDemandAreaLabelOverlayWidth(intValue);
        } else {
            areaLabelOverlayWidth = areaLabelOverlayWidth(intValue);
        }
        GroundOverlayOptions m50681W0 = m50690D0.m50681W0(latLng, areaLabelOverlayWidth);
        if (area.isDemandArea()) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        return m50681W0.m50674s(0.5f, f).m50680Y0(z2).m50678j1(1000.0f);
    }

    private static final float inDemandAreaLabelOverlayWidth(int i) {
        return (i * 10.0f) + 20.0f;
    }

    public static final LatLng includeInBounds(LatLng latLng, LatLngBounds.C17620a builder) {
        Intrinsics.checkNotNullParameter(latLng, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m50666b(latLng);
        return latLng;
    }

    public static final LatLng locationWithinClosestTo(DX3 dx3, LatLng latLng) {
        Object first;
        Intrinsics.checkNotNullParameter(dx3, "<this>");
        if (latLng == null || !BX3.m113900b(latLng, dx3.m110285a(), true)) {
            LatLng latLng2 = null;
            if (latLng != null) {
                int size = dx3.m110285a().size();
                double d = Double.MAX_VALUE;
                int i = 0;
                while (i < size) {
                    LatLng point1 = dx3.m110285a().get(i);
                    i++;
                    LatLng point2 = dx3.m110285a().get(i % dx3.m110285a().size());
                    C37429Yw2 c37429Yw2 = C37429Yw2.f47648a;
                    Intrinsics.checkNotNullExpressionValue(point1, "point1");
                    Intrinsics.checkNotNullExpressionValue(point2, "point2");
                    LatLng m73970a = c37429Yw2.m73970a(latLng, point1, point2);
                    double m86795c = RN5.m86795c(m73970a, latLng);
                    if (m86795c < d) {
                        latLng2 = m73970a;
                        d = m86795c;
                    }
                }
            }
            LatLng latLng3 = latLng2;
            if (latLng3 == null) {
                List<LatLng> points = dx3.m110285a();
                Intrinsics.checkNotNullExpressionValue(points, "points");
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) points);
                return (LatLng) first;
            }
            return latLng3;
        }
        return latLng;
    }

    public static final double nearbyRadius(C39011cD1 c39011cD1) {
        Intrinsics.checkNotNullParameter(c39011cD1, "<this>");
        return Math.max(visibleRadius(c39011cD1) * NEARBY_RADIUS_PADDING_MULTIPLIER, 5000.0d);
    }

    public static final List<LatLng> points(LatLngBounds latLngBounds) {
        List<LatLng> listOf;
        Intrinsics.checkNotNullParameter(latLngBounds, "<this>");
        LatLng northeast = latLngBounds.f71433c;
        Intrinsics.checkNotNullExpressionValue(northeast, "northeast");
        LatLng southwest = latLngBounds.f71432b;
        Intrinsics.checkNotNullExpressionValue(southwest, "southwest");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new LatLng[]{northeast, new LatLng(latLngBounds.f71433c.f71430b, latLngBounds.f71432b.f71431c), southwest, new LatLng(latLngBounds.f71432b.f71430b, latLngBounds.f71433c.f71431c)});
        return listOf;
    }

    public static final LatLng toLatLng(Point point) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        return new LatLng(point.f66612y, point.f66611x);
    }

    public static final List<LatLng> toPoints(Polygon polygon) {
        Intrinsics.checkNotNullParameter(polygon, "<this>");
        Point[] points = polygon.getRing(0).getPoints();
        Intrinsics.checkNotNullExpressionValue(points, "getRing(0).points");
        ArrayList arrayList = new ArrayList(points.length);
        for (Point point : points) {
            arrayList.add(new LatLng(point.f66612y, point.f66611x));
        }
        return arrayList;
    }

    public static final double visibleRadius(C39011cD1 c39011cD1) {
        Intrinsics.checkNotNullParameter(c39011cD1, "<this>");
        VisibleRegion m81934b = c39011cD1.m61677k().m81934b();
        Intrinsics.checkNotNullExpressionValue(m81934b, "projection.visibleRegion");
        C37429Yw2 c37429Yw2 = C37429Yw2.f47648a;
        Location m73963h = c37429Yw2.m73963h(m81934b.f71509f.m50668v().f71430b, m81934b.f71509f.m50668v().f71431c);
        LatLng latLng = m81934b.f71509f.f71432b;
        return m73963h.distanceTo(c37429Yw2.m73963h(latLng.f71430b, latLng.f71431c));
    }

    public static final boolean visibleRegionContains(C39011cD1 c39011cD1, LatLng latLng) {
        Intrinsics.checkNotNullParameter(c39011cD1, "<this>");
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        return c39011cD1.m61677k().m81934b().f71509f.m50669u(latLng);
    }

    public static final ZIndexZoneType zIndexType(Area area) {
        Integer releaseCapacity;
        Intrinsics.checkNotNullParameter(area, "<this>");
        if (area.isOperationalInverse()) {
            return ZIndexZoneType.INVERTED_OPERATIONAL_ZONE;
        }
        if (area.isReleaseConstrained() && area.getReleaseCapacity() == null) {
            return ZIndexZoneType.NO_DROP_ZONE;
        }
        if (area.isReleaseConstrained() && (releaseCapacity = area.getReleaseCapacity()) != null && releaseCapacity.intValue() == 0) {
            return ZIndexZoneType.NO_CAPS_REMAINING_ZONE;
        }
        if (area.isReleaseConstrained() && !area.getOperational()) {
            return ZIndexZoneType.LIMITED_CAPS_REMAINING_ZONE;
        }
        if (area.getOperational()) {
            return ZIndexZoneType.OPERATIONAL_ZONE;
        }
        return ZIndexZoneType.BASE_ZONE;
    }

    public static final LatLng toLatLng(WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(wireLocation, "<this>");
        return new LatLng(wireLocation.getLatitude(), wireLocation.getLongitude());
    }

    public static final boolean contains(Area area, Location location) {
        Intrinsics.checkNotNullParameter(area, "<this>");
        Intrinsics.checkNotNullParameter(location, "location");
        return contains(area.getRegion(), new LatLng(location.getLatitude(), location.getLongitude()));
    }

    public static final boolean contains(Area area, double d, double d2) {
        Intrinsics.checkNotNullParameter(area, "<this>");
        return contains(area.getRegion(), new LatLng(d, d2));
    }
}
