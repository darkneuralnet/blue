package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzq;
/* renamed from: eK8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC40284eK8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzq f78237b;

    /* renamed from: c */
    public final /* synthetic */ QM8 f78238c;

    public RunnableC40284eK8(QM8 qm8, zzq zzqVar) {
        this.f78238c = qm8;
        this.f78237b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V98 v98;
        QM8 qm8 = this.f78238c;
        v98 = qm8.f30284d;
        if (v98 == null) {
            qm8.f100966a.mo22258a().m106893o().m42708a("Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f78237b);
            v98.mo18043k0(this.f78237b);
            this.f78238c.m88576E();
        } catch (RemoteException e) {
            this.f78238c.f100966a.mo22258a().m106893o().m42707b("Failed to send consent settings to the service", e);
        }
    }
}
