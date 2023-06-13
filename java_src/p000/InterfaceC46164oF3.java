package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.ParkingLocationSource;
import co.bird.android.model.wire.WireRide;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\"\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&JF\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H&J&\u0010\u001c\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005H&R\u001c\u0010!\u001a\u00020\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010'\u001a\u0004\u0018\u00010\"8&@&X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R&\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030)0(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R \u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020201008&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, m28432d2 = {"LoF3;", "", "Lio/reactivex/Observable;", "LFH3;", "i", "", "rideId", "Landroid/location/Location;", "location", "Lco/bird/android/model/ParkingLocationSource;", "parkingLocationSource", "c", "LFU4;", "rideParkingDelegate", "Lf13;", "navigatorDelegate", "Lco/bird/android/model/wire/WireRide;", "ride", "", "shouldEndRide", "skipEndRideTutorialStep", "skipThirdPartyLocationDetermination", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "", "e", "lastVisitedStep", "reason", "b", "j", "()LFH3;", "setCurrentParkingStatus", "(LFH3;)V", "currentParkingStatus", "LbF0;", "g", "()LbF0;", "setCurrentParkingNest", "(LbF0;)V", "currentParkingNest", "LZ84;", "", "f", "()LZ84;", "parkingStatusByRideId", C17296a.f69688o, "()Ljava/util/Map;", "parkingStatusByBirdId", "Lkotlin/collections/ArrayDeque;", "Lco/bird/android/buava/Optional;", "LA5;", DateTokenConverter.CONVERTER_KEY, "()Lkotlin/collections/ArrayDeque;", "activityResultStack", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oF3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC46164oF3 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oF3$a */
    /* loaded from: classes2.dex */
    public static final class C26875a {
        public static /* synthetic */ void trackRideAttemptStopped$default(InterfaceC46164oF3 interfaceC46164oF3, WireRide wireRide, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackRideAttemptStopped");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            interfaceC46164oF3.mo21507b(wireRide, str, str2);
        }

        public static /* synthetic */ void tryToPark$default(InterfaceC46164oF3 interfaceC46164oF3, FU4 fu4, InterfaceC40692f13 interfaceC40692f13, WireRide wireRide, boolean z, boolean z2, boolean z3, ScopeProvider scopeProvider, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryToPark");
            }
            interfaceC46164oF3.mo21504e(fu4, interfaceC40692f13, wireRide, z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, scopeProvider);
        }
    }

    /* renamed from: a */
    Map<String, FH3> mo21508a();

    /* renamed from: b */
    void mo21507b(WireRide wireRide, String str, String str2);

    /* renamed from: c */
    FH3 mo21506c(String str, Location location, ParkingLocationSource parkingLocationSource);

    /* renamed from: d */
    ArrayDeque<Optional<InterfaceC0014A5>> mo21505d();

    /* renamed from: e */
    void mo21504e(FU4 fu4, InterfaceC40692f13 interfaceC40692f13, WireRide wireRide, boolean z, boolean z2, boolean z3, ScopeProvider scopeProvider);

    /* renamed from: f */
    Z84<Map<String, FH3>> mo21503f();

    /* renamed from: g */
    C38435bF0 mo21502g();

    /* renamed from: i */
    Observable<FH3> mo21501i();

    /* renamed from: j */
    FH3 mo21500j();
}
