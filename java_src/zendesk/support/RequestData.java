package zendesk.support;

import ch.qos.logback.core.CoreConstants;
/* loaded from: classes8.dex */
final class RequestData {
    private final int commentCount;

    /* renamed from: id */
    private final String f121956id;
    private int readCommentCount;

    private RequestData(String str, int i, int i2) {
        this.commentCount = i;
        this.f121956id = str;
        this.readCommentCount = i2;
    }

    public static RequestData create(Request request) {
        return new RequestData(request.getId(), request.getCommentCount().intValue(), 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RequestData.class != obj.getClass()) {
            return false;
        }
        String str = this.f121956id;
        String str2 = ((RequestData) obj).f121956id;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int getCommentCount() {
        return this.commentCount;
    }

    public String getId() {
        return this.f121956id;
    }

    public int getReadCommentCount() {
        return this.readCommentCount;
    }

    public int hashCode() {
        String str = this.f121956id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "RequestData{commentCount=" + this.commentCount + "readCommentCount=" + this.readCommentCount + ", id='" + this.f121956id + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }

    public int unreadComments() {
        return this.commentCount - this.readCommentCount;
    }

    public static RequestData create(String str, int i, int i2) {
        return new RequestData(str, i, i2);
    }
}
