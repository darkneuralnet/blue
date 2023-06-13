package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.FlightBanner;
import co.bird.android.model.persistence.BirdPlusDisplayView;
import co.bird.android.model.persistence.BirdPlusSubscriptionPlanView;
import co.bird.android.model.persistence.BirdPlusUserSubscriptionView;
import co.bird.android.model.persistence.BirdPlusView;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C20393fP;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LfP;", "Lco/bird/android/model/FlightBanner;", "", "onBannerShown", "LJQ;", C17296a.f69688o, "LJQ;", "birdPlusManager", "LEa;", "b", "LEa;", "analyticsManager", "LTq4;", "c", "LTq4;", "reactiveConfig", "LkP;", DateTokenConverter.CONVERTER_KEY, "LkP;", "ui", "Le13;", "e", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(LJQ;LEa;LTq4;LkP;Le13;Lcom/uber/autodispose/ScopeProvider;)V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdPlusBannerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusBannerPresenterImpl.kt\nco/bird/android/feature/birdplus/view/BirdPlusBannerPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,96:1\n180#2:97\n*S KotlinDebug\n*F\n+ 1 BirdPlusBannerPresenterImpl.kt\nco/bird/android/feature/birdplus/view/BirdPlusBannerPresenterImpl\n*L\n92#1:97\n*E\n"})
/* renamed from: fP */
/* loaded from: classes3.dex */
public final class C20393fP implements FlightBanner {

    /* renamed from: a */
    public final InterfaceC4077JQ f80059a;

    /* renamed from: b */
    public final InterfaceC1880Ea f80060b;

    /* renamed from: c */
    public final C36207Tq4 f80061c;

    /* renamed from: d */
    public final InterfaceC25154kP f80062d;

    /* renamed from: e */
    public final InterfaceC40099e13 f80063e;

    /* renamed from: f */
    public final ScopeProvider f80064f;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "Lco/bird/android/model/persistence/BirdPlusView;", "plans", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/model/persistence/BirdPlusView;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdPlusBannerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusBannerPresenterImpl.kt\nco/bird/android/feature/birdplus/view/BirdPlusBannerPresenterImpl$onBannerShown$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n766#2:97\n857#2,2:98\n288#2,2:100\n288#2,2:102\n288#2,2:104\n*S KotlinDebug\n*F\n+ 1 BirdPlusBannerPresenterImpl.kt\nco/bird/android/feature/birdplus/view/BirdPlusBannerPresenterImpl$onBannerShown$1\n*L\n44#1:97\n44#1:98,2\n45#1:100,2\n46#1:102,2\n47#1:104,2\n*E\n"})
    /* renamed from: fP$a */
    /* loaded from: classes3.dex */
    public static final class C20394a extends Lambda implements Function1<List<? extends BirdPlusView>, BirdPlusView> {

        /* renamed from: g */
        public static final C20394a f80065g = new C20394a();

        public C20394a() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final BirdPlusView invoke(List<BirdPlusView> plans) {
            String str;
            Object obj;
            Object obj2;
            boolean z;
            BirdPlusDisplayView display;
            Intrinsics.checkNotNullParameter(plans, "plans");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = plans.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                BirdPlusSubscriptionPlanView subscriptionPlan = ((BirdPlusView) next).getSubscriptionPlan();
                if (subscriptionPlan != null && (display = subscriptionPlan.getDisplay()) != null) {
                    str = display.getBannerTitle();
                }
                if (str != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (((BirdPlusView) obj).isActive()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            BirdPlusView birdPlusView = (BirdPlusView) obj;
            if (birdPlusView == null) {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj2 = it3.next();
                        if (((BirdPlusView) obj2).isIneligible()) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                BirdPlusView birdPlusView2 = (BirdPlusView) obj2;
                if (birdPlusView2 == null) {
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Object next2 = it4.next();
                        if (((BirdPlusView) next2).isAvailable()) {
                            str = next2;
                            break;
                        }
                    }
                    return (BirdPlusView) str;
                }
                return birdPlusView2;
            }
            return birdPlusView;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/BirdPlusView;", "p1", "p2", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/BirdPlusView;Lco/bird/android/model/persistence/BirdPlusView;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fP$b */
    /* loaded from: classes3.dex */
    public static final class C20395b extends Lambda implements Function2<BirdPlusView, BirdPlusView, Boolean> {

        /* renamed from: g */
        public static final C20395b f80066g = new C20395b();

        public C20395b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(BirdPlusView p1, BirdPlusView p2) {
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            return Boolean.valueOf(Intrinsics.areEqual(p1.getSubscriptionPlanId(), p2.getSubscriptionPlanId()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/BirdPlusView;", "plan", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/persistence/BirdPlusView;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fP$c */
    /* loaded from: classes3.dex */
    public static final class C20396c extends Lambda implements Function1<BirdPlusView, InterfaceC23434B<? extends Unit>> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: fP$c$a */
        /* loaded from: classes3.dex */
        public static final class C20397a extends Lambda implements Function1<Unit, Unit> {

            /* renamed from: g */
            public final /* synthetic */ BirdPlusView f80068g;

            /* renamed from: h */
            public final /* synthetic */ C20393fP f80069h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20397a(BirdPlusView birdPlusView, C20393fP c20393fP) {
                super(1);
                this.f80068g = birdPlusView;
                this.f80069h = c20393fP;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
                invoke2(unit);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Unit unit) {
                if (this.f80068g.isIneligible()) {
                    InterfaceC1880Ea interfaceC1880Ea = this.f80069h.f80060b;
                    BirdPlusSubscriptionPlanView subscriptionPlan = this.f80068g.getSubscriptionPlan();
                    String codename = subscriptionPlan != null ? subscriptionPlan.getCodename() : null;
                    BirdPlusSubscriptionPlanView subscriptionPlan2 = this.f80068g.getSubscriptionPlan();
                    String id = subscriptionPlan2 != null ? subscriptionPlan2.getId() : null;
                    BirdPlusUserSubscriptionView userSubscription = this.f80068g.getUserSubscription();
                    interfaceC1880Ea.mo55905y(new C29527vQ(null, null, null, codename, id, userSubscription != null ? userSubscription.getId() : null, "banner", "transfer", 7, null));
                } else {
                    InterfaceC1880Ea interfaceC1880Ea2 = this.f80069h.f80060b;
                    BirdPlusSubscriptionPlanView subscriptionPlan3 = this.f80068g.getSubscriptionPlan();
                    String codename2 = subscriptionPlan3 != null ? subscriptionPlan3.getCodename() : null;
                    BirdPlusSubscriptionPlanView subscriptionPlan4 = this.f80068g.getSubscriptionPlan();
                    String id2 = subscriptionPlan4 != null ? subscriptionPlan4.getId() : null;
                    BirdPlusUserSubscriptionView userSubscription2 = this.f80068g.getUserSubscription();
                    interfaceC1880Ea2.mo55905y(new C12381bP(null, null, null, codename2, id2, userSubscription2 != null ? userSubscription2.getId() : null, 7, null));
                }
                this.f80069h.f80063e.mo37073X(this.f80068g.getUserSubscriptionId(), this.f80068g.getSubscriptionPlanId(), this.f80068g.getCodename());
            }
        }

        public C20396c() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends Unit> invoke(BirdPlusView plan) {
            String str;
            String str2;
            String str3;
            String str4;
            Intrinsics.checkNotNullParameter(plan, "plan");
            C20393fP.this.f80062d.mo27333b(plan);
            String str5 = null;
            if (plan.isIneligible()) {
                InterfaceC1880Ea interfaceC1880Ea = C20393fP.this.f80060b;
                BirdPlusSubscriptionPlanView subscriptionPlan = plan.getSubscriptionPlan();
                if (subscriptionPlan != null) {
                    str3 = subscriptionPlan.getCodename();
                } else {
                    str3 = null;
                }
                BirdPlusSubscriptionPlanView subscriptionPlan2 = plan.getSubscriptionPlan();
                if (subscriptionPlan2 != null) {
                    str4 = subscriptionPlan2.getId();
                } else {
                    str4 = null;
                }
                BirdPlusUserSubscriptionView userSubscription = plan.getUserSubscription();
                if (userSubscription != null) {
                    str5 = userSubscription.getId();
                }
                interfaceC1880Ea.mo55905y(new C29874wQ(null, null, null, str3, str4, str5, "banner", 7, null));
            } else {
                InterfaceC1880Ea interfaceC1880Ea2 = C20393fP.this.f80060b;
                BirdPlusSubscriptionPlanView subscriptionPlan3 = plan.getSubscriptionPlan();
                if (subscriptionPlan3 != null) {
                    str = subscriptionPlan3.getCodename();
                } else {
                    str = null;
                }
                BirdPlusSubscriptionPlanView subscriptionPlan4 = plan.getSubscriptionPlan();
                if (subscriptionPlan4 != null) {
                    str2 = subscriptionPlan4.getId();
                } else {
                    str2 = null;
                }
                BirdPlusUserSubscriptionView userSubscription2 = plan.getUserSubscription();
                if (userSubscription2 != null) {
                    str5 = userSubscription2.getId();
                }
                interfaceC1880Ea2.mo55905y(new C13537cP(null, null, null, str, str2, str5, 7, null));
            }
            Observable<Unit> mo27334a = C20393fP.this.f80062d.mo27334a();
            final C20397a c20397a = new C20397a(plan, C20393fP.this);
            return mo27334a.doOnNext(new InterfaceC23484g() { // from class: gP
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C20393fP.C20396c.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    public C20393fP(InterfaceC4077JQ birdPlusManager, InterfaceC1880Ea analyticsManager, C36207Tq4 reactiveConfig, InterfaceC25154kP ui, InterfaceC40099e13 navigator, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(birdPlusManager, "birdPlusManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f80059a = birdPlusManager;
        this.f80060b = analyticsManager;
        this.f80061c = reactiveConfig;
        this.f80062d = ui;
        this.f80063e = navigator;
        this.f80064f = scopeProvider;
    }

    /* renamed from: c */
    public static final boolean m41425c(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: d */
    public static final InterfaceC23434B m41424d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
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
        Observable m74575T = C37279Yf5.m74575T(this.f80059a.mo90339b0(), C20394a.f80065g);
        final C20395b c20395b = C20395b.f80066g;
        Observable observeOn = m74575T.distinctUntilChanged(new InterfaceC23481d() { // from class: dP
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m41425c;
                m41425c = C20393fP.m41425c(Function2.this, obj, obj2);
                return m41425c;
            }
        }).observeOn(C23454a.m33087a());
        final C20396c c20396c = new C20396c();
        Observable switchMap = observeOn.switchMap(new InterfaceC23492o() { // from class: eP
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m41424d;
                m41424d = C20393fP.m41424d(Function1.this, obj);
                return m41424d;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "override fun onBannerSho…r)\n      .subscribe()\n  }");
        Object m33094as = switchMap.m33094as(AutoDispose.m45239a(this.f80064f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
    }
}
