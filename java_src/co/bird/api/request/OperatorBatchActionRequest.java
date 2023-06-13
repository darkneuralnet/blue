package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J;\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, m28432d2 = {"Lco/bird/api/request/OperatorBatchActionRequest;", "", "action", "", "batchId", "operatorTripStopId", "birdIds", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAction", "()Ljava/lang/String;", "getBatchId", "getBirdIds", "()Ljava/util/List;", "getOperatorTripStopId", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorBatchActionRequest {
    @JsonProperty("action")
    @InterfaceC41208ft5("action")
    private final String action;
    @JsonProperty("batch_id")
    @InterfaceC41208ft5("batch_id")
    private final String batchId;
    @JsonProperty("bird_ids")
    @InterfaceC41208ft5("bird_ids")
    private final List<String> birdIds;
    @JsonProperty("operator_trip_stop_id")
    @InterfaceC41208ft5("operator_trip_stop_id")
    private final String operatorTripStopId;

    public OperatorBatchActionRequest(String action, String str, String str2, List<String> birdIds) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        this.action = action;
        this.batchId = str;
        this.operatorTripStopId = str2;
        this.birdIds = birdIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OperatorBatchActionRequest copy$default(OperatorBatchActionRequest operatorBatchActionRequest, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = operatorBatchActionRequest.action;
        }
        if ((i & 2) != 0) {
            str2 = operatorBatchActionRequest.batchId;
        }
        if ((i & 4) != 0) {
            str3 = operatorBatchActionRequest.operatorTripStopId;
        }
        if ((i & 8) != 0) {
            list = operatorBatchActionRequest.birdIds;
        }
        return operatorBatchActionRequest.copy(str, str2, str3, list);
    }

    public final String component1() {
        return this.action;
    }

    public final String component2() {
        return this.batchId;
    }

    public final String component3() {
        return this.operatorTripStopId;
    }

    public final List<String> component4() {
        return this.birdIds;
    }

    public final OperatorBatchActionRequest copy(String action, String str, String str2, List<String> birdIds) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        return new OperatorBatchActionRequest(action, str, str2, birdIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorBatchActionRequest) {
            OperatorBatchActionRequest operatorBatchActionRequest = (OperatorBatchActionRequest) obj;
            return Intrinsics.areEqual(this.action, operatorBatchActionRequest.action) && Intrinsics.areEqual(this.batchId, operatorBatchActionRequest.batchId) && Intrinsics.areEqual(this.operatorTripStopId, operatorBatchActionRequest.operatorTripStopId) && Intrinsics.areEqual(this.birdIds, operatorBatchActionRequest.birdIds);
        }
        return false;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getBatchId() {
        return this.batchId;
    }

    public final List<String> getBirdIds() {
        return this.birdIds;
    }

    public final String getOperatorTripStopId() {
        return this.operatorTripStopId;
    }

    public int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        String str = this.batchId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.operatorTripStopId;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.birdIds.hashCode();
    }

    public String toString() {
        String str = this.action;
        String str2 = this.batchId;
        String str3 = this.operatorTripStopId;
        List<String> list = this.birdIds;
        return "OperatorBatchActionRequest(action=" + str + ", batchId=" + str2 + ", operatorTripStopId=" + str3 + ", birdIds=" + list + ")";
    }

    public /* synthetic */ OperatorBatchActionRequest(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, list);
    }
}
