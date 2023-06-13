package com.uber.rxdogtag;

import com.uber.rxdogtag.C19549M;
import io.reactivex.InterfaceC24541s;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.observers.InterfaceC24502f;
import java.util.Objects;
/* renamed from: com.uber.rxdogtag.l */
/* loaded from: classes7.dex */
public final class C19569l<T> implements InterfaceC24541s<T>, InterfaceC24502f {

    /* renamed from: b */
    public final Throwable f75623b = new Throwable();

    /* renamed from: c */
    public final C19549M.C19551b f75624c;

    /* renamed from: d */
    public final InterfaceC24541s<T> f75625d;

    public C19569l(C19549M.C19551b c19551b, InterfaceC24541s<T> interfaceC24541s) {
        this.f75624c = c19551b;
        this.f75625d = interfaceC24541s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m45110g(Throwable th) {
        C19549M.m45134w(this.f75624c, this.f75623b, th, "onComplete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m45109h(Throwable th) {
        C19549M.m45134w(this.f75624c, this.f75623b, th, "onSubscribe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m45108i(InterfaceC23465c interfaceC23465c) {
        this.f75625d.onSubscribe(interfaceC23465c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m45107j(Throwable th) {
        C19549M.m45134w(this.f75624c, this.f75623b, th, "onSuccess");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m45106k(Object obj) {
        this.f75625d.onSuccess(obj);
    }

    @Override // io.reactivex.observers.InterfaceC24502f
    public boolean hasCustomOnError() {
        InterfaceC24541s<T> interfaceC24541s = this.f75625d;
        if ((interfaceC24541s instanceof InterfaceC24502f) && ((InterfaceC24502f) interfaceC24541s).hasCustomOnError()) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.InterfaceC24541s
    public void onComplete() {
        if (this.f75624c.f75604e) {
            C19549M.InterfaceC19554d interfaceC19554d = new C19549M.InterfaceC19554d() { // from class: com.uber.rxdogtag.j
                @Override // com.uber.rxdogtag.C19549M.InterfaceC19554d
                public final void accept(Object obj) {
                    C19569l.this.m45110g((Throwable) obj);
                }
            };
            final InterfaceC24541s<T> interfaceC24541s = this.f75625d;
            Objects.requireNonNull(interfaceC24541s);
            C19549M.m45144m(interfaceC19554d, new Runnable() { // from class: com.uber.rxdogtag.k
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC24541s.this.onComplete();
                }
            });
            return;
        }
        this.f75625d.onComplete();
    }

    @Override // io.reactivex.InterfaceC24541s
    public void onError(Throwable th) {
        C19549M.m45134w(this.f75624c, this.f75623b, th, null);
    }

    @Override // io.reactivex.InterfaceC24541s
    public void onSubscribe(final InterfaceC23465c interfaceC23465c) {
        if (this.f75624c.f75604e) {
            C19549M.m45144m(new C19549M.InterfaceC19554d() { // from class: com.uber.rxdogtag.f
                @Override // com.uber.rxdogtag.C19549M.InterfaceC19554d
                public final void accept(Object obj) {
                    C19569l.this.m45109h((Throwable) obj);
                }
            }, new Runnable() { // from class: com.uber.rxdogtag.g
                @Override // java.lang.Runnable
                public final void run() {
                    C19569l.this.m45108i(interfaceC23465c);
                }
            });
        } else {
            this.f75625d.onSubscribe(interfaceC23465c);
        }
    }

    @Override // io.reactivex.InterfaceC24541s
    public void onSuccess(final T t) {
        if (this.f75624c.f75604e) {
            C19549M.m45144m(new C19549M.InterfaceC19554d() { // from class: com.uber.rxdogtag.h
                @Override // com.uber.rxdogtag.C19549M.InterfaceC19554d
                public final void accept(Object obj) {
                    C19569l.this.m45107j((Throwable) obj);
                }
            }, new Runnable() { // from class: com.uber.rxdogtag.i
                @Override // java.lang.Runnable
                public final void run() {
                    C19569l.this.m45106k(t);
                }
            });
        } else {
            this.f75625d.onSuccess(t);
        }
    }
}
