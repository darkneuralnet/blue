package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetStatusChartSection;", "", "id", "", "position", "", "label", "showLabel", "", "fillDegrees", "fillColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "fillHeight", "", "(Ljava/lang/String;ILjava/lang/String;ZILco/bird/android/model/persistence/nestedstructures/ThemedColors;F)V", "getFillColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getFillDegrees", "()I", "getFillHeight", "()F", "getId", "()Ljava/lang/String;", "getLabel", "getPosition", "getShowLabel", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetStatusChartSection {
    @JsonProperty("fill_color")
    @InterfaceC41208ft5("fill_color")
    private final ThemedColors fillColor;
    @JsonProperty("fill_degrees")
    @InterfaceC41208ft5("fill_degrees")
    private final int fillDegrees;
    @JsonProperty("fill_height")
    @InterfaceC41208ft5("fill_height")
    private final float fillHeight;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66695id;
    @JsonProperty("label")
    @InterfaceC41208ft5("label")
    private final String label;
    @JsonProperty("position")
    @InterfaceC41208ft5("position")
    private final int position;
    @JsonProperty("show_label")
    @InterfaceC41208ft5("show_label")
    private final boolean showLabel;

    public FleetStatusChartSection() {
        this(null, 0, null, false, 0, null, 0.0f, 127, null);
    }

    public static /* synthetic */ FleetStatusChartSection copy$default(FleetStatusChartSection fleetStatusChartSection, String str, int i, String str2, boolean z, int i2, ThemedColors themedColors, float f, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = fleetStatusChartSection.f66695id;
        }
        if ((i3 & 2) != 0) {
            i = fleetStatusChartSection.position;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str2 = fleetStatusChartSection.label;
        }
        String str3 = str2;
        if ((i3 & 8) != 0) {
            z = fleetStatusChartSection.showLabel;
        }
        boolean z2 = z;
        if ((i3 & 16) != 0) {
            i2 = fleetStatusChartSection.fillDegrees;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            themedColors = fleetStatusChartSection.fillColor;
        }
        ThemedColors themedColors2 = themedColors;
        if ((i3 & 64) != 0) {
            f = fleetStatusChartSection.fillHeight;
        }
        return fleetStatusChartSection.copy(str, i4, str3, z2, i5, themedColors2, f);
    }

    public final String component1() {
        return this.f66695id;
    }

    public final int component2() {
        return this.position;
    }

    public final String component3() {
        return this.label;
    }

    public final boolean component4() {
        return this.showLabel;
    }

    public final int component5() {
        return this.fillDegrees;
    }

    public final ThemedColors component6() {
        return this.fillColor;
    }

    public final float component7() {
        return this.fillHeight;
    }

    public final FleetStatusChartSection copy(String id, int i, String label, boolean z, int i2, ThemedColors fillColor, float f) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(fillColor, "fillColor");
        return new FleetStatusChartSection(id, i, label, z, i2, fillColor, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetStatusChartSection) {
            FleetStatusChartSection fleetStatusChartSection = (FleetStatusChartSection) obj;
            return Intrinsics.areEqual(this.f66695id, fleetStatusChartSection.f66695id) && this.position == fleetStatusChartSection.position && Intrinsics.areEqual(this.label, fleetStatusChartSection.label) && this.showLabel == fleetStatusChartSection.showLabel && this.fillDegrees == fleetStatusChartSection.fillDegrees && Intrinsics.areEqual(this.fillColor, fleetStatusChartSection.fillColor) && Float.compare(this.fillHeight, fleetStatusChartSection.fillHeight) == 0;
        }
        return false;
    }

    public final ThemedColors getFillColor() {
        return this.fillColor;
    }

    public final int getFillDegrees() {
        return this.fillDegrees;
    }

    public final float getFillHeight() {
        return this.fillHeight;
    }

    public final String getId() {
        return this.f66695id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getPosition() {
        return this.position;
    }

    public final boolean getShowLabel() {
        return this.showLabel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f66695id.hashCode() * 31) + Integer.hashCode(this.position)) * 31) + this.label.hashCode()) * 31;
        boolean z = this.showLabel;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((hashCode + i) * 31) + Integer.hashCode(this.fillDegrees)) * 31) + this.fillColor.hashCode()) * 31) + Float.hashCode(this.fillHeight);
    }

    public String toString() {
        String str = this.f66695id;
        int i = this.position;
        String str2 = this.label;
        boolean z = this.showLabel;
        int i2 = this.fillDegrees;
        ThemedColors themedColors = this.fillColor;
        float f = this.fillHeight;
        return "FleetStatusChartSection(id=" + str + ", position=" + i + ", label=" + str2 + ", showLabel=" + z + ", fillDegrees=" + i2 + ", fillColor=" + themedColors + ", fillHeight=" + f + ")";
    }

    public FleetStatusChartSection(String id, int i, String label, boolean z, int i2, ThemedColors fillColor, float f) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(fillColor, "fillColor");
        this.f66695id = id;
        this.position = i;
        this.label = label;
        this.showLabel = z;
        this.fillDegrees = i2;
        this.fillColor = fillColor;
        this.fillHeight = f;
    }

    public /* synthetic */ FleetStatusChartSection(String str, int i, String str2, boolean z, int i2, ThemedColors themedColors, float f, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) == 0 ? str2 : "", (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? new ThemedColors(0, 0, 3, null) : themedColors, (i3 & 64) != 0 ? 0.0f : f);
    }
}
