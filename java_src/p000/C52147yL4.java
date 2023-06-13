package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.FlightBannerNode;
import co.bird.android.model.Model_Kt;
import co.bird.android.model.Reservation;
import co.bird.android.model.ReservationPrice;
import co.bird.android.model.ReservationPriceKt;
import co.bird.android.model.RideMapState;
import co.bird.android.model.RideStates;
import co.bird.android.model.RideUpdateState;
import co.bird.android.model.User;
import co.bird.android.model.analytics.RiderPinTapped;
import co.bird.android.model.analytics.RiderReserveCancelButtonTapped;
import co.bird.android.model.analytics.RiderReserveConfirmButtonTapped;
import co.bird.android.model.analytics.RiderReserveConfirmCancelButtonTapped;
import co.bird.android.model.constant.RideRequirementReason;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireRidePrice;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.ReservationConfig;
import co.bird.android.widget.C16634c;
import co.bird.api.request.CreateReservationWithIntentBody;
import co.bird.api.response.ReservationCancelResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C52147yL4;
import p000.J35;
@Metadata(m28433d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 X2\u00020\u0001:\u0001\u001aB\u008f\u0001\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\b\b\u0001\u0010:\u001a\u000207\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020<0;\u0012\b\b\u0001\u0010B\u001a\u00020?\u0012\b\b\u0001\u0010F\u001a\u00020C\u0012\b\b\u0001\u0010J\u001a\u00020G\u0012\b\b\u0001\u0010N\u001a\u00020K\u0012\n\b\u0001\u0010R\u001a\u0004\u0018\u00010O¢\u0006\u0004\bV\u0010WJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003J\b\u0010\u0016\u001a\u00020\rH\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010R\u001a\u0004\u0018\u00010O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006Y"}, m28432d2 = {"LyL4;", "LfL4;", "", "z", "Q", "E", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lco/bird/api/response/ReservationCancelResponse;", "cancelResponse", "P", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "t", "", "applyTax", "", "maximumReservationDurationMinutes", "", "minutePrice", "", "U", "w", "V", "x", "Lco/bird/android/model/wire/configs/Config;", "y", C17296a.f69688o, "onResume", "Lgl;", "Lgl;", "preference", "LTq4;", "b", "LTq4;", "reactiveConfig", "LMK4;", "c", "LMK4;", "reservationManager", "LYR4;", DateTokenConverter.CONVERTER_KEY, "LYR4;", "rideManager", "LEa;", "e", "LEa;", "analyticsManager", "LBf1;", "f", "LBf1;", "ephemeralPromoManager", "LpU4;", "g", "LpU4;", "rideMapStateManager", "Lco/bird/android/core/mvp/BaseActivity;", "h", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "i", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LGL4;", "j", "LGL4;", "reservationUi", "Le13;", "k", "Le13;", "navigator", "LsJ4;", "l", "LsJ4;", "requirementPresenter", "LZr1;", "m", "LZr1;", "flightBannerCoordinatorPresenter", "LUK4;", "n", "LUK4;", "paymentIntentDelegate", "o", "Z", "isPromotionalReservation", "<init>", "(Lgl;LTq4;LMK4;LYR4;LEa;LBf1;LpU4;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LGL4;Le13;LsJ4;LZr1;LUK4;)V", "p", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReservationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReservationPresenter.kt\nco/bird/android/app/feature/reservation/presenter/ReservationPresenterImpl\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,322:1\n52#2,2:323\n180#3:325\n237#3:326\n180#3:327\n180#3:328\n237#3:329\n180#3:330\n180#3:331\n237#3:332\n*S KotlinDebug\n*F\n+ 1 ReservationPresenter.kt\nco/bird/android/app/feature/reservation/presenter/ReservationPresenterImpl\n*L\n98#1:323,2\n104#1:325\n164#1:326\n168#1:327\n193#1:328\n218#1:329\n226#1:330\n246#1:331\n282#1:332\n*E\n"})
/* renamed from: yL4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52147yL4 implements InterfaceC40882fL4 {

    /* renamed from: p */
    public static final C30557a f119388p = new C30557a(null);

    /* renamed from: q */
    public static final int f119389q = 8;

    /* renamed from: a */
    public final C22454gl f119390a;

    /* renamed from: b */
    public final C36207Tq4 f119391b;

    /* renamed from: c */
    public final MK4 f119392c;

    /* renamed from: d */
    public final YR4 f119393d;

    /* renamed from: e */
    public final InterfaceC1880Ea f119394e;

    /* renamed from: f */
    public final InterfaceC31893Bf1 f119395f;

    /* renamed from: g */
    public final InterfaceC46893pU4 f119396g;

    /* renamed from: h */
    public final BaseActivity f119397h;

    /* renamed from: i */
    public final LifecycleScopeProvider<EnumC7097RE> f119398i;

    /* renamed from: j */
    public final GL4 f119399j;

    /* renamed from: k */
    public final InterfaceC40099e13 f119400k;

    /* renamed from: l */
    public final InterfaceC48572sJ4 f119401l;

    /* renamed from: m */
    public final InterfaceC37617Zr1 f119402m;

    /* renamed from: n */
    public final UK4 f119403n;

    /* renamed from: o */
    public boolean f119404o;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LyL4$a;", "", "", "ACTIVE_RESERVATION_POLL_INTERVAL", "J", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yL4$a */
    /* loaded from: classes2.dex */
    public static final class C30557a {
        public /* synthetic */ C30557a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C30557a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideUpdateState;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RideUpdateState;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yL4$b */
    /* loaded from: classes2.dex */
    public static final class C30558b extends Lambda implements Function1<RideUpdateState, Boolean> {

        /* renamed from: g */
        public static final C30558b f119405g = new C30558b();

        public C30558b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(RideUpdateState it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == RideUpdateState.NONE) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "shouldCheckActiveReservation", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yL4$c */
    /* loaded from: classes2.dex */
    public static final class C30559c extends Lambda implements Function1<Boolean, InterfaceC23496h> {
        public C30559c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23496h invoke(Boolean shouldCheckActiveReservation) {
            Intrinsics.checkNotNullParameter(shouldCheckActiveReservation, "shouldCheckActiveReservation");
            if (shouldCheckActiveReservation.booleanValue()) {
                return C52147yL4.this.f119392c.mo83799d().m32065J().m32069F();
            }
            return AbstractC23461c.m33039p();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Reservation;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yL4$d */
    /* loaded from: classes2.dex */
    public static final class C30560d extends Lambda implements Function1<Optional<Reservation>, Unit> {
        public C30560d() {
            super(1);
        }

        /* renamed from: a */
        public final void m3595a(Optional<Reservation> optional) {
            if (optional.m59037c()) {
                if (Intrinsics.areEqual(optional.m59038b().getFromPromotion(), Boolean.TRUE)) {
                    C52147yL4.this.f119404o = true;
                    C52147yL4.this.f119395f.mo90003e();
                    return;
                }
                C52147yL4.this.f119404o = false;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<Reservation> optional) {
            m3595a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Reservation;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yL4$e */
    /* loaded from: classes2.dex */
    public static final class C30561e extends Lambda implements Function1<Optional<Reservation>, Unit> {
        public C30561e() {
            super(1);
        }

        /* renamed from: a */
        public final void m3594a(Optional<Reservation> optional) {
            if (optional.m59037c()) {
                C52147yL4.this.f119402m.mo40694N1(FlightBannerNode.FlightBanner.RESERVATION_BEFORE);
            }
            C52147yL4.this.f119402m.mo40693O1(FlightBannerNode.FlightBanner.RESERVATION_IN_PROGRESS, optional.m59037c());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<Reservation> optional) {
            m3594a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/api/response/ReservationCancelResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yL4$f */
    /* loaded from: classes2.dex */
    public static final class C30562f extends Lambda implements Function1<Optional<ReservationCancelResponse>, Unit> {
        public C30562f() {
            super(1);
        }

        /* renamed from: a */
        public final void m3593a(Optional<ReservationCancelResponse> optional) {
            if (optional.m59037c()) {
                C52147yL4.this.m3629P(optional.m59038b());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<ReservationCancelResponse> optional) {
            m3593a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yL4$g */
    /* loaded from: classes2.dex */
    public static final class C30563g extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C30563g f119410g = new C30563g();

        public C30563g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yL4$h */
    /* loaded from: classes2.dex */
    public static final class C30564h extends Lambda implements Function1<Boolean, Unit> {
        public C30564h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            String string;
            ReservationConfig reservationConfig = C52147yL4.this.f119391b.m82623f8().getValue().getReservationConfig();
            int maximumReservationDurationMinutes = reservationConfig.getMaximumReservationDurationMinutes();
            if (reservationConfig.getMinutePrice() == 0) {
                string = C52147yL4.this.f119397h.getString(C45871nl4.reservation_ended_free_message, Integer.valueOf(maximumReservationDurationMinutes));
            } else if (C52147yL4.this.f119404o) {
                string = C52147yL4.this.f119397h.getString(C45871nl4.reservation_ended_free_message, Integer.valueOf(reservationConfig.getReservePromoReservationDuration() / 60));
            } else {
                string = C52147yL4.this.f119397h.getString(C45871nl4.reservation_charged);
            }
            Intrinsics.checkNotNullExpressionValue(string, "if (isFree) {\n          …vation_charged)\n        }");
            C52147yL4.this.f119399j.mo103970qg(string);
            C52147yL4.this.f119392c.mo83796g();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: yL4$i */
    /* loaded from: classes2.dex */
    public static final class C30565i<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C30565i<T1, T2, R> f119412a = new C30565i<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2Ã\u0001\u0010\b\u001a¾\u0001\u00120\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0005*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00070\u0007 \u0005*^\u00120\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0005*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Triple;", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/RideStates;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/Reservation;", "Lco/bird/android/model/RideMapState;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yL4$j */
    /* loaded from: classes2.dex */
    public static final class C30566j extends Lambda implements Function1<Triple<? extends Pair<? extends Optional<WireBird>, ? extends RideStates>, ? extends Optional<Reservation>, ? extends RideMapState>, Unit> {
        public C30566j() {
            super(1);
        }

        /* renamed from: a */
        public final void m3591a(Triple<Pair<Optional<WireBird>, RideStates>, Optional<Reservation>, ? extends RideMapState> triple) {
            boolean z;
            Pair<Optional<WireBird>, RideStates> component1 = triple.component1();
            Optional<Reservation> component2 = triple.component2();
            RideMapState component3 = triple.component3();
            Optional<WireBird> component12 = component1.component1();
            RideStates component22 = component1.component2();
            if (C52147yL4.this.m3598y().getReservationConfig().getEnableRideReservation()) {
                WireBird m59035e = component12.m59035e();
                if (m59035e == null) {
                    C52147yL4.this.f119402m.mo40694N1(FlightBannerNode.FlightBanner.RESERVATION_BEFORE);
                }
                if (m59035e != null && m59035e.getPrivateBird() == null && component3 == RideMapState.NONE && component22.getActiveRideCount() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && !component2.m59037c()) {
                    C52147yL4.this.f119394e.mo55956N(new RiderPinTapped());
                }
                C52147yL4.this.f119402m.mo40693O1(FlightBannerNode.FlightBanner.RESERVATION_BEFORE, z);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Pair<? extends Optional<WireBird>, ? extends RideStates>, ? extends Optional<Reservation>, ? extends RideMapState> triple) {
            m3591a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJ35$a;", "it", "", C17296a.f69688o, "(LJ35$a;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yL4$k */
    /* loaded from: classes2.dex */
    public static final class C30567k extends Lambda implements Function1<J35.C3879a, Boolean> {

        /* renamed from: g */
        public static final C30567k f119414g = new C30567k();

        public C30567k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(J35.C3879a it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.m101226c() == RideRequirementReason.RESERVATION) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u000620\u0010\u0005\u001a,\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "LJ35$a;", "kotlin.jvm.PlatformType", "", "", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lco/bird/android/widget/c$b;", C17296a.f69688o, "(Lkotlin/Triple;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yL4$l */
    /* loaded from: classes2.dex */
    public static final class C30568l extends Lambda implements Function1<Triple<? extends J35.C3879a, ? extends Boolean, ? extends Integer>, InterfaceC24574u<? extends C16634c.EnumC16636b>> {
        public C30568l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends C16634c.EnumC16636b> invoke(Triple<J35.C3879a, Boolean, Integer> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Boolean applyTax = triple.component2();
            Integer maximumReservationDurationMinutes = triple.component3();
            if (C52147yL4.this.f119395f.mo90007a().getValue().m59037c()) {
                GL4 gl4 = C52147yL4.this.f119399j;
                String string = C52147yL4.this.f119397h.getString(C45871nl4.reservation_instructions_no_price, Integer.valueOf(C52147yL4.this.f119391b.m82623f8().m73665a().getReservationConfig().getReservePromoReservationDuration() / 60));
                Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…ReservationDuration / 60)");
                return gl4.mo103973i4(string, C52147yL4.this.m3600w(0L));
            }
            long minutePrice = C52147yL4.this.f119391b.m82623f8().getValue().getReservationConfig().getMinutePrice();
            GL4 gl42 = C52147yL4.this.f119399j;
            C52147yL4 c52147yL4 = C52147yL4.this;
            Intrinsics.checkNotNullExpressionValue(applyTax, "applyTax");
            boolean booleanValue = applyTax.booleanValue();
            Intrinsics.checkNotNullExpressionValue(maximumReservationDurationMinutes, "maximumReservationDurationMinutes");
            return gl42.mo103973i4(c52147yL4.m3624U(booleanValue, maximumReservationDurationMinutes.intValue(), minutePrice), C52147yL4.this.m3600w(minutePrice));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/widget/c$b;", "kotlin.jvm.PlatformType", "whichButton", "", C17296a.f69688o, "(Lco/bird/android/widget/c$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yL4$m */
    /* loaded from: classes2.dex */
    public static final class C30569m extends Lambda implements Function1<C16634c.EnumC16636b, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: yL4$m$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C30570a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[C16634c.EnumC16636b.values().length];
                try {
                    iArr[C16634c.EnumC16636b.PRIMARY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C16634c.EnumC16636b.SECONDARY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C30569m() {
            super(1);
        }

        /* renamed from: a */
        public final void m3588a(C16634c.EnumC16636b enumC16636b) {
            int i;
            WireRidePrice m106251a = C32972Fv0.m106251a(C52147yL4.this.m3598y());
            ReservationPrice reservationPrice = ReservationPriceKt.reservationPrice(C52147yL4.this.m3598y());
            if (enumC16636b == null) {
                i = -1;
            } else {
                i = C30570a.$EnumSwitchMapping$0[enumC16636b.ordinal()];
            }
            if (i != 1) {
                if (i == 2) {
                    C52147yL4.this.f119394e.mo55956N(new RiderReserveConfirmButtonTapped(m106251a, reservationPrice));
                    C52147yL4.this.f119394e.mo55905y(new FL4(null, null, null, null, 15, null));
                    return;
                }
                return;
            }
            C52147yL4.this.f119394e.mo55956N(new RiderReserveConfirmCancelButtonTapped(m106251a, reservationPrice));
            C52147yL4.this.f119394e.mo55905y(new EL4(null, null, null, 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C16634c.EnumC16636b enumC16636b) {
            m3588a(enumC16636b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/widget/c$b;", "it", "", C17296a.f69688o, "(Lco/bird/android/widget/c$b;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yL4$n */
    /* loaded from: classes2.dex */
    public static final class C30571n extends Lambda implements Function1<C16634c.EnumC16636b, Boolean> {

        /* renamed from: g */
        public static final C30571n f119417g = new C30571n();

        public C30571n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C16634c.EnumC16636b it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == C16634c.EnumC16636b.SECONDARY) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/widget/c$b;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/widget/c$b;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yL4$o */
    /* loaded from: classes2.dex */
    public static final class C30572o extends Lambda implements Function1<C16634c.EnumC16636b, String> {
        public C30572o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(C16634c.EnumC16636b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C52147yL4.this.f119396g.mo15902g().m73665a().m59038b().getId();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "birdId", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yL4$p */
    /* loaded from: classes2.dex */
    public static final class C30573p extends Lambda implements Function1<String, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: yL4$p$a */
        /* loaded from: classes2.dex */
        public static final class C30574a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C52147yL4 f119420g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30574a(C52147yL4 c52147yL4) {
                super(1);
                this.f119420g = c52147yL4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f119420g.f119399j.error(th.getMessage());
            }
        }

        public C30573p() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(String birdId) {
            Intrinsics.checkNotNullParameter(birdId, "birdId");
            UK4 uk4 = C52147yL4.this.f119403n;
            Intrinsics.checkNotNull(uk4);
            AbstractC23461c progress$default = C28237sD.progress$default(uk4.mo64678a(new CreateReservationWithIntentBody(birdId, null, null, 6, null)), C52147yL4.this.f119399j, 0, 2, (Object) null);
            final C30574a c30574a = new C30574a(C52147yL4.this);
            return progress$default.m33084B(new InterfaceC23484g() { // from class: zL4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C52147yL4.C30573p.invoke$lambda$0(Function1.this, obj);
                }
            }).m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yL4$q */
    /* loaded from: classes2.dex */
    public static final class C30575q extends Lambda implements Function1<Unit, Unit> {
        public C30575q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C52147yL4.this.f119390a.m37621g2(ReservationPriceKt.reservationPrice(C52147yL4.this.m3598y()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yL4$r */
    /* loaded from: classes2.dex */
    public static final class C30576r extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ ReservationCancelResponse f119423h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30576r(ReservationCancelResponse reservationCancelResponse) {
            super(0);
            this.f119423h = reservationCancelResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C52147yL4.this.f119400k.mo36933u4(this.f119423h.getReservationIssues(), this.f119423h.getReservation().getId(), I35.RESERVATION_ISSUE_SUBMITTED.ordinal());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Reservation;", "reservation", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yL4$s */
    /* loaded from: classes2.dex */
    public static final class C30577s extends Lambda implements Function1<Optional<Reservation>, Boolean> {

        /* renamed from: g */
        public static final C30577s f119424g = new C30577s();

        public C30577s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<Reservation> reservation) {
            Intrinsics.checkNotNullParameter(reservation, "reservation");
            return Boolean.valueOf(reservation.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "shouldPollActiveReservation", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yL4$t */
    /* loaded from: classes2.dex */
    public static final class C30578t extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends Long>> {

        /* renamed from: g */
        public static final C30578t f119425g = new C30578t();

        public C30578t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Long> invoke(Boolean shouldPollActiveReservation) {
            Intrinsics.checkNotNullParameter(shouldPollActiveReservation, "shouldPollActiveReservation");
            if (shouldPollActiveReservation.booleanValue()) {
                return Observable.interval(10L, TimeUnit.SECONDS);
            }
            return Observable.empty();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yL4$u */
    /* loaded from: classes2.dex */
    public static final class C30579u extends Lambda implements Function1<Long, InterfaceC23496h> {
        public C30579u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23496h invoke(Long it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C52147yL4.this.f119392c.mo83799d().m32065J().m32069F();
        }
    }

    public C52147yL4(C22454gl preference, C36207Tq4 reactiveConfig, MK4 reservationManager, YR4 rideManager, InterfaceC1880Ea analyticsManager, InterfaceC31893Bf1 ephemeralPromoManager, InterfaceC46893pU4 rideMapStateManager, BaseActivity activity, LifecycleScopeProvider<EnumC7097RE> scopeProvider, GL4 reservationUi, InterfaceC40099e13 navigator, InterfaceC48572sJ4 requirementPresenter, InterfaceC37617Zr1 flightBannerCoordinatorPresenter, UK4 uk4) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(reservationManager, "reservationManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(ephemeralPromoManager, "ephemeralPromoManager");
        Intrinsics.checkNotNullParameter(rideMapStateManager, "rideMapStateManager");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(reservationUi, "reservationUi");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(requirementPresenter, "requirementPresenter");
        Intrinsics.checkNotNullParameter(flightBannerCoordinatorPresenter, "flightBannerCoordinatorPresenter");
        this.f119390a = preference;
        this.f119391b = reactiveConfig;
        this.f119392c = reservationManager;
        this.f119393d = rideManager;
        this.f119394e = analyticsManager;
        this.f119395f = ephemeralPromoManager;
        this.f119396g = rideMapStateManager;
        this.f119397h = activity;
        this.f119398i = scopeProvider;
        this.f119399j = reservationUi;
        this.f119400k = navigator;
        this.f119401l = requirementPresenter;
        this.f119402m = flightBannerCoordinatorPresenter;
        this.f119403n = uk4;
    }

    /* renamed from: A */
    public static final void m3644A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m3643B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m3641D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final boolean m3639F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: G */
    public static final void m3638G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m3637H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final boolean m3636I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: J */
    public static final InterfaceC24574u m3635J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m3634K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final boolean m3633L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: M */
    public static final String m3632M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final InterfaceC23496h m3631N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m3630O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final Boolean m3627R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final InterfaceC23434B m3626S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final InterfaceC23496h m3625T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final Boolean m3602u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final InterfaceC23496h m3601v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public final void m3642C() {
        Observable<Optional<ReservationCancelResponse>> observeOn = this.f119392c.mo83794i().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "reservationManager.reser…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f119398i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30562f c30562f = new C30562f();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: jL4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52147yL4.m3641D(Function1.this, obj);
            }
        });
    }

    /* renamed from: E */
    public final void m3640E() {
        Z84<Boolean> mo83797f = this.f119392c.mo83797f();
        final C30563g c30563g = C30563g.f119410g;
        Observable<Boolean> observeOn = mo83797f.filter(new InterfaceC23494q() { // from class: nL4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m3639F;
                m3639F = C52147yL4.m3639F(Function1.this, obj);
                return m3639F;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "reservationManager.expir…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f119398i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30564h c30564h = new C30564h();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: oL4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52147yL4.m3638G(Function1.this, obj);
            }
        });
    }

    /* renamed from: P */
    public final void m3629P(ReservationCancelResponse reservationCancelResponse) {
        boolean z;
        Reservation reservation = reservationCancelResponse.getReservation();
        if (reservationCancelResponse.getReservation().getPrice() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f119394e.mo55956N(new RiderReserveCancelButtonTapped(Model_Kt.durationSeconds(reservation), reservation.getRefunded(), reservation.getPrice(), reservation.getCurrency()));
        this.f119394e.mo55905y(new C50952wK4(null, null, null, reservation.getId(), Double.valueOf(Model_Kt.durationSeconds(reservation)), Integer.valueOf((int) reservation.getPrice()), reservation.getCurrency(), Boolean.valueOf(reservation.getRefunded()), 7, null));
        this.f119399j.mo103971l6(new C30576r(reservationCancelResponse), z, this.f119391b.m82623f8().getValue().getRideConfig().getAdditionalFees().getApplyTax(), reservation);
        this.f119392c.mo83795h();
    }

    /* renamed from: Q */
    public final void m3628Q() {
        Z84<Optional<Reservation>> mo83798e = this.f119392c.mo83798e();
        final C30577s c30577s = C30577s.f119424g;
        Observable<R> map = mo83798e.map(new InterfaceC23492o() { // from class: kL4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m3627R;
                m3627R = C52147yL4.m3627R(Function1.this, obj);
                return m3627R;
            }
        });
        final C30578t c30578t = C30578t.f119425g;
        Observable switchMap = map.switchMap(new InterfaceC23492o() { // from class: lL4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m3626S;
                m3626S = C52147yL4.m3626S(Function1.this, obj);
                return m3626S;
            }
        });
        final C30579u c30579u = new C30579u();
        AbstractC23461c flatMapCompletable = switchMap.flatMapCompletable(new InterfaceC23492o() { // from class: mL4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m3625T;
                m3625T = C52147yL4.m3625T(Function1.this, obj);
                return m3625T;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "private fun pollActiveRe…r)\n      .subscribe()\n  }");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(this.f119398i));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r6 < 1) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m3624U(boolean z, int i, long j) {
        boolean z2;
        int i2;
        if (j != 0) {
            if (!m3623V()) {
                User m37750B0 = this.f119390a.m37750B0();
                if (m37750B0 != null) {
                    i2 = m37750B0.getRideCount();
                } else {
                    i2 = 0;
                }
            }
            z2 = true;
            if (!z2 && z) {
                String string = this.f119397h.getString(C45871nl4.reservation_instructions_with_price_and_tax, Integer.valueOf(i), m3599x());
                Intrinsics.checkNotNullExpressionValue(string, "{\n      activity.getStri…attedMinutePrice())\n    }");
                return string;
            } else if (!z2) {
                String string2 = this.f119397h.getString(C45871nl4.reservation_instructions_with_price, Integer.valueOf(i), m3599x());
                Intrinsics.checkNotNullExpressionValue(string2, "{\n      activity.getStri…attedMinutePrice())\n    }");
                return string2;
            } else {
                String string3 = this.f119397h.getString(C45871nl4.reservation_instructions_no_price, Integer.valueOf(i));
                Intrinsics.checkNotNullExpressionValue(string3, "{\n      activity.getStri…ionDurationMinutes)\n    }");
                return string3;
            }
        }
        z2 = false;
        if (!z2) {
        }
        if (!z2) {
        }
    }

    /* renamed from: V */
    public final boolean m3623V() {
        return !ReservationPriceKt.reservationPrice(m3598y()).equals(this.f119390a.m37626f1(), true);
    }

    @Override // p000.InterfaceC40882fL4
    /* renamed from: a */
    public void mo3622a() {
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(this.f119396g.mo15902g(), this.f119393d.mo75032o0(), C30565i.f119412a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        Observable observeOn = C24527f.m31949b(combineLatest, this.f119392c.mo83798e(), this.f119396g.mo15897l()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f119398i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30566j c30566j = new C30566j();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: gL4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52147yL4.m3637H(Function1.this, obj);
            }
        });
        m3597z();
        m3640E();
        m3642C();
        m3628Q();
        Observable<J35.C3879a> mo14400e = this.f119401l.mo14400e();
        final C30567k c30567k = C30567k.f119414g;
        Observable<J35.C3879a> filter = mo14400e.filter(new InterfaceC23494q() { // from class: pL4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m3636I;
                m3636I = C52147yL4.m3636I(Function1.this, obj);
                return m3636I;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "requirementPresenter.req…ementReason.RESERVATION }");
        Observable m31949b = C24527f.m31949b(filter, this.f119391b.m82934B2(), this.f119391b.m82458u8());
        final C30568l c30568l = new C30568l();
        Observable flatMapMaybe = m31949b.flatMapMaybe(new InterfaceC23492o() { // from class: qL4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m3635J;
                m3635J = C52147yL4.m3635J(Function1.this, obj);
                return m3635J;
            }
        });
        final C30569m c30569m = new C30569m();
        Observable doOnNext = flatMapMaybe.doOnNext(new InterfaceC23484g() { // from class: rL4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52147yL4.m3634K(Function1.this, obj);
            }
        });
        final C30571n c30571n = C30571n.f119417g;
        Observable filter2 = doOnNext.filter(new InterfaceC23494q() { // from class: sL4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m3633L;
                m3633L = C52147yL4.m3633L(Function1.this, obj);
                return m3633L;
            }
        });
        final C30572o c30572o = new C30572o();
        Observable map = filter2.map(new InterfaceC23492o() { // from class: tL4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m3632M;
                m3632M = C52147yL4.m3632M(Function1.this, obj);
                return m3632M;
            }
        });
        final C30573p c30573p = new C30573p();
        AbstractC23461c m33070P = map.flatMapCompletable(new InterfaceC23492o() { // from class: uL4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m3631N;
                m3631N = C52147yL4.m3631N(Function1.this, obj);
                return m3631N;
            }
        }).m33070P(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33070P, "override fun onCreate() …ationPrice())\n      }\n  }");
        Object m33041n = m33070P.m33041n(AutoDispose.m45239a(this.f119398i));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Object m33094as2 = this.f119399j.mo103974h5().m33094as(AutoDispose.m45239a(this.f119398i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30575q c30575q = new C30575q();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: vL4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52147yL4.m3630O(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC40882fL4
    public void onResume(ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        m3603t(scopeProvider);
    }

    /* renamed from: t */
    public final void m3603t(ScopeProvider scopeProvider) {
        Z84<RideUpdateState> mo15903f = this.f119396g.mo15903f();
        final C30558b c30558b = C30558b.f119405g;
        Observable distinctUntilChanged = mo15903f.map(new InterfaceC23492o() { // from class: wL4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m3602u;
                m3602u = C52147yL4.m3602u(Function1.this, obj);
                return m3602u;
            }
        }).distinctUntilChanged();
        final C30559c c30559c = new C30559c();
        AbstractC23461c switchMapCompletable = distinctUntilChanged.switchMapCompletable(new InterfaceC23492o() { // from class: xL4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m3601v;
                m3601v = C52147yL4.m3601v(Function1.this, obj);
                return m3601v;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "private fun activeReserv…r)\n      .subscribe()\n  }");
        Object m33041n = switchMapCompletable.m33041n(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: w */
    public final int m3600w(long j) {
        if (j == 0) {
            return C45871nl4.reservation_start_free;
        }
        return C45871nl4.reservation_start;
    }

    /* renamed from: x */
    public final String m3599x() {
        return C51916xx1.f118396a.m4408d(ReservationPriceKt.reservationPrice(m3598y()).getMinutePrice(), C45097mS5.m25591o(ReservationPriceKt.reservationPrice(m3598y()).getCurrency()), EnumC36501Ux1.SHOW_IF_NON_ZERO);
    }

    /* renamed from: y */
    public final Config m3598y() {
        return C36441Uq4.m80769c(this.f119391b, this.f119396g.mo15902g().getValue().m59035e());
    }

    /* renamed from: z */
    public final void m3597z() {
        Observable<Optional<Reservation>> distinctUntilChanged = this.f119392c.mo83798e().distinctUntilChanged();
        final C30560d c30560d = new C30560d();
        Observable<Optional<Reservation>> observeOn = distinctUntilChanged.doOnNext(new InterfaceC23484g() { // from class: hL4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52147yL4.m3644A(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun observeReser…it.isPresent)\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f119398i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30561e c30561e = new C30561e();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: iL4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52147yL4.m3643B(Function1.this, obj);
            }
        });
    }
}
