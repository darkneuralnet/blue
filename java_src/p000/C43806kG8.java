package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: kG8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43806kG8 extends YF8 {

    /* renamed from: a */
    public final char f94185a;

    public C43806kG8(char c) {
        this.f94185a = c;
    }

    @Override // p000.BH8
    /* renamed from: a */
    public final boolean mo29109a(char c) {
        return c == this.f94185a;
    }

    public final String toString() {
        int i = this.f94185a;
        char[] cArr = {CoreConstants.ESCAPE_CHAR, 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(copyValueOf);
        sb.append("')");
        return sb.toString();
    }
}
