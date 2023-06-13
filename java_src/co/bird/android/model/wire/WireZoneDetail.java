package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ColoredIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/wire/WireZoneDetail;", "", "title", "", "details", "description", "icon", "Lco/bird/android/model/wire/WireZoneFlightSheetIcon;", "coloredIcon", "Lco/bird/android/model/constant/ColoredIcon;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireZoneFlightSheetIcon;Lco/bird/android/model/constant/ColoredIcon;)V", "getColoredIcon", "()Lco/bird/android/model/constant/ColoredIcon;", "getDescription", "()Ljava/lang/String;", "getDetails", "getIcon", "()Lco/bird/android/model/wire/WireZoneFlightSheetIcon;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireZoneDetail {
    @JsonProperty("colored_icon")
    @InterfaceC41208ft5("colored_icon")
    private final ColoredIcon coloredIcon;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("details")
    @InterfaceC41208ft5("details")
    private final String details;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final WireZoneFlightSheetIcon icon;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireZoneDetail() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ WireZoneDetail copy$default(WireZoneDetail wireZoneDetail, String str, String str2, String str3, WireZoneFlightSheetIcon wireZoneFlightSheetIcon, ColoredIcon coloredIcon, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireZoneDetail.title;
        }
        if ((i & 2) != 0) {
            str2 = wireZoneDetail.details;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = wireZoneDetail.description;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            wireZoneFlightSheetIcon = wireZoneDetail.icon;
        }
        WireZoneFlightSheetIcon wireZoneFlightSheetIcon2 = wireZoneFlightSheetIcon;
        if ((i & 16) != 0) {
            coloredIcon = wireZoneDetail.coloredIcon;
        }
        return wireZoneDetail.copy(str, str4, str5, wireZoneFlightSheetIcon2, coloredIcon);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.details;
    }

    public final String component3() {
        return this.description;
    }

    public final WireZoneFlightSheetIcon component4() {
        return this.icon;
    }

    public final ColoredIcon component5() {
        return this.coloredIcon;
    }

    public final WireZoneDetail copy(String title, String details, String str, WireZoneFlightSheetIcon wireZoneFlightSheetIcon, ColoredIcon coloredIcon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        return new WireZoneDetail(title, details, str, wireZoneFlightSheetIcon, coloredIcon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireZoneDetail) {
            WireZoneDetail wireZoneDetail = (WireZoneDetail) obj;
            return Intrinsics.areEqual(this.title, wireZoneDetail.title) && Intrinsics.areEqual(this.details, wireZoneDetail.details) && Intrinsics.areEqual(this.description, wireZoneDetail.description) && Intrinsics.areEqual(this.icon, wireZoneDetail.icon) && this.coloredIcon == wireZoneDetail.coloredIcon;
        }
        return false;
    }

    public final ColoredIcon getColoredIcon() {
        return this.coloredIcon;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDetails() {
        return this.details;
    }

    public final WireZoneFlightSheetIcon getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((this.title.hashCode() * 31) + this.details.hashCode()) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        WireZoneFlightSheetIcon wireZoneFlightSheetIcon = this.icon;
        int hashCode3 = (hashCode2 + (wireZoneFlightSheetIcon == null ? 0 : wireZoneFlightSheetIcon.hashCode())) * 31;
        ColoredIcon coloredIcon = this.coloredIcon;
        return hashCode3 + (coloredIcon != null ? coloredIcon.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.details;
        String str3 = this.description;
        WireZoneFlightSheetIcon wireZoneFlightSheetIcon = this.icon;
        ColoredIcon coloredIcon = this.coloredIcon;
        return "WireZoneDetail(title=" + str + ", details=" + str2 + ", description=" + str3 + ", icon=" + wireZoneFlightSheetIcon + ", coloredIcon=" + coloredIcon + ")";
    }

    public WireZoneDetail(String title, String details, String str, WireZoneFlightSheetIcon wireZoneFlightSheetIcon, ColoredIcon coloredIcon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        this.title = title;
        this.details = details;
        this.description = str;
        this.icon = wireZoneFlightSheetIcon;
        this.coloredIcon = coloredIcon;
    }

    public /* synthetic */ WireZoneDetail(String str, String str2, String str3, WireZoneFlightSheetIcon wireZoneFlightSheetIcon, ColoredIcon coloredIcon, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : wireZoneFlightSheetIcon, (i & 16) != 0 ? null : coloredIcon);
    }
}
