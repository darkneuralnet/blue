package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.operators.single.C24399w;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.single.G */
/* loaded from: classes6.dex */
public final class C24350G<T, R> extends AbstractC23442F<R> {

    /* renamed from: b */
    public final InterfaceC23447K<? extends T>[] f90778b;

    /* renamed from: c */
    public final InterfaceC23492o<? super Object[], ? extends R> f90779c;

    /* renamed from: io.reactivex.internal.operators.single.G$a */
    /* loaded from: classes6.dex */
    public final class C24351a implements InterfaceC23492o<T, R> {
        public C24351a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // io.reactivex.functions.InterfaceC23492o
        public R apply(T t) throws Exception {
            return (R) C23544b.m32923e(C24350G.this.f90779c.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    /* renamed from: io.reactivex.internal.operators.single.G$b */
    /* loaded from: classes6.dex */
    public static final class C24352b<T, R> extends AtomicInteger implements InterfaceC23465c {
        private static final long serialVersionUID = -5556924161382950569L;

        /* renamed from: b */
        public final InterfaceC23445I<? super R> f90781b;

        /* renamed from: c */
        public final InterfaceC23492o<? super Object[], ? extends R> f90782c;

        /* renamed from: d */
        public final C24353c<T>[] f90783d;

        /* renamed from: e */
        public final Object[] f90784e;

        public C24352b(InterfaceC23445I<? super R> interfaceC23445I, int i, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o) {
            super(i);
            this.f90781b = interfaceC23445I;
            this.f90782c = interfaceC23492o;
            C24353c<T>[] c24353cArr = new C24353c[i];
            for (int i2 = 0; i2 < i; i2++) {
                c24353cArr[i2] = new C24353c<>(this, i2);
            }
            this.f90783d = c24353cArr;
            this.f90784e = new Object[i];
        }

        /* renamed from: a */
        public void m32401a(int i) {
            C24353c<T>[] c24353cArr = this.f90783d;
            int length = c24353cArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                c24353cArr[i2].m32398a();
            }
            while (true) {
                i++;
                if (i < length) {
                    c24353cArr[i].m32398a();
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public void m32400b(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                m32401a(i);
                this.f90781b.onError(th);
                return;
            }
            C24508a.m31988u(th);
        }

        /* renamed from: c */
        public void m32399c(T t, int i) {
            this.f90784e[i] = t;
            if (decrementAndGet() == 0) {
                try {
                    this.f90781b.onSuccess(C23544b.m32923e(this.f90782c.apply(this.f90784e), "The zipper returned a null value"));
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    this.f90781b.onError(th);
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (C24353c<T> c24353c : this.f90783d) {
                    c24353c.m32398a();
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get() <= 0;
        }
    }

    /* renamed from: io.reactivex.internal.operators.single.G$c */
    /* loaded from: classes6.dex */
    public static final class C24353c<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23445I<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        /* renamed from: b */
        public final C24352b<T, ?> f90785b;

        /* renamed from: c */
        public final int f90786c;

        public C24353c(C24352b<T, ?> c24352b, int i) {
            this.f90785b = c24352b;
            this.f90786c = i;
        }

        /* renamed from: a */
        public void m32398a() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            this.f90785b.m32400b(th, this.f90786c);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            this.f90785b.m32399c(t, this.f90786c);
        }
    }

    public C24350G(InterfaceC23447K<? extends T>[] interfaceC23447KArr, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o) {
        this.f90778b = interfaceC23447KArr;
        this.f90779c = interfaceC23492o;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super R> interfaceC23445I) {
        InterfaceC23447K<? extends T>[] interfaceC23447KArr = this.f90778b;
        int length = interfaceC23447KArr.length;
        if (length == 1) {
            interfaceC23447KArr[0].mo33096a(new C24399w.C24400a(interfaceC23445I, new C24351a()));
            return;
        }
        C24352b c24352b = new C24352b(interfaceC23445I, length, this.f90779c);
        interfaceC23445I.onSubscribe(c24352b);
        for (int i = 0; i < length && !c24352b.mo1769e(); i++) {
            InterfaceC23447K<? extends T> interfaceC23447K = interfaceC23447KArr[i];
            if (interfaceC23447K == null) {
                c24352b.m32400b(new NullPointerException("One of the sources is null"), i);
                return;
            }
            interfaceC23447K.mo33096a(c24352b.f90783d[i]);
        }
    }
}
