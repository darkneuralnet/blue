package p000;
/* renamed from: hx8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC42437hx8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ long f86229b;

    /* renamed from: c */
    public final /* synthetic */ RC8 f86230c;

    public RunnableC42437hx8(RC8 rc8, long j) {
        this.f86230c = rc8;
        this.f86229b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f86230c.f100966a.m89784F().f16072k.m563b(this.f86229b);
        this.f86230c.f100966a.mo22258a().m106894n().m42707b("Session timeout duration set", Long.valueOf(this.f86229b));
    }
}
