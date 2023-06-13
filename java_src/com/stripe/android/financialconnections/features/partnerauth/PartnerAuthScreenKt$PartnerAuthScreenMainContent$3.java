package com.stripe.android.financialconnections.features.partnerauth;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PartnerAuthScreenKt$PartnerAuthScreenMainContent$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<String, Unit> $onClickableTextClick;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ Function1<Throwable, Unit> $onCloseFromErrorClick;
    final /* synthetic */ Function0<Unit> $onContinueClick;
    final /* synthetic */ Function0<Unit> $onEnterDetailsManually;
    final /* synthetic */ Function0<Unit> $onSelectAnotherBank;
    final /* synthetic */ PartnerAuthState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PartnerAuthScreenKt$PartnerAuthScreenMainContent$3(PartnerAuthState partnerAuthState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super Throwable, Unit> function1, Function0<Unit> function04, Function1<? super String, Unit> function12, int i) {
        super(2);
        this.$state = partnerAuthState;
        this.$onCloseClick = function0;
        this.$onSelectAnotherBank = function02;
        this.$onEnterDetailsManually = function03;
        this.$onCloseFromErrorClick = function1;
        this.$onContinueClick = function04;
        this.$onClickableTextClick = function12;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PartnerAuthScreenKt.PartnerAuthScreenMainContent(this.$state, this.$onCloseClick, this.$onSelectAnotherBank, this.$onEnterDetailsManually, this.$onCloseFromErrorClick, this.$onContinueClick, this.$onClickableTextClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
