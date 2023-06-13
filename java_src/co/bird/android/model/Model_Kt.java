package co.bird.android.model;

import co.bird.android.model.wire.WireRide;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import org.joda.time.Seconds;
@Metadata(m28433d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¢\u0006\u0002\u0010\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0007\u001a\n\u0010\n\u001a\u00020\t*\u00020\u000b\u001a\u0011\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u0002¢\u0006\u0002\u0010\u000e\u001a\f\u0010\u000f\u001a\u00020\r*\u0004\u0018\u00010\u0010\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013¨\u0006\u0014"}, m28432d2 = {"averageScore", "", "Lco/bird/android/model/ScoredDrop;", "(Lco/bird/android/model/ScoredDrop;)Ljava/lang/Double;", "", "currentTimerState", "Lco/bird/android/model/TimerState;", "Lco/bird/android/model/wire/WireRide;", "currentTimerValueSeconds", "", "durationSeconds", "Lco/bird/android/model/Reservation;", "isGood", "", "(Lco/bird/android/model/ScoredDrop;)Ljava/lang/Boolean;", "isUSA", "Lco/bird/android/model/Country;", "url", "", "Lco/bird/android/model/Link;", "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nModel+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Model+.kt\nco/bird/android/model/Model_Kt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1603#2,9:73\n1855#2:82\n1856#2:84\n1612#2:85\n1549#2:87\n1620#2,3:88\n1#3:83\n1#3:86\n*S KotlinDebug\n*F\n+ 1 Model+.kt\nco/bird/android/model/Model_Kt\n*L\n51#1:73,9\n51#1:82\n51#1:84\n51#1:85\n55#1:87\n55#1:88,3\n51#1:83\n*E\n"})
/* loaded from: classes4.dex */
public final class Model_Kt {
    public static final Double averageScore(ScoredDrop scoredDrop) {
        double averageOfDouble;
        Intrinsics.checkNotNullParameter(scoredDrop, "<this>");
        if (scoredDrop.getScoreReports().isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (DropScoreReport dropScoreReport : scoredDrop.getScoreReports()) {
            arrayList.add(Double.valueOf(dropScoreReport.getScore()));
        }
        averageOfDouble = CollectionsKt___CollectionsKt.averageOfDouble(arrayList);
        return Double.valueOf(averageOfDouble);
    }

    public static final TimerState currentTimerState(WireRide wireRide) {
        Intrinsics.checkNotNullParameter(wireRide, "<this>");
        if (wireRide.getDelivery() && wireRide.getPayAsYouGo()) {
            if (wireRide.getDeliveryUnlockedAt() == null) {
                return TimerState.STOPPED;
            }
            return TimerState.INCREASING;
        }
        return TimerState.INCREASING;
    }

    public static final int currentTimerValueSeconds(WireRide wireRide) {
        DateTime startedAt;
        Intrinsics.checkNotNullParameter(wireRide, "<this>");
        if (wireRide.getDelivery() && wireRide.getPayAsYouGo()) {
            startedAt = wireRide.getDeliveryUnlockedAt();
        } else {
            startedAt = wireRide.getStartedAt();
        }
        if (startedAt != null) {
            DateTime completedAt = wireRide.getCompletedAt();
            if (completedAt == null) {
                completedAt = DateTime.now();
            }
            return Math.abs(Seconds.secondsBetween(startedAt, completedAt).getSeconds());
        }
        return 0;
    }

    public static final int durationSeconds(Reservation reservation) {
        Intrinsics.checkNotNullParameter(reservation, "<this>");
        DateTime startedAt = reservation.getStartedAt();
        if (startedAt != null) {
            DateTime completedAt = reservation.getCompletedAt();
            if (completedAt == null) {
                completedAt = DateTime.now();
            }
            return Math.abs(Seconds.secondsBetween(startedAt, completedAt).getSeconds());
        }
        return 0;
    }

    public static final Boolean isGood(ScoredDrop scoredDrop) {
        boolean z;
        Intrinsics.checkNotNullParameter(scoredDrop, "<this>");
        Double averageScore = averageScore(scoredDrop);
        if (averageScore != null) {
            if (averageScore.doubleValue() > 0.5d) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    public static final boolean isUSA(Country country) {
        return country != null && Intrinsics.areEqual(country.getCode(), "US");
    }

    public static final String url(Link link) {
        Intrinsics.checkNotNullParameter(link, "<this>");
        String code = link.getCode();
        return "https://gift.bird.co/" + code;
    }

    public static final double averageScore(List<ScoredDrop> list) {
        int collectionSizeOrDefault;
        List filterNotNull;
        double averageOfDouble;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<ScoredDrop> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (ScoredDrop scoredDrop : list2) {
            arrayList.add(averageScore(scoredDrop));
        }
        filterNotNull = CollectionsKt___CollectionsKt.filterNotNull(arrayList);
        averageOfDouble = CollectionsKt___CollectionsKt.averageOfDouble(filterNotNull);
        return averageOfDouble;
    }
}
