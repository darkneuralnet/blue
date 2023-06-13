package io.reactivex;

import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.flowables.AbstractC23477a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23493p;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.functions.C23506a;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceCallableC23553h;
import io.reactivex.internal.operators.flowable.C23638A;
import io.reactivex.internal.operators.flowable.C23644C;
import io.reactivex.internal.operators.flowable.C23647E;
import io.reactivex.internal.operators.flowable.C23650G;
import io.reactivex.internal.operators.flowable.C23652H;
import io.reactivex.internal.operators.flowable.C23653I;
import io.reactivex.internal.operators.flowable.C23655J;
import io.reactivex.internal.operators.flowable.C23658K;
import io.reactivex.internal.operators.flowable.C23662L;
import io.reactivex.internal.operators.flowable.C23664M;
import io.reactivex.internal.operators.flowable.C23667N;
import io.reactivex.internal.operators.flowable.C23671P;
import io.reactivex.internal.operators.flowable.C23673Q;
import io.reactivex.internal.operators.flowable.C23675S;
import io.reactivex.internal.operators.flowable.C23677T;
import io.reactivex.internal.operators.flowable.C23685W;
import io.reactivex.internal.operators.flowable.C23692Y;
import io.reactivex.internal.operators.flowable.C23697b;
import io.reactivex.internal.operators.flowable.C23702b0;
import io.reactivex.internal.operators.flowable.C23713c;
import io.reactivex.internal.operators.flowable.C23717c0;
import io.reactivex.internal.operators.flowable.C23719d;
import io.reactivex.internal.operators.flowable.C23721d0;
import io.reactivex.internal.operators.flowable.C23723e;
import io.reactivex.internal.operators.flowable.C23732e0;
import io.reactivex.internal.operators.flowable.C23734f;
import io.reactivex.internal.operators.flowable.C23739f0;
import io.reactivex.internal.operators.flowable.C23743g;
import io.reactivex.internal.operators.flowable.C23746g0;
import io.reactivex.internal.operators.flowable.C23748h;
import io.reactivex.internal.operators.flowable.C23753i;
import io.reactivex.internal.operators.flowable.C23756i0;
import io.reactivex.internal.operators.flowable.C23758j;
import io.reactivex.internal.operators.flowable.C23763k;
import io.reactivex.internal.operators.flowable.C23766k0;
import io.reactivex.internal.operators.flowable.C23769l;
import io.reactivex.internal.operators.flowable.C23771l0;
import io.reactivex.internal.operators.flowable.C23775m0;
import io.reactivex.internal.operators.flowable.C23778n;
import io.reactivex.internal.operators.flowable.C23780n0;
import io.reactivex.internal.operators.flowable.C23782o;
import io.reactivex.internal.operators.flowable.C23784o0;
import io.reactivex.internal.operators.flowable.C23786p;
import io.reactivex.internal.operators.flowable.C23787p0;
import io.reactivex.internal.operators.flowable.C23789q;
import io.reactivex.internal.operators.flowable.C23790q0;
import io.reactivex.internal.operators.flowable.C23792r;
import io.reactivex.internal.operators.flowable.C23795r0;
import io.reactivex.internal.operators.flowable.C23797s;
import io.reactivex.internal.operators.flowable.C23805t0;
import io.reactivex.internal.operators.flowable.C23807u;
import io.reactivex.internal.operators.flowable.C23810u0;
import io.reactivex.internal.operators.flowable.C23813v;
import io.reactivex.internal.operators.flowable.C23816v0;
import io.reactivex.internal.operators.flowable.C23820w0;
import io.reactivex.internal.operators.flowable.C23823x;
import io.reactivex.internal.operators.flowable.C23826y;
import io.reactivex.internal.operators.flowable.C23828z;
import io.reactivex.internal.operators.flowable.EnumC23649F;
import io.reactivex.internal.operators.mixed.C23923c;
import io.reactivex.internal.operators.mixed.C23926d;
import io.reactivex.internal.operators.mixed.C23929e;
import io.reactivex.internal.operators.observable.C24193h0;
import io.reactivex.internal.subscribers.C24448c;
import io.reactivex.internal.subscribers.C24456k;
import io.reactivex.internal.util.EnumC24466b;
import io.reactivex.internal.util.EnumC24474j;
import io.reactivex.plugins.C24508a;
import io.reactivex.schedulers.C24542a;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.k */
/* loaded from: classes6.dex */
public abstract class AbstractC24490k<T> implements InterfaceC45761na4<T> {

    /* renamed from: b */
    public static final int f91091b = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: F0 */
    public static AbstractC24490k<Integer> m32200F0(int i, int i2) {
        if (i2 >= 0) {
            if (i2 == 0) {
                return m32181P();
            }
            if (i2 == 1) {
                return m32123o0(Integer.valueOf(i));
            }
            if (i + (i2 - 1) <= 2147483647L) {
                return C24508a.m31996m(new C23685W(i, i2));
            }
            throw new IllegalArgumentException("Integer overflow");
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + i2);
    }

    /* renamed from: P */
    public static <T> AbstractC24490k<T> m32181P() {
        return C24508a.m31996m(C23786p.f88939c);
    }

    /* renamed from: Q */
    public static <T> AbstractC24490k<T> m32179Q(Throwable th) {
        C23544b.m32923e(th, "throwable is null");
        return m32177R(C23506a.m32963k(th));
    }

    /* renamed from: R */
    public static <T> AbstractC24490k<T> m32177R(Callable<? extends Throwable> callable) {
        C23544b.m32923e(callable, "supplier is null");
        return C24508a.m31996m(new C23789q(callable));
    }

    /* renamed from: h0 */
    public static <T> AbstractC24490k<T> m32144h0(T... tArr) {
        C23544b.m32923e(tArr, "items is null");
        if (tArr.length == 0) {
            return m32181P();
        }
        if (tArr.length == 1) {
            return m32123o0(tArr[0]);
        }
        return C24508a.m31996m(new C23828z(tArr));
    }

    /* renamed from: i0 */
    public static <T> AbstractC24490k<T> m32141i0(Iterable<? extends T> iterable) {
        C23544b.m32923e(iterable, "source is null");
        return C24508a.m31996m(new C23638A(iterable));
    }

    /* renamed from: j */
    public static int m32139j() {
        return f91091b;
    }

    /* renamed from: j0 */
    public static <T> AbstractC24490k<T> m32138j0(InterfaceC45761na4<? extends T> interfaceC45761na4) {
        if (interfaceC45761na4 instanceof AbstractC24490k) {
            return C24508a.m31996m((AbstractC24490k) interfaceC45761na4);
        }
        C23544b.m32923e(interfaceC45761na4, "source is null");
        return C24508a.m31996m(new C23644C(interfaceC45761na4));
    }

    /* renamed from: k */
    public static <T1, T2, R> AbstractC24490k<R> m32136k(InterfaceC45761na4<? extends T1> interfaceC45761na4, InterfaceC45761na4<? extends T2> interfaceC45761na42, InterfaceC23480c<? super T1, ? super T2, ? extends R> interfaceC23480c) {
        C23544b.m32923e(interfaceC45761na4, "source1 is null");
        C23544b.m32923e(interfaceC45761na42, "source2 is null");
        return m32133l(C23506a.m32952v(interfaceC23480c), interfaceC45761na4, interfaceC45761na42);
    }

    /* renamed from: l */
    public static <T, R> AbstractC24490k<R> m32133l(InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, InterfaceC45761na4<? extends T>... interfaceC45761na4Arr) {
        return m32127n(interfaceC45761na4Arr, interfaceC23492o, m32139j());
    }

    /* renamed from: l0 */
    public static AbstractC24490k<Long> m32132l0(long j, long j2, TimeUnit timeUnit) {
        return m32129m0(j, j2, timeUnit, C24542a.m31934a());
    }

    /* renamed from: m */
    public static <T, R> AbstractC24490k<R> m32130m(InterfaceC45761na4<? extends T>[] interfaceC45761na4Arr, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o) {
        return m32127n(interfaceC45761na4Arr, interfaceC23492o, m32139j());
    }

    /* renamed from: m0 */
    public static AbstractC24490k<Long> m32129m0(long j, long j2, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31996m(new C23650G(Math.max(0L, j), Math.max(0L, j2), timeUnit, abstractC23437E));
    }

    /* renamed from: n */
    public static <T, R> AbstractC24490k<R> m32127n(InterfaceC45761na4<? extends T>[] interfaceC45761na4Arr, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, int i) {
        C23544b.m32923e(interfaceC45761na4Arr, "sources is null");
        if (interfaceC45761na4Arr.length == 0) {
            return m32181P();
        }
        C23544b.m32923e(interfaceC23492o, "combiner is null");
        C23544b.m32922f(i, "bufferSize");
        return C24508a.m31996m(new C23713c(interfaceC45761na4Arr, interfaceC23492o, i, false));
    }

    /* renamed from: n0 */
    public static AbstractC24490k<Long> m32126n0(long j, TimeUnit timeUnit) {
        return m32129m0(j, j, timeUnit, C24542a.m31934a());
    }

    /* renamed from: o */
    public static <T> AbstractC24490k<T> m32124o(InterfaceC45761na4<? extends T> interfaceC45761na4, InterfaceC45761na4<? extends T> interfaceC45761na42) {
        C23544b.m32923e(interfaceC45761na4, "source1 is null");
        C23544b.m32923e(interfaceC45761na42, "source2 is null");
        return m32121p(interfaceC45761na4, interfaceC45761na42);
    }

    /* renamed from: o0 */
    public static <T> AbstractC24490k<T> m32123o0(T t) {
        C23544b.m32923e(t, "item is null");
        return C24508a.m31996m(new C23652H(t));
    }

    /* renamed from: o1 */
    public static AbstractC24490k<Long> m32122o1(long j, TimeUnit timeUnit) {
        return m32119p1(j, timeUnit, C24542a.m31934a());
    }

    /* renamed from: p */
    public static <T> AbstractC24490k<T> m32121p(InterfaceC45761na4<? extends T>... interfaceC45761na4Arr) {
        if (interfaceC45761na4Arr.length == 0) {
            return m32181P();
        }
        if (interfaceC45761na4Arr.length == 1) {
            return m32138j0(interfaceC45761na4Arr[0]);
        }
        return C24508a.m31996m(new C23719d(interfaceC45761na4Arr, false));
    }

    /* renamed from: p1 */
    public static AbstractC24490k<Long> m32119p1(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31996m(new C23795r0(Math.max(0L, j), timeUnit, abstractC23437E));
    }

    /* renamed from: r0 */
    public static <T> AbstractC24490k<T> m32114r0(InterfaceC45761na4<? extends T> interfaceC45761na4, InterfaceC45761na4<? extends T> interfaceC45761na42) {
        C23544b.m32923e(interfaceC45761na4, "source1 is null");
        C23544b.m32923e(interfaceC45761na42, "source2 is null");
        return m32144h0(interfaceC45761na4, interfaceC45761na42).m32165X(C23506a.m32965i(), false, 2);
    }

    /* renamed from: t */
    public static <T> AbstractC24490k<T> m32109t(InterfaceC24493n<T> interfaceC24493n, EnumC23460b enumC23460b) {
        C23544b.m32923e(interfaceC24493n, "source is null");
        C23544b.m32923e(enumC23460b, "mode is null");
        return C24508a.m31996m(new C23723e(interfaceC24493n, enumC23460b));
    }

    /* renamed from: u1 */
    public static <T1, T2, R> AbstractC24490k<R> m32104u1(InterfaceC45761na4<? extends T1> interfaceC45761na4, InterfaceC45761na4<? extends T2> interfaceC45761na42, InterfaceC23480c<? super T1, ? super T2, ? extends R> interfaceC23480c) {
        C23544b.m32923e(interfaceC45761na4, "source1 is null");
        C23544b.m32923e(interfaceC45761na42, "source2 is null");
        return m32101v1(C23506a.m32952v(interfaceC23480c), false, m32139j(), interfaceC45761na4, interfaceC45761na42);
    }

    /* renamed from: v1 */
    public static <T, R> AbstractC24490k<R> m32101v1(InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, boolean z, int i, InterfaceC45761na4<? extends T>... interfaceC45761na4Arr) {
        if (interfaceC45761na4Arr.length == 0) {
            return m32181P();
        }
        C23544b.m32923e(interfaceC23492o, "zipper is null");
        C23544b.m32922f(i, "bufferSize");
        return C24508a.m31996m(new C23820w0(interfaceC45761na4Arr, null, interfaceC23492o, i, z));
    }

    /* renamed from: A */
    public final <U> AbstractC24490k<T> m32211A(InterfaceC45761na4<U> interfaceC45761na4) {
        C23544b.m32923e(interfaceC45761na4, "subscriptionIndicator is null");
        return C24508a.m31996m(new C23743g(this, interfaceC45761na4));
    }

    /* renamed from: A0 */
    public final AbstractC24490k<T> m32210A0(InterfaceC23492o<? super Throwable, ? extends InterfaceC45761na4<? extends T>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "resumeFunction is null");
        return C24508a.m31996m(new C23673Q(this, interfaceC23492o, false));
    }

    /* renamed from: B */
    public final AbstractC24490k<T> m32209B() {
        return m32207C(C23506a.m32965i());
    }

    /* renamed from: B0 */
    public final AbstractC24490k<T> m32208B0(InterfaceC23492o<? super Throwable, ? extends T> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "valueSupplier is null");
        return C24508a.m31996m(new C23675S(this, interfaceC23492o));
    }

    /* renamed from: C */
    public final <K> AbstractC24490k<T> m32207C(InterfaceC23492o<? super T, K> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "keySelector is null");
        return C24508a.m31996m(new C23748h(this, interfaceC23492o, C23544b.m32924d()));
    }

    /* renamed from: C0 */
    public final AbstractC24490k<T> m32206C0(T t) {
        C23544b.m32923e(t, "item is null");
        return m32208B0(C23506a.m32962l(t));
    }

    /* renamed from: D */
    public final AbstractC24490k<T> m32205D(InterfaceC23484g<? super T> interfaceC23484g) {
        C23544b.m32923e(interfaceC23484g, "onAfterNext is null");
        return C24508a.m31996m(new C23753i(this, interfaceC23484g));
    }

    /* renamed from: D0 */
    public final AbstractC23477a<T> m32204D0() {
        return m32202E0(m32139j());
    }

    /* renamed from: E */
    public final AbstractC24490k<T> m32203E(InterfaceC23478a interfaceC23478a) {
        C23544b.m32923e(interfaceC23478a, "onFinally is null");
        return C24508a.m31996m(new C23758j(this, interfaceC23478a));
    }

    /* renamed from: E0 */
    public final AbstractC23477a<T> m32202E0(int i) {
        C23544b.m32922f(i, "bufferSize");
        return C23677T.m32876B1(this, i);
    }

    /* renamed from: F */
    public final AbstractC24490k<T> m32201F(InterfaceC23478a interfaceC23478a) {
        return m32193J(C23506a.m32967g(), C23506a.f88251g, interfaceC23478a);
    }

    /* renamed from: G */
    public final AbstractC24490k<T> m32199G(InterfaceC23478a interfaceC23478a) {
        return m32197H(C23506a.m32967g(), C23506a.m32967g(), interfaceC23478a, C23506a.f88247c);
    }

    /* renamed from: G0 */
    public final AbstractC24490k<T> m32198G0() {
        return m32196H0(LongCompanionObject.MAX_VALUE);
    }

    /* renamed from: H */
    public final AbstractC24490k<T> m32197H(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a, InterfaceC23478a interfaceC23478a2) {
        C23544b.m32923e(interfaceC23484g, "onNext is null");
        C23544b.m32923e(interfaceC23484g2, "onError is null");
        C23544b.m32923e(interfaceC23478a, "onComplete is null");
        C23544b.m32923e(interfaceC23478a2, "onAfterTerminate is null");
        return C24508a.m31996m(new C23763k(this, interfaceC23484g, interfaceC23484g2, interfaceC23478a, interfaceC23478a2));
    }

    /* renamed from: H0 */
    public final AbstractC24490k<T> m32196H0(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return m32181P();
            }
            return C24508a.m31996m(new C23692Y(this, j));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j);
    }

    /* renamed from: I */
    public final AbstractC24490k<T> m32195I(InterfaceC23484g<? super Throwable> interfaceC23484g) {
        InterfaceC23484g<? super T> m32967g = C23506a.m32967g();
        InterfaceC23478a interfaceC23478a = C23506a.f88247c;
        return m32197H(m32967g, interfaceC23484g, interfaceC23478a, interfaceC23478a);
    }

    /* renamed from: I0 */
    public final AbstractC23477a<T> m32194I0(int i) {
        C23544b.m32922f(i, "bufferSize");
        return C23702b0.m32847B1(this, i);
    }

    /* renamed from: J */
    public final AbstractC24490k<T> m32193J(InterfaceC23484g<? super InterfaceC46292oT5> interfaceC23484g, InterfaceC23493p interfaceC23493p, InterfaceC23478a interfaceC23478a) {
        C23544b.m32923e(interfaceC23484g, "onSubscribe is null");
        C23544b.m32923e(interfaceC23493p, "onRequest is null");
        C23544b.m32923e(interfaceC23478a, "onCancel is null");
        return C24508a.m31996m(new C23769l(this, interfaceC23484g, interfaceC23493p, interfaceC23478a));
    }

    /* renamed from: J0 */
    public final AbstractC24490k<T> m32192J0() {
        return m32188L0(LongCompanionObject.MAX_VALUE, C23506a.m32971c());
    }

    /* renamed from: K */
    public final AbstractC24490k<T> m32191K(InterfaceC23484g<? super T> interfaceC23484g) {
        InterfaceC23484g<? super Throwable> m32967g = C23506a.m32967g();
        InterfaceC23478a interfaceC23478a = C23506a.f88247c;
        return m32197H(interfaceC23484g, m32967g, interfaceC23478a, interfaceC23478a);
    }

    /* renamed from: K0 */
    public final AbstractC24490k<T> m32190K0(long j) {
        return m32188L0(j, C23506a.m32971c());
    }

    /* renamed from: L */
    public final AbstractC24490k<T> m32189L(InterfaceC23484g<? super InterfaceC46292oT5> interfaceC23484g) {
        return m32193J(interfaceC23484g, C23506a.f88251g, C23506a.f88247c);
    }

    /* renamed from: L0 */
    public final AbstractC24490k<T> m32188L0(long j, InterfaceC23494q<? super Throwable> interfaceC23494q) {
        if (j >= 0) {
            C23544b.m32923e(interfaceC23494q, "predicate is null");
            return C24508a.m31996m(new C23721d0(this, j, interfaceC23494q));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j);
    }

    /* renamed from: M */
    public final AbstractC24507p<T> m32187M(long j) {
        if (j >= 0) {
            return C24508a.m31995n(new C23778n(this, j));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    /* renamed from: M0 */
    public final AbstractC24490k<T> m32186M0(InterfaceC23481d<? super Integer, ? super Throwable> interfaceC23481d) {
        C23544b.m32923e(interfaceC23481d, "predicate is null");
        return C24508a.m31996m(new C23717c0(this, interfaceC23481d));
    }

    /* renamed from: N */
    public final AbstractC23442F<T> m32185N(long j, T t) {
        if (j >= 0) {
            C23544b.m32923e(t, "defaultItem is null");
            return C24508a.m31993p(new C23782o(this, j, t));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    /* renamed from: N0 */
    public final AbstractC24490k<T> m32184N0(InterfaceC23494q<? super Throwable> interfaceC23494q) {
        return m32188L0(LongCompanionObject.MAX_VALUE, interfaceC23494q);
    }

    /* renamed from: O */
    public final AbstractC23442F<T> m32183O(long j) {
        if (j >= 0) {
            return C24508a.m31993p(new C23782o(this, j, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    /* renamed from: O0 */
    public final AbstractC24490k<T> m32182O0(InterfaceC23492o<? super AbstractC24490k<Throwable>, ? extends InterfaceC45761na4<?>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "handler is null");
        return C24508a.m31996m(new C23732e0(this, interfaceC23492o));
    }

    /* renamed from: P0 */
    public final AbstractC24490k<T> m32180P0(long j, TimeUnit timeUnit) {
        return m32178Q0(j, timeUnit, C24542a.m31934a());
    }

    /* renamed from: Q0 */
    public final AbstractC24490k<T> m32178Q0(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31996m(new C23739f0(this, j, timeUnit, abstractC23437E, false));
    }

    /* renamed from: R0 */
    public final AbstractC24490k<T> m32176R0() {
        return m32204D0().m33008A1();
    }

    /* renamed from: S */
    public final AbstractC24490k<T> m32175S(InterfaceC23494q<? super T> interfaceC23494q) {
        C23544b.m32923e(interfaceC23494q, "predicate is null");
        return C24508a.m31996m(new C23792r(this, interfaceC23494q));
    }

    /* renamed from: S0 */
    public final AbstractC24507p<T> m32174S0() {
        return C24508a.m31995n(new C23756i0(this));
    }

    /* renamed from: T */
    public final AbstractC23442F<T> m32173T(T t) {
        return m32185N(0L, t);
    }

    /* renamed from: T0 */
    public final AbstractC24490k<T> m32172T0(Iterable<? extends T> iterable) {
        return m32121p(m32141i0(iterable), this);
    }

    /* renamed from: U */
    public final AbstractC24507p<T> m32171U() {
        return m32187M(0L);
    }

    /* renamed from: U0 */
    public final AbstractC24490k<T> m32170U0(T t) {
        C23544b.m32923e(t, "value is null");
        return m32121p(m32123o0(t), this);
    }

    /* renamed from: V */
    public final AbstractC23442F<T> m32169V() {
        return m32183O(0L);
    }

    /* renamed from: V0 */
    public final InterfaceC23465c m32168V0(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a, InterfaceC23484g<? super InterfaceC46292oT5> interfaceC23484g3) {
        C23544b.m32923e(interfaceC23484g, "onNext is null");
        C23544b.m32923e(interfaceC23484g2, "onError is null");
        C23544b.m32923e(interfaceC23478a, "onComplete is null");
        C23544b.m32923e(interfaceC23484g3, "onSubscribe is null");
        C24448c c24448c = new C24448c(interfaceC23484g, interfaceC23484g2, interfaceC23478a, interfaceC23484g3);
        m32166W0(c24448c);
        return c24448c;
    }

    /* renamed from: W */
    public final <R> AbstractC24490k<R> m32167W(InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends R>> interfaceC23492o) {
        return m32164Y(interfaceC23492o, false, m32139j(), m32139j());
    }

    /* renamed from: W0 */
    public final void m32166W0(InterfaceC24494o<? super T> interfaceC24494o) {
        C23544b.m32923e(interfaceC24494o, "s is null");
        try {
            InterfaceC42141hT5<? super T> m31984y = C24508a.m31984y(this, interfaceC24494o);
            C23544b.m32923e(m31984y, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo31967X0(m31984y);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C23475a.m33009b(th);
            C24508a.m31988u(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: X */
    public final <R> AbstractC24490k<R> m32165X(InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends R>> interfaceC23492o, boolean z, int i) {
        return m32164Y(interfaceC23492o, z, i, m32139j());
    }

    /* renamed from: X0 */
    public abstract void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5);

    /* renamed from: Y */
    public final <R> AbstractC24490k<R> m32164Y(InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends R>> interfaceC23492o, boolean z, int i, int i2) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "maxConcurrency");
        C23544b.m32922f(i2, "bufferSize");
        if (this instanceof InterfaceCallableC23553h) {
            Object call = ((InterfaceCallableC23553h) this).call();
            if (call == null) {
                return m32181P();
            }
            return C23746g0.m32800a(call, interfaceC23492o);
        }
        return C24508a.m31996m(new C23797s(this, interfaceC23492o, z, i, i2));
    }

    /* renamed from: Y0 */
    public final AbstractC24490k<T> m32163Y0(AbstractC23437E abstractC23437E) {
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return m32161Z0(abstractC23437E, !(this instanceof C23723e));
    }

    /* renamed from: Z */
    public final AbstractC23461c m32162Z(InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o) {
        return m32160a0(interfaceC23492o, false, Integer.MAX_VALUE);
    }

    /* renamed from: Z0 */
    public final AbstractC24490k<T> m32161Z0(AbstractC23437E abstractC23437E, boolean z) {
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31996m(new C23766k0(this, abstractC23437E, z));
    }

    /* renamed from: a0 */
    public final AbstractC23461c m32160a0(InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, boolean z, int i) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "maxConcurrency");
        return C24508a.m31997l(new C23807u(this, interfaceC23492o, z, i));
    }

    /* renamed from: a1 */
    public final AbstractC24490k<T> m32159a1(InterfaceC45761na4<? extends T> interfaceC45761na4) {
        C23544b.m32923e(interfaceC45761na4, "other is null");
        return C24508a.m31996m(new C23771l0(this, interfaceC45761na4));
    }

    /* renamed from: b0 */
    public final <U> AbstractC24490k<U> m32158b0(InterfaceC23492o<? super T, ? extends Iterable<? extends U>> interfaceC23492o) {
        return m32156c0(interfaceC23492o, m32139j());
    }

    /* renamed from: b1 */
    public final <R> AbstractC24490k<R> m32157b1(InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends R>> interfaceC23492o) {
        return m32155c1(interfaceC23492o, m32139j());
    }

    @Override // p000.InterfaceC45761na4
    /* renamed from: c */
    public final void mo23497c(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        if (interfaceC42141hT5 instanceof InterfaceC24494o) {
            m32166W0((InterfaceC24494o) interfaceC42141hT5);
            return;
        }
        C23544b.m32923e(interfaceC42141hT5, "s is null");
        m32166W0(new C24456k(interfaceC42141hT5));
    }

    /* renamed from: c0 */
    public final <U> AbstractC24490k<U> m32156c0(InterfaceC23492o<? super T, ? extends Iterable<? extends U>> interfaceC23492o, int i) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "bufferSize");
        return C24508a.m31996m(new C23826y(this, interfaceC23492o, i));
    }

    /* renamed from: c1 */
    public final <R> AbstractC24490k<R> m32155c1(InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends R>> interfaceC23492o, int i) {
        return m32153d1(interfaceC23492o, i, false);
    }

    /* renamed from: d0 */
    public final <R> AbstractC24490k<R> m32154d0(InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o) {
        return m32152e0(interfaceC23492o, false, Integer.MAX_VALUE);
    }

    /* renamed from: d1 */
    public <R> AbstractC24490k<R> m32153d1(InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends R>> interfaceC23492o, int i, boolean z) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "bufferSize");
        if (this instanceof InterfaceCallableC23553h) {
            Object call = ((InterfaceCallableC23553h) this).call();
            if (call == null) {
                return m32181P();
            }
            return C23746g0.m32800a(call, interfaceC23492o);
        }
        return C24508a.m31996m(new C23775m0(this, interfaceC23492o, i, z));
    }

    /* renamed from: e0 */
    public final <R> AbstractC24490k<R> m32152e0(InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, boolean z, int i) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "maxConcurrency");
        return C24508a.m31996m(new C23813v(this, interfaceC23492o, z, i));
    }

    /* renamed from: e1 */
    public final AbstractC23461c m32151e1(InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31997l(new C23926d(this, interfaceC23492o, false));
    }

    /* renamed from: f */
    public final <R> R m32150f(InterfaceC24491l<T, ? extends R> interfaceC24491l) {
        return (R) ((InterfaceC24491l) C23544b.m32923e(interfaceC24491l, "converter is null")).mo32092d(this);
    }

    /* renamed from: f0 */
    public final <R> AbstractC24490k<R> m32149f0(InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o) {
        return m32146g0(interfaceC23492o, false, Integer.MAX_VALUE);
    }

    /* renamed from: f1 */
    public final <R> AbstractC24490k<R> m32148f1(InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31996m(new C23929e(this, interfaceC23492o, false));
    }

    /* renamed from: g */
    public final AbstractC24490k<List<T>> m32147g(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, int i) {
        return (AbstractC24490k<List<T>>) m32142i(j, timeUnit, abstractC23437E, i, EnumC24466b.m32279b(), false);
    }

    /* renamed from: g0 */
    public final <R> AbstractC24490k<R> m32146g0(InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o, boolean z, int i) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "maxConcurrency");
        return C24508a.m31996m(new C23823x(this, interfaceC23492o, z, i));
    }

    /* renamed from: g1 */
    public final AbstractC24490k<T> m32145g1(long j) {
        if (j >= 0) {
            return C24508a.m31996m(new C23780n0(this, j));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j);
    }

    /* renamed from: h1 */
    public final AbstractC24490k<T> m32143h1(InterfaceC23494q<? super T> interfaceC23494q) {
        C23544b.m32923e(interfaceC23494q, "stopPredicate is null");
        return C24508a.m31996m(new C23784o0(this, interfaceC23494q));
    }

    /* renamed from: i */
    public final <U extends Collection<? super T>> AbstractC24490k<U> m32142i(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, int i, Callable<U> callable, boolean z) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        C23544b.m32923e(callable, "bufferSupplier is null");
        C23544b.m32922f(i, "count");
        return C24508a.m31996m(new C23697b(this, j, j, timeUnit, abstractC23437E, callable, i, z));
    }

    /* renamed from: i1 */
    public final AbstractC24490k<T> m32140i1(long j, TimeUnit timeUnit) {
        return m32137j1(j, timeUnit, C24542a.m31934a());
    }

    /* renamed from: j1 */
    public final AbstractC24490k<T> m32137j1(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31996m(new C23787p0(this, j, timeUnit, abstractC23437E));
    }

    /* renamed from: k0 */
    public final AbstractC23461c m32135k0() {
        return C24508a.m31997l(new C23647E(this));
    }

    /* renamed from: k1 */
    public final AbstractC24490k<T> m32134k1(long j, TimeUnit timeUnit) {
        return m32180P0(j, timeUnit);
    }

    /* renamed from: l1 */
    public final AbstractC24490k<T> m32131l1(long j, TimeUnit timeUnit) {
        return m32128m1(j, timeUnit, C24542a.m31934a(), false);
    }

    /* renamed from: m1 */
    public final AbstractC24490k<T> m32128m1(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31996m(new C23790q0(this, j, timeUnit, abstractC23437E, z));
    }

    /* renamed from: n1 */
    public final AbstractC24490k<T> m32125n1(long j, TimeUnit timeUnit, boolean z) {
        return m32128m1(j, timeUnit, C24542a.m31934a(), z);
    }

    /* renamed from: p0 */
    public final AbstractC23442F<T> m32120p0() {
        return C24508a.m31993p(new C23653I(this, null));
    }

    /* renamed from: q */
    public final <R> AbstractC24490k<R> m32118q(InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o) {
        return m32115r(interfaceC23492o, 2);
    }

    /* renamed from: q0 */
    public final <R> AbstractC24490k<R> m32117q0(InterfaceC23492o<? super T, ? extends R> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31996m(new C23655J(this, interfaceC23492o));
    }

    /* renamed from: q1 */
    public final AbstractC23442F<List<T>> m32116q1() {
        return C24508a.m31993p(new C23805t0(this));
    }

    /* renamed from: r */
    public final <R> AbstractC24490k<R> m32115r(InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, int i) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "prefetch");
        return C24508a.m31996m(new C23923c(this, interfaceC23492o, EnumC24474j.IMMEDIATE, i));
    }

    /* renamed from: r1 */
    public final Observable<T> m32113r1() {
        return C24508a.m31994o(new C24193h0(this));
    }

    /* renamed from: s */
    public final AbstractC24490k<T> m32112s(InterfaceC45761na4<? extends T> interfaceC45761na4) {
        C23544b.m32923e(interfaceC45761na4, "other is null");
        return m32124o(this, interfaceC45761na4);
    }

    /* renamed from: s0 */
    public final AbstractC24490k<T> m32111s0(AbstractC23437E abstractC23437E) {
        return m32108t0(abstractC23437E, false, m32139j());
    }

    /* renamed from: s1 */
    public final AbstractC24490k<T> m32110s1(AbstractC23437E abstractC23437E) {
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31996m(new C23810u0(this, abstractC23437E));
    }

    public final InterfaceC23465c subscribe() {
        return m32168V0(C23506a.m32967g(), C23506a.f88250f, C23506a.f88247c, EnumC23649F.INSTANCE);
    }

    /* renamed from: t0 */
    public final AbstractC24490k<T> m32108t0(AbstractC23437E abstractC23437E, boolean z, int i) {
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        C23544b.m32922f(i, "bufferSize");
        return C24508a.m31996m(new C23658K(this, abstractC23437E, z, i));
    }

    /* renamed from: t1 */
    public final <U, R> AbstractC24490k<R> m32107t1(InterfaceC45761na4<? extends U> interfaceC45761na4, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c) {
        C23544b.m32923e(interfaceC45761na4, "other is null");
        C23544b.m32923e(interfaceC23480c, "combiner is null");
        return C24508a.m31996m(new C23816v0(this, interfaceC23480c, interfaceC45761na4));
    }

    /* renamed from: u */
    public final AbstractC24490k<T> m32106u(T t) {
        C23544b.m32923e(t, "defaultItem is null");
        return m32159a1(m32123o0(t));
    }

    /* renamed from: u0 */
    public final AbstractC24490k<T> m32105u0() {
        return m32102v0(m32139j(), false, true);
    }

    /* renamed from: v */
    public final AbstractC24490k<T> m32103v(long j, TimeUnit timeUnit) {
        return m32098x(j, timeUnit, C24542a.m31934a(), false);
    }

    /* renamed from: v0 */
    public final AbstractC24490k<T> m32102v0(int i, boolean z, boolean z2) {
        C23544b.m32922f(i, "capacity");
        return C24508a.m31996m(new C23662L(this, i, z2, z, C23506a.f88247c));
    }

    /* renamed from: w0 */
    public final AbstractC24490k<T> m32100w0(long j, InterfaceC23478a interfaceC23478a, EnumC23450a enumC23450a) {
        C23544b.m32923e(enumC23450a, "overflowStrategy is null");
        C23544b.m32921g(j, "capacity");
        return C24508a.m31996m(new C23664M(this, j, interfaceC23478a, enumC23450a));
    }

    /* renamed from: w1 */
    public final <U, R> AbstractC24490k<R> m32099w1(InterfaceC45761na4<? extends U> interfaceC45761na4, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c) {
        C23544b.m32923e(interfaceC45761na4, "other is null");
        return m32104u1(this, interfaceC45761na4, interfaceC23480c);
    }

    /* renamed from: x */
    public final AbstractC24490k<T> m32098x(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31996m(new C23734f(this, Math.max(0L, j), timeUnit, abstractC23437E, z));
    }

    /* renamed from: x0 */
    public final AbstractC24490k<T> m32097x0() {
        return C24508a.m31996m(new C23667N(this));
    }

    /* renamed from: y */
    public final AbstractC24490k<T> m32096y(long j, TimeUnit timeUnit) {
        return m32094z(j, timeUnit, C24542a.m31934a());
    }

    /* renamed from: y0 */
    public final AbstractC24490k<T> m32095y0() {
        return C24508a.m31996m(new C23671P(this));
    }

    /* renamed from: z */
    public final AbstractC24490k<T> m32094z(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return m32211A(m32119p1(j, timeUnit, abstractC23437E));
    }

    /* renamed from: z0 */
    public final AbstractC24490k<T> m32093z0(InterfaceC45761na4<? extends T> interfaceC45761na4) {
        C23544b.m32923e(interfaceC45761na4, "next is null");
        return m32210A0(C23506a.m32962l(interfaceC45761na4));
    }

    public final InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g) {
        return m32168V0(interfaceC23484g, C23506a.f88250f, C23506a.f88247c, EnumC23649F.INSTANCE);
    }

    public final InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2) {
        return m32168V0(interfaceC23484g, interfaceC23484g2, C23506a.f88247c, EnumC23649F.INSTANCE);
    }
}
