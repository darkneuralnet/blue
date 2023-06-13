package io.reactivex.internal.observers;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.observers.o */
/* loaded from: classes6.dex */
public final class C23570o<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<T>, InterfaceC23465c {
    private static final long serialVersionUID = -4403180040475402120L;

    /* renamed from: b */
    public final InterfaceC23494q<? super T> f88314b;

    /* renamed from: c */
    public final InterfaceC23484g<? super Throwable> f88315c;

    /* renamed from: d */
    public final InterfaceC23478a f88316d;

    /* renamed from: e */
    public boolean f88317e;

    public C23570o(InterfaceC23494q<? super T> interfaceC23494q, InterfaceC23484g<? super Throwable> interfaceC23484g, InterfaceC23478a interfaceC23478a) {
        this.f88314b = interfaceC23494q;
        this.f88315c = interfaceC23484g;
        this.f88316d = interfaceC23478a;
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
        if (this.f88317e) {
            return;
        }
        this.f88317e = true;
        try {
            this.f88316d.run();
        } catch (Throwable th) {
            C23475a.m33009b(th);
            C24508a.m31988u(th);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        if (this.f88317e) {
            C24508a.m31988u(th);
            return;
        }
        this.f88317e = true;
        try {
            this.f88315c.accept(th);
        } catch (Throwable th2) {
            C23475a.m33009b(th2);
            C24508a.m31988u(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        if (this.f88317e) {
            return;
        }
        try {
            if (!this.f88314b.test(t)) {
                dispose();
                onComplete();
            }
        } catch (Throwable th) {
            C23475a.m33009b(th);
            dispose();
            onError(th);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        EnumC23501d.m32995h(this, interfaceC23465c);
    }
}
