package co.bird.android.app.feature.map.p008ui;

import co.bird.android.app.feature.map.modelmanager.Filter;
import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.persistence.Area;
import com.google.android.gms.maps.model.LatLng;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH&J\u0016\u0010\u0012\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H&J\u0016\u0010\u0013\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H&¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/MapParkingUi;", "Lco/bird/android/app/feature/map/ui/MapUi;", "Lio/reactivex/Observable;", "LfM2;", "parkingMarkerClicks", "", "Lco/bird/android/model/ParkingNest;", "nests", "", "addParkingNests", "marker", "resetParkingMarker", "selectParkingMarker", "", "show", "showParkingMarkers", "Lco/bird/android/app/feature/map/modelmanager/Filter;", "filter", "addParkingFilter", "removeParkingFilter", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.MapParkingUi */
/* loaded from: classes2.dex */
public interface MapParkingUi extends MapUi {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapParkingUi$DefaultImpls */
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static Observable<Unit> setAreasCompleteChanges(MapParkingUi mapParkingUi) {
            return MapUi.DefaultImpls.setAreasCompleteChanges(mapParkingUi);
        }

        public static void showInfoWindowForArea(MapParkingUi mapParkingUi, Area area, LatLng latLng) {
            Intrinsics.checkNotNullParameter(area, "area");
            MapUi.DefaultImpls.showInfoWindowForArea(mapParkingUi, area, latLng);
        }
    }

    void addParkingFilter(Filter<ParkingNest> filter);

    void addParkingNests(List<ParkingNest> list);

    Observable<C40889fM2> parkingMarkerClicks();

    void removeParkingFilter(Filter<ParkingNest> filter);

    void resetParkingMarker(C40889fM2 c40889fM2);

    void selectParkingMarker(C40889fM2 c40889fM2);

    void showParkingMarkers(boolean z);
}
