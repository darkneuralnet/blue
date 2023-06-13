package p000;

import co.bird.android.model.persistence.BirdPlusView;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LdR;", "Lf1;", "LeR;", "LfR;", "renderer", "", "s", "LJQ;", "e", "LJQ;", "birdPlusManager", "Le13;", "f", "Le13;", "navigator", "LEa;", "g", "LEa;", "analyticsManager", "<init>", "(LJQ;Le13;LEa;)V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdPlusPurchasedPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusPurchasedPresenter.kt\nco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,56:1\n237#2:57\n180#2:58\n180#2:59\n*S KotlinDebug\n*F\n+ 1 BirdPlusPurchasedPresenter.kt\nco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedPresenter\n*L\n31#1:57\n46#1:58\n50#1:59\n*E\n"})
/* renamed from: dR */
/* loaded from: classes3.dex */
public final class C19750dR extends AbstractC20169f1<InterfaceC20040eR, InterfaceC20400fR> {

    /* renamed from: e */
    public final InterfaceC4077JQ f76585e;

    /* renamed from: f */
    public final InterfaceC40099e13 f76586f;

    /* renamed from: g */
    public final InterfaceC1880Ea f76587g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: dR$a */
    /* loaded from: classes3.dex */
    public static final class C19751a extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C19751a() {
            super(1);
        }

        /* renamed from: a */
        public final void m44282a(InterfaceC23465c interfaceC23465c) {
            C19750dR.this.m42280h(C32020Bt2.f3011a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m44282a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: dR$b */
    /* loaded from: classes3.dex */
    public static final class C19752b extends Lambda implements Function1<Throwable, Unit> {
        public C19752b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            C19750dR.this.m42280h(C41294g22.f81424a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/BirdPlusView;", "view", "LSe6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/BirdPlusView;)LSe6;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: dR$c */
    /* loaded from: classes3.dex */
    public static final class C19753c extends Lambda implements Function1<BirdPlusView, C35867Se6> {

        /* renamed from: g */
        public static final C19753c f76590g = new C19753c();

        public C19753c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C35867Se6 invoke(BirdPlusView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return new C35867Se6(view);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LSe6;", "kotlin.jvm.PlatformType", "ui", "", C17296a.f69688o, "(LSe6;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: dR$d */
    /* loaded from: classes3.dex */
    public static final class C19754d extends Lambda implements Function1<C35867Se6, Unit> {
        public C19754d() {
            super(1);
        }

        /* renamed from: a */
        public final void m44280a(C35867Se6 c35867Se6) {
            InterfaceC1880Ea interfaceC1880Ea = C19750dR.this.f76587g;
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            interfaceC1880Ea.mo55905y(new C7165RQ(null, null, null, uuid, c35867Se6.m85162b().getCodename(), c35867Se6.m85162b().getSubscriptionPlanId(), c35867Se6.m85162b().getUserSubscriptionId(), 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C35867Se6 c35867Se6) {
            m44280a(c35867Se6);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: dR$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C19755e extends FunctionReferenceImpl implements Function1<InterfaceC20400fR, Unit> {
        public C19755e(Object obj) {
            super(1, obj, C19750dR.class, "emit", "emit(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m44279a(InterfaceC20400fR p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C19750dR) this.receiver).m42280h(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC20400fR interfaceC20400fR) {
            m44279a(interfaceC20400fR);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: dR$f */
    /* loaded from: classes3.dex */
    public static final class C19756f extends Lambda implements Function1<Unit, Unit> {
        public C19756f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C19750dR.this.f76586f.close();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19750dR(InterfaceC4077JQ birdPlusManager, InterfaceC40099e13 navigator, InterfaceC1880Ea analyticsManager) {
        super(C41294g22.f81424a);
        Intrinsics.checkNotNullParameter(birdPlusManager, "birdPlusManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f76585e = birdPlusManager;
        this.f76586f = navigator;
        this.f76587g = analyticsManager;
    }

    /* renamed from: f */
    public static final void m44295f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m44294g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final C35867Se6 m44286t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C35867Se6) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m44285u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m44284v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m44283w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: s */
    public void consume(InterfaceC20040eR renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        AbstractC23461c refresh = this.f76585e.refresh();
        final C19751a c19751a = new C19751a();
        AbstractC23461c m33081E = refresh.m33081E(new InterfaceC23484g() { // from class: XQ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C19750dR.m44295f(Function1.this, obj);
            }
        });
        final C19752b c19752b = new C19752b();
        AbstractC23461c m33084B = m33081E.m33084B(new InterfaceC23484g() { // from class: YQ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C19750dR.m44294g(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33084B, "override fun consume(ren…gator.close()\n      }\n  }");
        Object m33041n = m33084B.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<BirdPlusView> mo90333e0 = this.f76585e.mo90333e0(renderer.mo42883e9());
        final C19753c c19753c = C19753c.f76590g;
        Observable<R> map = mo90333e0.map(new InterfaceC23492o() { // from class: ZQ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C35867Se6 m44286t;
                m44286t = C19750dR.m44286t(Function1.this, obj);
                return m44286t;
            }
        });
        final C19754d c19754d = new C19754d();
        Observable doOnNext = map.doOnNext(new InterfaceC23484g() { // from class: aR
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C19750dR.m44285u(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun consume(ren…gator.close()\n      }\n  }");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C19755e c19755e = new C19755e(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: bR
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C19750dR.m44284v(Function1.this, obj);
            }
        });
        Object m33094as2 = renderer.doneClicks().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C19756f c19756f = new C19756f();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: cR
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C19750dR.m44283w(Function1.this, obj);
            }
        });
    }
}
