package co.bird.android.model;

import co.bird.android.model.wire.WireBird;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0006\u0010\u0016\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u0013J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u001fJ\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\"J\u0006\u0010#\u001a\u00020\u001fJ\t\u0010$\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006%"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "", "rideStates", "", "Lco/bird/android/model/RideState;", "(Ljava/util/List;)V", "activeRideCount", "", "getActiveRideCount", "()I", "activeUnlockedRideCount", "getActiveUnlockedRideCount", "getRideStates", "()Ljava/util/List;", "activeRides", "component1", "copy", "endedRides", "equals", "", LegacyRepairType.OTHER_KEY, "guestRideStates", "hasGuestRide", "hasPrimaryRide", "hashCode", "primaryRideState", "rideForBird", "bird", "Lco/bird/android/model/wire/WireBird;", "rideForBirdId", "birdId", "", "ridesForBirdIds", "birdIds", "", "toLoggableString", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nRideStates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStates.kt\nco/bird/android/model/RideStates\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1747#2,3:42\n1747#2,3:45\n288#2,2:48\n766#2:50\n857#2,2:51\n288#2,2:53\n288#2,2:55\n766#2:57\n857#2,2:58\n766#2:60\n857#2,2:61\n766#2:63\n857#2,2:64\n1774#2,4:66\n1774#2,4:70\n*S KotlinDebug\n*F\n+ 1 RideStates.kt\nco/bird/android/model/RideStates\n*L\n8#1:42,3\n9#1:45,3\n10#1:48,2\n11#1:50\n11#1:51,2\n12#1:53,2\n13#1:55,2\n14#1:57\n14#1:58,2\n15#1:60\n15#1:61,2\n16#1:63\n16#1:64,2\n17#1:66,4\n18#1:70,4\n*E\n"})
/* loaded from: classes4.dex */
public final class RideStates {
    private final List<RideState> rideStates;

    public RideStates() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RideStates copy$default(RideStates rideStates, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = rideStates.rideStates;
        }
        return rideStates.copy(list);
    }

    public final List<RideState> activeRides() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.rideStates) {
            if (RideStateKt.isInRide((RideState) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<RideState> component1() {
        return this.rideStates;
    }

    public final RideStates copy(List<RideState> rideStates) {
        Intrinsics.checkNotNullParameter(rideStates, "rideStates");
        return new RideStates(rideStates);
    }

    public final List<RideState> endedRides() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.rideStates) {
            if (!RideStateKt.isInRide((RideState) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RideStates) && Intrinsics.areEqual(this.rideStates, ((RideStates) obj).rideStates);
    }

    public final int getActiveRideCount() {
        List<RideState> list = this.rideStates;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (RideState rideState : list) {
                if (RideStateKt.isInRide(rideState) && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i;
    }

    public final int getActiveUnlockedRideCount() {
        List<RideState> list = this.rideStates;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (RideState rideState : list) {
                if (RideStateKt.isInUnlockedRide(rideState) && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i;
    }

    public final List<RideState> getRideStates() {
        return this.rideStates;
    }

    public final List<RideState> guestRideStates() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.rideStates) {
            if (RideStatesKt.isGuestRide((RideState) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean hasGuestRide() {
        List<RideState> list = this.rideStates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (RideState rideState : list) {
            if (RideStatesKt.isGuestRide(rideState)) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasPrimaryRide() {
        List<RideState> list = this.rideStates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (RideState rideState : list) {
            if (RideStatesKt.isPrimaryRide(rideState)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.rideStates.hashCode();
    }

    public final RideState primaryRideState() {
        Object obj;
        Iterator<T> it = this.rideStates.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (RideStatesKt.isPrimaryRide((RideState) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (RideState) obj;
    }

    public final RideState rideForBird(WireBird bird) {
        Object obj;
        Intrinsics.checkNotNullParameter(bird, "bird");
        Iterator<T> it = this.rideStates.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                WireBird bird2 = ((RideState) obj).getRide().getBird();
                boolean z = false;
                if (bird2 != null && bird2.isSame(bird)) {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (RideState) obj;
    }

    public final RideState rideForBirdId(String birdId) {
        Object obj;
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Iterator<T> it = this.rideStates.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            WireBird bird = ((RideState) next).getRide().getBird();
            if (bird != null) {
                obj = bird.getId();
            }
            if (Intrinsics.areEqual(obj, birdId)) {
                obj = next;
                break;
            }
        }
        return (RideState) obj;
    }

    public final List<RideState> ridesForBirdIds(Set<String> birdIds) {
        String str;
        boolean contains;
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.rideStates) {
            WireBird bird = ((RideState) obj).getRide().getBird();
            if (bird != null) {
                str = bird.getId();
            } else {
                str = null;
            }
            contains = CollectionsKt___CollectionsKt.contains(birdIds, str);
            if (contains) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final String toLoggableString() {
        String joinToString$default;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(this.rideStates, "\n\t", "[rideStates: ", "]", 0, null, RideStates$toLoggableString$1.INSTANCE, 24, null);
        return joinToString$default;
    }

    public String toString() {
        List<RideState> list = this.rideStates;
        return "RideStates(rideStates=" + list + ")";
    }

    public RideStates(List<RideState> rideStates) {
        Intrinsics.checkNotNullParameter(rideStates, "rideStates");
        this.rideStates = rideStates;
    }

    public /* synthetic */ RideStates(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
