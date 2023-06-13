package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003JW\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\bHÖ\u0001R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006("}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;", "", "icon", "Lco/bird/android/model/constant/ClientIcon;", "iconColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "backgroundColor", "title", "", "titleColor", "actions", "", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusAction;", "kind", "(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/util/List;Ljava/lang/String;)V", "getActions", "()Ljava/util/List;", "getBackgroundColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconColor", "getKind", "()Ljava/lang/String;", "getTitle", "getTitleColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetSubstate {
    @JsonProperty("actions")
    @InterfaceC41208ft5("actions")
    private final List<FleetStatusAction> actions;
    @JsonProperty("background_color")
    @InterfaceC41208ft5("background_color")
    private final ThemedColors backgroundColor;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;
    @JsonProperty("icon_color")
    @InterfaceC41208ft5("icon_color")
    private final ThemedColors iconColor;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final String kind;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("title_color")
    @InterfaceC41208ft5("title_color")
    private final ThemedColors titleColor;

    public FleetSubstate() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ FleetSubstate copy$default(FleetSubstate fleetSubstate, ClientIcon clientIcon, ThemedColors themedColors, ThemedColors themedColors2, String str, ThemedColors themedColors3, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            clientIcon = fleetSubstate.icon;
        }
        if ((i & 2) != 0) {
            themedColors = fleetSubstate.iconColor;
        }
        ThemedColors themedColors4 = themedColors;
        if ((i & 4) != 0) {
            themedColors2 = fleetSubstate.backgroundColor;
        }
        ThemedColors themedColors5 = themedColors2;
        if ((i & 8) != 0) {
            str = fleetSubstate.title;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            themedColors3 = fleetSubstate.titleColor;
        }
        ThemedColors themedColors6 = themedColors3;
        List<FleetStatusAction> list2 = list;
        if ((i & 32) != 0) {
            list2 = fleetSubstate.actions;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str2 = fleetSubstate.kind;
        }
        return fleetSubstate.copy(clientIcon, themedColors4, themedColors5, str3, themedColors6, list3, str2);
    }

    public final ClientIcon component1() {
        return this.icon;
    }

    public final ThemedColors component2() {
        return this.iconColor;
    }

    public final ThemedColors component3() {
        return this.backgroundColor;
    }

    public final String component4() {
        return this.title;
    }

    public final ThemedColors component5() {
        return this.titleColor;
    }

    public final List<FleetStatusAction> component6() {
        return this.actions;
    }

    public final String component7() {
        return this.kind;
    }

    public final FleetSubstate copy(ClientIcon icon, ThemedColors iconColor, ThemedColors backgroundColor, String title, ThemedColors titleColor, List<FleetStatusAction> actions, String str) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleColor, "titleColor");
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new FleetSubstate(icon, iconColor, backgroundColor, title, titleColor, actions, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetSubstate) {
            FleetSubstate fleetSubstate = (FleetSubstate) obj;
            return this.icon == fleetSubstate.icon && Intrinsics.areEqual(this.iconColor, fleetSubstate.iconColor) && Intrinsics.areEqual(this.backgroundColor, fleetSubstate.backgroundColor) && Intrinsics.areEqual(this.title, fleetSubstate.title) && Intrinsics.areEqual(this.titleColor, fleetSubstate.titleColor) && Intrinsics.areEqual(this.actions, fleetSubstate.actions) && Intrinsics.areEqual(this.kind, fleetSubstate.kind);
        }
        return false;
    }

    public final List<FleetStatusAction> getActions() {
        return this.actions;
    }

    public final ThemedColors getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ClientIcon getIcon() {
        return this.icon;
    }

    public final ThemedColors getIconColor() {
        return this.iconColor;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ThemedColors getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.icon.hashCode() * 31) + this.iconColor.hashCode()) * 31) + this.backgroundColor.hashCode()) * 31) + this.title.hashCode()) * 31) + this.titleColor.hashCode()) * 31) + this.actions.hashCode()) * 31;
        String str = this.kind;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        ClientIcon clientIcon = this.icon;
        ThemedColors themedColors = this.iconColor;
        ThemedColors themedColors2 = this.backgroundColor;
        String str = this.title;
        ThemedColors themedColors3 = this.titleColor;
        List<FleetStatusAction> list = this.actions;
        String str2 = this.kind;
        return "FleetSubstate(icon=" + clientIcon + ", iconColor=" + themedColors + ", backgroundColor=" + themedColors2 + ", title=" + str + ", titleColor=" + themedColors3 + ", actions=" + list + ", kind=" + str2 + ")";
    }

    public FleetSubstate(ClientIcon icon, ThemedColors iconColor, ThemedColors backgroundColor, String title, ThemedColors titleColor, List<FleetStatusAction> actions, String str) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleColor, "titleColor");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.icon = icon;
        this.iconColor = iconColor;
        this.backgroundColor = backgroundColor;
        this.title = title;
        this.titleColor = titleColor;
        this.actions = actions;
        this.kind = str;
    }

    public /* synthetic */ FleetSubstate(ClientIcon clientIcon, ThemedColors themedColors, ThemedColors themedColors2, String str, ThemedColors themedColors3, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientIcon.UNKNOWN : clientIcon, (i & 2) != 0 ? new ThemedColors(0, 0, 3, null) : themedColors, (i & 4) != 0 ? new ThemedColors(0, 0, 3, null) : themedColors2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? new ThemedColors(0, 0, 3, null) : themedColors3, (i & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 64) == 0 ? str2 : null);
    }
}
