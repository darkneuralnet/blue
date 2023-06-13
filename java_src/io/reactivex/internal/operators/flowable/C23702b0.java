package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.flowables.AbstractC23477a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.disposables.InterfaceC23504g;
import io.reactivex.internal.subscriptions.EnumC24460d;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import io.reactivex.internal.util.C24475k;
import io.reactivex.internal.util.EnumC24479n;
import io.reactivex.plugins.C24508a;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.b0 */
/* loaded from: classes6.dex */
public final class C23702b0<T> extends AbstractC23477a<T> implements InterfaceC23504g {

    /* renamed from: g */
    public static final Callable f88677g = new CallableC23704b();

    /* renamed from: c */
    public final AbstractC24490k<T> f88678c;

    /* renamed from: d */
    public final AtomicReference<C23710h<T>> f88679d;

    /* renamed from: e */
    public final Callable<? extends InterfaceC23707e<T>> f88680e;

    /* renamed from: f */
    public final InterfaceC45761na4<T> f88681f;

    /* renamed from: io.reactivex.internal.operators.flowable.b0$a */
    /* loaded from: classes6.dex */
    public static class C23703a<T> extends AtomicReference<C23706d> implements InterfaceC23707e<T> {
        private static final long serialVersionUID = 2346567790059478686L;

        /* renamed from: b */
        public C23706d f88682b;

        /* renamed from: c */
        public int f88683c;

        /* renamed from: d */
        public long f88684d;

        public C23703a() {
            C23706d c23706d = new C23706d(null, 0L);
            this.f88682b = c23706d;
            set(c23706d);
        }

        /* renamed from: a */
        public final void m32843a(C23706d c23706d) {
            this.f88682b.set(c23706d);
            this.f88682b = c23706d;
            this.f88683c++;
        }

        /* renamed from: b */
        public Object m32842b(Object obj) {
            return obj;
        }

        /* renamed from: c */
        public C23706d m32841c() {
            return get();
        }

        /* renamed from: d */
        public Object m32840d(Object obj) {
            return obj;
        }

        @Override // io.reactivex.internal.operators.flowable.C23702b0.InterfaceC23707e
        /* renamed from: e */
        public final void mo32828e() {
            Object m32842b = m32842b(EnumC24479n.m32243e());
            long j = this.f88684d + 1;
            this.f88684d = j;
            m32843a(new C23706d(m32842b, j));
            m32836l();
        }

        @Override // io.reactivex.internal.operators.flowable.C23702b0.InterfaceC23707e
        public final void error(Throwable th) {
            Object m32842b = m32842b(EnumC24479n.m32241g(th));
            long j = this.f88684d + 1;
            this.f88684d = j;
            m32843a(new C23706d(m32842b, j));
            m32836l();
        }

        @Override // io.reactivex.internal.operators.flowable.C23702b0.InterfaceC23707e
        /* renamed from: f */
        public final void mo32827f(T t) {
            Object m32842b = m32842b(EnumC24479n.m32236l(t));
            long j = this.f88684d + 1;
            this.f88684d = j;
            m32843a(new C23706d(m32842b, j));
            mo32829k();
        }

        /* renamed from: g */
        public final void m32839g() {
            C23706d c23706d = get().get();
            if (c23706d != null) {
                this.f88683c--;
                m32838i(c23706d);
                return;
            }
            throw new IllegalStateException("Empty list!");
        }

        @Override // io.reactivex.internal.operators.flowable.C23702b0.InterfaceC23707e
        /* renamed from: h */
        public final void mo32826h(C23705c<T> c23705c) {
            boolean z;
            C23706d c23706d;
            synchronized (c23705c) {
                if (c23705c.f88689f) {
                    c23705c.f88690g = true;
                    return;
                }
                c23705c.f88689f = true;
                while (!c23705c.mo1769e()) {
                    long j = c23705c.get();
                    if (j == LongCompanionObject.MAX_VALUE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C23706d c23706d2 = (C23706d) c23705c.m32835a();
                    if (c23706d2 == null) {
                        c23706d2 = m32841c();
                        c23705c.f88687d = c23706d2;
                        C24468d.m32274a(c23705c.f88688e, c23706d2.f88692c);
                    }
                    long j2 = 0;
                    while (j != 0 && (c23706d = c23706d2.get()) != null) {
                        Object m32840d = m32840d(c23706d.f88691b);
                        try {
                            if (EnumC24479n.m32247a(m32840d, c23705c.f88686c)) {
                                c23705c.f88687d = null;
                                return;
                            }
                            j2++;
                            j--;
                            if (c23705c.mo1769e()) {
                                c23705c.f88687d = null;
                                return;
                            }
                            c23706d2 = c23706d;
                        } catch (Throwable th) {
                            C23475a.m33009b(th);
                            c23705c.f88687d = null;
                            c23705c.dispose();
                            if (!EnumC24479n.m32237k(m32840d) && !EnumC24479n.m32238j(m32840d)) {
                                c23705c.f88686c.onError(th);
                                return;
                            }
                            return;
                        }
                    }
                    if (j2 != 0) {
                        c23705c.f88687d = c23706d2;
                        if (!z) {
                            c23705c.m32834b(j2);
                        }
                    }
                    synchronized (c23705c) {
                        if (!c23705c.f88690g) {
                            c23705c.f88689f = false;
                            return;
                        }
                        c23705c.f88690g = false;
                    }
                }
                c23705c.f88687d = null;
            }
        }

        /* renamed from: i */
        public final void m32838i(C23706d c23706d) {
            set(c23706d);
        }

        /* renamed from: j */
        public final void m32837j() {
            C23706d c23706d = get();
            if (c23706d.f88691b != null) {
                C23706d c23706d2 = new C23706d(null, 0L);
                c23706d2.lazySet(c23706d.get());
                set(c23706d2);
            }
        }

        /* renamed from: k */
        public void mo32829k() {
        }

        /* renamed from: l */
        public void m32836l() {
            m32837j();
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.b0$b */
    /* loaded from: classes6.dex */
    public static final class CallableC23704b implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return new C23712j(16);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.b0$c */
    /* loaded from: classes6.dex */
    public static final class C23705c<T> extends AtomicLong implements InterfaceC46292oT5, InterfaceC23465c {
        private static final long serialVersionUID = -4453897557930727610L;

        /* renamed from: b */
        public final C23710h<T> f88685b;

        /* renamed from: c */
        public final InterfaceC42141hT5<? super T> f88686c;

        /* renamed from: d */
        public Object f88687d;

        /* renamed from: e */
        public final AtomicLong f88688e = new AtomicLong();

        /* renamed from: f */
        public boolean f88689f;

        /* renamed from: g */
        public boolean f88690g;

        public C23705c(C23710h<T> c23710h, InterfaceC42141hT5<? super T> interfaceC42141hT5) {
            this.f88685b = c23710h;
            this.f88686c = interfaceC42141hT5;
        }

        /* renamed from: a */
        public <U> U m32835a() {
            return (U) this.f88687d;
        }

        /* renamed from: b */
        public long m32834b(long j) {
            return C24468d.m32270e(this, j);
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f88685b.m32830d(this);
                this.f88685b.m32831c();
                this.f88687d = null;
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get() == Long.MIN_VALUE;
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j) && C24468d.m32273b(this, j) != Long.MIN_VALUE) {
                C24468d.m32274a(this.f88688e, j);
                this.f88685b.m32831c();
                this.f88685b.f88698b.mo32826h(this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.b0$d */
    /* loaded from: classes6.dex */
    public static final class C23706d extends AtomicReference<C23706d> {
        private static final long serialVersionUID = 245354315435971818L;

        /* renamed from: b */
        public final Object f88691b;

        /* renamed from: c */
        public final long f88692c;

        public C23706d(Object obj, long j) {
            this.f88691b = obj;
            this.f88692c = j;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.b0$e */
    /* loaded from: classes6.dex */
    public interface InterfaceC23707e<T> {
        /* renamed from: e */
        void mo32828e();

        void error(Throwable th);

        /* renamed from: f */
        void mo32827f(T t);

        /* renamed from: h */
        void mo32826h(C23705c<T> c23705c);
    }

    /* renamed from: io.reactivex.internal.operators.flowable.b0$f */
    /* loaded from: classes6.dex */
    public static final class CallableC23708f<T> implements Callable<InterfaceC23707e<T>> {

        /* renamed from: b */
        public final int f88693b;

        public CallableC23708f(int i) {
            this.f88693b = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public InterfaceC23707e<T> call() {
            return new C23711i(this.f88693b);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.b0$g */
    /* loaded from: classes6.dex */
    public static final class C23709g<T> implements InterfaceC45761na4<T> {

        /* renamed from: b */
        public final AtomicReference<C23710h<T>> f88694b;

        /* renamed from: c */
        public final Callable<? extends InterfaceC23707e<T>> f88695c;

        public C23709g(AtomicReference<C23710h<T>> atomicReference, Callable<? extends InterfaceC23707e<T>> callable) {
            this.f88694b = atomicReference;
            this.f88695c = callable;
        }

        @Override // p000.InterfaceC45761na4
        /* renamed from: c */
        public void mo23497c(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
            C23710h<T> c23710h;
            while (true) {
                c23710h = this.f88694b.get();
                if (c23710h != null) {
                    break;
                }
                try {
                    C23710h<T> c23710h2 = new C23710h<>(this.f88695c.call());
                    if (C42482i24.m35337a(this.f88694b, null, c23710h2)) {
                        c23710h = c23710h2;
                        break;
                    }
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    EnumC24460d.m32300c(th, interfaceC42141hT5);
                    return;
                }
            }
            C23705c<T> c23705c = new C23705c<>(c23710h, interfaceC42141hT5);
            interfaceC42141hT5.mo31867a(c23705c);
            c23710h.m32832b(c23705c);
            if (c23705c.mo1769e()) {
                c23710h.m32830d(c23705c);
                return;
            }
            c23710h.m32831c();
            c23710h.f88698b.mo32826h(c23705c);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.b0$h */
    /* loaded from: classes6.dex */
    public static final class C23710h<T> extends AtomicReference<InterfaceC46292oT5> implements InterfaceC24494o<T>, InterfaceC23465c {

        /* renamed from: i */
        public static final C23705c[] f88696i = new C23705c[0];

        /* renamed from: j */
        public static final C23705c[] f88697j = new C23705c[0];
        private static final long serialVersionUID = 7224554242710036740L;

        /* renamed from: b */
        public final InterfaceC23707e<T> f88698b;

        /* renamed from: c */
        public boolean f88699c;

        /* renamed from: g */
        public long f88703g;

        /* renamed from: h */
        public long f88704h;

        /* renamed from: f */
        public final AtomicInteger f88702f = new AtomicInteger();

        /* renamed from: d */
        public final AtomicReference<C23705c<T>[]> f88700d = new AtomicReference<>(f88696i);

        /* renamed from: e */
        public final AtomicBoolean f88701e = new AtomicBoolean();

        public C23710h(InterfaceC23707e<T> interfaceC23707e) {
            this.f88698b = interfaceC23707e;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32289f(this, interfaceC46292oT5)) {
                m32831c();
                for (C23705c<T> c23705c : this.f88700d.get()) {
                    this.f88698b.mo32826h(c23705c);
                }
            }
        }

        /* renamed from: b */
        public boolean m32832b(C23705c<T> c23705c) {
            C23705c<T>[] c23705cArr;
            C23705c[] c23705cArr2;
            c23705c.getClass();
            do {
                c23705cArr = this.f88700d.get();
                if (c23705cArr == f88697j) {
                    return false;
                }
                int length = c23705cArr.length;
                c23705cArr2 = new C23705c[length + 1];
                System.arraycopy(c23705cArr, 0, c23705cArr2, 0, length);
                c23705cArr2[length] = c23705c;
            } while (!C42482i24.m35337a(this.f88700d, c23705cArr, c23705cArr2));
            return true;
        }

        /* renamed from: c */
        public void m32831c() {
            if (this.f88702f.getAndIncrement() != 0) {
                return;
            }
            int i = 1;
            while (!mo1769e()) {
                C23705c<T>[] c23705cArr = this.f88700d.get();
                long j = this.f88703g;
                long j2 = j;
                for (C23705c<T> c23705c : c23705cArr) {
                    j2 = Math.max(j2, c23705c.f88688e.get());
                }
                long j3 = this.f88704h;
                InterfaceC46292oT5 interfaceC46292oT5 = get();
                long j4 = j2 - j;
                if (j4 != 0) {
                    this.f88703g = j2;
                    if (interfaceC46292oT5 != null) {
                        if (j3 != 0) {
                            this.f88704h = 0L;
                            interfaceC46292oT5.mo21023o(j3 + j4);
                        } else {
                            interfaceC46292oT5.mo21023o(j4);
                        }
                    } else {
                        long j5 = j3 + j4;
                        if (j5 < 0) {
                            j5 = LongCompanionObject.MAX_VALUE;
                        }
                        this.f88704h = j5;
                    }
                } else if (j3 != 0 && interfaceC46292oT5 != null) {
                    this.f88704h = 0L;
                    interfaceC46292oT5.mo21023o(j3);
                }
                i = this.f88702f.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* renamed from: d */
        public void m32830d(C23705c<T> c23705c) {
            C23705c<T>[] c23705cArr;
            C23705c[] c23705cArr2;
            do {
                c23705cArr = this.f88700d.get();
                int length = c23705cArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (c23705cArr[i].equals(c23705c)) {
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
                    c23705cArr2 = f88696i;
                } else {
                    C23705c[] c23705cArr3 = new C23705c[length - 1];
                    System.arraycopy(c23705cArr, 0, c23705cArr3, 0, i);
                    System.arraycopy(c23705cArr, i + 1, c23705cArr3, i, (length - i) - 1);
                    c23705cArr2 = c23705cArr3;
                }
            } while (!C42482i24.m35337a(this.f88700d, c23705cArr, c23705cArr2));
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f88700d.set(f88697j);
            EnumC24463g.m32294a(this);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88700d.get() == f88697j;
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (!this.f88699c) {
                this.f88699c = true;
                this.f88698b.mo32828e();
                for (C23705c<T> c23705c : this.f88700d.getAndSet(f88697j)) {
                    this.f88698b.mo32826h(c23705c);
                }
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (!this.f88699c) {
                this.f88699c = true;
                this.f88698b.error(th);
                for (C23705c<T> c23705c : this.f88700d.getAndSet(f88697j)) {
                    this.f88698b.mo32826h(c23705c);
                }
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (!this.f88699c) {
                this.f88698b.mo32827f(t);
                for (C23705c<T> c23705c : this.f88700d.get()) {
                    this.f88698b.mo32826h(c23705c);
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.b0$i */
    /* loaded from: classes6.dex */
    public static final class C23711i<T> extends C23703a<T> {
        private static final long serialVersionUID = -5898283885385201806L;

        /* renamed from: e */
        public final int f88705e;

        public C23711i(int i) {
            this.f88705e = i;
        }

        @Override // io.reactivex.internal.operators.flowable.C23702b0.C23703a
        /* renamed from: k */
        public void mo32829k() {
            if (this.f88683c > this.f88705e) {
                m32839g();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.b0$j */
    /* loaded from: classes6.dex */
    public static final class C23712j<T> extends ArrayList<Object> implements InterfaceC23707e<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* renamed from: b */
        public volatile int f88706b;

        public C23712j(int i) {
            super(i);
        }

        @Override // io.reactivex.internal.operators.flowable.C23702b0.InterfaceC23707e
        /* renamed from: e */
        public void mo32828e() {
            add(EnumC24479n.m32243e());
            this.f88706b++;
        }

        @Override // io.reactivex.internal.operators.flowable.C23702b0.InterfaceC23707e
        public void error(Throwable th) {
            add(EnumC24479n.m32241g(th));
            this.f88706b++;
        }

        @Override // io.reactivex.internal.operators.flowable.C23702b0.InterfaceC23707e
        /* renamed from: f */
        public void mo32827f(T t) {
            add(EnumC24479n.m32236l(t));
            this.f88706b++;
        }

        @Override // io.reactivex.internal.operators.flowable.C23702b0.InterfaceC23707e
        /* renamed from: h */
        public void mo32826h(C23705c<T> c23705c) {
            int i;
            synchronized (c23705c) {
                if (c23705c.f88689f) {
                    c23705c.f88690g = true;
                    return;
                }
                c23705c.f88689f = true;
                InterfaceC42141hT5<? super T> interfaceC42141hT5 = c23705c.f88686c;
                while (!c23705c.mo1769e()) {
                    int i2 = this.f88706b;
                    Integer num = (Integer) c23705c.m32835a();
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    long j = c23705c.get();
                    long j2 = j;
                    long j3 = 0;
                    while (j2 != 0 && i < i2) {
                        Object obj = get(i);
                        try {
                            if (EnumC24479n.m32247a(obj, interfaceC42141hT5) || c23705c.mo1769e()) {
                                return;
                            }
                            i++;
                            j2--;
                            j3++;
                        } catch (Throwable th) {
                            C23475a.m33009b(th);
                            c23705c.dispose();
                            if (!EnumC24479n.m32237k(obj) && !EnumC24479n.m32238j(obj)) {
                                interfaceC42141hT5.onError(th);
                                return;
                            }
                            return;
                        }
                    }
                    if (j3 != 0) {
                        c23705c.f88687d = Integer.valueOf(i);
                        if (j != LongCompanionObject.MAX_VALUE) {
                            c23705c.m32834b(j3);
                        }
                    }
                    synchronized (c23705c) {
                        if (!c23705c.f88690g) {
                            c23705c.f88689f = false;
                            return;
                        }
                        c23705c.f88690g = false;
                    }
                }
            }
        }
    }

    public C23702b0(InterfaceC45761na4<T> interfaceC45761na4, AbstractC24490k<T> abstractC24490k, AtomicReference<C23710h<T>> atomicReference, Callable<? extends InterfaceC23707e<T>> callable) {
        this.f88681f = interfaceC45761na4;
        this.f88678c = abstractC24490k;
        this.f88679d = atomicReference;
        this.f88680e = callable;
    }

    /* renamed from: B1 */
    public static <T> AbstractC23477a<T> m32847B1(AbstractC24490k<T> abstractC24490k, int i) {
        if (i == Integer.MAX_VALUE) {
            return m32845D1(abstractC24490k);
        }
        return m32846C1(abstractC24490k, new CallableC23708f(i));
    }

    /* renamed from: C1 */
    public static <T> AbstractC23477a<T> m32846C1(AbstractC24490k<T> abstractC24490k, Callable<? extends InterfaceC23707e<T>> callable) {
        AtomicReference atomicReference = new AtomicReference();
        return C24508a.m31992q(new C23702b0(new C23709g(atomicReference, callable), abstractC24490k, atomicReference, callable));
    }

    /* renamed from: D1 */
    public static <T> AbstractC23477a<T> m32845D1(AbstractC24490k<? extends T> abstractC24490k) {
        return m32846C1(abstractC24490k, f88677g);
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88681f.mo23497c(interfaceC42141hT5);
    }

    @Override // io.reactivex.internal.disposables.InterfaceC23504g
    /* renamed from: d */
    public void mo32598d(InterfaceC23465c interfaceC23465c) {
        C42482i24.m35337a(this.f88679d, (C23710h) interfaceC23465c, null);
    }

    @Override // io.reactivex.flowables.AbstractC23477a
    /* renamed from: y1 */
    public void mo32844y1(InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g) {
        C23710h<T> c23710h;
        boolean z;
        while (true) {
            c23710h = this.f88679d.get();
            if (c23710h != null && !c23710h.mo1769e()) {
                break;
            }
            try {
                C23710h<T> c23710h2 = new C23710h<>(this.f88680e.call());
                if (C42482i24.m35337a(this.f88679d, c23710h, c23710h2)) {
                    c23710h = c23710h2;
                    break;
                }
            } finally {
                C23475a.m33009b(th);
                RuntimeException m32256e = C24475k.m32256e(th);
            }
        }
        if (!c23710h.f88701e.get() && c23710h.f88701e.compareAndSet(false, true)) {
            z = true;
        } else {
            z = false;
        }
        try {
            interfaceC23484g.accept(c23710h);
            if (z) {
                this.f88678c.m32166W0(c23710h);
            }
        } catch (Throwable th) {
            if (z) {
                c23710h.f88701e.compareAndSet(true, false);
            }
            throw C24475k.m32256e(th);
        }
    }
}
