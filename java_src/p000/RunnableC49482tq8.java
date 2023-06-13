package p000;

import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzq;
/* renamed from: tq8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC49482tq8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzaw f111113b;

    /* renamed from: c */
    public final /* synthetic */ zzq f111114c;

    /* renamed from: d */
    public final /* synthetic */ BinderC39423cs8 f111115d;

    public RunnableC49482tq8(BinderC39423cs8 binderC39423cs8, zzaw zzawVar, zzq zzqVar) {
        this.f111115d = binderC39423cs8;
        this.f111113b = zzawVar;
        this.f111114c = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f111115d.m44933g5(this.f111115d.m44935e5(this.f111113b, this.f111114c), this.f111114c);
    }
}
