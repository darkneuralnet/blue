package p000;

import android.content.Context;
/* renamed from: R52 */
/* loaded from: classes2.dex */
public class R52 {
    /* renamed from: a */
    public static String m87327a(Context context) {
        try {
            if (Class.forName("com.braintreepayments.api.BraintreePaymentActivity").isInstance(context)) {
                return "dropin";
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            if (Class.forName("com.braintreepayments.api.dropin.DropInActivity").isInstance(context)) {
                return "dropin2";
            }
            return "custom";
        } catch (ClassNotFoundException unused2) {
            return "custom";
        }
    }
}
