package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireScrapOrderView;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m28432d2 = {"Lco/bird/api/response/ScrapOrderViewResponse;", "", "orders", "", "Lco/bird/android/model/wire/WireScrapOrderView;", "(Ljava/util/List;)V", "getOrders", "()Ljava/util/List;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ScrapOrderViewResponse {
    @JsonProperty("orders")
    @InterfaceC41208ft5("orders")
    private final List<WireScrapOrderView> orders;

    public ScrapOrderViewResponse(List<WireScrapOrderView> orders) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.orders = orders;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScrapOrderViewResponse copy$default(ScrapOrderViewResponse scrapOrderViewResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = scrapOrderViewResponse.orders;
        }
        return scrapOrderViewResponse.copy(list);
    }

    public final List<WireScrapOrderView> component1() {
        return this.orders;
    }

    public final ScrapOrderViewResponse copy(List<WireScrapOrderView> orders) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        return new ScrapOrderViewResponse(orders);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScrapOrderViewResponse) && Intrinsics.areEqual(this.orders, ((ScrapOrderViewResponse) obj).orders);
    }

    public final List<WireScrapOrderView> getOrders() {
        return this.orders;
    }

    public int hashCode() {
        return this.orders.hashCode();
    }

    public String toString() {
        List<WireScrapOrderView> list = this.orders;
        return "ScrapOrderViewResponse(orders=" + list + ")";
    }
}
