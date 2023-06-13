package p000;

import androidx.recyclerview.widget.C11925l;
import kotlin.KotlinVersion;
/* renamed from: Dy */
/* loaded from: classes6.dex */
public final class C1676Dy implements InterfaceC46954pb1 {
    /* renamed from: c */
    public static char m109576c(char c, int i) {
        int i2 = c + ((i * 149) % KotlinVersion.MAX_COMPONENT_VALUE) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 - 256);
    }

    @Override // p000.InterfaceC46954pb1
    /* renamed from: a */
    public void mo2127a(C50510vb1 c50510vb1) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!c50510vb1.m8410i()) {
                break;
            }
            sb.append(c50510vb1.m8416c());
            c50510vb1.f114361f++;
            if (MM1.m95410n(c50510vb1.m8415d(), c50510vb1.f114361f, m109577b()) != m109577b()) {
                c50510vb1.m8404o(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int m8418a = c50510vb1.m8418a() + length + 1;
        c50510vb1.m8402q(m8418a);
        if (c50510vb1.m8412g().m6696a() - m8418a > 0) {
            z = true;
        } else {
            z = false;
        }
        if (c50510vb1.m8410i() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / C11925l.AbstractC11930e.DEFAULT_SWIPE_ANIMATION_DURATION) + 249));
                sb.insert(1, (char) (length % C11925l.AbstractC11930e.DEFAULT_SWIPE_ANIMATION_DURATION));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            c50510vb1.m8401r(m109576c(sb.charAt(i), c50510vb1.m8418a() + 1));
        }
    }

    /* renamed from: b */
    public int m109577b() {
        return 5;
    }
}
