package com.stripe.android.paymentsheet.p047ui;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.GooglePayButtonKt$GooglePayButton$1 */
/* loaded from: classes7.dex */
public final class GooglePayButtonKt$GooglePayButton$1 extends Lambda implements Function1<Context, GooglePayButton> {
    public static final GooglePayButtonKt$GooglePayButton$1 INSTANCE = new GooglePayButtonKt$GooglePayButton$1();

    public GooglePayButtonKt$GooglePayButton$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final GooglePayButton invoke(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new GooglePayButton(context, null, 0, 6, null);
    }
}
