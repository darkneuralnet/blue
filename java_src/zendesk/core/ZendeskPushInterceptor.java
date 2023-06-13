package zendesk.core;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ZendeskPushInterceptor implements Interceptor {
    private static final String LOG_TAG = "ZendeskPushInterceptor";
    private final IdentityStorage identityStorage;
    private final PushDeviceIdStorage pushDeviceIdStorage;
    private final PushRegistrationProviderInternal pushProvider;

    public ZendeskPushInterceptor(PushRegistrationProviderInternal pushRegistrationProviderInternal, PushDeviceIdStorage pushDeviceIdStorage, IdentityStorage identityStorage) {
        this.pushProvider = pushRegistrationProviderInternal;
        this.pushDeviceIdStorage = pushDeviceIdStorage;
        this.identityStorage = identityStorage;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        PushRegistrationRequest pushRegistrationRequest = this.pushDeviceIdStorage.getPushRegistrationRequest();
        if (pushRegistrationRequest != null && this.identityStorage.getStoredAccessToken() != null) {
            C33694Ix2.m101457b(LOG_TAG, "Sending stored push registration request", new Object[0]);
            this.pushProvider.sendPushRegistrationRequest(pushRegistrationRequest);
        }
        return chain.proceed(chain.request());
    }
}
