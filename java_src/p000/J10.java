package p000;

import com.braintreepayments.api.exceptions.AuthorizationException;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.exceptions.UnexpectedException;
import java.net.HttpURLConnection;
import javax.net.ssl.SSLException;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: J10 */
/* loaded from: classes2.dex */
public class J10 extends D10 {
    public J10(String str, String str2) {
        this(str, str2, "2018-03-06");
    }

    @Override // p000.D10, p000.C52162yN1
    /* renamed from: c */
    public String mo3550c(HttpURLConnection httpURLConnection) throws Exception {
        String mo3550c = super.mo3550c(httpURLConnection);
        JSONArray optJSONArray = new JSONObject(mo3550c).optJSONArray("errors");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject = optJSONArray.getJSONObject(i);
                JSONObject optJSONObject = jSONObject.optJSONObject("extensions");
                String m61029a = C39299ci2.m61029a(jSONObject, "message", "An Unexpected Exception Occurred");
                if (optJSONObject != null) {
                    if (!C39299ci2.m61029a(optJSONObject, "legacyCode", "").equals("50000")) {
                        if (!C39299ci2.m61029a(optJSONObject, "errorType", "").equals("user_error")) {
                            throw new UnexpectedException(m61029a);
                        }
                    } else {
                        throw new AuthorizationException(jSONObject.getString("message"));
                    }
                } else {
                    throw new UnexpectedException(m61029a);
                }
            }
            throw ErrorWithResponse.m53413a(mo3550c);
        }
        return mo3550c;
    }

    /* renamed from: n */
    public void m101391n(String str, HN1 hn1) {
        super.mo3548e("", str, hn1);
    }

    public J10(String str, String str2, String str3) {
        super(str, str2, str3);
        try {
            m3542k(new C45151mY5(I10.m103076a()));
        } catch (SSLException unused) {
            m3542k(null);
        }
    }
}
