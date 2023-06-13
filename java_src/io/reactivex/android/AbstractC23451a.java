package io.reactivex.android;

import android.os.Looper;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: io.reactivex.android.a */
/* loaded from: classes6.dex */
public abstract class AbstractC23451a implements InterfaceC23465c {

    /* renamed from: b */
    public final AtomicBoolean f88210b = new AtomicBoolean();

    /* renamed from: io.reactivex.android.a$a */
    /* loaded from: classes6.dex */
    public class RunnableC23452a implements Runnable {
        public RunnableC23452a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC23451a.this.mo15091d();
        }
    }

    /* renamed from: d */
    public abstract void mo15091d();

    @Override // io.reactivex.disposables.InterfaceC23465c
    public final void dispose() {
        if (this.f88210b.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo15091d();
            } else {
                C23454a.m33087a().mo32324d(new RunnableC23452a());
            }
        }
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public final boolean mo1769e() {
        return this.f88210b.get();
    }
}
