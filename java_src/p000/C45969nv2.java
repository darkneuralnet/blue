package p000;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.IOException;
import java.util.Map;
import java.util.ResourceBundle;
import kotlin.text.Typography;
/* renamed from: nv2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45969nv2 extends AbstractC29352v1 {

    /* renamed from: b */
    public static final C45969nv2 f101082b = new C45969nv2(C51663xX5.m5042g(ResourceBundle.getBundle(C45969nv2.class.getPackage().getName() + ".messages")));

    /* renamed from: a */
    public final transient C51663xX5 f101083a;

    public C45969nv2(C51663xX5 c51663xX5) {
        this.f101083a = c51663xX5;
    }

    /* renamed from: f */
    public static C45969nv2 m22169f() {
        return f101082b;
    }

    @Override // p000.AbstractC29352v1
    /* renamed from: a */
    public Appendable mo9385a(InterfaceC35858Sd6<?> interfaceC35858Sd6, Appendable appendable) throws IOException {
        if (!(interfaceC35858Sd6 instanceof AbstractC28986u1)) {
            return appendable.append(interfaceC35858Sd6.toString());
        }
        m22170e(interfaceC35858Sd6, appendable);
        return appendable;
    }

    /* renamed from: d */
    public final void m22171d(InterfaceC35858Sd6<?> interfaceC35858Sd6, int i, int i2, boolean z, Appendable appendable) throws IOException {
        if (z) {
            appendable.append(Typography.middleDot);
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (m22170e(interfaceC35858Sd6, stringBuffer) < 2) {
            stringBuffer.insert(0, CoreConstants.LEFT_PARENTHESIS_CHAR);
            stringBuffer.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        appendable.append(stringBuffer);
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
                appendable.append("^");
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

    /* renamed from: e */
    public final int m22170e(InterfaceC35858Sd6<?> interfaceC35858Sd6, Appendable appendable) throws IOException {
        if (interfaceC35858Sd6 instanceof C2395Ff) {
            interfaceC35858Sd6 = ((C2395Ff) interfaceC35858Sd6).m106768L();
        }
        CharSequence m5045d = this.f101083a.m5045d((AbstractC28986u1) interfaceC35858Sd6);
        if (m5045d != null) {
            appendable.append(m5045d);
            return Integer.MAX_VALUE;
        } else if ((interfaceC35858Sd6 instanceof C47276q74) && interfaceC35858Sd6.mo3803l() != null) {
            Map<? extends InterfaceC35858Sd6<?>, Integer> mo3803l = interfaceC35858Sd6.mo3803l();
            int i = 0;
            boolean z = true;
            for (Map.Entry<? extends InterfaceC35858Sd6<?>, Integer> entry : mo3803l.entrySet()) {
                int intValue = entry.getValue().intValue();
                if (intValue >= 0) {
                    m22171d(entry.getKey(), intValue, 1, !z, appendable);
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
                        m22171d(entry2.getKey(), -intValue2, 1, !z2, appendable);
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
        } else if (interfaceC35858Sd6 instanceof C30495yE) {
            appendable.append(((C30495yE) interfaceC35858Sd6).mo11086a());
            return Integer.MAX_VALUE;
        } else if (interfaceC35858Sd6 instanceof C8569V9) {
            appendable.append(interfaceC35858Sd6.mo11086a());
            return Integer.MAX_VALUE;
        } else {
            StringBuilder sb = new StringBuilder();
            InterfaceC35858Sd6<?> mo11089G = interfaceC35858Sd6.mo11089G();
            InterfaceC38077ae6 mo3804b0 = ((AbstractC28986u1) interfaceC35858Sd6).mo3804b0();
            if (C42838ie6.f87672h.equals(mo11089G)) {
                mo11089G = C42838ie6.f87676l;
                if (interfaceC35858Sd6.equals(mo11089G)) {
                    appendable.append(this.f101083a.m5045d(mo11089G));
                    return Integer.MAX_VALUE;
                }
                mo3804b0 = interfaceC35858Sd6 instanceof B96 ? ((B96) interfaceC35858Sd6).m114319L() : interfaceC35858Sd6.mo11076k(mo11089G);
            } else if (C42838ie6.f87658L.equals(mo11089G) && mo3804b0 != null) {
                mo11089G = C42838ie6.f87667U;
            }
            if (interfaceC35858Sd6 instanceof B96) {
                B96 b96 = (B96) interfaceC35858Sd6;
                if (mo11089G == null) {
                    mo11089G = b96.m114318M();
                }
                mo3804b0 = b96.m114319L();
            }
            int m10690e = C49682uB0.m10690e(mo3804b0, !mo11089G.equals(AbstractC28986u1.f111479d), m22170e(mo11089G, sb), sb, this.f101083a);
            appendable.append(sb);
            return m10690e;
        }
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
