package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.text.Typography;
/* renamed from: bB5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC38404bB5 extends AbstractC29352v1 {

    /* renamed from: a */
    public static final InterfaceC35858Sd6<?>[] f57043a = {C42838ie6.f87669e, C42838ie6.f87651E, C42838ie6.f87670f, C42838ie6.f87684t, C42838ie6.f87686v, C42838ie6.f87652F, C42838ie6.f87647A, C42838ie6.f87679o, C42838ie6.f87682r, C42838ie6.f87654H, C42838ie6.f87671g, C42838ie6.f87649C, C42838ie6.f87650D, C42838ie6.f87673i, C42838ie6.f87674j, C42838ie6.f87680p, C42838ie6.f87687w, C42838ie6.f87681q, C42838ie6.f87677m, C42838ie6.f87675k, C42838ie6.f87688x, C42838ie6.f87653G, C42838ie6.f87678n, C42838ie6.f87690z, C42838ie6.f87685u, C42838ie6.f87683s, C42838ie6.f87689y};

    /* renamed from: b */
    public static final String[] f57044b = (String[]) ((List) Stream.of((Object[]) EnumC37979aU2.values()).map(new Function() { // from class: XA5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((EnumC37979aU2) obj).mo71321a();
        }
    }).collect(Collectors.toList())).toArray(new String[0]);

    /* renamed from: c */
    public static final InterfaceC38077ae6[] f57045c = (InterfaceC38077ae6[]) ((List) Stream.of((Object[]) EnumC37979aU2.values()).map(new Function() { // from class: YA5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return InterfaceC44546lX2.m27176w0((EnumC37979aU2) obj);
        }
    }).collect(Collectors.toList())).toArray(new InterfaceC38077ae6[0]);

    /* renamed from: d */
    public static final String[] f57046d = (String[]) ((List) Stream.of((Object[]) EnumC8246UG.values()).map(new Function() { // from class: ZA5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((EnumC8246UG) obj).mo71321a();
        }
    }).collect(Collectors.toList())).toArray(new String[0]);

    /* renamed from: e */
    public static final InterfaceC38077ae6[] f57047e = (InterfaceC38077ae6[]) ((List) Stream.of((Object[]) EnumC8246UG.values()).map(new Function() { // from class: aB5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return InterfaceC44546lX2.m27176w0((EnumC8246UG) obj);
        }
    }).collect(Collectors.toList())).toArray(new InterfaceC38077ae6[0]);

    /* renamed from: f */
    public static final C12318c f57048f = new C12318c();

    /* renamed from: g */
    public static final C12317b f57049g = new C12317b();

    /* renamed from: h */
    public static final Map<String, InterfaceC35858Sd6<?>> f57050h = new HashMap();

    /* renamed from: bB5$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C12316a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57051a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f57052b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f57053c;

        static {
            int[] iArr = new int[EnumC37979aU2.values().length];
            f57053c = iArr;
            try {
                iArr[EnumC37979aU2.KILO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57053c[EnumC37979aU2.MICRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[C12318c.EnumC12319a.values().length];
            f57052b = iArr2;
            try {
                iArr2[C12318c.EnumC12319a.IDENTIFIER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57052b[C12318c.EnumC12319a.OPEN_PAREN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57052b[C12318c.EnumC12319a.EXPONENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57052b[C12318c.EnumC12319a.MULTIPLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57052b[C12318c.EnumC12319a.DIVIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57052b[C12318c.EnumC12319a.PLUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f57052b[C12318c.EnumC12319a.EOF.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f57052b[C12318c.EnumC12319a.CLOSE_PAREN.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[EnumC12320d.values().length];
            f57051a = iArr3;
            try {
                iArr3[EnumC12320d.ASCII.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* renamed from: bB5$b */
    /* loaded from: classes8.dex */
    public static final class C12317b extends C12318c {
        @Override // p000.AbstractC38404bB5.C12318c, p000.AbstractC29352v1
        /* renamed from: a */
        public Appendable mo9385a(InterfaceC35858Sd6<?> interfaceC35858Sd6, Appendable appendable) throws IOException {
            String mo64866s = mo64866s(interfaceC35858Sd6);
            if (mo64866s != null) {
                return appendable.append(mo64866s);
            }
            if (interfaceC35858Sd6 instanceof C47276q74) {
                C47276q74 c47276q74 = (C47276q74) interfaceC35858Sd6;
                for (int i = 0; i < c47276q74.m18101T(); i++) {
                    if (i != 0) {
                        appendable.append('*');
                    }
                    String mo64866s2 = mo64866s(c47276q74.m18102R(i));
                    int m18100U = c47276q74.m18100U(i);
                    int m18099W = c47276q74.m18099W(i);
                    appendable.append(mo64866s2);
                    if (m18100U != 1 || m18099W != 1) {
                        appendable.append('^');
                        appendable.append(String.valueOf(m18100U));
                        if (m18099W != 1) {
                            appendable.append(CoreConstants.COLON_CHAR);
                            appendable.append(String.valueOf(m18099W));
                        }
                    }
                }
                return appendable;
            }
            throw new IllegalArgumentException("Cannot format given Object as a Unit");
        }

        @Override // p000.AbstractC38404bB5.C12318c
        /* renamed from: r */
        public boolean mo64867r(String str) {
            if (str == null || str.length() == 0 || !C12318c.m64868q(str.charAt(0)) || !AbstractC38404bB5.m64872m(str)) {
                return false;
            }
            return true;
        }

        @Override // p000.AbstractC38404bB5.C12318c
        /* renamed from: s */
        public String mo64866s(InterfaceC35858Sd6<?> interfaceC35858Sd6) {
            String str = this.f57055j.get(interfaceC35858Sd6);
            if (str != null) {
                return str;
            }
            return AbstractC38404bB5.f57048f.mo64866s(interfaceC35858Sd6);
        }

        @Override // p000.AbstractC38404bB5.C12318c
        public String toString() {
            return "SimpleUnitFormat - ASCII";
        }
    }

    /* renamed from: bB5$c */
    /* loaded from: classes8.dex */
    public static class C12318c extends AbstractC38404bB5 {

        /* renamed from: i */
        public final Map<String, InterfaceC35858Sd6<?>> f57054i = new HashMap();

        /* renamed from: j */
        public final Map<InterfaceC35858Sd6<?>, String> f57055j = new HashMap();

        /* renamed from: bB5$c$a */
        /* loaded from: classes8.dex */
        public enum EnumC12319a {
            EOF,
            IDENTIFIER,
            OPEN_PAREN,
            CLOSE_PAREN,
            EXPONENT,
            MULTIPLY,
            DIVIDE,
            PLUS,
            INTEGER,
            FLOAT
        }

        /* renamed from: p */
        public static void m64869p(Appendable appendable, CharSequence charSequence, int i, int i2) throws IOException {
            appendable.append(charSequence);
            if (i != 1 || i2 != 1) {
                if (i == 2 && i2 == 1) {
                    appendable.append((char) 178);
                } else if (i == 3 && i2 == 1) {
                    appendable.append((char) 179);
                } else {
                    appendable.append('^');
                    appendable.append(String.valueOf(i));
                    if (i2 != 1) {
                        appendable.append(CoreConstants.COLON_CHAR);
                        appendable.append(String.valueOf(i2));
                    }
                }
            }
        }

        /* renamed from: q */
        public static boolean m64868q(char c) {
            if (!Character.isLetter(c) && (Character.isWhitespace(c) || Character.isDigit(c) || c == 183 || c == '*' || c == '/' || c == '(' || c == ')' || c == '[' || c == ']' || c == 185 || c == 178 || c == 179 || c == '^' || c == '+' || c == '-')) {
                return false;
            }
            return true;
        }

        @Override // p000.AbstractC29352v1
        /* renamed from: a */
        public Appendable mo9385a(InterfaceC35858Sd6<?> interfaceC35858Sd6, Appendable appendable) throws IOException {
            String mo64866s = mo64866s(interfaceC35858Sd6);
            if (mo64866s != null) {
                return appendable.append(mo64866s);
            }
            if (interfaceC35858Sd6 instanceof C47276q74) {
                C47276q74 c47276q74 = (C47276q74) interfaceC35858Sd6;
                if (c47276q74.m18101T() == 1 && (c47276q74.m18102R(0) instanceof C47276q74)) {
                    C47276q74 c47276q742 = (C47276q74) c47276q74.m18102R(0);
                    if (mo64866s(c47276q742) == null) {
                        return mo9385a(C47276q74.m18098Y(c47276q742, c47276q74.m18100U(0)), appendable);
                    }
                }
                int i = 0;
                boolean z = true;
                for (int i2 = 0; i2 < c47276q74.m18101T(); i2++) {
                    int m18100U = c47276q74.m18100U(i2);
                    if (m18100U >= 0) {
                        if (!z) {
                            appendable.append(Typography.middleDot);
                        }
                        m64869p(appendable, mo64866s(c47276q74.m18102R(i2)), m18100U, c47276q74.m18099W(i2));
                        z = false;
                    } else {
                        i++;
                    }
                }
                if (i != 0) {
                    if (z) {
                        appendable.append('1');
                    }
                    appendable.append(JsonPointer.SEPARATOR);
                    if (i > 1) {
                        appendable.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
                    }
                    boolean z2 = true;
                    for (int i3 = 0; i3 < c47276q74.m18101T(); i3++) {
                        int m18100U2 = c47276q74.m18100U(i3);
                        if (m18100U2 < 0) {
                            String mo64866s2 = mo64866s(c47276q74.m18102R(i3));
                            int m18099W = c47276q74.m18099W(i3);
                            if (!z2) {
                                appendable.append(Typography.middleDot);
                            }
                            m64869p(appendable, mo64866s2, -m18100U2, m18099W);
                            z2 = false;
                        }
                    }
                    if (i > 1) {
                        appendable.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                    }
                }
                return appendable;
            }
            throw new IllegalArgumentException("Cannot format given Object as a Unit");
        }

        @Override // p000.AbstractC38404bB5
        /* renamed from: n */
        public void mo64871n(InterfaceC35858Sd6<?> interfaceC35858Sd6, String str) {
            if (mo64867r(str)) {
                synchronized (this) {
                    this.f57054i.put(str, interfaceC35858Sd6);
                    this.f57055j.put(interfaceC35858Sd6, str);
                }
                return;
            }
            throw new IllegalArgumentException("Label: " + str + " is not a valid identifier.");
        }

        /* renamed from: o */
        public void m64870o(InterfaceC35858Sd6<?> interfaceC35858Sd6, String str) {
            if (mo64867r(str)) {
                synchronized (this) {
                    this.f57054i.put(str, interfaceC35858Sd6);
                }
                return;
            }
            throw new IllegalArgumentException("Alias: " + str + " is not a valid identifier.");
        }

        /* renamed from: r */
        public boolean mo64867r(String str) {
            if (str == null || str.length() == 0) {
                return false;
            }
            return m64868q(str.charAt(0));
        }

        /* renamed from: s */
        public String mo64866s(InterfaceC35858Sd6<?> interfaceC35858Sd6) {
            String str = this.f57055j.get(interfaceC35858Sd6);
            if (str != null) {
                return str;
            }
            if (interfaceC35858Sd6 instanceof C30495yE) {
                return ((C30495yE) interfaceC35858Sd6).mo11086a();
            }
            if (interfaceC35858Sd6 instanceof C8569V9) {
                return ((C8569V9) interfaceC35858Sd6).mo11086a();
            }
            if (interfaceC35858Sd6 instanceof B96) {
                B96 b96 = (B96) interfaceC35858Sd6;
                if (b96.mo11086a() != null) {
                    return b96.mo11086a();
                }
                InterfaceC35858Sd6 m114318M = b96.m114318M();
                InterfaceC38077ae6 m114319L = b96.m114319L();
                StringBuilder sb = new StringBuilder();
                String interfaceC35858Sd62 = m114318M.toString();
                String m64865t = m64865t(m114319L);
                if (interfaceC35858Sd62.indexOf(183) < 0 && interfaceC35858Sd62.indexOf(42) < 0 && interfaceC35858Sd62.indexOf(47) < 0) {
                    sb.append(interfaceC35858Sd62);
                } else {
                    sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
                    sb.append(interfaceC35858Sd62);
                    sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                }
                if (m64865t != null) {
                    sb.insert(0, m64865t);
                } else if (m114319L instanceof C26407n7) {
                    sb.append('+');
                    sb.append(((C26407n7) m114319L).m24321k());
                } else if (m114319L instanceof InterfaceC44546lX2) {
                    Number m27180Y2 = ((InterfaceC44546lX2) m114319L).m27180Y2();
                    if (m27180Y2 instanceof C47670qn4) {
                        C47670qn4 m17056q = ((C47670qn4) m27180Y2).m17056q();
                        if (m17056q.m17066g()) {
                            sb.append(JsonPointer.SEPARATOR);
                            sb.append(m17056q.toString());
                        } else {
                            sb.append('*');
                            sb.append(m27180Y2);
                        }
                    } else {
                        sb.append('*');
                        sb.append(m27180Y2);
                    }
                } else {
                    return "[" + m114318M + "?]";
                }
                return sb.toString();
            } else if (interfaceC35858Sd6 instanceof C2395Ff) {
                C2395Ff c2395Ff = (C2395Ff) interfaceC35858Sd6;
                StringBuilder sb2 = new StringBuilder(mo64866s(c2395Ff.m106768L()));
                if (c2395Ff.m106767M() != null) {
                    sb2.append(CoreConstants.CURLY_LEFT);
                    sb2.append(c2395Ff.m106767M());
                    sb2.append(CoreConstants.CURLY_RIGHT);
                }
                return sb2.toString();
            } else {
                return null;
            }
        }

        /* renamed from: t */
        public String m64865t(InterfaceC38077ae6 interfaceC38077ae6) {
            for (int i = 0; i < AbstractC38404bB5.f57045c.length; i++) {
                if (AbstractC38404bB5.f57045c[i].equals(interfaceC38077ae6)) {
                    return AbstractC38404bB5.f57044b[i];
                }
            }
            for (int i2 = 0; i2 < AbstractC38404bB5.f57047e.length; i2++) {
                if (AbstractC38404bB5.f57047e[i2].equals(interfaceC38077ae6)) {
                    return AbstractC38404bB5.f57046d[i2];
                }
            }
            return null;
        }

        public String toString() {
            return "SimpleUnitFormat";
        }
    }

    /* renamed from: bB5$d */
    /* loaded from: classes8.dex */
    public enum EnumC12320d {
        Default,
        ASCII
    }

    static {
        EnumC37979aU2[] values;
        EnumC37979aU2 enumC37979aU2;
        String[] strArr;
        String[] strArr2;
        EnumC37979aU2[] values2;
        int i = 0;
        while (true) {
            InterfaceC35858Sd6<?>[] interfaceC35858Sd6Arr = f57043a;
            if (i >= interfaceC35858Sd6Arr.length) {
                break;
            }
            InterfaceC35858Sd6<?> interfaceC35858Sd6 = interfaceC35858Sd6Arr[i];
            String mo11086a = (interfaceC35858Sd6 instanceof C30495yE ? (C30495yE) interfaceC35858Sd6 : (C8569V9) interfaceC35858Sd6).mo11086a();
            f57048f.mo64871n(interfaceC35858Sd6, mo11086a);
            if (m64872m(mo11086a)) {
                f57049g.mo64871n(interfaceC35858Sd6, mo11086a);
            }
            int i2 = 0;
            while (true) {
                String[] strArr3 = f57044b;
                if (i2 < strArr3.length) {
                    InterfaceC35858Sd6<?> mo11082e = interfaceC35858Sd6.mo11082e(EnumC37979aU2.values()[i2]);
                    C12318c c12318c = f57048f;
                    c12318c.mo64871n(mo11082e, strArr3[i2] + mo11086a);
                    if ("µ".equals(strArr3[i2])) {
                        c12318c.mo64871n(mo11082e, "μ" + mo11086a);
                        f57049g.mo64871n(mo11082e, "micro" + m64875j(mo11086a));
                    }
                    i2++;
                }
            }
            i++;
        }
        C12317b c12317b = f57049g;
        InterfaceC35858Sd6<InterfaceC49190tM2> interfaceC35858Sd62 = C42838ie6.f87676l;
        c12317b.mo64871n(interfaceC35858Sd62, "g");
        f57048f.mo64871n(interfaceC35858Sd62, "g");
        for (EnumC37979aU2 enumC37979aU22 : EnumC37979aU2.values()) {
            int i3 = C12316a.f57053c[enumC37979aU22.ordinal()];
            if (i3 == 1) {
                C12318c c12318c2 = f57048f;
                InterfaceC35858Sd6<InterfaceC49190tM2> interfaceC35858Sd63 = C42838ie6.f87672h;
                c12318c2.mo64871n(interfaceC35858Sd63, "kg");
                f57049g.mo64871n(interfaceC35858Sd63, "kg");
            } else if (i3 != 2) {
                C12317b c12317b2 = f57049g;
                InterfaceC35858Sd6<InterfaceC49190tM2> interfaceC35858Sd64 = C42838ie6.f87676l;
                c12317b2.mo64871n(interfaceC35858Sd64.mo11082e(enumC37979aU22), enumC37979aU22.mo71321a() + "g");
                f57048f.mo64871n(interfaceC35858Sd64.mo11082e(enumC37979aU22), enumC37979aU22.mo71321a() + "g");
            } else {
                f57048f.mo64871n(C42838ie6.f87676l.mo11082e(enumC37979aU22), enumC37979aU22.mo71321a() + "g");
                f57049g.mo64871n(EnumC37979aU2.m71319c(C42838ie6.f87667U), "microg");
            }
        }
        C12318c c12318c3 = f57048f;
        InterfaceC35858Sd6<InterfaceC49190tM2> interfaceC35858Sd65 = C42838ie6.f87676l;
        InterfaceC35858Sd6<?> m71319c = EnumC37979aU2.m71319c(interfaceC35858Sd65);
        StringBuilder sb = new StringBuilder();
        sb.append(EnumC37979aU2.MICRO.mo71321a());
        sb.append("g");
        c12318c3.mo64871n(m71319c, sb.toString());
        Map<String, InterfaceC35858Sd6<?>> map = f57050h;
        map.put(enumC37979aU2.mo71321a() + "g", EnumC37979aU2.m71319c(interfaceC35858Sd65));
        map.put("μg", EnumC37979aU2.m71319c(interfaceC35858Sd65));
        map.put("μg", EnumC37979aU2.m71319c(interfaceC35858Sd65));
        InterfaceC35858Sd6<InterfaceC42200ha1> interfaceC35858Sd66 = C42838ie6.f87687w;
        c12318c3.m64870o(interfaceC35858Sd66, "Ohm");
        f57049g.mo64871n(interfaceC35858Sd66, "Ohm");
        int i4 = 0;
        while (true) {
            if (i4 >= f57044b.length) {
                break;
            }
            C12318c c12318c4 = f57048f;
            InterfaceC35858Sd6<InterfaceC42200ha1> interfaceC35858Sd67 = C42838ie6.f87687w;
            c12318c4.m64870o(interfaceC35858Sd67.mo11082e(EnumC37979aU2.values()[i4]), strArr[i4] + "Ohm");
            f57049g.mo64871n(interfaceC35858Sd67.mo11082e(EnumC37979aU2.values()[i4]), m64876i(strArr[i4]) + "Ohm");
            i4++;
        }
        C12318c c12318c5 = f57048f;
        InterfaceC35858Sd6<InterfaceC43650k06> interfaceC35858Sd68 = C42838ie6.f87648B;
        c12318c5.mo64871n(interfaceC35858Sd68, "℃");
        c12318c5.m64870o(interfaceC35858Sd68, "°C");
        f57049g.mo64871n(interfaceC35858Sd68, "Celsius");
        int i5 = 0;
        while (true) {
            if (i5 >= f57044b.length) {
                break;
            }
            C12318c c12318c6 = f57048f;
            InterfaceC35858Sd6<InterfaceC43650k06> interfaceC35858Sd69 = C42838ie6.f87648B;
            c12318c6.mo64871n(interfaceC35858Sd69.mo11082e(EnumC37979aU2.values()[i5]), strArr2[i5] + "℃");
            c12318c6.m64870o(interfaceC35858Sd69.mo11082e(EnumC37979aU2.values()[i5]), strArr2[i5] + "°C");
            f57049g.mo64871n(interfaceC35858Sd69.mo11082e(EnumC37979aU2.values()[i5]), m64876i(strArr2[i5]) + "Celsius");
            i5++;
        }
        C12318c c12318c7 = f57048f;
        c12318c7.mo64871n(C42838ie6.f87660N, "%");
        InterfaceC35858Sd6<InterfaceC43547jq2> interfaceC35858Sd610 = C42838ie6.f87673i;
        c12318c7.mo64871n(interfaceC35858Sd610, "m");
        C12317b c12317b3 = f57049g;
        c12317b3.mo64871n(interfaceC35858Sd610, "m");
        InterfaceC35858Sd6<InterfaceC41911h46> interfaceC35858Sd611 = C42838ie6.f87675k;
        c12318c7.mo64871n(interfaceC35858Sd611, "s");
        c12317b3.mo64871n(interfaceC35858Sd611, "s");
        c12318c7.mo64871n(C42838ie6.f87661O, "min");
        c12318c7.mo64871n(C42838ie6.f87662P, "h");
        InterfaceC35858Sd6<InterfaceC41911h46> interfaceC35858Sd612 = C42838ie6.f87663Q;
        c12318c7.mo64871n(interfaceC35858Sd612, "day");
        c12318c7.m64870o(interfaceC35858Sd612, DateTokenConverter.CONVERTER_KEY);
        c12318c7.mo64871n(C42838ie6.f87664R, "week");
        InterfaceC35858Sd6<InterfaceC41911h46> interfaceC35858Sd613 = C42838ie6.f87665S;
        c12318c7.mo64871n(interfaceC35858Sd613, "year");
        c12318c7.m64870o(interfaceC35858Sd613, "days365");
        InterfaceC35858Sd6<PN5> interfaceC35858Sd614 = C42838ie6.f87659M;
        c12317b3.mo64871n(interfaceC35858Sd614, "km/h");
        c12318c7.mo64871n(interfaceC35858Sd614, "km/h");
        InterfaceC35858Sd6<InterfaceC35075Ou6> interfaceC35858Sd615 = C42838ie6.f87658L;
        c12318c7.mo64871n(interfaceC35858Sd615, "㎥");
        c12317b3.mo64871n(interfaceC35858Sd615, "m3");
        InterfaceC35858Sd6<InterfaceC35075Ou6> interfaceC35858Sd616 = C42838ie6.f87667U;
        c12317b3.mo64871n(interfaceC35858Sd616, "l");
        c12318c7.mo64871n(interfaceC35858Sd616, "l");
        for (EnumC37979aU2 enumC37979aU23 : EnumC37979aU2.values()) {
            if (enumC37979aU23 == EnumC37979aU2.MICRO) {
                f57049g.mo64871n(EnumC37979aU2.m71319c(C42838ie6.f87667U), "microL");
            } else {
                f57049g.mo64871n(C42838ie6.f87667U.mo11082e(enumC37979aU23), enumC37979aU23.mo71321a() + "L");
            }
            f57048f.mo64871n(C42838ie6.f87667U.mo11082e(enumC37979aU23), enumC37979aU23.mo71321a() + "l");
        }
        C12318c c12318c8 = f57048f;
        InterfaceC35858Sd6<InterfaceC34854Nw1> interfaceC35858Sd617 = C42838ie6.f87680p;
        c12318c8.mo64871n(interfaceC35858Sd617, "N");
        C12317b c12317b4 = f57049g;
        c12317b4.mo64871n(interfaceC35858Sd617, "N");
        InterfaceC35858Sd6<InterfaceC25749le> interfaceC35858Sd618 = C42838ie6.f87677m;
        c12318c8.mo64871n(interfaceC35858Sd618, "rad");
        c12317b4.mo64871n(interfaceC35858Sd618, "rad");
        InterfaceC35858Sd6<InterfaceC37738a41> interfaceC35858Sd619 = AbstractC28986u1.f111479d;
        c12318c8.mo64871n(interfaceC35858Sd619, "one");
        c12317b4.mo64871n(interfaceC35858Sd619, "one");
    }

    /* renamed from: i */
    public static String m64876i(String str) {
        if ("µ".equals(str)) {
            return "micro";
        }
        return str;
    }

    /* renamed from: j */
    public static String m64875j(String str) {
        if ("Ω".equals(str)) {
            return "Ohm";
        }
        return str;
    }

    /* renamed from: k */
    public static AbstractC38404bB5 m64874k() {
        return m64873l(EnumC12320d.Default);
    }

    /* renamed from: l */
    public static AbstractC38404bB5 m64873l(EnumC12320d enumC12320d) {
        if (C12316a.f57051a[enumC12320d.ordinal()] != 1) {
            return f57048f;
        }
        return f57049g;
    }

    /* renamed from: m */
    public static boolean m64872m(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public abstract void mo64871n(InterfaceC35858Sd6<?> interfaceC35858Sd6, String str);
}
