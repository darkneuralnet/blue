package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
/* renamed from: ZK8 */
/* loaded from: classes6.dex */
public final class ZK8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f48331b;

    /* renamed from: c */
    public final /* synthetic */ String f48332c;

    /* renamed from: d */
    public final /* synthetic */ zzq f48333d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC42134hS7 f48334e;

    /* renamed from: f */
    public final /* synthetic */ QM8 f48335f;

    public ZK8(QM8 qm8, String str, String str2, zzq zzqVar, InterfaceC42134hS7 interfaceC42134hS7) {
        this.f48335f = qm8;
        this.f48331b = str;
        this.f48332c = str2;
        this.f48333d = zzqVar;
        this.f48334e = interfaceC42134hS7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C35248Pn8 c35248Pn8;
        V98 v98;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                QM8 qm8 = this.f48335f;
                v98 = qm8.f30284d;
                if (v98 == null) {
                    qm8.f100966a.mo22258a().m106893o().m42706c("Failed to get conditional properties; not connected to service", this.f48331b, this.f48332c);
                    c35248Pn8 = this.f48335f.f100966a;
                } else {
                    Preconditions.checkNotNull(this.f48333d);
                    arrayList = OW8.m92052s(v98.mo18041t4(this.f48331b, this.f48332c, this.f48333d));
                    this.f48335f.m88576E();
                    c35248Pn8 = this.f48335f.f100966a;
                }
            } catch (RemoteException e) {
                this.f48335f.f100966a.mo22258a().m106893o().m42705d("Failed to get conditional properties; remote exception", this.f48331b, this.f48332c, e);
                c35248Pn8 = this.f48335f.f100966a;
            }
            c35248Pn8.m89776N().m92099F(this.f48334e, arrayList);
        } catch (Throwable th) {
            this.f48335f.f100966a.m89776N().m92099F(this.f48334e, arrayList);
            throw th;
        }
    }
}
