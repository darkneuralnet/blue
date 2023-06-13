package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.util.C24469e;
import io.reactivex.internal.util.C24475k;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* renamed from: io.reactivex.internal.operators.observable.b */
/* loaded from: classes6.dex */
public final class C24152b<T> implements Iterable<T> {

    /* renamed from: b */
    public final InterfaceC23434B<? extends T> f90095b;

    /* renamed from: c */
    public final int f90096c;

    /* renamed from: io.reactivex.internal.operators.observable.b$a */
    /* loaded from: classes6.dex */
    public static final class C24153a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<T>, Iterator<T>, InterfaceC23465c {
        private static final long serialVersionUID = 6695226475494099826L;

        /* renamed from: b */
        public final C24409c<T> f90097b;

        /* renamed from: c */
        public final Lock f90098c;

        /* renamed from: d */
        public final Condition f90099d;

        /* renamed from: e */
        public volatile boolean f90100e;

        /* renamed from: f */
        public volatile Throwable f90101f;

        public C24153a(int i) {
            this.f90097b = new C24409c<>(i);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f90098c = reentrantLock;
            this.f90099d = reentrantLock.newCondition();
        }

        /* renamed from: a */
        public void m32533a() {
            this.f90098c.lock();
            try {
                this.f90099d.signalAll();
            } finally {
                this.f90098c.unlock();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
            m32533a();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!mo1769e()) {
                boolean z = this.f90100e;
                boolean isEmpty = this.f90097b.isEmpty();
                if (z) {
                    Throwable th = this.f90101f;
                    if (th == null) {
                        if (isEmpty) {
                            return false;
                        }
                    } else {
                        throw C24475k.m32256e(th);
                    }
                }
                if (isEmpty) {
                    try {
                        C24469e.m32268b();
                        this.f90098c.lock();
                        while (!this.f90100e && this.f90097b.isEmpty() && !mo1769e()) {
                            this.f90099d.await();
                        }
                        this.f90098c.unlock();
                    } catch (InterruptedException e) {
                        EnumC23501d.m33000a(this);
                        m32533a();
                        throw C24475k.m32256e(e);
                    }
                } else {
                    return true;
                }
            }
            Throwable th2 = this.f90101f;
            if (th2 == null) {
                return false;
            }
            throw C24475k.m32256e(th2);
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                return this.f90097b.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90100e = true;
            m32533a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90101f = th;
            this.f90100e = true;
            m32533a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f90097b.offer(t);
            m32533a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public C24152b(InterfaceC23434B<? extends T> interfaceC23434B, int i) {
        this.f90095b = interfaceC23434B;
        this.f90096c = i;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C24153a c24153a = new C24153a(this.f90096c);
        this.f90095b.subscribe(c24153a);
        return c24153a;
    }
}
