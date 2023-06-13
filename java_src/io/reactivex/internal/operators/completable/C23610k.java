package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.disposables.C23466d;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.completable.k */
/* loaded from: classes6.dex */
public final class C23610k extends AbstractC23461c {

    /* renamed from: b */
    public final InterfaceC23478a f88407b;

    public C23610k(InterfaceC23478a interfaceC23478a) {
        this.f88407b = interfaceC23478a;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        InterfaceC23465c m33022b = C23466d.m33022b();
        interfaceC23476f.onSubscribe(m33022b);
        try {
            this.f88407b.run();
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
