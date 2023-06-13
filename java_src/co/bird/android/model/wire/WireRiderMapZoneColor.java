package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/wire/WireRiderMapZoneColor;", "", "lightMode", "", "darkMode", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getDarkMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLightMode", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/wire/WireRiderMapZoneColor;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRiderMapZoneColor {
    @JsonProperty("dark_mode")
    @InterfaceC41208ft5("dark_mode")
    private final Integer darkMode;
    @JsonProperty("light_mode")
    @InterfaceC41208ft5("light_mode")
    private final Integer lightMode;

    public WireRiderMapZoneColor() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ WireRiderMapZoneColor copy$default(WireRiderMapZoneColor wireRiderMapZoneColor, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = wireRiderMapZoneColor.lightMode;
        }
        if ((i & 2) != 0) {
            num2 = wireRiderMapZoneColor.darkMode;
        }
        return wireRiderMapZoneColor.copy(num, num2);
    }

    public final Integer component1() {
        return this.lightMode;
    }

    public final Integer component2() {
        return this.darkMode;
    }

    public final WireRiderMapZoneColor copy(Integer num, Integer num2) {
        return new WireRiderMapZoneColor(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRiderMapZoneColor) {
            WireRiderMapZoneColor wireRiderMapZoneColor = (WireRiderMapZoneColor) obj;
            return Intrinsics.areEqual(this.lightMode, wireRiderMapZoneColor.lightMode) && Intrinsics.areEqual(this.darkMode, wireRiderMapZoneColor.darkMode);
        }
        return false;
    }

    public final Integer getDarkMode() {
        return this.darkMode;
    }

    public final Integer getLightMode() {
        return this.lightMode;
    }

    public int hashCode() {
        Integer num = this.lightMode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.darkMode;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.lightMode;
        Integer num2 = this.darkMode;
        return "WireRiderMapZoneColor(lightMode=" + num + ", darkMode=" + num2 + ")";
    }

    public WireRiderMapZoneColor(Integer num, Integer num2) {
        this.lightMode = num;
        this.darkMode = num2;
    }

    public /* synthetic */ WireRiderMapZoneColor(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
