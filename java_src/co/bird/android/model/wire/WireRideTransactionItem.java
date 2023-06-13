package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/wire/WireRideTransactionItem;", "Landroid/os/Parcelable;", "kind", "", "title", "valueAmount", "", "valueString", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getKind", "()Ljava/lang/String;", "getTitle", "getValueAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValueString", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lco/bird/android/model/wire/WireRideTransactionItem;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRideTransactionItem implements Parcelable {
    public static final Parcelable.Creator<WireRideTransactionItem> CREATOR = new Creator();
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final String kind;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("value_amount")
    @InterfaceC41208ft5("value_amount")
    private final Integer valueAmount;
    @JsonProperty("value_string")
    @InterfaceC41208ft5("value_string")
    private final String valueString;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireRideTransactionItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRideTransactionItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireRideTransactionItem(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRideTransactionItem[] newArray(int i) {
            return new WireRideTransactionItem[i];
        }
    }

    public WireRideTransactionItem() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ WireRideTransactionItem copy$default(WireRideTransactionItem wireRideTransactionItem, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireRideTransactionItem.kind;
        }
        if ((i & 2) != 0) {
            str2 = wireRideTransactionItem.title;
        }
        if ((i & 4) != 0) {
            num = wireRideTransactionItem.valueAmount;
        }
        if ((i & 8) != 0) {
            str3 = wireRideTransactionItem.valueString;
        }
        return wireRideTransactionItem.copy(str, str2, num, str3);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.title;
    }

    public final Integer component3() {
        return this.valueAmount;
    }

    public final String component4() {
        return this.valueString;
    }

    public final WireRideTransactionItem copy(String str, String str2, Integer num, String str3) {
        return new WireRideTransactionItem(str, str2, num, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRideTransactionItem) {
            WireRideTransactionItem wireRideTransactionItem = (WireRideTransactionItem) obj;
            return Intrinsics.areEqual(this.kind, wireRideTransactionItem.kind) && Intrinsics.areEqual(this.title, wireRideTransactionItem.title) && Intrinsics.areEqual(this.valueAmount, wireRideTransactionItem.valueAmount) && Intrinsics.areEqual(this.valueString, wireRideTransactionItem.valueString);
        }
        return false;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getValueAmount() {
        return this.valueAmount;
    }

    public final String getValueString() {
        return this.valueString;
    }

    public int hashCode() {
        String str = this.kind;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.valueAmount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.valueString;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.kind;
        String str2 = this.title;
        Integer num = this.valueAmount;
        String str3 = this.valueString;
        return "WireRideTransactionItem(kind=" + str + ", title=" + str2 + ", valueAmount=" + num + ", valueString=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        int intValue;
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.kind);
        out.writeString(this.title);
        Integer num = this.valueAmount;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.valueString);
    }

    public WireRideTransactionItem(String str, String str2, Integer num, String str3) {
        this.kind = str;
        this.title = str2;
        this.valueAmount = num;
        this.valueString = str3;
    }

    public /* synthetic */ WireRideTransactionItem(String str, String str2, Integer num, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "Title" : str2, (i & 4) != 0 ? 300 : num, (i & 8) != 0 ? null : str3);
    }
}
