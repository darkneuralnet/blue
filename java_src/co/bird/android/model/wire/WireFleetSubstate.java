package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003JW\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\bHÖ\u0001R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006("}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetSubstate;", "", "icon", "Lco/bird/android/model/constant/ClientIcon;", "iconColor", "Lco/bird/android/model/wire/WireThemedColors;", "backgroundColor", "title", "", "titleColor", "actions", "", "Lco/bird/android/model/wire/WireFleetStatusAction;", "kind", "(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Lco/bird/android/model/wire/WireThemedColors;Ljava/util/List;Ljava/lang/String;)V", "getActions", "()Ljava/util/List;", "getBackgroundColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconColor", "getKind", "()Ljava/lang/String;", "getTitle", "getTitleColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetSubstate {
    @JsonProperty("actions")
    @InterfaceC41208ft5("actions")
    private final List<WireFleetStatusAction> actions;
    @JsonProperty("background_color")
    @InterfaceC41208ft5("background_color")
    private final WireThemedColors backgroundColor;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;
    @JsonProperty("icon_color")
    @InterfaceC41208ft5("icon_color")
    private final WireThemedColors iconColor;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final String kind;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("title_color")
    @InterfaceC41208ft5("title_color")
    private final WireThemedColors titleColor;

    public WireFleetSubstate() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ WireFleetSubstate copy$default(WireFleetSubstate wireFleetSubstate, ClientIcon clientIcon, WireThemedColors wireThemedColors, WireThemedColors wireThemedColors2, String str, WireThemedColors wireThemedColors3, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            clientIcon = wireFleetSubstate.icon;
        }
        if ((i & 2) != 0) {
            wireThemedColors = wireFleetSubstate.iconColor;
        }
        WireThemedColors wireThemedColors4 = wireThemedColors;
        if ((i & 4) != 0) {
            wireThemedColors2 = wireFleetSubstate.backgroundColor;
        }
        WireThemedColors wireThemedColors5 = wireThemedColors2;
        if ((i & 8) != 0) {
            str = wireFleetSubstate.title;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            wireThemedColors3 = wireFleetSubstate.titleColor;
        }
        WireThemedColors wireThemedColors6 = wireThemedColors3;
        List<WireFleetStatusAction> list2 = list;
        if ((i & 32) != 0) {
            list2 = wireFleetSubstate.actions;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str2 = wireFleetSubstate.kind;
        }
        return wireFleetSubstate.copy(clientIcon, wireThemedColors4, wireThemedColors5, str3, wireThemedColors6, list3, str2);
    }

    public final ClientIcon component1() {
        return this.icon;
    }

    public final WireThemedColors component2() {
        return this.iconColor;
    }

    public final WireThemedColors component3() {
        return this.backgroundColor;
    }

    public final String component4() {
        return this.title;
    }

    public final WireThemedColors component5() {
        return this.titleColor;
    }

    public final List<WireFleetStatusAction> component6() {
        return this.actions;
    }

    public final String component7() {
        return this.kind;
    }

    public final WireFleetSubstate copy(ClientIcon icon, WireThemedColors iconColor, WireThemedColors backgroundColor, String title, WireThemedColors titleColor, List<WireFleetStatusAction> actions, String str) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleColor, "titleColor");
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new WireFleetSubstate(icon, iconColor, backgroundColor, title, titleColor, actions, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetSubstate) {
            WireFleetSubstate wireFleetSubstate = (WireFleetSubstate) obj;
            return this.icon == wireFleetSubstate.icon && Intrinsics.areEqual(this.iconColor, wireFleetSubstate.iconColor) && Intrinsics.areEqual(this.backgroundColor, wireFleetSubstate.backgroundColor) && Intrinsics.areEqual(this.title, wireFleetSubstate.title) && Intrinsics.areEqual(this.titleColor, wireFleetSubstate.titleColor) && Intrinsics.areEqual(this.actions, wireFleetSubstate.actions) && Intrinsics.areEqual(this.kind, wireFleetSubstate.kind);
        }
        return false;
    }

    public final List<WireFleetStatusAction> getActions() {
        return this.actions;
    }

    public final WireThemedColors getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ClientIcon getIcon() {
        return this.icon;
    }

    public final WireThemedColors getIconColor() {
        return this.iconColor;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getTitle() {
        return this.title;
    }

    public final WireThemedColors getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.icon.hashCode() * 31) + this.iconColor.hashCode()) * 31) + this.backgroundColor.hashCode()) * 31) + this.title.hashCode()) * 31) + this.titleColor.hashCode()) * 31) + this.actions.hashCode()) * 31;
        String str = this.kind;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        ClientIcon clientIcon = this.icon;
        WireThemedColors wireThemedColors = this.iconColor;
        WireThemedColors wireThemedColors2 = this.backgroundColor;
        String str = this.title;
        WireThemedColors wireThemedColors3 = this.titleColor;
        List<WireFleetStatusAction> list = this.actions;
        String str2 = this.kind;
        return "WireFleetSubstate(icon=" + clientIcon + ", iconColor=" + wireThemedColors + ", backgroundColor=" + wireThemedColors2 + ", title=" + str + ", titleColor=" + wireThemedColors3 + ", actions=" + list + ", kind=" + str2 + ")";
    }

    public WireFleetSubstate(ClientIcon icon, WireThemedColors iconColor, WireThemedColors backgroundColor, String title, WireThemedColors titleColor, List<WireFleetStatusAction> actions, String str) {
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

    public /* synthetic */ WireFleetSubstate(ClientIcon clientIcon, WireThemedColors wireThemedColors, WireThemedColors wireThemedColors2, String str, WireThemedColors wireThemedColors3, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientIcon.UNKNOWN : clientIcon, (i & 2) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors, (i & 4) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors3, (i & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 64) == 0 ? str2 : null);
    }
}
