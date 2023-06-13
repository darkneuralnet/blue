package p000;

import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.AbstractC24569h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BU\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u001a\b\u0001\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R&\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0016"}, m28432d2 = {"LK13;", "LD13;", "LM13;", C17296a.f69688o, "LM13;", "ui", "Lio/reactivex/subjects/h;", "Lkotlin/Pair;", "", "b", "Lio/reactivex/subjects/h;", "signalFilterSubject", "c", "updateFrequencySubject", "Lgl;", "preference", "LTq4;", "reactiveConfig", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(Lgl;LTq4;Lcom/uber/autodispose/ScopeProvider;LM13;Lio/reactivex/subjects/h;Lio/reactivex/subjects/h;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNearbyBirdsFilterPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NearbyBirdsFilterPresenter.kt\nco/bird/android/app/feature/nearbybirds/filterdialog/NearbyBirdsFilterPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n180#2:55\n180#2:56\n180#2:58\n180#2:59\n1#3:57\n*S KotlinDebug\n*F\n+ 1 NearbyBirdsFilterPresenter.kt\nco/bird/android/app/feature/nearbybirds/filterdialog/NearbyBirdsFilterPresenterImpl\n*L\n24#1:55\n28#1:56\n45#1:58\n50#1:59\n*E\n"})
/* renamed from: K13 */
/* loaded from: classes2.dex */
public final class K13 implements D13 {

    /* renamed from: a */
    public final M13 f18935a;

    /* renamed from: b */
    public final AbstractC24569h<Pair<Integer, Integer>> f18936b;

    /* renamed from: c */
    public final AbstractC24569h<Integer> f18937c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: K13$a */
    /* loaded from: classes2.dex */
    public static final class C4301a extends Lambda implements Function1<Boolean, Unit> {
        public C4301a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enabled) {
            M13 m13 = K13.this.f18935a;
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            m13.mo91058T7(enabled.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: K13$b */
    /* loaded from: classes2.dex */
    public static final class C4302b extends Lambda implements Function1<Boolean, Unit> {
        public C4302b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enabled) {
            M13 m13 = K13.this.f18935a;
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            m13.mo91057f7(enabled.booleanValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: K13$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C4303c extends FunctionReferenceImpl implements Function1<Pair<? extends Integer, ? extends Integer>, Unit> {
        public C4303c(Object obj) {
            super(1, obj, AbstractC24569h.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Integer, ? extends Integer> pair) {
            invoke2((Pair<Integer, Integer>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Integer, Integer> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AbstractC24569h) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: K13$d */
    /* loaded from: classes2.dex */
    public static final class C4304d extends Lambda implements Function1<Pair<? extends Integer, ? extends Integer>, Unit> {
        public C4304d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Integer, ? extends Integer> pair) {
            invoke2((Pair<Integer, Integer>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Integer, Integer> pair) {
            K13.this.f18935a.mo91054le(pair.component1().intValue(), pair.component2().intValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: K13$e */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C4305e extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public C4305e(Object obj) {
            super(1, obj, AbstractC24569h.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m99335a(Integer p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AbstractC24569h) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            m99335a(num);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "updateFrequency", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: K13$f */
    /* loaded from: classes2.dex */
    public static final class C4306f extends Lambda implements Function1<Integer, Unit> {
        public C4306f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer updateFrequency) {
            M13 m13 = K13.this.f18935a;
            Intrinsics.checkNotNullExpressionValue(updateFrequency, "updateFrequency");
            m13.mo91063Fl(updateFrequency.intValue());
        }
    }

    public K13(C22454gl preference, C36207Tq4 reactiveConfig, ScopeProvider scopeProvider, M13 ui, AbstractC24569h<Pair<Integer, Integer>> signalFilterSubject, AbstractC24569h<Integer> updateFrequencySubject) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(signalFilterSubject, "signalFilterSubject");
        Intrinsics.checkNotNullParameter(updateFrequencySubject, "updateFrequencySubject");
        this.f18935a = ui;
        this.f18936b = signalFilterSubject;
        this.f18937c = updateFrequencySubject;
        Object m33094as = reactiveConfig.m82450v6().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4301a c4301a = new C4301a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: E13
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                K13.m99341g(Function1.this, obj);
            }
        });
        Object m33094as2 = reactiveConfig.m82430x6().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4302b c4302b = new C4302b();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: F13
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                K13.m99340h(Function1.this, obj);
            }
        });
        Pair<Integer, Integer> m37619h0 = preference.m37619h0();
        int intValue = m37619h0.component1().intValue();
        int intValue2 = m37619h0.component2().intValue();
        ui.mo91064D2(intValue);
        ui.mo91055ib(intValue2);
        ui.mo91054le(intValue, intValue2);
        int m37615i0 = preference.m37615i0();
        ui.mo91053nd(m37615i0);
        ui.mo91063Fl(m37615i0);
        Observable<Pair<Integer, Integer>> mo91052r7 = ui.mo91052r7();
        final C4303c c4303c = new C4303c(signalFilterSubject);
        Observable<Pair<Integer, Integer>> doOnNext = mo91052r7.doOnNext(new InterfaceC23484g() { // from class: G13
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                K13.m99339i(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "ui.signalRangeUpdates()\n…nalFilterSubject::onNext)");
        Object m33094as3 = doOnNext.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4304d c4304d = new C4304d();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: H13
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                K13.m99338j(Function1.this, obj);
            }
        });
        Observable<Integer> mo91056gg = ui.mo91056gg();
        final C4305e c4305e = new C4305e(updateFrequencySubject);
        Observable<Integer> doOnNext2 = mo91056gg.doOnNext(new InterfaceC23484g() { // from class: I13
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                K13.m99337k(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext2, "ui.updateFrequencyUpdate…FrequencySubject::onNext)");
        Object m33094as4 = doOnNext2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4306f c4306f = new C4306f();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: J13
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                K13.m99336l(Function1.this, obj);
            }
        });
    }

    /* renamed from: g */
    public static final void m99341g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m99340h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m99339i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m99338j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m99337k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m99336l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }
}
