package co.bird.android.model.contractor;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/contractor/ContractorOnboardData;", "", "id", "", "userId", "fieldId", "completedAt", "Lorg/joda/time/DateTime;", "value", "deletedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getCompletedAt", "()Lorg/joda/time/DateTime;", "getDeletedAt", "getFieldId", "()Ljava/lang/String;", "getId", "getUserId", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ContractorOnboardData {
    @JsonProperty("completed_at")
    @InterfaceC41208ft5("completed_at")
    private final DateTime completedAt;
    @JsonProperty("deleted_at")
    @InterfaceC41208ft5("deleted_at")
    private final DateTime deletedAt;
    @JsonProperty("field_id")
    @InterfaceC41208ft5("field_id")
    private final String fieldId;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66656id;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;
    @JsonProperty("value")
    @InterfaceC41208ft5("value")
    private final String value;

    public ContractorOnboardData() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ContractorOnboardData copy$default(ContractorOnboardData contractorOnboardData, String str, String str2, String str3, DateTime dateTime, String str4, DateTime dateTime2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractorOnboardData.f66656id;
        }
        if ((i & 2) != 0) {
            str2 = contractorOnboardData.userId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = contractorOnboardData.fieldId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            dateTime = contractorOnboardData.completedAt;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 16) != 0) {
            str4 = contractorOnboardData.value;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            dateTime2 = contractorOnboardData.deletedAt;
        }
        return contractorOnboardData.copy(str, str5, str6, dateTime3, str7, dateTime2);
    }

    public final String component1() {
        return this.f66656id;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.fieldId;
    }

    public final DateTime component4() {
        return this.completedAt;
    }

    public final String component5() {
        return this.value;
    }

    public final DateTime component6() {
        return this.deletedAt;
    }

    public final ContractorOnboardData copy(String id, String userId, String fieldId, DateTime completedAt, String str, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(fieldId, "fieldId");
        Intrinsics.checkNotNullParameter(completedAt, "completedAt");
        return new ContractorOnboardData(id, userId, fieldId, completedAt, str, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractorOnboardData) {
            ContractorOnboardData contractorOnboardData = (ContractorOnboardData) obj;
            return Intrinsics.areEqual(this.f66656id, contractorOnboardData.f66656id) && Intrinsics.areEqual(this.userId, contractorOnboardData.userId) && Intrinsics.areEqual(this.fieldId, contractorOnboardData.fieldId) && Intrinsics.areEqual(this.completedAt, contractorOnboardData.completedAt) && Intrinsics.areEqual(this.value, contractorOnboardData.value) && Intrinsics.areEqual(this.deletedAt, contractorOnboardData.deletedAt);
        }
        return false;
    }

    public final DateTime getCompletedAt() {
        return this.completedAt;
    }

    public final DateTime getDeletedAt() {
        return this.deletedAt;
    }

    public final String getFieldId() {
        return this.fieldId;
    }

    public final String getId() {
        return this.f66656id;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = ((((((this.f66656id.hashCode() * 31) + this.userId.hashCode()) * 31) + this.fieldId.hashCode()) * 31) + this.completedAt.hashCode()) * 31;
        String str = this.value;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DateTime dateTime = this.deletedAt;
        return hashCode2 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66656id;
        String str2 = this.userId;
        String str3 = this.fieldId;
        DateTime dateTime = this.completedAt;
        String str4 = this.value;
        DateTime dateTime2 = this.deletedAt;
        return "ContractorOnboardData(id=" + str + ", userId=" + str2 + ", fieldId=" + str3 + ", completedAt=" + dateTime + ", value=" + str4 + ", deletedAt=" + dateTime2 + ")";
    }

    public ContractorOnboardData(String id, String userId, String fieldId, DateTime completedAt, String str, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(fieldId, "fieldId");
        Intrinsics.checkNotNullParameter(completedAt, "completedAt");
        this.f66656id = id;
        this.userId = userId;
        this.fieldId = fieldId;
        this.completedAt = completedAt;
        this.value = str;
        this.deletedAt = dateTime;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ContractorOnboardData(String str, String str2, String str3, DateTime dateTime, String str4, DateTime dateTime2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r12, r1, r0, dateTime, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : dateTime2);
        String str5 = (i & 1) != 0 ? "" : str;
        String str6 = (i & 2) != 0 ? "" : str2;
        String str7 = (i & 4) == 0 ? str3 : "";
        if ((i & 8) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
