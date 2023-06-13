package io.reactivex.internal.queue;

import io.reactivex.internal.fuseable.InterfaceC23554i;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.queue.a */
/* loaded from: classes6.dex */
public final class C24406a<T> implements InterfaceC23554i<T> {

    /* renamed from: b */
    public final AtomicReference<C24407a<T>> f90895b = new AtomicReference<>();

    /* renamed from: c */
    public final AtomicReference<C24407a<T>> f90896c = new AtomicReference<>();

    /* renamed from: io.reactivex.internal.queue.a$a */
    /* loaded from: classes6.dex */
    public static final class C24407a<E> extends AtomicReference<C24407a<E>> {
        private static final long serialVersionUID = 2404266111789071508L;

        /* renamed from: b */
        public E f90897b;

        public C24407a() {
        }

        /* renamed from: a */
        public E m32387a() {
            E m32386b = m32386b();
            m32383e(null);
            return m32386b;
        }

        /* renamed from: b */
        public E m32386b() {
            return this.f90897b;
        }

        /* renamed from: c */
        public C24407a<E> m32385c() {
            return get();
        }

        /* renamed from: d */
        public void m32384d(C24407a<E> c24407a) {
            lazySet(c24407a);
        }

        /* renamed from: e */
        public void m32383e(E e) {
            this.f90897b = e;
        }

        public C24407a(E e) {
            m32383e(e);
        }
    }

    public C24406a() {
        C24407a<T> c24407a = new C24407a<>();
        m32389e(c24407a);
        m32388f(c24407a);
    }

    /* renamed from: a */
    public C24407a<T> m32392a() {
        return this.f90896c.get();
    }

    /* renamed from: c */
    public C24407a<T> m32391c() {
        return this.f90896c.get();
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    /* renamed from: d */
    public C24407a<T> m32390d() {
        return this.f90895b.get();
    }

    /* renamed from: e */
    public void m32389e(C24407a<T> c24407a) {
        this.f90896c.lazySet(c24407a);
    }

    /* renamed from: f */
    public C24407a<T> m32388f(C24407a<T> c24407a) {
        return this.f90895b.getAndSet(c24407a);
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public boolean isEmpty() {
        return m32391c() == m32390d();
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public boolean offer(T t) {
        if (t != null) {
            C24407a<T> c24407a = new C24407a<>(t);
            m32388f(c24407a).m32384d(c24407a);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23554i, io.reactivex.internal.fuseable.InterfaceC23555j
    public T poll() {
        C24407a<T> m32385c;
        C24407a<T> m32392a = m32392a();
        C24407a<T> m32385c2 = m32392a.m32385c();
        if (m32385c2 != null) {
            T m32387a = m32385c2.m32387a();
            m32389e(m32385c2);
            return m32387a;
        } else if (m32392a != m32390d()) {
            do {
                m32385c = m32392a.m32385c();
            } while (m32385c == null);
            T m32387a2 = m32385c.m32387a();
            m32389e(m32385c);
            return m32387a2;
        } else {
            return null;
        }
    }
}
