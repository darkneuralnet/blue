package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.ColoredIcon;
import co.bird.android.model.constant.OperatorFilterType;
import co.bird.android.model.constant.OperatorMapKind;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u007f\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u00105\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u00020\u0007HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0016\u0010\b\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006:"}, m28432d2 = {"Lco/bird/android/model/persistence/OperatorToggleFilter;", "Lco/bird/android/model/persistence/OperatorFilter;", "id", "", "kind", "Lco/bird/android/model/constant/OperatorMapKind;", "ordinal", "", "type", "Lco/bird/android/model/constant/OperatorFilterType;", "title", "toggleTitle", "enabled", "", "icon", "Lco/bird/android/model/constant/ClientIcon;", "iconColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "coloredIcon", "Lco/bird/android/model/constant/ColoredIcon;", "iconBackgroundColor", "(Ljava/lang/String;Lco/bird/android/model/constant/OperatorMapKind;ILco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V", "getColoredIcon", "()Lco/bird/android/model/constant/ColoredIcon;", "getEnabled", "()Z", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconBackgroundColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getIconColor", "getId", "()Ljava/lang/String;", "getKind", "()Lco/bird/android/model/constant/OperatorMapKind;", "getOrdinal", "()I", "getTitle", "getToggleTitle", "getType", "()Lco/bird/android/model/constant/OperatorFilterType;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorToggleFilter implements OperatorFilter {
    private final ColoredIcon coloredIcon;
    private final boolean enabled;
    private final ClientIcon icon;
    private final ThemedColors iconBackgroundColor;
    private final ThemedColors iconColor;

    /* renamed from: id */
    private final String f66684id;
    private final OperatorMapKind kind;
    private final int ordinal;
    private final String title;
    private final String toggleTitle;
    private final OperatorFilterType type;

    public OperatorToggleFilter(String id, OperatorMapKind kind, int i, OperatorFilterType type, String title, String toggleTitle, boolean z, ClientIcon clientIcon, ThemedColors themedColors, ColoredIcon coloredIcon, ThemedColors themedColors2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toggleTitle, "toggleTitle");
        this.f66684id = id;
        this.kind = kind;
        this.ordinal = i;
        this.type = type;
        this.title = title;
        this.toggleTitle = toggleTitle;
        this.enabled = z;
        this.icon = clientIcon;
        this.iconColor = themedColors;
        this.coloredIcon = coloredIcon;
        this.iconBackgroundColor = themedColors2;
    }

    public final String component1() {
        return this.f66684id;
    }

    public final ColoredIcon component10() {
        return this.coloredIcon;
    }

    public final ThemedColors component11() {
        return this.iconBackgroundColor;
    }

    public final OperatorMapKind component2() {
        return this.kind;
    }

    public final int component3() {
        return this.ordinal;
    }

    public final OperatorFilterType component4() {
        return this.type;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.toggleTitle;
    }

    public final boolean component7() {
        return this.enabled;
    }

    public final ClientIcon component8() {
        return this.icon;
    }

    public final ThemedColors component9() {
        return this.iconColor;
    }

    public final OperatorToggleFilter copy(String id, OperatorMapKind kind, int i, OperatorFilterType type, String title, String toggleTitle, boolean z, ClientIcon clientIcon, ThemedColors themedColors, ColoredIcon coloredIcon, ThemedColors themedColors2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toggleTitle, "toggleTitle");
        return new OperatorToggleFilter(id, kind, i, type, title, toggleTitle, z, clientIcon, themedColors, coloredIcon, themedColors2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorToggleFilter) {
            OperatorToggleFilter operatorToggleFilter = (OperatorToggleFilter) obj;
            return Intrinsics.areEqual(this.f66684id, operatorToggleFilter.f66684id) && this.kind == operatorToggleFilter.kind && this.ordinal == operatorToggleFilter.ordinal && this.type == operatorToggleFilter.type && Intrinsics.areEqual(this.title, operatorToggleFilter.title) && Intrinsics.areEqual(this.toggleTitle, operatorToggleFilter.toggleTitle) && this.enabled == operatorToggleFilter.enabled && this.icon == operatorToggleFilter.icon && Intrinsics.areEqual(this.iconColor, operatorToggleFilter.iconColor) && this.coloredIcon == operatorToggleFilter.coloredIcon && Intrinsics.areEqual(this.iconBackgroundColor, operatorToggleFilter.iconBackgroundColor);
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

    public final ThemedColors getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    public final ThemedColors getIconColor() {
        return this.iconColor;
    }

    @Override // co.bird.android.model.persistence.OperatorFilter
    public String getId() {
        return this.f66684id;
    }

    @Override // co.bird.android.model.persistence.OperatorFilter
    public OperatorMapKind getKind() {
        return this.kind;
    }

    @Override // co.bird.android.model.persistence.OperatorFilter
    public int getOrdinal() {
        return this.ordinal;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getToggleTitle() {
        return this.toggleTitle;
    }

    @Override // co.bird.android.model.persistence.OperatorFilter
    public OperatorFilterType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((this.f66684id.hashCode() * 31) + this.kind.hashCode()) * 31) + Integer.hashCode(this.ordinal)) * 31) + this.type.hashCode()) * 31) + this.title.hashCode()) * 31) + this.toggleTitle.hashCode()) * 31;
        boolean z = this.enabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        ClientIcon clientIcon = this.icon;
        int hashCode2 = (i2 + (clientIcon == null ? 0 : clientIcon.hashCode())) * 31;
        ThemedColors themedColors = this.iconColor;
        int hashCode3 = (hashCode2 + (themedColors == null ? 0 : themedColors.hashCode())) * 31;
        ColoredIcon coloredIcon = this.coloredIcon;
        int hashCode4 = (hashCode3 + (coloredIcon == null ? 0 : coloredIcon.hashCode())) * 31;
        ThemedColors themedColors2 = this.iconBackgroundColor;
        return hashCode4 + (themedColors2 != null ? themedColors2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66684id;
        OperatorMapKind operatorMapKind = this.kind;
        int i = this.ordinal;
        OperatorFilterType operatorFilterType = this.type;
        String str2 = this.title;
        String str3 = this.toggleTitle;
        boolean z = this.enabled;
        ClientIcon clientIcon = this.icon;
        ThemedColors themedColors = this.iconColor;
        ColoredIcon coloredIcon = this.coloredIcon;
        ThemedColors themedColors2 = this.iconBackgroundColor;
        return "OperatorToggleFilter(id=" + str + ", kind=" + operatorMapKind + ", ordinal=" + i + ", type=" + operatorFilterType + ", title=" + str2 + ", toggleTitle=" + str3 + ", enabled=" + z + ", icon=" + clientIcon + ", iconColor=" + themedColors + ", coloredIcon=" + coloredIcon + ", iconBackgroundColor=" + themedColors2 + ")";
    }
}
