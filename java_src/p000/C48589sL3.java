package p000;

import android.content.Intent;
import android.net.Uri;
import com.braintreepayments.api.exceptions.BraintreeException;
import com.braintreepayments.api.models.PayPalAccountNonce;
/* renamed from: sL3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48589sL3 {
    /* renamed from: a */
    public static void m14316a(G10 g10, int i, Intent intent) {
        String str;
        PayPalAccountNonce m12496a = C49182tL3.m12496a(g10);
        if (i == -1 && intent != null && m12496a != null) {
            Uri data = intent.getData();
            if (data != null) {
                str = data.getHost();
            } else {
                str = null;
            }
            if (str != null) {
                if (!str.equals("success")) {
                    if (!str.equals("cancel")) {
                        g10.m105974Ea("paypal-two-factor.browser-switch.failed");
                        g10.m105954ya(new BraintreeException("Host path unknown: " + str));
                        return;
                    }
                    g10.m105974Ea("paypal-two-factor.browser-switch.canceled");
                    g10.m105981Aa(13597);
                    return;
                }
                g10.m105974Ea("paypal-two-factor.browser-switch.succeeded");
                g10.m105955va(m12496a);
                return;
            }
            g10.m105974Ea("paypal-two-factor.browser-switch.failed");
            g10.m105954ya(new BraintreeException("Host missing from browser switch response."));
            return;
        }
        g10.m105974Ea("paypal-two-factor.browser-switch.canceled");
        g10.m105981Aa(13597);
    }
}
