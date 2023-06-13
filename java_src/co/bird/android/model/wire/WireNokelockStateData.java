package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/model/wire/WireNokelockStateData;", "Lco/bird/android/model/wire/WireNokelockResponseData;", "isLocked", "", "(Z)V", "()Z", "component1", "copy", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNokelockStateData extends WireNokelockResponseData {
    @JsonProperty("is_locked")
    @InterfaceC41208ft5("is_locked")
    private final boolean isLocked;

    public WireNokelockStateData() {
        this(false, 1, null);
    }

    public static /* synthetic */ WireNokelockStateData copy$default(WireNokelockStateData wireNokelockStateData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wireNokelockStateData.isLocked;
        }
        return wireNokelockStateData.copy(z);
    }

    public final boolean component1() {
        return this.isLocked;
    }

    public final WireNokelockStateData copy(boolean z) {
        return new WireNokelockStateData(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WireNokelockStateData) && this.isLocked == ((WireNokelockStateData) obj).isLocked;
    }

    public int hashCode() {
        boolean z = this.isLocked;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public String toString() {
        boolean z = this.isLocked;
        return "WireNokelockStateData(isLocked=" + z + ")";
    }

    public /* synthetic */ WireNokelockStateData(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public WireNokelockStateData(boolean z) {
        super(null);
        this.isLocked = z;
    }
}
