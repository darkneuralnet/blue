package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.paymentsheet.state.PaymentSheetState;
import com.stripe.android.view.ActivityStarter;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000 \u000f2\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0002\u0010\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001c\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract;", "Lv5;", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "createIntent", "", "resultCode", "intent", "parseResult", "<init>", "()V", "Companion", "Args", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PaymentOptionContract extends AbstractC29414v5<Args, PaymentOptionResult> {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_ARGS = "extra_activity_args";

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0001*B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0003JH\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", TransferTable.COLUMN_STATE, "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "statusBarColor", "", "injectorKey", "", NamedConstantsKt.ENABLE_LOGGING, "", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "", "(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/Set;)V", "getEnableLogging", "()Z", "getInjectorKey", "()Ljava/lang/String;", "getProductUsage", "()Ljava/util/Set;", "getState", "()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "getStatusBarColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/Set;)Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Args implements ActivityStarter.Args {
        private final boolean enableLogging;
        private final String injectorKey;
        private final Set<String> productUsage;
        private final PaymentSheetState.Full state;
        private final Integer statusBarColor;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Args> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args$Companion;", "", "()V", "fromIntent", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "intent", "Landroid/content/Intent;", "fromIntent$paymentsheet_release", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Args fromIntent$paymentsheet_release(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra("extra_activity_args");
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
                PaymentSheetState.Full createFromParcel = PaymentSheetState.Full.CREATOR.createFromParcel(parcel);
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString = parcel.readString();
                boolean z = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new Args(createFromParcel, valueOf, readString, z, linkedHashSet);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args(PaymentSheetState.Full state, Integer num, @InjectorKey String injectorKey, boolean z, Set<String> productUsage) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            this.state = state;
            this.statusBarColor = num;
            this.injectorKey = injectorKey;
            this.enableLogging = z;
            this.productUsage = productUsage;
        }

        public static /* synthetic */ Args copy$default(Args args, PaymentSheetState.Full full, Integer num, String str, boolean z, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                full = args.state;
            }
            if ((i & 2) != 0) {
                num = args.statusBarColor;
            }
            Integer num2 = num;
            if ((i & 4) != 0) {
                str = args.injectorKey;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                z = args.enableLogging;
            }
            boolean z2 = z;
            Set<String> set2 = set;
            if ((i & 16) != 0) {
                set2 = args.productUsage;
            }
            return args.copy(full, num2, str2, z2, set2);
        }

        public final PaymentSheetState.Full component1() {
            return this.state;
        }

        public final Integer component2() {
            return this.statusBarColor;
        }

        public final String component3() {
            return this.injectorKey;
        }

        public final boolean component4() {
            return this.enableLogging;
        }

        public final Set<String> component5() {
            return this.productUsage;
        }

        public final Args copy(PaymentSheetState.Full state, Integer num, @InjectorKey String injectorKey, boolean z, Set<String> productUsage) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            return new Args(state, num, injectorKey, z, productUsage);
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
                return Intrinsics.areEqual(this.state, args.state) && Intrinsics.areEqual(this.statusBarColor, args.statusBarColor) && Intrinsics.areEqual(this.injectorKey, args.injectorKey) && this.enableLogging == args.enableLogging && Intrinsics.areEqual(this.productUsage, args.productUsage);
            }
            return false;
        }

        public final boolean getEnableLogging() {
            return this.enableLogging;
        }

        public final String getInjectorKey() {
            return this.injectorKey;
        }

        public final Set<String> getProductUsage() {
            return this.productUsage;
        }

        public final PaymentSheetState.Full getState() {
            return this.state;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.state.hashCode() * 31;
            Integer num = this.statusBarColor;
            int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.injectorKey.hashCode()) * 31;
            boolean z = this.enableLogging;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return ((hashCode2 + i) * 31) + this.productUsage.hashCode();
        }

        public String toString() {
            PaymentSheetState.Full full = this.state;
            Integer num = this.statusBarColor;
            String str = this.injectorKey;
            boolean z = this.enableLogging;
            Set<String> set = this.productUsage;
            return "Args(state=" + full + ", statusBarColor=" + num + ", injectorKey=" + str + ", enableLogging=" + z + ", productUsage=" + set + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            int intValue;
            Intrinsics.checkNotNullParameter(out, "out");
            this.state.writeToParcel(out, i);
            Integer num = this.statusBarColor;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeString(this.injectorKey);
            out.writeInt(this.enableLogging ? 1 : 0);
            Set<String> set = this.productUsage;
            out.writeInt(set.size());
            for (String str : set) {
                out.writeString(str);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract$Companion;", "", "()V", "EXTRA_ARGS", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // p000.AbstractC29414v5
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent(context, PaymentOptionsActivity.class).putExtra("extra_activity_args", input);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, PaymentO…tExtra(EXTRA_ARGS, input)");
        return putExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC29414v5
    public PaymentOptionResult parseResult(int i, Intent intent) {
        return PaymentOptionResult.Companion.fromIntent$paymentsheet_release(intent);
    }
}
