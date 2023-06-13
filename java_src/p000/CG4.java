package p000;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: CG4 */
/* loaded from: classes6.dex */
public final class CG4<T> extends AbstractC37638Zt4<T> {

    /* renamed from: d */
    public static final C0973b[] f3791d = new C0973b[0];

    /* renamed from: e */
    public static final Object[] f3792e = new Object[0];

    /* renamed from: b */
    public final InterfaceC0972a<T> f3793b;

    /* renamed from: c */
    public final AtomicReference<C0973b<T>[]> f3794c = new AtomicReference<>(f3791d);

    /* renamed from: CG4$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC0972a<T> {
        /* renamed from: a */
        void mo112488a(C0973b<T> c0973b);

        void add(T t);
    }

    /* renamed from: CG4$b */
    /* loaded from: classes6.dex */
    public static final class C0973b<T> extends AtomicInteger implements InterfaceC23465c {
        private static final long serialVersionUID = 466549804534799122L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f3795b;

        /* renamed from: c */
        public final CG4<T> f3796c;

        /* renamed from: d */
        public Object f3797d;

        /* renamed from: e */
        public volatile boolean f3798e;

        public C0973b(InterfaceC23436D<? super T> interfaceC23436D, CG4<T> cg4) {
            this.f3795b = interfaceC23436D;
            this.f3796c = cg4;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f3798e) {
                this.f3798e = true;
                this.f3796c.m112489h(this);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f3798e;
        }
    }

    /* renamed from: CG4$c */
    /* loaded from: classes6.dex */
    public static final class C0974c<T> extends AtomicReference<Object> implements InterfaceC0972a<T> {
        private static final long serialVersionUID = -733876083048047795L;

        /* renamed from: b */
        public final List<T> f3799b;

        /* renamed from: c */
        public volatile int f3800c;

        public C0974c(int i) {
            if (i > 0) {
                this.f3799b = new ArrayList(i);
                return;
            }
            throw new IllegalArgumentException("capacityHint <= 0");
        }

        @Override // p000.CG4.InterfaceC0972a
        /* renamed from: a */
        public void mo112488a(C0973b<T> c0973b) {
            int i;
            if (c0973b.getAndIncrement() != 0) {
                return;
            }
            List<T> list = this.f3799b;
            InterfaceC23436D<? super T> interfaceC23436D = c0973b.f3795b;
            Integer num = (Integer) c0973b.f3797d;
            int i2 = 1;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
                c0973b.f3797d = 0;
            }
            while (!c0973b.f3798e) {
                int i3 = this.f3800c;
                while (i3 != i) {
                    if (c0973b.f3798e) {
                        c0973b.f3797d = null;
                        return;
                    } else {
                        interfaceC23436D.onNext(list.get(i));
                        i++;
                    }
                }
                if (i == this.f3800c) {
                    c0973b.f3797d = Integer.valueOf(i);
                    i2 = c0973b.addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
            }
            c0973b.f3797d = null;
        }

        @Override // p000.CG4.InterfaceC0972a
        public void add(T t) {
            this.f3799b.add(t);
            this.f3800c++;
        }
    }

    public CG4(InterfaceC0972a<T> interfaceC0972a) {
        this.f3793b = interfaceC0972a;
    }

    /* renamed from: g */
    public static <T> CG4<T> m112490g() {
        return new CG4<>(new C0974c(16));
    }

    @Override // p000.AbstractC37638Zt4
    /* renamed from: a */
    public boolean mo25411a() {
        return this.f3794c.get().length != 0;
    }

    @Override // p000.AbstractC37638Zt4, io.reactivex.functions.InterfaceC23484g
    public void accept(T t) {
        if (t != null) {
            InterfaceC0972a<T> interfaceC0972a = this.f3793b;
            interfaceC0972a.add(t);
            for (C0973b<T> c0973b : this.f3794c.get()) {
                interfaceC0972a.mo112488a(c0973b);
            }
            return;
        }
        throw new NullPointerException("value == null");
    }

    /* renamed from: e */
    public boolean m112491e(C0973b<T> c0973b) {
        C0973b<T>[] c0973bArr;
        C0973b[] c0973bArr2;
        do {
            c0973bArr = this.f3794c.get();
            int length = c0973bArr.length;
            c0973bArr2 = new C0973b[length + 1];
            System.arraycopy(c0973bArr, 0, c0973bArr2, 0, length);
            c0973bArr2[length] = c0973b;
        } while (!C42482i24.m35337a(this.f3794c, c0973bArr, c0973bArr2));
        return true;
    }

    /* renamed from: h */
    public void m112489h(C0973b<T> c0973b) {
        C0973b<T>[] c0973bArr;
        C0973b[] c0973bArr2;
        do {
            c0973bArr = this.f3794c.get();
            if (c0973bArr == f3791d) {
                return;
            }
            int length = c0973bArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (c0973bArr[i] == c0973b) {
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
                c0973bArr2 = f3791d;
            } else {
                C0973b[] c0973bArr3 = new C0973b[length - 1];
                System.arraycopy(c0973bArr, 0, c0973bArr3, 0, i);
                System.arraycopy(c0973bArr, i + 1, c0973bArr3, i, (length - i) - 1);
                c0973bArr2 = c0973bArr3;
            }
        } while (!C42482i24.m35337a(this.f3794c, c0973bArr, c0973bArr2));
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C0973b<T> c0973b = new C0973b<>(interfaceC23436D, this);
        interfaceC23436D.onSubscribe(c0973b);
        if (!c0973b.f3798e) {
            if (m112491e(c0973b) && c0973b.f3798e) {
                m112489h(c0973b);
            } else {
                this.f3793b.mo112488a(c0973b);
            }
        }
    }
}
