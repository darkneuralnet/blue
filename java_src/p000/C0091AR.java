package p000;

import co.bird.android.model.persistence.BirdRatingHistory;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideRating;
import io.reactivex.AbstractC23442F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\f"}, m28432d2 = {"LAR;", "", "Lnn4;", "ratingSummary", "Lco/bird/android/model/persistence/BirdRatingHistory;", "birdRatingHistory", "Lio/reactivex/F;", "", "LH6;", "b", "<init>", "()V", "co.bird.android.feature.bird-rating-history"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdRatingHistoryConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRatingHistoryConverter.kt\nco/bird/android/feature/birdratinghistory/BirdRatingHistoryConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1549#2:33\n1620#2,3:34\n*S KotlinDebug\n*F\n+ 1 BirdRatingHistoryConverter.kt\nco/bird/android/feature/birdratinghistory/BirdRatingHistoryConverter\n*L\n23#1:33\n23#1:34,3\n*E\n"})
/* renamed from: AR */
/* loaded from: classes3.dex */
public final class C0091AR {
    /* renamed from: c */
    public static final List m115786c(C45891nn4 ratingSummary, BirdRatingHistory birdRatingHistory) {
        List mutableListOf;
        List mutableListOf2;
        int collectionSizeOrDefault;
        List mutableList;
        List mutableListOf3;
        Intrinsics.checkNotNullParameter(ratingSummary, "$ratingSummary");
        Intrinsics.checkNotNullParameter(birdRatingHistory, "$birdRatingHistory");
        C3023H6[] c3023h6Arr = new C3023H6[3];
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(ratingSummary, C31941Bk4.view_rating_summary, false, 4, null));
        c3023h6Arr[0] = new C3023H6(mutableListOf, null, null, 6, null);
        mutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(birdRatingHistory.getTags(), C45268mk4.item_labeled_tags, false, 4, null));
        c3023h6Arr[1] = new C3023H6(mutableListOf2, null, null, 6, null);
        List<FlightSheetRideRating> ratings = birdRatingHistory.getRatings();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(ratings, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (FlightSheetRideRating flightSheetRideRating : ratings) {
            arrayList.add(new C2637G6(flightSheetRideRating, C45268mk4.view_labeled_ride_rating_with_review, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        c3023h6Arr[2] = new C3023H6(mutableList, null, null, 6, null);
        mutableListOf3 = CollectionsKt__CollectionsKt.mutableListOf(c3023h6Arr);
        return mutableListOf3;
    }

    /* renamed from: b */
    public final AbstractC23442F<List<C3023H6>> m115787b(final C45891nn4 ratingSummary, final BirdRatingHistory birdRatingHistory) {
        Intrinsics.checkNotNullParameter(ratingSummary, "ratingSummary");
        Intrinsics.checkNotNullParameter(birdRatingHistory, "birdRatingHistory");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: zR
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m115786c;
                m115786c = C0091AR.m115786c(C45891nn4.this, birdRatingHistory);
                return m115786c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      mut…)\n        )\n      )\n    }");
        return m33161E;
    }
}
