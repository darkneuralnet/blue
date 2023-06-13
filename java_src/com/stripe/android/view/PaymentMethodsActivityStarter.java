package com.stripe.android.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.ActivityStarter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\n\u000b\fB\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter;", "Lcom/stripe/android/view/ActivityStarter;", "Lcom/stripe/android/view/PaymentMethodsActivity;", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "Args", "Companion", com.paypal.android.sdk.onetouch.core.Result.f74995h, "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentMethodsActivityStarter extends ActivityStarter<PaymentMethodsActivity, Args> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int REQUEST_CODE = 6000;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter$Companion;", "", "()V", "REQUEST_CODE", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001d\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\rHÖ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rHÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result;", "Lcom/stripe/android/view/ActivityStarter$Result;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "useGooglePay", "", "(Lcom/stripe/android/model/PaymentMethod;Z)V", "getUseGooglePay", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toBundle", "Landroid/os/Bundle;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Result implements ActivityStarter.Result {
        @JvmField
        public final PaymentMethod paymentMethod;
        private final boolean useGooglePay;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Result> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result$Companion;", "", "()V", "fromIntent", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result;", "intent", "Landroid/content/Intent;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final Result fromIntent(Intent intent) {
                if (intent != null) {
                    return (Result) intent.getParcelableExtra("extra_activity_result");
                }
                return null;
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Result(parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public Result() {
            this(null, false, 3, null);
        }

        public static /* synthetic */ Result copy$default(Result result, PaymentMethod paymentMethod, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentMethod = result.paymentMethod;
            }
            if ((i & 2) != 0) {
                z = result.useGooglePay;
            }
            return result.copy(paymentMethod, z);
        }

        @JvmStatic
        public static final Result fromIntent(Intent intent) {
            return Companion.fromIntent(intent);
        }

        public final PaymentMethod component1() {
            return this.paymentMethod;
        }

        public final boolean component2() {
            return this.useGooglePay;
        }

        public final Result copy(PaymentMethod paymentMethod, boolean z) {
            return new Result(paymentMethod, z);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Result) {
                Result result = (Result) obj;
                return Intrinsics.areEqual(this.paymentMethod, result.paymentMethod) && this.useGooglePay == result.useGooglePay;
            }
            return false;
        }

        public final boolean getUseGooglePay() {
            return this.useGooglePay;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            PaymentMethod paymentMethod = this.paymentMethod;
            int hashCode = (paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31;
            boolean z = this.useGooglePay;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        @Override // com.stripe.android.view.ActivityStarter.Result
        public Bundle toBundle() {
            return C39564d70.m44603a(TuplesKt.m28425to("extra_activity_result", this));
        }

        public String toString() {
            PaymentMethod paymentMethod = this.paymentMethod;
            boolean z = this.useGooglePay;
            return "Result(paymentMethod=" + paymentMethod + ", useGooglePay=" + z + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            PaymentMethod paymentMethod = this.paymentMethod;
            if (paymentMethod == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                paymentMethod.writeToParcel(out, i);
            }
            out.writeInt(this.useGooglePay ? 1 : 0);
        }

        public Result(PaymentMethod paymentMethod, boolean z) {
            this.paymentMethod = paymentMethod;
            this.useGooglePay = z;
        }

        public /* synthetic */ Result(PaymentMethod paymentMethod, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : paymentMethod, (i & 2) != 0 ? false : z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivityStarter(Activity activity) {
        super(activity, PaymentMethodsActivity.class, (int) REQUEST_CODE, (Integer) null, 8, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivityStarter(Fragment fragment) {
        super(fragment, PaymentMethodsActivity.class, (int) REQUEST_CODE, (Integer) null, 8, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    @Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002IJBw\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b¢\u0006\u0002\u0010\u0014J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b)J\u000e\u0010*\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b+J\u000e\u0010,\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b-J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u000e\u00100\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b1J\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÀ\u0003¢\u0006\u0002\b3J\u0010\u00104\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0002\b5J\u0012\u00106\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0004\b7\u0010&J\u000e\u00108\u001a\u00020\u0010HÀ\u0003¢\u0006\u0002\b9J\u000e\u0010:\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b;J\u0088\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010=J\t\u0010>\u001a\u00020\u0005HÖ\u0001J\u0013\u0010?\u001a\u00020\b2\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020\u0005HÖ\u0001J\t\u0010C\u001a\u00020\u0003HÖ\u0001J\u0019\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0013\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0014\u0010\u0011\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0014\u0010\u0012\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&¨\u0006K"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "initialPaymentMethodId", "", "paymentMethodsFooterLayoutId", "", "addPaymentMethodFooterLayoutId", "isPaymentSessionActive", "", "paymentMethodTypes", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "paymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "windowFlags", "billingAddressFields", "Lcom/stripe/android/view/BillingAddressFields;", "shouldShowGooglePay", "useGooglePay", "canDeletePaymentMethods", "(Ljava/lang/String;IIZLjava/util/List;Lcom/stripe/android/PaymentConfiguration;Ljava/lang/Integer;Lcom/stripe/android/view/BillingAddressFields;ZZZ)V", "getAddPaymentMethodFooterLayoutId", "()I", "getBillingAddressFields$payments_core_release", "()Lcom/stripe/android/view/BillingAddressFields;", "getCanDeletePaymentMethods$payments_core_release", "()Z", "getInitialPaymentMethodId$payments_core_release", "()Ljava/lang/String;", "isPaymentSessionActive$payments_core_release", "getPaymentConfiguration$payments_core_release", "()Lcom/stripe/android/PaymentConfiguration;", "getPaymentMethodTypes$payments_core_release", "()Ljava/util/List;", "getPaymentMethodsFooterLayoutId", "getShouldShowGooglePay$payments_core_release", "getUseGooglePay$payments_core_release", "getWindowFlags$payments_core_release", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component1$payments_core_release", "component10", "component10$payments_core_release", "component11", "component11$payments_core_release", "component2", "component3", "component4", "component4$payments_core_release", "component5", "component5$payments_core_release", "component6", "component6$payments_core_release", "component7", "component7$payments_core_release", "component8", "component8$payments_core_release", "component9", "component9$payments_core_release", "copy", "(Ljava/lang/String;IIZLjava/util/List;Lcom/stripe/android/PaymentConfiguration;Ljava/lang/Integer;Lcom/stripe/android/view/BillingAddressFields;ZZZ)Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Args implements ActivityStarter.Args {
        private final int addPaymentMethodFooterLayoutId;
        private final BillingAddressFields billingAddressFields;
        private final boolean canDeletePaymentMethods;
        private final String initialPaymentMethodId;
        private final boolean isPaymentSessionActive;
        private final PaymentConfiguration paymentConfiguration;
        private final List<PaymentMethod.Type> paymentMethodTypes;
        private final int paymentMethodsFooterLayoutId;
        private final boolean shouldShowGooglePay;
        private final boolean useGooglePay;
        private final Integer windowFlags;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\u0010\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\tJ\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0014\u0010\u001e\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0010\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u0005J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\tJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\tH\u0000¢\u0006\u0002\b\"J\u0015\u0010#\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010$R\u0012\u0010\u0004\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016¨\u0006%"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "()V", "addPaymentMethodFooterLayoutId", "", "billingAddressFields", "Lcom/stripe/android/view/BillingAddressFields;", "canDeletePaymentMethods", "", "initialPaymentMethodId", "", "isPaymentSessionActive", "paymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "paymentMethodTypes", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "paymentMethodsFooterLayoutId", "shouldShowGooglePay", "useGooglePay", "windowFlags", "Ljava/lang/Integer;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setAddPaymentMethodFooter", "setBillingAddressFields", "setCanDeletePaymentMethods", "setInitialPaymentMethodId", "setIsPaymentSessionActive", "setPaymentConfiguration", "setPaymentMethodTypes", "setPaymentMethodsFooter", "setShouldShowGooglePay", "setUseGooglePay", "setUseGooglePay$payments_core_release", "setWindowFlags", "(Ljava/lang/Integer;)Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args$Builder;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Builder implements ObjectBuilder<Args> {
            public static final int $stable = 8;
            private int addPaymentMethodFooterLayoutId;
            private BillingAddressFields billingAddressFields = BillingAddressFields.PostalCode;
            private boolean canDeletePaymentMethods = true;
            private String initialPaymentMethodId;
            private boolean isPaymentSessionActive;
            private PaymentConfiguration paymentConfiguration;
            private List<? extends PaymentMethod.Type> paymentMethodTypes;
            private int paymentMethodsFooterLayoutId;
            private boolean shouldShowGooglePay;
            private boolean useGooglePay;
            private Integer windowFlags;

            public final Builder setAddPaymentMethodFooter(int i) {
                this.addPaymentMethodFooterLayoutId = i;
                return this;
            }

            public final Builder setBillingAddressFields(BillingAddressFields billingAddressFields) {
                Intrinsics.checkNotNullParameter(billingAddressFields, "billingAddressFields");
                this.billingAddressFields = billingAddressFields;
                return this;
            }

            public final Builder setCanDeletePaymentMethods(boolean z) {
                this.canDeletePaymentMethods = z;
                return this;
            }

            public final Builder setInitialPaymentMethodId(String str) {
                this.initialPaymentMethodId = str;
                return this;
            }

            public final Builder setIsPaymentSessionActive(boolean z) {
                this.isPaymentSessionActive = z;
                return this;
            }

            public final Builder setPaymentConfiguration(PaymentConfiguration paymentConfiguration) {
                this.paymentConfiguration = paymentConfiguration;
                return this;
            }

            public final Builder setPaymentMethodTypes(List<? extends PaymentMethod.Type> paymentMethodTypes) {
                Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
                this.paymentMethodTypes = paymentMethodTypes;
                return this;
            }

            public final Builder setPaymentMethodsFooter(int i) {
                this.paymentMethodsFooterLayoutId = i;
                return this;
            }

            public final Builder setShouldShowGooglePay(boolean z) {
                this.shouldShowGooglePay = z;
                return this;
            }

            public final Builder setUseGooglePay$payments_core_release(boolean z) {
                this.useGooglePay = z;
                return this;
            }

            public final Builder setWindowFlags(Integer num) {
                this.windowFlags = num;
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Args build() {
                String str = this.initialPaymentMethodId;
                boolean z = this.isPaymentSessionActive;
                List<? extends PaymentMethod.Type> list = this.paymentMethodTypes;
                if (list == null) {
                    list = CollectionsKt__CollectionsJVMKt.listOf(PaymentMethod.Type.Card);
                }
                boolean z2 = this.shouldShowGooglePay;
                boolean z3 = this.useGooglePay;
                PaymentConfiguration paymentConfiguration = this.paymentConfiguration;
                return new Args(str, this.paymentMethodsFooterLayoutId, this.addPaymentMethodFooterLayoutId, z, list, paymentConfiguration, this.windowFlags, this.billingAddressFields, z2, z3, this.canDeletePaymentMethods);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args$Companion;", "", "()V", "create", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "intent", "Landroid/content/Intent;", "create$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Args create$payments_core_release(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Parcelable parcelableExtra = intent.getParcelableExtra("extra_activity_args");
                if (parcelableExtra != null) {
                    return (Args) parcelableExtra;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                boolean z = parcel.readInt() != 0;
                int readInt3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt3);
                for (int i = 0; i != readInt3; i++) {
                    arrayList.add(PaymentMethod.Type.CREATOR.createFromParcel(parcel));
                }
                return new Args(readString, readInt, readInt2, z, arrayList, parcel.readInt() == 0 ? null : PaymentConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, BillingAddressFields.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(String str, int i, int i2, boolean z, List<? extends PaymentMethod.Type> paymentMethodTypes, PaymentConfiguration paymentConfiguration, Integer num, BillingAddressFields billingAddressFields, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
            Intrinsics.checkNotNullParameter(billingAddressFields, "billingAddressFields");
            this.initialPaymentMethodId = str;
            this.paymentMethodsFooterLayoutId = i;
            this.addPaymentMethodFooterLayoutId = i2;
            this.isPaymentSessionActive = z;
            this.paymentMethodTypes = paymentMethodTypes;
            this.paymentConfiguration = paymentConfiguration;
            this.windowFlags = num;
            this.billingAddressFields = billingAddressFields;
            this.shouldShowGooglePay = z2;
            this.useGooglePay = z3;
            this.canDeletePaymentMethods = z4;
        }

        public final String component1$payments_core_release() {
            return this.initialPaymentMethodId;
        }

        public final boolean component10$payments_core_release() {
            return this.useGooglePay;
        }

        public final boolean component11$payments_core_release() {
            return this.canDeletePaymentMethods;
        }

        public final int component2() {
            return this.paymentMethodsFooterLayoutId;
        }

        public final int component3() {
            return this.addPaymentMethodFooterLayoutId;
        }

        public final boolean component4$payments_core_release() {
            return this.isPaymentSessionActive;
        }

        public final List<PaymentMethod.Type> component5$payments_core_release() {
            return this.paymentMethodTypes;
        }

        public final PaymentConfiguration component6$payments_core_release() {
            return this.paymentConfiguration;
        }

        public final Integer component7$payments_core_release() {
            return this.windowFlags;
        }

        public final BillingAddressFields component8$payments_core_release() {
            return this.billingAddressFields;
        }

        public final boolean component9$payments_core_release() {
            return this.shouldShowGooglePay;
        }

        public final Args copy(String str, int i, int i2, boolean z, List<? extends PaymentMethod.Type> paymentMethodTypes, PaymentConfiguration paymentConfiguration, Integer num, BillingAddressFields billingAddressFields, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
            Intrinsics.checkNotNullParameter(billingAddressFields, "billingAddressFields");
            return new Args(str, i, i2, z, paymentMethodTypes, paymentConfiguration, num, billingAddressFields, z2, z3, z4);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Args) {
                Args args = (Args) obj;
                return Intrinsics.areEqual(this.initialPaymentMethodId, args.initialPaymentMethodId) && this.paymentMethodsFooterLayoutId == args.paymentMethodsFooterLayoutId && this.addPaymentMethodFooterLayoutId == args.addPaymentMethodFooterLayoutId && this.isPaymentSessionActive == args.isPaymentSessionActive && Intrinsics.areEqual(this.paymentMethodTypes, args.paymentMethodTypes) && Intrinsics.areEqual(this.paymentConfiguration, args.paymentConfiguration) && Intrinsics.areEqual(this.windowFlags, args.windowFlags) && this.billingAddressFields == args.billingAddressFields && this.shouldShowGooglePay == args.shouldShowGooglePay && this.useGooglePay == args.useGooglePay && this.canDeletePaymentMethods == args.canDeletePaymentMethods;
            }
            return false;
        }

        public final int getAddPaymentMethodFooterLayoutId() {
            return this.addPaymentMethodFooterLayoutId;
        }

        public final BillingAddressFields getBillingAddressFields$payments_core_release() {
            return this.billingAddressFields;
        }

        public final boolean getCanDeletePaymentMethods$payments_core_release() {
            return this.canDeletePaymentMethods;
        }

        public final String getInitialPaymentMethodId$payments_core_release() {
            return this.initialPaymentMethodId;
        }

        public final PaymentConfiguration getPaymentConfiguration$payments_core_release() {
            return this.paymentConfiguration;
        }

        public final List<PaymentMethod.Type> getPaymentMethodTypes$payments_core_release() {
            return this.paymentMethodTypes;
        }

        public final int getPaymentMethodsFooterLayoutId() {
            return this.paymentMethodsFooterLayoutId;
        }

        public final boolean getShouldShowGooglePay$payments_core_release() {
            return this.shouldShowGooglePay;
        }

        public final boolean getUseGooglePay$payments_core_release() {
            return this.useGooglePay;
        }

        public final Integer getWindowFlags$payments_core_release() {
            return this.windowFlags;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.initialPaymentMethodId;
            int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.paymentMethodsFooterLayoutId)) * 31) + Integer.hashCode(this.addPaymentMethodFooterLayoutId)) * 31;
            boolean z = this.isPaymentSessionActive;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int hashCode2 = (((hashCode + i) * 31) + this.paymentMethodTypes.hashCode()) * 31;
            PaymentConfiguration paymentConfiguration = this.paymentConfiguration;
            int hashCode3 = (hashCode2 + (paymentConfiguration == null ? 0 : paymentConfiguration.hashCode())) * 31;
            Integer num = this.windowFlags;
            int hashCode4 = (((hashCode3 + (num != null ? num.hashCode() : 0)) * 31) + this.billingAddressFields.hashCode()) * 31;
            boolean z2 = this.shouldShowGooglePay;
            int i2 = z2;
            if (z2 != 0) {
                i2 = 1;
            }
            int i3 = (hashCode4 + i2) * 31;
            boolean z3 = this.useGooglePay;
            int i4 = z3;
            if (z3 != 0) {
                i4 = 1;
            }
            int i5 = (i3 + i4) * 31;
            boolean z4 = this.canDeletePaymentMethods;
            return i5 + (z4 ? 1 : z4 ? 1 : 0);
        }

        public final boolean isPaymentSessionActive$payments_core_release() {
            return this.isPaymentSessionActive;
        }

        public String toString() {
            String str = this.initialPaymentMethodId;
            int i = this.paymentMethodsFooterLayoutId;
            int i2 = this.addPaymentMethodFooterLayoutId;
            boolean z = this.isPaymentSessionActive;
            List<PaymentMethod.Type> list = this.paymentMethodTypes;
            PaymentConfiguration paymentConfiguration = this.paymentConfiguration;
            Integer num = this.windowFlags;
            BillingAddressFields billingAddressFields = this.billingAddressFields;
            boolean z2 = this.shouldShowGooglePay;
            boolean z3 = this.useGooglePay;
            boolean z4 = this.canDeletePaymentMethods;
            return "Args(initialPaymentMethodId=" + str + ", paymentMethodsFooterLayoutId=" + i + ", addPaymentMethodFooterLayoutId=" + i2 + ", isPaymentSessionActive=" + z + ", paymentMethodTypes=" + list + ", paymentConfiguration=" + paymentConfiguration + ", windowFlags=" + num + ", billingAddressFields=" + billingAddressFields + ", shouldShowGooglePay=" + z2 + ", useGooglePay=" + z3 + ", canDeletePaymentMethods=" + z4 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.initialPaymentMethodId);
            out.writeInt(this.paymentMethodsFooterLayoutId);
            out.writeInt(this.addPaymentMethodFooterLayoutId);
            out.writeInt(this.isPaymentSessionActive ? 1 : 0);
            List<PaymentMethod.Type> list = this.paymentMethodTypes;
            out.writeInt(list.size());
            for (PaymentMethod.Type type : list) {
                type.writeToParcel(out, i);
            }
            PaymentConfiguration paymentConfiguration = this.paymentConfiguration;
            if (paymentConfiguration == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                paymentConfiguration.writeToParcel(out, i);
            }
            Integer num = this.windowFlags;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.billingAddressFields.name());
            out.writeInt(this.shouldShowGooglePay ? 1 : 0);
            out.writeInt(this.useGooglePay ? 1 : 0);
            out.writeInt(this.canDeletePaymentMethods ? 1 : 0);
        }

        public /* synthetic */ Args(String str, int i, int i2, boolean z, List list, PaymentConfiguration paymentConfiguration, Integer num, BillingAddressFields billingAddressFields, boolean z2, boolean z3, boolean z4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, z, list, paymentConfiguration, (i3 & 64) != 0 ? null : num, billingAddressFields, (i3 & 256) != 0 ? false : z2, (i3 & 512) != 0 ? false : z3, (i3 & 1024) != 0 ? true : z4);
        }
    }
}
