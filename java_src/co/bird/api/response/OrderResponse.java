package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b*\u0010+J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003J^\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010\nR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b)\u0010\u001d¨\u0006,"}, m28432d2 = {"Lco/bird/api/response/OrderResponse;", "", "", "component1", "Lco/bird/api/response/OrderStatus;", "component2", "Lorg/joda/time/DateTime;", "component3", "", "component4", "()Ljava/lang/Integer;", "", "component5", "component6", "id", "status", "createdAt", "quantity", "items", "trackingNumber", "copy", "(Ljava/lang/String;Lco/bird/api/response/OrderStatus;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)Lco/bird/api/response/OrderResponse;", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lco/bird/api/response/OrderStatus;", "getStatus", "()Lco/bird/api/response/OrderStatus;", "Lorg/joda/time/DateTime;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "Ljava/lang/Integer;", "getQuantity", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getTrackingNumber", "<init>", "(Ljava/lang/String;Lco/bird/api/response/OrderStatus;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class OrderResponse {
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68222id;
    @JsonProperty("items")
    @InterfaceC41208ft5("items")
    private final List<Object> items;
    @JsonProperty("quantity")
    @InterfaceC41208ft5("quantity")
    private final Integer quantity;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final OrderStatus status;
    @JsonProperty("tracking_number")
    @InterfaceC41208ft5("tracking_number")
    private final String trackingNumber;

    public OrderResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ OrderResponse copy$default(OrderResponse orderResponse, String str, OrderStatus orderStatus, DateTime dateTime, Integer num, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderResponse.f68222id;
        }
        if ((i & 2) != 0) {
            orderStatus = orderResponse.status;
        }
        OrderStatus orderStatus2 = orderStatus;
        if ((i & 4) != 0) {
            dateTime = orderResponse.createdAt;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 8) != 0) {
            num = orderResponse.quantity;
        }
        Integer num2 = num;
        List<Object> list2 = list;
        if ((i & 16) != 0) {
            list2 = orderResponse.items;
        }
        List list3 = list2;
        if ((i & 32) != 0) {
            str2 = orderResponse.trackingNumber;
        }
        return orderResponse.copy(str, orderStatus2, dateTime2, num2, list3, str2);
    }

    public final String component1() {
        return this.f68222id;
    }

    public final OrderStatus component2() {
        return this.status;
    }

    public final DateTime component3() {
        return this.createdAt;
    }

    public final Integer component4() {
        return this.quantity;
    }

    public final List<Object> component5() {
        return this.items;
    }

    public final String component6() {
        return this.trackingNumber;
    }

    public final OrderResponse copy(String str, OrderStatus orderStatus, DateTime dateTime, Integer num, List<Object> list, String str2) {
        return new OrderResponse(str, orderStatus, dateTime, num, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OrderResponse) {
            OrderResponse orderResponse = (OrderResponse) obj;
            return Intrinsics.areEqual(this.f68222id, orderResponse.f68222id) && this.status == orderResponse.status && Intrinsics.areEqual(this.createdAt, orderResponse.createdAt) && Intrinsics.areEqual(this.quantity, orderResponse.quantity) && Intrinsics.areEqual(this.items, orderResponse.items) && Intrinsics.areEqual(this.trackingNumber, orderResponse.trackingNumber);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f68222id;
    }

    public final List<Object> getItems() {
        return this.items;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final OrderStatus getStatus() {
        return this.status;
    }

    public final String getTrackingNumber() {
        return this.trackingNumber;
    }

    public int hashCode() {
        String str = this.f68222id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        OrderStatus orderStatus = this.status;
        int hashCode2 = (hashCode + (orderStatus == null ? 0 : orderStatus.hashCode())) * 31;
        DateTime dateTime = this.createdAt;
        int hashCode3 = (hashCode2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Integer num = this.quantity;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<Object> list = this.items;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.trackingNumber;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f68222id;
        OrderStatus orderStatus = this.status;
        DateTime dateTime = this.createdAt;
        Integer num = this.quantity;
        List<Object> list = this.items;
        String str2 = this.trackingNumber;
        return "OrderResponse(id=" + str + ", status=" + orderStatus + ", createdAt=" + dateTime + ", quantity=" + num + ", items=" + list + ", trackingNumber=" + str2 + ")";
    }

    public OrderResponse(String str, OrderStatus orderStatus, DateTime dateTime, Integer num, List<Object> list, String str2) {
        this.f68222id = str;
        this.status = orderStatus;
        this.createdAt = dateTime;
        this.quantity = num;
        this.items = list;
        this.trackingNumber = str2;
    }

    public /* synthetic */ OrderResponse(String str, OrderStatus orderStatus, DateTime dateTime, Integer num, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : orderStatus, (i & 4) != 0 ? null : dateTime, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str2);
    }
}
