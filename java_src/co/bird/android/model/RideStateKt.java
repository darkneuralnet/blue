package co.bird.android.model;

import co.bird.android.model.RideState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00030\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0003¨\u0006\t"}, m28432d2 = {"anyStartedRides", "", "", "Lco/bird/android/model/RideState;", "getPrimaryRideState", "isInGroupRide", "isInGroupWithUnlockedRides", "isInRide", "isInUnlockedRide", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nRideState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideState.kt\nco/bird/android/model/RideStateKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1747#2,3:56\n766#2:59\n857#2,2:60\n1747#2,3:62\n288#2,2:65\n*S KotlinDebug\n*F\n+ 1 RideState.kt\nco/bird/android/model/RideStateKt\n*L\n41#1:56,3\n45#1:59\n45#1:60,2\n49#1:62,3\n53#1:65,2\n*E\n"})
/* loaded from: classes4.dex */
public final class RideStateKt {
    public static final boolean anyStartedRides(List<RideState> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<RideState> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (RideState rideState : list2) {
            if (isInRide(rideState)) {
                return true;
            }
        }
        return false;
    }

    public static final RideState getPrimaryRideState(List<RideState> list) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator<T> it = list.iterator();
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

    public static final boolean isInGroupRide(List<RideState> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (isInRide((RideState) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            return true;
        }
        return false;
    }

    public static final boolean isInGroupWithUnlockedRides(List<RideState> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!isInGroupRide(list)) {
            return false;
        }
        List<RideState> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (RideState rideState : list2) {
                if (isInUnlockedRide(rideState)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return false;
        }
        return true;
    }

    public static final boolean isInRide(RideState rideState) {
        Intrinsics.checkNotNullParameter(rideState, "<this>");
        if (rideState.getStatus() != RideState.Status.ENDED) {
            return true;
        }
        return false;
    }

    public static final boolean isInUnlockedRide(RideState rideState) {
        Intrinsics.checkNotNullParameter(rideState, "<this>");
        if (rideState.getStatus() == RideState.Status.UNLOCKED) {
            return true;
        }
        return false;
    }
}
