package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Deal;
import co.bird.android.model.DealKt;
import co.bird.android.model.FlightBanner;
import co.bird.android.model.User;
import co.bird.android.model.analytics.BonusDealBannerShown;
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
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LBT0;", "Lco/bird/android/model/FlightBanner;", "", "onBannerShown", "LJT0;", C17296a.f69688o, "LJT0;", "dealManager", "Lgl;", "b", "Lgl;", "preference", "LEa;", "c", "LEa;", "analyticsManager", "LFT0;", DateTokenConverter.CONVERTER_KEY, "LFT0;", "ui", "Le13;", "e", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(LJT0;Lgl;LEa;LFT0;Le13;Lcom/uber/autodispose/ScopeProvider;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDealBannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DealBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/DealBannerPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,63:1\n180#2:64\n180#2:65\n*S KotlinDebug\n*F\n+ 1 DealBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/DealBannerPresenterImpl\n*L\n49#1:64\n57#1:65\n*E\n"})
/* renamed from: BT0 */
/* loaded from: classes2.dex */
public final class BT0 implements FlightBanner {

    /* renamed from: a */
    public final JT0 f2339a;

    /* renamed from: b */
    public final C22454gl f2340b;

    /* renamed from: c */
    public final InterfaceC1880Ea f2341c;

    /* renamed from: d */
    public final FT0 f2342d;

    /* renamed from: e */
    public final InterfaceC40099e13 f2343e;

    /* renamed from: f */
    public final ScopeProvider f2344f;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00050\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Deal;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: BT0$a */
    /* loaded from: classes2.dex */
    public static final class C0615a extends Lambda implements Function1<Pair<? extends Integer, ? extends Optional<Deal>>, Boolean> {

        /* renamed from: g */
        public static final C0615a f2345g = new C0615a();

        public C0615a() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Integer, Optional<Deal>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return Boolean.valueOf(pair.component2().m59037c());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Integer, ? extends Optional<Deal>> pair) {
            return invoke2((Pair<Integer, Optional<Deal>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00060\u00060\u0001H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lco/bird/android/model/Deal;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lco/bird/android/buava/Optional;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: BT0$b */
    /* loaded from: classes2.dex */
    public static final class C0616b extends Lambda implements Function1<Pair<? extends Integer, ? extends Optional<Deal>>, Pair<? extends Integer, ? extends Deal>> {

        /* renamed from: g */
        public static final C0616b f2346g = new C0616b();

        public C0616b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Deal> invoke(Pair<? extends Integer, ? extends Optional<Deal>> pair) {
            return invoke2((Pair<Integer, Optional<Deal>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Pair<Integer, Deal> invoke2(Pair<Integer, Optional<Deal>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return TuplesKt.m28425to(Integer.valueOf(pair.component1().intValue()), pair.component2().m59038b());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/Deal;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: BT0$c */
    /* loaded from: classes2.dex */
    public static final class C0617c extends Lambda implements Function1<Pair<? extends Integer, ? extends Deal>, Unit> {
        public C0617c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Integer, ? extends Deal> pair) {
            invoke2((Pair<Integer, Deal>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Integer, Deal> pair) {
            Deal copy;
            InterfaceC40099e13 interfaceC40099e13 = BT0.this.f2343e;
            copy = r1.copy((r28 & 1) != 0 ? r1.type : null, (r28 & 2) != 0 ? r1.f66584id : null, (r28 & 4) != 0 ? r1.addAmount : 0, (r28 & 8) != 0 ? r1.duration : pair.component1().intValue(), (r28 & 16) != 0 ? r1.currency : null, (r28 & 32) != 0 ? r1.expiresAt : null, (r28 & 64) != 0 ? r1.bannerTitle : null, (r28 & 128) != 0 ? r1.bannerSubtitle : null, (r28 & 256) != 0 ? r1.title : null, (r28 & 512) != 0 ? r1.subtitle : null, (r28 & 1024) != 0 ? r1.accept : null, (r28 & 2048) != 0 ? r1.reject : null, (r28 & 4096) != 0 ? pair.component2().shownAt : null);
            interfaceC40099e13.mo37020g1(copy);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", C17296a.f69688o, "(Ljava/lang/Integer;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: BT0$d */
    /* loaded from: classes2.dex */
    public static final class C0618d extends Lambda implements Function1<Integer, Boolean> {

        /* renamed from: g */
        public static final C0618d f2348g = new C0618d();

        public C0618d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Integer it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: BT0$e */
    /* loaded from: classes2.dex */
    public static final class C0619e extends Lambda implements Function1<Integer, Unit> {
        public C0619e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer num) {
            BT0.this.f2342d.mo103836a();
        }
    }

    public BT0(JT0 dealManager, C22454gl preference, InterfaceC1880Ea analyticsManager, FT0 ui, InterfaceC40099e13 navigator, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(dealManager, "dealManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f2339a = dealManager;
        this.f2340b = preference;
        this.f2341c = analyticsManager;
        this.f2342d = ui;
        this.f2343e = navigator;
        this.f2344f = scopeProvider;
    }

    /* renamed from: f */
    public static final boolean m114019f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: g */
    public static final Pair m114018g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m114017h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final boolean m114016i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: j */
    public static final void m114015j(Function1 tmp0, Object obj) {
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
        Deal copy;
        String str;
        Deal m59035e = this.f2339a.mo92271e().getValue().m59035e();
        if (m59035e != null) {
            this.f2339a.mo92269g(m59035e);
            FT0 ft0 = this.f2342d;
            copy = m59035e.copy((r28 & 1) != 0 ? m59035e.type : null, (r28 & 2) != 0 ? m59035e.f66584id : null, (r28 & 4) != 0 ? m59035e.addAmount : 0, (r28 & 8) != 0 ? m59035e.duration : DealKt.remainingSeconds(m59035e), (r28 & 16) != 0 ? m59035e.currency : null, (r28 & 32) != 0 ? m59035e.expiresAt : null, (r28 & 64) != 0 ? m59035e.bannerTitle : null, (r28 & 128) != 0 ? m59035e.bannerSubtitle : null, (r28 & 256) != 0 ? m59035e.title : null, (r28 & 512) != 0 ? m59035e.subtitle : null, (r28 & 1024) != 0 ? m59035e.accept : null, (r28 & 2048) != 0 ? m59035e.reject : null, (r28 & 4096) != 0 ? m59035e.shownAt : null);
            ft0.mo103833d(copy);
            InterfaceC1880Ea interfaceC1880Ea = this.f2341c;
            User m37750B0 = this.f2340b.m37750B0();
            if (m37750B0 != null) {
                str = m37750B0.getId();
            } else {
                str = null;
            }
            interfaceC1880Ea.mo55956N(new BonusDealBannerShown(m59035e, str));
        }
        Observable m31950a = C24527f.m31950a(this.f2342d.mo103834c(), this.f2339a.mo92271e());
        final C0615a c0615a = C0615a.f2345g;
        Observable filter = m31950a.filter(new InterfaceC23494q() { // from class: wT0
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m114019f;
                m114019f = BT0.m114019f(Function1.this, obj);
                return m114019f;
            }
        });
        final C0616b c0616b = C0616b.f2346g;
        Observable map = filter.map(new InterfaceC23492o() { // from class: xT0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m114018g;
                m114018g = BT0.m114018g(Function1.this, obj);
                return m114018g;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "ui.dealClicked()\n      .…Remaining to deal.get() }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(this.f2344f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0617c c0617c = new C0617c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: yT0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BT0.m114017h(Function1.this, obj);
            }
        });
        Observable<Integer> mo103835b = this.f2342d.mo103835b();
        final C0618d c0618d = C0618d.f2348g;
        Observable<Integer> observeOn = mo103835b.filter(new InterfaceC23494q() { // from class: zT0
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m114016i;
                m114016i = BT0.m114016i(Function1.this, obj);
                return m114016i;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.dealSecondsRemaining(…dSchedulers.mainThread())");
        Object m33094as2 = observeOn.m33094as(AutoDispose.m45239a(this.f2344f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0619e c0619e = new C0619e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: AT0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BT0.m114015j(Function1.this, obj);
            }
        });
    }
}
