package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.single.a */
/* loaded from: classes6.dex */
public final class C24356a<T> extends AbstractC23442F<T> implements InterfaceC23445I<T> {

    /* renamed from: g */
    public static final C24357a[] f90790g = new C24357a[0];

    /* renamed from: h */
    public static final C24357a[] f90791h = new C24357a[0];

    /* renamed from: b */
    public final InterfaceC23447K<? extends T> f90792b;

    /* renamed from: c */
    public final AtomicInteger f90793c = new AtomicInteger();

    /* renamed from: d */
    public final AtomicReference<C24357a<T>[]> f90794d = new AtomicReference<>(f90790g);

    /* renamed from: e */
    public T f90795e;

    /* renamed from: f */
    public Throwable f90796f;

    /* renamed from: io.reactivex.internal.operators.single.a$a */
    /* loaded from: classes6.dex */
    public static final class C24357a<T> extends AtomicBoolean implements InterfaceC23465c {
        private static final long serialVersionUID = 7514387411091976596L;

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f90797b;

        /* renamed from: c */
        public final C24356a<T> f90798c;

        public C24357a(InterfaceC23445I<? super T> interfaceC23445I, C24356a<T> c24356a) {
            this.f90797b = interfaceC23445I;
            this.f90798c = c24356a;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f90798c.m32396w0(this);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get();
        }
    }

    public C24356a(InterfaceC23447K<? extends T> interfaceC23447K) {
        this.f90792b = interfaceC23447K;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        C24357a<T> c24357a = new C24357a<>(interfaceC23445I, this);
        interfaceC23445I.onSubscribe(c24357a);
        if (m32397v0(c24357a)) {
            if (c24357a.mo1769e()) {
                m32396w0(c24357a);
            }
            if (this.f90793c.getAndIncrement() == 0) {
                this.f90792b.mo33096a(this);
                return;
            }
            return;
        }
        Throwable th = this.f90796f;
        if (th != null) {
            interfaceC23445I.onError(th);
        } else {
            interfaceC23445I.onSuccess((T) this.f90795e);
        }
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onError(Throwable th) {
        C24357a<T>[] andSet;
        this.f90796f = th;
        for (C24357a<T> c24357a : this.f90794d.getAndSet(f90791h)) {
            if (!c24357a.mo1769e()) {
                c24357a.f90797b.onError(th);
            }
        }
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onSuccess(T t) {
        C24357a<T>[] andSet;
        this.f90795e = t;
        for (C24357a<T> c24357a : this.f90794d.getAndSet(f90791h)) {
            if (!c24357a.mo1769e()) {
                c24357a.f90797b.onSuccess(t);
            }
        }
    }

    /* renamed from: v0 */
    public boolean m32397v0(C24357a<T> c24357a) {
        C24357a<T>[] c24357aArr;
        C24357a[] c24357aArr2;
        do {
            c24357aArr = this.f90794d.get();
            if (c24357aArr == f90791h) {
                return false;
            }
            int length = c24357aArr.length;
            c24357aArr2 = new C24357a[length + 1];
            System.arraycopy(c24357aArr, 0, c24357aArr2, 0, length);
            c24357aArr2[length] = c24357a;
        } while (!C42482i24.m35337a(this.f90794d, c24357aArr, c24357aArr2));
        return true;
    }

    /* renamed from: w0 */
    public void m32396w0(C24357a<T> c24357a) {
        C24357a<T>[] c24357aArr;
        C24357a[] c24357aArr2;
        do {
            c24357aArr = this.f90794d.get();
            int length = c24357aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i < length) {
                    if (c24357aArr[i] == c24357a) {
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
                c24357aArr2 = f90790g;
            } else {
                C24357a[] c24357aArr3 = new C24357a[length - 1];
                System.arraycopy(c24357aArr, 0, c24357aArr3, 0, i);
                System.arraycopy(c24357aArr, i + 1, c24357aArr3, i, (length - i) - 1);
                c24357aArr2 = c24357aArr3;
            }
        } while (!C42482i24.m35337a(this.f90794d, c24357aArr, c24357aArr2));
    }
}
