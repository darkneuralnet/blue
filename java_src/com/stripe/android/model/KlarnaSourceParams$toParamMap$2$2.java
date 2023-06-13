package com.stripe.android.model;

import com.stripe.android.model.KlarnaSourceParams;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/model/KlarnaSourceParams$CustomPaymentMethods;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class KlarnaSourceParams$toParamMap$2$2 extends Lambda implements Function1<KlarnaSourceParams.CustomPaymentMethods, CharSequence> {
    public static final KlarnaSourceParams$toParamMap$2$2 INSTANCE = new KlarnaSourceParams$toParamMap$2$2();

    public KlarnaSourceParams$toParamMap$2$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(KlarnaSourceParams.CustomPaymentMethods it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCode$payments_core_release();
    }
}
