package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.observers.C23567l;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.observable.e0 */
/* loaded from: classes6.dex */
public final class CallableC24176e0<T> extends Observable<T> implements Callable<T> {

    /* renamed from: b */
    public final Callable<? extends T> f90174b;

    public CallableC24176e0(Callable<? extends T> callable) {
        this.f90174b = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) C23544b.m32923e(this.f90174b.call(), "The callable returned a null value");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C23567l c23567l = new C23567l(interfaceC23436D);
        interfaceC23436D.onSubscribe(c23567l);
        if (c23567l.mo1769e()) {
            return;
        }
        try {
            c23567l.m32910c(C23544b.m32923e(this.f90174b.call(), "Callable returned null"));
        } catch (Throwable th) {
            C23475a.m33009b(th);
            if (!c23567l.mo1769e()) {
                interfaceC23436D.onError(th);
            } else {
                C24508a.m31988u(th);
            }
        }
    }
}
