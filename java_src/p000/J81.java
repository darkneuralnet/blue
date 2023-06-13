package p000;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.IOException;
import java.util.Map;
import kotlin.text.Typography;
/* renamed from: J81 */
/* loaded from: classes8.dex */
public class J81 {
    /* renamed from: a */
    public static void m101103a(InterfaceC35858Sd6<?> interfaceC35858Sd6, int i, int i2, boolean z, Appendable appendable, C51663xX5 c51663xX5) throws IOException {
        if (z) {
            appendable.append(Typography.middleDot);
        }
        StringBuilder sb = new StringBuilder();
        if (m101102b(interfaceC35858Sd6, sb, c51663xX5) < 2) {
            sb.insert(0, CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        appendable.append(sb);
        if (i2 != 1 || i != 1) {
            if (i2 == 1 && i > 1) {
                String num = Integer.toString(i);
                for (int i3 = 0; i3 < num.length(); i3++) {
                    switch (num.charAt(i3)) {
                        case '0':
                            appendable.append((char) 8304);
                            break;
                        case '1':
                            appendable.append((char) 185);
                            break;
                        case '2':
                            appendable.append((char) 178);
                            break;
                        case '3':
                            appendable.append((char) 179);
                            break;
                        case '4':
                            appendable.append((char) 8308);
                            break;
                        case '5':
                            appendable.append((char) 8309);
                            break;
                        case '6':
                            appendable.append((char) 8310);
                            break;
                        case '7':
                            appendable.append((char) 8311);
                            break;
                        case '8':
                            appendable.append((char) 8312);
                            break;
                        case '9':
                            appendable.append((char) 8313);
                            break;
                    }
                }
            } else if (i2 == 1) {
                appendable.append('^');
                appendable.append(String.valueOf(i));
            } else {
                appendable.append("^(");
                appendable.append(String.valueOf(i));
                appendable.append(JsonPointer.SEPARATOR);
                appendable.append(String.valueOf(i2));
                appendable.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
        }
    }

    /* renamed from: b */
    public static int m101102b(InterfaceC35858Sd6<?> interfaceC35858Sd6, Appendable appendable, C51663xX5 c51663xX5) throws IOException {
        if (interfaceC35858Sd6 instanceof C2395Ff) {
            interfaceC35858Sd6 = ((C2395Ff) interfaceC35858Sd6).m106768L();
        }
        String m5045d = c51663xX5.m5045d(interfaceC35858Sd6);
        if (m5045d != null) {
            return m101101c(appendable, m5045d);
        }
        if ((interfaceC35858Sd6 instanceof C47276q74) && interfaceC35858Sd6.mo3803l() != null) {
            return m101100d(interfaceC35858Sd6, appendable, c51663xX5);
        }
        if (interfaceC35858Sd6 instanceof C30495yE) {
            return m101101c(appendable, ((C30495yE) interfaceC35858Sd6).mo11086a());
        }
        if (interfaceC35858Sd6.mo11086a() != null) {
            return m101101c(appendable, interfaceC35858Sd6.mo11086a());
        }
        StringBuilder sb = new StringBuilder();
        InterfaceC35858Sd6<?> mo11089G = interfaceC35858Sd6.mo11089G();
        InterfaceC38077ae6 mo3804b0 = ((AbstractC28986u1) interfaceC35858Sd6).mo3804b0();
        if (C42838ie6.f87672h.equals(mo11089G)) {
            mo11089G = C42838ie6.f87676l;
            if (interfaceC35858Sd6.equals(mo11089G)) {
                appendable.append(c51663xX5.m5045d(mo11089G));
                return Integer.MAX_VALUE;
            }
            mo3804b0 = interfaceC35858Sd6 instanceof B96 ? ((B96) interfaceC35858Sd6).m114319L() : interfaceC35858Sd6.mo11076k(mo11089G);
        } else if (C42838ie6.f87658L.equals(mo11089G)) {
            if (mo3804b0 != null) {
                mo11089G = C42838ie6.f87667U;
            }
        } else {
            C42838ie6.f87673i.equals(mo11089G);
        }
        if (interfaceC35858Sd6 instanceof B96) {
            B96 b96 = (B96) interfaceC35858Sd6;
            if (mo11089G == null) {
                mo11089G = b96.mo11089G();
            }
            mo3804b0 = b96.m114319L();
        }
        int m10691d = C49682uB0.m10691d(mo3804b0, !mo11089G.equals(AbstractC28986u1.f111479d), m101102b(mo11089G, sb, c51663xX5), sb, c51663xX5);
        appendable.append(sb);
        return m10691d;
    }

    /* renamed from: c */
    public static int m101101c(Appendable appendable, String str) throws IOException {
        appendable.append(str);
        return Integer.MAX_VALUE;
    }

    /* renamed from: d */
    public static int m101100d(InterfaceC35858Sd6<?> interfaceC35858Sd6, Appendable appendable, C51663xX5 c51663xX5) throws IOException {
        Map<? extends InterfaceC35858Sd6<?>, Integer> mo3803l = interfaceC35858Sd6.mo3803l();
        int i = 0;
        boolean z = true;
        for (Map.Entry<? extends InterfaceC35858Sd6<?>, Integer> entry : mo3803l.entrySet()) {
            int intValue = entry.getValue().intValue();
            if (intValue >= 0) {
                m101103a(entry.getKey(), intValue, 1, !z, appendable, c51663xX5);
                z = false;
            } else {
                i++;
            }
        }
        if (i > 0) {
            if (z) {
                appendable.append('1');
            }
            appendable.append(JsonPointer.SEPARATOR);
            if (i > 1) {
                appendable.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            }
            boolean z2 = true;
            for (Map.Entry<? extends InterfaceC35858Sd6<?>, Integer> entry2 : mo3803l.entrySet()) {
                int intValue2 = entry2.getValue().intValue();
                if (intValue2 < 0) {
                    m101103a(entry2.getKey(), -intValue2, 1, !z2, appendable, c51663xX5);
                    z2 = false;
                }
            }
            if (i > 1) {
                appendable.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return 2;
            }
            return 2;
        }
        return 2;
    }
}
