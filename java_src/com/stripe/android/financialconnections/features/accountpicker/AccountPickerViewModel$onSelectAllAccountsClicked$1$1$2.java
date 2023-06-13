package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAccountPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onSelectAllAccountsClicked$1$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,323:1\n1549#2:324\n1620#2,3:325\n*S KotlinDebug\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onSelectAllAccountsClicked$1$1$2\n*L\n235#1:324\n235#1:325,3\n*E\n"})
/* loaded from: classes7.dex */
public final class AccountPickerViewModel$onSelectAllAccountsClicked$1$1$2 extends Lambda implements Function1<AccountPickerState, AccountPickerState> {
    final /* synthetic */ AccountPickerState.Payload $payload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPickerViewModel$onSelectAllAccountsClicked$1$1$2(AccountPickerState.Payload payload) {
        super(1);
        this.$payload = payload;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AccountPickerState invoke(AccountPickerState setState) {
        int collectionSizeOrDefault;
        Set set;
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        List<AccountPickerState.PartnerAccountUI> selectableAccounts = this.$payload.getSelectableAccounts();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(selectableAccounts, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (AccountPickerState.PartnerAccountUI partnerAccountUI : selectableAccounts) {
            arrayList.add(partnerAccountUI.getAccount().getId());
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        return AccountPickerState.copy$default(setState, null, false, null, set, 7, null);
    }
}
