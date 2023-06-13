package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Reservation;
import co.bird.android.model.RideStates;
import co.bird.android.model.RideUpdateState;
import co.bird.android.model.User;
import co.bird.api.request.CancelReservationBody;
import co.bird.api.request.ReservationFeedbackBody;
import co.bird.api.response.ReservationCancelResponse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
import p000.InterfaceC38798br4;
@Metadata(m28433d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B9\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016JF\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R'\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0$0#8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b \u0010'R \u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0$0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010*R!\u0010-\u001a\b\u0012\u0004\u0012\u00020,0#8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b%\u0010'R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020,0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010*R'\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0$0#8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b.\u0010'R \u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0$0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010*¨\u0006:"}, m28432d2 = {"LTK4;", "LMK4;", "Lbr4;", "", "N", "", "reservationId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/response/ReservationCancelResponse;", "m", "Lio/reactivex/p;", "Lco/bird/android/model/Reservation;", DateTokenConverter.CONVERTER_KEY, "", "issues", "feedback", "photoUrls", "c", "g", "h", "LxK4;", "b", "LxK4;", "reservationClient", "Lgl;", "Lgl;", "preference", "LYR4;", "LYR4;", "rideManager", "LpU4;", "e", "LpU4;", "rideMapStateManager", "LZ84;", "Lco/bird/android/buava/Optional;", "f", "Lkotlin/Lazy;", "()LZ84;", "reservation", "La94;", "La94;", "mutableReservation", "", "expired", "i", "mutableExpired", "j", "reservationCancelResponse", "k", "mutableReservationCancelResponse", "LpM3;", "paymentIntentManager", "LRh6;", "userStream", "<init>", "(LxK4;Lgl;LYR4;LpU4;LpM3;LRh6;)V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReservationManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReservationManagerImpl.kt\nco/bird/android/manager/ride/ReservationManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,136:1\n180#2:137\n180#2:138\n180#2:139\n*S KotlinDebug\n*F\n+ 1 ReservationManagerImpl.kt\nco/bird/android/manager/ride/ReservationManagerImpl\n*L\n51#1:137\n61#1:138\n71#1:139\n*E\n"})
/* renamed from: TK4 */
/* loaded from: classes4.dex */
public final class TK4 implements MK4, InterfaceC38798br4 {

    /* renamed from: b */
    public final InterfaceC51545xK4 f35308b;

    /* renamed from: c */
    public final C22454gl f35309c;

    /* renamed from: d */
    public final YR4 f35310d;

    /* renamed from: e */
    public final InterfaceC46893pU4 f35311e;

    /* renamed from: f */
    public final Lazy f35312f;

    /* renamed from: g */
    public final C37791a94<Optional<Reservation>> f35313g;

    /* renamed from: h */
    public final Lazy f35314h;

    /* renamed from: i */
    public final C37791a94<Boolean> f35315i;

    /* renamed from: j */
    public final Lazy f35316j;

    /* renamed from: k */
    public final C37791a94<Optional<ReservationCancelResponse>> f35317k;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "kotlin.jvm.PlatformType", "rideStates", "", C17296a.f69688o, "(Lco/bird/android/model/RideStates;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TK4$a */
    /* loaded from: classes4.dex */
    public static final class C7799a extends Lambda implements Function1<RideStates, Unit> {
        public C7799a() {
            super(1);
        }

        /* renamed from: a */
        public final void m83786a(RideStates rideStates) {
            if (rideStates.getActiveRideCount() > 0) {
                TK4.this.f35313g.accept(Optional.f63040c.m59034a());
                TK4.this.f35309c.m37612j();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideStates rideStates) {
            m83786a(rideStates);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TK4$b */
    /* loaded from: classes4.dex */
    public static final class C7800b extends Lambda implements Function1<User, Unit> {
        public C7800b() {
            super(1);
        }

        /* renamed from: a */
        public final void m83785a(User user) {
            TK4.this.m83803N();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m83785a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Reservation;", "kotlin.jvm.PlatformType", "reservation", "", C17296a.f69688o, "(Lco/bird/android/model/Reservation;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TK4$c */
    /* loaded from: classes4.dex */
    public static final class C7801c extends Lambda implements Function1<Reservation, Unit> {
        public C7801c() {
            super(1);
        }

        /* renamed from: a */
        public final void m83784a(Reservation reservation) {
            C37791a94 c37791a94 = TK4.this.f35313g;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(reservation, "reservation");
            c37791a94.accept(c14443a.m59032c(reservation));
            TK4.this.f35309c.m37625f2(reservation.getId());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Reservation reservation) {
            m83784a(reservation);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Reservation;", "kotlin.jvm.PlatformType", "reservation", "", C17296a.f69688o, "(Lco/bird/android/model/Reservation;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TK4$d */
    /* loaded from: classes4.dex */
    public static final class C7802d extends Lambda implements Function1<Reservation, Unit> {
        public C7802d() {
            super(1);
        }

        /* renamed from: a */
        public final void m83783a(Reservation reservation) {
            C37791a94 c37791a94 = TK4.this.f35313g;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(reservation, "reservation");
            c37791a94.accept(c14443a.m59032c(reservation));
            TK4.this.f35309c.m37625f2(reservation.getId());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Reservation reservation) {
            m83783a(reservation);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/ReservationCancelResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TK4$e */
    /* loaded from: classes4.dex */
    public static final class C7803e extends Lambda implements Function1<HM4<ReservationCancelResponse>, Unit> {
        public C7803e() {
            super(1);
        }

        /* renamed from: a */
        public final void m83782a(HM4<ReservationCancelResponse> hm4) {
            ReservationCancelResponse m103944a;
            if (hm4.m103939f() && (m103944a = hm4.m103944a()) != null) {
                TK4 tk4 = TK4.this;
                C37791a94 c37791a94 = tk4.f35317k;
                Optional.C14443a c14443a = Optional.f63040c;
                c37791a94.accept(c14443a.m59032c(m103944a));
                tk4.f35313g.accept(c14443a.m59034a());
                tk4.f35309c.m37612j();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<ReservationCancelResponse> hm4) {
            m83782a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TK4$f */
    /* loaded from: classes4.dex */
    public static final class C7804f extends Lambda implements Function0<Z84<Boolean>> {
        public C7804f() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Boolean> invoke() {
            return Z84.f47888d.m73663b(TK4.this.f35315i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Reservation;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TK4$g */
    /* loaded from: classes4.dex */
    public static final class C7805g extends Lambda implements Function0<Z84<Optional<Reservation>>> {
        public C7805g() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<Reservation>> invoke() {
            return Z84.f47888d.m73663b(TK4.this.f35313g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/api/response/ReservationCancelResponse;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TK4$h */
    /* loaded from: classes4.dex */
    public static final class C7806h extends Lambda implements Function0<Z84<Optional<ReservationCancelResponse>>> {
        public C7806h() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<ReservationCancelResponse>> invoke() {
            return Z84.f47888d.m73663b(TK4.this.f35317k);
        }
    }

    public TK4(InterfaceC51545xK4 reservationClient, C22454gl preference, YR4 rideManager, InterfaceC46893pU4 rideMapStateManager, InterfaceC46820pM3 paymentIntentManager, InterfaceC35660Rh6 userStream) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(reservationClient, "reservationClient");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(rideMapStateManager, "rideMapStateManager");
        Intrinsics.checkNotNullParameter(paymentIntentManager, "paymentIntentManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        this.f35308b = reservationClient;
        this.f35309c = preference;
        this.f35310d = rideManager;
        this.f35311e = rideMapStateManager;
        lazy = LazyKt__LazyJVMKt.lazy(new C7805g());
        this.f35312f = lazy;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        Optional.C14443a c14443a = Optional.f63040c;
        this.f35313g = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        lazy2 = LazyKt__LazyJVMKt.lazy(new C7804f());
        this.f35314h = lazy2;
        this.f35315i = C37791a94.C10586a.create$default(c10586a, Boolean.FALSE, null, 2, null);
        lazy3 = LazyKt__LazyJVMKt.lazy(new C7806h());
        this.f35316j = lazy3;
        this.f35317k = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        Observable<RideStates> observeOn = rideManager.mo75032o0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "rideManager.rideStates\n …dSchedulers.mainThread())");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7799a c7799a = new C7799a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: NK4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TK4.m83809C(Function1.this, obj);
            }
        });
        Observable<User> mo76576i = userStream.mo76576i();
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as2 = mo76576i.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7800b c7800b = new C7800b();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: OK4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TK4.m83808D(Function1.this, obj);
            }
        });
        Observable m74576S = C37279Yf5.m74576S(paymentIntentManager.mo8812e());
        final C7801c c7801c = new C7801c();
        Observable doOnNext = m74576S.doOnNext(new InterfaceC23484g() { // from class: PK4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TK4.m83807F(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "paymentIntentManager\n   …d(reservation.id)\n      }");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as3 = doOnNext.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as3).subscribe();
    }

    /* renamed from: C */
    public static final void m83809C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m83808D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m83807F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m83806G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m83805I(TK4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f35313g.accept(Optional.f63040c.m59034a());
        if (!C42149hU4.m36358a(this$0.f35310d.mo75057R().getValue()) && this$0.f35309c.m37659Y() != null && this$0.f35311e.mo15903f().m73665a() == RideUpdateState.NONE) {
            this$0.f35315i.accept(Boolean.TRUE);
        }
    }

    /* renamed from: J */
    public static final void m83804J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public final void m83803N() {
        this.f35313g.m71836j();
        this.f35315i.m71836j();
    }

    /* renamed from: O */
    public <T> AbstractC24507p<T> m83802O(AbstractC24507p<T> abstractC24507p) {
        return InterfaceC38798br4.C13315a.m62281n(this, abstractC24507p);
    }

    /* renamed from: P */
    public <T> AbstractC23442F<T> m83801P(AbstractC23442F<T> abstractC23442F) {
        return InterfaceC38798br4.C13315a.m62279p(this, abstractC23442F);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: c */
    public InterfaceC23497i mo212c() {
        return InterfaceC38798br4.C13315a.m62290e(this);
    }

    @Override // p000.MK4
    /* renamed from: d */
    public AbstractC24507p<Reservation> mo83799d() {
        AbstractC24507p<Reservation> m5442d = this.f35308b.m5442d();
        final C7802d c7802d = new C7802d();
        AbstractC24507p<Reservation> m32031n = m5442d.m32026s(new InterfaceC23484g() { // from class: QK4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TK4.m83806G(Function1.this, obj);
            }
        }).m32031n(new InterfaceC23478a() { // from class: RK4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                TK4.m83805I(TK4.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32031n, "override fun activeReser…}\n      .schedulers()\n  }");
        AbstractC24507p<Reservation> m83802O = m83802O(m32031n);
        Intrinsics.checkNotNullExpressionValue(m83802O, "override fun activeReser…}\n      .schedulers()\n  }");
        return m83802O;
    }

    @Override // p000.MK4
    /* renamed from: e */
    public Z84<Optional<Reservation>> mo83798e() {
        return (Z84) this.f35312f.getValue();
    }

    @Override // p000.MK4
    /* renamed from: f */
    public Z84<Boolean> mo83797f() {
        return (Z84) this.f35314h.getValue();
    }

    @Override // p000.MK4
    /* renamed from: g */
    public void mo83796g() {
        this.f35309c.m37612j();
        this.f35315i.accept(Boolean.FALSE);
    }

    @Override // p000.MK4
    /* renamed from: h */
    public void mo83795h() {
        this.f35317k.m71836j();
    }

    @Override // p000.MK4
    /* renamed from: i */
    public Z84<Optional<ReservationCancelResponse>> mo83794i() {
        return (Z84) this.f35316j.getValue();
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: m */
    public <T> InterfaceC24575v<T, T> mo209m() {
        return InterfaceC38798br4.C13315a.m62288g(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: o */
    public <T> InterfaceC23435C<T, T> mo208o() {
        return InterfaceC38798br4.C13315a.m62286i(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: s */
    public <T> InterfaceC23448L<T, T> mo207s() {
        return InterfaceC38798br4.C13315a.m62284k(this);
    }

    @Override // p000.MK4
    /* renamed from: c */
    public AbstractC23442F<HM4<Reservation>> mo83800c(String reservationId, List<String> list, String str, List<String> list2) {
        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
        AbstractC23442F<HM4<Reservation>> m83801P = m83801P(this.f35308b.m5440f(new ReservationFeedbackBody(reservationId, list, str, list2)));
        Intrinsics.checkNotNullExpressionValue(m83801P, "reservationClient.submit…rls))\n      .schedulers()");
        return m83801P;
    }

    @Override // p000.MK4
    /* renamed from: m */
    public AbstractC23442F<HM4<ReservationCancelResponse>> mo83793m(String reservationId) {
        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
        AbstractC23442F<HM4<ReservationCancelResponse>> m5441e = this.f35308b.m5441e(new CancelReservationBody(reservationId));
        final C7803e c7803e = new C7803e();
        AbstractC23442F<HM4<ReservationCancelResponse>> m33101w = m5441e.m33101w(new InterfaceC23484g() { // from class: SK4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TK4.m83804J(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun cancelReser…}\n      .schedulers()\n  }");
        AbstractC23442F<HM4<ReservationCancelResponse>> m83801P = m83801P(m33101w);
        Intrinsics.checkNotNullExpressionValue(m83801P, "override fun cancelReser…}\n      .schedulers()\n  }");
        return m83801P;
    }
}
