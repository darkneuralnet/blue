package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.FlightBanner;
import co.bird.android.model.ParkingNest;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.rxkotlin.C24527f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BE\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0014\u0012\u000e\b\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"Ln13;", "Lco/bird/android/model/FlightBanner;", "", "onBannerShown", "LoF3;", C17296a.f69688o, "LoF3;", "parkingManager", "Landroid/content/Context;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LEa;", "c", "LEa;", "analyticsManager", "Lr13;", DateTokenConverter.CONVERTER_KEY, "Lr13;", "nearParkingNestBannerUi", "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lma4;", "LH2;", "f", "Lma4;", "locationWrongClicks", "<init>", "(LoF3;Landroid/content/Context;LEa;Lr13;Lcom/uber/autodispose/ScopeProvider;Lma4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNearParkingNestBannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NearParkingNestBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/NearParkingNestBannerPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,84:1\n180#2:85\n180#2:86\n*S KotlinDebug\n*F\n+ 1 NearParkingNestBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/NearParkingNestBannerPresenterImpl\n*L\n43#1:85\n66#1:86\n*E\n"})
/* renamed from: n13  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45436n13 implements FlightBanner {

    /* renamed from: a */
    public final InterfaceC46164oF3 f99212a;

    /* renamed from: b */
    public final Context f99213b;

    /* renamed from: c */
    public final InterfaceC1880Ea f99214c;

    /* renamed from: d */
    public final InterfaceC47808r13 f99215d;

    /* renamed from: e */
    public final ScopeProvider f99216e;

    /* renamed from: f */
    public final C45168ma4<EnumC3010H2> f99217f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFH3;", "kotlin.jvm.PlatformType", "status", "", C17296a.f69688o, "(LFH3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: n13$a */
    /* loaded from: classes2.dex */
    public static final class C26336a extends Lambda implements Function1<FH3, Unit> {
        public C26336a() {
            super(1);
        }

        /* renamed from: a */
        public final void m24571a(FH3 fh3) {
            if (fh3 instanceof C32109Cd1) {
                C32109Cd1 c32109Cd1 = (C32109Cd1) fh3;
                C45436n13.this.f99215d.mo14877tb(c32109Cd1.m111963l());
                Float m111967h = c32109Cd1.m111967h();
                if (m111967h != null) {
                    C45436n13 c45436n13 = C45436n13.this;
                    String m4403i = C51916xx1.f118396a.m4403i(c45436n13.f99213b, m111967h.floatValue());
                    InterfaceC47808r13 interfaceC47808r13 = c45436n13.f99215d;
                    String string = c45436n13.f99213b.getString(C45871nl4.parking_nest_almost_title_v2, m4403i);
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …   distance\n            )");
                    interfaceC47808r13.mo14878t(string);
                    InterfaceC47808r13 interfaceC47808r132 = c45436n13.f99215d;
                    String string2 = c45436n13.f99213b.getString(C45871nl4.parking_nest_almost_subtitle, m4403i);
                    Intrinsics.checkNotNullExpressionValue(string2, "context.getString(\n     … distance\n              )");
                    interfaceC47808r132.mo14876u0(string2);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FH3 fh3) {
            m24571a(fh3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: n13$b */
    /* loaded from: classes2.dex */
    public static final class C26337b extends Lambda implements Function1<Unit, Unit> {
        public C26337b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            ParkingNest m64762e;
            InterfaceC1880Ea interfaceC1880Ea = C45436n13.this.f99214c;
            C38435bF0 mo21502g = C45436n13.this.f99212a.mo21502g();
            interfaceC1880Ea.mo55905y(new C47359qG3(null, null, null, (mo21502g == null || (m64762e = mo21502g.m64762e()) == null) ? null : m64762e.getId(), 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00012F\u0010\u0004\u001aB\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "LFH3;", "<name for destructuring parameter 0>", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: n13$c */
    /* loaded from: classes2.dex */
    public static final class C26338c extends Lambda implements Function1<Pair<? extends Unit, ? extends FH3>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: n13$c$a */
        /* loaded from: classes2.dex */
        public static final class C26339a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ C45436n13 f99221g;

            /* renamed from: h */
            public final /* synthetic */ String f99222h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26339a(C45436n13 c45436n13, String str) {
                super(0);
                this.f99221g = c45436n13;
                this.f99222h = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f99221g.f99217f.accept(EnumC3010H2.PARKING_NEAR_TO_NEST_ACTION);
                this.f99221g.f99214c.mo55905y(new C46766pG3(null, null, null, this.f99222h, true, 7, null));
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: n13$c$b */
        /* loaded from: classes2.dex */
        public static final class C26340b extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ C45436n13 f99223g;

            /* renamed from: h */
            public final /* synthetic */ String f99224h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26340b(C45436n13 c45436n13, String str) {
                super(0);
                this.f99223g = c45436n13;
                this.f99224h = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f99223g.f99214c.mo55905y(new C46766pG3(null, null, null, this.f99224h, false, 7, null));
            }
        }

        public C26338c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends FH3> pair) {
            invoke2((Pair<Unit, ? extends FH3>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, ? extends FH3> pair) {
            ParkingNest m64762e;
            FH3 component2 = pair.component2();
            if (component2 instanceof C32109Cd1) {
                C38435bF0 mo21502g = C45436n13.this.f99212a.mo21502g();
                String id = (mo21502g == null || (m64762e = mo21502g.m64762e()) == null) ? null : m64762e.getId();
                InterfaceC47808r13 interfaceC47808r13 = C45436n13.this.f99215d;
                C26339a c26339a = new C26339a(C45436n13.this, id);
                C26340b c26340b = new C26340b(C45436n13.this, id);
                C51916xx1 c51916xx1 = C51916xx1.f118396a;
                Context context = C45436n13.this.f99213b;
                Float m111967h = ((C32109Cd1) component2).m111967h();
                interfaceC47808r13.mo14880Kg(c26339a, c26340b, c51916xx1.m4403i(context, m111967h != null ? m111967h.floatValue() : 0.0d));
            }
        }
    }

    public C45436n13(InterfaceC46164oF3 parkingManager, Context context, InterfaceC1880Ea analyticsManager, InterfaceC47808r13 nearParkingNestBannerUi, ScopeProvider scopeProvider, C45168ma4<EnumC3010H2> locationWrongClicks) {
        Intrinsics.checkNotNullParameter(parkingManager, "parkingManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(nearParkingNestBannerUi, "nearParkingNestBannerUi");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(locationWrongClicks, "locationWrongClicks");
        this.f99212a = parkingManager;
        this.f99213b = context;
        this.f99214c = analyticsManager;
        this.f99215d = nearParkingNestBannerUi;
        this.f99216e = scopeProvider;
        this.f99217f = locationWrongClicks;
    }

    /* renamed from: d */
    public static final void m24574d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public static final void m24573e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m24572f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // co.bird.android.model.FlightBanner
    public Observable<Unit> closeImmediately() {
        return FlightBanner.DefaultImpls.closeImmediately(this);
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerRemoved() {
        FlightBanner.DefaultImpls.onBannerRemoved(this);
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerShown() {
        Observable<FH3> observeOn = this.f99212a.mo21501i().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "parkingManager.parkingSt…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f99216e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26336a c26336a = new C26336a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: k13
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45436n13.m24574d(Function1.this, obj);
            }
        });
        Observable<Unit> mo14879Kk = this.f99215d.mo14879Kk();
        final C26337b c26337b = new C26337b();
        Observable<Unit> doOnNext = mo14879Kk.doOnNext(new InterfaceC23484g() { // from class: l13
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45436n13.m24573e(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun onBannerSho…  )\n        }\n      }\n  }");
        Object m33094as2 = C24527f.m31950a(doOnNext, this.f99212a.mo21501i()).m33094as(AutoDispose.m45239a(this.f99216e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26338c c26338c = new C26338c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: m13
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45436n13.m24572f(Function1.this, obj);
            }
        });
    }
}
