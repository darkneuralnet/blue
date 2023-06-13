package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.wire.WireThemedColors;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/InspectionNotice;", "Landroid/os/Parcelable;", "issueId", "", "display", "bannerColor", "Lco/bird/android/model/wire/WireThemedColors;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireThemedColors;)V", "getBannerColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getDisplay", "()Ljava/lang/String;", "getIssueId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class InspectionNotice implements Parcelable {
    public static final Parcelable.Creator<InspectionNotice> CREATOR = new Creator();
    @JsonProperty("banner_color")
    @InterfaceC41208ft5("banner_color")
    private final WireThemedColors bannerColor;
    @JsonProperty("display")
    @InterfaceC41208ft5("display")
    private final String display;
    @JsonProperty("issue_id")
    @InterfaceC41208ft5("issue_id")
    private final String issueId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<InspectionNotice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InspectionNotice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InspectionNotice(parcel.readString(), parcel.readString(), (WireThemedColors) parcel.readParcelable(InspectionNotice.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InspectionNotice[] newArray(int i) {
            return new InspectionNotice[i];
        }
    }

    public InspectionNotice() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ InspectionNotice copy$default(InspectionNotice inspectionNotice, String str, String str2, WireThemedColors wireThemedColors, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inspectionNotice.issueId;
        }
        if ((i & 2) != 0) {
            str2 = inspectionNotice.display;
        }
        if ((i & 4) != 0) {
            wireThemedColors = inspectionNotice.bannerColor;
        }
        return inspectionNotice.copy(str, str2, wireThemedColors);
    }

    public final String component1() {
        return this.issueId;
    }

    public final String component2() {
        return this.display;
    }

    public final WireThemedColors component3() {
        return this.bannerColor;
    }

    public final InspectionNotice copy(String issueId, String display, WireThemedColors bannerColor) {
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(bannerColor, "bannerColor");
        return new InspectionNotice(issueId, display, bannerColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InspectionNotice) {
            InspectionNotice inspectionNotice = (InspectionNotice) obj;
            return Intrinsics.areEqual(this.issueId, inspectionNotice.issueId) && Intrinsics.areEqual(this.display, inspectionNotice.display) && Intrinsics.areEqual(this.bannerColor, inspectionNotice.bannerColor);
        }
        return false;
    }

    public final WireThemedColors getBannerColor() {
        return this.bannerColor;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final String getIssueId() {
        return this.issueId;
    }

    public int hashCode() {
        return (((this.issueId.hashCode() * 31) + this.display.hashCode()) * 31) + this.bannerColor.hashCode();
    }

    public String toString() {
        String str = this.issueId;
        String str2 = this.display;
        WireThemedColors wireThemedColors = this.bannerColor;
        return "InspectionNotice(issueId=" + str + ", display=" + str2 + ", bannerColor=" + wireThemedColors + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.issueId);
        out.writeString(this.display);
        out.writeParcelable(this.bannerColor, i);
    }

    public InspectionNotice(String issueId, String display, WireThemedColors bannerColor) {
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(bannerColor, "bannerColor");
        this.issueId = issueId;
        this.display = display;
        this.bannerColor = bannerColor;
    }

    public /* synthetic */ InspectionNotice(String str, String str2, WireThemedColors wireThemedColors, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors);
    }
}
