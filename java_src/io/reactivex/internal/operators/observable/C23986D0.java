package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.internal.disposables.EnumC23502e;
/* renamed from: io.reactivex.internal.operators.observable.D0 */
/* loaded from: classes6.dex */
public final class C23986D0 extends Observable<Object> {

    /* renamed from: b */
    public static final Observable<Object> f89545b = new C23986D0();

    private C23986D0() {
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Object> interfaceC23436D) {
        interfaceC23436D.onSubscribe(EnumC23502e.NEVER);
    }
}
