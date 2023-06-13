package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/ZigZagPosition;", "", "type", "", "value", "x", "", "y", "(Ljava/lang/String;Ljava/lang/String;DD)V", "getType", "()Ljava/lang/String;", "getValue", "getX", "()D", "getY", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZigZagPosition {
    @JsonProperty("type")
    @InterfaceC41208ft5("type")
    private final String type;
    @JsonProperty("value")
    @InterfaceC41208ft5("value")
    private final String value;
    @JsonProperty("x")
    @InterfaceC41208ft5("x")

    /* renamed from: x */
    private final double f66637x;
    @JsonProperty("y")
    @InterfaceC41208ft5("y")

    /* renamed from: y */
    private final double f66638y;

    public ZigZagPosition() {
        this(null, null, 0.0d, 0.0d, 15, null);
    }

    public static /* synthetic */ ZigZagPosition copy$default(ZigZagPosition zigZagPosition, String str, String str2, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zigZagPosition.type;
        }
        if ((i & 2) != 0) {
            str2 = zigZagPosition.value;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            d = zigZagPosition.f66637x;
        }
        double d3 = d;
        if ((i & 8) != 0) {
            d2 = zigZagPosition.f66638y;
        }
        return zigZagPosition.copy(str, str3, d3, d2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.value;
    }

    public final double component3() {
        return this.f66637x;
    }

    public final double component4() {
        return this.f66638y;
    }

    public final ZigZagPosition copy(String str, String str2, double d, double d2) {
        return new ZigZagPosition(str, str2, d, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZigZagPosition) {
            ZigZagPosition zigZagPosition = (ZigZagPosition) obj;
            return Intrinsics.areEqual(this.type, zigZagPosition.type) && Intrinsics.areEqual(this.value, zigZagPosition.value) && Double.compare(this.f66637x, zigZagPosition.f66637x) == 0 && Double.compare(this.f66638y, zigZagPosition.f66638y) == 0;
        }
        return false;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public final double getX() {
        return this.f66637x;
    }

    public final double getY() {
        return this.f66638y;
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        return ((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Double.hashCode(this.f66637x)) * 31) + Double.hashCode(this.f66638y);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.value;
        double d = this.f66637x;
        double d2 = this.f66638y;
        return "ZigZagPosition(type=" + str + ", value=" + str2 + ", x=" + d + ", y=" + d2 + ")";
    }

    public ZigZagPosition(String str, String str2, double d, double d2) {
        this.type = str;
        this.value = str2;
        this.f66637x = d;
        this.f66638y = d2;
    }

    public /* synthetic */ ZigZagPosition(String str, String str2, double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) == 0 ? str2 : null, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? 0.0d : d2);
    }
}
