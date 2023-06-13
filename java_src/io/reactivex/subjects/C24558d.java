package io.reactivex.subjects;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.subjects.d */
/* loaded from: classes8.dex */
public final class C24558d<T> extends AbstractC24569h<T> {

    /* renamed from: d */
    public static final C24559a[] f91229d = new C24559a[0];

    /* renamed from: e */
    public static final C24559a[] f91230e = new C24559a[0];

    /* renamed from: b */
    public final AtomicReference<C24559a<T>[]> f91231b = new AtomicReference<>(f91230e);

    /* renamed from: c */
    public Throwable f91232c;

    /* renamed from: io.reactivex.subjects.d$a */
    /* loaded from: classes8.dex */
    public static final class C24559a<T> extends AtomicBoolean implements InterfaceC23465c {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f91233b;

        /* renamed from: c */
        public final C24558d<T> f91234c;

        public C24559a(InterfaceC23436D<? super T> interfaceC23436D, C24558d<T> c24558d) {
            this.f91233b = interfaceC23436D;
            this.f91234c = c24558d;
        }

        /* renamed from: a */
        public void m31899a() {
            if (!get()) {
                this.f91233b.onComplete();
            }
        }

        /* renamed from: b */
        public void m31898b(Throwable th) {
            if (get()) {
                C24508a.m31988u(th);
            } else {
                this.f91233b.onError(th);
            }
        }

        /* renamed from: c */
        public void m31897c(T t) {
            if (!get()) {
                this.f91233b.onNext(t);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f91234c.m31900h(this);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get();
        }
    }

    /* renamed from: e */
    public static <T> C24558d<T> m31902e() {
        return new C24558d<>();
    }

    /* renamed from: c */
    public boolean m31903c(C24559a<T> c24559a) {
        C24559a<T>[] c24559aArr;
        C24559a[] c24559aArr2;
        do {
            c24559aArr = this.f91231b.get();
            if (c24559aArr == f91229d) {
                return false;
            }
            int length = c24559aArr.length;
            c24559aArr2 = new C24559a[length + 1];
            System.arraycopy(c24559aArr, 0, c24559aArr2, 0, length);
            c24559aArr2[length] = c24559a;
        } while (!C42482i24.m35337a(this.f91231b, c24559aArr, c24559aArr2));
        return true;
    }

    /* renamed from: g */
    public boolean m31901g() {
        return this.f91231b.get() == f91229d && this.f91232c == null;
    }

    /* renamed from: h */
    public void m31900h(C24559a<T> c24559a) {
        C24559a<T>[] c24559aArr;
        C24559a[] c24559aArr2;
        do {
            c24559aArr = this.f91231b.get();
            if (c24559aArr != f91229d && c24559aArr != f91230e) {
                int length = c24559aArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (c24559aArr[i] == c24559a) {
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
                    c24559aArr2 = f91230e;
                } else {
                    C24559a[] c24559aArr3 = new C24559a[length - 1];
                    System.arraycopy(c24559aArr, 0, c24559aArr3, 0, i);
                    System.arraycopy(c24559aArr, i + 1, c24559aArr3, i, (length - i) - 1);
                    c24559aArr2 = c24559aArr3;
                }
            } else {
                return;
            }
        } while (!C42482i24.m35337a(this.f91231b, c24559aArr, c24559aArr2));
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        C24559a<T>[] c24559aArr = this.f91231b.get();
        C24559a<T>[] c24559aArr2 = f91229d;
        if (c24559aArr == c24559aArr2) {
            return;
        }
        for (C24559a<T> c24559a : this.f91231b.getAndSet(c24559aArr2)) {
            c24559a.m31899a();
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        C23544b.m32923e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C24559a<T>[] c24559aArr = this.f91231b.get();
        C24559a<T>[] c24559aArr2 = f91229d;
        if (c24559aArr == c24559aArr2) {
            C24508a.m31988u(th);
            return;
        }
        this.f91232c = th;
        for (C24559a<T> c24559a : this.f91231b.getAndSet(c24559aArr2)) {
            c24559a.m31898b(th);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        C23544b.m32923e(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C24559a<T> c24559a : this.f91231b.get()) {
            c24559a.m31897c(t);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        if (this.f91231b.get() == f91229d) {
            interfaceC23465c.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C24559a<T> c24559a = new C24559a<>(interfaceC23436D, this);
        interfaceC23436D.onSubscribe(c24559a);
        if (m31903c(c24559a)) {
            if (c24559a.mo1769e()) {
                m31900h(c24559a);
                return;
            }
            return;
        }
        Throwable th = this.f91232c;
        if (th != null) {
            interfaceC23436D.onError(th);
        } else {
            interfaceC23436D.onComplete();
        }
    }
}
