package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: l89 */
/* loaded from: classes6.dex */
public final class C44326l89 {

    /* renamed from: a */
    public final AtomicReference<Mb9<Void>> f95636a = new AtomicReference<>(C40439eb9.f78601c);

    /* renamed from: b */
    public C39583d89 f95637b = new C39583d89(null);

    private C44326l89() {
    }

    /* renamed from: c */
    public static C44326l89 m27739c() {
        return new C44326l89();
    }

    /* renamed from: d */
    public final <T> Mb9<T> m27738d(InterfaceC38952c69<T> interfaceC38952c69, Executor executor) {
        executor.getClass();
        W79 w79 = new W79(executor, this, null);
        A79 a79 = new A79(this, w79, interfaceC38952c69);
        Md9 m95101D = Md9.m95101D();
        Mb9<Void> andSet = this.f95636a.getAndSet(m95101D);
        RunnableFutureC44027ke9 runnableFutureC44027ke9 = new RunnableFutureC44027ke9(a79);
        andSet.mo9243o(runnableFutureC44027ke9, w79);
        Mb9<T> m8428h = C50508va9.m8428h(runnableFutureC44027ke9);
        I79 i79 = new I79(this, runnableFutureC44027ke9, m95101D, andSet, m8428h, w79);
        EnumC44316l79 enumC44316l79 = EnumC44316l79.INSTANCE;
        m8428h.mo9243o(i79, enumC44316l79);
        runnableFutureC44027ke9.mo9243o(i79, enumC44316l79);
        return m8428h;
    }
}
