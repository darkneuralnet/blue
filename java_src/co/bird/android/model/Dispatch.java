package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u001f\u001a\u00020 J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, m28432d2 = {"Lco/bird/android/model/Dispatch;", "", "dispatchId", "", "birdId", "dispatchUserKind", "Lco/bird/android/model/DispatchUserKind;", "dispatchExpiresAt", "Lorg/joda/time/DateTime;", "bountyClaimExpiresAt", "dispatchCreatedAt", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/DispatchUserKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getBirdId", "()Ljava/lang/String;", "getBountyClaimExpiresAt", "()Lorg/joda/time/DateTime;", "getDispatchCreatedAt", "getDispatchExpiresAt", "getDispatchId", "getDispatchUserKind", "()Lco/bird/android/model/DispatchUserKind;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "getDispatchState", "Lco/bird/android/model/DispatchState;", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Dispatch {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("bounty_claim_expires_at")
    @InterfaceC41208ft5("bounty_claim_expires_at")
    private final DateTime bountyClaimExpiresAt;
    @JsonProperty("dispatch_created_at")
    @InterfaceC41208ft5("dispatch_created_at")
    private final DateTime dispatchCreatedAt;
    @JsonProperty("dispatch_expires_at")
    @InterfaceC41208ft5("dispatch_expires_at")
    private final DateTime dispatchExpiresAt;
    @JsonProperty("dispatch_id")
    @InterfaceC41208ft5("dispatch_id")
    private final String dispatchId;
    @JsonProperty("dispatch_user_kind")
    @InterfaceC41208ft5("dispatch_user_kind")
    private final DispatchUserKind dispatchUserKind;

    public Dispatch(String dispatchId, String birdId, DispatchUserKind dispatchUserKind, DateTime dateTime, DateTime dateTime2, DateTime dateTime3) {
        Intrinsics.checkNotNullParameter(dispatchId, "dispatchId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(dispatchUserKind, "dispatchUserKind");
        this.dispatchId = dispatchId;
        this.birdId = birdId;
        this.dispatchUserKind = dispatchUserKind;
        this.dispatchExpiresAt = dateTime;
        this.bountyClaimExpiresAt = dateTime2;
        this.dispatchCreatedAt = dateTime3;
    }

    public static /* synthetic */ Dispatch copy$default(Dispatch dispatch, String str, String str2, DispatchUserKind dispatchUserKind, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dispatch.dispatchId;
        }
        if ((i & 2) != 0) {
            str2 = dispatch.birdId;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            dispatchUserKind = dispatch.dispatchUserKind;
        }
        DispatchUserKind dispatchUserKind2 = dispatchUserKind;
        if ((i & 8) != 0) {
            dateTime = dispatch.dispatchExpiresAt;
        }
        DateTime dateTime4 = dateTime;
        if ((i & 16) != 0) {
            dateTime2 = dispatch.bountyClaimExpiresAt;
        }
        DateTime dateTime5 = dateTime2;
        if ((i & 32) != 0) {
            dateTime3 = dispatch.dispatchCreatedAt;
        }
        return dispatch.copy(str, str3, dispatchUserKind2, dateTime4, dateTime5, dateTime3);
    }

    public final String component1() {
        return this.dispatchId;
    }

    public final String component2() {
        return this.birdId;
    }

    public final DispatchUserKind component3() {
        return this.dispatchUserKind;
    }

    public final DateTime component4() {
        return this.dispatchExpiresAt;
    }

    public final DateTime component5() {
        return this.bountyClaimExpiresAt;
    }

    public final DateTime component6() {
        return this.dispatchCreatedAt;
    }

    public final Dispatch copy(String dispatchId, String birdId, DispatchUserKind dispatchUserKind, DateTime dateTime, DateTime dateTime2, DateTime dateTime3) {
        Intrinsics.checkNotNullParameter(dispatchId, "dispatchId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(dispatchUserKind, "dispatchUserKind");
        return new Dispatch(dispatchId, birdId, dispatchUserKind, dateTime, dateTime2, dateTime3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Dispatch) {
            Dispatch dispatch = (Dispatch) obj;
            return Intrinsics.areEqual(this.dispatchId, dispatch.dispatchId) && Intrinsics.areEqual(this.birdId, dispatch.birdId) && this.dispatchUserKind == dispatch.dispatchUserKind && Intrinsics.areEqual(this.dispatchExpiresAt, dispatch.dispatchExpiresAt) && Intrinsics.areEqual(this.bountyClaimExpiresAt, dispatch.bountyClaimExpiresAt) && Intrinsics.areEqual(this.dispatchCreatedAt, dispatch.dispatchCreatedAt);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final DateTime getBountyClaimExpiresAt() {
        return this.bountyClaimExpiresAt;
    }

    public final DateTime getDispatchCreatedAt() {
        return this.dispatchCreatedAt;
    }

    public final DateTime getDispatchExpiresAt() {
        return this.dispatchExpiresAt;
    }

    public final String getDispatchId() {
        return this.dispatchId;
    }

    public final DispatchState getDispatchState() {
        boolean z;
        boolean z2;
        DateTime dateTime;
        DateTime dateTime2 = this.dispatchExpiresAt;
        boolean z3 = true;
        if (dateTime2 != null && dateTime2.isBeforeNow()) {
            z = true;
        } else {
            z = false;
        }
        if (z && ((dateTime = this.bountyClaimExpiresAt) == null || dateTime.isBeforeNow())) {
            return DispatchState.EXPIRED;
        }
        DateTime dateTime3 = this.bountyClaimExpiresAt;
        if (dateTime3 != null && dateTime3.isAfterNow()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return DispatchState.CLAIMED;
        }
        DateTime dateTime4 = this.dispatchExpiresAt;
        if (dateTime4 == null || !dateTime4.isAfterNow()) {
            z3 = false;
        }
        if (z3) {
            return DispatchState.OFFERED;
        }
        return DispatchState.UNKNOWN;
    }

    public final DispatchUserKind getDispatchUserKind() {
        return this.dispatchUserKind;
    }

    public int hashCode() {
        int hashCode = ((((this.dispatchId.hashCode() * 31) + this.birdId.hashCode()) * 31) + this.dispatchUserKind.hashCode()) * 31;
        DateTime dateTime = this.dispatchExpiresAt;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.bountyClaimExpiresAt;
        int hashCode3 = (hashCode2 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.dispatchCreatedAt;
        return hashCode3 + (dateTime3 != null ? dateTime3.hashCode() : 0);
    }

    public String toString() {
        String str = this.dispatchId;
        String str2 = this.birdId;
        DispatchUserKind dispatchUserKind = this.dispatchUserKind;
        DateTime dateTime = this.dispatchExpiresAt;
        DateTime dateTime2 = this.bountyClaimExpiresAt;
        DateTime dateTime3 = this.dispatchCreatedAt;
        return "Dispatch(dispatchId=" + str + ", birdId=" + str2 + ", dispatchUserKind=" + dispatchUserKind + ", dispatchExpiresAt=" + dateTime + ", bountyClaimExpiresAt=" + dateTime2 + ", dispatchCreatedAt=" + dateTime3 + ")";
    }

    public /* synthetic */ Dispatch(String str, String str2, DispatchUserKind dispatchUserKind, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, dispatchUserKind, (i & 8) != 0 ? null : dateTime, (i & 16) != 0 ? null : dateTime2, (i & 32) != 0 ? null : dateTime3);
    }
}
