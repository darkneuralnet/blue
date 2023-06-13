package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.common.AccessibleDataCalloutModel;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.p041ui.TextResource;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccountPickerScreenKt$AccountPickerLoaded$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ AccessibleDataCalloutModel $accessibleDataCalloutModel;
    final /* synthetic */ List<AccountPickerState.PartnerAccountUI> $accounts;
    final /* synthetic */ boolean $allAccountsSelected;
    final /* synthetic */ Function1<PartnerAccount, Unit> $onAccountClicked;
    final /* synthetic */ Function0<Unit> $onLearnMoreAboutDataAccessClick;
    final /* synthetic */ Function0<Unit> $onSelectAllAccountsClicked;
    final /* synthetic */ Function0<Unit> $onSubmit;
    final /* synthetic */ boolean $requiresSingleAccountConfirmation;
    final /* synthetic */ Set<String> $selectedIds;
    final /* synthetic */ AccountPickerState.SelectionMode $selectionMode;
    final /* synthetic */ boolean $submitEnabled;
    final /* synthetic */ boolean $submitLoading;
    final /* synthetic */ TextResource $subtitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountPickerScreenKt$AccountPickerLoaded$2(boolean z, boolean z2, List<AccountPickerState.PartnerAccountUI> list, boolean z3, AccessibleDataCalloutModel accessibleDataCalloutModel, boolean z4, AccountPickerState.SelectionMode selectionMode, Set<String> set, Function1<? super PartnerAccount, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, TextResource textResource, int i, int i2) {
        super(2);
        this.$submitEnabled = z;
        this.$submitLoading = z2;
        this.$accounts = list;
        this.$allAccountsSelected = z3;
        this.$accessibleDataCalloutModel = accessibleDataCalloutModel;
        this.$requiresSingleAccountConfirmation = z4;
        this.$selectionMode = selectionMode;
        this.$selectedIds = set;
        this.$onAccountClicked = function1;
        this.$onSelectAllAccountsClicked = function0;
        this.$onSubmit = function02;
        this.$onLearnMoreAboutDataAccessClick = function03;
        this.$subtitle = textResource;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        AccountPickerScreenKt.AccountPickerLoaded(this.$submitEnabled, this.$submitLoading, this.$accounts, this.$allAccountsSelected, this.$accessibleDataCalloutModel, this.$requiresSingleAccountConfirmation, this.$selectionMode, this.$selectedIds, this.$onAccountClicked, this.$onSelectAllAccountsClicked, this.$onSubmit, this.$onLearnMoreAboutDataAccessClick, this.$subtitle, interfaceC32720Et0, this.$$changed | 1, this.$$changed1);
    }
}
