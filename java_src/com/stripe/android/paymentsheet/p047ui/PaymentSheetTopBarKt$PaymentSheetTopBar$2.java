package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt$PaymentSheetTopBar$2 */
/* loaded from: classes7.dex */
public /* synthetic */ class PaymentSheetTopBarKt$PaymentSheetTopBar$2 extends FunctionReferenceImpl implements Function0<Unit> {
    public PaymentSheetTopBarKt$PaymentSheetTopBar$2(Object obj) {
        super(0, obj, BaseSheetViewModel.class, "toggleEditing", "toggleEditing()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((BaseSheetViewModel) this.receiver).toggleEditing();
    }
}
