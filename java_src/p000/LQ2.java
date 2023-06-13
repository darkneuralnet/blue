package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.FlightBanner;
import co.bird.android.model.analytics.BirdPayOnboardingScreenViewedSource;
import co.bird.android.model.wire.WireMerchantSite;
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
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"LLQ2;", "Lco/bird/android/model/FlightBanner;", "", "onBannerShown", "g", "e", "LiO;", C17296a.f69688o, "LiO;", "birdPayManager", "Ldr4;", "b", "Ldr4;", "reactiveLocationManager", "LPQ2;", "c", "LPQ2;", "merchantInfoBannerUi", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "Le13;", "navigator", "LTq4;", "f", "LTq4;", "reactiveConfig", "<init>", "(LiO;Ldr4;LPQ2;Lcom/uber/autodispose/ScopeProvider;Le13;LTq4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMerchantInfoBannerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantInfoBannerPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/MerchantInfoBannerPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,105:1\n180#2:106\n180#2:107\n180#2:108\n180#2:109\n*S KotlinDebug\n*F\n+ 1 MerchantInfoBannerPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/MerchantInfoBannerPresenterImpl\n*L\n45#1:106\n61#1:107\n81#1:108\n95#1:109\n*E\n"})
/* renamed from: LQ2 */
/* loaded from: classes2.dex */
public final class LQ2 implements FlightBanner {

    /* renamed from: a */
    public final InterfaceC23227iO f21387a;

    /* renamed from: b */
    public final InterfaceC40001dr4 f21388b;

    /* renamed from: c */
    public final PQ2 f21389c;

    /* renamed from: d */
    public final ScopeProvider f21390d;

    /* renamed from: e */
    public final InterfaceC40099e13 f21391e;

    /* renamed from: f */
    public final C36207Tq4 f21392f;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LQ2$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C4913a {
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
            try {
                iArr[TutorialAvailable.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LQ2$b */
    /* loaded from: classes2.dex */
    public static final class C4914b extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ long f21394h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4914b(long j) {
            super(1);
            this.f21394h = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            LQ2.this.f21391e.mo36922w3(this.f21394h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LQ2$c */
    /* loaded from: classes2.dex */
    public static final class C4915c extends Lambda implements Function1<Unit, Unit> {
        public C4915c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            LQ2.this.f21391e.mo37172F1(BirdPayOnboardingScreenViewedSource.MERCHANT_SITE_BANNER);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "merchantSiteOptional", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LQ2$d */
    /* loaded from: classes2.dex */
    public static final class C4916d extends Lambda implements Function1<Optional<WireMerchantSite>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ boolean f21397h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4916d(boolean z) {
            super(1);
            this.f21397h = z;
        }

        /* renamed from: a */
        public final void m96946a(Optional<WireMerchantSite> optional) {
            boolean m59037c = optional.m59037c();
            LQ2.this.f21389c.m90315e(m59037c);
            if (m59037c) {
                WireMerchantSite m59038b = optional.m59038b();
                LQ2.this.f21389c.m90316d(m59038b, C37429Yw2.f47648a.m73967d(LQ2.this.f21388b.mo43616p().m73665a(), m59038b.getLocation()));
                LQ2.this.f21389c.m90318b(this.f21397h);
                LQ2.this.f21389c.m90314f(Intrinsics.areEqual(m59038b.getBirdPayEnabled(), Boolean.TRUE));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireMerchantSite> optional) {
            m96946a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LQ2$e */
    /* loaded from: classes2.dex */
    public static final class C4917e extends Lambda implements Function1<Pair<? extends Unit, ? extends Optional<WireMerchantSite>>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f21398g;

        /* renamed from: h */
        public final /* synthetic */ LQ2 f21399h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4917e(boolean z, LQ2 lq2) {
            super(1);
            this.f21398g = z;
            this.f21399h = lq2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends Optional<WireMerchantSite>> pair) {
            invoke2((Pair<Unit, Optional<WireMerchantSite>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, Optional<WireMerchantSite>> pair) {
            Optional<WireMerchantSite> component2 = pair.component2();
            if (this.f21398g && component2.m59037c()) {
                InterfaceC40099e13.C19924a.goToMerchantPay$default(this.f21399h.f21391e, component2.m59038b().getId(), null, false, 6, null);
            } else {
                this.f21399h.f21391e.mo37177E2();
            }
        }
    }

    public LQ2(InterfaceC23227iO birdPayManager, InterfaceC40001dr4 reactiveLocationManager, PQ2 merchantInfoBannerUi, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(birdPayManager, "birdPayManager");
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        Intrinsics.checkNotNullParameter(merchantInfoBannerUi, "merchantInfoBannerUi");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f21387a = birdPayManager;
        this.f21388b = reactiveLocationManager;
        this.f21389c = merchantInfoBannerUi;
        this.f21390d = scopeProvider;
        this.f21391e = navigator;
        this.f21392f = reactiveConfig;
    }

    /* renamed from: f */
    public static final void m96951f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m96949h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m96948i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m96947j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // co.bird.android.model.FlightBanner
    public Observable<Unit> closeImmediately() {
        return FlightBanner.DefaultImpls.closeImmediately(this);
    }

    /* renamed from: e */
    public final void m96952e() {
        String bannerHelpArticleId = this.f21392f.m82623f8().m73665a().getBirdPayConfig().getBannerHelpArticleId();
        if (bannerHelpArticleId != null) {
            try {
                long parseLong = Long.parseLong(bannerHelpArticleId);
                this.f21389c.m90313g(true);
                Object m33094as = this.f21389c.m90317c().m33094as(AutoDispose.m45239a(this.f21390d));
                Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C4914b c4914b = new C4914b(parseLong);
                ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: JQ2
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        LQ2.m96951f(Function1.this, obj);
                    }
                });
            } catch (NumberFormatException e) {
                C41318g46.m40159e(e);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* renamed from: g */
    public final void m96950g() {
        this.f21389c.m90313g(true);
        Object m33094as = this.f21389c.m90317c().m33094as(AutoDispose.m45239a(this.f21390d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4915c c4915c = new C4915c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: KQ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LQ2.m96949h(Function1.this, obj);
            }
        });
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerRemoved() {
        FlightBanner.DefaultImpls.onBannerRemoved(this);
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerShown() {
        boolean enableTapToPay = this.f21392f.m82623f8().m73665a().getBirdPayConfig().getEnableTapToPay();
        Object m33094as = this.f21387a.mo27362e().m33094as(AutoDispose.m45239a(this.f21390d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4916d c4916d = new C4916d(enableTapToPay);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: HQ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LQ2.m96948i(Function1.this, obj);
            }
        });
        Observable observeOn = C24527f.m31950a(this.f21389c.m90319a(), this.f21387a.mo27362e()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "merchantInfoBannerUi.act…dSchedulers.mainThread())");
        Object m33094as2 = observeOn.m33094as(AutoDispose.m45239a(this.f21390d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4917e c4917e = new C4917e(enableTapToPay, this);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: IQ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LQ2.m96947j(Function1.this, obj);
            }
        });
        int i = C4913a.$EnumSwitchMapping$0[BirdPayConfigKt.checkConfigForTutorial(this.f21392f.m82623f8().m73665a().getBirdPayConfig()).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.f21389c.m90313g(false);
                    return;
                }
                return;
            }
            m96952e();
            return;
        }
        m96950g();
    }
}
