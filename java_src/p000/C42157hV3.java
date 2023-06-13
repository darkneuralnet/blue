package p000;

import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.RentalPlan;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC44782lv1;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0012\u0012\u000e\b\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0002H\u0016J\u0016\u0010\t\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\b0\b0\u0002H\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, m28432d2 = {"LhV3;", "Llv1;", "Lio/reactivex/Observable;", "", "g7", "LEi0;", "kotlin.jvm.PlatformType", "m7", "LGi0;", "rc", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LQA2;", "b", "LQA2;", RequestHeadersFactory.MODEL, "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lpz2;", "Lco/bird/android/model/RentalPlan;", DateTokenConverter.CONVERTER_KEY, "Lpz2;", "ui", "Le13;", "e", "Le13;", "navigator", "<init>", "(LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPlanSelectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlanSelectionPresenter.kt\nco/bird/android/app/feature/longterm/PlanSelectionPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,71:1\n180#2:72\n180#2:73\n180#2:74\n*S KotlinDebug\n*F\n+ 1 PlanSelectionPresenter.kt\nco/bird/android/app/feature/longterm/PlanSelectionPresenter\n*L\n49#1:72\n56#1:73\n65#1:74\n*E\n"})
/* renamed from: hV3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42157hV3 implements InterfaceC44782lv1 {

    /* renamed from: b */
    public final QA2 f85287b;

    /* renamed from: c */
    public final ScopeProvider f85288c;

    /* renamed from: d */
    public final C47195pz2<RentalPlan> f85289d;

    /* renamed from: e */
    public final InterfaceC40099e13 f85290e;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hV3$a */
    /* loaded from: classes2.dex */
    public static final class C22668a extends Lambda implements Function1<Optional<String>, Boolean> {

        /* renamed from: g */
        public static final C22668a f85291g = new C22668a();

        public C22668a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", "plan", "", C17296a.f69688o, "(Lco/bird/android/model/RentalPlan;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hV3$b */
    /* loaded from: classes2.dex */
    public static final class C22669b extends Lambda implements Function1<RentalPlan, Unit> {
        public C22669b() {
            super(1);
        }

        /* renamed from: a */
        public final void m36328a(RentalPlan rentalPlan) {
            C42157hV3.this.f85287b.m88822q().accept(Optional.f63040c.m59032c(rentalPlan.getId()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RentalPlan rentalPlan) {
            m36328a(rentalPlan);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hV3$c */
    /* loaded from: classes2.dex */
    public static final class C22670c extends Lambda implements Function1<List<? extends RentalPlan>, Unit> {
        public C22670c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RentalPlan> list) {
            invoke2((List<RentalPlan>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<RentalPlan> it) {
            C47195pz2 c47195pz2 = C42157hV3.this.f85289d;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c47195pz2.m18353Rl(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hV3$d */
    /* loaded from: classes2.dex */
    public static final class C22671d extends Lambda implements Function1<Optional<String>, Boolean> {

        /* renamed from: g */
        public static final C22671d f85294g = new C22671d();

        public C22671d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hV3$e */
    /* loaded from: classes2.dex */
    public static final class C22672e extends Lambda implements Function1<Optional<String>, String> {

        /* renamed from: g */
        public static final C22672e f85295g = new C22672e();

        public C22672e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Optional<String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hV3$f */
    /* loaded from: classes2.dex */
    public static final class C22673f extends Lambda implements Function1<String, Unit> {
        public C22673f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            C47195pz2 c47195pz2 = C42157hV3.this.f85289d;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c47195pz2.m18354Ql(it);
        }
    }

    public C42157hV3(QA2 model, ScopeProvider scopeProvider, C47195pz2<RentalPlan> ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f85287b = model;
        this.f85288c = scopeProvider;
        this.f85289d = ui;
        this.f85290e = navigator;
    }

    /* renamed from: g */
    public static final Boolean m36335g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m36334h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m36333i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final boolean m36332j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: k */
    public static final String m36331k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m36330l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: Bk */
    public Observable<Object> mo22Bk() {
        return InterfaceC44782lv1.C25814a.m26672k(this);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: g7 */
    public Observable<Boolean> mo14g7() {
        C0058AG<Optional<String>> m88822q = this.f85287b.m88822q();
        final C22668a c22668a = C22668a.f85291g;
        Observable map = m88822q.map(new InterfaceC23492o() { // from class: gV3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m36335g;
                m36335g = C42157hV3.m36335g(Function1.this, obj);
                return m36335g;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "model.rentalPlanId.map { it.isPresent }");
        return map;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: m7 */
    public Observable<EnumC32621Ei0> mo12m7() {
        Observable<EnumC32621Ei0> just = Observable.just(EnumC32621Ei0.NEXT);
        Intrinsics.checkNotNullExpressionValue(just, "just(CheckoutProceedType.NEXT)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    public void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC44782lv1.C25814a.m26681b(this, i, i2, intent);
    }

    @Override // p000.UX0
    public void onCreate(Bundle bundle) {
        InterfaceC44782lv1.C25814a.m26680c(this, bundle);
        this.f85289d.setTitle(C45871nl4.rental_vehicle_selection_description);
        this.f85289d.m18352Sl(false);
        Object m33094as = this.f85289d.m18355Pl().m33094as(AutoDispose.m45239a(this.f85288c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22669b c22669b = new C22669b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: bV3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42157hV3.m36334h(Function1.this, obj);
            }
        });
        Observable<List<RentalPlan>> observeOn = this.f85287b.m88831h().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "model.availablePlans\n   …dSchedulers.mainThread())");
        Object m33094as2 = observeOn.m33094as(AutoDispose.m45239a(this.f85288c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22670c c22670c = new C22670c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: cV3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42157hV3.m36333i(Function1.this, obj);
            }
        });
        C0058AG<Optional<String>> m88822q = this.f85287b.m88822q();
        final C22671d c22671d = C22671d.f85294g;
        Observable<Optional<String>> filter = m88822q.filter(new InterfaceC23494q() { // from class: dV3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m36332j;
                m36332j = C42157hV3.m36332j(Function1.this, obj);
                return m36332j;
            }
        });
        final C22672e c22672e = C22672e.f85295g;
        Observable observeOn2 = filter.map(new InterfaceC23492o() { // from class: eV3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m36331k;
                m36331k = C42157hV3.m36331k(Function1.this, obj);
                return m36331k;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "model.rentalPlanId\n     …dSchedulers.mainThread())");
        Object m33094as3 = observeOn2.m33094as(AutoDispose.m45239a(this.f85288c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22673f c22673f = new C22673f();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: fV3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42157hV3.m36330l(Function1.this, obj);
            }
        });
    }

    @Override // p000.UX0
    public void onDestroy() {
        InterfaceC44782lv1.C25814a.m26679d(this);
    }

    @Override // p000.UX0
    public void onLowMemory() {
        InterfaceC44782lv1.C25814a.m26678e(this);
    }

    @Override // p000.UX0
    public void onPause() {
        InterfaceC44782lv1.C25814a.m26677f(this);
    }

    @Override // p000.UX0
    public void onResume() {
        InterfaceC44782lv1.C25814a.m26676g(this);
    }

    @Override // p000.UX0
    public void onSaveInstanceState(Bundle bundle) {
        InterfaceC44782lv1.C25814a.m26675h(this, bundle);
    }

    @Override // p000.UX0
    public void onStart() {
        InterfaceC44782lv1.C25814a.m26674i(this);
    }

    @Override // p000.UX0
    public void onStop() {
        InterfaceC44782lv1.C25814a.m26673j(this);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: rc */
    public Observable<EnumC33089Gi0> mo11rc() {
        Observable<EnumC33089Gi0> just = Observable.just(EnumC33089Gi0.BACK);
        Intrinsics.checkNotNullExpressionValue(just, "just(CheckoutReverseType.BACK)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: z5 */
    public Observable<Unit> mo10z5() {
        return InterfaceC44782lv1.C25814a.m26682a(this);
    }
}
