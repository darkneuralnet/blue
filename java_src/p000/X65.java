package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.Reservation;
import co.bird.android.model.ReservationKt;
import co.bird.android.model.RideState;
import co.bird.android.model.RideStateKt;
import co.bird.android.model.RideStatusBottomSheetButton;
import co.bird.android.model.RideStatusEndButton;
import co.bird.android.model.RideStatusLockButton;
import co.bird.android.model.RideStatusManageRidesButton;
import co.bird.android.model.RideStatusScanAfterReserveButton;
import co.bird.android.model.RideStatusUnlockButton;
import co.bird.android.model.RideUpdateState;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.WireRide;
import com.stripe.android.core.networking.RequestHeadersFactory;
import io.reactivex.AbstractC23442F;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0010"}, m28432d2 = {"LX65;", "LtA;", "La75;", RequestHeadersFactory.MODEL, "Lio/reactivex/F;", "", "LH6;", "s", "v", "Lco/bird/android/model/RideStatusBottomSheetButton;", "u", "w", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideStatusBottomSheetConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStatusBottomSheetConverter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/RideStatusBottomSheetConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
/* renamed from: X65 */
/* loaded from: classes3.dex */
public final class X65 extends AbstractC28540tA {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: X65$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9304a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RideState.Status.values().length];
            try {
                iArr[RideState.Status.UNLOCKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RideState.Status.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RideState.Status.LOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RideState.Status.ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X65(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: t */
    public static final List m77374t(X65 this$0, C37772a75 model) {
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(model, "$model");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(this$0.m77372v(model));
        return listOfNotNull;
    }

    /* renamed from: s */
    public final AbstractC23442F<List<C3023H6>> m77375s(final C37772a75 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: W65
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m77374t;
                m77374t = X65.m77374t(X65.this, model);
                return m77374t;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      lis…tion(model)\n      )\n    }");
        return m33161E;
    }

    /* renamed from: u */
    public final RideStatusBottomSheetButton m77373u(C37772a75 c37772a75) {
        WireRide ride;
        RideStatusLockButton rideStatusLockButton;
        WireRide ride2;
        WireBird bird;
        String str = null;
        String str2 = null;
        r2 = null;
        r2 = null;
        BirdModel birdModel = null;
        str = null;
        boolean z = true;
        if (c37772a75.m71871f() != RideUpdateState.RIDE_REQUIREMENTS && c37772a75.m71871f() != RideUpdateState.STARTING) {
            if (c37772a75.m71871f() != RideUpdateState.ENDING && c37772a75.m71871f() != RideUpdateState.LOCKING) {
                if (c37772a75.m71873d() != null) {
                    if (c37772a75.m71874c().getRideConfig().getEnableScanlessReservedRideStart()) {
                        Reservation m71873d = c37772a75.m71873d();
                        if (m71873d != null) {
                            str2 = m71873d.getRideId();
                        }
                        String string = m12962m().getString(C45871nl4.ride_action_unlock);
                        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.string.ride_action_unlock)");
                        Integer remainingSeconds = ReservationKt.remainingSeconds(c37772a75.m71873d());
                        if (remainingSeconds != null && remainingSeconds.intValue() <= 0) {
                            z = false;
                        }
                        return new RideStatusUnlockButton(str2, string, false, z);
                    }
                    String string2 = m12962m().getString(C45871nl4.ride_action_ride_after_reservation);
                    Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…n_ride_after_reservation)");
                    Integer remainingSeconds2 = ReservationKt.remainingSeconds(c37772a75.m71873d());
                    if (remainingSeconds2 != null && remainingSeconds2.intValue() <= 0) {
                        z = false;
                    }
                    return new RideStatusScanAfterReserveButton(string2, false, z);
                }
                RideState m71870g = c37772a75.m71870g();
                if (m71870g != null && (ride2 = m71870g.getRide()) != null && (bird = ride2.getBird()) != null) {
                    birdModel = WireBirdKt.birdModel(bird);
                }
                if (birdModel == BirdModel.SCAN_ONLY) {
                    String id = c37772a75.m71870g().getRide().getId();
                    String string3 = m12962m().getString(C45871nl4.ride_action_lock);
                    Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.string.ride_action_lock)");
                    rideStatusLockButton = new RideStatusLockButton(id, string3, false, false);
                } else if (c37772a75.m71870g() != null) {
                    int i = C9304a.$EnumSwitchMapping$0[c37772a75.m71870g().getStatus().ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    String string4 = m12962m().getString(C45871nl4.ride_action_unlock);
                                    Intrinsics.checkNotNullExpressionValue(string4, "context.getString(L.string.ride_action_unlock)");
                                    return new RideStatusUnlockButton(null, string4, false, false, 4, null);
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            String id2 = c37772a75.m71870g().getRide().getId();
                            String string5 = m12962m().getString(C45871nl4.ride_action_unlock);
                            Intrinsics.checkNotNullExpressionValue(string5, "context.getString(L.string.ride_action_unlock)");
                            return new RideStatusUnlockButton(id2, string5, false, false, 12, null);
                        }
                        String id3 = c37772a75.m71870g().getRide().getId();
                        String string6 = m12962m().getString(C45871nl4.ride_action_unlock);
                        Intrinsics.checkNotNullExpressionValue(string6, "context.getString(L.string.ride_action_unlock)");
                        return new RideStatusUnlockButton(id3, string6, true, false);
                    }
                    String id4 = c37772a75.m71870g().getRide().getId();
                    String string7 = m12962m().getString(C45871nl4.ride_action_lock);
                    Intrinsics.checkNotNullExpressionValue(string7, "context.getString(L.string.ride_action_lock)");
                    rideStatusLockButton = new RideStatusLockButton(id4, string7, false, false, 12, null);
                } else {
                    String string8 = m12962m().getString(C45871nl4.ride_action_unlock);
                    Intrinsics.checkNotNullExpressionValue(string8, "context.getString(L.string.ride_action_unlock)");
                    return new RideStatusUnlockButton(null, string8, false, true, 4, null);
                }
                return rideStatusLockButton;
            }
            String string9 = m12962m().getString(C45871nl4.ride_action_unlock);
            Intrinsics.checkNotNullExpressionValue(string9, "context.getString(L.string.ride_action_unlock)");
            return new RideStatusUnlockButton(null, string9, true, false, 1, null);
        }
        RideState m71870g2 = c37772a75.m71870g();
        if (m71870g2 != null && (ride = m71870g2.getRide()) != null) {
            str = ride.getId();
        }
        String string10 = m12962m().getString(C45871nl4.ride_action_unlock);
        Intrinsics.checkNotNullExpressionValue(string10, "context.getString(L.string.ride_action_unlock)");
        return new RideStatusUnlockButton(str, string10, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3023H6 m77372v(C37772a75 c37772a75) {
        int i;
        int i2;
        WireRide ride;
        int durationSeconds;
        Reservation m71873d;
        RideState m71870g;
        boolean z;
        R46 r46;
        Integer estimatedRange;
        String str;
        List mutableListOf;
        if (WireBirdKt.isCruiserModel(c37772a75.m71875b())) {
            i = C48193rg4.ic_vehicle_moped;
        } else {
            i = C48193rg4.ic_scooter_flying;
        }
        int i3 = i;
        String code = c37772a75.m71875b().getCode();
        Reservation m71873d2 = c37772a75.m71873d();
        if (m71873d2 != null) {
            if (c37772a75.m71874c().getRideConfig().getEnableScanlessReservedRideStart()) {
                DateTime startedAt = m71873d2.getStartedAt();
                if (startedAt != null) {
                    durationSeconds = C46880pT0.m19254h(startedAt);
                }
                durationSeconds = 0;
            } else {
                DateTime expireAt = m71873d2.getExpireAt();
                if (expireAt != null) {
                    durationSeconds = Math.abs(C46880pT0.m19254h(expireAt));
                }
                durationSeconds = 0;
            }
            m71873d = c37772a75.m71873d();
            if (m71873d != null) {
                if (m71873d.getExpireAt() != null && !c37772a75.m71874c().getRideConfig().getEnableScanlessReservedRideStart()) {
                    r46 = R46.DECREASING;
                } else {
                    r46 = R46.INCREASING;
                }
            }
            m71870g = c37772a75.m71870g();
            if (m71870g == null && RideStateKt.isInRide(m71870g)) {
                z = true;
            } else {
                z = false;
            }
            if (z && c37772a75.m71871f() != RideUpdateState.STARTING) {
                r46 = R46.STOPPED;
            } else {
                r46 = R46.INCREASING;
            }
            R46 r462 = r46;
            if (c37772a75.m71875b().getEstimatedRange() != null) {
                str = C51916xx1.distance$default(C51916xx1.f118396a, m12962m(), estimatedRange.intValue(), 0.0d, true, 4, null);
            } else {
                str = null;
            }
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new C38365b75(i3, code, i2, r462, str, m77373u(c37772a75), m77371w(c37772a75), c37772a75.m71869h(), false, 256, null), C33570Ij4.item_ride_state_header, false, 4, null));
            return new C3023H6(mutableListOf, null, null, 6, null);
        }
        RideState m71870g2 = c37772a75.m71870g();
        if (m71870g2 != null && (ride = m71870g2.getRide()) != null) {
            durationSeconds = ride.durationSeconds();
        } else {
            i2 = 0;
            m71873d = c37772a75.m71873d();
            if (m71873d != null) {
            }
            m71870g = c37772a75.m71870g();
            if (m71870g == null) {
            }
            z = false;
            if (z) {
            }
            r46 = R46.INCREASING;
            R46 r4622 = r46;
            if (c37772a75.m71875b().getEstimatedRange() != null) {
            }
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new C38365b75(i3, code, i2, r4622, str, m77373u(c37772a75), m77371w(c37772a75), c37772a75.m71869h(), false, 256, null), C33570Ij4.item_ride_state_header, false, 4, null));
            return new C3023H6(mutableListOf, null, null, 6, null);
        }
        i2 = durationSeconds;
        m71873d = c37772a75.m71873d();
        if (m71873d != null) {
        }
        m71870g = c37772a75.m71870g();
        if (m71870g == null) {
        }
        z = false;
        if (z) {
        }
        r46 = R46.INCREASING;
        R46 r46222 = r46;
        if (c37772a75.m71875b().getEstimatedRange() != null) {
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new C38365b75(i3, code, i2, r46222, str, m77373u(c37772a75), m77371w(c37772a75), c37772a75.m71869h(), false, 256, null), C33570Ij4.item_ride_state_header, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: w */
    public final RideStatusBottomSheetButton m77371w(C37772a75 c37772a75) {
        RideStatusEndButton rideStatusEndButton;
        WireRide ride;
        if (RideStateKt.isInGroupRide(c37772a75.m71872e())) {
            String string = m12962m().getString(C45871nl4.ride_action_manage_rides);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…ride_action_manage_rides)");
            return new RideStatusManageRidesButton(string, false, false, 6, null);
        }
        RideState m71870g = c37772a75.m71870g();
        boolean z = false;
        if (m71870g != null && (ride = m71870g.getRide()) != null && ride.canEnd()) {
            z = true;
        }
        if (z) {
            String string2 = m12962m().getString(C45871nl4.ride_action_end_ride);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.string.ride_action_end_ride)");
            rideStatusEndButton = new RideStatusEndButton(string2, false, false, 6, null);
        } else {
            String string3 = m12962m().getString(C45871nl4.ride_action_end_ride);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.string.ride_action_end_ride)");
            rideStatusEndButton = new RideStatusEndButton(string3, false, false, 2, null);
        }
        return rideStatusEndButton;
    }
}
