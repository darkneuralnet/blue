package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.analytics.BirdPayOnboardingScreenViewedSource;
import co.bird.android.model.wire.configs.BirdPayTutorialConfig;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
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
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"LVO;", "LSO;", "Lco/bird/android/model/analytics/BirdPayOnboardingScreenViewedSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "", C17296a.f69688o, "Lco/bird/android/model/wire/configs/BirdPayTutorialConfig;", "tutorialConfig", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LXO;", "b", "LXO;", "ui", "Le13;", "c", "Le13;", "navigator", "LTq4;", "LTq4;", "reactiveConfig", "LEa;", "e", "LEa;", "analyticsManager", "LAG;", "", "kotlin.jvm.PlatformType", "f", "LAG;", "selectedStepSubject", "<init>", "(Lcom/uber/autodispose/ScopeProvider;LXO;Le13;LTq4;LEa;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdPayTutorialPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPayTutorialPresenter.kt\nco/bird/android/app/feature/birdpay/tutorial/BirdPayTutorialPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,79:1\n180#2:80\n180#2:81\n*S KotlinDebug\n*F\n+ 1 BirdPayTutorialPresenter.kt\nco/bird/android/app/feature/birdpay/tutorial/BirdPayTutorialPresenterImpl\n*L\n58#1:80\n70#1:81\n*E\n"})
/* renamed from: VO */
/* loaded from: classes2.dex */
public final class C8642VO implements InterfaceC7418SO {

    /* renamed from: a */
    public final ScopeProvider f39040a;

    /* renamed from: b */
    public final InterfaceC9408XO f39041b;

    /* renamed from: c */
    public final InterfaceC40099e13 f39042c;

    /* renamed from: d */
    public final C36207Tq4 f39043d;

    /* renamed from: e */
    public final InterfaceC1880Ea f39044e;

    /* renamed from: f */
    public final C0058AG<Integer> f39045f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "index", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: VO$a */
    /* loaded from: classes2.dex */
    public static final class C8643a extends Lambda implements Function1<Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ BirdPayTutorialConfig f39046g;

        /* renamed from: h */
        public final /* synthetic */ C8642VO f39047h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8643a(BirdPayTutorialConfig birdPayTutorialConfig, C8642VO c8642vo) {
            super(1);
            this.f39046g = birdPayTutorialConfig;
            this.f39047h = c8642vo;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer index) {
            int size = this.f39046g.getSteps().size();
            Intrinsics.checkNotNullExpressionValue(index, "index");
            if (size <= index.intValue()) {
                this.f39047h.f39042c.close();
            } else {
                this.f39047h.f39041b.mo75129c(this.f39046g.getSteps().get(index.intValue()));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: VO$b */
    /* loaded from: classes2.dex */
    public static final class C8644b extends Lambda implements Function1<Pair<? extends Unit, ? extends Integer>, Unit> {
        public C8644b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends Integer> pair) {
            invoke2((Pair<Unit, Integer>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, Integer> pair) {
            Integer component2 = pair.component2();
            C8642VO.this.f39044e.mo55905y(new C27281pO(null, null, null, component2.intValue(), 7, null));
            C8642VO.this.f39045f.accept(Integer.valueOf(component2.intValue() + 1));
        }
    }

    public C8642VO(ScopeProvider scopeProvider, InterfaceC9408XO ui, InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f39040a = scopeProvider;
        this.f39041b = ui;
        this.f39042c = navigator;
        this.f39043d = reactiveConfig;
        this.f39044e = analyticsManager;
        C0058AG<Integer> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<Int>()");
        this.f39045f = m115951g;
    }

    /* renamed from: e */
    public static final void m79900e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m79899f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC7418SO
    /* renamed from: a */
    public void mo79904a(BirdPayOnboardingScreenViewedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        BirdPayTutorialConfig tutorialConfig = this.f39043d.m82623f8().m73665a().getBirdPayConfig().getTutorialConfig();
        boolean z = false;
        if (tutorialConfig != null && tutorialConfig.getEnabled() && (!tutorialConfig.getSteps().isEmpty())) {
            z = true;
        }
        if (z) {
            BirdPayTutorialConfig tutorialConfig2 = this.f39043d.m82623f8().m73665a().getBirdPayConfig().getTutorialConfig();
            Intrinsics.checkNotNull(tutorialConfig2);
            m79901d(source, tutorialConfig2);
            return;
        }
        this.f39042c.close();
    }

    /* renamed from: d */
    public final void m79901d(BirdPayOnboardingScreenViewedSource birdPayOnboardingScreenViewedSource, BirdPayTutorialConfig birdPayTutorialConfig) {
        InterfaceC1880Ea interfaceC1880Ea = this.f39044e;
        String lowerCase = birdPayOnboardingScreenViewedSource.name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        interfaceC1880Ea.mo55905y(new C27590qO(null, null, null, lowerCase, 7, null));
        this.f39041b.mo75127e(birdPayTutorialConfig.getSteps().size());
        this.f39041b.mo75128d(birdPayTutorialConfig.getNavigationTitle());
        Observable<Integer> observeOn = this.f39045f.distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "selectedStepSubject\n    …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f39040a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8643a c8643a = new C8643a(birdPayTutorialConfig, this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: TO
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C8642VO.m79900e(Function1.this, obj);
            }
        });
        Observable observeOn2 = C24527f.m31950a(this.f39041b.mo75130b(), this.f39045f).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.actionButtonClicks()\n…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f39040a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8644b c8644b = new C8644b();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: UO
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C8642VO.m79899f(Function1.this, obj);
            }
        });
        this.f39045f.accept(0);
    }
}
