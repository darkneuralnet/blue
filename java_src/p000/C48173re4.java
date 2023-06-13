package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.FlightBanner;
import co.bird.android.model.ScanlessRideItem;
import co.bird.android.model.constant.RideRequirementReason;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.J35;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BO\b\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0001\u0010 \u001a\u00020\u001d\u0012\b\b\u0001\u0010$\u001a\u00020!\u0012\b\b\u0001\u0010(\u001a\u00020%¢\u0006\u0004\b-\u0010.J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010,\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\u00030\u00030)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+¨\u0006/"}, m28432d2 = {"Lre4;", "Lco/bird/android/model/FlightBanner;", "", "", "j", "onBannerShown", "onBannerRemoved", "Lio/reactivex/Observable;", "closeImmediately", "LTq4;", C17296a.f69688o, "LTq4;", "reactiveConfig", "LaM;", "b", "LaM;", "birdManager", "LEa;", "c", "LEa;", "analyticsManager", "LBl5;", DateTokenConverter.CONVERTER_KEY, "LBl5;", "scanlessRideManager", "LpU4;", "e", "LpU4;", "rideMapStateManager", "LsJ4;", "f", "LsJ4;", "requirementPresenter", "Lhe4;", "g", "Lhe4;", "quickStartSelectedBannerUi", "Lcom/uber/autodispose/ScopeProvider;", "h", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LAG;", "kotlin.jvm.PlatformType", "LAG;", "forceCloseObservable", "<init>", "(LTq4;LaM;LEa;LBl5;LpU4;LsJ4;Lhe4;Lcom/uber/autodispose/ScopeProvider;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQuickStartSelectedPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickStartSelectedPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/QuickStartSelectedPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,104:1\n180#2:105\n180#2:106\n*S KotlinDebug\n*F\n+ 1 QuickStartSelectedPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/QuickStartSelectedPresenterImpl\n*L\n59#1:105\n77#1:106\n*E\n"})
/* renamed from: re4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48173re4 implements FlightBanner {

    /* renamed from: a */
    public final C36207Tq4 f107377a;

    /* renamed from: b */
    public final InterfaceC10636aM f107378b;

    /* renamed from: c */
    public final InterfaceC1880Ea f107379c;

    /* renamed from: d */
    public final InterfaceC31951Bl5 f107380d;

    /* renamed from: e */
    public final InterfaceC46893pU4 f107381e;

    /* renamed from: f */
    public final InterfaceC48572sJ4 f107382f;

    /* renamed from: g */
    public final InterfaceC42243he4 f107383g;

    /* renamed from: h */
    public final ScopeProvider f107384h;

    /* renamed from: i */
    public final /* synthetic */ C27923rS f107385i;

    /* renamed from: j */
    public final C0058AG<Unit> f107386j;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJ35$a;", "it", "", C17296a.f69688o, "(LJ35$a;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: re4$a */
    /* loaded from: classes2.dex */
    public static final class C27961a extends Lambda implements Function1<J35.C3879a, Boolean> {

        /* renamed from: g */
        public static final C27961a f107387g = new C27961a();

        public C27961a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(J35.C3879a it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.m101226c() == RideRequirementReason.RIDE) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJ35$a;", "it", "", C17296a.f69688o, "(LJ35$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: re4$b */
    /* loaded from: classes2.dex */
    public static final class C27962b extends Lambda implements Function1<J35.C3879a, Unit> {

        /* renamed from: g */
        public static final C27962b f107388g = new C27962b();

        public C27962b() {
            super(1);
        }

        /* renamed from: a */
        public final void m15634a(J35.C3879a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(J35.C3879a c3879a) {
            m15634a(c3879a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: re4$c */
    /* loaded from: classes2.dex */
    public static final class C27963c extends Lambda implements Function1<WireBird, Unit> {

        /* renamed from: g */
        public static final C27963c f107389g = new C27963c();

        public C27963c() {
            super(1);
        }

        /* renamed from: a */
        public final void m15633a(WireBird wireBird) {
            C41318g46.m40151m("Chirp bird on select.", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m15633a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "e", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: re4$d */
    /* loaded from: classes2.dex */
    public static final class C27964d extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C27964d f107390g = new C27964d();

        public C27964d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            C41318g46.m40159e(e);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: re4$e */
    /* loaded from: classes2.dex */
    public static final class C27965e extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f107392h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27965e(WireBird wireBird) {
            super(1);
            this.f107392h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC1880Ea interfaceC1880Ea = C48173re4.this.f107379c;
            int batteryLevel = this.f107392h.getBatteryLevel();
            String model = this.f107392h.getModel();
            if (model == null) {
                model = "unknown";
            }
            interfaceC1880Ea.mo55905y(new C35163Pe4(null, null, null, "rider_map", batteryLevel, model, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0004*,\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/ScanlessRideItem;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nQuickStartSelectedPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickStartSelectedPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/QuickStartSelectedPresenterImpl$onBannerShown$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n288#2,2:105\n1#3:107\n*S KotlinDebug\n*F\n+ 1 QuickStartSelectedPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/QuickStartSelectedPresenterImpl$onBannerShown$4\n*L\n80#1:105,2\n*E\n"})
    /* renamed from: re4$f */
    /* loaded from: classes2.dex */
    public static final class C27966f extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends ScanlessRideItem>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f107394h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27966f(WireBird wireBird) {
            super(1);
            this.f107394h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends List<? extends ScanlessRideItem>> pair) {
            invoke2((Pair<Unit, ? extends List<ScanlessRideItem>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, ? extends List<ScanlessRideItem>> pair) {
            Object obj;
            boolean z;
            List<ScanlessRideItem> availableBirds = pair.component2();
            Intrinsics.checkNotNullExpressionValue(availableBirds, "availableBirds");
            WireBird wireBird = this.f107394h;
            Iterator<T> it = availableBirds.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                WireBird component1 = ((ScanlessRideItem) obj).component1();
                C41318g46.m40163a("selectedBird " + wireBird, new Object[0]);
                C41318g46.m40163a("compared bird " + component1, new Object[0]);
                if (Intrinsics.areEqual(component1.getId(), wireBird.getId()) || Intrinsics.areEqual(component1.getEphemeralId(), wireBird.getId())) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            ScanlessRideItem scanlessRideItem = (ScanlessRideItem) obj;
            if (scanlessRideItem == null) {
                C48173re4.this.f107386j.accept(Unit.INSTANCE);
                C41318g46.m40163a("no bird found", new Object[0]);
                return;
            }
            C48173re4.this.f107383g.mo33643k(true);
            C48173re4.this.f107380d.mo89856a(scanlessRideItem);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: re4$g */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C27967g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C27967g f107395b = new C27967g();

        public C27967g() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
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

    public C48173re4(C36207Tq4 reactiveConfig, InterfaceC10636aM birdManager, InterfaceC1880Ea analyticsManager, InterfaceC31951Bl5 scanlessRideManager, InterfaceC46893pU4 rideMapStateManager, InterfaceC48572sJ4 requirementPresenter, InterfaceC42243he4 quickStartSelectedBannerUi, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(scanlessRideManager, "scanlessRideManager");
        Intrinsics.checkNotNullParameter(rideMapStateManager, "rideMapStateManager");
        Intrinsics.checkNotNullParameter(requirementPresenter, "requirementPresenter");
        Intrinsics.checkNotNullParameter(quickStartSelectedBannerUi, "quickStartSelectedBannerUi");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f107377a = reactiveConfig;
        this.f107378b = birdManager;
        this.f107379c = analyticsManager;
        this.f107380d = scanlessRideManager;
        this.f107381e = rideMapStateManager;
        this.f107382f = requirementPresenter;
        this.f107383g = quickStartSelectedBannerUi;
        this.f107384h = scopeProvider;
        this.f107385i = new C27923rS(quickStartSelectedBannerUi, rideMapStateManager, reactiveConfig, scopeProvider);
        C0058AG<Unit> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<Unit>()");
        this.f107386j = m115951g;
    }

    /* renamed from: h */
    public static final boolean m15643h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: i */
    public static final Unit m15642i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m15640k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m15639l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m15638m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m15637n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m15636o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // co.bird.android.model.FlightBanner
    public Observable<Unit> closeImmediately() {
        C0058AG<Unit> c0058ag = this.f107386j;
        Observable<J35.C3879a> mo14400e = this.f107382f.mo14400e();
        final C27961a c27961a = C27961a.f107387g;
        Observable<J35.C3879a> filter = mo14400e.filter(new InterfaceC23494q() { // from class: pe4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m15643h;
                m15643h = C48173re4.m15643h(Function1.this, obj);
                return m15643h;
            }
        });
        final C27962b c27962b = C27962b.f107388g;
        Observable<Unit> merge = Observable.merge(c0058ag, filter.map(new InterfaceC23492o() { // from class: qe4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m15642i;
                m15642i = C48173re4.m15642i(Function1.this, obj);
                return m15642i;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      forceCloseO…      .map { Unit }\n    )");
        return merge;
    }

    /* renamed from: j */
    public void m15641j() {
        this.f107385i.m15940b();
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerRemoved() {
        this.f107383g.mo33643k(false);
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerShown() {
        WireBird m59035e = this.f107381e.mo15902g().m73665a().m59035e();
        if (m59035e == null) {
            this.f107386j.accept(Unit.INSTANCE);
            return;
        }
        if (this.f107377a.m82623f8().m73665a().getRideConfig().getEnableScanlessRideBannerChirp()) {
            Object m33094as = this.f107378b.mo71605D0(m59035e, false).m33094as(AutoDispose.m45239a(this.f107384h));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C27963c c27963c = C27963c.f107389g;
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: ke4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C48173re4.m15640k(Function1.this, obj);
                }
            };
            final C27964d c27964d = C27964d.f107390g;
            ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: le4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C48173re4.m15639l(Function1.this, obj);
                }
            });
        }
        Observable<Unit> mo33644Me = this.f107383g.mo33644Me();
        final C27965e c27965e = new C27965e(m59035e);
        Observable<Unit> doOnNext = mo33644Me.doOnNext(new InterfaceC23484g() { // from class: me4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48173re4.m15638m(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun onBannerSho…gurePricingStringUi()\n  }");
        Observable observeOn = C24527f.m31950a(doOnNext, this.f107380d.mo89852e()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onBannerSho…gurePricingStringUi()\n  }");
        Object m33094as2 = observeOn.m33094as(AutoDispose.m45239a(this.f107384h));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27966f c27966f = new C27966f(m59035e);
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: ne4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48173re4.m15637n(Function1.this, obj);
            }
        };
        final C27967g c27967g = C27967g.f107395b;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: oe4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48173re4.m15636o(Function1.this, obj);
            }
        });
        m15641j();
    }
}
