package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.api.response.OpsBatchJobActionKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m28432d2 = {"Lco/bird/api/request/OperatorBirdActionRequest;", "", "role", "", "birdId", "action", "Lco/bird/api/response/OpsBatchJobActionKind;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/api/response/OpsBatchJobActionKind;)V", "getAction", "()Lco/bird/api/response/OpsBatchJobActionKind;", "getBirdId", "()Ljava/lang/String;", "getRole", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorBirdActionRequest {
    @JsonProperty("action")
    @InterfaceC41208ft5("action")
    private final OpsBatchJobActionKind action;
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("role")
    @InterfaceC41208ft5("role")
    private final String role;

    public OperatorBirdActionRequest(String str, String birdId, OpsBatchJobActionKind action) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(action, "action");
        this.role = str;
        this.birdId = birdId;
        this.action = action;
    }

    public static /* synthetic */ OperatorBirdActionRequest copy$default(OperatorBirdActionRequest operatorBirdActionRequest, String str, String str2, OpsBatchJobActionKind opsBatchJobActionKind, int i, Object obj) {
        if ((i & 1) != 0) {
            str = operatorBirdActionRequest.role;
        }
        if ((i & 2) != 0) {
            str2 = operatorBirdActionRequest.birdId;
        }
        if ((i & 4) != 0) {
            opsBatchJobActionKind = operatorBirdActionRequest.action;
        }
        return operatorBirdActionRequest.copy(str, str2, opsBatchJobActionKind);
    }

    public final String component1() {
        return this.role;
    }

    public final String component2() {
        return this.birdId;
    }

    public final OpsBatchJobActionKind component3() {
        return this.action;
    }

    public final OperatorBirdActionRequest copy(String str, String birdId, OpsBatchJobActionKind action) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(action, "action");
        return new OperatorBirdActionRequest(str, birdId, action);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorBirdActionRequest) {
            OperatorBirdActionRequest operatorBirdActionRequest = (OperatorBirdActionRequest) obj;
            return Intrinsics.areEqual(this.role, operatorBirdActionRequest.role) && Intrinsics.areEqual(this.birdId, operatorBirdActionRequest.birdId) && this.action == operatorBirdActionRequest.action;
        }
        return false;
    }

    public final OpsBatchJobActionKind getAction() {
        return this.action;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getRole() {
        return this.role;
    }

    public int hashCode() {
        String str = this.role;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.birdId.hashCode()) * 31) + this.action.hashCode();
    }

    public String toString() {
        String str = this.role;
        String str2 = this.birdId;
        OpsBatchJobActionKind opsBatchJobActionKind = this.action;
        return "OperatorBirdActionRequest(role=" + str + ", birdId=" + str2 + ", action=" + opsBatchJobActionKind + ")";
    }

    public /* synthetic */ OperatorBirdActionRequest(String str, String str2, OpsBatchJobActionKind opsBatchJobActionKind, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, opsBatchJobActionKind);
    }
}
