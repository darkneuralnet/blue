package zendesk.core;
/* loaded from: classes8.dex */
class ApiAnonymousIdentity implements Identity {
    private static final transient String LOG_TAG = "ApiAnonymousIdentity";
    private String email;
    private String name;
    private String sdkGuid;

    public ApiAnonymousIdentity(AnonymousIdentity anonymousIdentity, String str) {
        if (C44504lS5.m27271d(str)) {
            this.sdkGuid = "";
            C33694Ix2.m101447l(LOG_TAG, "SdkGuid cannot be null or empty.", new Object[0]);
        } else {
            this.sdkGuid = str;
        }
        if (anonymousIdentity == null) {
            C33694Ix2.m101447l(LOG_TAG, "Identity is null.", new Object[0]);
            return;
        }
        this.email = anonymousIdentity.getEmail();
        this.name = anonymousIdentity.getName();
    }
}
