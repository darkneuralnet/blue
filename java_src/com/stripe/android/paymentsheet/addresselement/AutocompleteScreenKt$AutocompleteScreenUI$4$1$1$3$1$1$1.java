package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.p049ui.core.elements.autocomplete.model.AutocompletePrediction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AutocompleteScreenKt$AutocompleteScreenUI$4$1$1$3$1$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ AutocompletePrediction $prediction;
    final /* synthetic */ AutocompleteViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutocompleteScreenKt$AutocompleteScreenUI$4$1$1$3$1$1$1(AutocompleteViewModel autocompleteViewModel, AutocompletePrediction autocompletePrediction) {
        super(0);
        this.$viewModel = autocompleteViewModel;
        this.$prediction = autocompletePrediction;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.selectPrediction(this.$prediction);
    }
}
