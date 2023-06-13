package p000;

import android.content.Context;
import android.content.SharedPreferences;
import co.bird.android.model.Detail;
import java.util.UUID;
/* renamed from: qd6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47572qd6 {
    /* renamed from: a */
    public static String m17310a() {
        return UUID.randomUUID().toString().replace(Detail.EMPTY_CHAR, "");
    }

    /* renamed from: b */
    public static String m17309b(Context context) {
        SharedPreferences m93011a = O10.m93011a(context);
        String string = m93011a.getString("braintreeUUID", null);
        if (string == null) {
            String m17310a = m17310a();
            m93011a.edit().putString("braintreeUUID", m17310a).apply();
            return m17310a;
        }
        return string;
    }
}
