package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.schedulers.C24441p;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.r0 */
/* loaded from: classes6.dex */
public final class C24282r0 extends Observable<Long> {

    /* renamed from: b */
    public final AbstractC23437E f90531b;

    /* renamed from: c */
    public final long f90532c;

    /* renamed from: d */
    public final long f90533d;

    /* renamed from: e */
    public final long f90534e;

    /* renamed from: f */
    public final long f90535f;

    /* renamed from: g */
    public final TimeUnit f90536g;

    /* renamed from: io.reactivex.internal.operators.observable.r0$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC24283a extends AtomicReference<InterfaceC23465c> implements InterfaceC23465c, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;

        /* renamed from: b */
        public final InterfaceC23436D<? super Long> f90537b;

        /* renamed from: c */
        public final long f90538c;

        /* renamed from: d */
        public long f90539d;

        public RunnableC24283a(InterfaceC23436D<? super Long> interfaceC23436D, long j, long j2) {
            this.f90537b = interfaceC23436D;
            this.f90539d = j;
            this.f90538c = j2;
        }

        /* renamed from: a */
        public void m32438a(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get() == EnumC23501d.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!mo1769e()) {
                long j = this.f90539d;
                this.f90537b.onNext(Long.valueOf(j));
                if (j == this.f90538c) {
                    EnumC23501d.m33000a(this);
                    this.f90537b.onComplete();
                    return;
                }
                this.f90539d = j + 1;
            }
        }
    }

    public C24282r0(long j, long j2, long j3, long j4, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        this.f90534e = j3;
        this.f90535f = j4;
        this.f90536g = timeUnit;
        this.f90531b = abstractC23437E;
        this.f90532c = j;
        this.f90533d = j2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Long> interfaceC23436D) {
        RunnableC24283a runnableC24283a = new RunnableC24283a(interfaceC23436D, this.f90532c, this.f90533d);
        interfaceC23436D.onSubscribe(runnableC24283a);
        AbstractC23437E abstractC23437E = this.f90531b;
        if (abstractC23437E instanceof C24441p) {
            AbstractC23437E.AbstractC23440c mo8041b = abstractC23437E.mo8041b();
            runnableC24283a.m32438a(mo8041b);
            mo8041b.m33166d(runnableC24283a, this.f90534e, this.f90535f, this.f90536g);
            return;
        }
        runnableC24283a.m32438a(abstractC23437E.mo32326f(runnableC24283a, this.f90534e, this.f90535f, this.f90536g));
    }
}
