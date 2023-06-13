package com.stripe.android.link.p042ui.cardedit;

import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.cardedit.CardEditScreenKt$CardEditBody$2$2 */
/* loaded from: classes7.dex */
public final class CardEditScreenKt$CardEditBody$2$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ InterfaceC48627sP5<Map<IdentifierSpec, FormFieldEntry>> $formValues$delegate;
    final /* synthetic */ CardEditViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardEditScreenKt$CardEditBody$2$2(InterfaceC48627sP5<? extends Map<IdentifierSpec, FormFieldEntry>> interfaceC48627sP5, CardEditViewModel cardEditViewModel) {
        super(0);
        this.$formValues$delegate = interfaceC48627sP5;
        this.$viewModel = cardEditViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Map<IdentifierSpec, FormFieldEntry> CardEditBody$lambda$6$lambda$2;
        CardEditBody$lambda$6$lambda$2 = CardEditScreenKt.CardEditBody$lambda$6$lambda$2(this.$formValues$delegate);
        if (CardEditBody$lambda$6$lambda$2 != null) {
            this.$viewModel.updateCard(CardEditBody$lambda$6$lambda$2);
        }
    }
}
