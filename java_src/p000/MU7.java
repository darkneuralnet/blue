package p000;

import android.net.Uri;
import java.util.Map;
/* renamed from: MU7 */
/* loaded from: classes5.dex */
public final class MU7 {

    /* renamed from: a */
    public final Map<String, Map<String, String>> f23152a;

    public MU7(Map<String, Map<String, String>> map) {
        this.f23152a = map;
    }

    /* renamed from: a */
    public final String m95282a(Uri uri, String str, String str2, String str3) {
        String str4;
        if (uri == null) {
            return null;
        }
        Map<String, String> map = this.f23152a.get(uri.toString());
        if (map == null) {
            return null;
        }
        String valueOf = String.valueOf(str3);
        if (valueOf.length() != 0) {
            str4 = "".concat(valueOf);
        } else {
            str4 = new String("");
        }
        return map.get(str4);
    }
}
