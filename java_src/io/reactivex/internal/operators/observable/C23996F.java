package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.observable.F */
/* loaded from: classes6.dex */
public final class C23996F<T> extends Observable<T> {

    /* renamed from: b */
    public final Callable<? extends InterfaceC23434B<? extends T>> f89584b;

    public C23996F(Callable<? extends InterfaceC23434B<? extends T>> callable) {
        this.f89584b = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        try {
            ((InterfaceC23434B) C23544b.m32923e(this.f89584b.call(), "null ObservableSource supplied")).subscribe(interfaceC23436D);
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC23502e.m32987i(th, interfaceC23436D);
        }
    }
}
