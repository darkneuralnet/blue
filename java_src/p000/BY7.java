package p000;

import android.content.SharedPreferences;
import android.util.Log;
/* renamed from: BY7 */
/* loaded from: classes5.dex */
public final class BY7 extends C48186rf7<Integer> {
    /* renamed from: a */
    public static Integer m113867a(SharedPreferences sharedPreferences, String str, Integer num) {
        String str2;
        try {
            return (Integer) X58.m77406a(new CallableC48455s68(sharedPreferences, str, num));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
            return num;
        }
    }
}
