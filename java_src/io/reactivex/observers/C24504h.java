package io.reactivex.observers;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.util.C24464a;
import io.reactivex.internal.util.EnumC24479n;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.observers.h */
/* loaded from: classes8.dex */
public final class C24504h<T> implements InterfaceC23436D<T>, InterfaceC23465c {

    /* renamed from: b */
    public final InterfaceC23436D<? super T> f91108b;

    /* renamed from: c */
    public final boolean f91109c;

    /* renamed from: d */
    public InterfaceC23465c f91110d;

    /* renamed from: e */
    public boolean f91111e;

    /* renamed from: f */
    public C24464a<Object> f91112f;

    /* renamed from: g */
    public volatile boolean f91113g;

    public C24504h(InterfaceC23436D<? super T> interfaceC23436D) {
        this(interfaceC23436D, false);
    }

    /* renamed from: a */
    public void m32075a() {
        C24464a<Object> c24464a;
        do {
            synchronized (this) {
                c24464a = this.f91112f;
                if (c24464a == null) {
                    this.f91111e = false;
                    return;
                }
                this.f91112f = null;
            }
        } while (!c24464a.m32284b((InterfaceC23436D<? super T>) this.f91108b));
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        this.f91110d.dispose();
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return this.f91110d.mo1769e();
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        if (this.f91113g) {
            return;
        }
        synchronized (this) {
            if (this.f91113g) {
                return;
            }
            if (this.f91111e) {
                C24464a<Object> c24464a = this.f91112f;
                if (c24464a == null) {
                    c24464a = new C24464a<>(4);
                    this.f91112f = c24464a;
                }
                c24464a.m32283c(EnumC24479n.m32243e());
                return;
            }
            this.f91113g = true;
            this.f91111e = true;
            this.f91108b.onComplete();
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        if (this.f91113g) {
            C24508a.m31988u(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.f91113g) {
                if (this.f91111e) {
                    this.f91113g = true;
                    C24464a<Object> c24464a = this.f91112f;
                    if (c24464a == null) {
                        c24464a = new C24464a<>(4);
                        this.f91112f = c24464a;
                    }
                    Object m32241g = EnumC24479n.m32241g(th);
                    if (this.f91109c) {
                        c24464a.m32283c(m32241g);
                    } else {
                        c24464a.m32281e(m32241g);
                    }
                    return;
                }
                this.f91113g = true;
                this.f91111e = true;
                z = false;
            }
            if (z) {
                C24508a.m31988u(th);
            } else {
                this.f91108b.onError(th);
            }
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        if (this.f91113g) {
            return;
        }
        if (t == null) {
            this.f91110d.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.f91113g) {
                return;
            }
            if (this.f91111e) {
                C24464a<Object> c24464a = this.f91112f;
                if (c24464a == null) {
                    c24464a = new C24464a<>(4);
                    this.f91112f = c24464a;
                }
                c24464a.m32283c(EnumC24479n.m32236l(t));
                return;
            }
            this.f91111e = true;
            this.f91108b.onNext(t);
            m32075a();
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        if (EnumC23501d.m32993j(this.f91110d, interfaceC23465c)) {
            this.f91110d = interfaceC23465c;
            this.f91108b.onSubscribe(this);
        }
    }

    public C24504h(InterfaceC23436D<? super T> interfaceC23436D, boolean z) {
        this.f91108b = interfaceC23436D;
        this.f91109c = z;
    }
}
