package p000;

import android.os.Handler;
/* renamed from: cQ8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39135cQ8 {

    /* renamed from: a */
    public RP8 f60619a;

    /* renamed from: b */
    public final /* synthetic */ C39144cR8 f60620b;

    public C39135cQ8(C39144cR8 c39144cR8) {
        this.f60620b = c39144cR8;
    }

    /* renamed from: a */
    public final void m61414a(long j) {
        Handler handler;
        this.f60619a = new RP8(this, this.f60620b.f100966a.mo22260A().currentTimeMillis(), j);
        handler = this.f60620b.f60675c;
        handler.postDelayed(this.f60619a, 2000L);
    }

    /* renamed from: b */
    public final void m61413b() {
        Handler handler;
        this.f60620b.mo19953e();
        RP8 rp8 = this.f60619a;
        if (rp8 != null) {
            handler = this.f60620b.f60675c;
            handler.removeCallbacks(rp8);
        }
        this.f60620b.f100966a.m89784F().f16079r.m79589a(false);
    }
}
