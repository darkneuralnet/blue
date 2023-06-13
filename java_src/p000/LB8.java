package p000;
/* renamed from: LB8 */
/* loaded from: classes6.dex */
public final class LB8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C37110Xm7 f20879b;

    /* renamed from: c */
    public final /* synthetic */ long f20880c;

    /* renamed from: d */
    public final /* synthetic */ int f20881d;

    /* renamed from: e */
    public final /* synthetic */ long f20882e;

    /* renamed from: f */
    public final /* synthetic */ boolean f20883f;

    /* renamed from: g */
    public final /* synthetic */ C37110Xm7 f20884g;

    /* renamed from: h */
    public final /* synthetic */ RC8 f20885h;

    public LB8(RC8 rc8, C37110Xm7 c37110Xm7, long j, int i, long j2, boolean z, C37110Xm7 c37110Xm72) {
        this.f20885h = rc8;
        this.f20879b = c37110Xm7;
        this.f20880c = j;
        this.f20881d = i;
        this.f20882e = j2;
        this.f20883f = z;
        this.f20884g = c37110Xm72;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20885h.m87186J(this.f20879b);
        this.f20885h.m87152w(this.f20880c, false);
        RC8.m87167c0(this.f20885h, this.f20879b, this.f20881d, this.f20882e, true, this.f20883f);
        C49423tk9.m11813b();
        if (this.f20885h.f100966a.m89751w().m37502y(null, C37795a98.f49990p0)) {
            RC8.m87168b0(this.f20885h, this.f20879b, this.f20884g);
        }
    }
}
