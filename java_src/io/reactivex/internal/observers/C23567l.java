package io.reactivex.internal.observers;

import io.reactivex.InterfaceC23436D;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.observers.l */
/* loaded from: classes6.dex */
public class C23567l<T> extends AbstractC23557b<T> {
    private static final long serialVersionUID = -5502432239815349361L;

    /* renamed from: b */
    public final InterfaceC23436D<? super T> f88308b;

    /* renamed from: c */
    public T f88309c;

    public C23567l(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f88308b = interfaceC23436D;
    }

    /* renamed from: a */
    public final void m32911a() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f88308b.onComplete();
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23551f
    /* renamed from: b */
    public final int mo31868b(int i) {
        if ((i & 2) != 0) {
            lazySet(8);
            return 2;
        }
        return 0;
    }

    /* renamed from: c */
    public final void m32910c(T t) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        InterfaceC23436D<? super T> interfaceC23436D = this.f88308b;
        if (i == 8) {
            this.f88309c = t;
            lazySet(16);
            interfaceC23436D.onNext(null);
        } else {
            lazySet(2);
            interfaceC23436D.onNext(t);
        }
        if (get() != 4) {
            interfaceC23436D.onComplete();
        }
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public final void clear() {
        lazySet(32);
        this.f88309c = null;
    }

    /* renamed from: d */
    public final void m32909d(Throwable th) {
        if ((get() & 54) != 0) {
            C24508a.m31988u(th);
            return;
        }
        lazySet(2);
        this.f88308b.onError(th);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        set(4);
        this.f88309c = null;
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public final boolean mo1769e() {
        return get() == 4;
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.f88309c;
        this.f88309c = null;
        lazySet(32);
        return t;
    }
}
