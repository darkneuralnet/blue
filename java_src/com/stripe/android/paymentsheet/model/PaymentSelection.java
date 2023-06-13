package com.stripe.android.paymentsheet.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.ACHText;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "Landroid/os/Parcelable;", "()V", "requiresConfirmation", "", "getRequiresConfirmation", "()Z", "mandateText", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "CustomerRequestedSave", "GooglePay", "Link", "New", "Saved", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class PaymentSelection implements Parcelable {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "", "(Ljava/lang/String;I)V", "RequestReuse", "RequestNoReuse", "NoRequest", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum CustomerRequestedSave {
        RequestReuse,
        RequestNoReuse,
        NoRequest
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "()V", "requiresConfirmation", "", "getRequiresConfirmation", "()Z", "describeContents", "", "mandateText", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class GooglePay extends PaymentSelection {
        public static final int $stable = 0;
        public static final GooglePay INSTANCE = new GooglePay();
        public static final Parcelable.Creator<GooglePay> CREATOR = new Creator();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<GooglePay> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePay createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GooglePay.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePay[] newArray(int i) {
                return new GooglePay[i];
            }
        }

        private GooglePay() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public boolean getRequiresConfirmation() {
            return false;
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public String mandateText(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return null;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "()V", "requiresConfirmation", "", "getRequiresConfirmation", "()Z", "describeContents", "", "mandateText", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Link extends PaymentSelection {
        public static final int $stable = 0;
        public static final Link INSTANCE = new Link();
        public static final Parcelable.Creator<Link> CREATOR = new Creator();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Link> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Link createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Link.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Link[] newArray(int i) {
                return new Link[i];
            }
        }

        private Link() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public boolean getRequiresConfirmation() {
            return false;
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public String mandateText(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return null;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0004\u0017\u0018\u0019\u001a¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "()V", "customerRequestedSave", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "getCustomerRequestedSave", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "requiresConfirmation", "", "getRequiresConfirmation", "()Z", "mandateText", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "Card", "GenericPaymentMethod", "LinkInline", "USBankAccount", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class New extends PaymentSelection {
        public static final int $stable = 0;

        @Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u000eHÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", AccountRangeJsonParser.FIELD_BRAND, "Lcom/stripe/android/model/CardBrand;", "customerRequestedSave", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)V", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getCustomerRequestedSave", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "last4", "", "getLast4$annotations", "()V", "getLast4", "()Ljava/lang/String;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Card extends New {
            public static final int $stable = PaymentMethodCreateParams.$stable;
            public static final Parcelable.Creator<Card> CREATOR = new Creator();
            private final CardBrand brand;
            private final CustomerRequestedSave customerRequestedSave;
            private final String last4;
            private final PaymentMethodCreateParams paymentMethodCreateParams;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<Card> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Card createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Card((PaymentMethodCreateParams) parcel.readParcelable(Card.class.getClassLoader()), CardBrand.valueOf(parcel.readString()), CustomerRequestedSave.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Card[] newArray(int i) {
                    return new Card[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Card(PaymentMethodCreateParams paymentMethodCreateParams, CardBrand brand, CustomerRequestedSave customerRequestedSave) {
                super(null);
                Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
                Intrinsics.checkNotNullParameter(brand, "brand");
                Intrinsics.checkNotNullParameter(customerRequestedSave, "customerRequestedSave");
                this.paymentMethodCreateParams = paymentMethodCreateParams;
                this.brand = brand;
                this.customerRequestedSave = customerRequestedSave;
                Object obj = getPaymentMethodCreateParams().toParamMap().get("card");
                Map map = obj instanceof Map ? (Map) obj : null;
                Intrinsics.checkNotNull(map);
                Object obj2 = map.get("number");
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                this.last4 = StringsKt.takeLast((String) obj2, 4);
            }

            public static /* synthetic */ Card copy$default(Card card, PaymentMethodCreateParams paymentMethodCreateParams, CardBrand cardBrand, CustomerRequestedSave customerRequestedSave, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentMethodCreateParams = card.getPaymentMethodCreateParams();
                }
                if ((i & 2) != 0) {
                    cardBrand = card.brand;
                }
                if ((i & 4) != 0) {
                    customerRequestedSave = card.getCustomerRequestedSave();
                }
                return card.copy(paymentMethodCreateParams, cardBrand, customerRequestedSave);
            }

            public static /* synthetic */ void getLast4$annotations() {
            }

            public final PaymentMethodCreateParams component1() {
                return getPaymentMethodCreateParams();
            }

            public final CardBrand component2() {
                return this.brand;
            }

            public final CustomerRequestedSave component3() {
                return getCustomerRequestedSave();
            }

            public final Card copy(PaymentMethodCreateParams paymentMethodCreateParams, CardBrand brand, CustomerRequestedSave customerRequestedSave) {
                Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
                Intrinsics.checkNotNullParameter(brand, "brand");
                Intrinsics.checkNotNullParameter(customerRequestedSave, "customerRequestedSave");
                return new Card(paymentMethodCreateParams, brand, customerRequestedSave);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Card) {
                    Card card = (Card) obj;
                    return Intrinsics.areEqual(getPaymentMethodCreateParams(), card.getPaymentMethodCreateParams()) && this.brand == card.brand && getCustomerRequestedSave() == card.getCustomerRequestedSave();
                }
                return false;
            }

            public final CardBrand getBrand() {
                return this.brand;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public CustomerRequestedSave getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            public final String getLast4() {
                return this.last4;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            public int hashCode() {
                return (((getPaymentMethodCreateParams().hashCode() * 31) + this.brand.hashCode()) * 31) + getCustomerRequestedSave().hashCode();
            }

            public String toString() {
                PaymentMethodCreateParams paymentMethodCreateParams = getPaymentMethodCreateParams();
                CardBrand cardBrand = this.brand;
                CustomerRequestedSave customerRequestedSave = getCustomerRequestedSave();
                return "Card(paymentMethodCreateParams=" + paymentMethodCreateParams + ", brand=" + cardBrand + ", customerRequestedSave=" + customerRequestedSave + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeParcelable(this.paymentMethodCreateParams, i);
                out.writeString(this.brand.name());
                out.writeString(this.customerRequestedSave.name());
            }
        }

        @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "labelResource", "", "iconResource", "", "lightThemeIconUrl", "darkThemeIconUrl", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "customerRequestedSave", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)V", "getCustomerRequestedSave", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "getDarkThemeIconUrl", "()Ljava/lang/String;", "getIconResource", "()I", "getLabelResource", "getLightThemeIconUrl", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class GenericPaymentMethod extends New {
            public static final int $stable = PaymentMethodCreateParams.$stable;
            public static final Parcelable.Creator<GenericPaymentMethod> CREATOR = new Creator();
            private final CustomerRequestedSave customerRequestedSave;
            private final String darkThemeIconUrl;
            private final int iconResource;
            private final String labelResource;
            private final String lightThemeIconUrl;
            private final PaymentMethodCreateParams paymentMethodCreateParams;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<GenericPaymentMethod> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GenericPaymentMethod createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new GenericPaymentMethod(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), (PaymentMethodCreateParams) parcel.readParcelable(GenericPaymentMethod.class.getClassLoader()), CustomerRequestedSave.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GenericPaymentMethod[] newArray(int i) {
                    return new GenericPaymentMethod[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GenericPaymentMethod(String labelResource, int i, String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams, CustomerRequestedSave customerRequestedSave) {
                super(null);
                Intrinsics.checkNotNullParameter(labelResource, "labelResource");
                Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
                Intrinsics.checkNotNullParameter(customerRequestedSave, "customerRequestedSave");
                this.labelResource = labelResource;
                this.iconResource = i;
                this.lightThemeIconUrl = str;
                this.darkThemeIconUrl = str2;
                this.paymentMethodCreateParams = paymentMethodCreateParams;
                this.customerRequestedSave = customerRequestedSave;
            }

            public static /* synthetic */ GenericPaymentMethod copy$default(GenericPaymentMethod genericPaymentMethod, String str, int i, String str2, String str3, PaymentMethodCreateParams paymentMethodCreateParams, CustomerRequestedSave customerRequestedSave, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = genericPaymentMethod.labelResource;
                }
                if ((i2 & 2) != 0) {
                    i = genericPaymentMethod.iconResource;
                }
                int i3 = i;
                if ((i2 & 4) != 0) {
                    str2 = genericPaymentMethod.lightThemeIconUrl;
                }
                String str4 = str2;
                if ((i2 & 8) != 0) {
                    str3 = genericPaymentMethod.darkThemeIconUrl;
                }
                String str5 = str3;
                if ((i2 & 16) != 0) {
                    paymentMethodCreateParams = genericPaymentMethod.getPaymentMethodCreateParams();
                }
                PaymentMethodCreateParams paymentMethodCreateParams2 = paymentMethodCreateParams;
                if ((i2 & 32) != 0) {
                    customerRequestedSave = genericPaymentMethod.getCustomerRequestedSave();
                }
                return genericPaymentMethod.copy(str, i3, str4, str5, paymentMethodCreateParams2, customerRequestedSave);
            }

            public final String component1() {
                return this.labelResource;
            }

            public final int component2() {
                return this.iconResource;
            }

            public final String component3() {
                return this.lightThemeIconUrl;
            }

            public final String component4() {
                return this.darkThemeIconUrl;
            }

            public final PaymentMethodCreateParams component5() {
                return getPaymentMethodCreateParams();
            }

            public final CustomerRequestedSave component6() {
                return getCustomerRequestedSave();
            }

            public final GenericPaymentMethod copy(String labelResource, int i, String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams, CustomerRequestedSave customerRequestedSave) {
                Intrinsics.checkNotNullParameter(labelResource, "labelResource");
                Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
                Intrinsics.checkNotNullParameter(customerRequestedSave, "customerRequestedSave");
                return new GenericPaymentMethod(labelResource, i, str, str2, paymentMethodCreateParams, customerRequestedSave);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof GenericPaymentMethod) {
                    GenericPaymentMethod genericPaymentMethod = (GenericPaymentMethod) obj;
                    return Intrinsics.areEqual(this.labelResource, genericPaymentMethod.labelResource) && this.iconResource == genericPaymentMethod.iconResource && Intrinsics.areEqual(this.lightThemeIconUrl, genericPaymentMethod.lightThemeIconUrl) && Intrinsics.areEqual(this.darkThemeIconUrl, genericPaymentMethod.darkThemeIconUrl) && Intrinsics.areEqual(getPaymentMethodCreateParams(), genericPaymentMethod.getPaymentMethodCreateParams()) && getCustomerRequestedSave() == genericPaymentMethod.getCustomerRequestedSave();
                }
                return false;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public CustomerRequestedSave getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            public final String getDarkThemeIconUrl() {
                return this.darkThemeIconUrl;
            }

            public final int getIconResource() {
                return this.iconResource;
            }

            public final String getLabelResource() {
                return this.labelResource;
            }

            public final String getLightThemeIconUrl() {
                return this.lightThemeIconUrl;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            public int hashCode() {
                int hashCode = ((this.labelResource.hashCode() * 31) + Integer.hashCode(this.iconResource)) * 31;
                String str = this.lightThemeIconUrl;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.darkThemeIconUrl;
                return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + getPaymentMethodCreateParams().hashCode()) * 31) + getCustomerRequestedSave().hashCode();
            }

            public String toString() {
                String str = this.labelResource;
                int i = this.iconResource;
                String str2 = this.lightThemeIconUrl;
                String str3 = this.darkThemeIconUrl;
                PaymentMethodCreateParams paymentMethodCreateParams = getPaymentMethodCreateParams();
                CustomerRequestedSave customerRequestedSave = getCustomerRequestedSave();
                return "GenericPaymentMethod(labelResource=" + str + ", iconResource=" + i + ", lightThemeIconUrl=" + str2 + ", darkThemeIconUrl=" + str3 + ", paymentMethodCreateParams=" + paymentMethodCreateParams + ", customerRequestedSave=" + customerRequestedSave + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.labelResource);
                out.writeInt(this.iconResource);
                out.writeString(this.lightThemeIconUrl);
                out.writeString(this.darkThemeIconUrl);
                out.writeParcelable(this.paymentMethodCreateParams, i);
                out.writeString(this.customerRequestedSave.name());
            }
        }

        @Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010!\u001a\u00020\fHÖ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\fHÖ\u0001J\t\u0010'\u001a\u00020\u0011HÖ\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\fHÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u0011¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\u00020\u001bX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\b\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "linkPaymentDetails", "Lcom/stripe/android/link/LinkPaymentDetails$New;", "(Lcom/stripe/android/link/LinkPaymentDetails$New;)V", "customerRequestedSave", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "getCustomerRequestedSave$annotations", "()V", "getCustomerRequestedSave", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "iconResource", "", "getIconResource$annotations", "getIconResource", "()I", "label", "", "getLabel$annotations", "getLabel", "()Ljava/lang/String;", "getLinkPaymentDetails", "()Lcom/stripe/android/link/LinkPaymentDetails$New;", "paymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "getPaymentDetails$annotations", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams$annotations", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "component1", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class LinkInline extends New {
            public static final int $stable = (PaymentMethodCreateParams.$stable | ConsumerPaymentDetails.PaymentDetails.$stable) | LinkPaymentDetails.New.$stable;
            public static final Parcelable.Creator<LinkInline> CREATOR = new Creator();
            private final CustomerRequestedSave customerRequestedSave;
            private final int iconResource;
            private final String label;
            private final LinkPaymentDetails.New linkPaymentDetails;
            private final ConsumerPaymentDetails.PaymentDetails paymentDetails;
            private final PaymentMethodCreateParams paymentMethodCreateParams;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<LinkInline> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LinkInline createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new LinkInline((LinkPaymentDetails.New) parcel.readParcelable(LinkInline.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LinkInline[] newArray(int i) {
                    return new LinkInline[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LinkInline(LinkPaymentDetails.New linkPaymentDetails) {
                super(null);
                String str;
                Intrinsics.checkNotNullParameter(linkPaymentDetails, "linkPaymentDetails");
                this.linkPaymentDetails = linkPaymentDetails;
                this.customerRequestedSave = CustomerRequestedSave.NoRequest;
                ConsumerPaymentDetails.PaymentDetails paymentDetails = linkPaymentDetails.getPaymentDetails();
                this.paymentDetails = paymentDetails;
                this.paymentMethodCreateParams = linkPaymentDetails.getPaymentMethodCreateParams();
                this.iconResource = C19159R.C19160drawable.stripe_ic_paymentsheet_link;
                if (paymentDetails instanceof ConsumerPaymentDetails.Card) {
                    str = "····" + ((ConsumerPaymentDetails.Card) paymentDetails).getLast4();
                } else if (paymentDetails instanceof ConsumerPaymentDetails.BankAccount) {
                    str = "····" + ((ConsumerPaymentDetails.BankAccount) paymentDetails).getLast4();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                this.label = str;
            }

            public static /* synthetic */ LinkInline copy$default(LinkInline linkInline, LinkPaymentDetails.New r1, int i, Object obj) {
                if ((i & 1) != 0) {
                    r1 = linkInline.linkPaymentDetails;
                }
                return linkInline.copy(r1);
            }

            public static /* synthetic */ void getCustomerRequestedSave$annotations() {
            }

            public static /* synthetic */ void getIconResource$annotations() {
            }

            public static /* synthetic */ void getLabel$annotations() {
            }

            private static /* synthetic */ void getPaymentDetails$annotations() {
            }

            public static /* synthetic */ void getPaymentMethodCreateParams$annotations() {
            }

            public final LinkPaymentDetails.New component1() {
                return this.linkPaymentDetails;
            }

            public final LinkInline copy(LinkPaymentDetails.New linkPaymentDetails) {
                Intrinsics.checkNotNullParameter(linkPaymentDetails, "linkPaymentDetails");
                return new LinkInline(linkPaymentDetails);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LinkInline) && Intrinsics.areEqual(this.linkPaymentDetails, ((LinkInline) obj).linkPaymentDetails);
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public CustomerRequestedSave getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            public final int getIconResource() {
                return this.iconResource;
            }

            public final String getLabel() {
                return this.label;
            }

            public final LinkPaymentDetails.New getLinkPaymentDetails() {
                return this.linkPaymentDetails;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            public int hashCode() {
                return this.linkPaymentDetails.hashCode();
            }

            public String toString() {
                LinkPaymentDetails.New r0 = this.linkPaymentDetails;
                return "LinkInline(linkPaymentDetails=" + r0 + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeParcelable(this.linkPaymentDetails, i);
            }
        }

        @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00060"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "labelResource", "", "iconResource", "", "bankName", "last4", "financialConnectionsSessionId", "intentId", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "customerRequestedSave", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)V", "getBankName", "()Ljava/lang/String;", "getCustomerRequestedSave", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "getFinancialConnectionsSessionId", "getIconResource", "()I", "getIntentId", "getLabelResource", "getLast4", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class USBankAccount extends New {
            public static final int $stable = PaymentMethodCreateParams.$stable;
            public static final Parcelable.Creator<USBankAccount> CREATOR = new Creator();
            private final String bankName;
            private final CustomerRequestedSave customerRequestedSave;
            private final String financialConnectionsSessionId;
            private final int iconResource;
            private final String intentId;
            private final String labelResource;
            private final String last4;
            private final PaymentMethodCreateParams paymentMethodCreateParams;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<USBankAccount> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankAccount createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new USBankAccount(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (PaymentMethodCreateParams) parcel.readParcelable(USBankAccount.class.getClassLoader()), CustomerRequestedSave.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankAccount[] newArray(int i) {
                    return new USBankAccount[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public USBankAccount(String labelResource, int i, String bankName, String last4, String financialConnectionsSessionId, String intentId, PaymentMethodCreateParams paymentMethodCreateParams, CustomerRequestedSave customerRequestedSave) {
                super(null);
                Intrinsics.checkNotNullParameter(labelResource, "labelResource");
                Intrinsics.checkNotNullParameter(bankName, "bankName");
                Intrinsics.checkNotNullParameter(last4, "last4");
                Intrinsics.checkNotNullParameter(financialConnectionsSessionId, "financialConnectionsSessionId");
                Intrinsics.checkNotNullParameter(intentId, "intentId");
                Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
                Intrinsics.checkNotNullParameter(customerRequestedSave, "customerRequestedSave");
                this.labelResource = labelResource;
                this.iconResource = i;
                this.bankName = bankName;
                this.last4 = last4;
                this.financialConnectionsSessionId = financialConnectionsSessionId;
                this.intentId = intentId;
                this.paymentMethodCreateParams = paymentMethodCreateParams;
                this.customerRequestedSave = customerRequestedSave;
            }

            public final String component1() {
                return this.labelResource;
            }

            public final int component2() {
                return this.iconResource;
            }

            public final String component3() {
                return this.bankName;
            }

            public final String component4() {
                return this.last4;
            }

            public final String component5() {
                return this.financialConnectionsSessionId;
            }

            public final String component6() {
                return this.intentId;
            }

            public final PaymentMethodCreateParams component7() {
                return getPaymentMethodCreateParams();
            }

            public final CustomerRequestedSave component8() {
                return getCustomerRequestedSave();
            }

            public final USBankAccount copy(String labelResource, int i, String bankName, String last4, String financialConnectionsSessionId, String intentId, PaymentMethodCreateParams paymentMethodCreateParams, CustomerRequestedSave customerRequestedSave) {
                Intrinsics.checkNotNullParameter(labelResource, "labelResource");
                Intrinsics.checkNotNullParameter(bankName, "bankName");
                Intrinsics.checkNotNullParameter(last4, "last4");
                Intrinsics.checkNotNullParameter(financialConnectionsSessionId, "financialConnectionsSessionId");
                Intrinsics.checkNotNullParameter(intentId, "intentId");
                Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
                Intrinsics.checkNotNullParameter(customerRequestedSave, "customerRequestedSave");
                return new USBankAccount(labelResource, i, bankName, last4, financialConnectionsSessionId, intentId, paymentMethodCreateParams, customerRequestedSave);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof USBankAccount) {
                    USBankAccount uSBankAccount = (USBankAccount) obj;
                    return Intrinsics.areEqual(this.labelResource, uSBankAccount.labelResource) && this.iconResource == uSBankAccount.iconResource && Intrinsics.areEqual(this.bankName, uSBankAccount.bankName) && Intrinsics.areEqual(this.last4, uSBankAccount.last4) && Intrinsics.areEqual(this.financialConnectionsSessionId, uSBankAccount.financialConnectionsSessionId) && Intrinsics.areEqual(this.intentId, uSBankAccount.intentId) && Intrinsics.areEqual(getPaymentMethodCreateParams(), uSBankAccount.getPaymentMethodCreateParams()) && getCustomerRequestedSave() == uSBankAccount.getCustomerRequestedSave();
                }
                return false;
            }

            public final String getBankName() {
                return this.bankName;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public CustomerRequestedSave getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            public final String getFinancialConnectionsSessionId() {
                return this.financialConnectionsSessionId;
            }

            public final int getIconResource() {
                return this.iconResource;
            }

            public final String getIntentId() {
                return this.intentId;
            }

            public final String getLabelResource() {
                return this.labelResource;
            }

            public final String getLast4() {
                return this.last4;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            public int hashCode() {
                return (((((((((((((this.labelResource.hashCode() * 31) + Integer.hashCode(this.iconResource)) * 31) + this.bankName.hashCode()) * 31) + this.last4.hashCode()) * 31) + this.financialConnectionsSessionId.hashCode()) * 31) + this.intentId.hashCode()) * 31) + getPaymentMethodCreateParams().hashCode()) * 31) + getCustomerRequestedSave().hashCode();
            }

            public String toString() {
                String str = this.labelResource;
                int i = this.iconResource;
                String str2 = this.bankName;
                String str3 = this.last4;
                String str4 = this.financialConnectionsSessionId;
                String str5 = this.intentId;
                PaymentMethodCreateParams paymentMethodCreateParams = getPaymentMethodCreateParams();
                CustomerRequestedSave customerRequestedSave = getCustomerRequestedSave();
                return "USBankAccount(labelResource=" + str + ", iconResource=" + i + ", bankName=" + str2 + ", last4=" + str3 + ", financialConnectionsSessionId=" + str4 + ", intentId=" + str5 + ", paymentMethodCreateParams=" + paymentMethodCreateParams + ", customerRequestedSave=" + customerRequestedSave + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.labelResource);
                out.writeInt(this.iconResource);
                out.writeString(this.bankName);
                out.writeString(this.last4);
                out.writeString(this.financialConnectionsSessionId);
                out.writeString(this.intentId);
                out.writeParcelable(this.paymentMethodCreateParams, i);
                out.writeString(this.customerRequestedSave.name());
            }
        }

        public /* synthetic */ New(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract CustomerRequestedSave getCustomerRequestedSave();

        public abstract PaymentMethodCreateParams getPaymentMethodCreateParams();

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public boolean getRequiresConfirmation() {
            return false;
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public String mandateText(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return null;
        }

        private New() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u000e\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u000fJ\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u0018HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "isGooglePay", "", "(Lcom/stripe/android/model/PaymentMethod;Z)V", "isGooglePay$paymentsheet_release", "()Z", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "requiresConfirmation", "getRequiresConfirmation", "component1", "component2", "component2$paymentsheet_release", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "mandateText", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Saved extends PaymentSelection {
        public static final int $stable = PaymentMethod.$stable;
        public static final Parcelable.Creator<Saved> CREATOR = new Creator();
        private final boolean isGooglePay;
        private final PaymentMethod paymentMethod;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Saved> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Saved createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Saved((PaymentMethod) parcel.readParcelable(Saved.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Saved[] newArray(int i) {
                return new Saved[i];
            }
        }

        public /* synthetic */ Saved(PaymentMethod paymentMethod, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(paymentMethod, (i & 2) != 0 ? false : z);
        }

        public static /* synthetic */ Saved copy$default(Saved saved, PaymentMethod paymentMethod, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentMethod = saved.paymentMethod;
            }
            if ((i & 2) != 0) {
                z = saved.isGooglePay;
            }
            return saved.copy(paymentMethod, z);
        }

        public final PaymentMethod component1() {
            return this.paymentMethod;
        }

        public final boolean component2$paymentsheet_release() {
            return this.isGooglePay;
        }

        public final Saved copy(PaymentMethod paymentMethod, boolean z) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new Saved(paymentMethod, z);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Saved) {
                Saved saved = (Saved) obj;
                return Intrinsics.areEqual(this.paymentMethod, saved.paymentMethod) && this.isGooglePay == saved.isGooglePay;
            }
            return false;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public boolean getRequiresConfirmation() {
            return this.paymentMethod.type == PaymentMethod.Type.USBankAccount;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.paymentMethod.hashCode() * 31;
            boolean z = this.isGooglePay;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public final boolean isGooglePay$paymentsheet_release() {
            return this.isGooglePay;
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public String mandateText(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.paymentMethod.type == PaymentMethod.Type.USBankAccount) {
                return ACHText.INSTANCE.getContinueMandateText(context);
            }
            return null;
        }

        public String toString() {
            PaymentMethod paymentMethod = this.paymentMethod;
            boolean z = this.isGooglePay;
            return "Saved(paymentMethod=" + paymentMethod + ", isGooglePay=" + z + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeParcelable(this.paymentMethod, i);
            out.writeInt(this.isGooglePay ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Saved(PaymentMethod paymentMethod, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
            this.isGooglePay = z;
        }
    }

    public /* synthetic */ PaymentSelection(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean getRequiresConfirmation();

    public abstract String mandateText(Context context);

    private PaymentSelection() {
    }
}
