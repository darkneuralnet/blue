package io.reactivex.subjects;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.subjects.g */
/* loaded from: classes8.dex */
public final class C24567g<T> extends AbstractC23442F<T> implements InterfaceC23445I<T> {

    /* renamed from: f */
    public static final C24568a[] f91262f = new C24568a[0];

    /* renamed from: g */
    public static final C24568a[] f91263g = new C24568a[0];

    /* renamed from: d */
    public T f91266d;

    /* renamed from: e */
    public Throwable f91267e;

    /* renamed from: c */
    public final AtomicBoolean f91265c = new AtomicBoolean();

    /* renamed from: b */
    public final AtomicReference<C24568a<T>[]> f91264b = new AtomicReference<>(f91262f);

    /* renamed from: io.reactivex.subjects.g$a */
    /* loaded from: classes8.dex */
    public static final class C24568a<T> extends AtomicReference<C24567g<T>> implements InterfaceC23465c {
        private static final long serialVersionUID = -7650903191002190468L;

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f91268b;

        public C24568a(InterfaceC23445I<? super T> interfaceC23445I, C24567g<T> c24567g) {
            this.f91268b = interfaceC23445I;
            lazySet(c24567g);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            C24567g<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m31884A0(this);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get() == null;
        }
    }

    /* renamed from: w0 */
    public static <T> C24567g<T> m31882w0() {
        return new C24567g<>();
    }

    /* renamed from: A0 */
    public void m31884A0(C24568a<T> c24568a) {
        C24568a<T>[] c24568aArr;
        C24568a[] c24568aArr2;
        do {
            c24568aArr = this.f91264b.get();
            int length = c24568aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i < length) {
                    if (c24568aArr[i] == c24568a) {
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
                c24568aArr2 = f91262f;
            } else {
                C24568a[] c24568aArr3 = new C24568a[length - 1];
                System.arraycopy(c24568aArr, 0, c24568aArr3, 0, i);
                System.arraycopy(c24568aArr, i + 1, c24568aArr3, i, (length - i) - 1);
                c24568aArr2 = c24568aArr3;
            }
        } while (!C42482i24.m35337a(this.f91264b, c24568aArr, c24568aArr2));
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        C24568a<T> c24568a = new C24568a<>(interfaceC23445I, this);
        interfaceC23445I.onSubscribe(c24568a);
        if (m31883v0(c24568a)) {
            if (c24568a.mo1769e()) {
                m31884A0(c24568a);
                return;
            }
            return;
        }
        Throwable th = this.f91267e;
        if (th != null) {
            interfaceC23445I.onError(th);
        } else {
            interfaceC23445I.onSuccess((T) this.f91266d);
        }
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onError(Throwable th) {
        C23544b.m32923e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f91265c.compareAndSet(false, true)) {
            this.f91267e = th;
            for (C24568a<T> c24568a : this.f91264b.getAndSet(f91263g)) {
                c24568a.f91268b.onError(th);
            }
            return;
        }
        C24508a.m31988u(th);
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        if (this.f91264b.get() == f91263g) {
            interfaceC23465c.dispose();
        }
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onSuccess(T t) {
        C23544b.m32923e(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f91265c.compareAndSet(false, true)) {
            this.f91266d = t;
            for (C24568a<T> c24568a : this.f91264b.getAndSet(f91263g)) {
                c24568a.f91268b.onSuccess(t);
            }
        }
    }

    /* renamed from: v0 */
    public boolean m31883v0(C24568a<T> c24568a) {
        C24568a<T>[] c24568aArr;
        C24568a[] c24568aArr2;
        do {
            c24568aArr = this.f91264b.get();
            if (c24568aArr == f91263g) {
                return false;
            }
            int length = c24568aArr.length;
            c24568aArr2 = new C24568a[length + 1];
            System.arraycopy(c24568aArr, 0, c24568aArr2, 0, length);
            c24568aArr2[length] = c24568a;
        } while (!C42482i24.m35337a(this.f91264b, c24568aArr, c24568aArr2));
        return true;
    }

    /* renamed from: x0 */
    public T m31881x0() {
        if (this.f91264b.get() == f91263g) {
            return this.f91266d;
        }
        return null;
    }

    /* renamed from: y0 */
    public boolean m31880y0() {
        return this.f91264b.get() == f91263g && this.f91267e != null;
    }

    /* renamed from: z0 */
    public boolean m31879z0() {
        return this.f91264b.get() == f91263g && this.f91266d != null;
    }
}
