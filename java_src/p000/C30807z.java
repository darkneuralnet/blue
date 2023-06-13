package p000;
/* renamed from: z */
/* loaded from: classes6.dex */
public final class C30807z implements InterfaceC46954pb1 {
    /* renamed from: b */
    public static char m2126b(char c, char c2) {
        if (MM1.m95418f(c) && MM1.m95418f(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    @Override // p000.InterfaceC46954pb1
    /* renamed from: a */
    public void mo2127a(C50510vb1 c50510vb1) {
        if (MM1.m95423a(c50510vb1.m8415d(), c50510vb1.f114361f) >= 2) {
            c50510vb1.m8401r(m2126b(c50510vb1.m8415d().charAt(c50510vb1.f114361f), c50510vb1.m8415d().charAt(c50510vb1.f114361f + 1)));
            c50510vb1.f114361f += 2;
            return;
        }
        char m8416c = c50510vb1.m8416c();
        int m95410n = MM1.m95410n(c50510vb1.m8415d(), c50510vb1.f114361f, m2125c());
        if (m95410n != m2125c()) {
            if (m95410n != 1) {
                if (m95410n != 2) {
                    if (m95410n != 3) {
                        if (m95410n != 4) {
                            if (m95410n == 5) {
                                c50510vb1.m8401r((char) 231);
                                c50510vb1.m8404o(5);
                                return;
                            }
                            throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(m95410n)));
                        }
                        c50510vb1.m8401r((char) 240);
                        c50510vb1.m8404o(4);
                        return;
                    }
                    c50510vb1.m8401r((char) 238);
                    c50510vb1.m8404o(3);
                    return;
                }
                c50510vb1.m8401r((char) 239);
                c50510vb1.m8404o(2);
                return;
            }
            c50510vb1.m8401r((char) 230);
            c50510vb1.m8404o(1);
        } else if (MM1.m95417g(m8416c)) {
            c50510vb1.m8401r((char) 235);
            c50510vb1.m8401r((char) ((m8416c - 128) + 1));
            c50510vb1.f114361f++;
        } else {
            c50510vb1.m8401r((char) (m8416c + 1));
            c50510vb1.f114361f++;
        }
    }

    /* renamed from: c */
    public int m2125c() {
        return 0;
    }
}
