package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.InspectionFlow;
import co.bird.android.model.constant.RepairFlow;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;", "", "enableInspection", "", "inspectionFlow", "Lco/bird/android/model/constant/InspectionFlow;", "enableRepair", "repairFlow", "Lco/bird/android/model/constant/RepairFlow;", "enableWorkOrderHistory", "pastWorkOrdersDisplayCount", "", "(ZLco/bird/android/model/constant/InspectionFlow;ZLco/bird/android/model/constant/RepairFlow;ZI)V", "getEnableInspection", "()Z", "getEnableRepair", "getEnableWorkOrderHistory", "getInspectionFlow", "()Lco/bird/android/model/constant/InspectionFlow;", "getPastWorkOrdersDisplayCount", "()I", "getRepairFlow", "()Lco/bird/android/model/constant/RepairFlow;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorWorkOrderConfig {
    @JsonProperty("enable_inspection")
    @InterfaceC41208ft5("enable_inspection")
    private final boolean enableInspection;
    @JsonProperty("enable_repair")
    @InterfaceC41208ft5("enable_repair")
    private final boolean enableRepair;
    @JsonProperty("enable_work_order_history")
    @InterfaceC41208ft5("enable_work_order_history")
    private final boolean enableWorkOrderHistory;
    @JsonProperty("inspection_flow")
    @InterfaceC41208ft5("inspection_flow")
    private final InspectionFlow inspectionFlow;
    @JsonProperty("past_work_orders_display_count")
    @InterfaceC41208ft5("past_work_orders_display_count")
    private final int pastWorkOrdersDisplayCount;
    @JsonProperty("repair_flow")
    @InterfaceC41208ft5("repair_flow")
    private final RepairFlow repairFlow;

    public OperatorWorkOrderConfig() {
        this(false, null, false, null, false, 0, 63, null);
    }

    public static /* synthetic */ OperatorWorkOrderConfig copy$default(OperatorWorkOrderConfig operatorWorkOrderConfig, boolean z, InspectionFlow inspectionFlow, boolean z2, RepairFlow repairFlow, boolean z3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = operatorWorkOrderConfig.enableInspection;
        }
        if ((i2 & 2) != 0) {
            inspectionFlow = operatorWorkOrderConfig.inspectionFlow;
        }
        InspectionFlow inspectionFlow2 = inspectionFlow;
        if ((i2 & 4) != 0) {
            z2 = operatorWorkOrderConfig.enableRepair;
        }
        boolean z4 = z2;
        if ((i2 & 8) != 0) {
            repairFlow = operatorWorkOrderConfig.repairFlow;
        }
        RepairFlow repairFlow2 = repairFlow;
        if ((i2 & 16) != 0) {
            z3 = operatorWorkOrderConfig.enableWorkOrderHistory;
        }
        boolean z5 = z3;
        if ((i2 & 32) != 0) {
            i = operatorWorkOrderConfig.pastWorkOrdersDisplayCount;
        }
        return operatorWorkOrderConfig.copy(z, inspectionFlow2, z4, repairFlow2, z5, i);
    }

    public final boolean component1() {
        return this.enableInspection;
    }

    public final InspectionFlow component2() {
        return this.inspectionFlow;
    }

    public final boolean component3() {
        return this.enableRepair;
    }

    public final RepairFlow component4() {
        return this.repairFlow;
    }

    public final boolean component5() {
        return this.enableWorkOrderHistory;
    }

    public final int component6() {
        return this.pastWorkOrdersDisplayCount;
    }

    public final OperatorWorkOrderConfig copy(boolean z, InspectionFlow inspectionFlow, boolean z2, RepairFlow repairFlow, boolean z3, int i) {
        Intrinsics.checkNotNullParameter(inspectionFlow, "inspectionFlow");
        Intrinsics.checkNotNullParameter(repairFlow, "repairFlow");
        return new OperatorWorkOrderConfig(z, inspectionFlow, z2, repairFlow, z3, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorWorkOrderConfig) {
            OperatorWorkOrderConfig operatorWorkOrderConfig = (OperatorWorkOrderConfig) obj;
            return this.enableInspection == operatorWorkOrderConfig.enableInspection && this.inspectionFlow == operatorWorkOrderConfig.inspectionFlow && this.enableRepair == operatorWorkOrderConfig.enableRepair && this.repairFlow == operatorWorkOrderConfig.repairFlow && this.enableWorkOrderHistory == operatorWorkOrderConfig.enableWorkOrderHistory && this.pastWorkOrdersDisplayCount == operatorWorkOrderConfig.pastWorkOrdersDisplayCount;
        }
        return false;
    }

    public final boolean getEnableInspection() {
        return this.enableInspection;
    }

    public final boolean getEnableRepair() {
        return this.enableRepair;
    }

    public final boolean getEnableWorkOrderHistory() {
        return this.enableWorkOrderHistory;
    }

    public final InspectionFlow getInspectionFlow() {
        return this.inspectionFlow;
    }

    public final int getPastWorkOrdersDisplayCount() {
        return this.pastWorkOrdersDisplayCount;
    }

    public final RepairFlow getRepairFlow() {
        return this.repairFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z = this.enableInspection;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((r0 * 31) + this.inspectionFlow.hashCode()) * 31;
        ?? r2 = this.enableRepair;
        int i = r2;
        if (r2 != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.repairFlow.hashCode()) * 31;
        boolean z2 = this.enableWorkOrderHistory;
        return ((hashCode2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Integer.hashCode(this.pastWorkOrdersDisplayCount);
    }

    public String toString() {
        boolean z = this.enableInspection;
        InspectionFlow inspectionFlow = this.inspectionFlow;
        boolean z2 = this.enableRepair;
        RepairFlow repairFlow = this.repairFlow;
        boolean z3 = this.enableWorkOrderHistory;
        int i = this.pastWorkOrdersDisplayCount;
        return "OperatorWorkOrderConfig(enableInspection=" + z + ", inspectionFlow=" + inspectionFlow + ", enableRepair=" + z2 + ", repairFlow=" + repairFlow + ", enableWorkOrderHistory=" + z3 + ", pastWorkOrdersDisplayCount=" + i + ")";
    }

    public OperatorWorkOrderConfig(boolean z, InspectionFlow inspectionFlow, boolean z2, RepairFlow repairFlow, boolean z3, int i) {
        Intrinsics.checkNotNullParameter(inspectionFlow, "inspectionFlow");
        Intrinsics.checkNotNullParameter(repairFlow, "repairFlow");
        this.enableInspection = z;
        this.inspectionFlow = inspectionFlow;
        this.enableRepair = z2;
        this.repairFlow = repairFlow;
        this.enableWorkOrderHistory = z3;
        this.pastWorkOrdersDisplayCount = i;
    }

    public /* synthetic */ OperatorWorkOrderConfig(boolean z, InspectionFlow inspectionFlow, boolean z2, RepairFlow repairFlow, boolean z3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? InspectionFlow.LEGACY : inspectionFlow, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? RepairFlow.LEGACY : repairFlow, (i2 & 16) == 0 ? z3 : false, (i2 & 32) != 0 ? 3 : i);
    }
}
