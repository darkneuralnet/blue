package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003JS\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0004HÖ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006("}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetActionSection;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetBackground;", "idx", "", "title", "", "subtitle", "action", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;", "backgroundColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "details", "", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;", "(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/util/List;)V", "getAction", "()Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;", "getBackgroundColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getDetails", "()Ljava/util/List;", "getIdx", "()I", "getSubtitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FlightSheetInfoSection implements FlightSheetActionSection, FlightSheetBackground {
    @JsonProperty("action")
    @InterfaceC41208ft5("action")
    private final FlightSheetInfoSectionAction action;
    @JsonProperty("background_color")
    @InterfaceC41208ft5("background_color")
    private final ThemedColors backgroundColor;
    @JsonProperty("details")
    @InterfaceC41208ft5("details")
    private final List<FlightSheetDetail> details;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("subtitle")
    @InterfaceC41208ft5("subtitle")
    private final String subtitle;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public FlightSheetInfoSection() {
        this(0, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ FlightSheetInfoSection copy$default(FlightSheetInfoSection flightSheetInfoSection, int i, String str, String str2, FlightSheetInfoSectionAction flightSheetInfoSectionAction, ThemedColors themedColors, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = flightSheetInfoSection.idx;
        }
        if ((i2 & 2) != 0) {
            str = flightSheetInfoSection.title;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = flightSheetInfoSection.subtitle;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            flightSheetInfoSectionAction = flightSheetInfoSection.action;
        }
        FlightSheetInfoSectionAction flightSheetInfoSectionAction2 = flightSheetInfoSectionAction;
        if ((i2 & 16) != 0) {
            themedColors = flightSheetInfoSection.backgroundColor;
        }
        ThemedColors themedColors2 = themedColors;
        List<FlightSheetDetail> list2 = list;
        if ((i2 & 32) != 0) {
            list2 = flightSheetInfoSection.details;
        }
        return flightSheetInfoSection.copy(i, str3, str4, flightSheetInfoSectionAction2, themedColors2, list2);
    }

    public final int component1() {
        return this.idx;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final FlightSheetInfoSectionAction component4() {
        return this.action;
    }

    public final ThemedColors component5() {
        return this.backgroundColor;
    }

    public final List<FlightSheetDetail> component6() {
        return this.details;
    }

    public final FlightSheetInfoSection copy(int i, String str, String str2, FlightSheetInfoSectionAction flightSheetInfoSectionAction, ThemedColors themedColors, List<FlightSheetDetail> details) {
        Intrinsics.checkNotNullParameter(details, "details");
        return new FlightSheetInfoSection(i, str, str2, flightSheetInfoSectionAction, themedColors, details);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlightSheetInfoSection) {
            FlightSheetInfoSection flightSheetInfoSection = (FlightSheetInfoSection) obj;
            return this.idx == flightSheetInfoSection.idx && Intrinsics.areEqual(this.title, flightSheetInfoSection.title) && Intrinsics.areEqual(this.subtitle, flightSheetInfoSection.subtitle) && Intrinsics.areEqual(this.action, flightSheetInfoSection.action) && Intrinsics.areEqual(this.backgroundColor, flightSheetInfoSection.backgroundColor) && Intrinsics.areEqual(this.details, flightSheetInfoSection.details);
        }
        return false;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.FlightSheetActionSection
    public FlightSheetInfoSectionAction getAction() {
        return this.action;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.FlightSheetBackground
    public ThemedColors getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<FlightSheetDetail> getDetails() {
        return this.details;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.FlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.FlightSheetActionSection
    public String getSubtitle() {
        return this.subtitle;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.FlightSheetSection
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.idx) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FlightSheetInfoSectionAction flightSheetInfoSectionAction = this.action;
        int hashCode4 = (hashCode3 + (flightSheetInfoSectionAction == null ? 0 : flightSheetInfoSectionAction.hashCode())) * 31;
        ThemedColors themedColors = this.backgroundColor;
        return ((hashCode4 + (themedColors != null ? themedColors.hashCode() : 0)) * 31) + this.details.hashCode();
    }

    public String toString() {
        int i = this.idx;
        String str = this.title;
        String str2 = this.subtitle;
        FlightSheetInfoSectionAction flightSheetInfoSectionAction = this.action;
        ThemedColors themedColors = this.backgroundColor;
        List<FlightSheetDetail> list = this.details;
        return "FlightSheetInfoSection(idx=" + i + ", title=" + str + ", subtitle=" + str2 + ", action=" + flightSheetInfoSectionAction + ", backgroundColor=" + themedColors + ", details=" + list + ")";
    }

    public FlightSheetInfoSection(int i, String str, String str2, FlightSheetInfoSectionAction flightSheetInfoSectionAction, ThemedColors themedColors, List<FlightSheetDetail> details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.idx = i;
        this.title = str;
        this.subtitle = str2;
        this.action = flightSheetInfoSectionAction;
        this.backgroundColor = themedColors;
        this.details = details;
    }

    public /* synthetic */ FlightSheetInfoSection(int i, String str, String str2, FlightSheetInfoSectionAction flightSheetInfoSectionAction, ThemedColors themedColors, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : flightSheetInfoSectionAction, (i2 & 16) == 0 ? themedColors : null, (i2 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
