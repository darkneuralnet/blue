package p000;

import java.util.concurrent.atomic.AtomicReference;
/* renamed from: cy8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC39483cy8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ long f75911b;

    /* renamed from: c */
    public final /* synthetic */ RC8 f75912c;

    public RunnableC39483cy8(RC8 rc8, long j) {
        this.f75912c = rc8;
        this.f75911b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f75912c.m87152w(this.f75911b, true);
        this.f75912c.f100966a.m89778L().m88562S(new AtomicReference());
    }
}
