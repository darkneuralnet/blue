package co.bird.android.model.contractor;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/contractor/ContractorPrivileges;", "", "chargeTaskLimit", "", "captureBlock", "Lco/bird/android/model/contractor/CaptureBlockEvaluation;", "(Ljava/lang/Integer;Lco/bird/android/model/contractor/CaptureBlockEvaluation;)V", "getCaptureBlock", "()Lco/bird/android/model/contractor/CaptureBlockEvaluation;", "getChargeTaskLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Integer;Lco/bird/android/model/contractor/CaptureBlockEvaluation;)Lco/bird/android/model/contractor/ContractorPrivileges;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ContractorPrivileges {
    @JsonProperty("capture_block")
    @InterfaceC41208ft5("capture_block")
    private final CaptureBlockEvaluation captureBlock;
    @JsonProperty("charge_task_limit")
    @InterfaceC41208ft5("charge_task_limit")
    private final Integer chargeTaskLimit;

    public ContractorPrivileges() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ContractorPrivileges copy$default(ContractorPrivileges contractorPrivileges, Integer num, CaptureBlockEvaluation captureBlockEvaluation, int i, Object obj) {
        if ((i & 1) != 0) {
            num = contractorPrivileges.chargeTaskLimit;
        }
        if ((i & 2) != 0) {
            captureBlockEvaluation = contractorPrivileges.captureBlock;
        }
        return contractorPrivileges.copy(num, captureBlockEvaluation);
    }

    public final Integer component1() {
        return this.chargeTaskLimit;
    }

    public final CaptureBlockEvaluation component2() {
        return this.captureBlock;
    }

    public final ContractorPrivileges copy(Integer num, CaptureBlockEvaluation captureBlockEvaluation) {
        return new ContractorPrivileges(num, captureBlockEvaluation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractorPrivileges) {
            ContractorPrivileges contractorPrivileges = (ContractorPrivileges) obj;
            return Intrinsics.areEqual(this.chargeTaskLimit, contractorPrivileges.chargeTaskLimit) && Intrinsics.areEqual(this.captureBlock, contractorPrivileges.captureBlock);
        }
        return false;
    }

    public final CaptureBlockEvaluation getCaptureBlock() {
        return this.captureBlock;
    }

    public final Integer getChargeTaskLimit() {
        return this.chargeTaskLimit;
    }

    public int hashCode() {
        Integer num = this.chargeTaskLimit;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        CaptureBlockEvaluation captureBlockEvaluation = this.captureBlock;
        return hashCode + (captureBlockEvaluation != null ? captureBlockEvaluation.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.chargeTaskLimit;
        CaptureBlockEvaluation captureBlockEvaluation = this.captureBlock;
        return "ContractorPrivileges(chargeTaskLimit=" + num + ", captureBlock=" + captureBlockEvaluation + ")";
    }

    public ContractorPrivileges(Integer num, CaptureBlockEvaluation captureBlockEvaluation) {
        this.chargeTaskLimit = num;
        this.captureBlock = captureBlockEvaluation;
    }

    public /* synthetic */ ContractorPrivileges(Integer num, CaptureBlockEvaluation captureBlockEvaluation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : captureBlockEvaluation);
    }
}
