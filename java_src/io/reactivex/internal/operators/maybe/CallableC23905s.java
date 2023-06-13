package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24541s;
import io.reactivex.disposables.C23466d;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.maybe.s */
/* loaded from: classes6.dex */
public final class CallableC23905s<T> extends AbstractC24507p<T> implements Callable<T> {

    /* renamed from: b */
    public final Callable<? extends T> f89280b;

    public CallableC23905s(Callable<? extends T> callable) {
        this.f89280b = callable;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        InterfaceC23465c m33022b = C23466d.m33022b();
        interfaceC24541s.onSubscribe(m33022b);
        if (!m33022b.mo1769e()) {
            try {
                Object obj = (T) this.f89280b.call();
                if (!m33022b.mo1769e()) {
                    if (obj == null) {
                        interfaceC24541s.onComplete();
                    } else {
                        interfaceC24541s.onSuccess(obj);
                    }
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                if (!m33022b.mo1769e()) {
                    interfaceC24541s.onError(th);
                } else {
                    C24508a.m31988u(th);
                }
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return this.f89280b.call();
    }
}
