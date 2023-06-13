package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: Er9 */
/* loaded from: classes6.dex */
public final class Er9 {
    /* renamed from: a */
    public static String m108319a(AbstractC45836nh9 abstractC45836nh9) {
        StringBuilder sb = new StringBuilder(abstractC45836nh9.mo11924c());
        for (int i = 0; i < abstractC45836nh9.mo11924c(); i++) {
            byte mo11926a = abstractC45836nh9.mo11926a(i);
            if (mo11926a != 34) {
                if (mo11926a != 39) {
                    if (mo11926a != 92) {
                        switch (mo11926a) {
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
                                if (mo11926a >= 32 && mo11926a <= 126) {
                                    sb.append((char) mo11926a);
                                    continue;
                                } else {
                                    sb.append(CoreConstants.ESCAPE_CHAR);
                                    sb.append((char) (((mo11926a >>> 6) & 3) + 48));
                                    sb.append((char) (((mo11926a >>> 3) & 7) + 48));
                                    sb.append((char) ((mo11926a & 7) + 48));
                                    break;
                                }
                                break;
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
