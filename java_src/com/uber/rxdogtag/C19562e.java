package com.uber.rxdogtag;

import com.uber.rxdogtag.C19549M;
import io.reactivex.InterfaceC23476f;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.observers.InterfaceC24502f;
import java.util.Objects;
/* renamed from: com.uber.rxdogtag.e */
/* loaded from: classes7.dex */
public final class C19562e implements InterfaceC23476f, InterfaceC24502f {

    /* renamed from: b */
    public final Throwable f75612b = new Throwable();

    /* renamed from: c */
    public final C19549M.C19551b f75613c;

    /* renamed from: d */
    public final InterfaceC23476f f75614d;

    public C19562e(C19549M.C19551b c19551b, InterfaceC23476f interfaceC23476f) {
        this.f75613c = c19551b;
        this.f75614d = interfaceC23476f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m45118d(Throwable th) {
        C19549M.m45134w(this.f75613c, this.f75612b, th, "onComplete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m45117e(Throwable th) {
        C19549M.m45134w(this.f75613c, this.f75612b, th, "onSubscribe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m45116g(InterfaceC23465c interfaceC23465c) {
        this.f75614d.onSubscribe(interfaceC23465c);
    }

    @Override // io.reactivex.observers.InterfaceC24502f
    public boolean hasCustomOnError() {
        InterfaceC23476f interfaceC23476f = this.f75614d;
        if ((interfaceC23476f instanceof InterfaceC24502f) && ((InterfaceC24502f) interfaceC23476f).hasCustomOnError()) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.InterfaceC23476f
    public void onComplete() {
        if (this.f75613c.f75604e) {
            C19549M.InterfaceC19554d interfaceC19554d = new C19549M.InterfaceC19554d() { // from class: com.uber.rxdogtag.a
                @Override // com.uber.rxdogtag.C19549M.InterfaceC19554d
                public final void accept(Object obj) {
                    C19562e.this.m45118d((Throwable) obj);
                }
            };
            final InterfaceC23476f interfaceC23476f = this.f75614d;
            Objects.requireNonNull(interfaceC23476f);
            C19549M.m45144m(interfaceC19554d, new Runnable() { // from class: com.uber.rxdogtag.b
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC23476f.this.onComplete();
                }
            });
            return;
        }
        this.f75614d.onComplete();
    }

    @Override // io.reactivex.InterfaceC23476f
    public void onError(Throwable th) {
        C19549M.m45134w(this.f75613c, this.f75612b, th, null);
    }

    @Override // io.reactivex.InterfaceC23476f
    public void onSubscribe(final InterfaceC23465c interfaceC23465c) {
        if (this.f75613c.f75604e) {
            C19549M.m45144m(new C19549M.InterfaceC19554d() { // from class: com.uber.rxdogtag.c
                @Override // com.uber.rxdogtag.C19549M.InterfaceC19554d
                public final void accept(Object obj) {
                    C19562e.this.m45117e((Throwable) obj);
                }
            }, new Runnable() { // from class: com.uber.rxdogtag.d
                @Override // java.lang.Runnable
                public final void run() {
                    C19562e.this.m45116g(interfaceC23465c);
                }
            });
        } else {
            this.f75614d.onSubscribe(interfaceC23465c);
        }
    }
}
