package p000;

import android.os.LocaleList;
import android.text.TextUtils;
import android.webkit.URLUtil;
import co.bird.android.model.Detail;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.recaptcha.HttpStatusException;
import com.google.android.gms.recaptcha.RecaptchaNetworkException;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.HttpsURLConnection;
import org.joda.time.DateTimeConstants;
import p000.Em9;
/* renamed from: CI7 */
/* loaded from: classes6.dex */
public final class CI7<ResponseT extends Em9<ResponseT, ?>> {

    /* renamed from: a */
    public final String f3905a;

    /* renamed from: b */
    public final ExecutorService f3906b;

    /* renamed from: c */
    public final ResponseT f3907c;

    public CI7(String str, ExecutorService executorService, ResponseT responset) {
        this.f3905a = str;
        this.f3906b = executorService;
        this.f3907c = responset;
    }

    /* renamed from: c */
    public static /* synthetic */ HttpURLConnection m112363c(CI7 ci7) throws IOException {
        if (!URLUtil.isHttpsUrl(ci7.f3905a) && !URLUtil.isHttpUrl(ci7.f3905a)) {
            throw new MalformedURLException("Recaptcha server url only allows using Http or Https.");
        }
        if (URLUtil.isHttpUrl(ci7.f3905a)) {
            return (HttpURLConnection) new URL(ci7.f3905a).openConnection();
        }
        return (HttpsURLConnection) new URL(ci7.f3905a).openConnection();
    }

    /* renamed from: a */
    public final <RequestT extends Em9> Mb9<ResponseT> m112365a(final RequestT requestt) {
        return Hc9.m103650a(this.f3906b).mo83347K(new Callable() { // from class: TG7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CI7.this.m112364b(requestt);
            }
        });
    }

    /* renamed from: d */
    public final <RequestT extends Em9> ResponseT m112364b(RequestT requestt) throws RecaptchaNetworkException, HttpStatusException {
        String sb;
        try {
            int mo93341g = requestt.mo93341g();
            byte[] bArr = new byte[mo93341g];
            AbstractC48228rj9 m15504n = AbstractC48228rj9.m15504n(bArr);
            requestt.mo81209j(m15504n);
            m15504n.m15502p();
            try {
                C43384jZ8 m20702a = AbstractC46398oe8.m20702a();
                HttpURLConnection m30316b = m20702a.m30316b(new KH7(this), 21504, -1);
                m30316b.setConnectTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
                m30316b.setReadTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
                m30316b.setRequestProperty("Content-type", "application/x-protobuffer");
                m30316b.setRequestProperty("Content-Length", Integer.toString(mo93341g));
                if (PlatformVersion.isAtLeastN()) {
                    sb = LocaleList.getDefault().toLanguageTags();
                } else {
                    Locale locale = Locale.getDefault();
                    if (PlatformVersion.isAtLeastLollipop()) {
                        sb = locale.toLanguageTag();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(locale.getLanguage());
                        if (TextUtils.isEmpty(sb2.toString())) {
                            sb = RequestHeadersFactory.UNDETERMINED_LANGUAGE;
                        } else {
                            String country = locale.getCountry();
                            if (!TextUtils.isEmpty(country)) {
                                sb2.append(Detail.EMPTY_CHAR);
                                sb2.append(country);
                            }
                            String variant = locale.getVariant();
                            if (!TextUtils.isEmpty(variant)) {
                                sb2.append(Detail.EMPTY_CHAR);
                                sb2.append(variant);
                            }
                            sb = sb2.toString();
                        }
                    }
                }
                m30316b.setRequestProperty("Accept-Language", sb);
                m30316b.setRequestMethod("POST");
                m30316b.setDoOutput(true);
                m30316b.connect();
                OutputStream outputStream = m30316b.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                int responseCode = m30316b.getResponseCode();
                if (responseCode == 200) {
                    Object mo35761c = this.f3907c.mo93340z().mo35761c(m30316b.getInputStream());
                    m20702a.close();
                    return (ResponseT) mo35761c;
                }
                throw new HttpStatusException("Failed to fetch response", responseCode);
            } catch (IOException e) {
                C33384Ho7.m103418a("RecaptchaNetworkMgr", e);
                if (e instanceof MalformedURLException) {
                    throw new RecaptchaNetworkException(String.valueOf(e.getMessage()), e);
                }
                throw new RecaptchaNetworkException("Failed to connect to server", e);
            }
        } catch (IOException e2) {
            String name = requestt.getClass().getName();
            StringBuilder sb3 = new StringBuilder(name.length() + 72);
            sb3.append("Serializing ");
            sb3.append(name);
            sb3.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb3.toString(), e2);
        }
    }
}
