package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.observers.C24504h;
import java.util.concurrent.TimeUnit;
/* renamed from: io.reactivex.internal.operators.observable.G */
/* loaded from: classes6.dex */
public final class C24002G<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final long f89598c;

    /* renamed from: d */
    public final TimeUnit f89599d;

    /* renamed from: e */
    public final AbstractC23437E f89600e;

    /* renamed from: f */
    public final boolean f89601f;

    /* renamed from: io.reactivex.internal.operators.observable.G$a */
    /* loaded from: classes6.dex */
    public static final class C24003a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89602b;

        /* renamed from: c */
        public final long f89603c;

        /* renamed from: d */
        public final TimeUnit f89604d;

        /* renamed from: e */
        public final AbstractC23437E.AbstractC23440c f89605e;

        /* renamed from: f */
        public final boolean f89606f;

        /* renamed from: g */
        public InterfaceC23465c f89607g;

        /* renamed from: io.reactivex.internal.operators.observable.G$a$a */
        /* loaded from: classes6.dex */
        public final class RunnableC24004a implements Runnable {
            public RunnableC24004a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C24003a.this.f89602b.onComplete();
                } finally {
                    C24003a.this.f89605e.dispose();
                }
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.G$a$b */
        /* loaded from: classes6.dex */
        public final class RunnableC24005b implements Runnable {

            /* renamed from: b */
            public final Throwable f89609b;

            public RunnableC24005b(Throwable th) {
                this.f89609b = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C24003a.this.f89602b.onError(this.f89609b);
                } finally {
                    C24003a.this.f89605e.dispose();
                }
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.G$a$c */
        /* loaded from: classes6.dex */
        public final class RunnableC24006c implements Runnable {

            /* renamed from: b */
            public final T f89611b;

            public RunnableC24006c(T t) {
                this.f89611b = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                C24003a.this.f89602b.onNext((T) this.f89611b);
            }
        }

        public C24003a(InterfaceC23436D<? super T> interfaceC23436D, long j, TimeUnit timeUnit, AbstractC23437E.AbstractC23440c abstractC23440c, boolean z) {
            this.f89602b = interfaceC23436D;
            this.f89603c = j;
            this.f89604d = timeUnit;
            this.f89605e = abstractC23440c;
            this.f89606f = z;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89607g.dispose();
            this.f89605e.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89605e.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89605e.mo32319c(new RunnableC24004a(), this.f89603c, this.f89604d);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f89605e.mo32319c(new RunnableC24005b(th), this.f89606f ? this.f89603c : 0L, this.f89604d);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f89605e.mo32319c(new RunnableC24006c(t), this.f89603c, this.f89604d);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89607g, interfaceC23465c)) {
                this.f89607g = interfaceC23465c;
                this.f89602b.onSubscribe(this);
            }
        }
    }

    public C24002G(InterfaceC23434B<T> interfaceC23434B, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z) {
        super(interfaceC23434B);
        this.f89598c = j;
        this.f89599d = timeUnit;
        this.f89600e = abstractC23437E;
        this.f89601f = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C24504h c24504h;
        if (this.f89601f) {
            c24504h = interfaceC23436D;
        } else {
            c24504h = new C24504h(interfaceC23436D);
        }
        this.f90078b.subscribe(new C24003a(c24504h, this.f89598c, this.f89599d, this.f89600e.mo8041b(), this.f89601f));
    }
}
