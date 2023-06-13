package p000;

import android.text.TextUtils;
import com.braintreepayments.api.exceptions.BraintreeApiErrorResponse;
import com.braintreepayments.api.exceptions.UnprocessableEntityException;
import java.io.IOException;
import java.net.HttpURLConnection;
import javax.net.ssl.SSLException;
/* renamed from: D10 */
/* loaded from: classes2.dex */
public class D10 extends C52162yN1 {

    /* renamed from: h */
    public final String f5079h;

    /* renamed from: i */
    public final String f5080i;

    public D10(String str, String str2, String str3) {
        this.f119455g = str;
        this.f5079h = str2;
        this.f5080i = str3;
        m3541l("braintree/android/3.17.2");
        try {
            m3542k(new C45151mY5(B10.m114792a()));
        } catch (SSLException unused) {
            m3542k(null);
        }
    }

    @Override // p000.C52162yN1
    /* renamed from: b */
    public HttpURLConnection mo3551b(String str) throws IOException {
        HttpURLConnection mo3551b = super.mo3551b(str);
        if (!TextUtils.isEmpty(this.f5079h)) {
            mo3551b.setRequestProperty("Authorization", "Bearer " + this.f5079h);
        }
        mo3551b.setRequestProperty("Braintree-Version", this.f5080i);
        return mo3551b;
    }

    @Override // p000.C52162yN1
    /* renamed from: c */
    public String mo3550c(HttpURLConnection httpURLConnection) throws Exception {
        try {
            return super.mo3550c(httpURLConnection);
        } catch (UnprocessableEntityException e) {
            throw new BraintreeApiErrorResponse(e.getMessage());
        }
    }
}
