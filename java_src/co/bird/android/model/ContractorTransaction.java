package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003JF\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, m28432d2 = {"Lco/bird/android/model/ContractorTransaction;", "Landroid/os/Parcelable;", "id", "", "amount", "", "currency", "taskCount", "createdAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Lorg/joda/time/DateTime;)V", "getAmount", "()I", "getCreatedAt", "()Lorg/joda/time/DateTime;", "setCreatedAt", "(Lorg/joda/time/DateTime;)V", "getCurrency", "()Ljava/lang/String;", "getId", "getTaskCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Lorg/joda/time/DateTime;)Lco/bird/android/model/ContractorTransaction;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ContractorTransaction implements Parcelable {
    public static final Parcelable.Creator<ContractorTransaction> CREATOR = new Creator();
    @JsonProperty("amount")
    @InterfaceC41208ft5("amount")
    private final int amount;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private DateTime createdAt;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66581id;
    @JsonProperty("task_count")
    @InterfaceC41208ft5("task_count")
    private final Integer taskCount;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ContractorTransaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractorTransaction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContractorTransaction(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractorTransaction[] newArray(int i) {
            return new ContractorTransaction[i];
        }
    }

    public ContractorTransaction() {
        this(null, 0, null, null, null, 31, null);
    }

    public static /* synthetic */ ContractorTransaction copy$default(ContractorTransaction contractorTransaction, String str, int i, String str2, Integer num, DateTime dateTime, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = contractorTransaction.f66581id;
        }
        if ((i2 & 2) != 0) {
            i = contractorTransaction.amount;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = contractorTransaction.currency;
        }
        String str3 = str2;
        if ((i2 & 8) != 0) {
            num = contractorTransaction.taskCount;
        }
        Integer num2 = num;
        if ((i2 & 16) != 0) {
            dateTime = contractorTransaction.createdAt;
        }
        return contractorTransaction.copy(str, i3, str3, num2, dateTime);
    }

    public final String component1() {
        return this.f66581id;
    }

    public final int component2() {
        return this.amount;
    }

    public final String component3() {
        return this.currency;
    }

    public final Integer component4() {
        return this.taskCount;
    }

    public final DateTime component5() {
        return this.createdAt;
    }

    public final ContractorTransaction copy(String str, int i, String currency, Integer num, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new ContractorTransaction(str, i, currency, num, dateTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractorTransaction) {
            ContractorTransaction contractorTransaction = (ContractorTransaction) obj;
            return Intrinsics.areEqual(this.f66581id, contractorTransaction.f66581id) && this.amount == contractorTransaction.amount && Intrinsics.areEqual(this.currency, contractorTransaction.currency) && Intrinsics.areEqual(this.taskCount, contractorTransaction.taskCount) && Intrinsics.areEqual(this.createdAt, contractorTransaction.createdAt);
        }
        return false;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getId() {
        return this.f66581id;
    }

    public final Integer getTaskCount() {
        return this.taskCount;
    }

    public int hashCode() {
        String str = this.f66581id;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.amount)) * 31) + this.currency.hashCode()) * 31;
        Integer num = this.taskCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        DateTime dateTime = this.createdAt;
        return hashCode2 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public final void setCreatedAt(DateTime dateTime) {
        this.createdAt = dateTime;
    }

    public String toString() {
        String str = this.f66581id;
        int i = this.amount;
        String str2 = this.currency;
        Integer num = this.taskCount;
        DateTime dateTime = this.createdAt;
        return "ContractorTransaction(id=" + str + ", amount=" + i + ", currency=" + str2 + ", taskCount=" + num + ", createdAt=" + dateTime + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        int intValue;
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66581id);
        out.writeInt(this.amount);
        out.writeString(this.currency);
        Integer num = this.taskCount;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeSerializable(this.createdAt);
    }

    public ContractorTransaction(String str, int i, String currency, Integer num, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f66581id = str;
        this.amount = i;
        this.currency = currency;
        this.taskCount = num;
        this.createdAt = dateTime;
    }

    public /* synthetic */ ContractorTransaction(String str, int i, String str2, Integer num, DateTime dateTime, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? Source.USD : str2, (i2 & 8) != 0 ? 0 : num, (i2 & 16) != 0 ? null : dateTime);
    }
}
