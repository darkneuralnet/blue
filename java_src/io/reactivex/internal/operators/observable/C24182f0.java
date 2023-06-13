package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.observers.C23567l;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* renamed from: io.reactivex.internal.operators.observable.f0 */
/* loaded from: classes6.dex */
public final class C24182f0<T> extends Observable<T> {

    /* renamed from: b */
    public final Future<? extends T> f90198b;

    /* renamed from: c */
    public final long f90199c;

    /* renamed from: d */
    public final TimeUnit f90200d;

    public C24182f0(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f90198b = future;
        this.f90199c = j;
        this.f90200d = timeUnit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        T t;
        C23567l c23567l = new C23567l(interfaceC23436D);
        interfaceC23436D.onSubscribe(c23567l);
        if (!c23567l.mo1769e()) {
            try {
                TimeUnit timeUnit = this.f90200d;
                if (timeUnit != null) {
                    t = this.f90198b.get(this.f90199c, timeUnit);
                } else {
                    t = this.f90198b.get();
                }
                c23567l.m32910c(C23544b.m32923e(t, "Future returned null"));
            } catch (Throwable th) {
                C23475a.m33009b(th);
                if (!c23567l.mo1769e()) {
                    interfaceC23436D.onError(th);
                }
            }
        }
    }
}
