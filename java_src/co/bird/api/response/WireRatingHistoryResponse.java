package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireFlightSheetRatingTag;
import co.bird.android.model.wire.WireFlightSheetRideRating;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, m28432d2 = {"Lco/bird/api/response/WireRatingHistoryResponse;", "", "birdCode", "", "ratingAverage", "", "ratings", "", "Lco/bird/android/model/wire/WireFlightSheetRideRating;", "tags", "Lco/bird/android/model/wire/WireFlightSheetRatingTag;", "(Ljava/lang/String;DLjava/util/List;Ljava/util/List;)V", "getBirdCode", "()Ljava/lang/String;", "getRatingAverage", "()D", "getRatings", "()Ljava/util/List;", "getTags", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRatingHistoryResponse {
    @JsonProperty("bird_code")
    @InterfaceC41208ft5("bird_code")
    private final String birdCode;
    @JsonProperty("rating_average")
    @InterfaceC41208ft5("rating_average")
    private final double ratingAverage;
    @JsonProperty("ratings")
    @InterfaceC41208ft5("ratings")
    private final List<WireFlightSheetRideRating> ratings;
    @JsonProperty("tags")
    @InterfaceC41208ft5("tags")
    private final List<WireFlightSheetRatingTag> tags;

    public WireRatingHistoryResponse() {
        this(null, 0.0d, null, null, 15, null);
    }

    public static /* synthetic */ WireRatingHistoryResponse copy$default(WireRatingHistoryResponse wireRatingHistoryResponse, String str, double d, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireRatingHistoryResponse.birdCode;
        }
        if ((i & 2) != 0) {
            d = wireRatingHistoryResponse.ratingAverage;
        }
        double d2 = d;
        List<WireFlightSheetRideRating> list3 = list;
        if ((i & 4) != 0) {
            list3 = wireRatingHistoryResponse.ratings;
        }
        List list4 = list3;
        List<WireFlightSheetRatingTag> list5 = list2;
        if ((i & 8) != 0) {
            list5 = wireRatingHistoryResponse.tags;
        }
        return wireRatingHistoryResponse.copy(str, d2, list4, list5);
    }

    public final String component1() {
        return this.birdCode;
    }

    public final double component2() {
        return this.ratingAverage;
    }

    public final List<WireFlightSheetRideRating> component3() {
        return this.ratings;
    }

    public final List<WireFlightSheetRatingTag> component4() {
        return this.tags;
    }

    public final WireRatingHistoryResponse copy(String birdCode, double d, List<WireFlightSheetRideRating> ratings, List<WireFlightSheetRatingTag> tags) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(ratings, "ratings");
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new WireRatingHistoryResponse(birdCode, d, ratings, tags);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRatingHistoryResponse) {
            WireRatingHistoryResponse wireRatingHistoryResponse = (WireRatingHistoryResponse) obj;
            return Intrinsics.areEqual(this.birdCode, wireRatingHistoryResponse.birdCode) && Double.compare(this.ratingAverage, wireRatingHistoryResponse.ratingAverage) == 0 && Intrinsics.areEqual(this.ratings, wireRatingHistoryResponse.ratings) && Intrinsics.areEqual(this.tags, wireRatingHistoryResponse.tags);
        }
        return false;
    }

    public final String getBirdCode() {
        return this.birdCode;
    }

    public final double getRatingAverage() {
        return this.ratingAverage;
    }

    public final List<WireFlightSheetRideRating> getRatings() {
        return this.ratings;
    }

    public final List<WireFlightSheetRatingTag> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return (((((this.birdCode.hashCode() * 31) + Double.hashCode(this.ratingAverage)) * 31) + this.ratings.hashCode()) * 31) + this.tags.hashCode();
    }

    public String toString() {
        String str = this.birdCode;
        double d = this.ratingAverage;
        List<WireFlightSheetRideRating> list = this.ratings;
        List<WireFlightSheetRatingTag> list2 = this.tags;
        return "WireRatingHistoryResponse(birdCode=" + str + ", ratingAverage=" + d + ", ratings=" + list + ", tags=" + list2 + ")";
    }

    public WireRatingHistoryResponse(String birdCode, double d, List<WireFlightSheetRideRating> ratings, List<WireFlightSheetRatingTag> tags) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(ratings, "ratings");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.birdCode = birdCode;
        this.ratingAverage = d;
        this.ratings = ratings;
        this.tags = tags;
    }

    public /* synthetic */ WireRatingHistoryResponse(String str, double d, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
