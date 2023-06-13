package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetRating;", "", "rating", "", "description", "", "groups", "", "Lco/bird/android/model/wire/WireFleetRatingGroup;", "(DLjava/lang/String;Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "getGroups", "()Ljava/util/List;", "getRating", "()D", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetRating {
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("groups")
    @InterfaceC41208ft5("groups")
    private final List<WireFleetRatingGroup> groups;
    @JsonProperty("rating")
    @InterfaceC41208ft5("rating")
    private final double rating;

    public WireFleetRating(double d, String description, List<WireFleetRatingGroup> groups) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.rating = d;
        this.description = description;
        this.groups = groups;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireFleetRating copy$default(WireFleetRating wireFleetRating, double d, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            d = wireFleetRating.rating;
        }
        if ((i & 2) != 0) {
            str = wireFleetRating.description;
        }
        if ((i & 4) != 0) {
            list = wireFleetRating.groups;
        }
        return wireFleetRating.copy(d, str, list);
    }

    public final double component1() {
        return this.rating;
    }

    public final String component2() {
        return this.description;
    }

    public final List<WireFleetRatingGroup> component3() {
        return this.groups;
    }

    public final WireFleetRating copy(double d, String description, List<WireFleetRatingGroup> groups) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new WireFleetRating(d, description, groups);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetRating) {
            WireFleetRating wireFleetRating = (WireFleetRating) obj;
            return Double.compare(this.rating, wireFleetRating.rating) == 0 && Intrinsics.areEqual(this.description, wireFleetRating.description) && Intrinsics.areEqual(this.groups, wireFleetRating.groups);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<WireFleetRatingGroup> getGroups() {
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
        List<WireFleetRatingGroup> list = this.groups;
        return "WireFleetRating(rating=" + d + ", description=" + str + ", groups=" + list + ")";
    }
}
