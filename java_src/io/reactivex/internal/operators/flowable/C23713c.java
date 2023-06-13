package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.operators.flowable.C23655J;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.subscriptions.AbstractC24457a;
import io.reactivex.internal.subscriptions.EnumC24460d;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import io.reactivex.internal.util.C24475k;
import io.reactivex.plugins.C24508a;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.c */
/* loaded from: classes6.dex */
public final class C23713c<T, R> extends AbstractC24490k<R> {

    /* renamed from: c */
    public final InterfaceC45761na4<? extends T>[] f88707c;

    /* renamed from: d */
    public final Iterable<? extends InterfaceC45761na4<? extends T>> f88708d = null;

    /* renamed from: e */
    public final InterfaceC23492o<? super Object[], ? extends R> f88709e;

    /* renamed from: f */
    public final int f88710f;

    /* renamed from: g */
    public final boolean f88711g;

    /* renamed from: io.reactivex.internal.operators.flowable.c$a */
    /* loaded from: classes6.dex */
    public static final class C23714a<T, R> extends AbstractC24457a<R> {
        private static final long serialVersionUID = -5082275438355852221L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super R> f88712b;

        /* renamed from: c */
        public final InterfaceC23492o<? super Object[], ? extends R> f88713c;

        /* renamed from: d */
        public final C23715b<T>[] f88714d;

        /* renamed from: e */
        public final C24409c<Object> f88715e;

        /* renamed from: f */
        public final Object[] f88716f;

        /* renamed from: g */
        public final boolean f88717g;

        /* renamed from: h */
        public boolean f88718h;

        /* renamed from: i */
        public int f88719i;

        /* renamed from: j */
        public int f88720j;

        /* renamed from: k */
        public volatile boolean f88721k;

        /* renamed from: l */
        public final AtomicLong f88722l;

        /* renamed from: m */
        public volatile boolean f88723m;

        /* renamed from: n */
        public final AtomicReference<Throwable> f88724n;

        public C23714a(InterfaceC42141hT5<? super R> interfaceC42141hT5, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, int i, int i2, boolean z) {
            this.f88712b = interfaceC42141hT5;
            this.f88713c = interfaceC23492o;
            C23715b<T>[] c23715bArr = new C23715b[i];
            for (int i3 = 0; i3 < i; i3++) {
                c23715bArr[i3] = new C23715b<>(this, i3, i2);
            }
            this.f88714d = c23715bArr;
            this.f88716f = new Object[i];
            this.f88715e = new C24409c<>(i2);
            this.f88722l = new AtomicLong();
            this.f88724n = new AtomicReference<>();
            this.f88717g = z;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            if ((i & 4) != 0) {
                return 0;
            }
            int i2 = i & 2;
            this.f88718h = i2 != 0;
            return i2;
        }

        /* renamed from: c */
        public void m32825c() {
            for (C23715b<T> c23715b : this.f88714d) {
                c23715b.m32816b();
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f88721k = true;
            m32825c();
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public void clear() {
            this.f88715e.clear();
        }

        /* renamed from: d */
        public boolean m32824d(boolean z, boolean z2, InterfaceC42141hT5<?> interfaceC42141hT5, C24409c<?> c24409c) {
            if (this.f88721k) {
                m32825c();
                c24409c.clear();
                return true;
            } else if (z) {
                if (this.f88717g) {
                    if (z2) {
                        m32825c();
                        Throwable m32259b = C24475k.m32259b(this.f88724n);
                        if (m32259b != null && m32259b != C24475k.f91077a) {
                            interfaceC42141hT5.onError(m32259b);
                        } else {
                            interfaceC42141hT5.onComplete();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable m32259b2 = C24475k.m32259b(this.f88724n);
                if (m32259b2 != null && m32259b2 != C24475k.f91077a) {
                    m32825c();
                    c24409c.clear();
                    interfaceC42141hT5.onError(m32259b2);
                    return true;
                } else if (z2) {
                    m32825c();
                    interfaceC42141hT5.onComplete();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        /* renamed from: e */
        public void m32823e() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f88718h) {
                m32821i();
            } else {
                m32822g();
            }
        }

        /* renamed from: g */
        public void m32822g() {
            int i;
            boolean z;
            InterfaceC42141hT5<? super R> interfaceC42141hT5 = this.f88712b;
            C24409c<?> c24409c = this.f88715e;
            int i2 = 1;
            do {
                long j = this.f88722l.get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.f88723m;
                    Object poll = c24409c.poll();
                    if (poll == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (m32824d(z2, z, interfaceC42141hT5, c24409c)) {
                        return;
                    }
                    if (z) {
                        break;
                    }
                    try {
                        interfaceC42141hT5.onNext((Object) C23544b.m32923e(this.f88713c.apply((Object[]) c24409c.poll()), "The combiner returned a null value"));
                        ((C23715b) poll).m32815c();
                        j2++;
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        m32825c();
                        C24475k.m32260a(this.f88724n, th);
                        interfaceC42141hT5.onError(C24475k.m32259b(this.f88724n));
                        return;
                    }
                }
                if (i == 0 && m32824d(this.f88723m, c24409c.isEmpty(), interfaceC42141hT5, c24409c)) {
                    return;
                }
                if (j2 != 0 && j != LongCompanionObject.MAX_VALUE) {
                    this.f88722l.addAndGet(-j2);
                }
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }

        /* renamed from: i */
        public void m32821i() {
            InterfaceC42141hT5<? super R> interfaceC42141hT5 = this.f88712b;
            C24409c<Object> c24409c = this.f88715e;
            int i = 1;
            while (!this.f88721k) {
                Throwable th = this.f88724n.get();
                if (th != null) {
                    c24409c.clear();
                    interfaceC42141hT5.onError(th);
                    return;
                }
                boolean z = this.f88723m;
                boolean isEmpty = c24409c.isEmpty();
                if (!isEmpty) {
                    interfaceC42141hT5.onNext(null);
                }
                if (z && isEmpty) {
                    interfaceC42141hT5.onComplete();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            c24409c.clear();
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public boolean isEmpty() {
            return this.f88715e.isEmpty();
        }

        /* renamed from: j */
        public void m32820j(int i) {
            synchronized (this) {
                Object[] objArr = this.f88716f;
                if (objArr[i] != null) {
                    int i2 = this.f88720j + 1;
                    if (i2 == objArr.length) {
                        this.f88723m = true;
                    } else {
                        this.f88720j = i2;
                        return;
                    }
                } else {
                    this.f88723m = true;
                }
                m32823e();
            }
        }

        /* renamed from: k */
        public void m32819k(int i, Throwable th) {
            if (C24475k.m32260a(this.f88724n, th)) {
                if (!this.f88717g) {
                    m32825c();
                    this.f88723m = true;
                    m32823e();
                    return;
                }
                m32820j(i);
                return;
            }
            C24508a.m31988u(th);
        }

        /* renamed from: l */
        public void m32818l(int i, T t) {
            boolean z;
            synchronized (this) {
                Object[] objArr = this.f88716f;
                int i2 = this.f88719i;
                if (objArr[i] == null) {
                    i2++;
                    this.f88719i = i2;
                }
                objArr[i] = t;
                if (objArr.length == i2) {
                    this.f88715e.m32365m(this.f88714d[i], objArr.clone());
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                this.f88714d[i].m32815c();
            } else {
                m32823e();
            }
        }

        /* renamed from: m */
        public void m32817m(InterfaceC45761na4<? extends T>[] interfaceC45761na4Arr, int i) {
            C23715b<T>[] c23715bArr = this.f88714d;
            for (int i2 = 0; i2 < i && !this.f88723m && !this.f88721k; i2++) {
                interfaceC45761na4Arr[i2].mo23497c(c23715bArr[i2]);
            }
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32274a(this.f88722l, j);
                m32823e();
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public R poll() throws Exception {
            Object poll = this.f88715e.poll();
            if (poll == null) {
                return null;
            }
            R r = (R) C23544b.m32923e(this.f88713c.apply((Object[]) this.f88715e.poll()), "The combiner returned a null value");
            ((C23715b) poll).m32815c();
            return r;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.c$b */
    /* loaded from: classes6.dex */
    public static final class C23715b<T> extends AtomicReference<InterfaceC46292oT5> implements InterfaceC24494o<T> {
        private static final long serialVersionUID = -8730235182291002949L;

        /* renamed from: b */
        public final C23714a<T, ?> f88725b;

        /* renamed from: c */
        public final int f88726c;

        /* renamed from: d */
        public final int f88727d;

        /* renamed from: e */
        public final int f88728e;

        /* renamed from: f */
        public int f88729f;

        public C23715b(C23714a<T, ?> c23714a, int i, int i2) {
            this.f88725b = c23714a;
            this.f88726c = i;
            this.f88727d = i2;
            this.f88728e = i2 - (i2 >> 2);
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            EnumC24463g.m32288g(this, interfaceC46292oT5, this.f88727d);
        }

        /* renamed from: b */
        public void m32816b() {
            EnumC24463g.m32294a(this);
        }

        /* renamed from: c */
        public void m32815c() {
            int i = this.f88729f + 1;
            if (i == this.f88728e) {
                this.f88729f = 0;
                get().mo21023o(i);
                return;
            }
            this.f88729f = i;
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88725b.m32820j(this.f88726c);
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f88725b.m32819k(this.f88726c, th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            this.f88725b.m32818l(this.f88726c, t);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.c$c */
    /* loaded from: classes6.dex */
    public final class C23716c implements InterfaceC23492o<T, R> {
        public C23716c() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // io.reactivex.functions.InterfaceC23492o
        public R apply(T t) throws Exception {
            return C23713c.this.f88709e.apply(new Object[]{t});
        }
    }

    public C23713c(InterfaceC45761na4<? extends T>[] interfaceC45761na4Arr, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, int i, boolean z) {
        this.f88707c = interfaceC45761na4Arr;
        this.f88709e = interfaceC23492o;
        this.f88710f = i;
        this.f88711g = z;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super R> interfaceC42141hT5) {
        int length;
        InterfaceC45761na4<? extends T>[] interfaceC45761na4Arr = this.f88707c;
        if (interfaceC45761na4Arr == null) {
            interfaceC45761na4Arr = new InterfaceC45761na4[8];
            try {
                Iterator it = (Iterator) C23544b.m32923e(this.f88708d.iterator(), "The iterator returned is null");
                length = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            InterfaceC45761na4<? extends T> interfaceC45761na4 = (InterfaceC45761na4) C23544b.m32923e(it.next(), "The publisher returned by the iterator is null");
                            if (length == interfaceC45761na4Arr.length) {
                                InterfaceC45761na4<? extends T>[] interfaceC45761na4Arr2 = new InterfaceC45761na4[(length >> 2) + length];
                                System.arraycopy(interfaceC45761na4Arr, 0, interfaceC45761na4Arr2, 0, length);
                                interfaceC45761na4Arr = interfaceC45761na4Arr2;
                            }
                            interfaceC45761na4Arr[length] = interfaceC45761na4;
                            length++;
                        } catch (Throwable th) {
                            C23475a.m33009b(th);
                            EnumC24460d.m32300c(th, interfaceC42141hT5);
                            return;
                        }
                    } catch (Throwable th2) {
                        C23475a.m33009b(th2);
                        EnumC24460d.m32300c(th2, interfaceC42141hT5);
                        return;
                    }
                }
            } catch (Throwable th3) {
                C23475a.m33009b(th3);
                EnumC24460d.m32300c(th3, interfaceC42141hT5);
                return;
            }
        } else {
            length = interfaceC45761na4Arr.length;
        }
        int i = length;
        if (i == 0) {
            EnumC24460d.m32301a(interfaceC42141hT5);
        } else if (i == 1) {
            interfaceC45761na4Arr[0].mo23497c(new C23655J.C23657b(interfaceC42141hT5, new C23716c()));
        } else {
            C23714a c23714a = new C23714a(interfaceC42141hT5, this.f88709e, i, this.f88710f, this.f88711g);
            interfaceC42141hT5.mo31867a(c23714a);
            c23714a.m32817m(interfaceC45761na4Arr, i);
        }
    }
}
