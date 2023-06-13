package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003JS\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006'"}, m28432d2 = {"Lco/bird/android/model/wire/WireFlightSheetInfoSection;", "Lco/bird/android/model/wire/WireFlightSheetSection;", "idx", "", "title", "", "subtitle", "details", "", "Lco/bird/android/model/wire/WireFlightSheetDetail;", "backgroundColor", "Lco/bird/android/model/wire/WireThemedColors;", "action", "Lco/bird/android/model/wire/WireFlightSheetInfoSectionAction;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireFlightSheetInfoSectionAction;)V", "getAction", "()Lco/bird/android/model/wire/WireFlightSheetInfoSectionAction;", "getBackgroundColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getDetails", "()Ljava/util/List;", "getIdx", "()I", "getSubtitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFlightSheetInfoSection implements WireFlightSheetSection {
    @JsonProperty("action")
    @InterfaceC41208ft5("action")
    private final WireFlightSheetInfoSectionAction action;
    @JsonProperty("background_color")
    @InterfaceC41208ft5("background_color")
    private final WireThemedColors backgroundColor;
    @JsonProperty("details")
    @InterfaceC41208ft5("details")
    private final List<WireFlightSheetDetail> details;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("subtitle")
    @InterfaceC41208ft5("subtitle")
    private final String subtitle;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireFlightSheetInfoSection() {
        this(0, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ WireFlightSheetInfoSection copy$default(WireFlightSheetInfoSection wireFlightSheetInfoSection, int i, String str, String str2, List list, WireThemedColors wireThemedColors, WireFlightSheetInfoSectionAction wireFlightSheetInfoSectionAction, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wireFlightSheetInfoSection.idx;
        }
        if ((i2 & 2) != 0) {
            str = wireFlightSheetInfoSection.title;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = wireFlightSheetInfoSection.subtitle;
        }
        String str4 = str2;
        List<WireFlightSheetDetail> list2 = list;
        if ((i2 & 8) != 0) {
            list2 = wireFlightSheetInfoSection.details;
        }
        List list3 = list2;
        if ((i2 & 16) != 0) {
            wireThemedColors = wireFlightSheetInfoSection.backgroundColor;
        }
        WireThemedColors wireThemedColors2 = wireThemedColors;
        if ((i2 & 32) != 0) {
            wireFlightSheetInfoSectionAction = wireFlightSheetInfoSection.action;
        }
        return wireFlightSheetInfoSection.copy(i, str3, str4, list3, wireThemedColors2, wireFlightSheetInfoSectionAction);
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

    public final List<WireFlightSheetDetail> component4() {
        return this.details;
    }

    public final WireThemedColors component5() {
        return this.backgroundColor;
    }

    public final WireFlightSheetInfoSectionAction component6() {
        return this.action;
    }

    public final WireFlightSheetInfoSection copy(int i, String str, String str2, List<WireFlightSheetDetail> details, WireThemedColors wireThemedColors, WireFlightSheetInfoSectionAction wireFlightSheetInfoSectionAction) {
        Intrinsics.checkNotNullParameter(details, "details");
        return new WireFlightSheetInfoSection(i, str, str2, details, wireThemedColors, wireFlightSheetInfoSectionAction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFlightSheetInfoSection) {
            WireFlightSheetInfoSection wireFlightSheetInfoSection = (WireFlightSheetInfoSection) obj;
            return this.idx == wireFlightSheetInfoSection.idx && Intrinsics.areEqual(this.title, wireFlightSheetInfoSection.title) && Intrinsics.areEqual(this.subtitle, wireFlightSheetInfoSection.subtitle) && Intrinsics.areEqual(this.details, wireFlightSheetInfoSection.details) && Intrinsics.areEqual(this.backgroundColor, wireFlightSheetInfoSection.backgroundColor) && Intrinsics.areEqual(this.action, wireFlightSheetInfoSection.action);
        }
        return false;
    }

    public final WireFlightSheetInfoSectionAction getAction() {
        return this.action;
    }

    public final WireThemedColors getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<WireFlightSheetDetail> getDetails() {
        return this.details;
    }

    @Override // co.bird.android.model.wire.WireFlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    @Override // co.bird.android.model.wire.WireFlightSheetSection
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.idx) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.details.hashCode()) * 31;
        WireThemedColors wireThemedColors = this.backgroundColor;
        int hashCode4 = (hashCode3 + (wireThemedColors == null ? 0 : wireThemedColors.hashCode())) * 31;
        WireFlightSheetInfoSectionAction wireFlightSheetInfoSectionAction = this.action;
        return hashCode4 + (wireFlightSheetInfoSectionAction != null ? wireFlightSheetInfoSectionAction.hashCode() : 0);
    }

    public String toString() {
        int i = this.idx;
        String str = this.title;
        String str2 = this.subtitle;
        List<WireFlightSheetDetail> list = this.details;
        WireThemedColors wireThemedColors = this.backgroundColor;
        WireFlightSheetInfoSectionAction wireFlightSheetInfoSectionAction = this.action;
        return "WireFlightSheetInfoSection(idx=" + i + ", title=" + str + ", subtitle=" + str2 + ", details=" + list + ", backgroundColor=" + wireThemedColors + ", action=" + wireFlightSheetInfoSectionAction + ")";
    }

    public WireFlightSheetInfoSection(int i, String str, String str2, List<WireFlightSheetDetail> details, WireThemedColors wireThemedColors, WireFlightSheetInfoSectionAction wireFlightSheetInfoSectionAction) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.idx = i;
        this.title = str;
        this.subtitle = str2;
        this.details = details;
        this.backgroundColor = wireThemedColors;
        this.action = wireFlightSheetInfoSectionAction;
    }

    public /* synthetic */ WireFlightSheetInfoSection(int i, String str, String str2, List list, WireThemedColors wireThemedColors, WireFlightSheetInfoSectionAction wireFlightSheetInfoSectionAction, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 16) != 0 ? null : wireThemedColors, (i2 & 32) == 0 ? wireFlightSheetInfoSectionAction : null);
    }
}
