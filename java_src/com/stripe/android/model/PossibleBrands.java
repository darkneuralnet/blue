package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/model/PossibleBrands;", "Lcom/stripe/android/core/model/StripeModel;", "brands", "", "Lcom/stripe/android/model/CardBrand;", "(Ljava/util/List;)V", "getBrands", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PossibleBrands implements StripeModel {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PossibleBrands> CREATOR = new Creator();
    private final List<CardBrand> brands;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<PossibleBrands> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PossibleBrands createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(CardBrand.valueOf(parcel.readString()));
            }
            return new PossibleBrands(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PossibleBrands[] newArray(int i) {
            return new PossibleBrands[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PossibleBrands(List<? extends CardBrand> brands) {
        Intrinsics.checkNotNullParameter(brands, "brands");
        this.brands = brands;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PossibleBrands copy$default(PossibleBrands possibleBrands, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = possibleBrands.brands;
        }
        return possibleBrands.copy(list);
    }

    public final List<CardBrand> component1() {
        return this.brands;
    }

    public final PossibleBrands copy(List<? extends CardBrand> brands) {
        Intrinsics.checkNotNullParameter(brands, "brands");
        return new PossibleBrands(brands);
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
        return (obj instanceof PossibleBrands) && Intrinsics.areEqual(this.brands, ((PossibleBrands) obj).brands);
    }

    public final List<CardBrand> getBrands() {
        return this.brands;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.brands.hashCode();
    }

    public String toString() {
        List<CardBrand> list = this.brands;
        return "PossibleBrands(brands=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<CardBrand> list = this.brands;
        out.writeInt(list.size());
        for (CardBrand cardBrand : list) {
            out.writeString(cardBrand.name());
        }
    }
}
