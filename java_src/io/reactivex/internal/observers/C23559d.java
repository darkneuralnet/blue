package io.reactivex.internal.observers;

import io.reactivex.InterfaceC23445I;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.observers.d */
/* loaded from: classes6.dex */
public final class C23559d<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23445I<T>, InterfaceC23465c {
    private static final long serialVersionUID = 4943102778943297569L;

    /* renamed from: b */
    public final InterfaceC23479b<? super T, ? super Throwable> f88293b;

    public C23559d(InterfaceC23479b<? super T, ? super Throwable> interfaceC23479b) {
        this.f88293b = interfaceC23479b;
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        EnumC23501d.m33000a(this);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return get() == EnumC23501d.DISPOSED;
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onError(Throwable th) {
        try {
            lazySet(EnumC23501d.DISPOSED);
            this.f88293b.accept(null, th);
        } catch (Throwable th2) {
            C23475a.m33009b(th2);
            C24508a.m31988u(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        EnumC23501d.m32995h(this, interfaceC23465c);
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onSuccess(T t) {
        try {
            lazySet(EnumC23501d.DISPOSED);
            this.f88293b.accept(t, null);
        } catch (Throwable th) {
            C23475a.m33009b(th);
            C24508a.m31988u(th);
        }
    }
}
