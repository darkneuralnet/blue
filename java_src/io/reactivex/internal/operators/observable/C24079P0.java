package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23445I;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.operators.observable.C24073O0;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.observable.P0 */
/* loaded from: classes6.dex */
public final class C24079P0<T, R> extends AbstractC23442F<R> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f89873b;

    /* renamed from: c */
    public final Callable<R> f89874c;

    /* renamed from: d */
    public final InterfaceC23480c<R, ? super T, R> f89875d;

    public C24079P0(InterfaceC23434B<T> interfaceC23434B, Callable<R> callable, InterfaceC23480c<R, ? super T, R> interfaceC23480c) {
        this.f89873b = interfaceC23434B;
        this.f89874c = callable;
        this.f89875d = interfaceC23480c;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super R> interfaceC23445I) {
        try {
            this.f89873b.subscribe(new C24073O0.C24074a(interfaceC23445I, this.f89875d, C23544b.m32923e(this.f89874c.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC23502e.m32986j(th, interfaceC23445I);
        }
    }
}
