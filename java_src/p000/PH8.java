package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzq;
/* renamed from: PH8 */
/* loaded from: classes6.dex */
public final class PH8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzq f28205b;

    /* renamed from: c */
    public final /* synthetic */ QM8 f28206c;

    public PH8(QM8 qm8, zzq zzqVar) {
        this.f28206c = qm8;
        this.f28205b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V98 v98;
        QM8 qm8 = this.f28206c;
        v98 = qm8.f30284d;
        if (v98 == null) {
            qm8.f100966a.mo22258a().m106893o().m42708a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f28205b);
            v98.mo18042q0(this.f28205b);
        } catch (RemoteException e) {
            this.f28206c.f100966a.mo22258a().m106893o().m42707b("Failed to reset data on the service: remote exception", e);
        }
        this.f28206c.m88576E();
    }
}
