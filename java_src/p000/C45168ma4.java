package p000;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: ma4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45168ma4<T> extends AbstractC37638Zt4<T> {

    /* renamed from: c */
    public static final C26126a[] f98367c = new C26126a[0];

    /* renamed from: b */
    public final AtomicReference<C26126a<T>[]> f98368b = new AtomicReference<>(f98367c);

    /* renamed from: ma4$a */
    /* loaded from: classes6.dex */
    public static final class C26126a<T> extends AtomicBoolean implements InterfaceC23465c {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f98369b;

        /* renamed from: c */
        public final C45168ma4<T> f98370c;

        public C26126a(InterfaceC23436D<? super T> interfaceC23436D, C45168ma4<T> c45168ma4) {
            this.f98369b = interfaceC23436D;
            this.f98370c = c45168ma4;
        }

        /* renamed from: a */
        public void m25407a(T t) {
            if (!get()) {
                this.f98369b.onNext(t);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f98370c.m25408h(this);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get();
        }
    }

    /* renamed from: g */
    public static <T> C45168ma4<T> m25409g() {
        return new C45168ma4<>();
    }

    @Override // p000.AbstractC37638Zt4
    /* renamed from: a */
    public boolean mo25411a() {
        return this.f98368b.get().length != 0;
    }

    @Override // p000.AbstractC37638Zt4, io.reactivex.functions.InterfaceC23484g
    public void accept(T t) {
        if (t != null) {
            for (C26126a<T> c26126a : this.f98368b.get()) {
                c26126a.m25407a(t);
            }
            return;
        }
        throw new NullPointerException("value == null");
    }

    /* renamed from: e */
    public void m25410e(C26126a<T> c26126a) {
        C26126a<T>[] c26126aArr;
        C26126a[] c26126aArr2;
        do {
            c26126aArr = this.f98368b.get();
            int length = c26126aArr.length;
            c26126aArr2 = new C26126a[length + 1];
            System.arraycopy(c26126aArr, 0, c26126aArr2, 0, length);
            c26126aArr2[length] = c26126a;
        } while (!C42482i24.m35337a(this.f98368b, c26126aArr, c26126aArr2));
    }

    /* renamed from: h */
    public void m25408h(C26126a<T> c26126a) {
        C26126a<T>[] c26126aArr;
        C26126a[] c26126aArr2;
        do {
            c26126aArr = this.f98368b.get();
            if (c26126aArr == f98367c) {
                return;
            }
            int length = c26126aArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (c26126aArr[i] == c26126a) {
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
                c26126aArr2 = f98367c;
            } else {
                C26126a[] c26126aArr3 = new C26126a[length - 1];
                System.arraycopy(c26126aArr, 0, c26126aArr3, 0, i);
                System.arraycopy(c26126aArr, i + 1, c26126aArr3, i, (length - i) - 1);
                c26126aArr2 = c26126aArr3;
            }
        } while (!C42482i24.m35337a(this.f98368b, c26126aArr, c26126aArr2));
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C26126a<T> c26126a = new C26126a<>(interfaceC23436D, this);
        interfaceC23436D.onSubscribe(c26126a);
        m25410e(c26126a);
        if (c26126a.mo1769e()) {
            m25408h(c26126a);
        }
    }
}
