package io.reactivex.internal.observers;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.util.C24469e;
import io.reactivex.internal.util.C24475k;
import java.util.concurrent.CountDownLatch;
/* renamed from: io.reactivex.internal.observers.e */
/* loaded from: classes6.dex */
public abstract class AbstractC23560e<T> extends CountDownLatch implements InterfaceC23436D<T>, InterfaceC23465c {

    /* renamed from: b */
    public T f88294b;

    /* renamed from: c */
    public Throwable f88295c;

    /* renamed from: d */
    public InterfaceC23465c f88296d;

    /* renamed from: e */
    public volatile boolean f88297e;

    public AbstractC23560e() {
        super(1);
    }

    /* renamed from: a */
    public final T m32916a() {
        if (getCount() != 0) {
            try {
                C24469e.m32268b();
                await();
            } catch (InterruptedException e) {
                dispose();
                throw C24475k.m32256e(e);
            }
        }
        Throwable th = this.f88295c;
        if (th == null) {
            return this.f88294b;
        }
        throw C24475k.m32256e(th);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public final void dispose() {
        this.f88297e = true;
        InterfaceC23465c interfaceC23465c = this.f88296d;
        if (interfaceC23465c != null) {
            interfaceC23465c.dispose();
        }
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public final boolean mo1769e() {
        return this.f88297e;
    }

    @Override // io.reactivex.InterfaceC23436D
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.InterfaceC23436D
    public final void onSubscribe(InterfaceC23465c interfaceC23465c) {
        this.f88296d = interfaceC23465c;
        if (this.f88297e) {
            interfaceC23465c.dispose();
        }
    }
}
