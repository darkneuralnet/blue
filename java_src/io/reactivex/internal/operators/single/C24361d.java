package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.C23505h;
import java.util.concurrent.TimeUnit;
/* renamed from: io.reactivex.internal.operators.single.d */
/* loaded from: classes6.dex */
public final class C24361d<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23447K<? extends T> f90802b;

    /* renamed from: c */
    public final long f90803c;

    /* renamed from: d */
    public final TimeUnit f90804d;

    /* renamed from: e */
    public final AbstractC23437E f90805e;

    /* renamed from: f */
    public final boolean f90806f;

    /* renamed from: io.reactivex.internal.operators.single.d$a */
    /* loaded from: classes6.dex */
    public final class C24362a implements InterfaceC23445I<T> {

        /* renamed from: b */
        public final C23505h f90807b;

        /* renamed from: c */
        public final InterfaceC23445I<? super T> f90808c;

        /* renamed from: io.reactivex.internal.operators.single.d$a$a */
        /* loaded from: classes6.dex */
        public final class RunnableC24363a implements Runnable {

            /* renamed from: b */
            public final Throwable f90810b;

            public RunnableC24363a(Throwable th) {
                this.f90810b = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                C24362a.this.f90808c.onError(this.f90810b);
            }
        }

        /* renamed from: io.reactivex.internal.operators.single.d$a$b */
        /* loaded from: classes6.dex */
        public final class RunnableC24364b implements Runnable {

            /* renamed from: b */
            public final T f90812b;

            public RunnableC24364b(T t) {
                this.f90812b = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                C24362a.this.f90808c.onSuccess((T) this.f90812b);
            }
        }

        public C24362a(C23505h c23505h, InterfaceC23445I<? super T> interfaceC23445I) {
            this.f90807b = c23505h;
            this.f90808c = interfaceC23445I;
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            C23505h c23505h = this.f90807b;
            AbstractC23437E abstractC23437E = C24361d.this.f90805e;
            RunnableC24363a runnableC24363a = new RunnableC24363a(th);
            C24361d c24361d = C24361d.this;
            c23505h.m32981a(abstractC23437E.mo32323e(runnableC24363a, c24361d.f90806f ? c24361d.f90803c : 0L, c24361d.f90804d));
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f90807b.m32981a(interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            C23505h c23505h = this.f90807b;
            AbstractC23437E abstractC23437E = C24361d.this.f90805e;
            RunnableC24364b runnableC24364b = new RunnableC24364b(t);
            C24361d c24361d = C24361d.this;
            c23505h.m32981a(abstractC23437E.mo32323e(runnableC24364b, c24361d.f90803c, c24361d.f90804d));
        }
    }

    public C24361d(InterfaceC23447K<? extends T> interfaceC23447K, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z) {
        this.f90802b = interfaceC23447K;
        this.f90803c = j;
        this.f90804d = timeUnit;
        this.f90805e = abstractC23437E;
        this.f90806f = z;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        C23505h c23505h = new C23505h();
        interfaceC23445I.onSubscribe(c23505h);
        this.f90802b.mo33096a(new C24362a(c23505h, interfaceC23445I));
    }
}
