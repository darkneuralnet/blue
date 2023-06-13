package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/request/RadarTagBatteryBody;", "", "charge", "", "temperature", "voltage", "(III)V", "getCharge", "()I", "getTemperature", "getVoltage", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RadarTagBatteryBody {
    @JsonProperty("charge")
    @InterfaceC41208ft5("charge")
    private final int charge;
    @JsonProperty("temperature")
    @InterfaceC41208ft5("temperature")
    private final int temperature;
    @JsonProperty("voltage")
    @InterfaceC41208ft5("voltage")
    private final int voltage;

    public RadarTagBatteryBody(int i, int i2, int i3) {
        this.charge = i;
        this.temperature = i2;
        this.voltage = i3;
    }

    public static /* synthetic */ RadarTagBatteryBody copy$default(RadarTagBatteryBody radarTagBatteryBody, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = radarTagBatteryBody.charge;
        }
        if ((i4 & 2) != 0) {
            i2 = radarTagBatteryBody.temperature;
        }
        if ((i4 & 4) != 0) {
            i3 = radarTagBatteryBody.voltage;
        }
        return radarTagBatteryBody.copy(i, i2, i3);
    }

    public final int component1() {
        return this.charge;
    }

    public final int component2() {
        return this.temperature;
    }

    public final int component3() {
        return this.voltage;
    }

    public final RadarTagBatteryBody copy(int i, int i2, int i3) {
        return new RadarTagBatteryBody(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RadarTagBatteryBody) {
            RadarTagBatteryBody radarTagBatteryBody = (RadarTagBatteryBody) obj;
            return this.charge == radarTagBatteryBody.charge && this.temperature == radarTagBatteryBody.temperature && this.voltage == radarTagBatteryBody.voltage;
        }
        return false;
    }

    public final int getCharge() {
        return this.charge;
    }

    public final int getTemperature() {
        return this.temperature;
    }

    public final int getVoltage() {
        return this.voltage;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.charge) * 31) + Integer.hashCode(this.temperature)) * 31) + Integer.hashCode(this.voltage);
    }

    public String toString() {
        int i = this.charge;
        int i2 = this.temperature;
        int i3 = this.voltage;
        return "RadarTagBatteryBody(charge=" + i + ", temperature=" + i2 + ", voltage=" + i3 + ")";
    }
}
