package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ColoredIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;", "", "title", "", "details", "description", "icon", "Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;", "coloredIcon", "Lco/bird/android/model/constant/ColoredIcon;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;Lco/bird/android/model/constant/ColoredIcon;)V", "getColoredIcon", "()Lco/bird/android/model/constant/ColoredIcon;", "getDescription", "()Ljava/lang/String;", "getDetails", "getIcon", "()Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZoneDetail {
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
    private final ZoneFlightSheetIcon icon;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public ZoneDetail(String title, String details, String str, ZoneFlightSheetIcon zoneFlightSheetIcon, ColoredIcon coloredIcon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        this.title = title;
        this.details = details;
        this.description = str;
        this.icon = zoneFlightSheetIcon;
        this.coloredIcon = coloredIcon;
    }

    public static /* synthetic */ ZoneDetail copy$default(ZoneDetail zoneDetail, String str, String str2, String str3, ZoneFlightSheetIcon zoneFlightSheetIcon, ColoredIcon coloredIcon, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zoneDetail.title;
        }
        if ((i & 2) != 0) {
            str2 = zoneDetail.details;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = zoneDetail.description;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            zoneFlightSheetIcon = zoneDetail.icon;
        }
        ZoneFlightSheetIcon zoneFlightSheetIcon2 = zoneFlightSheetIcon;
        if ((i & 16) != 0) {
            coloredIcon = zoneDetail.coloredIcon;
        }
        return zoneDetail.copy(str, str4, str5, zoneFlightSheetIcon2, coloredIcon);
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

    public final ZoneFlightSheetIcon component4() {
        return this.icon;
    }

    public final ColoredIcon component5() {
        return this.coloredIcon;
    }

    public final ZoneDetail copy(String title, String details, String str, ZoneFlightSheetIcon zoneFlightSheetIcon, ColoredIcon coloredIcon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        return new ZoneDetail(title, details, str, zoneFlightSheetIcon, coloredIcon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneDetail) {
            ZoneDetail zoneDetail = (ZoneDetail) obj;
            return Intrinsics.areEqual(this.title, zoneDetail.title) && Intrinsics.areEqual(this.details, zoneDetail.details) && Intrinsics.areEqual(this.description, zoneDetail.description) && Intrinsics.areEqual(this.icon, zoneDetail.icon) && this.coloredIcon == zoneDetail.coloredIcon;
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

    public final ZoneFlightSheetIcon getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((this.title.hashCode() * 31) + this.details.hashCode()) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ZoneFlightSheetIcon zoneFlightSheetIcon = this.icon;
        int hashCode3 = (hashCode2 + (zoneFlightSheetIcon == null ? 0 : zoneFlightSheetIcon.hashCode())) * 31;
        ColoredIcon coloredIcon = this.coloredIcon;
        return hashCode3 + (coloredIcon != null ? coloredIcon.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.details;
        String str3 = this.description;
        ZoneFlightSheetIcon zoneFlightSheetIcon = this.icon;
        ColoredIcon coloredIcon = this.coloredIcon;
        return "ZoneDetail(title=" + str + ", details=" + str2 + ", description=" + str3 + ", icon=" + zoneFlightSheetIcon + ", coloredIcon=" + coloredIcon + ")";
    }
}
