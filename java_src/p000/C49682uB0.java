package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.Detail;
import com.fasterxml.jackson.core.JsonPointer;
import java.util.Formattable;
import java.util.Formatter;
import kotlin.text.Typography;
import p000.AbstractC26779o0;
/* renamed from: uB0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C49682uB0 {
    /* renamed from: a */
    public static int m10694a(C26407n7 c26407n7, boolean z, int i, StringBuilder sb) {
        if (i < 0) {
            sb.insert(0, CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        InterfaceC48754sd3 m13024c = C49060t80.m13024c();
        Number m24321k = c26407n7.m24321k();
        if (m13024c.mo13933b(m24321k, 0) < 0) {
            sb.append(Detail.EMPTY_CHAR);
            m24321k = m13024c.mo13925j(m24321k);
        } else if (z) {
            sb.append("+");
        }
        sb.append(m24321k);
        return 0;
    }

    /* renamed from: b */
    public static int m10693b(C42873ii1 c42873ii1, int i, StringBuilder sb) {
        if (i < 4) {
            sb.insert(0, CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        StringBuilder sb2 = new StringBuilder();
        double m33539k = c42873ii1.m33539k();
        if (m33539k == 2.718281828459045d) {
            sb2.append('e');
        } else {
            sb2.append((int) m33539k);
        }
        sb2.append('^');
        sb.insert(0, (CharSequence) sb2);
        return 4;
    }

    /* renamed from: c */
    public static int m10692c(C44803lx2 c44803lx2, StringBuilder sb) {
        double m26605k = c44803lx2.m26605k();
        StringBuilder sb2 = new StringBuilder();
        if (m26605k == 2.718281828459045d) {
            sb2.append("ln");
        } else {
            sb2.append("log");
            if (m26605k != 10.0d) {
                sb2.append((int) m26605k);
            }
        }
        sb2.append("(");
        sb.insert(0, (CharSequence) sb2);
        sb.append(")");
        return 4;
    }

    /* renamed from: d */
    public static int m10691d(InterfaceC38077ae6 interfaceC38077ae6, boolean z, int i, StringBuilder sb, C51663xX5 c51663xX5) {
        if (interfaceC38077ae6 instanceof C26407n7) {
            return m10694a((C26407n7) interfaceC38077ae6, z, i, sb);
        }
        if (interfaceC38077ae6 instanceof C44803lx2) {
            return m10692c((C44803lx2) interfaceC38077ae6, sb);
        }
        if (interfaceC38077ae6 instanceof C42873ii1) {
            return m10693b((C42873ii1) interfaceC38077ae6, i, sb);
        }
        if ((interfaceC38077ae6 instanceof InterfaceC44546lX2) && !(interfaceC38077ae6 instanceof UY3)) {
            return m10687h((InterfaceC44546lX2) interfaceC38077ae6, z, i, sb);
        }
        if (interfaceC38077ae6 instanceof UY3) {
            WZ3 m5047b = c51663xX5.m5047b(interfaceC38077ae6);
            if (m5047b != null && i == Integer.MAX_VALUE) {
                return m10688g(sb, c51663xX5, m5047b);
            }
            return m10686i((UY3) interfaceC38077ae6, z, i, sb);
        } else if (interfaceC38077ae6 instanceof AbstractC26779o0.C26782c) {
            AbstractC26779o0.C26782c c26782c = (AbstractC26779o0.C26782c) interfaceC38077ae6;
            if (c26782c.m22021m() == AbstractC26779o0.f101189c) {
                return m10691d(c26782c.m22020n(), true, i, sb, c51663xX5);
            }
            if (c26782c.m22021m() instanceof Formattable) {
                return m10689f((Formattable) c26782c.m22021m(), i, sb);
            }
            if (c26782c.m22020n() instanceof Formattable) {
                return m10689f((Formattable) c26782c.m22020n(), i, sb);
            }
            return m10691d(c26782c.m22021m(), true, i, sb, c51663xX5);
        } else if (interfaceC38077ae6 != null) {
            sb.replace(0, 1, interfaceC38077ae6.toString());
            return Integer.MAX_VALUE;
        } else {
            throw new IllegalArgumentException("Unable to format, no UnitConverter given");
        }
    }

    /* renamed from: e */
    public static int m10690e(InterfaceC38077ae6 interfaceC38077ae6, boolean z, int i, StringBuilder sb, C51663xX5 c51663xX5) {
        WZ3 m5047b = c51663xX5.m5047b(interfaceC38077ae6);
        if (m5047b != null && i == Integer.MAX_VALUE) {
            sb.insert(0, c51663xX5.m5046c(m5047b));
            return Integer.MAX_VALUE;
        } else if (interfaceC38077ae6 instanceof C26407n7) {
            if (i < 0) {
                sb.insert(0, CoreConstants.LEFT_PARENTHESIS_CHAR);
                sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
            InterfaceC48754sd3 m13024c = C49060t80.m13024c();
            Number m24321k = ((C26407n7) interfaceC38077ae6).m24321k();
            if (m13024c.mo13933b(m24321k, 0) < 0) {
                sb.append(Detail.EMPTY_CHAR);
                m24321k = m13024c.mo13925j(m24321k);
            } else if (z) {
                sb.append("+");
            }
            sb.append(m24321k);
            return 0;
        } else if (interfaceC38077ae6 instanceof InterfaceC44546lX2) {
            if (i < 2) {
                sb.insert(0, CoreConstants.LEFT_PARENTHESIS_CHAR);
                sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
            if (z) {
                sb.append(Typography.middleDot);
            }
            Object m27180Y2 = ((InterfaceC44546lX2) interfaceC38077ae6).m27180Y2();
            if (m27180Y2 instanceof C47670qn4) {
                sb.append(((C47670qn4) m27180Y2).m17054s(JsonPointer.SEPARATOR));
            } else {
                sb.append(m27180Y2);
            }
            return 2;
        } else {
            sb.insert(0, interfaceC38077ae6.toString() + "(");
            sb.append(")");
            return 4;
        }
    }

    /* renamed from: f */
    public static int m10689f(Formattable formattable, int i, StringBuilder sb) {
        Formatter formatter = new Formatter();
        formatter.format("%s", formattable);
        sb.replace(0, 1, formatter.toString());
        formatter.close();
        return i;
    }

    /* renamed from: g */
    public static int m10688g(StringBuilder sb, C51663xX5 c51663xX5, WZ3 wz3) {
        sb.insert(0, c51663xX5.m5046c(wz3));
        return Integer.MAX_VALUE;
    }

    /* renamed from: h */
    public static int m10687h(InterfaceC44546lX2 interfaceC44546lX2, boolean z, int i, StringBuilder sb) {
        if (i < 2) {
            sb.insert(0, CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        Number m27180Y2 = interfaceC44546lX2.m27180Y2();
        if (m27180Y2 instanceof C47670qn4) {
            C47670qn4 c47670qn4 = (C47670qn4) m27180Y2;
            if (z) {
                if (c47670qn4.m17066g()) {
                    sb.append(Typography.middleDot);
                    sb.append(c47670qn4.toString());
                } else {
                    C47670qn4 m17056q = c47670qn4.m17056q();
                    if (m17056q.m17066g()) {
                        sb.append(JsonPointer.SEPARATOR);
                        sb.append(m17056q.toString());
                    } else {
                        sb.append(Typography.middleDot);
                        sb.append(c47670qn4.m17054s(JsonPointer.SEPARATOR));
                    }
                }
            } else {
                sb.append(c47670qn4.m17054s(JsonPointer.SEPARATOR));
            }
        } else {
            if (z) {
                sb.append(Typography.middleDot);
            }
            sb.append(String.valueOf(m27180Y2));
        }
        return 2;
    }

    /* renamed from: i */
    public static int m10686i(UY3 uy3, boolean z, int i, StringBuilder sb) {
        if (i < 2) {
            sb.insert(0, CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        if (!uy3.mo18701d()) {
            if (z) {
                sb.append(Typography.middleDot);
            }
            sb.append(uy3.m81354m());
            sb.append("^");
            sb.append(uy3.m81353n());
        }
        return 2;
    }
}
