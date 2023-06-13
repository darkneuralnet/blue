package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.fuseable.InterfaceCallableC23553h;
/* renamed from: io.reactivex.internal.operators.observable.U */
/* loaded from: classes6.dex */
public final class C24099U extends Observable<Object> implements InterfaceCallableC23553h<Object> {

    /* renamed from: b */
    public static final Observable<Object> f89947b = new C24099U();

    private C24099U() {
    }

    @Override // io.reactivex.internal.fuseable.InterfaceCallableC23553h, java.util.concurrent.Callable
    public Object call() {
        return null;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Object> interfaceC23436D) {
        EnumC23502e.m32990d(interfaceC23436D);
    }
}
