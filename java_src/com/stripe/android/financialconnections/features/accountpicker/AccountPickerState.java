package com.stripe.android.financialconnections.features.accountpicker;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.C18634R;
import com.stripe.android.financialconnections.features.common.AccessibleDataCalloutModel;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.p041ui.TextResource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00020\u0001:\u0003)*+BA\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b'\u0010(J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JC\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\nHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0011\u0010\"\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b!\u0010\u001cR\u0011\u0010$\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b#\u0010\u001cR\u0011\u0010&\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010\u001c¨\u0006,"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;", "LAN2;", "Ldp;", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;", "component1", "", "component2", "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "component3", "", "", "component4", "payload", "canRetry", "selectAccounts", "selectedIds", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ldp;", "getPayload", "()Ldp;", "Z", "getCanRetry", "()Z", "getSelectAccounts", "Ljava/util/Set;", "getSelectedIds", "()Ljava/util/Set;", "getSubmitLoading", "submitLoading", "getSubmitEnabled", "submitEnabled", "getAllAccountsSelected", "allAccountsSelected", "<init>", "(Ldp;ZLdp;Ljava/util/Set;)V", "PartnerAccountUI", "Payload", "SelectionMode", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class AccountPickerState implements AN2 {
    private final boolean canRetry;
    private final AbstractC19862dp<Payload> payload;
    private final AbstractC19862dp<PartnerAccountsList> selectAccounts;
    private final Set<String> selectedIds;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;", "", "account", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "institutionIcon", "", "formattedBalance", "(Lcom/stripe/android/financialconnections/model/PartnerAccount;Ljava/lang/String;Ljava/lang/String;)V", "getAccount", "()Lcom/stripe/android/financialconnections/model/PartnerAccount;", "getFormattedBalance", "()Ljava/lang/String;", "getInstitutionIcon", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class PartnerAccountUI {
        public static final int $stable = 8;
        private final PartnerAccount account;
        private final String formattedBalance;
        private final String institutionIcon;

        public PartnerAccountUI(PartnerAccount account, String str, String str2) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.account = account;
            this.institutionIcon = str;
            this.formattedBalance = str2;
        }

        public static /* synthetic */ PartnerAccountUI copy$default(PartnerAccountUI partnerAccountUI, PartnerAccount partnerAccount, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                partnerAccount = partnerAccountUI.account;
            }
            if ((i & 2) != 0) {
                str = partnerAccountUI.institutionIcon;
            }
            if ((i & 4) != 0) {
                str2 = partnerAccountUI.formattedBalance;
            }
            return partnerAccountUI.copy(partnerAccount, str, str2);
        }

        public final PartnerAccount component1() {
            return this.account;
        }

        public final String component2() {
            return this.institutionIcon;
        }

        public final String component3() {
            return this.formattedBalance;
        }

        public final PartnerAccountUI copy(PartnerAccount account, String str, String str2) {
            Intrinsics.checkNotNullParameter(account, "account");
            return new PartnerAccountUI(account, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PartnerAccountUI) {
                PartnerAccountUI partnerAccountUI = (PartnerAccountUI) obj;
                return Intrinsics.areEqual(this.account, partnerAccountUI.account) && Intrinsics.areEqual(this.institutionIcon, partnerAccountUI.institutionIcon) && Intrinsics.areEqual(this.formattedBalance, partnerAccountUI.formattedBalance);
            }
            return false;
        }

        public final PartnerAccount getAccount() {
            return this.account;
        }

        public final String getFormattedBalance() {
            return this.formattedBalance;
        }

        public final String getInstitutionIcon() {
            return this.institutionIcon;
        }

        public int hashCode() {
            int hashCode = this.account.hashCode() * 31;
            String str = this.institutionIcon;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.formattedBalance;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            PartnerAccount partnerAccount = this.account;
            String str = this.institutionIcon;
            String str2 = this.formattedBalance;
            return "PartnerAccountUI(account=" + partnerAccount + ", institutionIcon=" + str + ", formattedBalance=" + str2 + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003Jk\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u00102\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010#\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019¨\u00067"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;", "", "skipAccountSelection", "", "accounts", "", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;", "selectionMode", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;", "accessibleData", "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;", "singleAccount", "stripeDirect", "businessName", "", "userSelectedSingleAccountInInstitution", "requiresSingleAccountConfirmation", "(ZLjava/util/List;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZZLjava/lang/String;ZZ)V", "getAccessibleData", "()Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;", "getAccounts", "()Ljava/util/List;", "getBusinessName", "()Ljava/lang/String;", "getRequiresSingleAccountConfirmation", "()Z", "selectableAccounts", "getSelectableAccounts", "getSelectionMode", "()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;", "shouldSkipPane", "getShouldSkipPane", "getSingleAccount", "getSkipAccountSelection", "getStripeDirect", "subtitle", "Lcom/stripe/android/financialconnections/ui/TextResource;", "getSubtitle", "()Lcom/stripe/android/financialconnections/ui/TextResource;", "getUserSelectedSingleAccountInInstitution", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAccountPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,323:1\n766#2:324\n857#2,2:325\n*S KotlinDebug\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload\n*L\n298#1:324\n298#1:325,2\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Payload {
        public static final int $stable = 8;
        private final AccessibleDataCalloutModel accessibleData;
        private final List<PartnerAccountUI> accounts;
        private final String businessName;
        private final boolean requiresSingleAccountConfirmation;
        private final SelectionMode selectionMode;
        private final boolean singleAccount;
        private final boolean skipAccountSelection;
        private final boolean stripeDirect;
        private final boolean userSelectedSingleAccountInInstitution;

        public Payload(boolean z, List<PartnerAccountUI> accounts, SelectionMode selectionMode, AccessibleDataCalloutModel accessibleData, boolean z2, boolean z3, String str, boolean z4, boolean z5) {
            Intrinsics.checkNotNullParameter(accounts, "accounts");
            Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
            Intrinsics.checkNotNullParameter(accessibleData, "accessibleData");
            this.skipAccountSelection = z;
            this.accounts = accounts;
            this.selectionMode = selectionMode;
            this.accessibleData = accessibleData;
            this.singleAccount = z2;
            this.stripeDirect = z3;
            this.businessName = str;
            this.userSelectedSingleAccountInInstitution = z4;
            this.requiresSingleAccountConfirmation = z5;
        }

        public final boolean component1() {
            return this.skipAccountSelection;
        }

        public final List<PartnerAccountUI> component2() {
            return this.accounts;
        }

        public final SelectionMode component3() {
            return this.selectionMode;
        }

        public final AccessibleDataCalloutModel component4() {
            return this.accessibleData;
        }

        public final boolean component5() {
            return this.singleAccount;
        }

        public final boolean component6() {
            return this.stripeDirect;
        }

        public final String component7() {
            return this.businessName;
        }

        public final boolean component8() {
            return this.userSelectedSingleAccountInInstitution;
        }

        public final boolean component9() {
            return this.requiresSingleAccountConfirmation;
        }

        public final Payload copy(boolean z, List<PartnerAccountUI> accounts, SelectionMode selectionMode, AccessibleDataCalloutModel accessibleData, boolean z2, boolean z3, String str, boolean z4, boolean z5) {
            Intrinsics.checkNotNullParameter(accounts, "accounts");
            Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
            Intrinsics.checkNotNullParameter(accessibleData, "accessibleData");
            return new Payload(z, accounts, selectionMode, accessibleData, z2, z3, str, z4, z5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Payload) {
                Payload payload = (Payload) obj;
                return this.skipAccountSelection == payload.skipAccountSelection && Intrinsics.areEqual(this.accounts, payload.accounts) && this.selectionMode == payload.selectionMode && Intrinsics.areEqual(this.accessibleData, payload.accessibleData) && this.singleAccount == payload.singleAccount && this.stripeDirect == payload.stripeDirect && Intrinsics.areEqual(this.businessName, payload.businessName) && this.userSelectedSingleAccountInInstitution == payload.userSelectedSingleAccountInInstitution && this.requiresSingleAccountConfirmation == payload.requiresSingleAccountConfirmation;
            }
            return false;
        }

        public final AccessibleDataCalloutModel getAccessibleData() {
            return this.accessibleData;
        }

        public final List<PartnerAccountUI> getAccounts() {
            return this.accounts;
        }

        public final String getBusinessName() {
            return this.businessName;
        }

        public final boolean getRequiresSingleAccountConfirmation() {
            return this.requiresSingleAccountConfirmation;
        }

        public final List<PartnerAccountUI> getSelectableAccounts() {
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.accounts) {
                if (((PartnerAccountUI) obj).getAccount().getAllowSelection$financial_connections_release()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public final SelectionMode getSelectionMode() {
            return this.selectionMode;
        }

        public final boolean getShouldSkipPane() {
            return this.skipAccountSelection || this.userSelectedSingleAccountInInstitution;
        }

        public final boolean getSingleAccount() {
            return this.singleAccount;
        }

        public final boolean getSkipAccountSelection() {
            return this.skipAccountSelection;
        }

        public final boolean getStripeDirect() {
            return this.stripeDirect;
        }

        public final TextResource getSubtitle() {
            if (!this.requiresSingleAccountConfirmation) {
                return null;
            }
            return new TextResource.StringId(C18634R.string.stripe_accountpicker_singleaccount_description, null, 2, null);
        }

        public final boolean getUserSelectedSingleAccountInInstitution() {
            return this.userSelectedSingleAccountInInstitution;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r2v13, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
        public int hashCode() {
            boolean z = this.skipAccountSelection;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int hashCode = ((((((r0 * 31) + this.accounts.hashCode()) * 31) + this.selectionMode.hashCode()) * 31) + this.accessibleData.hashCode()) * 31;
            ?? r2 = this.singleAccount;
            int i = r2;
            if (r2 != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            ?? r22 = this.stripeDirect;
            int i3 = r22;
            if (r22 != 0) {
                i3 = 1;
            }
            int i4 = (i2 + i3) * 31;
            String str = this.businessName;
            int hashCode2 = (i4 + (str == null ? 0 : str.hashCode())) * 31;
            ?? r23 = this.userSelectedSingleAccountInInstitution;
            int i5 = r23;
            if (r23 != 0) {
                i5 = 1;
            }
            int i6 = (hashCode2 + i5) * 31;
            boolean z2 = this.requiresSingleAccountConfirmation;
            return i6 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public String toString() {
            boolean z = this.skipAccountSelection;
            List<PartnerAccountUI> list = this.accounts;
            SelectionMode selectionMode = this.selectionMode;
            AccessibleDataCalloutModel accessibleDataCalloutModel = this.accessibleData;
            boolean z2 = this.singleAccount;
            boolean z3 = this.stripeDirect;
            String str = this.businessName;
            boolean z4 = this.userSelectedSingleAccountInInstitution;
            boolean z5 = this.requiresSingleAccountConfirmation;
            return "Payload(skipAccountSelection=" + z + ", accounts=" + list + ", selectionMode=" + selectionMode + ", accessibleData=" + accessibleDataCalloutModel + ", singleAccount=" + z2 + ", stripeDirect=" + z3 + ", businessName=" + str + ", userSelectedSingleAccountInInstitution=" + z4 + ", requiresSingleAccountConfirmation=" + z5 + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;", "", "(Ljava/lang/String;I)V", "RADIO", "CHECKBOXES", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum SelectionMode {
        RADIO,
        CHECKBOXES
    }

    public AccountPickerState() {
        this(null, false, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountPickerState copy$default(AccountPickerState accountPickerState, AbstractC19862dp abstractC19862dp, boolean z, AbstractC19862dp abstractC19862dp2, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC19862dp = accountPickerState.payload;
        }
        if ((i & 2) != 0) {
            z = accountPickerState.canRetry;
        }
        if ((i & 4) != 0) {
            abstractC19862dp2 = accountPickerState.selectAccounts;
        }
        if ((i & 8) != 0) {
            set = accountPickerState.selectedIds;
        }
        return accountPickerState.copy(abstractC19862dp, z, abstractC19862dp2, set);
    }

    public final AbstractC19862dp<Payload> component1() {
        return this.payload;
    }

    public final boolean component2() {
        return this.canRetry;
    }

    public final AbstractC19862dp<PartnerAccountsList> component3() {
        return this.selectAccounts;
    }

    public final Set<String> component4() {
        return this.selectedIds;
    }

    public final AccountPickerState copy(AbstractC19862dp<Payload> payload, boolean z, AbstractC19862dp<PartnerAccountsList> selectAccounts, Set<String> selectedIds) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(selectAccounts, "selectAccounts");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        return new AccountPickerState(payload, z, selectAccounts, selectedIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccountPickerState) {
            AccountPickerState accountPickerState = (AccountPickerState) obj;
            return Intrinsics.areEqual(this.payload, accountPickerState.payload) && this.canRetry == accountPickerState.canRetry && Intrinsics.areEqual(this.selectAccounts, accountPickerState.selectAccounts) && Intrinsics.areEqual(this.selectedIds, accountPickerState.selectedIds);
        }
        return false;
    }

    public final boolean getAllAccountsSelected() {
        List<PartnerAccountUI> selectableAccounts;
        Payload mo6788a = this.payload.mo6788a();
        return (mo6788a == null || (selectableAccounts = mo6788a.getSelectableAccounts()) == null || selectableAccounts.size() != this.selectedIds.size()) ? false : true;
    }

    public final boolean getCanRetry() {
        return this.canRetry;
    }

    public final AbstractC19862dp<Payload> getPayload() {
        return this.payload;
    }

    public final AbstractC19862dp<PartnerAccountsList> getSelectAccounts() {
        return this.selectAccounts;
    }

    public final Set<String> getSelectedIds() {
        return this.selectedIds;
    }

    public final boolean getSubmitEnabled() {
        return !this.selectedIds.isEmpty();
    }

    public final boolean getSubmitLoading() {
        return (this.payload instanceof C31786At2) || (this.selectAccounts instanceof C31786At2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.payload.hashCode() * 31;
        boolean z = this.canRetry;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + this.selectAccounts.hashCode()) * 31) + this.selectedIds.hashCode();
    }

    public String toString() {
        AbstractC19862dp<Payload> abstractC19862dp = this.payload;
        boolean z = this.canRetry;
        AbstractC19862dp<PartnerAccountsList> abstractC19862dp2 = this.selectAccounts;
        Set<String> set = this.selectedIds;
        return "AccountPickerState(payload=" + abstractC19862dp + ", canRetry=" + z + ", selectAccounts=" + abstractC19862dp2 + ", selectedIds=" + set + ")";
    }

    public AccountPickerState(AbstractC19862dp<Payload> payload, boolean z, AbstractC19862dp<PartnerAccountsList> selectAccounts, Set<String> selectedIds) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(selectAccounts, "selectAccounts");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        this.payload = payload;
        this.canRetry = z;
        this.selectAccounts = selectAccounts;
        this.selectedIds = selectedIds;
    }

    public /* synthetic */ AccountPickerState(AbstractC19862dp abstractC19862dp, boolean z, AbstractC19862dp abstractC19862dp2, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C34454Md6.f23316e : abstractC19862dp, (i & 2) != 0 ? true : z, (i & 4) != 0 ? C34454Md6.f23316e : abstractC19862dp2, (i & 8) != 0 ? SetsKt__SetsKt.emptySet() : set);
    }
}
