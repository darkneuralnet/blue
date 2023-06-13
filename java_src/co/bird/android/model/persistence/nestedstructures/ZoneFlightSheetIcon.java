package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;", "", "icon", "Lco/bird/android/model/constant/ClientIcon;", "iconColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZoneFlightSheetIcon {
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;
    @JsonProperty("icon_color")
    @InterfaceC41208ft5("icon_color")
    private final ThemedColors iconColor;

    public ZoneFlightSheetIcon() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ZoneFlightSheetIcon copy$default(ZoneFlightSheetIcon zoneFlightSheetIcon, ClientIcon clientIcon, ThemedColors themedColors, int i, Object obj) {
        if ((i & 1) != 0) {
            clientIcon = zoneFlightSheetIcon.icon;
        }
        if ((i & 2) != 0) {
            themedColors = zoneFlightSheetIcon.iconColor;
        }
        return zoneFlightSheetIcon.copy(clientIcon, themedColors);
    }

    public final ClientIcon component1() {
        return this.icon;
    }

    public final ThemedColors component2() {
        return this.iconColor;
    }

    public final ZoneFlightSheetIcon copy(ClientIcon icon, ThemedColors iconColor) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        return new ZoneFlightSheetIcon(icon, iconColor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneFlightSheetIcon) {
            ZoneFlightSheetIcon zoneFlightSheetIcon = (ZoneFlightSheetIcon) obj;
            return this.icon == zoneFlightSheetIcon.icon && Intrinsics.areEqual(this.iconColor, zoneFlightSheetIcon.iconColor);
        }
        return false;
    }

    public final ClientIcon getIcon() {
        return this.icon;
    }

    public final ThemedColors getIconColor() {
        return this.iconColor;
    }

    public int hashCode() {
        return (this.icon.hashCode() * 31) + this.iconColor.hashCode();
    }

    public String toString() {
        ClientIcon clientIcon = this.icon;
        ThemedColors themedColors = this.iconColor;
        return "ZoneFlightSheetIcon(icon=" + clientIcon + ", iconColor=" + themedColors + ")";
    }

    public ZoneFlightSheetIcon(ClientIcon icon, ThemedColors iconColor) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        this.icon = icon;
        this.iconColor = iconColor;
    }

    public /* synthetic */ ZoneFlightSheetIcon(ClientIcon clientIcon, ThemedColors themedColors, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientIcon.UNKNOWN : clientIcon, (i & 2) != 0 ? new ThemedColors(0, 0, 3, null) : themedColors);
    }
}
