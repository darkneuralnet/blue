package co.bird.android.app.feature.map.p008ui.renderer;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.app.feature.map.p008ui.MapModelRenderer;
import co.bird.android.model.ParkingNest;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00070\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#¨\u0006*"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;", "Lco/bird/android/app/feature/map/ui/MapModelRenderer;", "Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;", "Lco/bird/android/model/ParkingNest;", "nest", "Lcom/google/android/gms/maps/model/MarkerOptions;", "createMarkerOptions", "LfM2;", "getOrCreateMarker", "Lcom/google/android/gms/maps/model/PolygonOptions;", "createPolygonOptions", "LDX3;", "getOrCreatePolygon", "", "items", "", "render", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "LcD1;", "map", "LcD1;", "", "showNestRadius", "Z", "", "", "markers", "Ljava/util/Map;", "polygons", "LPT;", "parkingBitmapDescriptor$delegate", "Lkotlin/Lazy;", "getParkingBitmapDescriptor", "()LPT;", "parkingBitmapDescriptor", "parkingUnavailableBitmapDescriptor$delegate", "getParkingUnavailableBitmapDescriptor", "parkingUnavailableBitmapDescriptor", "<init>", "(Landroid/content/Context;LcD1;Z)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nParkingNestRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingNestRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,80:1\n361#2,7:81\n361#2,7:88\n1194#3,2:95\n1222#3,4:97\n1855#3,2:101\n215#4,2:103\n215#4,2:105\n*S KotlinDebug\n*F\n+ 1 ParkingNestRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer\n*L\n36#1:81,7\n49#1:88,7\n54#1:95,2\n54#1:97,4\n55#1:101,2\n67#1:103,2\n73#1:105,2\n*E\n"})
/* renamed from: co.bird.android.app.feature.map.ui.renderer.ParkingNestRenderer */
/* loaded from: classes2.dex */
public final class ParkingNestRenderer implements MapModelRenderer<ParkingNestRenderItem> {
    private final Context context;
    private final C39011cD1 map;
    private final Map<String, C40889fM2> markers;
    private final Lazy parkingBitmapDescriptor$delegate;
    private final Lazy parkingUnavailableBitmapDescriptor$delegate;
    private final Map<String, DX3> polygons;
    private final boolean showNestRadius;

    public ParkingNestRenderer(Context context, C39011cD1 map, boolean z) {
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(map, "map");
        this.context = context;
        this.map = map;
        this.showNestRadius = z;
        this.markers = new LinkedHashMap();
        this.polygons = new LinkedHashMap();
        lazy = LazyKt__LazyJVMKt.lazy(new ParkingNestRenderer$parkingBitmapDescriptor$2(this));
        this.parkingBitmapDescriptor$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new ParkingNestRenderer$parkingUnavailableBitmapDescriptor$2(this));
        this.parkingUnavailableBitmapDescriptor$delegate = lazy2;
    }

    private final MarkerOptions createMarkerOptions(ParkingNest parkingNest) {
        C6378PT parkingBitmapDescriptor;
        MarkerOptions m50644u = new MarkerOptions().m50643u1(new LatLng(parkingNest.getLocation().getLatitude(), parkingNest.getLocation().getLongitude())).m50644u(0.5f, 1.0f);
        Integer availableParkingCapacity = parkingNest.getAvailableParkingCapacity();
        if (availableParkingCapacity != null && availableParkingCapacity.intValue() == 0) {
            parkingBitmapDescriptor = getParkingUnavailableBitmapDescriptor();
        } else {
            parkingBitmapDescriptor = getParkingBitmapDescriptor();
        }
        MarkerOptions m50651Y1 = m50644u.m50657N0(parkingBitmapDescriptor).m50651Y1(45.0f);
        Intrinsics.checkNotNullExpressionValue(m50651Y1, "MarkerOptions()\n    .pos…PARK_NEST_MARKER_Z_INDEX)");
        return m50651Y1;
    }

    private final PolygonOptions createPolygonOptions(ParkingNest parkingNest) {
        PolygonOptions m50631W0 = new PolygonOptions().m50626s(GoogleMap_Kt.toPoints(parkingNest.getShape())).m50634N0(0).m50639E(C40788fB0.m41776f(this.context, C32364Df4.birdESBlue20)).m50624v(false).m50631W0(0.0f);
        Intrinsics.checkNotNullExpressionValue(m50631W0, "PolygonOptions()\n    .ad…lse)\n    .strokeWidth(0f)");
        return m50631W0;
    }

    private final C40889fM2 getOrCreateMarker(ParkingNest parkingNest) {
        Map<String, C40889fM2> map = this.markers;
        String id = parkingNest.getId();
        C40889fM2 c40889fM2 = map.get(id);
        if (c40889fM2 == null) {
            c40889fM2 = this.map.m61685c(createMarkerOptions(parkingNest));
            Intrinsics.checkNotNull(c40889fM2);
            c40889fM2.m41518p(parkingNest);
            Intrinsics.checkNotNullExpressionValue(c40889fM2, "map.addMarker(createMark… {\n      tag = nest\n    }");
            map.put(id, c40889fM2);
        }
        return c40889fM2;
    }

    private final DX3 getOrCreatePolygon(ParkingNest parkingNest) {
        Map<String, DX3> map = this.polygons;
        String id = parkingNest.getId();
        DX3 dx3 = map.get(id);
        if (dx3 == null) {
            dx3 = this.map.m61684d(createPolygonOptions(parkingNest));
            Intrinsics.checkNotNullExpressionValue(dx3, "map.addPolygon(createPolygonOptions(nest))");
            map.put(id, dx3);
        }
        return dx3;
    }

    private final C6378PT getParkingBitmapDescriptor() {
        return (C6378PT) this.parkingBitmapDescriptor$delegate.getValue();
    }

    private final C6378PT getParkingUnavailableBitmapDescriptor() {
        return (C6378PT) this.parkingUnavailableBitmapDescriptor$delegate.getValue();
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapModelRenderer
    public void render(List<? extends ParkingNestRenderItem> items) {
        int collectionSizeOrDefault;
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(items, "items");
        List<? extends ParkingNestRenderItem> list = items;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (Object obj : list) {
            linkedHashMap.put(((ParkingNestRenderItem) obj).getParkingNest().getId(), obj);
        }
        for (ParkingNestRenderItem parkingNestRenderItem : list) {
            C40889fM2 orCreateMarker = getOrCreateMarker(parkingNestRenderItem.getParkingNest());
            orCreateMarker.m41516r(true);
            orCreateMarker.m41518p(parkingNestRenderItem.getParkingNest());
            if (this.showNestRadius) {
                DX3 orCreatePolygon = getOrCreatePolygon(parkingNestRenderItem.getParkingNest());
                orCreatePolygon.m110281e(parkingNestRenderItem.isRadiusVisible());
                orCreatePolygon.m110282d(parkingNestRenderItem);
            }
        }
        for (Map.Entry<String, C40889fM2> entry : this.markers.entrySet()) {
            C40889fM2 value = entry.getValue();
            if (!linkedHashMap.containsKey(entry.getKey())) {
                value.m41516r(false);
            }
        }
        if (this.showNestRadius) {
            for (Map.Entry<String, DX3> entry2 : this.polygons.entrySet()) {
                DX3 value2 = entry2.getValue();
                if (!linkedHashMap.containsKey(entry2.getKey())) {
                    value2.m110281e(false);
                }
            }
        }
    }
}
