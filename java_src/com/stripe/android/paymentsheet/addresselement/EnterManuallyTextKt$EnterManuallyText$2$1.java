package com.stripe.android.paymentsheet.addresselement;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class EnterManuallyTextKt$EnterManuallyText$2$1 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterManuallyTextKt$EnterManuallyText$2$1(Function0<Unit> function0) {
        super(1);
        this.$onClick = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        this.$onClick.invoke();
    }
}
