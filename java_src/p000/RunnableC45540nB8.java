package p000;

import java.util.concurrent.atomic.AtomicReference;
/* renamed from: nB8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC45540nB8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f99574b;

    /* renamed from: c */
    public final /* synthetic */ RC8 f99575c;

    public RunnableC45540nB8(RC8 rc8, AtomicReference atomicReference) {
        this.f99575c = rc8;
        this.f99574b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f99574b) {
            this.f99574b.set(Double.valueOf(this.f99575c.f100966a.m89751w().m37519h(this.f99575c.f100966a.m89749y().m27126p(), C37795a98.f49949Q)));
            this.f99574b.notify();
        }
    }
}
