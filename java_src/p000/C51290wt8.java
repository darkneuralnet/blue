package p000;

import android.content.SharedPreferences;
import android.util.Log;
/* renamed from: wt8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51290wt8 extends C48186rf7<String> {
    /* renamed from: a */
    public static String m6151a(SharedPreferences sharedPreferences, String str, String str2) {
        String str3;
        try {
            return (String) X58.m77406a(new CallableC52645zA8(sharedPreferences, str, str2));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str3 = "Flag value not available, returning default: ".concat(valueOf);
            } else {
                str3 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str3);
            return str2;
        }
    }
}
