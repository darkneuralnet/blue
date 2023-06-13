package com.stripe.android.core.networking;

import com.stripe.android.core.networking.AnalyticsRequestV2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/core/networking/AnalyticsRequestV2$Parameter;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsRequestV2$createParams$2 extends Lambda implements Function1<AnalyticsRequestV2.Parameter, CharSequence> {
    public static final AnalyticsRequestV2$createParams$2 INSTANCE = new AnalyticsRequestV2$createParams$2();

    public AnalyticsRequestV2$createParams$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(AnalyticsRequestV2.Parameter it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.toString();
    }
}
