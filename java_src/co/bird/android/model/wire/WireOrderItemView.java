package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.OrderItemType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/wire/WireOrderItemView;", "", "date", "Lorg/joda/time/DateTime;", "details", "", "Lco/bird/android/model/wire/WireOrderItemViewDetail;", "itemId", "", "title", "type", "Lco/bird/android/model/constant/OrderItemType;", "(Lorg/joda/time/DateTime;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/OrderItemType;)V", "getDate", "()Lorg/joda/time/DateTime;", "getDetails", "()Ljava/util/List;", "getItemId", "()Ljava/lang/String;", "getTitle", "getType", "()Lco/bird/android/model/constant/OrderItemType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireOrderItemView {
    @JsonProperty("date")
    @InterfaceC41208ft5("date")
    private final DateTime date;
    @JsonProperty("details")
    @InterfaceC41208ft5("details")
    private final List<WireOrderItemViewDetail> details;
    @JsonProperty("item_id")
    @InterfaceC41208ft5("item_id")
    private final String itemId;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("type")
    @InterfaceC41208ft5("type")
    private final OrderItemType type;

    public WireOrderItemView() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ WireOrderItemView copy$default(WireOrderItemView wireOrderItemView, DateTime dateTime, List list, String str, String str2, OrderItemType orderItemType, int i, Object obj) {
        if ((i & 1) != 0) {
            dateTime = wireOrderItemView.date;
        }
        List<WireOrderItemViewDetail> list2 = list;
        if ((i & 2) != 0) {
            list2 = wireOrderItemView.details;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            str = wireOrderItemView.itemId;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = wireOrderItemView.title;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            orderItemType = wireOrderItemView.type;
        }
        return wireOrderItemView.copy(dateTime, list3, str3, str4, orderItemType);
    }

    public final DateTime component1() {
        return this.date;
    }

    public final List<WireOrderItemViewDetail> component2() {
        return this.details;
    }

    public final String component3() {
        return this.itemId;
    }

    public final String component4() {
        return this.title;
    }

    public final OrderItemType component5() {
        return this.type;
    }

    public final WireOrderItemView copy(DateTime date, List<WireOrderItemViewDetail> details, String itemId, String title, OrderItemType type) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        return new WireOrderItemView(date, details, itemId, title, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireOrderItemView) {
            WireOrderItemView wireOrderItemView = (WireOrderItemView) obj;
            return Intrinsics.areEqual(this.date, wireOrderItemView.date) && Intrinsics.areEqual(this.details, wireOrderItemView.details) && Intrinsics.areEqual(this.itemId, wireOrderItemView.itemId) && Intrinsics.areEqual(this.title, wireOrderItemView.title) && this.type == wireOrderItemView.type;
        }
        return false;
    }

    public final DateTime getDate() {
        return this.date;
    }

    public final List<WireOrderItemViewDetail> getDetails() {
        return this.details;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final OrderItemType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((this.date.hashCode() * 31) + this.details.hashCode()) * 31) + this.itemId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        DateTime dateTime = this.date;
        List<WireOrderItemViewDetail> list = this.details;
        String str = this.itemId;
        String str2 = this.title;
        OrderItemType orderItemType = this.type;
        return "WireOrderItemView(date=" + dateTime + ", details=" + list + ", itemId=" + str + ", title=" + str2 + ", type=" + orderItemType + ")";
    }

    public WireOrderItemView(DateTime date, List<WireOrderItemViewDetail> details, String itemId, String title, OrderItemType type) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        this.date = date;
        this.details = details;
        this.itemId = itemId;
        this.title = title;
        this.type = type;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireOrderItemView(DateTime dateTime, List list, String str, String str2, OrderItemType orderItemType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dateTime, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? OrderItemType.UNKNOWN : orderItemType);
        if ((i & 1) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
