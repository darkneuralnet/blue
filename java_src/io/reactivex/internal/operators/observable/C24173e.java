package io.reactivex.internal.operators.observable;

import io.reactivex.C24576w;
import io.reactivex.InterfaceC23434B;
import io.reactivex.internal.util.C24469e;
import io.reactivex.internal.util.C24475k;
import io.reactivex.observers.AbstractC24500d;
import io.reactivex.plugins.C24508a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.operators.observable.e */
/* loaded from: classes6.dex */
public final class C24173e<T> implements Iterable<T> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f90164b;

    /* renamed from: io.reactivex.internal.operators.observable.e$a */
    /* loaded from: classes6.dex */
    public static final class C24174a<T> implements Iterator<T> {

        /* renamed from: b */
        public final C24175b<T> f90165b;

        /* renamed from: c */
        public final InterfaceC23434B<T> f90166c;

        /* renamed from: d */
        public T f90167d;

        /* renamed from: e */
        public boolean f90168e = true;

        /* renamed from: f */
        public boolean f90169f = true;

        /* renamed from: g */
        public Throwable f90170g;

        /* renamed from: h */
        public boolean f90171h;

        public C24174a(InterfaceC23434B<T> interfaceC23434B, C24175b<T> c24175b) {
            this.f90166c = interfaceC23434B;
            this.f90165b = c24175b;
        }

        /* renamed from: a */
        public final boolean m32519a() {
            if (!this.f90171h) {
                this.f90171h = true;
                this.f90165b.m32517c();
                new C24333z0(this.f90166c).subscribe(this.f90165b);
            }
            try {
                C24576w<T> m32516d = this.f90165b.m32516d();
                if (m32516d.m31856h()) {
                    this.f90169f = false;
                    this.f90167d = m32516d.m31859e();
                    return true;
                }
                this.f90168e = false;
                if (m32516d.m31858f()) {
                    return false;
                }
                Throwable m31860d = m32516d.m31860d();
                this.f90170g = m31860d;
                throw C24475k.m32256e(m31860d);
            } catch (InterruptedException e) {
                this.f90165b.dispose();
                this.f90170g = e;
                throw C24475k.m32256e(e);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th = this.f90170g;
            if (th == null) {
                if (!this.f90168e) {
                    return false;
                }
                if (this.f90169f && !m32519a()) {
                    return false;
                }
                return true;
            }
            throw C24475k.m32256e(th);
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th = this.f90170g;
            if (th == null) {
                if (hasNext()) {
                    this.f90169f = true;
                    return this.f90167d;
                }
                throw new NoSuchElementException("No more elements");
            }
            throw C24475k.m32256e(th);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.e$b */
    /* loaded from: classes6.dex */
    public static final class C24175b<T> extends AbstractC24500d<C24576w<T>> {

        /* renamed from: c */
        public final BlockingQueue<C24576w<T>> f90172c = new ArrayBlockingQueue(1);

        /* renamed from: d */
        public final AtomicInteger f90173d = new AtomicInteger();

        @Override // io.reactivex.InterfaceC23436D
        /* renamed from: b */
        public void onNext(C24576w<T> c24576w) {
            if (this.f90173d.getAndSet(0) == 1 || !c24576w.m31856h()) {
                while (!this.f90172c.offer(c24576w)) {
                    C24576w<T> poll = this.f90172c.poll();
                    if (poll != null && !poll.m31856h()) {
                        c24576w = poll;
                    }
                }
            }
        }

        /* renamed from: c */
        public void m32517c() {
            this.f90173d.set(1);
        }

        /* renamed from: d */
        public C24576w<T> m32516d() throws InterruptedException {
            m32517c();
            C24469e.m32268b();
            return this.f90172c.take();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            C24508a.m31988u(th);
        }
    }

    public C24173e(InterfaceC23434B<T> interfaceC23434B) {
        this.f90164b = interfaceC23434B;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new C24174a(this.f90164b, new C24175b());
    }
}
