package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.QuickCaptureState;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/api/response/QuickCaptureStateResponse;", "", TransferTable.COLUMN_STATE, "Lco/bird/android/model/constant/QuickCaptureState;", "(Lco/bird/android/model/constant/QuickCaptureState;)V", "getState", "()Lco/bird/android/model/constant/QuickCaptureState;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class QuickCaptureStateResponse {
    @JsonProperty(TransferTable.COLUMN_STATE)
    @InterfaceC41208ft5(TransferTable.COLUMN_STATE)
    private final QuickCaptureState state;

    public QuickCaptureStateResponse(QuickCaptureState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
    }

    public static /* synthetic */ QuickCaptureStateResponse copy$default(QuickCaptureStateResponse quickCaptureStateResponse, QuickCaptureState quickCaptureState, int i, Object obj) {
        if ((i & 1) != 0) {
            quickCaptureState = quickCaptureStateResponse.state;
        }
        return quickCaptureStateResponse.copy(quickCaptureState);
    }

    public final QuickCaptureState component1() {
        return this.state;
    }

    public final QuickCaptureStateResponse copy(QuickCaptureState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new QuickCaptureStateResponse(state);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QuickCaptureStateResponse) && this.state == ((QuickCaptureStateResponse) obj).state;
    }

    public final QuickCaptureState getState() {
        return this.state;
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    public String toString() {
        QuickCaptureState quickCaptureState = this.state;
        return "QuickCaptureStateResponse(state=" + quickCaptureState + ")";
    }
}
