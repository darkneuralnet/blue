package com.stripe.android.link.p042ui.cardedit;

import com.stripe.android.link.p042ui.ErrorMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.cardedit.CardEditScreenKt$CardEditBody$5 */
/* loaded from: classes7.dex */
public final class CardEditScreenKt$CardEditBody$5 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> $formContent;
    final /* synthetic */ boolean $isDefault;
    final /* synthetic */ boolean $isProcessing;
    final /* synthetic */ Function0<Unit> $onCancelClick;
    final /* synthetic */ Function0<Unit> $onPrimaryButtonClick;
    final /* synthetic */ Function1<Boolean, Unit> $onSetAsDefaultClick;
    final /* synthetic */ boolean $primaryButtonEnabled;
    final /* synthetic */ boolean $setAsDefaultChecked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardEditScreenKt$CardEditBody$5(boolean z, boolean z2, boolean z3, boolean z4, ErrorMessage errorMessage, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i) {
        super(2);
        this.$isProcessing = z;
        this.$isDefault = z2;
        this.$setAsDefaultChecked = z3;
        this.$primaryButtonEnabled = z4;
        this.$errorMessage = errorMessage;
        this.$onSetAsDefaultClick = function1;
        this.$onPrimaryButtonClick = function0;
        this.$onCancelClick = function02;
        this.$formContent = function3;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        CardEditScreenKt.CardEditBody(this.$isProcessing, this.$isDefault, this.$setAsDefaultChecked, this.$primaryButtonEnabled, this.$errorMessage, this.$onSetAsDefaultClick, this.$onPrimaryButtonClick, this.$onCancelClick, this.$formContent, interfaceC32720Et0, this.$$changed | 1);
    }
}
