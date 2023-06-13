package io.reactivex.subjects;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.util.C24464a;
import io.reactivex.internal.util.EnumC24479n;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.subjects.f */
/* loaded from: classes8.dex */
public final class C24566f<T> extends AbstractC24569h<T> implements C24464a.InterfaceC24465a<Object> {

    /* renamed from: b */
    public final AbstractC24569h<T> f91258b;

    /* renamed from: c */
    public boolean f91259c;

    /* renamed from: d */
    public C24464a<Object> f91260d;

    /* renamed from: e */
    public volatile boolean f91261e;

    public C24566f(AbstractC24569h<T> abstractC24569h) {
        this.f91258b = abstractC24569h;
    }

    /* renamed from: c */
    public void m31885c() {
        C24464a<Object> c24464a;
        while (true) {
            synchronized (this) {
                c24464a = this.f91260d;
                if (c24464a == null) {
                    this.f91259c = false;
                    return;
                }
                this.f91260d = null;
            }
            c24464a.m32282d(this);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        if (this.f91261e) {
            return;
        }
        synchronized (this) {
            if (this.f91261e) {
                return;
            }
            this.f91261e = true;
            if (this.f91259c) {
                C24464a<Object> c24464a = this.f91260d;
                if (c24464a == null) {
                    c24464a = new C24464a<>(4);
                    this.f91260d = c24464a;
                }
                c24464a.m32283c(EnumC24479n.m32243e());
                return;
            }
            this.f91259c = true;
            this.f91258b.onComplete();
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        if (this.f91261e) {
            C24508a.m31988u(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.f91261e) {
                this.f91261e = true;
                if (this.f91259c) {
                    C24464a<Object> c24464a = this.f91260d;
                    if (c24464a == null) {
                        c24464a = new C24464a<>(4);
                        this.f91260d = c24464a;
                    }
                    c24464a.m32281e(EnumC24479n.m32241g(th));
                    return;
                }
                this.f91259c = true;
                z = false;
            }
            if (z) {
                C24508a.m31988u(th);
            } else {
                this.f91258b.onError(th);
            }
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        if (this.f91261e) {
            return;
        }
        synchronized (this) {
            if (this.f91261e) {
                return;
            }
            if (this.f91259c) {
                C24464a<Object> c24464a = this.f91260d;
                if (c24464a == null) {
                    c24464a = new C24464a<>(4);
                    this.f91260d = c24464a;
                }
                c24464a.m32283c(EnumC24479n.m32236l(t));
                return;
            }
            this.f91259c = true;
            this.f91258b.onNext(t);
            m31885c();
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        boolean z = true;
        if (!this.f91261e) {
            synchronized (this) {
                if (!this.f91261e) {
                    if (this.f91259c) {
                        C24464a<Object> c24464a = this.f91260d;
                        if (c24464a == null) {
                            c24464a = new C24464a<>(4);
                            this.f91260d = c24464a;
                        }
                        c24464a.m32283c(EnumC24479n.m32242f(interfaceC23465c));
                        return;
                    }
                    this.f91259c = true;
                    z = false;
                }
            }
        }
        if (z) {
            interfaceC23465c.dispose();
            return;
        }
        this.f91258b.onSubscribe(interfaceC23465c);
        m31885c();
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f91258b.subscribe(interfaceC23436D);
    }

    @Override // io.reactivex.internal.util.C24464a.InterfaceC24465a, io.reactivex.functions.InterfaceC23494q
    public boolean test(Object obj) {
        return EnumC24479n.m32244d(obj, this.f91258b);
    }
}
