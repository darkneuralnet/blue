package io.reactivex.processors;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.processors.b */
/* loaded from: classes8.dex */
public final class C24510b<T> extends AbstractC24509a<T> {

    /* renamed from: e */
    public static final C24511a[] f91143e = new C24511a[0];

    /* renamed from: f */
    public static final C24511a[] f91144f = new C24511a[0];

    /* renamed from: c */
    public final AtomicReference<C24511a<T>[]> f91145c = new AtomicReference<>(f91144f);

    /* renamed from: d */
    public Throwable f91146d;

    /* renamed from: io.reactivex.processors.b$a */
    /* loaded from: classes8.dex */
    public static final class C24511a<T> extends AtomicLong implements InterfaceC46292oT5 {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f91147b;

        /* renamed from: c */
        public final C24510b<T> f91148c;

        public C24511a(InterfaceC42141hT5<? super T> interfaceC42141hT5, C24510b<T> c24510b) {
            this.f91147b = interfaceC42141hT5;
            this.f91148c = c24510b;
        }

        /* renamed from: a */
        public boolean m31977a() {
            return get() == Long.MIN_VALUE;
        }

        /* renamed from: b */
        public boolean m31976b() {
            return get() == 0;
        }

        /* renamed from: c */
        public void m31975c() {
            if (get() != Long.MIN_VALUE) {
                this.f91147b.onComplete();
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f91148c.m31980B1(this);
            }
        }

        /* renamed from: d */
        public void m31974d(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.f91147b.onError(th);
            } else {
                C24508a.m31988u(th);
            }
        }

        /* renamed from: e */
        public void m31973e(T t) {
            long j = get();
            if (j == Long.MIN_VALUE) {
                return;
            }
            if (j != 0) {
                this.f91147b.onNext(t);
                C24468d.m32270e(this, 1L);
                return;
            }
            cancel();
            this.f91147b.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32273b(this, j);
            }
        }
    }

    /* renamed from: z1 */
    public static <T> C24510b<T> m31978z1() {
        return new C24510b<>();
    }

    /* renamed from: A1 */
    public boolean m31981A1(T t) {
        if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        C24511a<T>[] c24511aArr = this.f91145c.get();
        for (C24511a<T> c24511a : c24511aArr) {
            if (c24511a.m31976b()) {
                return false;
            }
        }
        for (C24511a<T> c24511a2 : c24511aArr) {
            c24511a2.m31973e(t);
        }
        return true;
    }

    /* renamed from: B1 */
    public void m31980B1(C24511a<T> c24511a) {
        C24511a<T>[] c24511aArr;
        C24511a[] c24511aArr2;
        do {
            c24511aArr = this.f91145c.get();
            if (c24511aArr != f91143e && c24511aArr != f91144f) {
                int length = c24511aArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (c24511aArr[i] == c24511a) {
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
                    c24511aArr2 = f91144f;
                } else {
                    C24511a[] c24511aArr3 = new C24511a[length - 1];
                    System.arraycopy(c24511aArr, 0, c24511aArr3, 0, i);
                    System.arraycopy(c24511aArr, i + 1, c24511aArr3, i, (length - i) - 1);
                    c24511aArr2 = c24511aArr3;
                }
            } else {
                return;
            }
        } while (!C42482i24.m35337a(this.f91145c, c24511aArr, c24511aArr2));
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        C24511a<T> c24511a = new C24511a<>(interfaceC42141hT5, this);
        interfaceC42141hT5.mo31867a(c24511a);
        if (m31979y1(c24511a)) {
            if (c24511a.m31977a()) {
                m31980B1(c24511a);
                return;
            }
            return;
        }
        Throwable th = this.f91146d;
        if (th != null) {
            interfaceC42141hT5.onError(th);
        } else {
            interfaceC42141hT5.onComplete();
        }
    }

    @Override // p000.InterfaceC42141hT5
    /* renamed from: a */
    public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
        if (this.f91145c.get() == f91143e) {
            interfaceC46292oT5.cancel();
        } else {
            interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
        }
    }

    @Override // p000.InterfaceC42141hT5
    public void onComplete() {
        C24511a<T>[] c24511aArr = this.f91145c.get();
        C24511a<T>[] c24511aArr2 = f91143e;
        if (c24511aArr == c24511aArr2) {
            return;
        }
        for (C24511a<T> c24511a : this.f91145c.getAndSet(c24511aArr2)) {
            c24511a.m31975c();
        }
    }

    @Override // p000.InterfaceC42141hT5
    public void onError(Throwable th) {
        C23544b.m32923e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C24511a<T>[] c24511aArr = this.f91145c.get();
        C24511a<T>[] c24511aArr2 = f91143e;
        if (c24511aArr == c24511aArr2) {
            C24508a.m31988u(th);
            return;
        }
        this.f91146d = th;
        for (C24511a<T> c24511a : this.f91145c.getAndSet(c24511aArr2)) {
            c24511a.m31974d(th);
        }
    }

    @Override // p000.InterfaceC42141hT5
    public void onNext(T t) {
        C23544b.m32923e(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C24511a<T> c24511a : this.f91145c.get()) {
            c24511a.m31973e(t);
        }
    }

    /* renamed from: y1 */
    public boolean m31979y1(C24511a<T> c24511a) {
        C24511a<T>[] c24511aArr;
        C24511a[] c24511aArr2;
        do {
            c24511aArr = this.f91145c.get();
            if (c24511aArr == f91143e) {
                return false;
            }
            int length = c24511aArr.length;
            c24511aArr2 = new C24511a[length + 1];
            System.arraycopy(c24511aArr, 0, c24511aArr2, 0, length);
            c24511aArr2[length] = c24511a;
        } while (!C42482i24.m35337a(this.f91145c, c24511aArr, c24511aArr2));
        return true;
    }
}
