package zendesk.support.request;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
/* loaded from: classes8.dex */
class StateMessageStatus implements Serializable {
    static final int DELIVERED = 2;
    static final int ERROR = 1;
    static final int PENDING = 3;
    private final String errorResponse;
    private final int status;

    private StateMessageStatus(int i, String str) {
        this.status = i;
        this.errorResponse = str;
    }

    public static StateMessageStatus delivered() {
        return new StateMessageStatus(2, null);
    }

    public static StateMessageStatus error(String str) {
        return new StateMessageStatus(1, str);
    }

    public static StateMessageStatus pending() {
        return new StateMessageStatus(3, null);
    }

    public String getErrorResponse() {
        return this.errorResponse;
    }

    public int getStatus() {
        return this.status;
    }

    public String toString() {
        String str;
        int i = this.status;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "Unknown";
                } else {
                    str = "Pending";
                }
            } else {
                str = "Delivered";
            }
        } else {
            str = "Error";
        }
        return "MessageState{status=" + str + ", errorResponse=" + this.errorResponse + CoreConstants.CURLY_RIGHT;
    }
}
