package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.observers.AbstractC23558c;
import java.util.Iterator;
/* renamed from: io.reactivex.internal.operators.observable.g0 */
/* loaded from: classes6.dex */
public final class C24186g0<T> extends Observable<T> {

    /* renamed from: b */
    public final Iterable<? extends T> f90207b;

    /* renamed from: io.reactivex.internal.operators.observable.g0$a */
    /* loaded from: classes6.dex */
    public static final class C24187a<T> extends AbstractC23558c<T> {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90208b;

        /* renamed from: c */
        public final Iterator<? extends T> f90209c;

        /* renamed from: d */
        public volatile boolean f90210d;

        /* renamed from: e */
        public boolean f90211e;

        /* renamed from: f */
        public boolean f90212f;

        /* renamed from: g */
        public boolean f90213g;

        public C24187a(InterfaceC23436D<? super T> interfaceC23436D, Iterator<? extends T> it) {
            this.f90208b = interfaceC23436D;
            this.f90209c = it;
        }

        /* renamed from: a */
        public void m32511a() {
            while (!mo1769e()) {
                try {
                    this.f90208b.onNext(C23544b.m32923e(this.f90209c.next(), "The iterator returned a null value"));
                    if (mo1769e()) {
                        return;
                    }
                    try {
                        if (!this.f90209c.hasNext()) {
                            if (!mo1769e()) {
                                this.f90208b.onComplete();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        this.f90208b.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    C23475a.m33009b(th2);
                    this.f90208b.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            if ((i & 1) != 0) {
                this.f90211e = true;
                return 1;
            }
            return 0;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public void clear() {
            this.f90212f = true;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90210d = true;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90210d;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public boolean isEmpty() {
            return this.f90212f;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() {
            if (this.f90212f) {
                return null;
            }
            if (this.f90213g) {
                if (!this.f90209c.hasNext()) {
                    this.f90212f = true;
                    return null;
                }
            } else {
                this.f90213g = true;
            }
            return (T) C23544b.m32923e(this.f90209c.next(), "The iterator returned a null value");
        }
    }

    public C24186g0(Iterable<? extends T> iterable) {
        this.f90207b = iterable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        try {
            Iterator<? extends T> it = this.f90207b.iterator();
            try {
                if (!it.hasNext()) {
                    EnumC23502e.m32990d(interfaceC23436D);
                    return;
                }
                C24187a c24187a = new C24187a(interfaceC23436D, it);
                interfaceC23436D.onSubscribe(c24187a);
                if (!c24187a.f90211e) {
                    c24187a.m32511a();
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
