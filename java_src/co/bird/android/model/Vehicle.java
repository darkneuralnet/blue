package co.bird.android.model;

import android.bluetooth.BluetoothDevice;
import co.bird.android.model.constant.EnergyMode;
import co.bird.android.model.persistence.VehicleVersion;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bK\b\u0086\b\u0018\u00002\u00020\u0001:\u0001jB½\u0001\u0012\u0006\u0010\"\u001a\u00020\f\u0012\u0006\u0010#\u001a\u00020\u000e\u0012\b\b\u0002\u0010$\u001a\u00020\u0007\u0012\b\b\u0002\u0010%\u001a\u00020\u0007\u0012\b\b\u0002\u0010&\u001a\u00020\u0005\u0012\b\b\u0002\u0010'\u001a\u00020\u0013\u0012\b\b\u0002\u0010(\u001a\u00020\u0005\u0012\b\b\u0002\u0010)\u001a\u00020\u0005\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u00102\u001a\u00020 ¢\u0006\u0004\bh\u0010iJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000f\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\nJ\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\nJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010!\u001a\u00020 HÆ\u0003JÊ\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\f2\b\b\u0002\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020\u00132\b\b\u0002\u0010(\u001a\u00020\u00052\b\b\u0002\u0010)\u001a\u00020\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00102\u001a\u00020 HÆ\u0001¢\u0006\u0004\b3\u00104R\u0017\u0010\"\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\"\u00105\u001a\u0004\b6\u00107R\"\u0010#\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010$\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010%\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010=\u001a\u0004\bB\u0010?\"\u0004\bC\u0010AR\"\u0010&\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010'\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010(\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010D\u001a\u0004\bN\u0010F\"\u0004\bO\u0010HR\"\u0010)\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010D\u001a\u0004\bP\u0010F\"\u0004\bQ\u0010HR\u0019\u0010*\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b*\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010+\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u0010U\u001a\u0004\bV\u0010\nR\u0019\u0010,\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010W\u001a\u0004\bX\u0010YR\u0019\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010W\u001a\u0004\bZ\u0010YR$\u0010.\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010W\u001a\u0004\b[\u0010Y\"\u0004\b\\\u0010]R\u0019\u0010/\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010W\u001a\u0004\b^\u0010YR$\u00100\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010W\u001a\u0004\b_\u0010Y\"\u0004\b`\u0010]R$\u00101\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010W\u001a\u0004\ba\u0010Y\"\u0004\bb\u0010]R\"\u00102\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010g¨\u0006k"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "", "", "toString", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "getBatteryForTracking", "()Ljava/lang/Integer;", "getDistanceForTracking", "Landroid/bluetooth/BluetoothDevice;", "component1", "Lco/bird/android/model/wire/WireBird;", "component2", "component3", "component4", "component5", "Lco/bird/android/model/constant/EnergyMode;", "component6", "component7", "component8", "Lne5;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "Lco/bird/android/model/persistence/VehicleVersion;", "component17", "device", "bird", "battery", "distance", "locked", "energyMode", "authenticated", "connected", "rxDevice", "rssi", "beaconHash", "proximityUUID", "imei", "serialNumber", "iccid", "fault", "vehicleVersion", "copy", "(Landroid/bluetooth/BluetoothDevice;Lco/bird/android/model/wire/WireBird;IIZLco/bird/android/model/constant/EnergyMode;ZZLne5;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/VehicleVersion;)Lco/bird/android/model/Vehicle;", "Landroid/bluetooth/BluetoothDevice;", "getDevice", "()Landroid/bluetooth/BluetoothDevice;", "Lco/bird/android/model/wire/WireBird;", "getBird", "()Lco/bird/android/model/wire/WireBird;", "setBird", "(Lco/bird/android/model/wire/WireBird;)V", "I", "getBattery", "()I", "setBattery", "(I)V", "getDistance", "setDistance", "Z", "getLocked", "()Z", "setLocked", "(Z)V", "Lco/bird/android/model/constant/EnergyMode;", "getEnergyMode", "()Lco/bird/android/model/constant/EnergyMode;", "setEnergyMode", "(Lco/bird/android/model/constant/EnergyMode;)V", "getAuthenticated", "setAuthenticated", "getConnected", "setConnected", "Lne5;", "getRxDevice", "()Lne5;", "Ljava/lang/Integer;", "getRssi", "Ljava/lang/String;", "getBeaconHash", "()Ljava/lang/String;", "getProximityUUID", "getImei", "setImei", "(Ljava/lang/String;)V", "getSerialNumber", "getIccid", "setIccid", "getFault", "setFault", "Lco/bird/android/model/persistence/VehicleVersion;", "getVehicleVersion", "()Lco/bird/android/model/persistence/VehicleVersion;", "setVehicleVersion", "(Lco/bird/android/model/persistence/VehicleVersion;)V", "<init>", "(Landroid/bluetooth/BluetoothDevice;Lco/bird/android/model/wire/WireBird;IIZLco/bird/android/model/constant/EnergyMode;ZZLne5;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/VehicleVersion;)V", "ConnectionState", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vehicle.kt\nco/bird/android/model/Vehicle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
/* loaded from: classes4.dex */
public final class Vehicle {
    private boolean authenticated;
    private int battery;
    private final String beaconHash;
    private WireBird bird;
    private boolean connected;
    private final BluetoothDevice device;
    private int distance;
    private EnergyMode energyMode;
    private String fault;
    private String iccid;
    private String imei;
    private boolean locked;
    private final String proximityUUID;
    private final Integer rssi;
    private final InterfaceC45802ne5 rxDevice;
    private final String serialNumber;
    private VehicleVersion vehicleVersion;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle$ConnectionState;", "", "(Ljava/lang/String;I)V", "CONNECTED", "DISCONNECTED", "CLOSED", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public enum ConnectionState {
        CONNECTED,
        DISCONNECTED,
        CLOSED
    }

    public Vehicle(BluetoothDevice device, WireBird bird, int i, int i2, boolean z, EnergyMode energyMode, boolean z2, boolean z3, InterfaceC45802ne5 interfaceC45802ne5, Integer num, String str, String str2, String str3, String str4, String str5, String str6, VehicleVersion vehicleVersion) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(energyMode, "energyMode");
        Intrinsics.checkNotNullParameter(vehicleVersion, "vehicleVersion");
        this.device = device;
        this.bird = bird;
        this.battery = i;
        this.distance = i2;
        this.locked = z;
        this.energyMode = energyMode;
        this.authenticated = z2;
        this.connected = z3;
        this.rxDevice = interfaceC45802ne5;
        this.rssi = num;
        this.beaconHash = str;
        this.proximityUUID = str2;
        this.imei = str3;
        this.serialNumber = str4;
        this.iccid = str5;
        this.fault = str6;
        this.vehicleVersion = vehicleVersion;
    }

    public final BluetoothDevice component1() {
        return this.device;
    }

    public final Integer component10() {
        return this.rssi;
    }

    public final String component11() {
        return this.beaconHash;
    }

    public final String component12() {
        return this.proximityUUID;
    }

    public final String component13() {
        return this.imei;
    }

    public final String component14() {
        return this.serialNumber;
    }

    public final String component15() {
        return this.iccid;
    }

    public final String component16() {
        return this.fault;
    }

    public final VehicleVersion component17() {
        return this.vehicleVersion;
    }

    public final WireBird component2() {
        return this.bird;
    }

    public final int component3() {
        return this.battery;
    }

    public final int component4() {
        return this.distance;
    }

    public final boolean component5() {
        return this.locked;
    }

    public final EnergyMode component6() {
        return this.energyMode;
    }

    public final boolean component7() {
        return this.authenticated;
    }

    public final boolean component8() {
        return this.connected;
    }

    public final InterfaceC45802ne5 component9() {
        return this.rxDevice;
    }

    public final Vehicle copy(BluetoothDevice device, WireBird bird, int i, int i2, boolean z, EnergyMode energyMode, boolean z2, boolean z3, InterfaceC45802ne5 interfaceC45802ne5, Integer num, String str, String str2, String str3, String str4, String str5, String str6, VehicleVersion vehicleVersion) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(energyMode, "energyMode");
        Intrinsics.checkNotNullParameter(vehicleVersion, "vehicleVersion");
        return new Vehicle(device, bird, i, i2, z, energyMode, z2, z3, interfaceC45802ne5, num, str, str2, str3, str4, str5, str6, vehicleVersion);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Vehicle) && Intrinsics.areEqual(this.device.getAddress(), ((Vehicle) obj).device.getAddress())) {
            return true;
        }
        return false;
    }

    public final boolean getAuthenticated() {
        return this.authenticated;
    }

    public final int getBattery() {
        return this.battery;
    }

    public final Integer getBatteryForTracking() {
        boolean z;
        if (WireBirdKt.isBdCompatible(this.bird)) {
            return null;
        }
        Integer valueOf = Integer.valueOf(this.battery);
        if (valueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        return valueOf;
    }

    public final String getBeaconHash() {
        return this.beaconHash;
    }

    public final WireBird getBird() {
        return this.bird;
    }

    public final boolean getConnected() {
        return this.connected;
    }

    public final BluetoothDevice getDevice() {
        return this.device;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final Integer getDistanceForTracking() {
        boolean z;
        if (WireBirdKt.isBdCompatible(this.bird)) {
            return null;
        }
        Integer valueOf = Integer.valueOf(this.distance);
        if (valueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        return valueOf;
    }

    public final EnergyMode getEnergyMode() {
        return this.energyMode;
    }

    public final String getFault() {
        return this.fault;
    }

    public final String getIccid() {
        return this.iccid;
    }

    public final String getImei() {
        return this.imei;
    }

    public final boolean getLocked() {
        return this.locked;
    }

    public final String getProximityUUID() {
        return this.proximityUUID;
    }

    public final Integer getRssi() {
        return this.rssi;
    }

    public final InterfaceC45802ne5 getRxDevice() {
        return this.rxDevice;
    }

    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public final VehicleVersion getVehicleVersion() {
        return this.vehicleVersion;
    }

    public int hashCode() {
        return this.device.getAddress().hashCode();
    }

    public final void setAuthenticated(boolean z) {
        this.authenticated = z;
    }

    public final void setBattery(int i) {
        this.battery = i;
    }

    public final void setBird(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<set-?>");
        this.bird = wireBird;
    }

    public final void setConnected(boolean z) {
        this.connected = z;
    }

    public final void setDistance(int i) {
        this.distance = i;
    }

    public final void setEnergyMode(EnergyMode energyMode) {
        Intrinsics.checkNotNullParameter(energyMode, "<set-?>");
        this.energyMode = energyMode;
    }

    public final void setFault(String str) {
        this.fault = str;
    }

    public final void setIccid(String str) {
        this.iccid = str;
    }

    public final void setImei(String str) {
        this.imei = str;
    }

    public final void setLocked(boolean z) {
        this.locked = z;
    }

    public final void setVehicleVersion(VehicleVersion vehicleVersion) {
        Intrinsics.checkNotNullParameter(vehicleVersion, "<set-?>");
        this.vehicleVersion = vehicleVersion;
    }

    public String toString() {
        BluetoothDevice bluetoothDevice = this.device;
        WireBird wireBird = this.bird;
        VehicleVersion vehicleVersion = this.vehicleVersion;
        int i = this.battery;
        int i2 = this.distance;
        boolean z = this.locked;
        EnergyMode energyMode = this.energyMode;
        boolean z2 = this.authenticated;
        String str = this.imei;
        return "Vehicle(device=" + bluetoothDevice + ", bird=" + wireBird + ", versions=" + vehicleVersion + ", battery=" + i + ", distance=" + i2 + ", locked=" + z + ", energyMode=" + energyMode + ", authenticated=" + z2 + ", imei=" + str + ")";
    }

    public /* synthetic */ Vehicle(BluetoothDevice bluetoothDevice, WireBird wireBird, int i, int i2, boolean z, EnergyMode energyMode, boolean z2, boolean z3, InterfaceC45802ne5 interfaceC45802ne5, Integer num, String str, String str2, String str3, String str4, String str5, String str6, VehicleVersion vehicleVersion, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(bluetoothDevice, wireBird, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? true : z, (i3 & 32) != 0 ? EnergyMode.NORMAL : energyMode, (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? false : z3, (i3 & 256) != 0 ? null : interfaceC45802ne5, (i3 & 512) != 0 ? null : num, (i3 & 1024) != 0 ? null : str, (i3 & 2048) != 0 ? null : str2, (i3 & 4096) != 0 ? null : str3, (i3 & 8192) != 0 ? null : str4, (i3 & 16384) != 0 ? null : str5, (32768 & i3) != 0 ? null : str6, (i3 & 65536) != 0 ? new VehicleVersion(wireBird.getId(), null, null, 0, null, null, 62, null) : vehicleVersion);
    }
}
