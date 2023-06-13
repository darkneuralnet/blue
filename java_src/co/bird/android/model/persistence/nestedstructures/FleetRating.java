package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetRating;", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusKind;", "rating", "", "description", "", "groups", "", "Lco/bird/android/model/persistence/nestedstructures/FleetRatingGroup;", "(DLjava/lang/String;Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "getGroups", "()Ljava/util/List;", "getRating", "()D", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetRating implements FleetStatusKind {
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("groups")
    @InterfaceC41208ft5("groups")
    private final List<FleetRatingGroup> groups;
    @JsonProperty("rating")
    @InterfaceC41208ft5("rating")
    private final double rating;

    public FleetRating(double d, String description, List<FleetRatingGroup> groups) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.rating = d;
        this.description = description;
        this.groups = groups;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FleetRating copy$default(FleetRating fleetRating, double d, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            d = fleetRating.rating;
        }
        if ((i & 2) != 0) {
            str = fleetRating.description;
        }
        if ((i & 4) != 0) {
            list = fleetRating.groups;
        }
        return fleetRating.copy(d, str, list);
    }

    public final double component1() {
        return this.rating;
    }

    public final String component2() {
        return this.description;
    }

    public final List<FleetRatingGroup> component3() {
        return this.groups;
    }

    public final FleetRating copy(double d, String description, List<FleetRatingGroup> groups) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new FleetRating(d, description, groups);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetRating) {
            FleetRating fleetRating = (FleetRating) obj;
            return Double.compare(this.rating, fleetRating.rating) == 0 && Intrinsics.areEqual(this.description, fleetRating.description) && Intrinsics.areEqual(this.groups, fleetRating.groups);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<FleetRatingGroup> getGroups() {
        return this.groups;
    }

    public final double getRating() {
        return this.rating;
    }

    public int hashCode() {
        return (((Double.hashCode(this.rating) * 31) + this.description.hashCode()) * 31) + this.groups.hashCode();
    }

    public String toString() {
        double d = this.rating;
        String str = this.description;
        List<FleetRatingGroup> list = this.groups;
        return "FleetRating(rating=" + d + ", description=" + str + ", groups=" + list + ")";
    }

    public /* synthetic */ FleetRating(double d, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, str, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
