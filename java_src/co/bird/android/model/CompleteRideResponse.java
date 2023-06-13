package co.bird.android.model;

import co.bird.android.model.wire.WireRideDetail;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/CompleteRideResponse;", "", "rideDetail", "Lco/bird/android/model/wire/WireRideDetail;", "error", "Lco/bird/android/model/CompleteRideResponseError;", "(Lco/bird/android/model/wire/WireRideDetail;Lco/bird/android/model/CompleteRideResponseError;)V", "getError", "()Lco/bird/android/model/CompleteRideResponseError;", "getRideDetail", "()Lco/bird/android/model/wire/WireRideDetail;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CompleteRideResponse {
    private final CompleteRideResponseError error;
    private final WireRideDetail rideDetail;

    public CompleteRideResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ CompleteRideResponse copy$default(CompleteRideResponse completeRideResponse, WireRideDetail wireRideDetail, CompleteRideResponseError completeRideResponseError, int i, Object obj) {
        if ((i & 1) != 0) {
            wireRideDetail = completeRideResponse.rideDetail;
        }
        if ((i & 2) != 0) {
            completeRideResponseError = completeRideResponse.error;
        }
        return completeRideResponse.copy(wireRideDetail, completeRideResponseError);
    }

    public final WireRideDetail component1() {
        return this.rideDetail;
    }

    public final CompleteRideResponseError component2() {
        return this.error;
    }

    public final CompleteRideResponse copy(WireRideDetail wireRideDetail, CompleteRideResponseError completeRideResponseError) {
        return new CompleteRideResponse(wireRideDetail, completeRideResponseError);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CompleteRideResponse) {
            CompleteRideResponse completeRideResponse = (CompleteRideResponse) obj;
            return Intrinsics.areEqual(this.rideDetail, completeRideResponse.rideDetail) && Intrinsics.areEqual(this.error, completeRideResponse.error);
        }
        return false;
    }

    public final CompleteRideResponseError getError() {
        return this.error;
    }

    public final WireRideDetail getRideDetail() {
        return this.rideDetail;
    }

    public int hashCode() {
        WireRideDetail wireRideDetail = this.rideDetail;
        int hashCode = (wireRideDetail == null ? 0 : wireRideDetail.hashCode()) * 31;
        CompleteRideResponseError completeRideResponseError = this.error;
        return hashCode + (completeRideResponseError != null ? completeRideResponseError.hashCode() : 0);
    }

    public String toString() {
        WireRideDetail wireRideDetail = this.rideDetail;
        CompleteRideResponseError completeRideResponseError = this.error;
        return "CompleteRideResponse(rideDetail=" + wireRideDetail + ", error=" + completeRideResponseError + ")";
    }

    public CompleteRideResponse(WireRideDetail wireRideDetail, CompleteRideResponseError completeRideResponseError) {
        this.rideDetail = wireRideDetail;
        this.error = completeRideResponseError;
    }

    public /* synthetic */ CompleteRideResponse(WireRideDetail wireRideDetail, CompleteRideResponseError completeRideResponseError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireRideDetail, (i & 2) != 0 ? null : completeRideResponseError);
    }
}
