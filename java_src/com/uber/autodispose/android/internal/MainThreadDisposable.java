package com.uber.autodispose.android.internal;

import com.uber.autodispose.android.internal.MainThreadDisposable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes7.dex */
public abstract class MainThreadDisposable implements InterfaceC23465c {

    /* renamed from: b */
    public final AtomicBoolean f75564b = new AtomicBoolean();

    /* renamed from: a */
    public abstract void mo45186a();

    @Override // io.reactivex.disposables.InterfaceC23465c
    public final void dispose() {
        if (this.f75564b.compareAndSet(false, true)) {
            if (AutoDisposeAndroidUtil.m45200b()) {
                mo45186a();
            } else {
                C23454a.m33087a().mo32324d(new Runnable() { // from class: YG2
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainThreadDisposable.this.mo45186a();
                    }
                });
            }
        }
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public final boolean mo1769e() {
        return this.f75564b.get();
    }
}
