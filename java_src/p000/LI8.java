package p000;

import android.os.RemoteException;
/* renamed from: LI8 */
/* loaded from: classes6.dex */
public final class LI8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C50902wE8 f21087b;

    /* renamed from: c */
    public final /* synthetic */ QM8 f21088c;

    public LI8(QM8 qm8, C50902wE8 c50902wE8) {
        this.f21088c = qm8;
        this.f21087b = c50902wE8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V98 v98;
        QM8 qm8 = this.f21088c;
        v98 = qm8.f30284d;
        if (v98 == null) {
            qm8.f100966a.mo22258a().m106893o().m42708a("Failed to send current screen to service");
            return;
        }
        try {
            C50902wE8 c50902wE8 = this.f21087b;
            if (c50902wE8 == null) {
                v98.mo18051O2(0L, null, null, qm8.f100966a.mo22255z().getPackageName());
            } else {
                v98.mo18051O2(c50902wE8.f115671c, c50902wE8.f115669a, c50902wE8.f115670b, qm8.f100966a.mo22255z().getPackageName());
            }
            this.f21088c.m88576E();
        } catch (RemoteException e) {
            this.f21088c.f100966a.mo22258a().m106893o().m42707b("Failed to send current screen to the service", e);
        }
    }
}
