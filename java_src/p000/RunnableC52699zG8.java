package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzq;
import java.util.List;
/* renamed from: zG8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC52699zG8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f121032b;

    /* renamed from: c */
    public final /* synthetic */ String f121033c;

    /* renamed from: d */
    public final /* synthetic */ zzq f121034d;

    /* renamed from: e */
    public final /* synthetic */ boolean f121035e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC42134hS7 f121036f;

    /* renamed from: g */
    public final /* synthetic */ QM8 f121037g;

    public RunnableC52699zG8(QM8 qm8, String str, String str2, zzq zzqVar, boolean z, InterfaceC42134hS7 interfaceC42134hS7) {
        this.f121037g = qm8;
        this.f121032b = str;
        this.f121033c = str2;
        this.f121034d = zzqVar;
        this.f121035e = z;
        this.f121036f = interfaceC42134hS7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e;
        V98 v98;
        Bundle bundle2 = new Bundle();
        try {
            QM8 qm8 = this.f121037g;
            v98 = qm8.f30284d;
            if (v98 == null) {
                qm8.f100966a.mo22258a().m106893o().m42706c("Failed to get user properties; not connected to service", this.f121032b, this.f121033c);
                this.f121037g.f100966a.m89776N().m92098G(this.f121036f, bundle2);
                return;
            }
            Preconditions.checkNotNull(this.f121034d);
            List<zzlj> mo18045d3 = v98.mo18045d3(this.f121032b, this.f121033c, this.f121035e, this.f121034d);
            bundle = new Bundle();
            if (mo18045d3 != null) {
                for (zzlj zzljVar : mo18045d3) {
                    String str = zzljVar.f71537f;
                    if (str != null) {
                        bundle.putString(zzljVar.f71534c, str);
                    } else {
                        Long l = zzljVar.f71536e;
                        if (l != null) {
                            bundle.putLong(zzljVar.f71534c, l.longValue());
                        } else {
                            Double d = zzljVar.f71539h;
                            if (d != null) {
                                bundle.putDouble(zzljVar.f71534c, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.f121037g.m88576E();
                    this.f121037g.f100966a.m89776N().m92098G(this.f121036f, bundle);
                } catch (RemoteException e2) {
                    e = e2;
                    this.f121037g.f100966a.mo22258a().m106893o().m42706c("Failed to get user properties; remote exception", this.f121032b, e);
                    this.f121037g.f100966a.m89776N().m92098G(this.f121036f, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                this.f121037g.f100966a.m89776N().m92098G(this.f121036f, bundle2);
                throw th;
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            this.f121037g.f100966a.m89776N().m92098G(this.f121036f, bundle2);
            throw th;
        }
    }
}
