package p000;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzq;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: NK8 */
/* loaded from: classes6.dex */
public final class NK8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f24453b;

    /* renamed from: c */
    public final /* synthetic */ String f24454c;

    /* renamed from: d */
    public final /* synthetic */ String f24455d;

    /* renamed from: e */
    public final /* synthetic */ zzq f24456e;

    /* renamed from: f */
    public final /* synthetic */ QM8 f24457f;

    public NK8(QM8 qm8, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar) {
        this.f24457f = qm8;
        this.f24453b = atomicReference;
        this.f24454c = str2;
        this.f24455d = str3;
        this.f24456e = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        QM8 qm8;
        V98 v98;
        synchronized (this.f24453b) {
            try {
                qm8 = this.f24457f;
                v98 = qm8.f30284d;
            } catch (RemoteException e) {
                this.f24457f.f100966a.mo22258a().m106893o().m42705d("(legacy) Failed to get conditional properties; remote exception", null, this.f24454c, e);
                this.f24453b.set(Collections.emptyList());
                atomicReference = this.f24453b;
            }
            if (v98 == null) {
                qm8.f100966a.mo22258a().m106893o().m42705d("(legacy) Failed to get conditional properties; not connected to service", null, this.f24454c, this.f24455d);
                this.f24453b.set(Collections.emptyList());
                this.f24453b.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                Preconditions.checkNotNull(this.f24456e);
                this.f24453b.set(v98.mo18041t4(this.f24454c, this.f24455d, this.f24456e));
            } else {
                this.f24453b.set(v98.mo18050Q0(null, this.f24454c, this.f24455d));
            }
            this.f24457f.m88576E();
            atomicReference = this.f24453b;
            atomicReference.notify();
        }
    }
}
