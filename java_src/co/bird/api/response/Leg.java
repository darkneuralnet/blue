package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m28432d2 = {"Lco/bird/api/response/Leg;", "", "steps", "", "Lco/bird/api/response/Step;", "distance", "Lco/bird/api/response/Distance;", "duration", "Lco/bird/api/response/Duration;", "(Ljava/util/List;Lco/bird/api/response/Distance;Lco/bird/api/response/Duration;)V", "getDistance", "()Lco/bird/api/response/Distance;", "getDuration", "()Lco/bird/api/response/Duration;", "getSteps", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Leg {
    @JsonProperty("distance")
    @InterfaceC41208ft5("distance")
    private final Distance distance;
    @JsonProperty("duration")
    @InterfaceC41208ft5("duration")
    private final Duration duration;
    @JsonProperty("steps")
    @InterfaceC41208ft5("steps")
    private final List<Step> steps;

    public Leg() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Leg copy$default(Leg leg, List list, Distance distance, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            list = leg.steps;
        }
        if ((i & 2) != 0) {
            distance = leg.distance;
        }
        if ((i & 4) != 0) {
            duration = leg.duration;
        }
        return leg.copy(list, distance, duration);
    }

    public final List<Step> component1() {
        return this.steps;
    }

    public final Distance component2() {
        return this.distance;
    }

    public final Duration component3() {
        return this.duration;
    }

    public final Leg copy(List<Step> steps, Distance distance, Duration duration) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        return new Leg(steps, distance, duration);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Leg) {
            Leg leg = (Leg) obj;
            return Intrinsics.areEqual(this.steps, leg.steps) && Intrinsics.areEqual(this.distance, leg.distance) && Intrinsics.areEqual(this.duration, leg.duration);
        }
        return false;
    }

    public final Distance getDistance() {
        return this.distance;
    }

    public final Duration getDuration() {
        return this.duration;
    }

    public final List<Step> getSteps() {
        return this.steps;
    }

    public int hashCode() {
        int hashCode = this.steps.hashCode() * 31;
        Distance distance = this.distance;
        int hashCode2 = (hashCode + (distance == null ? 0 : distance.hashCode())) * 31;
        Duration duration = this.duration;
        return hashCode2 + (duration != null ? duration.hashCode() : 0);
    }

    public String toString() {
        List<Step> list = this.steps;
        Distance distance = this.distance;
        Duration duration = this.duration;
        return "Leg(steps=" + list + ", distance=" + distance + ", duration=" + duration + ")";
    }

    public Leg(List<Step> steps, Distance distance, Duration duration) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.steps = steps;
        this.distance = distance;
        this.duration = duration;
    }

    public /* synthetic */ Leg(List list, Distance distance, Duration duration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : distance, (i & 4) != 0 ? null : duration);
    }
}
