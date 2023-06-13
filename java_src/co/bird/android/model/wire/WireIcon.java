package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/wire/WireIcon;", "", "icon", "Lco/bird/android/model/constant/ClientIcon;", "color", "Lco/bird/android/model/wire/WireThemedColors;", "(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;)V", "getColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireIcon {
    @JsonProperty("color")
    @InterfaceC41208ft5("color")
    private final WireThemedColors color;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;

    public WireIcon() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ WireIcon copy$default(WireIcon wireIcon, ClientIcon clientIcon, WireThemedColors wireThemedColors, int i, Object obj) {
        if ((i & 1) != 0) {
            clientIcon = wireIcon.icon;
        }
        if ((i & 2) != 0) {
            wireThemedColors = wireIcon.color;
        }
        return wireIcon.copy(clientIcon, wireThemedColors);
    }

    public final ClientIcon component1() {
        return this.icon;
    }

    public final WireThemedColors component2() {
        return this.color;
    }

    public final WireIcon copy(ClientIcon icon, WireThemedColors color) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(color, "color");
        return new WireIcon(icon, color);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireIcon) {
            WireIcon wireIcon = (WireIcon) obj;
            return this.icon == wireIcon.icon && Intrinsics.areEqual(this.color, wireIcon.color);
        }
        return false;
    }

    public final WireThemedColors getColor() {
        return this.color;
    }

    public final ClientIcon getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return (this.icon.hashCode() * 31) + this.color.hashCode();
    }

    public String toString() {
        ClientIcon clientIcon = this.icon;
        WireThemedColors wireThemedColors = this.color;
        return "WireIcon(icon=" + clientIcon + ", color=" + wireThemedColors + ")";
    }

    public WireIcon(ClientIcon icon, WireThemedColors color) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(color, "color");
        this.icon = icon;
        this.color = color;
    }

    public /* synthetic */ WireIcon(ClientIcon clientIcon, WireThemedColors wireThemedColors, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientIcon.UNKNOWN : clientIcon, (i & 2) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors);
    }
}
