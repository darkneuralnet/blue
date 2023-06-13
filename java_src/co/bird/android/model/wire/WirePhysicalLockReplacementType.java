package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/model/wire/WirePhysicalLockReplacementType;", "Landroid/os/Parcelable;", "kind", "", "name", "validationRegex", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKind", "()Ljava/lang/String;", "getName", "getValidationRegex", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WirePhysicalLockReplacementType implements Parcelable {
    public static final Parcelable.Creator<WirePhysicalLockReplacementType> CREATOR = new Creator();
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final String kind;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("combination_validation_regex")
    @InterfaceC41208ft5("combination_validation_regex")
    private final String validationRegex;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WirePhysicalLockReplacementType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WirePhysicalLockReplacementType createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WirePhysicalLockReplacementType(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WirePhysicalLockReplacementType[] newArray(int i) {
            return new WirePhysicalLockReplacementType[i];
        }
    }

    public WirePhysicalLockReplacementType() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WirePhysicalLockReplacementType copy$default(WirePhysicalLockReplacementType wirePhysicalLockReplacementType, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wirePhysicalLockReplacementType.kind;
        }
        if ((i & 2) != 0) {
            str2 = wirePhysicalLockReplacementType.name;
        }
        if ((i & 4) != 0) {
            str3 = wirePhysicalLockReplacementType.validationRegex;
        }
        return wirePhysicalLockReplacementType.copy(str, str2, str3);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.validationRegex;
    }

    public final WirePhysicalLockReplacementType copy(String kind, String str, String str2) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new WirePhysicalLockReplacementType(kind, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WirePhysicalLockReplacementType) {
            WirePhysicalLockReplacementType wirePhysicalLockReplacementType = (WirePhysicalLockReplacementType) obj;
            return Intrinsics.areEqual(this.kind, wirePhysicalLockReplacementType.kind) && Intrinsics.areEqual(this.name, wirePhysicalLockReplacementType.name) && Intrinsics.areEqual(this.validationRegex, wirePhysicalLockReplacementType.validationRegex);
        }
        return false;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValidationRegex() {
        return this.validationRegex;
    }

    public int hashCode() {
        int hashCode = this.kind.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.validationRegex;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.kind;
        String str2 = this.name;
        String str3 = this.validationRegex;
        return "WirePhysicalLockReplacementType(kind=" + str + ", name=" + str2 + ", validationRegex=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.kind);
        out.writeString(this.name);
        out.writeString(this.validationRegex);
    }

    public WirePhysicalLockReplacementType(String kind, String str, String str2) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.kind = kind;
        this.name = str;
        this.validationRegex = str2;
    }

    public /* synthetic */ WirePhysicalLockReplacementType(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
