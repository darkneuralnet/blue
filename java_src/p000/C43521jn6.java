package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.VehiclePricing;
import co.bird.android.model.VehiclePricingDetails;
import co.bird.android.model.VehiclePricingDetailsEmptyState;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C43521jn6;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BY\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\b\u0010)\u001a\u0004\u0018\u00010'\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*¨\u0006-"}, m28432d2 = {"Ljn6;", "Lcn6;", "", C17296a.f69688o, "", "fromScan", "Landroid/location/Location;", "h", "", "i", "(Z)Ljava/lang/Double;", "Lu24;", "Lu24;", "pricingManager", "Ldr4;", "b", "Ldr4;", "locationManager", "LpU4;", "c", "LpU4;", "rideMapStateManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Lmn6;", "e", "Lmn6;", "ui", "Le13;", "f", "Le13;", "navigator", "Lgl;", "g", "Lgl;", "preference", "Lco/bird/android/model/VehiclePricingDetails;", "Lco/bird/android/model/VehiclePricingDetails;", "vehiclePricingDetails", "Z", "<init>", "(Lu24;Ldr4;LpU4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lmn6;Le13;Lgl;Lco/bird/android/model/VehiclePricingDetails;Z)V", "vehicle-pricing_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehiclePricingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclePricingPresenter.kt\nco/bird/android/feature/vehiclepricing/VehiclePricingPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,91:1\n180#2:92\n180#2:93\n*S KotlinDebug\n*F\n+ 1 VehiclePricingPresenter.kt\nco/bird/android/feature/vehiclepricing/VehiclePricingPresenterImpl\n*L\n68#1:92\n73#1:93\n*E\n"})
/* renamed from: jn6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43521jn6 implements InterfaceC39353cn6 {

    /* renamed from: a */
    public final InterfaceC49597u24 f93344a;

    /* renamed from: b */
    public final InterfaceC40001dr4 f93345b;

    /* renamed from: c */
    public final InterfaceC46893pU4 f93346c;

    /* renamed from: d */
    public final LifecycleScopeProvider<EnumC7097RE> f93347d;

    /* renamed from: e */
    public final InterfaceC45300mn6 f93348e;

    /* renamed from: f */
    public final InterfaceC40099e13 f93349f;

    /* renamed from: g */
    public final C22454gl f93350g;

    /* renamed from: h */
    public final VehiclePricingDetails f93351h;

    /* renamed from: i */
    public final boolean f93352i;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "locationOff", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jn6$a */
    /* loaded from: classes3.dex */
    public static final class C25018a extends Lambda implements Function1<Boolean, Unit> {
        public C25018a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean locationOff) {
            InterfaceC45300mn6 interfaceC45300mn6 = C43521jn6.this.f93348e;
            Intrinsics.checkNotNullExpressionValue(locationOff, "locationOff");
            interfaceC45300mn6.mo23142Pc(locationOff.booleanValue(), C43521jn6.this.f93345b.mo43621k());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "locationOff", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jn6$b */
    /* loaded from: classes3.dex */
    public static final class C25019b extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C25019b f93354g = new C25019b();

        public C25019b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean locationOff) {
            Intrinsics.checkNotNullParameter(locationOff, "locationOff");
            return Boolean.valueOf(!locationOff.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/VehiclePricingDetails;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Boolean;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jn6$c */
    /* loaded from: classes3.dex */
    public static final class C25020c extends Lambda implements Function1<Boolean, InterfaceC23447K<? extends VehiclePricingDetails>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehiclePricingDetails;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/VehiclePricingDetails;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: jn6$c$a */
        /* loaded from: classes3.dex */
        public static final class C25021a extends Lambda implements Function1<VehiclePricingDetails, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C43521jn6 f93356g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25021a(C43521jn6 c43521jn6) {
                super(1);
                this.f93356g = c43521jn6;
            }

            /* renamed from: a */
            public final void m29904a(VehiclePricingDetails it) {
                if (this.f93356g.f93352i) {
                    C22454gl c22454gl = this.f93356g.f93350g;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    c22454gl.m37696O2(it);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(VehiclePricingDetails vehiclePricingDetails) {
                m29904a(vehiclePricingDetails);
                return Unit.INSTANCE;
            }
        }

        public C25020c() {
            super(1);
        }

        /* renamed from: c */
        public static final void m29905c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends VehiclePricingDetails> invoke(Boolean it) {
            AbstractC23442F m33158H;
            Intrinsics.checkNotNullParameter(it, "it");
            if (C43521jn6.this.f93351h == null || (m33158H = AbstractC23442F.m33158H(C43521jn6.this.f93351h)) == null) {
                C43521jn6 c43521jn6 = C43521jn6.this;
                AbstractC23442F progress$default = C28237sD.progress$default(c43521jn6.f93344a.mo9281a(c43521jn6.m29915h(c43521jn6.f93352i), c43521jn6.m29914i(c43521jn6.f93352i)), c43521jn6.f93348e, 0, 2, (Object) null);
                final C25021a c25021a = new C25021a(c43521jn6);
                return progress$default.m33101w(new InterfaceC23484g() { // from class: kn6
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C43521jn6.C25020c.m29905c(Function1.this, obj);
                    }
                });
            }
            return m33158H;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehiclePricingDetails;", "kotlin.jvm.PlatformType", "details", "", C17296a.f69688o, "(Lco/bird/android/model/VehiclePricingDetails;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jn6$d */
    /* loaded from: classes3.dex */
    public static final class C25022d extends Lambda implements Function1<VehiclePricingDetails, Unit> {
        public C25022d() {
            super(1);
        }

        /* renamed from: a */
        public final void m29903a(VehiclePricingDetails vehiclePricingDetails) {
            Unit unit;
            VehiclePricingDetailsEmptyState emptyState = vehiclePricingDetails.getEmptyState();
            if (emptyState != null) {
                C43521jn6.this.f93348e.mo23141Tc(emptyState);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                InterfaceC45300mn6 interfaceC45300mn6 = C43521jn6.this.f93348e;
                List<VehiclePricing> vehiclePrices = vehiclePricingDetails.getVehiclePrices();
                Intrinsics.checkNotNull(vehiclePrices);
                interfaceC45300mn6.mo23143Kf(vehiclePrices);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(VehiclePricingDetails vehiclePricingDetails) {
            m29903a(vehiclePricingDetails);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jn6$e */
    /* loaded from: classes3.dex */
    public static final class C25023e extends Lambda implements Function1<Throwable, Unit> {
        public C25023e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C43521jn6.this.f93348e.error(C45871nl4.vehicle_pricing_general_error);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jn6$f */
    /* loaded from: classes3.dex */
    public static final class C25024f extends Lambda implements Function1<Unit, Unit> {
        public C25024f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            if (C43521jn6.this.f93345b.mo43621k()) {
                C43521jn6.this.f93349f.mo37192C();
            } else {
                C43521jn6.this.f93349f.mo36930v1();
            }
        }
    }

    public C43521jn6(InterfaceC49597u24 pricingManager, InterfaceC40001dr4 locationManager, InterfaceC46893pU4 rideMapStateManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC45300mn6 ui, InterfaceC40099e13 navigator, C22454gl preference, VehiclePricingDetails vehiclePricingDetails, boolean z) {
        Intrinsics.checkNotNullParameter(pricingManager, "pricingManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(rideMapStateManager, "rideMapStateManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(preference, "preference");
        this.f93344a = pricingManager;
        this.f93345b = locationManager;
        this.f93346c = rideMapStateManager;
        this.f93347d = scopeProvider;
        this.f93348e = ui;
        this.f93349f = navigator;
        this.f93350g = preference;
        this.f93351h = vehiclePricingDetails;
        this.f93352i = z;
    }

    /* renamed from: j */
    public static final void m29913j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final boolean m29912k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: l */
    public static final InterfaceC23447K m29911l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m29910m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m29909n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m29908o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC39353cn6
    /* renamed from: a */
    public void mo29922a() {
        Observable<Boolean> observeOn = this.f93345b.mo43609w().observeOn(C23454a.m33087a());
        final C25018a c25018a = new C25018a();
        Observable<Boolean> doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: dn6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43521jn6.m29913j(Function1.this, obj);
            }
        });
        final C25019b c25019b = C25019b.f93354g;
        Observable<Boolean> observeOn2 = doOnNext.filter(new InterfaceC23494q() { // from class: en6
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m29912k;
                m29912k = C43521jn6.m29912k(Function1.this, obj);
                return m29912k;
            }
        }).observeOn(C24542a.m31932c());
        final C25020c c25020c = new C25020c();
        Observable observeOn3 = observeOn2.flatMapSingle(new InterfaceC23492o() { // from class: fn6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m29911l;
                m29911l = C43521jn6.m29911l(Function1.this, obj);
                return m29911l;
            }
        }).observeOn(C23454a.m33087a());
        final C25022d c25022d = new C25022d();
        Observable retry = observeOn3.doOnNext(new InterfaceC23484g() { // from class: gn6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43521jn6.m29910m(Function1.this, obj);
            }
        }).retry(1L);
        final C25023e c25023e = new C25023e();
        Observable doOnError = retry.doOnError(new InterfaceC23484g() { // from class: hn6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43521jn6.m29909n(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "override fun onCreate() …o()\n        }\n      }\n  }");
        Object m33094as = doOnError.m33094as(AutoDispose.m45239a(this.f93347d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
        Observable<Unit> observeOn4 = this.f93348e.mo23144F().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "ui.turnOnClicks()\n      …dSchedulers.mainThread())");
        Object m33094as2 = observeOn4.m33094as(AutoDispose.m45239a(this.f93347d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25024f c25024f = new C25024f();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: in6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43521jn6.m29908o(Function1.this, obj);
            }
        });
    }

    /* renamed from: h */
    public final Location m29915h(boolean z) {
        return z ? this.f93345b.mo43616p().getValue() : this.f93346c.mo15893p();
    }

    /* renamed from: i */
    public final Double m29914i(boolean z) {
        return z ? Double.valueOf(10.0d) : this.f93346c.mo15901h();
    }
}
