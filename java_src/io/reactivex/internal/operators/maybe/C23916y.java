package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24541s;
import io.reactivex.disposables.C23466d;
import io.reactivex.internal.fuseable.InterfaceCallableC23553h;
/* renamed from: io.reactivex.internal.operators.maybe.y */
/* loaded from: classes6.dex */
public final class C23916y<T> extends AbstractC24507p<T> implements InterfaceCallableC23553h<T> {

    /* renamed from: b */
    public final T f89294b;

    public C23916y(T t) {
        this.f89294b = t;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        interfaceC24541s.onSubscribe(C23466d.m33023a());
        interfaceC24541s.onSuccess((T) this.f89294b);
    }

    @Override // io.reactivex.internal.fuseable.InterfaceCallableC23553h, java.util.concurrent.Callable
    public T call() {
        return this.f89294b;
    }
}
