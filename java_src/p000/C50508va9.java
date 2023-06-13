package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* renamed from: va9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50508va9 extends Ja9 {
    /* renamed from: a */
    public static <V> C42208ha9<V> m8435a(Iterable<? extends Mb9<? extends V>> iterable) {
        return new C42208ha9<>(false, ZP8.m73199x(iterable), null);
    }

    /* renamed from: b */
    public static <V> C42208ha9<V> m8434b(Iterable<? extends Mb9<? extends V>> iterable) {
        return new C42208ha9<>(true, ZP8.m73199x(iterable), null);
    }

    /* renamed from: c */
    public static <V, X extends Throwable> Mb9<V> m8433c(Mb9<? extends V> mb9, Class<X> cls, InterfaceC43713k69<? super X, ? extends V> interfaceC43713k69, Executor executor) {
        P29 p29 = new P29(mb9, cls, interfaceC43713k69);
        mb9.mo9243o(p29, Hc9.m103647d(executor, p29));
        return p29;
    }

    /* renamed from: d */
    public static <V> Mb9<V> m8432d() {
        return new Qa9();
    }

    /* renamed from: e */
    public static <V> Mb9<V> m8431e(Throwable th) {
        return new Xa9(th);
    }

    /* renamed from: f */
    public static <V> Mb9<V> m8430f(@NullableDecl V v) {
        if (v == null) {
            return (Mb9<V>) C40439eb9.f78601c;
        }
        return new C40439eb9(v);
    }

    /* renamed from: g */
    public static Mb9<Void> m8429g() {
        return C40439eb9.f78601c;
    }

    /* renamed from: h */
    public static <V> Mb9<V> m8428h(Mb9<V> mb9) {
        if (mb9.isDone()) {
            return mb9;
        }
        RunnableC46359oa9 runnableC46359oa9 = new RunnableC46359oa9(mb9);
        mb9.mo9243o(runnableC46359oa9, EnumC44316l79.INSTANCE);
        return runnableC46359oa9;
    }

    /* renamed from: i */
    public static <O> Mb9<O> m8427i(InterfaceC38952c69<O> interfaceC38952c69, Executor executor) {
        RunnableFutureC44027ke9 runnableFutureC44027ke9 = new RunnableFutureC44027ke9(interfaceC38952c69);
        runnableFutureC44027ke9.run();
        return runnableFutureC44027ke9;
    }

    /* renamed from: j */
    public static <I, O> Mb9<O> m8426j(Mb9<I> mb9, YH8<? super I, ? extends O> yh8, Executor executor) {
        int i = AbstractRunnableC40728f49.f79408k;
        yh8.getClass();
        W39 w39 = new W39(mb9, yh8);
        mb9.mo9243o(w39, Hc9.m103647d(executor, w39));
        return w39;
    }

    /* renamed from: k */
    public static <I, O> Mb9<O> m8425k(Mb9<I> mb9, InterfaceC43713k69<? super I, ? extends O> interfaceC43713k69, Executor executor) {
        int i = AbstractRunnableC40728f49.f79408k;
        executor.getClass();
        N39 n39 = new N39(mb9, interfaceC43713k69);
        mb9.mo9243o(n39, Hc9.m103647d(executor, n39));
        return n39;
    }

    /* renamed from: l */
    public static <V> V m8424l(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        if (future.isDone()) {
            while (true) {
                try {
                    v = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return v;
        }
        throw new IllegalStateException(C40302eM8.m42992b("Future was expected to be done: %s", future));
    }

    /* renamed from: m */
    public static <V> void m8423m(Mb9<V> mb9, M99<? super V> m99, Executor executor) {
        m99.getClass();
        mb9.mo9243o(new RunnableC38040aa9(mb9, m99), executor);
    }
}
