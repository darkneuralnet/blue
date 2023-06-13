package com.stripe.android.payments.bankaccount.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.StripeIntent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;", "Lcom/stripe/android/core/model/StripeModel;", "intent", "Lcom/stripe/android/model/StripeIntent;", "financialConnectionsSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V", "getFinancialConnectionsSession", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "getIntent", "()Lcom/stripe/android/model/StripeIntent;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class CollectBankAccountResponse implements StripeModel {
    public static final int $stable = FinancialConnectionsSession.$stable;
    public static final Parcelable.Creator<CollectBankAccountResponse> CREATOR = new Creator();
    private final FinancialConnectionsSession financialConnectionsSession;
    private final StripeIntent intent;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<CollectBankAccountResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollectBankAccountResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CollectBankAccountResponse((StripeIntent) parcel.readParcelable(CollectBankAccountResponse.class.getClassLoader()), (FinancialConnectionsSession) parcel.readParcelable(CollectBankAccountResponse.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollectBankAccountResponse[] newArray(int i) {
            return new CollectBankAccountResponse[i];
        }
    }

    public CollectBankAccountResponse(StripeIntent intent, FinancialConnectionsSession financialConnectionsSession) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(financialConnectionsSession, "financialConnectionsSession");
        this.intent = intent;
        this.financialConnectionsSession = financialConnectionsSession;
    }

    public static /* synthetic */ CollectBankAccountResponse copy$default(CollectBankAccountResponse collectBankAccountResponse, StripeIntent stripeIntent, FinancialConnectionsSession financialConnectionsSession, int i, Object obj) {
        if ((i & 1) != 0) {
            stripeIntent = collectBankAccountResponse.intent;
        }
        if ((i & 2) != 0) {
            financialConnectionsSession = collectBankAccountResponse.financialConnectionsSession;
        }
        return collectBankAccountResponse.copy(stripeIntent, financialConnectionsSession);
    }

    public final StripeIntent component1() {
        return this.intent;
    }

    public final FinancialConnectionsSession component2() {
        return this.financialConnectionsSession;
    }

    public final CollectBankAccountResponse copy(StripeIntent intent, FinancialConnectionsSession financialConnectionsSession) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(financialConnectionsSession, "financialConnectionsSession");
        return new CollectBankAccountResponse(intent, financialConnectionsSession);
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
        if (obj instanceof CollectBankAccountResponse) {
            CollectBankAccountResponse collectBankAccountResponse = (CollectBankAccountResponse) obj;
            return Intrinsics.areEqual(this.intent, collectBankAccountResponse.intent) && Intrinsics.areEqual(this.financialConnectionsSession, collectBankAccountResponse.financialConnectionsSession);
        }
        return false;
    }

    public final FinancialConnectionsSession getFinancialConnectionsSession() {
        return this.financialConnectionsSession;
    }

    public final StripeIntent getIntent() {
        return this.intent;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (this.intent.hashCode() * 31) + this.financialConnectionsSession.hashCode();
    }

    public String toString() {
        StripeIntent stripeIntent = this.intent;
        FinancialConnectionsSession financialConnectionsSession = this.financialConnectionsSession;
        return "CollectBankAccountResponse(intent=" + stripeIntent + ", financialConnectionsSession=" + financialConnectionsSession + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.intent, i);
        out.writeParcelable(this.financialConnectionsSession, i);
    }
}
