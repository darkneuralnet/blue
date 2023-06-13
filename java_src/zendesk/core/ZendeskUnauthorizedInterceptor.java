package zendesk.core;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ZendeskUnauthorizedInterceptor implements Interceptor {
    private static final String LOG_TAG = "ZendeskUnauthorizedInterceptor";
    private final IdentityManager identityManager;
    private final SessionStorage sessionStorage;

    public ZendeskUnauthorizedInterceptor(SessionStorage sessionStorage, IdentityManager identityManager) {
        this.sessionStorage = sessionStorage;
        this.identityManager = identityManager;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response proceed = chain.proceed(chain.request());
        if (!proceed.isSuccessful() && 401 == proceed.code()) {
            if (UrlHelper.isGuideRequest(chain.request().url().toString()) && (this.identityManager.getIdentity() instanceof AnonymousIdentity)) {
                C33694Ix2.m101457b(LOG_TAG, "Unauthorized guide request", new Object[0]);
            } else {
                onHttpUnauthorized();
            }
        }
        return proceed;
    }

    public void onHttpUnauthorized() {
        this.sessionStorage.clear();
    }
}
