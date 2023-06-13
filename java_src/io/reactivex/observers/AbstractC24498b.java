package io.reactivex.observers;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.util.C24473i;
/* renamed from: io.reactivex.observers.b */
/* loaded from: classes8.dex */
public abstract class AbstractC24498b<T> implements InterfaceC23436D<T> {

    /* renamed from: b */
    public InterfaceC23465c f91101b;

    /* renamed from: a */
    public void m32081a() {
    }

    @Override // io.reactivex.InterfaceC23436D
    public final void onSubscribe(InterfaceC23465c interfaceC23465c) {
        if (C24473i.m32261d(this.f91101b, interfaceC23465c, getClass())) {
            this.f91101b = interfaceC23465c;
            m32081a();
        }
    }
}
