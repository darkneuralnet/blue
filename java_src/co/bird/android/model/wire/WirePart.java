package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PartKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/wire/WirePart;", "Landroid/os/Parcelable;", "id", "", "kind", "Lco/bird/android/model/constant/PartKind;", "key", "(Ljava/lang/String;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getKey", "getKind", "()Lco/bird/android/model/constant/PartKind;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WirePart implements Parcelable {
    public static final Parcelable.Creator<WirePart> CREATOR = new Creator();
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66749id;
    @JsonProperty("key")
    @InterfaceC41208ft5("key")
    private final String key;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final PartKind kind;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WirePart> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WirePart createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WirePart(parcel.readString(), PartKind.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WirePart[] newArray(int i) {
            return new WirePart[i];
        }
    }

    public WirePart(String str, PartKind kind, String key) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f66749id = str;
        this.kind = kind;
        this.key = key;
    }

    public static /* synthetic */ WirePart copy$default(WirePart wirePart, String str, PartKind partKind, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wirePart.f66749id;
        }
        if ((i & 2) != 0) {
            partKind = wirePart.kind;
        }
        if ((i & 4) != 0) {
            str2 = wirePart.key;
        }
        return wirePart.copy(str, partKind, str2);
    }

    public final String component1() {
        return this.f66749id;
    }

    public final PartKind component2() {
        return this.kind;
    }

    public final String component3() {
        return this.key;
    }

    public final WirePart copy(String str, PartKind kind, String key) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(key, "key");
        return new WirePart(str, kind, key);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WirePart) {
            WirePart wirePart = (WirePart) obj;
            return Intrinsics.areEqual(this.f66749id, wirePart.f66749id) && this.kind == wirePart.kind && Intrinsics.areEqual(this.key, wirePart.key);
        }
        return false;
    }

    public final String getId() {
        return this.f66749id;
    }

    public final String getKey() {
        return this.key;
    }

    public final PartKind getKind() {
        return this.kind;
    }

    public int hashCode() {
        String str = this.f66749id;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.kind.hashCode()) * 31) + this.key.hashCode();
    }

    public String toString() {
        String str = this.f66749id;
        PartKind partKind = this.kind;
        String str2 = this.key;
        return "WirePart(id=" + str + ", kind=" + partKind + ", key=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66749id);
        out.writeString(this.kind.name());
        out.writeString(this.key);
    }

    public /* synthetic */ WirePart(String str, PartKind partKind, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, partKind, (i & 4) != 0 ? "" : str2);
    }
}
