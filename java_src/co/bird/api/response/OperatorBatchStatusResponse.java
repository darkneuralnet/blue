package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0010HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00107\u001a\u00020\u000eHÆ\u0003J£\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0006HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001b¨\u0006>"}, m28432d2 = {"Lco/bird/api/response/OperatorBatchStatusResponse;", "", "batchId", "", "jobId", "failedCount", "", "failMessage", "successCount", "successMessage", "birdCount", "action", "Lco/bird/api/response/OpsBatchJobActionKind;", TransferTable.COLUMN_STATE, "Lco/bird/api/response/OpsBatchJobStatus;", "kind", "Lco/bird/api/response/OpsBatchJobKind;", "errors", "", "Lco/bird/api/response/OperatorBatchError;", "notices", "Lco/bird/api/response/OperatorBatchNotice;", "batchNotice", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILco/bird/api/response/OpsBatchJobActionKind;Lco/bird/api/response/OpsBatchJobStatus;Lco/bird/api/response/OpsBatchJobKind;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getAction", "()Lco/bird/api/response/OpsBatchJobActionKind;", "getBatchId", "()Ljava/lang/String;", "getBatchNotice", "getBirdCount", "()I", "getErrors", "()Ljava/util/List;", "getFailMessage", "getFailedCount", "getJobId", "getKind", "()Lco/bird/api/response/OpsBatchJobKind;", "getNotices", "getState", "()Lco/bird/api/response/OpsBatchJobStatus;", "getSuccessCount", "getSuccessMessage", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorBatchStatusResponse {
    @JsonProperty("action")
    @InterfaceC41208ft5("action")
    private final OpsBatchJobActionKind action;
    @JsonProperty("batch_id")
    @InterfaceC41208ft5("batch_id")
    private final String batchId;
    @JsonProperty("batch_notice")
    @InterfaceC41208ft5("batch_notice")
    private final String batchNotice;
    @JsonProperty("bird_count")
    @InterfaceC41208ft5("bird_count")
    private final int birdCount;
    @JsonProperty("errors")
    @InterfaceC41208ft5("errors")
    private final List<OperatorBatchError> errors;
    @JsonProperty("fail_message")
    @InterfaceC41208ft5("fail_message")
    private final String failMessage;
    @JsonProperty("failed_count")
    @InterfaceC41208ft5("failed_count")
    private final int failedCount;
    @JsonProperty("job_id")
    @InterfaceC41208ft5("job_id")
    private final String jobId;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final OpsBatchJobKind kind;
    @JsonProperty("notices")
    @InterfaceC41208ft5("notices")
    private final List<OperatorBatchNotice> notices;
    @JsonProperty(TransferTable.COLUMN_STATE)
    @InterfaceC41208ft5(TransferTable.COLUMN_STATE)
    private final OpsBatchJobStatus state;
    @JsonProperty("success_count")
    @InterfaceC41208ft5("success_count")
    private final int successCount;
    @JsonProperty("success_message")
    @InterfaceC41208ft5("success_message")
    private final String successMessage;

    public OperatorBatchStatusResponse() {
        this(null, null, 0, null, 0, null, 0, null, null, null, null, null, null, 8191, null);
    }

    public final String component1() {
        return this.batchId;
    }

    public final OpsBatchJobKind component10() {
        return this.kind;
    }

    public final List<OperatorBatchError> component11() {
        return this.errors;
    }

    public final List<OperatorBatchNotice> component12() {
        return this.notices;
    }

    public final String component13() {
        return this.batchNotice;
    }

    public final String component2() {
        return this.jobId;
    }

    public final int component3() {
        return this.failedCount;
    }

    public final String component4() {
        return this.failMessage;
    }

    public final int component5() {
        return this.successCount;
    }

    public final String component6() {
        return this.successMessage;
    }

    public final int component7() {
        return this.birdCount;
    }

    public final OpsBatchJobActionKind component8() {
        return this.action;
    }

    public final OpsBatchJobStatus component9() {
        return this.state;
    }

    public final OperatorBatchStatusResponse copy(String str, String str2, int i, String str3, int i2, String str4, int i3, OpsBatchJobActionKind opsBatchJobActionKind, OpsBatchJobStatus state, OpsBatchJobKind kind, List<OperatorBatchError> errors, List<OperatorBatchNotice> notices, String str5) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(errors, "errors");
        Intrinsics.checkNotNullParameter(notices, "notices");
        return new OperatorBatchStatusResponse(str, str2, i, str3, i2, str4, i3, opsBatchJobActionKind, state, kind, errors, notices, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorBatchStatusResponse) {
            OperatorBatchStatusResponse operatorBatchStatusResponse = (OperatorBatchStatusResponse) obj;
            return Intrinsics.areEqual(this.batchId, operatorBatchStatusResponse.batchId) && Intrinsics.areEqual(this.jobId, operatorBatchStatusResponse.jobId) && this.failedCount == operatorBatchStatusResponse.failedCount && Intrinsics.areEqual(this.failMessage, operatorBatchStatusResponse.failMessage) && this.successCount == operatorBatchStatusResponse.successCount && Intrinsics.areEqual(this.successMessage, operatorBatchStatusResponse.successMessage) && this.birdCount == operatorBatchStatusResponse.birdCount && this.action == operatorBatchStatusResponse.action && this.state == operatorBatchStatusResponse.state && this.kind == operatorBatchStatusResponse.kind && Intrinsics.areEqual(this.errors, operatorBatchStatusResponse.errors) && Intrinsics.areEqual(this.notices, operatorBatchStatusResponse.notices) && Intrinsics.areEqual(this.batchNotice, operatorBatchStatusResponse.batchNotice);
        }
        return false;
    }

    public final OpsBatchJobActionKind getAction() {
        return this.action;
    }

    public final String getBatchId() {
        return this.batchId;
    }

    public final String getBatchNotice() {
        return this.batchNotice;
    }

    public final int getBirdCount() {
        return this.birdCount;
    }

    public final List<OperatorBatchError> getErrors() {
        return this.errors;
    }

    public final String getFailMessage() {
        return this.failMessage;
    }

    public final int getFailedCount() {
        return this.failedCount;
    }

    public final String getJobId() {
        return this.jobId;
    }

    public final OpsBatchJobKind getKind() {
        return this.kind;
    }

    public final List<OperatorBatchNotice> getNotices() {
        return this.notices;
    }

    public final OpsBatchJobStatus getState() {
        return this.state;
    }

    public final int getSuccessCount() {
        return this.successCount;
    }

    public final String getSuccessMessage() {
        return this.successMessage;
    }

    public int hashCode() {
        String str = this.batchId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.jobId;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.failedCount)) * 31;
        String str3 = this.failMessage;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.successCount)) * 31;
        String str4 = this.successMessage;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.birdCount)) * 31;
        OpsBatchJobActionKind opsBatchJobActionKind = this.action;
        int hashCode5 = (((((((((hashCode4 + (opsBatchJobActionKind == null ? 0 : opsBatchJobActionKind.hashCode())) * 31) + this.state.hashCode()) * 31) + this.kind.hashCode()) * 31) + this.errors.hashCode()) * 31) + this.notices.hashCode()) * 31;
        String str5 = this.batchNotice;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.batchId;
        String str2 = this.jobId;
        int i = this.failedCount;
        String str3 = this.failMessage;
        int i2 = this.successCount;
        String str4 = this.successMessage;
        int i3 = this.birdCount;
        OpsBatchJobActionKind opsBatchJobActionKind = this.action;
        OpsBatchJobStatus opsBatchJobStatus = this.state;
        OpsBatchJobKind opsBatchJobKind = this.kind;
        List<OperatorBatchError> list = this.errors;
        List<OperatorBatchNotice> list2 = this.notices;
        String str5 = this.batchNotice;
        return "OperatorBatchStatusResponse(batchId=" + str + ", jobId=" + str2 + ", failedCount=" + i + ", failMessage=" + str3 + ", successCount=" + i2 + ", successMessage=" + str4 + ", birdCount=" + i3 + ", action=" + opsBatchJobActionKind + ", state=" + opsBatchJobStatus + ", kind=" + opsBatchJobKind + ", errors=" + list + ", notices=" + list2 + ", batchNotice=" + str5 + ")";
    }

    public OperatorBatchStatusResponse(String str, String str2, int i, String str3, int i2, String str4, int i3, OpsBatchJobActionKind opsBatchJobActionKind, OpsBatchJobStatus state, OpsBatchJobKind kind, List<OperatorBatchError> errors, List<OperatorBatchNotice> notices, String str5) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(errors, "errors");
        Intrinsics.checkNotNullParameter(notices, "notices");
        this.batchId = str;
        this.jobId = str2;
        this.failedCount = i;
        this.failMessage = str3;
        this.successCount = i2;
        this.successMessage = str4;
        this.birdCount = i3;
        this.action = opsBatchJobActionKind;
        this.state = state;
        this.kind = kind;
        this.errors = errors;
        this.notices = notices;
        this.batchNotice = str5;
    }

    public /* synthetic */ OperatorBatchStatusResponse(String str, String str2, int i, String str3, int i2, String str4, int i3, OpsBatchJobActionKind opsBatchJobActionKind, OpsBatchJobStatus opsBatchJobStatus, OpsBatchJobKind opsBatchJobKind, List list, List list2, String str5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? null : str3, (i4 & 16) == 0 ? i2 : 0, (i4 & 32) != 0 ? null : str4, (i4 & 64) != 0 ? 9 : i3, (i4 & 128) != 0 ? null : opsBatchJobActionKind, (i4 & 256) != 0 ? OpsBatchJobStatus.INVALID : opsBatchJobStatus, (i4 & 512) != 0 ? OpsBatchJobKind.INVALID : opsBatchJobKind, (i4 & 1024) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i4 & 2048) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i4 & 4096) == 0 ? str5 : null);
    }
}
