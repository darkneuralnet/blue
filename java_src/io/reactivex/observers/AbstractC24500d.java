package io.reactivex.observers;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.util.C24473i;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.observers.d */
/* loaded from: classes8.dex */
public abstract class AbstractC24500d<T> implements InterfaceC23436D<T>, InterfaceC23465c {

    /* renamed from: b */
    public final AtomicReference<InterfaceC23465c> f91103b = new AtomicReference<>();

    /* renamed from: a */
    public void m32079a() {
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public final void dispose() {
        EnumC23501d.m33000a(this.f91103b);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public final boolean mo1769e() {
        return this.f91103b.get() == EnumC23501d.DISPOSED;
    }

    @Override // io.reactivex.InterfaceC23436D
    public final void onSubscribe(InterfaceC23465c interfaceC23465c) {
        if (C24473i.m32262c(this.f91103b, interfaceC23465c, getClass())) {
            m32079a();
        }
    }
}
