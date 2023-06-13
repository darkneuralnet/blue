package co.bird.android.app.feature.autopay;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.autopay.C13674a;
import co.bird.android.app.feature.autopay.InterfaceC13676b;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Balance;
import co.bird.android.model.RideState;
import co.bird.android.model.wire.configs.RideConfig;
import com.afollestad.materialdialogs.customview.DialogCustomViewExtKt;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24574u;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC44647lh6;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-¢\u0006\u0004\b1\u00102J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J&\u0010\u000e\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0007R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, m28432d2 = {"Lco/bird/android/app/feature/autopay/a;", "Lca5;", "Lco/bird/android/model/RideState;", "rideState", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "parentScopeProvider", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lio/reactivex/p;", "LDU2;", C17296a.f69688o, "", "startedForResult", DateTokenConverter.CONVERTER_KEY, "LOh;", "LOh;", "buildConfig", "Lgl;", "b", "Lgl;", "preference", "LTq4;", "c", "LTq4;", "reactiveConfig", "Llh6;", "Llh6;", "userManager", "Lqi1;", "e", "Lqi1;", "experimentManager", "LEa;", "f", "LEa;", "analyticsManager", "LJU2;", "g", "LJU2;", "modalBuilderFactory", "Lco/bird/android/app/feature/autopay/d;", "h", "Lco/bird/android/app/feature/autopay/d;", "autoPayUiFactory", "Lhr;", "i", "Lhr;", "autoPayPresenterFactory", "<init>", "(LOh;Lgl;LTq4;Llh6;Lqi1;LEa;LJU2;Lco/bird/android/app/feature/autopay/d;Lhr;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.autopay.a */
/* loaded from: classes2.dex */
public final class C13674a implements InterfaceC39222ca5 {

    /* renamed from: a */
    public final InterfaceC6097Oh f61283a;

    /* renamed from: b */
    public final C22454gl f61284b;

    /* renamed from: c */
    public final C36207Tq4 f61285c;

    /* renamed from: d */
    public final InterfaceC44647lh6 f61286d;

    /* renamed from: e */
    public final InterfaceC47617qi1 f61287e;

    /* renamed from: f */
    public final InterfaceC1880Ea f61288f;

    /* renamed from: g */
    public final JU2 f61289g;

    /* renamed from: h */
    public final InterfaceC13680d f61290h;

    /* renamed from: i */
    public final InterfaceC22771hr f61291i;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Balance;", "balance", "Lio/reactivex/u;", "LDU2;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Balance;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.autopay.a$a */
    /* loaded from: classes2.dex */
    public static final class C13675a extends Lambda implements Function1<Balance, InterfaceC24574u<? extends DU2>> {

        /* renamed from: g */
        public final /* synthetic */ RideConfig f61292g;

        /* renamed from: h */
        public final /* synthetic */ C13674a f61293h;

        /* renamed from: i */
        public final /* synthetic */ LifecycleScopeProvider<EnumC7097RE> f61294i;

        /* renamed from: j */
        public final /* synthetic */ BaseActivity f61295j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13675a(RideConfig rideConfig, C13674a c13674a, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, BaseActivity baseActivity) {
            super(1);
            this.f61292g = rideConfig;
            this.f61293h = c13674a;
            this.f61294i = lifecycleScopeProvider;
            this.f61295j = baseActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends DU2> invoke(Balance balance) {
            List listOf;
            Intrinsics.checkNotNullParameter(balance, "balance");
            if (!this.f61292g.getAutoPayPromptFirst() && this.f61292g.getAutoPayRefillAmount() != 0 && balance.getAutoPayAskedAt() == null) {
                return AbstractC24507p.m32068G(this.f61293h.m60817d(this.f61294i, this.f61295j, true));
            }
            if (!this.f61292g.getAutoPayPromptFirst() && this.f61292g.getAutoPayRefillAmount() == 0 && balance.getAutoPayAskedAt() == null && this.f61292g.getAutoPayExpName() != null) {
                InterfaceC47617qi1 interfaceC47617qi1 = this.f61293h.f61287e;
                String autoPayExpName = this.f61292g.getAutoPayExpName();
                Intrinsics.checkNotNull(autoPayExpName);
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{interfaceC47617qi1.mo15556a(autoPayExpName).m33069Q(), InterfaceC44647lh6.C25764a.updateAutoPay$default(this.f61293h.f61286d, false, true, null, 4, null).m33129h0().m33069Q()});
                return AbstractC23461c.m33074L(listOf).m33045k(AbstractC24507p.m32024u());
            }
            return AbstractC24507p.m32024u();
        }
    }

    public C13674a(InterfaceC6097Oh buildConfig, C22454gl preference, C36207Tq4 reactiveConfig, InterfaceC44647lh6 userManager, InterfaceC47617qi1 experimentManager, InterfaceC1880Ea analyticsManager, JU2 modalBuilderFactory, InterfaceC13680d autoPayUiFactory, InterfaceC22771hr autoPayPresenterFactory) {
        Intrinsics.checkNotNullParameter(buildConfig, "buildConfig");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(experimentManager, "experimentManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(modalBuilderFactory, "modalBuilderFactory");
        Intrinsics.checkNotNullParameter(autoPayUiFactory, "autoPayUiFactory");
        Intrinsics.checkNotNullParameter(autoPayPresenterFactory, "autoPayPresenterFactory");
        this.f61283a = buildConfig;
        this.f61284b = preference;
        this.f61285c = reactiveConfig;
        this.f61286d = userManager;
        this.f61287e = experimentManager;
        this.f61288f = analyticsManager;
        this.f61289g = modalBuilderFactory;
        this.f61290h = autoPayUiFactory;
        this.f61291i = autoPayPresenterFactory;
    }

    /* renamed from: c */
    public static final InterfaceC24574u m60818c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC39222ca5
    /* renamed from: a */
    public AbstractC24507p<DU2> mo60820a(RideState rideState, LifecycleScopeProvider<EnumC7097RE> parentScopeProvider, BaseActivity activity) {
        Intrinsics.checkNotNullParameter(rideState, "rideState");
        Intrinsics.checkNotNullParameter(parentScopeProvider, "parentScopeProvider");
        Intrinsics.checkNotNullParameter(activity, "activity");
        RideConfig rideConfig = this.f61285c.m82623f8().getValue().getRideConfig();
        if (rideState.getStatus() == RideState.Status.STARTED && Intrinsics.areEqual(rideConfig.getAutoPayUseFullscreenFlow(), Boolean.FALSE)) {
            AbstractC23442F<Balance> mo26979B = this.f61286d.mo26979B(rideConfig.getCurrency());
            final C13675a c13675a = new C13675a(rideConfig, this, parentScopeProvider, activity);
            AbstractC24507p m33163C = mo26979B.m33163C(new InterfaceC23492o() { // from class: Wq
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m60818c;
                    m60818c = C13674a.m60818c(Function1.this, obj);
                    return m60818c;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33163C, "override fun maybeShowMo…  Maybe.empty()\n    }\n  }");
            return m33163C;
        }
        AbstractC24507p<DU2> m32024u = AbstractC24507p.m32024u();
        Intrinsics.checkNotNullExpressionValue(m32024u, "{\n      Maybe.empty()\n    }");
        return m32024u;
    }

    @SuppressLint({"InflateParams"})
    /* renamed from: d */
    public final DU2 m60817d(LifecycleScopeProvider<EnumC7097RE> parentScopeProvider, BaseActivity activity, boolean z) {
        Intrinsics.checkNotNullParameter(parentScopeProvider, "parentScopeProvider");
        Intrinsics.checkNotNullParameter(activity, "activity");
        DU2 m102046k = this.f61289g.mo98838a(parentScopeProvider, activity).m102052e(C39311cj4.autopay, false).m102055b(false).m102046k();
        View customView = DialogCustomViewExtKt.getCustomView(m102046k.m110367l());
        ViewGroup.LayoutParams layoutParams = customView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -2;
        customView.setLayoutParams(layoutParams);
        MU2 mu2 = new MU2(this.f61283a, this.f61284b, this.f61285c, activity, this.f61288f, m102046k);
        InterfaceC22771hr interfaceC22771hr = this.f61291i;
        LifecycleScopeProvider<EnumC7097RE> m110366m = m102046k.m110366m();
        Resources resources = activity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "activity.resources");
        interfaceC22771hr.mo31758a(m110366m, resources, this.f61290h.mo60809a(activity, customView, InterfaceC13676b.EnumC13677a.MODAL), mu2, z).m37405a();
        return m102046k;
    }
}
