package co.bird.android.app.feature.map.p008ui;

import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.model.Route;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.persistence.BirdMapMarker;
import com.google.android.gms.maps.model.LatLng;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H&J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0016\u0010\u0011\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H&J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H&¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/MapBirdMarkerUi;", "Lco/bird/android/app/feature/map/ui/MapUi;", "birdMarkerClicks", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/BirdMapMarker;", "", "birdMarkerInfoItemClicks", "clearBirdMarkers", "", "deselect", "birdMarker", "drawRouteAndZoom", "route", "Lco/bird/android/model/Route;", "removeBirdMarker", "select", "setBirdMarkers", "birdMarkers", "", "zoomToMaxLevel", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.MapBirdMarkerUi */
/* loaded from: classes2.dex */
public interface MapBirdMarkerUi extends MapUi {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapBirdMarkerUi$DefaultImpls */
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static Observable<Unit> setAreasCompleteChanges(MapBirdMarkerUi mapBirdMarkerUi) {
            return MapUi.DefaultImpls.setAreasCompleteChanges(mapBirdMarkerUi);
        }

        public static void showInfoWindowForArea(MapBirdMarkerUi mapBirdMarkerUi, Area area, LatLng latLng) {
            Intrinsics.checkNotNullParameter(area, "area");
            MapUi.DefaultImpls.showInfoWindowForArea(mapBirdMarkerUi, area, latLng);
        }
    }

    Observable<Pair<BirdMapMarker, Boolean>> birdMarkerClicks();

    Observable<BirdMapMarker> birdMarkerInfoItemClicks();

    void clearBirdMarkers();

    void deselect(BirdMapMarker birdMapMarker);

    void drawRouteAndZoom(Route route, BirdMapMarker birdMapMarker);

    void removeBirdMarker(BirdMapMarker birdMapMarker);

    void select(BirdMapMarker birdMapMarker);

    void setBirdMarkers(List<BirdMapMarker> list);

    void zoomToMaxLevel(BirdMapMarker birdMapMarker);
}
