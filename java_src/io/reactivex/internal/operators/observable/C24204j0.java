package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC24489j;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.observable.j0 */
/* loaded from: classes6.dex */
public final class C24204j0<T, S> extends Observable<T> {

    /* renamed from: b */
    public final Callable<S> f90254b;

    /* renamed from: c */
    public final InterfaceC23480c<S, InterfaceC24489j<T>, S> f90255c;

    /* renamed from: d */
    public final InterfaceC23484g<? super S> f90256d;

    /* renamed from: io.reactivex.internal.operators.observable.j0$a */
    /* loaded from: classes6.dex */
    public static final class C24205a<T, S> implements InterfaceC24489j<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90257b;

        /* renamed from: c */
        public final InterfaceC23480c<S, ? super InterfaceC24489j<T>, S> f90258c;

        /* renamed from: d */
        public final InterfaceC23484g<? super S> f90259d;

        /* renamed from: e */
        public S f90260e;

        /* renamed from: f */
        public volatile boolean f90261f;

        /* renamed from: g */
        public boolean f90262g;

        /* renamed from: h */
        public boolean f90263h;

        public C24205a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23480c<S, ? super InterfaceC24489j<T>, S> interfaceC23480c, InterfaceC23484g<? super S> interfaceC23484g, S s) {
            this.f90257b = interfaceC23436D;
            this.f90258c = interfaceC23480c;
            this.f90259d = interfaceC23484g;
            this.f90260e = s;
        }

        /* renamed from: d */
        public final void m32507d(S s) {
            try {
                this.f90259d.accept(s);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                C24508a.m31988u(th);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90261f = true;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90261f;
        }

        /* renamed from: g */
        public void m32506g() {
            S s = this.f90260e;
            if (this.f90261f) {
                this.f90260e = null;
                m32507d(s);
                return;
            }
            InterfaceC23480c<S, ? super InterfaceC24489j<T>, S> interfaceC23480c = this.f90258c;
            while (!this.f90261f) {
                this.f90263h = false;
                try {
                    s = interfaceC23480c.apply(s, this);
                    if (this.f90262g) {
                        this.f90261f = true;
                        this.f90260e = null;
                        m32507d(s);
                        return;
                    }
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    this.f90260e = null;
                    this.f90261f = true;
                    onError(th);
                    m32507d(s);
                    return;
                }
            }
            this.f90260e = null;
            m32507d(s);
        }

        @Override // io.reactivex.InterfaceC24489j
        public void onComplete() {
            if (!this.f90262g) {
                this.f90262g = true;
                this.f90257b.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC24489j
        public void onError(Throwable th) {
            if (this.f90262g) {
                C24508a.m31988u(th);
                return;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f90262g = true;
            this.f90257b.onError(th);
        }
    }

    public C24204j0(Callable<S> callable, InterfaceC23480c<S, InterfaceC24489j<T>, S> interfaceC23480c, InterfaceC23484g<? super S> interfaceC23484g) {
        this.f90254b = callable;
        this.f90255c = interfaceC23480c;
        this.f90256d = interfaceC23484g;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        try {
            C24205a c24205a = new C24205a(interfaceC23436D, this.f90255c, this.f90256d, this.f90254b.call());
            interfaceC23436D.onSubscribe(c24205a);
            c24205a.m32506g();
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC23502e.m32987i(th, interfaceC23436D);
        }
    }
}
