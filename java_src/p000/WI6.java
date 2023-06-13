package p000;

import co.bird.android.model.persistence.ZoneFlightSheetDetails;
import co.bird.android.model.persistence.ZoneMarker;
import co.bird.android.model.persistence.ZoneOverlayAnalytics;
import co.bird.android.model.persistence.ZonePolygonable;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38466bI4;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00020\tH&J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00020\tH&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\t2\u0006\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0016"}, m28432d2 = {"LWI6;", "LbI4;", "", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "filters", "Lio/reactivex/c;", "Y0", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/ZonePolygonable;", "I", "Lco/bird/android/model/persistence/ZoneMarker;", "i", "", "zoneId", "Lio/reactivex/F;", "Lco/bird/android/model/persistence/ZoneOverlayAnalytics;", "f0", "S0", "Lco/bird/android/model/persistence/ZoneFlightSheetDetails;", "k1", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: WI6 */
/* loaded from: classes2.dex */
public interface WI6 extends InterfaceC38466bI4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WI6$a */
    /* loaded from: classes2.dex */
    public static final class C8980a {
        /* renamed from: a */
        public static AbstractC23461c m78599a(WI6 wi6, AbstractC23461c receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64706f(wi6, receiver);
        }
    }

    /* renamed from: I */
    Observable<List<ZonePolygonable>> mo39643I();

    /* renamed from: S0 */
    AbstractC23461c mo39633S0(String str);

    /* renamed from: Y0 */
    AbstractC23461c mo39626Y0(List<Geolocation> list, OperatorMapFilterBundle operatorMapFilterBundle);

    /* renamed from: f0 */
    AbstractC23442F<ZoneOverlayAnalytics> mo39624f0(String str);

    /* renamed from: i */
    Observable<List<ZoneMarker>> mo39623i();

    /* renamed from: k1 */
    Observable<ZoneFlightSheetDetails> mo39622k1(String str);
}
