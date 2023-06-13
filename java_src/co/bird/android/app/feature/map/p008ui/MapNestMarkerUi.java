package co.bird.android.app.feature.map.p008ui;

import co.bird.android.model.persistence.NestMarker;
import co.bird.android.model.wire.WireNest;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f0\u000bH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/MapNestMarkerUi;", "", "claim", "", "nestMarker", "Lco/bird/android/model/persistence/NestMarker;", "claimProgress", "", "clearNestMarkers", "deselect", "nestMarkerClicks", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "select", "setNestArea", "nest", "Lco/bird/android/model/wire/WireNest;", "setNestMarkers", "nestMarkers", "", "unclaim", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.MapNestMarkerUi */
/* loaded from: classes2.dex */
public interface MapNestMarkerUi {
    void claim(NestMarker nestMarker, int i);

    void clearNestMarkers();

    void deselect(NestMarker nestMarker);

    Observable<Pair<NestMarker, Boolean>> nestMarkerClicks();

    void select(NestMarker nestMarker);

    void setNestArea(WireNest wireNest);

    void setNestMarkers(List<NestMarker> list);

    void unclaim(NestMarker nestMarker);
}
