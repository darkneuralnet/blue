package p000;

import java.util.List;
import java.util.Map;
/* renamed from: RT8 */
/* loaded from: classes5.dex */
public final class RT8 extends C53038zq7 {

    /* renamed from: c */
    public final C34950Og7 f32086c;

    public RT8(C34950Og7 c34950Og7) {
        this.f32086c = c34950Og7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.C53038zq7, p000.InterfaceC37164Xs7
    /* renamed from: o */
    public final InterfaceC37164Xs7 mo380o(String str, C38159am8 c38159am8, List list) {
        char c;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                return super.mo380o(str, c38159am8, list);
                            }
                            C38822bt8.m62176h("setParamValue", 2, list);
                            String zzi = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzi();
                            InterfaceC37164Xs7 m70757b = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1));
                            this.f32086c.m91683b().m89957g(zzi, C38822bt8.m62178f(m70757b));
                            return m70757b;
                        }
                        C38822bt8.m62176h("setEventName", 1, list);
                        InterfaceC37164Xs7 m70757b2 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                        if (!InterfaceC37164Xs7.f44125h0.equals(m70757b2) && !InterfaceC37164Xs7.f44126i0.equals(m70757b2)) {
                            this.f32086c.m91683b().m89958f(m70757b2.zzi());
                            return new C43019iw7(m70757b2.zzi());
                        }
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    C38822bt8.m62176h("getTimestamp", 0, list);
                    return new C44105km7(Double.valueOf(this.f32086c.m91683b().m89963a()));
                }
                C38822bt8.m62176h("getParams", 0, list);
                Map m89959e = this.f32086c.m91683b().m89959e();
                C53038zq7 c53038zq7 = new C53038zq7();
                for (String str2 : m89959e.keySet()) {
                    c53038zq7.mo383c(str2, C40194eA8.m43153b(m89959e.get(str2)));
                }
                return c53038zq7;
            }
            C38822bt8.m62176h("getParamValue", 1, list);
            return C40194eA8.m43153b(this.f32086c.m91683b().m89961c(c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzi()));
        }
        C38822bt8.m62176h("getEventName", 0, list);
        return new C43019iw7(this.f32086c.m91683b().m89960d());
    }
}
