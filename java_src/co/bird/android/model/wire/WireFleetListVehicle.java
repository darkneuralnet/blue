package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b¢\u0006\u0002\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0015\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J«\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0016\u001a\u00020\bHÆ\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0015HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001d¨\u0006@"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetListVehicle;", "", "vehicleId", "", "title", "icon", "Lco/bird/android/model/constant/ClientIcon;", "iconColor", "Lco/bird/android/model/wire/WireThemedColors;", "iconBackgroundColor", "caption", "captionColor", "caption2", "caption2Color", TransferService.INTENT_KEY_NOTIFICATION, "complication", "Lco/bird/android/model/wire/WireFleetListComplication;", "action", "Lco/bird/android/model/wire/WireFleetListAction;", "facetIndex", "", "", "backgroundColor", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Lco/bird/android/model/wire/WireFleetListComplication;Lco/bird/android/model/wire/WireFleetListAction;Ljava/util/Map;Lco/bird/android/model/wire/WireThemedColors;)V", "getAction", "()Lco/bird/android/model/wire/WireFleetListAction;", "getBackgroundColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getCaption", "()Ljava/lang/String;", "getCaption2", "getCaption2Color", "getCaptionColor", "getComplication", "()Lco/bird/android/model/wire/WireFleetListComplication;", "getFacetIndex", "()Ljava/util/Map;", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconBackgroundColor", "getIconColor", "getNotification", "getTitle", "getVehicleId", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetListVehicle {
    @JsonProperty("action")
    @InterfaceC41208ft5("action")
    private final WireFleetListAction action;
    @JsonProperty("background_color")
    @InterfaceC41208ft5("background_color")
    private final WireThemedColors backgroundColor;
    @JsonProperty("caption")
    @InterfaceC41208ft5("caption")
    private final String caption;
    @JsonProperty("caption2")
    @InterfaceC41208ft5("caption2")
    private final String caption2;
    @JsonProperty("caption2_color")
    @InterfaceC41208ft5("caption2_color")
    private final WireThemedColors caption2Color;
    @JsonProperty("caption_color")
    @InterfaceC41208ft5("caption_color")
    private final WireThemedColors captionColor;
    @JsonProperty("complication")
    @InterfaceC41208ft5("complication")
    private final WireFleetListComplication complication;
    @JsonProperty("facet_index")
    @InterfaceC41208ft5("facet_index")
    private final Map<String, Integer> facetIndex;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;
    @JsonProperty("icon_background_color")
    @InterfaceC41208ft5("icon_background_color")
    private final WireThemedColors iconBackgroundColor;
    @JsonProperty("icon_color")
    @InterfaceC41208ft5("icon_color")
    private final WireThemedColors iconColor;
    @JsonProperty(TransferService.INTENT_KEY_NOTIFICATION)
    @InterfaceC41208ft5(TransferService.INTENT_KEY_NOTIFICATION)
    private final String notification;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("vehicle_id")
    @InterfaceC41208ft5("vehicle_id")
    private final String vehicleId;

    public WireFleetListVehicle() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final String component1() {
        return this.vehicleId;
    }

    public final String component10() {
        return this.notification;
    }

    public final WireFleetListComplication component11() {
        return this.complication;
    }

    public final WireFleetListAction component12() {
        return this.action;
    }

    public final Map<String, Integer> component13() {
        return this.facetIndex;
    }

    public final WireThemedColors component14() {
        return this.backgroundColor;
    }

    public final String component2() {
        return this.title;
    }

    public final ClientIcon component3() {
        return this.icon;
    }

    public final WireThemedColors component4() {
        return this.iconColor;
    }

    public final WireThemedColors component5() {
        return this.iconBackgroundColor;
    }

    public final String component6() {
        return this.caption;
    }

    public final WireThemedColors component7() {
        return this.captionColor;
    }

    public final String component8() {
        return this.caption2;
    }

    public final WireThemedColors component9() {
        return this.caption2Color;
    }

    public final WireFleetListVehicle copy(String vehicleId, String title, ClientIcon icon, WireThemedColors iconColor, WireThemedColors iconBackgroundColor, String str, WireThemedColors captionColor, String str2, WireThemedColors caption2Color, String str3, WireFleetListComplication wireFleetListComplication, WireFleetListAction wireFleetListAction, Map<String, Integer> facetIndex, WireThemedColors backgroundColor) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(iconBackgroundColor, "iconBackgroundColor");
        Intrinsics.checkNotNullParameter(captionColor, "captionColor");
        Intrinsics.checkNotNullParameter(caption2Color, "caption2Color");
        Intrinsics.checkNotNullParameter(facetIndex, "facetIndex");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new WireFleetListVehicle(vehicleId, title, icon, iconColor, iconBackgroundColor, str, captionColor, str2, caption2Color, str3, wireFleetListComplication, wireFleetListAction, facetIndex, backgroundColor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetListVehicle) {
            WireFleetListVehicle wireFleetListVehicle = (WireFleetListVehicle) obj;
            return Intrinsics.areEqual(this.vehicleId, wireFleetListVehicle.vehicleId) && Intrinsics.areEqual(this.title, wireFleetListVehicle.title) && this.icon == wireFleetListVehicle.icon && Intrinsics.areEqual(this.iconColor, wireFleetListVehicle.iconColor) && Intrinsics.areEqual(this.iconBackgroundColor, wireFleetListVehicle.iconBackgroundColor) && Intrinsics.areEqual(this.caption, wireFleetListVehicle.caption) && Intrinsics.areEqual(this.captionColor, wireFleetListVehicle.captionColor) && Intrinsics.areEqual(this.caption2, wireFleetListVehicle.caption2) && Intrinsics.areEqual(this.caption2Color, wireFleetListVehicle.caption2Color) && Intrinsics.areEqual(this.notification, wireFleetListVehicle.notification) && Intrinsics.areEqual(this.complication, wireFleetListVehicle.complication) && Intrinsics.areEqual(this.action, wireFleetListVehicle.action) && Intrinsics.areEqual(this.facetIndex, wireFleetListVehicle.facetIndex) && Intrinsics.areEqual(this.backgroundColor, wireFleetListVehicle.backgroundColor);
        }
        return false;
    }

    public final WireFleetListAction getAction() {
        return this.action;
    }

    public final WireThemedColors getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getCaption2() {
        return this.caption2;
    }

    public final WireThemedColors getCaption2Color() {
        return this.caption2Color;
    }

    public final WireThemedColors getCaptionColor() {
        return this.captionColor;
    }

    public final WireFleetListComplication getComplication() {
        return this.complication;
    }

    public final Map<String, Integer> getFacetIndex() {
        return this.facetIndex;
    }

    public final ClientIcon getIcon() {
        return this.icon;
    }

    public final WireThemedColors getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    public final WireThemedColors getIconColor() {
        return this.iconColor;
    }

    public final String getNotification() {
        return this.notification;
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
        WireFleetListComplication wireFleetListComplication = this.complication;
        int hashCode5 = (hashCode4 + (wireFleetListComplication == null ? 0 : wireFleetListComplication.hashCode())) * 31;
        WireFleetListAction wireFleetListAction = this.action;
        return ((((hashCode5 + (wireFleetListAction != null ? wireFleetListAction.hashCode() : 0)) * 31) + this.facetIndex.hashCode()) * 31) + this.backgroundColor.hashCode();
    }

    public String toString() {
        String str = this.vehicleId;
        String str2 = this.title;
        ClientIcon clientIcon = this.icon;
        WireThemedColors wireThemedColors = this.iconColor;
        WireThemedColors wireThemedColors2 = this.iconBackgroundColor;
        String str3 = this.caption;
        WireThemedColors wireThemedColors3 = this.captionColor;
        String str4 = this.caption2;
        WireThemedColors wireThemedColors4 = this.caption2Color;
        String str5 = this.notification;
        WireFleetListComplication wireFleetListComplication = this.complication;
        WireFleetListAction wireFleetListAction = this.action;
        Map<String, Integer> map = this.facetIndex;
        WireThemedColors wireThemedColors5 = this.backgroundColor;
        return "WireFleetListVehicle(vehicleId=" + str + ", title=" + str2 + ", icon=" + clientIcon + ", iconColor=" + wireThemedColors + ", iconBackgroundColor=" + wireThemedColors2 + ", caption=" + str3 + ", captionColor=" + wireThemedColors3 + ", caption2=" + str4 + ", caption2Color=" + wireThemedColors4 + ", notification=" + str5 + ", complication=" + wireFleetListComplication + ", action=" + wireFleetListAction + ", facetIndex=" + map + ", backgroundColor=" + wireThemedColors5 + ")";
    }

    public WireFleetListVehicle(String vehicleId, String title, ClientIcon icon, WireThemedColors iconColor, WireThemedColors iconBackgroundColor, String str, WireThemedColors captionColor, String str2, WireThemedColors caption2Color, String str3, WireFleetListComplication wireFleetListComplication, WireFleetListAction wireFleetListAction, Map<String, Integer> facetIndex, WireThemedColors backgroundColor) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(iconBackgroundColor, "iconBackgroundColor");
        Intrinsics.checkNotNullParameter(captionColor, "captionColor");
        Intrinsics.checkNotNullParameter(caption2Color, "caption2Color");
        Intrinsics.checkNotNullParameter(facetIndex, "facetIndex");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
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
        this.complication = wireFleetListComplication;
        this.action = wireFleetListAction;
        this.facetIndex = facetIndex;
        this.backgroundColor = backgroundColor;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireFleetListVehicle(String str, String str2, ClientIcon clientIcon, WireThemedColors wireThemedColors, WireThemedColors wireThemedColors2, String str3, WireThemedColors wireThemedColors3, String str4, WireThemedColors wireThemedColors4, String str5, WireFleetListComplication wireFleetListComplication, WireFleetListAction wireFleetListAction, Map map, WireThemedColors wireThemedColors5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r3, r4, r8, r9, r10, r11, r12, r13, r14, r15, r32, r0);
        Map map2;
        WireThemedColors wireThemedColors6;
        String str6 = (i & 1) != 0 ? "" : str;
        String str7 = (i & 2) == 0 ? str2 : "";
        ClientIcon clientIcon2 = (i & 4) != 0 ? ClientIcon.UNKNOWN : clientIcon;
        WireThemedColors wireThemedColors7 = (i & 8) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors;
        WireThemedColors wireThemedColors8 = (i & 16) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors2;
        String str8 = (i & 32) != 0 ? null : str3;
        WireThemedColors wireThemedColors9 = (i & 64) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors3;
        String str9 = (i & 128) != 0 ? null : str4;
        WireThemedColors wireThemedColors10 = (i & 256) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors4;
        String str10 = (i & 512) != 0 ? null : str5;
        WireFleetListComplication wireFleetListComplication2 = (i & 1024) != 0 ? null : wireFleetListComplication;
        WireFleetListAction wireFleetListAction2 = (i & 2048) != 0 ? null : wireFleetListAction;
        Map emptyMap = (i & 4096) != 0 ? MapsKt__MapsKt.emptyMap() : map;
        if ((i & 8192) != 0) {
            map2 = emptyMap;
            wireThemedColors6 = new WireThemedColors(0, 0, 3, null);
        } else {
            map2 = emptyMap;
            wireThemedColors6 = wireThemedColors5;
        }
    }
}
