package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/model/FinancialConnectionsSession;", "Lcom/stripe/android/core/model/StripeModel;", "clientSecret", "", "id", "(Ljava/lang/String;Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FinancialConnectionsSession implements StripeModel {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FinancialConnectionsSession> CREATOR = new Creator();
    private final String clientSecret;

    /* renamed from: id */
    private final String f75356id;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsSession> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSession createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FinancialConnectionsSession(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSession[] newArray(int i) {
            return new FinancialConnectionsSession[i];
        }
    }

    public FinancialConnectionsSession(String str, String str2) {
        this.clientSecret = str;
        this.f75356id = str2;
    }

    public static /* synthetic */ FinancialConnectionsSession copy$default(FinancialConnectionsSession financialConnectionsSession, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = financialConnectionsSession.clientSecret;
        }
        if ((i & 2) != 0) {
            str2 = financialConnectionsSession.f75356id;
        }
        return financialConnectionsSession.copy(str, str2);
    }

    public final String component1() {
        return this.clientSecret;
    }

    public final String component2() {
        return this.f75356id;
    }

    public final FinancialConnectionsSession copy(String str, String str2) {
        return new FinancialConnectionsSession(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FinancialConnectionsSession) {
            FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) obj;
            return Intrinsics.areEqual(this.clientSecret, financialConnectionsSession.clientSecret) && Intrinsics.areEqual(this.f75356id, financialConnectionsSession.f75356id);
        }
        return false;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getId() {
        return this.f75356id;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.clientSecret;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f75356id;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.clientSecret;
        String str2 = this.f75356id;
        return "FinancialConnectionsSession(clientSecret=" + str + ", id=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.clientSecret);
        out.writeString(this.f75356id);
    }
}
