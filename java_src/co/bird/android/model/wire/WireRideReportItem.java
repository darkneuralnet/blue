package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.RideReportComponentKind;
import co.bird.android.model.constant.RideReportIcon;
import co.bird.android.model.constant.RideReportStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jq\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020,HÖ\u0001J\t\u00102\u001a\u00020\u0007HÖ\u0001J\u0019\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020,HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001b¨\u00068"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideReportItem;", "Landroid/os/Parcelable;", "componentKind", "Lco/bird/android/model/constant/RideReportComponentKind;", "status", "Lco/bird/android/model/constant/RideReportStatus;", "title", "", Entry.TYPE_TEXT, "iconName", "Lco/bird/android/model/constant/RideReportIcon;", "iconColor", "Lco/bird/android/model/wire/WireThemedColors;", "imageAsset", "Lco/bird/android/model/wire/WireLegacyAsset;", "imageTitle", "imageCaption", "(Lco/bird/android/model/constant/RideReportComponentKind;Lco/bird/android/model/constant/RideReportStatus;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RideReportIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/lang/String;)V", "getComponentKind", "()Lco/bird/android/model/constant/RideReportComponentKind;", "getIconColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getIconName", "()Lco/bird/android/model/constant/RideReportIcon;", "getImageAsset", "()Lco/bird/android/model/wire/WireLegacyAsset;", "getImageCaption", "()Ljava/lang/String;", "getImageTitle", "getStatus", "()Lco/bird/android/model/constant/RideReportStatus;", "getText", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRideReportItem implements Parcelable {
    public static final Parcelable.Creator<WireRideReportItem> CREATOR = new Creator();
    @JsonProperty("component_kind")
    @InterfaceC41208ft5("component_kind")
    private final RideReportComponentKind componentKind;
    @JsonProperty("icon_color")
    @InterfaceC41208ft5("icon_color")
    private final WireThemedColors iconColor;
    @JsonProperty("icon_name")
    @InterfaceC41208ft5("icon_name")
    private final RideReportIcon iconName;
    @JsonProperty("image_asset")
    @InterfaceC41208ft5("image_asset")
    private final WireLegacyAsset imageAsset;
    @JsonProperty("image_caption")
    @InterfaceC41208ft5("image_caption")
    private final String imageCaption;
    @JsonProperty("image_title")
    @InterfaceC41208ft5("image_title")
    private final String imageTitle;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final RideReportStatus status;
    @JsonProperty(Entry.TYPE_TEXT)
    @InterfaceC41208ft5(Entry.TYPE_TEXT)
    private final String text;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireRideReportItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRideReportItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireRideReportItem(RideReportComponentKind.valueOf(parcel.readString()), RideReportStatus.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RideReportIcon.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : WireThemedColors.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? WireLegacyAsset.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRideReportItem[] newArray(int i) {
            return new WireRideReportItem[i];
        }
    }

    public WireRideReportItem() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final RideReportComponentKind component1() {
        return this.componentKind;
    }

    public final RideReportStatus component2() {
        return this.status;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.text;
    }

    public final RideReportIcon component5() {
        return this.iconName;
    }

    public final WireThemedColors component6() {
        return this.iconColor;
    }

    public final WireLegacyAsset component7() {
        return this.imageAsset;
    }

    public final String component8() {
        return this.imageTitle;
    }

    public final String component9() {
        return this.imageCaption;
    }

    public final WireRideReportItem copy(RideReportComponentKind componentKind, RideReportStatus status, String str, String str2, RideReportIcon rideReportIcon, WireThemedColors wireThemedColors, WireLegacyAsset wireLegacyAsset, String str3, String str4) {
        Intrinsics.checkNotNullParameter(componentKind, "componentKind");
        Intrinsics.checkNotNullParameter(status, "status");
        return new WireRideReportItem(componentKind, status, str, str2, rideReportIcon, wireThemedColors, wireLegacyAsset, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRideReportItem) {
            WireRideReportItem wireRideReportItem = (WireRideReportItem) obj;
            return this.componentKind == wireRideReportItem.componentKind && this.status == wireRideReportItem.status && Intrinsics.areEqual(this.title, wireRideReportItem.title) && Intrinsics.areEqual(this.text, wireRideReportItem.text) && this.iconName == wireRideReportItem.iconName && Intrinsics.areEqual(this.iconColor, wireRideReportItem.iconColor) && Intrinsics.areEqual(this.imageAsset, wireRideReportItem.imageAsset) && Intrinsics.areEqual(this.imageTitle, wireRideReportItem.imageTitle) && Intrinsics.areEqual(this.imageCaption, wireRideReportItem.imageCaption);
        }
        return false;
    }

    public final RideReportComponentKind getComponentKind() {
        return this.componentKind;
    }

    public final WireThemedColors getIconColor() {
        return this.iconColor;
    }

    public final RideReportIcon getIconName() {
        return this.iconName;
    }

    public final WireLegacyAsset getImageAsset() {
        return this.imageAsset;
    }

    public final String getImageCaption() {
        return this.imageCaption;
    }

    public final String getImageTitle() {
        return this.imageTitle;
    }

    public final RideReportStatus getStatus() {
        return this.status;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((this.componentKind.hashCode() * 31) + this.status.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        RideReportIcon rideReportIcon = this.iconName;
        int hashCode4 = (hashCode3 + (rideReportIcon == null ? 0 : rideReportIcon.hashCode())) * 31;
        WireThemedColors wireThemedColors = this.iconColor;
        int hashCode5 = (hashCode4 + (wireThemedColors == null ? 0 : wireThemedColors.hashCode())) * 31;
        WireLegacyAsset wireLegacyAsset = this.imageAsset;
        int hashCode6 = (hashCode5 + (wireLegacyAsset == null ? 0 : wireLegacyAsset.hashCode())) * 31;
        String str3 = this.imageTitle;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageCaption;
        return hashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        RideReportComponentKind rideReportComponentKind = this.componentKind;
        RideReportStatus rideReportStatus = this.status;
        String str = this.title;
        String str2 = this.text;
        RideReportIcon rideReportIcon = this.iconName;
        WireThemedColors wireThemedColors = this.iconColor;
        WireLegacyAsset wireLegacyAsset = this.imageAsset;
        String str3 = this.imageTitle;
        String str4 = this.imageCaption;
        return "WireRideReportItem(componentKind=" + rideReportComponentKind + ", status=" + rideReportStatus + ", title=" + str + ", text=" + str2 + ", iconName=" + rideReportIcon + ", iconColor=" + wireThemedColors + ", imageAsset=" + wireLegacyAsset + ", imageTitle=" + str3 + ", imageCaption=" + str4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.componentKind.name());
        out.writeString(this.status.name());
        out.writeString(this.title);
        out.writeString(this.text);
        RideReportIcon rideReportIcon = this.iconName;
        if (rideReportIcon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(rideReportIcon.name());
        }
        WireThemedColors wireThemedColors = this.iconColor;
        if (wireThemedColors == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wireThemedColors.writeToParcel(out, i);
        }
        WireLegacyAsset wireLegacyAsset = this.imageAsset;
        if (wireLegacyAsset == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wireLegacyAsset.writeToParcel(out, i);
        }
        out.writeString(this.imageTitle);
        out.writeString(this.imageCaption);
    }

    public WireRideReportItem(RideReportComponentKind componentKind, RideReportStatus status, String str, String str2, RideReportIcon rideReportIcon, WireThemedColors wireThemedColors, WireLegacyAsset wireLegacyAsset, String str3, String str4) {
        Intrinsics.checkNotNullParameter(componentKind, "componentKind");
        Intrinsics.checkNotNullParameter(status, "status");
        this.componentKind = componentKind;
        this.status = status;
        this.title = str;
        this.text = str2;
        this.iconName = rideReportIcon;
        this.iconColor = wireThemedColors;
        this.imageAsset = wireLegacyAsset;
        this.imageTitle = str3;
        this.imageCaption = str4;
    }

    public /* synthetic */ WireRideReportItem(RideReportComponentKind rideReportComponentKind, RideReportStatus rideReportStatus, String str, String str2, RideReportIcon rideReportIcon, WireThemedColors wireThemedColors, WireLegacyAsset wireLegacyAsset, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RideReportComponentKind.UNKNOWN : rideReportComponentKind, (i & 2) != 0 ? RideReportStatus.UNKNOWN : rideReportStatus, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : rideReportIcon, (i & 32) != 0 ? null : wireThemedColors, (i & 64) != 0 ? null : wireLegacyAsset, (i & 128) != 0 ? null : str3, (i & 256) == 0 ? str4 : null);
    }
}
