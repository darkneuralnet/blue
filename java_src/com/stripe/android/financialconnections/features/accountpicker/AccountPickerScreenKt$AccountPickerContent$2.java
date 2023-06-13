package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.exception.AccountNoneEligibleForPaymentMethodError;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.common.AccessibleDataCalloutModel;
import com.stripe.android.financialconnections.features.common.ErrorContentKt;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.p041ui.TextResource;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccountPickerScreenKt$AccountPickerContent$2 extends Lambda implements Function3<PD3, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function1<PartnerAccount, Unit> $onAccountClicked;
    final /* synthetic */ Function1<Throwable, Unit> $onCloseFromErrorClick;
    final /* synthetic */ Function0<Unit> $onEnterDetailsManually;
    final /* synthetic */ Function0<Unit> $onLearnMoreAboutDataAccessClick;
    final /* synthetic */ Function0<Unit> $onLoadAccountsAgain;
    final /* synthetic */ Function0<Unit> $onSelectAllAccountsClicked;
    final /* synthetic */ Function0<Unit> $onSelectAnotherBank;
    final /* synthetic */ Function0<Unit> $onSubmit;
    final /* synthetic */ AccountPickerState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountPickerScreenKt$AccountPickerContent$2(AccountPickerState accountPickerState, Function1<? super PartnerAccount, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function1<? super Throwable, Unit> function12) {
        super(3);
        this.$state = accountPickerState;
        this.$onAccountClicked = function1;
        this.$onSelectAllAccountsClicked = function0;
        this.$onSubmit = function02;
        this.$onLearnMoreAboutDataAccessClick = function03;
        this.$$dirty = i;
        this.$onSelectAnotherBank = function04;
        this.$onEnterDetailsManually = function05;
        this.$onLoadAccountsAgain = function06;
        this.$onCloseFromErrorClick = function12;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PD3 pd3, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(pd3, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PD3 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1049787519, i, -1, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerContent.<anonymous> (AccountPickerScreen.kt:106)");
        }
        AbstractC19862dp<AccountPickerState.Payload> payload = this.$state.getPayload();
        if (Intrinsics.areEqual(payload, C34454Md6.f23316e) ? true : payload instanceof C31786At2) {
            interfaceC32720Et0.mo89638F(1213175002);
            AccountPickerScreenKt.AccountPickerLoading(interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89605Q();
        } else if (payload instanceof C51034wT5) {
            interfaceC32720Et0.mo89638F(1213175051);
            C51034wT5 c51034wT5 = (C51034wT5) payload;
            boolean shouldSkipPane = ((AccountPickerState.Payload) c51034wT5.mo6788a()).getShouldSkipPane();
            if (shouldSkipPane) {
                interfaceC32720Et0.mo89638F(1213175235);
                AccountPickerScreenKt.AccountPickerLoading(interfaceC32720Et0, 0);
                interfaceC32720Et0.mo89605Q();
            } else if (!shouldSkipPane) {
                interfaceC32720Et0.mo89638F(1213175283);
                boolean submitEnabled = this.$state.getSubmitEnabled();
                boolean submitLoading = this.$state.getSubmitLoading();
                List<AccountPickerState.PartnerAccountUI> accounts = ((AccountPickerState.Payload) c51034wT5.mo6788a()).getAccounts();
                boolean allAccountsSelected = this.$state.getAllAccountsSelected();
                TextResource subtitle = ((AccountPickerState.Payload) c51034wT5.mo6788a()).getSubtitle();
                Set<String> selectedIds = this.$state.getSelectedIds();
                AccountPickerState.SelectionMode selectionMode = ((AccountPickerState.Payload) c51034wT5.mo6788a()).getSelectionMode();
                AccessibleDataCalloutModel accessibleData = ((AccountPickerState.Payload) c51034wT5.mo6788a()).getAccessibleData();
                boolean requiresSingleAccountConfirmation = ((AccountPickerState.Payload) c51034wT5.mo6788a()).getRequiresSingleAccountConfirmation();
                Function1<PartnerAccount, Unit> function1 = this.$onAccountClicked;
                Function0<Unit> function0 = this.$onSelectAllAccountsClicked;
                Function0<Unit> function02 = this.$onSubmit;
                Function0<Unit> function03 = this.$onLearnMoreAboutDataAccessClick;
                int i2 = this.$$dirty;
                AccountPickerScreenKt.AccountPickerLoaded(submitEnabled, submitLoading, accounts, allAccountsSelected, accessibleData, requiresSingleAccountConfirmation, selectionMode, selectedIds, function1, function0, function02, function03, subtitle, interfaceC32720Et0, ((i2 << 21) & 234881024) | 16810496 | ((i2 << 18) & 1879048192), ((i2 >> 6) & 14) | ((i2 >> 21) & 112));
                interfaceC32720Et0.mo89605Q();
            } else {
                interfaceC32720Et0.mo89638F(1213176171);
                interfaceC32720Et0.mo89605Q();
            }
            interfaceC32720Et0.mo89605Q();
        } else if (payload instanceof C32163Cj1) {
            interfaceC32720Et0.mo89638F(1213176196);
            Throwable m111793b = ((C32163Cj1) payload).m111793b();
            if (m111793b instanceof AccountNoneEligibleForPaymentMethodError) {
                interfaceC32720Et0.mo89638F(1213176314);
                Function0<Unit> function04 = this.$onSelectAnotherBank;
                Function0<Unit> function05 = this.$onEnterDetailsManually;
                int i3 = this.$$dirty;
                ErrorContentKt.NoSupportedPaymentMethodTypeAccountsErrorContent((AccountNoneEligibleForPaymentMethodError) m111793b, function04, function05, interfaceC32720Et0, ((i3 >> 9) & 896) | ((i3 >> 9) & 112));
                interfaceC32720Et0.mo89605Q();
            } else if (m111793b instanceof AccountLoadError) {
                interfaceC32720Et0.mo89638F(1213176608);
                Function0<Unit> function06 = this.$onSelectAnotherBank;
                Function0<Unit> function07 = this.$onEnterDetailsManually;
                Function0<Unit> function08 = this.$onLoadAccountsAgain;
                int i4 = this.$$dirty;
                ErrorContentKt.NoAccountsAvailableErrorContent((AccountLoadError) m111793b, function06, function07, function08, interfaceC32720Et0, ((i4 >> 9) & 112) | ((i4 >> 9) & 896) | ((i4 >> 9) & 7168));
                interfaceC32720Et0.mo89605Q();
            } else {
                interfaceC32720Et0.mo89638F(1213176908);
                ErrorContentKt.UnclassifiedErrorContent(m111793b, this.$onCloseFromErrorClick, interfaceC32720Et0, ((this.$$dirty >> 24) & 112) | 8);
                interfaceC32720Et0.mo89605Q();
            }
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(1213177076);
            interfaceC32720Et0.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
