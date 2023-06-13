package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.location.places.Place;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0015\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000eHÆ\u0003J\u0088\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u000bHÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012¨\u00061"}, m28432d2 = {"Lco/bird/api/response/InventoryLocationMetric;", "", "id", "", "sku", "partId", "kitId", "inventoryLocationId", "createdAt", "Lorg/joda/time/DateTime;", "minQuantity", "", "maxQuantity", "metadata", "", "updatedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Lorg/joda/time/DateTime;)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getInventoryLocationId", "getKitId", "getMaxQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMetadata", "()Ljava/util/Map;", "getMinQuantity", "getPartId", "getSku", "getUpdatedAt", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Lorg/joda/time/DateTime;)Lco/bird/api/response/InventoryLocationMetric;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class InventoryLocationMetric {
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68219id;
    @JsonProperty("inventory_location_id")
    @InterfaceC41208ft5("inventory_location_id")
    private final String inventoryLocationId;
    @JsonProperty("kit_id")
    @InterfaceC41208ft5("kit_id")
    private final String kitId;
    @JsonProperty("max_quantity")
    @InterfaceC41208ft5("max_quantity")
    private final Integer maxQuantity;
    @JsonProperty("metadata")
    @InterfaceC41208ft5("metadata")
    private final Map<String, Object> metadata;
    @JsonProperty("min_quantity")
    @InterfaceC41208ft5("min_quantity")
    private final Integer minQuantity;
    @JsonProperty("part_id")
    @InterfaceC41208ft5("part_id")
    private final String partId;
    @JsonProperty("sku")
    @InterfaceC41208ft5("sku")
    private final String sku;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;

    public InventoryLocationMetric() {
        this(null, null, null, null, null, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    public final String component1() {
        return this.f68219id;
    }

    public final DateTime component10() {
        return this.updatedAt;
    }

    public final String component2() {
        return this.sku;
    }

    public final String component3() {
        return this.partId;
    }

    public final String component4() {
        return this.kitId;
    }

    public final String component5() {
        return this.inventoryLocationId;
    }

    public final DateTime component6() {
        return this.createdAt;
    }

    public final Integer component7() {
        return this.minQuantity;
    }

    public final Integer component8() {
        return this.maxQuantity;
    }

    public final Map<String, Object> component9() {
        return this.metadata;
    }

    public final InventoryLocationMetric copy(String id, String sku, String str, String str2, String inventoryLocationId, DateTime createdAt, Integer num, Integer num2, Map<String, ? extends Object> metadata, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(inventoryLocationId, "inventoryLocationId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new InventoryLocationMetric(id, sku, str, str2, inventoryLocationId, createdAt, num, num2, metadata, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InventoryLocationMetric) {
            InventoryLocationMetric inventoryLocationMetric = (InventoryLocationMetric) obj;
            return Intrinsics.areEqual(this.f68219id, inventoryLocationMetric.f68219id) && Intrinsics.areEqual(this.sku, inventoryLocationMetric.sku) && Intrinsics.areEqual(this.partId, inventoryLocationMetric.partId) && Intrinsics.areEqual(this.kitId, inventoryLocationMetric.kitId) && Intrinsics.areEqual(this.inventoryLocationId, inventoryLocationMetric.inventoryLocationId) && Intrinsics.areEqual(this.createdAt, inventoryLocationMetric.createdAt) && Intrinsics.areEqual(this.minQuantity, inventoryLocationMetric.minQuantity) && Intrinsics.areEqual(this.maxQuantity, inventoryLocationMetric.maxQuantity) && Intrinsics.areEqual(this.metadata, inventoryLocationMetric.metadata) && Intrinsics.areEqual(this.updatedAt, inventoryLocationMetric.updatedAt);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f68219id;
    }

    public final String getInventoryLocationId() {
        return this.inventoryLocationId;
    }

    public final String getKitId() {
        return this.kitId;
    }

    public final Integer getMaxQuantity() {
        return this.maxQuantity;
    }

    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public final Integer getMinQuantity() {
        return this.minQuantity;
    }

    public final String getPartId() {
        return this.partId;
    }

    public final String getSku() {
        return this.sku;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode = ((this.f68219id.hashCode() * 31) + this.sku.hashCode()) * 31;
        String str = this.partId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.kitId;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.inventoryLocationId.hashCode()) * 31) + this.createdAt.hashCode()) * 31;
        Integer num = this.minQuantity;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxQuantity;
        int hashCode5 = (((hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.metadata.hashCode()) * 31;
        DateTime dateTime = this.updatedAt;
        return hashCode5 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public String toString() {
        String str = this.f68219id;
        String str2 = this.sku;
        String str3 = this.partId;
        String str4 = this.kitId;
        String str5 = this.inventoryLocationId;
        DateTime dateTime = this.createdAt;
        Integer num = this.minQuantity;
        Integer num2 = this.maxQuantity;
        Map<String, Object> map = this.metadata;
        DateTime dateTime2 = this.updatedAt;
        return "InventoryLocationMetric(id=" + str + ", sku=" + str2 + ", partId=" + str3 + ", kitId=" + str4 + ", inventoryLocationId=" + str5 + ", createdAt=" + dateTime + ", minQuantity=" + num + ", maxQuantity=" + num2 + ", metadata=" + map + ", updatedAt=" + dateTime2 + ")";
    }

    public InventoryLocationMetric(String id, String sku, String str, String str2, String inventoryLocationId, DateTime createdAt, Integer num, Integer num2, Map<String, ? extends Object> metadata, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(inventoryLocationId, "inventoryLocationId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f68219id = id;
        this.sku = sku;
        this.partId = str;
        this.kitId = str2;
        this.inventoryLocationId = inventoryLocationId;
        this.createdAt = createdAt;
        this.minQuantity = num;
        this.maxQuantity = num2;
        this.metadata = metadata;
        this.updatedAt = dateTime;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ InventoryLocationMetric(String str, String str2, String str3, String str4, String str5, DateTime dateTime, Integer num, Integer num2, Map map, DateTime dateTime2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r4, r6, r2, r7, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i & 512) == 0 ? dateTime2 : null);
        DateTime dateTime3;
        String str6 = (i & 1) != 0 ? "" : str;
        String str7 = (i & 2) != 0 ? "" : str2;
        String str8 = (i & 4) != 0 ? null : str3;
        String str9 = (i & 8) != 0 ? null : str4;
        String str10 = (i & 16) == 0 ? str5 : "";
        if ((i & 32) != 0) {
            dateTime3 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime3, "now()");
        } else {
            dateTime3 = dateTime;
        }
    }
}
