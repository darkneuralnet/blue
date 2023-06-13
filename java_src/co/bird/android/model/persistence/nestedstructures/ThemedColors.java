package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "", "lightMode", "", "darkMode", "(II)V", "getDarkMode", "()I", "getLightMode", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ThemedColors {
    @JsonProperty("dark_mode")
    @InterfaceC41208ft5("dark_mode")
    private final int darkMode;
    @JsonProperty("light_mode")
    @InterfaceC41208ft5("light_mode")
    private final int lightMode;

    public ThemedColors() {
        this(0, 0, 3, null);
    }

    public static /* synthetic */ ThemedColors copy$default(ThemedColors themedColors, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = themedColors.lightMode;
        }
        if ((i3 & 2) != 0) {
            i2 = themedColors.darkMode;
        }
        return themedColors.copy(i, i2);
    }

    public final int component1() {
        return this.lightMode;
    }

    public final int component2() {
        return this.darkMode;
    }

    public final ThemedColors copy(int i, int i2) {
        return new ThemedColors(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThemedColors) {
            ThemedColors themedColors = (ThemedColors) obj;
            return this.lightMode == themedColors.lightMode && this.darkMode == themedColors.darkMode;
        }
        return false;
    }

    public final int getDarkMode() {
        return this.darkMode;
    }

    public final int getLightMode() {
        return this.lightMode;
    }

    public int hashCode() {
        return (Integer.hashCode(this.lightMode) * 31) + Integer.hashCode(this.darkMode);
    }

    public String toString() {
        int i = this.lightMode;
        int i2 = this.darkMode;
        return "ThemedColors(lightMode=" + i + ", darkMode=" + i2 + ")";
    }

    public ThemedColors(int i, int i2) {
        this.lightMode = i;
        this.darkMode = i2;
    }

    public /* synthetic */ ThemedColors(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
