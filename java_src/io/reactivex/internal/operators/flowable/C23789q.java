package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.subscriptions.EnumC24460d;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.flowable.q */
/* loaded from: classes6.dex */
public final class C23789q<T> extends AbstractC24490k<T> {

    /* renamed from: c */
    public final Callable<? extends Throwable> f88951c;

    public C23789q(Callable<? extends Throwable> callable) {
        this.f88951c = callable;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        try {
            th = (Throwable) C23544b.m32923e(this.f88951c.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            C23475a.m33009b(th);
        }
        EnumC24460d.m32300c(th, interfaceC42141hT5);
    }
}
