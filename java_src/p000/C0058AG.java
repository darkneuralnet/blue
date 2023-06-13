package p000;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.C10852am;
/* renamed from: AG */
/* loaded from: classes6.dex */
public final class C0058AG<T> extends AbstractC37638Zt4<T> {

    /* renamed from: g */
    public static final Object[] f320g = new Object[0];

    /* renamed from: h */
    public static final C0059a[] f321h = new C0059a[0];

    /* renamed from: b */
    public final AtomicReference<T> f322b;

    /* renamed from: c */
    public final AtomicReference<C0059a<T>[]> f323c;

    /* renamed from: d */
    public final Lock f324d;

    /* renamed from: e */
    public final Lock f325e;

    /* renamed from: f */
    public long f326f;

    /* renamed from: AG$a */
    /* loaded from: classes6.dex */
    public static final class C0059a<T> implements InterfaceC23465c, C10852am.InterfaceC10853a<T> {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f327b;

        /* renamed from: c */
        public final C0058AG<T> f328c;

        /* renamed from: d */
        public boolean f329d;

        /* renamed from: e */
        public boolean f330e;

        /* renamed from: f */
        public C10852am<T> f331f;

        /* renamed from: g */
        public boolean f332g;

        /* renamed from: h */
        public volatile boolean f333h;

        /* renamed from: i */
        public long f334i;

        public C0059a(InterfaceC23436D<? super T> interfaceC23436D, C0058AG<T> c0058ag) {
            this.f327b = interfaceC23436D;
            this.f328c = c0058ag;
        }

        /* renamed from: a */
        public void m115946a() {
            boolean z;
            if (this.f333h) {
                return;
            }
            synchronized (this) {
                if (this.f333h) {
                    return;
                }
                if (this.f329d) {
                    return;
                }
                C0058AG<T> c0058ag = this.f328c;
                Lock lock = c0058ag.f324d;
                lock.lock();
                this.f334i = c0058ag.f326f;
                T t = c0058ag.f322b.get();
                lock.unlock();
                if (t != null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f330e = z;
                this.f329d = true;
                if (t != null) {
                    test(t);
                    m115945b();
                }
            }
        }

        /* renamed from: b */
        public void m115945b() {
            C10852am<T> c10852am;
            while (!this.f333h) {
                synchronized (this) {
                    c10852am = this.f331f;
                    if (c10852am == null) {
                        this.f330e = false;
                        return;
                    }
                    this.f331f = null;
                }
                c10852am.m70771c(this);
            }
        }

        /* renamed from: c */
        public void m115944c(T t, long j) {
            if (this.f333h) {
                return;
            }
            if (!this.f332g) {
                synchronized (this) {
                    if (this.f333h) {
                        return;
                    }
                    if (this.f334i == j) {
                        return;
                    }
                    if (this.f330e) {
                        C10852am<T> c10852am = this.f331f;
                        if (c10852am == null) {
                            c10852am = new C10852am<>(4);
                            this.f331f = c10852am;
                        }
                        c10852am.m70772b(t);
                        return;
                    }
                    this.f329d = true;
                    this.f332g = true;
                }
            }
            test(t);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f333h) {
                this.f333h = true;
                this.f328c.m115948j(this);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f333h;
        }

        @Override // p000.C10852am.InterfaceC10853a, io.reactivex.functions.InterfaceC23494q
        public boolean test(T t) {
            if (!this.f333h) {
                this.f327b.onNext(t);
                return false;
            }
            return false;
        }
    }

    public C0058AG() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f324d = reentrantReadWriteLock.readLock();
        this.f325e = reentrantReadWriteLock.writeLock();
        this.f323c = new AtomicReference<>(f321h);
        this.f322b = new AtomicReference<>();
    }

    /* renamed from: g */
    public static <T> C0058AG<T> m115951g() {
        return new C0058AG<>();
    }

    /* renamed from: h */
    public static <T> C0058AG<T> m115950h(T t) {
        return new C0058AG<>(t);
    }

    @Override // p000.AbstractC37638Zt4
    /* renamed from: a */
    public boolean mo25411a() {
        return this.f323c.get().length != 0;
    }

    @Override // p000.AbstractC37638Zt4, io.reactivex.functions.InterfaceC23484g
    public void accept(T t) {
        if (t != null) {
            m115947k(t);
            for (C0059a<T> c0059a : this.f323c.get()) {
                c0059a.m115944c(t, this.f326f);
            }
            return;
        }
        throw new NullPointerException("value == null");
    }

    /* renamed from: e */
    public void m115952e(C0059a<T> c0059a) {
        C0059a<T>[] c0059aArr;
        C0059a[] c0059aArr2;
        do {
            c0059aArr = this.f323c.get();
            int length = c0059aArr.length;
            c0059aArr2 = new C0059a[length + 1];
            System.arraycopy(c0059aArr, 0, c0059aArr2, 0, length);
            c0059aArr2[length] = c0059a;
        } while (!C42482i24.m35337a(this.f323c, c0059aArr, c0059aArr2));
    }

    public T getValue() {
        return this.f322b.get();
    }

    /* renamed from: i */
    public boolean m115949i() {
        return this.f322b.get() != null;
    }

    /* renamed from: j */
    public void m115948j(C0059a<T> c0059a) {
        C0059a<T>[] c0059aArr;
        C0059a[] c0059aArr2;
        do {
            c0059aArr = this.f323c.get();
            int length = c0059aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i < length) {
                    if (c0059aArr[i] == c0059a) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c0059aArr2 = f321h;
            } else {
                C0059a[] c0059aArr3 = new C0059a[length - 1];
                System.arraycopy(c0059aArr, 0, c0059aArr3, 0, i);
                System.arraycopy(c0059aArr, i + 1, c0059aArr3, i, (length - i) - 1);
                c0059aArr2 = c0059aArr3;
            }
        } while (!C42482i24.m35337a(this.f323c, c0059aArr, c0059aArr2));
    }

    /* renamed from: k */
    public void m115947k(T t) {
        this.f325e.lock();
        this.f326f++;
        this.f322b.lazySet(t);
        this.f325e.unlock();
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C0059a<T> c0059a = new C0059a<>(interfaceC23436D, this);
        interfaceC23436D.onSubscribe(c0059a);
        m115952e(c0059a);
        if (c0059a.f333h) {
            m115948j(c0059a);
        } else {
            c0059a.m115946a();
        }
    }

    public C0058AG(T t) {
        this();
        if (t != null) {
            this.f322b.lazySet(t);
            return;
        }
        throw new NullPointerException("defaultValue == null");
    }
}
