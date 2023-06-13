package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: UA7 */
/* loaded from: classes5.dex */
public final class UA7 extends AbstractC32304Cy7 {
    public UA7() {
        this.f4981a.add(ZK7.APPLY);
        this.f4981a.add(ZK7.BLOCK);
        this.f4981a.add(ZK7.BREAK);
        this.f4981a.add(ZK7.CASE);
        this.f4981a.add(ZK7.DEFAULT);
        this.f4981a.add(ZK7.CONTINUE);
        this.f4981a.add(ZK7.DEFINE_FUNCTION);
        this.f4981a.add(ZK7.FN);
        this.f4981a.add(ZK7.IF);
        this.f4981a.add(ZK7.QUOTE);
        this.f4981a.add(ZK7.RETURN);
        this.f4981a.add(ZK7.SWITCH);
        this.f4981a.add(ZK7.TERNARY);
    }

    /* renamed from: c */
    public static InterfaceC37164Xs7 m81893c(C38159am8 c38159am8, List list) {
        C38822bt8.m62175i(ZK7.FN.name(), 2, list);
        InterfaceC37164Xs7 m70757b = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
        InterfaceC37164Xs7 m70757b2 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1));
        if (m70757b2 instanceof C50596vj7) {
            List m8221v = ((C50596vj7) m70757b2).m8221v();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new C42386hs7(m70757b.zzi(), m8221v, arrayList, c38159am8);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", m70757b2.getClass().getCanonicalName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0129, code lost:
        if (r8.equals("continue") == false) goto L67;
     */
    @Override // p000.AbstractC32304Cy7
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC37164Xs7 mo1608a(String str, C38159am8 c38159am8, List list) {
        InterfaceC37164Xs7 interfaceC37164Xs7;
        InterfaceC37164Xs7 interfaceC37164Xs72;
        InterfaceC37164Xs7 m70757b;
        ZK7 zk7 = ZK7.ADD;
        int ordinal = C38822bt8.m62179e(str).ordinal();
        if (ordinal != 2) {
            if (ordinal != 15) {
                if (ordinal != 25) {
                    if (ordinal != 41) {
                        if (ordinal != 54) {
                            if (ordinal != 57) {
                                if (ordinal != 19) {
                                    if (ordinal != 20) {
                                        if (ordinal != 60) {
                                            if (ordinal != 61) {
                                                switch (ordinal) {
                                                    case 11:
                                                        return c38159am8.m70758a().m70756c(new C50596vj7(list));
                                                    case 12:
                                                        C38822bt8.m62176h(ZK7.BREAK.name(), 0, list);
                                                        return InterfaceC37164Xs7.f44128k0;
                                                    case 13:
                                                        break;
                                                    default:
                                                        return super.m111184b(str);
                                                }
                                            } else {
                                                C38822bt8.m62176h(ZK7.TERNARY.name(), 3, list);
                                                if (c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzg().booleanValue()) {
                                                    return c38159am8.m70757b((InterfaceC37164Xs7) list.get(1));
                                                }
                                                return c38159am8.m70757b((InterfaceC37164Xs7) list.get(2));
                                            }
                                        } else {
                                            C38822bt8.m62176h(ZK7.SWITCH.name(), 3, list);
                                            InterfaceC37164Xs7 m70757b2 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                                            InterfaceC37164Xs7 m70757b3 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1));
                                            InterfaceC37164Xs7 m70757b4 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(2));
                                            if (m70757b3 instanceof C50596vj7) {
                                                if (m70757b4 instanceof C50596vj7) {
                                                    C50596vj7 c50596vj7 = (C50596vj7) m70757b3;
                                                    C50596vj7 c50596vj72 = (C50596vj7) m70757b4;
                                                    int i = 0;
                                                    boolean z = false;
                                                    while (true) {
                                                        if (i < c50596vj7.m8225f()) {
                                                            if (!z && !m70757b2.equals(c38159am8.m70757b(c50596vj7.m8224h(i)))) {
                                                                z = false;
                                                            } else {
                                                                m70757b = c38159am8.m70757b(c50596vj72.m8224h(i));
                                                                if (m70757b instanceof C45874nl7) {
                                                                    if (((C45874nl7) m70757b).m23211b().equals("break")) {
                                                                        return InterfaceC37164Xs7.f44125h0;
                                                                    }
                                                                } else {
                                                                    z = true;
                                                                }
                                                            }
                                                            i++;
                                                        } else {
                                                            if (c50596vj7.m8225f() + 1 == c50596vj72.m8225f()) {
                                                                m70757b = c38159am8.m70757b(c50596vj72.m8224h(c50596vj7.m8225f()));
                                                                if (m70757b instanceof C45874nl7) {
                                                                    String m23211b = ((C45874nl7) m70757b).m23211b();
                                                                    if (!m23211b.equals("return")) {
                                                                    }
                                                                }
                                                            }
                                                            return InterfaceC37164Xs7.f44125h0;
                                                        }
                                                    }
                                                    return m70757b;
                                                }
                                                throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                                            }
                                            throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                                        }
                                    } else {
                                        C38822bt8.m62175i(ZK7.DEFINE_FUNCTION.name(), 2, list);
                                        InterfaceC37164Xs7 m81893c = m81893c(c38159am8, list);
                                        AbstractC40557en7 abstractC40557en7 = (AbstractC40557en7) m81893c;
                                        if (abstractC40557en7.m42554e() == null) {
                                            c38159am8.m70752g("", m81893c);
                                        } else {
                                            c38159am8.m70752g(abstractC40557en7.m42554e(), m81893c);
                                        }
                                        return m81893c;
                                    }
                                }
                                if (list.isEmpty()) {
                                    return InterfaceC37164Xs7.f44125h0;
                                }
                                InterfaceC37164Xs7 m70757b5 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                                if (m70757b5 instanceof C50596vj7) {
                                    return c38159am8.m70756c((C50596vj7) m70757b5);
                                }
                                return InterfaceC37164Xs7.f44125h0;
                            } else if (list.isEmpty()) {
                                return InterfaceC37164Xs7.f44129l0;
                            } else {
                                C38822bt8.m62176h(ZK7.RETURN.name(), 1, list);
                                return new C45874nl7("return", c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)));
                            }
                        }
                        return new C50596vj7(list);
                    }
                    C38822bt8.m62175i(ZK7.IF.name(), 2, list);
                    InterfaceC37164Xs7 m70757b6 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                    InterfaceC37164Xs7 m70757b7 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1));
                    if (list.size() > 2) {
                        interfaceC37164Xs7 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(2));
                    } else {
                        interfaceC37164Xs7 = null;
                    }
                    InterfaceC37164Xs7 interfaceC37164Xs73 = InterfaceC37164Xs7.f44125h0;
                    if (m70757b6.zzg().booleanValue()) {
                        interfaceC37164Xs72 = c38159am8.m70756c((C50596vj7) m70757b7);
                    } else if (interfaceC37164Xs7 != null) {
                        interfaceC37164Xs72 = c38159am8.m70756c((C50596vj7) interfaceC37164Xs7);
                    } else {
                        interfaceC37164Xs72 = interfaceC37164Xs73;
                    }
                    if (interfaceC37164Xs72 instanceof C45874nl7) {
                        return interfaceC37164Xs72;
                    }
                    return interfaceC37164Xs73;
                }
                return m81893c(c38159am8, list);
            }
            C38822bt8.m62176h(ZK7.BREAK.name(), 0, list);
            return InterfaceC37164Xs7.f44127j0;
        }
        C38822bt8.m62176h(ZK7.APPLY.name(), 3, list);
        InterfaceC37164Xs7 m70757b8 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
        String zzi = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzi();
        InterfaceC37164Xs7 m70757b9 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(2));
        if (m70757b9 instanceof C50596vj7) {
            if (!zzi.isEmpty()) {
                return m70757b8.mo380o(zzi, c38159am8, ((C50596vj7) m70757b9).m8221v());
            }
            throw new IllegalArgumentException("Function name for apply is undefined");
        }
        throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", m70757b9.getClass().getCanonicalName()));
    }
}
