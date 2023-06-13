package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/wire/WireNokelockTokenResponseData;", "Lco/bird/android/model/wire/WireNokelockResponseData;", "unlockRequest", "", "stateRequest", "lockingRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLockingRequest", "()Ljava/lang/String;", "getStateRequest", "getUnlockRequest", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNokelockTokenResponseData extends WireNokelockResponseData {
    @JsonProperty("locking")
    @InterfaceC41208ft5("locking")
    private final String lockingRequest;
    @JsonProperty(TransferTable.COLUMN_STATE)
    @InterfaceC41208ft5(TransferTable.COLUMN_STATE)
    private final String stateRequest;
    @JsonProperty("unlock")
    @InterfaceC41208ft5("unlock")
    private final String unlockRequest;

    public WireNokelockTokenResponseData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WireNokelockTokenResponseData copy$default(WireNokelockTokenResponseData wireNokelockTokenResponseData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireNokelockTokenResponseData.unlockRequest;
        }
        if ((i & 2) != 0) {
            str2 = wireNokelockTokenResponseData.stateRequest;
        }
        if ((i & 4) != 0) {
            str3 = wireNokelockTokenResponseData.lockingRequest;
        }
        return wireNokelockTokenResponseData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.unlockRequest;
    }

    public final String component2() {
        return this.stateRequest;
    }

    public final String component3() {
        return this.lockingRequest;
    }

    public final WireNokelockTokenResponseData copy(String unlockRequest, String stateRequest, String lockingRequest) {
        Intrinsics.checkNotNullParameter(unlockRequest, "unlockRequest");
        Intrinsics.checkNotNullParameter(stateRequest, "stateRequest");
        Intrinsics.checkNotNullParameter(lockingRequest, "lockingRequest");
        return new WireNokelockTokenResponseData(unlockRequest, stateRequest, lockingRequest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireNokelockTokenResponseData) {
            WireNokelockTokenResponseData wireNokelockTokenResponseData = (WireNokelockTokenResponseData) obj;
            return Intrinsics.areEqual(this.unlockRequest, wireNokelockTokenResponseData.unlockRequest) && Intrinsics.areEqual(this.stateRequest, wireNokelockTokenResponseData.stateRequest) && Intrinsics.areEqual(this.lockingRequest, wireNokelockTokenResponseData.lockingRequest);
        }
        return false;
    }

    public final String getLockingRequest() {
        return this.lockingRequest;
    }

    public final String getStateRequest() {
        return this.stateRequest;
    }

    public final String getUnlockRequest() {
        return this.unlockRequest;
    }

    public int hashCode() {
        return (((this.unlockRequest.hashCode() * 31) + this.stateRequest.hashCode()) * 31) + this.lockingRequest.hashCode();
    }

    public String toString() {
        String str = this.unlockRequest;
        String str2 = this.stateRequest;
        String str3 = this.lockingRequest;
        return "WireNokelockTokenResponseData(unlockRequest=" + str + ", stateRequest=" + str2 + ", lockingRequest=" + str3 + ")";
    }

    public /* synthetic */ WireNokelockTokenResponseData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WireNokelockTokenResponseData(String unlockRequest, String stateRequest, String lockingRequest) {
        super(null);
        Intrinsics.checkNotNullParameter(unlockRequest, "unlockRequest");
        Intrinsics.checkNotNullParameter(stateRequest, "stateRequest");
        Intrinsics.checkNotNullParameter(lockingRequest, "lockingRequest");
        this.unlockRequest = unlockRequest;
        this.stateRequest = stateRequest;
        this.lockingRequest = lockingRequest;
    }
}
