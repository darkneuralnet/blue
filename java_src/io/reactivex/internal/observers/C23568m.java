package io.reactivex.internal.observers;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.observers.m */
/* loaded from: classes6.dex */
public final class C23568m<T> implements InterfaceC23436D<T>, InterfaceC23465c {

    /* renamed from: b */
    public final InterfaceC23436D<? super T> f88310b;

    /* renamed from: c */
    public final InterfaceC23484g<? super InterfaceC23465c> f88311c;

    /* renamed from: d */
    public final InterfaceC23478a f88312d;

    /* renamed from: e */
    public InterfaceC23465c f88313e;

    public C23568m(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g, InterfaceC23478a interfaceC23478a) {
        this.f88310b = interfaceC23436D;
        this.f88311c = interfaceC23484g;
        this.f88312d = interfaceC23478a;
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        InterfaceC23465c interfaceC23465c = this.f88313e;
        EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
        if (interfaceC23465c != enumC23501d) {
            this.f88313e = enumC23501d;
            try {
                this.f88312d.run();
            } catch (Throwable th) {
                C23475a.m33009b(th);
                C24508a.m31988u(th);
            }
            interfaceC23465c.dispose();
        }
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return this.f88313e.mo1769e();
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        InterfaceC23465c interfaceC23465c = this.f88313e;
        EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
        if (interfaceC23465c != enumC23501d) {
            this.f88313e = enumC23501d;
            this.f88310b.onComplete();
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        InterfaceC23465c interfaceC23465c = this.f88313e;
        EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
        if (interfaceC23465c != enumC23501d) {
            this.f88313e = enumC23501d;
            this.f88310b.onError(th);
            return;
        }
        C24508a.m31988u(th);
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        this.f88310b.onNext(t);
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        try {
            this.f88311c.accept(interfaceC23465c);
            if (EnumC23501d.m32993j(this.f88313e, interfaceC23465c)) {
                this.f88313e = interfaceC23465c;
                this.f88310b.onSubscribe(this);
            }
        } catch (Throwable th) {
            C23475a.m33009b(th);
            interfaceC23465c.dispose();
            this.f88313e = EnumC23501d.DISPOSED;
            EnumC23502e.m32987i(th, this.f88310b);
        }
    }
}
