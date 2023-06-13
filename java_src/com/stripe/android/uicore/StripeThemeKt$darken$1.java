package com.stripe.android.uicore;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeThemeKt$darken$1 extends Lambda implements Function1<Float, Float> {
    final /* synthetic */ float $amount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeThemeKt$darken$1(float f) {
        super(1);
        this.$amount = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Float f) {
        return invoke(f.floatValue());
    }

    public final Float invoke(float f) {
        return Float.valueOf(Float.max(f - this.$amount, 0.0f));
    }
}
