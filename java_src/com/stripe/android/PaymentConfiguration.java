package com.stripe.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.ApiKeyValidator;
import com.stripe.android.core.injection.NamedConstantsKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/PaymentConfiguration;", "Landroid/os/Parcelable;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "(Ljava/lang/String;Ljava/lang/String;)V", "getPublishableKey", "()Ljava/lang/String;", "getStripeAccountId", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Store", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class PaymentConfiguration implements Parcelable {
    public static final int $stable = 0;
    private static PaymentConfiguration instance;
    private final String publishableKey;
    private final String stripeAccountId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PaymentConfiguration> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J$\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/PaymentConfiguration$Companion;", "", "()V", "instance", "Lcom/stripe/android/PaymentConfiguration;", "clearInstance", "", "getInstance", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "init", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "loadInstance", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void init$default(Companion companion, Context context, String str, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            companion.init(context, str, str2);
        }

        private final PaymentConfiguration loadInstance(Context context) {
            PaymentConfiguration load$payments_core_release = new Store(context).load$payments_core_release();
            if (load$payments_core_release != null) {
                PaymentConfiguration.instance = load$payments_core_release;
                return load$payments_core_release;
            }
            throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
        }

        public final /* synthetic */ void clearInstance() {
            PaymentConfiguration.instance = null;
        }

        @JvmStatic
        public final PaymentConfiguration getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            PaymentConfiguration paymentConfiguration = PaymentConfiguration.instance;
            if (paymentConfiguration == null) {
                return loadInstance(context);
            }
            return paymentConfiguration;
        }

        @JvmStatic
        @JvmOverloads
        public final void init(Context context, String publishableKey) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            init$default(this, context, publishableKey, null, 4, null);
        }

        private Companion() {
        }

        @JvmStatic
        @JvmOverloads
        public final void init(Context context, String publishableKey, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            PaymentConfiguration.instance = new PaymentConfiguration(publishableKey, str);
            new Store(context).save(publishableKey, str);
            new DefaultFraudDetectionDataRepository(context, (CoroutineContext) null, 2, (DefaultConstructorMarker) null).refresh();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<PaymentConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentConfiguration createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentConfiguration(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentConfiguration[] newArray(int i) {
            return new PaymentConfiguration[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\b\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/PaymentConfiguration$Store;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "load", "Lcom/stripe/android/PaymentConfiguration;", "load$payments_core_release", "save", "", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Store {
        @Deprecated
        private static final String KEY_ACCOUNT_ID = "key_account_id";
        @Deprecated
        private static final String KEY_PUBLISHABLE_KEY = "key_publishable_key";
        private final SharedPreferences prefs;
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String NAME = PaymentConfiguration.class.getCanonicalName();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/PaymentConfiguration$Store$Companion;", "", "()V", "KEY_ACCOUNT_ID", "", "KEY_PUBLISHABLE_KEY", "NAME", "kotlin.jvm.PlatformType", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public Store(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(NAME, 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.applicationConte…haredPreferences(NAME, 0)");
            this.prefs = sharedPreferences;
        }

        public final /* synthetic */ PaymentConfiguration load$payments_core_release() {
            String string = this.prefs.getString(KEY_PUBLISHABLE_KEY, null);
            if (string == null) {
                return null;
            }
            return new PaymentConfiguration(string, this.prefs.getString(KEY_ACCOUNT_ID, null));
        }

        public final /* synthetic */ void save(String publishableKey, String str) {
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            this.prefs.edit().putString(KEY_PUBLISHABLE_KEY, publishableKey).putString(KEY_ACCOUNT_ID, str).apply();
        }
    }

    public PaymentConfiguration(String publishableKey, String str) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        this.publishableKey = publishableKey;
        this.stripeAccountId = str;
        ApiKeyValidator.Companion.get().requireValid(publishableKey);
    }

    public static /* synthetic */ PaymentConfiguration copy$default(PaymentConfiguration paymentConfiguration, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentConfiguration.publishableKey;
        }
        if ((i & 2) != 0) {
            str2 = paymentConfiguration.stripeAccountId;
        }
        return paymentConfiguration.copy(str, str2);
    }

    @JvmStatic
    public static final PaymentConfiguration getInstance(Context context) {
        return Companion.getInstance(context);
    }

    @JvmStatic
    @JvmOverloads
    public static final void init(Context context, String str) {
        Companion.init(context, str);
    }

    public final String component1() {
        return this.publishableKey;
    }

    public final String component2() {
        return this.stripeAccountId;
    }

    public final PaymentConfiguration copy(String publishableKey, String str) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        return new PaymentConfiguration(publishableKey, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentConfiguration) {
            PaymentConfiguration paymentConfiguration = (PaymentConfiguration) obj;
            return Intrinsics.areEqual(this.publishableKey, paymentConfiguration.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, paymentConfiguration.stripeAccountId);
        }
        return false;
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public final String getStripeAccountId() {
        return this.stripeAccountId;
    }

    public int hashCode() {
        int hashCode = this.publishableKey.hashCode() * 31;
        String str = this.stripeAccountId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.publishableKey;
        String str2 = this.stripeAccountId;
        return "PaymentConfiguration(publishableKey=" + str + ", stripeAccountId=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.publishableKey);
        out.writeString(this.stripeAccountId);
    }

    @JvmStatic
    @JvmOverloads
    public static final void init(Context context, String str, String str2) {
        Companion.init(context, str, str2);
    }

    public /* synthetic */ PaymentConfiguration(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
