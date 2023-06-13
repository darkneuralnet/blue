package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/wire/WireVehicleDiagnostics;", "", "imei", "Lco/bird/android/model/wire/WireDisplayValue;", "iccid", "stmver", "lastTrack", "vehFaults", "", "(Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Lco/bird/android/model/wire/WireDisplayValue;Ljava/util/List;)V", "getIccid", "()Lco/bird/android/model/wire/WireDisplayValue;", "getImei", "getLastTrack", "getStmver", "getVehFaults", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireVehicleDiagnostics {
    @JsonProperty("iccid")
    @InterfaceC41208ft5("iccid")
    private final WireDisplayValue iccid;
    @JsonProperty("imei")
    @InterfaceC41208ft5("imei")
    private final WireDisplayValue imei;
    @JsonProperty("last_track")
    @InterfaceC41208ft5("last_track")
    private final WireDisplayValue lastTrack;
    @JsonProperty("stmver")
    @InterfaceC41208ft5("stmver")
    private final WireDisplayValue stmver;
    @JsonProperty("veh_faults")
    @InterfaceC41208ft5("veh_faults")
    private final List<WireDisplayValue> vehFaults;

    public WireVehicleDiagnostics(WireDisplayValue imei, WireDisplayValue iccid, WireDisplayValue stmver, WireDisplayValue lastTrack, List<WireDisplayValue> vehFaults) {
        Intrinsics.checkNotNullParameter(imei, "imei");
        Intrinsics.checkNotNullParameter(iccid, "iccid");
        Intrinsics.checkNotNullParameter(stmver, "stmver");
        Intrinsics.checkNotNullParameter(lastTrack, "lastTrack");
        Intrinsics.checkNotNullParameter(vehFaults, "vehFaults");
        this.imei = imei;
        this.iccid = iccid;
        this.stmver = stmver;
        this.lastTrack = lastTrack;
        this.vehFaults = vehFaults;
    }

    public static /* synthetic */ WireVehicleDiagnostics copy$default(WireVehicleDiagnostics wireVehicleDiagnostics, WireDisplayValue wireDisplayValue, WireDisplayValue wireDisplayValue2, WireDisplayValue wireDisplayValue3, WireDisplayValue wireDisplayValue4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            wireDisplayValue = wireVehicleDiagnostics.imei;
        }
        if ((i & 2) != 0) {
            wireDisplayValue2 = wireVehicleDiagnostics.iccid;
        }
        WireDisplayValue wireDisplayValue5 = wireDisplayValue2;
        if ((i & 4) != 0) {
            wireDisplayValue3 = wireVehicleDiagnostics.stmver;
        }
        WireDisplayValue wireDisplayValue6 = wireDisplayValue3;
        if ((i & 8) != 0) {
            wireDisplayValue4 = wireVehicleDiagnostics.lastTrack;
        }
        WireDisplayValue wireDisplayValue7 = wireDisplayValue4;
        List<WireDisplayValue> list2 = list;
        if ((i & 16) != 0) {
            list2 = wireVehicleDiagnostics.vehFaults;
        }
        return wireVehicleDiagnostics.copy(wireDisplayValue, wireDisplayValue5, wireDisplayValue6, wireDisplayValue7, list2);
    }

    public final WireDisplayValue component1() {
        return this.imei;
    }

    public final WireDisplayValue component2() {
        return this.iccid;
    }

    public final WireDisplayValue component3() {
        return this.stmver;
    }

    public final WireDisplayValue component4() {
        return this.lastTrack;
    }

    public final List<WireDisplayValue> component5() {
        return this.vehFaults;
    }

    public final WireVehicleDiagnostics copy(WireDisplayValue imei, WireDisplayValue iccid, WireDisplayValue stmver, WireDisplayValue lastTrack, List<WireDisplayValue> vehFaults) {
        Intrinsics.checkNotNullParameter(imei, "imei");
        Intrinsics.checkNotNullParameter(iccid, "iccid");
        Intrinsics.checkNotNullParameter(stmver, "stmver");
        Intrinsics.checkNotNullParameter(lastTrack, "lastTrack");
        Intrinsics.checkNotNullParameter(vehFaults, "vehFaults");
        return new WireVehicleDiagnostics(imei, iccid, stmver, lastTrack, vehFaults);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireVehicleDiagnostics) {
            WireVehicleDiagnostics wireVehicleDiagnostics = (WireVehicleDiagnostics) obj;
            return Intrinsics.areEqual(this.imei, wireVehicleDiagnostics.imei) && Intrinsics.areEqual(this.iccid, wireVehicleDiagnostics.iccid) && Intrinsics.areEqual(this.stmver, wireVehicleDiagnostics.stmver) && Intrinsics.areEqual(this.lastTrack, wireVehicleDiagnostics.lastTrack) && Intrinsics.areEqual(this.vehFaults, wireVehicleDiagnostics.vehFaults);
        }
        return false;
    }

    public final WireDisplayValue getIccid() {
        return this.iccid;
    }

    public final WireDisplayValue getImei() {
        return this.imei;
    }

    public final WireDisplayValue getLastTrack() {
        return this.lastTrack;
    }

    public final WireDisplayValue getStmver() {
        return this.stmver;
    }

    public final List<WireDisplayValue> getVehFaults() {
        return this.vehFaults;
    }

    public int hashCode() {
        return (((((((this.imei.hashCode() * 31) + this.iccid.hashCode()) * 31) + this.stmver.hashCode()) * 31) + this.lastTrack.hashCode()) * 31) + this.vehFaults.hashCode();
    }

    public String toString() {
        WireDisplayValue wireDisplayValue = this.imei;
        WireDisplayValue wireDisplayValue2 = this.iccid;
        WireDisplayValue wireDisplayValue3 = this.stmver;
        WireDisplayValue wireDisplayValue4 = this.lastTrack;
        List<WireDisplayValue> list = this.vehFaults;
        return "WireVehicleDiagnostics(imei=" + wireDisplayValue + ", iccid=" + wireDisplayValue2 + ", stmver=" + wireDisplayValue3 + ", lastTrack=" + wireDisplayValue4 + ", vehFaults=" + list + ")";
    }

    public /* synthetic */ WireVehicleDiagnostics(WireDisplayValue wireDisplayValue, WireDisplayValue wireDisplayValue2, WireDisplayValue wireDisplayValue3, WireDisplayValue wireDisplayValue4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireDisplayValue, wireDisplayValue2, wireDisplayValue3, wireDisplayValue4, (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
