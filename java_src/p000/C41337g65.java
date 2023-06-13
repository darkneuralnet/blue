package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BadAreaType;
import co.bird.android.model.FlightBannerNode;
import co.bird.android.model.RideStartTimeConstraint;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23494q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.H31;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\t\u0012\b\b\u0001\u0010\u0010\u001a\u00020\r\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Lg65;", "", "", "e", DateTokenConverter.CONVERTER_KEY, "LYR4;", C17296a.f69688o, "LYR4;", "rideManager", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LZr1;", "c", "LZr1;", "flightBannerCoordinatorPresenter", "LP75;", "LP75;", "rideUi", "<init>", "(LYR4;Lcom/uber/autodispose/ScopeProvider;LZr1;LP75;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideStartInBadAreaPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStartInBadAreaPresenter.kt\nco/bird/android/app/feature/ride/presenter/RideStartInBadAreaPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,71:1\n180#2:72\n180#2:73\n*S KotlinDebug\n*F\n+ 1 RideStartInBadAreaPresenter.kt\nco/bird/android/app/feature/ride/presenter/RideStartInBadAreaPresenterImpl\n*L\n41#1:72\n49#1:73\n*E\n"})
/* renamed from: g65  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41337g65 {

    /* renamed from: a */
    public final YR4 f81613a;

    /* renamed from: b */
    public final ScopeProvider f81614b;

    /* renamed from: c */
    public final InterfaceC37617Zr1 f81615c;

    /* renamed from: d */
    public final P75 f81616d;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g65$a */
    /* loaded from: classes2.dex */
    public static final class C20746a extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C20746a f81617g = new C20746a();

        public C20746a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g65$b */
    /* loaded from: classes2.dex */
    public static final class C20747b extends Lambda implements Function1<Boolean, Unit> {
        public C20747b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C41337g65.this.m40060d();
            H31.C3014a.showDialog$default(C41337g65.this.f81616d, MP4.f23110d, false, false, null, null, null, null, 126, null);
            C41337g65.this.f81613a.mo75046f0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideStartTimeConstraint;", "kotlin.jvm.PlatformType", "timeConstraint", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideStartInBadAreaPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStartInBadAreaPresenter.kt\nco/bird/android/app/feature/ride/presenter/RideStartInBadAreaPresenterImpl$onCreate$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
    /* renamed from: g65$c */
    /* loaded from: classes2.dex */
    public static final class C20748c extends Lambda implements Function1<Optional<RideStartTimeConstraint>, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: g65$c$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C20749a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BadAreaType.values().length];
                try {
                    iArr[BadAreaType.OUTSIDE_OPERATING_AREA.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BadAreaType.IN_NO_RIDE_AREA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C20748c() {
            super(1);
        }

        /* renamed from: a */
        public final void m40055a(Optional<RideStartTimeConstraint> optional) {
            FlightBannerNode.FlightBanner flightBanner;
            if (optional.m59037c()) {
                int i = C20749a.$EnumSwitchMapping$0[optional.m59038b().getBadAreaType().ordinal()];
                Unit unit = null;
                if (i != 1) {
                    if (i != 2) {
                        flightBanner = null;
                    } else {
                        flightBanner = FlightBannerNode.FlightBanner.RIDE_START_IN_NO_RIDE_AREA;
                    }
                } else {
                    flightBanner = FlightBannerNode.FlightBanner.RIDE_START_OUTSIDE_OPERATING_AREA;
                }
                if (flightBanner != null) {
                    C41337g65.this.f81615c.mo40695M1(flightBanner);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    C41337g65.this.m40060d();
                    return;
                }
                return;
            }
            C41337g65.this.m40060d();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<RideStartTimeConstraint> optional) {
            m40055a(optional);
            return Unit.INSTANCE;
        }
    }

    public C41337g65(YR4 rideManager, ScopeProvider scopeProvider, InterfaceC37617Zr1 flightBannerCoordinatorPresenter, P75 rideUi) {
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(flightBannerCoordinatorPresenter, "flightBannerCoordinatorPresenter");
        Intrinsics.checkNotNullParameter(rideUi, "rideUi");
        this.f81613a = rideManager;
        this.f81614b = scopeProvider;
        this.f81615c = flightBannerCoordinatorPresenter;
        this.f81616d = rideUi;
    }

    /* renamed from: f */
    public static final boolean m40058f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: g */
    public static final void m40057g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m40056h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d */
    public final void m40060d() {
        this.f81615c.mo40694N1(FlightBannerNode.FlightBanner.RIDE_START_OUTSIDE_OPERATING_AREA);
        this.f81615c.mo40694N1(FlightBannerNode.FlightBanner.RIDE_START_IN_NO_RIDE_AREA);
    }

    /* renamed from: e */
    public void m40059e() {
        Z84<Boolean> mo75066D = this.f81613a.mo75066D();
        final C20746a c20746a = C20746a.f81617g;
        Observable<Boolean> observeOn = mo75066D.filter(new InterfaceC23494q() { // from class: d65
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m40058f;
                m40058f = C41337g65.m40058f(Function1.this, obj);
                return m40058f;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "rideManager.badAreaRideE…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f81614b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20747b c20747b = new C20747b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: e65
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41337g65.m40057g(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f81613a.mo75065F().m33094as(AutoDispose.m45239a(this.f81614b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20748c c20748c = new C20748c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: f65
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41337g65.m40056h(Function1.this, obj);
            }
        });
    }
}
