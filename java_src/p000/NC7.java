package p000;

import android.content.SharedPreferences;
import android.util.Log;
/* renamed from: NC7 */
/* loaded from: classes5.dex */
public final class NC7 extends C48186rf7<Boolean> {
    /* renamed from: a */
    public static Boolean m94194a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        String str2;
        try {
            return (Boolean) X58.m77406a(new CallableC50416vQ7(sharedPreferences, str, bool));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
            return bool;
        }
    }
}
