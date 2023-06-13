package p000;

import co.bird.android.model.NearbyRide;
import co.bird.android.model.RideTrack;
import co.bird.android.model.wire.WireLocation;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&J\u0016\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u001e\u0010\u0015\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\u0014\u001a\u00020\u0007H&J\u0012\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0016H&J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u0016H&J\b\u0010\u001b\u001a\u00020\u0016H&J\b\u0010\u001d\u001a\u00020\u001cH&J\b\u0010\u001e\u001a\u00020\u0004H&J\u0012\u0010!\u001a\u00020\u00042\b\b\u0001\u0010 \u001a\u00020\u001fH&J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0016H&J\u0016\u0010&\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040$H&¨\u0006'"}, m28432d2 = {"LIw;", "LS74;", "LaM5;", "Lio/reactivex/Observable;", "", "W5", "u1", "LfM2;", "markerClicks", "If", "mapClicks", "Lco/bird/android/model/wire/WireLocation;", "location", "k8", "", "Lco/bird/android/model/NearbyRide;", "rides", "N1", "Lco/bird/android/model/RideTrack;", "tracks", "marker", "V5", "", "halfAlpha", "fg", "animate", "R6", "i8", "", "f4", "p7", "", "res", "cj", "show", "Ae", "Lkotlin/Function0;", "onPrimaryClick", "x6", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Iw */
/* loaded from: classes2.dex */
public interface InterfaceC3815Iw extends S74, InterfaceC37910aM5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Iw$a */
    /* loaded from: classes2.dex */
    public static final class C3816a {
        public static /* synthetic */ void resetRouteSelection$default(InterfaceC3815Iw interfaceC3815Iw, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetRouteSelection");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            interfaceC3815Iw.mo96125fg(z);
        }

        public static /* synthetic */ void zoomTo$default(InterfaceC3815Iw interfaceC3815Iw, WireLocation wireLocation, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: zoomTo");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            interfaceC3815Iw.mo96137R6(wireLocation, z);
        }
    }

    /* renamed from: Ae */
    void mo96142Ae(boolean z);

    /* renamed from: If */
    Observable<Unit> mo96141If();

    /* renamed from: N1 */
    void mo96140N1(List<NearbyRide> list);

    /* renamed from: R6 */
    void mo96137R6(WireLocation wireLocation, boolean z);

    /* renamed from: V5 */
    void mo96132V5(List<RideTrack> list, C40889fM2 c40889fM2);

    /* renamed from: W5 */
    Observable<Unit> mo96130W5();

    /* renamed from: cj */
    void mo96127cj(int i);

    /* renamed from: f4 */
    String mo96126f4();

    /* renamed from: fg */
    void mo96125fg(boolean z);

    /* renamed from: i8 */
    boolean mo96124i8();

    /* renamed from: k8 */
    void mo96123k8(WireLocation wireLocation);

    Observable<Unit> mapClicks();

    Observable<C40889fM2> markerClicks();

    /* renamed from: p7 */
    void mo96122p7();

    /* renamed from: u1 */
    Observable<Unit> mo96121u1();

    /* renamed from: x6 */
    void mo96120x6(Function0<Unit> function0);
}
