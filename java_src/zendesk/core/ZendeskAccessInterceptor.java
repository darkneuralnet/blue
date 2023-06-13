package zendesk.core;

import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ZendeskAccessInterceptor implements Interceptor {
    private static final String EMPTY_JSON = "{}";
    private static final String LOG_TAG = "ZendeskAccessInterceptor";
    private static final int RETRY_LIMIT = 3;
    private AccessProvider accessProvider;
    private CoreSettingsStorage coreSettingsStorage;
    private IdentityManager identityManager;
    private int retryCounter;
    private Storage storage;

    public ZendeskAccessInterceptor(IdentityManager identityManager, AccessProvider accessProvider, Storage storage, CoreSettingsStorage coreSettingsStorage) {
        this.identityManager = identityManager;
        this.accessProvider = accessProvider;
        this.storage = storage;
        this.coreSettingsStorage = coreSettingsStorage;
    }

    private Response errorResponse(Interceptor.Chain chain, String str) {
        return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(400).message(str).body(ResponseBody.create(MediaType.parse(Constants.TEXT_JSON), EMPTY_JSON)).build();
    }

    public static String getErrorLogMessage(AuthenticationType authenticationType, Identity identity) {
        StringBuilder sb = new StringBuilder((int) SyslogConstants.LOG_LOCAL4);
        sb.append("The expected type of authentication is ");
        if (authenticationType == null) {
            sb.append("null. Check that settings have been downloaded.");
        } else if (authenticationType == AuthenticationType.ANONYMOUS) {
            sb.append("anonymous.");
        } else if (authenticationType == AuthenticationType.JWT) {
            sb.append("jwt.");
        }
        sb.append('\n');
        sb.append("The local identity is");
        if (identity == null) {
            sb.append(" not");
        }
        sb.append(" present.\n");
        if (identity != null) {
            sb.append("The local identity is ");
            if (identity instanceof AnonymousIdentity) {
                sb.append("anonymous.");
            } else if (identity instanceof JwtIdentity) {
                sb.append("jwt.");
            } else {
                sb.append("unknown.");
            }
        }
        return sb.toString();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        HM4<AuthenticationResponse> authTokenViaJwt;
        Identity identity = this.identityManager.getIdentity();
        AuthenticationType authentication = this.coreSettingsStorage.getCoreSettings().getAuthentication();
        if (UrlHelper.isGuideRequest(chain.request().url().toString()) && (identity instanceof AnonymousIdentity)) {
            C33694Ix2.m101457b(LOG_TAG, "Anonymous Guide request, no need to intercept.", new Object[0]);
            return chain.proceed(chain.request());
        } else if (this.identityManager.getStoredAccessTokenAsBearerToken() != null) {
            C33694Ix2.m101457b(LOG_TAG, "Access token present, no need to intercept.", new Object[0]);
            return chain.proceed(chain.request());
        } else {
            C33694Ix2.m101457b(LOG_TAG, "Access token is required, intercepting.", new Object[0]);
            if (AuthenticationType.ANONYMOUS == authentication && (identity instanceof AnonymousIdentity)) {
                C33694Ix2.m101457b(LOG_TAG, "Anonymous Identity found. Requesting and storing auth token.", new Object[0]);
                authTokenViaJwt = this.accessProvider.getAuthTokenViaAnonymous((AnonymousIdentity) identity);
            } else if (AuthenticationType.JWT == authentication && (identity instanceof JwtIdentity)) {
                C33694Ix2.m101457b(LOG_TAG, "JWT Identity found. Requesting and storing auth token.", new Object[0]);
                authTokenViaJwt = this.accessProvider.getAuthTokenViaJwt((JwtIdentity) identity);
            } else {
                this.storage.clear();
                String errorLogMessage = getErrorLogMessage(authentication, identity);
                C33694Ix2.m101454e(LOG_TAG, errorLogMessage, new Object[0]);
                return errorResponse(chain, errorLogMessage);
            }
            if (authTokenViaJwt == null) {
                return errorResponse(chain, "Response was null, failed to auth user.");
            }
            if (authTokenViaJwt.m103943b() == 409) {
                int i = this.retryCounter;
                if (i < 3) {
                    this.retryCounter = i + 1;
                    return intercept(chain);
                }
                return errorResponse(chain, "Response was 409, failed to auth user.");
            } else if (authTokenViaJwt.m103944a() != null) {
                AccessToken authentication2 = authTokenViaJwt.m103944a().getAuthentication();
                if (authentication2 != null) {
                    this.identityManager.storeAccessToken(authentication2);
                }
                this.retryCounter = 0;
                return chain.proceed(chain.request());
            } else {
                return errorResponse(chain, "Response body was null, failed to auth user.");
            }
        }
    }
}
