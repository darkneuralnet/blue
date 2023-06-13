package io.reactivex;

import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23482e;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23488k;
import io.reactivex.functions.InterfaceC23489l;
import io.reactivex.functions.InterfaceC23490m;
import io.reactivex.functions.InterfaceC23491n;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.functions.C23506a;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceCallableC23553h;
import io.reactivex.internal.observers.C23561f;
import io.reactivex.internal.observers.C23562g;
import io.reactivex.internal.observers.C23570o;
import io.reactivex.internal.observers.C23574s;
import io.reactivex.internal.observers.FutureC23571p;
import io.reactivex.internal.operators.flowable.C23642B;
import io.reactivex.internal.operators.flowable.C23669O;
import io.reactivex.internal.operators.mixed.C23934g;
import io.reactivex.internal.operators.mixed.C23937h;
import io.reactivex.internal.operators.mixed.C23940i;
import io.reactivex.internal.operators.mixed.C23943j;
import io.reactivex.internal.operators.mixed.C23946k;
import io.reactivex.internal.operators.mixed.C23949l;
import io.reactivex.internal.operators.observable.C23957A0;
import io.reactivex.internal.operators.observable.C23960A1;
import io.reactivex.internal.operators.observable.C23965B;
import io.reactivex.internal.operators.observable.C23967B0;
import io.reactivex.internal.operators.observable.C23970B1;
import io.reactivex.internal.operators.observable.C23976C;
import io.reactivex.internal.operators.observable.C23978C0;
import io.reactivex.internal.operators.observable.C23981C1;
import io.reactivex.internal.operators.observable.C23983D;
import io.reactivex.internal.operators.observable.C23986D0;
import io.reactivex.internal.operators.observable.C23987D1;
import io.reactivex.internal.operators.observable.C23989E;
import io.reactivex.internal.operators.observable.C23992E0;
import io.reactivex.internal.operators.observable.C23994E1;
import io.reactivex.internal.operators.observable.C23996F;
import io.reactivex.internal.operators.observable.C23997F0;
import io.reactivex.internal.operators.observable.C23999F1;
import io.reactivex.internal.operators.observable.C24002G;
import io.reactivex.internal.operators.observable.C24007G0;
import io.reactivex.internal.operators.observable.C24009G1;
import io.reactivex.internal.operators.observable.C24011H;
import io.reactivex.internal.operators.observable.C24014H0;
import io.reactivex.internal.operators.observable.C24018H1;
import io.reactivex.internal.operators.observable.C24021I;
import io.reactivex.internal.operators.observable.C24026I1;
import io.reactivex.internal.operators.observable.C24029J;
import io.reactivex.internal.operators.observable.C24032J1;
import io.reactivex.internal.operators.observable.C24037K;
import io.reactivex.internal.operators.observable.C24039K0;
import io.reactivex.internal.operators.observable.C24042K1;
import io.reactivex.internal.operators.observable.C24045L;
import io.reactivex.internal.operators.observable.C24047L0;
import io.reactivex.internal.operators.observable.C24049L1;
import io.reactivex.internal.operators.observable.C24056M;
import io.reactivex.internal.operators.observable.C24058M0;
import io.reactivex.internal.operators.observable.C24060M1;
import io.reactivex.internal.operators.observable.C24063N;
import io.reactivex.internal.operators.observable.C24065N0;
import io.reactivex.internal.operators.observable.C24067N1;
import io.reactivex.internal.operators.observable.C24071O;
import io.reactivex.internal.operators.observable.C24073O0;
import io.reactivex.internal.operators.observable.C24075O1;
import io.reactivex.internal.operators.observable.C24078P;
import io.reactivex.internal.operators.observable.C24079P0;
import io.reactivex.internal.operators.observable.C24080P1;
import io.reactivex.internal.operators.observable.C24088R0;
import io.reactivex.internal.operators.observable.C24090S;
import io.reactivex.internal.operators.observable.C24092S0;
import io.reactivex.internal.operators.observable.C24094T;
import io.reactivex.internal.operators.observable.C24096T0;
import io.reactivex.internal.operators.observable.C24099U;
import io.reactivex.internal.operators.observable.C24100U0;
import io.reactivex.internal.operators.observable.C24117V;
import io.reactivex.internal.operators.observable.C24118V0;
import io.reactivex.internal.operators.observable.C24120W;
import io.reactivex.internal.operators.observable.C24122W0;
import io.reactivex.internal.operators.observable.C24124X;
import io.reactivex.internal.operators.observable.C24127X0;
import io.reactivex.internal.operators.observable.C24133Y0;
import io.reactivex.internal.operators.observable.C24137Z;
import io.reactivex.internal.operators.observable.C24140Z0;
import io.reactivex.internal.operators.observable.C24146a0;
import io.reactivex.internal.operators.observable.C24149a1;
import io.reactivex.internal.operators.observable.C24152b;
import io.reactivex.internal.operators.observable.C24154b0;
import io.reactivex.internal.operators.observable.C24157b1;
import io.reactivex.internal.operators.observable.C24159c;
import io.reactivex.internal.operators.observable.C24161c0;
import io.reactivex.internal.operators.observable.C24163c1;
import io.reactivex.internal.operators.observable.C24165d;
import io.reactivex.internal.operators.observable.C24168d0;
import io.reactivex.internal.operators.observable.C24173e;
import io.reactivex.internal.operators.observable.C24177e1;
import io.reactivex.internal.operators.observable.C24182f0;
import io.reactivex.internal.operators.observable.C24183f1;
import io.reactivex.internal.operators.observable.C24184g;
import io.reactivex.internal.operators.observable.C24186g0;
import io.reactivex.internal.operators.observable.C24188g1;
import io.reactivex.internal.operators.observable.C24190h;
import io.reactivex.internal.operators.observable.C24193h0;
import io.reactivex.internal.operators.observable.C24195h1;
import io.reactivex.internal.operators.observable.C24199i0;
import io.reactivex.internal.operators.observable.C24200i1;
import io.reactivex.internal.operators.observable.C24202j;
import io.reactivex.internal.operators.observable.C24204j0;
import io.reactivex.internal.operators.observable.C24206j1;
import io.reactivex.internal.operators.observable.C24209k0;
import io.reactivex.internal.operators.observable.C24213k1;
import io.reactivex.internal.operators.observable.C24215l;
import io.reactivex.internal.operators.observable.C24216l0;
import io.reactivex.internal.operators.observable.C24221l1;
import io.reactivex.internal.operators.observable.C24224m;
import io.reactivex.internal.operators.observable.C24227m0;
import io.reactivex.internal.operators.observable.C24229m1;
import io.reactivex.internal.operators.observable.C24231n;
import io.reactivex.internal.operators.observable.C24235n0;
import io.reactivex.internal.operators.observable.C24237n1;
import io.reactivex.internal.operators.observable.C24240o;
import io.reactivex.internal.operators.observable.C24243o0;
import io.reactivex.internal.operators.observable.C24245o1;
import io.reactivex.internal.operators.observable.C24247p;
import io.reactivex.internal.operators.observable.C24250p0;
import io.reactivex.internal.operators.observable.C24266p1;
import io.reactivex.internal.operators.observable.C24269q;
import io.reactivex.internal.operators.observable.C24275q0;
import io.reactivex.internal.operators.observable.C24277q1;
import io.reactivex.internal.operators.observable.C24279r;
import io.reactivex.internal.operators.observable.C24282r0;
import io.reactivex.internal.operators.observable.C24284r1;
import io.reactivex.internal.operators.observable.C24288s0;
import io.reactivex.internal.operators.observable.C24290s1;
import io.reactivex.internal.operators.observable.C24292t;
import io.reactivex.internal.operators.observable.C24294t0;
import io.reactivex.internal.operators.observable.C24295t1;
import io.reactivex.internal.operators.observable.C24297u;
import io.reactivex.internal.operators.observable.C24300u0;
import io.reactivex.internal.operators.observable.C24302u1;
import io.reactivex.internal.operators.observable.C24305v;
import io.reactivex.internal.operators.observable.C24310v0;
import io.reactivex.internal.operators.observable.C24312v1;
import io.reactivex.internal.operators.observable.C24314w;
import io.reactivex.internal.operators.observable.C24316w0;
import io.reactivex.internal.operators.observable.C24317w1;
import io.reactivex.internal.operators.observable.C24319x;
import io.reactivex.internal.operators.observable.C24321x0;
import io.reactivex.internal.operators.observable.C24323x1;
import io.reactivex.internal.operators.observable.C24325y;
import io.reactivex.internal.operators.observable.C24327y0;
import io.reactivex.internal.operators.observable.C24329y1;
import io.reactivex.internal.operators.observable.C24331z;
import io.reactivex.internal.operators.observable.C24333z0;
import io.reactivex.internal.operators.observable.C24335z1;
import io.reactivex.internal.operators.observable.CallableC24176e0;
import io.reactivex.internal.util.C24475k;
import io.reactivex.internal.util.EnumC24466b;
import io.reactivex.internal.util.EnumC24474j;
import io.reactivex.internal.util.EnumC24478m;
import io.reactivex.observables.AbstractC24495a;
import io.reactivex.observables.AbstractC24496b;
import io.reactivex.observers.C24503g;
import io.reactivex.observers.C24505i;
import io.reactivex.plugins.C24508a;
import io.reactivex.schedulers.C24542a;
import io.reactivex.schedulers.C24551b;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;
/* loaded from: classes6.dex */
public abstract class Observable<T> implements InterfaceC23434B<T> {

    /* renamed from: io.reactivex.Observable$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C23449a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f88205a;

        static {
            int[] iArr = new int[EnumC23460b.values().length];
            f88205a = iArr;
            try {
                iArr[EnumC23460b.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88205a[EnumC23460b.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88205a[EnumC23460b.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88205a[EnumC23460b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static <T> Observable<T> amb(Iterable<? extends InterfaceC23434B<? extends T>> iterable) {
        C23544b.m32923e(iterable, "sources is null");
        return C24508a.m31994o(new C24190h(null, iterable));
    }

    public static <T> Observable<T> ambArray(InterfaceC23434B<? extends T>... interfaceC23434BArr) {
        C23544b.m32923e(interfaceC23434BArr, "sources is null");
        int length = interfaceC23434BArr.length;
        if (length == 0) {
            return empty();
        }
        if (length == 1) {
            return wrap(interfaceC23434BArr[0]);
        }
        return C24508a.m31994o(new C24190h(interfaceC23434BArr, null));
    }

    public static int bufferSize() {
        return AbstractC24490k.m32139j();
    }

    public static <T, R> Observable<R> combineLatest(InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, int i, InterfaceC23434B<? extends T>... interfaceC23434BArr) {
        return combineLatest(interfaceC23434BArr, interfaceC23492o, i);
    }

    public static <T, R> Observable<R> combineLatestDelayError(InterfaceC23434B<? extends T>[] interfaceC23434BArr, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o) {
        return combineLatestDelayError(interfaceC23434BArr, interfaceC23492o, bufferSize());
    }

    public static <T> Observable<T> concat(Iterable<? extends InterfaceC23434B<? extends T>> iterable) {
        C23544b.m32923e(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(C23506a.m32965i(), bufferSize(), false);
    }

    public static <T> Observable<T> concatArray(InterfaceC23434B<? extends T>... interfaceC23434BArr) {
        if (interfaceC23434BArr.length == 0) {
            return empty();
        }
        if (interfaceC23434BArr.length == 1) {
            return wrap(interfaceC23434BArr[0]);
        }
        return C24508a.m31994o(new C24305v(fromArray(interfaceC23434BArr), C23506a.m32965i(), bufferSize(), EnumC24474j.BOUNDARY));
    }

    public static <T> Observable<T> concatArrayDelayError(InterfaceC23434B<? extends T>... interfaceC23434BArr) {
        if (interfaceC23434BArr.length == 0) {
            return empty();
        }
        if (interfaceC23434BArr.length == 1) {
            return wrap(interfaceC23434BArr[0]);
        }
        return concatDelayError(fromArray(interfaceC23434BArr));
    }

    public static <T> Observable<T> concatArrayEager(InterfaceC23434B<? extends T>... interfaceC23434BArr) {
        return concatArrayEager(bufferSize(), bufferSize(), interfaceC23434BArr);
    }

    public static <T> Observable<T> concatArrayEagerDelayError(InterfaceC23434B<? extends T>... interfaceC23434BArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), interfaceC23434BArr);
    }

    public static <T> Observable<T> concatDelayError(Iterable<? extends InterfaceC23434B<? extends T>> iterable) {
        C23544b.m32923e(iterable, "sources is null");
        return concatDelayError(fromIterable(iterable));
    }

    public static <T> Observable<T> concatEager(InterfaceC23434B<? extends InterfaceC23434B<? extends T>> interfaceC23434B) {
        return concatEager(interfaceC23434B, bufferSize(), bufferSize());
    }

    public static <T> Observable<T> create(InterfaceC24579z<T> interfaceC24579z) {
        C23544b.m32923e(interfaceC24579z, "source is null");
        return C24508a.m31994o(new C23976C(interfaceC24579z));
    }

    public static <T> Observable<T> defer(Callable<? extends InterfaceC23434B<? extends T>> callable) {
        C23544b.m32923e(callable, "supplier is null");
        return C24508a.m31994o(new C23996F(callable));
    }

    private Observable<T> doOnEach(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a, InterfaceC23478a interfaceC23478a2) {
        C23544b.m32923e(interfaceC23484g, "onNext is null");
        C23544b.m32923e(interfaceC23484g2, "onError is null");
        C23544b.m32923e(interfaceC23478a, "onComplete is null");
        C23544b.m32923e(interfaceC23478a2, "onAfterTerminate is null");
        return C24508a.m31994o(new C24071O(this, interfaceC23484g, interfaceC23484g2, interfaceC23478a, interfaceC23478a2));
    }

    public static <T> Observable<T> empty() {
        return C24508a.m31994o(C24099U.f89947b);
    }

    public static <T> Observable<T> error(Callable<? extends Throwable> callable) {
        C23544b.m32923e(callable, "errorSupplier is null");
        return C24508a.m31994o(new C24117V(callable));
    }

    public static <T> Observable<T> fromArray(T... tArr) {
        C23544b.m32923e(tArr, "items is null");
        if (tArr.length == 0) {
            return empty();
        }
        if (tArr.length == 1) {
            return just(tArr[0]);
        }
        return C24508a.m31994o(new C24168d0(tArr));
    }

    public static <T> Observable<T> fromCallable(Callable<? extends T> callable) {
        C23544b.m32923e(callable, "supplier is null");
        return C24508a.m31994o(new CallableC24176e0(callable));
    }

    public static <T> Observable<T> fromFuture(Future<? extends T> future) {
        C23544b.m32923e(future, "future is null");
        return C24508a.m31994o(new C24182f0(future, 0L, null));
    }

    public static <T> Observable<T> fromIterable(Iterable<? extends T> iterable) {
        C23544b.m32923e(iterable, "source is null");
        return C24508a.m31994o(new C24186g0(iterable));
    }

    public static <T> Observable<T> fromPublisher(InterfaceC45761na4<? extends T> interfaceC45761na4) {
        C23544b.m32923e(interfaceC45761na4, "publisher is null");
        return C24508a.m31994o(new C24193h0(interfaceC45761na4));
    }

    public static <T> Observable<T> generate(InterfaceC23484g<InterfaceC24489j<T>> interfaceC23484g) {
        C23544b.m32923e(interfaceC23484g, "generator is null");
        return generate(C23506a.m32955s(), C24250p0.m32466m(interfaceC23484g), C23506a.m32967g());
    }

    public static Observable<Long> interval(long j, long j2, TimeUnit timeUnit) {
        return interval(j, j2, timeUnit, C24542a.m31934a());
    }

    public static Observable<Long> intervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        return intervalRange(j, j2, j3, j4, timeUnit, C24542a.m31934a());
    }

    public static <T> Observable<T> just(T t) {
        C23544b.m32923e(t, "item is null");
        return C24508a.m31994o(new C24294t0(t));
    }

    public static <T> Observable<T> merge(Iterable<? extends InterfaceC23434B<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).flatMap(C23506a.m32965i(), false, i, i2);
    }

    public static <T> Observable<T> mergeArray(int i, int i2, InterfaceC23434B<? extends T>... interfaceC23434BArr) {
        return fromArray(interfaceC23434BArr).flatMap(C23506a.m32965i(), false, i, i2);
    }

    public static <T> Observable<T> mergeArrayDelayError(int i, int i2, InterfaceC23434B<? extends T>... interfaceC23434BArr) {
        return fromArray(interfaceC23434BArr).flatMap(C23506a.m32965i(), true, i, i2);
    }

    public static <T> Observable<T> mergeDelayError(Iterable<? extends InterfaceC23434B<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(C23506a.m32965i(), true);
    }

    public static <T> Observable<T> never() {
        return C24508a.m31994o(C23986D0.f89545b);
    }

    public static Observable<Integer> range(int i, int i2) {
        if (i2 >= 0) {
            if (i2 == 0) {
                return empty();
            }
            if (i2 == 1) {
                return just(Integer.valueOf(i));
            }
            if (i + (i2 - 1) <= 2147483647L) {
                return C24508a.m31994o(new C24047L0(i, i2));
            }
            throw new IllegalArgumentException("Integer overflow");
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + i2);
    }

    public static Observable<Long> rangeLong(long j, long j2) {
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return empty();
            }
            if (j2 == 1) {
                return just(Long.valueOf(j));
            }
            long j3 = (j2 - 1) + j;
            if (j > 0 && j3 < 0) {
                throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
            }
            return C24508a.m31994o(new C24058M0(j, j2));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j2);
    }

    public static <T> AbstractC23442F<Boolean> sequenceEqual(InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23434B<? extends T> interfaceC23434B2) {
        return sequenceEqual(interfaceC23434B, interfaceC23434B2, C23544b.m32924d(), bufferSize());
    }

    public static <T> Observable<T> switchOnNext(InterfaceC23434B<? extends InterfaceC23434B<? extends T>> interfaceC23434B, int i) {
        C23544b.m32923e(interfaceC23434B, "sources is null");
        C23544b.m32922f(i, "bufferSize");
        return C24508a.m31994o(new C24266p1(interfaceC23434B, C23506a.m32965i(), i, false));
    }

    public static <T> Observable<T> switchOnNextDelayError(InterfaceC23434B<? extends InterfaceC23434B<? extends T>> interfaceC23434B) {
        return switchOnNextDelayError(interfaceC23434B, bufferSize());
    }

    private Observable<T> timeout0(long j, TimeUnit timeUnit, InterfaceC23434B<? extends T> interfaceC23434B, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(timeUnit, "timeUnit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31994o(new C23970B1(this, j, timeUnit, abstractC23437E, interfaceC23434B));
    }

    public static Observable<Long> timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, C24542a.m31934a());
    }

    public static <T> Observable<T> unsafeCreate(InterfaceC23434B<T> interfaceC23434B) {
        C23544b.m32923e(interfaceC23434B, "onSubscribe is null");
        if (!(interfaceC23434B instanceof Observable)) {
            return C24508a.m31994o(new C24199i0(interfaceC23434B));
        }
        throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
    }

    public static <T, D> Observable<T> using(Callable<? extends D> callable, InterfaceC23492o<? super D, ? extends InterfaceC23434B<? extends T>> interfaceC23492o, InterfaceC23484g<? super D> interfaceC23484g) {
        return using(callable, interfaceC23492o, interfaceC23484g, true);
    }

    public static <T> Observable<T> wrap(InterfaceC23434B<T> interfaceC23434B) {
        C23544b.m32923e(interfaceC23434B, "source is null");
        if (interfaceC23434B instanceof Observable) {
            return C24508a.m31994o((Observable) interfaceC23434B);
        }
        return C24508a.m31994o(new C24199i0(interfaceC23434B));
    }

    public static <T, R> Observable<R> zip(Iterable<? extends InterfaceC23434B<? extends T>> iterable, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "zipper is null");
        C23544b.m32923e(iterable, "sources is null");
        return C24508a.m31994o(new C24075O1(null, iterable, interfaceC23492o, bufferSize(), false));
    }

    public static <T, R> Observable<R> zipArray(InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, boolean z, int i, InterfaceC23434B<? extends T>... interfaceC23434BArr) {
        if (interfaceC23434BArr.length == 0) {
            return empty();
        }
        C23544b.m32923e(interfaceC23492o, "zipper is null");
        C23544b.m32922f(i, "bufferSize");
        return C24508a.m31994o(new C24075O1(interfaceC23434BArr, null, interfaceC23492o, i, z));
    }

    public static <T, R> Observable<R> zipIterable(Iterable<? extends InterfaceC23434B<? extends T>> iterable, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, boolean z, int i) {
        C23544b.m32923e(interfaceC23492o, "zipper is null");
        C23544b.m32923e(iterable, "sources is null");
        C23544b.m32922f(i, "bufferSize");
        return C24508a.m31994o(new C24075O1(null, iterable, interfaceC23492o, i, z));
    }

    public final AbstractC23442F<Boolean> all(InterfaceC23494q<? super T> interfaceC23494q) {
        C23544b.m32923e(interfaceC23494q, "predicate is null");
        return C24508a.m31993p(new C24184g(this, interfaceC23494q));
    }

    public final Observable<T> ambWith(InterfaceC23434B<? extends T> interfaceC23434B) {
        C23544b.m32923e(interfaceC23434B, "other is null");
        return ambArray(this, interfaceC23434B);
    }

    public final AbstractC23442F<Boolean> any(InterfaceC23494q<? super T> interfaceC23494q) {
        C23544b.m32923e(interfaceC23494q, "predicate is null");
        return C24508a.m31993p(new C24202j(this, interfaceC23494q));
    }

    /* renamed from: as */
    public final <R> R m33094as(InterfaceC24577x<T, ? extends R> interfaceC24577x) {
        return (R) ((InterfaceC24577x) C23544b.m32923e(interfaceC24577x, "converter is null")).apply(this);
    }

    public final T blockingFirst() {
        C23561f c23561f = new C23561f();
        subscribe(c23561f);
        T m32916a = c23561f.m32916a();
        if (m32916a != null) {
            return m32916a;
        }
        throw new NoSuchElementException();
    }

    public final void blockingForEach(InterfaceC23484g<? super T> interfaceC23484g) {
        Iterator<T> it = blockingIterable().iterator();
        while (it.hasNext()) {
            try {
                interfaceC23484g.accept(it.next());
            } catch (Throwable th) {
                C23475a.m33009b(th);
                ((InterfaceC23465c) it).dispose();
                throw C24475k.m32256e(th);
            }
        }
    }

    public final Iterable<T> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    public final T blockingLast() {
        C23562g c23562g = new C23562g();
        subscribe(c23562g);
        T m32916a = c23562g.m32916a();
        if (m32916a != null) {
            return m32916a;
        }
        throw new NoSuchElementException();
    }

    public final Iterable<T> blockingLatest() {
        return new C24159c(this);
    }

    public final Iterable<T> blockingMostRecent(T t) {
        return new C24165d(this, t);
    }

    public final Iterable<T> blockingNext() {
        return new C24173e(this);
    }

    public final T blockingSingle() {
        T m32044e = singleElement().m32044e();
        if (m32044e != null) {
            return m32044e;
        }
        throw new NoSuchElementException();
    }

    public final void blockingSubscribe() {
        C24215l.m32497a(this);
    }

    public final Observable<List<T>> buffer(int i) {
        return buffer(i, i);
    }

    public final Observable<T> cache() {
        return cacheWithInitialCapacity(16);
    }

    public final Observable<T> cacheWithInitialCapacity(int i) {
        C23544b.m32922f(i, "initialCapacity");
        return C24508a.m31994o(new C24279r(this, i));
    }

    public final <U> Observable<U> cast(Class<U> cls) {
        C23544b.m32923e(cls, "clazz is null");
        return (Observable<U>) map(C23506a.m32970d(cls));
    }

    public final <U> AbstractC23442F<U> collect(Callable<? extends U> callable, InterfaceC23479b<? super U, ? super T> interfaceC23479b) {
        C23544b.m32923e(callable, "initialValueSupplier is null");
        C23544b.m32923e(interfaceC23479b, "collector is null");
        return C24508a.m31993p(new C24292t(this, callable, interfaceC23479b));
    }

    public final <U> AbstractC23442F<U> collectInto(U u, InterfaceC23479b<? super U, ? super T> interfaceC23479b) {
        C23544b.m32923e(u, "initialValue is null");
        return collect(C23506a.m32963k(u), interfaceC23479b);
    }

    public final <R> Observable<R> compose(InterfaceC23435C<? super T, ? extends R> interfaceC23435C) {
        return wrap(((InterfaceC23435C) C23544b.m32923e(interfaceC23435C, "composer is null")).apply(this));
    }

    public final <R> Observable<R> concatMap(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o) {
        return concatMap(interfaceC23492o, 2);
    }

    public final AbstractC23461c concatMapCompletable(InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o) {
        return concatMapCompletable(interfaceC23492o, 2);
    }

    public final AbstractC23461c concatMapCompletableDelayError(InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o) {
        return concatMapCompletableDelayError(interfaceC23492o, true, 2);
    }

    public final <R> Observable<R> concatMapDelayError(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o) {
        return concatMapDelayError(interfaceC23492o, bufferSize(), true);
    }

    public final <R> Observable<R> concatMapEager(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o) {
        return concatMapEager(interfaceC23492o, Integer.MAX_VALUE, bufferSize());
    }

    public final <R> Observable<R> concatMapEagerDelayError(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, boolean z) {
        return concatMapEagerDelayError(interfaceC23492o, Integer.MAX_VALUE, bufferSize(), z);
    }

    public final <U> Observable<U> concatMapIterable(InterfaceC23492o<? super T, ? extends Iterable<? extends U>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31994o(new C24161c0(this, interfaceC23492o));
    }

    public final <R> Observable<R> concatMapMaybe(InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o) {
        return concatMapMaybe(interfaceC23492o, 2);
    }

    public final <R> Observable<R> concatMapMaybeDelayError(InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o) {
        return concatMapMaybeDelayError(interfaceC23492o, true, 2);
    }

    public final <R> Observable<R> concatMapSingle(InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o) {
        return concatMapSingle(interfaceC23492o, 2);
    }

    public final <R> Observable<R> concatMapSingleDelayError(InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o) {
        return concatMapSingleDelayError(interfaceC23492o, true, 2);
    }

    public final Observable<T> concatWith(InterfaceC23434B<? extends T> interfaceC23434B) {
        C23544b.m32923e(interfaceC23434B, "other is null");
        return concat(this, interfaceC23434B);
    }

    public final AbstractC23442F<Boolean> contains(Object obj) {
        C23544b.m32923e(obj, "element is null");
        return any(C23506a.m32966h(obj));
    }

    public final AbstractC23442F<Long> count() {
        return C24508a.m31993p(new C23965B(this));
    }

    public final <U> Observable<T> debounce(InterfaceC23492o<? super T, ? extends InterfaceC23434B<U>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "debounceSelector is null");
        return C24508a.m31994o(new C23983D(this, interfaceC23492o));
    }

    public final Observable<T> defaultIfEmpty(T t) {
        C23544b.m32923e(t, "defaultItem is null");
        return switchIfEmpty(just(t));
    }

    public final <U> Observable<T> delay(InterfaceC23492o<? super T, ? extends InterfaceC23434B<U>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "itemDelay is null");
        return (Observable<T>) flatMap(C24250p0.m32476c(interfaceC23492o));
    }

    public final <U> Observable<T> delaySubscription(InterfaceC23434B<U> interfaceC23434B) {
        C23544b.m32923e(interfaceC23434B, "other is null");
        return C24508a.m31994o(new C24011H(this, interfaceC23434B));
    }

    @Deprecated
    public final <T2> Observable<T2> dematerialize() {
        return C24508a.m31994o(new C24021I(this, C23506a.m32965i()));
    }

    public final Observable<T> distinct() {
        return distinct(C23506a.m32965i(), C23506a.m32968f());
    }

    public final Observable<T> distinctUntilChanged() {
        return distinctUntilChanged(C23506a.m32965i());
    }

    public final Observable<T> doAfterNext(InterfaceC23484g<? super T> interfaceC23484g) {
        C23544b.m32923e(interfaceC23484g, "onAfterNext is null");
        return C24508a.m31994o(new C24056M(this, interfaceC23484g));
    }

    public final Observable<T> doAfterTerminate(InterfaceC23478a interfaceC23478a) {
        C23544b.m32923e(interfaceC23478a, "onFinally is null");
        return doOnEach(C23506a.m32967g(), C23506a.m32967g(), C23506a.f88247c, interfaceC23478a);
    }

    public final Observable<T> doFinally(InterfaceC23478a interfaceC23478a) {
        C23544b.m32923e(interfaceC23478a, "onFinally is null");
        return C24508a.m31994o(new C24063N(this, interfaceC23478a));
    }

    public final Observable<T> doOnComplete(InterfaceC23478a interfaceC23478a) {
        return doOnEach(C23506a.m32967g(), C23506a.m32967g(), interfaceC23478a, C23506a.f88247c);
    }

    public final Observable<T> doOnDispose(InterfaceC23478a interfaceC23478a) {
        return doOnLifecycle(C23506a.m32967g(), interfaceC23478a);
    }

    public final Observable<T> doOnError(InterfaceC23484g<? super Throwable> interfaceC23484g) {
        InterfaceC23484g<? super T> m32967g = C23506a.m32967g();
        InterfaceC23478a interfaceC23478a = C23506a.f88247c;
        return doOnEach(m32967g, interfaceC23484g, interfaceC23478a, interfaceC23478a);
    }

    public final Observable<T> doOnLifecycle(InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g, InterfaceC23478a interfaceC23478a) {
        C23544b.m32923e(interfaceC23484g, "onSubscribe is null");
        C23544b.m32923e(interfaceC23478a, "onDispose is null");
        return C24508a.m31994o(new C24078P(this, interfaceC23484g, interfaceC23478a));
    }

    public final Observable<T> doOnNext(InterfaceC23484g<? super T> interfaceC23484g) {
        InterfaceC23484g<? super Throwable> m32967g = C23506a.m32967g();
        InterfaceC23478a interfaceC23478a = C23506a.f88247c;
        return doOnEach(interfaceC23484g, m32967g, interfaceC23478a, interfaceC23478a);
    }

    public final Observable<T> doOnSubscribe(InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g) {
        return doOnLifecycle(interfaceC23484g, C23506a.f88247c);
    }

    public final Observable<T> doOnTerminate(InterfaceC23478a interfaceC23478a) {
        C23544b.m32923e(interfaceC23478a, "onTerminate is null");
        return doOnEach(C23506a.m32967g(), C23506a.m32973a(interfaceC23478a), interfaceC23478a, C23506a.f88247c);
    }

    public final AbstractC24507p<T> elementAt(long j) {
        if (j >= 0) {
            return C24508a.m31995n(new C24090S(this, j));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    public final AbstractC23442F<T> elementAtOrError(long j) {
        if (j >= 0) {
            return C24508a.m31993p(new C24094T(this, j, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    public final Observable<T> filter(InterfaceC23494q<? super T> interfaceC23494q) {
        C23544b.m32923e(interfaceC23494q, "predicate is null");
        return C24508a.m31994o(new C24120W(this, interfaceC23494q));
    }

    public final AbstractC23442F<T> first(T t) {
        return elementAt(0L, t);
    }

    public final AbstractC24507p<T> firstElement() {
        return elementAt(0L);
    }

    public final AbstractC23442F<T> firstOrError() {
        return elementAtOrError(0L);
    }

    public final <R> Observable<R> flatMap(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o) {
        return flatMap((InterfaceC23492o) interfaceC23492o, false);
    }

    public final AbstractC23461c flatMapCompletable(InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o) {
        return flatMapCompletable(interfaceC23492o, false);
    }

    public final <U> Observable<U> flatMapIterable(InterfaceC23492o<? super T, ? extends Iterable<? extends U>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31994o(new C24161c0(this, interfaceC23492o));
    }

    public final <R> Observable<R> flatMapMaybe(InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o) {
        return flatMapMaybe(interfaceC23492o, false);
    }

    public final <R> Observable<R> flatMapSingle(InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o) {
        return flatMapSingle(interfaceC23492o, false);
    }

    public final InterfaceC23465c forEach(InterfaceC23484g<? super T> interfaceC23484g) {
        return subscribe(interfaceC23484g);
    }

    public final InterfaceC23465c forEachWhile(InterfaceC23494q<? super T> interfaceC23494q) {
        return forEachWhile(interfaceC23494q, C23506a.f88250f, C23506a.f88247c);
    }

    public final <K> Observable<AbstractC24496b<K, T>> groupBy(InterfaceC23492o<? super T, ? extends K> interfaceC23492o) {
        return (Observable<AbstractC24496b<K, T>>) groupBy(interfaceC23492o, C23506a.m32965i(), false, bufferSize());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> Observable<R> groupJoin(InterfaceC23434B<? extends TRight> interfaceC23434B, InterfaceC23492o<? super T, ? extends InterfaceC23434B<TLeftEnd>> interfaceC23492o, InterfaceC23492o<? super TRight, ? extends InterfaceC23434B<TRightEnd>> interfaceC23492o2, InterfaceC23480c<? super T, ? super Observable<TRight>, ? extends R> interfaceC23480c) {
        C23544b.m32923e(interfaceC23434B, "other is null");
        C23544b.m32923e(interfaceC23492o, "leftEnd is null");
        C23544b.m32923e(interfaceC23492o2, "rightEnd is null");
        C23544b.m32923e(interfaceC23480c, "resultSelector is null");
        return C24508a.m31994o(new C24216l0(this, interfaceC23434B, interfaceC23492o, interfaceC23492o2, interfaceC23480c));
    }

    public final Observable<T> hide() {
        return C24508a.m31994o(new C24227m0(this));
    }

    public final AbstractC23461c ignoreElements() {
        return C24508a.m31997l(new C24243o0(this));
    }

    public final AbstractC23442F<Boolean> isEmpty() {
        return all(C23506a.m32972b());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> Observable<R> join(InterfaceC23434B<? extends TRight> interfaceC23434B, InterfaceC23492o<? super T, ? extends InterfaceC23434B<TLeftEnd>> interfaceC23492o, InterfaceC23492o<? super TRight, ? extends InterfaceC23434B<TRightEnd>> interfaceC23492o2, InterfaceC23480c<? super T, ? super TRight, ? extends R> interfaceC23480c) {
        C23544b.m32923e(interfaceC23434B, "other is null");
        C23544b.m32923e(interfaceC23492o, "leftEnd is null");
        C23544b.m32923e(interfaceC23492o2, "rightEnd is null");
        C23544b.m32923e(interfaceC23480c, "resultSelector is null");
        return C24508a.m31994o(new C24288s0(this, interfaceC23434B, interfaceC23492o, interfaceC23492o2, interfaceC23480c));
    }

    public final AbstractC23442F<T> last(T t) {
        C23544b.m32923e(t, "defaultItem is null");
        return C24508a.m31993p(new C24310v0(this, t));
    }

    public final AbstractC24507p<T> lastElement() {
        return C24508a.m31995n(new C24300u0(this));
    }

    public final AbstractC23442F<T> lastOrError() {
        return C24508a.m31993p(new C24310v0(this, null));
    }

    public final <R> Observable<R> lift(InterfaceC23433A<? extends R, ? super T> interfaceC23433A) {
        C23544b.m32923e(interfaceC23433A, "lifter is null");
        return C24508a.m31994o(new C24316w0(this, interfaceC23433A));
    }

    public final <R> Observable<R> map(InterfaceC23492o<? super T, ? extends R> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31994o(new C24321x0(this, interfaceC23492o));
    }

    public final Observable<C24576w<T>> materialize() {
        return C24508a.m31994o(new C24333z0(this));
    }

    public final Observable<T> mergeWith(InterfaceC23434B<? extends T> interfaceC23434B) {
        C23544b.m32923e(interfaceC23434B, "other is null");
        return merge(this, interfaceC23434B);
    }

    public final Observable<T> observeOn(AbstractC23437E abstractC23437E) {
        return observeOn(abstractC23437E, false, bufferSize());
    }

    public final <U> Observable<U> ofType(Class<U> cls) {
        C23544b.m32923e(cls, "clazz is null");
        return filter(C23506a.m32964j(cls)).cast(cls);
    }

    public final Observable<T> onErrorResumeNext(InterfaceC23492o<? super Throwable, ? extends InterfaceC23434B<? extends T>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "resumeFunction is null");
        return C24508a.m31994o(new C23997F0(this, interfaceC23492o, false));
    }

    public final Observable<T> onErrorReturn(InterfaceC23492o<? super Throwable, ? extends T> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "valueSupplier is null");
        return C24508a.m31994o(new C24007G0(this, interfaceC23492o));
    }

    public final Observable<T> onErrorReturnItem(T t) {
        C23544b.m32923e(t, "item is null");
        return onErrorReturn(C23506a.m32962l(t));
    }

    public final Observable<T> onExceptionResumeNext(InterfaceC23434B<? extends T> interfaceC23434B) {
        C23544b.m32923e(interfaceC23434B, "next is null");
        return C24508a.m31994o(new C23997F0(this, C23506a.m32962l(interfaceC23434B), true));
    }

    public final Observable<T> onTerminateDetach() {
        return C24508a.m31994o(new C24029J(this));
    }

    public final AbstractC24495a<T> publish() {
        return C24014H0.m32658l(this);
    }

    public final AbstractC24507p<T> reduce(InterfaceC23480c<T, T, T> interfaceC23480c) {
        C23544b.m32923e(interfaceC23480c, "reducer is null");
        return C24508a.m31995n(new C24065N0(this, interfaceC23480c));
    }

    public final <R> AbstractC23442F<R> reduceWith(Callable<R> callable, InterfaceC23480c<R, ? super T, R> interfaceC23480c) {
        C23544b.m32923e(callable, "seedSupplier is null");
        C23544b.m32923e(interfaceC23480c, "reducer is null");
        return C24508a.m31993p(new C24079P0(this, callable, interfaceC23480c));
    }

    public final Observable<T> repeat() {
        return repeat(LongCompanionObject.MAX_VALUE);
    }

    public final Observable<T> repeatUntil(InterfaceC23482e interfaceC23482e) {
        C23544b.m32923e(interfaceC23482e, "stop is null");
        return C24508a.m31994o(new C24092S0(this, interfaceC23482e));
    }

    public final Observable<T> repeatWhen(InterfaceC23492o<? super Observable<Object>, ? extends InterfaceC23434B<?>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "handler is null");
        return C24508a.m31994o(new C24096T0(this, interfaceC23492o));
    }

    public final AbstractC24495a<T> replay() {
        return C24100U0.m32593p(this);
    }

    public final Observable<T> retry() {
        return retry(LongCompanionObject.MAX_VALUE, C23506a.m32971c());
    }

    public final Observable<T> retryUntil(InterfaceC23482e interfaceC23482e) {
        C23544b.m32923e(interfaceC23482e, "stop is null");
        return retry(LongCompanionObject.MAX_VALUE, C23506a.m32954t(interfaceC23482e));
    }

    public final Observable<T> retryWhen(InterfaceC23492o<? super Observable<Throwable>, ? extends InterfaceC23434B<?>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "handler is null");
        return C24508a.m31994o(new C24127X0(this, interfaceC23492o));
    }

    public final void safeSubscribe(InterfaceC23436D<? super T> interfaceC23436D) {
        C23544b.m32923e(interfaceC23436D, "observer is null");
        if (interfaceC23436D instanceof C24503g) {
            subscribe(interfaceC23436D);
        } else {
            subscribe(new C24503g(interfaceC23436D));
        }
    }

    public final Observable<T> sample(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit, C24542a.m31934a());
    }

    public final Observable<T> scan(InterfaceC23480c<T, T, T> interfaceC23480c) {
        C23544b.m32923e(interfaceC23480c, "accumulator is null");
        return C24508a.m31994o(new C24157b1(this, interfaceC23480c));
    }

    public final <R> Observable<R> scanWith(Callable<R> callable, InterfaceC23480c<R, ? super T, R> interfaceC23480c) {
        C23544b.m32923e(callable, "seedSupplier is null");
        C23544b.m32923e(interfaceC23480c, "accumulator is null");
        return C24508a.m31994o(new C24163c1(this, callable, interfaceC23480c));
    }

    public final Observable<T> serialize() {
        return C24508a.m31994o(new C24183f1(this));
    }

    public final Observable<T> share() {
        return publish().m32084i();
    }

    public final AbstractC23442F<T> single(T t) {
        C23544b.m32923e(t, "defaultItem is null");
        return C24508a.m31993p(new C24195h1(this, t));
    }

    public final AbstractC24507p<T> singleElement() {
        return C24508a.m31995n(new C24188g1(this));
    }

    public final AbstractC23442F<T> singleOrError() {
        return C24508a.m31993p(new C24195h1(this, null));
    }

    public final Observable<T> skip(long j) {
        if (j <= 0) {
            return C24508a.m31994o(this);
        }
        return C24508a.m31994o(new C24200i1(this, j));
    }

    public final Observable<T> skipLast(int i) {
        if (i >= 0) {
            if (i == 0) {
                return C24508a.m31994o(this);
            }
            return C24508a.m31994o(new C24206j1(this, i));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i);
    }

    public final <U> Observable<T> skipUntil(InterfaceC23434B<U> interfaceC23434B) {
        C23544b.m32923e(interfaceC23434B, "other is null");
        return C24508a.m31994o(new C24221l1(this, interfaceC23434B));
    }

    public final Observable<T> skipWhile(InterfaceC23494q<? super T> interfaceC23494q) {
        C23544b.m32923e(interfaceC23494q, "predicate is null");
        return C24508a.m31994o(new C24229m1(this, interfaceC23494q));
    }

    public final Observable<T> sorted() {
        return toList().m33123k0().map(C23506a.m32961m(C23506a.m32960n())).flatMapIterable(C23506a.m32965i());
    }

    public final Observable<T> startWith(Iterable<? extends T> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    public final Observable<T> startWithArray(T... tArr) {
        Observable fromArray = fromArray(tArr);
        if (fromArray == empty()) {
            return C24508a.m31994o(this);
        }
        return concatArray(fromArray, this);
    }

    public final InterfaceC23465c subscribe() {
        return subscribe(C23506a.m32967g(), C23506a.f88250f, C23506a.f88247c, C23506a.m32967g());
    }

    public abstract void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D);

    public final Observable<T> subscribeOn(AbstractC23437E abstractC23437E) {
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31994o(new C24237n1(this, abstractC23437E));
    }

    public final <E extends InterfaceC23436D<? super T>> E subscribeWith(E e) {
        subscribe(e);
        return e;
    }

    public final Observable<T> switchIfEmpty(InterfaceC23434B<? extends T> interfaceC23434B) {
        C23544b.m32923e(interfaceC23434B, "other is null");
        return C24508a.m31994o(new C24245o1(this, interfaceC23434B));
    }

    public final <R> Observable<R> switchMap(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o) {
        return switchMap(interfaceC23492o, bufferSize());
    }

    public final AbstractC23461c switchMapCompletable(InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31997l(new C23943j(this, interfaceC23492o, false));
    }

    public final AbstractC23461c switchMapCompletableDelayError(InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31997l(new C23943j(this, interfaceC23492o, true));
    }

    public final <R> Observable<R> switchMapDelayError(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o) {
        return switchMapDelayError(interfaceC23492o, bufferSize());
    }

    public final <R> Observable<R> switchMapMaybe(InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31994o(new C23946k(this, interfaceC23492o, false));
    }

    public final <R> Observable<R> switchMapMaybeDelayError(InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31994o(new C23946k(this, interfaceC23492o, true));
    }

    public final <R> Observable<R> switchMapSingle(InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31994o(new C23949l(this, interfaceC23492o, false));
    }

    public final <R> Observable<R> switchMapSingleDelayError(InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31994o(new C23949l(this, interfaceC23492o, true));
    }

    public final Observable<T> take(long j) {
        if (j >= 0) {
            return C24508a.m31994o(new C24277q1(this, j));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j);
    }

    public final Observable<T> takeLast(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("count >= 0 required but it was " + i);
        } else if (i == 0) {
            return C24508a.m31994o(new C24235n0(this));
        } else {
            if (i == 1) {
                return C24508a.m31994o(new C24290s1(this));
            }
            return C24508a.m31994o(new C24284r1(this, i));
        }
    }

    public final <U> Observable<T> takeUntil(InterfaceC23434B<U> interfaceC23434B) {
        C23544b.m32923e(interfaceC23434B, "other is null");
        return C24508a.m31994o(new C24302u1(this, interfaceC23434B));
    }

    public final Observable<T> takeWhile(InterfaceC23494q<? super T> interfaceC23494q) {
        C23544b.m32923e(interfaceC23494q, "predicate is null");
        return C24508a.m31994o(new C24317w1(this, interfaceC23494q));
    }

    public final C24505i<T> test() {
        C24505i<T> c24505i = new C24505i<>();
        subscribe(c24505i);
        return c24505i;
    }

    public final Observable<T> throttleFirst(long j, TimeUnit timeUnit) {
        return throttleFirst(j, timeUnit, C24542a.m31934a());
    }

    public final Observable<T> throttleLast(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit);
    }

    public final Observable<T> throttleLatest(long j, TimeUnit timeUnit) {
        return throttleLatest(j, timeUnit, C24542a.m31934a(), false);
    }

    public final Observable<T> throttleWithTimeout(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit);
    }

    public final Observable<C24551b<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, C24542a.m31934a());
    }

    public final <V> Observable<T> timeout(InterfaceC23492o<? super T, ? extends InterfaceC23434B<V>> interfaceC23492o) {
        return timeout0(null, interfaceC23492o, null);
    }

    public final Observable<C24551b<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, C24542a.m31934a());
    }

    /* renamed from: to */
    public final <R> R m33093to(InterfaceC23492o<? super Observable<T>, R> interfaceC23492o) {
        try {
            return (R) ((InterfaceC23492o) C23544b.m32923e(interfaceC23492o, "converter is null")).apply(this);
        } catch (Throwable th) {
            C23475a.m33009b(th);
            throw C24475k.m32256e(th);
        }
    }

    public final AbstractC24490k<T> toFlowable(EnumC23460b enumC23460b) {
        C23642B c23642b = new C23642B(this);
        int i = C23449a.f88205a[enumC23460b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return c23642b.m32105u0();
                    }
                    return C24508a.m31996m(new C23669O(c23642b));
                }
                return c23642b;
            }
            return c23642b.m32095y0();
        }
        return c23642b.m32097x0();
    }

    public final Future<T> toFuture() {
        return (Future) subscribeWith(new FutureC23571p());
    }

    public final AbstractC23442F<List<T>> toList() {
        return toList(16);
    }

    public final <K> AbstractC23442F<Map<K, T>> toMap(InterfaceC23492o<? super T, ? extends K> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "keySelector is null");
        return (AbstractC23442F<Map<K, T>>) collect(EnumC24478m.m32249a(), C23506a.m32976D(interfaceC23492o));
    }

    public final <K> AbstractC23442F<Map<K, Collection<T>>> toMultimap(InterfaceC23492o<? super T, ? extends K> interfaceC23492o) {
        return (AbstractC23442F<Map<K, Collection<T>>>) toMultimap(interfaceC23492o, C23506a.m32965i(), EnumC24478m.m32249a(), EnumC24466b.m32278c());
    }

    public final AbstractC23442F<List<T>> toSortedList() {
        return toSortedList(C23506a.m32959o());
    }

    public final Observable<T> unsubscribeOn(AbstractC23437E abstractC23437E) {
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31994o(new C23999F1(this, abstractC23437E));
    }

    public final Observable<Observable<T>> window(long j) {
        return window(j, j, bufferSize());
    }

    public final <U, R> Observable<R> withLatestFrom(InterfaceC23434B<? extends U> interfaceC23434B, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c) {
        C23544b.m32923e(interfaceC23434B, "other is null");
        C23544b.m32923e(interfaceC23480c, "combiner is null");
        return C24508a.m31994o(new C24060M1(this, interfaceC23480c, interfaceC23434B));
    }

    public final <U, R> Observable<R> zipWith(Iterable<U> iterable, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c) {
        C23544b.m32923e(iterable, "other is null");
        C23544b.m32923e(interfaceC23480c, "zipper is null");
        return C24508a.m31994o(new C24080P1(this, iterable, interfaceC23480c));
    }

    public static <T, R> Observable<R> combineLatest(Iterable<? extends InterfaceC23434B<? extends T>> iterable, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o) {
        return combineLatest(iterable, interfaceC23492o, bufferSize());
    }

    public static <T, R> Observable<R> combineLatestDelayError(InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, int i, InterfaceC23434B<? extends T>... interfaceC23434BArr) {
        return combineLatestDelayError(interfaceC23434BArr, interfaceC23492o, i);
    }

    public static <T> Observable<T> concatArrayEager(int i, int i2, InterfaceC23434B<? extends T>... interfaceC23434BArr) {
        return fromArray(interfaceC23434BArr).concatMapEagerDelayError(C23506a.m32965i(), i, i2, false);
    }

    public static <T> Observable<T> concatArrayEagerDelayError(int i, int i2, InterfaceC23434B<? extends T>... interfaceC23434BArr) {
        return fromArray(interfaceC23434BArr).concatMapEagerDelayError(C23506a.m32965i(), i, i2, true);
    }

    public static <T> Observable<T> concatEager(InterfaceC23434B<? extends InterfaceC23434B<? extends T>> interfaceC23434B, int i, int i2) {
        return wrap(interfaceC23434B).concatMapEager(C23506a.m32965i(), i, i2);
    }

    public static Observable<Long> interval(long j, long j2, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31994o(new C24275q0(Math.max(0L, j), Math.max(0L, j2), timeUnit, abstractC23437E));
    }

    public static Observable<Long> intervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j2);
        } else if (i == 0) {
            return empty().delay(j3, timeUnit, abstractC23437E);
        } else {
            long j5 = j + (j2 - 1);
            if (j > 0 && j5 < 0) {
                throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
            }
            C23544b.m32923e(timeUnit, "unit is null");
            C23544b.m32923e(abstractC23437E, "scheduler is null");
            return C24508a.m31994o(new C24282r0(j, j5, Math.max(0L, j3), Math.max(0L, j4), timeUnit, abstractC23437E));
        }
    }

    public static <T> Observable<T> merge(Iterable<? extends InterfaceC23434B<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(C23506a.m32965i());
    }

    public static <T> Observable<T> mergeArray(InterfaceC23434B<? extends T>... interfaceC23434BArr) {
        return fromArray(interfaceC23434BArr).flatMap(C23506a.m32965i(), interfaceC23434BArr.length);
    }

    public static <T> Observable<T> mergeArrayDelayError(InterfaceC23434B<? extends T>... interfaceC23434BArr) {
        return fromArray(interfaceC23434BArr).flatMap(C23506a.m32965i(), true, interfaceC23434BArr.length);
    }

    public static <T> Observable<T> mergeDelayError(Iterable<? extends InterfaceC23434B<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).flatMap(C23506a.m32965i(), true, i, i2);
    }

    public static <T> AbstractC23442F<Boolean> sequenceEqual(InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23434B<? extends T> interfaceC23434B2, InterfaceC23481d<? super T, ? super T> interfaceC23481d) {
        return sequenceEqual(interfaceC23434B, interfaceC23434B2, interfaceC23481d, bufferSize());
    }

    public static <T> Observable<T> switchOnNextDelayError(InterfaceC23434B<? extends InterfaceC23434B<? extends T>> interfaceC23434B, int i) {
        C23544b.m32923e(interfaceC23434B, "sources is null");
        C23544b.m32922f(i, "prefetch");
        return C24508a.m31994o(new C24266p1(interfaceC23434B, C23506a.m32965i(), i, true));
    }

    public static Observable<Long> timer(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31994o(new C23981C1(Math.max(j, 0L), timeUnit, abstractC23437E));
    }

    public static <T, D> Observable<T> using(Callable<? extends D> callable, InterfaceC23492o<? super D, ? extends InterfaceC23434B<? extends T>> interfaceC23492o, InterfaceC23484g<? super D> interfaceC23484g, boolean z) {
        C23544b.m32923e(callable, "resourceSupplier is null");
        C23544b.m32923e(interfaceC23492o, "sourceSupplier is null");
        C23544b.m32923e(interfaceC23484g, "disposer is null");
        return C24508a.m31994o(new C24009G1(callable, interfaceC23492o, interfaceC23484g, z));
    }

    public final Iterable<T> blockingIterable(int i) {
        C23544b.m32922f(i, "bufferSize");
        return new C24152b(this, i);
    }

    public final void blockingSubscribe(InterfaceC23484g<? super T> interfaceC23484g) {
        C24215l.m32495c(this, interfaceC23484g, C23506a.f88250f, C23506a.f88247c);
    }

    public final Observable<List<T>> buffer(int i, int i2) {
        return (Observable<List<T>>) buffer(i, i2, EnumC24466b.m32279b());
    }

    public final <R> Observable<R> concatMap(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, int i) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "prefetch");
        if (this instanceof InterfaceCallableC23553h) {
            Object call = ((InterfaceCallableC23553h) this).call();
            if (call == null) {
                return empty();
            }
            return C24149a1.m32535a(call, interfaceC23492o);
        }
        return C24508a.m31994o(new C24305v(this, interfaceC23492o, i, EnumC24474j.IMMEDIATE));
    }

    public final AbstractC23461c concatMapCompletable(InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, int i) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "capacityHint");
        return C24508a.m31997l(new C23934g(this, interfaceC23492o, EnumC24474j.IMMEDIATE, i));
    }

    public final AbstractC23461c concatMapCompletableDelayError(InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, boolean z) {
        return concatMapCompletableDelayError(interfaceC23492o, z, 2);
    }

    public final <R> Observable<R> concatMapDelayError(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, int i, boolean z) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "prefetch");
        if (this instanceof InterfaceCallableC23553h) {
            Object call = ((InterfaceCallableC23553h) this).call();
            if (call == null) {
                return empty();
            }
            return C24149a1.m32535a(call, interfaceC23492o);
        }
        return C24508a.m31994o(new C24305v(this, interfaceC23492o, i, z ? EnumC24474j.END : EnumC24474j.BOUNDARY));
    }

    public final <R> Observable<R> concatMapEager(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, int i, int i2) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "maxConcurrency");
        C23544b.m32922f(i2, "prefetch");
        return C24508a.m31994o(new C24314w(this, interfaceC23492o, EnumC24474j.IMMEDIATE, i, i2));
    }

    public final <R> Observable<R> concatMapEagerDelayError(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, int i, int i2, boolean z) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "maxConcurrency");
        C23544b.m32922f(i2, "prefetch");
        return C24508a.m31994o(new C24314w(this, interfaceC23492o, z ? EnumC24474j.END : EnumC24474j.BOUNDARY, i, i2));
    }

    public final <R> Observable<R> concatMapMaybe(InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, int i) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "prefetch");
        return C24508a.m31994o(new C23937h(this, interfaceC23492o, EnumC24474j.IMMEDIATE, i));
    }

    public final <R> Observable<R> concatMapMaybeDelayError(InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, boolean z) {
        return concatMapMaybeDelayError(interfaceC23492o, z, 2);
    }

    public final <R> Observable<R> concatMapSingle(InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o, int i) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "prefetch");
        return C24508a.m31994o(new C23940i(this, interfaceC23492o, EnumC24474j.IMMEDIATE, i));
    }

    public final <R> Observable<R> concatMapSingleDelayError(InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o, boolean z) {
        return concatMapSingleDelayError(interfaceC23492o, z, 2);
    }

    public final <R> Observable<R> dematerialize(InterfaceC23492o<? super T, C24576w<R>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "selector is null");
        return C24508a.m31994o(new C24021I(this, interfaceC23492o));
    }

    public final <K> Observable<T> distinct(InterfaceC23492o<? super T, K> interfaceC23492o) {
        return distinct(interfaceC23492o, C23506a.m32968f());
    }

    public final <K> Observable<T> distinctUntilChanged(InterfaceC23492o<? super T, K> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "keySelector is null");
        return C24508a.m31994o(new C24045L(this, interfaceC23492o, C23544b.m32924d()));
    }

    public final <R> Observable<R> flatMap(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, boolean z) {
        return flatMap(interfaceC23492o, z, Integer.MAX_VALUE);
    }

    public final AbstractC23461c flatMapCompletable(InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, boolean z) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31997l(new C24137Z(this, interfaceC23492o, z));
    }

    public final <R> Observable<R> flatMapMaybe(InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, boolean z) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31994o(new C24146a0(this, interfaceC23492o, z));
    }

    public final <R> Observable<R> flatMapSingle(InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o, boolean z) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        return C24508a.m31994o(new C24154b0(this, interfaceC23492o, z));
    }

    public final InterfaceC23465c forEachWhile(InterfaceC23494q<? super T> interfaceC23494q, InterfaceC23484g<? super Throwable> interfaceC23484g) {
        return forEachWhile(interfaceC23494q, interfaceC23484g, C23506a.f88247c);
    }

    public final <K> Observable<AbstractC24496b<K, T>> groupBy(InterfaceC23492o<? super T, ? extends K> interfaceC23492o, boolean z) {
        return (Observable<AbstractC24496b<K, T>>) groupBy(interfaceC23492o, C23506a.m32965i(), z, bufferSize());
    }

    public final Observable<T> observeOn(AbstractC23437E abstractC23437E, boolean z) {
        return observeOn(abstractC23437E, z, bufferSize());
    }

    public final <R> Observable<R> publish(InterfaceC23492o<? super Observable<T>, ? extends InterfaceC23434B<R>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "selector is null");
        return C24508a.m31994o(new C24039K0(this, interfaceC23492o));
    }

    public final Observable<T> repeat(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return empty();
            }
            return C24508a.m31994o(new C24088R0(this, j));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j);
    }

    public final <R> Observable<R> replay(InterfaceC23492o<? super Observable<T>, ? extends InterfaceC23434B<R>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "selector is null");
        return C24100U0.m32592q(C24250p0.m32472g(this), interfaceC23492o);
    }

    public final Observable<T> retry(InterfaceC23481d<? super Integer, ? super Throwable> interfaceC23481d) {
        C23544b.m32923e(interfaceC23481d, "predicate is null");
        return C24508a.m31994o(new C24118V0(this, interfaceC23481d));
    }

    public final Observable<T> sample(long j, TimeUnit timeUnit, boolean z) {
        return sample(j, timeUnit, C24542a.m31934a(), z);
    }

    public final Observable<T> sorted(Comparator<? super T> comparator) {
        C23544b.m32923e(comparator, "sortFunction is null");
        return toList().m33123k0().map(C23506a.m32961m(comparator)).flatMapIterable(C23506a.m32965i());
    }

    public final Observable<T> startWith(InterfaceC23434B<? extends T> interfaceC23434B) {
        C23544b.m32923e(interfaceC23434B, "other is null");
        return concatArray(interfaceC23434B, this);
    }

    public final InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g) {
        return subscribe(interfaceC23484g, C23506a.f88250f, C23506a.f88247c, C23506a.m32967g());
    }

    public final <R> Observable<R> switchMap(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, int i) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "bufferSize");
        if (this instanceof InterfaceCallableC23553h) {
            Object call = ((InterfaceCallableC23553h) this).call();
            if (call == null) {
                return empty();
            }
            return C24149a1.m32535a(call, interfaceC23492o);
        }
        return C24508a.m31994o(new C24266p1(this, interfaceC23492o, i, false));
    }

    public final <R> Observable<R> switchMapDelayError(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, int i) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "bufferSize");
        if (this instanceof InterfaceCallableC23553h) {
            Object call = ((InterfaceCallableC23553h) this).call();
            if (call == null) {
                return empty();
            }
            return C24149a1.m32535a(call, interfaceC23492o);
        }
        return C24508a.m31994o(new C24266p1(this, interfaceC23492o, i, true));
    }

    public final Observable<T> throttleFirst(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31994o(new C24323x1(this, j, timeUnit, abstractC23437E));
    }

    public final Observable<T> throttleLast(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return sample(j, timeUnit, abstractC23437E);
    }

    public final Observable<T> throttleLatest(long j, TimeUnit timeUnit, boolean z) {
        return throttleLatest(j, timeUnit, C24542a.m31934a(), z);
    }

    public final Observable<T> throttleWithTimeout(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return debounce(j, timeUnit, abstractC23437E);
    }

    public final Observable<C24551b<T>> timeInterval(AbstractC23437E abstractC23437E) {
        return timeInterval(TimeUnit.MILLISECONDS, abstractC23437E);
    }

    public final <V> Observable<T> timeout(InterfaceC23492o<? super T, ? extends InterfaceC23434B<V>> interfaceC23492o, InterfaceC23434B<? extends T> interfaceC23434B) {
        C23544b.m32923e(interfaceC23434B, "other is null");
        return timeout0(null, interfaceC23492o, interfaceC23434B);
    }

    public final Observable<C24551b<T>> timestamp(AbstractC23437E abstractC23437E) {
        return timestamp(TimeUnit.MILLISECONDS, abstractC23437E);
    }

    public final AbstractC23442F<List<T>> toList(int i) {
        C23544b.m32922f(i, "capacityHint");
        return C24508a.m31993p(new C23994E1(this, i));
    }

    public final AbstractC23442F<List<T>> toSortedList(Comparator<? super T> comparator) {
        C23544b.m32923e(comparator, "comparator is null");
        return (AbstractC23442F<List<T>>) toList().m33157I(C23506a.m32961m(comparator));
    }

    public final Observable<Observable<T>> window(long j, long j2) {
        return window(j, j2, bufferSize());
    }

    public static <T, R> Observable<R> combineLatest(Iterable<? extends InterfaceC23434B<? extends T>> iterable, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, int i) {
        C23544b.m32923e(iterable, "sources is null");
        C23544b.m32923e(interfaceC23492o, "combiner is null");
        C23544b.m32922f(i, "bufferSize");
        return C24508a.m31994o(new C24297u(null, iterable, interfaceC23492o, i << 1, false));
    }

    public static <T, R> Observable<R> combineLatestDelayError(InterfaceC23434B<? extends T>[] interfaceC23434BArr, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, int i) {
        C23544b.m32922f(i, "bufferSize");
        C23544b.m32923e(interfaceC23492o, "combiner is null");
        if (interfaceC23434BArr.length == 0) {
            return empty();
        }
        return C24508a.m31994o(new C24297u(interfaceC23434BArr, null, interfaceC23492o, i << 1, true));
    }

    public static <T> Observable<T> concat(InterfaceC23434B<? extends InterfaceC23434B<? extends T>> interfaceC23434B) {
        return concat(interfaceC23434B, bufferSize());
    }

    public static <T> Observable<T> concatDelayError(InterfaceC23434B<? extends InterfaceC23434B<? extends T>> interfaceC23434B) {
        return concatDelayError(interfaceC23434B, bufferSize(), true);
    }

    public static <T> Observable<T> concatEager(Iterable<? extends InterfaceC23434B<? extends T>> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    public static <T> Observable<T> error(Throwable th) {
        C23544b.m32923e(th, "exception is null");
        return error(C23506a.m32963k(th));
    }

    public static <T> Observable<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        C23544b.m32923e(future, "future is null");
        C23544b.m32923e(timeUnit, "unit is null");
        return C24508a.m31994o(new C24182f0(future, j, timeUnit));
    }

    public static <T> Observable<T> just(T t, T t2) {
        C23544b.m32923e(t, "item1 is null");
        C23544b.m32923e(t2, "item2 is null");
        return fromArray(t, t2);
    }

    public static <T> Observable<T> merge(Iterable<? extends InterfaceC23434B<? extends T>> iterable, int i) {
        return fromIterable(iterable).flatMap(C23506a.m32965i(), i);
    }

    public static <T> Observable<T> mergeDelayError(Iterable<? extends InterfaceC23434B<? extends T>> iterable, int i) {
        return fromIterable(iterable).flatMap(C23506a.m32965i(), true, i);
    }

    public static <T> AbstractC23442F<Boolean> sequenceEqual(InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23434B<? extends T> interfaceC23434B2, InterfaceC23481d<? super T, ? super T> interfaceC23481d, int i) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23481d, "isEqual is null");
        C23544b.m32922f(i, "bufferSize");
        return C24508a.m31993p(new C24177e1(interfaceC23434B, interfaceC23434B2, interfaceC23481d, i));
    }

    public final T blockingSingle(T t) {
        return single(t).m33132g();
    }

    public final void blockingSubscribe(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2) {
        C24215l.m32495c(this, interfaceC23484g, interfaceC23484g2, C23506a.f88247c);
    }

    public final <U extends Collection<? super T>> Observable<U> buffer(int i, int i2, Callable<U> callable) {
        C23544b.m32922f(i, "count");
        C23544b.m32922f(i2, "skip");
        C23544b.m32923e(callable, "bufferSupplier is null");
        return C24508a.m31994o(new C24224m(this, i, i2, callable));
    }

    public final AbstractC23461c concatMapCompletableDelayError(InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, boolean z, int i) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "prefetch");
        return C24508a.m31997l(new C23934g(this, interfaceC23492o, z ? EnumC24474j.END : EnumC24474j.BOUNDARY, i));
    }

    public final <U> Observable<U> concatMapIterable(InterfaceC23492o<? super T, ? extends Iterable<? extends U>> interfaceC23492o, int i) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "prefetch");
        return (Observable<U>) concatMap(C24250p0.m32478a(interfaceC23492o), i);
    }

    public final <R> Observable<R> concatMapMaybeDelayError(InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, boolean z, int i) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "prefetch");
        return C24508a.m31994o(new C23937h(this, interfaceC23492o, z ? EnumC24474j.END : EnumC24474j.BOUNDARY, i));
    }

    public final <R> Observable<R> concatMapSingleDelayError(InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o, boolean z, int i) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "prefetch");
        return C24508a.m31994o(new C23940i(this, interfaceC23492o, z ? EnumC24474j.END : EnumC24474j.BOUNDARY, i));
    }

    public final Observable<T> concatWith(InterfaceC23447K<? extends T> interfaceC23447K) {
        C23544b.m32923e(interfaceC23447K, "other is null");
        return C24508a.m31994o(new C24331z(this, interfaceC23447K));
    }

    public final Observable<T> debounce(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit, C24542a.m31934a());
    }

    public final Observable<T> delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, C24542a.m31934a(), false);
    }

    public final Observable<T> delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, C24542a.m31934a());
    }

    public final <K> Observable<T> distinct(InterfaceC23492o<? super T, K> interfaceC23492o, Callable<? extends Collection<? super K>> callable) {
        C23544b.m32923e(interfaceC23492o, "keySelector is null");
        C23544b.m32923e(callable, "collectionSupplier is null");
        return C24508a.m31994o(new C24037K(this, interfaceC23492o, callable));
    }

    public final AbstractC23442F<T> elementAt(long j, T t) {
        if (j >= 0) {
            C23544b.m32923e(t, "defaultItem is null");
            return C24508a.m31993p(new C24094T(this, j, t));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    public final <R> Observable<R> flatMap(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, boolean z, int i) {
        return flatMap(interfaceC23492o, z, i, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <U, V> Observable<V> flatMapIterable(InterfaceC23492o<? super T, ? extends Iterable<? extends U>> interfaceC23492o, InterfaceC23480c<? super T, ? super U, ? extends V> interfaceC23480c) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32923e(interfaceC23480c, "resultSelector is null");
        return (Observable<V>) flatMap(C24250p0.m32478a(interfaceC23492o), interfaceC23480c, false, bufferSize(), bufferSize());
    }

    public final InterfaceC23465c forEachWhile(InterfaceC23494q<? super T> interfaceC23494q, InterfaceC23484g<? super Throwable> interfaceC23484g, InterfaceC23478a interfaceC23478a) {
        C23544b.m32923e(interfaceC23494q, "onNext is null");
        C23544b.m32923e(interfaceC23484g, "onError is null");
        C23544b.m32923e(interfaceC23478a, "onComplete is null");
        C23570o c23570o = new C23570o(interfaceC23494q, interfaceC23484g, interfaceC23478a);
        subscribe(c23570o);
        return c23570o;
    }

    public final <K, V> Observable<AbstractC24496b<K, V>> groupBy(InterfaceC23492o<? super T, ? extends K> interfaceC23492o, InterfaceC23492o<? super T, ? extends V> interfaceC23492o2) {
        return groupBy(interfaceC23492o, interfaceC23492o2, false, bufferSize());
    }

    public final Observable<T> mergeWith(InterfaceC23447K<? extends T> interfaceC23447K) {
        C23544b.m32923e(interfaceC23447K, "other is null");
        return C24508a.m31994o(new C23978C0(this, interfaceC23447K));
    }

    public final Observable<T> observeOn(AbstractC23437E abstractC23437E, boolean z, int i) {
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        C23544b.m32922f(i, "bufferSize");
        return C24508a.m31994o(new C23992E0(this, abstractC23437E, z, i));
    }

    public final Observable<T> onErrorResumeNext(InterfaceC23434B<? extends T> interfaceC23434B) {
        C23544b.m32923e(interfaceC23434B, "next is null");
        return onErrorResumeNext(C23506a.m32962l(interfaceC23434B));
    }

    public final <R> AbstractC23442F<R> reduce(R r, InterfaceC23480c<R, ? super T, R> interfaceC23480c) {
        C23544b.m32923e(r, "seed is null");
        C23544b.m32923e(interfaceC23480c, "reducer is null");
        return C24508a.m31993p(new C24073O0(this, r, interfaceC23480c));
    }

    public final Observable<T> sample(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31994o(new C24133Y0(this, j, timeUnit, abstractC23437E, false));
    }

    public final <R> Observable<R> scan(R r, InterfaceC23480c<R, ? super T, R> interfaceC23480c) {
        C23544b.m32923e(r, "initialValue is null");
        return scanWith(C23506a.m32963k(r), interfaceC23480c);
    }

    public final Observable<T> skip(long j, TimeUnit timeUnit) {
        return skipUntil(timer(j, timeUnit));
    }

    public final InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2) {
        return subscribe(interfaceC23484g, interfaceC23484g2, C23506a.f88247c, C23506a.m32967g());
    }

    public final Observable<T> take(long j, TimeUnit timeUnit) {
        return takeUntil(timer(j, timeUnit));
    }

    public final Observable<T> takeUntil(InterfaceC23494q<? super T> interfaceC23494q) {
        C23544b.m32923e(interfaceC23494q, "stopPredicate is null");
        return C24508a.m31994o(new C24312v1(this, interfaceC23494q));
    }

    public final C24505i<T> test(boolean z) {
        C24505i<T> c24505i = new C24505i<>();
        if (z) {
            c24505i.dispose();
        }
        subscribe(c24505i);
        return c24505i;
    }

    public final Observable<T> throttleLatest(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return throttleLatest(j, timeUnit, abstractC23437E, false);
    }

    public final Observable<C24551b<T>> timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, C24542a.m31934a());
    }

    public final Observable<C24551b<T>> timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, C24542a.m31934a());
    }

    public final <K, V> AbstractC23442F<Map<K, V>> toMap(InterfaceC23492o<? super T, ? extends K> interfaceC23492o, InterfaceC23492o<? super T, ? extends V> interfaceC23492o2) {
        C23544b.m32923e(interfaceC23492o, "keySelector is null");
        C23544b.m32923e(interfaceC23492o2, "valueSelector is null");
        return (AbstractC23442F<Map<K, V>>) collect(EnumC24478m.m32249a(), C23506a.m32975E(interfaceC23492o, interfaceC23492o2));
    }

    public final Observable<Observable<T>> window(long j, long j2, int i) {
        C23544b.m32921g(j, "count");
        C23544b.m32921g(j2, "skip");
        C23544b.m32922f(i, "bufferSize");
        return C24508a.m31994o(new C24018H1(this, j, j2, i));
    }

    public static <T> Observable<T> concat(InterfaceC23434B<? extends InterfaceC23434B<? extends T>> interfaceC23434B, int i) {
        C23544b.m32923e(interfaceC23434B, "sources is null");
        C23544b.m32922f(i, "prefetch");
        return C24508a.m31994o(new C24305v(interfaceC23434B, C23506a.m32965i(), i, EnumC24474j.IMMEDIATE));
    }

    public static <T> Observable<T> concatDelayError(InterfaceC23434B<? extends InterfaceC23434B<? extends T>> interfaceC23434B, int i, boolean z) {
        C23544b.m32923e(interfaceC23434B, "sources is null");
        C23544b.m32922f(i, "prefetch is null");
        return C24508a.m31994o(new C24305v(interfaceC23434B, C23506a.m32965i(), i, z ? EnumC24474j.END : EnumC24474j.BOUNDARY));
    }

    public static <T> Observable<T> concatEager(Iterable<? extends InterfaceC23434B<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).concatMapEagerDelayError(C23506a.m32965i(), i, i2, false);
    }

    public static <T> Observable<T> merge(InterfaceC23434B<? extends InterfaceC23434B<? extends T>> interfaceC23434B) {
        C23544b.m32923e(interfaceC23434B, "sources is null");
        return C24508a.m31994o(new C24124X(interfaceC23434B, C23506a.m32965i(), false, Integer.MAX_VALUE, bufferSize()));
    }

    public static <T> Observable<T> mergeDelayError(InterfaceC23434B<? extends InterfaceC23434B<? extends T>> interfaceC23434B) {
        C23544b.m32923e(interfaceC23434B, "sources is null");
        return C24508a.m31994o(new C24124X(interfaceC23434B, C23506a.m32965i(), true, Integer.MAX_VALUE, bufferSize()));
    }

    public static <T> Observable<T> switchOnNext(InterfaceC23434B<? extends InterfaceC23434B<? extends T>> interfaceC23434B) {
        return switchOnNext(interfaceC23434B, bufferSize());
    }

    private <U, V> Observable<T> timeout0(InterfaceC23434B<U> interfaceC23434B, InterfaceC23492o<? super T, ? extends InterfaceC23434B<V>> interfaceC23492o, InterfaceC23434B<? extends T> interfaceC23434B2) {
        C23544b.m32923e(interfaceC23492o, "itemTimeoutIndicator is null");
        return C24508a.m31994o(new C23960A1(this, interfaceC23434B, interfaceC23492o, interfaceC23434B2));
    }

    public static <T, R> Observable<R> zip(InterfaceC23434B<? extends InterfaceC23434B<? extends T>> interfaceC23434B, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o) {
        C23544b.m32923e(interfaceC23492o, "zipper is null");
        C23544b.m32923e(interfaceC23434B, "sources is null");
        return C24508a.m31994o(new C23987D1(interfaceC23434B, 16).flatMap(C24250p0.m32465n(interfaceC23492o)));
    }

    public final void blockingSubscribe(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a) {
        C24215l.m32495c(this, interfaceC23484g, interfaceC23484g2, interfaceC23478a);
    }

    public final Observable<T> debounce(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31994o(new C23989E(this, j, timeUnit, abstractC23437E));
    }

    public final Observable<T> delay(long j, TimeUnit timeUnit, boolean z) {
        return delay(j, timeUnit, C24542a.m31934a(), z);
    }

    public final Observable<T> delaySubscription(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return delaySubscription(timer(j, timeUnit, abstractC23437E));
    }

    public final Observable<T> distinctUntilChanged(InterfaceC23481d<? super T, ? super T> interfaceC23481d) {
        C23544b.m32923e(interfaceC23481d, "comparer is null");
        return C24508a.m31994o(new C24045L(this, C23506a.m32965i(), interfaceC23481d));
    }

    public final <R> Observable<R> flatMap(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, boolean z, int i, int i2) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32922f(i, "maxConcurrency");
        C23544b.m32922f(i2, "bufferSize");
        if (this instanceof InterfaceCallableC23553h) {
            Object call = ((InterfaceCallableC23553h) this).call();
            if (call == null) {
                return empty();
            }
            return C24149a1.m32535a(call, interfaceC23492o);
        }
        return C24508a.m31994o(new C24124X(this, interfaceC23492o, z, i, i2));
    }

    public final <K, V> Observable<AbstractC24496b<K, V>> groupBy(InterfaceC23492o<? super T, ? extends K> interfaceC23492o, InterfaceC23492o<? super T, ? extends V> interfaceC23492o2, boolean z) {
        return groupBy(interfaceC23492o, interfaceC23492o2, z, bufferSize());
    }

    public final <R> Observable<R> replay(InterfaceC23492o<? super Observable<T>, ? extends InterfaceC23434B<R>> interfaceC23492o, int i) {
        C23544b.m32923e(interfaceC23492o, "selector is null");
        C23544b.m32922f(i, "bufferSize");
        return C24100U0.m32592q(C24250p0.m32471h(this, i), interfaceC23492o);
    }

    public final Observable<T> retry(long j) {
        return retry(j, C23506a.m32971c());
    }

    public final Observable<T> skip(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return skipUntil(timer(j, timeUnit, abstractC23437E));
    }

    public final Observable<T> skipLast(long j, TimeUnit timeUnit) {
        return skipLast(j, timeUnit, C24542a.m31930e(), false, bufferSize());
    }

    public final Observable<T> startWith(T t) {
        C23544b.m32923e(t, "item is null");
        return concatArray(just(t), this);
    }

    public final InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a) {
        return subscribe(interfaceC23484g, interfaceC23484g2, interfaceC23478a, C23506a.m32967g());
    }

    public final Observable<T> take(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return takeUntil(timer(j, timeUnit, abstractC23437E));
    }

    public final Observable<T> throttleLatest(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31994o(new C24329y1(this, j, timeUnit, abstractC23437E, z));
    }

    public final Observable<C24551b<T>> timeInterval(TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31994o(new C24335z1(this, timeUnit, abstractC23437E));
    }

    public final Observable<T> timeout(long j, TimeUnit timeUnit) {
        return timeout0(j, timeUnit, null, C24542a.m31934a());
    }

    public final Observable<C24551b<T>> timestamp(TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return (Observable<C24551b<T>>) map(C23506a.m32953u(timeUnit, abstractC23437E));
    }

    public final <U extends Collection<? super T>> AbstractC23442F<U> toList(Callable<U> callable) {
        C23544b.m32923e(callable, "collectionSupplier is null");
        return C24508a.m31993p(new C23994E1(this, callable));
    }

    public final AbstractC23442F<List<T>> toSortedList(Comparator<? super T> comparator, int i) {
        C23544b.m32923e(comparator, "comparator is null");
        return (AbstractC23442F<List<T>>) toList(i).m33157I(C23506a.m32961m(comparator));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T1, T2, R> Observable<R> withLatestFrom(InterfaceC23434B<T1> interfaceC23434B, InterfaceC23434B<T2> interfaceC23434B2, InterfaceC23485h<? super T, ? super T1, ? super T2, R> interfaceC23485h) {
        C23544b.m32923e(interfaceC23434B, "o1 is null");
        C23544b.m32923e(interfaceC23434B2, "o2 is null");
        C23544b.m32923e(interfaceC23485h, "combiner is null");
        return withLatestFrom(new InterfaceC23434B[]{interfaceC23434B, interfaceC23434B2}, C23506a.m32951w(interfaceC23485h));
    }

    public final <U, R> Observable<R> zipWith(InterfaceC23434B<? extends U> interfaceC23434B, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c) {
        C23544b.m32923e(interfaceC23434B, "other is null");
        return zip(this, interfaceC23434B, interfaceC23480c);
    }

    public static <T, S> Observable<T> generate(Callable<S> callable, InterfaceC23479b<S, InterfaceC24489j<T>> interfaceC23479b) {
        C23544b.m32923e(interfaceC23479b, "generator is null");
        return generate(callable, C24250p0.m32467l(interfaceC23479b), C23506a.m32967g());
    }

    public static Observable<Long> interval(long j, TimeUnit timeUnit) {
        return interval(j, j, timeUnit, C24542a.m31934a());
    }

    public final T blockingFirst(T t) {
        C23561f c23561f = new C23561f();
        subscribe(c23561f);
        T m32916a = c23561f.m32916a();
        return m32916a != null ? m32916a : t;
    }

    public final T blockingLast(T t) {
        C23562g c23562g = new C23562g();
        subscribe(c23562g);
        T m32916a = c23562g.m32916a();
        return m32916a != null ? m32916a : t;
    }

    public final void blockingSubscribe(InterfaceC23436D<? super T> interfaceC23436D) {
        C24215l.m32496b(this, interfaceC23436D);
    }

    public final Observable<T> concatWith(InterfaceC24574u<? extends T> interfaceC24574u) {
        C23544b.m32923e(interfaceC24574u, "other is null");
        return C24508a.m31994o(new C24325y(this, interfaceC24574u));
    }

    public final Observable<T> delay(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return delay(j, timeUnit, abstractC23437E, false);
    }

    public final <K, V> Observable<AbstractC24496b<K, V>> groupBy(InterfaceC23492o<? super T, ? extends K> interfaceC23492o, InterfaceC23492o<? super T, ? extends V> interfaceC23492o2, boolean z, int i) {
        C23544b.m32923e(interfaceC23492o, "keySelector is null");
        C23544b.m32923e(interfaceC23492o2, "valueSelector is null");
        C23544b.m32922f(i, "bufferSize");
        return C24508a.m31994o(new C24209k0(this, interfaceC23492o, interfaceC23492o2, i, z));
    }

    public final Observable<T> mergeWith(InterfaceC24574u<? extends T> interfaceC24574u) {
        C23544b.m32923e(interfaceC24574u, "other is null");
        return C24508a.m31994o(new C23967B0(this, interfaceC24574u));
    }

    public final Observable<T> retry(long j, InterfaceC23494q<? super Throwable> interfaceC23494q) {
        if (j >= 0) {
            C23544b.m32923e(interfaceC23494q, "predicate is null");
            return C24508a.m31994o(new C24122W0(this, j, interfaceC23494q));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j);
    }

    public final Observable<T> skipLast(long j, TimeUnit timeUnit, boolean z) {
        return skipLast(j, timeUnit, C24542a.m31930e(), z, bufferSize());
    }

    public final InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a, InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g3) {
        C23544b.m32923e(interfaceC23484g, "onNext is null");
        C23544b.m32923e(interfaceC23484g2, "onError is null");
        C23544b.m32923e(interfaceC23478a, "onComplete is null");
        C23544b.m32923e(interfaceC23484g3, "onSubscribe is null");
        C23574s c23574s = new C23574s(interfaceC23484g, interfaceC23484g2, interfaceC23478a, interfaceC23484g3);
        subscribe(c23574s);
        return c23574s;
    }

    public final Observable<T> takeLast(long j, long j2, TimeUnit timeUnit) {
        return takeLast(j, j2, timeUnit, C24542a.m31930e(), false, bufferSize());
    }

    public final Observable<T> timeout(long j, TimeUnit timeUnit, InterfaceC23434B<? extends T> interfaceC23434B) {
        C23544b.m32923e(interfaceC23434B, "other is null");
        return timeout0(j, timeUnit, interfaceC23434B, C24542a.m31934a());
    }

    public final <K, V> AbstractC23442F<Map<K, Collection<V>>> toMultimap(InterfaceC23492o<? super T, ? extends K> interfaceC23492o, InterfaceC23492o<? super T, ? extends V> interfaceC23492o2) {
        return toMultimap(interfaceC23492o, interfaceC23492o2, EnumC24478m.m32249a(), EnumC24466b.m32278c());
    }

    public static <T> Observable<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return fromFuture(future, j, timeUnit).subscribeOn(abstractC23437E);
    }

    public static Observable<Long> interval(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return interval(j, j, timeUnit, abstractC23437E);
    }

    public static <T> Observable<T> just(T t, T t2, T t3) {
        C23544b.m32923e(t, "item1 is null");
        C23544b.m32923e(t2, "item2 is null");
        C23544b.m32923e(t3, "item3 is null");
        return fromArray(t, t2, t3);
    }

    public static <T> Observable<T> merge(InterfaceC23434B<? extends InterfaceC23434B<? extends T>> interfaceC23434B, int i) {
        C23544b.m32923e(interfaceC23434B, "sources is null");
        C23544b.m32922f(i, "maxConcurrency");
        return C24508a.m31994o(new C24124X(interfaceC23434B, C23506a.m32965i(), false, i, bufferSize()));
    }

    public static <T> Observable<T> mergeDelayError(InterfaceC23434B<? extends InterfaceC23434B<? extends T>> interfaceC23434B, int i) {
        C23544b.m32923e(interfaceC23434B, "sources is null");
        C23544b.m32922f(i, "maxConcurrency");
        return C24508a.m31994o(new C24124X(interfaceC23434B, C23506a.m32965i(), true, i, bufferSize()));
    }

    public final Observable<T> delay(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31994o(new C24002G(this, j, timeUnit, abstractC23437E, z));
    }

    public final Observable<T> doOnEach(InterfaceC23484g<? super C24576w<T>> interfaceC23484g) {
        C23544b.m32923e(interfaceC23484g, "onNotification is null");
        return doOnEach(C23506a.m32956r(interfaceC23484g), C23506a.m32957q(interfaceC23484g), C23506a.m32958p(interfaceC23484g), C23506a.f88247c);
    }

    public final Observable<T> sample(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31994o(new C24133Y0(this, j, timeUnit, abstractC23437E, z));
    }

    public final Observable<T> skipLast(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return skipLast(j, timeUnit, abstractC23437E, false, bufferSize());
    }

    public final Observable<T> takeLast(long j, long j2, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return takeLast(j, j2, timeUnit, abstractC23437E, false, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> AbstractC23442F<Map<K, V>> toMap(InterfaceC23492o<? super T, ? extends K> interfaceC23492o, InterfaceC23492o<? super T, ? extends V> interfaceC23492o2, Callable<? extends Map<K, V>> callable) {
        C23544b.m32923e(interfaceC23492o, "keySelector is null");
        C23544b.m32923e(interfaceC23492o2, "valueSelector is null");
        C23544b.m32923e(callable, "mapSupplier is null");
        return (AbstractC23442F<Map<K, V>>) collect(callable, C23506a.m32975E(interfaceC23492o, interfaceC23492o2));
    }

    public final AbstractC23442F<List<T>> toSortedList(int i) {
        return toSortedList(C23506a.m32959o(), i);
    }

    public final <U, R> Observable<R> zipWith(InterfaceC23434B<? extends U> interfaceC23434B, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c, boolean z) {
        return zip(this, interfaceC23434B, interfaceC23480c, z);
    }

    public static <T, R> Observable<R> combineLatest(InterfaceC23434B<? extends T>[] interfaceC23434BArr, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o) {
        return combineLatest(interfaceC23434BArr, interfaceC23492o, bufferSize());
    }

    public static <T> Observable<T> concat(InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23434B<? extends T> interfaceC23434B2) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        return concatArray(interfaceC23434B, interfaceC23434B2);
    }

    public static <T, S> Observable<T> generate(Callable<S> callable, InterfaceC23479b<S, InterfaceC24489j<T>> interfaceC23479b, InterfaceC23484g<? super S> interfaceC23484g) {
        C23544b.m32923e(interfaceC23479b, "generator is null");
        return generate(callable, C24250p0.m32467l(interfaceC23479b), interfaceC23484g);
    }

    public final <U extends Collection<? super T>> Observable<U> buffer(int i, Callable<U> callable) {
        return buffer(i, i, callable);
    }

    public final Observable<T> concatWith(InterfaceC23496h interfaceC23496h) {
        C23544b.m32923e(interfaceC23496h, "other is null");
        return C24508a.m31994o(new C24319x(this, interfaceC23496h));
    }

    public final Observable<T> mergeWith(InterfaceC23496h interfaceC23496h) {
        C23544b.m32923e(interfaceC23496h, "other is null");
        return C24508a.m31994o(new C23957A0(this, interfaceC23496h));
    }

    public final <R> Observable<R> replay(InterfaceC23492o<? super Observable<T>, ? extends InterfaceC23434B<R>> interfaceC23492o, int i, long j, TimeUnit timeUnit) {
        return replay(interfaceC23492o, i, j, timeUnit, C24542a.m31934a());
    }

    public final Observable<T> skipLast(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z) {
        return skipLast(j, timeUnit, abstractC23437E, z, bufferSize());
    }

    public final Observable<T> takeLast(long j, long j2, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z, int i) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        C23544b.m32922f(i, "bufferSize");
        if (j >= 0) {
            return C24508a.m31994o(new C24295t1(this, j, j2, timeUnit, abstractC23437E, i, z));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + j);
    }

    public final Observable<T> timeout(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, InterfaceC23434B<? extends T> interfaceC23434B) {
        C23544b.m32923e(interfaceC23434B, "other is null");
        return timeout0(j, timeUnit, interfaceC23434B, abstractC23437E);
    }

    public final Observable<Observable<T>> window(long j, long j2, TimeUnit timeUnit) {
        return window(j, j2, timeUnit, C24542a.m31934a(), bufferSize());
    }

    public final <U, R> Observable<R> zipWith(InterfaceC23434B<? extends U> interfaceC23434B, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c, boolean z, int i) {
        return zip(this, interfaceC23434B, interfaceC23480c, z, i);
    }

    public static <T, R> Observable<R> combineLatest(InterfaceC23434B<? extends T>[] interfaceC23434BArr, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, int i) {
        C23544b.m32923e(interfaceC23434BArr, "sources is null");
        if (interfaceC23434BArr.length == 0) {
            return empty();
        }
        C23544b.m32923e(interfaceC23492o, "combiner is null");
        C23544b.m32922f(i, "bufferSize");
        return C24508a.m31994o(new C24297u(interfaceC23434BArr, null, interfaceC23492o, i << 1, false));
    }

    public static <T, R> Observable<R> combineLatestDelayError(Iterable<? extends InterfaceC23434B<? extends T>> iterable, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o) {
        return combineLatestDelayError(iterable, interfaceC23492o, bufferSize());
    }

    public static <T> AbstractC23442F<Boolean> sequenceEqual(InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23434B<? extends T> interfaceC23434B2, int i) {
        return sequenceEqual(interfaceC23434B, interfaceC23434B2, C23544b.m32924d(), i);
    }

    public final Observable<List<T>> buffer(long j, long j2, TimeUnit timeUnit) {
        return (Observable<List<T>>) buffer(j, j2, timeUnit, C24542a.m31934a(), EnumC24466b.m32279b());
    }

    public final <R> Observable<R> replay(InterfaceC23492o<? super Observable<T>, ? extends InterfaceC23434B<R>> interfaceC23492o, int i, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(interfaceC23492o, "selector is null");
        C23544b.m32922f(i, "bufferSize");
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24100U0.m32592q(C24250p0.m32470i(this, i, j, timeUnit, abstractC23437E), interfaceC23492o);
    }

    public final Observable<T> retry(InterfaceC23494q<? super Throwable> interfaceC23494q) {
        return retry(LongCompanionObject.MAX_VALUE, interfaceC23494q);
    }

    public final Observable<T> skipLast(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z, int i) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        C23544b.m32922f(i, "bufferSize");
        return C24508a.m31994o(new C24213k1(this, j, timeUnit, abstractC23437E, i << 1, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> AbstractC23442F<Map<K, Collection<V>>> toMultimap(InterfaceC23492o<? super T, ? extends K> interfaceC23492o, InterfaceC23492o<? super T, ? extends V> interfaceC23492o2, Callable<? extends Map<K, Collection<V>>> callable, InterfaceC23492o<? super K, ? extends Collection<? super V>> interfaceC23492o3) {
        C23544b.m32923e(interfaceC23492o, "keySelector is null");
        C23544b.m32923e(interfaceC23492o2, "valueSelector is null");
        C23544b.m32923e(callable, "mapSupplier is null");
        C23544b.m32923e(interfaceC23492o3, "collectionFactory is null");
        return (AbstractC23442F<Map<K, Collection<V>>>) collect(callable, C23506a.m32974F(interfaceC23492o, interfaceC23492o2, interfaceC23492o3));
    }

    public final Observable<Observable<T>> window(long j, long j2, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return window(j, j2, timeUnit, abstractC23437E, bufferSize());
    }

    public static <T, R> Observable<R> combineLatestDelayError(Iterable<? extends InterfaceC23434B<? extends T>> iterable, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, int i) {
        C23544b.m32923e(iterable, "sources is null");
        C23544b.m32923e(interfaceC23492o, "combiner is null");
        C23544b.m32922f(i, "bufferSize");
        return C24508a.m31994o(new C24297u(null, iterable, interfaceC23492o, i << 1, true));
    }

    public static <T> Observable<T> fromFuture(Future<? extends T> future, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return fromFuture(future).subscribeOn(abstractC23437E);
    }

    public static <T, S> Observable<T> generate(Callable<S> callable, InterfaceC23480c<S, InterfaceC24489j<T>, S> interfaceC23480c) {
        return generate(callable, interfaceC23480c, C23506a.m32967g());
    }

    public static <T> Observable<T> merge(InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23434B<? extends T> interfaceC23434B2) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        return fromArray(interfaceC23434B, interfaceC23434B2).flatMap(C23506a.m32965i(), false, 2);
    }

    public static <T> Observable<T> mergeDelayError(InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23434B<? extends T> interfaceC23434B2) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        return fromArray(interfaceC23434B, interfaceC23434B2).flatMap(C23506a.m32965i(), true, 2);
    }

    public static <T1, T2, R> Observable<R> zip(InterfaceC23434B<? extends T1> interfaceC23434B, InterfaceC23434B<? extends T2> interfaceC23434B2, InterfaceC23480c<? super T1, ? super T2, ? extends R> interfaceC23480c) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        return zipArray(C23506a.m32952v(interfaceC23480c), false, bufferSize(), interfaceC23434B, interfaceC23434B2);
    }

    public final Observable<List<T>> buffer(long j, long j2, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return (Observable<List<T>>) buffer(j, j2, timeUnit, abstractC23437E, EnumC24466b.m32279b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <U, V> Observable<T> delay(InterfaceC23434B<U> interfaceC23434B, InterfaceC23492o<? super T, ? extends InterfaceC23434B<V>> interfaceC23492o) {
        return delaySubscription(interfaceC23434B).delay(interfaceC23492o);
    }

    public final <U> Observable<T> sample(InterfaceC23434B<U> interfaceC23434B) {
        C23544b.m32923e(interfaceC23434B, "sampler is null");
        return C24508a.m31994o(new C24140Z0(this, interfaceC23434B, false));
    }

    public final Observable<T> timeout(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return timeout0(j, timeUnit, null, abstractC23437E);
    }

    public final Observable<Observable<T>> window(long j, long j2, TimeUnit timeUnit, AbstractC23437E abstractC23437E, int i) {
        C23544b.m32921g(j, "timespan");
        C23544b.m32921g(j2, "timeskip");
        C23544b.m32922f(i, "bufferSize");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        C23544b.m32923e(timeUnit, "unit is null");
        return C24508a.m31994o(new C24049L1(this, j, j2, timeUnit, abstractC23437E, LongCompanionObject.MAX_VALUE, i, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T1, T2, T3, R> Observable<R> withLatestFrom(InterfaceC23434B<T1> interfaceC23434B, InterfaceC23434B<T2> interfaceC23434B2, InterfaceC23434B<T3> interfaceC23434B3, InterfaceC23486i<? super T, ? super T1, ? super T2, ? super T3, R> interfaceC23486i) {
        C23544b.m32923e(interfaceC23434B, "o1 is null");
        C23544b.m32923e(interfaceC23434B2, "o2 is null");
        C23544b.m32923e(interfaceC23434B3, "o3 is null");
        C23544b.m32923e(interfaceC23486i, "combiner is null");
        return withLatestFrom(new InterfaceC23434B[]{interfaceC23434B, interfaceC23434B2, interfaceC23434B3}, C23506a.m32950x(interfaceC23486i));
    }

    public static <T> Observable<T> concat(InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23434B<? extends T> interfaceC23434B2, InterfaceC23434B<? extends T> interfaceC23434B3) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        return concatArray(interfaceC23434B, interfaceC23434B2, interfaceC23434B3);
    }

    public static <T, S> Observable<T> generate(Callable<S> callable, InterfaceC23480c<S, InterfaceC24489j<T>, S> interfaceC23480c, InterfaceC23484g<? super S> interfaceC23484g) {
        C23544b.m32923e(callable, "initialState is null");
        C23544b.m32923e(interfaceC23480c, "generator is null");
        C23544b.m32923e(interfaceC23484g, "disposeState is null");
        return C24508a.m31994o(new C24204j0(callable, interfaceC23480c, interfaceC23484g));
    }

    public static <T> Observable<T> just(T t, T t2, T t3, T t4) {
        C23544b.m32923e(t, "item1 is null");
        C23544b.m32923e(t2, "item2 is null");
        C23544b.m32923e(t3, "item3 is null");
        C23544b.m32923e(t4, "item4 is null");
        return fromArray(t, t2, t3, t4);
    }

    public final <U extends Collection<? super T>> Observable<U> buffer(long j, long j2, TimeUnit timeUnit, AbstractC23437E abstractC23437E, Callable<U> callable) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        C23544b.m32923e(callable, "bufferSupplier is null");
        return C24508a.m31994o(new C24269q(this, j, j2, timeUnit, abstractC23437E, callable, Integer.MAX_VALUE, false));
    }

    public final <U, V> Observable<T> timeout(InterfaceC23434B<U> interfaceC23434B, InterfaceC23492o<? super T, ? extends InterfaceC23434B<V>> interfaceC23492o) {
        C23544b.m32923e(interfaceC23434B, "firstTimeoutIndicator is null");
        return timeout0(interfaceC23434B, interfaceC23492o, null);
    }

    public final Observable<T> doOnEach(InterfaceC23436D<? super T> interfaceC23436D) {
        C23544b.m32923e(interfaceC23436D, "observer is null");
        return doOnEach(C24250p0.m32473f(interfaceC23436D), C24250p0.m32474e(interfaceC23436D), C24250p0.m32475d(interfaceC23436D), C23506a.f88247c);
    }

    public final <U> Observable<T> sample(InterfaceC23434B<U> interfaceC23434B, boolean z) {
        C23544b.m32923e(interfaceC23434B, "sampler is null");
        return C24508a.m31994o(new C24140Z0(this, interfaceC23434B, z));
    }

    @Override // io.reactivex.InterfaceC23434B
    public final void subscribe(InterfaceC23436D<? super T> interfaceC23436D) {
        C23544b.m32923e(interfaceC23436D, "observer is null");
        try {
            InterfaceC23436D<? super T> m32017B = C24508a.m32017B(this, interfaceC23436D);
            C23544b.m32923e(m32017B, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(m32017B);
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

    public static <T> Observable<T> merge(InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23434B<? extends T> interfaceC23434B2, InterfaceC23434B<? extends T> interfaceC23434B3) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        return fromArray(interfaceC23434B, interfaceC23434B2, interfaceC23434B3).flatMap(C23506a.m32965i(), false, 3);
    }

    public static <T> Observable<T> mergeDelayError(InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23434B<? extends T> interfaceC23434B2, InterfaceC23434B<? extends T> interfaceC23434B3) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        return fromArray(interfaceC23434B, interfaceC23434B2, interfaceC23434B3).flatMap(C23506a.m32965i(), true, 3);
    }

    public static <T1, T2, R> Observable<R> zip(InterfaceC23434B<? extends T1> interfaceC23434B, InterfaceC23434B<? extends T2> interfaceC23434B2, InterfaceC23480c<? super T1, ? super T2, ? extends R> interfaceC23480c, boolean z) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        return zipArray(C23506a.m32952v(interfaceC23480c), z, bufferSize(), interfaceC23434B, interfaceC23434B2);
    }

    public final <R> Observable<R> flatMap(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, InterfaceC23492o<? super Throwable, ? extends InterfaceC23434B<? extends R>> interfaceC23492o2, Callable<? extends InterfaceC23434B<? extends R>> callable) {
        C23544b.m32923e(interfaceC23492o, "onNextMapper is null");
        C23544b.m32923e(interfaceC23492o2, "onErrorMapper is null");
        C23544b.m32923e(callable, "onCompleteSupplier is null");
        return merge(new C24327y0(this, interfaceC23492o, interfaceC23492o2, callable));
    }

    public final Observable<T> takeLast(long j, TimeUnit timeUnit) {
        return takeLast(j, timeUnit, C24542a.m31930e(), false, bufferSize());
    }

    public final <U, V> Observable<T> timeout(InterfaceC23434B<U> interfaceC23434B, InterfaceC23492o<? super T, ? extends InterfaceC23434B<V>> interfaceC23492o, InterfaceC23434B<? extends T> interfaceC23434B2) {
        C23544b.m32923e(interfaceC23434B, "firstTimeoutIndicator is null");
        C23544b.m32923e(interfaceC23434B2, "other is null");
        return timeout0(interfaceC23434B, interfaceC23492o, interfaceC23434B2);
    }

    public final Observable<T> takeLast(long j, TimeUnit timeUnit, boolean z) {
        return takeLast(j, timeUnit, C24542a.m31930e(), z, bufferSize());
    }

    public final <K, V> AbstractC23442F<Map<K, Collection<V>>> toMultimap(InterfaceC23492o<? super T, ? extends K> interfaceC23492o, InterfaceC23492o<? super T, ? extends V> interfaceC23492o2, Callable<Map<K, Collection<V>>> callable) {
        return toMultimap(interfaceC23492o, interfaceC23492o2, callable, EnumC24466b.m32278c());
    }

    public static <T1, T2, R> Observable<R> combineLatest(InterfaceC23434B<? extends T1> interfaceC23434B, InterfaceC23434B<? extends T2> interfaceC23434B2, InterfaceC23480c<? super T1, ? super T2, ? extends R> interfaceC23480c) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        return combineLatest(C23506a.m32952v(interfaceC23480c), bufferSize(), interfaceC23434B, interfaceC23434B2);
    }

    public static <T> Observable<T> concat(InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23434B<? extends T> interfaceC23434B2, InterfaceC23434B<? extends T> interfaceC23434B3, InterfaceC23434B<? extends T> interfaceC23434B4) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        C23544b.m32923e(interfaceC23434B4, "source4 is null");
        return concatArray(interfaceC23434B, interfaceC23434B2, interfaceC23434B3, interfaceC23434B4);
    }

    public final Observable<List<T>> buffer(long j, TimeUnit timeUnit) {
        return buffer(j, timeUnit, C24542a.m31934a(), Integer.MAX_VALUE);
    }

    public final <R> Observable<R> replay(InterfaceC23492o<? super Observable<T>, ? extends InterfaceC23434B<R>> interfaceC23492o, int i, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(interfaceC23492o, "selector is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        C23544b.m32922f(i, "bufferSize");
        return C24100U0.m32592q(C24250p0.m32471h(this, i), C24250p0.m32468k(interfaceC23492o, abstractC23437E));
    }

    public final Observable<T> takeLast(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return takeLast(j, timeUnit, abstractC23437E, false, bufferSize());
    }

    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5) {
        C23544b.m32923e(t, "item1 is null");
        C23544b.m32923e(t2, "item2 is null");
        C23544b.m32923e(t3, "item3 is null");
        C23544b.m32923e(t4, "item4 is null");
        C23544b.m32923e(t5, "item5 is null");
        return fromArray(t, t2, t3, t4, t5);
    }

    public static <T1, T2, R> Observable<R> zip(InterfaceC23434B<? extends T1> interfaceC23434B, InterfaceC23434B<? extends T2> interfaceC23434B2, InterfaceC23480c<? super T1, ? super T2, ? extends R> interfaceC23480c, boolean z, int i) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        return zipArray(C23506a.m32952v(interfaceC23480c), z, i, interfaceC23434B, interfaceC23434B2);
    }

    public final Observable<List<T>> buffer(long j, TimeUnit timeUnit, int i) {
        return buffer(j, timeUnit, C24542a.m31934a(), i);
    }

    public final Observable<T> takeLast(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z) {
        return takeLast(j, timeUnit, abstractC23437E, z, bufferSize());
    }

    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit) {
        return window(j, timeUnit, C24542a.m31934a(), (long) LongCompanionObject.MAX_VALUE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T1, T2, T3, T4, R> Observable<R> withLatestFrom(InterfaceC23434B<T1> interfaceC23434B, InterfaceC23434B<T2> interfaceC23434B2, InterfaceC23434B<T3> interfaceC23434B3, InterfaceC23434B<T4> interfaceC23434B4, InterfaceC23487j<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> interfaceC23487j) {
        C23544b.m32923e(interfaceC23434B, "o1 is null");
        C23544b.m32923e(interfaceC23434B2, "o2 is null");
        C23544b.m32923e(interfaceC23434B3, "o3 is null");
        C23544b.m32923e(interfaceC23434B4, "o4 is null");
        C23544b.m32923e(interfaceC23487j, "combiner is null");
        return withLatestFrom(new InterfaceC23434B[]{interfaceC23434B, interfaceC23434B2, interfaceC23434B3, interfaceC23434B4}, C23506a.m32949y(interfaceC23487j));
    }

    public static <T> Observable<T> merge(InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23434B<? extends T> interfaceC23434B2, InterfaceC23434B<? extends T> interfaceC23434B3, InterfaceC23434B<? extends T> interfaceC23434B4) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        C23544b.m32923e(interfaceC23434B4, "source4 is null");
        return fromArray(interfaceC23434B, interfaceC23434B2, interfaceC23434B3, interfaceC23434B4).flatMap(C23506a.m32965i(), false, 4);
    }

    public static <T> Observable<T> mergeDelayError(InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23434B<? extends T> interfaceC23434B2, InterfaceC23434B<? extends T> interfaceC23434B3, InterfaceC23434B<? extends T> interfaceC23434B4) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        C23544b.m32923e(interfaceC23434B4, "source4 is null");
        return fromArray(interfaceC23434B, interfaceC23434B2, interfaceC23434B3, interfaceC23434B4).flatMap(C23506a.m32965i(), true, 4);
    }

    public final Observable<List<T>> buffer(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, int i) {
        return (Observable<List<T>>) buffer(j, timeUnit, abstractC23437E, i, EnumC24466b.m32279b(), false);
    }

    public final <R> Observable<R> flatMap(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, InterfaceC23492o<Throwable, ? extends InterfaceC23434B<? extends R>> interfaceC23492o2, Callable<? extends InterfaceC23434B<? extends R>> callable, int i) {
        C23544b.m32923e(interfaceC23492o, "onNextMapper is null");
        C23544b.m32923e(interfaceC23492o2, "onErrorMapper is null");
        C23544b.m32923e(callable, "onCompleteSupplier is null");
        return merge(new C24327y0(this, interfaceC23492o, interfaceC23492o2, callable), i);
    }

    public final Observable<T> takeLast(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z, int i) {
        return takeLast(LongCompanionObject.MAX_VALUE, j, timeUnit, abstractC23437E, z, i);
    }

    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, long j2) {
        return window(j, timeUnit, C24542a.m31934a(), j2, false);
    }

    public static <T1, T2, T3, R> Observable<R> combineLatest(InterfaceC23434B<? extends T1> interfaceC23434B, InterfaceC23434B<? extends T2> interfaceC23434B2, InterfaceC23434B<? extends T3> interfaceC23434B3, InterfaceC23485h<? super T1, ? super T2, ? super T3, ? extends R> interfaceC23485h) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        return combineLatest(C23506a.m32951w(interfaceC23485h), bufferSize(), interfaceC23434B, interfaceC23434B2, interfaceC23434B3);
    }

    public final <U extends Collection<? super T>> Observable<U> buffer(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, int i, Callable<U> callable, boolean z) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        C23544b.m32923e(callable, "bufferSupplier is null");
        C23544b.m32922f(i, "count");
        return C24508a.m31994o(new C24269q(this, j, j, timeUnit, abstractC23437E, callable, i, z));
    }

    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, long j2, boolean z) {
        return window(j, timeUnit, C24542a.m31934a(), j2, z);
    }

    public static <T1, T2, T3, R> Observable<R> zip(InterfaceC23434B<? extends T1> interfaceC23434B, InterfaceC23434B<? extends T2> interfaceC23434B2, InterfaceC23434B<? extends T3> interfaceC23434B3, InterfaceC23485h<? super T1, ? super T2, ? super T3, ? extends R> interfaceC23485h) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        return zipArray(C23506a.m32951w(interfaceC23485h), false, bufferSize(), interfaceC23434B, interfaceC23434B2, interfaceC23434B3);
    }

    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return window(j, timeUnit, abstractC23437E, (long) LongCompanionObject.MAX_VALUE, false);
    }

    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, long j2) {
        return window(j, timeUnit, abstractC23437E, j2, false);
    }

    public final <R> Observable<R> flatMap(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, int i) {
        return flatMap((InterfaceC23492o) interfaceC23492o, false, i, bufferSize());
    }

    public final <R> Observable<R> replay(InterfaceC23492o<? super Observable<T>, ? extends InterfaceC23434B<R>> interfaceC23492o, long j, TimeUnit timeUnit) {
        return replay(interfaceC23492o, j, timeUnit, C24542a.m31934a());
    }

    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, long j2, boolean z) {
        return window(j, timeUnit, abstractC23437E, j2, z, bufferSize());
    }

    public static <T1, T2, T3, T4, R> Observable<R> combineLatest(InterfaceC23434B<? extends T1> interfaceC23434B, InterfaceC23434B<? extends T2> interfaceC23434B2, InterfaceC23434B<? extends T3> interfaceC23434B3, InterfaceC23434B<? extends T4> interfaceC23434B4, InterfaceC23486i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> interfaceC23486i) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        C23544b.m32923e(interfaceC23434B4, "source4 is null");
        return combineLatest(C23506a.m32950x(interfaceC23486i), bufferSize(), interfaceC23434B, interfaceC23434B2, interfaceC23434B3, interfaceC23434B4);
    }

    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6) {
        C23544b.m32923e(t, "item1 is null");
        C23544b.m32923e(t2, "item2 is null");
        C23544b.m32923e(t3, "item3 is null");
        C23544b.m32923e(t4, "item4 is null");
        C23544b.m32923e(t5, "item5 is null");
        C23544b.m32923e(t6, "item6 is null");
        return fromArray(t, t2, t3, t4, t5, t6);
    }

    public final <U, R> Observable<R> flatMap(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends U>> interfaceC23492o, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c) {
        return flatMap(interfaceC23492o, interfaceC23480c, false, bufferSize(), bufferSize());
    }

    public final <R> Observable<R> replay(InterfaceC23492o<? super Observable<T>, ? extends InterfaceC23434B<R>> interfaceC23492o, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(interfaceC23492o, "selector is null");
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24100U0.m32592q(C24250p0.m32469j(this, j, timeUnit, abstractC23437E), interfaceC23492o);
    }

    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, long j2, boolean z, int i) {
        C23544b.m32922f(i, "bufferSize");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32921g(j2, "count");
        return C24508a.m31994o(new C24049L1(this, j, j, timeUnit, abstractC23437E, j2, i, z));
    }

    public static <T1, T2, T3, T4, R> Observable<R> zip(InterfaceC23434B<? extends T1> interfaceC23434B, InterfaceC23434B<? extends T2> interfaceC23434B2, InterfaceC23434B<? extends T3> interfaceC23434B3, InterfaceC23434B<? extends T4> interfaceC23434B4, InterfaceC23486i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> interfaceC23486i) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        C23544b.m32923e(interfaceC23434B4, "source4 is null");
        return zipArray(C23506a.m32950x(interfaceC23486i), false, bufferSize(), interfaceC23434B, interfaceC23434B2, interfaceC23434B3, interfaceC23434B4);
    }

    public final Observable<List<T>> buffer(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return (Observable<List<T>>) buffer(j, timeUnit, abstractC23437E, Integer.MAX_VALUE, EnumC24466b.m32279b(), false);
    }

    public final <U, R> Observable<R> flatMap(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends U>> interfaceC23492o, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c, boolean z) {
        return flatMap(interfaceC23492o, interfaceC23480c, z, bufferSize(), bufferSize());
    }

    public final <R> Observable<R> withLatestFrom(InterfaceC23434B<?>[] interfaceC23434BArr, InterfaceC23492o<? super Object[], R> interfaceC23492o) {
        C23544b.m32923e(interfaceC23434BArr, "others is null");
        C23544b.m32923e(interfaceC23492o, "combiner is null");
        return C24508a.m31994o(new C24067N1(this, interfaceC23434BArr, interfaceC23492o));
    }

    public final <TOpening, TClosing> Observable<List<T>> buffer(InterfaceC23434B<? extends TOpening> interfaceC23434B, InterfaceC23492o<? super TOpening, ? extends InterfaceC23434B<? extends TClosing>> interfaceC23492o) {
        return (Observable<List<T>>) buffer(interfaceC23434B, interfaceC23492o, EnumC24466b.m32279b());
    }

    public final <U, R> Observable<R> flatMap(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends U>> interfaceC23492o, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c, boolean z, int i) {
        return flatMap(interfaceC23492o, interfaceC23480c, z, i, bufferSize());
    }

    public final <TOpening, TClosing, U extends Collection<? super T>> Observable<U> buffer(InterfaceC23434B<? extends TOpening> interfaceC23434B, InterfaceC23492o<? super TOpening, ? extends InterfaceC23434B<? extends TClosing>> interfaceC23492o, Callable<U> callable) {
        C23544b.m32923e(interfaceC23434B, "openingIndicator is null");
        C23544b.m32923e(interfaceC23492o, "closingIndicator is null");
        C23544b.m32923e(callable, "bufferSupplier is null");
        return C24508a.m31994o(new C24231n(this, interfaceC23434B, interfaceC23492o, callable));
    }

    public final <U, R> Observable<R> flatMap(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends U>> interfaceC23492o, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c, boolean z, int i, int i2) {
        C23544b.m32923e(interfaceC23492o, "mapper is null");
        C23544b.m32923e(interfaceC23480c, "combiner is null");
        return flatMap(C24250p0.m32477b(interfaceC23492o, interfaceC23480c), z, i, i2);
    }

    public final <R> Observable<R> replay(InterfaceC23492o<? super Observable<T>, ? extends InterfaceC23434B<R>> interfaceC23492o, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(interfaceC23492o, "selector is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24100U0.m32592q(C24250p0.m32472g(this), C24250p0.m32468k(interfaceC23492o, abstractC23437E));
    }

    public final <R> Observable<R> withLatestFrom(Iterable<? extends InterfaceC23434B<?>> iterable, InterfaceC23492o<? super Object[], R> interfaceC23492o) {
        C23544b.m32923e(iterable, "others is null");
        C23544b.m32923e(interfaceC23492o, "combiner is null");
        return C24508a.m31994o(new C24067N1(this, iterable, interfaceC23492o));
    }

    public static <T1, T2, T3, T4, T5, R> Observable<R> combineLatest(InterfaceC23434B<? extends T1> interfaceC23434B, InterfaceC23434B<? extends T2> interfaceC23434B2, InterfaceC23434B<? extends T3> interfaceC23434B3, InterfaceC23434B<? extends T4> interfaceC23434B4, InterfaceC23434B<? extends T5> interfaceC23434B5, InterfaceC23487j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> interfaceC23487j) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        C23544b.m32923e(interfaceC23434B4, "source4 is null");
        C23544b.m32923e(interfaceC23434B5, "source5 is null");
        return combineLatest(C23506a.m32949y(interfaceC23487j), bufferSize(), interfaceC23434B, interfaceC23434B2, interfaceC23434B3, interfaceC23434B4, interfaceC23434B5);
    }

    public final <B> Observable<Observable<T>> window(InterfaceC23434B<B> interfaceC23434B) {
        return window(interfaceC23434B, bufferSize());
    }

    public static <T1, T2, T3, T4, T5, R> Observable<R> zip(InterfaceC23434B<? extends T1> interfaceC23434B, InterfaceC23434B<? extends T2> interfaceC23434B2, InterfaceC23434B<? extends T3> interfaceC23434B3, InterfaceC23434B<? extends T4> interfaceC23434B4, InterfaceC23434B<? extends T5> interfaceC23434B5, InterfaceC23487j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> interfaceC23487j) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        C23544b.m32923e(interfaceC23434B4, "source4 is null");
        C23544b.m32923e(interfaceC23434B5, "source5 is null");
        return zipArray(C23506a.m32949y(interfaceC23487j), false, bufferSize(), interfaceC23434B, interfaceC23434B2, interfaceC23434B3, interfaceC23434B4, interfaceC23434B5);
    }

    public final <U, R> Observable<R> flatMap(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends U>> interfaceC23492o, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c, int i) {
        return flatMap(interfaceC23492o, interfaceC23480c, false, i, bufferSize());
    }

    public final <B> Observable<Observable<T>> window(InterfaceC23434B<B> interfaceC23434B, int i) {
        C23544b.m32923e(interfaceC23434B, "boundary is null");
        C23544b.m32922f(i, "bufferSize");
        return C24508a.m31994o(new C24026I1(this, interfaceC23434B, i));
    }

    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        C23544b.m32923e(t, "item1 is null");
        C23544b.m32923e(t2, "item2 is null");
        C23544b.m32923e(t3, "item3 is null");
        C23544b.m32923e(t4, "item4 is null");
        C23544b.m32923e(t5, "item5 is null");
        C23544b.m32923e(t6, "item6 is null");
        C23544b.m32923e(t7, "item7 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7);
    }

    public final <B> Observable<List<T>> buffer(InterfaceC23434B<B> interfaceC23434B) {
        return (Observable<List<T>>) buffer(interfaceC23434B, EnumC24466b.m32279b());
    }

    public final <B> Observable<List<T>> buffer(InterfaceC23434B<B> interfaceC23434B, int i) {
        C23544b.m32922f(i, "initialCapacity");
        return (Observable<List<T>>) buffer(interfaceC23434B, C23506a.m32969e(i));
    }

    public final AbstractC24495a<T> replay(int i) {
        C23544b.m32922f(i, "bufferSize");
        return C24100U0.m32597l(this, i);
    }

    public final <U, V> Observable<Observable<T>> window(InterfaceC23434B<U> interfaceC23434B, InterfaceC23492o<? super U, ? extends InterfaceC23434B<V>> interfaceC23492o) {
        return window(interfaceC23434B, interfaceC23492o, bufferSize());
    }

    public final <B, U extends Collection<? super T>> Observable<U> buffer(InterfaceC23434B<B> interfaceC23434B, Callable<U> callable) {
        C23544b.m32923e(interfaceC23434B, "boundary is null");
        C23544b.m32923e(callable, "bufferSupplier is null");
        return C24508a.m31994o(new C24247p(this, interfaceC23434B, callable));
    }

    public final <U, V> Observable<Observable<T>> window(InterfaceC23434B<U> interfaceC23434B, InterfaceC23492o<? super U, ? extends InterfaceC23434B<V>> interfaceC23492o, int i) {
        C23544b.m32923e(interfaceC23434B, "openingIndicator is null");
        C23544b.m32923e(interfaceC23492o, "closingIndicator is null");
        C23544b.m32922f(i, "bufferSize");
        return C24508a.m31994o(new C24032J1(this, interfaceC23434B, interfaceC23492o, i));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Observable<R> combineLatest(InterfaceC23434B<? extends T1> interfaceC23434B, InterfaceC23434B<? extends T2> interfaceC23434B2, InterfaceC23434B<? extends T3> interfaceC23434B3, InterfaceC23434B<? extends T4> interfaceC23434B4, InterfaceC23434B<? extends T5> interfaceC23434B5, InterfaceC23434B<? extends T6> interfaceC23434B6, InterfaceC23488k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> interfaceC23488k) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        C23544b.m32923e(interfaceC23434B4, "source4 is null");
        C23544b.m32923e(interfaceC23434B5, "source5 is null");
        C23544b.m32923e(interfaceC23434B6, "source6 is null");
        return combineLatest(C23506a.m32948z(interfaceC23488k), bufferSize(), interfaceC23434B, interfaceC23434B2, interfaceC23434B3, interfaceC23434B4, interfaceC23434B5, interfaceC23434B6);
    }

    public final AbstractC24495a<T> replay(int i, long j, TimeUnit timeUnit) {
        return replay(i, j, timeUnit, C24542a.m31934a());
    }

    public static <T1, T2, T3, T4, T5, T6, R> Observable<R> zip(InterfaceC23434B<? extends T1> interfaceC23434B, InterfaceC23434B<? extends T2> interfaceC23434B2, InterfaceC23434B<? extends T3> interfaceC23434B3, InterfaceC23434B<? extends T4> interfaceC23434B4, InterfaceC23434B<? extends T5> interfaceC23434B5, InterfaceC23434B<? extends T6> interfaceC23434B6, InterfaceC23488k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> interfaceC23488k) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        C23544b.m32923e(interfaceC23434B4, "source4 is null");
        C23544b.m32923e(interfaceC23434B5, "source5 is null");
        C23544b.m32923e(interfaceC23434B6, "source6 is null");
        return zipArray(C23506a.m32948z(interfaceC23488k), false, bufferSize(), interfaceC23434B, interfaceC23434B2, interfaceC23434B3, interfaceC23434B4, interfaceC23434B5, interfaceC23434B6);
    }

    public final AbstractC24495a<T> replay(int i, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        C23544b.m32922f(i, "bufferSize");
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24100U0.m32595n(this, j, timeUnit, abstractC23437E, i);
    }

    public final <B> Observable<List<T>> buffer(Callable<? extends InterfaceC23434B<B>> callable) {
        return (Observable<List<T>>) buffer(callable, EnumC24466b.m32279b());
    }

    public final <B, U extends Collection<? super T>> Observable<U> buffer(Callable<? extends InterfaceC23434B<B>> callable, Callable<U> callable2) {
        C23544b.m32923e(callable, "boundarySupplier is null");
        C23544b.m32923e(callable2, "bufferSupplier is null");
        return C24508a.m31994o(new C24240o(this, callable, callable2));
    }

    public final <B> Observable<Observable<T>> window(Callable<? extends InterfaceC23434B<B>> callable) {
        return window(callable, bufferSize());
    }

    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        C23544b.m32923e(t, "item1 is null");
        C23544b.m32923e(t2, "item2 is null");
        C23544b.m32923e(t3, "item3 is null");
        C23544b.m32923e(t4, "item4 is null");
        C23544b.m32923e(t5, "item5 is null");
        C23544b.m32923e(t6, "item6 is null");
        C23544b.m32923e(t7, "item7 is null");
        C23544b.m32923e(t8, "item8 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8);
    }

    public final <B> Observable<Observable<T>> window(Callable<? extends InterfaceC23434B<B>> callable, int i) {
        C23544b.m32923e(callable, "boundary is null");
        C23544b.m32922f(i, "bufferSize");
        return C24508a.m31994o(new C24042K1(this, callable, i));
    }

    public final AbstractC24495a<T> replay(int i, AbstractC23437E abstractC23437E) {
        C23544b.m32922f(i, "bufferSize");
        return C24100U0.m32591r(replay(i), abstractC23437E);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Observable<R> combineLatest(InterfaceC23434B<? extends T1> interfaceC23434B, InterfaceC23434B<? extends T2> interfaceC23434B2, InterfaceC23434B<? extends T3> interfaceC23434B3, InterfaceC23434B<? extends T4> interfaceC23434B4, InterfaceC23434B<? extends T5> interfaceC23434B5, InterfaceC23434B<? extends T6> interfaceC23434B6, InterfaceC23434B<? extends T7> interfaceC23434B7, InterfaceC23489l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> interfaceC23489l) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        C23544b.m32923e(interfaceC23434B4, "source4 is null");
        C23544b.m32923e(interfaceC23434B5, "source5 is null");
        C23544b.m32923e(interfaceC23434B6, "source6 is null");
        C23544b.m32923e(interfaceC23434B7, "source7 is null");
        return combineLatest(C23506a.m32979A(interfaceC23489l), bufferSize(), interfaceC23434B, interfaceC23434B2, interfaceC23434B3, interfaceC23434B4, interfaceC23434B5, interfaceC23434B6, interfaceC23434B7);
    }

    public final AbstractC24495a<T> replay(long j, TimeUnit timeUnit) {
        return replay(j, timeUnit, C24542a.m31934a());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Observable<R> zip(InterfaceC23434B<? extends T1> interfaceC23434B, InterfaceC23434B<? extends T2> interfaceC23434B2, InterfaceC23434B<? extends T3> interfaceC23434B3, InterfaceC23434B<? extends T4> interfaceC23434B4, InterfaceC23434B<? extends T5> interfaceC23434B5, InterfaceC23434B<? extends T6> interfaceC23434B6, InterfaceC23434B<? extends T7> interfaceC23434B7, InterfaceC23489l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> interfaceC23489l) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        C23544b.m32923e(interfaceC23434B4, "source4 is null");
        C23544b.m32923e(interfaceC23434B5, "source5 is null");
        C23544b.m32923e(interfaceC23434B6, "source6 is null");
        C23544b.m32923e(interfaceC23434B7, "source7 is null");
        return zipArray(C23506a.m32979A(interfaceC23489l), false, bufferSize(), interfaceC23434B, interfaceC23434B2, interfaceC23434B3, interfaceC23434B4, interfaceC23434B5, interfaceC23434B6, interfaceC23434B7);
    }

    public final AbstractC24495a<T> replay(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24100U0.m32596m(this, j, timeUnit, abstractC23437E);
    }

    public final AbstractC24495a<T> replay(AbstractC23437E abstractC23437E) {
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24100U0.m32591r(replay(), abstractC23437E);
    }

    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        C23544b.m32923e(t, "item1 is null");
        C23544b.m32923e(t2, "item2 is null");
        C23544b.m32923e(t3, "item3 is null");
        C23544b.m32923e(t4, "item4 is null");
        C23544b.m32923e(t5, "item5 is null");
        C23544b.m32923e(t6, "item6 is null");
        C23544b.m32923e(t7, "item7 is null");
        C23544b.m32923e(t8, "item8 is null");
        C23544b.m32923e(t9, "item9 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable<R> combineLatest(InterfaceC23434B<? extends T1> interfaceC23434B, InterfaceC23434B<? extends T2> interfaceC23434B2, InterfaceC23434B<? extends T3> interfaceC23434B3, InterfaceC23434B<? extends T4> interfaceC23434B4, InterfaceC23434B<? extends T5> interfaceC23434B5, InterfaceC23434B<? extends T6> interfaceC23434B6, InterfaceC23434B<? extends T7> interfaceC23434B7, InterfaceC23434B<? extends T8> interfaceC23434B8, InterfaceC23490m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> interfaceC23490m) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        C23544b.m32923e(interfaceC23434B4, "source4 is null");
        C23544b.m32923e(interfaceC23434B5, "source5 is null");
        C23544b.m32923e(interfaceC23434B6, "source6 is null");
        C23544b.m32923e(interfaceC23434B7, "source7 is null");
        C23544b.m32923e(interfaceC23434B8, "source8 is null");
        return combineLatest(C23506a.m32978B(interfaceC23490m), bufferSize(), interfaceC23434B, interfaceC23434B2, interfaceC23434B3, interfaceC23434B4, interfaceC23434B5, interfaceC23434B6, interfaceC23434B7, interfaceC23434B8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable<R> zip(InterfaceC23434B<? extends T1> interfaceC23434B, InterfaceC23434B<? extends T2> interfaceC23434B2, InterfaceC23434B<? extends T3> interfaceC23434B3, InterfaceC23434B<? extends T4> interfaceC23434B4, InterfaceC23434B<? extends T5> interfaceC23434B5, InterfaceC23434B<? extends T6> interfaceC23434B6, InterfaceC23434B<? extends T7> interfaceC23434B7, InterfaceC23434B<? extends T8> interfaceC23434B8, InterfaceC23490m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> interfaceC23490m) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        C23544b.m32923e(interfaceC23434B4, "source4 is null");
        C23544b.m32923e(interfaceC23434B5, "source5 is null");
        C23544b.m32923e(interfaceC23434B6, "source6 is null");
        C23544b.m32923e(interfaceC23434B7, "source7 is null");
        C23544b.m32923e(interfaceC23434B8, "source8 is null");
        return zipArray(C23506a.m32978B(interfaceC23490m), false, bufferSize(), interfaceC23434B, interfaceC23434B2, interfaceC23434B3, interfaceC23434B4, interfaceC23434B5, interfaceC23434B6, interfaceC23434B7, interfaceC23434B8);
    }

    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        C23544b.m32923e(t, "item1 is null");
        C23544b.m32923e(t2, "item2 is null");
        C23544b.m32923e(t3, "item3 is null");
        C23544b.m32923e(t4, "item4 is null");
        C23544b.m32923e(t5, "item5 is null");
        C23544b.m32923e(t6, "item6 is null");
        C23544b.m32923e(t7, "item7 is null");
        C23544b.m32923e(t8, "item8 is null");
        C23544b.m32923e(t9, "item9 is null");
        C23544b.m32923e(t10, "item10 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable<R> combineLatest(InterfaceC23434B<? extends T1> interfaceC23434B, InterfaceC23434B<? extends T2> interfaceC23434B2, InterfaceC23434B<? extends T3> interfaceC23434B3, InterfaceC23434B<? extends T4> interfaceC23434B4, InterfaceC23434B<? extends T5> interfaceC23434B5, InterfaceC23434B<? extends T6> interfaceC23434B6, InterfaceC23434B<? extends T7> interfaceC23434B7, InterfaceC23434B<? extends T8> interfaceC23434B8, InterfaceC23434B<? extends T9> interfaceC23434B9, InterfaceC23491n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> interfaceC23491n) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        C23544b.m32923e(interfaceC23434B4, "source4 is null");
        C23544b.m32923e(interfaceC23434B5, "source5 is null");
        C23544b.m32923e(interfaceC23434B6, "source6 is null");
        C23544b.m32923e(interfaceC23434B7, "source7 is null");
        C23544b.m32923e(interfaceC23434B8, "source8 is null");
        C23544b.m32923e(interfaceC23434B9, "source9 is null");
        return combineLatest(C23506a.m32977C(interfaceC23491n), bufferSize(), interfaceC23434B, interfaceC23434B2, interfaceC23434B3, interfaceC23434B4, interfaceC23434B5, interfaceC23434B6, interfaceC23434B7, interfaceC23434B8, interfaceC23434B9);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable<R> zip(InterfaceC23434B<? extends T1> interfaceC23434B, InterfaceC23434B<? extends T2> interfaceC23434B2, InterfaceC23434B<? extends T3> interfaceC23434B3, InterfaceC23434B<? extends T4> interfaceC23434B4, InterfaceC23434B<? extends T5> interfaceC23434B5, InterfaceC23434B<? extends T6> interfaceC23434B6, InterfaceC23434B<? extends T7> interfaceC23434B7, InterfaceC23434B<? extends T8> interfaceC23434B8, InterfaceC23434B<? extends T9> interfaceC23434B9, InterfaceC23491n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> interfaceC23491n) {
        C23544b.m32923e(interfaceC23434B, "source1 is null");
        C23544b.m32923e(interfaceC23434B2, "source2 is null");
        C23544b.m32923e(interfaceC23434B3, "source3 is null");
        C23544b.m32923e(interfaceC23434B4, "source4 is null");
        C23544b.m32923e(interfaceC23434B5, "source5 is null");
        C23544b.m32923e(interfaceC23434B6, "source6 is null");
        C23544b.m32923e(interfaceC23434B7, "source7 is null");
        C23544b.m32923e(interfaceC23434B8, "source8 is null");
        C23544b.m32923e(interfaceC23434B9, "source9 is null");
        return zipArray(C23506a.m32977C(interfaceC23491n), false, bufferSize(), interfaceC23434B, interfaceC23434B2, interfaceC23434B3, interfaceC23434B4, interfaceC23434B5, interfaceC23434B6, interfaceC23434B7, interfaceC23434B8, interfaceC23434B9);
    }
}
