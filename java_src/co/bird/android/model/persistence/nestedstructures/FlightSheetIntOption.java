package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FlightSheetIntOption;", "", "label", "", "value", "", "(Ljava/lang/String;I)V", "getLabel", "()Ljava/lang/String;", "getValue", "()I", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FlightSheetIntOption {
    @JsonProperty("label")
    @InterfaceC41208ft5("label")
    private final String label;
    @JsonProperty("value")
    @InterfaceC41208ft5("value")
    private final int value;

    public FlightSheetIntOption() {
        this(null, 0, 3, null);
    }

    public static /* synthetic */ FlightSheetIntOption copy$default(FlightSheetIntOption flightSheetIntOption, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = flightSheetIntOption.label;
        }
        if ((i2 & 2) != 0) {
            i = flightSheetIntOption.value;
        }
        return flightSheetIntOption.copy(str, i);
    }

    public final String component1() {
        return this.label;
    }

    public final int component2() {
        return this.value;
    }

    public final FlightSheetIntOption copy(String label, int i) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new FlightSheetIntOption(label, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlightSheetIntOption) {
            FlightSheetIntOption flightSheetIntOption = (FlightSheetIntOption) obj;
            return Intrinsics.areEqual(this.label, flightSheetIntOption.label) && this.value == flightSheetIntOption.value;
        }
        return false;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + Integer.hashCode(this.value);
    }

    public String toString() {
        String str = this.label;
        int i = this.value;
        return "FlightSheetIntOption(label=" + str + ", value=" + i + ")";
    }

    public FlightSheetIntOption(String label, int i) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.label = label;
        this.value = i;
    }

    public /* synthetic */ FlightSheetIntOption(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
