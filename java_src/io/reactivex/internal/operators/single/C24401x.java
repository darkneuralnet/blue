package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.internal.disposables.EnumC23502e;
/* renamed from: io.reactivex.internal.operators.single.x */
/* loaded from: classes6.dex */
public final class C24401x extends AbstractC23442F<Object> {

    /* renamed from: b */
    public static final AbstractC23442F<Object> f90883b = new C24401x();

    private C24401x() {
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super Object> interfaceC23445I) {
        interfaceC23445I.onSubscribe(EnumC23502e.NEVER);
    }
}
