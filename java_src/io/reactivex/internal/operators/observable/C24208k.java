package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.observables.AbstractC24495a;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.operators.observable.k */
/* loaded from: classes6.dex */
public final class C24208k<T> extends Observable<T> {

    /* renamed from: b */
    public final AbstractC24495a<? extends T> f90268b;

    /* renamed from: c */
    public final int f90269c;

    /* renamed from: d */
    public final InterfaceC23484g<? super InterfaceC23465c> f90270d;

    /* renamed from: e */
    public final AtomicInteger f90271e = new AtomicInteger();

    public C24208k(AbstractC24495a<? extends T> abstractC24495a, int i, InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g) {
        this.f90268b = abstractC24495a;
        this.f90269c = i;
        this.f90270d = interfaceC23484g;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90268b.subscribe((InterfaceC23436D<? super Object>) interfaceC23436D);
        if (this.f90271e.incrementAndGet() == this.f90269c) {
            this.f90268b.mo32086g(this.f90270d);
        }
    }
}
