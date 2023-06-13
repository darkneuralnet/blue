package co.bird.android.model.persistence;

import co.bird.android.model.constant.BirdBadgeType;
import co.bird.android.model.constant.BirdTaskKind;
import co.bird.android.model.constant.BountyKind;
import co.bird.android.model.constant.BrainState;
import co.bird.android.model.constant.ChargerBirdBadgeType;
import co.bird.android.model.constant.Condition;
import co.bird.android.model.constant.MapPinBadge;
import co.bird.android.model.constant.OwnershipKind;
import co.bird.android.model.constant.Placement;
import co.bird.android.model.constant.SpecialCondition;
import co.bird.android.model.persistence.nestedstructures.BirdLabel;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.Lifecycle;
import co.bird.android.model.persistence.nestedstructures.PrivateBird;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"TEST_BIRD", "Lco/bird/android/model/persistence/Bird;", "getTEST_BIRD", "()Lco/bird/android/model/persistence/Bird;", "model-persistence_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdKt {
    private static final Bird TEST_BIRD;

    static {
        List emptyList;
        List emptyList2;
        OwnershipKind ownershipKind = OwnershipKind.OWNER;
        DateTime now = DateTime.now();
        DateTime now2 = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        Intrinsics.checkNotNullExpressionValue(now2, "now()");
        PrivateBird privateBird = new PrivateBird("", null, "", null, null, ownershipKind, now, now2);
        Geolocation geolocation = new Geolocation(0.0d, 0.0d, null, null, null, null, false, null, null, 511, null);
        BirdLabel birdLabel = new BirdLabel("", 0, null, BirdBadgeType.UNKNOWN, ChargerBirdBadgeType.UNKNOWN);
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        BountyKind bountyKind = BountyKind.UNKNOWN;
        BirdTaskKind birdTaskKind = BirdTaskKind.UNKNOWN;
        Lifecycle lifecycle = new Lifecycle(Condition.UNKNOWN, SpecialCondition.UNKNOWN, BrainState.UNKNOWN, Placement.UNKNOWN);
        MapPinBadge mapPinBadge = MapPinBadge.UNKNOWN;
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        TEST_BIRD = new Bird("", "", null, 0, null, 0, geolocation, "", null, "", false, false, false, false, false, false, false, false, false, birdLabel, emptyList, null, null, "", false, false, bountyKind, null, birdTaskKind, null, null, null, true, false, null, null, false, null, null, null, null, false, false, false, null, null, null, null, false, false, lifecycle, false, null, null, null, privateBird, null, mapPinBadge, emptyList2, null, null, null, null);
    }

    public static final Bird getTEST_BIRD() {
        return TEST_BIRD;
    }
}
