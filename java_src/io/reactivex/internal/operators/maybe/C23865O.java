package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.operators.maybe.C23917z;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.maybe.O */
/* loaded from: classes6.dex */
public final class C23865O<T, R> extends AbstractC24507p<R> {

    /* renamed from: b */
    public final InterfaceC24574u<? extends T>[] f89197b;

    /* renamed from: c */
    public final InterfaceC23492o<? super Object[], ? extends R> f89198c;

    /* renamed from: io.reactivex.internal.operators.maybe.O$a */
    /* loaded from: classes6.dex */
    public final class C23866a implements InterfaceC23492o<T, R> {
        public C23866a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // io.reactivex.functions.InterfaceC23492o
        public R apply(T t) throws Exception {
            return (R) C23544b.m32923e(C23865O.this.f89198c.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    /* renamed from: io.reactivex.internal.operators.maybe.O$b */
    /* loaded from: classes6.dex */
    public static final class C23867b<T, R> extends AtomicInteger implements InterfaceC23465c {
        private static final long serialVersionUID = -5556924161382950569L;

        /* renamed from: b */
        public final InterfaceC24541s<? super R> f89200b;

        /* renamed from: c */
        public final InterfaceC23492o<? super Object[], ? extends R> f89201c;

        /* renamed from: d */
        public final C23868c<T>[] f89202d;

        /* renamed from: e */
        public final Object[] f89203e;

        public C23867b(InterfaceC24541s<? super R> interfaceC24541s, int i, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o) {
            super(i);
            this.f89200b = interfaceC24541s;
            this.f89201c = interfaceC23492o;
            C23868c<T>[] c23868cArr = new C23868c[i];
            for (int i2 = 0; i2 < i; i2++) {
                c23868cArr[i2] = new C23868c<>(this, i2);
            }
            this.f89202d = c23868cArr;
            this.f89203e = new Object[i];
        }

        /* renamed from: a */
        public void m32739a(int i) {
            C23868c<T>[] c23868cArr = this.f89202d;
            int length = c23868cArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                c23868cArr[i2].m32735a();
            }
            while (true) {
                i++;
                if (i < length) {
                    c23868cArr[i].m32735a();
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public void m32738b(int i) {
            if (getAndSet(0) > 0) {
                m32739a(i);
                this.f89200b.onComplete();
            }
        }

        /* renamed from: c */
        public void m32737c(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                m32739a(i);
                this.f89200b.onError(th);
                return;
            }
            C24508a.m31988u(th);
        }

        /* renamed from: d */
        public void m32736d(T t, int i) {
            this.f89203e[i] = t;
            if (decrementAndGet() == 0) {
                try {
                    this.f89200b.onSuccess(C23544b.m32923e(this.f89201c.apply(this.f89203e), "The zipper returned a null value"));
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    this.f89200b.onError(th);
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (C23868c<T> c23868c : this.f89202d) {
                    c23868c.m32735a();
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get() <= 0;
        }
    }

    /* renamed from: io.reactivex.internal.operators.maybe.O$c */
    /* loaded from: classes6.dex */
    public static final class C23868c<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        /* renamed from: b */
        public final C23867b<T, ?> f89204b;

        /* renamed from: c */
        public final int f89205c;

        public C23868c(C23867b<T, ?> c23867b, int i) {
            this.f89204b = c23867b;
            this.f89205c = i;
        }

        /* renamed from: a */
        public void m32735a() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89204b.m32738b(this.f89205c);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89204b.m32737c(th, this.f89205c);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            this.f89204b.m32736d(t, this.f89205c);
        }
    }

    public C23865O(InterfaceC24574u<? extends T>[] interfaceC24574uArr, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o) {
        this.f89197b = interfaceC24574uArr;
        this.f89198c = interfaceC23492o;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super R> interfaceC24541s) {
        InterfaceC24574u<? extends T>[] interfaceC24574uArr = this.f89197b;
        int length = interfaceC24574uArr.length;
        if (length == 1) {
            interfaceC24574uArr[0].mo31865a(new C23917z.C23918a(interfaceC24541s, new C23866a()));
            return;
        }
        C23867b c23867b = new C23867b(interfaceC24541s, length, this.f89198c);
        interfaceC24541s.onSubscribe(c23867b);
        for (int i = 0; i < length && !c23867b.mo1769e(); i++) {
            InterfaceC24574u<? extends T> interfaceC24574u = interfaceC24574uArr[i];
            if (interfaceC24574u == null) {
                c23867b.m32737c(new NullPointerException("One of the sources is null"), i);
                return;
            }
            interfaceC24574u.mo31865a(c23867b.f89202d[i]);
        }
    }
}
