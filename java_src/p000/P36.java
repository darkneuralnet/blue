package p000;

import android.content.Intent;
import android.net.Uri;
import com.braintreepayments.api.exceptions.BraintreeException;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.models.CardNonce;
import com.braintreepayments.api.models.ThreeDSecureAuthenticationResponse;
import com.braintreepayments.api.models.ThreeDSecureInfo;
import com.braintreepayments.api.models.ThreeDSecureLookup;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: P36 */
/* loaded from: classes2.dex */
public class P36 {

    /* renamed from: P36$a */
    /* loaded from: classes2.dex */
    public static class C6234a implements HN1 {

        /* renamed from: a */
        public final /* synthetic */ CardNonce f27829a;

        /* renamed from: b */
        public final /* synthetic */ G10 f27830b;

        public C6234a(CardNonce cardNonce, G10 g10) {
            this.f27829a = cardNonce;
            this.f27830b = g10;
        }

        @Override // p000.HN1
        /* renamed from: a */
        public void mo10871a(Exception exc) {
            this.f27830b.m105974Ea("three-d-secure.verification-flow.upgrade-payment-method.errored");
            this.f27830b.m105954ya(exc);
        }

        @Override // p000.HN1
        public void success(String str) {
            ThreeDSecureAuthenticationResponse m53304a = ThreeDSecureAuthenticationResponse.m53304a(str);
            CardNonce m53301d = ThreeDSecureAuthenticationResponse.m53301d(str, this.f27829a);
            if (m53304a.m53302c() != null) {
                this.f27830b.m105974Ea("three-d-secure.verification-flow.upgrade-payment-method.failure.returned-lookup-nonce");
                m53301d.m53383i().m53294d(m53304a.m53302c());
                P36.m91031c(this.f27830b, m53301d);
                return;
            }
            this.f27830b.m105974Ea("three-d-secure.verification-flow.upgrade-payment-method.succeeded");
            P36.m91031c(this.f27830b, m53301d);
        }
    }

    /* renamed from: P36$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C6235b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27831a;

        static {
            int[] iArr = new int[CardinalActionCode.values().length];
            f27831a = iArr;
            try {
                iArr[CardinalActionCode.FAILURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27831a[CardinalActionCode.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27831a[CardinalActionCode.NOACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27831a[CardinalActionCode.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27831a[CardinalActionCode.TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27831a[CardinalActionCode.CANCEL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: b */
    public static void m91032b(G10 g10, ThreeDSecureLookup threeDSecureLookup, String str) {
        CardNonce m53290a = threeDSecureLookup.m53290a();
        g10.m105974Ea("three-d-secure.verification-flow.upgrade-payment-method.started");
        String m53327c = m53290a.m53327c();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("jwt", str);
            jSONObject.put("paymentMethodNonce", m53327c);
        } catch (JSONException unused) {
        }
        K10 m105962ha = g10.m105962ha();
        m105962ha.mo3548e(C49629u56.m10873f("payment_methods/" + m53327c + "/three_d_secure/authenticate_from_jwt"), jSONObject.toString(), new C6234a(m53290a, g10));
    }

    /* renamed from: c */
    public static void m91031c(G10 g10, CardNonce cardNonce) {
        ThreeDSecureInfo m53383i = cardNonce.m53383i();
        g10.m105974Ea(String.format("three-d-secure.verification-flow.liability-shifted.%b", Boolean.valueOf(m53383i.m53295c())));
        g10.m105974Ea(String.format("three-d-secure.verification-flow.liability-shift-possible.%b", Boolean.valueOf(m53383i.m53296b())));
        g10.m105955va(cardNonce);
    }

    /* renamed from: d */
    public static void m91030d(G10 g10, int i, Intent intent) {
        if (i != -1) {
            return;
        }
        Uri data = intent.getData();
        if (data != null) {
            String queryParameter = data.getQueryParameter("auth_response");
            ThreeDSecureAuthenticationResponse m53304a = ThreeDSecureAuthenticationResponse.m53304a(queryParameter);
            if (m53304a.m53300e()) {
                m91031c(g10, m53304a.m53303b());
                return;
            } else {
                g10.m105954ya(new ErrorWithResponse(422, queryParameter));
                return;
            }
        }
        ThreeDSecureLookup threeDSecureLookup = (ThreeDSecureLookup) intent.getParcelableExtra("com.braintreepayments.api.ThreeDSecureActivity.EXTRA_THREE_D_SECURE_LOOKUP");
        ValidateResponse serializableExtra = intent.getSerializableExtra("com.braintreepayments.api.ThreeDSecureActivity.EXTRA_VALIDATION_RESPONSE");
        String stringExtra = intent.getStringExtra("com.braintreepayments.api.ThreeDSecureActivity.EXTRA_JWT");
        g10.m105974Ea(String.format("three-d-secure.verification-flow.cardinal-sdk.action-code.%s", serializableExtra.getActionCode().name().toLowerCase()));
        switch (C6235b.f27831a[serializableExtra.getActionCode().ordinal()]) {
            case 1:
            case 2:
            case 3:
                m91032b(g10, threeDSecureLookup, stringExtra);
                g10.m105974Ea("three-d-secure.verification-flow.completed");
                return;
            case 4:
            case 5:
                g10.m105954ya(new BraintreeException(serializableExtra.getErrorDescription()));
                g10.m105974Ea("three-d-secure.verification-flow.failed");
                return;
            case 6:
                g10.m105981Aa(13487);
                g10.m105974Ea("three-d-secure.verification-flow.canceled");
                return;
            default:
                return;
        }
    }
}
