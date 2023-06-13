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
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LFQ;", "Lf1;", "LGQ;", "LIQ;", "renderer", "", "s", "LJQ;", "e", "LJQ;", "birdPlusManager", "Le13;", "f", "Le13;", "navigator", "LEa;", "g", "LEa;", "analyticsManager", "<init>", "(LJQ;Le13;LEa;)V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdPlusLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusLandingPresenter.kt\nco/bird/android/feature/birdplus/v1/list/BirdPlusLandingPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,57:1\n237#2:58\n180#2:59\n180#2:60\n*S KotlinDebug\n*F\n+ 1 BirdPlusLandingPresenter.kt\nco/bird/android/feature/birdplus/v1/list/BirdPlusLandingPresenter\n*L\n30#1:58\n43#1:59\n47#1:60\n*E\n"})
/* renamed from: FQ */
/* loaded from: classes3.dex */
public final class C2265FQ extends AbstractC20169f1<InterfaceC2846GQ, InterfaceC3530IQ> {

    /* renamed from: e */
    public final InterfaceC4077JQ f9339e;

    /* renamed from: f */
    public final InterfaceC40099e13 f9340f;

    /* renamed from: g */
    public final InterfaceC1880Ea f9341g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: FQ$a */
    /* loaded from: classes3.dex */
    public static final class C2266a extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C2266a() {
            super(1);
        }

        /* renamed from: a */
        public final void m107164a(InterfaceC23465c interfaceC23465c) {
            C2265FQ.this.m42280h(C34126Kt2.f20320a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m107164a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FQ$b */
    /* loaded from: classes3.dex */
    public static final class C2267b extends Lambda implements Function1<Throwable, Unit> {
        public C2267b() {
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
            C2265FQ.this.m42280h(C40701f22.f79322a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/BirdPlusView;", "passes", "Laf6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Laf6;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: FQ$c */
    /* loaded from: classes3.dex */
    public static final class C2268c extends Lambda implements Function1<List<? extends BirdPlusView>, C38087af6> {

        /* renamed from: g */
        public static final C2268c f9344g = new C2268c();

        public C2268c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C38087af6 invoke(List<BirdPlusView> passes) {
            Intrinsics.checkNotNullParameter(passes, "passes");
            return new C38087af6(passes);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Laf6;", "kotlin.jvm.PlatformType", "ui", "", C17296a.f69688o, "(Laf6;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdPlusLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusLandingPresenter.kt\nco/bird/android/feature/birdplus/v1/list/BirdPlusLandingPresenter$consume$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1774#2,4:58\n1774#2,4:62\n1774#2,4:66\n*S KotlinDebug\n*F\n+ 1 BirdPlusLandingPresenter.kt\nco/bird/android/feature/birdplus/v1/list/BirdPlusLandingPresenter$consume$4\n*L\n38#1:58,4\n39#1:62,4\n40#1:66,4\n*E\n"})
    /* renamed from: FQ$d */
    /* loaded from: classes3.dex */
    public static final class C2269d extends Lambda implements Function1<C38087af6, Unit> {
        public C2269d() {
            super(1);
        }

        /* renamed from: a */
        public final void m107162a(C38087af6 c38087af6) {
            int i;
            int i2;
            InterfaceC1880Ea interfaceC1880Ea = C2265FQ.this.f9341g;
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            List<BirdPlusView> m70904b = c38087af6.m70904b();
            int i3 = 0;
            if ((m70904b instanceof Collection) && m70904b.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (BirdPlusView birdPlusView : m70904b) {
                    if (birdPlusView.isActive() && (i = i + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            long j = i;
            List<BirdPlusView> m70904b2 = c38087af6.m70904b();
            if ((m70904b2 instanceof Collection) && m70904b2.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 0;
                for (BirdPlusView birdPlusView2 : m70904b2) {
                    if (birdPlusView2.isIneligible() && (i2 = i2 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            long j2 = i2;
            List<BirdPlusView> m70904b3 = c38087af6.m70904b();
            if (!(m70904b3 instanceof Collection) || !m70904b3.isEmpty()) {
                for (BirdPlusView birdPlusView3 : m70904b3) {
                    if (birdPlusView3.isAvailable() && (i3 = i3 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            interfaceC1880Ea.mo55905y(new C3140HQ(null, null, null, uuid, j, j2, i3, 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C38087af6 c38087af6) {
            m107162a(c38087af6);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FQ$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2270e extends FunctionReferenceImpl implements Function1<InterfaceC3530IQ, Unit> {
        public C2270e(Object obj) {
            super(1, obj, C2265FQ.class, "emit", "emit(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m107161a(InterfaceC3530IQ p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C2265FQ) this.receiver).m42280h(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3530IQ interfaceC3530IQ) {
            m107161a(interfaceC3530IQ);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/BirdPlusView;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/BirdPlusView;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: FQ$f */
    /* loaded from: classes3.dex */
    public static final class C2271f extends Lambda implements Function1<BirdPlusView, Unit> {
        public C2271f() {
            super(1);
        }

        /* renamed from: a */
        public final void m107160a(BirdPlusView birdPlusView) {
            C2265FQ.this.f9340f.mo37073X(birdPlusView.getUserSubscriptionId(), birdPlusView.getSubscriptionPlanId(), birdPlusView.getCodename());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdPlusView birdPlusView) {
            m107160a(birdPlusView);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2265FQ(InterfaceC4077JQ birdPlusManager, InterfaceC40099e13 navigator, InterfaceC1880Ea analyticsManager) {
        super(C40701f22.f79322a);
        Intrinsics.checkNotNullParameter(birdPlusManager, "birdPlusManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f9339e = birdPlusManager;
        this.f9340f = navigator;
        this.f9341g = analyticsManager;
    }

    /* renamed from: f */
    public static final void m107177f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m107176g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final C38087af6 m107168t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C38087af6) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m107167u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m107166v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m107165w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: s */
    public void consume(InterfaceC2846GQ renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        AbstractC23461c refresh = this.f9339e.refresh();
        final C2266a c2266a = new C2266a();
        AbstractC23461c m33081E = refresh.m33081E(new InterfaceC23484g() { // from class: zQ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2265FQ.m107177f(Function1.this, obj);
            }
        });
        final C2267b c2267b = new C2267b();
        AbstractC23461c m33084B = m33081E.m33084B(new InterfaceC23484g() { // from class: AQ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2265FQ.m107176g(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33084B, "override fun consume(ren…me,\n        )\n      }\n  }");
        Object m33041n = m33084B.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Z84<List<BirdPlusView>> mo90339b0 = this.f9339e.mo90339b0();
        final C2268c c2268c = C2268c.f9344g;
        Observable<R> map = mo90339b0.map(new InterfaceC23492o() { // from class: BQ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C38087af6 m107168t;
                m107168t = C2265FQ.m107168t(Function1.this, obj);
                return m107168t;
            }
        });
        final C2269d c2269d = new C2269d();
        Observable doOnNext = map.doOnNext(new InterfaceC23484g() { // from class: CQ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2265FQ.m107167u(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun consume(ren…me,\n        )\n      }\n  }");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2270e c2270e = new C2270e(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: DQ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2265FQ.m107166v(Function1.this, obj);
            }
        });
        Object m33094as2 = renderer.mo58682g4().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2271f c2271f = new C2271f();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: EQ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2265FQ.m107165w(Function1.this, obj);
            }
        });
    }
}
