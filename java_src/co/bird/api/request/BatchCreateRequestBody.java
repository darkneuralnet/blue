package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28432d2 = {"Lco/bird/api/request/BatchCreateRequestBody;", "", "userId", "", "description", "warehouseId", "batchKind", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBatchKind", "()Ljava/lang/String;", "getDescription", "getUserId", "getWarehouseId", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BatchCreateRequestBody {
    @JsonProperty("batch_kind")
    @InterfaceC41208ft5("batch_kind")
    private final String batchKind;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;
    @JsonProperty("warehouse_id")
    @InterfaceC41208ft5("warehouse_id")
    private final String warehouseId;

    public BatchCreateRequestBody(String userId, String description, String warehouseId, String str) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        this.userId = userId;
        this.description = description;
        this.warehouseId = warehouseId;
        this.batchKind = str;
    }

    public static /* synthetic */ BatchCreateRequestBody copy$default(BatchCreateRequestBody batchCreateRequestBody, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = batchCreateRequestBody.userId;
        }
        if ((i & 2) != 0) {
            str2 = batchCreateRequestBody.description;
        }
        if ((i & 4) != 0) {
            str3 = batchCreateRequestBody.warehouseId;
        }
        if ((i & 8) != 0) {
            str4 = batchCreateRequestBody.batchKind;
        }
        return batchCreateRequestBody.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.warehouseId;
    }

    public final String component4() {
        return this.batchKind;
    }

    public final BatchCreateRequestBody copy(String userId, String description, String warehouseId, String str) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        return new BatchCreateRequestBody(userId, description, warehouseId, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BatchCreateRequestBody) {
            BatchCreateRequestBody batchCreateRequestBody = (BatchCreateRequestBody) obj;
            return Intrinsics.areEqual(this.userId, batchCreateRequestBody.userId) && Intrinsics.areEqual(this.description, batchCreateRequestBody.description) && Intrinsics.areEqual(this.warehouseId, batchCreateRequestBody.warehouseId) && Intrinsics.areEqual(this.batchKind, batchCreateRequestBody.batchKind);
        }
        return false;
    }

    public final String getBatchKind() {
        return this.batchKind;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    public int hashCode() {
        int hashCode = ((((this.userId.hashCode() * 31) + this.description.hashCode()) * 31) + this.warehouseId.hashCode()) * 31;
        String str = this.batchKind;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.description;
        String str3 = this.warehouseId;
        String str4 = this.batchKind;
        return "BatchCreateRequestBody(userId=" + str + ", description=" + str2 + ", warehouseId=" + str3 + ", batchKind=" + str4 + ")";
    }

    public /* synthetic */ BatchCreateRequestBody(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }
}
