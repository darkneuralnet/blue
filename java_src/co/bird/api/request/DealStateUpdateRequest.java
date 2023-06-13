package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/api/request/DealStateUpdateRequest;", "", "id", "", TransferTable.COLUMN_STATE, "Lco/bird/api/request/DealAcknowledgmentState;", "(Ljava/lang/String;Lco/bird/api/request/DealAcknowledgmentState;)V", "getId", "()Ljava/lang/String;", "getState", "()Lco/bird/api/request/DealAcknowledgmentState;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DealStateUpdateRequest {
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68202id;
    @JsonProperty(TransferTable.COLUMN_STATE)
    @InterfaceC41208ft5(TransferTable.COLUMN_STATE)
    private final DealAcknowledgmentState state;

    public DealStateUpdateRequest(String id, DealAcknowledgmentState state) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f68202id = id;
        this.state = state;
    }

    public static /* synthetic */ DealStateUpdateRequest copy$default(DealStateUpdateRequest dealStateUpdateRequest, String str, DealAcknowledgmentState dealAcknowledgmentState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dealStateUpdateRequest.f68202id;
        }
        if ((i & 2) != 0) {
            dealAcknowledgmentState = dealStateUpdateRequest.state;
        }
        return dealStateUpdateRequest.copy(str, dealAcknowledgmentState);
    }

    public final String component1() {
        return this.f68202id;
    }

    public final DealAcknowledgmentState component2() {
        return this.state;
    }

    public final DealStateUpdateRequest copy(String id, DealAcknowledgmentState state) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        return new DealStateUpdateRequest(id, state);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DealStateUpdateRequest) {
            DealStateUpdateRequest dealStateUpdateRequest = (DealStateUpdateRequest) obj;
            return Intrinsics.areEqual(this.f68202id, dealStateUpdateRequest.f68202id) && this.state == dealStateUpdateRequest.state;
        }
        return false;
    }

    public final String getId() {
        return this.f68202id;
    }

    public final DealAcknowledgmentState getState() {
        return this.state;
    }

    public int hashCode() {
        return (this.f68202id.hashCode() * 31) + this.state.hashCode();
    }

    public String toString() {
        String str = this.f68202id;
        DealAcknowledgmentState dealAcknowledgmentState = this.state;
        return "DealStateUpdateRequest(id=" + str + ", state=" + dealAcknowledgmentState + ")";
    }
}
