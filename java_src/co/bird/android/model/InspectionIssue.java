package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.wire.WireThemedColors;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006("}, m28432d2 = {"Lco/bird/android/model/InspectionIssue;", "Landroid/os/Parcelable;", "id", "", "display", "selected", "", "mutable", "textColor", "Lco/bird/android/model/wire/WireThemedColors;", "warningMessage", "(Ljava/lang/String;Ljava/lang/String;ZZLco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;)V", "getDisplay", "()Ljava/lang/String;", "getId", "getMutable", "()Z", "getSelected", "getTextColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getWarningMessage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class InspectionIssue implements Parcelable {
    public static final Parcelable.Creator<InspectionIssue> CREATOR = new Creator();
    @JsonProperty("display")
    @InterfaceC41208ft5("display")
    private final String display;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66597id;
    @JsonProperty("mutable")
    @InterfaceC41208ft5("mutable")
    private final boolean mutable;
    @JsonProperty("selected")
    @InterfaceC41208ft5("selected")
    private final boolean selected;
    @JsonProperty("text_color")
    @InterfaceC41208ft5("text_color")
    private final WireThemedColors textColor;
    @JsonProperty("warning_message")
    @InterfaceC41208ft5("warning_message")
    private final String warningMessage;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<InspectionIssue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InspectionIssue createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InspectionIssue(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (WireThemedColors) parcel.readParcelable(InspectionIssue.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InspectionIssue[] newArray(int i) {
            return new InspectionIssue[i];
        }
    }

    public InspectionIssue() {
        this(null, null, false, false, null, null, 63, null);
    }

    public static /* synthetic */ InspectionIssue copy$default(InspectionIssue inspectionIssue, String str, String str2, boolean z, boolean z2, WireThemedColors wireThemedColors, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inspectionIssue.f66597id;
        }
        if ((i & 2) != 0) {
            str2 = inspectionIssue.display;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            z = inspectionIssue.selected;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = inspectionIssue.mutable;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            wireThemedColors = inspectionIssue.textColor;
        }
        WireThemedColors wireThemedColors2 = wireThemedColors;
        if ((i & 32) != 0) {
            str3 = inspectionIssue.warningMessage;
        }
        return inspectionIssue.copy(str, str4, z3, z4, wireThemedColors2, str3);
    }

    public final String component1() {
        return this.f66597id;
    }

    public final String component2() {
        return this.display;
    }

    public final boolean component3() {
        return this.selected;
    }

    public final boolean component4() {
        return this.mutable;
    }

    public final WireThemedColors component5() {
        return this.textColor;
    }

    public final String component6() {
        return this.warningMessage;
    }

    public final InspectionIssue copy(String id, String display, boolean z, boolean z2, WireThemedColors textColor, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        return new InspectionIssue(id, display, z, z2, textColor, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InspectionIssue) {
            InspectionIssue inspectionIssue = (InspectionIssue) obj;
            return Intrinsics.areEqual(this.f66597id, inspectionIssue.f66597id) && Intrinsics.areEqual(this.display, inspectionIssue.display) && this.selected == inspectionIssue.selected && this.mutable == inspectionIssue.mutable && Intrinsics.areEqual(this.textColor, inspectionIssue.textColor) && Intrinsics.areEqual(this.warningMessage, inspectionIssue.warningMessage);
        }
        return false;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final String getId() {
        return this.f66597id;
    }

    public final boolean getMutable() {
        return this.mutable;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final WireThemedColors getTextColor() {
        return this.textColor;
    }

    public final String getWarningMessage() {
        return this.warningMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f66597id.hashCode() * 31) + this.display.hashCode()) * 31;
        boolean z = this.selected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.mutable;
        int hashCode2 = (((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.textColor.hashCode()) * 31;
        String str = this.warningMessage;
        return hashCode2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f66597id;
        String str2 = this.display;
        boolean z = this.selected;
        boolean z2 = this.mutable;
        WireThemedColors wireThemedColors = this.textColor;
        String str3 = this.warningMessage;
        return "InspectionIssue(id=" + str + ", display=" + str2 + ", selected=" + z + ", mutable=" + z2 + ", textColor=" + wireThemedColors + ", warningMessage=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66597id);
        out.writeString(this.display);
        out.writeInt(this.selected ? 1 : 0);
        out.writeInt(this.mutable ? 1 : 0);
        out.writeParcelable(this.textColor, i);
        out.writeString(this.warningMessage);
    }

    public InspectionIssue(String id, String display, boolean z, boolean z2, WireThemedColors textColor, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.f66597id = id;
        this.display = display;
        this.selected = z;
        this.mutable = z2;
        this.textColor = textColor;
        this.warningMessage = str;
    }

    public /* synthetic */ InspectionIssue(String str, String str2, boolean z, boolean z2, WireThemedColors wireThemedColors, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors, (i & 32) != 0 ? null : str3);
    }
}
