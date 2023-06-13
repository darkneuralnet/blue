package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m28432d2 = {"Lco/bird/api/response/EligibilityResponse;", "", "eligible", "", "releaseOnTimePercent", "Lco/bird/api/response/Counts;", "releaseNumber", "(Ljava/lang/Boolean;Lco/bird/api/response/Counts;Lco/bird/api/response/Counts;)V", "getEligible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getReleaseNumber", "()Lco/bird/api/response/Counts;", "getReleaseOnTimePercent", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Lco/bird/api/response/Counts;Lco/bird/api/response/Counts;)Lco/bird/api/response/EligibilityResponse;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class EligibilityResponse {
    @JsonProperty("eligible")
    @InterfaceC41208ft5("eligible")
    private final Boolean eligible;
    @JsonProperty("release_number")
    @InterfaceC41208ft5("release_number")
    private final Counts releaseNumber;
    @JsonProperty("release_on_time_percent")
    @InterfaceC41208ft5("release_on_time_percent")
    private final Counts releaseOnTimePercent;

    public EligibilityResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ EligibilityResponse copy$default(EligibilityResponse eligibilityResponse, Boolean bool, Counts counts, Counts counts2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = eligibilityResponse.eligible;
        }
        if ((i & 2) != 0) {
            counts = eligibilityResponse.releaseOnTimePercent;
        }
        if ((i & 4) != 0) {
            counts2 = eligibilityResponse.releaseNumber;
        }
        return eligibilityResponse.copy(bool, counts, counts2);
    }

    public final Boolean component1() {
        return this.eligible;
    }

    public final Counts component2() {
        return this.releaseOnTimePercent;
    }

    public final Counts component3() {
        return this.releaseNumber;
    }

    public final EligibilityResponse copy(Boolean bool, Counts counts, Counts counts2) {
        return new EligibilityResponse(bool, counts, counts2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EligibilityResponse) {
            EligibilityResponse eligibilityResponse = (EligibilityResponse) obj;
            return Intrinsics.areEqual(this.eligible, eligibilityResponse.eligible) && Intrinsics.areEqual(this.releaseOnTimePercent, eligibilityResponse.releaseOnTimePercent) && Intrinsics.areEqual(this.releaseNumber, eligibilityResponse.releaseNumber);
        }
        return false;
    }

    public final Boolean getEligible() {
        return this.eligible;
    }

    public final Counts getReleaseNumber() {
        return this.releaseNumber;
    }

    public final Counts getReleaseOnTimePercent() {
        return this.releaseOnTimePercent;
    }

    public int hashCode() {
        Boolean bool = this.eligible;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Counts counts = this.releaseOnTimePercent;
        int hashCode2 = (hashCode + (counts == null ? 0 : counts.hashCode())) * 31;
        Counts counts2 = this.releaseNumber;
        return hashCode2 + (counts2 != null ? counts2.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.eligible;
        Counts counts = this.releaseOnTimePercent;
        Counts counts2 = this.releaseNumber;
        return "EligibilityResponse(eligible=" + bool + ", releaseOnTimePercent=" + counts + ", releaseNumber=" + counts2 + ")";
    }

    public EligibilityResponse(Boolean bool, Counts counts, Counts counts2) {
        this.eligible = bool;
        this.releaseOnTimePercent = counts;
        this.releaseNumber = counts2;
    }

    public /* synthetic */ EligibilityResponse(Boolean bool, Counts counts, Counts counts2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : counts, (i & 4) != 0 ? null : counts2);
    }
}
