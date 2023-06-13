package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzq;
/* renamed from: zI8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC52717zI8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzq f121055b;

    /* renamed from: c */
    public final /* synthetic */ QM8 f121056c;

    public RunnableC52717zI8(QM8 qm8, zzq zzqVar) {
        this.f121056c = qm8;
        this.f121055b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V98 v98;
        QM8 qm8 = this.f121056c;
        v98 = qm8.f30284d;
        if (v98 == null) {
            qm8.f100966a.mo22258a().m106893o().m42708a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f121055b);
            v98.mo18046a0(this.f121055b);
            this.f121056c.f100966a.m89787B().m91997q();
            this.f121056c.m88554o(v98, null, this.f121055b);
            this.f121056c.m88576E();
        } catch (RemoteException e) {
            this.f121056c.f100966a.mo22258a().m106893o().m42707b("Failed to send app launch to the service", e);
        }
    }
}
