package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: PT8 */
/* loaded from: classes5.dex */
public final class PT8 extends PN8 {

    /* renamed from: a */
    public final char f28555a;

    public PT8(char c) {
        this.f28555a = c;
    }

    @Override // p000.A99
    /* renamed from: a */
    public final boolean mo44614a(char c) {
        return c == this.f28555a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.is('");
        int i = this.f28555a;
        char[] cArr = {CoreConstants.ESCAPE_CHAR, 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
