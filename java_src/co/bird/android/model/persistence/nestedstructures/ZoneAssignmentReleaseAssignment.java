package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Point;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00063"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;", "", "id", "", "zoneId", "zoneCenterPoint", "Lco/bird/android/model/Point;", "title", "descriptionLeadingIcon", "Lco/bird/android/model/constant/ClientIcon;", "descriptionLeadingIconColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "description", "descriptionSubtitle", "dueAt", "dueAtTrailingIcon", "dueAtTrailingIconColor", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/Point;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V", "getDescription", "()Ljava/lang/String;", "getDescriptionLeadingIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getDescriptionLeadingIconColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getDescriptionSubtitle", "getDueAt", "getDueAtTrailingIcon", "getDueAtTrailingIconColor", "getId", "getTitle", "getZoneCenterPoint", "()Lco/bird/android/model/Point;", "getZoneId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZoneAssignmentReleaseAssignment {
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("description_leading_icon")
    @InterfaceC41208ft5("description_leading_icon")
    private final ClientIcon descriptionLeadingIcon;
    @JsonProperty("description_leading_icon_color")
    @InterfaceC41208ft5("description_leading_icon_color")
    private final ThemedColors descriptionLeadingIconColor;
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
    private final ThemedColors dueAtTrailingIconColor;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66709id;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("zone_center_point")
    @InterfaceC41208ft5("zone_center_point")
    private final Point zoneCenterPoint;
    @JsonProperty("zone_id")
    @InterfaceC41208ft5("zone_id")
    private final String zoneId;

    public ZoneAssignmentReleaseAssignment() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final String component1() {
        return this.f66709id;
    }

    public final ClientIcon component10() {
        return this.dueAtTrailingIcon;
    }

    public final ThemedColors component11() {
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

    public final ThemedColors component6() {
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

    public final ZoneAssignmentReleaseAssignment copy(String id, String zoneId, Point zoneCenterPoint, String title, ClientIcon clientIcon, ThemedColors themedColors, String description, String str, String dueAt, ClientIcon clientIcon2, ThemedColors themedColors2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(zoneCenterPoint, "zoneCenterPoint");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(dueAt, "dueAt");
        return new ZoneAssignmentReleaseAssignment(id, zoneId, zoneCenterPoint, title, clientIcon, themedColors, description, str, dueAt, clientIcon2, themedColors2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneAssignmentReleaseAssignment) {
            ZoneAssignmentReleaseAssignment zoneAssignmentReleaseAssignment = (ZoneAssignmentReleaseAssignment) obj;
            return Intrinsics.areEqual(this.f66709id, zoneAssignmentReleaseAssignment.f66709id) && Intrinsics.areEqual(this.zoneId, zoneAssignmentReleaseAssignment.zoneId) && Intrinsics.areEqual(this.zoneCenterPoint, zoneAssignmentReleaseAssignment.zoneCenterPoint) && Intrinsics.areEqual(this.title, zoneAssignmentReleaseAssignment.title) && this.descriptionLeadingIcon == zoneAssignmentReleaseAssignment.descriptionLeadingIcon && Intrinsics.areEqual(this.descriptionLeadingIconColor, zoneAssignmentReleaseAssignment.descriptionLeadingIconColor) && Intrinsics.areEqual(this.description, zoneAssignmentReleaseAssignment.description) && Intrinsics.areEqual(this.descriptionSubtitle, zoneAssignmentReleaseAssignment.descriptionSubtitle) && Intrinsics.areEqual(this.dueAt, zoneAssignmentReleaseAssignment.dueAt) && this.dueAtTrailingIcon == zoneAssignmentReleaseAssignment.dueAtTrailingIcon && Intrinsics.areEqual(this.dueAtTrailingIconColor, zoneAssignmentReleaseAssignment.dueAtTrailingIconColor);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ClientIcon getDescriptionLeadingIcon() {
        return this.descriptionLeadingIcon;
    }

    public final ThemedColors getDescriptionLeadingIconColor() {
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

    public final ThemedColors getDueAtTrailingIconColor() {
        return this.dueAtTrailingIconColor;
    }

    public final String getId() {
        return this.f66709id;
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
        int hashCode = ((((((this.f66709id.hashCode() * 31) + this.zoneId.hashCode()) * 31) + this.zoneCenterPoint.hashCode()) * 31) + this.title.hashCode()) * 31;
        ClientIcon clientIcon = this.descriptionLeadingIcon;
        int hashCode2 = (hashCode + (clientIcon == null ? 0 : clientIcon.hashCode())) * 31;
        ThemedColors themedColors = this.descriptionLeadingIconColor;
        int hashCode3 = (((hashCode2 + (themedColors == null ? 0 : themedColors.hashCode())) * 31) + this.description.hashCode()) * 31;
        String str = this.descriptionSubtitle;
        int hashCode4 = (((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.dueAt.hashCode()) * 31;
        ClientIcon clientIcon2 = this.dueAtTrailingIcon;
        int hashCode5 = (hashCode4 + (clientIcon2 == null ? 0 : clientIcon2.hashCode())) * 31;
        ThemedColors themedColors2 = this.dueAtTrailingIconColor;
        return hashCode5 + (themedColors2 != null ? themedColors2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66709id;
        String str2 = this.zoneId;
        Point point = this.zoneCenterPoint;
        String str3 = this.title;
        ClientIcon clientIcon = this.descriptionLeadingIcon;
        ThemedColors themedColors = this.descriptionLeadingIconColor;
        String str4 = this.description;
        String str5 = this.descriptionSubtitle;
        String str6 = this.dueAt;
        ClientIcon clientIcon2 = this.dueAtTrailingIcon;
        ThemedColors themedColors2 = this.dueAtTrailingIconColor;
        return "ZoneAssignmentReleaseAssignment(id=" + str + ", zoneId=" + str2 + ", zoneCenterPoint=" + point + ", title=" + str3 + ", descriptionLeadingIcon=" + clientIcon + ", descriptionLeadingIconColor=" + themedColors + ", description=" + str4 + ", descriptionSubtitle=" + str5 + ", dueAt=" + str6 + ", dueAtTrailingIcon=" + clientIcon2 + ", dueAtTrailingIconColor=" + themedColors2 + ")";
    }

    public ZoneAssignmentReleaseAssignment(String id, String zoneId, Point zoneCenterPoint, String title, ClientIcon clientIcon, ThemedColors themedColors, String description, String str, String dueAt, ClientIcon clientIcon2, ThemedColors themedColors2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(zoneCenterPoint, "zoneCenterPoint");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(dueAt, "dueAt");
        this.f66709id = id;
        this.zoneId = zoneId;
        this.zoneCenterPoint = zoneCenterPoint;
        this.title = title;
        this.descriptionLeadingIcon = clientIcon;
        this.descriptionLeadingIconColor = themedColors;
        this.description = description;
        this.descriptionSubtitle = str;
        this.dueAt = dueAt;
        this.dueAtTrailingIcon = clientIcon2;
        this.dueAtTrailingIconColor = themedColors2;
    }

    public /* synthetic */ ZoneAssignmentReleaseAssignment(String str, String str2, Point point, String str3, ClientIcon clientIcon, ThemedColors themedColors, String str4, String str5, String str6, ClientIcon clientIcon2, ThemedColors themedColors2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new Point() : point, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : clientIcon, (i & 32) != 0 ? null : themedColors, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? null : str5, (i & 256) == 0 ? str6 : "", (i & 512) != 0 ? null : clientIcon2, (i & 1024) == 0 ? themedColors2 : null);
    }
}
