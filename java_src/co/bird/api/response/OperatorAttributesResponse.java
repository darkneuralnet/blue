package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lco/bird/api/response/OperatorAttributesResponse;", "", "taskLimit", "", "(Ljava/lang/Integer;)V", "getTaskLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lco/bird/api/response/OperatorAttributesResponse;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorAttributesResponse {
    @JsonProperty("task_limit")
    @InterfaceC41208ft5("task_limit")
    private final Integer taskLimit;

    public OperatorAttributesResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ OperatorAttributesResponse copy$default(OperatorAttributesResponse operatorAttributesResponse, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = operatorAttributesResponse.taskLimit;
        }
        return operatorAttributesResponse.copy(num);
    }

    public final Integer component1() {
        return this.taskLimit;
    }

    public final OperatorAttributesResponse copy(Integer num) {
        return new OperatorAttributesResponse(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OperatorAttributesResponse) && Intrinsics.areEqual(this.taskLimit, ((OperatorAttributesResponse) obj).taskLimit);
    }

    public final Integer getTaskLimit() {
        return this.taskLimit;
    }

    public int hashCode() {
        Integer num = this.taskLimit;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        Integer num = this.taskLimit;
        return "OperatorAttributesResponse(taskLimit=" + num + ")";
    }

    public OperatorAttributesResponse(Integer num) {
        this.taskLimit = num;
    }

    public /* synthetic */ OperatorAttributesResponse(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}