package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.persistence.nestedstructures.ZoneAssignmentCappedReservationGroup;
import co.bird.android.model.persistence.nestedstructures.ZoneAssignmentReleaseAssignment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006$"}, m28432d2 = {"Lco/bird/android/model/persistence/ZoneAssignmentGroup;", "", "title", "", "color", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "description", "emptyText", "releaseAssignments", "", "Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;", "cappedZoneReservationGroups", "Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedReservationGroup;", "(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCappedZoneReservationGroups", "()Ljava/util/List;", "getColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getDescription", "()Ljava/lang/String;", "getEmptyText", "getReleaseAssignments", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZoneAssignmentGroup {
    private final List<ZoneAssignmentCappedReservationGroup> cappedZoneReservationGroups;
    private final ThemedColors color;
    private final String description;
    private final String emptyText;
    private final List<ZoneAssignmentReleaseAssignment> releaseAssignments;
    private final String title;

    public ZoneAssignmentGroup(String title, ThemedColors color, String str, String emptyText, List<ZoneAssignmentReleaseAssignment> releaseAssignments, List<ZoneAssignmentCappedReservationGroup> cappedZoneReservationGroups) {
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

    public static /* synthetic */ ZoneAssignmentGroup copy$default(ZoneAssignmentGroup zoneAssignmentGroup, String str, ThemedColors themedColors, String str2, String str3, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zoneAssignmentGroup.title;
        }
        if ((i & 2) != 0) {
            themedColors = zoneAssignmentGroup.color;
        }
        ThemedColors themedColors2 = themedColors;
        if ((i & 4) != 0) {
            str2 = zoneAssignmentGroup.description;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = zoneAssignmentGroup.emptyText;
        }
        String str5 = str3;
        List<ZoneAssignmentReleaseAssignment> list3 = list;
        if ((i & 16) != 0) {
            list3 = zoneAssignmentGroup.releaseAssignments;
        }
        List list4 = list3;
        List<ZoneAssignmentCappedReservationGroup> list5 = list2;
        if ((i & 32) != 0) {
            list5 = zoneAssignmentGroup.cappedZoneReservationGroups;
        }
        return zoneAssignmentGroup.copy(str, themedColors2, str4, str5, list4, list5);
    }

    public final String component1() {
        return this.title;
    }

    public final ThemedColors component2() {
        return this.color;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.emptyText;
    }

    public final List<ZoneAssignmentReleaseAssignment> component5() {
        return this.releaseAssignments;
    }

    public final List<ZoneAssignmentCappedReservationGroup> component6() {
        return this.cappedZoneReservationGroups;
    }

    public final ZoneAssignmentGroup copy(String title, ThemedColors color, String str, String emptyText, List<ZoneAssignmentReleaseAssignment> releaseAssignments, List<ZoneAssignmentCappedReservationGroup> cappedZoneReservationGroups) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(emptyText, "emptyText");
        Intrinsics.checkNotNullParameter(releaseAssignments, "releaseAssignments");
        Intrinsics.checkNotNullParameter(cappedZoneReservationGroups, "cappedZoneReservationGroups");
        return new ZoneAssignmentGroup(title, color, str, emptyText, releaseAssignments, cappedZoneReservationGroups);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneAssignmentGroup) {
            ZoneAssignmentGroup zoneAssignmentGroup = (ZoneAssignmentGroup) obj;
            return Intrinsics.areEqual(this.title, zoneAssignmentGroup.title) && Intrinsics.areEqual(this.color, zoneAssignmentGroup.color) && Intrinsics.areEqual(this.description, zoneAssignmentGroup.description) && Intrinsics.areEqual(this.emptyText, zoneAssignmentGroup.emptyText) && Intrinsics.areEqual(this.releaseAssignments, zoneAssignmentGroup.releaseAssignments) && Intrinsics.areEqual(this.cappedZoneReservationGroups, zoneAssignmentGroup.cappedZoneReservationGroups);
        }
        return false;
    }

    public final List<ZoneAssignmentCappedReservationGroup> getCappedZoneReservationGroups() {
        return this.cappedZoneReservationGroups;
    }

    public final ThemedColors getColor() {
        return this.color;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmptyText() {
        return this.emptyText;
    }

    public final List<ZoneAssignmentReleaseAssignment> getReleaseAssignments() {
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
        ThemedColors themedColors = this.color;
        String str2 = this.description;
        String str3 = this.emptyText;
        List<ZoneAssignmentReleaseAssignment> list = this.releaseAssignments;
        List<ZoneAssignmentCappedReservationGroup> list2 = this.cappedZoneReservationGroups;
        return "ZoneAssignmentGroup(title=" + str + ", color=" + themedColors + ", description=" + str2 + ", emptyText=" + str3 + ", releaseAssignments=" + list + ", cappedZoneReservationGroups=" + list2 + ")";
    }
}
