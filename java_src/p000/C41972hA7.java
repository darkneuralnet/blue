package p000;

import java.util.List;
/* renamed from: hA7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41972hA7 extends AbstractC32304Cy7 {
    public C41972hA7() {
        this.f4981a.add(ZK7.EQUALS);
        this.f4981a.add(ZK7.GREATER_THAN);
        this.f4981a.add(ZK7.GREATER_THAN_EQUALS);
        this.f4981a.add(ZK7.IDENTITY_EQUALS);
        this.f4981a.add(ZK7.IDENTITY_NOT_EQUALS);
        this.f4981a.add(ZK7.LESS_THAN);
        this.f4981a.add(ZK7.LESS_THAN_EQUALS);
        this.f4981a.add(ZK7.NOT_EQUALS);
    }

    /* renamed from: c */
    public static boolean m36764c(InterfaceC37164Xs7 interfaceC37164Xs7, InterfaceC37164Xs7 interfaceC37164Xs72) {
        if (interfaceC37164Xs7.getClass().equals(interfaceC37164Xs72.getClass())) {
            if ((interfaceC37164Xs7 instanceof C37200Xw7) || (interfaceC37164Xs7 instanceof C47713qr7)) {
                return true;
            }
            if (interfaceC37164Xs7 instanceof C44105km7) {
                if (Double.isNaN(interfaceC37164Xs7.zzh().doubleValue()) || Double.isNaN(interfaceC37164Xs72.zzh().doubleValue()) || interfaceC37164Xs7.zzh().doubleValue() != interfaceC37164Xs72.zzh().doubleValue()) {
                    return false;
                }
                return true;
            } else if (interfaceC37164Xs7 instanceof C43019iw7) {
                return interfaceC37164Xs7.zzi().equals(interfaceC37164Xs72.zzi());
            } else {
                if (interfaceC37164Xs7 instanceof C48828sk7) {
                    return interfaceC37164Xs7.zzg().equals(interfaceC37164Xs72.zzg());
                }
                if (interfaceC37164Xs7 != interfaceC37164Xs72) {
                    return false;
                }
                return true;
            }
        } else if (((interfaceC37164Xs7 instanceof C37200Xw7) || (interfaceC37164Xs7 instanceof C47713qr7)) && ((interfaceC37164Xs72 instanceof C37200Xw7) || (interfaceC37164Xs72 instanceof C47713qr7))) {
            return true;
        } else {
            boolean z = interfaceC37164Xs7 instanceof C44105km7;
            if (z && (interfaceC37164Xs72 instanceof C43019iw7)) {
                return m36764c(interfaceC37164Xs7, new C44105km7(interfaceC37164Xs72.zzh()));
            }
            boolean z2 = interfaceC37164Xs7 instanceof C43019iw7;
            if (z2 && (interfaceC37164Xs72 instanceof C44105km7)) {
                return m36764c(new C44105km7(interfaceC37164Xs7.zzh()), interfaceC37164Xs72);
            }
            if (interfaceC37164Xs7 instanceof C48828sk7) {
                return m36764c(new C44105km7(interfaceC37164Xs7.zzh()), interfaceC37164Xs72);
            }
            if (interfaceC37164Xs72 instanceof C48828sk7) {
                return m36764c(interfaceC37164Xs7, new C44105km7(interfaceC37164Xs72.zzh()));
            }
            if ((!z2 && !z) || !(interfaceC37164Xs72 instanceof InterfaceC33159Gp7)) {
                if (!(interfaceC37164Xs7 instanceof InterfaceC33159Gp7) || (!(interfaceC37164Xs72 instanceof C43019iw7) && !(interfaceC37164Xs72 instanceof C44105km7))) {
                    return false;
                }
                return m36764c(new C43019iw7(interfaceC37164Xs7.zzi()), interfaceC37164Xs72);
            }
            return m36764c(interfaceC37164Xs7, new C43019iw7(interfaceC37164Xs72.zzi()));
        }
    }

    /* renamed from: d */
    public static boolean m36763d(InterfaceC37164Xs7 interfaceC37164Xs7, InterfaceC37164Xs7 interfaceC37164Xs72) {
        int i;
        if (interfaceC37164Xs7 instanceof InterfaceC33159Gp7) {
            interfaceC37164Xs7 = new C43019iw7(interfaceC37164Xs7.zzi());
        }
        if (interfaceC37164Xs72 instanceof InterfaceC33159Gp7) {
            interfaceC37164Xs72 = new C43019iw7(interfaceC37164Xs72.zzi());
        }
        if ((interfaceC37164Xs7 instanceof C43019iw7) && (interfaceC37164Xs72 instanceof C43019iw7)) {
            if (interfaceC37164Xs7.zzi().compareTo(interfaceC37164Xs72.zzi()) < 0) {
                return true;
            }
            return false;
        }
        double doubleValue = interfaceC37164Xs7.zzh().doubleValue();
        double doubleValue2 = interfaceC37164Xs72.zzh().doubleValue();
        if (!Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && ((doubleValue != 0.0d || doubleValue2 != 0.0d) && ((i != 0 || doubleValue2 != 0.0d) && Double.compare(doubleValue, doubleValue2) < 0))) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m36762e(InterfaceC37164Xs7 interfaceC37164Xs7, InterfaceC37164Xs7 interfaceC37164Xs72) {
        if (interfaceC37164Xs7 instanceof InterfaceC33159Gp7) {
            interfaceC37164Xs7 = new C43019iw7(interfaceC37164Xs7.zzi());
        }
        if (interfaceC37164Xs72 instanceof InterfaceC33159Gp7) {
            interfaceC37164Xs72 = new C43019iw7(interfaceC37164Xs72.zzi());
        }
        if (((!(interfaceC37164Xs7 instanceof C43019iw7) || !(interfaceC37164Xs72 instanceof C43019iw7)) && (Double.isNaN(interfaceC37164Xs7.zzh().doubleValue()) || Double.isNaN(interfaceC37164Xs72.zzh().doubleValue()))) || m36763d(interfaceC37164Xs72, interfaceC37164Xs7)) {
            return false;
        }
        return true;
    }

    @Override // p000.AbstractC32304Cy7
    /* renamed from: a */
    public final InterfaceC37164Xs7 mo1608a(String str, C38159am8 c38159am8, List list) {
        boolean m36764c;
        boolean m36764c2;
        C38822bt8.m62176h(C38822bt8.m62179e(str).name(), 2, list);
        InterfaceC37164Xs7 m70757b = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
        InterfaceC37164Xs7 m70757b2 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1));
        int ordinal = C38822bt8.m62179e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal != 48) {
                if (ordinal != 42) {
                    if (ordinal != 43) {
                        switch (ordinal) {
                            case 37:
                                m36764c = m36763d(m70757b2, m70757b);
                                break;
                            case 38:
                                m36764c = m36762e(m70757b2, m70757b);
                                break;
                            case 39:
                                m36764c = C38822bt8.m62172l(m70757b, m70757b2);
                                break;
                            case 40:
                                m36764c2 = C38822bt8.m62172l(m70757b, m70757b2);
                                break;
                            default:
                                return super.m111184b(str);
                        }
                    } else {
                        m36764c = m36762e(m70757b, m70757b2);
                    }
                } else {
                    m36764c = m36763d(m70757b, m70757b2);
                }
            } else {
                m36764c2 = m36764c(m70757b, m70757b2);
            }
            m36764c = !m36764c2;
        } else {
            m36764c = m36764c(m70757b, m70757b2);
        }
        if (m36764c) {
            return InterfaceC37164Xs7.f44130m0;
        }
        return InterfaceC37164Xs7.f44131n0;
    }
}
