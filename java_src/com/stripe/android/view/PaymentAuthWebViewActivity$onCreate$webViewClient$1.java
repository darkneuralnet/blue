package com.stripe.android.view;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class PaymentAuthWebViewActivity$onCreate$webViewClient$1 extends FunctionReferenceImpl implements Function1<Intent, Unit> {
    public PaymentAuthWebViewActivity$onCreate$webViewClient$1(Object obj) {
        super(1, obj, PaymentAuthWebViewActivity.class, "startActivity", "startActivity(Landroid/content/Intent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
        invoke2(intent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Intent intent) {
        ((PaymentAuthWebViewActivity) this.receiver).startActivity(intent);
    }
}
