package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.braintreepayments.api.models.ClientToken;
import com.braintreepayments.api.models.PaymentMethodNonce;
import com.braintreepayments.api.models.VenmoAccountNonce;
/* renamed from: xo6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C51831xo6 {

    /* renamed from: xo6$a */
    /* loaded from: classes2.dex */
    public static class C30317a implements LN3 {

        /* renamed from: a */
        public final /* synthetic */ G10 f118182a;

        public C30317a(G10 g10) {
            this.f118182a = g10;
        }

        @Override // p000.LN3
        /* renamed from: a */
        public void mo4604a(Exception exc) {
            this.f118182a.m105954ya(exc);
            this.f118182a.m105974Ea("pay-with-venmo.vault.failed");
        }

        @Override // p000.LN3
        /* renamed from: b */
        public void mo4603b(PaymentMethodNonce paymentMethodNonce) {
            this.f118182a.m105955va(paymentMethodNonce);
            this.f118182a.m105974Ea("pay-with-venmo.vault.success");
        }
    }

    /* renamed from: a */
    public static Intent m4609a() {
        return new Intent().setComponent(new ComponentName("com.venmo", "com.venmo.controller.SetupMerchantActivity"));
    }

    /* renamed from: b */
    public static boolean m4608b(Context context) {
        if (C13650cj.m61026a(context, m4609a()) && KA5.m99110a(context, "com.venmo", "CN=Andrew Kortina,OU=Engineering,O=Venmo,L=Philadelphia,ST=PA,C=US", "CN=Andrew Kortina,OU=Engineering,O=Venmo,L=Philadelphia,ST=PA,C=US", -129711843)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static void m4607c(G10 g10, int i, Intent intent) {
        if (i == -1) {
            g10.m105974Ea("pay-with-venmo.app-switch.success");
            String stringExtra = intent.getStringExtra("com.braintreepayments.api.EXTRA_PAYMENT_METHOD_NONCE");
            if (m4606d(g10.m105966T9()) && (g10.m105965da() instanceof ClientToken)) {
                m4605e(g10, stringExtra);
                return;
            }
            String stringExtra2 = intent.getStringExtra("com.braintreepayments.api.EXTRA_USER_NAME");
            g10.m105955va(new VenmoAccountNonce(stringExtra, stringExtra2, stringExtra2));
        } else if (i == 0) {
            g10.m105974Ea("pay-with-venmo.app-switch.canceled");
        }
    }

    /* renamed from: d */
    public static boolean m4606d(Context context) {
        return O10.m93011a(context).getBoolean("com.braintreepayments.api.Venmo.VAULT_VENMO_KEY", false);
    }

    /* renamed from: e */
    public static void m4605e(G10 g10, String str) {
        C49629u56.m10876c(g10, new C52424yo6().m2559l(str), new C30317a(g10));
    }
}
