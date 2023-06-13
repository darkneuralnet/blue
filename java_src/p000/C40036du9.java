package p000;

import java.util.List;
/* renamed from: du9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40036du9 extends AbstractC40557en7 {

    /* renamed from: d */
    public final Jy9 f77405d;

    public C40036du9(Jy9 jy9) {
        super("internal.registerCallback");
        this.f77405d = jy9;
    }

    @Override // p000.AbstractC40557en7
    /* renamed from: d */
    public final InterfaceC37164Xs7 mo4521d(C38159am8 c38159am8, List list) {
        int i;
        C38822bt8.m62176h(this.f78859b, 3, list);
        String zzi = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzi();
        InterfaceC37164Xs7 m70757b = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1));
        if (m70757b instanceof C42386hs7) {
            InterfaceC37164Xs7 m70757b2 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(2));
            if (m70757b2 instanceof C53038zq7) {
                C53038zq7 c53038zq7 = (C53038zq7) m70757b2;
                if (c53038zq7.mo384b("type")) {
                    String zzi2 = c53038zq7.mo385a("type").zzi();
                    if (c53038zq7.mo384b("priority")) {
                        i = C38822bt8.m62182b(c53038zq7.mo385a("priority").zzh().doubleValue());
                    } else {
                        i = 1000;
                    }
                    this.f77405d.m99408a(zzi, i, (C42386hs7) m70757b, zzi2);
                    return InterfaceC37164Xs7.f44125h0;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
