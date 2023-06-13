package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.InterfaceC23504g;
import io.reactivex.internal.util.C24475k;
import io.reactivex.observables.AbstractC24495a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.I0 */
/* loaded from: classes6.dex */
public final class C24023I0<T> extends AbstractC24495a<T> implements InterfaceC23504g {

    /* renamed from: b */
    public final InterfaceC23434B<T> f89669b;

    /* renamed from: c */
    public final AtomicReference<C24025b<T>> f89670c = new AtomicReference<>();

    /* renamed from: io.reactivex.internal.operators.observable.I0$a */
    /* loaded from: classes6.dex */
    public static final class C24024a<T> extends AtomicReference<C24025b<T>> implements InterfaceC23465c {
        private static final long serialVersionUID = 7463222674719692880L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89671b;

        public C24024a(InterfaceC23436D<? super T> interfaceC23436D, C24025b<T> c24025b) {
            this.f89671b = interfaceC23436D;
            lazySet(c24025b);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            C24025b<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m32653b(this);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get() == null;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.I0$b */
    /* loaded from: classes6.dex */
    public static final class C24025b<T> extends AtomicReference<C24024a<T>[]> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: f */
        public static final C24024a[] f89672f = new C24024a[0];

        /* renamed from: g */
        public static final C24024a[] f89673g = new C24024a[0];
        private static final long serialVersionUID = -3251430252873581268L;

        /* renamed from: c */
        public final AtomicReference<C24025b<T>> f89675c;

        /* renamed from: e */
        public Throwable f89677e;

        /* renamed from: b */
        public final AtomicBoolean f89674b = new AtomicBoolean();

        /* renamed from: d */
        public final AtomicReference<InterfaceC23465c> f89676d = new AtomicReference<>();

        public C24025b(AtomicReference<C24025b<T>> atomicReference) {
            this.f89675c = atomicReference;
            lazySet(f89672f);
        }

        /* renamed from: a */
        public boolean m32654a(C24024a<T> c24024a) {
            C24024a<T>[] c24024aArr;
            C24024a[] c24024aArr2;
            do {
                c24024aArr = get();
                if (c24024aArr == f89673g) {
                    return false;
                }
                int length = c24024aArr.length;
                c24024aArr2 = new C24024a[length + 1];
                System.arraycopy(c24024aArr, 0, c24024aArr2, 0, length);
                c24024aArr2[length] = c24024a;
            } while (!compareAndSet(c24024aArr, c24024aArr2));
            return true;
        }

        /* renamed from: b */
        public void m32653b(C24024a<T> c24024a) {
            C24024a<T>[] c24024aArr;
            C24024a[] c24024aArr2;
            do {
                c24024aArr = get();
                int length = c24024aArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (c24024aArr[i] == c24024a) {
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
                c24024aArr2 = f89672f;
                if (length != 1) {
                    c24024aArr2 = new C24024a[length - 1];
                    System.arraycopy(c24024aArr, 0, c24024aArr2, 0, i);
                    System.arraycopy(c24024aArr, i + 1, c24024aArr2, i, (length - i) - 1);
                }
            } while (!compareAndSet(c24024aArr, c24024aArr2));
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            getAndSet(f89673g);
            C42482i24.m35337a(this.f89675c, this, null);
            EnumC23501d.m33000a(this.f89676d);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get() == f89673g;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89676d.lazySet(EnumC23501d.DISPOSED);
            for (C24024a<T> c24024a : getAndSet(f89673g)) {
                c24024a.f89671b.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f89677e = th;
            this.f89676d.lazySet(EnumC23501d.DISPOSED);
            for (C24024a<T> c24024a : getAndSet(f89673g)) {
                c24024a.f89671b.onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            for (C24024a<T> c24024a : get()) {
                c24024a.f89671b.onNext(t);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this.f89676d, interfaceC23465c);
        }
    }

    public C24023I0(InterfaceC23434B<T> interfaceC23434B) {
        this.f89669b = interfaceC23434B;
    }

    @Override // io.reactivex.internal.disposables.InterfaceC23504g
    /* renamed from: d */
    public void mo32598d(InterfaceC23465c interfaceC23465c) {
        C42482i24.m35337a(this.f89670c, (C24025b) interfaceC23465c, null);
    }

    @Override // io.reactivex.observables.AbstractC24495a
    /* renamed from: g */
    public void mo32086g(InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g) {
        C24025b<T> c24025b;
        while (true) {
            c24025b = this.f89670c.get();
            if (c24025b != null && !c24025b.mo1769e()) {
                break;
            }
            C24025b<T> c24025b2 = new C24025b<>(this.f89670c);
            if (C42482i24.m35337a(this.f89670c, c24025b, c24025b2)) {
                c24025b = c24025b2;
                break;
            }
        }
        boolean z = false;
        if (!c24025b.f89674b.get() && c24025b.f89674b.compareAndSet(false, true)) {
            z = true;
        }
        try {
            interfaceC23484g.accept(c24025b);
            if (z) {
                this.f89669b.subscribe(c24025b);
            }
        } catch (Throwable th) {
            C23475a.m33009b(th);
            throw C24475k.m32256e(th);
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C24025b<T> c24025b;
        while (true) {
            c24025b = this.f89670c.get();
            if (c24025b != null) {
                break;
            }
            C24025b<T> c24025b2 = new C24025b<>(this.f89670c);
            if (C42482i24.m35337a(this.f89670c, c24025b, c24025b2)) {
                c24025b = c24025b2;
                break;
            }
        }
        C24024a<T> c24024a = new C24024a<>(interfaceC23436D, c24025b);
        interfaceC23436D.onSubscribe(c24024a);
        if (c24025b.m32654a(c24024a)) {
            if (c24024a.mo1769e()) {
                c24025b.m32653b(c24024a);
                return;
            }
            return;
        }
        Throwable th = c24025b.f89677e;
        if (th != null) {
            interfaceC23436D.onError(th);
        } else {
            interfaceC23436D.onComplete();
        }
    }
}
