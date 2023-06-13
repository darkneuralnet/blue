package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.InventoryScanningError;
import co.bird.android.model.wire.WireHardCountBird;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, m28432d2 = {"Lco/bird/api/response/HardCountScanResponse;", "", "hardCountBird", "Lco/bird/android/model/wire/WireHardCountBird;", "errorCode", "Lco/bird/android/model/constant/InventoryScanningError;", "failureScans", "", "successScans", "userFailureScans", "userSuccessScans", "(Lco/bird/android/model/wire/WireHardCountBird;Lco/bird/android/model/constant/InventoryScanningError;IIII)V", "getErrorCode", "()Lco/bird/android/model/constant/InventoryScanningError;", "getFailureScans", "()I", "getHardCountBird", "()Lco/bird/android/model/wire/WireHardCountBird;", "getSuccessScans", "getUserFailureScans", "getUserSuccessScans", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class HardCountScanResponse {
    @JsonProperty("error_code")
    @InterfaceC41208ft5("error_code")
    private final InventoryScanningError errorCode;
    @JsonProperty("failure_count")
    @InterfaceC41208ft5("failure_count")
    private final int failureScans;
    @JsonProperty("vehicle")
    @InterfaceC41208ft5("vehicle")
    private final WireHardCountBird hardCountBird;
    @JsonProperty("success_count")
    @InterfaceC41208ft5("success_count")
    private final int successScans;
    @JsonProperty("user_failure_count")
    @InterfaceC41208ft5("user_failure_count")
    private final int userFailureScans;
    @JsonProperty("user_success_count")
    @InterfaceC41208ft5("user_success_count")
    private final int userSuccessScans;

    public HardCountScanResponse() {
        this(null, null, 0, 0, 0, 0, 63, null);
    }

    public static /* synthetic */ HardCountScanResponse copy$default(HardCountScanResponse hardCountScanResponse, WireHardCountBird wireHardCountBird, InventoryScanningError inventoryScanningError, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            wireHardCountBird = hardCountScanResponse.hardCountBird;
        }
        if ((i5 & 2) != 0) {
            inventoryScanningError = hardCountScanResponse.errorCode;
        }
        InventoryScanningError inventoryScanningError2 = inventoryScanningError;
        if ((i5 & 4) != 0) {
            i = hardCountScanResponse.failureScans;
        }
        int i6 = i;
        if ((i5 & 8) != 0) {
            i2 = hardCountScanResponse.successScans;
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = hardCountScanResponse.userFailureScans;
        }
        int i8 = i3;
        if ((i5 & 32) != 0) {
            i4 = hardCountScanResponse.userSuccessScans;
        }
        return hardCountScanResponse.copy(wireHardCountBird, inventoryScanningError2, i6, i7, i8, i4);
    }

    public final WireHardCountBird component1() {
        return this.hardCountBird;
    }

    public final InventoryScanningError component2() {
        return this.errorCode;
    }

    public final int component3() {
        return this.failureScans;
    }

    public final int component4() {
        return this.successScans;
    }

    public final int component5() {
        return this.userFailureScans;
    }

    public final int component6() {
        return this.userSuccessScans;
    }

    public final HardCountScanResponse copy(WireHardCountBird wireHardCountBird, InventoryScanningError inventoryScanningError, int i, int i2, int i3, int i4) {
        return new HardCountScanResponse(wireHardCountBird, inventoryScanningError, i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HardCountScanResponse) {
            HardCountScanResponse hardCountScanResponse = (HardCountScanResponse) obj;
            return Intrinsics.areEqual(this.hardCountBird, hardCountScanResponse.hardCountBird) && this.errorCode == hardCountScanResponse.errorCode && this.failureScans == hardCountScanResponse.failureScans && this.successScans == hardCountScanResponse.successScans && this.userFailureScans == hardCountScanResponse.userFailureScans && this.userSuccessScans == hardCountScanResponse.userSuccessScans;
        }
        return false;
    }

    public final InventoryScanningError getErrorCode() {
        return this.errorCode;
    }

    public final int getFailureScans() {
        return this.failureScans;
    }

    public final WireHardCountBird getHardCountBird() {
        return this.hardCountBird;
    }

    public final int getSuccessScans() {
        return this.successScans;
    }

    public final int getUserFailureScans() {
        return this.userFailureScans;
    }

    public final int getUserSuccessScans() {
        return this.userSuccessScans;
    }

    public int hashCode() {
        WireHardCountBird wireHardCountBird = this.hardCountBird;
        int hashCode = (wireHardCountBird == null ? 0 : wireHardCountBird.hashCode()) * 31;
        InventoryScanningError inventoryScanningError = this.errorCode;
        return ((((((((hashCode + (inventoryScanningError != null ? inventoryScanningError.hashCode() : 0)) * 31) + Integer.hashCode(this.failureScans)) * 31) + Integer.hashCode(this.successScans)) * 31) + Integer.hashCode(this.userFailureScans)) * 31) + Integer.hashCode(this.userSuccessScans);
    }

    public String toString() {
        WireHardCountBird wireHardCountBird = this.hardCountBird;
        InventoryScanningError inventoryScanningError = this.errorCode;
        int i = this.failureScans;
        int i2 = this.successScans;
        int i3 = this.userFailureScans;
        int i4 = this.userSuccessScans;
        return "HardCountScanResponse(hardCountBird=" + wireHardCountBird + ", errorCode=" + inventoryScanningError + ", failureScans=" + i + ", successScans=" + i2 + ", userFailureScans=" + i3 + ", userSuccessScans=" + i4 + ")";
    }

    public HardCountScanResponse(WireHardCountBird wireHardCountBird, InventoryScanningError inventoryScanningError, int i, int i2, int i3, int i4) {
        this.hardCountBird = wireHardCountBird;
        this.errorCode = inventoryScanningError;
        this.failureScans = i;
        this.successScans = i2;
        this.userFailureScans = i3;
        this.userSuccessScans = i4;
    }

    public /* synthetic */ HardCountScanResponse(WireHardCountBird wireHardCountBird, InventoryScanningError inventoryScanningError, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : wireHardCountBird, (i5 & 2) == 0 ? inventoryScanningError : null, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? 0 : i4);
    }
}
