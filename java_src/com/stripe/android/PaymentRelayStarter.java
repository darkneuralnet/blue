package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Source;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.view.AuthActivityStarter;
import com.stripe.android.view.AuthActivityStarterHost;
import com.stripe.android.view.PaymentRelayActivity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.RE3;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/PaymentRelayStarter;", "Lcom/stripe/android/view/AuthActivityStarter;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "Args", "Legacy", "Modern", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public interface PaymentRelayStarter extends AuthActivityStarter<Args> {

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0005\t\n\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args;", "Landroid/os/Parcelable;", "()V", "requestCode", "", "getRequestCode", "()I", "toResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Companion", "ErrorArgs", "PaymentIntentArgs", "SetupIntentArgs", "SourceArgs", "Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args$PaymentIntentArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args$SetupIntentArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args$SourceArgs;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$Companion;", "", "()V", "create", "Lcom/stripe/android/PaymentRelayStarter$Args;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", NamedConstantsKt.STRIPE_ACCOUNT_ID, "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ Args create$default(Companion companion, StripeIntent stripeIntent, String str, int i, Object obj) {
                if ((i & 2) != 0) {
                    str = null;
                }
                return companion.create(stripeIntent, str);
            }

            public final Args create(StripeIntent stripeIntent, String str) {
                Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
                if (stripeIntent instanceof PaymentIntent) {
                    return new PaymentIntentArgs((PaymentIntent) stripeIntent, str);
                }
                if (stripeIntent instanceof SetupIntent) {
                    return new SetupIntentArgs((SetupIntent) stripeIntent, str);
                }
                throw new NoWhenBranchMatchedException();
            }

            private Companion() {
            }
        }

        @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\fJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "exception", "Lcom/stripe/android/core/exception/StripeException;", "requestCode", "", "(Lcom/stripe/android/core/exception/StripeException;I)V", "getException$payments_core_release", "()Lcom/stripe/android/core/exception/StripeException;", "getRequestCode", "()I", "component1", "component1$payments_core_release", "component2", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class ErrorArgs extends Args {
            private final StripeException exception;
            private final int requestCode;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            public static final Parcelable.Creator<ErrorArgs> CREATOR = new Creator();

            @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs$Companion;", "LRE3;", "Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs;", "Landroid/os/Parcel;", "parcel", "create", "", "flags", "", "write", "<init>", "()V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
            /* loaded from: classes6.dex */
            public static final class Companion implements RE3<ErrorArgs> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* renamed from: newArray */
                public ErrorArgs[] m116342newArray(int i) {
                    return (ErrorArgs[]) RE3.C7102a.m87008a(this, i);
                }

                private Companion() {
                }

                /* renamed from: create */
                public ErrorArgs m116341create(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    Serializable readSerializable = parcel.readSerializable();
                    Intrinsics.checkNotNull(readSerializable, "null cannot be cast to non-null type com.stripe.android.core.exception.StripeException");
                    return new ErrorArgs((StripeException) readSerializable, parcel.readInt());
                }

                public void write(ErrorArgs errorArgs, Parcel parcel, int i) {
                    Intrinsics.checkNotNullParameter(errorArgs, "<this>");
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.writeSerializable(errorArgs.getException$payments_core_release());
                    parcel.writeInt(errorArgs.getRequestCode());
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<ErrorArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ErrorArgs createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return ErrorArgs.Companion.m116341create(parcel);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ErrorArgs[] newArray(int i) {
                    return new ErrorArgs[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorArgs(StripeException exception, int i) {
                super(null);
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.exception = exception;
                this.requestCode = i;
            }

            public static /* synthetic */ ErrorArgs copy$default(ErrorArgs errorArgs, StripeException stripeException, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    stripeException = errorArgs.exception;
                }
                if ((i2 & 2) != 0) {
                    i = errorArgs.getRequestCode();
                }
                return errorArgs.copy(stripeException, i);
            }

            public final StripeException component1$payments_core_release() {
                return this.exception;
            }

            public final int component2() {
                return getRequestCode();
            }

            public final ErrorArgs copy(StripeException exception, int i) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                return new ErrorArgs(exception, i);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ErrorArgs) {
                    ErrorArgs errorArgs = (ErrorArgs) obj;
                    return Intrinsics.areEqual(this.exception, errorArgs.exception) && getRequestCode() == errorArgs.getRequestCode();
                }
                return false;
            }

            public final StripeException getException$payments_core_release() {
                return this.exception;
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public int getRequestCode() {
                return this.requestCode;
            }

            public int hashCode() {
                return (this.exception.hashCode() * 31) + Integer.hashCode(getRequestCode());
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public PaymentFlowResult.Unvalidated toResult() {
                return new PaymentFlowResult.Unvalidated(null, 0, this.exception, false, null, null, null, 123, null);
            }

            public String toString() {
                StripeException stripeException = this.exception;
                int requestCode = getRequestCode();
                return "ErrorArgs(exception=" + stripeException + ", requestCode=" + requestCode + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                Companion.write(this, out, i);
            }
        }

        @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b\u0012J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0014\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\nHÖ\u0001J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$PaymentIntentArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "paymentIntent", "Lcom/stripe/android/model/PaymentIntent;", NamedConstantsKt.STRIPE_ACCOUNT_ID, "", "(Lcom/stripe/android/model/PaymentIntent;Ljava/lang/String;)V", "getPaymentIntent$payments_core_release", "()Lcom/stripe/android/model/PaymentIntent;", "requestCode", "", "getRequestCode", "()I", "getStripeAccountId$payments_core_release", "()Ljava/lang/String;", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class PaymentIntentArgs extends Args {
            public static final int $stable = 8;
            public static final Parcelable.Creator<PaymentIntentArgs> CREATOR = new Creator();
            private final PaymentIntent paymentIntent;
            private final String stripeAccountId;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<PaymentIntentArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaymentIntentArgs createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PaymentIntentArgs(PaymentIntent.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaymentIntentArgs[] newArray(int i) {
                    return new PaymentIntentArgs[i];
                }
            }

            public /* synthetic */ PaymentIntentArgs(PaymentIntent paymentIntent, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(paymentIntent, (i & 2) != 0 ? null : str);
            }

            public static /* synthetic */ PaymentIntentArgs copy$default(PaymentIntentArgs paymentIntentArgs, PaymentIntent paymentIntent, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentIntent = paymentIntentArgs.paymentIntent;
                }
                if ((i & 2) != 0) {
                    str = paymentIntentArgs.stripeAccountId;
                }
                return paymentIntentArgs.copy(paymentIntent, str);
            }

            public final PaymentIntent component1$payments_core_release() {
                return this.paymentIntent;
            }

            public final String component2$payments_core_release() {
                return this.stripeAccountId;
            }

            public final PaymentIntentArgs copy(PaymentIntent paymentIntent, String str) {
                Intrinsics.checkNotNullParameter(paymentIntent, "paymentIntent");
                return new PaymentIntentArgs(paymentIntent, str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof PaymentIntentArgs) {
                    PaymentIntentArgs paymentIntentArgs = (PaymentIntentArgs) obj;
                    return Intrinsics.areEqual(this.paymentIntent, paymentIntentArgs.paymentIntent) && Intrinsics.areEqual(this.stripeAccountId, paymentIntentArgs.stripeAccountId);
                }
                return false;
            }

            public final PaymentIntent getPaymentIntent$payments_core_release() {
                return this.paymentIntent;
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public int getRequestCode() {
                return StripePaymentController.PAYMENT_REQUEST_CODE;
            }

            public final String getStripeAccountId$payments_core_release() {
                return this.stripeAccountId;
            }

            public int hashCode() {
                int hashCode = this.paymentIntent.hashCode() * 31;
                String str = this.stripeAccountId;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public PaymentFlowResult.Unvalidated toResult() {
                return new PaymentFlowResult.Unvalidated(this.paymentIntent.getClientSecret(), 0, null, false, null, null, this.stripeAccountId, 62, null);
            }

            public String toString() {
                PaymentIntent paymentIntent = this.paymentIntent;
                String str = this.stripeAccountId;
                return "PaymentIntentArgs(paymentIntent=" + paymentIntent + ", stripeAccountId=" + str + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                this.paymentIntent.writeToParcel(out, i);
                out.writeString(this.stripeAccountId);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentIntentArgs(PaymentIntent paymentIntent, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(paymentIntent, "paymentIntent");
                this.paymentIntent = paymentIntent;
                this.stripeAccountId = str;
            }
        }

        @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b\u0012J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0014\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$SetupIntentArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "setupIntent", "Lcom/stripe/android/model/SetupIntent;", NamedConstantsKt.STRIPE_ACCOUNT_ID, "", "(Lcom/stripe/android/model/SetupIntent;Ljava/lang/String;)V", "requestCode", "", "getRequestCode", "()I", "getSetupIntent$payments_core_release", "()Lcom/stripe/android/model/SetupIntent;", "getStripeAccountId$payments_core_release", "()Ljava/lang/String;", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class SetupIntentArgs extends Args {
            public static final int $stable = 8;
            public static final Parcelable.Creator<SetupIntentArgs> CREATOR = new Creator();
            private final SetupIntent setupIntent;
            private final String stripeAccountId;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<SetupIntentArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SetupIntentArgs createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SetupIntentArgs(SetupIntent.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SetupIntentArgs[] newArray(int i) {
                    return new SetupIntentArgs[i];
                }
            }

            public /* synthetic */ SetupIntentArgs(SetupIntent setupIntent, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(setupIntent, (i & 2) != 0 ? null : str);
            }

            public static /* synthetic */ SetupIntentArgs copy$default(SetupIntentArgs setupIntentArgs, SetupIntent setupIntent, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    setupIntent = setupIntentArgs.setupIntent;
                }
                if ((i & 2) != 0) {
                    str = setupIntentArgs.stripeAccountId;
                }
                return setupIntentArgs.copy(setupIntent, str);
            }

            public final SetupIntent component1$payments_core_release() {
                return this.setupIntent;
            }

            public final String component2$payments_core_release() {
                return this.stripeAccountId;
            }

            public final SetupIntentArgs copy(SetupIntent setupIntent, String str) {
                Intrinsics.checkNotNullParameter(setupIntent, "setupIntent");
                return new SetupIntentArgs(setupIntent, str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof SetupIntentArgs) {
                    SetupIntentArgs setupIntentArgs = (SetupIntentArgs) obj;
                    return Intrinsics.areEqual(this.setupIntent, setupIntentArgs.setupIntent) && Intrinsics.areEqual(this.stripeAccountId, setupIntentArgs.stripeAccountId);
                }
                return false;
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public int getRequestCode() {
                return StripePaymentController.SETUP_REQUEST_CODE;
            }

            public final SetupIntent getSetupIntent$payments_core_release() {
                return this.setupIntent;
            }

            public final String getStripeAccountId$payments_core_release() {
                return this.stripeAccountId;
            }

            public int hashCode() {
                int hashCode = this.setupIntent.hashCode() * 31;
                String str = this.stripeAccountId;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public PaymentFlowResult.Unvalidated toResult() {
                return new PaymentFlowResult.Unvalidated(this.setupIntent.getClientSecret(), 0, null, false, null, null, this.stripeAccountId, 62, null);
            }

            public String toString() {
                SetupIntent setupIntent = this.setupIntent;
                String str = this.stripeAccountId;
                return "SetupIntentArgs(setupIntent=" + setupIntent + ", stripeAccountId=" + str + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                this.setupIntent.writeToParcel(out, i);
                out.writeString(this.stripeAccountId);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupIntentArgs(SetupIntent setupIntent, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(setupIntent, "setupIntent");
                this.setupIntent = setupIntent;
                this.stripeAccountId = str;
            }
        }

        @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b\u0012J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0014\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$SourceArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lcom/stripe/android/model/Source;", NamedConstantsKt.STRIPE_ACCOUNT_ID, "", "(Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "requestCode", "", "getRequestCode", "()I", "getSource$payments_core_release", "()Lcom/stripe/android/model/Source;", "getStripeAccountId$payments_core_release", "()Ljava/lang/String;", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class SourceArgs extends Args {
            public static final int $stable = 8;
            public static final Parcelable.Creator<SourceArgs> CREATOR = new Creator();
            private final Source source;
            private final String stripeAccountId;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<SourceArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SourceArgs createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SourceArgs(Source.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SourceArgs[] newArray(int i) {
                    return new SourceArgs[i];
                }
            }

            public /* synthetic */ SourceArgs(Source source, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(source, (i & 2) != 0 ? null : str);
            }

            public static /* synthetic */ SourceArgs copy$default(SourceArgs sourceArgs, Source source, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    source = sourceArgs.source;
                }
                if ((i & 2) != 0) {
                    str = sourceArgs.stripeAccountId;
                }
                return sourceArgs.copy(source, str);
            }

            public final Source component1$payments_core_release() {
                return this.source;
            }

            public final String component2$payments_core_release() {
                return this.stripeAccountId;
            }

            public final SourceArgs copy(Source source, String str) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new SourceArgs(source, str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof SourceArgs) {
                    SourceArgs sourceArgs = (SourceArgs) obj;
                    return Intrinsics.areEqual(this.source, sourceArgs.source) && Intrinsics.areEqual(this.stripeAccountId, sourceArgs.stripeAccountId);
                }
                return false;
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public int getRequestCode() {
                return StripePaymentController.SOURCE_REQUEST_CODE;
            }

            public final Source getSource$payments_core_release() {
                return this.source;
            }

            public final String getStripeAccountId$payments_core_release() {
                return this.stripeAccountId;
            }

            public int hashCode() {
                int hashCode = this.source.hashCode() * 31;
                String str = this.stripeAccountId;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public PaymentFlowResult.Unvalidated toResult() {
                return new PaymentFlowResult.Unvalidated(null, 0, null, false, null, this.source, this.stripeAccountId, 31, null);
            }

            public String toString() {
                Source source = this.source;
                String str = this.stripeAccountId;
                return "SourceArgs(source=" + source + ", stripeAccountId=" + str + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                this.source.writeToParcel(out, i);
                out.writeString(this.stripeAccountId);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SourceArgs(Source source, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(source, "source");
                this.source = source;
                this.stripeAccountId = str;
            }
        }

        public /* synthetic */ Args(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int getRequestCode();

        public abstract PaymentFlowResult.Unvalidated toResult();

        private Args() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/PaymentRelayStarter$Legacy;", "Lcom/stripe/android/PaymentRelayStarter;", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "(Lcom/stripe/android/view/AuthActivityStarterHost;)V", "start", "", "args", "Lcom/stripe/android/PaymentRelayStarter$Args;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Legacy implements PaymentRelayStarter {
        public static final int $stable = 0;
        private final AuthActivityStarterHost host;

        public Legacy(AuthActivityStarterHost host) {
            Intrinsics.checkNotNullParameter(host, "host");
            this.host = host;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public void start(Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.host.startActivityForResult(PaymentRelayActivity.class, args.toResult().toBundle(), args.getRequestCode());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/PaymentRelayStarter$Modern;", "Lcom/stripe/android/PaymentRelayStarter;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "args", "", "start", "LB5;", "launcher", "LB5;", "<init>", "(LB5;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final class Modern implements PaymentRelayStarter {
        public static final int $stable = 8;
        private final AbstractC0407B5<Args> launcher;

        public Modern(AbstractC0407B5<Args> launcher) {
            Intrinsics.checkNotNullParameter(launcher, "launcher");
            this.launcher = launcher;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public void start(Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.launcher.m114705a(args);
        }
    }
}
