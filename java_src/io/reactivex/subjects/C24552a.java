package io.reactivex.subjects;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.util.C24464a;
import io.reactivex.internal.util.C24475k;
import io.reactivex.internal.util.EnumC24479n;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* renamed from: io.reactivex.subjects.a */
/* loaded from: classes8.dex */
public final class C24552a<T> extends AbstractC24569h<T> {

    /* renamed from: i */
    public static final Object[] f91198i = new Object[0];

    /* renamed from: j */
    public static final C24553a[] f91199j = new C24553a[0];

    /* renamed from: k */
    public static final C24553a[] f91200k = new C24553a[0];

    /* renamed from: b */
    public final AtomicReference<Object> f91201b;

    /* renamed from: c */
    public final AtomicReference<C24553a<T>[]> f91202c;

    /* renamed from: d */
    public final ReadWriteLock f91203d;

    /* renamed from: e */
    public final Lock f91204e;

    /* renamed from: f */
    public final Lock f91205f;

    /* renamed from: g */
    public final AtomicReference<Throwable> f91206g;

    /* renamed from: h */
    public long f91207h;

    /* renamed from: io.reactivex.subjects.a$a */
    /* loaded from: classes8.dex */
    public static final class C24553a<T> implements InterfaceC23465c, C24464a.InterfaceC24465a<Object> {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f91208b;

        /* renamed from: c */
        public final C24552a<T> f91209c;

        /* renamed from: d */
        public boolean f91210d;

        /* renamed from: e */
        public boolean f91211e;

        /* renamed from: f */
        public C24464a<Object> f91212f;

        /* renamed from: g */
        public boolean f91213g;

        /* renamed from: h */
        public volatile boolean f91214h;

        /* renamed from: i */
        public long f91215i;

        public C24553a(InterfaceC23436D<? super T> interfaceC23436D, C24552a<T> c24552a) {
            this.f91208b = interfaceC23436D;
            this.f91209c = c24552a;
        }

        /* renamed from: a */
        public void m31915a() {
            boolean z;
            if (this.f91214h) {
                return;
            }
            synchronized (this) {
                if (this.f91214h) {
                    return;
                }
                if (this.f91210d) {
                    return;
                }
                C24552a<T> c24552a = this.f91209c;
                Lock lock = c24552a.f91204e;
                lock.lock();
                this.f91215i = c24552a.f91207h;
                Object obj = c24552a.f91201b.get();
                lock.unlock();
                if (obj != null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f91211e = z;
                this.f91210d = true;
                if (obj == null || test(obj)) {
                    return;
                }
                m31914b();
            }
        }

        /* renamed from: b */
        public void m31914b() {
            C24464a<Object> c24464a;
            while (!this.f91214h) {
                synchronized (this) {
                    c24464a = this.f91212f;
                    if (c24464a == null) {
                        this.f91211e = false;
                        return;
                    }
                    this.f91212f = null;
                }
                c24464a.m32282d(this);
            }
        }

        /* renamed from: c */
        public void m31913c(Object obj, long j) {
            if (this.f91214h) {
                return;
            }
            if (!this.f91213g) {
                synchronized (this) {
                    if (this.f91214h) {
                        return;
                    }
                    if (this.f91215i == j) {
                        return;
                    }
                    if (this.f91211e) {
                        C24464a<Object> c24464a = this.f91212f;
                        if (c24464a == null) {
                            c24464a = new C24464a<>(4);
                            this.f91212f = c24464a;
                        }
                        c24464a.m32283c(obj);
                        return;
                    }
                    this.f91210d = true;
                    this.f91213g = true;
                }
            }
            test(obj);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f91214h) {
                this.f91214h = true;
                this.f91209c.m31918j(this);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f91214h;
        }

        @Override // io.reactivex.internal.util.C24464a.InterfaceC24465a, io.reactivex.functions.InterfaceC23494q
        public boolean test(Object obj) {
            return this.f91214h || EnumC24479n.m32246b(obj, this.f91208b);
        }
    }

    public C24552a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f91203d = reentrantReadWriteLock;
        this.f91204e = reentrantReadWriteLock.readLock();
        this.f91205f = reentrantReadWriteLock.writeLock();
        this.f91202c = new AtomicReference<>(f91199j);
        this.f91201b = new AtomicReference<>();
        this.f91206g = new AtomicReference<>();
    }

    /* renamed from: e */
    public static <T> C24552a<T> m31922e() {
        return new C24552a<>();
    }

    /* renamed from: g */
    public static <T> C24552a<T> m31921g(T t) {
        return new C24552a<>(t);
    }

    /* renamed from: c */
    public boolean m31923c(C24553a<T> c24553a) {
        C24553a<T>[] c24553aArr;
        C24553a[] c24553aArr2;
        do {
            c24553aArr = this.f91202c.get();
            if (c24553aArr == f91200k) {
                return false;
            }
            int length = c24553aArr.length;
            c24553aArr2 = new C24553a[length + 1];
            System.arraycopy(c24553aArr, 0, c24553aArr2, 0, length);
            c24553aArr2[length] = c24553a;
        } while (!C42482i24.m35337a(this.f91202c, c24553aArr, c24553aArr2));
        return true;
    }

    public T getValue() {
        Object obj = this.f91201b.get();
        if (!EnumC24479n.m32238j(obj) && !EnumC24479n.m32237k(obj)) {
            return (T) EnumC24479n.m32239i(obj);
        }
        return null;
    }

    /* renamed from: h */
    public boolean m31920h() {
        return this.f91202c.get().length != 0;
    }

    /* renamed from: i */
    public boolean m31919i() {
        Object obj = this.f91201b.get();
        if (obj != null && !EnumC24479n.m32238j(obj) && !EnumC24479n.m32237k(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m31918j(C24553a<T> c24553a) {
        C24553a<T>[] c24553aArr;
        C24553a[] c24553aArr2;
        do {
            c24553aArr = this.f91202c.get();
            int length = c24553aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i < length) {
                    if (c24553aArr[i] == c24553a) {
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
                c24553aArr2 = f91199j;
            } else {
                C24553a[] c24553aArr3 = new C24553a[length - 1];
                System.arraycopy(c24553aArr, 0, c24553aArr3, 0, i);
                System.arraycopy(c24553aArr, i + 1, c24553aArr3, i, (length - i) - 1);
                c24553aArr2 = c24553aArr3;
            }
        } while (!C42482i24.m35337a(this.f91202c, c24553aArr, c24553aArr2));
    }

    /* renamed from: k */
    public void m31917k(Object obj) {
        this.f91205f.lock();
        this.f91207h++;
        this.f91201b.lazySet(obj);
        this.f91205f.unlock();
    }

    /* renamed from: l */
    public C24553a<T>[] m31916l(Object obj) {
        AtomicReference<C24553a<T>[]> atomicReference = this.f91202c;
        C24553a<T>[] c24553aArr = f91200k;
        C24553a<T>[] andSet = atomicReference.getAndSet(c24553aArr);
        if (andSet != c24553aArr) {
            m31917k(obj);
        }
        return andSet;
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        if (!C42482i24.m35337a(this.f91206g, null, C24475k.f91077a)) {
            return;
        }
        Object m32243e = EnumC24479n.m32243e();
        for (C24553a<T> c24553a : m31916l(m32243e)) {
            c24553a.m31913c(m32243e, this.f91207h);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        C23544b.m32923e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!C42482i24.m35337a(this.f91206g, null, th)) {
            C24508a.m31988u(th);
            return;
        }
        Object m32241g = EnumC24479n.m32241g(th);
        for (C24553a<T> c24553a : m31916l(m32241g)) {
            c24553a.m31913c(m32241g, this.f91207h);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        C23544b.m32923e(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f91206g.get() != null) {
            return;
        }
        Object m32236l = EnumC24479n.m32236l(t);
        m31917k(m32236l);
        for (C24553a<T> c24553a : this.f91202c.get()) {
            c24553a.m31913c(m32236l, this.f91207h);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        if (this.f91206g.get() != null) {
            interfaceC23465c.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C24553a<T> c24553a = new C24553a<>(interfaceC23436D, this);
        interfaceC23436D.onSubscribe(c24553a);
        if (m31923c(c24553a)) {
            if (c24553a.f91214h) {
                m31918j(c24553a);
                return;
            } else {
                c24553a.m31915a();
                return;
            }
        }
        Throwable th = this.f91206g.get();
        if (th == C24475k.f91077a) {
            interfaceC23436D.onComplete();
        } else {
            interfaceC23436D.onError(th);
        }
    }

    public C24552a(T t) {
        this();
        this.f91201b.lazySet(C23544b.m32923e(t, "defaultValue is null"));
    }
}
