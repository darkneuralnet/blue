package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzq;
/* renamed from: SJ8 */
/* loaded from: classes6.dex */
public final class SJ8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzq f33472b;

    /* renamed from: c */
    public final /* synthetic */ QM8 f33473c;

    public SJ8(QM8 qm8, zzq zzqVar) {
        this.f33473c = qm8;
        this.f33472b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V98 v98;
        QM8 qm8 = this.f33473c;
        v98 = qm8.f30284d;
        if (v98 == null) {
            qm8.f100966a.mo22258a().m106893o().m42708a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f33472b);
            v98.mo18054C0(this.f33472b);
            this.f33473c.m88576E();
        } catch (RemoteException e) {
            this.f33473c.f100966a.mo22258a().m106893o().m42707b("Failed to send measurementEnabled to the service", e);
        }
    }
}
