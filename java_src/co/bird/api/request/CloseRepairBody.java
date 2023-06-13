package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.Resolution;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/api/request/CloseRepairBody;", "", "repairId", "", "closeReason", "Lco/bird/android/model/constant/Resolution;", "(Ljava/lang/String;Lco/bird/android/model/constant/Resolution;)V", "getCloseReason", "()Lco/bird/android/model/constant/Resolution;", "getRepairId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CloseRepairBody {
    @JsonProperty("close_reason")
    @InterfaceC41208ft5("close_reason")
    private final Resolution closeReason;
    @JsonProperty("repair_id")
    @InterfaceC41208ft5("repair_id")
    private final String repairId;

    public CloseRepairBody(String repairId, Resolution closeReason) {
        Intrinsics.checkNotNullParameter(repairId, "repairId");
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        this.repairId = repairId;
        this.closeReason = closeReason;
    }

    public static /* synthetic */ CloseRepairBody copy$default(CloseRepairBody closeRepairBody, String str, Resolution resolution, int i, Object obj) {
        if ((i & 1) != 0) {
            str = closeRepairBody.repairId;
        }
        if ((i & 2) != 0) {
            resolution = closeRepairBody.closeReason;
        }
        return closeRepairBody.copy(str, resolution);
    }

    public final String component1() {
        return this.repairId;
    }

    public final Resolution component2() {
        return this.closeReason;
    }

    public final CloseRepairBody copy(String repairId, Resolution closeReason) {
        Intrinsics.checkNotNullParameter(repairId, "repairId");
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        return new CloseRepairBody(repairId, closeReason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CloseRepairBody) {
            CloseRepairBody closeRepairBody = (CloseRepairBody) obj;
            return Intrinsics.areEqual(this.repairId, closeRepairBody.repairId) && this.closeReason == closeRepairBody.closeReason;
        }
        return false;
    }

    public final Resolution getCloseReason() {
        return this.closeReason;
    }

    public final String getRepairId() {
        return this.repairId;
    }

    public int hashCode() {
        return (this.repairId.hashCode() * 31) + this.closeReason.hashCode();
    }

    public String toString() {
        String str = this.repairId;
        Resolution resolution = this.closeReason;
        return "CloseRepairBody(repairId=" + str + ", closeReason=" + resolution + ")";
    }
}
