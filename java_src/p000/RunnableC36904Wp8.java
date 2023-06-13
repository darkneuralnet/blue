package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzq;
/* renamed from: Wp8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36904Wp8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzq f42165b;

    /* renamed from: c */
    public final /* synthetic */ BinderC39423cs8 f42166c;

    public RunnableC36904Wp8(BinderC39423cs8 binderC39423cs8, zzq zzqVar) {
        this.f42166c = binderC39423cs8;
        this.f42165b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C42162hV8 c42162hV8;
        C42162hV8 c42162hV82;
        c42162hV8 = this.f42166c.f75753a;
        c42162hV8.m36295b();
        c42162hV82 = this.f42166c.f75753a;
        zzq zzqVar = this.f42165b;
        c42162hV82.mo22257c().mo19953e();
        c42162hV82.m36292d();
        Preconditions.checkNotEmpty(zzqVar.f71541b);
        c42162hV82.m36304S(zzqVar);
    }
}
