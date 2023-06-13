package p000;

import co.bird.android.model.persistence.ZoneFlightSheetDetails;
import co.bird.android.model.persistence.ZoneMarker;
import co.bird.android.model.persistence.ZoneOverlayAnalytics;
import co.bird.android.model.persistence.ZonePolygonable;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00020\u0007H&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00020\u0007H&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u0014"}, m28432d2 = {"LQI6;", "", "", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "Lio/reactivex/c;", "h0", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/ZonePolygonable;", "I", "Lco/bird/android/model/persistence/ZoneMarker;", "i", "", "zoneId", "Lio/reactivex/F;", "Lco/bird/android/model/persistence/ZoneOverlayAnalytics;", "f0", "i0", "Lco/bird/android/model/persistence/ZoneFlightSheetDetails;", "g0", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: QI6 */
/* loaded from: classes2.dex */
public interface QI6 {
    /* renamed from: I */
    Observable<List<ZonePolygonable>> mo83908I();

    /* renamed from: f0 */
    AbstractC23442F<ZoneOverlayAnalytics> mo83903f0(String str);

    /* renamed from: g0 */
    Observable<ZoneFlightSheetDetails> mo83902g0(String str);

    /* renamed from: h0 */
    AbstractC23461c mo83901h0(List<Geolocation> list);

    /* renamed from: i */
    Observable<List<ZoneMarker>> mo83900i();

    /* renamed from: i0 */
    AbstractC23461c mo83899i0(String str);
}
