package p000;

import java.util.concurrent.atomic.AtomicReference;
/* renamed from: Xy8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC37219Xy8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f44356b;

    /* renamed from: c */
    public final /* synthetic */ RC8 f44357c;

    public RunnableC37219Xy8(RC8 rc8, AtomicReference atomicReference) {
        this.f44357c = rc8;
        this.f44356b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f44356b) {
            this.f44356b.set(Boolean.valueOf(this.f44357c.f100966a.m89751w().m37502y(this.f44357c.f100966a.m89749y().m27126p(), C37795a98.f49945M)));
            this.f44356b.notify();
        }
    }
}
