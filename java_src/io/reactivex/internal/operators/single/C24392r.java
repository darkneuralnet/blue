package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.disposables.C23466d;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.single.r */
/* loaded from: classes6.dex */
public final class C24392r<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final Callable<? extends T> f90871b;

    public C24392r(Callable<? extends T> callable) {
        this.f90871b = callable;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        InterfaceC23465c m33022b = C23466d.m33022b();
        interfaceC23445I.onSubscribe(m33022b);
        if (m33022b.mo1769e()) {
            return;
        }
        try {
            Object obj = (Object) C23544b.m32923e(this.f90871b.call(), "The callable returned a null value");
            if (!m33022b.mo1769e()) {
                interfaceC23445I.onSuccess(obj);
            }
        } catch (Throwable th) {
            C23475a.m33009b(th);
            if (!m33022b.mo1769e()) {
                interfaceC23445I.onError(th);
            } else {
                C24508a.m31988u(th);
            }
        }
    }
}
