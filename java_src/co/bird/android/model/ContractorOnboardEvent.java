package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/model/ContractorOnboardEvent;", "", "id", "", "userId", "stepId", "completedAt", "Lorg/joda/time/DateTime;", "value", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "getCompletedAt", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getStepId", "getUserId", "getValue", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ContractorOnboardEvent {
    @JsonProperty("completed_at")
    @InterfaceC41208ft5("completed_at")
    private final DateTime completedAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66580id;
    @JsonProperty("step_id")
    @InterfaceC41208ft5("step_id")
    private final String stepId;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;
    @JsonProperty("value")
    @InterfaceC41208ft5("value")
    private final String value;

    public ContractorOnboardEvent() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ContractorOnboardEvent copy$default(ContractorOnboardEvent contractorOnboardEvent, String str, String str2, String str3, DateTime dateTime, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractorOnboardEvent.f66580id;
        }
        if ((i & 2) != 0) {
            str2 = contractorOnboardEvent.userId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = contractorOnboardEvent.stepId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            dateTime = contractorOnboardEvent.completedAt;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 16) != 0) {
            str4 = contractorOnboardEvent.value;
        }
        return contractorOnboardEvent.copy(str, str5, str6, dateTime2, str4);
    }

    public final String component1() {
        return this.f66580id;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.stepId;
    }

    public final DateTime component4() {
        return this.completedAt;
    }

    public final String component5() {
        return this.value;
    }

    public final ContractorOnboardEvent copy(String id, String userId, String stepId, DateTime completedAt, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(completedAt, "completedAt");
        return new ContractorOnboardEvent(id, userId, stepId, completedAt, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractorOnboardEvent) {
            ContractorOnboardEvent contractorOnboardEvent = (ContractorOnboardEvent) obj;
            return Intrinsics.areEqual(this.f66580id, contractorOnboardEvent.f66580id) && Intrinsics.areEqual(this.userId, contractorOnboardEvent.userId) && Intrinsics.areEqual(this.stepId, contractorOnboardEvent.stepId) && Intrinsics.areEqual(this.completedAt, contractorOnboardEvent.completedAt) && Intrinsics.areEqual(this.value, contractorOnboardEvent.value);
        }
        return false;
    }

    public final DateTime getCompletedAt() {
        return this.completedAt;
    }

    public final String getId() {
        return this.f66580id;
    }

    public final String getStepId() {
        return this.stepId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = ((((((this.f66580id.hashCode() * 31) + this.userId.hashCode()) * 31) + this.stepId.hashCode()) * 31) + this.completedAt.hashCode()) * 31;
        String str = this.value;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f66580id;
        String str2 = this.userId;
        String str3 = this.stepId;
        DateTime dateTime = this.completedAt;
        String str4 = this.value;
        return "ContractorOnboardEvent(id=" + str + ", userId=" + str2 + ", stepId=" + str3 + ", completedAt=" + dateTime + ", value=" + str4 + ")";
    }

    public ContractorOnboardEvent(String id, String userId, String stepId, DateTime completedAt, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(completedAt, "completedAt");
        this.f66580id = id;
        this.userId = userId;
        this.stepId = stepId;
        this.completedAt = completedAt;
        this.value = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ContractorOnboardEvent(String str, String str2, String str3, DateTime dateTime, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r10, r1, r0, dateTime, (i & 16) != 0 ? null : str4);
        String str5 = (i & 1) != 0 ? "" : str;
        String str6 = (i & 2) != 0 ? "" : str2;
        String str7 = (i & 4) == 0 ? str3 : "";
        if ((i & 8) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
