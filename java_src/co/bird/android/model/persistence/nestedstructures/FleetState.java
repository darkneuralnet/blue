package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\bHÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006)"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetState;", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusKind;", "icon", "Lco/bird/android/model/constant/ClientIcon;", "iconColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "iconBackgroundColor", "title", "", "description", "kind", "substates", "", "Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;", "(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconBackgroundColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getIconColor", "getKind", "getSubstates", "()Ljava/util/List;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetState implements FleetStatusKind {
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;
    @JsonProperty("icon_background_color")
    @InterfaceC41208ft5("icon_background_color")
    private final ThemedColors iconBackgroundColor;
    @JsonProperty("icon_color")
    @InterfaceC41208ft5("icon_color")
    private final ThemedColors iconColor;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final String kind;
    @JsonProperty("substates")
    @InterfaceC41208ft5("substates")
    private final List<FleetSubstate> substates;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public FleetState() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ FleetState copy$default(FleetState fleetState, ClientIcon clientIcon, ThemedColors themedColors, ThemedColors themedColors2, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            clientIcon = fleetState.icon;
        }
        if ((i & 2) != 0) {
            themedColors = fleetState.iconColor;
        }
        ThemedColors themedColors3 = themedColors;
        if ((i & 4) != 0) {
            themedColors2 = fleetState.iconBackgroundColor;
        }
        ThemedColors themedColors4 = themedColors2;
        if ((i & 8) != 0) {
            str = fleetState.title;
        }
        String str4 = str;
        if ((i & 16) != 0) {
            str2 = fleetState.description;
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            str3 = fleetState.kind;
        }
        String str6 = str3;
        List<FleetSubstate> list2 = list;
        if ((i & 64) != 0) {
            list2 = fleetState.substates;
        }
        return fleetState.copy(clientIcon, themedColors3, themedColors4, str4, str5, str6, list2);
    }

    public final ClientIcon component1() {
        return this.icon;
    }

    public final ThemedColors component2() {
        return this.iconColor;
    }

    public final ThemedColors component3() {
        return this.iconBackgroundColor;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.kind;
    }

    public final List<FleetSubstate> component7() {
        return this.substates;
    }

    public final FleetState copy(ClientIcon icon, ThemedColors iconColor, ThemedColors iconBackgroundColor, String title, String str, String str2, List<FleetSubstate> substates) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(iconBackgroundColor, "iconBackgroundColor");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(substates, "substates");
        return new FleetState(icon, iconColor, iconBackgroundColor, title, str, str2, substates);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetState) {
            FleetState fleetState = (FleetState) obj;
            return this.icon == fleetState.icon && Intrinsics.areEqual(this.iconColor, fleetState.iconColor) && Intrinsics.areEqual(this.iconBackgroundColor, fleetState.iconBackgroundColor) && Intrinsics.areEqual(this.title, fleetState.title) && Intrinsics.areEqual(this.description, fleetState.description) && Intrinsics.areEqual(this.kind, fleetState.kind) && Intrinsics.areEqual(this.substates, fleetState.substates);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
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

    public final String getKind() {
        return this.kind;
    }

    public final List<FleetSubstate> getSubstates() {
        return this.substates;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((((this.icon.hashCode() * 31) + this.iconColor.hashCode()) * 31) + this.iconBackgroundColor.hashCode()) * 31) + this.title.hashCode()) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.kind;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.substates.hashCode();
    }

    public String toString() {
        ClientIcon clientIcon = this.icon;
        ThemedColors themedColors = this.iconColor;
        ThemedColors themedColors2 = this.iconBackgroundColor;
        String str = this.title;
        String str2 = this.description;
        String str3 = this.kind;
        List<FleetSubstate> list = this.substates;
        return "FleetState(icon=" + clientIcon + ", iconColor=" + themedColors + ", iconBackgroundColor=" + themedColors2 + ", title=" + str + ", description=" + str2 + ", kind=" + str3 + ", substates=" + list + ")";
    }

    public FleetState(ClientIcon icon, ThemedColors iconColor, ThemedColors iconBackgroundColor, String title, String str, String str2, List<FleetSubstate> substates) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(iconBackgroundColor, "iconBackgroundColor");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(substates, "substates");
        this.icon = icon;
        this.iconColor = iconColor;
        this.iconBackgroundColor = iconBackgroundColor;
        this.title = title;
        this.description = str;
        this.kind = str2;
        this.substates = substates;
    }

    public /* synthetic */ FleetState(ClientIcon clientIcon, ThemedColors themedColors, ThemedColors themedColors2, String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientIcon.UNKNOWN : clientIcon, (i & 2) != 0 ? new ThemedColors(0, 0, 3, null) : themedColors, (i & 4) != 0 ? new ThemedColors(0, 0, 3, null) : themedColors2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? null : str2, (i & 32) == 0 ? str3 : null, (i & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
