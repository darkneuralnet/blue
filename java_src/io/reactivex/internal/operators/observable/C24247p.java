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
import java.util.Collection;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.observable.p */
/* loaded from: classes6.dex */
public final class C24247p<T, U extends Collection<? super T>, B> extends AbstractC24145a<T, U> {

    /* renamed from: c */
    public final InterfaceC23434B<B> f90412c;

    /* renamed from: d */
    public final Callable<U> f90413d;

    /* renamed from: io.reactivex.internal.operators.observable.p$a */
    /* loaded from: classes6.dex */
    public static final class C24248a<T, U extends Collection<? super T>, B> extends AbstractC24500d<B> {

        /* renamed from: c */
        public final C24249b<T, U, B> f90414c;

        public C24248a(C24249b<T, U, B> c24249b) {
            this.f90414c = c24249b;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90414c.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90414c.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(B b) {
            this.f90414c.m32479l();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.p$b */
    /* loaded from: classes6.dex */
    public static final class C24249b<T, U extends Collection<? super T>, B> extends AbstractC23575t<T, U, U> implements InterfaceC23465c {

        /* renamed from: h */
        public final Callable<U> f90415h;

        /* renamed from: i */
        public final InterfaceC23434B<B> f90416i;

        /* renamed from: j */
        public InterfaceC23465c f90417j;

        /* renamed from: k */
        public InterfaceC23465c f90418k;

        /* renamed from: l */
        public U f90419l;

        public C24249b(InterfaceC23436D<? super U> interfaceC23436D, Callable<U> callable, InterfaceC23434B<B> interfaceC23434B) {
            super(interfaceC23436D, new C24406a());
            this.f90415h = callable;
            this.f90416i = interfaceC23434B;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f88332e) {
                this.f88332e = true;
                this.f90418k.dispose();
                this.f90417j.dispose();
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
        public void m32479l() {
            try {
                U u = (U) C23544b.m32923e(this.f90415h.call(), "The buffer supplied is null");
                synchronized (this) {
                    U u2 = this.f90419l;
                    if (u2 == null) {
                        return;
                    }
                    this.f90419l = u;
                    m32903h(u2, false, this);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                dispose();
                this.f88330c.onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            synchronized (this) {
                U u = this.f90419l;
                if (u == null) {
                    return;
                }
                this.f90419l = null;
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
                U u = this.f90419l;
                if (u == null) {
                    return;
                }
                u.add(t);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90417j, interfaceC23465c)) {
                this.f90417j = interfaceC23465c;
                try {
                    this.f90419l = (U) C23544b.m32923e(this.f90415h.call(), "The buffer supplied is null");
                    C24248a c24248a = new C24248a(this);
                    this.f90418k = c24248a;
                    this.f88330c.onSubscribe(this);
                    if (!this.f88332e) {
                        this.f90416i.subscribe(c24248a);
                    }
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    this.f88332e = true;
                    interfaceC23465c.dispose();
                    EnumC23502e.m32987i(th, this.f88330c);
                }
            }
        }
    }

    public C24247p(InterfaceC23434B<T> interfaceC23434B, InterfaceC23434B<B> interfaceC23434B2, Callable<U> callable) {
        super(interfaceC23434B);
        this.f90412c = interfaceC23434B2;
        this.f90413d = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super U> interfaceC23436D) {
        this.f90078b.subscribe(new C24249b(new C24504h(interfaceC23436D), this.f90413d, this.f90412c));
    }
}
