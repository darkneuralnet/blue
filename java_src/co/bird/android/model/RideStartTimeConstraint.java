package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.Seconds;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u0012J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/RideStartTimeConstraint;", "", "deadline", "Lorg/joda/time/DateTime;", "badAreaType", "Lco/bird/android/model/BadAreaType;", "(Lorg/joda/time/DateTime;Lco/bird/android/model/BadAreaType;)V", "getBadAreaType", "()Lco/bird/android/model/BadAreaType;", "getDeadline", "()Lorg/joda/time/DateTime;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "isExpired", "secondsRemaining", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideStartTimeConstraint {
    private final BadAreaType badAreaType;
    private final DateTime deadline;

    public RideStartTimeConstraint(DateTime deadline, BadAreaType badAreaType) {
        Intrinsics.checkNotNullParameter(deadline, "deadline");
        Intrinsics.checkNotNullParameter(badAreaType, "badAreaType");
        this.deadline = deadline;
        this.badAreaType = badAreaType;
    }

    public static /* synthetic */ RideStartTimeConstraint copy$default(RideStartTimeConstraint rideStartTimeConstraint, DateTime dateTime, BadAreaType badAreaType, int i, Object obj) {
        if ((i & 1) != 0) {
            dateTime = rideStartTimeConstraint.deadline;
        }
        if ((i & 2) != 0) {
            badAreaType = rideStartTimeConstraint.badAreaType;
        }
        return rideStartTimeConstraint.copy(dateTime, badAreaType);
    }

    public final DateTime component1() {
        return this.deadline;
    }

    public final BadAreaType component2() {
        return this.badAreaType;
    }

    public final RideStartTimeConstraint copy(DateTime deadline, BadAreaType badAreaType) {
        Intrinsics.checkNotNullParameter(deadline, "deadline");
        Intrinsics.checkNotNullParameter(badAreaType, "badAreaType");
        return new RideStartTimeConstraint(deadline, badAreaType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RideStartTimeConstraint) {
            RideStartTimeConstraint rideStartTimeConstraint = (RideStartTimeConstraint) obj;
            return Intrinsics.areEqual(this.deadline, rideStartTimeConstraint.deadline) && this.badAreaType == rideStartTimeConstraint.badAreaType;
        }
        return false;
    }

    public final BadAreaType getBadAreaType() {
        return this.badAreaType;
    }

    public final DateTime getDeadline() {
        return this.deadline;
    }

    public int hashCode() {
        return (this.deadline.hashCode() * 31) + this.badAreaType.hashCode();
    }

    public final boolean isExpired() {
        return DateTime.now().compareTo((ReadableInstant) this.deadline) > 0;
    }

    public final int secondsRemaining() {
        if (isExpired()) {
            return 0;
        }
        return Math.abs(Seconds.secondsBetween(this.deadline, DateTime.now()).getSeconds());
    }

    public String toString() {
        DateTime dateTime = this.deadline;
        BadAreaType badAreaType = this.badAreaType;
        return "RideStartTimeConstraint(deadline=" + dateTime + ", badAreaType=" + badAreaType + ")";
    }
}
