package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24541s;
import io.reactivex.disposables.C23466d;
/* renamed from: io.reactivex.internal.operators.maybe.k */
/* loaded from: classes6.dex */
public final class C23886k<T> extends AbstractC24507p<T> {

    /* renamed from: b */
    public final Throwable f89239b;

    public C23886k(Throwable th) {
        this.f89239b = th;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        interfaceC24541s.onSubscribe(C23466d.m33023a());
        interfaceC24541s.onError(this.f89239b);
    }
}
