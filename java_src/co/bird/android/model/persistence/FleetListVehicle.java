package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.persistence.nestedstructures.FleetListAction;
import co.bird.android.model.persistence.nestedstructures.FleetListComplication;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0002\u0010\u001aJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0015\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\bHÆ\u0003J\t\u0010>\u001a\u00020\bHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010@\u001a\u00020\bHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010B\u001a\u00020\bHÆ\u0003JÉ\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0003HÆ\u0001J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020\u0015HÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 ¨\u0006I"}, m28432d2 = {"Lco/bird/android/model/persistence/FleetListVehicle;", "", "vehicleId", "", "title", "icon", "Lco/bird/android/model/constant/ClientIcon;", "iconColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "iconBackgroundColor", "caption", "captionColor", "caption2", "caption2Color", TransferService.INTENT_KEY_NOTIFICATION, "complication", "Lco/bird/android/model/persistence/nestedstructures/FleetListComplication;", "action", "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;", "facetIndex", "", "", "backgroundColor", "list", "fleetId", "section", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/FleetListComplication;Lco/bird/android/model/persistence/nestedstructures/FleetListAction;Ljava/util/Map;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Lco/bird/android/model/persistence/nestedstructures/FleetListAction;", "getBackgroundColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getCaption", "()Ljava/lang/String;", "getCaption2", "getCaption2Color", "getCaptionColor", "getComplication", "()Lco/bird/android/model/persistence/nestedstructures/FleetListComplication;", "getFacetIndex", "()Ljava/util/Map;", "getFleetId", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconBackgroundColor", "getIconColor", "getList", "getNotification", "getSection", "getTitle", "getVehicleId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetListVehicle {
    private final FleetListAction action;
    private final ThemedColors backgroundColor;
    private final String caption;
    private final String caption2;
    private final ThemedColors caption2Color;
    private final ThemedColors captionColor;
    private final FleetListComplication complication;
    private final Map<String, Integer> facetIndex;
    private final String fleetId;
    private final ClientIcon icon;
    private final ThemedColors iconBackgroundColor;
    private final ThemedColors iconColor;
    private final String list;
    private final String notification;
    private final String section;
    private final String title;
    private final String vehicleId;

    public FleetListVehicle(String vehicleId, String title, ClientIcon icon, ThemedColors iconColor, ThemedColors iconBackgroundColor, String str, ThemedColors captionColor, String str2, ThemedColors caption2Color, String str3, FleetListComplication fleetListComplication, FleetListAction fleetListAction, Map<String, Integer> facetIndex, ThemedColors backgroundColor, String list, String fleetId, String section) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(iconBackgroundColor, "iconBackgroundColor");
        Intrinsics.checkNotNullParameter(captionColor, "captionColor");
        Intrinsics.checkNotNullParameter(caption2Color, "caption2Color");
        Intrinsics.checkNotNullParameter(facetIndex, "facetIndex");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(section, "section");
        this.vehicleId = vehicleId;
        this.title = title;
        this.icon = icon;
        this.iconColor = iconColor;
        this.iconBackgroundColor = iconBackgroundColor;
        this.caption = str;
        this.captionColor = captionColor;
        this.caption2 = str2;
        this.caption2Color = caption2Color;
        this.notification = str3;
        this.complication = fleetListComplication;
        this.action = fleetListAction;
        this.facetIndex = facetIndex;
        this.backgroundColor = backgroundColor;
        this.list = list;
        this.fleetId = fleetId;
        this.section = section;
    }

    public final String component1() {
        return this.vehicleId;
    }

    public final String component10() {
        return this.notification;
    }

    public final FleetListComplication component11() {
        return this.complication;
    }

    public final FleetListAction component12() {
        return this.action;
    }

    public final Map<String, Integer> component13() {
        return this.facetIndex;
    }

    public final ThemedColors component14() {
        return this.backgroundColor;
    }

    public final String component15() {
        return this.list;
    }

    public final String component16() {
        return this.fleetId;
    }

    public final String component17() {
        return this.section;
    }

    public final String component2() {
        return this.title;
    }

    public final ClientIcon component3() {
        return this.icon;
    }

    public final ThemedColors component4() {
        return this.iconColor;
    }

    public final ThemedColors component5() {
        return this.iconBackgroundColor;
    }

    public final String component6() {
        return this.caption;
    }

    public final ThemedColors component7() {
        return this.captionColor;
    }

    public final String component8() {
        return this.caption2;
    }

    public final ThemedColors component9() {
        return this.caption2Color;
    }

    public final FleetListVehicle copy(String vehicleId, String title, ClientIcon icon, ThemedColors iconColor, ThemedColors iconBackgroundColor, String str, ThemedColors captionColor, String str2, ThemedColors caption2Color, String str3, FleetListComplication fleetListComplication, FleetListAction fleetListAction, Map<String, Integer> facetIndex, ThemedColors backgroundColor, String list, String fleetId, String section) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(iconBackgroundColor, "iconBackgroundColor");
        Intrinsics.checkNotNullParameter(captionColor, "captionColor");
        Intrinsics.checkNotNullParameter(caption2Color, "caption2Color");
        Intrinsics.checkNotNullParameter(facetIndex, "facetIndex");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(section, "section");
        return new FleetListVehicle(vehicleId, title, icon, iconColor, iconBackgroundColor, str, captionColor, str2, caption2Color, str3, fleetListComplication, fleetListAction, facetIndex, backgroundColor, list, fleetId, section);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetListVehicle) {
            FleetListVehicle fleetListVehicle = (FleetListVehicle) obj;
            return Intrinsics.areEqual(this.vehicleId, fleetListVehicle.vehicleId) && Intrinsics.areEqual(this.title, fleetListVehicle.title) && this.icon == fleetListVehicle.icon && Intrinsics.areEqual(this.iconColor, fleetListVehicle.iconColor) && Intrinsics.areEqual(this.iconBackgroundColor, fleetListVehicle.iconBackgroundColor) && Intrinsics.areEqual(this.caption, fleetListVehicle.caption) && Intrinsics.areEqual(this.captionColor, fleetListVehicle.captionColor) && Intrinsics.areEqual(this.caption2, fleetListVehicle.caption2) && Intrinsics.areEqual(this.caption2Color, fleetListVehicle.caption2Color) && Intrinsics.areEqual(this.notification, fleetListVehicle.notification) && Intrinsics.areEqual(this.complication, fleetListVehicle.complication) && Intrinsics.areEqual(this.action, fleetListVehicle.action) && Intrinsics.areEqual(this.facetIndex, fleetListVehicle.facetIndex) && Intrinsics.areEqual(this.backgroundColor, fleetListVehicle.backgroundColor) && Intrinsics.areEqual(this.list, fleetListVehicle.list) && Intrinsics.areEqual(this.fleetId, fleetListVehicle.fleetId) && Intrinsics.areEqual(this.section, fleetListVehicle.section);
        }
        return false;
    }

    public final FleetListAction getAction() {
        return this.action;
    }

    public final ThemedColors getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getCaption2() {
        return this.caption2;
    }

    public final ThemedColors getCaption2Color() {
        return this.caption2Color;
    }

    public final ThemedColors getCaptionColor() {
        return this.captionColor;
    }

    public final FleetListComplication getComplication() {
        return this.complication;
    }

    public final Map<String, Integer> getFacetIndex() {
        return this.facetIndex;
    }

    public final String getFleetId() {
        return this.fleetId;
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

    public final String getList() {
        return this.list;
    }

    public final String getNotification() {
        return this.notification;
    }

    public final String getSection() {
        return this.section;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getVehicleId() {
        return this.vehicleId;
    }

    public int hashCode() {
        int hashCode = ((((((((this.vehicleId.hashCode() * 31) + this.title.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.iconColor.hashCode()) * 31) + this.iconBackgroundColor.hashCode()) * 31;
        String str = this.caption;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.captionColor.hashCode()) * 31;
        String str2 = this.caption2;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.caption2Color.hashCode()) * 31;
        String str3 = this.notification;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        FleetListComplication fleetListComplication = this.complication;
        int hashCode5 = (hashCode4 + (fleetListComplication == null ? 0 : fleetListComplication.hashCode())) * 31;
        FleetListAction fleetListAction = this.action;
        return ((((((((((hashCode5 + (fleetListAction != null ? fleetListAction.hashCode() : 0)) * 31) + this.facetIndex.hashCode()) * 31) + this.backgroundColor.hashCode()) * 31) + this.list.hashCode()) * 31) + this.fleetId.hashCode()) * 31) + this.section.hashCode();
    }

    public String toString() {
        String str = this.vehicleId;
        String str2 = this.title;
        ClientIcon clientIcon = this.icon;
        ThemedColors themedColors = this.iconColor;
        ThemedColors themedColors2 = this.iconBackgroundColor;
        String str3 = this.caption;
        ThemedColors themedColors3 = this.captionColor;
        String str4 = this.caption2;
        ThemedColors themedColors4 = this.caption2Color;
        String str5 = this.notification;
        FleetListComplication fleetListComplication = this.complication;
        FleetListAction fleetListAction = this.action;
        Map<String, Integer> map = this.facetIndex;
        ThemedColors themedColors5 = this.backgroundColor;
        String str6 = this.list;
        String str7 = this.fleetId;
        String str8 = this.section;
        return "FleetListVehicle(vehicleId=" + str + ", title=" + str2 + ", icon=" + clientIcon + ", iconColor=" + themedColors + ", iconBackgroundColor=" + themedColors2 + ", caption=" + str3 + ", captionColor=" + themedColors3 + ", caption2=" + str4 + ", caption2Color=" + themedColors4 + ", notification=" + str5 + ", complication=" + fleetListComplication + ", action=" + fleetListAction + ", facetIndex=" + map + ", backgroundColor=" + themedColors5 + ", list=" + str6 + ", fleetId=" + str7 + ", section=" + str8 + ")";
    }
}
