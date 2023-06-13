package p000;

import android.location.Location;
import co.bird.android.model.BirdLocation;
import co.bird.android.model.Point;
import co.bird.android.model.Route;
import co.bird.android.model.Vehicle;
import co.bird.android.model.wire.WireLocation;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH&J\u0016\u0010\u0010\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH&J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H&J\b\u0010\u001b\u001a\u00020\u0005H&J\u0016\u0010\u001e\u001a\u00020\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\rH&J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH&J\u0018\u0010#\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0012H&J\u0018\u0010$\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0012H&J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%H&J\u001a\u0010*\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00122\b\b\u0002\u0010)\u001a\u00020\u0012H&J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%H&J\u0010\u0010.\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,H&J\u0010\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020,H&J(\u00105\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u0012H&J\u0010\u00106\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0012H&J\u0010\u00107\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,H&J\u0010\u00109\u001a\u00020\u00052\u0006\u00108\u001a\u00020%H&J\u0010\u0010<\u001a\u00020\u00052\u0006\u0010;\u001a\u00020:H&J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH&J\u0010\u0010>\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0012H&J\b\u0010?\u001a\u00020\u0005H&J\u0010\u0010A\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u000eH&¨\u0006B"}, m28432d2 = {"Lxu3;", "LaM5;", "LH31;", "LS74;", "", "", "lb", "Landroid/location/Location;", "location", "moveTo", "updateMyLocation", "Lio/reactivex/Observable;", "mapClicks", "", "Lco/bird/android/model/BirdLocation;", "possibleLocations", "Sk", "Lco/bird/android/model/wire/WireLocation;", "", "showAnnotationBubble", "A2", "LfM2;", "og", "dl", "Lco/bird/android/model/Route;", "route", "uj", "removeRoute", "Lco/bird/android/model/Point;", "points", "zoomTo", "q3", "myLocationClicks", "marker", "originalLocation", "qa", "ba", "", "resId", "setTitle", "show", "showConnectionStatus", "f8", "hl", "", "birdCode", "Ie", "tool", "ci", "showBirdCode", "showBattery", "showLastSignal", "showSignalStrengthPercentage", "te", "He", "Jh", "batteryLevel", "F7", "Lco/bird/android/model/Vehicle;", "vehicle", "ca", "kb", "yc", "D4", "birdLocation", "Jf", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xu3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC51888xu3 extends InterfaceC37910aM5, H31, S74 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xu3$a */
    /* loaded from: classes2.dex */
    public static final class C30338a {
        public static /* synthetic */ void showInfoBanner$default(InterfaceC51888xu3 interfaceC51888xu3, boolean z, boolean z2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showInfoBanner");
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            interfaceC51888xu3.mo4487f8(z, z2);
        }
    }

    /* renamed from: A2 */
    void mo4499A2(WireLocation wireLocation, boolean z);

    /* renamed from: D4 */
    void mo4498D4();

    /* renamed from: F7 */
    void mo4497F7(int i);

    /* renamed from: He */
    void mo4496He(boolean z);

    /* renamed from: Ie */
    void mo4495Ie(String str);

    /* renamed from: Jf */
    void mo4494Jf(BirdLocation birdLocation);

    /* renamed from: Jh */
    void mo4493Jh(String str);

    /* renamed from: Sk */
    void mo4492Sk(List<BirdLocation> list);

    /* renamed from: ba */
    void mo4491ba(C40889fM2 c40889fM2, boolean z);

    /* renamed from: ca */
    void mo4490ca(Vehicle vehicle);

    /* renamed from: ci */
    void mo4489ci(String str);

    /* renamed from: dl */
    Observable<C40889fM2> mo4488dl();

    /* renamed from: f8 */
    void mo4487f8(boolean z, boolean z2);

    /* renamed from: hl */
    void mo4486hl(int i);

    /* renamed from: kb */
    Observable<Unit> mo4485kb();

    /* renamed from: lb */
    void mo4484lb();

    Observable<Unit> mapClicks();

    void moveTo(Location location);

    Observable<Unit> myLocationClicks();

    /* renamed from: og */
    Observable<C40889fM2> mo4483og();

    /* renamed from: q3 */
    void mo4482q3(Location location);

    /* renamed from: qa */
    void mo4481qa(C40889fM2 c40889fM2, boolean z);

    void removeRoute();

    void setTitle(int i);

    /* renamed from: te */
    void mo4480te(boolean z, boolean z2, boolean z3, boolean z4);

    /* renamed from: uj */
    void mo4479uj(Route route);

    void updateMyLocation(Location location);

    /* renamed from: yc */
    void mo4478yc(boolean z);

    void zoomTo(List<? extends Point> list);
}
