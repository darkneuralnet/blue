package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.internal.fuseable.InterfaceCallableC23553h;
import io.reactivex.internal.operators.observable.C24149a1;
/* renamed from: io.reactivex.internal.operators.observable.t0 */
/* loaded from: classes6.dex */
public final class C24294t0<T> extends Observable<T> implements InterfaceCallableC23553h<T> {

    /* renamed from: b */
    public final T f90584b;

    public C24294t0(T t) {
        this.f90584b = t;
    }

    @Override // io.reactivex.internal.fuseable.InterfaceCallableC23553h, java.util.concurrent.Callable
    public T call() {
        return this.f90584b;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C24149a1.RunnableC24150a runnableC24150a = new C24149a1.RunnableC24150a(interfaceC23436D, this.f90584b);
        interfaceC23436D.onSubscribe(runnableC24150a);
        runnableC24150a.run();
    }
}
