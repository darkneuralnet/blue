package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: Bk9 */
/* loaded from: classes5.dex */
public final class Bk9 {
    /* renamed from: a */
    public static String m113528a(T69 t69) {
        StringBuilder sb = new StringBuilder(t69.mo7402c());
        for (int i = 0; i < t69.mo7402c(); i++) {
            byte mo7404a = t69.mo7404a(i);
            if (mo7404a != 34) {
                if (mo7404a != 39) {
                    if (mo7404a != 92) {
                        switch (mo7404a) {
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
                                if (mo7404a >= 32 && mo7404a <= 126) {
                                    sb.append((char) mo7404a);
                                    continue;
                                } else {
                                    sb.append(CoreConstants.ESCAPE_CHAR);
                                    sb.append((char) (((mo7404a >>> 6) & 3) + 48));
                                    sb.append((char) (((mo7404a >>> 3) & 7) + 48));
                                    sb.append((char) ((mo7404a & 7) + 48));
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
