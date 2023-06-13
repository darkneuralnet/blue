package io.reactivex.internal.observers;

import io.reactivex.InterfaceC23445I;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23506a;
import io.reactivex.observers.InterfaceC24502f;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.observers.k */
/* loaded from: classes6.dex */
public final class C23566k<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23445I<T>, InterfaceC23465c, InterfaceC24502f {
    private static final long serialVersionUID = -7012088219455310787L;

    /* renamed from: b */
    public final InterfaceC23484g<? super T> f88306b;

    /* renamed from: c */
    public final InterfaceC23484g<? super Throwable> f88307c;

    public C23566k(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2) {
        this.f88306b = interfaceC23484g;
        this.f88307c = interfaceC23484g2;
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        EnumC23501d.m33000a(this);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return get() == EnumC23501d.DISPOSED;
    }

    @Override // io.reactivex.observers.InterfaceC24502f
    public boolean hasCustomOnError() {
        return this.f88307c != C23506a.f88250f;
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onError(Throwable th) {
        lazySet(EnumC23501d.DISPOSED);
        try {
            this.f88307c.accept(th);
        } catch (Throwable th2) {
            C23475a.m33009b(th2);
            C24508a.m31988u(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        EnumC23501d.m32995h(this, interfaceC23465c);
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onSuccess(T t) {
        lazySet(EnumC23501d.DISPOSED);
        try {
            this.f88306b.accept(t);
        } catch (Throwable th) {
            C23475a.m33009b(th);
            C24508a.m31988u(th);
        }
    }
}
