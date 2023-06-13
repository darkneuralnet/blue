package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.ColoredIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;", "", "count", "", "coloredIcon", "Lco/bird/android/model/constant/ColoredIcon;", "icon", "Lco/bird/android/model/constant/ClientIcon;", "(ILco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/constant/ClientIcon;)V", "getColoredIcon", "()Lco/bird/android/model/constant/ColoredIcon;", "getCount", "()I", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNestAvailableSpaceDetail {
    @JsonProperty("colored_icon")
    @InterfaceC41208ft5("colored_icon")
    private final ColoredIcon coloredIcon;
    @JsonProperty("count")
    @InterfaceC41208ft5("count")
    private final int count;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;

    public WireNestAvailableSpaceDetail() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ WireNestAvailableSpaceDetail copy$default(WireNestAvailableSpaceDetail wireNestAvailableSpaceDetail, int i, ColoredIcon coloredIcon, ClientIcon clientIcon, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wireNestAvailableSpaceDetail.count;
        }
        if ((i2 & 2) != 0) {
            coloredIcon = wireNestAvailableSpaceDetail.coloredIcon;
        }
        if ((i2 & 4) != 0) {
            clientIcon = wireNestAvailableSpaceDetail.icon;
        }
        return wireNestAvailableSpaceDetail.copy(i, coloredIcon, clientIcon);
    }

    public final int component1() {
        return this.count;
    }

    public final ColoredIcon component2() {
        return this.coloredIcon;
    }

    public final ClientIcon component3() {
        return this.icon;
    }

    public final WireNestAvailableSpaceDetail copy(int i, ColoredIcon coloredIcon, ClientIcon clientIcon) {
        return new WireNestAvailableSpaceDetail(i, coloredIcon, clientIcon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireNestAvailableSpaceDetail) {
            WireNestAvailableSpaceDetail wireNestAvailableSpaceDetail = (WireNestAvailableSpaceDetail) obj;
            return this.count == wireNestAvailableSpaceDetail.count && this.coloredIcon == wireNestAvailableSpaceDetail.coloredIcon && this.icon == wireNestAvailableSpaceDetail.icon;
        }
        return false;
    }

    public final ColoredIcon getColoredIcon() {
        return this.coloredIcon;
    }

    public final int getCount() {
        return this.count;
    }

    public final ClientIcon getIcon() {
        return this.icon;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.count) * 31;
        ColoredIcon coloredIcon = this.coloredIcon;
        int hashCode2 = (hashCode + (coloredIcon == null ? 0 : coloredIcon.hashCode())) * 31;
        ClientIcon clientIcon = this.icon;
        return hashCode2 + (clientIcon != null ? clientIcon.hashCode() : 0);
    }

    public String toString() {
        int i = this.count;
        ColoredIcon coloredIcon = this.coloredIcon;
        ClientIcon clientIcon = this.icon;
        return "WireNestAvailableSpaceDetail(count=" + i + ", coloredIcon=" + coloredIcon + ", icon=" + clientIcon + ")";
    }

    public WireNestAvailableSpaceDetail(int i, ColoredIcon coloredIcon, ClientIcon clientIcon) {
        this.count = i;
        this.coloredIcon = coloredIcon;
        this.icon = clientIcon;
    }

    public /* synthetic */ WireNestAvailableSpaceDetail(int i, ColoredIcon coloredIcon, ClientIcon clientIcon, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : coloredIcon, (i2 & 4) != 0 ? null : clientIcon);
    }
}
