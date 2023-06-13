package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.observers.AbstractC23575t;
import io.reactivex.internal.queue.C24406a;
import io.reactivex.internal.util.C24487s;
import io.reactivex.observers.AbstractC24500d;
import io.reactivex.observers.C24504h;
import io.reactivex.plugins.C24508a;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.o */
/* loaded from: classes6.dex */
public final class C24240o<T, U extends Collection<? super T>, B> extends AbstractC24145a<T, U> {

    /* renamed from: c */
    public final Callable<? extends InterfaceC23434B<B>> f90395c;

    /* renamed from: d */
    public final Callable<U> f90396d;

    /* renamed from: io.reactivex.internal.operators.observable.o$a */
    /* loaded from: classes6.dex */
    public static final class C24241a<T, U extends Collection<? super T>, B> extends AbstractC24500d<B> {

        /* renamed from: c */
        public final C24242b<T, U, B> f90397c;

        /* renamed from: d */
        public boolean f90398d;

        public C24241a(C24242b<T, U, B> c24242b) {
            this.f90397c = c24242b;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f90398d) {
                return;
            }
            this.f90398d = true;
            this.f90397c.m32481m();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90398d) {
                C24508a.m31988u(th);
                return;
            }
            this.f90398d = true;
            this.f90397c.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(B b) {
            if (this.f90398d) {
                return;
            }
            this.f90398d = true;
            dispose();
            this.f90397c.m32481m();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.o$b */
    /* loaded from: classes6.dex */
    public static final class C24242b<T, U extends Collection<? super T>, B> extends AbstractC23575t<T, U, U> implements InterfaceC23465c {

        /* renamed from: h */
        public final Callable<U> f90399h;

        /* renamed from: i */
        public final Callable<? extends InterfaceC23434B<B>> f90400i;

        /* renamed from: j */
        public InterfaceC23465c f90401j;

        /* renamed from: k */
        public final AtomicReference<InterfaceC23465c> f90402k;

        /* renamed from: l */
        public U f90403l;

        public C24242b(InterfaceC23436D<? super U> interfaceC23436D, Callable<U> callable, Callable<? extends InterfaceC23434B<B>> callable2) {
            super(interfaceC23436D, new C24406a());
            this.f90402k = new AtomicReference<>();
            this.f90399h = callable;
            this.f90400i = callable2;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f88332e) {
                this.f88332e = true;
                this.f90401j.dispose();
                m32482l();
                if (m32905a()) {
                    this.f88331d.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88332e;
        }

        @Override // io.reactivex.internal.observers.AbstractC23575t, io.reactivex.internal.util.InterfaceC24483o
        /* renamed from: k */
        public void mo32232d(InterfaceC23436D<? super U> interfaceC23436D, U u) {
            this.f88330c.onNext(u);
        }

        /* renamed from: l */
        public void m32482l() {
            EnumC23501d.m33000a(this.f90402k);
        }

        /* renamed from: m */
        public void m32481m() {
            try {
                U u = (U) C23544b.m32923e(this.f90399h.call(), "The buffer supplied is null");
                try {
                    InterfaceC23434B interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f90400i.call(), "The boundary ObservableSource supplied is null");
                    C24241a c24241a = new C24241a(this);
                    if (EnumC23501d.m32998c(this.f90402k, c24241a)) {
                        synchronized (this) {
                            U u2 = this.f90403l;
                            if (u2 == null) {
                                return;
                            }
                            this.f90403l = u;
                            interfaceC23434B.subscribe(c24241a);
                            m32903h(u2, false, this);
                        }
                    }
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    this.f88332e = true;
                    this.f90401j.dispose();
                    this.f88330c.onError(th);
                }
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                dispose();
                this.f88330c.onError(th2);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            synchronized (this) {
                U u = this.f90403l;
                if (u == null) {
                    return;
                }
                this.f90403l = null;
                this.f88331d.offer(u);
                this.f88333f = true;
                if (m32905a()) {
                    C24487s.m32213d(this.f88331d, this.f88330c, false, this, this);
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            dispose();
            this.f88330c.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            synchronized (this) {
                U u = this.f90403l;
                if (u == null) {
                    return;
                }
                u.add(t);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90401j, interfaceC23465c)) {
                this.f90401j = interfaceC23465c;
                InterfaceC23436D<? super V> interfaceC23436D = this.f88330c;
                try {
                    this.f90403l = (U) C23544b.m32923e(this.f90399h.call(), "The buffer supplied is null");
                    try {
                        InterfaceC23434B interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f90400i.call(), "The boundary ObservableSource supplied is null");
                        C24241a c24241a = new C24241a(this);
                        this.f90402k.set(c24241a);
                        interfaceC23436D.onSubscribe(this);
                        if (!this.f88332e) {
                            interfaceC23434B.subscribe(c24241a);
                        }
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        this.f88332e = true;
                        interfaceC23465c.dispose();
                        EnumC23502e.m32987i(th, interfaceC23436D);
                    }
                } catch (Throwable th2) {
                    C23475a.m33009b(th2);
                    this.f88332e = true;
                    interfaceC23465c.dispose();
                    EnumC23502e.m32987i(th2, interfaceC23436D);
                }
            }
        }
    }

    public C24240o(InterfaceC23434B<T> interfaceC23434B, Callable<? extends InterfaceC23434B<B>> callable, Callable<U> callable2) {
        super(interfaceC23434B);
        this.f90395c = callable;
        this.f90396d = callable2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super U> interfaceC23436D) {
        this.f90078b.subscribe(new C24242b(new C24504h(interfaceC23436D), this.f90396d, this.f90395c));
    }
}
