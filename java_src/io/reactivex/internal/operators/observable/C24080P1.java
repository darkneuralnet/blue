package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.plugins.C24508a;
import java.util.Iterator;
/* renamed from: io.reactivex.internal.operators.observable.P1 */
/* loaded from: classes6.dex */
public final class C24080P1<T, U, V> extends Observable<V> {

    /* renamed from: b */
    public final Observable<? extends T> f89876b;

    /* renamed from: c */
    public final Iterable<U> f89877c;

    /* renamed from: d */
    public final InterfaceC23480c<? super T, ? super U, ? extends V> f89878d;

    /* renamed from: io.reactivex.internal.operators.observable.P1$a */
    /* loaded from: classes6.dex */
    public static final class C24081a<T, U, V> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super V> f89879b;

        /* renamed from: c */
        public final Iterator<U> f89880c;

        /* renamed from: d */
        public final InterfaceC23480c<? super T, ? super U, ? extends V> f89881d;

        /* renamed from: e */
        public InterfaceC23465c f89882e;

        /* renamed from: f */
        public boolean f89883f;

        public C24081a(InterfaceC23436D<? super V> interfaceC23436D, Iterator<U> it, InterfaceC23480c<? super T, ? super U, ? extends V> interfaceC23480c) {
            this.f89879b = interfaceC23436D;
            this.f89880c = it;
            this.f89881d = interfaceC23480c;
        }

        /* renamed from: a */
        public void m32612a(Throwable th) {
            this.f89883f = true;
            this.f89882e.dispose();
            this.f89879b.onError(th);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89882e.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89882e.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f89883f) {
                return;
            }
            this.f89883f = true;
            this.f89879b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89883f) {
                C24508a.m31988u(th);
                return;
            }
            this.f89883f = true;
            this.f89879b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f89883f) {
                return;
            }
            try {
                try {
                    this.f89879b.onNext(C23544b.m32923e(this.f89881d.apply(t, C23544b.m32923e(this.f89880c.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (!this.f89880c.hasNext()) {
                            this.f89883f = true;
                            this.f89882e.dispose();
                            this.f89879b.onComplete();
                        }
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        m32612a(th);
                    }
                } catch (Throwable th2) {
                    C23475a.m33009b(th2);
                    m32612a(th2);
                }
            } catch (Throwable th3) {
                C23475a.m33009b(th3);
                m32612a(th3);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89882e, interfaceC23465c)) {
                this.f89882e = interfaceC23465c;
                this.f89879b.onSubscribe(this);
            }
        }
    }

    public C24080P1(Observable<? extends T> observable, Iterable<U> iterable, InterfaceC23480c<? super T, ? super U, ? extends V> interfaceC23480c) {
        this.f89876b = observable;
        this.f89877c = iterable;
        this.f89878d = interfaceC23480c;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super V> interfaceC23436D) {
        try {
            Iterator it = (Iterator) C23544b.m32923e(this.f89877c.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    EnumC23502e.m32990d(interfaceC23436D);
                } else {
                    this.f89876b.subscribe(new C24081a(interfaceC23436D, it, this.f89878d));
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                EnumC23502e.m32987i(th, interfaceC23436D);
            }
        } catch (Throwable th2) {
            C23475a.m33009b(th2);
            EnumC23502e.m32987i(th2, interfaceC23436D);
        }
    }
}
