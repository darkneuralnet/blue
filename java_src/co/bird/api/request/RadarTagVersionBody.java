package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28432d2 = {"Lco/bird/api/request/RadarTagVersionBody;", "", "major", "", "minor", "fix", "time", "(IIII)V", "getFix", "()I", "getMajor", "getMinor", "getTime", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RadarTagVersionBody {
    @JsonProperty("fix")
    @InterfaceC41208ft5("fix")
    private final int fix;
    @JsonProperty("major")
    @InterfaceC41208ft5("major")
    private final int major;
    @JsonProperty("minor")
    @InterfaceC41208ft5("minor")
    private final int minor;
    @JsonProperty("time")
    @InterfaceC41208ft5("time")
    private final int time;

    public RadarTagVersionBody(int i, int i2, int i3, int i4) {
        this.major = i;
        this.minor = i2;
        this.fix = i3;
        this.time = i4;
    }

    public static /* synthetic */ RadarTagVersionBody copy$default(RadarTagVersionBody radarTagVersionBody, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = radarTagVersionBody.major;
        }
        if ((i5 & 2) != 0) {
            i2 = radarTagVersionBody.minor;
        }
        if ((i5 & 4) != 0) {
            i3 = radarTagVersionBody.fix;
        }
        if ((i5 & 8) != 0) {
            i4 = radarTagVersionBody.time;
        }
        return radarTagVersionBody.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.major;
    }

    public final int component2() {
        return this.minor;
    }

    public final int component3() {
        return this.fix;
    }

    public final int component4() {
        return this.time;
    }

    public final RadarTagVersionBody copy(int i, int i2, int i3, int i4) {
        return new RadarTagVersionBody(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RadarTagVersionBody) {
            RadarTagVersionBody radarTagVersionBody = (RadarTagVersionBody) obj;
            return this.major == radarTagVersionBody.major && this.minor == radarTagVersionBody.minor && this.fix == radarTagVersionBody.fix && this.time == radarTagVersionBody.time;
        }
        return false;
    }

    public final int getFix() {
        return this.fix;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.major) * 31) + Integer.hashCode(this.minor)) * 31) + Integer.hashCode(this.fix)) * 31) + Integer.hashCode(this.time);
    }

    public String toString() {
        int i = this.major;
        int i2 = this.minor;
        int i3 = this.fix;
        int i4 = this.time;
        return "RadarTagVersionBody(major=" + i + ", minor=" + i2 + ", fix=" + i3 + ", time=" + i4 + ")";
    }
}
