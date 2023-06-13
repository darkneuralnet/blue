package io.reactivex.internal.observers;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.fuseable.InterfaceC23550e;
import io.reactivex.internal.fuseable.InterfaceC23555j;
import io.reactivex.internal.util.C24487s;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.observers.q */
/* loaded from: classes6.dex */
public final class C23572q<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<T>, InterfaceC23465c {
    private static final long serialVersionUID = -5417183359794346637L;

    /* renamed from: b */
    public final InterfaceC23573r<T> f88321b;

    /* renamed from: c */
    public final int f88322c;

    /* renamed from: d */
    public InterfaceC23555j<T> f88323d;

    /* renamed from: e */
    public volatile boolean f88324e;

    /* renamed from: f */
    public int f88325f;

    public C23572q(InterfaceC23573r<T> interfaceC23573r, int i) {
        this.f88321b = interfaceC23573r;
        this.f88322c = i;
    }

    /* renamed from: a */
    public boolean m32908a() {
        return this.f88324e;
    }

    /* renamed from: b */
    public InterfaceC23555j<T> m32907b() {
        return this.f88323d;
    }

    /* renamed from: c */
    public void m32906c() {
        this.f88324e = true;
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        EnumC23501d.m33000a(this);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return EnumC23501d.m32999b(get());
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        this.f88321b.mo32408c(this);
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        this.f88321b.mo32410a(this, th);
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        if (this.f88325f == 0) {
            this.f88321b.mo32407d(this, t);
        } else {
            this.f88321b.mo32409b();
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        if (EnumC23501d.m32995h(this, interfaceC23465c)) {
            if (interfaceC23465c instanceof InterfaceC23550e) {
                InterfaceC23550e interfaceC23550e = (InterfaceC23550e) interfaceC23465c;
                int mo31868b = interfaceC23550e.mo31868b(3);
                if (mo31868b == 1) {
                    this.f88325f = mo31868b;
                    this.f88323d = interfaceC23550e;
                    this.f88324e = true;
                    this.f88321b.mo32408c(this);
                    return;
                } else if (mo31868b == 2) {
                    this.f88325f = mo31868b;
                    this.f88323d = interfaceC23550e;
                    return;
                }
            }
            this.f88323d = C24487s.m32214c(-this.f88322c);
        }
    }
}
