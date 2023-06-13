package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: D28 */
/* loaded from: classes5.dex */
public final class D28 {
    /* renamed from: a */
    public static String m111016a(AbstractC43604jv9 abstractC43604jv9) {
        C46637p28 c46637p28 = new C46637p28(abstractC43604jv9);
        StringBuilder sb = new StringBuilder(c46637p28.size());
        for (int i = 0; i < c46637p28.size(); i++) {
            byte mo20021n = c46637p28.mo20021n(i);
            if (mo20021n != 34) {
                if (mo20021n != 39) {
                    if (mo20021n != 92) {
                        switch (mo20021n) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (mo20021n >= 32 && mo20021n <= 126) {
                                    sb.append((char) mo20021n);
                                    continue;
                                } else {
                                    sb.append(CoreConstants.ESCAPE_CHAR);
                                    sb.append((char) (((mo20021n >>> 6) & 3) + 48));
                                    sb.append((char) (((mo20021n >>> 3) & 7) + 48));
                                    sb.append((char) ((mo20021n & 7) + 48));
                                    break;
                                }
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
}
