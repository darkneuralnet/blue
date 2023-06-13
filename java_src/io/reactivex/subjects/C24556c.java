package io.reactivex.subjects;

import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24541s;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.subjects.c */
/* loaded from: classes8.dex */
public final class C24556c<T> extends AbstractC24507p<T> implements InterfaceC24541s<T> {

    /* renamed from: f */
    public static final C24557a[] f91222f = new C24557a[0];

    /* renamed from: g */
    public static final C24557a[] f91223g = new C24557a[0];

    /* renamed from: d */
    public T f91226d;

    /* renamed from: e */
    public Throwable f91227e;

    /* renamed from: c */
    public final AtomicBoolean f91225c = new AtomicBoolean();

    /* renamed from: b */
    public final AtomicReference<C24557a<T>[]> f91224b = new AtomicReference<>(f91222f);

    /* renamed from: io.reactivex.subjects.c$a */
    /* loaded from: classes8.dex */
    public static final class C24557a<T> extends AtomicReference<C24556c<T>> implements InterfaceC23465c {
        private static final long serialVersionUID = -7650903191002190468L;

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f91228b;

        public C24557a(InterfaceC24541s<? super T> interfaceC24541s, C24556c<T> c24556c) {
            this.f91228b = interfaceC24541s;
            lazySet(c24556c);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            C24556c<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m31904m0(this);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get() == null;
        }
    }

    /* renamed from: k0 */
    public static <T> C24556c<T> m31906k0() {
        return new C24556c<>();
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        C24557a<T> c24557a = new C24557a<>(interfaceC24541s, this);
        interfaceC24541s.onSubscribe(c24557a);
        if (m31907j0(c24557a)) {
            if (c24557a.mo1769e()) {
                m31904m0(c24557a);
                return;
            }
            return;
        }
        Throwable th = this.f91227e;
        if (th != null) {
            interfaceC24541s.onError(th);
            return;
        }
        Object obj = (T) this.f91226d;
        if (obj == null) {
            interfaceC24541s.onComplete();
        } else {
            interfaceC24541s.onSuccess(obj);
        }
    }

    /* renamed from: j0 */
    public boolean m31907j0(C24557a<T> c24557a) {
        C24557a<T>[] c24557aArr;
        C24557a[] c24557aArr2;
        do {
            c24557aArr = this.f91224b.get();
            if (c24557aArr == f91223g) {
                return false;
            }
            int length = c24557aArr.length;
            c24557aArr2 = new C24557a[length + 1];
            System.arraycopy(c24557aArr, 0, c24557aArr2, 0, length);
            c24557aArr2[length] = c24557a;
        } while (!C42482i24.m35337a(this.f91224b, c24557aArr, c24557aArr2));
        return true;
    }

    /* renamed from: l0 */
    public boolean m31905l0() {
        return this.f91224b.get() == f91223g && this.f91226d == null && this.f91227e == null;
    }

    /* renamed from: m0 */
    public void m31904m0(C24557a<T> c24557a) {
        C24557a<T>[] c24557aArr;
        C24557a[] c24557aArr2;
        do {
            c24557aArr = this.f91224b.get();
            int length = c24557aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i < length) {
                    if (c24557aArr[i] == c24557a) {
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
                c24557aArr2 = f91222f;
            } else {
                C24557a[] c24557aArr3 = new C24557a[length - 1];
                System.arraycopy(c24557aArr, 0, c24557aArr3, 0, i);
                System.arraycopy(c24557aArr, i + 1, c24557aArr3, i, (length - i) - 1);
                c24557aArr2 = c24557aArr3;
            }
        } while (!C42482i24.m35337a(this.f91224b, c24557aArr, c24557aArr2));
    }

    @Override // io.reactivex.InterfaceC24541s
    public void onComplete() {
        if (this.f91225c.compareAndSet(false, true)) {
            for (C24557a<T> c24557a : this.f91224b.getAndSet(f91223g)) {
                c24557a.f91228b.onComplete();
            }
        }
    }

    @Override // io.reactivex.InterfaceC24541s
    public void onError(Throwable th) {
        C23544b.m32923e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f91225c.compareAndSet(false, true)) {
            this.f91227e = th;
            for (C24557a<T> c24557a : this.f91224b.getAndSet(f91223g)) {
                c24557a.f91228b.onError(th);
            }
            return;
        }
        C24508a.m31988u(th);
    }

    @Override // io.reactivex.InterfaceC24541s
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        if (this.f91224b.get() == f91223g) {
            interfaceC23465c.dispose();
        }
    }

    @Override // io.reactivex.InterfaceC24541s
    public void onSuccess(T t) {
        C23544b.m32923e(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f91225c.compareAndSet(false, true)) {
            this.f91226d = t;
            for (C24557a<T> c24557a : this.f91224b.getAndSet(f91223g)) {
                c24557a.f91228b.onSuccess(t);
            }
        }
    }
}
