package p000;
/* renamed from: XB8 */
/* loaded from: classes6.dex */
public final class XB8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C37110Xm7 f42773b;

    /* renamed from: c */
    public final /* synthetic */ int f42774c;

    /* renamed from: d */
    public final /* synthetic */ long f42775d;

    /* renamed from: e */
    public final /* synthetic */ boolean f42776e;

    /* renamed from: f */
    public final /* synthetic */ C37110Xm7 f42777f;

    /* renamed from: g */
    public final /* synthetic */ RC8 f42778g;

    public XB8(RC8 rc8, C37110Xm7 c37110Xm7, int i, long j, boolean z, C37110Xm7 c37110Xm72) {
        this.f42778g = rc8;
        this.f42773b = c37110Xm7;
        this.f42774c = i;
        this.f42775d = j;
        this.f42776e = z;
        this.f42777f = c37110Xm72;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42778g.m87186J(this.f42773b);
        RC8.m87167c0(this.f42778g, this.f42773b, this.f42774c, this.f42775d, false, this.f42776e);
        C49423tk9.m11813b();
        if (this.f42778g.f100966a.m89751w().m37502y(null, C37795a98.f49990p0)) {
            RC8.m87168b0(this.f42778g, this.f42773b, this.f42777f);
        }
    }
}
