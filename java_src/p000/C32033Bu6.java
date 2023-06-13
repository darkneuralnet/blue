package p000;

import android.content.Intent;
import java.lang.reflect.InvocationTargetException;
/* renamed from: Bu6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C32033Bu6 {

    /* renamed from: a */
    public static String f3028a = "com.braintreepayments.api.VisaCheckout";

    /* renamed from: a */
    public static void m113374a(G10 g10, int i, Intent intent) {
        try {
            Class.forName(f3028a).getDeclaredMethod("onActivityResult", G10.class, Integer.TYPE, Intent.class).invoke(null, g10, Integer.valueOf(i), intent);
        } catch (ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
