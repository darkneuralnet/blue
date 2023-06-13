package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzq;
/* renamed from: nI8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC45603nI8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzq f99735b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC42134hS7 f99736c;

    /* renamed from: d */
    public final /* synthetic */ QM8 f99737d;

    public RunnableC45603nI8(QM8 qm8, zzq zzqVar, InterfaceC42134hS7 interfaceC42134hS7) {
        this.f99737d = qm8;
        this.f99735b = zzqVar;
        this.f99736c = interfaceC42134hS7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C35248Pn8 c35248Pn8;
        V98 v98;
        String str = null;
        try {
            try {
                if (!this.f99737d.f100966a.m89784F().m101800n().m76357i(EnumC39344cm7.ANALYTICS_STORAGE)) {
                    this.f99737d.f100966a.mo22258a().m106887u().m42708a("Analytics storage consent denied; will not get app instance id");
                    this.f99737d.f100966a.m89781I().m87193B(null);
                    this.f99737d.f100966a.m89784F().f16068g.m13819b(null);
                    c35248Pn8 = this.f99737d.f100966a;
                } else {
                    QM8 qm8 = this.f99737d;
                    v98 = qm8.f30284d;
                    if (v98 == null) {
                        qm8.f100966a.mo22258a().m106893o().m42708a("Failed to get app instance id");
                        c35248Pn8 = this.f99737d.f100966a;
                    } else {
                        Preconditions.checkNotNull(this.f99735b);
                        str = v98.mo18044d4(this.f99735b);
                        if (str != null) {
                            this.f99737d.f100966a.m89781I().m87193B(str);
                            this.f99737d.f100966a.m89784F().f16068g.m13819b(str);
                        }
                        this.f99737d.m88576E();
                        c35248Pn8 = this.f99737d.f100966a;
                    }
                }
            } catch (RemoteException e) {
                this.f99737d.f100966a.mo22258a().m106893o().m42707b("Failed to get app instance id", e);
                c35248Pn8 = this.f99737d.f100966a;
            }
            c35248Pn8.m89776N().m92094K(this.f99736c, str);
        } catch (Throwable th) {
            this.f99737d.f100966a.m89776N().m92094K(this.f99736c, null);
            throw th;
        }
    }
}
