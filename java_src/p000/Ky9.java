package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
/* renamed from: Ky9 */
/* loaded from: classes5.dex */
public final class Ky9 {

    /* renamed from: a */
    public final String f20504a;

    /* renamed from: b */
    public final Gw9 f20505b;

    /* renamed from: c */
    public Gw9 f20506c;

    public /* synthetic */ Ky9(String str, Kx9 kx9) {
        Gw9 gw9 = new Gw9(null);
        this.f20505b = gw9;
        this.f20506c = gw9;
        str.getClass();
        this.f20504a = str;
    }

    /* renamed from: a */
    public final Ky9 m98001a(String str, Object obj) {
        Gw9 gw9 = new Gw9(null);
        this.f20506c.f12655c = gw9;
        this.f20506c = gw9;
        gw9.f12654b = obj;
        gw9.f12653a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f20504a);
        sb.append(CoreConstants.CURLY_LEFT);
        Gw9 gw9 = this.f20505b.f12655c;
        String str = "";
        while (gw9 != null) {
            Object obj = gw9.f12654b;
            boolean z = gw9 instanceof C40629eu9;
            sb.append(str);
            String str2 = gw9.f12653a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            gw9 = gw9.f12655c;
            str = ", ";
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }
}
