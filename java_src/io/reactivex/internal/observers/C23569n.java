package io.reactivex.internal.observers;

import io.reactivex.InterfaceC23476f;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.observers.InterfaceC24502f;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.observers.n */
/* loaded from: classes6.dex */
public final class C23569n extends AtomicReference<InterfaceC23465c> implements InterfaceC23476f, InterfaceC23465c, InterfaceC24502f {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        EnumC23501d.m33000a(this);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return get() == EnumC23501d.DISPOSED;
    }

    @Override // io.reactivex.observers.InterfaceC24502f
    public boolean hasCustomOnError() {
        return false;
    }

    @Override // io.reactivex.InterfaceC23476f
    public void onComplete() {
        lazySet(EnumC23501d.DISPOSED);
    }

    @Override // io.reactivex.InterfaceC23476f
    public void onError(Throwable th) {
        lazySet(EnumC23501d.DISPOSED);
        C24508a.m31988u(new OnErrorNotImplementedException(th));
    }

    @Override // io.reactivex.InterfaceC23476f
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        EnumC23501d.m32995h(this, interfaceC23465c);
    }
}
