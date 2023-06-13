package com.stripe.android.link;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.p049ui.core.forms.ConvertToFormValuesMapKt;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/link/LinkPaymentDetails;", "Landroid/os/Parcelable;", "paymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/model/PaymentMethodCreateParams;)V", "getPaymentDetails", "()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "New", "Saved", "Lcom/stripe/android/link/LinkPaymentDetails$New;", "Lcom/stripe/android/link/LinkPaymentDetails$Saved;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class LinkPaymentDetails implements Parcelable {
    public static final int $stable = PaymentMethodCreateParams.$stable | ConsumerPaymentDetails.PaymentDetails.$stable;
    private final ConsumerPaymentDetails.PaymentDetails paymentDetails;
    private final PaymentMethodCreateParams paymentMethodCreateParams;

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eJ\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/link/LinkPaymentDetails$New;", "Lcom/stripe/android/link/LinkPaymentDetails;", "paymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "originalParams", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodCreateParams;)V", "getOriginalParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentDetails", "()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "getPaymentMethodCreateParams", "buildFormValues", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class New extends LinkPaymentDetails {
        public static final int $stable;
        public static final Parcelable.Creator<New> CREATOR;
        private final PaymentMethodCreateParams originalParams;
        private final ConsumerPaymentDetails.PaymentDetails paymentDetails;
        private final PaymentMethodCreateParams paymentMethodCreateParams;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<New> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final New createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new New((ConsumerPaymentDetails.PaymentDetails) parcel.readParcelable(New.class.getClassLoader()), (PaymentMethodCreateParams) parcel.readParcelable(New.class.getClassLoader()), (PaymentMethodCreateParams) parcel.readParcelable(New.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final New[] newArray(int i) {
                return new New[i];
            }
        }

        static {
            int i = PaymentMethodCreateParams.$stable;
            $stable = i | i | ConsumerPaymentDetails.PaymentDetails.$stable;
            CREATOR = new Creator();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public New(ConsumerPaymentDetails.PaymentDetails paymentDetails, PaymentMethodCreateParams paymentMethodCreateParams, PaymentMethodCreateParams originalParams) {
            super(paymentDetails, paymentMethodCreateParams, null);
            Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(originalParams, "originalParams");
            this.paymentDetails = paymentDetails;
            this.paymentMethodCreateParams = paymentMethodCreateParams;
            this.originalParams = originalParams;
        }

        public final Map<IdentifierSpec, String> buildFormValues() {
            return ConvertToFormValuesMapKt.convertToFormValuesMap(this.originalParams.toParamMap());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final PaymentMethodCreateParams getOriginalParams() {
            return this.originalParams;
        }

        @Override // com.stripe.android.link.LinkPaymentDetails
        public ConsumerPaymentDetails.PaymentDetails getPaymentDetails() {
            return this.paymentDetails;
        }

        @Override // com.stripe.android.link.LinkPaymentDetails
        public PaymentMethodCreateParams getPaymentMethodCreateParams() {
            return this.paymentMethodCreateParams;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeParcelable(this.paymentDetails, i);
            out.writeParcelable(this.paymentMethodCreateParams, i);
            out.writeParcelable(this.originalParams, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/link/LinkPaymentDetails$Saved;", "Lcom/stripe/android/link/LinkPaymentDetails;", "paymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/model/PaymentMethodCreateParams;)V", "getPaymentDetails", "()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Saved extends LinkPaymentDetails {
        public static final Parcelable.Creator<Saved> CREATOR = new Creator();
        private final ConsumerPaymentDetails.PaymentDetails paymentDetails;
        private final PaymentMethodCreateParams paymentMethodCreateParams;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Saved> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Saved createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Saved((ConsumerPaymentDetails.PaymentDetails) parcel.readParcelable(Saved.class.getClassLoader()), (PaymentMethodCreateParams) parcel.readParcelable(Saved.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Saved[] newArray(int i) {
                return new Saved[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Saved(ConsumerPaymentDetails.PaymentDetails paymentDetails, PaymentMethodCreateParams paymentMethodCreateParams) {
            super(paymentDetails, paymentMethodCreateParams, null);
            Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            this.paymentDetails = paymentDetails;
            this.paymentMethodCreateParams = paymentMethodCreateParams;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.link.LinkPaymentDetails
        public ConsumerPaymentDetails.PaymentDetails getPaymentDetails() {
            return this.paymentDetails;
        }

        @Override // com.stripe.android.link.LinkPaymentDetails
        public PaymentMethodCreateParams getPaymentMethodCreateParams() {
            return this.paymentMethodCreateParams;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeParcelable(this.paymentDetails, i);
            out.writeParcelable(this.paymentMethodCreateParams, i);
        }
    }

    public /* synthetic */ LinkPaymentDetails(ConsumerPaymentDetails.PaymentDetails paymentDetails, PaymentMethodCreateParams paymentMethodCreateParams, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentDetails, paymentMethodCreateParams);
    }

    public ConsumerPaymentDetails.PaymentDetails getPaymentDetails() {
        return this.paymentDetails;
    }

    public PaymentMethodCreateParams getPaymentMethodCreateParams() {
        return this.paymentMethodCreateParams;
    }

    private LinkPaymentDetails(ConsumerPaymentDetails.PaymentDetails paymentDetails, PaymentMethodCreateParams paymentMethodCreateParams) {
        this.paymentDetails = paymentDetails;
        this.paymentMethodCreateParams = paymentMethodCreateParams;
    }
}
