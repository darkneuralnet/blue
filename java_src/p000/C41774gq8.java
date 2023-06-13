package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: gq8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41774gq8 {
    /* renamed from: a */
    public static String m37421a(AbstractC50836w78 abstractC50836w78) {
        StringBuilder sb = new StringBuilder(abstractC50836w78.mo7384c());
        for (int i = 0; i < abstractC50836w78.mo7384c(); i++) {
            byte mo7386a = abstractC50836w78.mo7386a(i);
            if (mo7386a != 34) {
                if (mo7386a != 39) {
                    if (mo7386a != 92) {
                        switch (mo7386a) {
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
                                if (mo7386a >= 32 && mo7386a <= 126) {
                                    sb.append((char) mo7386a);
                                    continue;
                                } else {
                                    sb.append(CoreConstants.ESCAPE_CHAR);
                                    sb.append((char) (((mo7386a >>> 6) & 3) + 48));
                                    sb.append((char) (((mo7386a >>> 3) & 7) + 48));
                                    sb.append((char) ((mo7386a & 7) + 48));
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
