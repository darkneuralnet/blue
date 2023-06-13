package zendesk.core;
/* loaded from: classes8.dex */
class AccessToken {
    private String accessToken;
    @InterfaceC41208ft5("user_id")
    private String userId;

    public AccessToken() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        String str = this.accessToken;
        if (str == null ? accessToken.accessToken != null : !str.equals(accessToken.accessToken)) {
            return false;
        }
        String str2 = this.userId;
        String str3 = accessToken.userId;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i;
        String str = this.accessToken;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.userId;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public AccessToken(String str, String str2) {
        this.accessToken = str;
        this.userId = str2;
    }
}
