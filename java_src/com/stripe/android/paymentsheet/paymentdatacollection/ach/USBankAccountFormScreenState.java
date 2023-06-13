package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.model.BankAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B\u0013\b\u0004\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0012H&R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u0082\u0001\u0004\u0017\u0018\u0019\u001a¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;", "", "error", "", "(Ljava/lang/Integer;)V", "getError", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "mandateText", "", "getMandateText", "()Ljava/lang/String;", "primaryButtonText", "getPrimaryButtonText", "updateInputs", "name", "email", "saveForFutureUsage", "", "MandateCollection", "NameAndEmailCollection", "SavedAccount", "VerifyWithMicrodeposits", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class USBankAccountFormScreenState {
    private final Integer error;

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J]\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\"\u0010(\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;", "name", "", "email", "paymentAccount", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "financialConnectionsSessionId", "intentId", "primaryButtonText", "mandateText", "saveForFutureUsage", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getEmail", "()Ljava/lang/String;", "getFinancialConnectionsSessionId", "getIntentId", "getMandateText", "getName", "getPaymentAccount", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "getPrimaryButtonText", "getSaveForFutureUsage", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "updateInputs", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class MandateCollection extends USBankAccountFormScreenState {
        public static final int $stable = FinancialConnectionsAccount.$stable;
        private final String email;
        private final String financialConnectionsSessionId;
        private final String intentId;
        private final String mandateText;
        private final String name;
        private final FinancialConnectionsAccount paymentAccount;
        private final String primaryButtonText;
        private final boolean saveForFutureUsage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MandateCollection(String name, String str, FinancialConnectionsAccount paymentAccount, String financialConnectionsSessionId, String intentId, String primaryButtonText, String str2, boolean z) {
            super(null, 1, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(paymentAccount, "paymentAccount");
            Intrinsics.checkNotNullParameter(financialConnectionsSessionId, "financialConnectionsSessionId");
            Intrinsics.checkNotNullParameter(intentId, "intentId");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            this.name = name;
            this.email = str;
            this.paymentAccount = paymentAccount;
            this.financialConnectionsSessionId = financialConnectionsSessionId;
            this.intentId = intentId;
            this.primaryButtonText = primaryButtonText;
            this.mandateText = str2;
            this.saveForFutureUsage = z;
        }

        public static /* synthetic */ MandateCollection copy$default(MandateCollection mandateCollection, String str, String str2, FinancialConnectionsAccount financialConnectionsAccount, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
            return mandateCollection.copy((i & 1) != 0 ? mandateCollection.name : str, (i & 2) != 0 ? mandateCollection.email : str2, (i & 4) != 0 ? mandateCollection.paymentAccount : financialConnectionsAccount, (i & 8) != 0 ? mandateCollection.financialConnectionsSessionId : str3, (i & 16) != 0 ? mandateCollection.intentId : str4, (i & 32) != 0 ? mandateCollection.getPrimaryButtonText() : str5, (i & 64) != 0 ? mandateCollection.getMandateText() : str6, (i & 128) != 0 ? mandateCollection.saveForFutureUsage : z);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.email;
        }

        public final FinancialConnectionsAccount component3() {
            return this.paymentAccount;
        }

        public final String component4() {
            return this.financialConnectionsSessionId;
        }

        public final String component5() {
            return this.intentId;
        }

        public final String component6() {
            return getPrimaryButtonText();
        }

        public final String component7() {
            return getMandateText();
        }

        public final boolean component8() {
            return this.saveForFutureUsage;
        }

        public final MandateCollection copy(String name, String str, FinancialConnectionsAccount paymentAccount, String financialConnectionsSessionId, String intentId, String primaryButtonText, String str2, boolean z) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(paymentAccount, "paymentAccount");
            Intrinsics.checkNotNullParameter(financialConnectionsSessionId, "financialConnectionsSessionId");
            Intrinsics.checkNotNullParameter(intentId, "intentId");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            return new MandateCollection(name, str, paymentAccount, financialConnectionsSessionId, intentId, primaryButtonText, str2, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MandateCollection) {
                MandateCollection mandateCollection = (MandateCollection) obj;
                return Intrinsics.areEqual(this.name, mandateCollection.name) && Intrinsics.areEqual(this.email, mandateCollection.email) && Intrinsics.areEqual(this.paymentAccount, mandateCollection.paymentAccount) && Intrinsics.areEqual(this.financialConnectionsSessionId, mandateCollection.financialConnectionsSessionId) && Intrinsics.areEqual(this.intentId, mandateCollection.intentId) && Intrinsics.areEqual(getPrimaryButtonText(), mandateCollection.getPrimaryButtonText()) && Intrinsics.areEqual(getMandateText(), mandateCollection.getMandateText()) && this.saveForFutureUsage == mandateCollection.saveForFutureUsage;
            }
            return false;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getFinancialConnectionsSessionId() {
            return this.financialConnectionsSessionId;
        }

        public final String getIntentId() {
            return this.intentId;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public String getMandateText() {
            return this.mandateText;
        }

        public final String getName() {
            return this.name;
        }

        public final FinancialConnectionsAccount getPaymentAccount() {
            return this.paymentAccount;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        public final boolean getSaveForFutureUsage() {
            return this.saveForFutureUsage;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.email;
            int hashCode2 = (((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.paymentAccount.hashCode()) * 31) + this.financialConnectionsSessionId.hashCode()) * 31) + this.intentId.hashCode()) * 31) + getPrimaryButtonText().hashCode()) * 31) + (getMandateText() != null ? getMandateText().hashCode() : 0)) * 31;
            boolean z = this.saveForFutureUsage;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode2 + i;
        }

        public String toString() {
            String str = this.name;
            String str2 = this.email;
            FinancialConnectionsAccount financialConnectionsAccount = this.paymentAccount;
            String str3 = this.financialConnectionsSessionId;
            String str4 = this.intentId;
            String primaryButtonText = getPrimaryButtonText();
            String mandateText = getMandateText();
            boolean z = this.saveForFutureUsage;
            return "MandateCollection(name=" + str + ", email=" + str2 + ", paymentAccount=" + financialConnectionsAccount + ", financialConnectionsSessionId=" + str3 + ", intentId=" + str4 + ", primaryButtonText=" + primaryButtonText + ", mandateText=" + mandateText + ", saveForFutureUsage=" + z + ")";
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public MandateCollection updateInputs(String name, String str, boolean z) {
            Intrinsics.checkNotNullParameter(name, "name");
            return copy$default(this, name, str, null, null, null, null, null, z, 124, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\"\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;", "error", "", "name", "", "email", "primaryButtonText", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getError", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "mandateText", "getMandateText", "getName", "getPrimaryButtonText", "updateInputs", "saveForFutureUsage", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class NameAndEmailCollection extends USBankAccountFormScreenState {
        public static final int $stable = 0;
        private final String email;
        private final Integer error;
        private final String mandateText;
        private final String name;
        private final String primaryButtonText;

        public /* synthetic */ NameAndEmailCollection(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, str, str2, str3);
        }

        public final String getEmail() {
            return this.email;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public Integer getError() {
            return this.error;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public String getMandateText() {
            return this.mandateText;
        }

        public final String getName() {
            return this.name;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NameAndEmailCollection(Integer num, String name, String str, String primaryButtonText) {
            super(null, 1, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            this.error = num;
            this.name = name;
            this.email = str;
            this.primaryButtonText = primaryButtonText;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public NameAndEmailCollection updateInputs(String name, String str, boolean z) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new NameAndEmailCollection(getError(), name, str, getPrimaryButtonText());
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003Jk\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\"\u0010)\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006*"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;", "name", "", "email", "financialConnectionsSessionId", "intentId", "bankName", "last4", "primaryButtonText", "mandateText", "saveForFutureUsage", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getBankName", "()Ljava/lang/String;", "getEmail", "getFinancialConnectionsSessionId", "getIntentId", "getLast4", "getMandateText", "getName", "getPrimaryButtonText", "getSaveForFutureUsage", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "updateInputs", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class SavedAccount extends USBankAccountFormScreenState {
        public static final int $stable = 0;
        private final String bankName;
        private final String email;
        private final String financialConnectionsSessionId;
        private final String intentId;
        private final String last4;
        private final String mandateText;
        private final String name;
        private final String primaryButtonText;
        private final boolean saveForFutureUsage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedAccount(String name, String str, String str2, String intentId, String bankName, String str3, String primaryButtonText, String str4, boolean z) {
            super(null, 1, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(intentId, "intentId");
            Intrinsics.checkNotNullParameter(bankName, "bankName");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            this.name = name;
            this.email = str;
            this.financialConnectionsSessionId = str2;
            this.intentId = intentId;
            this.bankName = bankName;
            this.last4 = str3;
            this.primaryButtonText = primaryButtonText;
            this.mandateText = str4;
            this.saveForFutureUsage = z;
        }

        public static /* synthetic */ SavedAccount copy$default(SavedAccount savedAccount, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, int i, Object obj) {
            return savedAccount.copy((i & 1) != 0 ? savedAccount.name : str, (i & 2) != 0 ? savedAccount.email : str2, (i & 4) != 0 ? savedAccount.financialConnectionsSessionId : str3, (i & 8) != 0 ? savedAccount.intentId : str4, (i & 16) != 0 ? savedAccount.bankName : str5, (i & 32) != 0 ? savedAccount.last4 : str6, (i & 64) != 0 ? savedAccount.getPrimaryButtonText() : str7, (i & 128) != 0 ? savedAccount.getMandateText() : str8, (i & 256) != 0 ? savedAccount.saveForFutureUsage : z);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.email;
        }

        public final String component3() {
            return this.financialConnectionsSessionId;
        }

        public final String component4() {
            return this.intentId;
        }

        public final String component5() {
            return this.bankName;
        }

        public final String component6() {
            return this.last4;
        }

        public final String component7() {
            return getPrimaryButtonText();
        }

        public final String component8() {
            return getMandateText();
        }

        public final boolean component9() {
            return this.saveForFutureUsage;
        }

        public final SavedAccount copy(String name, String str, String str2, String intentId, String bankName, String str3, String primaryButtonText, String str4, boolean z) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(intentId, "intentId");
            Intrinsics.checkNotNullParameter(bankName, "bankName");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            return new SavedAccount(name, str, str2, intentId, bankName, str3, primaryButtonText, str4, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SavedAccount) {
                SavedAccount savedAccount = (SavedAccount) obj;
                return Intrinsics.areEqual(this.name, savedAccount.name) && Intrinsics.areEqual(this.email, savedAccount.email) && Intrinsics.areEqual(this.financialConnectionsSessionId, savedAccount.financialConnectionsSessionId) && Intrinsics.areEqual(this.intentId, savedAccount.intentId) && Intrinsics.areEqual(this.bankName, savedAccount.bankName) && Intrinsics.areEqual(this.last4, savedAccount.last4) && Intrinsics.areEqual(getPrimaryButtonText(), savedAccount.getPrimaryButtonText()) && Intrinsics.areEqual(getMandateText(), savedAccount.getMandateText()) && this.saveForFutureUsage == savedAccount.saveForFutureUsage;
            }
            return false;
        }

        public final String getBankName() {
            return this.bankName;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getFinancialConnectionsSessionId() {
            return this.financialConnectionsSessionId;
        }

        public final String getIntentId() {
            return this.intentId;
        }

        public final String getLast4() {
            return this.last4;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public String getMandateText() {
            return this.mandateText;
        }

        public final String getName() {
            return this.name;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        public final boolean getSaveForFutureUsage() {
            return this.saveForFutureUsage;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.financialConnectionsSessionId;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.intentId.hashCode()) * 31) + this.bankName.hashCode()) * 31;
            String str3 = this.last4;
            int hashCode4 = (((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + getPrimaryButtonText().hashCode()) * 31) + (getMandateText() != null ? getMandateText().hashCode() : 0)) * 31;
            boolean z = this.saveForFutureUsage;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode4 + i;
        }

        public String toString() {
            String str = this.name;
            String str2 = this.email;
            String str3 = this.financialConnectionsSessionId;
            String str4 = this.intentId;
            String str5 = this.bankName;
            String str6 = this.last4;
            String primaryButtonText = getPrimaryButtonText();
            String mandateText = getMandateText();
            boolean z = this.saveForFutureUsage;
            return "SavedAccount(name=" + str + ", email=" + str2 + ", financialConnectionsSessionId=" + str3 + ", intentId=" + str4 + ", bankName=" + str5 + ", last4=" + str6 + ", primaryButtonText=" + primaryButtonText + ", mandateText=" + mandateText + ", saveForFutureUsage=" + z + ")";
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public SavedAccount updateInputs(String name, String str, boolean z) {
            Intrinsics.checkNotNullParameter(name, "name");
            return copy$default(this, name, str, null, null, null, null, null, null, z, 252, null);
        }
    }

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J]\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\"\u0010(\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;", "name", "", "email", "paymentAccount", "Lcom/stripe/android/financialconnections/model/BankAccount;", "financialConnectionsSessionId", "intentId", "primaryButtonText", "mandateText", "saveForFutureUsage", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/BankAccount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getEmail", "()Ljava/lang/String;", "getFinancialConnectionsSessionId", "getIntentId", "getMandateText", "getName", "getPaymentAccount", "()Lcom/stripe/android/financialconnections/model/BankAccount;", "getPrimaryButtonText", "getSaveForFutureUsage", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "updateInputs", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class VerifyWithMicrodeposits extends USBankAccountFormScreenState {
        public static final int $stable = BankAccount.$stable;
        private final String email;
        private final String financialConnectionsSessionId;
        private final String intentId;
        private final String mandateText;
        private final String name;
        private final BankAccount paymentAccount;
        private final String primaryButtonText;
        private final boolean saveForFutureUsage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerifyWithMicrodeposits(String name, String str, BankAccount paymentAccount, String financialConnectionsSessionId, String intentId, String primaryButtonText, String str2, boolean z) {
            super(null, 1, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(paymentAccount, "paymentAccount");
            Intrinsics.checkNotNullParameter(financialConnectionsSessionId, "financialConnectionsSessionId");
            Intrinsics.checkNotNullParameter(intentId, "intentId");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            this.name = name;
            this.email = str;
            this.paymentAccount = paymentAccount;
            this.financialConnectionsSessionId = financialConnectionsSessionId;
            this.intentId = intentId;
            this.primaryButtonText = primaryButtonText;
            this.mandateText = str2;
            this.saveForFutureUsage = z;
        }

        public static /* synthetic */ VerifyWithMicrodeposits copy$default(VerifyWithMicrodeposits verifyWithMicrodeposits, String str, String str2, BankAccount bankAccount, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
            return verifyWithMicrodeposits.copy((i & 1) != 0 ? verifyWithMicrodeposits.name : str, (i & 2) != 0 ? verifyWithMicrodeposits.email : str2, (i & 4) != 0 ? verifyWithMicrodeposits.paymentAccount : bankAccount, (i & 8) != 0 ? verifyWithMicrodeposits.financialConnectionsSessionId : str3, (i & 16) != 0 ? verifyWithMicrodeposits.intentId : str4, (i & 32) != 0 ? verifyWithMicrodeposits.getPrimaryButtonText() : str5, (i & 64) != 0 ? verifyWithMicrodeposits.getMandateText() : str6, (i & 128) != 0 ? verifyWithMicrodeposits.saveForFutureUsage : z);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.email;
        }

        public final BankAccount component3() {
            return this.paymentAccount;
        }

        public final String component4() {
            return this.financialConnectionsSessionId;
        }

        public final String component5() {
            return this.intentId;
        }

        public final String component6() {
            return getPrimaryButtonText();
        }

        public final String component7() {
            return getMandateText();
        }

        public final boolean component8() {
            return this.saveForFutureUsage;
        }

        public final VerifyWithMicrodeposits copy(String name, String str, BankAccount paymentAccount, String financialConnectionsSessionId, String intentId, String primaryButtonText, String str2, boolean z) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(paymentAccount, "paymentAccount");
            Intrinsics.checkNotNullParameter(financialConnectionsSessionId, "financialConnectionsSessionId");
            Intrinsics.checkNotNullParameter(intentId, "intentId");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            return new VerifyWithMicrodeposits(name, str, paymentAccount, financialConnectionsSessionId, intentId, primaryButtonText, str2, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof VerifyWithMicrodeposits) {
                VerifyWithMicrodeposits verifyWithMicrodeposits = (VerifyWithMicrodeposits) obj;
                return Intrinsics.areEqual(this.name, verifyWithMicrodeposits.name) && Intrinsics.areEqual(this.email, verifyWithMicrodeposits.email) && Intrinsics.areEqual(this.paymentAccount, verifyWithMicrodeposits.paymentAccount) && Intrinsics.areEqual(this.financialConnectionsSessionId, verifyWithMicrodeposits.financialConnectionsSessionId) && Intrinsics.areEqual(this.intentId, verifyWithMicrodeposits.intentId) && Intrinsics.areEqual(getPrimaryButtonText(), verifyWithMicrodeposits.getPrimaryButtonText()) && Intrinsics.areEqual(getMandateText(), verifyWithMicrodeposits.getMandateText()) && this.saveForFutureUsage == verifyWithMicrodeposits.saveForFutureUsage;
            }
            return false;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getFinancialConnectionsSessionId() {
            return this.financialConnectionsSessionId;
        }

        public final String getIntentId() {
            return this.intentId;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public String getMandateText() {
            return this.mandateText;
        }

        public final String getName() {
            return this.name;
        }

        public final BankAccount getPaymentAccount() {
            return this.paymentAccount;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        public final boolean getSaveForFutureUsage() {
            return this.saveForFutureUsage;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.email;
            int hashCode2 = (((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.paymentAccount.hashCode()) * 31) + this.financialConnectionsSessionId.hashCode()) * 31) + this.intentId.hashCode()) * 31) + getPrimaryButtonText().hashCode()) * 31) + (getMandateText() != null ? getMandateText().hashCode() : 0)) * 31;
            boolean z = this.saveForFutureUsage;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode2 + i;
        }

        public String toString() {
            String str = this.name;
            String str2 = this.email;
            BankAccount bankAccount = this.paymentAccount;
            String str3 = this.financialConnectionsSessionId;
            String str4 = this.intentId;
            String primaryButtonText = getPrimaryButtonText();
            String mandateText = getMandateText();
            boolean z = this.saveForFutureUsage;
            return "VerifyWithMicrodeposits(name=" + str + ", email=" + str2 + ", paymentAccount=" + bankAccount + ", financialConnectionsSessionId=" + str3 + ", intentId=" + str4 + ", primaryButtonText=" + primaryButtonText + ", mandateText=" + mandateText + ", saveForFutureUsage=" + z + ")";
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public VerifyWithMicrodeposits updateInputs(String name, String str, boolean z) {
            Intrinsics.checkNotNullParameter(name, "name");
            return copy$default(this, name, str, null, null, null, null, null, z, 124, null);
        }
    }

    public /* synthetic */ USBankAccountFormScreenState(Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(num);
    }

    public Integer getError() {
        return this.error;
    }

    public abstract String getMandateText();

    public abstract String getPrimaryButtonText();

    public abstract USBankAccountFormScreenState updateInputs(String str, String str2, boolean z);

    private USBankAccountFormScreenState(Integer num) {
        this.error = num;
    }

    public /* synthetic */ USBankAccountFormScreenState(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, null);
    }
}
