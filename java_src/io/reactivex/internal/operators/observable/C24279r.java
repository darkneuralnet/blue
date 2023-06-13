package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.r */
/* loaded from: classes6.dex */
public final class C24279r<T> extends AbstractC24145a<T, T> implements InterfaceC23436D<T> {

    /* renamed from: l */
    public static final C24280a[] f90512l = new C24280a[0];

    /* renamed from: m */
    public static final C24280a[] f90513m = new C24280a[0];

    /* renamed from: c */
    public final AtomicBoolean f90514c;

    /* renamed from: d */
    public final int f90515d;

    /* renamed from: e */
    public final AtomicReference<C24280a<T>[]> f90516e;

    /* renamed from: f */
    public volatile long f90517f;

    /* renamed from: g */
    public final C24281b<T> f90518g;

    /* renamed from: h */
    public C24281b<T> f90519h;

    /* renamed from: i */
    public int f90520i;

    /* renamed from: j */
    public Throwable f90521j;

    /* renamed from: k */
    public volatile boolean f90522k;

    /* renamed from: io.reactivex.internal.operators.observable.r$a */
    /* loaded from: classes6.dex */
    public static final class C24280a<T> extends AtomicInteger implements InterfaceC23465c {
        private static final long serialVersionUID = 6770240836423125754L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90523b;

        /* renamed from: c */
        public final C24279r<T> f90524c;

        /* renamed from: d */
        public C24281b<T> f90525d;

        /* renamed from: e */
        public int f90526e;

        /* renamed from: f */
        public long f90527f;

        /* renamed from: g */
        public volatile boolean f90528g;

        public C24280a(InterfaceC23436D<? super T> interfaceC23436D, C24279r<T> c24279r) {
            this.f90523b = interfaceC23436D;
            this.f90524c = c24279r;
            this.f90525d = c24279r.f90518g;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f90528g) {
                this.f90528g = true;
                this.f90524c.m32440c(this);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90528g;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.r$b */
    /* loaded from: classes6.dex */
    public static final class C24281b<T> {

        /* renamed from: a */
        public final T[] f90529a;

        /* renamed from: b */
        public volatile C24281b<T> f90530b;

        public C24281b(int i) {
            this.f90529a = (T[]) new Object[i];
        }
    }

    public C24279r(Observable<T> observable, int i) {
        super(observable);
        this.f90515d = i;
        this.f90514c = new AtomicBoolean();
        C24281b<T> c24281b = new C24281b<>(i);
        this.f90518g = c24281b;
        this.f90519h = c24281b;
        this.f90516e = new AtomicReference<>(f90512l);
    }

    /* renamed from: a */
    public void m32441a(C24280a<T> c24280a) {
        C24280a<T>[] c24280aArr;
        C24280a[] c24280aArr2;
        do {
            c24280aArr = this.f90516e.get();
            if (c24280aArr == f90513m) {
                return;
            }
            int length = c24280aArr.length;
            c24280aArr2 = new C24280a[length + 1];
            System.arraycopy(c24280aArr, 0, c24280aArr2, 0, length);
            c24280aArr2[length] = c24280a;
        } while (!C42482i24.m35337a(this.f90516e, c24280aArr, c24280aArr2));
    }

    /* renamed from: c */
    public void m32440c(C24280a<T> c24280a) {
        C24280a<T>[] c24280aArr;
        C24280a[] c24280aArr2;
        do {
            c24280aArr = this.f90516e.get();
            int length = c24280aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i < length) {
                    if (c24280aArr[i] == c24280a) {
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
                c24280aArr2 = f90512l;
            } else {
                C24280a[] c24280aArr3 = new C24280a[length - 1];
                System.arraycopy(c24280aArr, 0, c24280aArr3, 0, i);
                System.arraycopy(c24280aArr, i + 1, c24280aArr3, i, (length - i) - 1);
                c24280aArr2 = c24280aArr3;
            }
        } while (!C42482i24.m35337a(this.f90516e, c24280aArr, c24280aArr2));
    }

    /* renamed from: e */
    public void m32439e(C24280a<T> c24280a) {
        boolean z;
        if (c24280a.getAndIncrement() != 0) {
            return;
        }
        long j = c24280a.f90527f;
        int i = c24280a.f90526e;
        C24281b<T> c24281b = c24280a.f90525d;
        InterfaceC23436D<? super T> interfaceC23436D = c24280a.f90523b;
        int i2 = this.f90515d;
        int i3 = 1;
        while (!c24280a.f90528g) {
            boolean z2 = this.f90522k;
            if (this.f90517f == j) {
                z = true;
            } else {
                z = false;
            }
            if (z2 && z) {
                c24280a.f90525d = null;
                Throwable th = this.f90521j;
                if (th != null) {
                    interfaceC23436D.onError(th);
                    return;
                } else {
                    interfaceC23436D.onComplete();
                    return;
                }
            } else if (!z) {
                if (i == i2) {
                    c24281b = c24281b.f90530b;
                    i = 0;
                }
                interfaceC23436D.onNext((Object) c24281b.f90529a[i]);
                i++;
                j++;
            } else {
                c24280a.f90527f = j;
                c24280a.f90526e = i;
                c24280a.f90525d = c24281b;
                i3 = c24280a.addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
            }
        }
        c24280a.f90525d = null;
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        this.f90522k = true;
        for (C24280a<T> c24280a : this.f90516e.getAndSet(f90513m)) {
            m32439e(c24280a);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        this.f90521j = th;
        this.f90522k = true;
        for (C24280a<T> c24280a : this.f90516e.getAndSet(f90513m)) {
            m32439e(c24280a);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        int i = this.f90520i;
        if (i == this.f90515d) {
            C24281b<T> c24281b = new C24281b<>(i);
            c24281b.f90529a[0] = t;
            this.f90520i = 1;
            this.f90519h.f90530b = c24281b;
            this.f90519h = c24281b;
        } else {
            this.f90519h.f90529a[i] = t;
            this.f90520i = i + 1;
        }
        this.f90517f++;
        for (C24280a<T> c24280a : this.f90516e.get()) {
            m32439e(c24280a);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C24280a<T> c24280a = new C24280a<>(interfaceC23436D, this);
        interfaceC23436D.onSubscribe(c24280a);
        m32441a(c24280a);
        if (!this.f90514c.get() && this.f90514c.compareAndSet(false, true)) {
            this.f90078b.subscribe(this);
        } else {
            m32439e(c24280a);
        }
    }
}
