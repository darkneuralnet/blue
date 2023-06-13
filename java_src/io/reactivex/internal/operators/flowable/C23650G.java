package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC24490k;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.schedulers.C24441p;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.flowable.G */
/* loaded from: classes6.dex */
public final class C23650G extends AbstractC24490k<Long> {

    /* renamed from: c */
    public final AbstractC23437E f88480c;

    /* renamed from: d */
    public final long f88481d;

    /* renamed from: e */
    public final long f88482e;

    /* renamed from: f */
    public final TimeUnit f88483f;

    /* renamed from: io.reactivex.internal.operators.flowable.G$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC23651a extends AtomicLong implements InterfaceC46292oT5, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super Long> f88484b;

        /* renamed from: c */
        public long f88485c;

        /* renamed from: d */
        public final AtomicReference<InterfaceC23465c> f88486d = new AtomicReference<>();

        public RunnableC23651a(InterfaceC42141hT5<? super Long> interfaceC42141hT5) {
            this.f88484b = interfaceC42141hT5;
        }

        /* renamed from: a */
        public void m32888a(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this.f88486d, interfaceC23465c);
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            EnumC23501d.m33000a(this.f88486d);
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32274a(this, j);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f88486d.get() != EnumC23501d.DISPOSED) {
                if (get() != 0) {
                    InterfaceC42141hT5<? super Long> interfaceC42141hT5 = this.f88484b;
                    long j = this.f88485c;
                    this.f88485c = j + 1;
                    interfaceC42141hT5.onNext(Long.valueOf(j));
                    C24468d.m32271d(this, 1L);
                    return;
                }
                InterfaceC42141hT5<? super Long> interfaceC42141hT52 = this.f88484b;
                interfaceC42141hT52.onError(new MissingBackpressureException("Can't deliver value " + this.f88485c + " due to lack of requests"));
                EnumC23501d.m33000a(this.f88486d);
            }
        }
    }

    public C23650G(long j, long j2, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        this.f88481d = j;
        this.f88482e = j2;
        this.f88483f = timeUnit;
        this.f88480c = abstractC23437E;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super Long> interfaceC42141hT5) {
        RunnableC23651a runnableC23651a = new RunnableC23651a(interfaceC42141hT5);
        interfaceC42141hT5.mo31867a(runnableC23651a);
        AbstractC23437E abstractC23437E = this.f88480c;
        if (abstractC23437E instanceof C24441p) {
            AbstractC23437E.AbstractC23440c mo8041b = abstractC23437E.mo8041b();
            runnableC23651a.m32888a(mo8041b);
            mo8041b.m33166d(runnableC23651a, this.f88481d, this.f88482e, this.f88483f);
            return;
        }
        runnableC23651a.m32888a(abstractC23437E.mo32326f(runnableC23651a, this.f88481d, this.f88482e, this.f88483f));
    }
}
