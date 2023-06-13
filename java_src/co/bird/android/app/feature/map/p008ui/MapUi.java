package co.bird.android.app.feature.map.p008ui;

import android.location.Location;
import co.bird.android.app.feature.map.p008ui.MapAreasUi;
import co.bird.android.buava.Optional;
import co.bird.android.model.Point;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireMerchantSite;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import io.reactivex.AbstractC24490k;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J#\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\u0011\u001a\u00020\u0005H&J\b\u0010\u0012\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\tH&J\b\u0010\u0018\u001a\u00020\u0017H&J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019H&J\u0010\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019H&J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H&J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0019H&J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0019H&J \u0010\"\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\r\u0012\u0004\u0012\u00020\t0!0 H&J\u0016\u0010%\u001a\u00020\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\rH&J(\u0010*\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0013H&J\b\u0010+\u001a\u00020\u0005H&J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0019H&J\u0010\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019H&J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020,0\u00192\u0006\u0010\b\u001a\u00020,H&J\b\u00100\u001a\u00020\u0005H&J\b\u00101\u001a\u00020\u0005H&J\u000e\u00103\u001a\b\u0012\u0004\u0012\u0002020\rH&J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\u001d0\rH&J\b\u00106\u001a\u000205H&J\u0010\u00109\u001a\u0002082\u0006\u00107\u001a\u00020\u001dH&R\u0014\u0010<\u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R \u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0A0@8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR,\u0010F\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\r\u0012\u0004\u0012\u00020\t0!0@8&X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010C¨\u0006G"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/MapUi;", "Lco/bird/android/app/feature/map/ui/MapAreasUi;", "Lco/bird/android/app/feature/map/ui/MapZonesUi;", "Lcom/google/android/gms/maps/model/CameraPosition;", "cameraPosition", "", "moveTo", "Landroid/location/Location;", "location", "", "zoomLevel", "zoomTo", "(Landroid/location/Location;Ljava/lang/Float;)V", "", "Lco/bird/android/model/Point;", "points", "updateMyLocation", "clearBirds", "removeRoute", "", "nearbyRadius", "direction", "updateLocationRotate", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "reactiveMapEvent", "Lio/reactivex/Observable;", "cameraPositionUpdates", "myLocationClicks", "mapClicks", "Lcom/google/android/gms/maps/model/LatLng;", "mapClicksLocation", "centerLocationChanged", "Lio/reactivex/k;", "Lkotlin/Pair;", "viewportChanged", "Lco/bird/android/model/wire/WireMerchantSite;", "sites", "setMerchantSites", "startLatitude", "startLongitude", "endLatitude", "endLongitude", "setDestination", "clearDestination", "Lco/bird/android/model/wire/WireLocation;", "mapLongClicks", "myLocationLongClicks", "showTeleportMarker", "removeTeleportMarker", "onDestroy", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "latLngViewport", "Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBounds", "latlng", "", "viewportContains", "getCenterLocation", "()Lcom/google/android/gms/maps/model/LatLng;", "centerLocation", "getDestinationFlagClicks", "()Lio/reactivex/Observable;", "destinationFlagClicks", "LZ84;", "Lco/bird/android/buava/Optional;", "getZoomLevelObservable", "()LZ84;", "zoomLevelObservable", "getViewportChangesObservable", "viewportChangesObservable", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.MapUi */
/* loaded from: classes2.dex */
public interface MapUi extends MapAreasUi, MapZonesUi {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapUi$DefaultImpls */
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static Observable<Unit> setAreasCompleteChanges(MapUi mapUi) {
            return MapAreasUi.DefaultImpls.setAreasCompleteChanges(mapUi);
        }

        public static void showInfoWindowForArea(MapUi mapUi, Area area, LatLng latLng) {
            Intrinsics.checkNotNullParameter(area, "area");
            MapAreasUi.DefaultImpls.showInfoWindowForArea(mapUi, area, latLng);
        }

        public static /* synthetic */ void zoomTo$default(MapUi mapUi, Location location, Float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: zoomTo");
            }
            if ((i & 2) != 0) {
                f = null;
            }
            mapUi.zoomTo(location, f);
        }
    }

    Observable<CameraPosition> cameraPositionUpdates();

    Observable<LatLng> centerLocationChanged();

    void clearBirds();

    void clearDestination();

    LatLng getCenterLocation();

    Observable<Unit> getDestinationFlagClicks();

    Z84<Pair<List<LatLng>, Float>> getViewportChangesObservable();

    Z84<Optional<Float>> getZoomLevelObservable();

    LatLngBounds latLngBounds();

    List<LatLng> latLngViewport();

    Observable<Unit> mapClicks();

    Observable<LatLng> mapClicksLocation();

    Observable<WireLocation> mapLongClicks();

    void moveTo(Location location);

    void moveTo(CameraPosition cameraPosition);

    Observable<Unit> myLocationClicks();

    Observable<Unit> myLocationLongClicks();

    double nearbyRadius();

    void onDestroy();

    ReactiveMapEvent reactiveMapEvent();

    void removeRoute();

    void removeTeleportMarker();

    void setDestination(double d, double d2, double d3, double d4);

    void setMerchantSites(List<WireMerchantSite> list);

    Observable<WireLocation> showTeleportMarker(WireLocation wireLocation);

    void updateLocationRotate(float f);

    void updateMyLocation(Location location);

    List<Geolocation> viewport();

    AbstractC24490k<Pair<List<LatLng>, Float>> viewportChanged();

    boolean viewportContains(LatLng latLng);

    void zoomTo(Location location, Float f);

    void zoomTo(List<? extends Point> list);
}
