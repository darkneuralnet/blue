package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: V70 */
/* loaded from: classes6.dex */
public class V70 implements InterfaceC46954pb1 {
    /* renamed from: d */
    public static String m80361d(CharSequence charSequence, int i) {
        int charAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * CoreConstants.LEFT_PARENTHESIS_CHAR) + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }

    /* renamed from: g */
    public static void m80360g(C50510vb1 c50510vb1, StringBuilder sb) {
        c50510vb1.m8400s(m80361d(sb, 0));
        sb.delete(0, 3);
    }

    @Override // p000.InterfaceC46954pb1
    /* renamed from: a */
    public void mo2127a(C50510vb1 c50510vb1) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c50510vb1.m8410i()) {
                break;
            }
            char m8416c = c50510vb1.m8416c();
            c50510vb1.f114361f++;
            int mo17694c = mo17694c(m8416c, sb);
            int m8418a = c50510vb1.m8418a() + ((sb.length() / 3) << 1);
            c50510vb1.m8402q(m8418a);
            int m6696a = c50510vb1.m8412g().m6696a() - m8418a;
            if (!c50510vb1.m8410i()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (m6696a < 2 || m6696a > 2)) {
                    mo17694c = m80362b(c50510vb1, sb, sb2, mo17694c);
                }
                while (sb.length() % 3 == 1 && ((mo17694c <= 3 && m6696a != 1) || mo17694c > 3)) {
                    mo17694c = m80362b(c50510vb1, sb, sb2, mo17694c);
                }
            } else if (sb.length() % 3 == 0 && MM1.m95410n(c50510vb1.m8415d(), c50510vb1.f114361f, mo17693e()) != mo17693e()) {
                c50510vb1.m8404o(0);
                break;
            }
        }
        mo17692f(c50510vb1, sb);
    }

    /* renamed from: b */
    public final int m80362b(C50510vb1 c50510vb1, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        c50510vb1.f114361f--;
        int mo17694c = mo17694c(c50510vb1.m8416c(), sb2);
        c50510vb1.m8408k();
        return mo17694c;
    }

    /* renamed from: c */
    public int mo17694c(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
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
        } else if (c >= '`' && c <= 127) {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        } else {
            sb.append("\u0001\u001e");
            return mo17694c((char) (c - 128), sb) + 2;
        }
    }

    /* renamed from: e */
    public int mo17693e() {
        return 1;
    }

    /* renamed from: f */
    public void mo17692f(C50510vb1 c50510vb1, StringBuilder sb) {
        int length = sb.length() % 3;
        int m8418a = c50510vb1.m8418a() + ((sb.length() / 3) << 1);
        c50510vb1.m8402q(m8418a);
        int m6696a = c50510vb1.m8412g().m6696a() - m8418a;
        if (length == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                m80360g(c50510vb1, sb);
            }
            if (c50510vb1.m8410i()) {
                c50510vb1.m8401r((char) 254);
            }
        } else if (m6696a == 1 && length == 1) {
            while (sb.length() >= 3) {
                m80360g(c50510vb1, sb);
            }
            if (c50510vb1.m8410i()) {
                c50510vb1.m8401r((char) 254);
            }
            c50510vb1.f114361f--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                m80360g(c50510vb1, sb);
            }
            if (m6696a > 0 || c50510vb1.m8410i()) {
                c50510vb1.m8401r((char) 254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        c50510vb1.m8404o(0);
    }
}
