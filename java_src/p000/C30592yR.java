package p000;

import co.bird.android.model.persistence.BirdRatingHistory;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideRating;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideRatingTag;
import co.bird.android.model.wire.WireFlightSheetRatingTag;
import co.bird.android.model.wire.WireFlightSheetRideRating;
import co.bird.api.response.WireRatingHistoryResponse;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0005\u001a\n\u0010\n\u001a\u00020\t*\u00020\b¨\u0006\u000b"}, m28432d2 = {"Lco/bird/api/response/WireRatingHistoryResponse;", "", "birdId", "Lco/bird/android/model/persistence/BirdRatingHistory;", C17296a.f69688o, "Lco/bird/android/model/wire/WireFlightSheetRideRating;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRating;", "b", "Lco/bird/android/model/wire/WireFlightSheetRatingTag;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatingTag;", "c", "co.bird.android.repository.bird-rating-history"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdRatingHistoryConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRatingHistoryConversion.kt\nco/bird/android/repository/birdratinghistory/converters/BirdRatingHistoryConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n1549#2:35\n1620#2,3:36\n1549#2:39\n1620#2,3:40\n*S KotlinDebug\n*F\n+ 1 BirdRatingHistoryConversion.kt\nco/bird/android/repository/birdratinghistory/converters/BirdRatingHistoryConversionKt\n*L\n15#1:35\n15#1:36,3\n16#1:39\n16#1:40,3\n*E\n"})
/* renamed from: yR */
/* loaded from: classes4.dex */
public final class C30592yR {
    /* renamed from: a */
    public static final BirdRatingHistory m3503a(WireRatingHistoryResponse wireRatingHistoryResponse, String birdId) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(wireRatingHistoryResponse, "<this>");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        String birdCode = wireRatingHistoryResponse.getBirdCode();
        double ratingAverage = wireRatingHistoryResponse.getRatingAverage();
        List<WireFlightSheetRideRating> ratings = wireRatingHistoryResponse.getRatings();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(ratings, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFlightSheetRideRating wireFlightSheetRideRating : ratings) {
            arrayList.add(m3502b(wireFlightSheetRideRating));
        }
        List<WireFlightSheetRatingTag> tags = wireRatingHistoryResponse.getTags();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(tags, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (WireFlightSheetRatingTag wireFlightSheetRatingTag : tags) {
            arrayList2.add(m3501c(wireFlightSheetRatingTag));
        }
        return new BirdRatingHistory(birdId, birdCode, ratingAverage, arrayList, arrayList2);
    }

    /* renamed from: b */
    public static final FlightSheetRideRating m3502b(WireFlightSheetRideRating wireFlightSheetRideRating) {
        Intrinsics.checkNotNullParameter(wireFlightSheetRideRating, "<this>");
        return new FlightSheetRideRating(wireFlightSheetRideRating.getLabel(), wireFlightSheetRideRating.getRating(), wireFlightSheetRideRating.getFeedback());
    }

    /* renamed from: c */
    public static final FlightSheetRideRatingTag m3501c(WireFlightSheetRatingTag wireFlightSheetRatingTag) {
        Intrinsics.checkNotNullParameter(wireFlightSheetRatingTag, "<this>");
        return new FlightSheetRideRatingTag(wireFlightSheetRatingTag.getLabel(), wireFlightSheetRatingTag.getCount());
    }
}
