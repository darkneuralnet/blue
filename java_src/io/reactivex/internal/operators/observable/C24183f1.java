package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.observers.C24504h;
/* renamed from: io.reactivex.internal.operators.observable.f1 */
/* loaded from: classes6.dex */
public final class C24183f1<T> extends AbstractC24145a<T, T> {
    public C24183f1(Observable<T> observable) {
        super(observable);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24504h(interfaceC23436D));
    }
}
