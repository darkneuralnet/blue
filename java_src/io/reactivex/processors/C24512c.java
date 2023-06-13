package io.reactivex.processors;

import io.reactivex.internal.util.C24464a;
import io.reactivex.internal.util.EnumC24479n;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.processors.c */
/* loaded from: classes8.dex */
public final class C24512c<T> extends AbstractC24509a<T> {

    /* renamed from: c */
    public final AbstractC24509a<T> f91149c;

    /* renamed from: d */
    public boolean f91150d;

    /* renamed from: e */
    public C24464a<Object> f91151e;

    /* renamed from: f */
    public volatile boolean f91152f;

    public C24512c(AbstractC24509a<T> abstractC24509a) {
        this.f91149c = abstractC24509a;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f91149c.mo23497c(interfaceC42141hT5);
    }

    @Override // p000.InterfaceC42141hT5
    /* renamed from: a */
    public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
        boolean z = true;
        if (!this.f91152f) {
            synchronized (this) {
                if (!this.f91152f) {
                    if (this.f91150d) {
                        C24464a<Object> c24464a = this.f91151e;
                        if (c24464a == null) {
                            c24464a = new C24464a<>(4);
                            this.f91151e = c24464a;
                        }
                        c24464a.m32283c(EnumC24479n.m32235m(interfaceC46292oT5));
                        return;
                    }
                    this.f91150d = true;
                    z = false;
                }
            }
        }
        if (z) {
            interfaceC46292oT5.cancel();
            return;
        }
        this.f91149c.mo31867a(interfaceC46292oT5);
        m31972y1();
    }

    @Override // p000.InterfaceC42141hT5
    public void onComplete() {
        if (this.f91152f) {
            return;
        }
        synchronized (this) {
            if (this.f91152f) {
                return;
            }
            this.f91152f = true;
            if (this.f91150d) {
                C24464a<Object> c24464a = this.f91151e;
                if (c24464a == null) {
                    c24464a = new C24464a<>(4);
                    this.f91151e = c24464a;
                }
                c24464a.m32283c(EnumC24479n.m32243e());
                return;
            }
            this.f91150d = true;
            this.f91149c.onComplete();
        }
    }

    @Override // p000.InterfaceC42141hT5
    public void onError(Throwable th) {
        if (this.f91152f) {
            C24508a.m31988u(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.f91152f) {
                this.f91152f = true;
                if (this.f91150d) {
                    C24464a<Object> c24464a = this.f91151e;
                    if (c24464a == null) {
                        c24464a = new C24464a<>(4);
                        this.f91151e = c24464a;
                    }
                    c24464a.m32281e(EnumC24479n.m32241g(th));
                    return;
                }
                this.f91150d = true;
                z = false;
            }
            if (z) {
                C24508a.m31988u(th);
            } else {
                this.f91149c.onError(th);
            }
        }
    }

    @Override // p000.InterfaceC42141hT5
    public void onNext(T t) {
        if (this.f91152f) {
            return;
        }
        synchronized (this) {
            if (this.f91152f) {
                return;
            }
            if (this.f91150d) {
                C24464a<Object> c24464a = this.f91151e;
                if (c24464a == null) {
                    c24464a = new C24464a<>(4);
                    this.f91151e = c24464a;
                }
                c24464a.m32283c(EnumC24479n.m32236l(t));
                return;
            }
            this.f91150d = true;
            this.f91149c.onNext(t);
            m31972y1();
        }
    }

    /* renamed from: y1 */
    public void m31972y1() {
        C24464a<Object> c24464a;
        while (true) {
            synchronized (this) {
                c24464a = this.f91151e;
                if (c24464a == null) {
                    this.f91150d = false;
                    return;
                }
                this.f91151e = null;
            }
            c24464a.m32285a(this.f91149c);
        }
    }
}
