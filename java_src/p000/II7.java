package p000;

import java.util.Iterator;
import java.util.List;
/* renamed from: II7 */
/* loaded from: classes5.dex */
public final class II7 extends AbstractC32304Cy7 {
    public II7() {
        this.f4981a.add(ZK7.FOR_IN);
        this.f4981a.add(ZK7.FOR_IN_CONST);
        this.f4981a.add(ZK7.FOR_IN_LET);
        this.f4981a.add(ZK7.FOR_LET);
        this.f4981a.add(ZK7.FOR_OF);
        this.f4981a.add(ZK7.FOR_OF_CONST);
        this.f4981a.add(ZK7.FOR_OF_LET);
        this.f4981a.add(ZK7.WHILE);
    }

    /* renamed from: c */
    public static InterfaceC37164Xs7 m102530c(ZG7 zg7, Iterator it, InterfaceC37164Xs7 interfaceC37164Xs7) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC37164Xs7 m70756c = zg7.mo16146a((InterfaceC37164Xs7) it.next()).m70756c((C50596vj7) interfaceC37164Xs7);
                if (m70756c instanceof C45874nl7) {
                    C45874nl7 c45874nl7 = (C45874nl7) m70756c;
                    if ("break".equals(c45874nl7.m23211b())) {
                        return InterfaceC37164Xs7.f44125h0;
                    }
                    if ("return".equals(c45874nl7.m23211b())) {
                        return c45874nl7;
                    }
                }
            }
        }
        return InterfaceC37164Xs7.f44125h0;
    }

    /* renamed from: d */
    public static InterfaceC37164Xs7 m102529d(ZG7 zg7, InterfaceC37164Xs7 interfaceC37164Xs7, InterfaceC37164Xs7 interfaceC37164Xs72) {
        return m102530c(zg7, interfaceC37164Xs7.mo381j(), interfaceC37164Xs72);
    }

    /* renamed from: e */
    public static InterfaceC37164Xs7 m102528e(ZG7 zg7, InterfaceC37164Xs7 interfaceC37164Xs7, InterfaceC37164Xs7 interfaceC37164Xs72) {
        if (interfaceC37164Xs7 instanceof Iterable) {
            return m102530c(zg7, ((Iterable) interfaceC37164Xs7).iterator(), interfaceC37164Xs72);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // p000.AbstractC32304Cy7
    /* renamed from: a */
    public final InterfaceC37164Xs7 mo1608a(String str, C38159am8 c38159am8, List list) {
        ZK7 zk7 = ZK7.ADD;
        int ordinal = C38822bt8.m62179e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    C38822bt8.m62176h(ZK7.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof C43019iw7) {
                        return m102529d(new QH7(c38159am8, ((InterfaceC37164Xs7) list.get(0)).zzi()), c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)), c38159am8.m70757b((InterfaceC37164Xs7) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    C38822bt8.m62176h(ZK7.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof C43019iw7) {
                        return m102529d(new C47947rF7(c38159am8, ((InterfaceC37164Xs7) list.get(0)).zzi()), c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)), c38159am8.m70757b((InterfaceC37164Xs7) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    C38822bt8.m62176h(ZK7.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof C43019iw7) {
                        return m102529d(new C41433gG7(c38159am8, ((InterfaceC37164Xs7) list.get(0)).zzi()), c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)), c38159am8.m70757b((InterfaceC37164Xs7) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    C38822bt8.m62176h(ZK7.FOR_LET.name(), 4, list);
                    InterfaceC37164Xs7 m70757b = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                    if (m70757b instanceof C50596vj7) {
                        C50596vj7 c50596vj7 = (C50596vj7) m70757b;
                        InterfaceC37164Xs7 interfaceC37164Xs7 = (InterfaceC37164Xs7) list.get(1);
                        InterfaceC37164Xs7 interfaceC37164Xs72 = (InterfaceC37164Xs7) list.get(2);
                        InterfaceC37164Xs7 m70757b2 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(3));
                        C38159am8 m70758a = c38159am8.m70758a();
                        for (int i = 0; i < c50596vj7.m8225f(); i++) {
                            String zzi = c50596vj7.m8224h(i).zzi();
                            m70758a.m70752g(zzi, c38159am8.m70755d(zzi));
                        }
                        while (c38159am8.m70757b(interfaceC37164Xs7).zzg().booleanValue()) {
                            InterfaceC37164Xs7 m70756c = c38159am8.m70756c((C50596vj7) m70757b2);
                            if (m70756c instanceof C45874nl7) {
                                C45874nl7 c45874nl7 = (C45874nl7) m70756c;
                                if ("break".equals(c45874nl7.m23211b())) {
                                    return InterfaceC37164Xs7.f44125h0;
                                }
                                if ("return".equals(c45874nl7.m23211b())) {
                                    return c45874nl7;
                                }
                            }
                            C38159am8 m70758a2 = c38159am8.m70758a();
                            for (int i2 = 0; i2 < c50596vj7.m8225f(); i2++) {
                                String zzi2 = c50596vj7.m8224h(i2).zzi();
                                m70758a2.m70752g(zzi2, m70758a.m70755d(zzi2));
                            }
                            m70758a2.m70757b(interfaceC37164Xs72);
                            m70758a = m70758a2;
                        }
                        return InterfaceC37164Xs7.f44125h0;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    C38822bt8.m62176h(ZK7.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof C43019iw7) {
                        return m102528e(new QH7(c38159am8, ((InterfaceC37164Xs7) list.get(0)).zzi()), c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)), c38159am8.m70757b((InterfaceC37164Xs7) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    C38822bt8.m62176h(ZK7.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof C43019iw7) {
                        return m102528e(new C47947rF7(c38159am8, ((InterfaceC37164Xs7) list.get(0)).zzi()), c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)), c38159am8.m70757b((InterfaceC37164Xs7) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    C38822bt8.m62176h(ZK7.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof C43019iw7) {
                        return m102528e(new C41433gG7(c38159am8, ((InterfaceC37164Xs7) list.get(0)).zzi()), c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)), c38159am8.m70757b((InterfaceC37164Xs7) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.m111184b(str);
            }
        }
        C38822bt8.m62176h(ZK7.WHILE.name(), 4, list);
        InterfaceC37164Xs7 interfaceC37164Xs73 = (InterfaceC37164Xs7) list.get(0);
        InterfaceC37164Xs7 interfaceC37164Xs74 = (InterfaceC37164Xs7) list.get(1);
        InterfaceC37164Xs7 m70757b3 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(3));
        if (c38159am8.m70757b((InterfaceC37164Xs7) list.get(2)).zzg().booleanValue()) {
            InterfaceC37164Xs7 m70756c2 = c38159am8.m70756c((C50596vj7) m70757b3);
            if (m70756c2 instanceof C45874nl7) {
                C45874nl7 c45874nl72 = (C45874nl7) m70756c2;
                if ("break".equals(c45874nl72.m23211b())) {
                    return InterfaceC37164Xs7.f44125h0;
                }
                if ("return".equals(c45874nl72.m23211b())) {
                    return c45874nl72;
                }
            }
        }
        while (c38159am8.m70757b(interfaceC37164Xs73).zzg().booleanValue()) {
            InterfaceC37164Xs7 m70756c3 = c38159am8.m70756c((C50596vj7) m70757b3);
            if (m70756c3 instanceof C45874nl7) {
                C45874nl7 c45874nl73 = (C45874nl7) m70756c3;
                if ("break".equals(c45874nl73.m23211b())) {
                    return InterfaceC37164Xs7.f44125h0;
                }
                if ("return".equals(c45874nl73.m23211b())) {
                    return c45874nl73;
                }
            }
            c38159am8.m70757b(interfaceC37164Xs74);
        }
        return InterfaceC37164Xs7.f44125h0;
    }
}
