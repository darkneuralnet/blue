package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.cards.Bin;
import com.stripe.android.core.model.StripeModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/model/CardMetadata;", "Lcom/stripe/android/core/model/StripeModel;", "bin", "Lcom/stripe/android/cards/Bin;", "accountRanges", "", "Lcom/stripe/android/model/AccountRange;", "(Lcom/stripe/android/cards/Bin;Ljava/util/List;)V", "getAccountRanges", "()Ljava/util/List;", "getBin", "()Lcom/stripe/android/cards/Bin;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class CardMetadata implements StripeModel {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CardMetadata> CREATOR = new Creator();
    private final List<AccountRange> accountRanges;
    private final Bin bin;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<CardMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardMetadata createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Bin bin = (Bin) parcel.readParcelable(CardMetadata.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(AccountRange.CREATOR.createFromParcel(parcel));
            }
            return new CardMetadata(bin, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardMetadata[] newArray(int i) {
            return new CardMetadata[i];
        }
    }

    public CardMetadata(Bin bin, List<AccountRange> accountRanges) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        Intrinsics.checkNotNullParameter(accountRanges, "accountRanges");
        this.bin = bin;
        this.accountRanges = accountRanges;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardMetadata copy$default(CardMetadata cardMetadata, Bin bin, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bin = cardMetadata.bin;
        }
        if ((i & 2) != 0) {
            list = cardMetadata.accountRanges;
        }
        return cardMetadata.copy(bin, list);
    }

    public final Bin component1() {
        return this.bin;
    }

    public final List<AccountRange> component2() {
        return this.accountRanges;
    }

    public final CardMetadata copy(Bin bin, List<AccountRange> accountRanges) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        Intrinsics.checkNotNullParameter(accountRanges, "accountRanges");
        return new CardMetadata(bin, accountRanges);
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
        if (obj instanceof CardMetadata) {
            CardMetadata cardMetadata = (CardMetadata) obj;
            return Intrinsics.areEqual(this.bin, cardMetadata.bin) && Intrinsics.areEqual(this.accountRanges, cardMetadata.accountRanges);
        }
        return false;
    }

    public final List<AccountRange> getAccountRanges() {
        return this.accountRanges;
    }

    public final Bin getBin() {
        return this.bin;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (this.bin.hashCode() * 31) + this.accountRanges.hashCode();
    }

    public String toString() {
        Bin bin = this.bin;
        List<AccountRange> list = this.accountRanges;
        return "CardMetadata(bin=" + bin + ", accountRanges=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.bin, i);
        List<AccountRange> list = this.accountRanges;
        out.writeInt(list.size());
        for (AccountRange accountRange : list) {
            accountRange.writeToParcel(out, i);
        }
    }
}
