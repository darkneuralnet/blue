package com.uber.rxdogtag;

import com.uber.rxdogtag.C19549M;
import io.reactivex.InterfaceC23445I;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.observers.InterfaceC24502f;
/* renamed from: com.uber.rxdogtag.w */
/* loaded from: classes7.dex */
public final class C19580w<T> implements InterfaceC23445I<T>, InterfaceC24502f {

    /* renamed from: b */
    public final Throwable f75640b = new Throwable();

    /* renamed from: c */
    public final C19549M.C19551b f75641c;

    /* renamed from: d */
    public final InterfaceC23445I<T> f75642d;

    public C19580w(C19549M.C19551b c19551b, InterfaceC23445I<T> interfaceC23445I) {
        this.f75641c = c19551b;
        this.f75642d = interfaceC23445I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m45101e(Throwable th) {
        C19549M.m45134w(this.f75641c, this.f75640b, th, "onSubscribe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m45100g(InterfaceC23465c interfaceC23465c) {
        this.f75642d.onSubscribe(interfaceC23465c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m45099h(Throwable th) {
        C19549M.m45134w(this.f75641c, this.f75640b, th, "onSuccess");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m45098i(Object obj) {
        this.f75642d.onSuccess(obj);
    }

    @Override // io.reactivex.observers.InterfaceC24502f
    public boolean hasCustomOnError() {
        InterfaceC23445I<T> interfaceC23445I = this.f75642d;
        if ((interfaceC23445I instanceof InterfaceC24502f) && ((InterfaceC24502f) interfaceC23445I).hasCustomOnError()) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onError(Throwable th) {
        C19549M.m45134w(this.f75641c, this.f75640b, th, null);
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onSubscribe(final InterfaceC23465c interfaceC23465c) {
        if (this.f75641c.f75604e) {
            C19549M.m45144m(new C19549M.InterfaceC19554d() { // from class: com.uber.rxdogtag.u
                @Override // com.uber.rxdogtag.C19549M.InterfaceC19554d
                public final void accept(Object obj) {
                    C19580w.this.m45101e((Throwable) obj);
                }
            }, new Runnable() { // from class: com.uber.rxdogtag.v
                @Override // java.lang.Runnable
                public final void run() {
                    C19580w.this.m45100g(interfaceC23465c);
                }
            });
        } else {
            this.f75642d.onSubscribe(interfaceC23465c);
        }
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onSuccess(final T t) {
        if (this.f75641c.f75604e) {
            C19549M.m45144m(new C19549M.InterfaceC19554d() { // from class: com.uber.rxdogtag.s
                @Override // com.uber.rxdogtag.C19549M.InterfaceC19554d
                public final void accept(Object obj) {
                    C19580w.this.m45099h((Throwable) obj);
                }
            }, new Runnable() { // from class: com.uber.rxdogtag.t
                @Override // java.lang.Runnable
                public final void run() {
                    C19580w.this.m45098i(t);
                }
            });
        } else {
            this.f75642d.onSuccess(t);
        }
    }
}
