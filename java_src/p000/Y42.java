package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
/* renamed from: Y42 */
/* loaded from: classes6.dex */
public class Y42 {
    /* renamed from: a */
    public static String m75781a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("PayPalOTC", 0);
        String string = sharedPreferences.getString("InstallationGUID", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        sharedPreferences.edit().putString("InstallationGUID", uuid).apply();
        return uuid;
    }
}
