package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: B69 */
/* loaded from: classes5.dex */
public final class B69 {
    /* renamed from: a */
    public static String m114354a(AbstractC40913fO8 abstractC40913fO8) {
        StringBuilder sb = new StringBuilder(abstractC40913fO8.mo41437c());
        for (int i = 0; i < abstractC40913fO8.mo41437c(); i++) {
            byte mo41439a = abstractC40913fO8.mo41439a(i);
            if (mo41439a != 34) {
                if (mo41439a != 39) {
                    if (mo41439a != 92) {
                        switch (mo41439a) {
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
                                if (mo41439a >= 32 && mo41439a <= 126) {
                                    sb.append((char) mo41439a);
                                    continue;
                                } else {
                                    sb.append(CoreConstants.ESCAPE_CHAR);
                                    sb.append((char) (((mo41439a >>> 6) & 3) + 48));
                                    sb.append((char) (((mo41439a >>> 3) & 7) + 48));
                                    sb.append((char) ((mo41439a & 7) + 48));
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
