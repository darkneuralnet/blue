package com.stripe.android.financialconnections.features.attachpayment;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0018B'\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003J)\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;", "LAN2;", "Ldp;", "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState$Payload;", "component1", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "component2", "payload", "linkPaymentAccount", "copy", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ldp;", "getPayload", "()Ldp;", "getLinkPaymentAccount", "<init>", "(Ldp;Ldp;)V", "Payload", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class AttachPaymentState implements AN2 {
    private final AbstractC19862dp<LinkAccountSessionPaymentAccount> linkPaymentAccount;
    private final AbstractC19862dp<Payload> payload;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState$Payload;", "", "accountsCount", "", "businessName", "", "(ILjava/lang/String;)V", "getAccountsCount", "()I", "getBusinessName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Payload {
        public static final int $stable = 0;
        private final int accountsCount;
        private final String businessName;

        public Payload(int i, String str) {
            this.accountsCount = i;
            this.businessName = str;
        }

        public static /* synthetic */ Payload copy$default(Payload payload, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = payload.accountsCount;
            }
            if ((i2 & 2) != 0) {
                str = payload.businessName;
            }
            return payload.copy(i, str);
        }

        public final int component1() {
            return this.accountsCount;
        }

        public final String component2() {
            return this.businessName;
        }

        public final Payload copy(int i, String str) {
            return new Payload(i, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Payload) {
                Payload payload = (Payload) obj;
                return this.accountsCount == payload.accountsCount && Intrinsics.areEqual(this.businessName, payload.businessName);
            }
            return false;
        }

        public final int getAccountsCount() {
            return this.accountsCount;
        }

        public final String getBusinessName() {
            return this.businessName;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.accountsCount) * 31;
            String str = this.businessName;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            int i = this.accountsCount;
            String str = this.businessName;
            return "Payload(accountsCount=" + i + ", businessName=" + str + ")";
        }
    }

    public AttachPaymentState() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AttachPaymentState copy$default(AttachPaymentState attachPaymentState, AbstractC19862dp abstractC19862dp, AbstractC19862dp abstractC19862dp2, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC19862dp = attachPaymentState.payload;
        }
        if ((i & 2) != 0) {
            abstractC19862dp2 = attachPaymentState.linkPaymentAccount;
        }
        return attachPaymentState.copy(abstractC19862dp, abstractC19862dp2);
    }

    public final AbstractC19862dp<Payload> component1() {
        return this.payload;
    }

    public final AbstractC19862dp<LinkAccountSessionPaymentAccount> component2() {
        return this.linkPaymentAccount;
    }

    public final AttachPaymentState copy(AbstractC19862dp<Payload> payload, AbstractC19862dp<LinkAccountSessionPaymentAccount> linkPaymentAccount) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(linkPaymentAccount, "linkPaymentAccount");
        return new AttachPaymentState(payload, linkPaymentAccount);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AttachPaymentState) {
            AttachPaymentState attachPaymentState = (AttachPaymentState) obj;
            return Intrinsics.areEqual(this.payload, attachPaymentState.payload) && Intrinsics.areEqual(this.linkPaymentAccount, attachPaymentState.linkPaymentAccount);
        }
        return false;
    }

    public final AbstractC19862dp<LinkAccountSessionPaymentAccount> getLinkPaymentAccount() {
        return this.linkPaymentAccount;
    }

    public final AbstractC19862dp<Payload> getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return (this.payload.hashCode() * 31) + this.linkPaymentAccount.hashCode();
    }

    public String toString() {
        AbstractC19862dp<Payload> abstractC19862dp = this.payload;
        AbstractC19862dp<LinkAccountSessionPaymentAccount> abstractC19862dp2 = this.linkPaymentAccount;
        return "AttachPaymentState(payload=" + abstractC19862dp + ", linkPaymentAccount=" + abstractC19862dp2 + ")";
    }

    public AttachPaymentState(AbstractC19862dp<Payload> payload, AbstractC19862dp<LinkAccountSessionPaymentAccount> linkPaymentAccount) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(linkPaymentAccount, "linkPaymentAccount");
        this.payload = payload;
        this.linkPaymentAccount = linkPaymentAccount;
    }

    public /* synthetic */ AttachPaymentState(AbstractC19862dp abstractC19862dp, AbstractC19862dp abstractC19862dp2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C34454Md6.f23316e : abstractC19862dp, (i & 2) != 0 ? C34454Md6.f23316e : abstractC19862dp2);
    }
}
