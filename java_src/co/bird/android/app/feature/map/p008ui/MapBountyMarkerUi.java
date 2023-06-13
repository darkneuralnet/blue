package co.bird.android.app.feature.map.p008ui;

import co.bird.android.model.persistence.BountyMapMarker;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H&J\u0016\u0010\f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH&¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/MapBountyMarkerUi;", "", "bountyMarkerClicks", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/BountyMapMarker;", "", "clearBountyMarkers", "", "deselect", "bountyMarker", "select", "setBountyMarkers", "bountyMarkers", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.MapBountyMarkerUi */
/* loaded from: classes2.dex */
public interface MapBountyMarkerUi {
    Observable<Pair<BountyMapMarker, Boolean>> bountyMarkerClicks();

    void clearBountyMarkers();

    void deselect(BountyMapMarker bountyMapMarker);

    void select(BountyMapMarker bountyMapMarker);

    void setBountyMarkers(List<BountyMapMarker> list);
}
