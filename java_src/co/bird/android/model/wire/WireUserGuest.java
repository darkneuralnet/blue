package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/wire/WireUserGuest;", "Landroid/os/Parcelable;", "id", "", "email", "createdAt", "Lorg/joda/time/DateTime;", "startRideAttempted", "", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Z)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getEmail", "()Ljava/lang/String;", "getId", "getStartRideAttempted", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireUserGuest implements Parcelable {
    public static final Parcelable.Creator<WireUserGuest> CREATOR = new Creator();
    private final DateTime createdAt;
    @JsonProperty("email")
    @InterfaceC41208ft5("email")
    private final String email;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66774id;
    private final boolean startRideAttempted;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireUserGuest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireUserGuest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireUserGuest(parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireUserGuest[] newArray(int i) {
            return new WireUserGuest[i];
        }
    }

    public WireUserGuest() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ WireUserGuest copy$default(WireUserGuest wireUserGuest, String str, String str2, DateTime dateTime, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireUserGuest.f66774id;
        }
        if ((i & 2) != 0) {
            str2 = wireUserGuest.email;
        }
        if ((i & 4) != 0) {
            dateTime = wireUserGuest.createdAt;
        }
        if ((i & 8) != 0) {
            z = wireUserGuest.startRideAttempted;
        }
        return wireUserGuest.copy(str, str2, dateTime, z);
    }

    public final String component1() {
        return this.f66774id;
    }

    public final String component2() {
        return this.email;
    }

    public final DateTime component3() {
        return this.createdAt;
    }

    public final boolean component4() {
        return this.startRideAttempted;
    }

    public final WireUserGuest copy(String id, String str, DateTime createdAt, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new WireUserGuest(id, str, createdAt, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireUserGuest) {
            WireUserGuest wireUserGuest = (WireUserGuest) obj;
            return Intrinsics.areEqual(this.f66774id, wireUserGuest.f66774id) && Intrinsics.areEqual(this.email, wireUserGuest.email) && Intrinsics.areEqual(this.createdAt, wireUserGuest.createdAt) && this.startRideAttempted == wireUserGuest.startRideAttempted;
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getId() {
        return this.f66774id;
    }

    public final boolean getStartRideAttempted() {
        return this.startRideAttempted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66774id.hashCode() * 31;
        String str = this.email;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.createdAt.hashCode()) * 31;
        boolean z = this.startRideAttempted;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f66774id;
        String str2 = this.email;
        DateTime dateTime = this.createdAt;
        boolean z = this.startRideAttempted;
        return "WireUserGuest(id=" + str + ", email=" + str2 + ", createdAt=" + dateTime + ", startRideAttempted=" + z + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66774id);
        out.writeString(this.email);
        out.writeSerializable(this.createdAt);
        out.writeInt(this.startRideAttempted ? 1 : 0);
    }

    public WireUserGuest(String id, String str, DateTime createdAt, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f66774id = id;
        this.email = str;
        this.createdAt = createdAt;
        this.startRideAttempted = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireUserGuest(String str, String str2, DateTime dateTime, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, dateTime, (i & 8) != 0 ? false : z);
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
