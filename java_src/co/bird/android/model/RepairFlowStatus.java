package co.bird.android.model;

import co.bird.android.model.constant.RepairStep;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/RepairFlowStatus;", "", "flow", "Lco/bird/android/model/constant/RepairStep;", "(Lco/bird/android/model/constant/RepairStep;)V", "getFlow", "()Lco/bird/android/model/constant/RepairStep;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RepairFlowStatus {
    @JsonProperty("flow")
    @InterfaceC41208ft5("flow")
    private final RepairStep flow;

    public RepairFlowStatus() {
        this(null, 1, null);
    }

    public static /* synthetic */ RepairFlowStatus copy$default(RepairFlowStatus repairFlowStatus, RepairStep repairStep, int i, Object obj) {
        if ((i & 1) != 0) {
            repairStep = repairFlowStatus.flow;
        }
        return repairFlowStatus.copy(repairStep);
    }

    public final RepairStep component1() {
        return this.flow;
    }

    public final RepairFlowStatus copy(RepairStep flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        return new RepairFlowStatus(flow);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RepairFlowStatus) && this.flow == ((RepairFlowStatus) obj).flow;
    }

    public final RepairStep getFlow() {
        return this.flow;
    }

    public int hashCode() {
        return this.flow.hashCode();
    }

    public String toString() {
        RepairStep repairStep = this.flow;
        return "RepairFlowStatus(flow=" + repairStep + ")";
    }

    public RepairFlowStatus(RepairStep flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.flow = flow;
    }

    public /* synthetic */ RepairFlowStatus(RepairStep repairStep, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RepairStep.UNKNOWN : repairStep);
    }
}
