package com.stripe.android.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.PaymentSessionData;
import com.stripe.android.view.ActivityStarter;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\f\rB\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0017\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000b¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/view/PaymentFlowActivityStarter;", "Lcom/stripe/android/view/ActivityStarter;", "Lcom/stripe/android/view/PaymentFlowActivity;", "Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "activity", "Landroid/app/Activity;", "config", "Lcom/stripe/android/PaymentSessionConfig;", "(Landroid/app/Activity;Lcom/stripe/android/PaymentSessionConfig;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/PaymentSessionConfig;)V", "Args", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentFlowActivityStarter extends ActivityStarter<PaymentFlowActivity, Args> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int REQUEST_CODE = 6002;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/view/PaymentFlowActivityStarter$Companion;", "", "()V", "REQUEST_CODE", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivityStarter(Activity activity, PaymentSessionConfig config) {
        super(activity, PaymentFlowActivity.class, (int) REQUEST_CODE, (Integer) null, 8, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(config, "config");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivityStarter(Fragment fragment, PaymentSessionConfig config) {
        super(fragment, PaymentFlowActivity.class, (int) REQUEST_CODE, (Integer) null, 8, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(config, "config");
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0014\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0015J\u000e\u0010\u0016\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0017J\u000e\u0010\u0018\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\tHÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006,"}, m28432d2 = {"Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "paymentSessionConfig", "Lcom/stripe/android/PaymentSessionConfig;", "paymentSessionData", "Lcom/stripe/android/PaymentSessionData;", "isPaymentSessionActive", "", "windowFlags", "", "(Lcom/stripe/android/PaymentSessionConfig;Lcom/stripe/android/PaymentSessionData;ZLjava/lang/Integer;)V", "isPaymentSessionActive$payments_core_release", "()Z", "getPaymentSessionConfig$payments_core_release", "()Lcom/stripe/android/PaymentSessionConfig;", "getPaymentSessionData$payments_core_release", "()Lcom/stripe/android/PaymentSessionData;", "getWindowFlags$payments_core_release", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "copy", "(Lcom/stripe/android/PaymentSessionConfig;Lcom/stripe/android/PaymentSessionData;ZLjava/lang/Integer;)Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Args implements ActivityStarter.Args {
        private final boolean isPaymentSessionActive;
        private final PaymentSessionConfig paymentSessionConfig;
        private final PaymentSessionData paymentSessionData;
        private final Integer windowFlags;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u0002H\u0016J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0015\u0010\u0011\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "()V", "isPaymentSessionActive", "", "paymentSessionConfig", "Lcom/stripe/android/PaymentSessionConfig;", "paymentSessionData", "Lcom/stripe/android/PaymentSessionData;", "windowFlags", "", "Ljava/lang/Integer;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setIsPaymentSessionActive", "setPaymentSessionConfig", "setPaymentSessionData", "setWindowFlags", "(Ljava/lang/Integer;)Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Builder implements ObjectBuilder<Args> {
            public static final int $stable = 8;
            private boolean isPaymentSessionActive;
            private PaymentSessionConfig paymentSessionConfig;
            private PaymentSessionData paymentSessionData;
            private Integer windowFlags;

            public final Builder setIsPaymentSessionActive(boolean z) {
                this.isPaymentSessionActive = z;
                return this;
            }

            public final Builder setPaymentSessionConfig(PaymentSessionConfig paymentSessionConfig) {
                this.paymentSessionConfig = paymentSessionConfig;
                return this;
            }

            public final Builder setPaymentSessionData(PaymentSessionData paymentSessionData) {
                this.paymentSessionData = paymentSessionData;
                return this;
            }

            public final Builder setWindowFlags(Integer num) {
                this.windowFlags = num;
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Args build() {
                PaymentSessionConfig paymentSessionConfig = this.paymentSessionConfig;
                if (paymentSessionConfig != null) {
                    PaymentSessionData paymentSessionData = this.paymentSessionData;
                    if (paymentSessionData != null) {
                        return new Args(paymentSessionConfig, paymentSessionData, this.isPaymentSessionActive, this.windowFlags);
                    }
                    throw new IllegalArgumentException("PaymentFlowActivity launched without PaymentSessionData".toString());
                }
                throw new IllegalArgumentException("PaymentFlowActivity launched without PaymentSessionConfig".toString());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Companion;", "", "()V", "create", "Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "intent", "Landroid/content/Intent;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final Args create(Intent intent) {
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
                return new Args(PaymentSessionConfig.CREATOR.createFromParcel(parcel), PaymentSessionData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args(PaymentSessionConfig paymentSessionConfig, PaymentSessionData paymentSessionData, boolean z, Integer num) {
            Intrinsics.checkNotNullParameter(paymentSessionConfig, "paymentSessionConfig");
            Intrinsics.checkNotNullParameter(paymentSessionData, "paymentSessionData");
            this.paymentSessionConfig = paymentSessionConfig;
            this.paymentSessionData = paymentSessionData;
            this.isPaymentSessionActive = z;
            this.windowFlags = num;
        }

        public static /* synthetic */ Args copy$default(Args args, PaymentSessionConfig paymentSessionConfig, PaymentSessionData paymentSessionData, boolean z, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentSessionConfig = args.paymentSessionConfig;
            }
            if ((i & 2) != 0) {
                paymentSessionData = args.paymentSessionData;
            }
            if ((i & 4) != 0) {
                z = args.isPaymentSessionActive;
            }
            if ((i & 8) != 0) {
                num = args.windowFlags;
            }
            return args.copy(paymentSessionConfig, paymentSessionData, z, num);
        }

        @JvmStatic
        public static final Args create(Intent intent) {
            return Companion.create(intent);
        }

        public final PaymentSessionConfig component1$payments_core_release() {
            return this.paymentSessionConfig;
        }

        public final PaymentSessionData component2$payments_core_release() {
            return this.paymentSessionData;
        }

        public final boolean component3$payments_core_release() {
            return this.isPaymentSessionActive;
        }

        public final Integer component4$payments_core_release() {
            return this.windowFlags;
        }

        public final Args copy(PaymentSessionConfig paymentSessionConfig, PaymentSessionData paymentSessionData, boolean z, Integer num) {
            Intrinsics.checkNotNullParameter(paymentSessionConfig, "paymentSessionConfig");
            Intrinsics.checkNotNullParameter(paymentSessionData, "paymentSessionData");
            return new Args(paymentSessionConfig, paymentSessionData, z, num);
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
                return Intrinsics.areEqual(this.paymentSessionConfig, args.paymentSessionConfig) && Intrinsics.areEqual(this.paymentSessionData, args.paymentSessionData) && this.isPaymentSessionActive == args.isPaymentSessionActive && Intrinsics.areEqual(this.windowFlags, args.windowFlags);
            }
            return false;
        }

        public final PaymentSessionConfig getPaymentSessionConfig$payments_core_release() {
            return this.paymentSessionConfig;
        }

        public final PaymentSessionData getPaymentSessionData$payments_core_release() {
            return this.paymentSessionData;
        }

        public final Integer getWindowFlags$payments_core_release() {
            return this.windowFlags;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.paymentSessionConfig.hashCode() * 31) + this.paymentSessionData.hashCode()) * 31;
            boolean z = this.isPaymentSessionActive;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            Integer num = this.windowFlags;
            return i2 + (num == null ? 0 : num.hashCode());
        }

        public final boolean isPaymentSessionActive$payments_core_release() {
            return this.isPaymentSessionActive;
        }

        public String toString() {
            PaymentSessionConfig paymentSessionConfig = this.paymentSessionConfig;
            PaymentSessionData paymentSessionData = this.paymentSessionData;
            boolean z = this.isPaymentSessionActive;
            Integer num = this.windowFlags;
            return "Args(paymentSessionConfig=" + paymentSessionConfig + ", paymentSessionData=" + paymentSessionData + ", isPaymentSessionActive=" + z + ", windowFlags=" + num + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            int intValue;
            Intrinsics.checkNotNullParameter(out, "out");
            this.paymentSessionConfig.writeToParcel(out, i);
            this.paymentSessionData.writeToParcel(out, i);
            out.writeInt(this.isPaymentSessionActive ? 1 : 0);
            Integer num = this.windowFlags;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
        }

        public /* synthetic */ Args(PaymentSessionConfig paymentSessionConfig, PaymentSessionData paymentSessionData, boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(paymentSessionConfig, paymentSessionData, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : num);
        }
    }
}
