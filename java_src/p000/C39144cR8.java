package p000;

import android.os.Handler;
import android.os.Looper;
/* renamed from: cR8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39144cR8 extends AbstractC51140we8 {

    /* renamed from: c */
    public Handler f60675c;

    /* renamed from: d */
    public final JQ8 f60676d;

    /* renamed from: e */
    public final C52196yQ8 f60677e;

    /* renamed from: f */
    public final C39135cQ8 f60678f;

    public C39144cR8(C35248Pn8 c35248Pn8) {
        super(c35248Pn8);
        this.f60676d = new JQ8(this);
        this.f60677e = new C52196yQ8(this);
        this.f60678f = new C39135cQ8(this);
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ void m61304n(C39144cR8 c39144cR8, long j) {
        c39144cR8.mo19953e();
        c39144cR8.m61302p();
        c39144cR8.f100966a.mo22258a().m106889s().m42707b("Activity paused, time", Long.valueOf(j));
        c39144cR8.f60678f.m61414a(j);
        if (c39144cR8.f100966a.m89751w().m37527D()) {
            c39144cR8.f60677e.m3506b(j);
        }
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ void m61303o(C39144cR8 c39144cR8, long j) {
        c39144cR8.mo19953e();
        c39144cR8.m61302p();
        c39144cR8.f100966a.mo22258a().m106889s().m42707b("Activity resumed, time", Long.valueOf(j));
        if (c39144cR8.f100966a.m89751w().m37527D() || c39144cR8.f100966a.m89784F().f16079r.m79588b()) {
            c39144cR8.f60677e.m3505c(j);
        }
        c39144cR8.f60678f.m61413b();
        JQ8 jq8 = c39144cR8.f60676d;
        jq8.f17534a.mo19953e();
        if (!jq8.f17534a.f100966a.m89762l()) {
            return;
        }
        jq8.m100492b(jq8.f17534a.f100966a.mo22260A().currentTimeMillis(), false);
    }

    @Override // p000.AbstractC51140we8
    /* renamed from: k */
    public final boolean mo6546k() {
        return false;
    }

    /* renamed from: p */
    public final void m61302p() {
        mo19953e();
        if (this.f60675c == null) {
            this.f60675c = new UO7(Looper.getMainLooper());
        }
    }
}
