package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: bI8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC38470bI8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f57254b;

    /* renamed from: c */
    public final /* synthetic */ zzq f57255c;

    /* renamed from: d */
    public final /* synthetic */ QM8 f57256d;

    public RunnableC38470bI8(QM8 qm8, AtomicReference atomicReference, zzq zzqVar) {
        this.f57256d = qm8;
        this.f57254b = atomicReference;
        this.f57255c = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        V98 v98;
        synchronized (this.f57254b) {
            try {
            } catch (RemoteException e) {
                this.f57256d.f100966a.mo22258a().m106893o().m42707b("Failed to get app instance id", e);
                atomicReference = this.f57254b;
            }
            if (!this.f57256d.f100966a.m89784F().m101800n().m76357i(EnumC39344cm7.ANALYTICS_STORAGE)) {
                this.f57256d.f100966a.mo22258a().m106887u().m42708a("Analytics storage consent denied; will not get app instance id");
                this.f57256d.f100966a.m89781I().m87193B(null);
                this.f57256d.f100966a.m89784F().f16068g.m13819b(null);
                this.f57254b.set(null);
                this.f57254b.notify();
                return;
            }
            QM8 qm8 = this.f57256d;
            v98 = qm8.f30284d;
            if (v98 == null) {
                qm8.f100966a.mo22258a().m106893o().m42708a("Failed to get app instance id");
                this.f57254b.notify();
                return;
            }
            Preconditions.checkNotNull(this.f57255c);
            this.f57254b.set(v98.mo18044d4(this.f57255c));
            String str = (String) this.f57254b.get();
            if (str != null) {
                this.f57256d.f100966a.m89781I().m87193B(str);
                this.f57256d.f100966a.m89784F().f16068g.m13819b(str);
            }
            this.f57256d.m88576E();
            atomicReference = this.f57254b;
            atomicReference.notify();
        }
    }
}
