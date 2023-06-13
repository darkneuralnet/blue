package p000;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: cd4  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39251cd4<T> extends AbstractC37638Zt4<T> {

    /* renamed from: b */
    public final Queue<T> f60951b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public final AtomicReference<C13610a<T>> f60952c = new AtomicReference<>();

    /* renamed from: d */
    public final Object f60953d = new Object();

    /* renamed from: cd4$a */
    /* loaded from: classes7.dex */
    public static final class C13610a<T> extends AtomicInteger implements InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f60954b;

        /* renamed from: c */
        public final C39251cd4<T> f60955c;

        /* renamed from: d */
        public final AtomicBoolean f60956d = new AtomicBoolean();

        public C13610a(InterfaceC23436D<? super T> interfaceC23436D, C39251cd4<T> c39251cd4) {
            this.f60954b = interfaceC23436D;
            this.f60955c = c39251cd4;
        }

        /* renamed from: a */
        public void m61152a(Queue<T> queue) {
            if (getAndIncrement() != 0) {
                return;
            }
            int i = 1;
            while (!this.f60956d.get()) {
                while (!this.f60956d.get()) {
                    synchronized (this.f60955c.f60953d) {
                        if (this.f60956d.get()) {
                            return;
                        }
                        T poll = queue.poll();
                        if (poll == null) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            this.f60954b.onNext(poll);
                        }
                    }
                }
                return;
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            synchronized (this.f60955c.f60953d) {
                if (this.f60956d.compareAndSet(false, true)) {
                    this.f60955c.m61154i();
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f60956d.get();
        }
    }

    public C39251cd4(T... tArr) {
        for (T t : tArr) {
            if (t != null) {
                this.f60951b.offer(t);
            } else {
                throw new NullPointerException("item == null");
            }
        }
    }

    /* renamed from: h */
    public static <T> C39251cd4<T> m61155h() {
        return new C39251cd4<>(new Object[0]);
    }

    @Override // p000.AbstractC37638Zt4
    /* renamed from: a */
    public boolean mo25411a() {
        return this.f60952c.get() != null;
    }

    @Override // p000.AbstractC37638Zt4, io.reactivex.functions.InterfaceC23484g
    public void accept(T t) {
        if (t != null) {
            this.f60951b.offer(t);
            C13610a<T> c13610a = this.f60952c.get();
            if (c13610a != null && !c13610a.mo1769e()) {
                c13610a.m61152a(this.f60951b);
                return;
            }
            return;
        }
        throw new NullPointerException("value == null");
    }

    /* renamed from: i */
    public final void m61154i() {
        C13610a<T> c13610a = this.f60952c.get();
        if (c13610a != null && c13610a.f60956d.get()) {
            C42482i24.m35337a(this.f60952c, c13610a, null);
        }
    }

    /* renamed from: j */
    public final void m61153j(C13610a<T> c13610a) {
        C13610a<T> c13610a2 = this.f60952c.get();
        if (c13610a2 != null) {
            c13610a2.dispose();
        }
        this.f60952c.set(c13610a);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C13610a<T> c13610a = new C13610a<>(interfaceC23436D, this);
        interfaceC23436D.onSubscribe(c13610a);
        m61153j(c13610a);
        c13610a.m61152a(this.f60951b);
    }
}
