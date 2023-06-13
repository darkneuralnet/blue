package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.ColoredIcon;
import co.bird.android.model.constant.OperatorFilterType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/wire/WireOperatorFilterOption;", "", "name", "", "type", "Lco/bird/android/model/constant/OperatorFilterType;", "value", "icon", "Lco/bird/android/model/constant/ClientIcon;", "coloredIcon", "Lco/bird/android/model/constant/ColoredIcon;", "(Ljava/lang/String;Lco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/constant/ColoredIcon;)V", "getColoredIcon", "()Lco/bird/android/model/constant/ColoredIcon;", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getName", "()Ljava/lang/String;", "getType", "()Lco/bird/android/model/constant/OperatorFilterType;", "getValue", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireOperatorFilterOption {
    @JsonProperty("colored_icon")
    @InterfaceC41208ft5("colored_icon")
    private final ColoredIcon coloredIcon;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("type")
    @InterfaceC41208ft5("type")
    private final OperatorFilterType type;
    @JsonProperty("value")
    @InterfaceC41208ft5("value")
    private final String value;

    public WireOperatorFilterOption() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ WireOperatorFilterOption copy$default(WireOperatorFilterOption wireOperatorFilterOption, String str, OperatorFilterType operatorFilterType, String str2, ClientIcon clientIcon, ColoredIcon coloredIcon, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireOperatorFilterOption.name;
        }
        if ((i & 2) != 0) {
            operatorFilterType = wireOperatorFilterOption.type;
        }
        OperatorFilterType operatorFilterType2 = operatorFilterType;
        if ((i & 4) != 0) {
            str2 = wireOperatorFilterOption.value;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            clientIcon = wireOperatorFilterOption.icon;
        }
        ClientIcon clientIcon2 = clientIcon;
        if ((i & 16) != 0) {
            coloredIcon = wireOperatorFilterOption.coloredIcon;
        }
        return wireOperatorFilterOption.copy(str, operatorFilterType2, str3, clientIcon2, coloredIcon);
    }

    public final String component1() {
        return this.name;
    }

    public final OperatorFilterType component2() {
        return this.type;
    }

    public final String component3() {
        return this.value;
    }

    public final ClientIcon component4() {
        return this.icon;
    }

    public final ColoredIcon component5() {
        return this.coloredIcon;
    }

    public final WireOperatorFilterOption copy(String name, OperatorFilterType type, String value, ClientIcon clientIcon, ColoredIcon coloredIcon) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        return new WireOperatorFilterOption(name, type, value, clientIcon, coloredIcon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireOperatorFilterOption) {
            WireOperatorFilterOption wireOperatorFilterOption = (WireOperatorFilterOption) obj;
            return Intrinsics.areEqual(this.name, wireOperatorFilterOption.name) && this.type == wireOperatorFilterOption.type && Intrinsics.areEqual(this.value, wireOperatorFilterOption.value) && this.icon == wireOperatorFilterOption.icon && this.coloredIcon == wireOperatorFilterOption.coloredIcon;
        }
        return false;
    }

    public final ColoredIcon getColoredIcon() {
        return this.coloredIcon;
    }

    public final ClientIcon getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final OperatorFilterType getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = ((((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.value.hashCode()) * 31;
        ClientIcon clientIcon = this.icon;
        int hashCode2 = (hashCode + (clientIcon == null ? 0 : clientIcon.hashCode())) * 31;
        ColoredIcon coloredIcon = this.coloredIcon;
        return hashCode2 + (coloredIcon != null ? coloredIcon.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        OperatorFilterType operatorFilterType = this.type;
        String str2 = this.value;
        ClientIcon clientIcon = this.icon;
        ColoredIcon coloredIcon = this.coloredIcon;
        return "WireOperatorFilterOption(name=" + str + ", type=" + operatorFilterType + ", value=" + str2 + ", icon=" + clientIcon + ", coloredIcon=" + coloredIcon + ")";
    }

    public WireOperatorFilterOption(String name, OperatorFilterType type, String value, ClientIcon clientIcon, ColoredIcon coloredIcon) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.type = type;
        this.value = value;
        this.icon = clientIcon;
        this.coloredIcon = coloredIcon;
    }

    public /* synthetic */ WireOperatorFilterOption(String str, OperatorFilterType operatorFilterType, String str2, ClientIcon clientIcon, ColoredIcon coloredIcon, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? OperatorFilterType.UNKNOWN : operatorFilterType, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? null : clientIcon, (i & 16) != 0 ? null : coloredIcon);
    }
}
