package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/wire/WireZoneFlightSheetIcon;", "", "icon", "Lco/bird/android/model/constant/ClientIcon;", "iconColor", "Lco/bird/android/model/wire/WireThemedColors;", "(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;)V", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconColor", "()Lco/bird/android/model/wire/WireThemedColors;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireZoneFlightSheetIcon {
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;
    @JsonProperty("icon_color")
    @InterfaceC41208ft5("icon_color")
    private final WireThemedColors iconColor;

    public WireZoneFlightSheetIcon() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ WireZoneFlightSheetIcon copy$default(WireZoneFlightSheetIcon wireZoneFlightSheetIcon, ClientIcon clientIcon, WireThemedColors wireThemedColors, int i, Object obj) {
        if ((i & 1) != 0) {
            clientIcon = wireZoneFlightSheetIcon.icon;
        }
        if ((i & 2) != 0) {
            wireThemedColors = wireZoneFlightSheetIcon.iconColor;
        }
        return wireZoneFlightSheetIcon.copy(clientIcon, wireThemedColors);
    }

    public final ClientIcon component1() {
        return this.icon;
    }

    public final WireThemedColors component2() {
        return this.iconColor;
    }

    public final WireZoneFlightSheetIcon copy(ClientIcon icon, WireThemedColors iconColor) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        return new WireZoneFlightSheetIcon(icon, iconColor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireZoneFlightSheetIcon) {
            WireZoneFlightSheetIcon wireZoneFlightSheetIcon = (WireZoneFlightSheetIcon) obj;
            return this.icon == wireZoneFlightSheetIcon.icon && Intrinsics.areEqual(this.iconColor, wireZoneFlightSheetIcon.iconColor);
        }
        return false;
    }

    public final ClientIcon getIcon() {
        return this.icon;
    }

    public final WireThemedColors getIconColor() {
        return this.iconColor;
    }

    public int hashCode() {
        return (this.icon.hashCode() * 31) + this.iconColor.hashCode();
    }

    public String toString() {
        ClientIcon clientIcon = this.icon;
        WireThemedColors wireThemedColors = this.iconColor;
        return "WireZoneFlightSheetIcon(icon=" + clientIcon + ", iconColor=" + wireThemedColors + ")";
    }

    public WireZoneFlightSheetIcon(ClientIcon icon, WireThemedColors iconColor) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        this.icon = icon;
        this.iconColor = iconColor;
    }

    public /* synthetic */ WireZoneFlightSheetIcon(ClientIcon clientIcon, WireThemedColors wireThemedColors, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientIcon.UNKNOWN : clientIcon, (i & 2) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors);
    }
}
