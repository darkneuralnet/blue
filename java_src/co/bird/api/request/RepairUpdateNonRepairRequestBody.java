package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/request/RepairUpdateNonRepairRequestBody;", "", "status", "", "reason", "notes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNotes", "()Ljava/lang/String;", "getReason", "getStatus", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RepairUpdateNonRepairRequestBody {
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("reason")
    @InterfaceC41208ft5("reason")
    private final String reason;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final String status;

    public RepairUpdateNonRepairRequestBody(String status, String str, String str2) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.reason = str;
        this.notes = str2;
    }

    public static /* synthetic */ RepairUpdateNonRepairRequestBody copy$default(RepairUpdateNonRepairRequestBody repairUpdateNonRepairRequestBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = repairUpdateNonRepairRequestBody.status;
        }
        if ((i & 2) != 0) {
            str2 = repairUpdateNonRepairRequestBody.reason;
        }
        if ((i & 4) != 0) {
            str3 = repairUpdateNonRepairRequestBody.notes;
        }
        return repairUpdateNonRepairRequestBody.copy(str, str2, str3);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.reason;
    }

    public final String component3() {
        return this.notes;
    }

    public final RepairUpdateNonRepairRequestBody copy(String status, String str, String str2) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new RepairUpdateNonRepairRequestBody(status, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RepairUpdateNonRepairRequestBody) {
            RepairUpdateNonRepairRequestBody repairUpdateNonRepairRequestBody = (RepairUpdateNonRepairRequestBody) obj;
            return Intrinsics.areEqual(this.status, repairUpdateNonRepairRequestBody.status) && Intrinsics.areEqual(this.reason, repairUpdateNonRepairRequestBody.reason) && Intrinsics.areEqual(this.notes, repairUpdateNonRepairRequestBody.notes);
        }
        return false;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.reason;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.notes;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.status;
        String str2 = this.reason;
        String str3 = this.notes;
        return "RepairUpdateNonRepairRequestBody(status=" + str + ", reason=" + str2 + ", notes=" + str3 + ")";
    }
}
