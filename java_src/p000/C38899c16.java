package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: c16  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38899c16 extends V70 {
    @Override // p000.V70
    /* renamed from: c */
    public int mo17694c(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'a' && c <= 'z') {
            sb.append((char) ((c - 'a') + 14));
            return 1;
        } else if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) ((c - CoreConstants.COLON_CHAR) + 15));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        } else if (c == '`') {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) 2);
            sb.append((char) ((c - 'A') + 1));
            return 2;
        } else if (c >= '{' && c <= 127) {
            sb.append((char) 2);
            sb.append((char) ((c - CoreConstants.CURLY_LEFT) + 27));
            return 2;
        } else {
            sb.append("\u0001\u001e");
            return mo17694c((char) (c - 128), sb) + 2;
        }
    }

    @Override // p000.V70
    /* renamed from: e */
    public int mo17693e() {
        return 2;
    }
}
