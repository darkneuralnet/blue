package p000;
/* renamed from: Qr8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC35518Qr8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f31029b;

    /* renamed from: c */
    public final /* synthetic */ String f31030c;

    /* renamed from: d */
    public final /* synthetic */ String f31031d;

    /* renamed from: e */
    public final /* synthetic */ long f31032e;

    /* renamed from: f */
    public final /* synthetic */ BinderC39423cs8 f31033f;

    public RunnableC35518Qr8(BinderC39423cs8 binderC39423cs8, String str, String str2, String str3, long j) {
        this.f31033f = binderC39423cs8;
        this.f31029b = str;
        this.f31030c = str2;
        this.f31031d = str3;
        this.f31032e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C42162hV8 c42162hV8;
        C42162hV8 c42162hV82;
        String str = this.f31029b;
        if (str == null) {
            c42162hV82 = this.f31033f.f75753a;
            c42162hV82.m36267t(this.f31030c, null);
            return;
        }
        C50902wE8 c50902wE8 = new C50902wE8(this.f31031d, str, this.f31032e);
        c42162hV8 = this.f31033f.f75753a;
        c42162hV8.m36267t(this.f31030c, c50902wE8);
    }
}
