package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/RepairLog;", "", "repairerEmail", "", "repairerRole", "repairType", "repairSubType", "createdAt", "createdAtTime", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getCreatedAt$annotations", "()V", "getCreatedAt", "()Ljava/lang/String;", "getCreatedAtTime", "()Lorg/joda/time/DateTime;", "getRepairSubType", "getRepairType", "getRepairerEmail", "getRepairerRole", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RepairLog {
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final String createdAt;
    @JsonProperty("created_at_time")
    @InterfaceC41208ft5("created_at_time")
    private final DateTime createdAtTime;
    @JsonProperty("repair_sub_type")
    @InterfaceC41208ft5("repair_sub_type")
    private final String repairSubType;
    @JsonProperty("repair_type")
    @InterfaceC41208ft5("repair_type")
    private final String repairType;
    @JsonProperty("repairer_email")
    @InterfaceC41208ft5("repairer_email")
    private final String repairerEmail;
    @JsonProperty("repairer_role")
    @InterfaceC41208ft5("repairer_role")
    private final String repairerRole;

    public RepairLog() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ RepairLog copy$default(RepairLog repairLog, String str, String str2, String str3, String str4, String str5, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = repairLog.repairerEmail;
        }
        if ((i & 2) != 0) {
            str2 = repairLog.repairerRole;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = repairLog.repairType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = repairLog.repairSubType;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = repairLog.createdAt;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            dateTime = repairLog.createdAtTime;
        }
        return repairLog.copy(str, str6, str7, str8, str9, dateTime);
    }

    @Deprecated(message = "Use createdAtTime", replaceWith = @ReplaceWith(expression = "createdAtTime", imports = {}))
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public final String component1() {
        return this.repairerEmail;
    }

    public final String component2() {
        return this.repairerRole;
    }

    public final String component3() {
        return this.repairType;
    }

    public final String component4() {
        return this.repairSubType;
    }

    public final String component5() {
        return this.createdAt;
    }

    public final DateTime component6() {
        return this.createdAtTime;
    }

    public final RepairLog copy(String repairerEmail, String repairerRole, String repairType, String str, String str2, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(repairerEmail, "repairerEmail");
        Intrinsics.checkNotNullParameter(repairerRole, "repairerRole");
        Intrinsics.checkNotNullParameter(repairType, "repairType");
        return new RepairLog(repairerEmail, repairerRole, repairType, str, str2, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RepairLog) {
            RepairLog repairLog = (RepairLog) obj;
            return Intrinsics.areEqual(this.repairerEmail, repairLog.repairerEmail) && Intrinsics.areEqual(this.repairerRole, repairLog.repairerRole) && Intrinsics.areEqual(this.repairType, repairLog.repairType) && Intrinsics.areEqual(this.repairSubType, repairLog.repairSubType) && Intrinsics.areEqual(this.createdAt, repairLog.createdAt) && Intrinsics.areEqual(this.createdAtTime, repairLog.createdAtTime);
        }
        return false;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final DateTime getCreatedAtTime() {
        return this.createdAtTime;
    }

    public final String getRepairSubType() {
        return this.repairSubType;
    }

    public final String getRepairType() {
        return this.repairType;
    }

    public final String getRepairerEmail() {
        return this.repairerEmail;
    }

    public final String getRepairerRole() {
        return this.repairerRole;
    }

    public int hashCode() {
        int hashCode = ((((this.repairerEmail.hashCode() * 31) + this.repairerRole.hashCode()) * 31) + this.repairType.hashCode()) * 31;
        String str = this.repairSubType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.createdAt;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DateTime dateTime = this.createdAtTime;
        return hashCode3 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public String toString() {
        String str = this.repairerEmail;
        String str2 = this.repairerRole;
        String str3 = this.repairType;
        String str4 = this.repairSubType;
        String str5 = this.createdAt;
        DateTime dateTime = this.createdAtTime;
        return "RepairLog(repairerEmail=" + str + ", repairerRole=" + str2 + ", repairType=" + str3 + ", repairSubType=" + str4 + ", createdAt=" + str5 + ", createdAtTime=" + dateTime + ")";
    }

    public RepairLog(String repairerEmail, String repairerRole, String repairType, String str, String str2, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(repairerEmail, "repairerEmail");
        Intrinsics.checkNotNullParameter(repairerRole, "repairerRole");
        Intrinsics.checkNotNullParameter(repairType, "repairType");
        this.repairerEmail = repairerEmail;
        this.repairerRole = repairerRole;
        this.repairType = repairType;
        this.repairSubType = str;
        this.createdAt = str2;
        this.createdAtTime = dateTime;
    }

    public /* synthetic */ RepairLog(String str, String str2, String str3, String str4, String str5, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : dateTime);
    }
}
