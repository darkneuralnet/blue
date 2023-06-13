package com.stripe.android.financialconnections.features.success;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.features.common.AccessibleDataCalloutModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0018B'\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003J)\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/success/SuccessState;", "LAN2;", "Ldp;", "Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;", "component1", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "component2", "payload", "completeSession", "copy", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ldp;", "getPayload", "()Ldp;", "getCompleteSession", "<init>", "(Ldp;Ldp;)V", "Payload", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class SuccessState implements AN2 {
    private final AbstractC19862dp<FinancialConnectionsSession> completeSession;
    private final AbstractC19862dp<Payload> payload;

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003JQ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006("}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;", "", "accessibleData", "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;", "showLinkAnotherAccount", "", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "accounts", "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "disconnectUrl", "", "businessName", "skipSuccessPane", "(Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/PartnerAccountsList;Ljava/lang/String;Ljava/lang/String;Z)V", "getAccessibleData", "()Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;", "getAccounts", "()Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "getBusinessName", "()Ljava/lang/String;", "getDisconnectUrl", "getInstitution", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "getShowLinkAnotherAccount", "()Z", "getSkipSuccessPane", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Payload {
        public static final int $stable = 8;
        private final AccessibleDataCalloutModel accessibleData;
        private final PartnerAccountsList accounts;
        private final String businessName;
        private final String disconnectUrl;
        private final FinancialConnectionsInstitution institution;
        private final boolean showLinkAnotherAccount;
        private final boolean skipSuccessPane;

        public Payload(AccessibleDataCalloutModel accessibleData, boolean z, FinancialConnectionsInstitution institution, PartnerAccountsList accounts, String disconnectUrl, String str, boolean z2) {
            Intrinsics.checkNotNullParameter(accessibleData, "accessibleData");
            Intrinsics.checkNotNullParameter(institution, "institution");
            Intrinsics.checkNotNullParameter(accounts, "accounts");
            Intrinsics.checkNotNullParameter(disconnectUrl, "disconnectUrl");
            this.accessibleData = accessibleData;
            this.showLinkAnotherAccount = z;
            this.institution = institution;
            this.accounts = accounts;
            this.disconnectUrl = disconnectUrl;
            this.businessName = str;
            this.skipSuccessPane = z2;
        }

        public static /* synthetic */ Payload copy$default(Payload payload, AccessibleDataCalloutModel accessibleDataCalloutModel, boolean z, FinancialConnectionsInstitution financialConnectionsInstitution, PartnerAccountsList partnerAccountsList, String str, String str2, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                accessibleDataCalloutModel = payload.accessibleData;
            }
            if ((i & 2) != 0) {
                z = payload.showLinkAnotherAccount;
            }
            boolean z3 = z;
            if ((i & 4) != 0) {
                financialConnectionsInstitution = payload.institution;
            }
            FinancialConnectionsInstitution financialConnectionsInstitution2 = financialConnectionsInstitution;
            if ((i & 8) != 0) {
                partnerAccountsList = payload.accounts;
            }
            PartnerAccountsList partnerAccountsList2 = partnerAccountsList;
            if ((i & 16) != 0) {
                str = payload.disconnectUrl;
            }
            String str3 = str;
            if ((i & 32) != 0) {
                str2 = payload.businessName;
            }
            String str4 = str2;
            if ((i & 64) != 0) {
                z2 = payload.skipSuccessPane;
            }
            return payload.copy(accessibleDataCalloutModel, z3, financialConnectionsInstitution2, partnerAccountsList2, str3, str4, z2);
        }

        public final AccessibleDataCalloutModel component1() {
            return this.accessibleData;
        }

        public final boolean component2() {
            return this.showLinkAnotherAccount;
        }

        public final FinancialConnectionsInstitution component3() {
            return this.institution;
        }

        public final PartnerAccountsList component4() {
            return this.accounts;
        }

        public final String component5() {
            return this.disconnectUrl;
        }

        public final String component6() {
            return this.businessName;
        }

        public final boolean component7() {
            return this.skipSuccessPane;
        }

        public final Payload copy(AccessibleDataCalloutModel accessibleData, boolean z, FinancialConnectionsInstitution institution, PartnerAccountsList accounts, String disconnectUrl, String str, boolean z2) {
            Intrinsics.checkNotNullParameter(accessibleData, "accessibleData");
            Intrinsics.checkNotNullParameter(institution, "institution");
            Intrinsics.checkNotNullParameter(accounts, "accounts");
            Intrinsics.checkNotNullParameter(disconnectUrl, "disconnectUrl");
            return new Payload(accessibleData, z, institution, accounts, disconnectUrl, str, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Payload) {
                Payload payload = (Payload) obj;
                return Intrinsics.areEqual(this.accessibleData, payload.accessibleData) && this.showLinkAnotherAccount == payload.showLinkAnotherAccount && Intrinsics.areEqual(this.institution, payload.institution) && Intrinsics.areEqual(this.accounts, payload.accounts) && Intrinsics.areEqual(this.disconnectUrl, payload.disconnectUrl) && Intrinsics.areEqual(this.businessName, payload.businessName) && this.skipSuccessPane == payload.skipSuccessPane;
            }
            return false;
        }

        public final AccessibleDataCalloutModel getAccessibleData() {
            return this.accessibleData;
        }

        public final PartnerAccountsList getAccounts() {
            return this.accounts;
        }

        public final String getBusinessName() {
            return this.businessName;
        }

        public final String getDisconnectUrl() {
            return this.disconnectUrl;
        }

        public final FinancialConnectionsInstitution getInstitution() {
            return this.institution;
        }

        public final boolean getShowLinkAnotherAccount() {
            return this.showLinkAnotherAccount;
        }

        public final boolean getSkipSuccessPane() {
            return this.skipSuccessPane;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.accessibleData.hashCode() * 31;
            boolean z = this.showLinkAnotherAccount;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int hashCode2 = (((((((hashCode + i) * 31) + this.institution.hashCode()) * 31) + this.accounts.hashCode()) * 31) + this.disconnectUrl.hashCode()) * 31;
            String str = this.businessName;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            boolean z2 = this.skipSuccessPane;
            return hashCode3 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public String toString() {
            AccessibleDataCalloutModel accessibleDataCalloutModel = this.accessibleData;
            boolean z = this.showLinkAnotherAccount;
            FinancialConnectionsInstitution financialConnectionsInstitution = this.institution;
            PartnerAccountsList partnerAccountsList = this.accounts;
            String str = this.disconnectUrl;
            String str2 = this.businessName;
            boolean z2 = this.skipSuccessPane;
            return "Payload(accessibleData=" + accessibleDataCalloutModel + ", showLinkAnotherAccount=" + z + ", institution=" + financialConnectionsInstitution + ", accounts=" + partnerAccountsList + ", disconnectUrl=" + str + ", businessName=" + str2 + ", skipSuccessPane=" + z2 + ")";
        }
    }

    public SuccessState() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuccessState copy$default(SuccessState successState, AbstractC19862dp abstractC19862dp, AbstractC19862dp abstractC19862dp2, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC19862dp = successState.payload;
        }
        if ((i & 2) != 0) {
            abstractC19862dp2 = successState.completeSession;
        }
        return successState.copy(abstractC19862dp, abstractC19862dp2);
    }

    public final AbstractC19862dp<Payload> component1() {
        return this.payload;
    }

    public final AbstractC19862dp<FinancialConnectionsSession> component2() {
        return this.completeSession;
    }

    public final SuccessState copy(AbstractC19862dp<Payload> payload, AbstractC19862dp<FinancialConnectionsSession> completeSession) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(completeSession, "completeSession");
        return new SuccessState(payload, completeSession);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SuccessState) {
            SuccessState successState = (SuccessState) obj;
            return Intrinsics.areEqual(this.payload, successState.payload) && Intrinsics.areEqual(this.completeSession, successState.completeSession);
        }
        return false;
    }

    public final AbstractC19862dp<FinancialConnectionsSession> getCompleteSession() {
        return this.completeSession;
    }

    public final AbstractC19862dp<Payload> getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return (this.payload.hashCode() * 31) + this.completeSession.hashCode();
    }

    public String toString() {
        AbstractC19862dp<Payload> abstractC19862dp = this.payload;
        AbstractC19862dp<FinancialConnectionsSession> abstractC19862dp2 = this.completeSession;
        return "SuccessState(payload=" + abstractC19862dp + ", completeSession=" + abstractC19862dp2 + ")";
    }

    public SuccessState(AbstractC19862dp<Payload> payload, AbstractC19862dp<FinancialConnectionsSession> completeSession) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(completeSession, "completeSession");
        this.payload = payload;
        this.completeSession = completeSession;
    }

    public /* synthetic */ SuccessState(AbstractC19862dp abstractC19862dp, AbstractC19862dp abstractC19862dp2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C34454Md6.f23316e : abstractC19862dp, (i & 2) != 0 ? C34454Md6.f23316e : abstractC19862dp2);
    }
}
