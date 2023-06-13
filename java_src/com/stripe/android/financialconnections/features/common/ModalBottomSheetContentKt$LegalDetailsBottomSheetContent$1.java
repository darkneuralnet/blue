package com.stripe.android.financialconnections.features.common;

import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ModalBottomSheetContentKt$LegalDetailsBottomSheetContent$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ LegalDetailsNotice $legalDetails;
    final /* synthetic */ Function1<String, Unit> $onClickableTextClick;
    final /* synthetic */ Function0<Unit> $onConfirmModalClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheetContentKt$LegalDetailsBottomSheetContent$1(LegalDetailsNotice legalDetailsNotice, Function1<? super String, Unit> function1, Function0<Unit> function0, int i) {
        super(2);
        this.$legalDetails = legalDetailsNotice;
        this.$onClickableTextClick = function1;
        this.$onConfirmModalClick = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        ModalBottomSheetContentKt.LegalDetailsBottomSheetContent(this.$legalDetails, this.$onClickableTextClick, this.$onConfirmModalClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
