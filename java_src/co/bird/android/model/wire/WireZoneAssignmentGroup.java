package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006$"}, m28432d2 = {"Lco/bird/android/model/wire/WireZoneAssignmentGroup;", "", "title", "", "color", "Lco/bird/android/model/wire/WireThemedColors;", "description", "emptyText", "releaseAssignments", "", "Lco/bird/android/model/wire/WireZoneAssignmentReleaseAssignment;", "cappedZoneReservationGroups", "Lco/bird/android/model/wire/WireZoneAssignmentCappedReservationGroup;", "(Ljava/lang/String;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCappedZoneReservationGroups", "()Ljava/util/List;", "getColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getDescription", "()Ljava/lang/String;", "getEmptyText", "getReleaseAssignments", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireZoneAssignmentGroup {
    @JsonProperty("capped_zone_reservation_groups")
    @InterfaceC41208ft5("capped_zone_reservation_groups")
    private final List<WireZoneAssignmentCappedReservationGroup> cappedZoneReservationGroups;
    @JsonProperty("color")
    @InterfaceC41208ft5("color")
    private final WireThemedColors color;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("empty_text")
    @InterfaceC41208ft5("empty_text")
    private final String emptyText;
    @JsonProperty("release_assignments")
    @InterfaceC41208ft5("release_assignments")
    private final List<WireZoneAssignmentReleaseAssignment> releaseAssignments;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireZoneAssignmentGroup() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ WireZoneAssignmentGroup copy$default(WireZoneAssignmentGroup wireZoneAssignmentGroup, String str, WireThemedColors wireThemedColors, String str2, String str3, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireZoneAssignmentGroup.title;
        }
        if ((i & 2) != 0) {
            wireThemedColors = wireZoneAssignmentGroup.color;
        }
        WireThemedColors wireThemedColors2 = wireThemedColors;
        if ((i & 4) != 0) {
            str2 = wireZoneAssignmentGroup.description;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = wireZoneAssignmentGroup.emptyText;
        }
        String str5 = str3;
        List<WireZoneAssignmentReleaseAssignment> list3 = list;
        if ((i & 16) != 0) {
            list3 = wireZoneAssignmentGroup.releaseAssignments;
        }
        List list4 = list3;
        List<WireZoneAssignmentCappedReservationGroup> list5 = list2;
        if ((i & 32) != 0) {
            list5 = wireZoneAssignmentGroup.cappedZoneReservationGroups;
        }
        return wireZoneAssignmentGroup.copy(str, wireThemedColors2, str4, str5, list4, list5);
    }

    public final String component1() {
        return this.title;
    }

    public final WireThemedColors component2() {
        return this.color;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.emptyText;
    }

    public final List<WireZoneAssignmentReleaseAssignment> component5() {
        return this.releaseAssignments;
    }

    public final List<WireZoneAssignmentCappedReservationGroup> component6() {
        return this.cappedZoneReservationGroups;
    }

    public final WireZoneAssignmentGroup copy(String title, WireThemedColors color, String str, String emptyText, List<WireZoneAssignmentReleaseAssignment> releaseAssignments, List<WireZoneAssignmentCappedReservationGroup> cappedZoneReservationGroups) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(emptyText, "emptyText");
        Intrinsics.checkNotNullParameter(releaseAssignments, "releaseAssignments");
        Intrinsics.checkNotNullParameter(cappedZoneReservationGroups, "cappedZoneReservationGroups");
        return new WireZoneAssignmentGroup(title, color, str, emptyText, releaseAssignments, cappedZoneReservationGroups);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireZoneAssignmentGroup) {
            WireZoneAssignmentGroup wireZoneAssignmentGroup = (WireZoneAssignmentGroup) obj;
            return Intrinsics.areEqual(this.title, wireZoneAssignmentGroup.title) && Intrinsics.areEqual(this.color, wireZoneAssignmentGroup.color) && Intrinsics.areEqual(this.description, wireZoneAssignmentGroup.description) && Intrinsics.areEqual(this.emptyText, wireZoneAssignmentGroup.emptyText) && Intrinsics.areEqual(this.releaseAssignments, wireZoneAssignmentGroup.releaseAssignments) && Intrinsics.areEqual(this.cappedZoneReservationGroups, wireZoneAssignmentGroup.cappedZoneReservationGroups);
        }
        return false;
    }

    public final List<WireZoneAssignmentCappedReservationGroup> getCappedZoneReservationGroups() {
        return this.cappedZoneReservationGroups;
    }

    public final WireThemedColors getColor() {
        return this.color;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmptyText() {
        return this.emptyText;
    }

    public final List<WireZoneAssignmentReleaseAssignment> getReleaseAssignments() {
        return this.releaseAssignments;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((this.title.hashCode() * 31) + this.color.hashCode()) * 31;
        String str = this.description;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.emptyText.hashCode()) * 31) + this.releaseAssignments.hashCode()) * 31) + this.cappedZoneReservationGroups.hashCode();
    }

    public String toString() {
        String str = this.title;
        WireThemedColors wireThemedColors = this.color;
        String str2 = this.description;
        String str3 = this.emptyText;
        List<WireZoneAssignmentReleaseAssignment> list = this.releaseAssignments;
        List<WireZoneAssignmentCappedReservationGroup> list2 = this.cappedZoneReservationGroups;
        return "WireZoneAssignmentGroup(title=" + str + ", color=" + wireThemedColors + ", description=" + str2 + ", emptyText=" + str3 + ", releaseAssignments=" + list + ", cappedZoneReservationGroups=" + list2 + ")";
    }

    public WireZoneAssignmentGroup(String title, WireThemedColors color, String str, String emptyText, List<WireZoneAssignmentReleaseAssignment> releaseAssignments, List<WireZoneAssignmentCappedReservationGroup> cappedZoneReservationGroups) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(emptyText, "emptyText");
        Intrinsics.checkNotNullParameter(releaseAssignments, "releaseAssignments");
        Intrinsics.checkNotNullParameter(cappedZoneReservationGroups, "cappedZoneReservationGroups");
        this.title = title;
        this.color = color;
        this.description = str;
        this.emptyText = emptyText;
        this.releaseAssignments = releaseAssignments;
        this.cappedZoneReservationGroups = cappedZoneReservationGroups;
    }

    public /* synthetic */ WireZoneAssignmentGroup(String str, WireThemedColors wireThemedColors, String str2, String str3, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors, (i & 4) == 0 ? str2 : null, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
