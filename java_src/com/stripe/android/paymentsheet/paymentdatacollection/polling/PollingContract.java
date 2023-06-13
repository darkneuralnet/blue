package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.payments.PaymentFlowResult;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract;", "Lv5;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "createIntent", "", "resultCode", "intent", "parseResult", "<init>", "()V", "Args", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PollingContract extends AbstractC29414v5<Args, PaymentFlowResult.Unvalidated> {

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0001&B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003JB\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006'"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;", "Landroid/os/Parcelable;", "clientSecret", "", "statusBarColor", "", "timeLimitInSeconds", "initialDelayInSeconds", "maxAttempts", "(Ljava/lang/String;Ljava/lang/Integer;III)V", "getClientSecret", "()Ljava/lang/String;", "getInitialDelayInSeconds", "()I", "getMaxAttempts", "getStatusBarColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTimeLimitInSeconds", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;III)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Args implements Parcelable {
        private final String clientSecret;
        private final int initialDelayInSeconds;
        private final int maxAttempts;
        private final Integer statusBarColor;
        private final int timeLimitInSeconds;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Args> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args$Companion;", "", "()V", "fromIntent", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;", "intent", "Landroid/content/Intent;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Args fromIntent(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra("extra_args");
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
                return new Args(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args(String clientSecret, Integer num, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            this.statusBarColor = num;
            this.timeLimitInSeconds = i;
            this.initialDelayInSeconds = i2;
            this.maxAttempts = i3;
        }

        public static /* synthetic */ Args copy$default(Args args, String str, Integer num, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = args.clientSecret;
            }
            if ((i4 & 2) != 0) {
                num = args.statusBarColor;
            }
            Integer num2 = num;
            if ((i4 & 4) != 0) {
                i = args.timeLimitInSeconds;
            }
            int i5 = i;
            if ((i4 & 8) != 0) {
                i2 = args.initialDelayInSeconds;
            }
            int i6 = i2;
            if ((i4 & 16) != 0) {
                i3 = args.maxAttempts;
            }
            return args.copy(str, num2, i5, i6, i3);
        }

        public final String component1() {
            return this.clientSecret;
        }

        public final Integer component2() {
            return this.statusBarColor;
        }

        public final int component3() {
            return this.timeLimitInSeconds;
        }

        public final int component4() {
            return this.initialDelayInSeconds;
        }

        public final int component5() {
            return this.maxAttempts;
        }

        public final Args copy(String clientSecret, Integer num, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new Args(clientSecret, num, i, i2, i3);
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
                return Intrinsics.areEqual(this.clientSecret, args.clientSecret) && Intrinsics.areEqual(this.statusBarColor, args.statusBarColor) && this.timeLimitInSeconds == args.timeLimitInSeconds && this.initialDelayInSeconds == args.initialDelayInSeconds && this.maxAttempts == args.maxAttempts;
            }
            return false;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final int getInitialDelayInSeconds() {
            return this.initialDelayInSeconds;
        }

        public final int getMaxAttempts() {
            return this.maxAttempts;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public final int getTimeLimitInSeconds() {
            return this.timeLimitInSeconds;
        }

        public int hashCode() {
            int hashCode = this.clientSecret.hashCode() * 31;
            Integer num = this.statusBarColor;
            return ((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.timeLimitInSeconds)) * 31) + Integer.hashCode(this.initialDelayInSeconds)) * 31) + Integer.hashCode(this.maxAttempts);
        }

        public String toString() {
            String str = this.clientSecret;
            Integer num = this.statusBarColor;
            int i = this.timeLimitInSeconds;
            int i2 = this.initialDelayInSeconds;
            int i3 = this.maxAttempts;
            return "Args(clientSecret=" + str + ", statusBarColor=" + num + ", timeLimitInSeconds=" + i + ", initialDelayInSeconds=" + i2 + ", maxAttempts=" + i3 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            int intValue;
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.clientSecret);
            Integer num = this.statusBarColor;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeInt(this.timeLimitInSeconds);
            out.writeInt(this.initialDelayInSeconds);
            out.writeInt(this.maxAttempts);
        }
    }

    @Override // p000.AbstractC29414v5
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtras = new Intent(context, PollingActivity.class).putExtras(C39564d70.m44603a(TuplesKt.m28425to("extra_args", input)));
        Intrinsics.checkNotNullExpressionValue(putExtras, "Intent(context, PollingA…ass.java).putExtras(args)");
        return putExtras;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC29414v5
    public PaymentFlowResult.Unvalidated parseResult(int i, Intent intent) {
        return PaymentFlowResult.Unvalidated.Companion.fromIntent(intent);
    }
}
