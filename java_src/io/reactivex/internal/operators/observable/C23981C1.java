package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.C1 */
/* loaded from: classes6.dex */
public final class C23981C1 extends Observable<Long> {

    /* renamed from: b */
    public final AbstractC23437E f89529b;

    /* renamed from: c */
    public final long f89530c;

    /* renamed from: d */
    public final TimeUnit f89531d;

    /* renamed from: io.reactivex.internal.operators.observable.C1$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC23982a extends AtomicReference<InterfaceC23465c> implements InterfaceC23465c, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: b */
        public final InterfaceC23436D<? super Long> f89532b;

        public RunnableC23982a(InterfaceC23436D<? super Long> interfaceC23436D) {
            this.f89532b = interfaceC23436D;
        }

        /* renamed from: a */
        public void m32668a(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32994i(this, interfaceC23465c);
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
                this.f89532b.onNext(0L);
                lazySet(EnumC23502e.INSTANCE);
                this.f89532b.onComplete();
            }
        }
    }

    public C23981C1(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        this.f89530c = j;
        this.f89531d = timeUnit;
        this.f89529b = abstractC23437E;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Long> interfaceC23436D) {
        RunnableC23982a runnableC23982a = new RunnableC23982a(interfaceC23436D);
        interfaceC23436D.onSubscribe(runnableC23982a);
        runnableC23982a.m32668a(this.f89529b.mo32323e(runnableC23982a, this.f89530c, this.f89531d));
    }
}
