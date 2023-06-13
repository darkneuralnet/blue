package p000;

import android.content.Context;
import android.widget.Button;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.ridertutorial.widget.BeginnerModeBottomView;
import co.bird.api.response.BeginnerModeOnboardingAction;
import co.bird.api.response.BeginnerModeOnboardingResponse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24522d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C27204pG;
import p000.C36298Ua5;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\b\u0001\u0010\u0010\u001a\u00020\r\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR:\u0010\"\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020  \u001a*\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001e0\u001e0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001c¨\u0006%"}, m28432d2 = {"LpG;", "LUa5$b;", "", C17296a.f69688o, "Lio/reactivex/Observable;", "closeImmediately", "Lfa5;", "Lfa5;", "riderProfileManager", "Landroid/content/Context;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LZa5;", "c", "LZa5;", "parentUi", "Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeBottomView;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeBottomView;", "beginnerModeBottomView", "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lma4;", "kotlin.jvm.PlatformType", "f", "Lma4;", "closeImmediatelyRelay", "Lkotlin/Pair;", "", "Landroid/widget/Button;", "g", "buttonClicks", "<init>", "(Lfa5;Landroid/content/Context;LZa5;Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeBottomView;Lcom/uber/autodispose/ScopeProvider;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBeginnerModeBottomViewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginnerModeBottomViewPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/BeginnerModeBottomViewPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,76:1\n180#2:77\n237#2:78\n*S KotlinDebug\n*F\n+ 1 BeginnerModeBottomViewPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/BeginnerModeBottomViewPresenterImpl\n*L\n54#1:77\n70#1:78\n*E\n"})
/* renamed from: pG */
/* loaded from: classes2.dex */
public final class C27204pG implements C36298Ua5.InterfaceC8314b {

    /* renamed from: a */
    public final InterfaceC41018fa5 f103349a;

    /* renamed from: b */
    public final Context f103350b;

    /* renamed from: c */
    public final InterfaceC37468Za5 f103351c;

    /* renamed from: d */
    public final BeginnerModeBottomView f103352d;

    /* renamed from: e */
    public final ScopeProvider f103353e;

    /* renamed from: f */
    public final C45168ma4<Unit> f103354f;

    /* renamed from: g */
    public final C45168ma4<Pair<String, Button>> f103355g;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/api/response/BeginnerModeOnboardingResponse;", "it", "Lio/reactivex/B;", "Lkotlin/Pair;", "", "Landroid/widget/Button;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/api/response/BeginnerModeOnboardingResponse;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBeginnerModeBottomViewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginnerModeBottomViewPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/BeginnerModeBottomViewPresenterImpl$onTutorialStepShown$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1549#2:77\n1620#2,3:78\n*S KotlinDebug\n*F\n+ 1 BeginnerModeBottomViewPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/BeginnerModeBottomViewPresenterImpl$onTutorialStepShown$1\n*L\n46#1:77\n46#1:78,3\n*E\n"})
    /* renamed from: pG$a */
    /* loaded from: classes2.dex */
    public static final class C27205a extends Lambda implements Function1<BeginnerModeOnboardingResponse, InterfaceC23434B<? extends Pair<? extends String, ? extends Button>>> {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Landroid/widget/Button;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Unit;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: pG$a$a */
        /* loaded from: classes2.dex */
        public static final class C27206a extends Lambda implements Function1<Unit, Pair<? extends String, ? extends Button>> {

            /* renamed from: g */
            public final /* synthetic */ BeginnerModeOnboardingAction f103357g;

            /* renamed from: h */
            public final /* synthetic */ Button f103358h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27206a(BeginnerModeOnboardingAction beginnerModeOnboardingAction, Button button) {
                super(1);
                this.f103357g = beginnerModeOnboardingAction;
                this.f103358h = button;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Pair<String, Button> invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Pair<>(this.f103357g.getAccelerationLevel(), this.f103358h);
            }
        }

        public C27205a() {
            super(1);
        }

        /* renamed from: c */
        public static final Pair m19687c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends Pair<String, Button>> invoke(BeginnerModeOnboardingResponse it) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(it, "it");
            List<BeginnerModeOnboardingAction> actions = it.getActions();
            C27204pG c27204pG = C27204pG.this;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(actions, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (BeginnerModeOnboardingAction beginnerModeOnboardingAction : actions) {
                Button m59415a = c27204pG.f103352d.m59415a(beginnerModeOnboardingAction.getHighlighted(), beginnerModeOnboardingAction.getTitle());
                Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(m59415a, 0L, 1, null);
                final C27206a c27206a = new C27206a(beginnerModeOnboardingAction, m59415a);
                arrayList.add(clicksThrottle$default.map(new InterfaceC23492o() { // from class: oG
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair m19687c;
                        m19687c = C27204pG.C27205a.m19687c(Function1.this, obj);
                        return m19687c;
                    }
                }));
            }
            return C24522d.m31958a(arrayList);
        }
    }

    public C27204pG(InterfaceC41018fa5 riderProfileManager, Context context, InterfaceC37468Za5 parentUi, BeginnerModeBottomView beginnerModeBottomView, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(riderProfileManager, "riderProfileManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parentUi, "parentUi");
        Intrinsics.checkNotNullParameter(beginnerModeBottomView, "beginnerModeBottomView");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f103349a = riderProfileManager;
        this.f103350b = context;
        this.f103351c = parentUi;
        this.f103352d = beginnerModeBottomView;
        this.f103353e = scopeProvider;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f103354f = m25409g;
        C45168ma4<Pair<String, Button>> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Pair<String, Button>>()");
        this.f103355g = m25409g2;
    }

    /* renamed from: d */
    public static final InterfaceC23434B m19691d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: e */
    public static final InterfaceC23496h m19690e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.C36298Ua5.InterfaceC8314b
    /* renamed from: a */
    public void mo7057a() {
        Observable m74576S = C37279Yf5.m74576S(this.f103349a.mo30290a());
        final C27205a c27205a = new C27205a();
        Observable flatMap = m74576S.flatMap(new InterfaceC23492o() { // from class: mG
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m19691d;
                m19691d = C27204pG.m19691d(Function1.this, obj);
                return m19691d;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "override fun onTutorialS…r)\n      .subscribe()\n  }");
        Object m33094as = flatMap.m33094as(AutoDispose.m45239a(this.f103353e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe(this.f103355g);
        C45168ma4<Pair<String, Button>> c45168ma4 = this.f103355g;
        final C27207b c27207b = new C27207b();
        AbstractC23461c m33066T = c45168ma4.switchMapCompletable(new InterfaceC23492o() { // from class: nG
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m19690e;
                m19690e = C27204pG.m19690e(Function1.this, obj);
                return m19690e;
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "override fun onTutorialS…r)\n      .subscribe()\n  }");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(this.f103353e));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    @Override // p000.C36298Ua5.InterfaceC8314b
    public Observable<Unit> closeImmediately() {
        Observable<Unit> hide = this.f103354f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "closeImmediatelyRelay.hide()");
        return hide;
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "Landroid/widget/Button;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pG$b */
    /* loaded from: classes2.dex */
    public static final class C27207b extends Lambda implements Function1<Pair<? extends String, ? extends Button>, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: pG$b$a */
        /* loaded from: classes2.dex */
        public static final class C27208a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Button f103360g;

            /* renamed from: h */
            public final /* synthetic */ C27204pG f103361h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27208a(Button button, C27204pG c27204pG) {
                super(1);
                this.f103360g = button;
                this.f103361h = c27204pG;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f103360g.setError(this.f103361h.f103350b.getString(C45871nl4.error_generic_body));
            }
        }

        public C27207b() {
            super(1);
        }

        /* renamed from: c */
        public static final void m19684c(C27204pG this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f103354f.accept(Unit.INSTANCE);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<String, ? extends Button> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            AbstractC23461c m33070P = C27204pG.this.f103349a.mo30286e(pair.component1()).m33070P(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33070P, "riderProfileManager.setR…dSchedulers.mainThread())");
            AbstractC23461c progress$default = C28237sD.progress$default(m33070P, C27204pG.this.f103351c, 0, 2, (Object) null);
            final C27208a c27208a = new C27208a(pair.component2(), C27204pG.this);
            AbstractC23461c m33084B = progress$default.m33084B(new InterfaceC23484g() { // from class: qG
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C27204pG.C27207b.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C27204pG c27204pG = C27204pG.this;
            return m33084B.m33029z(new InterfaceC23478a() { // from class: rG
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C27204pG.C27207b.m19684c(C27204pG.this);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends String, ? extends Button> pair) {
            return invoke2((Pair<String, ? extends Button>) pair);
        }
    }
}
