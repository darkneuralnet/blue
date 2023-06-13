package zendesk.core;
/* loaded from: classes8.dex */
public final class JwtIdentity implements Identity {
    private static final String LOG_TAG = "JwtIdentity";
    private final String token;

    public JwtIdentity(String str) {
        if (C44504lS5.m27271d(str)) {
            C33694Ix2.m101454e(LOG_TAG, "A null or empty JWT was specified. This will not work. Please check your initialisation of JwtIdentity!", new Object[0]);
        }
        this.token = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JwtIdentity.class != obj.getClass()) {
            return false;
        }
        String str = this.token;
        String str2 = ((JwtIdentity) obj).token;
        if (str == null ? str2 == null : str.equals(str2)) {
            return true;
        }
        return false;
    }

    public String getJwtUserIdentifier() {
        return this.token;
    }

    public int hashCode() {
        String str = this.token;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
