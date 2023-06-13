package p000;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzq;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: lL8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC44444lL8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f95902b;

    /* renamed from: c */
    public final /* synthetic */ String f95903c;

    /* renamed from: d */
    public final /* synthetic */ String f95904d;

    /* renamed from: e */
    public final /* synthetic */ zzq f95905e;

    /* renamed from: f */
    public final /* synthetic */ boolean f95906f;

    /* renamed from: g */
    public final /* synthetic */ QM8 f95907g;

    public RunnableC44444lL8(QM8 qm8, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar, boolean z) {
        this.f95907g = qm8;
        this.f95902b = atomicReference;
        this.f95903c = str2;
        this.f95904d = str3;
        this.f95905e = zzqVar;
        this.f95906f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        QM8 qm8;
        V98 v98;
        synchronized (this.f95902b) {
            try {
                qm8 = this.f95907g;
                v98 = qm8.f30284d;
            } catch (RemoteException e) {
                this.f95907g.f100966a.mo22258a().m106893o().m42705d("(legacy) Failed to get user properties; remote exception", null, this.f95903c, e);
                this.f95902b.set(Collections.emptyList());
                atomicReference = this.f95902b;
            }
            if (v98 == null) {
                qm8.f100966a.mo22258a().m106893o().m42705d("(legacy) Failed to get user properties; not connected to service", null, this.f95903c, this.f95904d);
                this.f95902b.set(Collections.emptyList());
                this.f95902b.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                Preconditions.checkNotNull(this.f95905e);
                this.f95902b.set(v98.mo18045d3(this.f95903c, this.f95904d, this.f95906f, this.f95905e));
            } else {
                this.f95902b.set(v98.mo18049Q3(null, this.f95903c, this.f95904d, this.f95906f));
            }
            this.f95907g.m88576E();
            atomicReference = this.f95902b;
            atomicReference.notify();
        }
    }
}
