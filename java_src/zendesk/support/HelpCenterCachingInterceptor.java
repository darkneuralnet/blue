package zendesk.support;

import com.amazonaws.services.p026s3.Headers;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class HelpCenterCachingInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response proceed = chain.proceed(chain.request());
        if (C44504lS5.m27273b(proceed.headers().get("X-ZD-Cache-Control"))) {
            return proceed.newBuilder().header(Headers.CACHE_CONTROL, proceed.header("X-ZD-Cache-Control")).build();
        }
        return proceed;
    }
}
