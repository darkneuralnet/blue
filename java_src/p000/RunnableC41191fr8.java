package p000;

import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzq;
/* renamed from: fr8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC41191fr8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzlj f80861b;

    /* renamed from: c */
    public final /* synthetic */ zzq f80862c;

    /* renamed from: d */
    public final /* synthetic */ BinderC39423cs8 f80863d;

    public RunnableC41191fr8(BinderC39423cs8 binderC39423cs8, zzlj zzljVar, zzq zzqVar) {
        this.f80863d = binderC39423cs8;
        this.f80861b = zzljVar;
        this.f80862c = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C42162hV8 c42162hV8;
        C42162hV8 c42162hV82;
        C42162hV8 c42162hV83;
        c42162hV8 = this.f80863d.f75753a;
        c42162hV8.m36295b();
        if (this.f80861b.m50581s() == null) {
            c42162hV83 = this.f80863d.f75753a;
            c42162hV83.m36269r(this.f80861b.f71534c, this.f80862c);
            return;
        }
        c42162hV82 = this.f80863d.f75753a;
        c42162hV82.m36262y(this.f80861b, this.f80862c);
    }
}
