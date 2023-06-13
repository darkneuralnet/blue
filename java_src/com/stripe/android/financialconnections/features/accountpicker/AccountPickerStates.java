package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.common.AccessibleDataCalloutModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.PartnerAccount;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerStates;", "La24;", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;", "Lkotlin/sequences/Sequence;", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "", "getCount", "()I", "count", "<init>", "()V", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class AccountPickerStates implements InterfaceC37721a24<AccountPickerState> {
    public static final Companion Companion = new Companion(null);
    private final Sequence<AccountPickerState> values;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerStates$Companion;", "", "()V", "accessibleCallout", "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;", "multiSelect", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;", "partnerAccountList", "", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;", "singleSelect", "singleSelectWithConfirm", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final AccessibleDataCalloutModel accessibleCallout() {
            List listOf;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FinancialConnectionsAccount.Permissions[]{FinancialConnectionsAccount.Permissions.PAYMENT_METHOD, FinancialConnectionsAccount.Permissions.BALANCES, FinancialConnectionsAccount.Permissions.OWNERSHIP, FinancialConnectionsAccount.Permissions.TRANSACTIONS});
            return new AccessibleDataCalloutModel("My business", listOf, false, false, "");
        }

        private final List<AccountPickerState.PartnerAccountUI> partnerAccountList() {
            List emptyList;
            List emptyList2;
            List emptyList3;
            List emptyList4;
            List emptyList5;
            List<AccountPickerState.PartnerAccountUI> listOf;
            FinancialConnectionsAccount.Category category = FinancialConnectionsAccount.Category.CASH;
            FinancialConnectionsAccount.Subcategory subcategory = FinancialConnectionsAccount.Subcategory.CHECKING;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            Boolean bool = Boolean.TRUE;
            FinancialConnectionsAccount.Subcategory subcategory2 = FinancialConnectionsAccount.Subcategory.SAVINGS;
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            FinancialConnectionsAccount.Subcategory subcategory3 = FinancialConnectionsAccount.Subcategory.CREDIT_CARD;
            emptyList3 = CollectionsKt__CollectionsKt.emptyList();
            Boolean bool2 = Boolean.FALSE;
            emptyList4 = CollectionsKt__CollectionsKt.emptyList();
            emptyList5 = CollectionsKt__CollectionsKt.emptyList();
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AccountPickerState.PartnerAccountUI[]{new AccountPickerState.PartnerAccountUI(new PartnerAccount("Authorization", category, "id1", "With balance", subcategory, emptyList, (Integer) 1000, "$", "1234", (Integer) null, (String) null, bool, "", (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 124416, (DefaultConstructorMarker) null), null, "$1,000"), new AccountPickerState.PartnerAccountUI(new PartnerAccount("Authorization", category, "id2", "With balance disabled", subcategory2, emptyList2, (Integer) 1000, (String) null, (String) null, (Integer) null, (String) null, bool, "", (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 124800, (DefaultConstructorMarker) null), null, "$1,000"), new AccountPickerState.PartnerAccountUI(new PartnerAccount("Authorization", category, "id3", "No balance", subcategory3, emptyList3, (Integer) null, (String) null, "1234", (Integer) null, (String) null, bool2, "Cannot be selected", (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 124608, (DefaultConstructorMarker) null), null, null), new AccountPickerState.PartnerAccountUI(new PartnerAccount("Authorization", category, "id4", "No balance disabled", subcategory, emptyList4, (Integer) null, (String) null, "1234", (Integer) null, (String) null, bool2, "Cannot be selected", (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 124608, (DefaultConstructorMarker) null), null, null), new AccountPickerState.PartnerAccountUI(new PartnerAccount("Authorization", category, "id5", "Very long institution that is already linked", subcategory, emptyList5, (Integer) null, (String) null, "1234", (Integer) null, (String) null, bool, (String) null, (String) null, "linkedAccountId", (String) null, (FinancialConnectionsAccount.Status) null, 112320, (DefaultConstructorMarker) null), null, null)});
            return listOf;
        }

        public final AccountPickerState multiSelect() {
            Set of;
            C51034wT5 c51034wT5 = new C51034wT5(new AccountPickerState.Payload(false, partnerAccountList(), AccountPickerState.SelectionMode.CHECKBOXES, accessibleCallout(), false, false, "Random business", false, false));
            of = SetsKt__SetsJVMKt.setOf("id1");
            return new AccountPickerState(c51034wT5, false, null, of, 6, null);
        }

        public final AccountPickerState singleSelect() {
            Set of;
            C51034wT5 c51034wT5 = new C51034wT5(new AccountPickerState.Payload(false, partnerAccountList(), AccountPickerState.SelectionMode.RADIO, accessibleCallout(), true, false, "Random business", false, false));
            of = SetsKt__SetsJVMKt.setOf("id1");
            return new AccountPickerState(c51034wT5, false, null, of, 6, null);
        }

        public final AccountPickerState singleSelectWithConfirm() {
            Set of;
            C51034wT5 c51034wT5 = new C51034wT5(new AccountPickerState.Payload(false, partnerAccountList(), AccountPickerState.SelectionMode.RADIO, accessibleCallout(), true, false, "Random business", false, true));
            of = SetsKt__SetsJVMKt.setOf("id1");
            return new AccountPickerState(c51034wT5, false, null, of, 6, null);
        }

        private Companion() {
        }
    }

    public AccountPickerStates() {
        Sequence<AccountPickerState> sequenceOf;
        Companion companion = Companion;
        sequenceOf = SequencesKt__SequencesKt.sequenceOf(companion.multiSelect(), companion.singleSelect());
        this.values = sequenceOf;
    }

    @Override // p000.InterfaceC37721a24
    public int getCount() {
        return super.getCount();
    }

    @Override // p000.InterfaceC37721a24
    public Sequence<AccountPickerState> getValues() {
        return this.values;
    }
}
