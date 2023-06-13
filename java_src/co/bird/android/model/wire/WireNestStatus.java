package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.NestIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JI\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006$"}, m28432d2 = {"Lco/bird/android/model/wire/WireNestStatus;", "Lco/bird/android/model/wire/WireNestFlightSheetSection;", "idx", "", "title", "", "details", "nestIcon", "Lco/bird/android/model/constant/NestIcon;", "iconBackgroundColor", "Lco/bird/android/model/wire/WireThemedColors;", "isRecommended", "", "(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestIcon;Lco/bird/android/model/wire/WireThemedColors;Z)V", "getDetails", "()Ljava/lang/String;", "getIconBackgroundColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getIdx", "()I", "()Z", "getNestIcon", "()Lco/bird/android/model/constant/NestIcon;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNestStatus implements WireNestFlightSheetSection {
    @JsonProperty("details")
    @InterfaceC41208ft5("details")
    private final String details;
    @JsonProperty("icon_background_color")
    @InterfaceC41208ft5("icon_background_color")
    private final WireThemedColors iconBackgroundColor;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("is_recommended")
    @InterfaceC41208ft5("is_recommended")
    private final boolean isRecommended;
    @JsonProperty("nest_icon")
    @InterfaceC41208ft5("nest_icon")
    private final NestIcon nestIcon;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireNestStatus(int i, String title, String details, NestIcon nestIcon, WireThemedColors wireThemedColors, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        this.idx = i;
        this.title = title;
        this.details = details;
        this.nestIcon = nestIcon;
        this.iconBackgroundColor = wireThemedColors;
        this.isRecommended = z;
    }

    public static /* synthetic */ WireNestStatus copy$default(WireNestStatus wireNestStatus, int i, String str, String str2, NestIcon nestIcon, WireThemedColors wireThemedColors, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wireNestStatus.idx;
        }
        if ((i2 & 2) != 0) {
            str = wireNestStatus.title;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = wireNestStatus.details;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            nestIcon = wireNestStatus.nestIcon;
        }
        NestIcon nestIcon2 = nestIcon;
        if ((i2 & 16) != 0) {
            wireThemedColors = wireNestStatus.iconBackgroundColor;
        }
        WireThemedColors wireThemedColors2 = wireThemedColors;
        if ((i2 & 32) != 0) {
            z = wireNestStatus.isRecommended;
        }
        return wireNestStatus.copy(i, str3, str4, nestIcon2, wireThemedColors2, z);
    }

    public final int component1() {
        return this.idx;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.details;
    }

    public final NestIcon component4() {
        return this.nestIcon;
    }

    public final WireThemedColors component5() {
        return this.iconBackgroundColor;
    }

    public final boolean component6() {
        return this.isRecommended;
    }

    public final WireNestStatus copy(int i, String title, String details, NestIcon nestIcon, WireThemedColors wireThemedColors, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        return new WireNestStatus(i, title, details, nestIcon, wireThemedColors, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireNestStatus) {
            WireNestStatus wireNestStatus = (WireNestStatus) obj;
            return this.idx == wireNestStatus.idx && Intrinsics.areEqual(this.title, wireNestStatus.title) && Intrinsics.areEqual(this.details, wireNestStatus.details) && this.nestIcon == wireNestStatus.nestIcon && Intrinsics.areEqual(this.iconBackgroundColor, wireNestStatus.iconBackgroundColor) && this.isRecommended == wireNestStatus.isRecommended;
        }
        return false;
    }

    public final String getDetails() {
        return this.details;
    }

    public final WireThemedColors getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    @Override // co.bird.android.model.wire.WireNestFlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    public final NestIcon getNestIcon() {
        return this.nestIcon;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.idx) * 31) + this.title.hashCode()) * 31) + this.details.hashCode()) * 31;
        NestIcon nestIcon = this.nestIcon;
        int hashCode2 = (hashCode + (nestIcon == null ? 0 : nestIcon.hashCode())) * 31;
        WireThemedColors wireThemedColors = this.iconBackgroundColor;
        int hashCode3 = (hashCode2 + (wireThemedColors != null ? wireThemedColors.hashCode() : 0)) * 31;
        boolean z = this.isRecommended;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public final boolean isRecommended() {
        return this.isRecommended;
    }

    public String toString() {
        int i = this.idx;
        String str = this.title;
        String str2 = this.details;
        NestIcon nestIcon = this.nestIcon;
        WireThemedColors wireThemedColors = this.iconBackgroundColor;
        boolean z = this.isRecommended;
        return "WireNestStatus(idx=" + i + ", title=" + str + ", details=" + str2 + ", nestIcon=" + nestIcon + ", iconBackgroundColor=" + wireThemedColors + ", isRecommended=" + z + ")";
    }

    public /* synthetic */ WireNestStatus(int i, String str, String str2, NestIcon nestIcon, WireThemedColors wireThemedColors, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) == 0 ? str2 : "", (i2 & 8) != 0 ? null : nestIcon, (i2 & 16) == 0 ? wireThemedColors : null, (i2 & 32) != 0 ? false : z);
    }
}
