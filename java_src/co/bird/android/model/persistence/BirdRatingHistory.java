package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideRating;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideRatingTag;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/persistence/BirdRatingHistory;", "", "birdId", "", "birdCode", "ratingAverage", "", "ratings", "", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRating;", "tags", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatingTag;", "(Ljava/lang/String;Ljava/lang/String;DLjava/util/List;Ljava/util/List;)V", "getBirdCode", "()Ljava/lang/String;", "getBirdId", "getRatingAverage", "()D", "getRatings", "()Ljava/util/List;", "getTags", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdRatingHistory {
    private final String birdCode;
    private final String birdId;
    private final double ratingAverage;
    private final List<FlightSheetRideRating> ratings;
    private final List<FlightSheetRideRatingTag> tags;

    public BirdRatingHistory(String birdId, String birdCode, double d, List<FlightSheetRideRating> ratings, List<FlightSheetRideRatingTag> tags) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(ratings, "ratings");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.birdId = birdId;
        this.birdCode = birdCode;
        this.ratingAverage = d;
        this.ratings = ratings;
        this.tags = tags;
    }

    public static /* synthetic */ BirdRatingHistory copy$default(BirdRatingHistory birdRatingHistory, String str, String str2, double d, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = birdRatingHistory.birdId;
        }
        if ((i & 2) != 0) {
            str2 = birdRatingHistory.birdCode;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            d = birdRatingHistory.ratingAverage;
        }
        double d2 = d;
        List<FlightSheetRideRating> list3 = list;
        if ((i & 8) != 0) {
            list3 = birdRatingHistory.ratings;
        }
        List list4 = list3;
        List<FlightSheetRideRatingTag> list5 = list2;
        if ((i & 16) != 0) {
            list5 = birdRatingHistory.tags;
        }
        return birdRatingHistory.copy(str, str3, d2, list4, list5);
    }

    public final String component1() {
        return this.birdId;
    }

    public final String component2() {
        return this.birdCode;
    }

    public final double component3() {
        return this.ratingAverage;
    }

    public final List<FlightSheetRideRating> component4() {
        return this.ratings;
    }

    public final List<FlightSheetRideRatingTag> component5() {
        return this.tags;
    }

    public final BirdRatingHistory copy(String birdId, String birdCode, double d, List<FlightSheetRideRating> ratings, List<FlightSheetRideRatingTag> tags) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(ratings, "ratings");
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new BirdRatingHistory(birdId, birdCode, d, ratings, tags);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdRatingHistory) {
            BirdRatingHistory birdRatingHistory = (BirdRatingHistory) obj;
            return Intrinsics.areEqual(this.birdId, birdRatingHistory.birdId) && Intrinsics.areEqual(this.birdCode, birdRatingHistory.birdCode) && Double.compare(this.ratingAverage, birdRatingHistory.ratingAverage) == 0 && Intrinsics.areEqual(this.ratings, birdRatingHistory.ratings) && Intrinsics.areEqual(this.tags, birdRatingHistory.tags);
        }
        return false;
    }

    public final String getBirdCode() {
        return this.birdCode;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final double getRatingAverage() {
        return this.ratingAverage;
    }

    public final List<FlightSheetRideRating> getRatings() {
        return this.ratings;
    }

    public final List<FlightSheetRideRatingTag> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return (((((((this.birdId.hashCode() * 31) + this.birdCode.hashCode()) * 31) + Double.hashCode(this.ratingAverage)) * 31) + this.ratings.hashCode()) * 31) + this.tags.hashCode();
    }

    public String toString() {
        String str = this.birdId;
        String str2 = this.birdCode;
        double d = this.ratingAverage;
        List<FlightSheetRideRating> list = this.ratings;
        List<FlightSheetRideRatingTag> list2 = this.tags;
        return "BirdRatingHistory(birdId=" + str + ", birdCode=" + str2 + ", ratingAverage=" + d + ", ratings=" + list + ", tags=" + list2 + ")";
    }

    public /* synthetic */ BirdRatingHistory(String str, String str2, double d, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
