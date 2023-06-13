package p000;

import kotlin.KotlinVersion;
/* renamed from: M91 */
/* loaded from: classes6.dex */
public final class M91 implements InterfaceC46954pb1 {
    /* renamed from: b */
    public static void m95677b(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c >= '@' && c <= '^') {
            sb.append((char) (c - '@'));
        } else {
            MM1.m95419e(c);
        }
    }

    /* renamed from: c */
    public static String m95676c(CharSequence charSequence, int i) {
        char c;
        char c2;
        int length = charSequence.length() - i;
        if (length != 0) {
            char charAt = charSequence.charAt(i);
            char c3 = 0;
            if (length >= 2) {
                c = charSequence.charAt(i + 1);
            } else {
                c = 0;
            }
            if (length >= 3) {
                c2 = charSequence.charAt(i + 2);
            } else {
                c2 = 0;
            }
            if (length >= 4) {
                c3 = charSequence.charAt(i + 3);
            }
            int i2 = (charAt << 18) + (c << '\f') + (c2 << 6) + c3;
            char c4 = (char) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            char c5 = (char) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
            StringBuilder sb = new StringBuilder(3);
            sb.append((char) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE));
            if (length >= 2) {
                sb.append(c4);
            }
            if (length >= 3) {
                sb.append(c5);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /* renamed from: e */
    public static void m95674e(C50510vb1 c50510vb1, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z = true;
            if (length == 1) {
                c50510vb1.m8403p();
                int m6696a = c50510vb1.m8412g().m6696a() - c50510vb1.m8418a();
                int m8413f = c50510vb1.m8413f();
                if (m8413f > m6696a) {
                    c50510vb1.m8402q(c50510vb1.m8418a() + 1);
                    m6696a = c50510vb1.m8412g().m6696a() - c50510vb1.m8418a();
                }
                if (m8413f <= m6696a && m6696a <= 2) {
                    return;
                }
            }
            if (length <= 4) {
                int i = length - 1;
                String m95676c = m95676c(charSequence, 0);
                if (!(!c50510vb1.m8410i()) || i > 2) {
                    z = false;
                }
                if (i <= 2) {
                    c50510vb1.m8402q(c50510vb1.m8418a() + i);
                    if (c50510vb1.m8412g().m6696a() - c50510vb1.m8418a() >= 3) {
                        c50510vb1.m8402q(c50510vb1.m8418a() + m95676c.length());
                        z = false;
                    }
                }
                if (z) {
                    c50510vb1.m8408k();
                    c50510vb1.f114361f -= i;
                } else {
                    c50510vb1.m8400s(m95676c);
                }
                return;
            }
            throw new IllegalStateException("Count must not exceed 4");
        } finally {
            c50510vb1.m8404o(0);
        }
    }

    @Override // p000.InterfaceC46954pb1
    /* renamed from: a */
    public void mo2127a(C50510vb1 c50510vb1) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c50510vb1.m8410i()) {
                break;
            }
            m95677b(c50510vb1.m8416c(), sb);
            c50510vb1.f114361f++;
            if (sb.length() >= 4) {
                c50510vb1.m8400s(m95676c(sb, 0));
                sb.delete(0, 4);
                if (MM1.m95410n(c50510vb1.m8415d(), c50510vb1.f114361f, m95675d()) != m95675d()) {
                    c50510vb1.m8404o(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        m95674e(c50510vb1, sb);
    }

    /* renamed from: d */
    public int m95675d() {
        return 4;
    }
}
