package p000;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
/* renamed from: JQ8 */
/* loaded from: classes6.dex */
public final class JQ8 {

    /* renamed from: a */
    public final /* synthetic */ C39144cR8 f17534a;

    public JQ8(C39144cR8 c39144cR8) {
        this.f17534a = c39144cR8;
    }

    /* renamed from: a */
    public final void m100493a() {
        this.f17534a.mo19953e();
        if (this.f17534a.f100966a.m89784F().m101795s(this.f17534a.f100966a.mo22260A().currentTimeMillis())) {
            this.f17534a.f100966a.m89784F().f16073l.m79589a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f17534a.f100966a.mo22258a().m106889s().m42708a("Detected application was in foreground");
                m100491c(this.f17534a.f100966a.mo22260A().currentTimeMillis(), false);
            }
        }
    }

    /* renamed from: b */
    public final void m100492b(long j, boolean z) {
        this.f17534a.mo19953e();
        this.f17534a.m61302p();
        if (this.f17534a.f100966a.m89784F().m101795s(j)) {
            this.f17534a.f100966a.m89784F().f16073l.m79589a(true);
            C49423tk9.m11813b();
            if (this.f17534a.f100966a.m89751w().m37502y(null, C37795a98.f49990p0)) {
                this.f17534a.f100966a.m89749y().m27123s();
            }
        }
        this.f17534a.f100966a.m89784F().f16076o.m563b(j);
        if (this.f17534a.f100966a.m89784F().f16073l.m79588b()) {
            m100491c(j, z);
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    public final void m100491c(long j, boolean z) {
        this.f17534a.mo19953e();
        if (!this.f17534a.f100966a.m89762l()) {
            return;
        }
        this.f17534a.f100966a.m89784F().f16076o.m563b(j);
        this.f17534a.f100966a.mo22258a().m106889s().m42707b("Session started, time", Long.valueOf(this.f17534a.f100966a.mo22260A().elapsedRealtime()));
        Long valueOf = Long.valueOf(j / 1000);
        this.f17534a.f100966a.m89781I().m87183M("auto", "_sid", valueOf, j);
        this.f17534a.f100966a.m89784F().f16077p.m563b(valueOf.longValue());
        this.f17534a.f100966a.m89784F().f16073l.m79589a(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", valueOf.longValue());
        if (this.f17534a.f100966a.m89751w().m37502y(null, C37795a98.f49966d0) && z) {
            bundle.putLong("_aib", 1L);
        }
        this.f17534a.f100966a.m89781I().m87156s("auto", "_s", j, bundle);
        C42821ic9.m33738b();
        if (this.f17534a.f100966a.m89751w().m37502y(null, C37795a98.f49972g0)) {
            String m13820a = this.f17534a.f100966a.m89784F().f16082u.m13820a();
            if (!TextUtils.isEmpty(m13820a)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", m13820a);
                this.f17534a.f100966a.m89781I().m87156s("auto", "_ssr", j, bundle2);
            }
        }
    }
}
