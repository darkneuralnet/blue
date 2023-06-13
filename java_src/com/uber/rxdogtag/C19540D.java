package com.uber.rxdogtag;

import com.uber.rxdogtag.C19549M;
import io.reactivex.InterfaceC24494o;
import io.reactivex.observers.InterfaceC24502f;
import java.util.Objects;
/* renamed from: com.uber.rxdogtag.D */
/* loaded from: classes7.dex */
public final class C19540D<T> implements InterfaceC24494o<T>, InterfaceC24502f {

    /* renamed from: b */
    public final Throwable f75582b = new Throwable();

    /* renamed from: c */
    public final C19549M.C19551b f75583c;

    /* renamed from: d */
    public final InterfaceC42141hT5<T> f75584d;

    public C19540D(C19549M.C19551b c19551b, InterfaceC42141hT5<T> interfaceC42141hT5) {
        this.f75583c = c19551b;
        this.f75584d = interfaceC42141hT5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m45166g(Throwable th) {
        C19549M.m45134w(this.f75583c, this.f75582b, th, "onComplete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m45165i(Throwable th) {
        C19549M.m45134w(this.f75583c, this.f75582b, th, "onNext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m45164j(Object obj) {
        this.f75584d.onNext(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m45163k(Throwable th) {
        C19549M.m45134w(this.f75583c, this.f75582b, th, "onSubscribe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m45162l(InterfaceC46292oT5 interfaceC46292oT5) {
        this.f75584d.mo31867a(interfaceC46292oT5);
    }

    @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
    /* renamed from: a */
    public void mo31867a(final InterfaceC46292oT5 interfaceC46292oT5) {
        if (this.f75583c.f75604e) {
            C19549M.m45144m(new C19549M.InterfaceC19554d() { // from class: com.uber.rxdogtag.x
                @Override // com.uber.rxdogtag.C19549M.InterfaceC19554d
                public final void accept(Object obj) {
                    C19540D.this.m45163k((Throwable) obj);
                }
            }, new Runnable() { // from class: com.uber.rxdogtag.y
                @Override // java.lang.Runnable
                public final void run() {
                    C19540D.this.m45162l(interfaceC46292oT5);
                }
            });
        } else {
            this.f75584d.mo31867a(interfaceC46292oT5);
        }
    }

    @Override // io.reactivex.observers.InterfaceC24502f
    public boolean hasCustomOnError() {
        InterfaceC42141hT5<T> interfaceC42141hT5 = this.f75584d;
        if ((interfaceC42141hT5 instanceof InterfaceC24502f) && ((InterfaceC24502f) interfaceC42141hT5).hasCustomOnError()) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC42141hT5
    public void onComplete() {
        if (this.f75583c.f75604e) {
            C19549M.InterfaceC19554d interfaceC19554d = new C19549M.InterfaceC19554d() { // from class: com.uber.rxdogtag.z
                @Override // com.uber.rxdogtag.C19549M.InterfaceC19554d
                public final void accept(Object obj) {
                    C19540D.this.m45166g((Throwable) obj);
                }
            };
            final InterfaceC42141hT5<T> interfaceC42141hT5 = this.f75584d;
            Objects.requireNonNull(interfaceC42141hT5);
            C19549M.m45144m(interfaceC19554d, new Runnable() { // from class: com.uber.rxdogtag.A
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC42141hT5.this.onComplete();
                }
            });
            return;
        }
        this.f75584d.onComplete();
    }

    @Override // p000.InterfaceC42141hT5
    public void onError(Throwable th) {
        C19549M.m45134w(this.f75583c, this.f75582b, th, null);
    }

    @Override // p000.InterfaceC42141hT5
    public void onNext(final T t) {
        if (this.f75583c.f75604e) {
            C19549M.m45144m(new C19549M.InterfaceC19554d() { // from class: com.uber.rxdogtag.B
                @Override // com.uber.rxdogtag.C19549M.InterfaceC19554d
                public final void accept(Object obj) {
                    C19540D.this.m45165i((Throwable) obj);
                }
            }, new Runnable() { // from class: com.uber.rxdogtag.C
                @Override // java.lang.Runnable
                public final void run() {
                    C19540D.this.m45164j(t);
                }
            });
        } else {
            this.f75584d.onNext(t);
        }
    }
}
