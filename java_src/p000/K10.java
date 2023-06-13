package p000;

import android.net.Uri;
import com.amazonaws.services.p026s3.internal.Constants;
import com.braintreepayments.api.exceptions.AuthorizationException;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.exceptions.UnprocessableEntityException;
import com.braintreepayments.api.models.Authorization;
import com.braintreepayments.api.models.ClientToken;
import com.braintreepayments.api.models.PayPalUAT;
import com.braintreepayments.api.models.TokenizationKey;
import java.io.IOException;
import java.net.HttpURLConnection;
import javax.net.ssl.SSLException;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: K10 */
/* loaded from: classes2.dex */
public class K10 extends C52162yN1 {

    /* renamed from: h */
    public final Authorization f18926h;

    public K10(Authorization authorization) {
        this.f18926h = authorization;
        m3541l(m99355n());
        try {
            m3542k(new C45151mY5(H10.m104499a()));
        } catch (SSLException unused) {
            m3542k(null);
        }
    }

    /* renamed from: n */
    public static String m99355n() {
        return "braintree/android/3.17.2";
    }

    @Override // p000.C52162yN1
    /* renamed from: a */
    public void mo3552a(String str, HN1 hn1) {
        Uri parse;
        if (str == null) {
            m3547f(hn1, new IllegalArgumentException("Path cannot be null"));
            return;
        }
        if (str.startsWith("http")) {
            parse = Uri.parse(str);
        } else {
            parse = Uri.parse(this.f119455g + str);
        }
        Authorization authorization = this.f18926h;
        if ((authorization instanceof ClientToken) || (authorization instanceof PayPalUAT)) {
            parse = parse.buildUpon().appendQueryParameter("authorizationFingerprint", this.f18926h.mo53279b()).build();
        }
        super.mo3552a(parse.toString(), hn1);
    }

    @Override // p000.C52162yN1
    /* renamed from: b */
    public HttpURLConnection mo3551b(String str) throws IOException {
        HttpURLConnection mo3551b = super.mo3551b(str);
        Authorization authorization = this.f18926h;
        if (authorization instanceof TokenizationKey) {
            mo3551b.setRequestProperty("Client-Key", authorization.mo53279b());
        }
        return mo3551b;
    }

    @Override // p000.C52162yN1
    /* renamed from: c */
    public String mo3550c(HttpURLConnection httpURLConnection) throws Exception {
        try {
            return super.mo3550c(httpURLConnection);
        } catch (AuthorizationException | UnprocessableEntityException e) {
            if (e instanceof AuthorizationException) {
                throw new AuthorizationException(new ErrorWithResponse(Constants.BUCKET_ACCESS_FORBIDDEN_STATUS_CODE, e.getMessage()).getMessage());
            }
            throw new ErrorWithResponse(422, e.getMessage());
        }
    }

    @Override // p000.C52162yN1
    /* renamed from: d */
    public String mo3549d(String str, String str2) throws Exception {
        if (this.f18926h instanceof ClientToken) {
            str2 = new JSONObject(str2).put("authorizationFingerprint", ((ClientToken) this.f18926h).m53380h()).toString();
        }
        return super.mo3549d(str, str2);
    }

    @Override // p000.C52162yN1
    /* renamed from: e */
    public void mo3548e(String str, String str2, HN1 hn1) {
        try {
            if (this.f18926h instanceof ClientToken) {
                str2 = new JSONObject(str2).put("authorizationFingerprint", ((ClientToken) this.f18926h).m53380h()).toString();
            }
            super.mo3548e(str, str2, hn1);
        } catch (JSONException e) {
            m3547f(hn1, e);
        }
    }
}
