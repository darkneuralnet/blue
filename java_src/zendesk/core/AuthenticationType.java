package zendesk.core;
/* loaded from: classes8.dex */
public enum AuthenticationType {
    JWT("jwt"),
    ANONYMOUS("anonymous");
    
    private final String authenticationType;

    AuthenticationType(String str) {
        this.authenticationType = str;
    }

    public static AuthenticationType getAuthType(String str) {
        AuthenticationType authenticationType = JWT;
        if (authenticationType.authenticationType.equals(str)) {
            return authenticationType;
        }
        AuthenticationType authenticationType2 = ANONYMOUS;
        if (authenticationType2.authenticationType.equals(str)) {
            return authenticationType2;
        }
        return null;
    }

    public String getAuthenticationType() {
        return this.authenticationType;
    }
}
