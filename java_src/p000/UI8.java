package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
/* renamed from: UI8 */
/* loaded from: classes6.dex */
public final class UI8 {

    /* renamed from: a */
    public final String f37221a;

    /* renamed from: b */
    public final II8 f37222b;

    /* renamed from: c */
    public II8 f37223c;

    public /* synthetic */ UI8(String str, C50938wI8 c50938wI8) {
        II8 ii8 = new II8(null);
        this.f37222b = ii8;
        this.f37223c = ii8;
        str.getClass();
        this.f37221a = str;
    }

    /* renamed from: a */
    public final UI8 m81641a(Object obj) {
        II8 ii8 = new II8(null);
        this.f37223c.f15298b = ii8;
        this.f37223c = ii8;
        ii8.f15297a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f37221a);
        sb.append(CoreConstants.CURLY_LEFT);
        II8 ii8 = this.f37222b.f15298b;
        String str = "";
        while (ii8 != null) {
            Object obj = ii8.f15297a;
            sb.append(str);
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            ii8 = ii8.f15298b;
            str = ", ";
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }
}
