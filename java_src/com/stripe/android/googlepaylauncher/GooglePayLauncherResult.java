package com.stripe.android.googlepaylauncher;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.google.android.gms.common.api.Status;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.view.ActivityStarter;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.RE3;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00062\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "Lcom/stripe/android/view/ActivityStarter$Result;", "()V", "toBundle", "Landroid/os/Bundle;", "Canceled", "Companion", "Error", "PaymentData", "Unavailable", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Canceled;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Unavailable;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class GooglePayLauncherResult implements ActivityStarter.Result {
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Canceled;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Canceled extends GooglePayLauncherResult {
        public static final Canceled INSTANCE = new Canceled();
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Canceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Canceled.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i) {
                return new Canceled[i];
            }
        }

        private Canceled() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Companion;", "", "()V", "fromIntent", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "intent", "Landroid/content/Intent;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final GooglePayLauncherResult fromIntent(Intent intent) {
            GooglePayLauncherResult googlePayLauncherResult;
            if (intent != null) {
                googlePayLauncherResult = (GooglePayLauncherResult) intent.getParcelableExtra("extra_activity_result");
            } else {
                googlePayLauncherResult = null;
            }
            if (googlePayLauncherResult == null) {
                return new Error(new IllegalStateException("Error while processing result from Google Pay."), null, null, null, 14, null);
            }
            return googlePayLauncherResult;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0001&B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006'"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "exception", "", "googlePayStatus", "Lcom/google/android/gms/common/api/Status;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "(Ljava/lang/Throwable;Lcom/google/android/gms/common/api/Status;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ShippingInformation;)V", "getException", "()Ljava/lang/Throwable;", "getGooglePayStatus", "()Lcom/google/android/gms/common/api/Status;", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Error extends GooglePayLauncherResult {
        private final Throwable exception;
        private final Status googlePayStatus;
        private final PaymentMethod paymentMethod;
        private final ShippingInformation shippingInformation;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Error> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error$Companion;", "LRE3;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;", "Landroid/os/Parcel;", "parcel", "create", "", "flags", "", "write", "<init>", "()V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class Companion implements RE3<Error> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: newArray */
            public Error[] m116480newArray(int i) {
                return (Error[]) RE3.C7102a.m87008a(this, i);
            }

            private Companion() {
            }

            /* renamed from: create */
            public Error m116479create(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Serializable readSerializable = parcel.readSerializable();
                Intrinsics.checkNotNull(readSerializable, "null cannot be cast to non-null type kotlin.Throwable");
                return new Error((Throwable) readSerializable, (Status) parcel.readParcelable(Status.class.getClassLoader()), null, null, 12, null);
            }

            public void write(Error error, Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(error, "<this>");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.writeSerializable(error.getException());
                parcel.writeParcelable(error.getGooglePayStatus(), i);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Error.Companion.m116479create(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        public /* synthetic */ Error(Throwable th, Status status, PaymentMethod paymentMethod, ShippingInformation shippingInformation, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, (i & 2) != 0 ? null : status, (i & 4) != 0 ? null : paymentMethod, (i & 8) != 0 ? null : shippingInformation);
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th, Status status, PaymentMethod paymentMethod, ShippingInformation shippingInformation, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.exception;
            }
            if ((i & 2) != 0) {
                status = error.googlePayStatus;
            }
            if ((i & 4) != 0) {
                paymentMethod = error.paymentMethod;
            }
            if ((i & 8) != 0) {
                shippingInformation = error.shippingInformation;
            }
            return error.copy(th, status, paymentMethod, shippingInformation);
        }

        public final Throwable component1() {
            return this.exception;
        }

        public final Status component2() {
            return this.googlePayStatus;
        }

        public final PaymentMethod component3() {
            return this.paymentMethod;
        }

        public final ShippingInformation component4() {
            return this.shippingInformation;
        }

        public final Error copy(Throwable exception, Status status, PaymentMethod paymentMethod, ShippingInformation shippingInformation) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return new Error(exception, status, paymentMethod, shippingInformation);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Error) {
                Error error = (Error) obj;
                return Intrinsics.areEqual(this.exception, error.exception) && Intrinsics.areEqual(this.googlePayStatus, error.googlePayStatus) && Intrinsics.areEqual(this.paymentMethod, error.paymentMethod) && Intrinsics.areEqual(this.shippingInformation, error.shippingInformation);
            }
            return false;
        }

        public final Throwable getException() {
            return this.exception;
        }

        public final Status getGooglePayStatus() {
            return this.googlePayStatus;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final ShippingInformation getShippingInformation() {
            return this.shippingInformation;
        }

        public int hashCode() {
            int hashCode = this.exception.hashCode() * 31;
            Status status = this.googlePayStatus;
            int hashCode2 = (hashCode + (status == null ? 0 : status.hashCode())) * 31;
            PaymentMethod paymentMethod = this.paymentMethod;
            int hashCode3 = (hashCode2 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
            ShippingInformation shippingInformation = this.shippingInformation;
            return hashCode3 + (shippingInformation != null ? shippingInformation.hashCode() : 0);
        }

        public String toString() {
            Throwable th = this.exception;
            Status status = this.googlePayStatus;
            PaymentMethod paymentMethod = this.paymentMethod;
            ShippingInformation shippingInformation = this.shippingInformation;
            return "Error(exception=" + th + ", googlePayStatus=" + status + ", paymentMethod=" + paymentMethod + ", shippingInformation=" + shippingInformation + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            Companion.write(this, out, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable exception, Status status, PaymentMethod paymentMethod, ShippingInformation shippingInformation) {
            super(null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
            this.googlePayStatus = status;
            this.paymentMethod = paymentMethod;
            this.shippingInformation = shippingInformation;
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ShippingInformation;)V", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class PaymentData extends GooglePayLauncherResult {
        public static final Parcelable.Creator<PaymentData> CREATOR = new Creator();
        private final PaymentMethod paymentMethod;
        private final ShippingInformation shippingInformation;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<PaymentData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentData(PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ShippingInformation.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentData[] newArray(int i) {
                return new PaymentData[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentData(PaymentMethod paymentMethod, ShippingInformation shippingInformation) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
            this.shippingInformation = shippingInformation;
        }

        public static /* synthetic */ PaymentData copy$default(PaymentData paymentData, PaymentMethod paymentMethod, ShippingInformation shippingInformation, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentMethod = paymentData.paymentMethod;
            }
            if ((i & 2) != 0) {
                shippingInformation = paymentData.shippingInformation;
            }
            return paymentData.copy(paymentMethod, shippingInformation);
        }

        public final PaymentMethod component1() {
            return this.paymentMethod;
        }

        public final ShippingInformation component2() {
            return this.shippingInformation;
        }

        public final PaymentData copy(PaymentMethod paymentMethod, ShippingInformation shippingInformation) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new PaymentData(paymentMethod, shippingInformation);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PaymentData) {
                PaymentData paymentData = (PaymentData) obj;
                return Intrinsics.areEqual(this.paymentMethod, paymentData.paymentMethod) && Intrinsics.areEqual(this.shippingInformation, paymentData.shippingInformation);
            }
            return false;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final ShippingInformation getShippingInformation() {
            return this.shippingInformation;
        }

        public int hashCode() {
            int hashCode = this.paymentMethod.hashCode() * 31;
            ShippingInformation shippingInformation = this.shippingInformation;
            return hashCode + (shippingInformation == null ? 0 : shippingInformation.hashCode());
        }

        public String toString() {
            PaymentMethod paymentMethod = this.paymentMethod;
            ShippingInformation shippingInformation = this.shippingInformation;
            return "PaymentData(paymentMethod=" + paymentMethod + ", shippingInformation=" + shippingInformation + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.paymentMethod.writeToParcel(out, i);
            ShippingInformation shippingInformation = this.shippingInformation;
            if (shippingInformation == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            shippingInformation.writeToParcel(out, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Unavailable;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Unavailable extends GooglePayLauncherResult {
        public static final Unavailable INSTANCE = new Unavailable();
        public static final Parcelable.Creator<Unavailable> CREATOR = new Creator();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Unavailable> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unavailable createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unavailable.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unavailable[] newArray(int i) {
                return new Unavailable[i];
            }
        }

        private Unavailable() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    public /* synthetic */ GooglePayLauncherResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final GooglePayLauncherResult fromIntent(Intent intent) {
        return Companion.fromIntent(intent);
    }

    @Override // com.stripe.android.view.ActivityStarter.Result
    public Bundle toBundle() {
        return C39564d70.m44603a(TuplesKt.m28425to("extra_activity_result", this));
    }

    private GooglePayLauncherResult() {
    }
}
