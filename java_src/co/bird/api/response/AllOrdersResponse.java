package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0003J.\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"Lco/bird/api/response/AllOrdersResponse;", "", "", "component1", "()Ljava/lang/Integer;", "", "component2", "total", "items", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lco/bird/api/response/AllOrdersResponse;", "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Integer;", "getTotal", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AllOrdersResponse {
    @JsonProperty("items")
    @InterfaceC41208ft5("items")
    private final List<Object> items;
    @JsonProperty("total")
    @InterfaceC41208ft5("total")
    private final Integer total;

    public AllOrdersResponse() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AllOrdersResponse copy$default(AllOrdersResponse allOrdersResponse, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = allOrdersResponse.total;
        }
        if ((i & 2) != 0) {
            list = allOrdersResponse.items;
        }
        return allOrdersResponse.copy(num, list);
    }

    public final Integer component1() {
        return this.total;
    }

    public final List<Object> component2() {
        return this.items;
    }

    public final AllOrdersResponse copy(Integer num, List<Object> list) {
        return new AllOrdersResponse(num, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AllOrdersResponse) {
            AllOrdersResponse allOrdersResponse = (AllOrdersResponse) obj;
            return Intrinsics.areEqual(this.total, allOrdersResponse.total) && Intrinsics.areEqual(this.items, allOrdersResponse.items);
        }
        return false;
    }

    public final List<Object> getItems() {
        return this.items;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public int hashCode() {
        Integer num = this.total;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<Object> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.total;
        List<Object> list = this.items;
        return "AllOrdersResponse(total=" + num + ", items=" + list + ")";
    }

    public AllOrdersResponse(Integer num, List<Object> list) {
        this.total = num;
        this.items = list;
    }

    public /* synthetic */ AllOrdersResponse(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
