package com.stripe.android.paymentsheet.p047ui;

import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.stripe.android.paymentsheet.BottomSheetController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/BottomSheetController;", "ResultType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.BaseSheetActivity$bottomSheetController$2 */
/* loaded from: classes7.dex */
public final class BaseSheetActivity$bottomSheetController$2 extends Lambda implements Function0<BottomSheetController> {
    final /* synthetic */ BaseSheetActivity<ResultType> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSheetActivity$bottomSheetController$2(BaseSheetActivity<ResultType> baseSheetActivity) {
        super(0);
        this.this$0 = baseSheetActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final BottomSheetController invoke() {
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.this$0.getBottomSheetBehavior$paymentsheet_release();
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehavior, "bottomSheetBehavior");
        return new BottomSheetController(bottomSheetBehavior);
    }
}
