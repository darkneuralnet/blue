package p000;

import java.util.Iterator;
import java.util.List;
/* renamed from: JK7 */
/* loaded from: classes5.dex */
public final class JK7 extends AbstractC32304Cy7 {
    public JK7() {
        this.f4981a.add(ZK7.ASSIGN);
        this.f4981a.add(ZK7.CONST);
        this.f4981a.add(ZK7.CREATE_ARRAY);
        this.f4981a.add(ZK7.CREATE_OBJECT);
        this.f4981a.add(ZK7.EXPRESSION_LIST);
        this.f4981a.add(ZK7.GET);
        this.f4981a.add(ZK7.GET_INDEX);
        this.f4981a.add(ZK7.GET_PROPERTY);
        this.f4981a.add(ZK7.NULL);
        this.f4981a.add(ZK7.SET_PROPERTY);
        this.f4981a.add(ZK7.TYPEOF);
        this.f4981a.add(ZK7.UNDEFINED);
        this.f4981a.add(ZK7.VAR);
    }

    @Override // p000.AbstractC32304Cy7
    /* renamed from: a */
    public final InterfaceC37164Xs7 mo1608a(String str, C38159am8 c38159am8, List list) {
        String str2;
        ZK7 zk7 = ZK7.ADD;
        int ordinal = C38822bt8.m62179e(str).ordinal();
        int i = 0;
        if (ordinal != 3) {
            if (ordinal != 14) {
                if (ordinal != 24) {
                    if (ordinal != 33) {
                        if (ordinal != 49) {
                            if (ordinal != 58) {
                                if (ordinal != 17) {
                                    if (ordinal != 18) {
                                        if (ordinal != 35 && ordinal != 36) {
                                            switch (ordinal) {
                                                case 62:
                                                    C38822bt8.m62176h(ZK7.TYPEOF.name(), 1, list);
                                                    InterfaceC37164Xs7 m70757b = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                                                    if (m70757b instanceof C37200Xw7) {
                                                        str2 = "undefined";
                                                    } else if (m70757b instanceof C48828sk7) {
                                                        str2 = "boolean";
                                                    } else if (m70757b instanceof C44105km7) {
                                                        str2 = "number";
                                                    } else if (m70757b instanceof C43019iw7) {
                                                        str2 = "string";
                                                    } else if (m70757b instanceof C42386hs7) {
                                                        str2 = "function";
                                                    } else if (!(m70757b instanceof C34365Lt7) && !(m70757b instanceof C45874nl7)) {
                                                        str2 = "object";
                                                    } else {
                                                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", m70757b));
                                                    }
                                                    return new C43019iw7(str2);
                                                case 63:
                                                    C38822bt8.m62176h(ZK7.UNDEFINED.name(), 0, list);
                                                    return InterfaceC37164Xs7.f44125h0;
                                                case 64:
                                                    C38822bt8.m62175i(ZK7.VAR.name(), 1, list);
                                                    Iterator it = list.iterator();
                                                    while (it.hasNext()) {
                                                        InterfaceC37164Xs7 m70757b2 = c38159am8.m70757b((InterfaceC37164Xs7) it.next());
                                                        if (m70757b2 instanceof C43019iw7) {
                                                            c38159am8.m70754e(m70757b2.zzi(), InterfaceC37164Xs7.f44125h0);
                                                        } else {
                                                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", m70757b2.getClass().getCanonicalName()));
                                                        }
                                                    }
                                                    return InterfaceC37164Xs7.f44125h0;
                                                default:
                                                    return super.m111184b(str);
                                            }
                                        }
                                        C38822bt8.m62176h(ZK7.GET_PROPERTY.name(), 2, list);
                                        InterfaceC37164Xs7 m70757b3 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                                        InterfaceC37164Xs7 m70757b4 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1));
                                        if ((m70757b3 instanceof C50596vj7) && C38822bt8.m62173k(m70757b4)) {
                                            return ((C50596vj7) m70757b3).m8224h(m70757b4.zzh().intValue());
                                        }
                                        if (m70757b3 instanceof InterfaceC33159Gp7) {
                                            return ((InterfaceC33159Gp7) m70757b3).mo385a(m70757b4.zzi());
                                        }
                                        if (m70757b3 instanceof C43019iw7) {
                                            if ("length".equals(m70757b4.zzi())) {
                                                return new C44105km7(Double.valueOf(m70757b3.zzi().length()));
                                            }
                                            if (C38822bt8.m62173k(m70757b4) && m70757b4.zzh().doubleValue() < m70757b3.zzi().length()) {
                                                return new C43019iw7(String.valueOf(m70757b3.zzi().charAt(m70757b4.zzh().intValue())));
                                            }
                                        }
                                        return InterfaceC37164Xs7.f44125h0;
                                    } else if (list.isEmpty()) {
                                        return new C53038zq7();
                                    } else {
                                        if (list.size() % 2 == 0) {
                                            C53038zq7 c53038zq7 = new C53038zq7();
                                            while (i < list.size() - 1) {
                                                InterfaceC37164Xs7 m70757b5 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(i));
                                                InterfaceC37164Xs7 m70757b6 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(i + 1));
                                                if (!(m70757b5 instanceof C45874nl7) && !(m70757b6 instanceof C45874nl7)) {
                                                    c53038zq7.mo383c(m70757b5.zzi(), m70757b6);
                                                    i += 2;
                                                } else {
                                                    throw new IllegalStateException("Failed to evaluate map entry");
                                                }
                                            }
                                            return c53038zq7;
                                        }
                                        throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                                    }
                                } else if (list.isEmpty()) {
                                    return new C50596vj7();
                                } else {
                                    C50596vj7 c50596vj7 = new C50596vj7();
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        InterfaceC37164Xs7 m70757b7 = c38159am8.m70757b((InterfaceC37164Xs7) it2.next());
                                        if (!(m70757b7 instanceof C45874nl7)) {
                                            c50596vj7.m8217z(i, m70757b7);
                                            i++;
                                        } else {
                                            throw new IllegalStateException("Failed to evaluate array element");
                                        }
                                    }
                                    return c50596vj7;
                                }
                            }
                            C38822bt8.m62176h(ZK7.SET_PROPERTY.name(), 3, list);
                            InterfaceC37164Xs7 m70757b8 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                            InterfaceC37164Xs7 m70757b9 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1));
                            InterfaceC37164Xs7 m70757b10 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(2));
                            if (m70757b8 != InterfaceC37164Xs7.f44125h0 && m70757b8 != InterfaceC37164Xs7.f44126i0) {
                                if ((m70757b8 instanceof C50596vj7) && (m70757b9 instanceof C44105km7)) {
                                    ((C50596vj7) m70757b8).m8217z(m70757b9.zzh().intValue(), m70757b10);
                                } else if (m70757b8 instanceof InterfaceC33159Gp7) {
                                    ((InterfaceC33159Gp7) m70757b8).mo383c(m70757b9.zzi(), m70757b10);
                                }
                                return m70757b10;
                            }
                            throw new IllegalStateException(String.format("Can't set property %s of %s", m70757b9.zzi(), m70757b8.zzi()));
                        }
                        C38822bt8.m62176h(ZK7.NULL.name(), 0, list);
                        return InterfaceC37164Xs7.f44126i0;
                    }
                    C38822bt8.m62176h(ZK7.GET.name(), 1, list);
                    InterfaceC37164Xs7 m70757b11 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                    if (m70757b11 instanceof C43019iw7) {
                        return c38159am8.m70755d(m70757b11.zzi());
                    }
                    throw new IllegalArgumentException(String.format("Expected string for get var. got %s", m70757b11.getClass().getCanonicalName()));
                }
                C38822bt8.m62175i(ZK7.EXPRESSION_LIST.name(), 1, list);
                InterfaceC37164Xs7 interfaceC37164Xs7 = InterfaceC37164Xs7.f44125h0;
                while (i < list.size()) {
                    interfaceC37164Xs7 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(i));
                    if (!(interfaceC37164Xs7 instanceof C45874nl7)) {
                        i++;
                    } else {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                }
                return interfaceC37164Xs7;
            }
            C38822bt8.m62175i(ZK7.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                for (int i2 = 0; i2 < list.size() - 1; i2 += 2) {
                    InterfaceC37164Xs7 m70757b12 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(i2));
                    if (m70757b12 instanceof C43019iw7) {
                        c38159am8.m70753f(m70757b12.zzi(), c38159am8.m70757b((InterfaceC37164Xs7) list.get(i2 + 1)));
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", m70757b12.getClass().getCanonicalName()));
                    }
                }
                return InterfaceC37164Xs7.f44125h0;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        }
        C38822bt8.m62176h(ZK7.ASSIGN.name(), 2, list);
        InterfaceC37164Xs7 m70757b13 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
        if (m70757b13 instanceof C43019iw7) {
            if (c38159am8.m70751h(m70757b13.zzi())) {
                InterfaceC37164Xs7 m70757b14 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1));
                c38159am8.m70752g(m70757b13.zzi(), m70757b14);
                return m70757b14;
            }
            throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", m70757b13.zzi()));
        }
        throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", m70757b13.getClass().getCanonicalName()));
    }
}
