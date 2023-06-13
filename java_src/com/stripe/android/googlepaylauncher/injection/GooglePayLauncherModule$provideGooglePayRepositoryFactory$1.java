package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.core.Logger;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;", "environment", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class GooglePayLauncherModule$provideGooglePayRepositoryFactory$1 extends Lambda implements Function1<GooglePayEnvironment, DefaultGooglePayRepository> {
    final /* synthetic */ Context $appContext;
    final /* synthetic */ Logger $logger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayLauncherModule$provideGooglePayRepositoryFactory$1(Context context, Logger logger) {
        super(1);
        this.$appContext = context;
        this.$logger = logger;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DefaultGooglePayRepository invoke(GooglePayEnvironment environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        return new DefaultGooglePayRepository(this.$appContext, environment, new GooglePayJsonFactory.BillingAddressParameters(false, null, false, 7, null), true, true, this.$logger);
    }
}
