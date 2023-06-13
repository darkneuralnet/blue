package co.bird.android.app.feature.map.p008ui;

import co.bird.android.model.persistence.ZonePolygonable;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH&¨\u0006\t"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/MapZonesUi;", "", "setZones", "", "zones", "", "Lco/bird/android/model/persistence/ZonePolygonable;", "zoneClicks", "Lio/reactivex/Observable;", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.MapZonesUi */
/* loaded from: classes2.dex */
public interface MapZonesUi {
    void setZones(List<ZonePolygonable> list);

    Observable<ZonePolygonable> zoneClicks();
}
