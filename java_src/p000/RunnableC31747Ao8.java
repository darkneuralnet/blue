package p000;

import com.google.android.gms.measurement.internal.zzac;
/* renamed from: Ao8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC31747Ao8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzac f1164b;

    /* renamed from: c */
    public final /* synthetic */ BinderC39423cs8 f1165c;

    public RunnableC31747Ao8(BinderC39423cs8 binderC39423cs8, zzac zzacVar) {
        this.f1165c = binderC39423cs8;
        this.f1164b = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C42162hV8 c42162hV8;
        C42162hV8 c42162hV82;
        C42162hV8 c42162hV83;
        c42162hV8 = this.f1165c.f75753a;
        c42162hV8.m36295b();
        if (this.f1164b.f71519d.m50581s() == null) {
            c42162hV83 = this.f1165c.f75753a;
            c42162hV83.m36271p(this.f1164b);
            return;
        }
        c42162hV82 = this.f1165c.f75753a;
        c42162hV82.m36265v(this.f1164b);
    }
}
