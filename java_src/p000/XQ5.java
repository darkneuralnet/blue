package p000;
/* renamed from: XQ5 */
/* loaded from: classes.dex */
public class XQ5 implements Runnable {

    /* renamed from: e */
    public static final String f43154e = AbstractC32056Bx2.m113270i("StopWorkRunnable");

    /* renamed from: b */
    public final C37830aD6 f43155b;

    /* renamed from: c */
    public final C42698iP5 f43156c;

    /* renamed from: d */
    public final boolean f43157d;

    public XQ5(C37830aD6 c37830aD6, C42698iP5 c42698iP5, boolean z) {
        this.f43155b = c37830aD6;
        this.f43156c = c42698iP5;
        this.f43157d = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m34408u;
        if (this.f43157d) {
            m34408u = this.f43155b.m71759r().m34409t(this.f43156c);
        } else {
            m34408u = this.f43155b.m71759r().m34408u(this.f43156c);
        }
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str = f43154e;
        m113272e.mo113269a(str, "StopWorkRunnable for " + this.f43156c.m34016a().m84208b() + "; Processor.stopWork = " + m34408u);
    }
}
