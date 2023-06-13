package p000;

import android.content.Context;
import android.content.SharedPreferences;
/* renamed from: aZ7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38029aZ7 {
    /* renamed from: a */
    public static String m71215a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.recaptcha.internal.VERIFICATION_HISTORY_FILE_KEY", 0);
        String m71214b = m71214b(str);
        if (!sharedPreferences.contains(m71214b)) {
            return "";
        }
        return sharedPreferences.getString(m71214b, "");
    }

    /* renamed from: b */
    public static String m71214b(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "verification_history_token_key:".concat(valueOf) : new String("verification_history_token_key:");
    }
}
