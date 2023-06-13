package p000;

import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzq;
/* renamed from: oo8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC46498oo8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzac f102525b;

    /* renamed from: c */
    public final /* synthetic */ zzq f102526c;

    /* renamed from: d */
    public final /* synthetic */ BinderC39423cs8 f102527d;

    public RunnableC46498oo8(BinderC39423cs8 binderC39423cs8, zzac zzacVar, zzq zzqVar) {
        this.f102527d = binderC39423cs8;
        this.f102525b = zzacVar;
        this.f102526c = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C42162hV8 c42162hV8;
        C42162hV8 c42162hV82;
        C42162hV8 c42162hV83;
        c42162hV8 = this.f102527d.f75753a;
        c42162hV8.m36295b();
        if (this.f102525b.f71519d.m50581s() == null) {
            c42162hV83 = this.f102527d.f75753a;
            c42162hV83.m36270q(this.f102525b, this.f102526c);
            return;
        }
        c42162hV82 = this.f102527d.f75753a;
        c42162hV82.m36264w(this.f102525b, this.f102526c);
    }
}
