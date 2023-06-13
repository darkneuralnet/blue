package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/api/response/OrderSuppliesResponse;", "", "id", "", "status", "Lco/bird/api/response/OrderStatus;", "(Ljava/lang/String;Lco/bird/api/response/OrderStatus;)V", "getId", "()Ljava/lang/String;", "getStatus", "()Lco/bird/api/response/OrderStatus;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OrderSuppliesResponse {
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68223id;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final OrderStatus status;

    public OrderSuppliesResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ OrderSuppliesResponse copy$default(OrderSuppliesResponse orderSuppliesResponse, String str, OrderStatus orderStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderSuppliesResponse.f68223id;
        }
        if ((i & 2) != 0) {
            orderStatus = orderSuppliesResponse.status;
        }
        return orderSuppliesResponse.copy(str, orderStatus);
    }

    public final String component1() {
        return this.f68223id;
    }

    public final OrderStatus component2() {
        return this.status;
    }

    public final OrderSuppliesResponse copy(String str, OrderStatus orderStatus) {
        return new OrderSuppliesResponse(str, orderStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OrderSuppliesResponse) {
            OrderSuppliesResponse orderSuppliesResponse = (OrderSuppliesResponse) obj;
            return Intrinsics.areEqual(this.f68223id, orderSuppliesResponse.f68223id) && this.status == orderSuppliesResponse.status;
        }
        return false;
    }

    public final String getId() {
        return this.f68223id;
    }

    public final OrderStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.f68223id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        OrderStatus orderStatus = this.status;
        return hashCode + (orderStatus != null ? orderStatus.hashCode() : 0);
    }

    public String toString() {
        String str = this.f68223id;
        OrderStatus orderStatus = this.status;
        return "OrderSuppliesResponse(id=" + str + ", status=" + orderStatus + ")";
    }

    public OrderSuppliesResponse(String str, OrderStatus orderStatus) {
        this.f68223id = str;
        this.status = orderStatus;
    }

    public /* synthetic */ OrderSuppliesResponse(String str, OrderStatus orderStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : orderStatus);
    }
}
