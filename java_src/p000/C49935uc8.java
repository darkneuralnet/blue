package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: uc8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49935uc8 {
    /* renamed from: a */
    public static String m9946a(TD7 td7) {
        String str;
        C33277Hc8 c33277Hc8 = new C33277Hc8(td7);
        StringBuilder sb = new StringBuilder(c33277Hc8.size());
        for (int i = 0; i < c33277Hc8.size(); i++) {
            int mo78121i = c33277Hc8.mo78121i(i);
            if (mo78121i == 34) {
                str = "\\\"";
            } else if (mo78121i == 39) {
                str = "\\'";
            } else if (mo78121i != 92) {
                switch (mo78121i) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (mo78121i < 32 || mo78121i > 126) {
                            sb.append(CoreConstants.ESCAPE_CHAR);
                            sb.append((char) (((mo78121i >>> 6) & 3) + 48));
                            sb.append((char) (((mo78121i >>> 3) & 7) + 48));
                            mo78121i = (mo78121i & 7) + 48;
                        }
                        sb.append((char) mo78121i);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
