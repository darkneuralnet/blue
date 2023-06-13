package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.FlightSheetAction;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FlightSheetActions;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetSection;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetBackground;", "idx", "", "title", "", "backgroundColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "actions", "", "Lco/bird/android/model/constant/FlightSheetAction;", "(ILjava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "getBackgroundColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getIdx", "()I", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FlightSheetActions implements FlightSheetSection, FlightSheetBackground {
    @JsonProperty("actions")
    @InterfaceC41208ft5("actions")
    private final List<FlightSheetAction> actions;
    @JsonProperty("background_color")
    @InterfaceC41208ft5("background_color")
    private final ThemedColors backgroundColor;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public FlightSheetActions() {
        this(0, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightSheetActions copy$default(FlightSheetActions flightSheetActions, int i, String str, ThemedColors themedColors, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = flightSheetActions.idx;
        }
        if ((i2 & 2) != 0) {
            str = flightSheetActions.title;
        }
        if ((i2 & 4) != 0) {
            themedColors = flightSheetActions.backgroundColor;
        }
        if ((i2 & 8) != 0) {
            list = flightSheetActions.actions;
        }
        return flightSheetActions.copy(i, str, themedColors, list);
    }

    public final int component1() {
        return this.idx;
    }

    public final String component2() {
        return this.title;
    }

    public final ThemedColors component3() {
        return this.backgroundColor;
    }

    public final List<FlightSheetAction> component4() {
        return this.actions;
    }

    public final FlightSheetActions copy(int i, String str, ThemedColors themedColors, List<? extends FlightSheetAction> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new FlightSheetActions(i, str, themedColors, actions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlightSheetActions) {
            FlightSheetActions flightSheetActions = (FlightSheetActions) obj;
            return this.idx == flightSheetActions.idx && Intrinsics.areEqual(this.title, flightSheetActions.title) && Intrinsics.areEqual(this.backgroundColor, flightSheetActions.backgroundColor) && Intrinsics.areEqual(this.actions, flightSheetActions.actions);
        }
        return false;
    }

    public final List<FlightSheetAction> getActions() {
        return this.actions;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.FlightSheetBackground
    public ThemedColors getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.FlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.FlightSheetSection
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.idx) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ThemedColors themedColors = this.backgroundColor;
        return ((hashCode2 + (themedColors != null ? themedColors.hashCode() : 0)) * 31) + this.actions.hashCode();
    }

    public String toString() {
        int i = this.idx;
        String str = this.title;
        ThemedColors themedColors = this.backgroundColor;
        List<FlightSheetAction> list = this.actions;
        return "FlightSheetActions(idx=" + i + ", title=" + str + ", backgroundColor=" + themedColors + ", actions=" + list + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlightSheetActions(int i, String str, ThemedColors themedColors, List<? extends FlightSheetAction> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.idx = i;
        this.title = str;
        this.backgroundColor = themedColors;
        this.actions = actions;
    }

    public /* synthetic */ FlightSheetActions(int i, String str, ThemedColors themedColors, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : themedColors, (i2 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
