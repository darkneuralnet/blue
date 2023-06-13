package io.reactivex.observers;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.observers.g */
/* loaded from: classes8.dex */
public final class C24503g<T> implements InterfaceC23436D<T>, InterfaceC23465c {

    /* renamed from: b */
    public final InterfaceC23436D<? super T> f91105b;

    /* renamed from: c */
    public InterfaceC23465c f91106c;

    /* renamed from: d */
    public boolean f91107d;

    public C24503g(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f91105b = interfaceC23436D;
    }

    /* renamed from: a */
    public void m32077a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f91105b.onSubscribe(EnumC23502e.INSTANCE);
            try {
                this.f91105b.onError(nullPointerException);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                C24508a.m31988u(new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            C23475a.m33009b(th2);
            C24508a.m31988u(new CompositeException(nullPointerException, th2));
        }
    }

    /* renamed from: b */
    public void m32076b() {
        this.f91107d = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f91105b.onSubscribe(EnumC23502e.INSTANCE);
            try {
                this.f91105b.onError(nullPointerException);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                C24508a.m31988u(new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            C23475a.m33009b(th2);
            C24508a.m31988u(new CompositeException(nullPointerException, th2));
        }
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        this.f91106c.dispose();
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return this.f91106c.mo1769e();
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        if (this.f91107d) {
            return;
        }
        this.f91107d = true;
        if (this.f91106c == null) {
            m32077a();
            return;
        }
        try {
            this.f91105b.onComplete();
        } catch (Throwable th) {
            C23475a.m33009b(th);
            C24508a.m31988u(th);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        if (this.f91107d) {
            C24508a.m31988u(th);
            return;
        }
        this.f91107d = true;
        if (this.f91106c == null) {
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                this.f91105b.onSubscribe(EnumC23502e.INSTANCE);
                try {
                    this.f91105b.onError(new CompositeException(th, nullPointerException));
                    return;
                } catch (Throwable th2) {
                    C23475a.m33009b(th2);
                    C24508a.m31988u(new CompositeException(th, nullPointerException, th2));
                    return;
                }
            } catch (Throwable th3) {
                C23475a.m33009b(th3);
                C24508a.m31988u(new CompositeException(th, nullPointerException, th3));
                return;
            }
        }
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        try {
            this.f91105b.onError(th);
        } catch (Throwable th4) {
            C23475a.m33009b(th4);
            C24508a.m31988u(new CompositeException(th, th4));
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        if (this.f91107d) {
            return;
        }
        if (this.f91106c == null) {
            m32076b();
        } else if (t == null) {
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f91106c.dispose();
                onError(nullPointerException);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                onError(new CompositeException(nullPointerException, th));
            }
        } else {
            try {
                this.f91105b.onNext(t);
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                try {
                    this.f91106c.dispose();
                    onError(th2);
                } catch (Throwable th3) {
                    C23475a.m33009b(th3);
                    onError(new CompositeException(th2, th3));
                }
            }
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        if (EnumC23501d.m32993j(this.f91106c, interfaceC23465c)) {
            this.f91106c = interfaceC23465c;
            try {
                this.f91105b.onSubscribe(this);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f91107d = true;
                try {
                    interfaceC23465c.dispose();
                    C24508a.m31988u(th);
                } catch (Throwable th2) {
                    C23475a.m33009b(th2);
                    C24508a.m31988u(new CompositeException(th, th2));
                }
            }
        }
    }
}
