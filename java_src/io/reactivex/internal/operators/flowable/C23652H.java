package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.internal.fuseable.InterfaceCallableC23553h;
import io.reactivex.internal.subscriptions.C24461e;
/* renamed from: io.reactivex.internal.operators.flowable.H */
/* loaded from: classes6.dex */
public final class C23652H<T> extends AbstractC24490k<T> implements InterfaceCallableC23553h<T> {

    /* renamed from: c */
    public final T f88487c;

    public C23652H(T t) {
        this.f88487c = t;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        interfaceC42141hT5.mo31867a(new C24461e(interfaceC42141hT5, this.f88487c));
    }

    @Override // io.reactivex.internal.fuseable.InterfaceCallableC23553h, java.util.concurrent.Callable
    public T call() {
        return this.f88487c;
    }
}
