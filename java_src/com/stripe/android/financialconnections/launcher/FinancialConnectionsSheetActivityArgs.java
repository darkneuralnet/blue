package com.stripe.android.financialconnections.launcher;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import java.security.InvalidParameterException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0004\r\u000e\u000f\u0010B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\r\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "Landroid/os/Parcelable;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "isValid", "", "isValid$financial_connections_release", "validate", "", "validate$financial_connections_release", "Companion", "ForData", "ForLink", "ForToken", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForLink;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nFinancialConnectionsSheetActivityArgs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetActivityArgs.kt\ncom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: classes7.dex */
public abstract class FinancialConnectionsSheetActivityArgs implements Parcelable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final FinancialConnectionsSheet.Configuration configuration;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$Companion;", "", "()V", "fromIntent", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "intent", "Landroid/content/Intent;", "fromIntent$financial_connections_release", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FinancialConnectionsSheetActivityArgs fromIntent$financial_connections_release(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return (FinancialConnectionsSheetActivityArgs) intent.getParcelableExtra("mavericks:arg");
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ForData extends FinancialConnectionsSheetActivityArgs {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ForData> CREATOR = new Creator();
        private final FinancialConnectionsSheet.Configuration configuration;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<ForData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ForData(FinancialConnectionsSheet.Configuration.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForData[] newArray(int i) {
                return new ForData[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForData(FinancialConnectionsSheet.Configuration configuration) {
            super(configuration, null);
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.configuration = configuration;
        }

        public static /* synthetic */ ForData copy$default(ForData forData, FinancialConnectionsSheet.Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = forData.getConfiguration();
            }
            return forData.copy(configuration);
        }

        public final FinancialConnectionsSheet.Configuration component1() {
            return getConfiguration();
        }

        public final ForData copy(FinancialConnectionsSheet.Configuration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new ForData(configuration);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ForData) && Intrinsics.areEqual(getConfiguration(), ((ForData) obj).getConfiguration());
        }

        @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs
        public FinancialConnectionsSheet.Configuration getConfiguration() {
            return this.configuration;
        }

        public int hashCode() {
            return getConfiguration().hashCode();
        }

        public String toString() {
            FinancialConnectionsSheet.Configuration configuration = getConfiguration();
            return "ForData(configuration=" + configuration + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.configuration.writeToParcel(out, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForLink;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ForLink extends FinancialConnectionsSheetActivityArgs {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ForLink> CREATOR = new Creator();
        private final FinancialConnectionsSheet.Configuration configuration;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<ForLink> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForLink createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ForLink(FinancialConnectionsSheet.Configuration.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForLink[] newArray(int i) {
                return new ForLink[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForLink(FinancialConnectionsSheet.Configuration configuration) {
            super(configuration, null);
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.configuration = configuration;
        }

        public static /* synthetic */ ForLink copy$default(ForLink forLink, FinancialConnectionsSheet.Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = forLink.getConfiguration();
            }
            return forLink.copy(configuration);
        }

        public final FinancialConnectionsSheet.Configuration component1() {
            return getConfiguration();
        }

        public final ForLink copy(FinancialConnectionsSheet.Configuration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new ForLink(configuration);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ForLink) && Intrinsics.areEqual(getConfiguration(), ((ForLink) obj).getConfiguration());
        }

        @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs
        public FinancialConnectionsSheet.Configuration getConfiguration() {
            return this.configuration;
        }

        public int hashCode() {
            return getConfiguration().hashCode();
        }

        public String toString() {
            FinancialConnectionsSheet.Configuration configuration = getConfiguration();
            return "ForLink(configuration=" + configuration + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.configuration.writeToParcel(out, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ForToken extends FinancialConnectionsSheetActivityArgs {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ForToken> CREATOR = new Creator();
        private final FinancialConnectionsSheet.Configuration configuration;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<ForToken> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForToken createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ForToken(FinancialConnectionsSheet.Configuration.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForToken[] newArray(int i) {
                return new ForToken[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForToken(FinancialConnectionsSheet.Configuration configuration) {
            super(configuration, null);
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.configuration = configuration;
        }

        public static /* synthetic */ ForToken copy$default(ForToken forToken, FinancialConnectionsSheet.Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = forToken.getConfiguration();
            }
            return forToken.copy(configuration);
        }

        public final FinancialConnectionsSheet.Configuration component1() {
            return getConfiguration();
        }

        public final ForToken copy(FinancialConnectionsSheet.Configuration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new ForToken(configuration);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ForToken) && Intrinsics.areEqual(getConfiguration(), ((ForToken) obj).getConfiguration());
        }

        @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs
        public FinancialConnectionsSheet.Configuration getConfiguration() {
            return this.configuration;
        }

        public int hashCode() {
            return getConfiguration().hashCode();
        }

        public String toString() {
            FinancialConnectionsSheet.Configuration configuration = getConfiguration();
            return "ForToken(configuration=" + configuration + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.configuration.writeToParcel(out, i);
        }
    }

    public /* synthetic */ FinancialConnectionsSheetActivityArgs(FinancialConnectionsSheet.Configuration configuration, DefaultConstructorMarker defaultConstructorMarker) {
        this(configuration);
    }

    public FinancialConnectionsSheet.Configuration getConfiguration() {
        return this.configuration;
    }

    public final boolean isValid$financial_connections_release() {
        Object m116783constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            validate$financial_connections_release();
            m116783constructorimpl = Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m116790isSuccessimpl(m116783constructorimpl);
    }

    public final void validate$financial_connections_release() {
        boolean isBlank;
        boolean isBlank2;
        isBlank = StringsKt__StringsJVMKt.isBlank(getConfiguration().getFinancialConnectionsSessionClientSecret());
        if (!isBlank) {
            isBlank2 = StringsKt__StringsJVMKt.isBlank(getConfiguration().getPublishableKey());
            if (!isBlank2) {
                return;
            }
            throw new InvalidParameterException("The publishable key cannot be an empty string.");
        }
        throw new InvalidParameterException("The session client secret cannot be an empty string.");
    }

    private FinancialConnectionsSheetActivityArgs(FinancialConnectionsSheet.Configuration configuration) {
        this.configuration = configuration;
    }
}
