package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.util.C24467c;
import io.reactivex.internal.util.C24477l;
import io.reactivex.plugins.C24508a;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* renamed from: io.reactivex.internal.operators.observable.N1 */
/* loaded from: classes6.dex */
public final class C24067N1<T, R> extends AbstractC24145a<T, R> {

    /* renamed from: c */
    public final InterfaceC23434B<?>[] f89823c;

    /* renamed from: d */
    public final Iterable<? extends InterfaceC23434B<?>> f89824d;

    /* renamed from: e */
    public final InterfaceC23492o<? super Object[], R> f89825e;

    /* renamed from: io.reactivex.internal.operators.observable.N1$a */
    /* loaded from: classes6.dex */
    public final class C24068a implements InterfaceC23492o<T, R> {
        public C24068a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // io.reactivex.functions.InterfaceC23492o
        public R apply(T t) throws Exception {
            return (R) C23544b.m32923e(C24067N1.this.f89825e.apply(new Object[]{t}), "The combiner returned a null value");
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.N1$b */
    /* loaded from: classes6.dex */
    public static final class C24069b<T, R> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = 1577321883966341961L;

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f89827b;

        /* renamed from: c */
        public final InterfaceC23492o<? super Object[], R> f89828c;

        /* renamed from: d */
        public final C24070c[] f89829d;

        /* renamed from: e */
        public final AtomicReferenceArray<Object> f89830e;

        /* renamed from: f */
        public final AtomicReference<InterfaceC23465c> f89831f;

        /* renamed from: g */
        public final C24467c f89832g;

        /* renamed from: h */
        public volatile boolean f89833h;

        public C24069b(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23492o<? super Object[], R> interfaceC23492o, int i) {
            this.f89827b = interfaceC23436D;
            this.f89828c = interfaceC23492o;
            C24070c[] c24070cArr = new C24070c[i];
            for (int i2 = 0; i2 < i; i2++) {
                c24070cArr[i2] = new C24070c(this, i2);
            }
            this.f89829d = c24070cArr;
            this.f89830e = new AtomicReferenceArray<>(i);
            this.f89831f = new AtomicReference<>();
            this.f89832g = new C24467c();
        }

        /* renamed from: a */
        public void m32625a(int i) {
            C24070c[] c24070cArr = this.f89829d;
            for (int i2 = 0; i2 < c24070cArr.length; i2++) {
                if (i2 != i) {
                    c24070cArr[i2].m32620a();
                }
            }
        }

        /* renamed from: b */
        public void m32624b(int i, boolean z) {
            if (!z) {
                this.f89833h = true;
                m32625a(i);
                C24477l.m32254b(this.f89827b, this, this.f89832g);
            }
        }

        /* renamed from: c */
        public void m32623c(int i, Throwable th) {
            this.f89833h = true;
            EnumC23501d.m33000a(this.f89831f);
            m32625a(i);
            C24477l.m32252d(this.f89827b, th, this, this.f89832g);
        }

        /* renamed from: d */
        public void m32622d(int i, Object obj) {
            this.f89830e.set(i, obj);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this.f89831f);
            for (C24070c c24070c : this.f89829d) {
                c24070c.m32620a();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(this.f89831f.get());
        }

        /* renamed from: g */
        public void m32621g(InterfaceC23434B<?>[] interfaceC23434BArr, int i) {
            C24070c[] c24070cArr = this.f89829d;
            AtomicReference<InterfaceC23465c> atomicReference = this.f89831f;
            for (int i2 = 0; i2 < i && !EnumC23501d.m32999b(atomicReference.get()) && !this.f89833h; i2++) {
                interfaceC23434BArr[i2].subscribe(c24070cArr[i2]);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (!this.f89833h) {
                this.f89833h = true;
                m32625a(-1);
                C24477l.m32254b(this.f89827b, this, this.f89832g);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89833h) {
                C24508a.m31988u(th);
                return;
            }
            this.f89833h = true;
            m32625a(-1);
            C24477l.m32252d(this.f89827b, th, this, this.f89832g);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f89833h) {
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f89830e;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            int i = 0;
            objArr[0] = t;
            while (i < length) {
                Object obj = atomicReferenceArray.get(i);
                if (obj == null) {
                    return;
                }
                i++;
                objArr[i] = obj;
            }
            try {
                C24477l.m32250f(this.f89827b, C23544b.m32923e(this.f89828c.apply(objArr), "combiner returned a null value"), this, this.f89832g);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this.f89831f, interfaceC23465c);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.N1$c */
    /* loaded from: classes6.dex */
    public static final class C24070c extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<Object> {
        private static final long serialVersionUID = 3256684027868224024L;

        /* renamed from: b */
        public final C24069b<?, ?> f89834b;

        /* renamed from: c */
        public final int f89835c;

        /* renamed from: d */
        public boolean f89836d;

        public C24070c(C24069b<?, ?> c24069b, int i) {
            this.f89834b = c24069b;
            this.f89835c = i;
        }

        /* renamed from: a */
        public void m32620a() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89834b.m32624b(this.f89835c, this.f89836d);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f89834b.m32623c(this.f89835c, th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(Object obj) {
            if (!this.f89836d) {
                this.f89836d = true;
            }
            this.f89834b.m32622d(this.f89835c, obj);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }
    }

    public C24067N1(InterfaceC23434B<T> interfaceC23434B, InterfaceC23434B<?>[] interfaceC23434BArr, InterfaceC23492o<? super Object[], R> interfaceC23492o) {
        super(interfaceC23434B);
        this.f89823c = interfaceC23434BArr;
        this.f89824d = null;
        this.f89825e = interfaceC23492o;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        int length;
        InterfaceC23434B<?>[] interfaceC23434BArr = this.f89823c;
        if (interfaceC23434BArr == null) {
            interfaceC23434BArr = new InterfaceC23434B[8];
            try {
                length = 0;
                for (InterfaceC23434B<?> interfaceC23434B : this.f89824d) {
                    if (length == interfaceC23434BArr.length) {
                        interfaceC23434BArr = (InterfaceC23434B[]) Arrays.copyOf(interfaceC23434BArr, (length >> 1) + length);
                    }
                    int i = length + 1;
                    interfaceC23434BArr[length] = interfaceC23434B;
                    length = i;
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                EnumC23502e.m32987i(th, interfaceC23436D);
                return;
            }
        } else {
            length = interfaceC23434BArr.length;
        }
        if (length == 0) {
            new C24321x0(this.f90078b, new C24068a()).subscribeActual(interfaceC23436D);
            return;
        }
        C24069b c24069b = new C24069b(interfaceC23436D, this.f89825e, length);
        interfaceC23436D.onSubscribe(c24069b);
        c24069b.m32621g(interfaceC23434BArr, length);
        this.f90078b.subscribe(c24069b);
    }

    public C24067N1(InterfaceC23434B<T> interfaceC23434B, Iterable<? extends InterfaceC23434B<?>> iterable, InterfaceC23492o<? super Object[], R> interfaceC23492o) {
        super(interfaceC23434B);
        this.f89823c = null;
        this.f89824d = iterable;
        this.f89825e = interfaceC23492o;
    }
}
