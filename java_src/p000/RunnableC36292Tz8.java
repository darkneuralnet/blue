package p000;

import java.util.concurrent.atomic.AtomicReference;
/* renamed from: Tz8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36292Tz8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f36588b;

    /* renamed from: c */
    public final /* synthetic */ RC8 f36589c;

    public RunnableC36292Tz8(RC8 rc8, AtomicReference atomicReference) {
        this.f36589c = rc8;
        this.f36588b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f36588b) {
            this.f36588b.set(this.f36589c.f100966a.m89751w().m37506u(this.f36589c.f100966a.m89749y().m27126p(), C37795a98.f49946N));
            this.f36588b.notify();
        }
    }
}
