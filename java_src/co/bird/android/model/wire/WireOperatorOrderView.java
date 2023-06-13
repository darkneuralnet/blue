package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.OperatorOrderViewType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010/\u001a\u00020\u0015HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\rHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0010HÆ\u0003J\u009b\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010:\u001a\u00020\u00152\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0010HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006>"}, m28432d2 = {"Lco/bird/android/model/wire/WireOperatorOrderView;", "", "orderId", "", "appointmentDate", "Lorg/joda/time/DateTime;", "locationName", "locationAddress", "details", "", "Lco/bird/android/model/wire/WireOperatorOrderViewDetail;", "instructions", "type", "Lco/bird/android/model/constant/OperatorOrderViewType;", "listDescription", "quantity", "", "bolStatusText", "bolStatusColor", "Lco/bird/android/model/wire/WireThemedColors;", "bolUploaded", "", "containerOrderId", "(Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/constant/OperatorOrderViewType;Ljava/lang/String;ILjava/lang/String;Lco/bird/android/model/wire/WireThemedColors;ZLjava/lang/String;)V", "getAppointmentDate", "()Lorg/joda/time/DateTime;", "getBolStatusColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getBolStatusText", "()Ljava/lang/String;", "getBolUploaded", "()Z", "getContainerOrderId", "getDetails", "()Ljava/util/List;", "getInstructions", "getListDescription", "getLocationAddress", "getLocationName", "getOrderId", "getQuantity", "()I", "getType", "()Lco/bird/android/model/constant/OperatorOrderViewType;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireOperatorOrderView {
    @JsonProperty("appointment_date")
    @InterfaceC41208ft5("appointment_date")
    private final DateTime appointmentDate;
    @JsonProperty("bol_status_color")
    @InterfaceC41208ft5("bol_status_color")
    private final WireThemedColors bolStatusColor;
    @JsonProperty("bol_status_text")
    @InterfaceC41208ft5("bol_status_text")
    private final String bolStatusText;
    @JsonProperty("bol_uploaded")
    @InterfaceC41208ft5("bol_uploaded")
    private final boolean bolUploaded;
    @JsonProperty("container_order_id")
    @InterfaceC41208ft5("container_order_id")
    private final String containerOrderId;
    @JsonProperty("details")
    @InterfaceC41208ft5("details")
    private final List<WireOperatorOrderViewDetail> details;
    @JsonProperty("instructions")
    @InterfaceC41208ft5("instructions")
    private final String instructions;
    @JsonProperty("list_description")
    @InterfaceC41208ft5("list_description")
    private final String listDescription;
    @JsonProperty("location_address")
    @InterfaceC41208ft5("location_address")
    private final String locationAddress;
    @JsonProperty("location_name")
    @InterfaceC41208ft5("location_name")
    private final String locationName;
    @JsonProperty("order_id")
    @InterfaceC41208ft5("order_id")
    private final String orderId;
    @JsonProperty("quantity")
    @InterfaceC41208ft5("quantity")
    private final int quantity;
    @JsonProperty("type")
    @InterfaceC41208ft5("type")
    private final OperatorOrderViewType type;

    public WireOperatorOrderView() {
        this(null, null, null, null, null, null, null, null, 0, null, null, false, null, 8191, null);
    }

    public final String component1() {
        return this.orderId;
    }

    public final String component10() {
        return this.bolStatusText;
    }

    public final WireThemedColors component11() {
        return this.bolStatusColor;
    }

    public final boolean component12() {
        return this.bolUploaded;
    }

    public final String component13() {
        return this.containerOrderId;
    }

    public final DateTime component2() {
        return this.appointmentDate;
    }

    public final String component3() {
        return this.locationName;
    }

    public final String component4() {
        return this.locationAddress;
    }

    public final List<WireOperatorOrderViewDetail> component5() {
        return this.details;
    }

    public final String component6() {
        return this.instructions;
    }

    public final OperatorOrderViewType component7() {
        return this.type;
    }

    public final String component8() {
        return this.listDescription;
    }

    public final int component9() {
        return this.quantity;
    }

    public final WireOperatorOrderView copy(String orderId, DateTime appointmentDate, String locationName, String locationAddress, List<WireOperatorOrderViewDetail> details, String str, OperatorOrderViewType type, String str2, int i, String str3, WireThemedColors wireThemedColors, boolean z, String str4) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(appointmentDate, "appointmentDate");
        Intrinsics.checkNotNullParameter(locationName, "locationName");
        Intrinsics.checkNotNullParameter(locationAddress, "locationAddress");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(type, "type");
        return new WireOperatorOrderView(orderId, appointmentDate, locationName, locationAddress, details, str, type, str2, i, str3, wireThemedColors, z, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireOperatorOrderView) {
            WireOperatorOrderView wireOperatorOrderView = (WireOperatorOrderView) obj;
            return Intrinsics.areEqual(this.orderId, wireOperatorOrderView.orderId) && Intrinsics.areEqual(this.appointmentDate, wireOperatorOrderView.appointmentDate) && Intrinsics.areEqual(this.locationName, wireOperatorOrderView.locationName) && Intrinsics.areEqual(this.locationAddress, wireOperatorOrderView.locationAddress) && Intrinsics.areEqual(this.details, wireOperatorOrderView.details) && Intrinsics.areEqual(this.instructions, wireOperatorOrderView.instructions) && this.type == wireOperatorOrderView.type && Intrinsics.areEqual(this.listDescription, wireOperatorOrderView.listDescription) && this.quantity == wireOperatorOrderView.quantity && Intrinsics.areEqual(this.bolStatusText, wireOperatorOrderView.bolStatusText) && Intrinsics.areEqual(this.bolStatusColor, wireOperatorOrderView.bolStatusColor) && this.bolUploaded == wireOperatorOrderView.bolUploaded && Intrinsics.areEqual(this.containerOrderId, wireOperatorOrderView.containerOrderId);
        }
        return false;
    }

    public final DateTime getAppointmentDate() {
        return this.appointmentDate;
    }

    public final WireThemedColors getBolStatusColor() {
        return this.bolStatusColor;
    }

    public final String getBolStatusText() {
        return this.bolStatusText;
    }

    public final boolean getBolUploaded() {
        return this.bolUploaded;
    }

    public final String getContainerOrderId() {
        return this.containerOrderId;
    }

    public final List<WireOperatorOrderViewDetail> getDetails() {
        return this.details;
    }

    public final String getInstructions() {
        return this.instructions;
    }

    public final String getListDescription() {
        return this.listDescription;
    }

    public final String getLocationAddress() {
        return this.locationAddress;
    }

    public final String getLocationName() {
        return this.locationName;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final OperatorOrderViewType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.orderId.hashCode() * 31) + this.appointmentDate.hashCode()) * 31) + this.locationName.hashCode()) * 31) + this.locationAddress.hashCode()) * 31) + this.details.hashCode()) * 31;
        String str = this.instructions;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode()) * 31;
        String str2 = this.listDescription;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.quantity)) * 31;
        String str3 = this.bolStatusText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        WireThemedColors wireThemedColors = this.bolStatusColor;
        int hashCode5 = (hashCode4 + (wireThemedColors == null ? 0 : wireThemedColors.hashCode())) * 31;
        boolean z = this.bolUploaded;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        String str4 = this.containerOrderId;
        return i2 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.orderId;
        DateTime dateTime = this.appointmentDate;
        String str2 = this.locationName;
        String str3 = this.locationAddress;
        List<WireOperatorOrderViewDetail> list = this.details;
        String str4 = this.instructions;
        OperatorOrderViewType operatorOrderViewType = this.type;
        String str5 = this.listDescription;
        int i = this.quantity;
        String str6 = this.bolStatusText;
        WireThemedColors wireThemedColors = this.bolStatusColor;
        boolean z = this.bolUploaded;
        String str7 = this.containerOrderId;
        return "WireOperatorOrderView(orderId=" + str + ", appointmentDate=" + dateTime + ", locationName=" + str2 + ", locationAddress=" + str3 + ", details=" + list + ", instructions=" + str4 + ", type=" + operatorOrderViewType + ", listDescription=" + str5 + ", quantity=" + i + ", bolStatusText=" + str6 + ", bolStatusColor=" + wireThemedColors + ", bolUploaded=" + z + ", containerOrderId=" + str7 + ")";
    }

    public WireOperatorOrderView(String orderId, DateTime appointmentDate, String locationName, String locationAddress, List<WireOperatorOrderViewDetail> details, String str, OperatorOrderViewType type, String str2, int i, String str3, WireThemedColors wireThemedColors, boolean z, String str4) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(appointmentDate, "appointmentDate");
        Intrinsics.checkNotNullParameter(locationName, "locationName");
        Intrinsics.checkNotNullParameter(locationAddress, "locationAddress");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(type, "type");
        this.orderId = orderId;
        this.appointmentDate = appointmentDate;
        this.locationName = locationName;
        this.locationAddress = locationAddress;
        this.details = details;
        this.instructions = str;
        this.type = type;
        this.listDescription = str2;
        this.quantity = i;
        this.bolStatusText = str3;
        this.bolStatusColor = wireThemedColors;
        this.bolUploaded = z;
        this.containerOrderId = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireOperatorOrderView(String str, DateTime dateTime, String str2, String str3, List list, String str4, OperatorOrderViewType operatorOrderViewType, String str5, int i, String str6, WireThemedColors wireThemedColors, boolean z, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, (i2 & 4) != 0 ? "" : str2, (i2 & 8) == 0 ? str3 : "", (i2 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? OperatorOrderViewType.UNKNOWN : operatorOrderViewType, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? null : str6, (i2 & 1024) != 0 ? null : wireThemedColors, (i2 & 2048) == 0 ? z : false, (i2 & 4096) == 0 ? str7 : null);
        DateTime dateTime2;
        String str8 = (i2 & 1) != 0 ? "" : str;
        if ((i2 & 2) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        } else {
            dateTime2 = dateTime;
        }
    }
}
