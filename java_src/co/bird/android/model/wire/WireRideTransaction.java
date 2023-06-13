package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Source;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/wire/WireRideTransaction;", "Landroid/os/Parcelable;", "id", "Ljava/util/UUID;", "amount", "", "currency", "", "(Ljava/util/UUID;JLjava/lang/String;)V", "getAmount", "()J", "getCurrency", "()Ljava/lang/String;", "getId", "()Ljava/util/UUID;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRideTransaction implements Parcelable {
    public static final Parcelable.Creator<WireRideTransaction> CREATOR = new Creator();
    @JsonProperty("amount")
    @InterfaceC41208ft5("amount")
    private final long amount;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final UUID f66757id;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireRideTransaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRideTransaction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireRideTransaction((UUID) parcel.readSerializable(), parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRideTransaction[] newArray(int i) {
            return new WireRideTransaction[i];
        }
    }

    public WireRideTransaction() {
        this(null, 0L, null, 7, null);
    }

    public static /* synthetic */ WireRideTransaction copy$default(WireRideTransaction wireRideTransaction, UUID uuid, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = wireRideTransaction.f66757id;
        }
        if ((i & 2) != 0) {
            j = wireRideTransaction.amount;
        }
        if ((i & 4) != 0) {
            str = wireRideTransaction.currency;
        }
        return wireRideTransaction.copy(uuid, j, str);
    }

    public final UUID component1() {
        return this.f66757id;
    }

    public final long component2() {
        return this.amount;
    }

    public final String component3() {
        return this.currency;
    }

    public final WireRideTransaction copy(UUID id, long j, String currency) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new WireRideTransaction(id, j, currency);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRideTransaction) {
            WireRideTransaction wireRideTransaction = (WireRideTransaction) obj;
            return Intrinsics.areEqual(this.f66757id, wireRideTransaction.f66757id) && this.amount == wireRideTransaction.amount && Intrinsics.areEqual(this.currency, wireRideTransaction.currency);
        }
        return false;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final UUID getId() {
        return this.f66757id;
    }

    public int hashCode() {
        return (((this.f66757id.hashCode() * 31) + Long.hashCode(this.amount)) * 31) + this.currency.hashCode();
    }

    public String toString() {
        UUID uuid = this.f66757id;
        long j = this.amount;
        String str = this.currency;
        return "WireRideTransaction(id=" + uuid + ", amount=" + j + ", currency=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeSerializable(this.f66757id);
        out.writeLong(this.amount);
        out.writeString(this.currency);
    }

    public WireRideTransaction(UUID id, long j, String currency) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f66757id = id;
        this.amount = j;
        this.currency = currency;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireRideTransaction(UUID uuid, long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? Source.USD : str);
        if ((i & 1) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID()");
        }
    }
}
