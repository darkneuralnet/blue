package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.single.n */
/* loaded from: classes6.dex */
public final class C24383n<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final Callable<? extends Throwable> f90854b;

    public C24383n(Callable<? extends Throwable> callable) {
        this.f90854b = callable;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        try {
            th = (Throwable) C23544b.m32923e(this.f90854b.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            C23475a.m33009b(th);
        }
        EnumC23502e.m32986j(th, interfaceC23445I);
    }
}
