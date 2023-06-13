package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: Uv2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C36484Uv2 {
    /* renamed from: a */
    public static char m80634a(int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return 'e';
                    }
                    throw new IllegalArgumentException("Unknown location value: " + i);
                }
                return 'b';
            }
            return 'i';
        }
        return CoreConstants.DASH_CHAR;
    }
}
