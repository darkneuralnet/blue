package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23496h;
import io.reactivex.internal.observers.C23580y;
/* renamed from: io.reactivex.internal.operators.completable.C */
/* loaded from: classes6.dex */
public final class C23587C<T> extends AbstractC24490k<T> {

    /* renamed from: c */
    public final InterfaceC23496h f88357c;

    public C23587C(InterfaceC23496h interfaceC23496h) {
        this.f88357c = interfaceC23496h;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88357c.mo33003g(new C23580y(interfaceC42141hT5));
    }
}
