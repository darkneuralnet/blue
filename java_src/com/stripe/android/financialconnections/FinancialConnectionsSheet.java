package com.stripe.android.financialconnections;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataLauncher;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForTokenLauncher;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;", "", "financialConnectionsSheetLauncher", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;)V", "present", "", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "Companion", "Configuration", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheet {
    private final FinancialConnectionsSheetLauncher financialConnectionsSheetLauncher;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\fJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\f¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Companion;", "", "()V", "create", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;", "activity", "Landroidx/activity/ComponentActivity;", "callback", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;", "fragment", "Landroidx/fragment/app/Fragment;", "createForBankAccountToken", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FinancialConnectionsSheet create(ComponentActivity activity, FinancialConnectionsSheetResultCallback callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return new FinancialConnectionsSheet(new FinancialConnectionsSheetForDataLauncher(activity, callback));
        }

        public final FinancialConnectionsSheet createForBankAccountToken(ComponentActivity activity, FinancialConnectionsSheetResultForTokenCallback callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return new FinancialConnectionsSheet(new FinancialConnectionsSheetForTokenLauncher(activity, callback));
        }

        private Companion() {
        }

        public final FinancialConnectionsSheet create(Fragment fragment, FinancialConnectionsSheetResultCallback callback) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return new FinancialConnectionsSheet(new FinancialConnectionsSheetForDataLauncher(fragment, callback));
        }

        public final FinancialConnectionsSheet createForBankAccountToken(Fragment fragment, FinancialConnectionsSheetResultForTokenCallback callback) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return new FinancialConnectionsSheet(new FinancialConnectionsSheetForTokenLauncher(fragment, callback));
        }
    }

    public FinancialConnectionsSheet(FinancialConnectionsSheetLauncher financialConnectionsSheetLauncher) {
        Intrinsics.checkNotNullParameter(financialConnectionsSheetLauncher, "financialConnectionsSheetLauncher");
        this.financialConnectionsSheetLauncher = financialConnectionsSheetLauncher;
    }

    public final void present(Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.financialConnectionsSheetLauncher.present(configuration);
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "Landroid/os/Parcelable;", "financialConnectionsSessionClientSecret", "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFinancialConnectionsSessionClientSecret", "()Ljava/lang/String;", "getPublishableKey", "getStripeAccountId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Configuration implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Configuration> CREATOR = new Creator();
        private final String financialConnectionsSessionClientSecret;
        private final String publishableKey;
        private final String stripeAccountId;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Configuration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Configuration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Configuration(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Configuration[] newArray(int i) {
                return new Configuration[i];
            }
        }

        public Configuration(String financialConnectionsSessionClientSecret, String publishableKey, String str) {
            Intrinsics.checkNotNullParameter(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            this.financialConnectionsSessionClientSecret = financialConnectionsSessionClientSecret;
            this.publishableKey = publishableKey;
            this.stripeAccountId = str;
        }

        public static /* synthetic */ Configuration copy$default(Configuration configuration, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = configuration.financialConnectionsSessionClientSecret;
            }
            if ((i & 2) != 0) {
                str2 = configuration.publishableKey;
            }
            if ((i & 4) != 0) {
                str3 = configuration.stripeAccountId;
            }
            return configuration.copy(str, str2, str3);
        }

        public final String component1() {
            return this.financialConnectionsSessionClientSecret;
        }

        public final String component2() {
            return this.publishableKey;
        }

        public final String component3() {
            return this.stripeAccountId;
        }

        public final Configuration copy(String financialConnectionsSessionClientSecret, String publishableKey, String str) {
            Intrinsics.checkNotNullParameter(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            return new Configuration(financialConnectionsSessionClientSecret, publishableKey, str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Configuration) {
                Configuration configuration = (Configuration) obj;
                return Intrinsics.areEqual(this.financialConnectionsSessionClientSecret, configuration.financialConnectionsSessionClientSecret) && Intrinsics.areEqual(this.publishableKey, configuration.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, configuration.stripeAccountId);
            }
            return false;
        }

        public final String getFinancialConnectionsSessionClientSecret() {
            return this.financialConnectionsSessionClientSecret;
        }

        public final String getPublishableKey() {
            return this.publishableKey;
        }

        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public int hashCode() {
            int hashCode = ((this.financialConnectionsSessionClientSecret.hashCode() * 31) + this.publishableKey.hashCode()) * 31;
            String str = this.stripeAccountId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.financialConnectionsSessionClientSecret;
            String str2 = this.publishableKey;
            String str3 = this.stripeAccountId;
            return "Configuration(financialConnectionsSessionClientSecret=" + str + ", publishableKey=" + str2 + ", stripeAccountId=" + str3 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.financialConnectionsSessionClientSecret);
            out.writeString(this.publishableKey);
            out.writeString(this.stripeAccountId);
        }

        public /* synthetic */ Configuration(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }
    }
}
