package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.FlightSheetAction;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/wire/WireFlightSheetActions;", "Lco/bird/android/model/wire/WireFlightSheetSection;", "idx", "", "title", "", "actions", "", "Lco/bird/android/model/constant/FlightSheetAction;", "backgroundColor", "Lco/bird/android/model/wire/WireThemedColors;", "(ILjava/lang/String;Ljava/util/List;Lco/bird/android/model/wire/WireThemedColors;)V", "getActions", "()Ljava/util/List;", "getBackgroundColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getIdx", "()I", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFlightSheetActions implements WireFlightSheetSection {
    @JsonProperty("actions")
    @InterfaceC41208ft5("actions")
    private final List<FlightSheetAction> actions;
    @JsonProperty("background_color")
    @InterfaceC41208ft5("background_color")
    private final WireThemedColors backgroundColor;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireFlightSheetActions() {
        this(0, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireFlightSheetActions copy$default(WireFlightSheetActions wireFlightSheetActions, int i, String str, List list, WireThemedColors wireThemedColors, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wireFlightSheetActions.idx;
        }
        if ((i2 & 2) != 0) {
            str = wireFlightSheetActions.title;
        }
        if ((i2 & 4) != 0) {
            list = wireFlightSheetActions.actions;
        }
        if ((i2 & 8) != 0) {
            wireThemedColors = wireFlightSheetActions.backgroundColor;
        }
        return wireFlightSheetActions.copy(i, str, list, wireThemedColors);
    }

    public final int component1() {
        return this.idx;
    }

    public final String component2() {
        return this.title;
    }

    public final List<FlightSheetAction> component3() {
        return this.actions;
    }

    public final WireThemedColors component4() {
        return this.backgroundColor;
    }

    public final WireFlightSheetActions copy(int i, String str, List<? extends FlightSheetAction> actions, WireThemedColors wireThemedColors) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new WireFlightSheetActions(i, str, actions, wireThemedColors);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFlightSheetActions) {
            WireFlightSheetActions wireFlightSheetActions = (WireFlightSheetActions) obj;
            return this.idx == wireFlightSheetActions.idx && Intrinsics.areEqual(this.title, wireFlightSheetActions.title) && Intrinsics.areEqual(this.actions, wireFlightSheetActions.actions) && Intrinsics.areEqual(this.backgroundColor, wireFlightSheetActions.backgroundColor);
        }
        return false;
    }

    public final List<FlightSheetAction> getActions() {
        return this.actions;
    }

    public final WireThemedColors getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // co.bird.android.model.wire.WireFlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    @Override // co.bird.android.model.wire.WireFlightSheetSection
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.idx) * 31;
        String str = this.title;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.actions.hashCode()) * 31;
        WireThemedColors wireThemedColors = this.backgroundColor;
        return hashCode2 + (wireThemedColors != null ? wireThemedColors.hashCode() : 0);
    }

    public String toString() {
        int i = this.idx;
        String str = this.title;
        List<FlightSheetAction> list = this.actions;
        WireThemedColors wireThemedColors = this.backgroundColor;
        return "WireFlightSheetActions(idx=" + i + ", title=" + str + ", actions=" + list + ", backgroundColor=" + wireThemedColors + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WireFlightSheetActions(int i, String str, List<? extends FlightSheetAction> actions, WireThemedColors wireThemedColors) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.idx = i;
        this.title = str;
        this.actions = actions;
        this.backgroundColor = wireThemedColors;
    }

    public /* synthetic */ WireFlightSheetActions(int i, String str, List list, WireThemedColors wireThemedColors, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? null : wireThemedColors);
    }
}
