package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.observers.C24504h;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.Z0 */
/* loaded from: classes6.dex */
public final class C24140Z0<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23434B<?> f90069c;

    /* renamed from: d */
    public final boolean f90070d;

    /* renamed from: io.reactivex.internal.operators.observable.Z0$a */
    /* loaded from: classes6.dex */
    public static final class C24141a<T> extends AbstractC24143c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        /* renamed from: f */
        public final AtomicInteger f90071f;

        /* renamed from: g */
        public volatile boolean f90072g;

        public C24141a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23434B<?> interfaceC23434B) {
            super(interfaceC23436D, interfaceC23434B);
            this.f90071f = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.observable.C24140Z0.AbstractC24143c
        /* renamed from: b */
        public void mo32547b() {
            this.f90072g = true;
            if (this.f90071f.getAndIncrement() == 0) {
                m32546c();
                this.f90073b.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.C24140Z0.AbstractC24143c
        /* renamed from: g */
        public void mo32544g() {
            if (this.f90071f.getAndIncrement() == 0) {
                do {
                    boolean z = this.f90072g;
                    m32546c();
                    if (z) {
                        this.f90073b.onComplete();
                        return;
                    }
                } while (this.f90071f.decrementAndGet() != 0);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.Z0$b */
    /* loaded from: classes6.dex */
    public static final class C24142b<T> extends AbstractC24143c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public C24142b(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23434B<?> interfaceC23434B) {
            super(interfaceC23436D, interfaceC23434B);
        }

        @Override // io.reactivex.internal.operators.observable.C24140Z0.AbstractC24143c
        /* renamed from: b */
        public void mo32547b() {
            this.f90073b.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.C24140Z0.AbstractC24143c
        /* renamed from: g */
        public void mo32544g() {
            m32546c();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.Z0$c */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC24143c<T> extends AtomicReference<T> implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90073b;

        /* renamed from: c */
        public final InterfaceC23434B<?> f90074c;

        /* renamed from: d */
        public final AtomicReference<InterfaceC23465c> f90075d = new AtomicReference<>();

        /* renamed from: e */
        public InterfaceC23465c f90076e;

        public AbstractC24143c(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23434B<?> interfaceC23434B) {
            this.f90073b = interfaceC23436D;
            this.f90074c = interfaceC23434B;
        }

        /* renamed from: a */
        public void m32548a() {
            this.f90076e.dispose();
            mo32547b();
        }

        /* renamed from: b */
        public abstract void mo32547b();

        /* renamed from: c */
        public void m32546c() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f90073b.onNext(andSet);
            }
        }

        /* renamed from: d */
        public void m32545d(Throwable th) {
            this.f90076e.dispose();
            this.f90073b.onError(th);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this.f90075d);
            this.f90076e.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90075d.get() == EnumC23501d.DISPOSED;
        }

        /* renamed from: g */
        public abstract void mo32544g();

        /* renamed from: h */
        public boolean m32543h(InterfaceC23465c interfaceC23465c) {
            return EnumC23501d.m32995h(this.f90075d, interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            EnumC23501d.m33000a(this.f90075d);
            mo32547b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            EnumC23501d.m33000a(this.f90075d);
            this.f90073b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90076e, interfaceC23465c)) {
                this.f90076e = interfaceC23465c;
                this.f90073b.onSubscribe(this);
                if (this.f90075d.get() == null) {
                    this.f90074c.subscribe(new C24144d(this));
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.Z0$d */
    /* loaded from: classes6.dex */
    public static final class C24144d<T> implements InterfaceC23436D<Object> {

        /* renamed from: b */
        public final AbstractC24143c<T> f90077b;

        public C24144d(AbstractC24143c<T> abstractC24143c) {
            this.f90077b = abstractC24143c;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90077b.m32548a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90077b.m32545d(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(Object obj) {
            this.f90077b.mo32544g();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f90077b.m32543h(interfaceC23465c);
        }
    }

    public C24140Z0(InterfaceC23434B<T> interfaceC23434B, InterfaceC23434B<?> interfaceC23434B2, boolean z) {
        super(interfaceC23434B);
        this.f90069c = interfaceC23434B2;
        this.f90070d = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C24504h c24504h = new C24504h(interfaceC23436D);
        if (this.f90070d) {
            this.f90078b.subscribe(new C24141a(c24504h, this.f90069c));
        } else {
            this.f90078b.subscribe(new C24142b(c24504h, this.f90069c));
        }
    }
}
