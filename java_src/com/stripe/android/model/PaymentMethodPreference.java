package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodPreference;", "Lcom/stripe/android/core/model/StripeModel;", "intent", "Lcom/stripe/android/model/StripeIntent;", "formUI", "", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;)V", "getFormUI", "()Ljava/lang/String;", "getIntent", "()Lcom/stripe/android/model/StripeIntent;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentMethodPreference implements StripeModel {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PaymentMethodPreference> CREATOR = new Creator();
    private final String formUI;
    private final StripeIntent intent;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<PaymentMethodPreference> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodPreference createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentMethodPreference((StripeIntent) parcel.readParcelable(PaymentMethodPreference.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodPreference[] newArray(int i) {
            return new PaymentMethodPreference[i];
        }
    }

    public PaymentMethodPreference(StripeIntent intent, String str) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.intent = intent;
        this.formUI = str;
    }

    public static /* synthetic */ PaymentMethodPreference copy$default(PaymentMethodPreference paymentMethodPreference, StripeIntent stripeIntent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            stripeIntent = paymentMethodPreference.intent;
        }
        if ((i & 2) != 0) {
            str = paymentMethodPreference.formUI;
        }
        return paymentMethodPreference.copy(stripeIntent, str);
    }

    public final StripeIntent component1() {
        return this.intent;
    }

    public final String component2() {
        return this.formUI;
    }

    public final PaymentMethodPreference copy(StripeIntent intent, String str) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return new PaymentMethodPreference(intent, str);
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
        if (obj instanceof PaymentMethodPreference) {
            PaymentMethodPreference paymentMethodPreference = (PaymentMethodPreference) obj;
            return Intrinsics.areEqual(this.intent, paymentMethodPreference.intent) && Intrinsics.areEqual(this.formUI, paymentMethodPreference.formUI);
        }
        return false;
    }

    public final String getFormUI() {
        return this.formUI;
    }

    public final StripeIntent getIntent() {
        return this.intent;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = this.intent.hashCode() * 31;
        String str = this.formUI;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StripeIntent stripeIntent = this.intent;
        String str = this.formUI;
        return "PaymentMethodPreference(intent=" + stripeIntent + ", formUI=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.intent, i);
        out.writeString(this.formUI);
    }

    public /* synthetic */ PaymentMethodPreference(StripeIntent stripeIntent, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeIntent, (i & 2) != 0 ? null : str);
    }
}
