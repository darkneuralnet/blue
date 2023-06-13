package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Point;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00063"}, m28432d2 = {"Lco/bird/android/model/wire/WireZoneAssignmentReleaseAssignment;", "", "id", "", "zoneId", "zoneCenterPoint", "Lco/bird/android/model/Point;", "title", "descriptionLeadingIcon", "Lco/bird/android/model/constant/ClientIcon;", "descriptionLeadingIconColor", "Lco/bird/android/model/wire/WireThemedColors;", "description", "descriptionSubtitle", "dueAt", "dueAtTrailingIcon", "dueAtTrailingIconColor", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/Point;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;)V", "getDescription", "()Ljava/lang/String;", "getDescriptionLeadingIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getDescriptionLeadingIconColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getDescriptionSubtitle", "getDueAt", "getDueAtTrailingIcon", "getDueAtTrailingIconColor", "getId", "getTitle", "getZoneCenterPoint", "()Lco/bird/android/model/Point;", "getZoneId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireZoneAssignmentReleaseAssignment {
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("description_leading_icon")
    @InterfaceC41208ft5("description_leading_icon")
    private final ClientIcon descriptionLeadingIcon;
    @JsonProperty("description_leading_icon_color")
    @InterfaceC41208ft5("description_leading_icon_color")
    private final WireThemedColors descriptionLeadingIconColor;
    @JsonProperty("description_subtitle")
    @InterfaceC41208ft5("description_subtitle")
    private final String descriptionSubtitle;
    @JsonProperty("due_at")
    @InterfaceC41208ft5("due_at")
    private final String dueAt;
    @JsonProperty("due_at_trailing_icon")
    @InterfaceC41208ft5("due_at_trailing_icon")
    private final ClientIcon dueAtTrailingIcon;
    @JsonProperty("due_at_trailing_icon_color")
    @InterfaceC41208ft5("due_at_trailing_icon_color")
    private final WireThemedColors dueAtTrailingIconColor;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66778id;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("zone_center_point")
    @InterfaceC41208ft5("zone_center_point")
    private final Point zoneCenterPoint;
    @JsonProperty("zone_id")
    @InterfaceC41208ft5("zone_id")
    private final String zoneId;

    public WireZoneAssignmentReleaseAssignment() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final String component1() {
        return this.f66778id;
    }

    public final ClientIcon component10() {
        return this.dueAtTrailingIcon;
    }

    public final WireThemedColors component11() {
        return this.dueAtTrailingIconColor;
    }

    public final String component2() {
        return this.zoneId;
    }

    public final Point component3() {
        return this.zoneCenterPoint;
    }

    public final String component4() {
        return this.title;
    }

    public final ClientIcon component5() {
        return this.descriptionLeadingIcon;
    }

    public final WireThemedColors component6() {
        return this.descriptionLeadingIconColor;
    }

    public final String component7() {
        return this.description;
    }

    public final String component8() {
        return this.descriptionSubtitle;
    }

    public final String component9() {
        return this.dueAt;
    }

    public final WireZoneAssignmentReleaseAssignment copy(String id, String zoneId, Point zoneCenterPoint, String title, ClientIcon clientIcon, WireThemedColors wireThemedColors, String description, String str, String dueAt, ClientIcon clientIcon2, WireThemedColors wireThemedColors2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(zoneCenterPoint, "zoneCenterPoint");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(dueAt, "dueAt");
        return new WireZoneAssignmentReleaseAssignment(id, zoneId, zoneCenterPoint, title, clientIcon, wireThemedColors, description, str, dueAt, clientIcon2, wireThemedColors2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireZoneAssignmentReleaseAssignment) {
            WireZoneAssignmentReleaseAssignment wireZoneAssignmentReleaseAssignment = (WireZoneAssignmentReleaseAssignment) obj;
            return Intrinsics.areEqual(this.f66778id, wireZoneAssignmentReleaseAssignment.f66778id) && Intrinsics.areEqual(this.zoneId, wireZoneAssignmentReleaseAssignment.zoneId) && Intrinsics.areEqual(this.zoneCenterPoint, wireZoneAssignmentReleaseAssignment.zoneCenterPoint) && Intrinsics.areEqual(this.title, wireZoneAssignmentReleaseAssignment.title) && this.descriptionLeadingIcon == wireZoneAssignmentReleaseAssignment.descriptionLeadingIcon && Intrinsics.areEqual(this.descriptionLeadingIconColor, wireZoneAssignmentReleaseAssignment.descriptionLeadingIconColor) && Intrinsics.areEqual(this.description, wireZoneAssignmentReleaseAssignment.description) && Intrinsics.areEqual(this.descriptionSubtitle, wireZoneAssignmentReleaseAssignment.descriptionSubtitle) && Intrinsics.areEqual(this.dueAt, wireZoneAssignmentReleaseAssignment.dueAt) && this.dueAtTrailingIcon == wireZoneAssignmentReleaseAssignment.dueAtTrailingIcon && Intrinsics.areEqual(this.dueAtTrailingIconColor, wireZoneAssignmentReleaseAssignment.dueAtTrailingIconColor);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ClientIcon getDescriptionLeadingIcon() {
        return this.descriptionLeadingIcon;
    }

    public final WireThemedColors getDescriptionLeadingIconColor() {
        return this.descriptionLeadingIconColor;
    }

    public final String getDescriptionSubtitle() {
        return this.descriptionSubtitle;
    }

    public final String getDueAt() {
        return this.dueAt;
    }

    public final ClientIcon getDueAtTrailingIcon() {
        return this.dueAtTrailingIcon;
    }

    public final WireThemedColors getDueAtTrailingIconColor() {
        return this.dueAtTrailingIconColor;
    }

    public final String getId() {
        return this.f66778id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Point getZoneCenterPoint() {
        return this.zoneCenterPoint;
    }

    public final String getZoneId() {
        return this.zoneId;
    }

    public int hashCode() {
        int hashCode = ((((((this.f66778id.hashCode() * 31) + this.zoneId.hashCode()) * 31) + this.zoneCenterPoint.hashCode()) * 31) + this.title.hashCode()) * 31;
        ClientIcon clientIcon = this.descriptionLeadingIcon;
        int hashCode2 = (hashCode + (clientIcon == null ? 0 : clientIcon.hashCode())) * 31;
        WireThemedColors wireThemedColors = this.descriptionLeadingIconColor;
        int hashCode3 = (((hashCode2 + (wireThemedColors == null ? 0 : wireThemedColors.hashCode())) * 31) + this.description.hashCode()) * 31;
        String str = this.descriptionSubtitle;
        int hashCode4 = (((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.dueAt.hashCode()) * 31;
        ClientIcon clientIcon2 = this.dueAtTrailingIcon;
        int hashCode5 = (hashCode4 + (clientIcon2 == null ? 0 : clientIcon2.hashCode())) * 31;
        WireThemedColors wireThemedColors2 = this.dueAtTrailingIconColor;
        return hashCode5 + (wireThemedColors2 != null ? wireThemedColors2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66778id;
        String str2 = this.zoneId;
        Point point = this.zoneCenterPoint;
        String str3 = this.title;
        ClientIcon clientIcon = this.descriptionLeadingIcon;
        WireThemedColors wireThemedColors = this.descriptionLeadingIconColor;
        String str4 = this.description;
        String str5 = this.descriptionSubtitle;
        String str6 = this.dueAt;
        ClientIcon clientIcon2 = this.dueAtTrailingIcon;
        WireThemedColors wireThemedColors2 = this.dueAtTrailingIconColor;
        return "WireZoneAssignmentReleaseAssignment(id=" + str + ", zoneId=" + str2 + ", zoneCenterPoint=" + point + ", title=" + str3 + ", descriptionLeadingIcon=" + clientIcon + ", descriptionLeadingIconColor=" + wireThemedColors + ", description=" + str4 + ", descriptionSubtitle=" + str5 + ", dueAt=" + str6 + ", dueAtTrailingIcon=" + clientIcon2 + ", dueAtTrailingIconColor=" + wireThemedColors2 + ")";
    }

    public WireZoneAssignmentReleaseAssignment(String id, String zoneId, Point zoneCenterPoint, String title, ClientIcon clientIcon, WireThemedColors wireThemedColors, String description, String str, String dueAt, ClientIcon clientIcon2, WireThemedColors wireThemedColors2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(zoneCenterPoint, "zoneCenterPoint");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(dueAt, "dueAt");
        this.f66778id = id;
        this.zoneId = zoneId;
        this.zoneCenterPoint = zoneCenterPoint;
        this.title = title;
        this.descriptionLeadingIcon = clientIcon;
        this.descriptionLeadingIconColor = wireThemedColors;
        this.description = description;
        this.descriptionSubtitle = str;
        this.dueAt = dueAt;
        this.dueAtTrailingIcon = clientIcon2;
        this.dueAtTrailingIconColor = wireThemedColors2;
    }

    public /* synthetic */ WireZoneAssignmentReleaseAssignment(String str, String str2, Point point, String str3, ClientIcon clientIcon, WireThemedColors wireThemedColors, String str4, String str5, String str6, ClientIcon clientIcon2, WireThemedColors wireThemedColors2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new Point() : point, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : clientIcon, (i & 32) != 0 ? null : wireThemedColors, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? null : str5, (i & 256) == 0 ? str6 : "", (i & 512) != 0 ? null : clientIcon2, (i & 1024) == 0 ? wireThemedColors2 : null);
    }
}
