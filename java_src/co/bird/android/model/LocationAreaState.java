package co.bird.android.model;

import co.bird.android.model.persistence.Area;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\u0089\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\u0006\u0010)\u001a\u00020*J\t\u0010+\u001a\u00020\u0006HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015¨\u0006-"}, m28432d2 = {"Lco/bird/android/model/LocationAreaState;", "", "location", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "areasWithin", "", "", "Lco/bird/android/model/persistence/Area;", "serviceAreas", "", "noRideAreas", "noParkingAreas", "reducedSpeedAreas", "restrictedParkingAreas", "warningAreas", "(Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V", "getAreasWithin", "()Ljava/util/Map;", "getLocation", "()Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "getNoParkingAreas", "()Ljava/util/Set;", "getNoRideAreas", "getReducedSpeedAreas", "getRestrictedParkingAreas", "getServiceAreas", "getWarningAreas", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toRiderAreaState", "Lco/bird/android/model/RiderAreaState;", "toString", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nLocationAreaState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationAreaState.kt\nco/bird/android/model/LocationAreaState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
/* loaded from: classes4.dex */
public final class LocationAreaState {
    public static final Companion Companion = new Companion(null);
    private final Map<String, Area> areasWithin;
    private final Geolocation location;
    private final Set<String> noParkingAreas;
    private final Set<String> noRideAreas;
    private final Set<String> reducedSpeedAreas;
    private final Set<String> restrictedParkingAreas;
    private final Set<String> serviceAreas;
    private final Set<String> warningAreas;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/LocationAreaState$Companion;", "", "()V", "emptyLocationAreaState", "Lco/bird/android/model/LocationAreaState;", "location", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LocationAreaState emptyLocationAreaState(Geolocation location) {
            Map emptyMap;
            Set emptySet;
            Set emptySet2;
            Set emptySet3;
            Set emptySet4;
            Set emptySet5;
            Set emptySet6;
            Intrinsics.checkNotNullParameter(location, "location");
            emptyMap = MapsKt__MapsKt.emptyMap();
            emptySet = SetsKt__SetsKt.emptySet();
            emptySet2 = SetsKt__SetsKt.emptySet();
            emptySet3 = SetsKt__SetsKt.emptySet();
            emptySet4 = SetsKt__SetsKt.emptySet();
            emptySet5 = SetsKt__SetsKt.emptySet();
            emptySet6 = SetsKt__SetsKt.emptySet();
            return new LocationAreaState(location, emptyMap, emptySet, emptySet2, emptySet3, emptySet4, emptySet5, emptySet6);
        }

        private Companion() {
        }
    }

    public LocationAreaState(Geolocation location, Map<String, Area> areasWithin, Set<String> serviceAreas, Set<String> noRideAreas, Set<String> noParkingAreas, Set<String> reducedSpeedAreas, Set<String> restrictedParkingAreas, Set<String> warningAreas) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(areasWithin, "areasWithin");
        Intrinsics.checkNotNullParameter(serviceAreas, "serviceAreas");
        Intrinsics.checkNotNullParameter(noRideAreas, "noRideAreas");
        Intrinsics.checkNotNullParameter(noParkingAreas, "noParkingAreas");
        Intrinsics.checkNotNullParameter(reducedSpeedAreas, "reducedSpeedAreas");
        Intrinsics.checkNotNullParameter(restrictedParkingAreas, "restrictedParkingAreas");
        Intrinsics.checkNotNullParameter(warningAreas, "warningAreas");
        this.location = location;
        this.areasWithin = areasWithin;
        this.serviceAreas = serviceAreas;
        this.noRideAreas = noRideAreas;
        this.noParkingAreas = noParkingAreas;
        this.reducedSpeedAreas = reducedSpeedAreas;
        this.restrictedParkingAreas = restrictedParkingAreas;
        this.warningAreas = warningAreas;
    }

    public final Geolocation component1() {
        return this.location;
    }

    public final Map<String, Area> component2() {
        return this.areasWithin;
    }

    public final Set<String> component3() {
        return this.serviceAreas;
    }

    public final Set<String> component4() {
        return this.noRideAreas;
    }

    public final Set<String> component5() {
        return this.noParkingAreas;
    }

    public final Set<String> component6() {
        return this.reducedSpeedAreas;
    }

    public final Set<String> component7() {
        return this.restrictedParkingAreas;
    }

    public final Set<String> component8() {
        return this.warningAreas;
    }

    public final LocationAreaState copy(Geolocation location, Map<String, Area> areasWithin, Set<String> serviceAreas, Set<String> noRideAreas, Set<String> noParkingAreas, Set<String> reducedSpeedAreas, Set<String> restrictedParkingAreas, Set<String> warningAreas) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(areasWithin, "areasWithin");
        Intrinsics.checkNotNullParameter(serviceAreas, "serviceAreas");
        Intrinsics.checkNotNullParameter(noRideAreas, "noRideAreas");
        Intrinsics.checkNotNullParameter(noParkingAreas, "noParkingAreas");
        Intrinsics.checkNotNullParameter(reducedSpeedAreas, "reducedSpeedAreas");
        Intrinsics.checkNotNullParameter(restrictedParkingAreas, "restrictedParkingAreas");
        Intrinsics.checkNotNullParameter(warningAreas, "warningAreas");
        return new LocationAreaState(location, areasWithin, serviceAreas, noRideAreas, noParkingAreas, reducedSpeedAreas, restrictedParkingAreas, warningAreas);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocationAreaState) {
            LocationAreaState locationAreaState = (LocationAreaState) obj;
            return Intrinsics.areEqual(this.location, locationAreaState.location) && Intrinsics.areEqual(this.areasWithin, locationAreaState.areasWithin) && Intrinsics.areEqual(this.serviceAreas, locationAreaState.serviceAreas) && Intrinsics.areEqual(this.noRideAreas, locationAreaState.noRideAreas) && Intrinsics.areEqual(this.noParkingAreas, locationAreaState.noParkingAreas) && Intrinsics.areEqual(this.reducedSpeedAreas, locationAreaState.reducedSpeedAreas) && Intrinsics.areEqual(this.restrictedParkingAreas, locationAreaState.restrictedParkingAreas) && Intrinsics.areEqual(this.warningAreas, locationAreaState.warningAreas);
        }
        return false;
    }

    public final Map<String, Area> getAreasWithin() {
        return this.areasWithin;
    }

    public final Geolocation getLocation() {
        return this.location;
    }

    public final Set<String> getNoParkingAreas() {
        return this.noParkingAreas;
    }

    public final Set<String> getNoRideAreas() {
        return this.noRideAreas;
    }

    public final Set<String> getReducedSpeedAreas() {
        return this.reducedSpeedAreas;
    }

    public final Set<String> getRestrictedParkingAreas() {
        return this.restrictedParkingAreas;
    }

    public final Set<String> getServiceAreas() {
        return this.serviceAreas;
    }

    public final Set<String> getWarningAreas() {
        return this.warningAreas;
    }

    public int hashCode() {
        return (((((((((((((this.location.hashCode() * 31) + this.areasWithin.hashCode()) * 31) + this.serviceAreas.hashCode()) * 31) + this.noRideAreas.hashCode()) * 31) + this.noParkingAreas.hashCode()) * 31) + this.reducedSpeedAreas.hashCode()) * 31) + this.restrictedParkingAreas.hashCode()) * 31) + this.warningAreas.hashCode();
    }

    public final RiderAreaState toRiderAreaState() {
        Object firstOrNull;
        Area area;
        Integer num;
        String str;
        String str2;
        if (this.serviceAreas.isEmpty()) {
            return OUTSIDE_SERVICE_AREA.INSTANCE;
        }
        if ((!this.noRideAreas.isEmpty()) && (!this.noParkingAreas.isEmpty())) {
            return IN_NO_RIDE_NO_PARK_AREA.INSTANCE;
        }
        if (!this.noRideAreas.isEmpty()) {
            return IN_NO_RIDE_AREA.INSTANCE;
        }
        if (!this.restrictedParkingAreas.isEmpty()) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull(this.restrictedParkingAreas);
            String str3 = (String) firstOrNull;
            String str4 = null;
            if (str3 != null) {
                area = this.areasWithin.get(str3);
            } else {
                area = null;
            }
            if (area != null) {
                num = area.getNoParkingFineAmount();
            } else {
                num = null;
            }
            if (area != null) {
                str = area.getNoParkingFineCurrency();
            } else {
                str = null;
            }
            if (area != null) {
                str2 = area.getNoParkingFineAlertTitle();
            } else {
                str2 = null;
            }
            if (area != null) {
                str4 = area.getNoParkingFineAlertMessage();
            }
            return new IN_RESTRICTED_PARKING_AREA(num, str, str2, str4);
        } else if (!this.noParkingAreas.isEmpty()) {
            if (!this.reducedSpeedAreas.isEmpty()) {
                return IN_SLOW_NO_PARK_AREA.INSTANCE;
            }
            return IN_NO_PARKING_AREA.INSTANCE;
        } else if (!this.reducedSpeedAreas.isEmpty()) {
            return IN_SLOW_AREA.INSTANCE;
        } else {
            return IN_SERVICE_AREA.INSTANCE;
        }
    }

    public String toString() {
        Geolocation geolocation = this.location;
        Map<String, Area> map = this.areasWithin;
        Set<String> set = this.serviceAreas;
        Set<String> set2 = this.noRideAreas;
        Set<String> set3 = this.noParkingAreas;
        Set<String> set4 = this.reducedSpeedAreas;
        Set<String> set5 = this.restrictedParkingAreas;
        Set<String> set6 = this.warningAreas;
        return "LocationAreaState(location=" + geolocation + ", areasWithin=" + map + ", serviceAreas=" + set + ", noRideAreas=" + set2 + ", noParkingAreas=" + set3 + ", reducedSpeedAreas=" + set4 + ", restrictedParkingAreas=" + set5 + ", warningAreas=" + set6 + ")";
    }
}
