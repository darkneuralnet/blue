package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.completable.e */
/* loaded from: classes6.dex */
public final class C23601e extends AbstractC23461c {

    /* renamed from: b */
    public final Callable<? extends InterfaceC23496h> f88384b;

    public C23601e(Callable<? extends InterfaceC23496h> callable) {
        this.f88384b = callable;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        try {
            ((InterfaceC23496h) C23544b.m32923e(this.f88384b.call(), "The completableSupplier returned a null CompletableSource")).mo33003g(interfaceC23476f);
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC23502e.m32989g(th, interfaceC23476f);
        }
    }
}
