package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, m28432d2 = {"Lco/bird/api/response/ProvisionalSmartlock;", "", "macAddress", "", "serialNumber", "provisional", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getMacAddress", "()Ljava/lang/String;", "getProvisional", "()Z", "getSerialNumber", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ProvisionalSmartlock {
    @JsonProperty("mac_address")
    @InterfaceC41208ft5("mac_address")
    private final String macAddress;
    @JsonProperty("provisional")
    @InterfaceC41208ft5("provisional")
    private final boolean provisional;
    @JsonProperty("serial_number")
    @InterfaceC41208ft5("serial_number")
    private final String serialNumber;

    public ProvisionalSmartlock() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ ProvisionalSmartlock copy$default(ProvisionalSmartlock provisionalSmartlock, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = provisionalSmartlock.macAddress;
        }
        if ((i & 2) != 0) {
            str2 = provisionalSmartlock.serialNumber;
        }
        if ((i & 4) != 0) {
            z = provisionalSmartlock.provisional;
        }
        return provisionalSmartlock.copy(str, str2, z);
    }

    public final String component1() {
        return this.macAddress;
    }

    public final String component2() {
        return this.serialNumber;
    }

    public final boolean component3() {
        return this.provisional;
    }

    public final ProvisionalSmartlock copy(String macAddress, String serialNumber, boolean z) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        return new ProvisionalSmartlock(macAddress, serialNumber, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProvisionalSmartlock) {
            ProvisionalSmartlock provisionalSmartlock = (ProvisionalSmartlock) obj;
            return Intrinsics.areEqual(this.macAddress, provisionalSmartlock.macAddress) && Intrinsics.areEqual(this.serialNumber, provisionalSmartlock.serialNumber) && this.provisional == provisionalSmartlock.provisional;
        }
        return false;
    }

    public final String getMacAddress() {
        return this.macAddress;
    }

    public final boolean getProvisional() {
        return this.provisional;
    }

    public final String getSerialNumber() {
        return this.serialNumber;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.macAddress.hashCode() * 31) + this.serialNumber.hashCode()) * 31;
        boolean z = this.provisional;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.macAddress;
        String str2 = this.serialNumber;
        boolean z = this.provisional;
        return "ProvisionalSmartlock(macAddress=" + str + ", serialNumber=" + str2 + ", provisional=" + z + ")";
    }

    public ProvisionalSmartlock(String macAddress, String serialNumber, boolean z) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        this.macAddress = macAddress;
        this.serialNumber = serialNumber;
        this.provisional = z;
    }

    public /* synthetic */ ProvisionalSmartlock(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }
}
