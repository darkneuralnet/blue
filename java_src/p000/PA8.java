package p000;

import java.util.concurrent.atomic.AtomicReference;
/* renamed from: PA8 */
/* loaded from: classes6.dex */
public final class PA8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f28052b;

    /* renamed from: c */
    public final /* synthetic */ RC8 f28053c;

    public PA8(RC8 rc8, AtomicReference atomicReference) {
        this.f28053c = rc8;
        this.f28052b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f28052b) {
            this.f28052b.set(Long.valueOf(this.f28053c.f100966a.m89751w().m37512o(this.f28053c.f100966a.m89749y().m27126p(), C37795a98.f49947O)));
            this.f28052b.notify();
        }
    }
}
