package com.stripe.android.financialconnections.features.partnerauth;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PartnerAuthScreenKt$PartnerAuthScreenContent$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ GU2 $modalBottomSheetState;
    final /* synthetic */ Function1<String, Unit> $onClickableTextClick;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ Function1<Throwable, Unit> $onCloseFromErrorClick;
    final /* synthetic */ Function0<Unit> $onConfirmModalClick;
    final /* synthetic */ Function0<Unit> $onContinueClick;
    final /* synthetic */ Function0<Unit> $onEnterDetailsManually;
    final /* synthetic */ Function0<Unit> $onSelectAnotherBank;
    final /* synthetic */ PartnerAuthState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PartnerAuthScreenKt$PartnerAuthScreenContent$3(PartnerAuthState partnerAuthState, GU2 gu2, Function0<Unit> function0, Function0<Unit> function02, Function1<? super String, Unit> function1, Function0<Unit> function03, Function0<Unit> function04, Function1<? super Throwable, Unit> function12, Function0<Unit> function05, int i) {
        super(2);
        this.$state = partnerAuthState;
        this.$modalBottomSheetState = gu2;
        this.$onContinueClick = function0;
        this.$onSelectAnotherBank = function02;
        this.$onClickableTextClick = function1;
        this.$onEnterDetailsManually = function03;
        this.$onCloseClick = function04;
        this.$onCloseFromErrorClick = function12;
        this.$onConfirmModalClick = function05;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PartnerAuthScreenKt.PartnerAuthScreenContent(this.$state, this.$modalBottomSheetState, this.$onContinueClick, this.$onSelectAnotherBank, this.$onClickableTextClick, this.$onEnterDetailsManually, this.$onCloseClick, this.$onCloseFromErrorClick, this.$onConfirmModalClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
