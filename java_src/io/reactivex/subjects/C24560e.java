package io.reactivex.subjects;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.util.EnumC24479n;
import io.reactivex.plugins.C24508a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.subjects.e */
/* loaded from: classes8.dex */
public final class C24560e<T> extends AbstractC24569h<T> {

    /* renamed from: e */
    public static final C24562b[] f91235e = new C24562b[0];

    /* renamed from: f */
    public static final C24562b[] f91236f = new C24562b[0];

    /* renamed from: g */
    public static final Object[] f91237g = new Object[0];

    /* renamed from: b */
    public final InterfaceC24561a<T> f91238b;

    /* renamed from: c */
    public final AtomicReference<C24562b<T>[]> f91239c = new AtomicReference<>(f91235e);

    /* renamed from: d */
    public boolean f91240d;

    /* renamed from: io.reactivex.subjects.e$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC24561a<T> {
        /* renamed from: a */
        void mo31888a(Object obj);

        void add(T t);

        /* renamed from: b */
        void mo31887b(C24562b<T> c24562b);

        boolean compareAndSet(Object obj, Object obj2);
    }

    /* renamed from: io.reactivex.subjects.e$b */
    /* loaded from: classes8.dex */
    public static final class C24562b<T> extends AtomicInteger implements InterfaceC23465c {
        private static final long serialVersionUID = 466549804534799122L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f91241b;

        /* renamed from: c */
        public final C24560e<T> f91242c;

        /* renamed from: d */
        public Object f91243d;

        /* renamed from: e */
        public volatile boolean f91244e;

        public C24562b(InterfaceC23436D<? super T> interfaceC23436D, C24560e<T> c24560e) {
            this.f91241b = interfaceC23436D;
            this.f91242c = c24560e;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f91244e) {
                this.f91244e = true;
                this.f91242c.m31893h(this);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f91244e;
        }
    }

    /* renamed from: io.reactivex.subjects.e$c */
    /* loaded from: classes8.dex */
    public static final class C24563c<T> extends AtomicReference<Object> implements InterfaceC24561a<T> {
        private static final long serialVersionUID = -8056260896137901749L;

        /* renamed from: b */
        public final int f91245b;

        /* renamed from: c */
        public final long f91246c;

        /* renamed from: d */
        public final TimeUnit f91247d;

        /* renamed from: e */
        public final AbstractC23437E f91248e;

        /* renamed from: f */
        public int f91249f;

        /* renamed from: g */
        public volatile C24564d<Object> f91250g;

        /* renamed from: h */
        public C24564d<Object> f91251h;

        /* renamed from: i */
        public volatile boolean f91252i;

        public C24563c(int i, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
            this.f91245b = C23544b.m32922f(i, "maxSize");
            this.f91246c = C23544b.m32921g(j, "maxAge");
            this.f91247d = (TimeUnit) C23544b.m32923e(timeUnit, "unit is null");
            this.f91248e = (AbstractC23437E) C23544b.m32923e(abstractC23437E, "scheduler is null");
            C24564d<Object> c24564d = new C24564d<>(null, 0L);
            this.f91251h = c24564d;
            this.f91250g = c24564d;
        }

        @Override // io.reactivex.subjects.C24560e.InterfaceC24561a
        /* renamed from: a */
        public void mo31888a(Object obj) {
            C24564d<Object> c24564d = new C24564d<>(obj, LongCompanionObject.MAX_VALUE);
            C24564d<Object> c24564d2 = this.f91251h;
            this.f91251h = c24564d;
            this.f91249f++;
            c24564d2.lazySet(c24564d);
            m31889e();
            this.f91252i = true;
        }

        @Override // io.reactivex.subjects.C24560e.InterfaceC24561a
        public void add(T t) {
            C24564d<Object> c24564d = new C24564d<>(t, this.f91248e.m33168c(this.f91247d));
            C24564d<Object> c24564d2 = this.f91251h;
            this.f91251h = c24564d;
            this.f91249f++;
            c24564d2.set(c24564d);
            m31890d();
        }

        @Override // io.reactivex.subjects.C24560e.InterfaceC24561a
        /* renamed from: b */
        public void mo31887b(C24562b<T> c24562b) {
            if (c24562b.getAndIncrement() != 0) {
                return;
            }
            InterfaceC23436D<? super T> interfaceC23436D = c24562b.f91241b;
            C24564d<T> c24564d = (C24564d) c24562b.f91243d;
            if (c24564d == null) {
                c24564d = m31891c();
            }
            int i = 1;
            while (!c24562b.f91244e) {
                while (!c24562b.f91244e) {
                    C24564d<T> c24564d2 = c24564d.get();
                    if (c24564d2 == null) {
                        if (c24564d.get() == null) {
                            c24562b.f91243d = c24564d;
                            i = c24562b.addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    } else {
                        Object obj = (T) c24564d2.f91253b;
                        if (this.f91252i && c24564d2.get() == null) {
                            if (EnumC24479n.m32238j(obj)) {
                                interfaceC23436D.onComplete();
                            } else {
                                interfaceC23436D.onError(EnumC24479n.m32240h(obj));
                            }
                            c24562b.f91243d = null;
                            c24562b.f91244e = true;
                            return;
                        }
                        interfaceC23436D.onNext(obj);
                        c24564d = c24564d2;
                    }
                }
                c24562b.f91243d = null;
                return;
            }
            c24562b.f91243d = null;
        }

        /* renamed from: c */
        public C24564d<Object> m31891c() {
            C24564d<Object> c24564d;
            C24564d<Object> c24564d2 = this.f91250g;
            long m33168c = this.f91248e.m33168c(this.f91247d) - this.f91246c;
            C24564d<T> c24564d3 = c24564d2.get();
            while (true) {
                C24564d<T> c24564d4 = c24564d3;
                c24564d = c24564d2;
                c24564d2 = c24564d4;
                if (c24564d2 == null || c24564d2.f91254c > m33168c) {
                    break;
                }
                c24564d3 = c24564d2.get();
            }
            return c24564d;
        }

        /* renamed from: d */
        public void m31890d() {
            int i = this.f91249f;
            if (i > this.f91245b) {
                this.f91249f = i - 1;
                this.f91250g = this.f91250g.get();
            }
            long m33168c = this.f91248e.m33168c(this.f91247d) - this.f91246c;
            C24564d<Object> c24564d = this.f91250g;
            while (this.f91249f > 1) {
                C24564d<T> c24564d2 = c24564d.get();
                if (c24564d2 == null) {
                    this.f91250g = c24564d;
                    return;
                } else if (c24564d2.f91254c > m33168c) {
                    this.f91250g = c24564d;
                    return;
                } else {
                    this.f91249f--;
                    c24564d = c24564d2;
                }
            }
            this.f91250g = c24564d;
        }

        /* renamed from: e */
        public void m31889e() {
            long m33168c = this.f91248e.m33168c(this.f91247d) - this.f91246c;
            C24564d<Object> c24564d = this.f91250g;
            while (true) {
                C24564d<T> c24564d2 = c24564d.get();
                if (c24564d2.get() == null) {
                    if (c24564d.f91253b != null) {
                        C24564d<Object> c24564d3 = new C24564d<>(null, 0L);
                        c24564d3.lazySet(c24564d.get());
                        this.f91250g = c24564d3;
                        return;
                    }
                    this.f91250g = c24564d;
                    return;
                } else if (c24564d2.f91254c > m33168c) {
                    if (c24564d.f91253b != null) {
                        C24564d<Object> c24564d4 = new C24564d<>(null, 0L);
                        c24564d4.lazySet(c24564d.get());
                        this.f91250g = c24564d4;
                        return;
                    }
                    this.f91250g = c24564d;
                    return;
                } else {
                    c24564d = c24564d2;
                }
            }
        }
    }

    /* renamed from: io.reactivex.subjects.e$d */
    /* loaded from: classes8.dex */
    public static final class C24564d<T> extends AtomicReference<C24564d<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* renamed from: b */
        public final T f91253b;

        /* renamed from: c */
        public final long f91254c;

        public C24564d(T t, long j) {
            this.f91253b = t;
            this.f91254c = j;
        }
    }

    /* renamed from: io.reactivex.subjects.e$e */
    /* loaded from: classes8.dex */
    public static final class C24565e<T> extends AtomicReference<Object> implements InterfaceC24561a<T> {
        private static final long serialVersionUID = -733876083048047795L;

        /* renamed from: b */
        public final List<Object> f91255b;

        /* renamed from: c */
        public volatile boolean f91256c;

        /* renamed from: d */
        public volatile int f91257d;

        public C24565e(int i) {
            this.f91255b = new ArrayList(C23544b.m32922f(i, "capacityHint"));
        }

        @Override // io.reactivex.subjects.C24560e.InterfaceC24561a
        /* renamed from: a */
        public void mo31888a(Object obj) {
            this.f91255b.add(obj);
            m31886c();
            this.f91257d++;
            this.f91256c = true;
        }

        @Override // io.reactivex.subjects.C24560e.InterfaceC24561a
        public void add(T t) {
            this.f91255b.add(t);
            this.f91257d++;
        }

        @Override // io.reactivex.subjects.C24560e.InterfaceC24561a
        /* renamed from: b */
        public void mo31887b(C24562b<T> c24562b) {
            int i;
            int i2;
            if (c24562b.getAndIncrement() != 0) {
                return;
            }
            List<Object> list = this.f91255b;
            InterfaceC23436D<? super T> interfaceC23436D = c24562b.f91241b;
            Integer num = (Integer) c24562b.f91243d;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
                c24562b.f91243d = 0;
            }
            int i3 = 1;
            while (!c24562b.f91244e) {
                int i4 = this.f91257d;
                while (i4 != i) {
                    if (c24562b.f91244e) {
                        c24562b.f91243d = null;
                        return;
                    }
                    Object obj = list.get(i);
                    if (this.f91256c && (i2 = i + 1) == i4 && i2 == (i4 = this.f91257d)) {
                        if (EnumC24479n.m32238j(obj)) {
                            interfaceC23436D.onComplete();
                        } else {
                            interfaceC23436D.onError(EnumC24479n.m32240h(obj));
                        }
                        c24562b.f91243d = null;
                        c24562b.f91244e = true;
                        return;
                    }
                    interfaceC23436D.onNext(obj);
                    i++;
                }
                if (i == this.f91257d) {
                    c24562b.f91243d = Integer.valueOf(i);
                    i3 = c24562b.addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                }
            }
            c24562b.f91243d = null;
        }

        /* renamed from: c */
        public void m31886c() {
        }
    }

    public C24560e(InterfaceC24561a<T> interfaceC24561a) {
        this.f91238b = interfaceC24561a;
    }

    /* renamed from: e */
    public static <T> C24560e<T> m31895e() {
        return new C24560e<>(new C24565e(16));
    }

    /* renamed from: g */
    public static <T> C24560e<T> m31894g(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, int i) {
        return new C24560e<>(new C24563c(i, j, timeUnit, abstractC23437E));
    }

    /* renamed from: c */
    public boolean m31896c(C24562b<T> c24562b) {
        C24562b<T>[] c24562bArr;
        C24562b[] c24562bArr2;
        do {
            c24562bArr = this.f91239c.get();
            if (c24562bArr == f91236f) {
                return false;
            }
            int length = c24562bArr.length;
            c24562bArr2 = new C24562b[length + 1];
            System.arraycopy(c24562bArr, 0, c24562bArr2, 0, length);
            c24562bArr2[length] = c24562b;
        } while (!C42482i24.m35337a(this.f91239c, c24562bArr, c24562bArr2));
        return true;
    }

    /* renamed from: h */
    public void m31893h(C24562b<T> c24562b) {
        C24562b<T>[] c24562bArr;
        C24562b[] c24562bArr2;
        do {
            c24562bArr = this.f91239c.get();
            if (c24562bArr != f91236f && c24562bArr != f91235e) {
                int length = c24562bArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (c24562bArr[i] == c24562b) {
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
                    c24562bArr2 = f91235e;
                } else {
                    C24562b[] c24562bArr3 = new C24562b[length - 1];
                    System.arraycopy(c24562bArr, 0, c24562bArr3, 0, i);
                    System.arraycopy(c24562bArr, i + 1, c24562bArr3, i, (length - i) - 1);
                    c24562bArr2 = c24562bArr3;
                }
            } else {
                return;
            }
        } while (!C42482i24.m35337a(this.f91239c, c24562bArr, c24562bArr2));
    }

    /* renamed from: i */
    public C24562b<T>[] m31892i(Object obj) {
        if (this.f91238b.compareAndSet(null, obj)) {
            return this.f91239c.getAndSet(f91236f);
        }
        return f91236f;
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        if (this.f91240d) {
            return;
        }
        this.f91240d = true;
        Object m32243e = EnumC24479n.m32243e();
        InterfaceC24561a<T> interfaceC24561a = this.f91238b;
        interfaceC24561a.mo31888a(m32243e);
        for (C24562b<T> c24562b : m31892i(m32243e)) {
            interfaceC24561a.mo31887b(c24562b);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        C23544b.m32923e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f91240d) {
            C24508a.m31988u(th);
            return;
        }
        this.f91240d = true;
        Object m32241g = EnumC24479n.m32241g(th);
        InterfaceC24561a<T> interfaceC24561a = this.f91238b;
        interfaceC24561a.mo31888a(m32241g);
        for (C24562b<T> c24562b : m31892i(m32241g)) {
            interfaceC24561a.mo31887b(c24562b);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        C23544b.m32923e(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f91240d) {
            return;
        }
        InterfaceC24561a<T> interfaceC24561a = this.f91238b;
        interfaceC24561a.add(t);
        for (C24562b<T> c24562b : this.f91239c.get()) {
            interfaceC24561a.mo31887b(c24562b);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        if (this.f91240d) {
            interfaceC23465c.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C24562b<T> c24562b = new C24562b<>(interfaceC23436D, this);
        interfaceC23436D.onSubscribe(c24562b);
        if (!c24562b.f91244e) {
            if (m31896c(c24562b) && c24562b.f91244e) {
                m31893h(c24562b);
            } else {
                this.f91238b.mo31887b(c24562b);
            }
        }
    }
}
