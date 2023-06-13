package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.CompleteRideResponse;
import co.bird.android.model.LastLockComplianceModel;
import co.bird.android.model.PhysicalLockEvent;
import co.bird.android.model.PhysicalLockEventKind;
import co.bird.android.model.RideStartTimeConstraint;
import co.bird.android.model.RideState;
import co.bird.android.model.RideStateEvent;
import co.bird.android.model.RideStates;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRideDetail;
import co.bird.android.model.wire.WireSafeStartValues;
import co.bird.android.model.wire.configs.Config;
import co.bird.api.response.CollectionResponse;
import co.bird.api.response.DetectHelmetSelfieResponse;
import co.bird.api.response.DisputeRideCreateResponse;
import co.bird.api.response.DisputeRideFinalizeResponse;
import co.bird.api.response.DownloadRideReceiptResponse;
import co.bird.api.response.RideSummary;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import no.nordicsemi.android.ble.AbstractC26684u0;
@Metadata(m28433d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH'J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00162\u0006\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H'¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H&J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H&J)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00162\u0006\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H'¢\u0006\u0004\b\u001d\u0010\u0018J\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00162\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0019H&J\u0014\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0 0\u0016H&J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016H&J\b\u0010#\u001a\u00020\u0004H&J\u0014\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0 0$H&J(\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u00162\b\b\u0002\u0010&\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020\u0014H&J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00162\u0006\u0010+\u001a\u00020\u0002H&J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\u0006\u0010\u000e\u001a\u00020\nH&J\u001e\u00101\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00100\u001a\u00020/H&J$\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000206050\t2\u0006\u00102\u001a\u00020\u00022\u0006\u00104\u001a\u000203H&J\u0014\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208050\tH&J\n\u0010:\u001a\u0004\u0018\u00010\u0002H&J \u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;050\t2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0002H&J$\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0001050\t2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0002H&J\b\u0010?\u001a\u00020\u0004H&J\u001e\u0010A\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u0002H&J\u0014\u0010C\u001a\u0004\u0018\u00010B2\b\u0010+\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010D\u001a\u0004\u0018\u00010B2\u0006\u0010\b\u001a\u00020\u0007H&J\u0012\u0010E\u001a\u0004\u0018\u00010B2\u0006\u00102\u001a\u00020\u0002H&J\u0018\u0010I\u001a\u00020H2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010G\u001a\u00020FH&J\u0018\u0010J\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00022\u0006\u0010G\u001a\u00020FH&J\u000e\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\tH&J*\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\t2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010N\u001a\u00020M2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010R\u001a\u00020H2\b\u0010Q\u001a\u0004\u0018\u00010\u0007H&J\u0016\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\t2\u0006\u0010\u000e\u001a\u00020\nH&J\u0016\u0010V\u001a\b\u0012\u0004\u0012\u00020U0\t2\u0006\u0010\u000e\u001a\u00020\nH&J\b\u0010W\u001a\u00020\u0004H&J\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0\t2\u0006\u0010+\u001a\u00020\u0002H&R \u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0[0Z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020_0Z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b`\u0010]R \u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0[0Z8&X¦\u0004¢\u0006\u0006\u001a\u0004\bb\u0010]R\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020d0Z8&X¦\u0004¢\u0006\u0006\u001a\u0004\be\u0010]R \u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020g0[0Z8&X¦\u0004¢\u0006\u0006\u001a\u0004\bh\u0010]R\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00190Z8&X¦\u0004¢\u0006\u0006\u001a\u0004\bj\u0010]R\u0014\u0010n\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020o0\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR0\u0010v\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020F0sj\u0002`t0[0Z8&X¦\u0004¢\u0006\u0006\u001a\u0004\bu\u0010]¨\u0006w"}, m28432d2 = {"LYR4;", "", "", "scanId", "", "v", "z", "Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireRide;", "startRideSingle", "V", "O", "ride", "LbF0;", "parkingNest", "Lco/bird/android/model/CompleteRideResponse;", "a0", "k1", "", "distance", "Lio/reactivex/Observable;", "w", "(Lco/bird/android/model/wire/WireRide;Ljava/lang/Integer;)Lio/reactivex/Observable;", "", "lock", "k0", "h1", "G", "locked", "T", "", "J", "t0", "Z", "Lio/reactivex/p;", "i", "offset", "limit", "Lco/bird/api/response/CollectionResponse;", "Lco/bird/api/response/RideSummary;", "P", "rideId", "Lco/bird/android/model/wire/WireRideDetail;", "g", "c", "", "jpeg", AbstractC26684u0.f100690q, "birdId", "Lco/bird/android/model/PhysicalLockEventKind;", "eventType", "LHM4;", "Lco/bird/android/model/PhysicalLockEvent;", "h0", "Lco/bird/android/model/LastLockComplianceModel;", "h", "n0", "LDG3;", "f", "notes", "j0", "f0", "imageUrl", "e0", "Lco/bird/android/model/RideState;", "i1", "g0", "q1", "Lco/bird/android/model/RideState$Status;", "requestedState", "Lio/reactivex/c;", "v0", "g1", "Lco/bird/android/model/wire/WireSafeStartValues;", DateTokenConverter.CONVERTER_KEY, "", "minConfidence", "Lco/bird/api/response/DetectHelmetSelfieResponse;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "wireBird", "x", "Lco/bird/api/response/DisputeRideCreateResponse;", "c0", "Lco/bird/api/response/DisputeRideFinalizeResponse;", "I", "y", "Lco/bird/api/response/DownloadRideReceiptResponse;", "e", "LZ84;", "Lco/bird/android/buava/Optional;", "R", "()LZ84;", "primaryRideState", "Lco/bird/android/model/RideStates;", "o0", "rideStates", "m0", "focusedRideState", "Lco/bird/android/model/wire/configs/Config;", "r", "rideConfig", "Lco/bird/android/model/RideStartTimeConstraint;", "F", "leaveBadAreaDeadline", "D", "badAreaRideExpired", "N", "()Z", "inAnyActiveRides", "Lco/bird/android/model/RideStateEvent;", "Q", "()Lio/reactivex/Observable;", "rideStateEvents", "Lkotlin/Pair;", "Lco/bird/android/coreinterface/manager/RideActionRequest;", "s0", "rideActionRequests", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: YR4 */
/* loaded from: classes2.dex */
public interface YR4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: YR4$a */
    /* loaded from: classes2.dex */
    public static final class C9775a {
        public static /* synthetic */ AbstractC23442F completeRide$default(YR4 yr4, WireRide wireRide, C38435bF0 c38435bF0, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    c38435bF0 = null;
                }
                return yr4.mo75035k1(wireRide, c38435bF0);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: completeRide");
        }

        public static /* synthetic */ AbstractC23442F completeRideInternal$default(YR4 yr4, WireRide wireRide, C38435bF0 c38435bF0, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    c38435bF0 = null;
                }
                return yr4.mo75053a0(wireRide, c38435bF0);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: completeRideInternal");
        }

        public static /* synthetic */ AbstractC23442F detectHelmetInSelfie$default(YR4 yr4, String str, float f, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = null;
                }
                return yr4.mo75067C(str, f, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: detectHelmetInSelfie");
        }

        public static /* synthetic */ AbstractC23442F getParkingPhotoInstructions$default(YR4 yr4, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                return yr4.mo75047f(str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getParkingPhotoInstructions");
        }

        public static /* synthetic */ Observable getRideSummary$default(YR4 yr4, int i, int i2, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 1) != 0) {
                    i = 0;
                }
                if ((i3 & 2) != 0) {
                    i2 = 100;
                }
                return yr4.mo75059P(i, i2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRideSummary");
        }

        public static /* synthetic */ Observable lockRide$default(YR4 yr4, WireRide wireRide, Integer num, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    num = null;
                }
                return yr4.mo75024w(wireRide, num);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lockRide");
        }

        public static /* synthetic */ Observable unlockRide$default(YR4 yr4, WireRide wireRide, Integer num, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    num = null;
                }
                return yr4.mo75064G(wireRide, num);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlockRide");
        }
    }

    /* renamed from: C */
    AbstractC23442F<DetectHelmetSelfieResponse> mo75067C(String str, float f, String str2);

    /* renamed from: D */
    Z84<Boolean> mo75066D();

    /* renamed from: F */
    Z84<Optional<RideStartTimeConstraint>> mo75065F();

    @Deprecated(message = "Use lockRide(Ride, Boolean) instead.")
    /* renamed from: G */
    Observable<WireBird> mo75064G(WireRide wireRide, Integer num);

    /* renamed from: I */
    AbstractC23442F<DisputeRideFinalizeResponse> mo75063I(WireRide wireRide);

    /* renamed from: J */
    Observable<List<WireRide>> mo75062J();

    /* renamed from: N */
    boolean mo75061N();

    /* renamed from: O */
    void mo75060O(WireBird wireBird);

    /* renamed from: P */
    Observable<CollectionResponse<RideSummary>> mo75059P(int i, int i2);

    /* renamed from: Q */
    Observable<RideStateEvent> mo75058Q();

    /* renamed from: R */
    Z84<Optional<RideState>> mo75057R();

    /* renamed from: T */
    Observable<WireBird> mo75056T(WireRide wireRide, boolean z);

    /* renamed from: V */
    AbstractC23442F<WireRide> mo75055V(WireBird wireBird, AbstractC23442F<WireRide> abstractC23442F);

    /* renamed from: Z */
    void mo75054Z();

    @Deprecated(message = "Use completeRide() instead.")
    /* renamed from: a0 */
    AbstractC23442F<CompleteRideResponse> mo75053a0(WireRide wireRide, C38435bF0 c38435bF0);

    /* renamed from: c */
    Observable<WireRide> mo75052c(WireRide wireRide);

    /* renamed from: c0 */
    AbstractC23442F<DisputeRideCreateResponse> mo75051c0(WireRide wireRide);

    /* renamed from: d */
    AbstractC23442F<WireSafeStartValues> mo75050d();

    /* renamed from: e */
    AbstractC23442F<DownloadRideReceiptResponse> mo75049e(String str);

    /* renamed from: e0 */
    AbstractC23442F<WireRide> mo75048e0(String str, String str2);

    /* renamed from: f */
    AbstractC23442F<HM4<DG3>> mo75047f(String str);

    /* renamed from: f0 */
    void mo75046f0();

    /* renamed from: g */
    Observable<WireRideDetail> mo75045g(String str);

    /* renamed from: g0 */
    RideState mo75044g0(WireBird wireBird);

    /* renamed from: g1 */
    void mo75043g1(String str, RideState.Status status);

    /* renamed from: h */
    AbstractC23442F<HM4<LastLockComplianceModel>> mo75042h();

    /* renamed from: h0 */
    AbstractC23442F<HM4<PhysicalLockEvent>> mo75041h0(String str, PhysicalLockEventKind physicalLockEventKind);

    /* renamed from: h1 */
    Observable<WireRide> mo75040h1();

    /* renamed from: i */
    AbstractC24507p<List<WireRide>> mo75039i();

    /* renamed from: i1 */
    RideState mo75038i1(String str);

    /* renamed from: j0 */
    AbstractC23442F<HM4<Object>> mo75037j0(String str, String str2);

    /* renamed from: k0 */
    AbstractC23442F<WireBird> mo75036k0(WireRide wireRide, boolean z);

    /* renamed from: k1 */
    AbstractC23442F<CompleteRideResponse> mo75035k1(WireRide wireRide, C38435bF0 c38435bF0);

    /* renamed from: m0 */
    Z84<Optional<RideState>> mo75034m0();

    /* renamed from: n0 */
    String mo75033n0();

    /* renamed from: o0 */
    Z84<RideStates> mo75032o0();

    /* renamed from: q1 */
    RideState mo75031q1(String str);

    /* renamed from: r */
    Z84<Config> mo75030r();

    /* renamed from: s0 */
    Z84<Optional<Pair<String, RideState.Status>>> mo75029s0();

    /* renamed from: t0 */
    Observable<Integer> mo75028t0();

    /* renamed from: u0 */
    AbstractC23442F<WireRide> mo75027u0(WireRide wireRide, byte[] bArr);

    /* renamed from: v */
    void mo75026v(String str);

    /* renamed from: v0 */
    AbstractC23461c mo75025v0(String str, RideState.Status status);

    @Deprecated(message = "Use lockRide(Ride, Boolean) instead.")
    /* renamed from: w */
    Observable<WireBird> mo75024w(WireRide wireRide, Integer num);

    /* renamed from: x */
    AbstractC23461c mo75023x(WireBird wireBird);

    /* renamed from: y */
    void mo75022y();

    /* renamed from: z */
    String mo75021z();
}
