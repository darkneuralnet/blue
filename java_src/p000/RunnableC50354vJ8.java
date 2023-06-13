package p000;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzaw;
/* renamed from: vJ8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC50354vJ8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzaw f113830b;

    /* renamed from: c */
    public final /* synthetic */ String f113831c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC42134hS7 f113832d;

    /* renamed from: e */
    public final /* synthetic */ QM8 f113833e;

    public RunnableC50354vJ8(QM8 qm8, zzaw zzawVar, String str, InterfaceC42134hS7 interfaceC42134hS7) {
        this.f113833e = qm8;
        this.f113830b = zzawVar;
        this.f113831c = str;
        this.f113832d = interfaceC42134hS7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C35248Pn8 c35248Pn8;
        V98 v98;
        byte[] bArr = null;
        try {
            try {
                QM8 qm8 = this.f113833e;
                v98 = qm8.f30284d;
                if (v98 == null) {
                    qm8.f100966a.mo22258a().m106893o().m42708a("Discarding data. Failed to send event to service to bundle");
                    c35248Pn8 = this.f113833e.f100966a;
                } else {
                    bArr = v98.mo18047X3(this.f113830b, this.f113831c);
                    this.f113833e.m88576E();
                    c35248Pn8 = this.f113833e.f100966a;
                }
            } catch (RemoteException e) {
                this.f113833e.f100966a.mo22258a().m106893o().m42707b("Failed to send event to the service to bundle", e);
                c35248Pn8 = this.f113833e.f100966a;
            }
            c35248Pn8.m89776N().m92097H(this.f113832d, bArr);
        } catch (Throwable th) {
            this.f113833e.f100966a.m89776N().m92097H(this.f113832d, bArr);
            throw th;
        }
    }
}
