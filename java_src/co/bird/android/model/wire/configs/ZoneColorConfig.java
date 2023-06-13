package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/wire/configs/ZoneColorConfig;", "", "fillColor", "Lco/bird/android/model/wire/configs/MobileColorConfig;", "borderColor", "titleColor", "(Lco/bird/android/model/wire/configs/MobileColorConfig;Lco/bird/android/model/wire/configs/MobileColorConfig;Lco/bird/android/model/wire/configs/MobileColorConfig;)V", "getBorderColor", "()Lco/bird/android/model/wire/configs/MobileColorConfig;", "getFillColor", "getTitleColor", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZoneColorConfig {
    @JsonProperty("border_color")
    @InterfaceC41208ft5("border_color")
    private final MobileColorConfig borderColor;
    @JsonProperty("fill_color")
    @InterfaceC41208ft5("fill_color")
    private final MobileColorConfig fillColor;
    @JsonProperty("title_color")
    @InterfaceC41208ft5("title_color")
    private final MobileColorConfig titleColor;

    public ZoneColorConfig() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ZoneColorConfig copy$default(ZoneColorConfig zoneColorConfig, MobileColorConfig mobileColorConfig, MobileColorConfig mobileColorConfig2, MobileColorConfig mobileColorConfig3, int i, Object obj) {
        if ((i & 1) != 0) {
            mobileColorConfig = zoneColorConfig.fillColor;
        }
        if ((i & 2) != 0) {
            mobileColorConfig2 = zoneColorConfig.borderColor;
        }
        if ((i & 4) != 0) {
            mobileColorConfig3 = zoneColorConfig.titleColor;
        }
        return zoneColorConfig.copy(mobileColorConfig, mobileColorConfig2, mobileColorConfig3);
    }

    public final MobileColorConfig component1() {
        return this.fillColor;
    }

    public final MobileColorConfig component2() {
        return this.borderColor;
    }

    public final MobileColorConfig component3() {
        return this.titleColor;
    }

    public final ZoneColorConfig copy(MobileColorConfig mobileColorConfig, MobileColorConfig mobileColorConfig2, MobileColorConfig mobileColorConfig3) {
        return new ZoneColorConfig(mobileColorConfig, mobileColorConfig2, mobileColorConfig3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneColorConfig) {
            ZoneColorConfig zoneColorConfig = (ZoneColorConfig) obj;
            return Intrinsics.areEqual(this.fillColor, zoneColorConfig.fillColor) && Intrinsics.areEqual(this.borderColor, zoneColorConfig.borderColor) && Intrinsics.areEqual(this.titleColor, zoneColorConfig.titleColor);
        }
        return false;
    }

    public final MobileColorConfig getBorderColor() {
        return this.borderColor;
    }

    public final MobileColorConfig getFillColor() {
        return this.fillColor;
    }

    public final MobileColorConfig getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        MobileColorConfig mobileColorConfig = this.fillColor;
        int hashCode = (mobileColorConfig == null ? 0 : mobileColorConfig.hashCode()) * 31;
        MobileColorConfig mobileColorConfig2 = this.borderColor;
        int hashCode2 = (hashCode + (mobileColorConfig2 == null ? 0 : mobileColorConfig2.hashCode())) * 31;
        MobileColorConfig mobileColorConfig3 = this.titleColor;
        return hashCode2 + (mobileColorConfig3 != null ? mobileColorConfig3.hashCode() : 0);
    }

    public String toString() {
        MobileColorConfig mobileColorConfig = this.fillColor;
        MobileColorConfig mobileColorConfig2 = this.borderColor;
        MobileColorConfig mobileColorConfig3 = this.titleColor;
        return "ZoneColorConfig(fillColor=" + mobileColorConfig + ", borderColor=" + mobileColorConfig2 + ", titleColor=" + mobileColorConfig3 + ")";
    }

    public ZoneColorConfig(MobileColorConfig mobileColorConfig, MobileColorConfig mobileColorConfig2, MobileColorConfig mobileColorConfig3) {
        this.fillColor = mobileColorConfig;
        this.borderColor = mobileColorConfig2;
        this.titleColor = mobileColorConfig3;
    }

    public /* synthetic */ ZoneColorConfig(MobileColorConfig mobileColorConfig, MobileColorConfig mobileColorConfig2, MobileColorConfig mobileColorConfig3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new MobileColorConfig(null, null, 3, null) : mobileColorConfig, (i & 2) != 0 ? new MobileColorConfig(null, null, 3, null) : mobileColorConfig2, (i & 4) != 0 ? new MobileColorConfig(null, null, 3, null) : mobileColorConfig3);
    }
}
