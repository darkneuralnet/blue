package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JH\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/wire/WireVehicleInventoryScan;", "", "scanIdentifier", "", "itemDisplayTitle", "itemDisplayDetail", "battery", "", "failureMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getBattery", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFailureMessage", "()Ljava/lang/String;", "getItemDisplayDetail", "getItemDisplayTitle", "getScanIdentifier", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lco/bird/android/model/wire/WireVehicleInventoryScan;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireVehicleInventoryScan {
    @JsonProperty("battery")
    @InterfaceC41208ft5("battery")
    private final Integer battery;
    @JsonProperty("failure_message")
    @InterfaceC41208ft5("failure_message")
    private final String failureMessage;
    @JsonProperty("item_display_detail")
    @InterfaceC41208ft5("item_display_detail")
    private final String itemDisplayDetail;
    @JsonProperty("item_display_title")
    @InterfaceC41208ft5("item_display_title")
    private final String itemDisplayTitle;
    @JsonProperty("scan_identifier")
    @InterfaceC41208ft5("scan_identifier")
    private final String scanIdentifier;

    public WireVehicleInventoryScan() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ WireVehicleInventoryScan copy$default(WireVehicleInventoryScan wireVehicleInventoryScan, String str, String str2, String str3, Integer num, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireVehicleInventoryScan.scanIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = wireVehicleInventoryScan.itemDisplayTitle;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = wireVehicleInventoryScan.itemDisplayDetail;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            num = wireVehicleInventoryScan.battery;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str4 = wireVehicleInventoryScan.failureMessage;
        }
        return wireVehicleInventoryScan.copy(str, str5, str6, num2, str4);
    }

    public final String component1() {
        return this.scanIdentifier;
    }

    public final String component2() {
        return this.itemDisplayTitle;
    }

    public final String component3() {
        return this.itemDisplayDetail;
    }

    public final Integer component4() {
        return this.battery;
    }

    public final String component5() {
        return this.failureMessage;
    }

    public final WireVehicleInventoryScan copy(String scanIdentifier, String str, String str2, Integer num, String str3) {
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        return new WireVehicleInventoryScan(scanIdentifier, str, str2, num, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireVehicleInventoryScan) {
            WireVehicleInventoryScan wireVehicleInventoryScan = (WireVehicleInventoryScan) obj;
            return Intrinsics.areEqual(this.scanIdentifier, wireVehicleInventoryScan.scanIdentifier) && Intrinsics.areEqual(this.itemDisplayTitle, wireVehicleInventoryScan.itemDisplayTitle) && Intrinsics.areEqual(this.itemDisplayDetail, wireVehicleInventoryScan.itemDisplayDetail) && Intrinsics.areEqual(this.battery, wireVehicleInventoryScan.battery) && Intrinsics.areEqual(this.failureMessage, wireVehicleInventoryScan.failureMessage);
        }
        return false;
    }

    public final Integer getBattery() {
        return this.battery;
    }

    public final String getFailureMessage() {
        return this.failureMessage;
    }

    public final String getItemDisplayDetail() {
        return this.itemDisplayDetail;
    }

    public final String getItemDisplayTitle() {
        return this.itemDisplayTitle;
    }

    public final String getScanIdentifier() {
        return this.scanIdentifier;
    }

    public int hashCode() {
        int hashCode = this.scanIdentifier.hashCode() * 31;
        String str = this.itemDisplayTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.itemDisplayDetail;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.battery;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.failureMessage;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.scanIdentifier;
        String str2 = this.itemDisplayTitle;
        String str3 = this.itemDisplayDetail;
        Integer num = this.battery;
        String str4 = this.failureMessage;
        return "WireVehicleInventoryScan(scanIdentifier=" + str + ", itemDisplayTitle=" + str2 + ", itemDisplayDetail=" + str3 + ", battery=" + num + ", failureMessage=" + str4 + ")";
    }

    public WireVehicleInventoryScan(String scanIdentifier, String str, String str2, Integer num, String str3) {
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        this.scanIdentifier = scanIdentifier;
        this.itemDisplayTitle = str;
        this.itemDisplayDetail = str2;
        this.battery = num;
        this.failureMessage = str3;
    }

    public /* synthetic */ WireVehicleInventoryScan(String str, String str2, String str3, Integer num, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) == 0 ? str4 : null);
    }
}
