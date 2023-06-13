package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J]\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006%"}, m28432d2 = {"Lco/bird/api/response/InventoryLocation;", "", "id", "", "warehouseId", "createdAt", "Lorg/joda/time/DateTime;", "name", "description", "metadata", "", "updatedAt", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lorg/joda/time/DateTime;)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getDescription", "()Ljava/lang/String;", "getId", "getMetadata", "()Ljava/util/Map;", "getName", "getUpdatedAt", "getWarehouseId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class InventoryLocation {
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68217id;
    @JsonProperty("metadata")
    @InterfaceC41208ft5("metadata")
    private final Map<String, Object> metadata;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;
    @JsonProperty("warehouse_id")
    @InterfaceC41208ft5("warehouse_id")
    private final String warehouseId;

    public InventoryLocation(String id, String warehouseId, DateTime createdAt, String name, String description, Map<String, ? extends Object> metadata, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f68217id = id;
        this.warehouseId = warehouseId;
        this.createdAt = createdAt;
        this.name = name;
        this.description = description;
        this.metadata = metadata;
        this.updatedAt = dateTime;
    }

    public static /* synthetic */ InventoryLocation copy$default(InventoryLocation inventoryLocation, String str, String str2, DateTime dateTime, String str3, String str4, Map map, DateTime dateTime2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inventoryLocation.f68217id;
        }
        if ((i & 2) != 0) {
            str2 = inventoryLocation.warehouseId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            dateTime = inventoryLocation.createdAt;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 8) != 0) {
            str3 = inventoryLocation.name;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = inventoryLocation.description;
        }
        String str7 = str4;
        Map<String, Object> map2 = map;
        if ((i & 32) != 0) {
            map2 = inventoryLocation.metadata;
        }
        Map map3 = map2;
        if ((i & 64) != 0) {
            dateTime2 = inventoryLocation.updatedAt;
        }
        return inventoryLocation.copy(str, str5, dateTime3, str6, str7, map3, dateTime2);
    }

    public final String component1() {
        return this.f68217id;
    }

    public final String component2() {
        return this.warehouseId;
    }

    public final DateTime component3() {
        return this.createdAt;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.description;
    }

    public final Map<String, Object> component6() {
        return this.metadata;
    }

    public final DateTime component7() {
        return this.updatedAt;
    }

    public final InventoryLocation copy(String id, String warehouseId, DateTime createdAt, String name, String description, Map<String, ? extends Object> metadata, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new InventoryLocation(id, warehouseId, createdAt, name, description, metadata, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InventoryLocation) {
            InventoryLocation inventoryLocation = (InventoryLocation) obj;
            return Intrinsics.areEqual(this.f68217id, inventoryLocation.f68217id) && Intrinsics.areEqual(this.warehouseId, inventoryLocation.warehouseId) && Intrinsics.areEqual(this.createdAt, inventoryLocation.createdAt) && Intrinsics.areEqual(this.name, inventoryLocation.name) && Intrinsics.areEqual(this.description, inventoryLocation.description) && Intrinsics.areEqual(this.metadata, inventoryLocation.metadata) && Intrinsics.areEqual(this.updatedAt, inventoryLocation.updatedAt);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.f68217id;
    }

    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f68217id.hashCode() * 31) + this.warehouseId.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.metadata.hashCode()) * 31;
        DateTime dateTime = this.updatedAt;
        return hashCode + (dateTime == null ? 0 : dateTime.hashCode());
    }

    public String toString() {
        String str = this.f68217id;
        String str2 = this.warehouseId;
        DateTime dateTime = this.createdAt;
        String str3 = this.name;
        String str4 = this.description;
        Map<String, Object> map = this.metadata;
        DateTime dateTime2 = this.updatedAt;
        return "InventoryLocation(id=" + str + ", warehouseId=" + str2 + ", createdAt=" + dateTime + ", name=" + str3 + ", description=" + str4 + ", metadata=" + map + ", updatedAt=" + dateTime2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ InventoryLocation(String str, String str2, DateTime dateTime, String str3, String str4, Map map, DateTime dateTime2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, map, (i & 64) != 0 ? null : dateTime2);
        DateTime dateTime3;
        String str5 = (i & 1) != 0 ? "" : str;
        String str6 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
    }
}
