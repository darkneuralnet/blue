package com.stripe.android.financialconnections.launcher;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;", "Landroid/os/Parcelable;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "initialSyncResponse", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "getInitialSyncResponse", "()Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeActivityArgs implements Parcelable {
    public static final Parcelable.Creator<FinancialConnectionsSheetNativeActivityArgs> CREATOR = new Creator();
    private final FinancialConnectionsSheet.Configuration configuration;
    private final SynchronizeSessionResponse initialSyncResponse;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsSheetNativeActivityArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSheetNativeActivityArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FinancialConnectionsSheetNativeActivityArgs(FinancialConnectionsSheet.Configuration.CREATOR.createFromParcel(parcel), SynchronizeSessionResponse.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSheetNativeActivityArgs[] newArray(int i) {
            return new FinancialConnectionsSheetNativeActivityArgs[i];
        }
    }

    public FinancialConnectionsSheetNativeActivityArgs(FinancialConnectionsSheet.Configuration configuration, SynchronizeSessionResponse initialSyncResponse) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(initialSyncResponse, "initialSyncResponse");
        this.configuration = configuration;
        this.initialSyncResponse = initialSyncResponse;
    }

    public static /* synthetic */ FinancialConnectionsSheetNativeActivityArgs copy$default(FinancialConnectionsSheetNativeActivityArgs financialConnectionsSheetNativeActivityArgs, FinancialConnectionsSheet.Configuration configuration, SynchronizeSessionResponse synchronizeSessionResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            configuration = financialConnectionsSheetNativeActivityArgs.configuration;
        }
        if ((i & 2) != 0) {
            synchronizeSessionResponse = financialConnectionsSheetNativeActivityArgs.initialSyncResponse;
        }
        return financialConnectionsSheetNativeActivityArgs.copy(configuration, synchronizeSessionResponse);
    }

    public final FinancialConnectionsSheet.Configuration component1() {
        return this.configuration;
    }

    public final SynchronizeSessionResponse component2() {
        return this.initialSyncResponse;
    }

    public final FinancialConnectionsSheetNativeActivityArgs copy(FinancialConnectionsSheet.Configuration configuration, SynchronizeSessionResponse initialSyncResponse) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(initialSyncResponse, "initialSyncResponse");
        return new FinancialConnectionsSheetNativeActivityArgs(configuration, initialSyncResponse);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FinancialConnectionsSheetNativeActivityArgs) {
            FinancialConnectionsSheetNativeActivityArgs financialConnectionsSheetNativeActivityArgs = (FinancialConnectionsSheetNativeActivityArgs) obj;
            return Intrinsics.areEqual(this.configuration, financialConnectionsSheetNativeActivityArgs.configuration) && Intrinsics.areEqual(this.initialSyncResponse, financialConnectionsSheetNativeActivityArgs.initialSyncResponse);
        }
        return false;
    }

    public final FinancialConnectionsSheet.Configuration getConfiguration() {
        return this.configuration;
    }

    public final SynchronizeSessionResponse getInitialSyncResponse() {
        return this.initialSyncResponse;
    }

    public int hashCode() {
        return (this.configuration.hashCode() * 31) + this.initialSyncResponse.hashCode();
    }

    public String toString() {
        FinancialConnectionsSheet.Configuration configuration = this.configuration;
        SynchronizeSessionResponse synchronizeSessionResponse = this.initialSyncResponse;
        return "FinancialConnectionsSheetNativeActivityArgs(configuration=" + configuration + ", initialSyncResponse=" + synchronizeSessionResponse + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.configuration.writeToParcel(out, i);
        this.initialSyncResponse.writeToParcel(out, i);
    }
}
