package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodMessage;", "Lcom/stripe/android/core/model/StripeModel;", "displayHtml", "", "learnMoreUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getDisplayHtml", "()Ljava/lang/String;", "getLearnMoreUrl", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentMethodMessage implements StripeModel {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PaymentMethodMessage> CREATOR = new Creator();
    private final String displayHtml;
    private final String learnMoreUrl;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<PaymentMethodMessage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentMethodMessage(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodMessage[] newArray(int i) {
            return new PaymentMethodMessage[i];
        }
    }

    public PaymentMethodMessage(String displayHtml, String learnMoreUrl) {
        Intrinsics.checkNotNullParameter(displayHtml, "displayHtml");
        Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
        this.displayHtml = displayHtml;
        this.learnMoreUrl = learnMoreUrl;
    }

    public static /* synthetic */ PaymentMethodMessage copy$default(PaymentMethodMessage paymentMethodMessage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentMethodMessage.displayHtml;
        }
        if ((i & 2) != 0) {
            str2 = paymentMethodMessage.learnMoreUrl;
        }
        return paymentMethodMessage.copy(str, str2);
    }

    public final String component1() {
        return this.displayHtml;
    }

    public final String component2() {
        return this.learnMoreUrl;
    }

    public final PaymentMethodMessage copy(String displayHtml, String learnMoreUrl) {
        Intrinsics.checkNotNullParameter(displayHtml, "displayHtml");
        Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
        return new PaymentMethodMessage(displayHtml, learnMoreUrl);
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
        if (obj instanceof PaymentMethodMessage) {
            PaymentMethodMessage paymentMethodMessage = (PaymentMethodMessage) obj;
            return Intrinsics.areEqual(this.displayHtml, paymentMethodMessage.displayHtml) && Intrinsics.areEqual(this.learnMoreUrl, paymentMethodMessage.learnMoreUrl);
        }
        return false;
    }

    public final String getDisplayHtml() {
        return this.displayHtml;
    }

    public final String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (this.displayHtml.hashCode() * 31) + this.learnMoreUrl.hashCode();
    }

    public String toString() {
        String str = this.displayHtml;
        String str2 = this.learnMoreUrl;
        return "PaymentMethodMessage(displayHtml=" + str + ", learnMoreUrl=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.displayHtml);
        out.writeString(this.learnMoreUrl);
    }
}
