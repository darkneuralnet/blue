package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: Zv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37659Zv7 {
    /* renamed from: a */
    public static String m72296a(AbstractC44175kt7 abstractC44175kt7) {
        StringBuilder sb = new StringBuilder(abstractC44175kt7.mo28217e());
        for (int i = 0; i < abstractC44175kt7.mo28217e(); i++) {
            byte mo28220a = abstractC44175kt7.mo28220a(i);
            if (mo28220a != 34) {
                if (mo28220a != 39) {
                    if (mo28220a != 92) {
                        switch (mo28220a) {
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
                                if (mo28220a >= 32 && mo28220a <= 126) {
                                    sb.append((char) mo28220a);
                                    continue;
                                } else {
                                    sb.append(CoreConstants.ESCAPE_CHAR);
                                    sb.append((char) (((mo28220a >>> 6) & 3) + 48));
                                    sb.append((char) (((mo28220a >>> 3) & 7) + 48));
                                    sb.append((char) ((mo28220a & 7) + 48));
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
