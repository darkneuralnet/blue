package co.bird.api.response;

import co.bird.android.model.UserDeletionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/api/response/UserDeleteResponse;", "", "status", "Lco/bird/android/model/UserDeletionStatus;", "(Lco/bird/android/model/UserDeletionStatus;)V", "getStatus", "()Lco/bird/android/model/UserDeletionStatus;", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public class UserDeleteResponse {
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final UserDeletionStatus status;

    public UserDeleteResponse() {
        this(null, 1, null);
    }

    public final UserDeletionStatus getStatus() {
        return this.status;
    }

    public UserDeleteResponse(UserDeletionStatus userDeletionStatus) {
        this.status = userDeletionStatus;
    }

    public /* synthetic */ UserDeleteResponse(UserDeletionStatus userDeletionStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : userDeletionStatus);
    }
}
