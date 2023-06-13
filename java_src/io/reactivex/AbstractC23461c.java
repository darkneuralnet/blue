package io.reactivex;

import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.functions.C23506a;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23547b;
import io.reactivex.internal.fuseable.InterfaceC23548c;
import io.reactivex.internal.fuseable.InterfaceC23549d;
import io.reactivex.internal.observers.C23563h;
import io.reactivex.internal.observers.C23565j;
import io.reactivex.internal.observers.C23569n;
import io.reactivex.internal.operators.completable.C23581A;
import io.reactivex.internal.operators.completable.C23585B;
import io.reactivex.internal.operators.completable.C23587C;
import io.reactivex.internal.operators.completable.C23588D;
import io.reactivex.internal.operators.completable.C23590E;
import io.reactivex.internal.operators.completable.C23592a;
import io.reactivex.internal.operators.completable.C23594b;
import io.reactivex.internal.operators.completable.C23597c;
import io.reactivex.internal.operators.completable.C23599d;
import io.reactivex.internal.operators.completable.C23601e;
import io.reactivex.internal.operators.completable.C23602f;
import io.reactivex.internal.operators.completable.C23604g;
import io.reactivex.internal.operators.completable.C23606h;
import io.reactivex.internal.operators.completable.C23608i;
import io.reactivex.internal.operators.completable.C23609j;
import io.reactivex.internal.operators.completable.C23610k;
import io.reactivex.internal.operators.completable.C23611l;
import io.reactivex.internal.operators.completable.C23612m;
import io.reactivex.internal.operators.completable.C23614n;
import io.reactivex.internal.operators.completable.C23617p;
import io.reactivex.internal.operators.completable.C23618q;
import io.reactivex.internal.operators.completable.C23620r;
import io.reactivex.internal.operators.completable.C23622s;
import io.reactivex.internal.operators.completable.C23624t;
import io.reactivex.internal.operators.completable.C23625u;
import io.reactivex.internal.operators.completable.C23627v;
import io.reactivex.internal.operators.completable.C23629w;
import io.reactivex.internal.operators.completable.C23631x;
import io.reactivex.internal.operators.completable.C23633y;
import io.reactivex.internal.operators.completable.C23635z;
import io.reactivex.internal.operators.maybe.C23876f;
import io.reactivex.internal.operators.maybe.C23906t;
import io.reactivex.internal.operators.mixed.C23919a;
import io.reactivex.internal.operators.mixed.C23921b;
import io.reactivex.internal.operators.single.C24365e;
import io.reactivex.plugins.C24508a;
import io.reactivex.schedulers.C24542a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* renamed from: io.reactivex.c */
/* loaded from: classes6.dex */
public abstract class AbstractC23461c implements InterfaceC23496h {
    /* renamed from: F */
    public static AbstractC23461c m33080F(Throwable th) {
        C23544b.m32923e(th, "error is null");
        return C24508a.m31997l(new C23609j(th));
    }

    /* renamed from: G */
    public static AbstractC23461c m33079G(InterfaceC23478a interfaceC23478a) {
        C23544b.m32923e(interfaceC23478a, "run is null");
        return C24508a.m31997l(new C23610k(interfaceC23478a));
    }

    /* renamed from: H */
    public static AbstractC23461c m33078H(Callable<?> callable) {
        C23544b.m32923e(callable, "callable is null");
        return C24508a.m31997l(new C23611l(callable));
    }

    /* renamed from: I */
    public static <T> AbstractC23461c m33077I(InterfaceC45761na4<T> interfaceC45761na4) {
        C23544b.m32923e(interfaceC45761na4, "publisher is null");
        return C24508a.m31997l(new C23612m(interfaceC45761na4));
    }

    /* renamed from: J */
    public static AbstractC23461c m33076J(Runnable runnable) {
        C23544b.m32923e(runnable, "run is null");
        return C24508a.m31997l(new C23614n(runnable));
    }

    /* renamed from: L */
    public static AbstractC23461c m33074L(Iterable<? extends InterfaceC23496h> iterable) {
        C23544b.m32923e(iterable, "sources is null");
        return C24508a.m31997l(new C23622s(iterable));
    }

    /* renamed from: M */
    public static AbstractC23461c m33073M(InterfaceC23496h... interfaceC23496hArr) {
        C23544b.m32923e(interfaceC23496hArr, "sources is null");
        if (interfaceC23496hArr.length == 0) {
            return m33039p();
        }
        if (interfaceC23496hArr.length == 1) {
            return m33044k0(interfaceC23496hArr[0]);
        }
        return C24508a.m31997l(new C23620r(interfaceC23496hArr));
    }

    /* renamed from: O */
    public static AbstractC23461c m33071O() {
        return C24508a.m31997l(C23624t.f88427b);
    }

    /* renamed from: c0 */
    public static AbstractC23461c m33057c0(long j, TimeUnit timeUnit) {
        return m33056d0(j, timeUnit, C24542a.m31934a());
    }

    /* renamed from: d0 */
    public static AbstractC23461c m33056d0(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31997l(new C23585B(j, timeUnit, abstractC23437E));
    }

    /* renamed from: g0 */
    public static NullPointerException m33052g0(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    /* renamed from: h */
    public static AbstractC23461c m33051h(InterfaceC23496h... interfaceC23496hArr) {
        C23544b.m32923e(interfaceC23496hArr, "sources is null");
        if (interfaceC23496hArr.length == 0) {
            return m33039p();
        }
        if (interfaceC23496hArr.length == 1) {
            return m33044k0(interfaceC23496hArr[0]);
        }
        return C24508a.m31997l(new C23592a(interfaceC23496hArr, null));
    }

    /* renamed from: k0 */
    public static AbstractC23461c m33044k0(InterfaceC23496h interfaceC23496h) {
        C23544b.m32923e(interfaceC23496h, "source is null");
        if (interfaceC23496h instanceof AbstractC23461c) {
            return C24508a.m31997l((AbstractC23461c) interfaceC23496h);
        }
        return C24508a.m31997l(new C23617p(interfaceC23496h));
    }

    /* renamed from: p */
    public static AbstractC23461c m33039p() {
        return C24508a.m31997l(C23608i.f88405b);
    }

    /* renamed from: r */
    public static AbstractC23461c m33037r(Iterable<? extends InterfaceC23496h> iterable) {
        C23544b.m32923e(iterable, "sources is null");
        return C24508a.m31997l(new C23597c(iterable));
    }

    /* renamed from: s */
    public static AbstractC23461c m33036s(InterfaceC23495g interfaceC23495g) {
        C23544b.m32923e(interfaceC23495g, "source is null");
        return C24508a.m31997l(new C23599d(interfaceC23495g));
    }

    /* renamed from: t */
    public static AbstractC23461c m33035t(Callable<? extends InterfaceC23496h> callable) {
        C23544b.m32923e(callable, "completableSupplier");
        return C24508a.m31997l(new C23601e(callable));
    }

    /* renamed from: A */
    public final AbstractC23461c m33085A(InterfaceC23478a interfaceC23478a) {
        InterfaceC23484g<? super InterfaceC23465c> m32967g = C23506a.m32967g();
        InterfaceC23484g<? super Throwable> m32967g2 = C23506a.m32967g();
        InterfaceC23478a interfaceC23478a2 = C23506a.f88247c;
        return m33082D(m32967g, m32967g2, interfaceC23478a2, interfaceC23478a2, interfaceC23478a2, interfaceC23478a);
    }

    /* renamed from: B */
    public final AbstractC23461c m33084B(InterfaceC23484g<? super Throwable> interfaceC23484g) {
        InterfaceC23484g<? super InterfaceC23465c> m32967g = C23506a.m32967g();
        InterfaceC23478a interfaceC23478a = C23506a.f88247c;
        return m33082D(m32967g, interfaceC23484g, interfaceC23478a, interfaceC23478a, interfaceC23478a, interfaceC23478a);
    }

    /* renamed from: C */
    public final AbstractC23461c m33083C(InterfaceC23484g<? super Throwable> interfaceC23484g) {
        C23544b.m32923e(interfaceC23484g, "onEvent is null");
        return C24508a.m31997l(new C23606h(this, interfaceC23484g));
    }

    /* renamed from: D */
    public final AbstractC23461c m33082D(InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a, InterfaceC23478a interfaceC23478a2, InterfaceC23478a interfaceC23478a3, InterfaceC23478a interfaceC23478a4) {
        C23544b.m32923e(interfaceC23484g, "onSubscribe is null");
        C23544b.m32923e(interfaceC23484g2, "onError is null");
        C23544b.m32923e(interfaceC23478a, "onComplete is null");
        C23544b.m32923e(interfaceC23478a2, "onTerminate is null");
        C23544b.m32923e(interfaceC23478a3, "onAfterTerminate is null");
        C23544b.m32923e(interfaceC23478a4, "onDispose is null");
        return C24508a.m31997l(new C23629w(this, interfaceC23484g, interfaceC23484g2, interfaceC23478a, interfaceC23478a2, interfaceC23478a3, interfaceC23478a4));
    }

    /* renamed from: E */
    public final AbstractC23461c m33081E(InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g) {
        InterfaceC23484g<? super Throwable> m32967g = C23506a.m32967g();
        InterfaceC23478a interfaceC23478a = C23506a.f88247c;
        return m33082D(interfaceC23484g, m32967g, interfaceC23478a, interfaceC23478a, interfaceC23478a, interfaceC23478a);
    }

    /* renamed from: K */
    public final AbstractC23461c m33075K() {
        return C24508a.m31997l(new C23618q(this));
    }

    /* renamed from: N */
    public final AbstractC23461c m33072N(InterfaceC23496h interfaceC23496h) {
        C23544b.m32923e(interfaceC23496h, "other is null");
        return m33073M(this, interfaceC23496h);
    }

    /* renamed from: P */
    public final AbstractC23461c m33070P(AbstractC23437E abstractC23437E) {
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31997l(new C23625u(this, abstractC23437E));
    }

    /* renamed from: Q */
    public final AbstractC23461c m33069Q() {
        return m33068R(C23506a.m32971c());
    }

    /* renamed from: R */
    public final AbstractC23461c m33068R(InterfaceC23494q<? super Throwable> interfaceC23494q) {
        C23544b.m32923e(interfaceC23494q, "predicate is null");
        return C24508a.m31997l(new C23627v(this, interfaceC23494q));
    }

    /* renamed from: S */
    public final AbstractC23461c m33067S(InterfaceC23492o<? super Throwable, ? extends InterfaceC23496h> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "errorMapper is null");
        return C24508a.m31997l(new C23631x(this, interfaceC23492o));
    }

    /* renamed from: T */
    public final AbstractC23461c m33066T() {
        return m33077I(m33054e0().m32192J0());
    }

    /* renamed from: U */
    public final AbstractC23461c m33065U(long j) {
        return m33077I(m33054e0().m32190K0(j));
    }

    /* renamed from: V */
    public final AbstractC23461c m33064V(InterfaceC23492o<? super AbstractC24490k<Throwable>, ? extends InterfaceC45761na4<?>> interfaceC23492o) {
        return m33077I(m33054e0().m32182O0(interfaceC23492o));
    }

    /* renamed from: W */
    public abstract void mo31912W(InterfaceC23476f interfaceC23476f);

    /* renamed from: X */
    public final AbstractC23461c m33063X(AbstractC23437E abstractC23437E) {
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31997l(new C23633y(this, abstractC23437E));
    }

    /* renamed from: Y */
    public final AbstractC23461c m33062Y(InterfaceC23496h interfaceC23496h) {
        C23544b.m32923e(interfaceC23496h, "other is null");
        return C24508a.m31997l(new C23635z(this, interfaceC23496h));
    }

    /* renamed from: Z */
    public final AbstractC23461c m33061Z(long j, TimeUnit timeUnit) {
        return m33058b0(j, timeUnit, C24542a.m31934a(), null);
    }

    /* renamed from: a0 */
    public final AbstractC23461c m33060a0(long j, TimeUnit timeUnit, InterfaceC23496h interfaceC23496h) {
        C23544b.m32923e(interfaceC23496h, "other is null");
        return m33058b0(j, timeUnit, C24542a.m31934a(), interfaceC23496h);
    }

    /* renamed from: b */
    public final InterfaceC23465c m33059b(InterfaceC23478a interfaceC23478a) {
        C23544b.m32923e(interfaceC23478a, "onComplete is null");
        C23565j c23565j = new C23565j(interfaceC23478a);
        mo33003g(c23565j);
        return c23565j;
    }

    /* renamed from: b0 */
    public final AbstractC23461c m33058b0(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, InterfaceC23496h interfaceC23496h) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31997l(new C23581A(this, j, timeUnit, abstractC23437E, interfaceC23496h));
    }

    /* renamed from: e */
    public final InterfaceC23465c m33055e(InterfaceC23478a interfaceC23478a, InterfaceC23484g<? super Throwable> interfaceC23484g) {
        C23544b.m32923e(interfaceC23484g, "onError is null");
        C23544b.m32923e(interfaceC23478a, "onComplete is null");
        C23565j c23565j = new C23565j(interfaceC23484g, interfaceC23478a);
        mo33003g(c23565j);
        return c23565j;
    }

    /* renamed from: e0 */
    public final <T> AbstractC24490k<T> m33054e0() {
        if (this instanceof InterfaceC23547b) {
            return ((InterfaceC23547b) this).mo32773d();
        }
        return C24508a.m31996m(new C23587C(this));
    }

    /* renamed from: f0 */
    public final <T> AbstractC24507p<T> m33053f0() {
        if (this instanceof InterfaceC23548c) {
            return ((InterfaceC23548c) this).mo32730a();
        }
        return C24508a.m31995n(new C23906t(this));
    }

    @Override // io.reactivex.InterfaceC23496h
    /* renamed from: g */
    public final void mo33003g(InterfaceC23476f interfaceC23476f) {
        C23544b.m32923e(interfaceC23476f, "observer is null");
        try {
            InterfaceC23476f m31983z = C24508a.m31983z(this, interfaceC23476f);
            C23544b.m32923e(m31983z, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo31912W(m31983z);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C23475a.m33009b(th);
            C24508a.m31988u(th);
            throw m33052g0(th);
        }
    }

    /* renamed from: h0 */
    public final <T> Observable<T> m33050h0() {
        if (this instanceof InterfaceC23549d) {
            return ((InterfaceC23549d) this).mo32427c();
        }
        return C24508a.m31994o(new C23588D(this));
    }

    /* renamed from: i */
    public final AbstractC23461c m33049i(InterfaceC23496h interfaceC23496h) {
        C23544b.m32923e(interfaceC23496h, "next is null");
        return C24508a.m31997l(new C23594b(this, interfaceC23496h));
    }

    /* renamed from: i0 */
    public final <T> AbstractC23442F<T> m33048i0(Callable<? extends T> callable) {
        C23544b.m32923e(callable, "completionValueSupplier is null");
        return C24508a.m31993p(new C23590E(this, callable, null));
    }

    /* renamed from: j */
    public final <T> AbstractC24490k<T> m33047j(InterfaceC45761na4<T> interfaceC45761na4) {
        C23544b.m32923e(interfaceC45761na4, "next is null");
        return C24508a.m31996m(new C23921b(this, interfaceC45761na4));
    }

    /* renamed from: j0 */
    public final <T> AbstractC23442F<T> m33046j0(T t) {
        C23544b.m32923e(t, "completionValue is null");
        return C24508a.m31993p(new C23590E(this, null, t));
    }

    /* renamed from: k */
    public final <T> AbstractC24507p<T> m33045k(InterfaceC24574u<T> interfaceC24574u) {
        C23544b.m32923e(interfaceC24574u, "next is null");
        return C24508a.m31995n(new C23876f(interfaceC24574u, this));
    }

    /* renamed from: l */
    public final <T> Observable<T> m33043l(InterfaceC23434B<T> interfaceC23434B) {
        C23544b.m32923e(interfaceC23434B, "next is null");
        return C24508a.m31994o(new C23919a(this, interfaceC23434B));
    }

    /* renamed from: m */
    public final <T> AbstractC23442F<T> m33042m(InterfaceC23447K<T> interfaceC23447K) {
        C23544b.m32923e(interfaceC23447K, "next is null");
        return C24508a.m31993p(new C24365e(interfaceC23447K, this));
    }

    /* renamed from: n */
    public final <R> R m33041n(InterfaceC23462d<? extends R> interfaceC23462d) {
        return (R) ((InterfaceC23462d) C23544b.m32923e(interfaceC23462d, "converter is null")).mo33028a(this);
    }

    /* renamed from: o */
    public final Throwable m33040o() {
        C23563h c23563h = new C23563h();
        mo33003g(c23563h);
        return c23563h.m32914b();
    }

    /* renamed from: q */
    public final AbstractC23461c m33038q(InterfaceC23497i interfaceC23497i) {
        return m33044k0(((InterfaceC23497i) C23544b.m32923e(interfaceC23497i, "transformer is null")).mo33002a(this));
    }

    public final InterfaceC23465c subscribe() {
        C23569n c23569n = new C23569n();
        mo33003g(c23569n);
        return c23569n;
    }

    /* renamed from: u */
    public final AbstractC23461c m33034u(long j, TimeUnit timeUnit) {
        return m33033v(j, timeUnit, C24542a.m31934a(), false);
    }

    /* renamed from: v */
    public final AbstractC23461c m33033v(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31997l(new C23602f(this, j, timeUnit, abstractC23437E, z));
    }

    /* renamed from: w */
    public final AbstractC23461c m33032w(long j, TimeUnit timeUnit) {
        return m33031x(j, timeUnit, C24542a.m31934a());
    }

    /* renamed from: x */
    public final AbstractC23461c m33031x(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return m33056d0(j, timeUnit, abstractC23437E).m33049i(this);
    }

    /* renamed from: y */
    public final AbstractC23461c m33030y(InterfaceC23478a interfaceC23478a) {
        C23544b.m32923e(interfaceC23478a, "onFinally is null");
        return C24508a.m31997l(new C23604g(this, interfaceC23478a));
    }

    /* renamed from: z */
    public final AbstractC23461c m33029z(InterfaceC23478a interfaceC23478a) {
        InterfaceC23484g<? super InterfaceC23465c> m32967g = C23506a.m32967g();
        InterfaceC23484g<? super Throwable> m32967g2 = C23506a.m32967g();
        InterfaceC23478a interfaceC23478a2 = C23506a.f88247c;
        return m33082D(m32967g, m32967g2, interfaceC23478a, interfaceC23478a2, interfaceC23478a2, interfaceC23478a2);
    }
}
