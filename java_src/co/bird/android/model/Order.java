package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/Order;", "", "id", "Ljava/util/UUID;", "status", "Lco/bird/android/model/OrderStatus;", "createdAt", "Lorg/joda/time/DateTime;", "(Ljava/util/UUID;Lco/bird/android/model/OrderStatus;Lorg/joda/time/DateTime;)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/util/UUID;", "getStatus", "()Lco/bird/android/model/OrderStatus;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Order {
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final UUID f66608id;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final OrderStatus status;

    public Order(UUID id, OrderStatus status, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f66608id = id;
        this.status = status;
        this.createdAt = createdAt;
    }

    public static /* synthetic */ Order copy$default(Order order, UUID uuid, OrderStatus orderStatus, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = order.f66608id;
        }
        if ((i & 2) != 0) {
            orderStatus = order.status;
        }
        if ((i & 4) != 0) {
            dateTime = order.createdAt;
        }
        return order.copy(uuid, orderStatus, dateTime);
    }

    public final UUID component1() {
        return this.f66608id;
    }

    public final OrderStatus component2() {
        return this.status;
    }

    public final DateTime component3() {
        return this.createdAt;
    }

    public final Order copy(UUID id, OrderStatus status, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new Order(id, status, createdAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Order) {
            Order order = (Order) obj;
            return Intrinsics.areEqual(this.f66608id, order.f66608id) && this.status == order.status && Intrinsics.areEqual(this.createdAt, order.createdAt);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final UUID getId() {
        return this.f66608id;
    }

    public final OrderStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.f66608id.hashCode() * 31) + this.status.hashCode()) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        UUID uuid = this.f66608id;
        OrderStatus orderStatus = this.status;
        DateTime dateTime = this.createdAt;
        return "Order(id=" + uuid + ", status=" + orderStatus + ", createdAt=" + dateTime + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Order(UUID uuid, OrderStatus orderStatus, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, orderStatus, dateTime);
        orderStatus = (i & 2) != 0 ? OrderStatus.PENDING : orderStatus;
        if ((i & 4) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
