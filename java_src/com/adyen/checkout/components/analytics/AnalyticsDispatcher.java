package com.adyen.checkout.components.analytics;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.JobIntentService;
import com.adyen.checkout.core.api.Environment;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
/* loaded from: classes.dex */
public class AnalyticsDispatcher extends JobIntentService {

    /* renamed from: k */
    public static final String f68405k = C50139ux2.m9434c();

    /* renamed from: j */
    public static void m53597j(Context context, Environment environment, AnalyticEvent analyticEvent) {
        Intent intent = new Intent();
        intent.putExtra("analytic_event", analyticEvent);
        intent.putExtra("env_url_key", environment.m53575a());
        JobIntentService.m67746d(context, AnalyticsDispatcher.class, 4747, intent);
    }

    @Override // androidx.core.app.JobIntentService
    /* renamed from: g */
    public void mo52985g(Intent intent) {
        HttpsURLConnection httpsURLConnection;
        AnalyticEvent analyticEvent = (AnalyticEvent) intent.getParcelableExtra("analytic_event");
        String stringExtra = intent.getStringExtra("env_url_key");
        if (analyticEvent == null) {
            C32290Cx2.m111212c(f68405k, "Analytics event is null.");
        } else if (stringExtra == null) {
            C32290Cx2.m111212c(f68405k, "env url is null.");
        } else {
            C32290Cx2.m111209f(f68405k, "Sending analytic event.");
            HttpsURLConnection httpsURLConnection2 = null;
            try {
                try {
                    httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(analyticEvent.m53600b(stringExtra + "images/analytics.png").openConnection()));
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                httpsURLConnection.setSSLSocketFactory(C38699bh5.f57906a);
                httpsURLConnection.connect();
                InputStream inputStream = httpsURLConnection.getInputStream();
                try {
                    inputStream.read();
                    inputStream.close();
                    httpsURLConnection.disconnect();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                th2.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                httpsURLConnection2 = httpsURLConnection;
                C32290Cx2.m111211d(f68405k, "Failed to send analytics event.", e);
                if (httpsURLConnection2 != null) {
                    httpsURLConnection2.disconnect();
                }
            } catch (Throwable th5) {
                th = th5;
                httpsURLConnection2 = httpsURLConnection;
                if (httpsURLConnection2 != null) {
                    httpsURLConnection2.disconnect();
                }
                throw th;
            }
        }
    }
}
