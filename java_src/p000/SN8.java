package p000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: SN8 */
/* loaded from: classes5.dex */
public final class SN8 extends AbstractC40557en7 {

    /* renamed from: d */
    public final C34950Og7 f33590d;

    public SN8(C34950Og7 c34950Og7) {
        super("internal.eventLogger");
        this.f33590d = c34950Og7;
    }

    @Override // p000.AbstractC40557en7
    /* renamed from: d */
    public final InterfaceC37164Xs7 mo4521d(C38159am8 c38159am8, List list) {
        Map hashMap;
        C38822bt8.m62176h(this.f78859b, 3, list);
        String zzi = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzi();
        long m62183a = (long) C38822bt8.m62183a(c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzh().doubleValue());
        InterfaceC37164Xs7 m70757b = c38159am8.m70757b((InterfaceC37164Xs7) list.get(2));
        if (m70757b instanceof C53038zq7) {
            hashMap = C38822bt8.m62177g((C53038zq7) m70757b);
        } else {
            hashMap = new HashMap();
        }
        this.f33590d.m91680e(zzi, m62183a, hashMap);
        return InterfaceC37164Xs7.f44125h0;
    }
}
