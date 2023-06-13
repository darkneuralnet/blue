package p000;

import android.content.Context;
import android.content.SharedPreferences;
/* renamed from: fH8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40850fH8 {

    /* renamed from: a */
    public static SharedPreferences f79803a;

    /* renamed from: a */
    public static SharedPreferences m41613a(Context context) throws Exception {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f79803a == null) {
                f79803a = (SharedPreferences) X58.m77406a(new IN8(context));
            }
            sharedPreferences = f79803a;
        }
        return sharedPreferences;
    }
}
