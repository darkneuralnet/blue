package zendesk.core;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ZendeskOauthIdHeaderInterceptor implements Interceptor {
    private final String oauthId;

    public ZendeskOauthIdHeaderInterceptor(String str) {
        this.oauthId = str;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request.Builder newBuilder = chain.request().newBuilder();
        if (C44504lS5.m27273b(this.oauthId)) {
            newBuilder.addHeader(Constants.CLIENT_IDENTIFIER_HEADER, this.oauthId);
        }
        return chain.proceed(newBuilder.build());
    }
}
