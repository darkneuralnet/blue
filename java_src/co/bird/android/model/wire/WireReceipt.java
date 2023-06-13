package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Source;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006¢\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\rHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\bHÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003Jp\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010)J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u000bHÖ\u0001J\t\u00100\u001a\u00020\rHÖ\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u000bHÖ\u0001R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001e¨\u00066"}, m28432d2 = {"Lco/bird/android/model/wire/WireReceipt;", "Landroid/os/Parcelable;", "transaction", "Lco/bird/android/model/wire/WireRideTransaction;", "refillTransaction", "debitAmount", "", "coupons", "", "Lco/bird/android/model/wire/WireCoupon;", "balance", "", "currency", "", "debitTransactionLineItems", "Lco/bird/android/model/wire/WireRideTransactionItem;", "parkingIncentiveValue", "(Lco/bird/android/model/wire/WireRideTransaction;Lco/bird/android/model/wire/WireRideTransaction;JLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;J)V", "getBalance", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCoupons", "()Ljava/util/List;", "getCurrency", "()Ljava/lang/String;", "getDebitAmount", "()J", "getDebitTransactionLineItems", "getParkingIncentiveValue", "getRefillTransaction", "()Lco/bird/android/model/wire/WireRideTransaction;", "getTransaction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lco/bird/android/model/wire/WireRideTransaction;Lco/bird/android/model/wire/WireRideTransaction;JLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;J)Lco/bird/android/model/wire/WireReceipt;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireReceipt implements Parcelable {
    public static final Parcelable.Creator<WireReceipt> CREATOR = new Creator();
    @JsonProperty("balance")
    @InterfaceC41208ft5("balance")
    private final Integer balance;
    @JsonProperty("coupons")
    @InterfaceC41208ft5("coupons")
    private final List<WireCoupon> coupons;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("debit_amount")
    @InterfaceC41208ft5("debit_amount")
    private final long debitAmount;
    @JsonProperty("debit_transaction_line_items")
    @InterfaceC41208ft5("debit_transaction_line_items")
    private final List<WireRideTransactionItem> debitTransactionLineItems;
    @JsonProperty("parking_incentive_value")
    @InterfaceC41208ft5("parking_incentive_value")
    private final long parkingIncentiveValue;
    @JsonProperty("refill_transaction")
    @InterfaceC41208ft5("refill_transaction")
    private final WireRideTransaction refillTransaction;
    @JsonProperty("transaction")
    @InterfaceC41208ft5("transaction")
    private final WireRideTransaction transaction;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireReceipt> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireReceipt createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            WireRideTransaction createFromParcel = parcel.readInt() == 0 ? null : WireRideTransaction.CREATOR.createFromParcel(parcel);
            WireRideTransaction createFromParcel2 = parcel.readInt() == 0 ? null : WireRideTransaction.CREATOR.createFromParcel(parcel);
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(WireCoupon.CREATOR.createFromParcel(parcel));
            }
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(WireRideTransactionItem.CREATOR.createFromParcel(parcel));
            }
            return new WireReceipt(createFromParcel, createFromParcel2, readLong, arrayList, valueOf, readString, arrayList2, parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireReceipt[] newArray(int i) {
            return new WireReceipt[i];
        }
    }

    public WireReceipt() {
        this(null, null, 0L, null, null, null, null, 0L, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final WireRideTransaction component1() {
        return this.transaction;
    }

    public final WireRideTransaction component2() {
        return this.refillTransaction;
    }

    public final long component3() {
        return this.debitAmount;
    }

    public final List<WireCoupon> component4() {
        return this.coupons;
    }

    public final Integer component5() {
        return this.balance;
    }

    public final String component6() {
        return this.currency;
    }

    public final List<WireRideTransactionItem> component7() {
        return this.debitTransactionLineItems;
    }

    public final long component8() {
        return this.parkingIncentiveValue;
    }

    public final WireReceipt copy(WireRideTransaction wireRideTransaction, WireRideTransaction wireRideTransaction2, long j, List<WireCoupon> coupons, Integer num, String currency, List<WireRideTransactionItem> debitTransactionLineItems, long j2) {
        Intrinsics.checkNotNullParameter(coupons, "coupons");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(debitTransactionLineItems, "debitTransactionLineItems");
        return new WireReceipt(wireRideTransaction, wireRideTransaction2, j, coupons, num, currency, debitTransactionLineItems, j2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireReceipt) {
            WireReceipt wireReceipt = (WireReceipt) obj;
            return Intrinsics.areEqual(this.transaction, wireReceipt.transaction) && Intrinsics.areEqual(this.refillTransaction, wireReceipt.refillTransaction) && this.debitAmount == wireReceipt.debitAmount && Intrinsics.areEqual(this.coupons, wireReceipt.coupons) && Intrinsics.areEqual(this.balance, wireReceipt.balance) && Intrinsics.areEqual(this.currency, wireReceipt.currency) && Intrinsics.areEqual(this.debitTransactionLineItems, wireReceipt.debitTransactionLineItems) && this.parkingIncentiveValue == wireReceipt.parkingIncentiveValue;
        }
        return false;
    }

    public final Integer getBalance() {
        return this.balance;
    }

    public final List<WireCoupon> getCoupons() {
        return this.coupons;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final long getDebitAmount() {
        return this.debitAmount;
    }

    public final List<WireRideTransactionItem> getDebitTransactionLineItems() {
        return this.debitTransactionLineItems;
    }

    public final long getParkingIncentiveValue() {
        return this.parkingIncentiveValue;
    }

    public final WireRideTransaction getRefillTransaction() {
        return this.refillTransaction;
    }

    public final WireRideTransaction getTransaction() {
        return this.transaction;
    }

    public int hashCode() {
        WireRideTransaction wireRideTransaction = this.transaction;
        int hashCode = (wireRideTransaction == null ? 0 : wireRideTransaction.hashCode()) * 31;
        WireRideTransaction wireRideTransaction2 = this.refillTransaction;
        int hashCode2 = (((((hashCode + (wireRideTransaction2 == null ? 0 : wireRideTransaction2.hashCode())) * 31) + Long.hashCode(this.debitAmount)) * 31) + this.coupons.hashCode()) * 31;
        Integer num = this.balance;
        return ((((((hashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.currency.hashCode()) * 31) + this.debitTransactionLineItems.hashCode()) * 31) + Long.hashCode(this.parkingIncentiveValue);
    }

    public String toString() {
        WireRideTransaction wireRideTransaction = this.transaction;
        WireRideTransaction wireRideTransaction2 = this.refillTransaction;
        long j = this.debitAmount;
        List<WireCoupon> list = this.coupons;
        Integer num = this.balance;
        String str = this.currency;
        List<WireRideTransactionItem> list2 = this.debitTransactionLineItems;
        long j2 = this.parkingIncentiveValue;
        return "WireReceipt(transaction=" + wireRideTransaction + ", refillTransaction=" + wireRideTransaction2 + ", debitAmount=" + j + ", coupons=" + list + ", balance=" + num + ", currency=" + str + ", debitTransactionLineItems=" + list2 + ", parkingIncentiveValue=" + j2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        WireRideTransaction wireRideTransaction = this.transaction;
        if (wireRideTransaction == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wireRideTransaction.writeToParcel(out, i);
        }
        WireRideTransaction wireRideTransaction2 = this.refillTransaction;
        if (wireRideTransaction2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wireRideTransaction2.writeToParcel(out, i);
        }
        out.writeLong(this.debitAmount);
        List<WireCoupon> list = this.coupons;
        out.writeInt(list.size());
        for (WireCoupon wireCoupon : list) {
            wireCoupon.writeToParcel(out, i);
        }
        Integer num = this.balance;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.currency);
        List<WireRideTransactionItem> list2 = this.debitTransactionLineItems;
        out.writeInt(list2.size());
        for (WireRideTransactionItem wireRideTransactionItem : list2) {
            wireRideTransactionItem.writeToParcel(out, i);
        }
        out.writeLong(this.parkingIncentiveValue);
    }

    public WireReceipt(WireRideTransaction wireRideTransaction, WireRideTransaction wireRideTransaction2, long j, List<WireCoupon> coupons, Integer num, String currency, List<WireRideTransactionItem> debitTransactionLineItems, long j2) {
        Intrinsics.checkNotNullParameter(coupons, "coupons");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(debitTransactionLineItems, "debitTransactionLineItems");
        this.transaction = wireRideTransaction;
        this.refillTransaction = wireRideTransaction2;
        this.debitAmount = j;
        this.coupons = coupons;
        this.balance = num;
        this.currency = currency;
        this.debitTransactionLineItems = debitTransactionLineItems;
        this.parkingIncentiveValue = j2;
    }

    public /* synthetic */ WireReceipt(WireRideTransaction wireRideTransaction, WireRideTransaction wireRideTransaction2, long j, List list, Integer num, String str, List list2, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireRideTransaction, (i & 2) != 0 ? null : wireRideTransaction2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 16) == 0 ? num : null, (i & 32) != 0 ? Source.USD : str, (i & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 128) == 0 ? j2 : 0L);
    }
}
