package com.stripe.android.financialconnections.features.consent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ConsentScreenKt$ConsentContent$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ GU2 $bottomSheetState;
    final /* synthetic */ Function1<String, Unit> $onClickableTextClick;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ Function0<Unit> $onConfirmModalClick;
    final /* synthetic */ Function0<Unit> $onContinueClick;
    final /* synthetic */ ConsentState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConsentScreenKt$ConsentContent$2(ConsentState consentState, GU2 gu2, Function0<Unit> function0, Function1<? super String, Unit> function1, Function0<Unit> function02, Function0<Unit> function03, int i) {
        super(2);
        this.$state = consentState;
        this.$bottomSheetState = gu2;
        this.$onContinueClick = function0;
        this.$onClickableTextClick = function1;
        this.$onConfirmModalClick = function02;
        this.$onCloseClick = function03;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        ConsentScreenKt.ConsentContent(this.$state, this.$bottomSheetState, this.$onContinueClick, this.$onClickableTextClick, this.$onConfirmModalClick, this.$onCloseClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
