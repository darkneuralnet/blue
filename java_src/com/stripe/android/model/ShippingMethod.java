package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tB3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006("}, m28432d2 = {"Lcom/stripe/android/model/ShippingMethod;", "Lcom/stripe/android/core/model/StripeModel;", "label", "", "identifier", "amount", "", "currencyCode", "detail", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "currency", "Ljava/util/Currency;", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/Currency;Ljava/lang/String;)V", "getAmount", "()J", "getCurrency", "()Ljava/util/Currency;", "getDetail", "()Ljava/lang/String;", "getIdentifier", "getLabel", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ShippingMethod implements StripeModel {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ShippingMethod> CREATOR = new Creator();
    private final long amount;
    private final Currency currency;
    private final String detail;
    private final String identifier;
    private final String label;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ShippingMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShippingMethod createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShippingMethod(parcel.readString(), parcel.readString(), parcel.readLong(), (Currency) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShippingMethod[] newArray(int i) {
            return new ShippingMethod[i];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShippingMethod(String label, String identifier, long j, String currencyCode) {
        this(label, identifier, j, currencyCode, (String) null, 16, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
    }

    public static /* synthetic */ ShippingMethod copy$default(ShippingMethod shippingMethod, String str, String str2, long j, Currency currency, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shippingMethod.label;
        }
        if ((i & 2) != 0) {
            str2 = shippingMethod.identifier;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            j = shippingMethod.amount;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            currency = shippingMethod.currency;
        }
        Currency currency2 = currency;
        if ((i & 16) != 0) {
            str3 = shippingMethod.detail;
        }
        return shippingMethod.copy(str, str4, j2, currency2, str3);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.identifier;
    }

    public final long component3() {
        return this.amount;
    }

    public final Currency component4() {
        return this.currency;
    }

    public final String component5() {
        return this.detail;
    }

    public final ShippingMethod copy(String label, String identifier, long j, Currency currency, String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new ShippingMethod(label, identifier, j, currency, str);
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
        if (obj instanceof ShippingMethod) {
            ShippingMethod shippingMethod = (ShippingMethod) obj;
            return Intrinsics.areEqual(this.label, shippingMethod.label) && Intrinsics.areEqual(this.identifier, shippingMethod.identifier) && this.amount == shippingMethod.amount && Intrinsics.areEqual(this.currency, shippingMethod.currency) && Intrinsics.areEqual(this.detail, shippingMethod.detail);
        }
        return false;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = ((((((this.label.hashCode() * 31) + this.identifier.hashCode()) * 31) + Long.hashCode(this.amount)) * 31) + this.currency.hashCode()) * 31;
        String str = this.detail;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.label;
        String str2 = this.identifier;
        long j = this.amount;
        Currency currency = this.currency;
        String str3 = this.detail;
        return "ShippingMethod(label=" + str + ", identifier=" + str2 + ", amount=" + j + ", currency=" + currency + ", detail=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.label);
        out.writeString(this.identifier);
        out.writeLong(this.amount);
        out.writeSerializable(this.currency);
        out.writeString(this.detail);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShippingMethod(String label, String identifier, long j, Currency currency) {
        this(label, identifier, j, currency, (String) null, 16, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(currency, "currency");
    }

    @JvmOverloads
    public ShippingMethod(String label, String identifier, long j, Currency currency, String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.label = label;
        this.identifier = identifier;
        this.amount = j;
        this.currency = currency;
        this.detail = str;
    }

    public /* synthetic */ ShippingMethod(String str, String str2, long j, Currency currency, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, currency, (i & 16) != 0 ? null : str3);
    }

    public /* synthetic */ ShippingMethod(String str, String str2, long j, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, (i & 16) != 0 ? null : str4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ShippingMethod(String label, String identifier, long j, String currencyCode, String str) {
        this(label, identifier, j, r6, str);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Currency currency = Currency.getInstance(currencyCode);
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(currencyCode)");
    }
}
