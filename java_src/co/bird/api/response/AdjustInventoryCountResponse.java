package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/api/response/AdjustInventoryCountResponse;", "", "sku", "", "quantity", "", "(Ljava/lang/String;I)V", "getQuantity", "()I", "getSku", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AdjustInventoryCountResponse {
    @JsonProperty("quantity")
    @InterfaceC41208ft5("quantity")
    private final int quantity;
    @JsonProperty("sku")
    @InterfaceC41208ft5("sku")
    private final String sku;

    public AdjustInventoryCountResponse() {
        this(null, 0, 3, null);
    }

    public static /* synthetic */ AdjustInventoryCountResponse copy$default(AdjustInventoryCountResponse adjustInventoryCountResponse, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = adjustInventoryCountResponse.sku;
        }
        if ((i2 & 2) != 0) {
            i = adjustInventoryCountResponse.quantity;
        }
        return adjustInventoryCountResponse.copy(str, i);
    }

    public final String component1() {
        return this.sku;
    }

    public final int component2() {
        return this.quantity;
    }

    public final AdjustInventoryCountResponse copy(String sku, int i) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        return new AdjustInventoryCountResponse(sku, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdjustInventoryCountResponse) {
            AdjustInventoryCountResponse adjustInventoryCountResponse = (AdjustInventoryCountResponse) obj;
            return Intrinsics.areEqual(this.sku, adjustInventoryCountResponse.sku) && this.quantity == adjustInventoryCountResponse.quantity;
        }
        return false;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getSku() {
        return this.sku;
    }

    public int hashCode() {
        return (this.sku.hashCode() * 31) + Integer.hashCode(this.quantity);
    }

    public String toString() {
        String str = this.sku;
        int i = this.quantity;
        return "AdjustInventoryCountResponse(sku=" + str + ", quantity=" + i + ")";
    }

    public AdjustInventoryCountResponse(String sku, int i) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.sku = sku;
        this.quantity = i;
    }

    public /* synthetic */ AdjustInventoryCountResponse(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
