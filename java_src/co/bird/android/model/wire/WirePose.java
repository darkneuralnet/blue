package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/wire/WirePose;", "", "xTranslation", "", "yTranslation", "zTranslation", "wRotationQuaternion", "xRotationQuaternion", "yRotationQuaternion", "zRotationQuaternion", "(DDDDDDD)V", "getWRotationQuaternion", "()D", "getXRotationQuaternion", "getXTranslation", "getYRotationQuaternion", "getYTranslation", "getZRotationQuaternion", "getZTranslation", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WirePose {
    @JsonProperty("qw")
    @InterfaceC41208ft5("qw")
    private final double wRotationQuaternion;
    @JsonProperty("qx")
    @InterfaceC41208ft5("qx")
    private final double xRotationQuaternion;
    @JsonProperty("tx")
    @InterfaceC41208ft5("tx")
    private final double xTranslation;
    @JsonProperty("qy")
    @InterfaceC41208ft5("qy")
    private final double yRotationQuaternion;
    @JsonProperty("ty")
    @InterfaceC41208ft5("ty")
    private final double yTranslation;
    @JsonProperty("qz")
    @InterfaceC41208ft5("qz")
    private final double zRotationQuaternion;
    @JsonProperty("tz")
    @InterfaceC41208ft5("tz")
    private final double zTranslation;

    public WirePose(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.xTranslation = d;
        this.yTranslation = d2;
        this.zTranslation = d3;
        this.wRotationQuaternion = d4;
        this.xRotationQuaternion = d5;
        this.yRotationQuaternion = d6;
        this.zRotationQuaternion = d7;
    }

    public final double component1() {
        return this.xTranslation;
    }

    public final double component2() {
        return this.yTranslation;
    }

    public final double component3() {
        return this.zTranslation;
    }

    public final double component4() {
        return this.wRotationQuaternion;
    }

    public final double component5() {
        return this.xRotationQuaternion;
    }

    public final double component6() {
        return this.yRotationQuaternion;
    }

    public final double component7() {
        return this.zRotationQuaternion;
    }

    public final WirePose copy(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        return new WirePose(d, d2, d3, d4, d5, d6, d7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WirePose) {
            WirePose wirePose = (WirePose) obj;
            return Double.compare(this.xTranslation, wirePose.xTranslation) == 0 && Double.compare(this.yTranslation, wirePose.yTranslation) == 0 && Double.compare(this.zTranslation, wirePose.zTranslation) == 0 && Double.compare(this.wRotationQuaternion, wirePose.wRotationQuaternion) == 0 && Double.compare(this.xRotationQuaternion, wirePose.xRotationQuaternion) == 0 && Double.compare(this.yRotationQuaternion, wirePose.yRotationQuaternion) == 0 && Double.compare(this.zRotationQuaternion, wirePose.zRotationQuaternion) == 0;
        }
        return false;
    }

    public final double getWRotationQuaternion() {
        return this.wRotationQuaternion;
    }

    public final double getXRotationQuaternion() {
        return this.xRotationQuaternion;
    }

    public final double getXTranslation() {
        return this.xTranslation;
    }

    public final double getYRotationQuaternion() {
        return this.yRotationQuaternion;
    }

    public final double getYTranslation() {
        return this.yTranslation;
    }

    public final double getZRotationQuaternion() {
        return this.zRotationQuaternion;
    }

    public final double getZTranslation() {
        return this.zTranslation;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.xTranslation) * 31) + Double.hashCode(this.yTranslation)) * 31) + Double.hashCode(this.zTranslation)) * 31) + Double.hashCode(this.wRotationQuaternion)) * 31) + Double.hashCode(this.xRotationQuaternion)) * 31) + Double.hashCode(this.yRotationQuaternion)) * 31) + Double.hashCode(this.zRotationQuaternion);
    }

    public String toString() {
        double d = this.xTranslation;
        double d2 = this.yTranslation;
        double d3 = this.zTranslation;
        double d4 = this.wRotationQuaternion;
        double d5 = this.xRotationQuaternion;
        double d6 = this.yRotationQuaternion;
        double d7 = this.zRotationQuaternion;
        return "WirePose(xTranslation=" + d + ", yTranslation=" + d2 + ", zTranslation=" + d3 + ", wRotationQuaternion=" + d4 + ", xRotationQuaternion=" + d5 + ", yRotationQuaternion=" + d6 + ", zRotationQuaternion=" + d7 + ")";
    }
}
