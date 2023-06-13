package co.bird.android.model;

import co.bird.android.buava.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/DemandAreaAnalyticsInfo;", "", "demandLevel", "Lco/bird/android/buava/Optional;", "", "distanceToNearestDemandArea", "", "(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)V", "getDemandLevel", "()Lco/bird/android/buava/Optional;", "getDistanceToNearestDemandArea", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DemandAreaAnalyticsInfo {
    private final Optional<Integer> demandLevel;
    private final Optional<Float> distanceToNearestDemandArea;

    public DemandAreaAnalyticsInfo(Optional<Integer> demandLevel, Optional<Float> distanceToNearestDemandArea) {
        Intrinsics.checkNotNullParameter(demandLevel, "demandLevel");
        Intrinsics.checkNotNullParameter(distanceToNearestDemandArea, "distanceToNearestDemandArea");
        this.demandLevel = demandLevel;
        this.distanceToNearestDemandArea = distanceToNearestDemandArea;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DemandAreaAnalyticsInfo copy$default(DemandAreaAnalyticsInfo demandAreaAnalyticsInfo, Optional optional, Optional optional2, int i, Object obj) {
        if ((i & 1) != 0) {
            optional = demandAreaAnalyticsInfo.demandLevel;
        }
        if ((i & 2) != 0) {
            optional2 = demandAreaAnalyticsInfo.distanceToNearestDemandArea;
        }
        return demandAreaAnalyticsInfo.copy(optional, optional2);
    }

    public final Optional<Integer> component1() {
        return this.demandLevel;
    }

    public final Optional<Float> component2() {
        return this.distanceToNearestDemandArea;
    }

    public final DemandAreaAnalyticsInfo copy(Optional<Integer> demandLevel, Optional<Float> distanceToNearestDemandArea) {
        Intrinsics.checkNotNullParameter(demandLevel, "demandLevel");
        Intrinsics.checkNotNullParameter(distanceToNearestDemandArea, "distanceToNearestDemandArea");
        return new DemandAreaAnalyticsInfo(demandLevel, distanceToNearestDemandArea);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DemandAreaAnalyticsInfo) {
            DemandAreaAnalyticsInfo demandAreaAnalyticsInfo = (DemandAreaAnalyticsInfo) obj;
            return Intrinsics.areEqual(this.demandLevel, demandAreaAnalyticsInfo.demandLevel) && Intrinsics.areEqual(this.distanceToNearestDemandArea, demandAreaAnalyticsInfo.distanceToNearestDemandArea);
        }
        return false;
    }

    public final Optional<Integer> getDemandLevel() {
        return this.demandLevel;
    }

    public final Optional<Float> getDistanceToNearestDemandArea() {
        return this.distanceToNearestDemandArea;
    }

    public int hashCode() {
        return (this.demandLevel.hashCode() * 31) + this.distanceToNearestDemandArea.hashCode();
    }

    public String toString() {
        Optional<Integer> optional = this.demandLevel;
        Optional<Float> optional2 = this.distanceToNearestDemandArea;
        return "DemandAreaAnalyticsInfo(demandLevel=" + optional + ", distanceToNearestDemandArea=" + optional2 + ")";
    }
}
