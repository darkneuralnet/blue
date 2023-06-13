package p000;
/* renamed from: Vs4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C36693Vs4 {

    /* renamed from: a */
    public CX3 f39867a;

    /* renamed from: b */
    public C48772sf1 f39868b;

    public C36693Vs4(CX3 cx3) {
        this.f39867a = cx3;
        this.f39868b = cx3.m78759Z();
    }

    /* renamed from: b */
    public static boolean m79322b(CX3 cx3, WB1 wb1) {
        return new C36693Vs4(cx3).m79323a(wb1);
    }

    /* renamed from: a */
    public boolean m79323a(WB1 wb1) {
        if (!this.f39868b.m13887K(wb1.m78759Z())) {
            return false;
        }
        C49365tf1 c49365tf1 = new C49365tf1(this.f39868b);
        c49365tf1.m82200a(wb1);
        if (c49365tf1.m11956d()) {
            return true;
        }
        C37816aC1 c37816aC1 = new C37816aC1(this.f39867a);
        c37816aC1.m82200a(wb1);
        if (c37816aC1.m71792d()) {
            return true;
        }
        C36927Ws4 c36927Ws4 = new C36927Ws4(this.f39867a);
        c36927Ws4.m82200a(wb1);
        if (!c36927Ws4.m77758f()) {
            return false;
        }
        return true;
    }
}
