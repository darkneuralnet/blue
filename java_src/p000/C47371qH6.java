package p000;
/* renamed from: qH6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47371qH6 extends V70 {
    @Override // p000.V70, p000.InterfaceC46954pb1
    /* renamed from: a */
    public void mo2127a(C50510vb1 c50510vb1) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c50510vb1.m8410i()) {
                break;
            }
            char m8416c = c50510vb1.m8416c();
            c50510vb1.f114361f++;
            mo17694c(m8416c, sb);
            if (sb.length() % 3 == 0) {
                V70.m80360g(c50510vb1, sb);
                if (MM1.m95410n(c50510vb1.m8415d(), c50510vb1.f114361f, mo17693e()) != mo17693e()) {
                    c50510vb1.m8404o(0);
                    break;
                }
            }
        }
        mo17692f(c50510vb1, sb);
    }

    @Override // p000.V70
    /* renamed from: c */
    public int mo17694c(char c, StringBuilder sb) {
        if (c != '\r') {
            if (c != ' ') {
                if (c != '*') {
                    if (c != '>') {
                        if (c >= '0' && c <= '9') {
                            sb.append((char) ((c - '0') + 4));
                        } else if (c >= 'A' && c <= 'Z') {
                            sb.append((char) ((c - 'A') + 14));
                        } else {
                            MM1.m95419e(c);
                        }
                    } else {
                        sb.append((char) 2);
                    }
                } else {
                    sb.append((char) 1);
                }
            } else {
                sb.append((char) 3);
            }
        } else {
            sb.append((char) 0);
        }
        return 1;
    }

    @Override // p000.V70
    /* renamed from: e */
    public int mo17693e() {
        return 3;
    }

    @Override // p000.V70
    /* renamed from: f */
    public void mo17692f(C50510vb1 c50510vb1, StringBuilder sb) {
        c50510vb1.m8403p();
        int m6696a = c50510vb1.m8412g().m6696a() - c50510vb1.m8418a();
        c50510vb1.f114361f -= sb.length();
        if (c50510vb1.m8413f() > 1 || m6696a > 1 || c50510vb1.m8413f() != m6696a) {
            c50510vb1.m8401r((char) 254);
        }
        if (c50510vb1.m8414e() < 0) {
            c50510vb1.m8404o(0);
        }
    }
}
