package p000;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.util.Base64;
import com.braintreepayments.api.models.PayPalAccountNonce;
/* renamed from: tL3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49182tL3 {
    /* renamed from: a */
    public static PayPalAccountNonce m12496a(G10 g10) {
        SharedPreferences m93011a = O10.m93011a(g10.m105966T9());
        try {
            byte[] decode = Base64.decode(m93011a.getString("com.braintreepayments.api.PayPalTwoFactorAuth.PAYPAL_TWO_FACTOR_AUTH_REQUEST_KEY", ""), 0);
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(decode, 0, decode.length);
            obtain.setDataPosition(0);
            PayPalAccountNonce createFromParcel = PayPalAccountNonce.CREATOR.createFromParcel(obtain);
            m93011a.edit().remove("com.braintreepayments.api.PayPalTwoFactorAuth.PAYPAL_TWO_FACTOR_AUTH_REQUEST_KEY").apply();
            return createFromParcel;
        } catch (Exception unused) {
            m93011a.edit().remove("com.braintreepayments.api.PayPalTwoFactorAuth.PAYPAL_TWO_FACTOR_AUTH_REQUEST_KEY").apply();
            return null;
        } catch (Throwable th) {
            m93011a.edit().remove("com.braintreepayments.api.PayPalTwoFactorAuth.PAYPAL_TWO_FACTOR_AUTH_REQUEST_KEY").apply();
            throw th;
        }
    }
}
