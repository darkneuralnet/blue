package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/model/wire/WireBatteryComplication;", "", "battery", "", "(I)V", "getBattery", "()I", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBatteryComplication {
    @JsonProperty("battery")
    @InterfaceC41208ft5("battery")
    private final int battery;

    public WireBatteryComplication() {
        this(0, 1, null);
    }

    public static /* synthetic */ WireBatteryComplication copy$default(WireBatteryComplication wireBatteryComplication, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wireBatteryComplication.battery;
        }
        return wireBatteryComplication.copy(i);
    }

    public final int component1() {
        return this.battery;
    }

    public final WireBatteryComplication copy(int i) {
        return new WireBatteryComplication(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WireBatteryComplication) && this.battery == ((WireBatteryComplication) obj).battery;
    }

    public final int getBattery() {
        return this.battery;
    }

    public int hashCode() {
        return Integer.hashCode(this.battery);
    }

    public String toString() {
        int i = this.battery;
        return "WireBatteryComplication(battery=" + i + ")";
    }

    public WireBatteryComplication(int i) {
        this.battery = i;
    }

    public /* synthetic */ WireBatteryComplication(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
