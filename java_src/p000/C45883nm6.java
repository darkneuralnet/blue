package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.FleetListVehicle;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C45883nm6;
import p000.InterfaceC31776As1;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0001\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020#¢\u0006\u0004\b&\u0010'J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0096\u0001J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0096\u0001J\u0014\u0010\u0010\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eJ\u0014\u0010\u0011\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eR\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$¨\u0006("}, m28432d2 = {"Lnm6;", "LAs1;", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBird;", "f", "", "onResume", "", "birdId", "", "refresh", "Lio/reactivex/c;", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "", "birdIds", "l", "n", "LBq1;", "LBq1;", "fleetStatusManager", "LEa;", "b", "LEa;", "analyticsManager", "c", "LAs1;", "flightSheetDelegate", "Lcp1;", "Lcp1;", "ui", "Lvo1;", "e", "Lvo1;", "converter", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(LBq1;LEa;LAs1;Lcp1;Lvo1;Lcom/uber/autodispose/ScopeProvider;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicleListPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleListPresenter.kt\nco/bird/android/feature/fleetstatus/state/list/VehicleListPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,77:1\n237#2:78\n180#2:79\n237#2:80\n180#2:81\n*S KotlinDebug\n*F\n+ 1 VehicleListPresenter.kt\nco/bird/android/feature/fleetstatus/state/list/VehicleListPresenter\n*L\n32#1:78\n48#1:79\n67#1:80\n72#1:81\n*E\n"})
/* renamed from: nm6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45883nm6 implements InterfaceC31776As1 {

    /* renamed from: a */
    public final InterfaceC31992Bq1 f100495a;

    /* renamed from: b */
    public final InterfaceC1880Ea f100496b;

    /* renamed from: c */
    public final InterfaceC31776As1 f100497c;

    /* renamed from: d */
    public final C39386cp1 f100498d;

    /* renamed from: e */
    public final C50640vo1 f100499e;

    /* renamed from: f */
    public final ScopeProvider f100500f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nm6$a */
    /* loaded from: classes3.dex */
    public static final class C26586a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C26586a f100501g = new C26586a();

        public C26586a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/persistence/FleetListVehicle;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nm6$b */
    /* loaded from: classes3.dex */
    public static final class C26587b extends Lambda implements Function1<List<? extends FleetListVehicle>, Boolean> {

        /* renamed from: g */
        public static final C26587b f100502g = new C26587b();

        public C26587b() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<FleetListVehicle> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!it.isEmpty());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends FleetListVehicle> list) {
            return invoke2((List<FleetListVehicle>) list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "vehicleList", "", "Lco/bird/android/model/persistence/FleetListVehicle;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nm6$c */
    /* loaded from: classes3.dex */
    public static final class C26588c extends Lambda implements Function1<List<? extends FleetListVehicle>, Unit> {
        public C26588c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends FleetListVehicle> list) {
            invoke2((List<FleetListVehicle>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<FleetListVehicle> vehicleList) {
            Object first;
            C39386cp1 c39386cp1 = C45883nm6.this.f100498d;
            Intrinsics.checkNotNullExpressionValue(vehicleList, "vehicleList");
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) vehicleList);
            c39386cp1.m45076t(((FleetListVehicle) first).getSection());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/FleetListVehicle;", "vehicles", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nm6$d */
    /* loaded from: classes3.dex */
    public static final class C26589d extends Lambda implements Function1<List<? extends FleetListVehicle>, List<? extends C3023H6>> {
        public C26589d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C3023H6> invoke(List<FleetListVehicle> vehicles) {
            Intrinsics.checkNotNullParameter(vehicles, "vehicles");
            return C45883nm6.this.f100499e.m8019b(vehicles);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nm6$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26590e extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C26590e(Object obj) {
            super(1, obj, C39386cp1.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C39386cp1) this.receiver).m45080b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/FleetListVehicle;", "vehicle", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/persistence/FleetListVehicle;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nm6$f */
    /* loaded from: classes3.dex */
    public static final class C26591f extends Lambda implements Function1<FleetListVehicle, InterfaceC23496h> {
        public C26591f() {
            super(1);
        }

        /* renamed from: c */
        public static final void m23153c(C45883nm6 this$0, FleetListVehicle vehicle) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(vehicle, "$vehicle");
            this$0.f100496b.mo55905y(new C52419yo1(null, null, null, vehicle.getVehicleId(), "", "", 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(final FleetListVehicle vehicle) {
            Intrinsics.checkNotNullParameter(vehicle, "vehicle");
            AbstractC23461c populateFlightSheet$default = InterfaceC31776As1.C0293a.populateFlightSheet$default(C45883nm6.this.f100497c, vehicle.getVehicleId(), false, 2, null);
            final C45883nm6 c45883nm6 = C45883nm6.this;
            return populateFlightSheet$default.m33029z(new InterfaceC23478a() { // from class: om6
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C45883nm6.C26591f.m23153c(C45883nm6.this, vehicle);
                }
            }).m33070P(C23454a.m33087a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nVehicleListPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleListPresenter.kt\nco/bird/android/feature/fleetstatus/state/list/VehicleListPresenter$onResume$6\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
    /* renamed from: nm6$g */
    /* loaded from: classes3.dex */
    public static final class C26592g extends Lambda implements Function1<Throwable, Unit> {
        public C26592g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            Unit unit;
            C41318g46.m40159e(e);
            Intrinsics.checkNotNullExpressionValue(e, "e");
            if (R36.m87361d(e) == null) {
                Throwable m87364a = R36.m87364a(e);
                if (m87364a != null) {
                    C45883nm6.this.f100498d.error(m87364a);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    C45883nm6.this.f100498d.errorGeneric();
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nm6$h */
    /* loaded from: classes3.dex */
    public static final class C26593h extends Lambda implements Function1<Unit, Unit> {
        public C26593h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C45883nm6.this.f100498d.m45086Vl();
        }
    }

    public C45883nm6(InterfaceC31992Bq1 fleetStatusManager, InterfaceC1880Ea analyticsManager, InterfaceC31776As1 flightSheetDelegate, C39386cp1 ui, C50640vo1 converter, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(fleetStatusManager, "fleetStatusManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(flightSheetDelegate, "flightSheetDelegate");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f100495a = fleetStatusManager;
        this.f100496b = analyticsManager;
        this.f100497c = flightSheetDelegate;
        this.f100498d = ui;
        this.f100499e = converter;
        this.f100500f = scopeProvider;
    }

    /* renamed from: m */
    public static final void m23165m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final boolean m23163o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: p */
    public static final void m23162p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final List m23161q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m23160r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final InterfaceC23496h m23159s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m23158t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m23157u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC31776As1
    /* renamed from: a */
    public Observable<Unit> mo23177a() {
        return this.f100497c.mo23177a();
    }

    @Override // p000.InterfaceC31776As1
    /* renamed from: d */
    public AbstractC23461c mo23174d(String birdId, boolean z) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return this.f100497c.mo23174d(birdId, z);
    }

    @Override // p000.InterfaceC31776As1
    /* renamed from: f */
    public Observable<WireBird> mo23172f() {
        return this.f100497c.mo23172f();
    }

    /* renamed from: l */
    public final void m23166l(List<String> birdIds) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        AbstractC23461c mo111422z = this.f100495a.mo111422z(birdIds);
        final C26586a c26586a = C26586a.f100501g;
        AbstractC23461c m33069Q = mo111422z.m33084B(new InterfaceC23484g() { // from class: fm6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45883nm6.m23165m(Function1.this, obj);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "fleetStatusManager.fetch…\n      .onErrorComplete()");
        Object m33041n = C28237sD.progress$default(m33069Q, this.f100498d, 0, 2, (Object) null).m33041n(AutoDispose.m45239a(this.f100500f));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: n */
    public final void m23164n(List<String> birdIds) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        this.f100497c.onResume();
        Observable<List<FleetListVehicle>> mo111430c = this.f100495a.mo111430c(birdIds);
        final C26587b c26587b = C26587b.f100502g;
        Observable<List<FleetListVehicle>> observeOn = mo111430c.filter(new InterfaceC23494q() { // from class: gm6
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m23163o;
                m23163o = C45883nm6.m23163o(Function1.this, obj);
                return m23163o;
            }
        }).observeOn(C23454a.m33087a());
        final C26588c c26588c = new C26588c();
        Observable<List<FleetListVehicle>> observeOn2 = observeOn.doOnNext(new InterfaceC23484g() { // from class: hm6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45883nm6.m23162p(Function1.this, obj);
            }
        }).observeOn(C24542a.m31934a());
        final C26589d c26589d = new C26589d();
        Observable observeOn3 = observeOn2.map(new InterfaceC23492o() { // from class: im6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m23161q;
                m23161q = C45883nm6.m23161q(Function1.this, obj);
                return m23161q;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "fun onResume(birdIds: Li….hideActionButton() }\n  }");
        Object m33094as = observeOn3.m33094as(AutoDispose.m45239a(this.f100500f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26590e c26590e = new C26590e(this.f100498d);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: jm6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45883nm6.m23160r(Function1.this, obj);
            }
        });
        Observable<FleetListVehicle> m45078bm = this.f100498d.m45078bm();
        final C26591f c26591f = new C26591f();
        AbstractC23461c m33070P = m45078bm.flatMapCompletable(new InterfaceC23492o() { // from class: km6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m23159s;
                m23159s = C45883nm6.m23159s(Function1.this, obj);
                return m23159s;
            }
        }).m33070P(C23454a.m33087a());
        final C26592g c26592g = new C26592g();
        AbstractC23461c m33066T = m33070P.m33084B(new InterfaceC23484g() { // from class: lm6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45883nm6.m23158t(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "fun onResume(birdIds: Li….hideActionButton() }\n  }");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(this.f100500f));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<Unit> observeOn4 = this.f100498d.m45089Sl().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "ui.flightSheetDismisses(…dSchedulers.mainThread())");
        Object m33094as2 = observeOn4.m33094as(AutoDispose.m45239a(this.f100500f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26593h c26593h = new C26593h();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: mm6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45883nm6.m23157u(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC31776As1
    public void onResume() {
        this.f100497c.onResume();
    }
}
