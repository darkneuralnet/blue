package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.disposables.C23466d;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.completable.l */
/* loaded from: classes6.dex */
public final class C23611l extends AbstractC23461c {

    /* renamed from: b */
    public final Callable<?> f88408b;

    public C23611l(Callable<?> callable) {
        this.f88408b = callable;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        InterfaceC23465c m33022b = C23466d.m33022b();
        interfaceC23476f.onSubscribe(m33022b);
        try {
            this.f88408b.call();
            if (!m33022b.mo1769e()) {
                interfaceC23476f.onComplete();
            }
        } catch (Throwable th) {
            C23475a.m33009b(th);
            if (!m33022b.mo1769e()) {
                interfaceC23476f.onError(th);
            } else {
                C24508a.m31988u(th);
            }
        }
    }
}
