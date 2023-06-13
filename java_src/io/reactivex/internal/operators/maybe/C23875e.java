package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.maybe.e */
/* loaded from: classes6.dex */
public final class C23875e<T> extends AbstractC24507p<T> {

    /* renamed from: b */
    public final Callable<? extends InterfaceC24574u<? extends T>> f89219b;

    public C23875e(Callable<? extends InterfaceC24574u<? extends T>> callable) {
        this.f89219b = callable;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        try {
            ((InterfaceC24574u) C23544b.m32923e(this.f89219b.call(), "The maybeSupplier returned a null MaybeSource")).mo31865a(interfaceC24541s);
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC23502e.m32988h(th, interfaceC24541s);
        }
    }
}
