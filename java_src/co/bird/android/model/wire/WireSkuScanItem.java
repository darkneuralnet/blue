package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Je\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006'"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuScanItem;", "", "itemId", "", "itemDisplayName", "itemDisplayCaption", "failureCount", "", "successCount", "bird", "Lco/bird/android/model/wire/WireSkuVehicle;", "errorCode", "scanIdentifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILco/bird/android/model/wire/WireSkuVehicle;Ljava/lang/String;Ljava/lang/String;)V", "getBird", "()Lco/bird/android/model/wire/WireSkuVehicle;", "getErrorCode", "()Ljava/lang/String;", "getFailureCount", "()I", "getItemDisplayCaption", "getItemDisplayName", "getItemId", "getScanIdentifier", "getSuccessCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireSkuScanItem {
    @JsonProperty("bird")
    @InterfaceC41208ft5("bird")
    private final WireSkuVehicle bird;
    @JsonProperty("error_code")
    @InterfaceC41208ft5("error_code")
    private final String errorCode;
    @JsonProperty("failure_count")
    @InterfaceC41208ft5("failure_count")
    private final int failureCount;
    @JsonProperty("item_display_caption")
    @InterfaceC41208ft5("item_display_caption")
    private final String itemDisplayCaption;
    @JsonProperty("item_display_name")
    @InterfaceC41208ft5("item_display_name")
    private final String itemDisplayName;
    @JsonProperty("item_id")
    @InterfaceC41208ft5("item_id")
    private final String itemId;
    @JsonProperty("scan_identifier")
    @InterfaceC41208ft5("scan_identifier")
    private final String scanIdentifier;
    @JsonProperty("success_count")
    @InterfaceC41208ft5("success_count")
    private final int successCount;

    public WireSkuScanItem() {
        this(null, null, null, 0, 0, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final String component1() {
        return this.itemId;
    }

    public final String component2() {
        return this.itemDisplayName;
    }

    public final String component3() {
        return this.itemDisplayCaption;
    }

    public final int component4() {
        return this.failureCount;
    }

    public final int component5() {
        return this.successCount;
    }

    public final WireSkuVehicle component6() {
        return this.bird;
    }

    public final String component7() {
        return this.errorCode;
    }

    public final String component8() {
        return this.scanIdentifier;
    }

    public final WireSkuScanItem copy(String str, String str2, String str3, int i, int i2, WireSkuVehicle wireSkuVehicle, String str4, String str5) {
        return new WireSkuScanItem(str, str2, str3, i, i2, wireSkuVehicle, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireSkuScanItem) {
            WireSkuScanItem wireSkuScanItem = (WireSkuScanItem) obj;
            return Intrinsics.areEqual(this.itemId, wireSkuScanItem.itemId) && Intrinsics.areEqual(this.itemDisplayName, wireSkuScanItem.itemDisplayName) && Intrinsics.areEqual(this.itemDisplayCaption, wireSkuScanItem.itemDisplayCaption) && this.failureCount == wireSkuScanItem.failureCount && this.successCount == wireSkuScanItem.successCount && Intrinsics.areEqual(this.bird, wireSkuScanItem.bird) && Intrinsics.areEqual(this.errorCode, wireSkuScanItem.errorCode) && Intrinsics.areEqual(this.scanIdentifier, wireSkuScanItem.scanIdentifier);
        }
        return false;
    }

    public final WireSkuVehicle getBird() {
        return this.bird;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final int getFailureCount() {
        return this.failureCount;
    }

    public final String getItemDisplayCaption() {
        return this.itemDisplayCaption;
    }

    public final String getItemDisplayName() {
        return this.itemDisplayName;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getScanIdentifier() {
        return this.scanIdentifier;
    }

    public final int getSuccessCount() {
        return this.successCount;
    }

    public int hashCode() {
        String str = this.itemId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.itemDisplayName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.itemDisplayCaption;
        int hashCode3 = (((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.failureCount)) * 31) + Integer.hashCode(this.successCount)) * 31;
        WireSkuVehicle wireSkuVehicle = this.bird;
        int hashCode4 = (hashCode3 + (wireSkuVehicle == null ? 0 : wireSkuVehicle.hashCode())) * 31;
        String str4 = this.errorCode;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.scanIdentifier;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.itemId;
        String str2 = this.itemDisplayName;
        String str3 = this.itemDisplayCaption;
        int i = this.failureCount;
        int i2 = this.successCount;
        WireSkuVehicle wireSkuVehicle = this.bird;
        String str4 = this.errorCode;
        String str5 = this.scanIdentifier;
        return "WireSkuScanItem(itemId=" + str + ", itemDisplayName=" + str2 + ", itemDisplayCaption=" + str3 + ", failureCount=" + i + ", successCount=" + i2 + ", bird=" + wireSkuVehicle + ", errorCode=" + str4 + ", scanIdentifier=" + str5 + ")";
    }

    public WireSkuScanItem(String str, String str2, String str3, int i, int i2, WireSkuVehicle wireSkuVehicle, String str4, String str5) {
        this.itemId = str;
        this.itemDisplayName = str2;
        this.itemDisplayCaption = str3;
        this.failureCount = i;
        this.successCount = i2;
        this.bird = wireSkuVehicle;
        this.errorCode = str4;
        this.scanIdentifier = str5;
    }

    public /* synthetic */ WireSkuScanItem(String str, String str2, String str3, int i, int i2, WireSkuVehicle wireSkuVehicle, String str4, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) == 0 ? i2 : 0, (i3 & 32) != 0 ? null : wireSkuVehicle, (i3 & 64) != 0 ? null : str4, (i3 & 128) == 0 ? str5 : null);
    }
}
