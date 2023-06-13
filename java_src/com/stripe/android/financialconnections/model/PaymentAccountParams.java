package com.stripe.android.financialconnections.model;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.ConsumerPaymentDetails;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/PaymentAccountParams;", "", "type", "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "toParamMap", "", "BankAccount", "LinkedAccount", "Lcom/stripe/android/financialconnections/model/PaymentAccountParams$BankAccount;", "Lcom/stripe/android/financialconnections/model/PaymentAccountParams$LinkedAccount;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class PaymentAccountParams {
    private final String type;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/PaymentAccountParams$BankAccount;", "Lcom/stripe/android/financialconnections/model/PaymentAccountParams;", "routingNumber", "", "accountNumber", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getRoutingNumber", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toParamMap", "", "toString", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class BankAccount extends PaymentAccountParams {
        public static final int $stable = 0;
        private final String accountNumber;
        private final String routingNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankAccount(String routingNumber, String accountNumber) {
            super(ConsumerPaymentDetails.BankAccount.type, null);
            Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.routingNumber = routingNumber;
            this.accountNumber = accountNumber;
        }

        public static /* synthetic */ BankAccount copy$default(BankAccount bankAccount, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bankAccount.routingNumber;
            }
            if ((i & 2) != 0) {
                str2 = bankAccount.accountNumber;
            }
            return bankAccount.copy(str, str2);
        }

        public final String component1() {
            return this.routingNumber;
        }

        public final String component2() {
            return this.accountNumber;
        }

        public final BankAccount copy(String routingNumber, String accountNumber) {
            Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new BankAccount(routingNumber, accountNumber);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BankAccount) {
                BankAccount bankAccount = (BankAccount) obj;
                return Intrinsics.areEqual(this.routingNumber, bankAccount.routingNumber) && Intrinsics.areEqual(this.accountNumber, bankAccount.accountNumber);
            }
            return false;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getRoutingNumber() {
            return this.routingNumber;
        }

        public int hashCode() {
            return (this.routingNumber.hashCode() * 31) + this.accountNumber.hashCode();
        }

        @Override // com.stripe.android.financialconnections.model.PaymentAccountParams
        public Map<String, String> toParamMap() {
            Map<String, String> mapOf;
            String type = getType();
            String type2 = getType();
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("type", getType()), TuplesKt.m28425to(type + "[routing_number]", this.routingNumber), TuplesKt.m28425to(type2 + "[account_number]", this.accountNumber));
            return mapOf;
        }

        public String toString() {
            String str = this.routingNumber;
            String str2 = this.accountNumber;
            return "BankAccount(routingNumber=" + str + ", accountNumber=" + str2 + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/PaymentAccountParams$LinkedAccount;", "Lcom/stripe/android/financialconnections/model/PaymentAccountParams;", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toParamMap", "", "toString", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class LinkedAccount extends PaymentAccountParams {
        public static final int $stable = 0;

        /* renamed from: id */
        private final String f75314id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkedAccount(String id) {
            super("linked_account", null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.f75314id = id;
        }

        public static /* synthetic */ LinkedAccount copy$default(LinkedAccount linkedAccount, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = linkedAccount.f75314id;
            }
            return linkedAccount.copy(str);
        }

        public final String component1() {
            return this.f75314id;
        }

        public final LinkedAccount copy(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new LinkedAccount(id);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LinkedAccount) && Intrinsics.areEqual(this.f75314id, ((LinkedAccount) obj).f75314id);
        }

        public final String getId() {
            return this.f75314id;
        }

        public int hashCode() {
            return this.f75314id.hashCode();
        }

        @Override // com.stripe.android.financialconnections.model.PaymentAccountParams
        public Map<String, String> toParamMap() {
            Map<String, String> mapOf;
            String type = getType();
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("type", getType()), TuplesKt.m28425to(type + "[id]", this.f75314id));
            return mapOf;
        }

        public String toString() {
            String str = this.f75314id;
            return "LinkedAccount(id=" + str + ")";
        }
    }

    public /* synthetic */ PaymentAccountParams(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getType() {
        return this.type;
    }

    public abstract Map<String, String> toParamMap();

    private PaymentAccountParams(String str) {
        this.type = str;
    }
}
