package p000;

import android.os.Bundle;
/* renamed from: RP8 */
/* loaded from: classes6.dex */
public final class RP8 implements Runnable {

    /* renamed from: b */
    public final long f32005b;

    /* renamed from: c */
    public final long f32006c;

    /* renamed from: d */
    public final /* synthetic */ C39135cQ8 f32007d;

    public RP8(C39135cQ8 c39135cQ8, long j, long j2) {
        this.f32007d = c39135cQ8;
        this.f32005b = j;
        this.f32006c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32007d.f60620b.f100966a.mo22257c().m43695w(new Runnable() { // from class: GP8
            @Override // java.lang.Runnable
            public final void run() {
                RP8 rp8 = RP8.this;
                C39135cQ8 c39135cQ8 = rp8.f32007d;
                long j = rp8.f32005b;
                long j2 = rp8.f32006c;
                c39135cQ8.f60620b.mo19953e();
                c39135cQ8.f60620b.f100966a.mo22258a().m106894n().m42708a("Application going to the background");
                c39135cQ8.f60620b.f100966a.m89784F().f16079r.m79589a(true);
                if (!c39135cQ8.f60620b.f100966a.m89751w().m37527D()) {
                    c39135cQ8.f60620b.f60677e.m3506b(j2);
                    c39135cQ8.f60620b.f60677e.m3504d(false, false, j2);
                }
                Gj9.m104822b();
                if (c39135cQ8.f60620b.f100966a.m89751w().m37502y(null, C37795a98.f49930D0)) {
                    c39135cQ8.f60620b.f100966a.mo22258a().m106890r().m42707b("Application backgrounded at: timestamp_millis", Long.valueOf(j));
                } else {
                    c39135cQ8.f60620b.f100966a.m89781I().m87156s("auto", "_ab", j, new Bundle());
                }
            }
        });
    }
}
