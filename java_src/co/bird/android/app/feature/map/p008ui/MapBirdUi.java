package co.bird.android.app.feature.map.p008ui;

import android.location.Location;
import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.model.Route;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.wire.WireBird;
import com.google.android.gms.maps.model.LatLng;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t0\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H&J&\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\nH&J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H&¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/MapBirdUi;", "Lco/bird/android/app/feature/map/ui/MapUi;", "addBird", "", "bird", "Lco/bird/android/model/wire/WireBird;", "birdInfoItemClicks", "Lio/reactivex/Observable;", "birdItemClicks", "Lkotlin/Pair;", "", "deselect", "drawRouteAndZoom", "route", "Lco/bird/android/model/Route;", "removeBird", "select", "setBirds", "birds", "", "zoomTo", "userLocation", "Landroid/location/Location;", "useLargeZoomPadding", "zoomLevel", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.MapBirdUi */
/* loaded from: classes2.dex */
public interface MapBirdUi extends MapUi {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapBirdUi$DefaultImpls */
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static Observable<Unit> setAreasCompleteChanges(MapBirdUi mapBirdUi) {
            return MapUi.DefaultImpls.setAreasCompleteChanges(mapBirdUi);
        }

        public static void showInfoWindowForArea(MapBirdUi mapBirdUi, Area area, LatLng latLng) {
            Intrinsics.checkNotNullParameter(area, "area");
            MapUi.DefaultImpls.showInfoWindowForArea(mapBirdUi, area, latLng);
        }

        public static /* synthetic */ void zoomTo$default(MapBirdUi mapBirdUi, WireBird wireBird, Location location, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: zoomTo");
            }
            if ((i & 2) != 0) {
                location = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            mapBirdUi.zoomTo(wireBird, location, z);
        }
    }

    void addBird(WireBird wireBird);

    Observable<WireBird> birdInfoItemClicks();

    Observable<Pair<WireBird, Boolean>> birdItemClicks();

    void deselect(WireBird wireBird);

    void drawRouteAndZoom(Route route, WireBird wireBird);

    void removeBird(WireBird wireBird);

    void select(WireBird wireBird);

    void setBirds(List<WireBird> list);

    void zoomTo(WireBird wireBird, float f);

    void zoomTo(WireBird wireBird, Location location, boolean z);
}
