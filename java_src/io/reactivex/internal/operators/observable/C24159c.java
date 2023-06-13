package io.reactivex.internal.operators.observable;

import io.reactivex.C24576w;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.internal.util.C24469e;
import io.reactivex.internal.util.C24475k;
import io.reactivex.observers.AbstractC24500d;
import io.reactivex.plugins.C24508a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.c */
/* loaded from: classes6.dex */
public final class C24159c<T> implements Iterable<T> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f90120b;

    /* renamed from: io.reactivex.internal.operators.observable.c$a */
    /* loaded from: classes6.dex */
    public static final class C24160a<T> extends AbstractC24500d<C24576w<T>> implements Iterator<T> {

        /* renamed from: c */
        public C24576w<T> f90121c;

        /* renamed from: d */
        public final Semaphore f90122d = new Semaphore(0);

        /* renamed from: e */
        public final AtomicReference<C24576w<T>> f90123e = new AtomicReference<>();

        @Override // io.reactivex.InterfaceC23436D
        /* renamed from: b */
        public void onNext(C24576w<T> c24576w) {
            boolean z;
            if (this.f90123e.getAndSet(c24576w) == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f90122d.release();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            C24576w<T> c24576w = this.f90121c;
            if (c24576w != null && c24576w.m31857g()) {
                throw C24475k.m32256e(this.f90121c.m31860d());
            }
            if (this.f90121c == null) {
                try {
                    C24469e.m32268b();
                    this.f90122d.acquire();
                    C24576w<T> andSet = this.f90123e.getAndSet(null);
                    this.f90121c = andSet;
                    if (andSet.m31857g()) {
                        throw C24475k.m32256e(andSet.m31860d());
                    }
                } catch (InterruptedException e) {
                    dispose();
                    this.f90121c = C24576w.m31862b(e);
                    throw C24475k.m32256e(e);
                }
            }
            return this.f90121c.m31856h();
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T m31859e = this.f90121c.m31859e();
                this.f90121c = null;
                return m31859e;
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            C24508a.m31988u(th);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    public C24159c(InterfaceC23434B<T> interfaceC23434B) {
        this.f90120b = interfaceC23434B;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C24160a c24160a = new C24160a();
        Observable.wrap(this.f90120b).materialize().subscribe(c24160a);
        return c24160a;
    }
}
