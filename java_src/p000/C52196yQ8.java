package p000;

import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.util.VisibleForTesting;
/* renamed from: yQ8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52196yQ8 {
    @VisibleForTesting

    /* renamed from: a */
    public long f119540a;
    @VisibleForTesting

    /* renamed from: b */
    public long f119541b;

    /* renamed from: c */
    public final AbstractC36228Ts7 f119542c;

    /* renamed from: d */
    public final /* synthetic */ C39144cR8 f119543d;

    public C52196yQ8(C39144cR8 c39144cR8) {
        this.f119543d = c39144cR8;
        this.f119542c = new C45675nQ8(this, c39144cR8.f100966a);
        long elapsedRealtime = c39144cR8.f100966a.mo22260A().elapsedRealtime();
        this.f119540a = elapsedRealtime;
        this.f119541b = elapsedRealtime;
    }

    /* renamed from: a */
    public final void m3507a() {
        this.f119542c.m82320b();
        this.f119540a = 0L;
        this.f119541b = 0L;
    }

    /* renamed from: b */
    public final void m3506b(long j) {
        this.f119542c.m82320b();
    }

    /* renamed from: c */
    public final void m3505c(long j) {
        this.f119543d.mo19953e();
        this.f119542c.m82320b();
        this.f119540a = j;
        this.f119541b = j;
    }

    /* renamed from: d */
    public final boolean m3504d(boolean z, boolean z2, long j) {
        this.f119543d.mo19953e();
        this.f119543d.m6551f();
        C49363te9.m11964b();
        if (this.f119543d.f100966a.m89751w().m37502y(null, C37795a98.f49974h0)) {
            if (this.f119543d.f100966a.m89762l()) {
                this.f119543d.f100966a.m89784F().f16076o.m563b(this.f119543d.f100966a.mo22260A().currentTimeMillis());
            }
        } else {
            this.f119543d.f100966a.m89784F().f16076o.m563b(this.f119543d.f100966a.mo22260A().currentTimeMillis());
        }
        long j2 = j - this.f119540a;
        if (!z && j2 < 1000) {
            this.f119543d.f100966a.mo22258a().m106889s().m42707b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = j - this.f119541b;
            this.f119541b = j;
        }
        this.f119543d.f100966a.mo22258a().m106889s().m42707b("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        OW8.m92046v(this.f119543d.f100966a.m89779K().m24007p(!this.f119543d.f100966a.m89751w().m37527D()), bundle, true);
        if (!z2) {
            this.f119543d.f100966a.m89781I().m87157r("auto", "_e", bundle);
        }
        this.f119540a = j;
        this.f119542c.m82320b();
        this.f119542c.m82319d(CoreConstants.MILLIS_IN_ONE_HOUR);
        return true;
    }
}
