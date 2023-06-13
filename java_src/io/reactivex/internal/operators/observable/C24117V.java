package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.observable.V */
/* loaded from: classes6.dex */
public final class C24117V<T> extends Observable<T> {

    /* renamed from: b */
    public final Callable<? extends Throwable> f89984b;

    public C24117V(Callable<? extends Throwable> callable) {
        this.f89984b = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        try {
            th = (Throwable) C23544b.m32923e(this.f89984b.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            C23475a.m33009b(th);
        }
        EnumC23502e.m32987i(th, interfaceC23436D);
    }
}
