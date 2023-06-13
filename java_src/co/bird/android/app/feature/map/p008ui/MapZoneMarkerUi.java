package co.bird.android.app.feature.map.p008ui;

import co.bird.android.model.persistence.ZoneMarker;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH&J\u001a\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r0\fH&¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/MapZoneMarkerUi;", "", "clearZoneMarkers", "", "deselect", "zoneMarker", "Lco/bird/android/model/persistence/ZoneMarker;", "select", "setZoneMarkers", "zoneMarkers", "", "zoneMarkerClicks", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.MapZoneMarkerUi */
/* loaded from: classes2.dex */
public interface MapZoneMarkerUi {
    void clearZoneMarkers();

    void deselect(ZoneMarker zoneMarker);

    void select(ZoneMarker zoneMarker);

    void setZoneMarkers(List<ZoneMarker> list);

    Observable<Pair<ZoneMarker, Boolean>> zoneMarkerClicks();
}
