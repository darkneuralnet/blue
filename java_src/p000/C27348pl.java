package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.paypal.android.sdk.onetouch.core.CheckoutRequest;
import com.paypal.android.sdk.onetouch.core.Request;
import com.paypal.android.sdk.onetouch.core.Result;
import com.paypal.android.sdk.onetouch.core.exception.ResponseParsingException;
import com.paypal.android.sdk.onetouch.core.exception.WalletSwitchException;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: pl */
/* loaded from: classes6.dex */
public class C27348pl {
    /* renamed from: a */
    public static Intent m18830a(String str, String str2) {
        return new Intent(str).setPackage(str2);
    }

    /* renamed from: b */
    public static Intent m18829b(XA0 xa0, C46560ov0 c46560ov0, Request request, AbstractC45348ms4 abstractC45348ms4) {
        Intent putExtra = m18830a(abstractC45348ms4.m24831d(), "com.paypal.android.p2pmobile").putExtra("version", abstractC45348ms4.m24833b().m85876b()).putExtra("app_guid", Y42.m75781a(xa0.m77268b())).putExtra("client_metadata_id", request.m45888j()).putExtra(AnalyticsRequestV2.PARAM_CLIENT_ID, request.m45889i()).putExtra(AnalyticsFields.APP_NAME, H21.m104488a(xa0.m77268b())).putExtra("environment", request.m45887k()).putExtra("environment_url", C52922zf1.m615a(request.m45887k()));
        putExtra.putExtra("response_type", "web").putExtra("webURL", ((CheckoutRequest) request).mo45891g());
        return putExtra;
    }

    /* renamed from: c */
    public static boolean m18828c(Context context, String str) {
        return KA5.m99110a(context, str, "O=Paypal", "O=Paypal", 34172764);
    }

    /* renamed from: d */
    public static Result m18827d(XA0 xa0, Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        if (request.mo45880r(extras)) {
            request.mo45881q(xa0.m77268b(), EnumC45489n66.Return, null);
            return m18826e(extras);
        } else if (extras.containsKey("error")) {
            request.mo45881q(xa0.m77268b(), EnumC45489n66.Error, null);
            return new Result(new WalletSwitchException(extras.getString("error")));
        } else {
            request.mo45881q(xa0.m77268b(), EnumC45489n66.Error, null);
            return new Result(new ResponseParsingException("invalid wallet response"));
        }
    }

    /* renamed from: e */
    public static Result m18826e(Bundle bundle) {
        LM4 lm4;
        String string = bundle.getString("error");
        if (!TextUtils.isEmpty(string)) {
            return new Result(new WalletSwitchException(string));
        }
        String string2 = bundle.getString("environment");
        if (PaymentMethodOptionsParams.Blik.PARAM_CODE.equals(bundle.getString("response_type").toLowerCase(Locale.US))) {
            lm4 = LM4.authorization_code;
        } else {
            lm4 = LM4.web;
        }
        try {
            if (LM4.web == lm4) {
                return new Result(string2, lm4, new JSONObject().put("webURL", bundle.getString("webURL")), null);
            }
            String string3 = bundle.getString("authorization_code");
            return new Result(string2, lm4, new JSONObject().put(PaymentMethodOptionsParams.Blik.PARAM_CODE, string3), bundle.getString("email"));
        } catch (JSONException e) {
            return new Result(new ResponseParsingException(e));
        }
    }
}
