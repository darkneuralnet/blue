package com.stripe.android.googlepaylauncher;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C35336Px6;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LEP3;", "invoke", "()LEP3;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class DefaultGooglePayRepository$paymentsClient$2 extends Lambda implements Function0<EP3> {
    final /* synthetic */ DefaultGooglePayRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultGooglePayRepository$paymentsClient$2(DefaultGooglePayRepository defaultGooglePayRepository) {
        super(0);
        this.this$0 = defaultGooglePayRepository;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final EP3 invoke() {
        GooglePayEnvironment googlePayEnvironment;
        Context context;
        C35336Px6.C6596a.C6597a c6597a = new C35336Px6.C6596a.C6597a();
        googlePayEnvironment = this.this$0.environment;
        C35336Px6.C6596a m89235a = c6597a.m89234b(googlePayEnvironment.getValue$payments_core_release()).m89235a();
        Intrinsics.checkNotNullExpressionValue(m89235a, "Builder()\n            .s…lue)\n            .build()");
        context = this.this$0.context;
        EP3 m89236b = C35336Px6.m89236b(context, m89235a);
        Intrinsics.checkNotNullExpressionValue(m89236b, "getPaymentsClient(context, options)");
        return m89236b;
    }
}
