package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u000eHÆ\u0003J`\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\tHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, m28432d2 = {"Lco/bird/android/model/wire/WireScrapOrderView;", "", "orderId", "", "containerOrderId", "details", "", "Lco/bird/android/model/wire/WireOrderItemViewDetail;", "quantity", "", "bolUploaded", "", "bolStatusText", "bolStatusColor", "Lco/bird/android/model/wire/WireThemedColors;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/String;Lco/bird/android/model/wire/WireThemedColors;)V", "getBolStatusColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getBolStatusText", "()Ljava/lang/String;", "getBolUploaded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getContainerOrderId", "getDetails", "()Ljava/util/List;", "getOrderId", "getQuantity", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/String;Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/wire/WireScrapOrderView;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireScrapOrderView {
    @JsonProperty("bol_status_color")
    @InterfaceC41208ft5("bol_status_color")
    private final WireThemedColors bolStatusColor;
    @JsonProperty("bol_status_text")
    @InterfaceC41208ft5("bol_status_text")
    private final String bolStatusText;
    @JsonProperty("bol_uploaded")
    @InterfaceC41208ft5("bol_uploaded")
    private final Boolean bolUploaded;
    @JsonProperty("container_order_id")
    @InterfaceC41208ft5("container_order_id")
    private final String containerOrderId;
    @JsonProperty("details")
    @InterfaceC41208ft5("details")
    private final List<WireOrderItemViewDetail> details;
    @JsonProperty("order_id")
    @InterfaceC41208ft5("order_id")
    private final String orderId;
    @JsonProperty("quantity")
    @InterfaceC41208ft5("quantity")
    private final int quantity;

    public WireScrapOrderView() {
        this(null, null, null, 0, null, null, null, 127, null);
    }

    public static /* synthetic */ WireScrapOrderView copy$default(WireScrapOrderView wireScrapOrderView, String str, String str2, List list, int i, Boolean bool, String str3, WireThemedColors wireThemedColors, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = wireScrapOrderView.orderId;
        }
        if ((i2 & 2) != 0) {
            str2 = wireScrapOrderView.containerOrderId;
        }
        String str4 = str2;
        List<WireOrderItemViewDetail> list2 = list;
        if ((i2 & 4) != 0) {
            list2 = wireScrapOrderView.details;
        }
        List list3 = list2;
        if ((i2 & 8) != 0) {
            i = wireScrapOrderView.quantity;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            bool = wireScrapOrderView.bolUploaded;
        }
        Boolean bool2 = bool;
        if ((i2 & 32) != 0) {
            str3 = wireScrapOrderView.bolStatusText;
        }
        String str5 = str3;
        if ((i2 & 64) != 0) {
            wireThemedColors = wireScrapOrderView.bolStatusColor;
        }
        return wireScrapOrderView.copy(str, str4, list3, i3, bool2, str5, wireThemedColors);
    }

    public final String component1() {
        return this.orderId;
    }

    public final String component2() {
        return this.containerOrderId;
    }

    public final List<WireOrderItemViewDetail> component3() {
        return this.details;
    }

    public final int component4() {
        return this.quantity;
    }

    public final Boolean component5() {
        return this.bolUploaded;
    }

    public final String component6() {
        return this.bolStatusText;
    }

    public final WireThemedColors component7() {
        return this.bolStatusColor;
    }

    public final WireScrapOrderView copy(String orderId, String str, List<WireOrderItemViewDetail> details, int i, Boolean bool, String str2, WireThemedColors bolStatusColor) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(bolStatusColor, "bolStatusColor");
        return new WireScrapOrderView(orderId, str, details, i, bool, str2, bolStatusColor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireScrapOrderView) {
            WireScrapOrderView wireScrapOrderView = (WireScrapOrderView) obj;
            return Intrinsics.areEqual(this.orderId, wireScrapOrderView.orderId) && Intrinsics.areEqual(this.containerOrderId, wireScrapOrderView.containerOrderId) && Intrinsics.areEqual(this.details, wireScrapOrderView.details) && this.quantity == wireScrapOrderView.quantity && Intrinsics.areEqual(this.bolUploaded, wireScrapOrderView.bolUploaded) && Intrinsics.areEqual(this.bolStatusText, wireScrapOrderView.bolStatusText) && Intrinsics.areEqual(this.bolStatusColor, wireScrapOrderView.bolStatusColor);
        }
        return false;
    }

    public final WireThemedColors getBolStatusColor() {
        return this.bolStatusColor;
    }

    public final String getBolStatusText() {
        return this.bolStatusText;
    }

    public final Boolean getBolUploaded() {
        return this.bolUploaded;
    }

    public final String getContainerOrderId() {
        return this.containerOrderId;
    }

    public final List<WireOrderItemViewDetail> getDetails() {
        return this.details;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        int hashCode = this.orderId.hashCode() * 31;
        String str = this.containerOrderId;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.details.hashCode()) * 31) + Integer.hashCode(this.quantity)) * 31;
        Boolean bool = this.bolUploaded;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.bolStatusText;
        return ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.bolStatusColor.hashCode();
    }

    public String toString() {
        String str = this.orderId;
        String str2 = this.containerOrderId;
        List<WireOrderItemViewDetail> list = this.details;
        int i = this.quantity;
        Boolean bool = this.bolUploaded;
        String str3 = this.bolStatusText;
        WireThemedColors wireThemedColors = this.bolStatusColor;
        return "WireScrapOrderView(orderId=" + str + ", containerOrderId=" + str2 + ", details=" + list + ", quantity=" + i + ", bolUploaded=" + bool + ", bolStatusText=" + str3 + ", bolStatusColor=" + wireThemedColors + ")";
    }

    public WireScrapOrderView(String orderId, String str, List<WireOrderItemViewDetail> details, int i, Boolean bool, String str2, WireThemedColors bolStatusColor) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(bolStatusColor, "bolStatusColor");
        this.orderId = orderId;
        this.containerOrderId = str;
        this.details = details;
        this.quantity = i;
        this.bolUploaded = bool;
        this.bolStatusText = str2;
        this.bolStatusColor = bolStatusColor;
    }

    public /* synthetic */ WireScrapOrderView(String str, String str2, List list, int i, Boolean bool, String str3, WireThemedColors wireThemedColors, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors);
    }
}
