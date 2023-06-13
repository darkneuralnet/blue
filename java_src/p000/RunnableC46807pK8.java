package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzq;
/* renamed from: pK8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC46807pK8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzq f103528b;

    /* renamed from: c */
    public final /* synthetic */ boolean f103529c;

    /* renamed from: d */
    public final /* synthetic */ zzaw f103530d;

    /* renamed from: e */
    public final /* synthetic */ String f103531e;

    /* renamed from: f */
    public final /* synthetic */ QM8 f103532f;

    public RunnableC46807pK8(QM8 qm8, boolean z, zzq zzqVar, boolean z2, zzaw zzawVar, String str) {
        this.f103532f = qm8;
        this.f103528b = zzqVar;
        this.f103529c = z2;
        this.f103530d = zzawVar;
        this.f103531e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V98 v98;
        zzaw zzawVar;
        QM8 qm8 = this.f103532f;
        v98 = qm8.f30284d;
        if (v98 == null) {
            qm8.f100966a.mo22258a().m106893o().m42708a("Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.f103528b);
        QM8 qm82 = this.f103532f;
        if (this.f103529c) {
            zzawVar = null;
        } else {
            zzawVar = this.f103530d;
        }
        qm82.m88554o(v98, zzawVar, this.f103528b);
        this.f103532f.m88576E();
    }
}
