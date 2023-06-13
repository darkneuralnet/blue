package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC24490k;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.subscriptions.EnumC24463g;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.flowable.r0 */
/* loaded from: classes6.dex */
public final class C23795r0 extends AbstractC24490k<Long> {

    /* renamed from: c */
    public final AbstractC23437E f88973c;

    /* renamed from: d */
    public final long f88974d;

    /* renamed from: e */
    public final TimeUnit f88975e;

    /* renamed from: io.reactivex.internal.operators.flowable.r0$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC23796a extends AtomicReference<InterfaceC23465c> implements InterfaceC46292oT5, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super Long> f88976b;

        /* renamed from: c */
        public volatile boolean f88977c;

        public RunnableC23796a(InterfaceC42141hT5<? super Long> interfaceC42141hT5) {
            this.f88976b = interfaceC42141hT5;
        }

        /* renamed from: a */
        public void m32790a(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32994i(this, interfaceC23465c);
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            EnumC23501d.m33000a(this);
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                this.f88977c = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != EnumC23501d.DISPOSED) {
                if (this.f88977c) {
                    this.f88976b.onNext(0L);
                    lazySet(EnumC23502e.INSTANCE);
                    this.f88976b.onComplete();
                    return;
                }
                lazySet(EnumC23502e.INSTANCE);
                this.f88976b.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
            }
        }
    }

    public C23795r0(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        this.f88974d = j;
        this.f88975e = timeUnit;
        this.f88973c = abstractC23437E;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super Long> interfaceC42141hT5) {
        RunnableC23796a runnableC23796a = new RunnableC23796a(interfaceC42141hT5);
        interfaceC42141hT5.mo31867a(runnableC23796a);
        runnableC23796a.m32790a(this.f88973c.mo32323e(runnableC23796a, this.f88974d, this.f88975e));
    }
}
