package p000;

import android.location.Location;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterItemState;
import co.bird.android.app.feature.map.modelmanager.Filter;
import co.bird.android.app.feature.map.p008ui.MapBirdUi;
import co.bird.android.app.feature.map.p008ui.MapParkingUi;
import co.bird.android.model.wire.WireBird;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J@\u0010\u0013\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH&J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004H&J\u001c\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&J\u0016\u0010\u001b\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019H&J\u0016\u0010\u001c\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019H&J\b\u0010\u001d\u001a\u00020\nH&J\u001c\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H&¨\u0006 "}, m28432d2 = {"LG95;", "Lco/bird/android/app/feature/map/ui/MapBirdUi;", "Lco/bird/android/app/feature/map/ui/MapParkingUi;", "", "Lco/bird/android/model/wire/WireBird;", "allBirds", "ei", "Landroid/location/Location;", "location", "birds", "", "Xg", "focusedBird", "", "rideStarted", "", "", "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;", "markerStates", "C4", "bird", "Ea", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "wg", "Lco/bird/android/app/feature/map/modelmanager/Filter;", "filter", "w1", "z0", "showInfoWindow", "mapMarkerState", "x3", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: G95 */
/* loaded from: classes2.dex */
public interface G95 extends MapBirdUi, MapParkingUi {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: G95$a */
    /* loaded from: classes2.dex */
    public static final class C2676a {
        public static /* synthetic */ void setMapMarkerState$default(G95 g95, BirdClusterItemState birdClusterItemState, WireBird wireBird, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMapMarkerState");
            }
            if ((i & 2) != 0) {
                wireBird = null;
            }
            g95.mo104254x3(birdClusterItemState, wireBird);
        }

        public static /* synthetic */ void setRidingBirds$default(G95 g95, List list, WireBird wireBird, boolean z, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRidingBirds");
            }
            if ((i & 2) != 0) {
                wireBird = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            g95.mo104261C4(list, wireBird, z, map);
        }

        public static /* synthetic */ void updateLocation$default(G95 g95, WireBird wireBird, LatLng latLng, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLocation");
            }
            if ((i & 2) != 0) {
                latLng = null;
            }
            g95.mo104255wg(wireBird, latLng);
        }
    }

    /* renamed from: C4 */
    void mo104261C4(List<WireBird> list, WireBird wireBird, boolean z, Map<String, ? extends BirdClusterItemState> map);

    /* renamed from: Ea */
    void mo104260Ea(WireBird wireBird);

    /* renamed from: Xg */
    void mo104259Xg(Location location, List<WireBird> list);

    /* renamed from: ei */
    List<WireBird> mo104257ei(List<WireBird> list);

    void showInfoWindow();

    /* renamed from: w1 */
    void mo104256w1(Filter<WireBird> filter);

    /* renamed from: wg */
    void mo104255wg(WireBird wireBird, LatLng latLng);

    /* renamed from: x3 */
    void mo104254x3(BirdClusterItemState birdClusterItemState, WireBird wireBird);

    /* renamed from: z0 */
    void mo104253z0(Filter<WireBird> filter);
}
