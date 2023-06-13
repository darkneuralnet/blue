package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b<\b\u0086\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\nHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010A\u001a\u00020\nHÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010F\u001a\u00020\nHÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010H\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010J\u001a\u00020\nHÆ\u0003Jò\u0001\u0010K\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010LJ\u0013\u0010M\u001a\u00020\n2\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010O\u001a\u00020\u0007HÖ\u0001J\t\u0010P\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b'\u0010\"R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b(\u0010\"R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b)\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0016\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u0016\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b3\u0010\u001fR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001dR\u0016\u0010\u0019\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001d¨\u0006Q"}, m28432d2 = {"Lco/bird/android/model/ZigZagVehicle;", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "", "boardBatteryVoltage", "", "centerId", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "electricMode", "", "freeMinutes", "fuelLevel", "fuelLevelVoltage", "helmet", "helmet2", "id", "instrumentPanel", "internalBoxState", "plate", "position", "Lco/bird/android/model/ZigZagPosition;", "saddle", "scooterBatteryVoltage", "status", "topBox", "vehicleType", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/ZigZagPosition;ZLjava/lang/Float;Ljava/lang/String;ZLjava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getBoardBatteryVoltage", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getCenterId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCode", "getElectricMode", "()Z", "getFreeMinutes", "getFuelLevel", "getFuelLevelVoltage", "getHelmet", "getHelmet2", "getId", "getInstrumentPanel", "getInternalBoxState", "getPlate", "getPosition", "()Lco/bird/android/model/ZigZagPosition;", "getSaddle", "getScooterBatteryVoltage", "getStatus", "getTopBox", "getVehicleType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/ZigZagPosition;ZLjava/lang/Float;Ljava/lang/String;ZLjava/lang/String;)Lco/bird/android/model/ZigZagVehicle;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZigZagVehicle {
    @JsonProperty(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    @InterfaceC41208ft5(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    private final String address;
    @JsonProperty("boardBatteryVoltage")
    @InterfaceC41208ft5("boardBatteryVoltage")
    private final Float boardBatteryVoltage;
    @JsonProperty("centerid")
    @InterfaceC41208ft5("centerid")
    private final Integer centerId;
    @JsonProperty(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    @InterfaceC41208ft5(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    private final String code;
    @JsonProperty("electricmode")
    @InterfaceC41208ft5("electricmode")
    private final boolean electricMode;
    @JsonProperty("freeMinutes")
    @InterfaceC41208ft5("freeMinutes")
    private final Integer freeMinutes;
    @JsonProperty("fuelLevel")
    @InterfaceC41208ft5("fuelLevel")
    private final Integer fuelLevel;
    @JsonProperty("fuelLevelVoltage")
    @InterfaceC41208ft5("fuelLevelVoltage")
    private final Float fuelLevelVoltage;
    @JsonProperty("helmet")
    @InterfaceC41208ft5("helmet")
    private final boolean helmet;
    @JsonProperty("helmet2")
    @InterfaceC41208ft5("helmet2")
    private final boolean helmet2;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66639id;
    @JsonProperty("instrumentPanel")
    @InterfaceC41208ft5("instrumentPanel")
    private final boolean instrumentPanel;
    @JsonProperty("internalBoxState")
    @InterfaceC41208ft5("internalBoxState")
    private final String internalBoxState;
    @JsonProperty("plate")
    @InterfaceC41208ft5("plate")
    private final String plate;
    @JsonProperty("position")
    @InterfaceC41208ft5("position")
    private final ZigZagPosition position;
    @JsonProperty("saddle")
    @InterfaceC41208ft5("saddle")
    private final boolean saddle;
    @JsonProperty("scooterBatteryVoltage")
    @InterfaceC41208ft5("scooterBatteryVoltage")
    private final Float scooterBatteryVoltage;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final String status;
    @JsonProperty("topBox")
    @InterfaceC41208ft5("topBox")
    private final boolean topBox;
    @JsonProperty("vehicletype")
    @InterfaceC41208ft5("vehicletype")
    private final String vehicleType;

    public ZigZagVehicle() {
        this(null, null, null, null, false, null, null, null, false, false, null, false, null, null, null, false, null, null, false, null, 1048575, null);
    }

    public final String component1() {
        return this.address;
    }

    public final boolean component10() {
        return this.helmet2;
    }

    public final String component11() {
        return this.f66639id;
    }

    public final boolean component12() {
        return this.instrumentPanel;
    }

    public final String component13() {
        return this.internalBoxState;
    }

    public final String component14() {
        return this.plate;
    }

    public final ZigZagPosition component15() {
        return this.position;
    }

    public final boolean component16() {
        return this.saddle;
    }

    public final Float component17() {
        return this.scooterBatteryVoltage;
    }

    public final String component18() {
        return this.status;
    }

    public final boolean component19() {
        return this.topBox;
    }

    public final Float component2() {
        return this.boardBatteryVoltage;
    }

    public final String component20() {
        return this.vehicleType;
    }

    public final Integer component3() {
        return this.centerId;
    }

    public final String component4() {
        return this.code;
    }

    public final boolean component5() {
        return this.electricMode;
    }

    public final Integer component6() {
        return this.freeMinutes;
    }

    public final Integer component7() {
        return this.fuelLevel;
    }

    public final Float component8() {
        return this.fuelLevelVoltage;
    }

    public final boolean component9() {
        return this.helmet;
    }

    public final ZigZagVehicle copy(String str, Float f, Integer num, String str2, boolean z, Integer num2, Integer num3, Float f2, boolean z2, boolean z3, String str3, boolean z4, String str4, String str5, ZigZagPosition zigZagPosition, boolean z5, Float f3, String str6, boolean z6, String str7) {
        return new ZigZagVehicle(str, f, num, str2, z, num2, num3, f2, z2, z3, str3, z4, str4, str5, zigZagPosition, z5, f3, str6, z6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZigZagVehicle) {
            ZigZagVehicle zigZagVehicle = (ZigZagVehicle) obj;
            return Intrinsics.areEqual(this.address, zigZagVehicle.address) && Intrinsics.areEqual((Object) this.boardBatteryVoltage, (Object) zigZagVehicle.boardBatteryVoltage) && Intrinsics.areEqual(this.centerId, zigZagVehicle.centerId) && Intrinsics.areEqual(this.code, zigZagVehicle.code) && this.electricMode == zigZagVehicle.electricMode && Intrinsics.areEqual(this.freeMinutes, zigZagVehicle.freeMinutes) && Intrinsics.areEqual(this.fuelLevel, zigZagVehicle.fuelLevel) && Intrinsics.areEqual((Object) this.fuelLevelVoltage, (Object) zigZagVehicle.fuelLevelVoltage) && this.helmet == zigZagVehicle.helmet && this.helmet2 == zigZagVehicle.helmet2 && Intrinsics.areEqual(this.f66639id, zigZagVehicle.f66639id) && this.instrumentPanel == zigZagVehicle.instrumentPanel && Intrinsics.areEqual(this.internalBoxState, zigZagVehicle.internalBoxState) && Intrinsics.areEqual(this.plate, zigZagVehicle.plate) && Intrinsics.areEqual(this.position, zigZagVehicle.position) && this.saddle == zigZagVehicle.saddle && Intrinsics.areEqual((Object) this.scooterBatteryVoltage, (Object) zigZagVehicle.scooterBatteryVoltage) && Intrinsics.areEqual(this.status, zigZagVehicle.status) && this.topBox == zigZagVehicle.topBox && Intrinsics.areEqual(this.vehicleType, zigZagVehicle.vehicleType);
        }
        return false;
    }

    public final String getAddress() {
        return this.address;
    }

    public final Float getBoardBatteryVoltage() {
        return this.boardBatteryVoltage;
    }

    public final Integer getCenterId() {
        return this.centerId;
    }

    public final String getCode() {
        return this.code;
    }

    public final boolean getElectricMode() {
        return this.electricMode;
    }

    public final Integer getFreeMinutes() {
        return this.freeMinutes;
    }

    public final Integer getFuelLevel() {
        return this.fuelLevel;
    }

    public final Float getFuelLevelVoltage() {
        return this.fuelLevelVoltage;
    }

    public final boolean getHelmet() {
        return this.helmet;
    }

    public final boolean getHelmet2() {
        return this.helmet2;
    }

    public final String getId() {
        return this.f66639id;
    }

    public final boolean getInstrumentPanel() {
        return this.instrumentPanel;
    }

    public final String getInternalBoxState() {
        return this.internalBoxState;
    }

    public final String getPlate() {
        return this.plate;
    }

    public final ZigZagPosition getPosition() {
        return this.position;
    }

    public final boolean getSaddle() {
        return this.saddle;
    }

    public final Float getScooterBatteryVoltage() {
        return this.scooterBatteryVoltage;
    }

    public final String getStatus() {
        return this.status;
    }

    public final boolean getTopBox() {
        return this.topBox;
    }

    public final String getVehicleType() {
        return this.vehicleType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.address;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.boardBatteryVoltage;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.centerId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.code;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.electricMode;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        Integer num2 = this.freeMinutes;
        int hashCode5 = (i2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.fuelLevel;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f2 = this.fuelLevelVoltage;
        int hashCode7 = (hashCode6 + (f2 == null ? 0 : f2.hashCode())) * 31;
        boolean z2 = this.helmet;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode7 + i3) * 31;
        boolean z3 = this.helmet2;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        String str3 = this.f66639id;
        int hashCode8 = (i6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z4 = this.instrumentPanel;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (hashCode8 + i7) * 31;
        String str4 = this.internalBoxState;
        int hashCode9 = (i8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.plate;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ZigZagPosition zigZagPosition = this.position;
        int hashCode11 = (hashCode10 + (zigZagPosition == null ? 0 : zigZagPosition.hashCode())) * 31;
        boolean z5 = this.saddle;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (hashCode11 + i9) * 31;
        Float f3 = this.scooterBatteryVoltage;
        int hashCode12 = (i10 + (f3 == null ? 0 : f3.hashCode())) * 31;
        String str6 = this.status;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        boolean z6 = this.topBox;
        int i11 = (hashCode13 + (z6 ? 1 : z6 ? 1 : 0)) * 31;
        String str7 = this.vehicleType;
        return i11 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        String str = this.address;
        Float f = this.boardBatteryVoltage;
        Integer num = this.centerId;
        String str2 = this.code;
        boolean z = this.electricMode;
        Integer num2 = this.freeMinutes;
        Integer num3 = this.fuelLevel;
        Float f2 = this.fuelLevelVoltage;
        boolean z2 = this.helmet;
        boolean z3 = this.helmet2;
        String str3 = this.f66639id;
        boolean z4 = this.instrumentPanel;
        String str4 = this.internalBoxState;
        String str5 = this.plate;
        ZigZagPosition zigZagPosition = this.position;
        boolean z5 = this.saddle;
        Float f3 = this.scooterBatteryVoltage;
        String str6 = this.status;
        boolean z6 = this.topBox;
        String str7 = this.vehicleType;
        return "ZigZagVehicle(address=" + str + ", boardBatteryVoltage=" + f + ", centerId=" + num + ", code=" + str2 + ", electricMode=" + z + ", freeMinutes=" + num2 + ", fuelLevel=" + num3 + ", fuelLevelVoltage=" + f2 + ", helmet=" + z2 + ", helmet2=" + z3 + ", id=" + str3 + ", instrumentPanel=" + z4 + ", internalBoxState=" + str4 + ", plate=" + str5 + ", position=" + zigZagPosition + ", saddle=" + z5 + ", scooterBatteryVoltage=" + f3 + ", status=" + str6 + ", topBox=" + z6 + ", vehicleType=" + str7 + ")";
    }

    public ZigZagVehicle(String str, Float f, Integer num, String str2, boolean z, Integer num2, Integer num3, Float f2, boolean z2, boolean z3, String str3, boolean z4, String str4, String str5, ZigZagPosition zigZagPosition, boolean z5, Float f3, String str6, boolean z6, String str7) {
        this.address = str;
        this.boardBatteryVoltage = f;
        this.centerId = num;
        this.code = str2;
        this.electricMode = z;
        this.freeMinutes = num2;
        this.fuelLevel = num3;
        this.fuelLevelVoltage = f2;
        this.helmet = z2;
        this.helmet2 = z3;
        this.f66639id = str3;
        this.instrumentPanel = z4;
        this.internalBoxState = str4;
        this.plate = str5;
        this.position = zigZagPosition;
        this.saddle = z5;
        this.scooterBatteryVoltage = f3;
        this.status = str6;
        this.topBox = z6;
        this.vehicleType = str7;
    }

    public /* synthetic */ ZigZagVehicle(String str, Float f, Integer num, String str2, boolean z, Integer num2, Integer num3, Float f2, boolean z2, boolean z3, String str3, boolean z4, String str4, String str5, ZigZagPosition zigZagPosition, boolean z5, Float f3, String str6, boolean z6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : f2, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? false : z4, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? null : str5, (i & 16384) != 0 ? null : zigZagPosition, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? false : z5, (i & 65536) != 0 ? null : f3, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : str6, (i & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? false : z6, (i & 524288) != 0 ? null : str7);
    }
}
