package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23433A;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.exceptions.C23475a;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.w0 */
/* loaded from: classes6.dex */
public final class C24316w0<R, T> extends AbstractC24145a<T, R> {
    public C24316w0(InterfaceC23434B<T> interfaceC23434B, InterfaceC23433A<? extends R, ? super T> interfaceC23433A) {
        super(interfaceC23434B);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        try {
            throw null;
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C23475a.m33009b(th);
            C24508a.m31988u(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
