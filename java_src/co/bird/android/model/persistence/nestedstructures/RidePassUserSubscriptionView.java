package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;", "", "id", "", "nextRenewalAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getId", "()Ljava/lang/String;", "getNextRenewalAt", "()Lorg/joda/time/DateTime;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RidePassUserSubscriptionView {
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66702id;
    @JsonProperty("next_renewal_at")
    @InterfaceC41208ft5("next_renewal_at")
    private final DateTime nextRenewalAt;

    public RidePassUserSubscriptionView() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ RidePassUserSubscriptionView copy$default(RidePassUserSubscriptionView ridePassUserSubscriptionView, String str, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ridePassUserSubscriptionView.f66702id;
        }
        if ((i & 2) != 0) {
            dateTime = ridePassUserSubscriptionView.nextRenewalAt;
        }
        return ridePassUserSubscriptionView.copy(str, dateTime);
    }

    public final String component1() {
        return this.f66702id;
    }

    public final DateTime component2() {
        return this.nextRenewalAt;
    }

    public final RidePassUserSubscriptionView copy(String id, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new RidePassUserSubscriptionView(id, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RidePassUserSubscriptionView) {
            RidePassUserSubscriptionView ridePassUserSubscriptionView = (RidePassUserSubscriptionView) obj;
            return Intrinsics.areEqual(this.f66702id, ridePassUserSubscriptionView.f66702id) && Intrinsics.areEqual(this.nextRenewalAt, ridePassUserSubscriptionView.nextRenewalAt);
        }
        return false;
    }

    public final String getId() {
        return this.f66702id;
    }

    public final DateTime getNextRenewalAt() {
        return this.nextRenewalAt;
    }

    public int hashCode() {
        int hashCode = this.f66702id.hashCode() * 31;
        DateTime dateTime = this.nextRenewalAt;
        return hashCode + (dateTime == null ? 0 : dateTime.hashCode());
    }

    public String toString() {
        String str = this.f66702id;
        DateTime dateTime = this.nextRenewalAt;
        return "RidePassUserSubscriptionView(id=" + str + ", nextRenewalAt=" + dateTime + ")";
    }

    public RidePassUserSubscriptionView(String id, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f66702id = id;
        this.nextRenewalAt = dateTime;
    }

    public /* synthetic */ RidePassUserSubscriptionView(String str, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : dateTime);
    }
}
