package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m28432d2 = {"Lco/bird/api/response/InventoryLocationSku;", "", "sku", "Lco/bird/api/response/Sku;", "count", "Lco/bird/api/response/InventoryLocationCount;", "metric", "Lco/bird/api/response/InventoryLocationMetric;", "(Lco/bird/api/response/Sku;Lco/bird/api/response/InventoryLocationCount;Lco/bird/api/response/InventoryLocationMetric;)V", "getCount", "()Lco/bird/api/response/InventoryLocationCount;", "getMetric", "()Lco/bird/api/response/InventoryLocationMetric;", "getSku", "()Lco/bird/api/response/Sku;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class InventoryLocationSku {
    @JsonProperty("count")
    @InterfaceC41208ft5("count")
    private final InventoryLocationCount count;
    @JsonProperty("metric")
    @InterfaceC41208ft5("metric")
    private final InventoryLocationMetric metric;
    @JsonProperty("sku")
    @InterfaceC41208ft5("sku")
    private final Sku sku;

    public InventoryLocationSku(Sku sku, InventoryLocationCount inventoryLocationCount, InventoryLocationMetric inventoryLocationMetric) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.sku = sku;
        this.count = inventoryLocationCount;
        this.metric = inventoryLocationMetric;
    }

    public static /* synthetic */ InventoryLocationSku copy$default(InventoryLocationSku inventoryLocationSku, Sku sku, InventoryLocationCount inventoryLocationCount, InventoryLocationMetric inventoryLocationMetric, int i, Object obj) {
        if ((i & 1) != 0) {
            sku = inventoryLocationSku.sku;
        }
        if ((i & 2) != 0) {
            inventoryLocationCount = inventoryLocationSku.count;
        }
        if ((i & 4) != 0) {
            inventoryLocationMetric = inventoryLocationSku.metric;
        }
        return inventoryLocationSku.copy(sku, inventoryLocationCount, inventoryLocationMetric);
    }

    public final Sku component1() {
        return this.sku;
    }

    public final InventoryLocationCount component2() {
        return this.count;
    }

    public final InventoryLocationMetric component3() {
        return this.metric;
    }

    public final InventoryLocationSku copy(Sku sku, InventoryLocationCount inventoryLocationCount, InventoryLocationMetric inventoryLocationMetric) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        return new InventoryLocationSku(sku, inventoryLocationCount, inventoryLocationMetric);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InventoryLocationSku) {
            InventoryLocationSku inventoryLocationSku = (InventoryLocationSku) obj;
            return Intrinsics.areEqual(this.sku, inventoryLocationSku.sku) && Intrinsics.areEqual(this.count, inventoryLocationSku.count) && Intrinsics.areEqual(this.metric, inventoryLocationSku.metric);
        }
        return false;
    }

    public final InventoryLocationCount getCount() {
        return this.count;
    }

    public final InventoryLocationMetric getMetric() {
        return this.metric;
    }

    public final Sku getSku() {
        return this.sku;
    }

    public int hashCode() {
        int hashCode = this.sku.hashCode() * 31;
        InventoryLocationCount inventoryLocationCount = this.count;
        int hashCode2 = (hashCode + (inventoryLocationCount == null ? 0 : inventoryLocationCount.hashCode())) * 31;
        InventoryLocationMetric inventoryLocationMetric = this.metric;
        return hashCode2 + (inventoryLocationMetric != null ? inventoryLocationMetric.hashCode() : 0);
    }

    public String toString() {
        Sku sku = this.sku;
        InventoryLocationCount inventoryLocationCount = this.count;
        InventoryLocationMetric inventoryLocationMetric = this.metric;
        return "InventoryLocationSku(sku=" + sku + ", count=" + inventoryLocationCount + ", metric=" + inventoryLocationMetric + ")";
    }

    public /* synthetic */ InventoryLocationSku(Sku sku, InventoryLocationCount inventoryLocationCount, InventoryLocationMetric inventoryLocationMetric, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sku, (i & 2) != 0 ? null : inventoryLocationCount, (i & 4) != 0 ? null : inventoryLocationMetric);
    }
}
