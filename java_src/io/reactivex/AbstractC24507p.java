package io.reactivex;

import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.functions.C23506a;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23547b;
import io.reactivex.internal.fuseable.InterfaceC23549d;
import io.reactivex.internal.observers.C23563h;
import io.reactivex.internal.operators.maybe.C23832A;
import io.reactivex.internal.operators.maybe.C23834B;
import io.reactivex.internal.operators.maybe.C23836C;
import io.reactivex.internal.operators.maybe.C23839D;
import io.reactivex.internal.operators.maybe.C23841E;
import io.reactivex.internal.operators.maybe.C23843F;
import io.reactivex.internal.operators.maybe.C23846G;
import io.reactivex.internal.operators.maybe.C23849H;
import io.reactivex.internal.operators.maybe.C23852I;
import io.reactivex.internal.operators.maybe.C23856J;
import io.reactivex.internal.operators.maybe.C23858K;
import io.reactivex.internal.operators.maybe.C23860L;
import io.reactivex.internal.operators.maybe.C23862M;
import io.reactivex.internal.operators.maybe.C23864N;
import io.reactivex.internal.operators.maybe.C23865O;
import io.reactivex.internal.operators.maybe.C23870b;
import io.reactivex.internal.operators.maybe.C23871c;
import io.reactivex.internal.operators.maybe.C23873d;
import io.reactivex.internal.operators.maybe.C23875e;
import io.reactivex.internal.operators.maybe.C23879g;
import io.reactivex.internal.operators.maybe.C23881h;
import io.reactivex.internal.operators.maybe.C23883i;
import io.reactivex.internal.operators.maybe.C23885j;
import io.reactivex.internal.operators.maybe.C23886k;
import io.reactivex.internal.operators.maybe.C23887l;
import io.reactivex.internal.operators.maybe.C23891n;
import io.reactivex.internal.operators.maybe.C23894o;
import io.reactivex.internal.operators.maybe.C23896p;
import io.reactivex.internal.operators.maybe.C23899q;
import io.reactivex.internal.operators.maybe.C23902r;
import io.reactivex.internal.operators.maybe.C23910v;
import io.reactivex.internal.operators.maybe.C23914x;
import io.reactivex.internal.operators.maybe.C23916y;
import io.reactivex.internal.operators.maybe.C23917z;
import io.reactivex.internal.operators.maybe.CallableC23905s;
import io.reactivex.internal.operators.mixed.C23932f;
import io.reactivex.plugins.C24508a;
import io.reactivex.schedulers.C24542a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* renamed from: io.reactivex.p */
/* loaded from: classes6.dex */
public abstract class AbstractC24507p<T> implements InterfaceC24574u<T> {
    /* renamed from: D */
    public static <T> AbstractC24507p<T> m32071D(Callable<? extends T> callable) {
        C23544b.m32923e(callable, "callable is null");
        return C24508a.m31995n(new CallableC23905s(callable));
    }

    /* renamed from: G */
    public static <T> AbstractC24507p<T> m32068G(T t) {
        C23544b.m32923e(t, "item is null");
        return C24508a.m31995n(new C23916y(t));
    }

    /* renamed from: a0 */
    public static AbstractC24507p<Long> m32049a0(long j, TimeUnit timeUnit) {
        return m32047b0(j, timeUnit, C24542a.m31934a());
    }

    /* renamed from: b0 */
    public static AbstractC24507p<Long> m32047b0(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31995n(new C23856J(Math.max(0L, j), timeUnit, abstractC23437E));
    }

    /* renamed from: g0 */
    public static <T> AbstractC24507p<T> m32040g0(InterfaceC24574u<T> interfaceC24574u) {
        if (interfaceC24574u instanceof AbstractC24507p) {
            return C24508a.m31995n((AbstractC24507p) interfaceC24574u);
        }
        C23544b.m32923e(interfaceC24574u, "onSubscribe is null");
        return C24508a.m31995n(new C23864N(interfaceC24574u));
    }

    /* renamed from: h */
    public static <T> AbstractC24490k<T> m32039h(Iterable<? extends InterfaceC24574u<? extends T>> iterable) {
        C23544b.m32923e(iterable, "sources is null");
        return C24508a.m31996m(new C23871c(iterable));
    }

    /* renamed from: h0 */
    public static <T1, T2, R> AbstractC24507p<R> m32038h0(InterfaceC24574u<? extends T1> interfaceC24574u, InterfaceC24574u<? extends T2> interfaceC24574u2, InterfaceC23480c<? super T1, ? super T2, ? extends R> interfaceC23480c) {
        C23544b.m32923e(interfaceC24574u, "source1 is null");
        C23544b.m32923e(interfaceC24574u2, "source2 is null");
        return m32036i0(C23506a.m32952v(interfaceC23480c), interfaceC24574u, interfaceC24574u2);
    }

    /* renamed from: i */
    public static <T> AbstractC24507p<T> m32037i(InterfaceC24573t<T> interfaceC24573t) {
        C23544b.m32923e(interfaceC24573t, "onSubscribe is null");
        return C24508a.m31995n(new C23873d(interfaceC24573t));
    }

    /* renamed from: i0 */
    public static <T, R> AbstractC24507p<R> m32036i0(InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, InterfaceC24574u<? extends T>... interfaceC24574uArr) {
        C23544b.m32923e(interfaceC24574uArr, "sources is null");
        if (interfaceC24574uArr.length == 0) {
            return m32024u();
        }
        C23544b.m32923e(interfaceC23492o, "zipper is null");
        return C24508a.m31995n(new C23865O(interfaceC24574uArr, interfaceC23492o));
    }

    /* renamed from: k */
    public static <T> AbstractC24507p<T> m32034k(Callable<? extends InterfaceC24574u<? extends T>> callable) {
        C23544b.m32923e(callable, "maybeSupplier is null");
        return C24508a.m31995n(new C23875e(callable));
    }

    /* renamed from: u */
    public static <T> AbstractC24507p<T> m32024u() {
        return C24508a.m31995n(C23885j.f89238b);
    }

    /* renamed from: v */
    public static <T> AbstractC24507p<T> m32023v(Throwable th) {
        C23544b.m32923e(th, "exception is null");
        return C24508a.m31995n(new C23886k(th));
    }

    /* renamed from: A */
    public final AbstractC23461c m32074A(InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31997l(new C23894o(this, interfaceC23492o));
    }

    /* renamed from: B */
    public final <R> Observable<R> m32073B(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31994o(new C23932f(this, interfaceC23492o));
    }

    /* renamed from: C */
    public final <R> AbstractC23442F<R> m32072C(InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31993p(new C23899q(this, interfaceC23492o));
    }

    /* renamed from: E */
    public final AbstractC24507p<T> m32070E() {
        return C24508a.m31995n(new C23910v(this));
    }

    /* renamed from: F */
    public final AbstractC23461c m32069F() {
        return C24508a.m31997l(new C23914x(this));
    }

    /* renamed from: H */
    public final <R> AbstractC24507p<R> m32067H(InterfaceC23492o<? super T, ? extends R> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31995n(new C23917z(this, interfaceC23492o));
    }

    /* renamed from: I */
    public final AbstractC24507p<T> m32066I(AbstractC23437E abstractC23437E) {
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31995n(new C23832A(this, abstractC23437E));
    }

    /* renamed from: J */
    public final AbstractC24507p<T> m32065J() {
        return m32064K(C23506a.m32971c());
    }

    /* renamed from: K */
    public final AbstractC24507p<T> m32064K(InterfaceC23494q<? super Throwable> interfaceC23494q) {
        C23544b.m32923e(interfaceC23494q, "predicate is null");
        return C24508a.m31995n(new C23834B(this, interfaceC23494q));
    }

    /* renamed from: L */
    public final AbstractC24507p<T> m32063L(InterfaceC24574u<? extends T> interfaceC24574u) {
        C23544b.m32923e(interfaceC24574u, "next is null");
        return m32062M(C23506a.m32962l(interfaceC24574u));
    }

    /* renamed from: M */
    public final AbstractC24507p<T> m32062M(InterfaceC23492o<? super Throwable, ? extends InterfaceC24574u<? extends T>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "resumeFunction is null");
        return C24508a.m31995n(new C23836C(this, interfaceC23492o, true));
    }

    /* renamed from: N */
    public final AbstractC24507p<T> m32061N(InterfaceC23492o<? super Throwable, ? extends T> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "valueSupplier is null");
        return C24508a.m31995n(new C23839D(this, interfaceC23492o));
    }

    /* renamed from: O */
    public final AbstractC24507p<T> m32060O(T t) {
        C23544b.m32923e(t, "item is null");
        return m32061N(C23506a.m32962l(t));
    }

    /* renamed from: P */
    public final AbstractC24507p<T> m32059P(long j) {
        return m32058Q(j, C23506a.m32971c());
    }

    /* renamed from: Q */
    public final AbstractC24507p<T> m32058Q(long j, InterfaceC23494q<? super Throwable> interfaceC23494q) {
        return m32046c0().m32188L0(j, interfaceC23494q).m32174S0();
    }

    /* renamed from: R */
    public final AbstractC24507p<T> m32057R(InterfaceC23492o<? super AbstractC24490k<Throwable>, ? extends InterfaceC45761na4<?>> interfaceC23492o) {
        return m32046c0().m32182O0(interfaceC23492o).m32174S0();
    }

    /* renamed from: S */
    public abstract void mo31908S(InterfaceC24541s<? super T> interfaceC24541s);

    /* renamed from: T */
    public final AbstractC24507p<T> m32056T(AbstractC23437E abstractC23437E) {
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31995n(new C23843F(this, abstractC23437E));
    }

    /* renamed from: U */
    public final <E extends InterfaceC24541s<? super T>> E m32055U(E e) {
        mo31865a(e);
        return e;
    }

    /* renamed from: V */
    public final AbstractC24507p<T> m32054V(InterfaceC24574u<? extends T> interfaceC24574u) {
        C23544b.m32923e(interfaceC24574u, "other is null");
        return C24508a.m31995n(new C23846G(this, interfaceC24574u));
    }

    /* renamed from: W */
    public final AbstractC23442F<T> m32053W(InterfaceC23447K<? extends T> interfaceC23447K) {
        C23544b.m32923e(interfaceC23447K, "other is null");
        return C24508a.m31993p(new C23849H(this, interfaceC23447K));
    }

    /* renamed from: X */
    public final AbstractC24507p<T> m32052X(long j, TimeUnit timeUnit, InterfaceC24574u<? extends T> interfaceC24574u) {
        C23544b.m32923e(interfaceC24574u, "fallback is null");
        return m32051Y(j, timeUnit, C24542a.m31934a(), interfaceC24574u);
    }

    /* renamed from: Y */
    public final AbstractC24507p<T> m32051Y(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, InterfaceC24574u<? extends T> interfaceC24574u) {
        C23544b.m32923e(interfaceC24574u, "fallback is null");
        return m32050Z(m32047b0(j, timeUnit, abstractC23437E), interfaceC24574u);
    }

    /* renamed from: Z */
    public final <U> AbstractC24507p<T> m32050Z(InterfaceC24574u<U> interfaceC24574u, InterfaceC24574u<? extends T> interfaceC24574u2) {
        C23544b.m32923e(interfaceC24574u, "timeoutIndicator is null");
        C23544b.m32923e(interfaceC24574u2, "fallback is null");
        return C24508a.m31995n(new C23852I(this, interfaceC24574u, interfaceC24574u2));
    }

    @Override // io.reactivex.InterfaceC24574u
    /* renamed from: a */
    public final void mo31865a(InterfaceC24541s<? super T> interfaceC24541s) {
        C23544b.m32923e(interfaceC24541s, "observer is null");
        InterfaceC24541s<? super T> m32018A = C24508a.m32018A(this, interfaceC24541s);
        C23544b.m32923e(m32018A, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo31908S(m32018A);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C23475a.m33009b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: b */
    public final <R> R m32048b(InterfaceC24515q<T, ? extends R> interfaceC24515q) {
        return (R) ((InterfaceC24515q) C23544b.m32923e(interfaceC24515q, "converter is null")).mo31964b(this);
    }

    /* renamed from: c0 */
    public final AbstractC24490k<T> m32046c0() {
        if (this instanceof InterfaceC23547b) {
            return ((InterfaceC23547b) this).mo32773d();
        }
        return C24508a.m31996m(new C23858K(this));
    }

    /* renamed from: d0 */
    public final Observable<T> m32045d0() {
        if (this instanceof InterfaceC23549d) {
            return ((InterfaceC23549d) this).mo32427c();
        }
        return C24508a.m31994o(new C23860L(this));
    }

    /* renamed from: e */
    public final T m32044e() {
        C23563h c23563h = new C23563h();
        mo31865a(c23563h);
        return (T) c23563h.m32915a();
    }

    /* renamed from: e0 */
    public final AbstractC23442F<T> m32043e0() {
        return C24508a.m31993p(new C23862M(this, null));
    }

    /* renamed from: f0 */
    public final AbstractC23442F<T> m32042f0(T t) {
        C23544b.m32923e(t, "defaultValue is null");
        return C24508a.m31993p(new C23862M(this, t));
    }

    /* renamed from: g */
    public final <R> AbstractC24507p<R> m32041g(InterfaceC24575v<? super T, ? extends R> interfaceC24575v) {
        return m32040g0(((InterfaceC24575v) C23544b.m32923e(interfaceC24575v, "transformer is null")).mo31864b(this));
    }

    /* renamed from: j */
    public final AbstractC24507p<T> m32035j(T t) {
        C23544b.m32923e(t, "defaultItem is null");
        return m32054V(m32068G(t));
    }

    /* renamed from: l */
    public final AbstractC24507p<T> m32033l(InterfaceC23478a interfaceC23478a) {
        InterfaceC23484g m32967g = C23506a.m32967g();
        InterfaceC23484g m32967g2 = C23506a.m32967g();
        InterfaceC23484g m32967g3 = C23506a.m32967g();
        InterfaceC23478a interfaceC23478a2 = C23506a.f88247c;
        return C24508a.m31995n(new C23841E(this, m32967g, m32967g2, m32967g3, interfaceC23478a2, (InterfaceC23478a) C23544b.m32923e(interfaceC23478a, "onAfterTerminate is null"), interfaceC23478a2));
    }

    /* renamed from: m */
    public final AbstractC24507p<T> m32032m(InterfaceC23478a interfaceC23478a) {
        C23544b.m32923e(interfaceC23478a, "onFinally is null");
        return C24508a.m31995n(new C23879g(this, interfaceC23478a));
    }

    /* renamed from: n */
    public final AbstractC24507p<T> m32031n(InterfaceC23478a interfaceC23478a) {
        InterfaceC23478a interfaceC23478a2 = C23506a.f88247c;
        return C24508a.m31995n(new C23841E(this, C23506a.m32967g(), C23506a.m32967g(), C23506a.m32967g(), (InterfaceC23478a) C23544b.m32923e(interfaceC23478a, "onComplete is null"), interfaceC23478a2, interfaceC23478a2));
    }

    /* renamed from: o */
    public final AbstractC24507p<T> m32030o(InterfaceC23478a interfaceC23478a) {
        InterfaceC23484g m32967g = C23506a.m32967g();
        InterfaceC23484g m32967g2 = C23506a.m32967g();
        InterfaceC23484g m32967g3 = C23506a.m32967g();
        InterfaceC23478a interfaceC23478a2 = C23506a.f88247c;
        return C24508a.m31995n(new C23841E(this, m32967g, m32967g2, m32967g3, interfaceC23478a2, interfaceC23478a2, (InterfaceC23478a) C23544b.m32923e(interfaceC23478a, "onDispose is null")));
    }

    /* renamed from: p */
    public final AbstractC24507p<T> m32029p(InterfaceC23484g<? super Throwable> interfaceC23484g) {
        InterfaceC23478a interfaceC23478a = C23506a.f88247c;
        return C24508a.m31995n(new C23841E(this, C23506a.m32967g(), C23506a.m32967g(), (InterfaceC23484g) C23544b.m32923e(interfaceC23484g, "onError is null"), interfaceC23478a, interfaceC23478a, interfaceC23478a));
    }

    /* renamed from: q */
    public final AbstractC24507p<T> m32028q(InterfaceC23479b<? super T, ? super Throwable> interfaceC23479b) {
        C23544b.m32923e(interfaceC23479b, "onEvent is null");
        return C24508a.m31995n(new C23881h(this, interfaceC23479b));
    }

    /* renamed from: r */
    public final AbstractC24507p<T> m32027r(InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g) {
        InterfaceC23484g m32967g = C23506a.m32967g();
        InterfaceC23484g m32967g2 = C23506a.m32967g();
        InterfaceC23478a interfaceC23478a = C23506a.f88247c;
        return C24508a.m31995n(new C23841E(this, (InterfaceC23484g) C23544b.m32923e(interfaceC23484g, "onSubscribe is null"), m32967g, m32967g2, interfaceC23478a, interfaceC23478a, interfaceC23478a));
    }

    /* renamed from: s */
    public final AbstractC24507p<T> m32026s(InterfaceC23484g<? super T> interfaceC23484g) {
        InterfaceC23484g m32967g = C23506a.m32967g();
        InterfaceC23478a interfaceC23478a = C23506a.f88247c;
        return C24508a.m31995n(new C23841E(this, C23506a.m32967g(), (InterfaceC23484g) C23544b.m32923e(interfaceC23484g, "onSuccess is null"), m32967g, interfaceC23478a, interfaceC23478a, interfaceC23478a));
    }

    public final InterfaceC23465c subscribe() {
        return subscribe(C23506a.m32967g(), C23506a.f88250f, C23506a.f88247c);
    }

    /* renamed from: t */
    public final AbstractC24507p<T> m32025t(InterfaceC23478a interfaceC23478a) {
        C23544b.m32923e(interfaceC23478a, "onTerminate is null");
        return C24508a.m31995n(new C23883i(this, interfaceC23478a));
    }

    /* renamed from: w */
    public final AbstractC24507p<T> m32022w(InterfaceC23494q<? super T> interfaceC23494q) {
        C23544b.m32923e(interfaceC23494q, "predicate is null");
        return C24508a.m31995n(new C23887l(this, interfaceC23494q));
    }

    /* renamed from: x */
    public final <R> AbstractC24507p<R> m32021x(InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31995n(new C23902r(this, interfaceC23492o));
    }

    /* renamed from: y */
    public final <U, R> AbstractC24507p<R> m32020y(InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends U>> interfaceC23492o, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32923e(interfaceC23480c, "resultSelector is null");
        return C24508a.m31995n(new C23891n(this, interfaceC23492o, interfaceC23480c));
    }

    /* renamed from: z */
    public final <R> AbstractC24507p<R> m32019z(InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, InterfaceC23492o<? super Throwable, ? extends InterfaceC24574u<? extends R>> interfaceC23492o2, Callable<? extends InterfaceC24574u<? extends R>> callable) {
        C23544b.m32923e(interfaceC23492o, "onSuccessMapper is null");
        C23544b.m32923e(interfaceC23492o2, "onErrorMapper is null");
        C23544b.m32923e(callable, "onCompleteSupplier is null");
        return C24508a.m31995n(new C23896p(this, interfaceC23492o, interfaceC23492o2, callable));
    }

    public final InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g) {
        return subscribe(interfaceC23484g, C23506a.f88250f, C23506a.f88247c);
    }

    public final InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2) {
        return subscribe(interfaceC23484g, interfaceC23484g2, C23506a.f88247c);
    }

    public final InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a) {
        C23544b.m32923e(interfaceC23484g, "onSuccess is null");
        C23544b.m32923e(interfaceC23484g2, "onError is null");
        C23544b.m32923e(interfaceC23478a, "onComplete is null");
        return (InterfaceC23465c) m32055U(new C23870b(interfaceC23484g, interfaceC23484g2, interfaceC23478a));
    }
}
