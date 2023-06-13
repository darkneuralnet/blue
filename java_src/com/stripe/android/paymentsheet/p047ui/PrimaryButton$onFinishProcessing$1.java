package com.stripe.android.paymentsheet.p047ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PrimaryButton$onFinishProcessing$1 */
/* loaded from: classes7.dex */
public final class PrimaryButton$onFinishProcessing$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> $onAnimationEnd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButton$onFinishProcessing$1(Function0<Unit> function0) {
        super(0);
        this.$onAnimationEnd = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onAnimationEnd.invoke();
    }
}
