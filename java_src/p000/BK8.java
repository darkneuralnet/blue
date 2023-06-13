package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzq;
/* renamed from: BK8 */
/* loaded from: classes6.dex */
public final class BK8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzq f2215b;

    /* renamed from: c */
    public final /* synthetic */ boolean f2216c;

    /* renamed from: d */
    public final /* synthetic */ zzac f2217d;

    /* renamed from: e */
    public final /* synthetic */ zzac f2218e;

    /* renamed from: f */
    public final /* synthetic */ QM8 f2219f;

    public BK8(QM8 qm8, boolean z, zzq zzqVar, boolean z2, zzac zzacVar, zzac zzacVar2) {
        this.f2219f = qm8;
        this.f2215b = zzqVar;
        this.f2216c = z2;
        this.f2217d = zzacVar;
        this.f2218e = zzacVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V98 v98;
        zzac zzacVar;
        QM8 qm8 = this.f2219f;
        v98 = qm8.f30284d;
        if (v98 == null) {
            qm8.f100966a.mo22258a().m106893o().m42708a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.f2215b);
        QM8 qm82 = this.f2219f;
        if (this.f2216c) {
            zzacVar = null;
        } else {
            zzacVar = this.f2217d;
        }
        qm82.m88554o(v98, zzacVar, this.f2215b);
        this.f2219f.m88576E();
    }
}
