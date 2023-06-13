package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.disposables.C23466d;
/* renamed from: io.reactivex.internal.operators.single.v */
/* loaded from: classes6.dex */
public final class C24398v<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final T f90878b;

    public C24398v(T t) {
        this.f90878b = t;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        interfaceC23445I.onSubscribe(C23466d.m33023a());
        interfaceC23445I.onSuccess((T) this.f90878b);
    }
}
