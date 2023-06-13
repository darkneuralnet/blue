package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
/* renamed from: io.reactivex.internal.operators.observable.i0 */
/* loaded from: classes6.dex */
public final class C24199i0<T> extends Observable<T> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f90243b;

    public C24199i0(InterfaceC23434B<T> interfaceC23434B) {
        this.f90243b = interfaceC23434B;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90243b.subscribe(interfaceC23436D);
    }
}
