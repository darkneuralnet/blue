package p000;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;
/* renamed from: id6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C42828id6 {

    /* renamed from: a */
    public static String[] f87575a;

    /* renamed from: a */
    public static boolean m33719a(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        C10776ad.m71007e().m71011a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f87575a == null) {
            f87575a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f87575a) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
