package co.bird.android.model;

import co.bird.android.model.wire.WireBird;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0006\u0010\u001d\u001a\u00020\u0019J\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0000J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u001e\u0010'\u001a\u00020\u0019*\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010(\u001a\u00020\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006*"}, m28432d2 = {"Lco/bird/android/model/VehicleDescriptor;", "", "birdId", "", "imei", "serialNumber", "macAddress", RequestHeadersFactory.MODEL, "firmwareVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirdId", "()Ljava/lang/String;", "getFirmwareVersion", "getImei", "getMacAddress", "getModel", "getSerialNumber", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "isValid", "matchesBird", "bird", "Lco/bird/android/model/wire/WireBird;", "matchesVehicle", "vehicle", "Lco/bird/android/model/Vehicle;", "matchesVehicleDescriptor", "descriptor", "toString", "matches", "allowedCharacterMismatches", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nVehicleDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleDescriptor.kt\nco/bird/android/model/VehicleDescriptor\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,135:1\n1183#2,3:136\n*S KotlinDebug\n*F\n+ 1 VehicleDescriptor.kt\nco/bird/android/model/VehicleDescriptor\n*L\n68#1:136,3\n*E\n"})
/* loaded from: classes4.dex */
public final class VehicleDescriptor {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_MISMATCHED_CHARS_ALLOWED = 1;
    private final String birdId;
    private final String firmwareVersion;
    private final String imei;
    private final String macAddress;
    private final String model;
    private final String serialNumber;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleDescriptor$Companion;", "", "()V", "MAX_MISMATCHED_CHARS_ALLOWED", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public VehicleDescriptor() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ VehicleDescriptor copy$default(VehicleDescriptor vehicleDescriptor, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vehicleDescriptor.birdId;
        }
        if ((i & 2) != 0) {
            str2 = vehicleDescriptor.imei;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = vehicleDescriptor.serialNumber;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = vehicleDescriptor.macAddress;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = vehicleDescriptor.model;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = vehicleDescriptor.firmwareVersion;
        }
        return vehicleDescriptor.copy(str, str7, str8, str9, str10, str6);
    }

    public static /* synthetic */ boolean matches$default(VehicleDescriptor vehicleDescriptor, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return vehicleDescriptor.matches(str, str2, i);
    }

    public final String component1() {
        return this.birdId;
    }

    public final String component2() {
        return this.imei;
    }

    public final String component3() {
        return this.serialNumber;
    }

    public final String component4() {
        return this.macAddress;
    }

    public final String component5() {
        return this.model;
    }

    public final String component6() {
        return this.firmwareVersion;
    }

    public final VehicleDescriptor copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new VehicleDescriptor(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (obj instanceof VehicleDescriptor) {
            return matchesVehicleDescriptor((VehicleDescriptor) obj);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public final String getImei() {
        return this.imei;
    }

    public final String getMacAddress() {
        return this.macAddress;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public int hashCode() {
        return (this.imei == null && this.serialNumber == null && this.macAddress == null) ? 1 : 0;
    }

    public final boolean isValid() {
        return (this.imei == null && this.serialNumber == null) ? false : true;
    }

    public final boolean matches(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!Intrinsics.areEqual(str, str2) && i != 0) {
            if (str2 == null || str.length() != str2.length()) {
                return false;
            }
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < str.length()) {
                int i5 = i4 + 1;
                if (str.charAt(i2) != str2.charAt(i4)) {
                    i3++;
                }
                i2++;
                i4 = i5;
            }
            if (i3 > i) {
                return false;
            }
            return true;
        }
        return Intrinsics.areEqual(str, str2);
    }

    public final boolean matchesBird(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        String str = this.imei;
        if (str != null && matches(str, bird.getImei(), 1)) {
            return true;
        }
        String str2 = this.serialNumber;
        if (str2 != null && matches(str2, bird.getSerialNumber(), 1)) {
            return true;
        }
        return false;
    }

    public final boolean matchesVehicle(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        String str = this.imei;
        if (str != null && (matches(str, vehicle.getImei(), 1) || matches(this.imei, vehicle.getBird().getImei(), 1))) {
            return true;
        }
        String str2 = this.serialNumber;
        if (str2 != null && (matches(str2, vehicle.getSerialNumber(), 1) || matches(this.serialNumber, vehicle.getBird().getSerialNumber(), 1))) {
            return true;
        }
        String str3 = this.macAddress;
        if (str3 != null && matches(str3, vehicle.getDevice().getAddress(), 1)) {
            return true;
        }
        return false;
    }

    public final boolean matchesVehicleDescriptor(VehicleDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String str = this.macAddress;
        if (str != null && matches(str, descriptor.macAddress, 1)) {
            return true;
        }
        String str2 = this.imei;
        if (str2 != null && matches(str2, descriptor.imei, 1)) {
            return true;
        }
        String str3 = this.serialNumber;
        if (str3 != null && matches(str3, descriptor.serialNumber, 1)) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = this.birdId;
        String str2 = this.imei;
        String str3 = this.serialNumber;
        String str4 = this.macAddress;
        String str5 = this.model;
        String str6 = this.firmwareVersion;
        return "VehicleDescriptor(birdId=" + str + ", imei=" + str2 + ", serialNumber=" + str3 + ", macAddress=" + str4 + ", model=" + str5 + ", firmwareVersion=" + str6 + ")";
    }

    public VehicleDescriptor(String str, String str2, String str3, String str4, String str5, String str6) {
        this.birdId = str;
        this.imei = str2;
        this.serialNumber = str3;
        this.macAddress = str4;
        this.model = str5;
        this.firmwareVersion = str6;
    }

    public /* synthetic */ VehicleDescriptor(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
