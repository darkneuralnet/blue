package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.FlightBanner;
import co.bird.android.model.analytics.BirdPayOnboardingScreenViewedSource;
import co.bird.android.model.offer.WireCouponOffer;
import co.bird.android.model.wire.configs.BirdPayConfigKt;
import co.bird.android.model.wire.configs.TutorialAvailable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.rxkotlin.C24527f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R8\u0010&\u001a&\u0012\f\u0012\n #*\u0004\u0018\u00010\u00020\u0002 #*\u0012\u0012\f\u0012\n #*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R8\u0010(\u001a&\u0012\f\u0012\n #*\u0004\u0018\u00010\u00020\u0002 #*\u0012\u0012\f\u0012\n #*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\"\u00103\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u000100000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00066"}, m28432d2 = {"LfN;", "Lco/bird/android/model/FlightBanner;", "", "onBannerShown", "Lio/reactivex/Observable;", "closeImmediately", "onBannerRemoved", "Landroid/view/View;", C17296a.f69688o, "Landroid/view/View;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LTq4;", "c", "LTq4;", "reactiveConfig", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "Lue3;", "e", "Lue3;", "offerManager", "LEa;", "f", "LEa;", "analyticsManager", "Landroid/widget/ImageView;", "g", "Landroid/widget/ImageView;", "closeButton", "kotlin.jvm.PlatformType", "h", "Lio/reactivex/Observable;", "bannerClicks", "i", "closeButtonClicks", "Landroid/widget/TextView;", "j", "Landroid/widget/TextView;", "title", "k", "subtitle", "LAG;", "Lco/bird/android/model/offer/WireCouponOffer;", "l", "LAG;", "offerRelay", "<init>", "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;LTq4;Le13;Lue3;LEa;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdPayBannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPayBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/BirdPayBannerPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,102:1\n180#2:103\n180#2:104\n180#2:105\n*S KotlinDebug\n*F\n+ 1 BirdPayBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/BirdPayBannerPresenter\n*L\n49#1:103\n76#1:104\n86#1:105\n*E\n"})
/* renamed from: fN */
/* loaded from: classes2.dex */
public final class C20381fN implements FlightBanner {

    /* renamed from: a */
    public final View f79979a;

    /* renamed from: b */
    public final ScopeProvider f79980b;

    /* renamed from: c */
    public final C36207Tq4 f79981c;

    /* renamed from: d */
    public final InterfaceC40099e13 f79982d;

    /* renamed from: e */
    public final InterfaceC49950ue3 f79983e;

    /* renamed from: f */
    public final InterfaceC1880Ea f79984f;

    /* renamed from: g */
    public final ImageView f79985g;

    /* renamed from: h */
    public final Observable<Unit> f79986h;

    /* renamed from: i */
    public final Observable<Unit> f79987i;

    /* renamed from: j */
    public final TextView f79988j;

    /* renamed from: k */
    public final TextView f79989k;

    /* renamed from: l */
    public final C0058AG<WireCouponOffer> f79990l;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005 \u0004* \u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/offer/WireCouponOffer;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fN$a */
    /* loaded from: classes2.dex */
    public static final class C20382a extends Lambda implements Function1<Pair<? extends Unit, ? extends WireCouponOffer>, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: fN$a$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C20383a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TutorialAvailable.values().length];
                try {
                    iArr[TutorialAvailable.TUTORIAL_CONFIG.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TutorialAvailable.ZENDESK_ARTICLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C20382a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends WireCouponOffer> pair) {
            invoke2((Pair<Unit, WireCouponOffer>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, WireCouponOffer> pair) {
            WireCouponOffer component2 = pair.component2();
            C20381fN.this.f79984f.mo55905y(new C48172re3(null, null, null, component2.getCampaignId(), "offer", component2.getAction().getKind(), null, null, 199, null));
            int i = C20383a.$EnumSwitchMapping$0[BirdPayConfigKt.checkConfigForTutorial(C20381fN.this.f79981c.m82623f8().m73665a().getBirdPayConfig()).ordinal()];
            if (i == 1) {
                C20381fN.this.f79982d.mo37172F1(BirdPayOnboardingScreenViewedSource.MERCHANT_OFFER_BANNER);
            } else if (i != 2) {
            } else {
                try {
                    String bannerHelpArticleId = C20381fN.this.f79981c.m82623f8().m73665a().getBirdPayConfig().getBannerHelpArticleId();
                    Long valueOf = bannerHelpArticleId != null ? Long.valueOf(Long.parseLong(bannerHelpArticleId)) : null;
                    if (valueOf != null) {
                        C20381fN.this.f79982d.mo36922w3(valueOf.longValue());
                    }
                } catch (Exception e) {
                    C41318g46.m40159e(e);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "offers", "", "Lco/bird/android/model/offer/WireCouponOffer;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fN$b */
    /* loaded from: classes2.dex */
    public static final class C20384b extends Lambda implements Function1<List<? extends WireCouponOffer>, Unit> {
        public C20384b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireCouponOffer> list) {
            invoke2((List<WireCouponOffer>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireCouponOffer> offers) {
            Object firstOrNull;
            Unit unit;
            Intrinsics.checkNotNullExpressionValue(offers, "offers");
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) offers);
            WireCouponOffer wireCouponOffer = (WireCouponOffer) firstOrNull;
            if (wireCouponOffer != null) {
                C20381fN.this.f79990l.accept(wireCouponOffer);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C49520tu6.show$default(C20381fN.this.f79979a, false, 0, 2, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fN$c */
    /* loaded from: classes2.dex */
    public static final class C20385c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20385c f79993g = new C20385c();

        public C20385c() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/offer/WireCouponOffer;", "kotlin.jvm.PlatformType", "offer", "", C17296a.f69688o, "(Lco/bird/android/model/offer/WireCouponOffer;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fN$d */
    /* loaded from: classes2.dex */
    public static final class C20386d extends Lambda implements Function1<WireCouponOffer, Unit> {
        public C20386d() {
            super(1);
        }

        /* renamed from: a */
        public final void m41481a(WireCouponOffer wireCouponOffer) {
            C20381fN.this.f79988j.setText(wireCouponOffer.getUi().getBannerTitle());
            C20381fN.this.f79989k.setText(wireCouponOffer.getUi().getBannerBody());
            C20381fN.this.f79984f.mo55905y(new C47579qe3(null, null, null, wireCouponOffer.getCampaignId(), "offer", wireCouponOffer.getAction().getKind(), null, null, 199, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireCouponOffer wireCouponOffer) {
            m41481a(wireCouponOffer);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fN$e */
    /* loaded from: classes2.dex */
    public static final class C20387e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20387e f79995g = new C20387e();

        public C20387e() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    public C20381fN(View ui, ScopeProvider scopeProvider, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator, InterfaceC49950ue3 offerManager, InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(offerManager, "offerManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f79979a = ui;
        this.f79980b = scopeProvider;
        this.f79981c = reactiveConfig;
        this.f79982d = navigator;
        this.f79983e = offerManager;
        this.f79984f = analyticsManager;
        ImageView imageView = (ImageView) C49520tu6.m11243h(ui, C36585Vg4.closeButton);
        this.f79985g = imageView;
        this.f79986h = C44626lf5.clicksThrottle$default(ui, 0L, 1, null).share();
        this.f79987i = C44626lf5.clicksThrottle$default(imageView, 0L, 1, null).share();
        this.f79988j = (TextView) C49520tu6.m11243h(ui, C36585Vg4.title);
        this.f79989k = (TextView) C49520tu6.m11243h(ui, C36585Vg4.body);
        C0058AG<WireCouponOffer> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<WireCouponOffer>()");
        this.f79990l = m115951g;
    }

    /* renamed from: f */
    public static final void m41486f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m41485g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m41484h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m41483i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m41482j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // co.bird.android.model.FlightBanner
    public Observable<Unit> closeImmediately() {
        Observable<Unit> merge = Observable.merge(this.f79986h, this.f79987i);
        Intrinsics.checkNotNullExpressionValue(merge, "merge(bannerClicks, closeButtonClicks)");
        return merge;
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerRemoved() {
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerShown() {
        Observable<Unit> bannerClicks = this.f79986h;
        Intrinsics.checkNotNullExpressionValue(bannerClicks, "bannerClicks");
        Observable observeOn = C24527f.m31950a(bannerClicks, this.f79990l).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "bannerClicks\n      .with…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f79980b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20382a c20382a = new C20382a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: aN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C20381fN.m41486f(Function1.this, obj);
            }
        });
        Observable<List<WireCouponOffer>> observeOn2 = this.f79983e.mo3141a().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "offerManager.offers\n    …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f79980b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20384b c20384b = new C20384b();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: bN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C20381fN.m41485g(Function1.this, obj);
            }
        };
        final C20385c c20385c = C20385c.f79993g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: cN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C20381fN.m41484h(Function1.this, obj);
            }
        });
        Observable<WireCouponOffer> observeOn3 = this.f79990l.distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "offerRelay\n      .distin…dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f79980b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20386d c20386d = new C20386d();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: dN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C20381fN.m41483i(Function1.this, obj);
            }
        };
        final C20387e c20387e = C20387e.f79995g;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: eN
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C20381fN.m41482j(Function1.this, obj);
            }
        });
    }
}
