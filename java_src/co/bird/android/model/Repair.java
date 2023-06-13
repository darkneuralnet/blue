package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.constant.PartKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006%"}, m28432d2 = {"Lco/bird/android/model/Repair;", "Landroid/os/Parcelable;", "id", "", "display", "selected", "", "partKind", "Lco/bird/android/model/constant/PartKind;", "mutable", "(Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PartKind;Z)V", "getDisplay", "()Ljava/lang/String;", "getId", "getMutable", "()Z", "getPartKind", "()Lco/bird/android/model/constant/PartKind;", "getSelected", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Repair implements Parcelable {
    public static final Parcelable.Creator<Repair> CREATOR = new Creator();
    @JsonProperty("display")
    @InterfaceC41208ft5("display")
    private final String display;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66621id;
    @JsonProperty("mutable")
    @InterfaceC41208ft5("mutable")
    private final boolean mutable;
    @JsonProperty("part_kind")
    @InterfaceC41208ft5("part_kind")
    private final PartKind partKind;
    @JsonProperty("selected")
    @InterfaceC41208ft5("selected")
    private final boolean selected;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Repair> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Repair createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Repair(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : PartKind.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Repair[] newArray(int i) {
            return new Repair[i];
        }
    }

    public Repair() {
        this(null, null, false, null, false, 31, null);
    }

    public static /* synthetic */ Repair copy$default(Repair repair, String str, String str2, boolean z, PartKind partKind, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = repair.f66621id;
        }
        if ((i & 2) != 0) {
            str2 = repair.display;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = repair.selected;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            partKind = repair.partKind;
        }
        PartKind partKind2 = partKind;
        if ((i & 16) != 0) {
            z2 = repair.mutable;
        }
        return repair.copy(str, str3, z3, partKind2, z2);
    }

    public final String component1() {
        return this.f66621id;
    }

    public final String component2() {
        return this.display;
    }

    public final boolean component3() {
        return this.selected;
    }

    public final PartKind component4() {
        return this.partKind;
    }

    public final boolean component5() {
        return this.mutable;
    }

    public final Repair copy(String id, String str, boolean z, PartKind partKind, boolean z2) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new Repair(id, str, z, partKind, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Repair) {
            Repair repair = (Repair) obj;
            return Intrinsics.areEqual(this.f66621id, repair.f66621id) && Intrinsics.areEqual(this.display, repair.display) && this.selected == repair.selected && this.partKind == repair.partKind && this.mutable == repair.mutable;
        }
        return false;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final String getId() {
        return this.f66621id;
    }

    public final boolean getMutable() {
        return this.mutable;
    }

    public final PartKind getPartKind() {
        return this.partKind;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66621id.hashCode() * 31;
        String str = this.display;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.selected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        PartKind partKind = this.partKind;
        int hashCode3 = (i2 + (partKind != null ? partKind.hashCode() : 0)) * 31;
        boolean z2 = this.mutable;
        return hashCode3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f66621id;
        String str2 = this.display;
        boolean z = this.selected;
        PartKind partKind = this.partKind;
        boolean z2 = this.mutable;
        return "Repair(id=" + str + ", display=" + str2 + ", selected=" + z + ", partKind=" + partKind + ", mutable=" + z2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66621id);
        out.writeString(this.display);
        out.writeInt(this.selected ? 1 : 0);
        PartKind partKind = this.partKind;
        if (partKind == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(partKind.name());
        }
        out.writeInt(this.mutable ? 1 : 0);
    }

    public Repair(String id, String str, boolean z, PartKind partKind, boolean z2) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f66621id = id;
        this.display = str;
        this.selected = z;
        this.partKind = partKind;
        this.mutable = z2;
    }

    public /* synthetic */ Repair(String str, String str2, boolean z, PartKind partKind, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) == 0 ? partKind : null, (i & 16) == 0 ? z2 : false);
    }
}
