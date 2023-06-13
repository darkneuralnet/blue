package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzq;
/* renamed from: hq8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC42367hq8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzq f85990b;

    /* renamed from: c */
    public final /* synthetic */ BinderC39423cs8 f85991c;

    public RunnableC42367hq8(BinderC39423cs8 binderC39423cs8, zzq zzqVar) {
        this.f85991c = binderC39423cs8;
        this.f85990b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C42162hV8 c42162hV8;
        C42162hV8 c42162hV82;
        c42162hV8 = this.f85991c.f75753a;
        c42162hV8.m36295b();
        c42162hV82 = this.f85991c.f75753a;
        zzq zzqVar = this.f85990b;
        c42162hV82.mo22257c().mo19953e();
        c42162hV82.m36292d();
        Preconditions.checkNotEmpty(zzqVar.f71541b);
        C37110Xm7 m76364b = C37110Xm7.m76364b(zzqVar.f71562w);
        C37110Xm7 m36301V = c42162hV82.m36301V(zzqVar.f71541b);
        c42162hV82.mo22258a().m106889s().m42706c("Setting consent, package, consent", zzqVar.f71541b, m76364b);
        c42162hV82.m36263x(zzqVar.f71541b, m76364b);
        if (m76364b.m76355k(m36301V)) {
            c42162hV82.m36268s(zzqVar);
        }
    }
}
