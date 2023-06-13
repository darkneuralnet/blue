package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.LoggedRepair;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, m28432d2 = {"Lco/bird/api/request/RepairLogSubmitBody;", "", "birdId", "", "repairer", "types", "", "Lco/bird/android/model/LoggedRepair;", "comment", "repairerRole", "warehouseId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirdId", "()Ljava/lang/String;", "getComment", "getRepairer", "getRepairerRole", "getTypes", "()Ljava/util/List;", "getWarehouseId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RepairLogSubmitBody {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("comment")
    @InterfaceC41208ft5("comment")
    private final String comment;
    @JsonProperty("repairer")
    @InterfaceC41208ft5("repairer")
    private final String repairer;
    @JsonProperty("repairer_role")
    @InterfaceC41208ft5("repairer_role")
    private final String repairerRole;
    @JsonProperty("types")
    @InterfaceC41208ft5("types")
    private final List<LoggedRepair> types;
    @JsonProperty("warehouse_id")
    @InterfaceC41208ft5("warehouse_id")
    private final String warehouseId;

    public RepairLogSubmitBody(String birdId, String repairer, List<LoggedRepair> types, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(repairer, "repairer");
        Intrinsics.checkNotNullParameter(types, "types");
        this.birdId = birdId;
        this.repairer = repairer;
        this.types = types;
        this.comment = str;
        this.repairerRole = str2;
        this.warehouseId = str3;
    }

    public static /* synthetic */ RepairLogSubmitBody copy$default(RepairLogSubmitBody repairLogSubmitBody, String str, String str2, List list, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = repairLogSubmitBody.birdId;
        }
        if ((i & 2) != 0) {
            str2 = repairLogSubmitBody.repairer;
        }
        String str6 = str2;
        List<LoggedRepair> list2 = list;
        if ((i & 4) != 0) {
            list2 = repairLogSubmitBody.types;
        }
        List list3 = list2;
        if ((i & 8) != 0) {
            str3 = repairLogSubmitBody.comment;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = repairLogSubmitBody.repairerRole;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = repairLogSubmitBody.warehouseId;
        }
        return repairLogSubmitBody.copy(str, str6, list3, str7, str8, str5);
    }

    public final String component1() {
        return this.birdId;
    }

    public final String component2() {
        return this.repairer;
    }

    public final List<LoggedRepair> component3() {
        return this.types;
    }

    public final String component4() {
        return this.comment;
    }

    public final String component5() {
        return this.repairerRole;
    }

    public final String component6() {
        return this.warehouseId;
    }

    public final RepairLogSubmitBody copy(String birdId, String repairer, List<LoggedRepair> types, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(repairer, "repairer");
        Intrinsics.checkNotNullParameter(types, "types");
        return new RepairLogSubmitBody(birdId, repairer, types, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RepairLogSubmitBody) {
            RepairLogSubmitBody repairLogSubmitBody = (RepairLogSubmitBody) obj;
            return Intrinsics.areEqual(this.birdId, repairLogSubmitBody.birdId) && Intrinsics.areEqual(this.repairer, repairLogSubmitBody.repairer) && Intrinsics.areEqual(this.types, repairLogSubmitBody.types) && Intrinsics.areEqual(this.comment, repairLogSubmitBody.comment) && Intrinsics.areEqual(this.repairerRole, repairLogSubmitBody.repairerRole) && Intrinsics.areEqual(this.warehouseId, repairLogSubmitBody.warehouseId);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getRepairer() {
        return this.repairer;
    }

    public final String getRepairerRole() {
        return this.repairerRole;
    }

    public final List<LoggedRepair> getTypes() {
        return this.types;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    public int hashCode() {
        int hashCode = ((((this.birdId.hashCode() * 31) + this.repairer.hashCode()) * 31) + this.types.hashCode()) * 31;
        String str = this.comment;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.repairerRole;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.warehouseId;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.birdId;
        String str2 = this.repairer;
        List<LoggedRepair> list = this.types;
        String str3 = this.comment;
        String str4 = this.repairerRole;
        String str5 = this.warehouseId;
        return "RepairLogSubmitBody(birdId=" + str + ", repairer=" + str2 + ", types=" + list + ", comment=" + str3 + ", repairerRole=" + str4 + ", warehouseId=" + str5 + ")";
    }

    public /* synthetic */ RepairLogSubmitBody(String str, String str2, List list, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
