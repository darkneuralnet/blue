package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m28432d2 = {"Lco/bird/api/response/OperatorBatchActionResponse;", "", "batchId", "", "status", "Lco/bird/api/response/OpsBatchJobStatus;", "birdCount", "", "(Ljava/lang/String;Lco/bird/api/response/OpsBatchJobStatus;I)V", "getBatchId", "()Ljava/lang/String;", "getBirdCount", "()I", "getStatus", "()Lco/bird/api/response/OpsBatchJobStatus;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorBatchActionResponse {
    @JsonProperty("batch_id")
    @InterfaceC41208ft5("batch_id")
    private final String batchId;
    @JsonProperty("bird_count")
    @InterfaceC41208ft5("bird_count")
    private final int birdCount;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final OpsBatchJobStatus status;

    public OperatorBatchActionResponse(String batchId, OpsBatchJobStatus status, int i) {
        Intrinsics.checkNotNullParameter(batchId, "batchId");
        Intrinsics.checkNotNullParameter(status, "status");
        this.batchId = batchId;
        this.status = status;
        this.birdCount = i;
    }

    public static /* synthetic */ OperatorBatchActionResponse copy$default(OperatorBatchActionResponse operatorBatchActionResponse, String str, OpsBatchJobStatus opsBatchJobStatus, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = operatorBatchActionResponse.batchId;
        }
        if ((i2 & 2) != 0) {
            opsBatchJobStatus = operatorBatchActionResponse.status;
        }
        if ((i2 & 4) != 0) {
            i = operatorBatchActionResponse.birdCount;
        }
        return operatorBatchActionResponse.copy(str, opsBatchJobStatus, i);
    }

    public final String component1() {
        return this.batchId;
    }

    public final OpsBatchJobStatus component2() {
        return this.status;
    }

    public final int component3() {
        return this.birdCount;
    }

    public final OperatorBatchActionResponse copy(String batchId, OpsBatchJobStatus status, int i) {
        Intrinsics.checkNotNullParameter(batchId, "batchId");
        Intrinsics.checkNotNullParameter(status, "status");
        return new OperatorBatchActionResponse(batchId, status, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorBatchActionResponse) {
            OperatorBatchActionResponse operatorBatchActionResponse = (OperatorBatchActionResponse) obj;
            return Intrinsics.areEqual(this.batchId, operatorBatchActionResponse.batchId) && this.status == operatorBatchActionResponse.status && this.birdCount == operatorBatchActionResponse.birdCount;
        }
        return false;
    }

    public final String getBatchId() {
        return this.batchId;
    }

    public final int getBirdCount() {
        return this.birdCount;
    }

    public final OpsBatchJobStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.batchId.hashCode() * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.birdCount);
    }

    public String toString() {
        String str = this.batchId;
        OpsBatchJobStatus opsBatchJobStatus = this.status;
        int i = this.birdCount;
        return "OperatorBatchActionResponse(batchId=" + str + ", status=" + opsBatchJobStatus + ", birdCount=" + i + ")";
    }

    public /* synthetic */ OperatorBatchActionResponse(String str, OpsBatchJobStatus opsBatchJobStatus, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, opsBatchJobStatus, (i2 & 4) != 0 ? 0 : i);
    }
}
