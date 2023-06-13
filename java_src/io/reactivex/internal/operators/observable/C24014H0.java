package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.util.C24475k;
import io.reactivex.observables.AbstractC24495a;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.H0 */
/* loaded from: classes6.dex */
public final class C24014H0<T> extends AbstractC24495a<T> implements InterfaceC24031J0<T> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f89633b;

    /* renamed from: c */
    public final AtomicReference<C24016b<T>> f89634c;

    /* renamed from: d */
    public final InterfaceC23434B<T> f89635d;

    /* renamed from: io.reactivex.internal.operators.observable.H0$a */
    /* loaded from: classes6.dex */
    public static final class C24015a<T> extends AtomicReference<Object> implements InterfaceC23465c {
        private static final long serialVersionUID = -1100270633763673112L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89636b;

        public C24015a(InterfaceC23436D<? super T> interfaceC23436D) {
            this.f89636b = interfaceC23436D;
        }

        /* renamed from: a */
        public void m32657a(C24016b<T> c24016b) {
            if (!compareAndSet(null, c24016b)) {
                c24016b.m32655b(this);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((C24016b) andSet).m32655b(this);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get() == this;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.H0$b */
    /* loaded from: classes6.dex */
    public static final class C24016b<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: f */
        public static final C24015a[] f89637f = new C24015a[0];

        /* renamed from: g */
        public static final C24015a[] f89638g = new C24015a[0];

        /* renamed from: b */
        public final AtomicReference<C24016b<T>> f89639b;

        /* renamed from: e */
        public final AtomicReference<InterfaceC23465c> f89642e = new AtomicReference<>();

        /* renamed from: c */
        public final AtomicReference<C24015a<T>[]> f89640c = new AtomicReference<>(f89637f);

        /* renamed from: d */
        public final AtomicBoolean f89641d = new AtomicBoolean();

        public C24016b(AtomicReference<C24016b<T>> atomicReference) {
            this.f89639b = atomicReference;
        }

        /* renamed from: a */
        public boolean m32656a(C24015a<T> c24015a) {
            C24015a<T>[] c24015aArr;
            C24015a[] c24015aArr2;
            do {
                c24015aArr = this.f89640c.get();
                if (c24015aArr == f89638g) {
                    return false;
                }
                int length = c24015aArr.length;
                c24015aArr2 = new C24015a[length + 1];
                System.arraycopy(c24015aArr, 0, c24015aArr2, 0, length);
                c24015aArr2[length] = c24015a;
            } while (!C42482i24.m35337a(this.f89640c, c24015aArr, c24015aArr2));
            return true;
        }

        /* renamed from: b */
        public void m32655b(C24015a<T> c24015a) {
            C24015a<T>[] c24015aArr;
            C24015a[] c24015aArr2;
            do {
                c24015aArr = this.f89640c.get();
                int length = c24015aArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (c24015aArr[i].equals(c24015a)) {
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
                    c24015aArr2 = f89637f;
                } else {
                    C24015a[] c24015aArr3 = new C24015a[length - 1];
                    System.arraycopy(c24015aArr, 0, c24015aArr3, 0, i);
                    System.arraycopy(c24015aArr, i + 1, c24015aArr3, i, (length - i) - 1);
                    c24015aArr2 = c24015aArr3;
                }
            } while (!C42482i24.m35337a(this.f89640c, c24015aArr, c24015aArr2));
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            AtomicReference<C24015a<T>[]> atomicReference = this.f89640c;
            C24015a<T>[] c24015aArr = f89638g;
            if (atomicReference.getAndSet(c24015aArr) != c24015aArr) {
                C42482i24.m35337a(this.f89639b, this, null);
                EnumC23501d.m33000a(this.f89642e);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89640c.get() == f89638g;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            C42482i24.m35337a(this.f89639b, this, null);
            for (C24015a<T> c24015a : this.f89640c.getAndSet(f89638g)) {
                c24015a.f89636b.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            C42482i24.m35337a(this.f89639b, this, null);
            C24015a<T>[] andSet = this.f89640c.getAndSet(f89638g);
            if (andSet.length != 0) {
                for (C24015a<T> c24015a : andSet) {
                    c24015a.f89636b.onError(th);
                }
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            for (C24015a<T> c24015a : this.f89640c.get()) {
                c24015a.f89636b.onNext(t);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this.f89642e, interfaceC23465c);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.H0$c */
    /* loaded from: classes6.dex */
    public static final class C24017c<T> implements InterfaceC23434B<T> {

        /* renamed from: b */
        public final AtomicReference<C24016b<T>> f89643b;

        public C24017c(AtomicReference<C24016b<T>> atomicReference) {
            this.f89643b = atomicReference;
        }

        @Override // io.reactivex.InterfaceC23434B
        public void subscribe(InterfaceC23436D<? super T> interfaceC23436D) {
            C24015a c24015a = new C24015a(interfaceC23436D);
            interfaceC23436D.onSubscribe(c24015a);
            while (true) {
                C24016b<T> c24016b = this.f89643b.get();
                if (c24016b == null || c24016b.mo1769e()) {
                    C24016b<T> c24016b2 = new C24016b<>(this.f89643b);
                    if (C42482i24.m35337a(this.f89643b, c24016b, c24016b2)) {
                        c24016b = c24016b2;
                    } else {
                        continue;
                    }
                }
                if (c24016b.m32656a(c24015a)) {
                    c24015a.m32657a(c24016b);
                    return;
                }
            }
        }
    }

    public C24014H0(InterfaceC23434B<T> interfaceC23434B, InterfaceC23434B<T> interfaceC23434B2, AtomicReference<C24016b<T>> atomicReference) {
        this.f89635d = interfaceC23434B;
        this.f89633b = interfaceC23434B2;
        this.f89634c = atomicReference;
    }

    /* renamed from: l */
    public static <T> AbstractC24495a<T> m32658l(InterfaceC23434B<T> interfaceC23434B) {
        AtomicReference atomicReference = new AtomicReference();
        return C24508a.m31991r(new C24014H0(new C24017c(atomicReference), interfaceC23434B, atomicReference));
    }

    @Override // io.reactivex.internal.operators.observable.InterfaceC24031J0
    /* renamed from: b */
    public InterfaceC23434B<T> mo32648b() {
        return this.f89633b;
    }

    @Override // io.reactivex.observables.AbstractC24495a
    /* renamed from: g */
    public void mo32086g(InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g) {
        C24016b<T> c24016b;
        while (true) {
            c24016b = this.f89634c.get();
            if (c24016b != null && !c24016b.mo1769e()) {
                break;
            }
            C24016b<T> c24016b2 = new C24016b<>(this.f89634c);
            if (C42482i24.m35337a(this.f89634c, c24016b, c24016b2)) {
                c24016b = c24016b2;
                break;
            }
        }
        boolean z = false;
        if (!c24016b.f89641d.get() && c24016b.f89641d.compareAndSet(false, true)) {
            z = true;
        }
        try {
            interfaceC23484g.accept(c24016b);
            if (z) {
                this.f89633b.subscribe(c24016b);
            }
        } catch (Throwable th) {
            C23475a.m33009b(th);
            throw C24475k.m32256e(th);
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f89635d.subscribe(interfaceC23436D);
    }
}
