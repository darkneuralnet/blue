package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.single.c */
/* loaded from: classes6.dex */
public final class C24360c<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final Callable<? extends InterfaceC23447K<? extends T>> f90801b;

    public C24360c(Callable<? extends InterfaceC23447K<? extends T>> callable) {
        this.f90801b = callable;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        try {
            ((InterfaceC23447K) C23544b.m32923e(this.f90801b.call(), "The singleSupplier returned a null SingleSource")).mo33096a(interfaceC23445I);
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC23502e.m32986j(th, interfaceC23445I);
        }
    }
}
