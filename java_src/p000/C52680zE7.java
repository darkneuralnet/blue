package p000;

import java.util.List;
/* renamed from: zE7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52680zE7 extends AbstractC32304Cy7 {
    public C52680zE7() {
        this.f4981a.add(ZK7.AND);
        this.f4981a.add(ZK7.NOT);
        this.f4981a.add(ZK7.OR);
    }

    @Override // p000.AbstractC32304Cy7
    /* renamed from: a */
    public final InterfaceC37164Xs7 mo1608a(String str, C38159am8 c38159am8, List list) {
        ZK7 zk7 = ZK7.ADD;
        int ordinal = C38822bt8.m62179e(str).ordinal();
        if (ordinal != 1) {
            if (ordinal != 47) {
                if (ordinal != 50) {
                    return super.m111184b(str);
                }
                C38822bt8.m62176h(ZK7.OR.name(), 2, list);
                InterfaceC37164Xs7 m70757b = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                if (m70757b.zzg().booleanValue()) {
                    return m70757b;
                }
                return c38159am8.m70757b((InterfaceC37164Xs7) list.get(1));
            }
            C38822bt8.m62176h(ZK7.NOT.name(), 1, list);
            return new C48828sk7(Boolean.valueOf(!c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzg().booleanValue()));
        }
        C38822bt8.m62176h(ZK7.AND.name(), 2, list);
        InterfaceC37164Xs7 m70757b2 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
        if (!m70757b2.zzg().booleanValue()) {
            return m70757b2;
        }
        return c38159am8.m70757b((InterfaceC37164Xs7) list.get(1));
    }
}
