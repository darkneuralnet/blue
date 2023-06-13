package p000;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
/* renamed from: t0 */
/* loaded from: classes6.dex */
public abstract class AbstractC28494t0 {

    /* renamed from: a */
    public final C1027CT f109648a;

    /* renamed from: b */
    public final C41975hB1 f109649b;

    public AbstractC28494t0(C1027CT c1027ct) {
        this.f109648a = c1027ct;
        this.f109649b = new C41975hB1(c1027ct);
    }

    /* renamed from: a */
    public static AbstractC28494t0 m13280a(C1027CT c1027ct) {
        if (c1027ct.m112217k(1)) {
            return new C28149s(c1027ct);
        }
        if (!c1027ct.m112217k(2)) {
            return new C0187Ag(c1027ct);
        }
        int m36655g = C41975hB1.m36655g(c1027ct, 1, 4);
        if (m36655g != 4) {
            if (m36655g != 5) {
                int m36655g2 = C41975hB1.m36655g(c1027ct, 1, 5);
                if (m36655g2 != 12) {
                    if (m36655g2 != 13) {
                        switch (C41975hB1.m36655g(c1027ct, 1, 7)) {
                            case 56:
                                return new C27448q(c1027ct, "310", "11");
                            case 57:
                                return new C27448q(c1027ct, "320", "11");
                            case 58:
                                return new C27448q(c1027ct, "310", "13");
                            case 59:
                                return new C27448q(c1027ct, "320", "13");
                            case 60:
                                return new C27448q(c1027ct, "310", "15");
                            case 61:
                                return new C27448q(c1027ct, "320", "15");
                            case 62:
                                return new C27448q(c1027ct, "310", "17");
                            case 63:
                                return new C27448q(c1027ct, "320", "17");
                            default:
                                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(c1027ct)));
                        }
                    }
                    return new C27115p(c1027ct);
                }
                return new C26778o(c1027ct);
            }
            return new C26331n(c1027ct);
        }
        return new C25844m(c1027ct);
    }

    /* renamed from: b */
    public final C41975hB1 m13279b() {
        return this.f109649b;
    }

    /* renamed from: c */
    public final C1027CT m13278c() {
        return this.f109648a;
    }

    /* renamed from: d */
    public abstract String mo13277d() throws NotFoundException, FormatException;
}
