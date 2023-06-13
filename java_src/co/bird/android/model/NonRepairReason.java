package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\tHÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\tHÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, m28432d2 = {"Lco/bird/android/model/NonRepairReason;", "Landroid/os/Parcelable;", "display", "", "reason", "selected", "", "allowNote", "subreasons", "", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;)V", "getAllowNote", "()Z", "getDisplay", "()Ljava/lang/String;", "getReason", "getSelected", "getSubreasons", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NonRepairReason implements Parcelable {
    public static final Parcelable.Creator<NonRepairReason> CREATOR = new Creator();
    @JsonProperty("allow_note")
    @InterfaceC41208ft5("allow_note")
    private final boolean allowNote;
    @JsonProperty("display")
    @InterfaceC41208ft5("display")
    private final String display;
    @JsonProperty("reason")
    @InterfaceC41208ft5("reason")
    private final String reason;
    @JsonProperty("selected")
    @InterfaceC41208ft5("selected")
    private final boolean selected;
    @JsonProperty("subreasons")
    @InterfaceC41208ft5("subreasons")
    private final List<NonRepairReason> subreasons;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<NonRepairReason> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NonRepairReason createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(NonRepairReason.CREATOR.createFromParcel(parcel));
                }
            }
            return new NonRepairReason(readString, readString2, z, z2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NonRepairReason[] newArray(int i) {
            return new NonRepairReason[i];
        }
    }

    public NonRepairReason() {
        this(null, null, false, false, null, 31, null);
    }

    public static /* synthetic */ NonRepairReason copy$default(NonRepairReason nonRepairReason, String str, String str2, boolean z, boolean z2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nonRepairReason.display;
        }
        if ((i & 2) != 0) {
            str2 = nonRepairReason.reason;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = nonRepairReason.selected;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = nonRepairReason.allowNote;
        }
        boolean z4 = z2;
        List<NonRepairReason> list2 = list;
        if ((i & 16) != 0) {
            list2 = nonRepairReason.subreasons;
        }
        return nonRepairReason.copy(str, str3, z3, z4, list2);
    }

    public final String component1() {
        return this.display;
    }

    public final String component2() {
        return this.reason;
    }

    public final boolean component3() {
        return this.selected;
    }

    public final boolean component4() {
        return this.allowNote;
    }

    public final List<NonRepairReason> component5() {
        return this.subreasons;
    }

    public final NonRepairReason copy(String str, String reason, boolean z, boolean z2, List<NonRepairReason> list) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new NonRepairReason(str, reason, z, z2, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NonRepairReason) {
            NonRepairReason nonRepairReason = (NonRepairReason) obj;
            return Intrinsics.areEqual(this.display, nonRepairReason.display) && Intrinsics.areEqual(this.reason, nonRepairReason.reason) && this.selected == nonRepairReason.selected && this.allowNote == nonRepairReason.allowNote && Intrinsics.areEqual(this.subreasons, nonRepairReason.subreasons);
        }
        return false;
    }

    public final boolean getAllowNote() {
        return this.allowNote;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final String getReason() {
        return this.reason;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final List<NonRepairReason> getSubreasons() {
        return this.subreasons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.display;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.reason.hashCode()) * 31;
        boolean z = this.selected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.allowNote;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        List<NonRepairReason> list = this.subreasons;
        return i3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.display;
        String str2 = this.reason;
        boolean z = this.selected;
        boolean z2 = this.allowNote;
        List<NonRepairReason> list = this.subreasons;
        return "NonRepairReason(display=" + str + ", reason=" + str2 + ", selected=" + z + ", allowNote=" + z2 + ", subreasons=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.display);
        out.writeString(this.reason);
        out.writeInt(this.selected ? 1 : 0);
        out.writeInt(this.allowNote ? 1 : 0);
        List<NonRepairReason> list = this.subreasons;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        for (NonRepairReason nonRepairReason : list) {
            nonRepairReason.writeToParcel(out, i);
        }
    }

    public NonRepairReason(String str, String reason, boolean z, boolean z2, List<NonRepairReason> list) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.display = str;
        this.reason = reason;
        this.selected = z;
        this.allowNote = z2;
        this.subreasons = list;
    }

    public /* synthetic */ NonRepairReason(String str, String str2, boolean z, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : list);
    }
}
