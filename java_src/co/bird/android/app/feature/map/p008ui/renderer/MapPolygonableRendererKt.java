package co.bird.android.app.feature.map.p008ui.renderer;

import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.model.Point;
import co.bird.android.model.wire.configs.MobileMapConfigView;
import co.bird.android.model.wire.configs.OperationalZoneInversionConfig;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u0015\u0010\u000b\u001a\u00020\f*\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0082\u0002\u001a\u0015\u0010\u000b\u001a\u00020\f*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0082\u0002\u001a\u0014\u0010\u0010\u001a\u00020\f*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\"\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\" \u0010\u0006\u001a\u00020\u0003*\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"points", "", "Lcom/google/android/gms/maps/model/LatLng;", "Lcom/google/android/gms/maps/model/LatLngBounds;", "getPoints", "(Lcom/google/android/gms/maps/model/LatLngBounds;)Ljava/util/List;", "toLatLngBounds", "", "Lco/bird/android/model/Point;", "getToLatLngBounds", "([Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLngBounds;", "contains", "", "visibleRegion", "Lcom/google/android/gms/maps/model/VisibleRegion;", "point", "shouldInvert", "Lco/bird/android/model/wire/configs/MobileMapConfigView;", "zoomLevel", "", "co.bird.android.feature.map"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRendererKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,518:1\n1747#2,3:519\n13579#3,2:522\n1#4:524\n*S KotlinDebug\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRendererKt\n*L\n435#1:519,3\n453#1:522,2\n*E\n"})
/* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRendererKt */
/* loaded from: classes2.dex */
public final class MapPolygonableRendererKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean contains(VisibleRegion visibleRegion, Point point) {
        Intrinsics.checkNotNullParameter(visibleRegion, "<this>");
        return visibleRegion.f71509f.m50669u(GoogleMap_Kt.toLatLng(point));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<LatLng> getPoints(LatLngBounds latLngBounds) {
        List<LatLng> listOf;
        LatLng northeast = latLngBounds.f71433c;
        Intrinsics.checkNotNullExpressionValue(northeast, "northeast");
        LatLng southwest = latLngBounds.f71432b;
        Intrinsics.checkNotNullExpressionValue(southwest, "southwest");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new LatLng[]{northeast, new LatLng(latLngBounds.f71433c.f71430b, latLngBounds.f71432b.f71431c), southwest, new LatLng(latLngBounds.f71432b.f71430b, latLngBounds.f71433c.f71431c)});
        return listOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LatLngBounds getToLatLngBounds(Point[] pointArr) {
        double d = Double.MIN_VALUE;
        double d2 = Double.MAX_VALUE;
        double d3 = Double.MIN_VALUE;
        double d4 = Double.MAX_VALUE;
        for (Point point : pointArr) {
            double d5 = point.f66612y;
            if (d5 > d) {
                d = d5;
            }
            double d6 = point.f66611x;
            if (d6 < d2) {
                d2 = d6;
            }
            if (d5 < d4) {
                d4 = d5;
            }
            if (d6 > d3) {
                d3 = d6;
            }
        }
        return new LatLngBounds(new LatLng(d4, d2), new LatLng(d, d3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean shouldInvert(MobileMapConfigView mobileMapConfigView, float f) {
        boolean z;
        boolean z2;
        OperationalZoneInversionConfig operationalZoneInversion = mobileMapConfigView.getOperationalZoneInversion();
        if (operationalZoneInversion == null || !Intrinsics.areEqual(operationalZoneInversion.getEnabled(), Boolean.TRUE)) {
            return false;
        }
        Float zoomLevelThreshold = operationalZoneInversion.getZoomLevelThreshold();
        if (zoomLevelThreshold != null) {
            if (f >= zoomLevelThreshold.floatValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                z = true;
                if (z) {
                    return false;
                }
                return true;
            }
        }
        z = false;
        if (z) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean contains(LatLngBounds latLngBounds, VisibleRegion visibleRegion) {
        Intrinsics.checkNotNullParameter(latLngBounds, "<this>");
        LatLngBounds latLngBounds2 = visibleRegion.f71509f;
        Intrinsics.checkNotNullExpressionValue(latLngBounds2, "visibleRegion.latLngBounds");
        List<LatLng> points = getPoints(latLngBounds2);
        if ((points instanceof Collection) && points.isEmpty()) {
            return false;
        }
        for (LatLng latLng : points) {
            if (latLngBounds.m50669u(latLng)) {
                return true;
            }
        }
        return false;
    }
}
