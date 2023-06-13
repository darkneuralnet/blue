package io.reactivex.internal.observers;

import io.reactivex.InterfaceC23445I;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.observers.x */
/* loaded from: classes6.dex */
public final class C23579x<T> implements InterfaceC23445I<T> {

    /* renamed from: b */
    public final AtomicReference<InterfaceC23465c> f88336b;

    /* renamed from: c */
    public final InterfaceC23445I<? super T> f88337c;

    public C23579x(AtomicReference<InterfaceC23465c> atomicReference, InterfaceC23445I<? super T> interfaceC23445I) {
        this.f88336b = atomicReference;
        this.f88337c = interfaceC23445I;
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onError(Throwable th) {
        this.f88337c.onError(th);
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        EnumC23501d.m32998c(this.f88336b, interfaceC23465c);
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onSuccess(T t) {
        this.f88337c.onSuccess(t);
    }
}
