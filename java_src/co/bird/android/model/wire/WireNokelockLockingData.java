package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/wire/WireNokelockLockingData;", "Lco/bird/android/model/wire/WireNokelockResponseData;", "success", "", "(Z)V", "getSuccess", "()Z", "component1", "copy", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNokelockLockingData extends WireNokelockResponseData {
    @JsonProperty("success")
    @InterfaceC41208ft5("success")
    private final boolean success;

    public WireNokelockLockingData() {
        this(false, 1, null);
    }

    public static /* synthetic */ WireNokelockLockingData copy$default(WireNokelockLockingData wireNokelockLockingData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wireNokelockLockingData.success;
        }
        return wireNokelockLockingData.copy(z);
    }

    public final boolean component1() {
        return this.success;
    }

    public final WireNokelockLockingData copy(boolean z) {
        return new WireNokelockLockingData(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WireNokelockLockingData) && this.success == ((WireNokelockLockingData) obj).success;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        boolean z = this.success;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.success;
        return "WireNokelockLockingData(success=" + z + ")";
    }

    public /* synthetic */ WireNokelockLockingData(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public WireNokelockLockingData(boolean z) {
        super(null);
        this.success = z;
    }
}
