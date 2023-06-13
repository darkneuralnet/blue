package p000;

import io.reactivex.InterfaceC23436D;
/* renamed from: gt5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41801gt5<T> extends AbstractC37638Zt4<T> {

    /* renamed from: b */
    public final AbstractC37638Zt4<T> f84408b;

    /* renamed from: c */
    public boolean f84409c;

    /* renamed from: d */
    public C10852am<T> f84410d;

    public C41801gt5(AbstractC37638Zt4<T> abstractC37638Zt4) {
        this.f84408b = abstractC37638Zt4;
    }

    @Override // p000.AbstractC37638Zt4
    /* renamed from: a */
    public boolean mo25411a() {
        return this.f84408b.mo25411a();
    }

    @Override // p000.AbstractC37638Zt4, io.reactivex.functions.InterfaceC23484g
    public void accept(T t) {
        synchronized (this) {
            if (this.f84409c) {
                C10852am<T> c10852am = this.f84410d;
                if (c10852am == null) {
                    c10852am = new C10852am<>(4);
                    this.f84410d = c10852am;
                }
                c10852am.m70772b(t);
                return;
            }
            this.f84409c = true;
            this.f84408b.accept(t);
            m37363e();
        }
    }

    /* renamed from: e */
    public final void m37363e() {
        C10852am<T> c10852am;
        while (true) {
            synchronized (this) {
                c10852am = this.f84410d;
                if (c10852am == null) {
                    this.f84409c = false;
                    return;
                }
                this.f84410d = null;
            }
            c10852am.m70773a(this.f84408b);
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f84408b.subscribe(interfaceC23436D);
    }
}
