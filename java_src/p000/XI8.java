package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzq;
/* renamed from: XI8 */
/* loaded from: classes6.dex */
public final class XI8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzq f42972b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f42973c;

    /* renamed from: d */
    public final /* synthetic */ QM8 f42974d;

    public XI8(QM8 qm8, zzq zzqVar, Bundle bundle) {
        this.f42974d = qm8;
        this.f42972b = zzqVar;
        this.f42973c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V98 v98;
        QM8 qm8 = this.f42974d;
        v98 = qm8.f30284d;
        if (v98 == null) {
            qm8.f100966a.mo22258a().m106893o().m42708a("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f42972b);
            v98.mo18053E0(this.f42973c, this.f42972b);
        } catch (RemoteException e) {
            this.f42974d.f100966a.mo22258a().m106893o().m42707b("Failed to send default event parameters to service", e);
        }
    }
}
