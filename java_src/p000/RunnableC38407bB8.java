package p000;

import java.util.concurrent.atomic.AtomicReference;
/* renamed from: bB8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC38407bB8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f57072b;

    /* renamed from: c */
    public final /* synthetic */ RC8 f57073c;

    public RunnableC38407bB8(RC8 rc8, AtomicReference atomicReference) {
        this.f57073c = rc8;
        this.f57072b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f57072b) {
            this.f57072b.set(Integer.valueOf(this.f57073c.f100966a.m89751w().m37515l(this.f57073c.f100966a.m89749y().m27126p(), C37795a98.f49948P)));
            this.f57072b.notify();
        }
    }
}
