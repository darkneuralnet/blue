package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.RideState;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.ridertutorial.TutorialKind;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC24507p;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b(\u0010)J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J2\u0010\u0013\u001a\u0004\u0018\u00010\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u0012H\u0003R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, m28432d2 = {"LLa5;", "Lca5;", "Lco/bird/android/model/RideState;", "rideState", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "parentScopeProvider", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lio/reactivex/p;", "LDU2;", C17296a.f69688o, "", "birdModel", "c", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/ridertutorial/TutorialKind;", "tutorialKind", "Lco/bird/android/model/constant/BirdModel;", "e", "LOh;", "LOh;", "buildConfig", "LVa5;", "b", "LVa5;", "presenterFactory", "Lgl;", "Lgl;", "preference", "LEa;", "LEa;", "analyticsManager", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LTq4;", "f", "LTq4;", "reactiveConfig", "<init>", "(LOh;LVa5;Lgl;LEa;Landroid/content/Context;LTq4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRiderTutorialModalPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderTutorialModalPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/RiderTutorialModalPresenter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,124:1\n1#2:125\n180#3:126\n*S KotlinDebug\n*F\n+ 1 RiderTutorialModalPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/RiderTutorialModalPresenter\n*L\n119#1:126\n*E\n"})
/* renamed from: La5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34192La5 implements InterfaceC39222ca5 {

    /* renamed from: a */
    public final InterfaceC6097Oh f21715a;

    /* renamed from: b */
    public final InterfaceC36532Va5 f21716b;

    /* renamed from: c */
    public final C22454gl f21717c;

    /* renamed from: d */
    public final InterfaceC1880Ea f21718d;

    /* renamed from: e */
    public final Context f21719e;

    /* renamed from: f */
    public final C36207Tq4 f21720f;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: La5$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C5031a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RideState.Status.values().length];
            try {
                iArr[RideState.Status.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RideState.Status.ENDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: La5$b */
    /* loaded from: classes2.dex */
    public static final class C5032b extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ MU2 f21721g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5032b(MU2 mu2) {
            super(1);
            this.f21721g = mu2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            this.f21721g.close();
        }
    }

    public C34192La5(InterfaceC6097Oh buildConfig, InterfaceC36532Va5 presenterFactory, C22454gl preference, InterfaceC1880Ea analyticsManager, Context context, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(buildConfig, "buildConfig");
        Intrinsics.checkNotNullParameter(presenterFactory, "presenterFactory");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f21715a = buildConfig;
        this.f21716b = presenterFactory;
        this.f21717c = preference;
        this.f21718d = analyticsManager;
        this.f21719e = context;
        this.f21720f = reactiveConfig;
    }

    /* renamed from: f */
    public static final void m96618f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC39222ca5
    /* renamed from: a */
    public AbstractC24507p<DU2> mo60820a(RideState rideState, LifecycleScopeProvider<EnumC7097RE> parentScopeProvider, BaseActivity activity) {
        String str;
        Intrinsics.checkNotNullParameter(rideState, "rideState");
        Intrinsics.checkNotNullParameter(parentScopeProvider, "parentScopeProvider");
        Intrinsics.checkNotNullParameter(activity, "activity");
        WireBird bird = rideState.getRide().getBird();
        if (bird != null) {
            str = bird.getModel();
        } else {
            str = null;
        }
        int i = C5031a.$EnumSwitchMapping$0[rideState.getStatus().ordinal()];
        if (i != 1) {
            if (i != 2) {
                AbstractC24507p<DU2> m32024u = AbstractC24507p.m32024u();
                Intrinsics.checkNotNullExpressionValue(m32024u, "empty<Modal>()");
                return m32024u;
            }
            return m96620d(str, parentScopeProvider, activity);
        }
        return m96621c(str, parentScopeProvider, activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC24507p<DU2> m96621c(String str, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, BaseActivity baseActivity) {
        Pair pair;
        String str2;
        AbstractC24507p<DU2> abstractC24507p;
        DU2 du2;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 3088) {
                if (hashCode != 3089) {
                    if (hashCode != 3137) {
                        if (hashCode != 3246) {
                            if (hashCode == 3297957 && str.equals("m365")) {
                                pair = new Pair(TutorialKind.CONTEXTUAL_M365, str);
                            }
                        } else if (str.equals("es")) {
                            pair = new Pair(TutorialKind.CONTEXTUAL_ES, str);
                        }
                    } else if (str.equals("bc")) {
                        pair = new Pair(TutorialKind.CONTEXTUAL_BC, str);
                    }
                } else if (str.equals("b3")) {
                    pair = new Pair(TutorialKind.CONTEXTUAL_B3, str);
                }
            } else if (str.equals("b2")) {
                pair = new Pair(TutorialKind.CONTEXTUAL_B2, str);
            }
            TutorialKind tutorialKind = (TutorialKind) pair.component1();
            str2 = (String) pair.component2();
            abstractC24507p = null;
            if (this.f21717c.m37666W0(str2)) {
                this.f21717c.m37692P2(str2);
                du2 = m96619e(lifecycleScopeProvider, baseActivity, tutorialKind, BirdModel.Companion.fromString(str));
            } else {
                du2 = null;
            }
            if (du2 != null) {
                abstractC24507p = AbstractC24507p.m32068G(du2);
            }
            if (abstractC24507p != null) {
                AbstractC24507p<DU2> m32024u = AbstractC24507p.m32024u();
                Intrinsics.checkNotNullExpressionValue(m32024u, "empty()");
                return m32024u;
            }
            return abstractC24507p;
        }
        pair = new Pair(TutorialKind.CLASS_SCOOTER, "");
        TutorialKind tutorialKind2 = (TutorialKind) pair.component1();
        str2 = (String) pair.component2();
        abstractC24507p = null;
        if (this.f21717c.m37666W0(str2)) {
        }
        if (du2 != null) {
        }
        if (abstractC24507p != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC24507p<DU2> m96620d(String str, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, BaseActivity baseActivity) {
        DU2 m96619e;
        AbstractC24507p<DU2> abstractC24507p = null;
        if (str != null) {
            if (Intrinsics.areEqual(str, "bc")) {
                if (!this.f21717c.m37658Y0()) {
                    this.f21717c.m37680S2();
                    m96619e = m96619e(lifecycleScopeProvider, baseActivity, TutorialKind.CLASS_MOPED_PARKING, BirdModel.Companion.fromString(str));
                }
            } else if (!this.f21717c.m37644b1()) {
                this.f21717c.m37664W2();
                m96619e = m96619e(lifecycleScopeProvider, baseActivity, TutorialKind.CLASS_SCOOTER_PARKING, BirdModel.Companion.fromString(str));
            }
            if (m96619e != null) {
                abstractC24507p = AbstractC24507p.m32068G(m96619e);
            }
            if (abstractC24507p != null) {
                AbstractC24507p<DU2> m32024u = AbstractC24507p.m32024u();
                Intrinsics.checkNotNullExpressionValue(m32024u, "empty()");
                return m32024u;
            }
            return abstractC24507p;
        }
        m96619e = null;
        if (m96619e != null) {
        }
        if (abstractC24507p != null) {
        }
    }

    @SuppressLint({"InflateParams"})
    /* renamed from: e */
    public final DU2 m96619e(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, BaseActivity baseActivity, TutorialKind tutorialKind, BirdModel birdModel) {
        View contentView = LayoutInflater.from(this.f21719e).inflate(C39311cj4.rider_tutorial_modal_dark, (ViewGroup) null);
        IU2 iu2 = new IU2(lifecycleScopeProvider, baseActivity);
        Intrinsics.checkNotNullExpressionValue(contentView, "contentView");
        DU2 m102046k = iu2.m102051f(contentView, false).m102054c().m102046k();
        C36298Ua5 mo78168a = this.f21716b.mo78168a(m102046k.m110366m(), new C39843db5(baseActivity, contentView), m102046k);
        MU2 mu2 = new MU2(this.f21715a, this.f21717c, this.f21720f, baseActivity, this.f21718d, m102046k);
        mo78168a.mo81340a(tutorialKind, birdModel);
        Object m33094as = mo78168a.observeDone().m33094as(AutoDispose.m45239a(m102046k.m110366m()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5032b c5032b = new C5032b(mu2);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Ka5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34192La5.m96618f(Function1.this, obj);
            }
        });
        return m102046k;
    }
}
