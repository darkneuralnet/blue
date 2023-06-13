package com.stripe.android.googlepaylauncher;

import android.content.Context;
import com.stripe.android.googlepaylauncher.GooglePayLauncher;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class GooglePayLauncher$Companion$rememberLauncher$1$2 extends Lambda implements Function1<GooglePayEnvironment, GooglePayRepository> {
    final /* synthetic */ GooglePayLauncher.Config $config;
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayLauncher$Companion$rememberLauncher$1$2(Context context, GooglePayLauncher.Config config) {
        super(1);
        this.$context = context;
        this.$config = config;
    }

    @Override // kotlin.jvm.functions.Function1
    public final GooglePayRepository invoke(GooglePayEnvironment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new DefaultGooglePayRepository(this.$context, this.$config.getEnvironment(), ConvertKt.convert(this.$config.getBillingAddressConfig()), this.$config.getExistingPaymentMethodRequired(), this.$config.getAllowCreditCards(), null, 32, null);
    }
}
