package p000;

import android.content.SharedPreferences;
import android.util.Log;
/* renamed from: Me8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34465Me8 extends C48186rf7<Long> {
    /* renamed from: a */
    public static Long m95086a(SharedPreferences sharedPreferences, String str, Long l) {
        String str2;
        try {
            return (Long) X58.m77406a(new CallableC50627vm8(sharedPreferences, str, l));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
            return l;
        }
    }
}
