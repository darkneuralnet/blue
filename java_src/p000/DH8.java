package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzq;
/* renamed from: DH8 */
/* loaded from: classes6.dex */
public final class DH8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzq f5489b;

    /* renamed from: c */
    public final /* synthetic */ boolean f5490c;

    /* renamed from: d */
    public final /* synthetic */ zzlj f5491d;

    /* renamed from: e */
    public final /* synthetic */ QM8 f5492e;

    public DH8(QM8 qm8, zzq zzqVar, boolean z, zzlj zzljVar) {
        this.f5492e = qm8;
        this.f5489b = zzqVar;
        this.f5490c = z;
        this.f5491d = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V98 v98;
        zzlj zzljVar;
        QM8 qm8 = this.f5492e;
        v98 = qm8.f30284d;
        if (v98 == null) {
            qm8.f100966a.mo22258a().m106893o().m42708a("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.f5489b);
        QM8 qm82 = this.f5492e;
        if (this.f5490c) {
            zzljVar = null;
        } else {
            zzljVar = this.f5491d;
        }
        qm82.m88554o(v98, zzljVar, this.f5489b);
        this.f5492e.m88576E();
    }
}
