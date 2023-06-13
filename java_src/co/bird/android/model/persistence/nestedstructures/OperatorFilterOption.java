package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.ColoredIcon;
import co.bird.android.model.constant.OperatorFilterType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JI\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006%"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;", "", "name", "", "type", "Lco/bird/android/model/constant/OperatorFilterType;", "value", "enabled", "", "icon", "Lco/bird/android/model/constant/ClientIcon;", "coloredIcon", "Lco/bird/android/model/constant/ColoredIcon;", "(Ljava/lang/String;Lco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;ZLco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/constant/ColoredIcon;)V", "getColoredIcon", "()Lco/bird/android/model/constant/ColoredIcon;", "getEnabled", "()Z", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getName", "()Ljava/lang/String;", "getType", "()Lco/bird/android/model/constant/OperatorFilterType;", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorFilterOption {
    @JsonProperty("colored_icon")
    @InterfaceC41208ft5("colored_icon")
    private final ColoredIcon coloredIcon;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
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

    public OperatorFilterOption() {
        this(null, null, null, false, null, null, 63, null);
    }

    public static /* synthetic */ OperatorFilterOption copy$default(OperatorFilterOption operatorFilterOption, String str, OperatorFilterType operatorFilterType, String str2, boolean z, ClientIcon clientIcon, ColoredIcon coloredIcon, int i, Object obj) {
        if ((i & 1) != 0) {
            str = operatorFilterOption.name;
        }
        if ((i & 2) != 0) {
            operatorFilterType = operatorFilterOption.type;
        }
        OperatorFilterType operatorFilterType2 = operatorFilterType;
        if ((i & 4) != 0) {
            str2 = operatorFilterOption.value;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            z = operatorFilterOption.enabled;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            clientIcon = operatorFilterOption.icon;
        }
        ClientIcon clientIcon2 = clientIcon;
        if ((i & 32) != 0) {
            coloredIcon = operatorFilterOption.coloredIcon;
        }
        return operatorFilterOption.copy(str, operatorFilterType2, str3, z2, clientIcon2, coloredIcon);
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

    public final boolean component4() {
        return this.enabled;
    }

    public final ClientIcon component5() {
        return this.icon;
    }

    public final ColoredIcon component6() {
        return this.coloredIcon;
    }

    public final OperatorFilterOption copy(String name, OperatorFilterType type, String value, boolean z, ClientIcon clientIcon, ColoredIcon coloredIcon) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        return new OperatorFilterOption(name, type, value, z, clientIcon, coloredIcon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorFilterOption) {
            OperatorFilterOption operatorFilterOption = (OperatorFilterOption) obj;
            return Intrinsics.areEqual(this.name, operatorFilterOption.name) && this.type == operatorFilterOption.type && Intrinsics.areEqual(this.value, operatorFilterOption.value) && this.enabled == operatorFilterOption.enabled && this.icon == operatorFilterOption.icon && this.coloredIcon == operatorFilterOption.coloredIcon;
        }
        return false;
    }

    public final ColoredIcon getColoredIcon() {
        return this.coloredIcon;
    }

    public final boolean getEnabled() {
        return this.enabled;
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

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.value.hashCode()) * 31;
        boolean z = this.enabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        ClientIcon clientIcon = this.icon;
        int hashCode2 = (i2 + (clientIcon == null ? 0 : clientIcon.hashCode())) * 31;
        ColoredIcon coloredIcon = this.coloredIcon;
        return hashCode2 + (coloredIcon != null ? coloredIcon.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        OperatorFilterType operatorFilterType = this.type;
        String str2 = this.value;
        boolean z = this.enabled;
        ClientIcon clientIcon = this.icon;
        ColoredIcon coloredIcon = this.coloredIcon;
        return "OperatorFilterOption(name=" + str + ", type=" + operatorFilterType + ", value=" + str2 + ", enabled=" + z + ", icon=" + clientIcon + ", coloredIcon=" + coloredIcon + ")";
    }

    public OperatorFilterOption(String name, OperatorFilterType type, String value, boolean z, ClientIcon clientIcon, ColoredIcon coloredIcon) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.type = type;
        this.value = value;
        this.enabled = z;
        this.icon = clientIcon;
        this.coloredIcon = coloredIcon;
    }

    public /* synthetic */ OperatorFilterOption(String str, OperatorFilterType operatorFilterType, String str2, boolean z, ClientIcon clientIcon, ColoredIcon coloredIcon, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? OperatorFilterType.UNKNOWN : operatorFilterType, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : clientIcon, (i & 32) != 0 ? null : coloredIcon);
    }
}
