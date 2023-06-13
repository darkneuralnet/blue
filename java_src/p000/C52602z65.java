package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.library.flow.FlowActivity;
import co.bird.android.model.RideState;
import co.bird.android.model.ridertutorial.TutorialKind;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WirePhysicalLockTutorialStep;
import co.bird.android.model.wire.WireRide;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\r\u0010\u001f¨\u0006#"}, m28432d2 = {"Lz65;", "", "", "c", "Lco/bird/android/model/wire/WireBird;", C17296a.f69688o, "", "Lco/bird/android/model/ridertutorial/TutorialKind;", DateTokenConverter.CONVERTER_KEY, "Lgl;", "Lgl;", "preference", "LYR4;", "b", "LYR4;", "rideManager", "Lw65;", "Lw65;", "riderTutorialPresenterFactory", "Lp65;", "Lp65;", "physicalLockTutorialPresenterFactory", "LDi0;", "e", "LDi0;", "rideTutorialNode", "f", "physicalLockTutorialNode", "", "g", "Ljava/util/List;", "()Ljava/util/List;", "tutorials", "<init>", "(Lgl;LYR4;Lw65;Lp65;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideStartedTutorials.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStartedTutorials.kt\nco/bird/android/app/feature/ride/tutorial/RideStartedTutorials\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n1747#2,3:115\n*S KotlinDebug\n*F\n+ 1 RideStartedTutorials.kt\nco/bird/android/app/feature/ride/tutorial/RideStartedTutorials\n*L\n84#1:115,3\n*E\n"})
/* renamed from: z65  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52602z65 {

    /* renamed from: a */
    public final C22454gl f120795a;

    /* renamed from: b */
    public final YR4 f120796b;

    /* renamed from: c */
    public final InterfaceC50823w65 f120797c;

    /* renamed from: d */
    public final InterfaceC46674p65 f120798d;

    /* renamed from: e */
    public final C32387Di0 f120799e;

    /* renamed from: f */
    public final C32387Di0 f120800f;

    /* renamed from: g */
    public final List<C32387Di0> f120801g;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z65$a */
    /* loaded from: classes2.dex */
    public static final class C30909a extends Lambda implements Function1<Context, String> {

        /* renamed from: g */
        public static final C30909a f120802g = new C30909a();

        public C30909a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(C45871nl4.physical_lock_tutorial_activity_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…_tutorial_activity_title)");
            return string;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z65$b */
    /* loaded from: classes2.dex */
    public static final class C30910b extends Lambda implements Function0<Boolean> {
        public C30910b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            WirePhysicalLock physicalLock;
            WireBird m1797a = C52602z65.this.m1797a();
            boolean z = false;
            if (m1797a != null && (physicalLock = m1797a.getPhysicalLock()) != null) {
                C52602z65 c52602z65 = C52602z65.this;
                List<WirePhysicalLockTutorialStep> tutorialSteps = physicalLock.getTutorialSteps();
                if (!(tutorialSteps == null || tutorialSteps.isEmpty()) && !c52602z65.f120795a.m37702N0(physicalLock.getKind())) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z65$c */
    /* loaded from: classes2.dex */
    public static final class C30911c extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C30911c f120804g = new C30911c();

        public C30911c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            RelativeLayout root = US3.m81487c(C40788fB0.m41772j(context)).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "inflate(context.layoutInflater).root");
            return root;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "rootView", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/library/flow/FlowActivity;", "activity", "Llv1;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z65$d */
    /* loaded from: classes2.dex */
    public static final class C30912d extends Lambda implements Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> {
        public C30912d() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC44782lv1 invoke(View rootView, ScopeProvider scopeProvider, FlowActivity activity) {
            WirePhysicalLock wirePhysicalLock;
            WirePhysicalLock physicalLock;
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            Intrinsics.checkNotNullParameter(activity, "activity");
            WireBird m1797a = C52602z65.this.m1797a();
            if (m1797a != null && (physicalLock = m1797a.getPhysicalLock()) != null) {
                C52602z65.this.f120795a.m37673U1(physicalLock.getKind());
            }
            US3 m81489a = US3.m81489a(rootView);
            Intrinsics.checkNotNullExpressionValue(m81489a, "bind(rootView)");
            InterfaceC46674p65 interfaceC46674p65 = C52602z65.this.f120798d;
            C49045t65 c49045t65 = new C49045t65(activity, m81489a);
            InterfaceC40099e13 mo58957w = activity.mo58957w();
            WireBird m1797a2 = C52602z65.this.m1797a();
            if (m1797a2 != null) {
                wirePhysicalLock = m1797a2.getPhysicalLock();
            } else {
                wirePhysicalLock = null;
            }
            return interfaceC46674p65.mo18165a(scopeProvider, c49045t65, mo58957w, wirePhysicalLock);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z65$e */
    /* loaded from: classes2.dex */
    public static final class C30913e extends Lambda implements Function1<Context, String> {

        /* renamed from: g */
        public static final C30913e f120806g = new C30913e();

        public C30913e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(C45871nl4.how_to_ride_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.string.how_to_ride_title)");
            return string;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z65$f */
    /* loaded from: classes2.dex */
    public static final class C30914f extends Lambda implements Function0<Boolean> {
        public C30914f() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            String model;
            WireBird m1797a = C52602z65.this.m1797a();
            boolean z = false;
            if (m1797a != null && (model = m1797a.getModel()) != null) {
                C52602z65 c52602z65 = C52602z65.this;
                if (c52602z65.m1794d(model) != null && !c52602z65.f120795a.m37649a1(model)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z65$g */
    /* loaded from: classes2.dex */
    public static final class C30915g extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C30915g f120808g = new C30915g();

        public C30915g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.rider_tutorial_dark, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…ider_tutorial_dark, null)");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "rootView", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/library/flow/FlowActivity;", "activity", "Llv1;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/library/flow/FlowActivity;)Llv1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z65$h */
    /* loaded from: classes2.dex */
    public static final class C30916h extends Lambda implements Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> {
        public C30916h() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final InterfaceC44782lv1 invoke(View rootView, ScopeProvider scopeProvider, FlowActivity activity) {
            TutorialKind tutorialKind;
            String model;
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            Intrinsics.checkNotNullParameter(activity, "activity");
            WireBird m1797a = C52602z65.this.m1797a();
            if (m1797a != null && (model = m1797a.getModel()) != null) {
                C52602z65.this.f120795a.m37676T2(model);
            }
            InterfaceC50823w65 interfaceC50823w65 = C52602z65.this.f120797c;
            C39843db5 c39843db5 = new C39843db5(activity, rootView);
            WireBird m1797a2 = C52602z65.this.m1797a();
            if (m1797a2 == null || (tutorialKind = F65.m107740a(m1797a2)) == null) {
                tutorialKind = TutorialKind.CLASS_SCOOTER;
            }
            return interfaceC50823w65.mo5841a(scopeProvider, c39843db5, tutorialKind);
        }
    }

    public C52602z65(C22454gl preference, YR4 rideManager, InterfaceC50823w65 riderTutorialPresenterFactory, InterfaceC46674p65 physicalLockTutorialPresenterFactory) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(riderTutorialPresenterFactory, "riderTutorialPresenterFactory");
        Intrinsics.checkNotNullParameter(physicalLockTutorialPresenterFactory, "physicalLockTutorialPresenterFactory");
        this.f120795a = preference;
        this.f120796b = rideManager;
        this.f120797c = riderTutorialPresenterFactory;
        this.f120798d = physicalLockTutorialPresenterFactory;
        C32387Di0 c32387Di0 = new C32387Di0("ride", C30913e.f120806g, new C30914f(), null, C30915g.f120808g, new C30916h(), 8, null);
        this.f120799e = c32387Di0;
        C32387Di0 c32387Di02 = new C32387Di0("lock", C30909a.f120802g, new C30910b(), null, C30911c.f120804g, new C30912d(), 8, null);
        this.f120800f = c32387Di02;
        this.f120801g = CollectionsKt.listOf((Object[]) new C32387Di0[]{c32387Di0, c32387Di02});
    }

    /* renamed from: a */
    public final WireBird m1797a() {
        WireRide ride;
        RideState m59035e = this.f120796b.mo75057R().getValue().m59035e();
        if (m59035e == null || (ride = m59035e.getRide()) == null) {
            return null;
        }
        return ride.getBird();
    }

    /* renamed from: b */
    public final List<C32387Di0> m1796b() {
        return this.f120801g;
    }

    /* renamed from: c */
    public final boolean m1795c() {
        List<C32387Di0> list = this.f120801g;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C32387Di0 c32387Di0 : list) {
            if (c32387Di0.m109996f().invoke().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final TutorialKind m1794d(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 3088) {
                if (hashCode != 3089) {
                    if (hashCode != 3137) {
                        if (hashCode != 3246) {
                            if (hashCode == 3297957 && str.equals("m365")) {
                                return TutorialKind.CONTEXTUAL_M365;
                            }
                        } else if (str.equals("es")) {
                            return TutorialKind.CONTEXTUAL_ES;
                        }
                    } else if (str.equals("bc")) {
                        return TutorialKind.CONTEXTUAL_BC;
                    }
                } else if (str.equals("b3")) {
                    return TutorialKind.CONTEXTUAL_B3;
                }
            } else if (str.equals("b2")) {
                return TutorialKind.CONTEXTUAL_B2;
            }
        }
        return null;
    }
}
