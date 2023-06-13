package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/OrderItemViewDetail;", "", "detail", "", "color", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDetail", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lco/bird/android/model/persistence/nestedstructures/OrderItemViewDetail;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OrderItemViewDetail {
    @JsonProperty("color")
    @InterfaceC41208ft5("color")
    private final Integer color;
    @JsonProperty("detail")
    @InterfaceC41208ft5("detail")
    private final String detail;

    public OrderItemViewDetail() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ OrderItemViewDetail copy$default(OrderItemViewDetail orderItemViewDetail, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderItemViewDetail.detail;
        }
        if ((i & 2) != 0) {
            num = orderItemViewDetail.color;
        }
        return orderItemViewDetail.copy(str, num);
    }

    public final String component1() {
        return this.detail;
    }

    public final Integer component2() {
        return this.color;
    }

    public final OrderItemViewDetail copy(String detail, Integer num) {
        Intrinsics.checkNotNullParameter(detail, "detail");
        return new OrderItemViewDetail(detail, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OrderItemViewDetail) {
            OrderItemViewDetail orderItemViewDetail = (OrderItemViewDetail) obj;
            return Intrinsics.areEqual(this.detail, orderItemViewDetail.detail) && Intrinsics.areEqual(this.color, orderItemViewDetail.color);
        }
        return false;
    }

    public final Integer getColor() {
        return this.color;
    }

    public final String getDetail() {
        return this.detail;
    }

    public int hashCode() {
        int hashCode = this.detail.hashCode() * 31;
        Integer num = this.color;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.detail;
        Integer num = this.color;
        return "OrderItemViewDetail(detail=" + str + ", color=" + num + ")";
    }

    public OrderItemViewDetail(String detail, Integer num) {
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.detail = detail;
        this.color = num;
    }

    public /* synthetic */ OrderItemViewDetail(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num);
    }
}
