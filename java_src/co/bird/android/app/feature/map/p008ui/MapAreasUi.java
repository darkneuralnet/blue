package co.bird.android.app.feature.map.p008ui;

import co.bird.android.buava.Optional;
import co.bird.android.model.persistence.Area;
import com.google.android.gms.maps.model.LatLng;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&J\u001e\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH&J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0012H&J\"\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\fH&¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/MapAreasUi;", "", "hideInfoWindow", "", "selectedAreaMarker", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/persistence/Area;", "setAdditionalAreas", "key", "", "areas", "", "setAreas", "setAreasCompleteChanges", "showInfoWindowForArea", "area", "closestTo", "Lcom/google/android/gms/maps/model/LatLng;", "showInfoWindowForNonOperationalArea", "point", "updateAreasUi", "zoomLevel", "", "viewport", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.MapAreasUi */
/* loaded from: classes2.dex */
public interface MapAreasUi {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUi$DefaultImpls */
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static Observable<Unit> setAreasCompleteChanges(MapAreasUi mapAreasUi) {
            Observable<Unit> never = Observable.never();
            Intrinsics.checkNotNullExpressionValue(never, "never()");
            return never;
        }

        public static void showInfoWindowForArea(MapAreasUi mapAreasUi, Area area, LatLng latLng) {
            Intrinsics.checkNotNullParameter(area, "area");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void updateAreasUi$default(MapAreasUi mapAreasUi, float f, List list, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAreasUi");
            }
            if ((i & 2) != 0) {
                list = null;
            }
            mapAreasUi.updateAreasUi(f, list);
        }
    }

    void hideInfoWindow();

    Observable<Optional<Area>> selectedAreaMarker();

    void setAdditionalAreas(String str, List<Area> list);

    void setAreas(List<Area> list);

    Observable<Unit> setAreasCompleteChanges();

    void showInfoWindowForArea(Area area, LatLng latLng);

    void showInfoWindowForNonOperationalArea(LatLng latLng);

    void updateAreasUi(float f, List<LatLng> list);
}
