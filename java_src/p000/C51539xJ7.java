package p000;

import java.util.List;
/* renamed from: xJ7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51539xJ7 extends AbstractC32304Cy7 {
    public C51539xJ7() {
        this.f4981a.add(ZK7.ADD);
        this.f4981a.add(ZK7.DIVIDE);
        this.f4981a.add(ZK7.MODULUS);
        this.f4981a.add(ZK7.MULTIPLY);
        this.f4981a.add(ZK7.NEGATE);
        this.f4981a.add(ZK7.POST_DECREMENT);
        this.f4981a.add(ZK7.POST_INCREMENT);
        this.f4981a.add(ZK7.PRE_DECREMENT);
        this.f4981a.add(ZK7.PRE_INCREMENT);
        this.f4981a.add(ZK7.SUBTRACT);
    }

    @Override // p000.AbstractC32304Cy7
    /* renamed from: a */
    public final InterfaceC37164Xs7 mo1608a(String str, C38159am8 c38159am8, List list) {
        ZK7 zk7 = ZK7.ADD;
        int ordinal = C38822bt8.m62179e(str).ordinal();
        if (ordinal != 0) {
            if (ordinal != 21) {
                if (ordinal != 59) {
                    if (ordinal != 52 && ordinal != 53) {
                        if (ordinal != 55 && ordinal != 56) {
                            switch (ordinal) {
                                case 44:
                                    C38822bt8.m62176h(ZK7.MODULUS.name(), 2, list);
                                    return new C44105km7(Double.valueOf(c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzh().doubleValue() % c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzh().doubleValue()));
                                case 45:
                                    C38822bt8.m62176h(ZK7.MULTIPLY.name(), 2, list);
                                    return new C44105km7(Double.valueOf(c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzh().doubleValue() * c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzh().doubleValue()));
                                case 46:
                                    C38822bt8.m62176h(ZK7.NEGATE.name(), 1, list);
                                    return new C44105km7(Double.valueOf(-c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzh().doubleValue()));
                                default:
                                    return super.m111184b(str);
                            }
                        }
                        C38822bt8.m62176h(str, 1, list);
                        return c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                    }
                    C38822bt8.m62176h(str, 2, list);
                    InterfaceC37164Xs7 m70757b = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                    c38159am8.m70757b((InterfaceC37164Xs7) list.get(1));
                    return m70757b;
                }
                C38822bt8.m62176h(ZK7.SUBTRACT.name(), 2, list);
                return new C44105km7(Double.valueOf(c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzh().doubleValue() + new C44105km7(Double.valueOf(-c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzh().doubleValue())).zzh().doubleValue()));
            }
            C38822bt8.m62176h(ZK7.DIVIDE.name(), 2, list);
            return new C44105km7(Double.valueOf(c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzh().doubleValue() / c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzh().doubleValue()));
        }
        C38822bt8.m62176h(ZK7.ADD.name(), 2, list);
        InterfaceC37164Xs7 m70757b2 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
        InterfaceC37164Xs7 m70757b3 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1));
        if (!(m70757b2 instanceof InterfaceC33159Gp7) && !(m70757b2 instanceof C43019iw7) && !(m70757b3 instanceof InterfaceC33159Gp7) && !(m70757b3 instanceof C43019iw7)) {
            return new C44105km7(Double.valueOf(m70757b2.zzh().doubleValue() + m70757b3.zzh().doubleValue()));
        }
        return new C43019iw7(String.valueOf(m70757b2.zzi()).concat(String.valueOf(m70757b3.zzi())));
    }
}
