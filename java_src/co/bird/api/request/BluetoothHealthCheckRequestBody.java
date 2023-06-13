package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003JA\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m28432d2 = {"Lco/bird/api/request/BluetoothHealthCheckRequestBody;", "", "birdId", "", "imei", "iccid", "stmver", "vehFault", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirdId", "()Ljava/lang/String;", "getIccid", "getImei", "getStmver", "getVehFault", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BluetoothHealthCheckRequestBody {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("iccid")
    @InterfaceC41208ft5("iccid")
    private final String iccid;
    @JsonProperty("imei")
    @InterfaceC41208ft5("imei")
    private final String imei;
    @JsonProperty("stmver")
    @InterfaceC41208ft5("stmver")
    private final String stmver;
    @JsonProperty("veh_fault")
    @InterfaceC41208ft5("veh_fault")
    private final String vehFault;

    public BluetoothHealthCheckRequestBody(String birdId, String str, String str2, String str3, String vehFault) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(vehFault, "vehFault");
        this.birdId = birdId;
        this.imei = str;
        this.iccid = str2;
        this.stmver = str3;
        this.vehFault = vehFault;
    }

    public static /* synthetic */ BluetoothHealthCheckRequestBody copy$default(BluetoothHealthCheckRequestBody bluetoothHealthCheckRequestBody, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bluetoothHealthCheckRequestBody.birdId;
        }
        if ((i & 2) != 0) {
            str2 = bluetoothHealthCheckRequestBody.imei;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = bluetoothHealthCheckRequestBody.iccid;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = bluetoothHealthCheckRequestBody.stmver;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = bluetoothHealthCheckRequestBody.vehFault;
        }
        return bluetoothHealthCheckRequestBody.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.birdId;
    }

    public final String component2() {
        return this.imei;
    }

    public final String component3() {
        return this.iccid;
    }

    public final String component4() {
        return this.stmver;
    }

    public final String component5() {
        return this.vehFault;
    }

    public final BluetoothHealthCheckRequestBody copy(String birdId, String str, String str2, String str3, String vehFault) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(vehFault, "vehFault");
        return new BluetoothHealthCheckRequestBody(birdId, str, str2, str3, vehFault);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BluetoothHealthCheckRequestBody) {
            BluetoothHealthCheckRequestBody bluetoothHealthCheckRequestBody = (BluetoothHealthCheckRequestBody) obj;
            return Intrinsics.areEqual(this.birdId, bluetoothHealthCheckRequestBody.birdId) && Intrinsics.areEqual(this.imei, bluetoothHealthCheckRequestBody.imei) && Intrinsics.areEqual(this.iccid, bluetoothHealthCheckRequestBody.iccid) && Intrinsics.areEqual(this.stmver, bluetoothHealthCheckRequestBody.stmver) && Intrinsics.areEqual(this.vehFault, bluetoothHealthCheckRequestBody.vehFault);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getIccid() {
        return this.iccid;
    }

    public final String getImei() {
        return this.imei;
    }

    public final String getStmver() {
        return this.stmver;
    }

    public final String getVehFault() {
        return this.vehFault;
    }

    public int hashCode() {
        int hashCode = this.birdId.hashCode() * 31;
        String str = this.imei;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iccid;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stmver;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.vehFault.hashCode();
    }

    public String toString() {
        String str = this.birdId;
        String str2 = this.imei;
        String str3 = this.iccid;
        String str4 = this.stmver;
        String str5 = this.vehFault;
        return "BluetoothHealthCheckRequestBody(birdId=" + str + ", imei=" + str2 + ", iccid=" + str3 + ", stmver=" + str4 + ", vehFault=" + str5 + ")";
    }

    public /* synthetic */ BluetoothHealthCheckRequestBody(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, str5);
    }
}
