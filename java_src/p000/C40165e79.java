package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* renamed from: e79  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40165e79<V> extends D49<Object, V> {

    /* renamed from: p */
    public X69<?> f77984p;

    public C40165e79(XO8<? extends Mb9<?>> xo8, boolean z, Executor executor, InterfaceC38952c69<V> interfaceC38952c69) {
        super(xo8, z, false);
        this.f77984p = new H69(this, interfaceC38952c69, executor);
        m110958S();
    }

    @Override // p000.D49
    /* renamed from: K */
    public final void mo43244K(int i) {
        super.mo43244K(i);
        if (i == 1) {
            this.f77984p = null;
        }
    }

    @Override // p000.D49
    /* renamed from: R */
    public final void mo43243R() {
        X69<?> x69 = this.f77984p;
        if (x69 != null) {
            x69.m77368i();
        }
    }

    @Override // p000.AbstractC50204v39
    /* renamed from: t */
    public final void mo9238t() {
        X69<?> x69 = this.f77984p;
        if (x69 != null) {
            x69.m106914g();
        }
    }

    public C40165e79(XO8<? extends Mb9<?>> xo8, boolean z, Executor executor, Callable<V> callable) {
        super(xo8, z, false);
        this.f77984p = new P69(this, callable, executor);
        m110958S();
    }
}
