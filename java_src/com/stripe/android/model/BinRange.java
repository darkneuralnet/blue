package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.core.model.StripeModel;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/model/BinRange;", "Lcom/stripe/android/core/model/StripeModel;", "low", "", "high", "(Ljava/lang/String;Ljava/lang/String;)V", "getHigh", "()Ljava/lang/String;", "getLow", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "matches", "cardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class BinRange implements StripeModel {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BinRange> CREATOR = new Creator();
    private final String high;
    private final String low;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<BinRange> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BinRange createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BinRange(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BinRange[] newArray(int i) {
            return new BinRange[i];
        }
    }

    public BinRange(String low, String high) {
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(high, "high");
        this.low = low;
        this.high = high;
    }

    public static /* synthetic */ BinRange copy$default(BinRange binRange, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = binRange.low;
        }
        if ((i & 2) != 0) {
            str2 = binRange.high;
        }
        return binRange.copy(str, str2);
    }

    public final String component1() {
        return this.low;
    }

    public final String component2() {
        return this.high;
    }

    public final BinRange copy(String low, String high) {
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(high, "high");
        return new BinRange(low, high);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BinRange) {
            BinRange binRange = (BinRange) obj;
            return Intrinsics.areEqual(this.low, binRange.low) && Intrinsics.areEqual(this.high, binRange.high);
        }
        return false;
    }

    public final String getHigh() {
        return this.high;
    }

    public final String getLow() {
        return this.low;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (this.low.hashCode() * 31) + this.high.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
        if (new java.math.BigDecimal(r3).compareTo(new java.math.BigDecimal(r6.low)) >= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
        if (r0.compareTo(new java.math.BigDecimal(r7)) <= 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
        if (new java.math.BigDecimal(r7).compareTo(new java.math.BigDecimal(r6.high)) <= 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r0.compareTo(new java.math.BigDecimal(r3)) >= 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean matches(CardNumber.Unvalidated cardNumber) {
        BigDecimal bigDecimalOrNull;
        String take;
        boolean z;
        String take2;
        boolean z2;
        String take3;
        String take4;
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        String normalized = cardNumber.getNormalized();
        bigDecimalOrNull = StringsKt__StringNumberConversionsJVMKt.toBigDecimalOrNull(normalized);
        if (bigDecimalOrNull == null) {
            return false;
        }
        if (normalized.length() < this.low.length()) {
            take4 = StringsKt___StringsKt.take(this.low, normalized.length());
        } else {
            take = StringsKt___StringsKt.take(normalized, this.low.length());
        }
        if (normalized.length() < this.high.length()) {
            take3 = StringsKt___StringsKt.take(this.high, normalized.length());
        } else {
            take2 = StringsKt___StringsKt.take(normalized, this.high.length());
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str = this.low;
        String str2 = this.high;
        return "BinRange(low=" + str + ", high=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.low);
        out.writeString(this.high);
    }
}
