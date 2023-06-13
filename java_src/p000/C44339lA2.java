package p000;

import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.CurrentRental;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC44782lv1;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010#\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00040\u00040\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, m28432d2 = {"LlA2;", "Llv1;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lio/reactivex/Observable;", "", "Bk", "", "g7", "LEi0;", "m7", "LGi0;", "rc", "LCx4;", "b", "LCx4;", "rentalManager", "LQA2;", "c", "LQA2;", RequestHeadersFactory.MODEL, "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LxE;", "e", "LxE;", "ui", "LAG;", "kotlin.jvm.PlatformType", "f", "LAG;", "proceedImmediately", "<init>", "(LCx4;LQA2;Lcom/uber/autodispose/ScopeProvider;LxE;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLongTermRentalSetupLoadingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupLoadingPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupLoadingPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,64:1\n237#2:65\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupLoadingPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupLoadingPresenter\n*L\n46#1:65\n*E\n"})
/* renamed from: lA2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44339lA2 implements InterfaceC44782lv1 {

    /* renamed from: b */
    public final InterfaceC32292Cx4 f95656b;

    /* renamed from: c */
    public final QA2 f95657c;

    /* renamed from: d */
    public final ScopeProvider f95658d;

    /* renamed from: e */
    public final AbstractC30071xE f95659e;

    /* renamed from: f */
    public final C0058AG<Unit> f95660f;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ltg1;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ltg1;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lA2$a */
    /* loaded from: classes2.dex */
    public static final class C25644a extends Lambda implements Function1<C49375tg1, InterfaceC23496h> {

        /* renamed from: g */
        public static final C25644a f95661g = new C25644a();

        public C25644a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(C49375tg1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC23461c.m33080F(new C48915st4(it.m11932c()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: lA2$b */
    /* loaded from: classes2.dex */
    public static final class C25645b extends Lambda implements Function1<Throwable, Unit> {
        public C25645b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            AbstractC30071xE abstractC30071xE = C44339lA2.this.f95659e;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            abstractC30071xE.error(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lA2$c */
    /* loaded from: classes2.dex */
    public static final class C25646c extends Lambda implements Function1<Unit, Object> {

        /* renamed from: g */
        public static final C25646c f95663g = new C25646c();

        public C25646c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    public C44339lA2(InterfaceC32292Cx4 rentalManager, QA2 model, ScopeProvider scopeProvider, AbstractC30071xE ui) {
        Intrinsics.checkNotNullParameter(rentalManager, "rentalManager");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f95656b = rentalManager;
        this.f95657c = model;
        this.f95658d = scopeProvider;
        this.f95659e = ui;
        C0058AG<Unit> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<Unit>()");
        this.f95660f = m115951g;
    }

    /* renamed from: f */
    public static final InterfaceC23496h m27715f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m27714g(C44339lA2 this$0) {
        CurrentRental currentRental;
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        QA2 qa2 = this$0.f95657c;
        List<CurrentRental> m59035e = this$0.f95656b.mo87531h().getValue().m59035e();
        if (m59035e != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) m59035e);
            currentRental = (CurrentRental) firstOrNull;
        } else {
            currentRental = null;
        }
        qa2.m88846A(currentRental);
    }

    /* renamed from: h */
    public static final void m27713h(C44339lA2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f95660f.accept(Unit.INSTANCE);
    }

    /* renamed from: i */
    public static final void m27712i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final Object m27711j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: Bk */
    public Observable<Object> mo22Bk() {
        C0058AG<Unit> c0058ag = this.f95660f;
        final C25646c c25646c = C25646c.f95663g;
        Observable<R> map = c0058ag.map(new InterfaceC23492o() { // from class: gA2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Object m27711j;
                m27711j = C44339lA2.m27711j(Function1.this, obj);
                return m27711j;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "proceedImmediately.map { true }");
        return map;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: g7 */
    public Observable<Boolean> mo14g7() {
        Observable<Boolean> just = Observable.just(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(just, "just(true)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: m7 */
    public Observable<EnumC32621Ei0> mo12m7() {
        Observable<EnumC32621Ei0> just = Observable.just(EnumC32621Ei0.NONE);
        Intrinsics.checkNotNullExpressionValue(just, "just(CheckoutProceedType.NONE)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    public void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC44782lv1.C25814a.m26681b(this, i, i2, intent);
    }

    @Override // p000.UX0
    public void onCreate(Bundle bundle) {
        InterfaceC44782lv1.C25814a.m26680c(this, bundle);
        AbstractC24507p<C49375tg1> mo87530i = this.f95656b.mo87530i();
        final C25644a c25644a = C25644a.f95661g;
        AbstractC23461c m33029z = mo87530i.m32074A(new InterfaceC23492o() { // from class: hA2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m27715f;
                m27715f = C44339lA2.m27715f(Function1.this, obj);
                return m27715f;
            }
        }).m33029z(new InterfaceC23478a() { // from class: iA2
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C44339lA2.m27714g(C44339lA2.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "rentalManager.refreshRen…)?.firstOrNull())\n      }");
        Object m33041n = C28237sD.progress$default(m33029z, this.f95659e, 0, 2, (Object) null).m33041n(AutoDispose.m45239a(this.f95658d));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: jA2
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C44339lA2.m27713h(C44339lA2.this);
            }
        };
        final C25645b c25645b = new C25645b();
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: kA2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44339lA2.m27712i(Function1.this, obj);
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
        Observable<EnumC33089Gi0> just = Observable.just(EnumC33089Gi0.CLOSE);
        Intrinsics.checkNotNullExpressionValue(just, "just(CheckoutReverseType.CLOSE)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: z5 */
    public Observable<Unit> mo10z5() {
        return InterfaceC44782lv1.C25814a.m26682a(this);
    }
}
