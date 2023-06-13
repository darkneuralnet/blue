package io.reactivex.subjects;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.subjects.b */
/* loaded from: classes8.dex */
public final class C24554b extends AbstractC23461c implements InterfaceC23476f {

    /* renamed from: e */
    public static final C24555a[] f91216e = new C24555a[0];

    /* renamed from: f */
    public static final C24555a[] f91217f = new C24555a[0];

    /* renamed from: d */
    public Throwable f91220d;

    /* renamed from: c */
    public final AtomicBoolean f91219c = new AtomicBoolean();

    /* renamed from: b */
    public final AtomicReference<C24555a[]> f91218b = new AtomicReference<>(f91216e);

    /* renamed from: io.reactivex.subjects.b$a */
    /* loaded from: classes8.dex */
    public static final class C24555a extends AtomicReference<C24554b> implements InterfaceC23465c {
        private static final long serialVersionUID = -7650903191002190468L;

        /* renamed from: b */
        public final InterfaceC23476f f91221b;

        public C24555a(InterfaceC23476f interfaceC23476f, C24554b c24554b) {
            this.f91221b = interfaceC23476f;
            lazySet(c24554b);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            C24554b andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m31909n0(this);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get() == null;
        }
    }

    /* renamed from: m0 */
    public static C24554b m31910m0() {
        return new C24554b();
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        C24555a c24555a = new C24555a(interfaceC23476f, this);
        interfaceC23476f.onSubscribe(c24555a);
        if (m31911l0(c24555a)) {
            if (c24555a.mo1769e()) {
                m31909n0(c24555a);
                return;
            }
            return;
        }
        Throwable th = this.f91220d;
        if (th != null) {
            interfaceC23476f.onError(th);
        } else {
            interfaceC23476f.onComplete();
        }
    }

    /* renamed from: l0 */
    public boolean m31911l0(C24555a c24555a) {
        C24555a[] c24555aArr;
        C24555a[] c24555aArr2;
        do {
            c24555aArr = this.f91218b.get();
            if (c24555aArr == f91217f) {
                return false;
            }
            int length = c24555aArr.length;
            c24555aArr2 = new C24555a[length + 1];
            System.arraycopy(c24555aArr, 0, c24555aArr2, 0, length);
            c24555aArr2[length] = c24555a;
        } while (!C42482i24.m35337a(this.f91218b, c24555aArr, c24555aArr2));
        return true;
    }

    /* renamed from: n0 */
    public void m31909n0(C24555a c24555a) {
        C24555a[] c24555aArr;
        C24555a[] c24555aArr2;
        do {
            c24555aArr = this.f91218b.get();
            int length = c24555aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i < length) {
                    if (c24555aArr[i] == c24555a) {
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
                c24555aArr2 = f91216e;
            } else {
                C24555a[] c24555aArr3 = new C24555a[length - 1];
                System.arraycopy(c24555aArr, 0, c24555aArr3, 0, i);
                System.arraycopy(c24555aArr, i + 1, c24555aArr3, i, (length - i) - 1);
                c24555aArr2 = c24555aArr3;
            }
        } while (!C42482i24.m35337a(this.f91218b, c24555aArr, c24555aArr2));
    }

    @Override // io.reactivex.InterfaceC23476f
    public void onComplete() {
        if (this.f91219c.compareAndSet(false, true)) {
            for (C24555a c24555a : this.f91218b.getAndSet(f91217f)) {
                c24555a.f91221b.onComplete();
            }
        }
    }

    @Override // io.reactivex.InterfaceC23476f
    public void onError(Throwable th) {
        C23544b.m32923e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f91219c.compareAndSet(false, true)) {
            this.f91220d = th;
            for (C24555a c24555a : this.f91218b.getAndSet(f91217f)) {
                c24555a.f91221b.onError(th);
            }
            return;
        }
        C24508a.m31988u(th);
    }

    @Override // io.reactivex.InterfaceC23476f
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        if (this.f91218b.get() == f91217f) {
            interfaceC23465c.dispose();
        }
    }
}
