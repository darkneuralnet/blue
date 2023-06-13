package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: fs8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41201fs8 {
    /* renamed from: a */
    public static String m40603a(AbstractC41604gZ7 abstractC41604gZ7) {
        StringBuilder sb = new StringBuilder(abstractC41604gZ7.mo5074e());
        for (int i = 0; i < abstractC41604gZ7.mo5074e(); i++) {
            byte mo5076a = abstractC41604gZ7.mo5076a(i);
            if (mo5076a != 34) {
                if (mo5076a != 39) {
                    if (mo5076a != 92) {
                        switch (mo5076a) {
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
                                if (mo5076a >= 32 && mo5076a <= 126) {
                                    sb.append((char) mo5076a);
                                    continue;
                                } else {
                                    sb.append(CoreConstants.ESCAPE_CHAR);
                                    sb.append((char) (((mo5076a >>> 6) & 3) + 48));
                                    sb.append((char) (((mo5076a >>> 3) & 7) + 48));
                                    sb.append((char) ((mo5076a & 7) + 48));
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
