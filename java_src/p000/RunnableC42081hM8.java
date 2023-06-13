package p000;

import android.content.ComponentName;
import android.content.Context;
/* renamed from: hM8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC42081hM8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ EM8 f85104b;

    public RunnableC42081hM8(EM8 em8) {
        this.f85104b = em8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        QM8 qm8 = this.f85104b.f7357d;
        Context mo22255z = qm8.f100966a.mo22255z();
        this.f85104b.f7357d.f100966a.mo22259C();
        QM8.m88568M(qm8, new ComponentName(mo22255z, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
