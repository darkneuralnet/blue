package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.observers.AbstractC24500d;
import io.reactivex.observers.C24504h;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.D */
/* loaded from: classes6.dex */
public final class C23983D<T, U> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<U>> f89533c;

    /* renamed from: io.reactivex.internal.operators.observable.D$a */
    /* loaded from: classes6.dex */
    public static final class C23984a<T, U> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89534b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<U>> f89535c;

        /* renamed from: d */
        public InterfaceC23465c f89536d;

        /* renamed from: e */
        public final AtomicReference<InterfaceC23465c> f89537e = new AtomicReference<>();

        /* renamed from: f */
        public volatile long f89538f;

        /* renamed from: g */
        public boolean f89539g;

        /* renamed from: io.reactivex.internal.operators.observable.D$a$a */
        /* loaded from: classes6.dex */
        public static final class C23985a<T, U> extends AbstractC24500d<U> {

            /* renamed from: c */
            public final C23984a<T, U> f89540c;

            /* renamed from: d */
            public final long f89541d;

            /* renamed from: e */
            public final T f89542e;

            /* renamed from: f */
            public boolean f89543f;

            /* renamed from: g */
            public final AtomicBoolean f89544g = new AtomicBoolean();

            public C23985a(C23984a<T, U> c23984a, long j, T t) {
                this.f89540c = c23984a;
                this.f89541d = j;
                this.f89542e = t;
            }

            /* renamed from: b */
            public void m32666b() {
                if (this.f89544g.compareAndSet(false, true)) {
                    this.f89540c.m32667a(this.f89541d, this.f89542e);
                }
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onComplete() {
                if (this.f89543f) {
                    return;
                }
                this.f89543f = true;
                m32666b();
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onError(Throwable th) {
                if (this.f89543f) {
                    C24508a.m31988u(th);
                    return;
                }
                this.f89543f = true;
                this.f89540c.onError(th);
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onNext(U u) {
                if (this.f89543f) {
                    return;
                }
                this.f89543f = true;
                dispose();
                m32666b();
            }
        }

        public C23984a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23492o<? super T, ? extends InterfaceC23434B<U>> interfaceC23492o) {
            this.f89534b = interfaceC23436D;
            this.f89535c = interfaceC23492o;
        }

        /* renamed from: a */
        public void m32667a(long j, T t) {
            if (j == this.f89538f) {
                this.f89534b.onNext(t);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89536d.dispose();
            EnumC23501d.m33000a(this.f89537e);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89536d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f89539g) {
                return;
            }
            this.f89539g = true;
            InterfaceC23465c interfaceC23465c = this.f89537e.get();
            if (interfaceC23465c != EnumC23501d.DISPOSED) {
                C23985a c23985a = (C23985a) interfaceC23465c;
                if (c23985a != null) {
                    c23985a.m32666b();
                }
                EnumC23501d.m33000a(this.f89537e);
                this.f89534b.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            EnumC23501d.m33000a(this.f89537e);
            this.f89534b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f89539g) {
                return;
            }
            long j = this.f89538f + 1;
            this.f89538f = j;
            InterfaceC23465c interfaceC23465c = this.f89537e.get();
            if (interfaceC23465c != null) {
                interfaceC23465c.dispose();
            }
            try {
                InterfaceC23434B interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f89535c.apply(t), "The ObservableSource supplied is null");
                C23985a c23985a = new C23985a(this, j, t);
                if (C42482i24.m35337a(this.f89537e, interfaceC23465c, c23985a)) {
                    interfaceC23434B.subscribe(c23985a);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                dispose();
                this.f89534b.onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89536d, interfaceC23465c)) {
                this.f89536d = interfaceC23465c;
                this.f89534b.onSubscribe(this);
            }
        }
    }

    public C23983D(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super T, ? extends InterfaceC23434B<U>> interfaceC23492o) {
        super(interfaceC23434B);
        this.f89533c = interfaceC23492o;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C23984a(new C24504h(interfaceC23436D), this.f89533c));
    }
}
