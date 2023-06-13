package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/api/request/OrderSuppliesBody;", "", "productId", "", "quantity", "", "(Ljava/lang/String;I)V", "getProductId", "()Ljava/lang/String;", "getQuantity", "()I", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OrderSuppliesBody {
    @JsonProperty("product_id")
    @InterfaceC41208ft5("product_id")
    private final String productId;
    @JsonProperty("quantity")
    @InterfaceC41208ft5("quantity")
    private final int quantity;

    public OrderSuppliesBody(String productId, int i) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.productId = productId;
        this.quantity = i;
    }

    public static /* synthetic */ OrderSuppliesBody copy$default(OrderSuppliesBody orderSuppliesBody, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = orderSuppliesBody.productId;
        }
        if ((i2 & 2) != 0) {
            i = orderSuppliesBody.quantity;
        }
        return orderSuppliesBody.copy(str, i);
    }

    public final String component1() {
        return this.productId;
    }

    public final int component2() {
        return this.quantity;
    }

    public final OrderSuppliesBody copy(String productId, int i) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return new OrderSuppliesBody(productId, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OrderSuppliesBody) {
            OrderSuppliesBody orderSuppliesBody = (OrderSuppliesBody) obj;
            return Intrinsics.areEqual(this.productId, orderSuppliesBody.productId) && this.quantity == orderSuppliesBody.quantity;
        }
        return false;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        return (this.productId.hashCode() * 31) + Integer.hashCode(this.quantity);
    }

    public String toString() {
        String str = this.productId;
        int i = this.quantity;
        return "OrderSuppliesBody(productId=" + str + ", quantity=" + i + ")";
    }
}
