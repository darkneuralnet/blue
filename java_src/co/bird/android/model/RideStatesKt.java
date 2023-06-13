package co.bird.android.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0003\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0003\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0001¨\u0006\b"}, m28432d2 = {"firstActivePrimaryThenGuestOrNull", "Lco/bird/android/model/RideState;", "Lco/bird/android/model/RideStates;", "", "firstPrimaryThenGuestOrNull", "isGuestRide", "", "isPrimaryRide", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nRideStates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStates.kt\nco/bird/android/model/RideStatesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n2333#2,5:42\n2339#2,8:48\n766#2:56\n857#2,2:57\n2333#2,14:59\n1#3:47\n*S KotlinDebug\n*F\n+ 1 RideStates.kt\nco/bird/android/model/RideStatesKt\n*L\n30#1:42,5\n30#1:48,8\n35#1:56\n35#1:57,2\n35#1:59,14\n*E\n"})
/* loaded from: classes4.dex */
public final class RideStatesKt {
    public static final RideState firstActivePrimaryThenGuestOrNull(RideStates rideStates) {
        Intrinsics.checkNotNullParameter(rideStates, "<this>");
        return firstActivePrimaryThenGuestOrNull(rideStates.getRideStates());
    }

    public static final RideState firstPrimaryThenGuestOrNull(RideStates rideStates) {
        Intrinsics.checkNotNullParameter(rideStates, "<this>");
        return firstPrimaryThenGuestOrNull(rideStates.getRideStates());
    }

    public static final boolean isGuestRide(RideState rideState) {
        Intrinsics.checkNotNullParameter(rideState, "<this>");
        return rideState.getRide().isGuestRide();
    }

    public static final boolean isPrimaryRide(RideState rideState) {
        Intrinsics.checkNotNullParameter(rideState, "<this>");
        return rideState.getRide().isPrimaryRide();
    }

    public static final RideState firstActivePrimaryThenGuestOrNull(List<RideState> list) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (RideStateKt.isInRide((RideState) obj2)) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                char c = ((RideState) next).getRide().getUserGuestId() != null ? (char) 1 : (char) 0;
                do {
                    Object next2 = it.next();
                    char c2 = ((RideState) next2).getRide().getUserGuestId() != null ? (char) 1 : (char) 0;
                    if (c > c2) {
                        next = next2;
                        c = c2;
                    }
                } while (it.hasNext());
                obj = next;
            } else {
                obj = next;
            }
        } else {
            obj = null;
        }
        return (RideState) obj;
    }

    public static final RideState firstPrimaryThenGuestOrNull(List<RideState> list) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                char c = ((RideState) next).getRide().getUserGuestId() != null ? (char) 1 : (char) 0;
                do {
                    Object next2 = it.next();
                    char c2 = ((RideState) next2).getRide().getUserGuestId() != null ? (char) 1 : (char) 0;
                    if (c > c2) {
                        next = next2;
                        c = c2;
                    }
                } while (it.hasNext());
                obj = next;
            } else {
                obj = next;
            }
        } else {
            obj = null;
        }
        return (RideState) obj;
    }
}
