package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m28432d2 = {"Lco/bird/api/request/AdjustInventoryCountRequest;", "", "sku", "", "increment", "", "quantity", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getIncrement", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getQuantity", "getSku", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/api/request/AdjustInventoryCountRequest;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AdjustInventoryCountRequest {
    @JsonProperty("increment")
    @InterfaceC41208ft5("increment")
    private final Integer increment;
    @JsonProperty("quantity")
    @InterfaceC41208ft5("quantity")
    private final Integer quantity;
    @JsonProperty("sku")
    @InterfaceC41208ft5("sku")
    private final String sku;

    public AdjustInventoryCountRequest(String sku, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.sku = sku;
        this.increment = num;
        this.quantity = num2;
    }

    public static /* synthetic */ AdjustInventoryCountRequest copy$default(AdjustInventoryCountRequest adjustInventoryCountRequest, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adjustInventoryCountRequest.sku;
        }
        if ((i & 2) != 0) {
            num = adjustInventoryCountRequest.increment;
        }
        if ((i & 4) != 0) {
            num2 = adjustInventoryCountRequest.quantity;
        }
        return adjustInventoryCountRequest.copy(str, num, num2);
    }

    public final String component1() {
        return this.sku;
    }

    public final Integer component2() {
        return this.increment;
    }

    public final Integer component3() {
        return this.quantity;
    }

    public final AdjustInventoryCountRequest copy(String sku, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        return new AdjustInventoryCountRequest(sku, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdjustInventoryCountRequest) {
            AdjustInventoryCountRequest adjustInventoryCountRequest = (AdjustInventoryCountRequest) obj;
            return Intrinsics.areEqual(this.sku, adjustInventoryCountRequest.sku) && Intrinsics.areEqual(this.increment, adjustInventoryCountRequest.increment) && Intrinsics.areEqual(this.quantity, adjustInventoryCountRequest.quantity);
        }
        return false;
    }

    public final Integer getIncrement() {
        return this.increment;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final String getSku() {
        return this.sku;
    }

    public int hashCode() {
        int hashCode = this.sku.hashCode() * 31;
        Integer num = this.increment;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.quantity;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        String str = this.sku;
        Integer num = this.increment;
        Integer num2 = this.quantity;
        return "AdjustInventoryCountRequest(sku=" + str + ", increment=" + num + ", quantity=" + num2 + ")";
    }

    public /* synthetic */ AdjustInventoryCountRequest(String str, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
