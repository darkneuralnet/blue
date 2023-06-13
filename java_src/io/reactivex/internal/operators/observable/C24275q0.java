package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.schedulers.C24441p;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.q0 */
/* loaded from: classes6.dex */
public final class C24275q0 extends Observable<Long> {

    /* renamed from: b */
    public final AbstractC23437E f90501b;

    /* renamed from: c */
    public final long f90502c;

    /* renamed from: d */
    public final long f90503d;

    /* renamed from: e */
    public final TimeUnit f90504e;

    /* renamed from: io.reactivex.internal.operators.observable.q0$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC24276a extends AtomicReference<InterfaceC23465c> implements InterfaceC23465c, Runnable {
        private static final long serialVersionUID = 346773832286157679L;

        /* renamed from: b */
        public final InterfaceC23436D<? super Long> f90505b;

        /* renamed from: c */
        public long f90506c;

        public RunnableC24276a(InterfaceC23436D<? super Long> interfaceC23436D) {
            this.f90505b = interfaceC23436D;
        }

        /* renamed from: a */
        public void m32442a(InterfaceC23465c interfaceC23465c) {
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
            if (get() != EnumC23501d.DISPOSED) {
                InterfaceC23436D<? super Long> interfaceC23436D = this.f90505b;
                long j = this.f90506c;
                this.f90506c = 1 + j;
                interfaceC23436D.onNext(Long.valueOf(j));
            }
        }
    }

    public C24275q0(long j, long j2, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        this.f90502c = j;
        this.f90503d = j2;
        this.f90504e = timeUnit;
        this.f90501b = abstractC23437E;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Long> interfaceC23436D) {
        RunnableC24276a runnableC24276a = new RunnableC24276a(interfaceC23436D);
        interfaceC23436D.onSubscribe(runnableC24276a);
        AbstractC23437E abstractC23437E = this.f90501b;
        if (abstractC23437E instanceof C24441p) {
            AbstractC23437E.AbstractC23440c mo8041b = abstractC23437E.mo8041b();
            runnableC24276a.m32442a(mo8041b);
            mo8041b.m33166d(runnableC24276a, this.f90502c, this.f90503d, this.f90504e);
            return;
        }
        runnableC24276a.m32442a(abstractC23437E.mo32326f(runnableC24276a, this.f90502c, this.f90503d, this.f90504e));
    }
}
