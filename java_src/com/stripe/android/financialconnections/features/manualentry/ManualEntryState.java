package com.stripe.android.financialconnections.features.manualentry;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001:\u00013Bo\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007¢\u0006\u0004\b1\u00102J\u001c\u0010\u0006\u001a\u00020\u0005*\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0002J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007HÆ\u0003Jx\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010*\u001a\u0004\b+\u0010\u000eR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010*\u001a\u0004\b,\u0010\u000eR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b-\u0010\u000eR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b.\u0010$R\u0011\u0010/\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00064"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "LAN2;", "Lkotlin/Pair;", "", "", "", "valid", "Ldp;", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;", "component1", "component2", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component6", "component7", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "component8", "payload", "routing", "account", "accountConfirm", "routingError", "accountError", "accountConfirmError", "linkPaymentAccount", "copy", "(Ldp;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ldp;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ldp;", "getPayload", "()Ldp;", "Ljava/lang/String;", "getRouting", "()Ljava/lang/String;", "getAccount", "getAccountConfirm", "Ljava/lang/Integer;", "getRoutingError", "getAccountError", "getAccountConfirmError", "getLinkPaymentAccount", "isValidForm", "()Z", "<init>", "(Ldp;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ldp;)V", "Payload", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class ManualEntryState implements AN2 {
    private final String account;
    private final String accountConfirm;
    private final Integer accountConfirmError;
    private final Integer accountError;
    private final AbstractC19862dp<LinkAccountSessionPaymentAccount> linkPaymentAccount;
    private final AbstractC19862dp<Payload> payload;
    private final String routing;
    private final Integer routingError;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;", "", "verifyWithMicrodeposits", "", "customManualEntry", "(ZZ)V", "getCustomManualEntry", "()Z", "getVerifyWithMicrodeposits", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Payload {
        public static final int $stable = 0;
        private final boolean customManualEntry;
        private final boolean verifyWithMicrodeposits;

        public Payload(boolean z, boolean z2) {
            this.verifyWithMicrodeposits = z;
            this.customManualEntry = z2;
        }

        public static /* synthetic */ Payload copy$default(Payload payload, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = payload.verifyWithMicrodeposits;
            }
            if ((i & 2) != 0) {
                z2 = payload.customManualEntry;
            }
            return payload.copy(z, z2);
        }

        public final boolean component1() {
            return this.verifyWithMicrodeposits;
        }

        public final boolean component2() {
            return this.customManualEntry;
        }

        public final Payload copy(boolean z, boolean z2) {
            return new Payload(z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Payload) {
                Payload payload = (Payload) obj;
                return this.verifyWithMicrodeposits == payload.verifyWithMicrodeposits && this.customManualEntry == payload.customManualEntry;
            }
            return false;
        }

        public final boolean getCustomManualEntry() {
            return this.customManualEntry;
        }

        public final boolean getVerifyWithMicrodeposits() {
            return this.verifyWithMicrodeposits;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.verifyWithMicrodeposits;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            boolean z2 = this.customManualEntry;
            return i + (z2 ? 1 : z2 ? 1 : 0);
        }

        public String toString() {
            boolean z = this.verifyWithMicrodeposits;
            boolean z2 = this.customManualEntry;
            return "Payload(verifyWithMicrodeposits=" + z + ", customManualEntry=" + z2 + ")";
        }
    }

    public ManualEntryState() {
        this(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    private final boolean valid(Pair<String, Integer> pair) {
        return pair.getFirst() != null && pair.getSecond() == null;
    }

    public final AbstractC19862dp<Payload> component1() {
        return this.payload;
    }

    public final String component2() {
        return this.routing;
    }

    public final String component3() {
        return this.account;
    }

    public final String component4() {
        return this.accountConfirm;
    }

    public final Integer component5() {
        return this.routingError;
    }

    public final Integer component6() {
        return this.accountError;
    }

    public final Integer component7() {
        return this.accountConfirmError;
    }

    public final AbstractC19862dp<LinkAccountSessionPaymentAccount> component8() {
        return this.linkPaymentAccount;
    }

    public final ManualEntryState copy(AbstractC19862dp<Payload> payload, String str, String str2, String str3, Integer num, Integer num2, Integer num3, AbstractC19862dp<LinkAccountSessionPaymentAccount> linkPaymentAccount) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(linkPaymentAccount, "linkPaymentAccount");
        return new ManualEntryState(payload, str, str2, str3, num, num2, num3, linkPaymentAccount);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ManualEntryState) {
            ManualEntryState manualEntryState = (ManualEntryState) obj;
            return Intrinsics.areEqual(this.payload, manualEntryState.payload) && Intrinsics.areEqual(this.routing, manualEntryState.routing) && Intrinsics.areEqual(this.account, manualEntryState.account) && Intrinsics.areEqual(this.accountConfirm, manualEntryState.accountConfirm) && Intrinsics.areEqual(this.routingError, manualEntryState.routingError) && Intrinsics.areEqual(this.accountError, manualEntryState.accountError) && Intrinsics.areEqual(this.accountConfirmError, manualEntryState.accountConfirmError) && Intrinsics.areEqual(this.linkPaymentAccount, manualEntryState.linkPaymentAccount);
        }
        return false;
    }

    public final String getAccount() {
        return this.account;
    }

    public final String getAccountConfirm() {
        return this.accountConfirm;
    }

    public final Integer getAccountConfirmError() {
        return this.accountConfirmError;
    }

    public final Integer getAccountError() {
        return this.accountError;
    }

    public final AbstractC19862dp<LinkAccountSessionPaymentAccount> getLinkPaymentAccount() {
        return this.linkPaymentAccount;
    }

    public final AbstractC19862dp<Payload> getPayload() {
        return this.payload;
    }

    public final String getRouting() {
        return this.routing;
    }

    public final Integer getRoutingError() {
        return this.routingError;
    }

    public int hashCode() {
        int hashCode = this.payload.hashCode() * 31;
        String str = this.routing;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.account;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accountConfirm;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.routingError;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.accountError;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.accountConfirmError;
        return ((hashCode6 + (num3 != null ? num3.hashCode() : 0)) * 31) + this.linkPaymentAccount.hashCode();
    }

    public final boolean isValidForm() {
        if (valid(TuplesKt.m28425to(this.routing, this.routingError)) && valid(TuplesKt.m28425to(this.account, this.accountError)) && valid(TuplesKt.m28425to(this.accountConfirm, this.accountConfirmError))) {
            return true;
        }
        return false;
    }

    public String toString() {
        AbstractC19862dp<Payload> abstractC19862dp = this.payload;
        String str = this.routing;
        String str2 = this.account;
        String str3 = this.accountConfirm;
        Integer num = this.routingError;
        Integer num2 = this.accountError;
        Integer num3 = this.accountConfirmError;
        AbstractC19862dp<LinkAccountSessionPaymentAccount> abstractC19862dp2 = this.linkPaymentAccount;
        return "ManualEntryState(payload=" + abstractC19862dp + ", routing=" + str + ", account=" + str2 + ", accountConfirm=" + str3 + ", routingError=" + num + ", accountError=" + num2 + ", accountConfirmError=" + num3 + ", linkPaymentAccount=" + abstractC19862dp2 + ")";
    }

    public ManualEntryState(AbstractC19862dp<Payload> payload, String str, String str2, String str3, Integer num, Integer num2, Integer num3, AbstractC19862dp<LinkAccountSessionPaymentAccount> linkPaymentAccount) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(linkPaymentAccount, "linkPaymentAccount");
        this.payload = payload;
        this.routing = str;
        this.account = str2;
        this.accountConfirm = str3;
        this.routingError = num;
        this.accountError = num2;
        this.accountConfirmError = num3;
        this.linkPaymentAccount = linkPaymentAccount;
    }

    public /* synthetic */ ManualEntryState(AbstractC19862dp abstractC19862dp, String str, String str2, String str3, Integer num, Integer num2, Integer num3, AbstractC19862dp abstractC19862dp2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C34454Md6.f23316e : abstractC19862dp, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) == 0 ? num3 : null, (i & 128) != 0 ? C34454Md6.f23316e : abstractC19862dp2);
    }
}
