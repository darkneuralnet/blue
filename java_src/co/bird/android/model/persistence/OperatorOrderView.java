package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.OperatorOrderViewType;
import co.bird.android.model.persistence.nestedstructures.OperatorOrderViewDetail;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0018J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u00102\u001a\u00020\u0016HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\rHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0010HÆ\u0003J¥\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010=\u001a\u00020\u00162\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0010HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006A"}, m28432d2 = {"Lco/bird/android/model/persistence/OperatorOrderView;", "", "orderId", "", "appointmentDate", "Lorg/joda/time/DateTime;", "locationName", "locationAddress", "details", "", "Lco/bird/android/model/persistence/nestedstructures/OperatorOrderViewDetail;", "instructions", "type", "Lco/bird/android/model/constant/OperatorOrderViewType;", "listDescription", "quantity", "", "section", "bolStatusText", "bolStatusColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "bolUploaded", "", "containerOrderId", "(Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/constant/OperatorOrderViewType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ZLjava/lang/String;)V", "getAppointmentDate", "()Lorg/joda/time/DateTime;", "getBolStatusColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getBolStatusText", "()Ljava/lang/String;", "getBolUploaded", "()Z", "getContainerOrderId", "getDetails", "()Ljava/util/List;", "getInstructions", "getListDescription", "getLocationAddress", "getLocationName", "getOrderId", "getQuantity", "()I", "getSection", "getType", "()Lco/bird/android/model/constant/OperatorOrderViewType;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorOrderView {
    private final DateTime appointmentDate;
    private final ThemedColors bolStatusColor;
    private final String bolStatusText;
    private final boolean bolUploaded;
    private final String containerOrderId;
    private final List<OperatorOrderViewDetail> details;
    private final String instructions;
    private final String listDescription;
    private final String locationAddress;
    private final String locationName;
    private final String orderId;
    private final int quantity;
    private final String section;
    private final OperatorOrderViewType type;

    public OperatorOrderView(String orderId, DateTime appointmentDate, String locationName, String locationAddress, List<OperatorOrderViewDetail> details, String str, OperatorOrderViewType type, String str2, int i, String section, String str3, ThemedColors themedColors, boolean z, String str4) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(appointmentDate, "appointmentDate");
        Intrinsics.checkNotNullParameter(locationName, "locationName");
        Intrinsics.checkNotNullParameter(locationAddress, "locationAddress");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(section, "section");
        this.orderId = orderId;
        this.appointmentDate = appointmentDate;
        this.locationName = locationName;
        this.locationAddress = locationAddress;
        this.details = details;
        this.instructions = str;
        this.type = type;
        this.listDescription = str2;
        this.quantity = i;
        this.section = section;
        this.bolStatusText = str3;
        this.bolStatusColor = themedColors;
        this.bolUploaded = z;
        this.containerOrderId = str4;
    }

    public final String component1() {
        return this.orderId;
    }

    public final String component10() {
        return this.section;
    }

    public final String component11() {
        return this.bolStatusText;
    }

    public final ThemedColors component12() {
        return this.bolStatusColor;
    }

    public final boolean component13() {
        return this.bolUploaded;
    }

    public final String component14() {
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

    public final List<OperatorOrderViewDetail> component5() {
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

    public final OperatorOrderView copy(String orderId, DateTime appointmentDate, String locationName, String locationAddress, List<OperatorOrderViewDetail> details, String str, OperatorOrderViewType type, String str2, int i, String section, String str3, ThemedColors themedColors, boolean z, String str4) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(appointmentDate, "appointmentDate");
        Intrinsics.checkNotNullParameter(locationName, "locationName");
        Intrinsics.checkNotNullParameter(locationAddress, "locationAddress");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(section, "section");
        return new OperatorOrderView(orderId, appointmentDate, locationName, locationAddress, details, str, type, str2, i, section, str3, themedColors, z, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorOrderView) {
            OperatorOrderView operatorOrderView = (OperatorOrderView) obj;
            return Intrinsics.areEqual(this.orderId, operatorOrderView.orderId) && Intrinsics.areEqual(this.appointmentDate, operatorOrderView.appointmentDate) && Intrinsics.areEqual(this.locationName, operatorOrderView.locationName) && Intrinsics.areEqual(this.locationAddress, operatorOrderView.locationAddress) && Intrinsics.areEqual(this.details, operatorOrderView.details) && Intrinsics.areEqual(this.instructions, operatorOrderView.instructions) && this.type == operatorOrderView.type && Intrinsics.areEqual(this.listDescription, operatorOrderView.listDescription) && this.quantity == operatorOrderView.quantity && Intrinsics.areEqual(this.section, operatorOrderView.section) && Intrinsics.areEqual(this.bolStatusText, operatorOrderView.bolStatusText) && Intrinsics.areEqual(this.bolStatusColor, operatorOrderView.bolStatusColor) && this.bolUploaded == operatorOrderView.bolUploaded && Intrinsics.areEqual(this.containerOrderId, operatorOrderView.containerOrderId);
        }
        return false;
    }

    public final DateTime getAppointmentDate() {
        return this.appointmentDate;
    }

    public final ThemedColors getBolStatusColor() {
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

    public final List<OperatorOrderViewDetail> getDetails() {
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

    public final String getSection() {
        return this.section;
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
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.quantity)) * 31) + this.section.hashCode()) * 31;
        String str3 = this.bolStatusText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ThemedColors themedColors = this.bolStatusColor;
        int hashCode5 = (hashCode4 + (themedColors == null ? 0 : themedColors.hashCode())) * 31;
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
        List<OperatorOrderViewDetail> list = this.details;
        String str4 = this.instructions;
        OperatorOrderViewType operatorOrderViewType = this.type;
        String str5 = this.listDescription;
        int i = this.quantity;
        String str6 = this.section;
        String str7 = this.bolStatusText;
        ThemedColors themedColors = this.bolStatusColor;
        boolean z = this.bolUploaded;
        String str8 = this.containerOrderId;
        return "OperatorOrderView(orderId=" + str + ", appointmentDate=" + dateTime + ", locationName=" + str2 + ", locationAddress=" + str3 + ", details=" + list + ", instructions=" + str4 + ", type=" + operatorOrderViewType + ", listDescription=" + str5 + ", quantity=" + i + ", section=" + str6 + ", bolStatusText=" + str7 + ", bolStatusColor=" + themedColors + ", bolUploaded=" + z + ", containerOrderId=" + str8 + ")";
    }
}
