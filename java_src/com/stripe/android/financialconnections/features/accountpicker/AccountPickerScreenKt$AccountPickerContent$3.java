package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.model.PartnerAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccountPickerScreenKt$AccountPickerContent$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<PartnerAccount, Unit> $onAccountClicked;
    final /* synthetic */ Function0<Unit> $onCloseClick;
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
    public AccountPickerScreenKt$AccountPickerContent$3(AccountPickerState accountPickerState, Function1<? super PartnerAccount, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Function1<? super Throwable, Unit> function12, int i) {
        super(2);
        this.$state = accountPickerState;
        this.$onAccountClicked = function1;
        this.$onSubmit = function0;
        this.$onSelectAllAccountsClicked = function02;
        this.$onSelectAnotherBank = function03;
        this.$onEnterDetailsManually = function04;
        this.$onLoadAccountsAgain = function05;
        this.$onCloseClick = function06;
        this.$onLearnMoreAboutDataAccessClick = function07;
        this.$onCloseFromErrorClick = function12;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        AccountPickerScreenKt.AccountPickerContent(this.$state, this.$onAccountClicked, this.$onSubmit, this.$onSelectAllAccountsClicked, this.$onSelectAnotherBank, this.$onEnterDetailsManually, this.$onLoadAccountsAgain, this.$onCloseClick, this.$onLearnMoreAboutDataAccessClick, this.$onCloseFromErrorClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
