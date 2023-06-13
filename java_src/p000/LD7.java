package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* renamed from: LD7 */
/* loaded from: classes5.dex */
public final class LD7 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static InterfaceC37164Xs7 m97518a(String str, C50596vj7 c50596vj7, C38159am8 c38159am8, List list) {
        String str2;
        char c;
        String str3;
        double d;
        double min;
        AbstractC40557en7 abstractC40557en7;
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c = 0;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    c = 2;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c = 3;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    str2 = "toString";
                    c = 1;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            default:
                str2 = "toString";
                c = 65535;
                break;
        }
        double d2 = 0.0d;
        switch (c) {
            case 0:
                InterfaceC37164Xs7 zzd = c50596vj7.zzd();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC37164Xs7 m70757b = c38159am8.m70757b((InterfaceC37164Xs7) it.next());
                        if (!(m70757b instanceof C45874nl7)) {
                            C50596vj7 c50596vj72 = (C50596vj7) zzd;
                            int m8225f = c50596vj72.m8225f();
                            if (m70757b instanceof C50596vj7) {
                                C50596vj7 c50596vj73 = (C50596vj7) m70757b;
                                Iterator m8222u = c50596vj73.m8222u();
                                while (m8222u.hasNext()) {
                                    Integer num = (Integer) m8222u.next();
                                    c50596vj72.m8217z(num.intValue() + m8225f, c50596vj73.m8224h(num.intValue()));
                                }
                            } else {
                                c50596vj72.m8217z(m8225f, m70757b);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                }
                return zzd;
            case 1:
                C38822bt8.m62176h("every", 1, list);
                InterfaceC37164Xs7 m70757b2 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                if (m70757b2 instanceof C42386hs7) {
                    if (c50596vj7.m8225f() != 0 && m97517b(c50596vj7, c38159am8, (C42386hs7) m70757b2, Boolean.FALSE, Boolean.TRUE).m8225f() != c50596vj7.m8225f()) {
                        return InterfaceC37164Xs7.f44131n0;
                    }
                    return InterfaceC37164Xs7.f44130m0;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 2:
                C38822bt8.m62176h("filter", 1, list);
                InterfaceC37164Xs7 m70757b3 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                if (m70757b3 instanceof C42386hs7) {
                    if (c50596vj7.m8226e() == 0) {
                        return new C50596vj7();
                    }
                    InterfaceC37164Xs7 zzd2 = c50596vj7.zzd();
                    C50596vj7 m97517b = m97517b(c50596vj7, c38159am8, (C42386hs7) m70757b3, null, Boolean.TRUE);
                    C50596vj7 c50596vj74 = new C50596vj7();
                    Iterator m8222u2 = m97517b.m8222u();
                    while (m8222u2.hasNext()) {
                        c50596vj74.m8217z(c50596vj74.m8225f(), ((C50596vj7) zzd2).m8224h(((Integer) m8222u2.next()).intValue()));
                    }
                    return c50596vj74;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 3:
                C38822bt8.m62176h("forEach", 1, list);
                InterfaceC37164Xs7 m70757b4 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                if (m70757b4 instanceof C42386hs7) {
                    if (c50596vj7.m8226e() == 0) {
                        return InterfaceC37164Xs7.f44125h0;
                    }
                    m97517b(c50596vj7, c38159am8, (C42386hs7) m70757b4, null, null);
                    return InterfaceC37164Xs7.f44125h0;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 4:
                C38822bt8.m62174j("indexOf", 2, list);
                InterfaceC37164Xs7 interfaceC37164Xs7 = InterfaceC37164Xs7.f44125h0;
                if (!list.isEmpty()) {
                    interfaceC37164Xs7 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                }
                if (list.size() > 1) {
                    double m62183a = C38822bt8.m62183a(c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzh().doubleValue());
                    if (m62183a >= c50596vj7.m8225f()) {
                        return new C44105km7(Double.valueOf(-1.0d));
                    }
                    d2 = m62183a < 0.0d ? c50596vj7.m8225f() + m62183a : m62183a;
                }
                Iterator m8222u3 = c50596vj7.m8222u();
                while (m8222u3.hasNext()) {
                    int intValue = ((Integer) m8222u3.next()).intValue();
                    double d3 = intValue;
                    if (d3 >= d2 && C38822bt8.m62172l(c50596vj7.m8224h(intValue), interfaceC37164Xs7)) {
                        return new C44105km7(Double.valueOf(d3));
                    }
                }
                return new C44105km7(Double.valueOf(-1.0d));
            case 5:
                C38822bt8.m62174j("join", 1, list);
                if (c50596vj7.m8225f() == 0) {
                    return InterfaceC37164Xs7.f44132o0;
                }
                if (list.isEmpty()) {
                    str3 = ",";
                } else {
                    InterfaceC37164Xs7 m70757b5 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                    str3 = ((m70757b5 instanceof C47713qr7) || (m70757b5 instanceof C37200Xw7)) ? "" : m70757b5.zzi();
                }
                return new C43019iw7(c50596vj7.m8223s(str3));
            case 6:
                C38822bt8.m62174j("lastIndexOf", 2, list);
                InterfaceC37164Xs7 interfaceC37164Xs72 = InterfaceC37164Xs7.f44125h0;
                if (!list.isEmpty()) {
                    interfaceC37164Xs72 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                }
                int m8225f2 = c50596vj7.m8225f() - 1;
                if (list.size() > 1) {
                    InterfaceC37164Xs7 m70757b6 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1));
                    d = Double.isNaN(m70757b6.zzh().doubleValue()) ? c50596vj7.m8225f() - 1 : C38822bt8.m62183a(m70757b6.zzh().doubleValue());
                    if (d < 0.0d) {
                        d += c50596vj7.m8225f();
                    }
                } else {
                    d = m8225f2;
                }
                if (d < 0.0d) {
                    return new C44105km7(Double.valueOf(-1.0d));
                }
                for (int min2 = (int) Math.min(c50596vj7.m8225f(), d); min2 >= 0; min2--) {
                    if (c50596vj7.m8227A(min2) && C38822bt8.m62172l(c50596vj7.m8224h(min2), interfaceC37164Xs72)) {
                        return new C44105km7(Double.valueOf(min2));
                    }
                }
                return new C44105km7(Double.valueOf(-1.0d));
            case 7:
                C38822bt8.m62176h("map", 1, list);
                InterfaceC37164Xs7 m70757b7 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                if (m70757b7 instanceof C42386hs7) {
                    if (c50596vj7.m8225f() == 0) {
                        return new C50596vj7();
                    }
                    return m97517b(c50596vj7, c38159am8, (C42386hs7) m70757b7, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\b':
                C38822bt8.m62176h("pop", 0, list);
                int m8225f3 = c50596vj7.m8225f();
                if (m8225f3 == 0) {
                    return InterfaceC37164Xs7.f44125h0;
                }
                int i = m8225f3 - 1;
                InterfaceC37164Xs7 m8224h = c50596vj7.m8224h(i);
                c50596vj7.m8218y(i);
                return m8224h;
            case '\t':
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        c50596vj7.m8217z(c50596vj7.m8225f(), c38159am8.m70757b((InterfaceC37164Xs7) it2.next()));
                    }
                }
                return new C44105km7(Double.valueOf(c50596vj7.m8225f()));
            case '\n':
                return m97516c(c50596vj7, c38159am8, list, true);
            case 11:
                return m97516c(c50596vj7, c38159am8, list, false);
            case '\f':
                C38822bt8.m62176h("reverse", 0, list);
                int m8225f4 = c50596vj7.m8225f();
                if (m8225f4 != 0) {
                    for (int i2 = 0; i2 < m8225f4 / 2; i2++) {
                        if (c50596vj7.m8227A(i2)) {
                            InterfaceC37164Xs7 m8224h2 = c50596vj7.m8224h(i2);
                            c50596vj7.m8217z(i2, null);
                            int i3 = (m8225f4 - 1) - i2;
                            if (c50596vj7.m8227A(i3)) {
                                c50596vj7.m8217z(i2, c50596vj7.m8224h(i3));
                            }
                            c50596vj7.m8217z(i3, m8224h2);
                        }
                    }
                }
                return c50596vj7;
            case '\r':
                C38822bt8.m62176h("shift", 0, list);
                if (c50596vj7.m8225f() == 0) {
                    return InterfaceC37164Xs7.f44125h0;
                }
                InterfaceC37164Xs7 m8224h3 = c50596vj7.m8224h(0);
                c50596vj7.m8218y(0);
                return m8224h3;
            case 14:
                C38822bt8.m62174j("slice", 2, list);
                if (list.isEmpty()) {
                    return c50596vj7.zzd();
                }
                double m8225f5 = c50596vj7.m8225f();
                double m62183a2 = C38822bt8.m62183a(c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzh().doubleValue());
                if (m62183a2 < 0.0d) {
                    min = Math.max(m62183a2 + m8225f5, 0.0d);
                } else {
                    min = Math.min(m62183a2, m8225f5);
                }
                if (list.size() == 2) {
                    double m62183a3 = C38822bt8.m62183a(c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzh().doubleValue());
                    if (m62183a3 < 0.0d) {
                        m8225f5 = Math.max(m8225f5 + m62183a3, 0.0d);
                    } else {
                        m8225f5 = Math.min(m8225f5, m62183a3);
                    }
                }
                C50596vj7 c50596vj75 = new C50596vj7();
                for (int i4 = (int) min; i4 < m8225f5; i4++) {
                    c50596vj75.m8217z(c50596vj75.m8225f(), c50596vj7.m8224h(i4));
                }
                return c50596vj75;
            case 15:
                C38822bt8.m62176h("some", 1, list);
                InterfaceC37164Xs7 m70757b8 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                if (m70757b8 instanceof AbstractC40557en7) {
                    if (c50596vj7.m8225f() == 0) {
                        return InterfaceC37164Xs7.f44131n0;
                    }
                    AbstractC40557en7 abstractC40557en72 = (AbstractC40557en7) m70757b8;
                    Iterator m8222u4 = c50596vj7.m8222u();
                    while (m8222u4.hasNext()) {
                        int intValue2 = ((Integer) m8222u4.next()).intValue();
                        if (c50596vj7.m8227A(intValue2) && abstractC40557en72.mo4521d(c38159am8, Arrays.asList(c50596vj7.m8224h(intValue2), new C44105km7(Double.valueOf(intValue2)), c50596vj7)).zzg().booleanValue()) {
                            return InterfaceC37164Xs7.f44130m0;
                        }
                    }
                    return InterfaceC37164Xs7.f44131n0;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 16:
                C38822bt8.m62174j("sort", 1, list);
                if (c50596vj7.m8225f() >= 2) {
                    List<InterfaceC37164Xs7> m8221v = c50596vj7.m8221v();
                    if (list.isEmpty()) {
                        abstractC40557en7 = null;
                    } else {
                        InterfaceC37164Xs7 m70757b9 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
                        if (m70757b9 instanceof AbstractC40557en7) {
                            abstractC40557en7 = (AbstractC40557en7) m70757b9;
                        } else {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                    }
                    Collections.sort(m8221v, new WC7(abstractC40557en7, c38159am8));
                    c50596vj7.m8220w();
                    int i5 = 0;
                    for (InterfaceC37164Xs7 interfaceC37164Xs73 : m8221v) {
                        c50596vj7.m8217z(i5, interfaceC37164Xs73);
                        i5++;
                    }
                }
                return c50596vj7;
            case 17:
                if (list.isEmpty()) {
                    return new C50596vj7();
                }
                int m62183a4 = (int) C38822bt8.m62183a(c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzh().doubleValue());
                if (m62183a4 < 0) {
                    m62183a4 = Math.max(0, m62183a4 + c50596vj7.m8225f());
                } else if (m62183a4 > c50596vj7.m8225f()) {
                    m62183a4 = c50596vj7.m8225f();
                }
                int m8225f6 = c50596vj7.m8225f();
                C50596vj7 c50596vj76 = new C50596vj7();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) C38822bt8.m62183a(c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzh().doubleValue()));
                    if (max > 0) {
                        for (int i6 = m62183a4; i6 < Math.min(m8225f6, m62183a4 + max); i6++) {
                            c50596vj76.m8217z(c50596vj76.m8225f(), c50596vj7.m8224h(m62183a4));
                            c50596vj7.m8218y(m62183a4);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i7 = 2; i7 < list.size(); i7++) {
                            InterfaceC37164Xs7 m70757b10 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(i7));
                            if (!(m70757b10 instanceof C45874nl7)) {
                                c50596vj7.m8219x((m62183a4 + i7) - 2, m70757b10);
                            } else {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                        }
                    }
                } else {
                    while (m62183a4 < m8225f6) {
                        c50596vj76.m8217z(c50596vj76.m8225f(), c50596vj7.m8224h(m62183a4));
                        c50596vj7.m8217z(m62183a4, null);
                        m62183a4++;
                    }
                }
                return c50596vj76;
            case 18:
                C38822bt8.m62176h(str2, 0, list);
                return new C43019iw7(c50596vj7.m8223s(","));
            case 19:
                if (!list.isEmpty()) {
                    C50596vj7 c50596vj77 = new C50596vj7();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        InterfaceC37164Xs7 m70757b11 = c38159am8.m70757b((InterfaceC37164Xs7) it3.next());
                        if (!(m70757b11 instanceof C45874nl7)) {
                            c50596vj77.m8217z(c50596vj77.m8225f(), m70757b11);
                        } else {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                    }
                    int m8225f7 = c50596vj77.m8225f();
                    Iterator m8222u5 = c50596vj7.m8222u();
                    while (m8222u5.hasNext()) {
                        Integer num2 = (Integer) m8222u5.next();
                        c50596vj77.m8217z(num2.intValue() + m8225f7, c50596vj7.m8224h(num2.intValue()));
                    }
                    c50596vj7.m8220w();
                    Iterator m8222u6 = c50596vj77.m8222u();
                    while (m8222u6.hasNext()) {
                        Integer num3 = (Integer) m8222u6.next();
                        c50596vj7.m8217z(num3.intValue(), c50596vj77.m8224h(num3.intValue()));
                    }
                }
                return new C44105km7(Double.valueOf(c50596vj7.m8225f()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    /* renamed from: b */
    public static C50596vj7 m97517b(C50596vj7 c50596vj7, C38159am8 c38159am8, AbstractC40557en7 abstractC40557en7, Boolean bool, Boolean bool2) {
        C50596vj7 c50596vj72 = new C50596vj7();
        Iterator m8222u = c50596vj7.m8222u();
        while (m8222u.hasNext()) {
            int intValue = ((Integer) m8222u.next()).intValue();
            if (c50596vj7.m8227A(intValue)) {
                InterfaceC37164Xs7 mo4521d = abstractC40557en7.mo4521d(c38159am8, Arrays.asList(c50596vj7.m8224h(intValue), new C44105km7(Double.valueOf(intValue)), c50596vj7));
                if (mo4521d.zzg().equals(bool)) {
                    return c50596vj72;
                }
                if (bool2 == null || mo4521d.zzg().equals(bool2)) {
                    c50596vj72.m8217z(intValue, mo4521d);
                }
            }
        }
        return c50596vj72;
    }

    /* renamed from: c */
    public static InterfaceC37164Xs7 m97516c(C50596vj7 c50596vj7, C38159am8 c38159am8, List list, boolean z) {
        InterfaceC37164Xs7 interfaceC37164Xs7;
        int i;
        int i2;
        C38822bt8.m62175i("reduce", 1, list);
        C38822bt8.m62174j("reduce", 2, list);
        InterfaceC37164Xs7 m70757b = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
        if (m70757b instanceof AbstractC40557en7) {
            if (list.size() == 2) {
                interfaceC37164Xs7 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1));
                if (interfaceC37164Xs7 instanceof C45874nl7) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (c50596vj7.m8225f() != 0) {
                interfaceC37164Xs7 = null;
            } else {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            AbstractC40557en7 abstractC40557en7 = (AbstractC40557en7) m70757b;
            int m8225f = c50596vj7.m8225f();
            if (z) {
                i = 0;
            } else {
                i = m8225f - 1;
            }
            int i3 = -1;
            if (z) {
                i2 = m8225f - 1;
            } else {
                i2 = 0;
            }
            if (true == z) {
                i3 = 1;
            }
            if (interfaceC37164Xs7 == null) {
                interfaceC37164Xs7 = c50596vj7.m8224h(i);
                i += i3;
            }
            while ((i2 - i) * i3 >= 0) {
                if (!c50596vj7.m8227A(i)) {
                    i += i3;
                } else {
                    interfaceC37164Xs7 = abstractC40557en7.mo4521d(c38159am8, Arrays.asList(interfaceC37164Xs7, c50596vj7.m8224h(i), new C44105km7(Double.valueOf(i)), c50596vj7));
                    if (!(interfaceC37164Xs7 instanceof C45874nl7)) {
                        i += i3;
                    } else {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                }
            }
            return interfaceC37164Xs7;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }
}
