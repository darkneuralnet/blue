package io.reactivex.internal.observers;

import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC24541s;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.util.C24469e;
import io.reactivex.internal.util.C24475k;
import java.util.concurrent.CountDownLatch;
/* renamed from: io.reactivex.internal.observers.h */
/* loaded from: classes6.dex */
public final class C23563h<T> extends CountDownLatch implements InterfaceC23445I<T>, InterfaceC23476f, InterfaceC24541s<T> {

    /* renamed from: b */
    public T f88298b;

    /* renamed from: c */
    public Throwable f88299c;

    /* renamed from: d */
    public InterfaceC23465c f88300d;

    /* renamed from: e */
    public volatile boolean f88301e;

    public C23563h() {
        super(1);
    }

    /* renamed from: a */
    public T m32915a() {
        if (getCount() != 0) {
            try {
                C24469e.m32268b();
                await();
            } catch (InterruptedException e) {
                m32913c();
                throw C24475k.m32256e(e);
            }
        }
        Throwable th = this.f88299c;
        if (th == null) {
            return this.f88298b;
        }
        throw C24475k.m32256e(th);
    }

    /* renamed from: b */
    public Throwable m32914b() {
        if (getCount() != 0) {
            try {
                C24469e.m32268b();
                await();
            } catch (InterruptedException e) {
                m32913c();
                return e;
            }
        }
        return this.f88299c;
    }

    /* renamed from: c */
    public void m32913c() {
        this.f88301e = true;
        InterfaceC23465c interfaceC23465c = this.f88300d;
        if (interfaceC23465c != null) {
            interfaceC23465c.dispose();
        }
    }

    @Override // io.reactivex.InterfaceC23476f
    public void onComplete() {
        countDown();
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onError(Throwable th) {
        this.f88299c = th;
        countDown();
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        this.f88300d = interfaceC23465c;
        if (this.f88301e) {
            interfaceC23465c.dispose();
        }
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onSuccess(T t) {
        this.f88298b = t;
        countDown();
    }
}
