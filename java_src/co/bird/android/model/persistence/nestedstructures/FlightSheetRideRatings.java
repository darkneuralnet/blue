package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetSection;", "idx", "", "title", "", "ratings", "", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRating;", "tags", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatingTag;", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getIdx", "()I", "getRatings", "()Ljava/util/List;", "getTags", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FlightSheetRideRatings implements FlightSheetSection {
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("ratings")
    @InterfaceC41208ft5("ratings")
    private final List<FlightSheetRideRating> ratings;
    @JsonProperty("tags")
    @InterfaceC41208ft5("tags")
    private final List<FlightSheetRideRatingTag> tags;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public FlightSheetRideRatings(int i, String str, List<FlightSheetRideRating> ratings, List<FlightSheetRideRatingTag> tags) {
        Intrinsics.checkNotNullParameter(ratings, "ratings");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.idx = i;
        this.title = str;
        this.ratings = ratings;
        this.tags = tags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightSheetRideRatings copy$default(FlightSheetRideRatings flightSheetRideRatings, int i, String str, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = flightSheetRideRatings.idx;
        }
        if ((i2 & 2) != 0) {
            str = flightSheetRideRatings.title;
        }
        if ((i2 & 4) != 0) {
            list = flightSheetRideRatings.ratings;
        }
        if ((i2 & 8) != 0) {
            list2 = flightSheetRideRatings.tags;
        }
        return flightSheetRideRatings.copy(i, str, list, list2);
    }

    public final int component1() {
        return this.idx;
    }

    public final String component2() {
        return this.title;
    }

    public final List<FlightSheetRideRating> component3() {
        return this.ratings;
    }

    public final List<FlightSheetRideRatingTag> component4() {
        return this.tags;
    }

    public final FlightSheetRideRatings copy(int i, String str, List<FlightSheetRideRating> ratings, List<FlightSheetRideRatingTag> tags) {
        Intrinsics.checkNotNullParameter(ratings, "ratings");
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new FlightSheetRideRatings(i, str, ratings, tags);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlightSheetRideRatings) {
            FlightSheetRideRatings flightSheetRideRatings = (FlightSheetRideRatings) obj;
            return this.idx == flightSheetRideRatings.idx && Intrinsics.areEqual(this.title, flightSheetRideRatings.title) && Intrinsics.areEqual(this.ratings, flightSheetRideRatings.ratings) && Intrinsics.areEqual(this.tags, flightSheetRideRatings.tags);
        }
        return false;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.FlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    public final List<FlightSheetRideRating> getRatings() {
        return this.ratings;
    }

    public final List<FlightSheetRideRatingTag> getTags() {
        return this.tags;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.FlightSheetSection
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.idx) * 31;
        String str = this.title;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.ratings.hashCode()) * 31) + this.tags.hashCode();
    }

    public String toString() {
        int i = this.idx;
        String str = this.title;
        List<FlightSheetRideRating> list = this.ratings;
        List<FlightSheetRideRatingTag> list2 = this.tags;
        return "FlightSheetRideRatings(idx=" + i + ", title=" + str + ", ratings=" + list + ", tags=" + list2 + ")";
    }

    public /* synthetic */ FlightSheetRideRatings(int i, String str, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i, str, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
