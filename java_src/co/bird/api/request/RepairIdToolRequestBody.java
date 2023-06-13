package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PartKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m28432d2 = {"Lco/bird/api/request/RepairIdToolRequestBody;", "", "birdId", "", "partKind", "Lco/bird/android/model/constant/PartKind;", RequestHeadersFactory.MODEL, "(Ljava/lang/String;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)V", "getBirdId", "()Ljava/lang/String;", "getModel", "getPartKind", "()Lco/bird/android/model/constant/PartKind;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RepairIdToolRequestBody {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty(RequestHeadersFactory.MODEL)
    @InterfaceC41208ft5(RequestHeadersFactory.MODEL)
    private final String model;
    @JsonProperty("part_kind")
    @InterfaceC41208ft5("part_kind")
    private final PartKind partKind;

    public RepairIdToolRequestBody(String birdId, PartKind partKind, String model) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(partKind, "partKind");
        Intrinsics.checkNotNullParameter(model, "model");
        this.birdId = birdId;
        this.partKind = partKind;
        this.model = model;
    }

    public static /* synthetic */ RepairIdToolRequestBody copy$default(RepairIdToolRequestBody repairIdToolRequestBody, String str, PartKind partKind, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = repairIdToolRequestBody.birdId;
        }
        if ((i & 2) != 0) {
            partKind = repairIdToolRequestBody.partKind;
        }
        if ((i & 4) != 0) {
            str2 = repairIdToolRequestBody.model;
        }
        return repairIdToolRequestBody.copy(str, partKind, str2);
    }

    public final String component1() {
        return this.birdId;
    }

    public final PartKind component2() {
        return this.partKind;
    }

    public final String component3() {
        return this.model;
    }

    public final RepairIdToolRequestBody copy(String birdId, PartKind partKind, String model) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(partKind, "partKind");
        Intrinsics.checkNotNullParameter(model, "model");
        return new RepairIdToolRequestBody(birdId, partKind, model);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RepairIdToolRequestBody) {
            RepairIdToolRequestBody repairIdToolRequestBody = (RepairIdToolRequestBody) obj;
            return Intrinsics.areEqual(this.birdId, repairIdToolRequestBody.birdId) && this.partKind == repairIdToolRequestBody.partKind && Intrinsics.areEqual(this.model, repairIdToolRequestBody.model);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getModel() {
        return this.model;
    }

    public final PartKind getPartKind() {
        return this.partKind;
    }

    public int hashCode() {
        return (((this.birdId.hashCode() * 31) + this.partKind.hashCode()) * 31) + this.model.hashCode();
    }

    public String toString() {
        String str = this.birdId;
        PartKind partKind = this.partKind;
        String str2 = this.model;
        return "RepairIdToolRequestBody(birdId=" + str + ", partKind=" + partKind + ", model=" + str2 + ")";
    }
}
