package p000;

import java.util.List;
/* renamed from: Mx7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34635Mx7 extends AbstractC32304Cy7 {
    public C34635Mx7() {
        this.f4981a.add(ZK7.BITWISE_AND);
        this.f4981a.add(ZK7.BITWISE_LEFT_SHIFT);
        this.f4981a.add(ZK7.BITWISE_NOT);
        this.f4981a.add(ZK7.BITWISE_OR);
        this.f4981a.add(ZK7.BITWISE_RIGHT_SHIFT);
        this.f4981a.add(ZK7.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f4981a.add(ZK7.BITWISE_XOR);
    }

    @Override // p000.AbstractC32304Cy7
    /* renamed from: a */
    public final InterfaceC37164Xs7 mo1608a(String str, C38159am8 c38159am8, List list) {
        ZK7 zk7 = ZK7.ADD;
        switch (C38822bt8.m62179e(str).ordinal()) {
            case 4:
                C38822bt8.m62176h(ZK7.BITWISE_AND.name(), 2, list);
                return new C44105km7(Double.valueOf(C38822bt8.m62182b(c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzh().doubleValue()) & C38822bt8.m62182b(c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzh().doubleValue())));
            case 5:
                C38822bt8.m62176h(ZK7.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C44105km7(Double.valueOf(C38822bt8.m62182b(c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzh().doubleValue()) << ((int) (C38822bt8.m62180d(c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzh().doubleValue()) & 31))));
            case 6:
                C38822bt8.m62176h(ZK7.BITWISE_NOT.name(), 1, list);
                return new C44105km7(Double.valueOf(~C38822bt8.m62182b(c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzh().doubleValue())));
            case 7:
                C38822bt8.m62176h(ZK7.BITWISE_OR.name(), 2, list);
                return new C44105km7(Double.valueOf(C38822bt8.m62182b(c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzh().doubleValue()) | C38822bt8.m62182b(c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzh().doubleValue())));
            case 8:
                C38822bt8.m62176h(ZK7.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C44105km7(Double.valueOf(C38822bt8.m62182b(c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzh().doubleValue()) >> ((int) (C38822bt8.m62180d(c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzh().doubleValue()) & 31))));
            case 9:
                C38822bt8.m62176h(ZK7.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C44105km7(Double.valueOf(C38822bt8.m62180d(c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzh().doubleValue()) >>> ((int) (C38822bt8.m62180d(c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzh().doubleValue()) & 31))));
            case 10:
                C38822bt8.m62176h(ZK7.BITWISE_XOR.name(), 2, list);
                return new C44105km7(Double.valueOf(C38822bt8.m62182b(c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzh().doubleValue()) ^ C38822bt8.m62182b(c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzh().doubleValue())));
            default:
                return super.m111184b(str);
        }
    }
}
