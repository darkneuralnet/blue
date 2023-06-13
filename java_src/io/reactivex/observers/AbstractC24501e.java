package io.reactivex.observers;

import io.reactivex.InterfaceC23445I;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.util.C24473i;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.observers.e */
/* loaded from: classes8.dex */
public abstract class AbstractC24501e<T> implements InterfaceC23445I<T>, InterfaceC23465c {

    /* renamed from: b */
    public final AtomicReference<InterfaceC23465c> f91104b = new AtomicReference<>();

    /* renamed from: a */
    public void m32078a() {
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public final void dispose() {
        EnumC23501d.m33000a(this.f91104b);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public final boolean mo1769e() {
        return this.f91104b.get() == EnumC23501d.DISPOSED;
    }

    @Override // io.reactivex.InterfaceC23445I
    public final void onSubscribe(InterfaceC23465c interfaceC23465c) {
        if (C24473i.m32262c(this.f91104b, interfaceC23465c, getClass())) {
            m32078a();
        }
    }
}
