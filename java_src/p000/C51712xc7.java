package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: xc7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51712xc7 {
    /* renamed from: a */
    public static String m4933a(AbstractC32088Ca7 abstractC32088Ca7) {
        StringBuilder sb = new StringBuilder(abstractC32088Ca7.mo1072c());
        for (int i = 0; i < abstractC32088Ca7.mo1072c(); i++) {
            byte mo1074a = abstractC32088Ca7.mo1074a(i);
            if (mo1074a != 34) {
                if (mo1074a != 39) {
                    if (mo1074a != 92) {
                        switch (mo1074a) {
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
                                if (mo1074a >= 32 && mo1074a <= 126) {
                                    sb.append((char) mo1074a);
                                    continue;
                                } else {
                                    sb.append(CoreConstants.ESCAPE_CHAR);
                                    sb.append((char) (((mo1074a >>> 6) & 3) + 48));
                                    sb.append((char) (((mo1074a >>> 3) & 7) + 48));
                                    sb.append((char) ((mo1074a & 7) + 48));
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
