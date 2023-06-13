package io.reactivex.internal.observers;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23506a;
import io.reactivex.observers.InterfaceC24502f;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.observers.s */
/* loaded from: classes6.dex */
public final class C23574s<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<T>, InterfaceC23465c, InterfaceC24502f {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: b */
    public final InterfaceC23484g<? super T> f88326b;

    /* renamed from: c */
    public final InterfaceC23484g<? super Throwable> f88327c;

    /* renamed from: d */
    public final InterfaceC23478a f88328d;

    /* renamed from: e */
    public final InterfaceC23484g<? super InterfaceC23465c> f88329e;

    public C23574s(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a, InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g3) {
        this.f88326b = interfaceC23484g;
        this.f88327c = interfaceC23484g2;
        this.f88328d = interfaceC23478a;
        this.f88329e = interfaceC23484g3;
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
        return this.f88327c != C23506a.f88250f;
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        if (!mo1769e()) {
            lazySet(EnumC23501d.DISPOSED);
            try {
                this.f88328d.run();
            } catch (Throwable th) {
                C23475a.m33009b(th);
                C24508a.m31988u(th);
            }
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        if (!mo1769e()) {
            lazySet(EnumC23501d.DISPOSED);
            try {
                this.f88327c.accept(th);
                return;
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                C24508a.m31988u(new CompositeException(th, th2));
                return;
            }
        }
        C24508a.m31988u(th);
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        if (!mo1769e()) {
            try {
                this.f88326b.accept(t);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                get().dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        if (EnumC23501d.m32995h(this, interfaceC23465c)) {
            try {
                this.f88329e.accept(this);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                interfaceC23465c.dispose();
                onError(th);
            }
        }
    }
}
