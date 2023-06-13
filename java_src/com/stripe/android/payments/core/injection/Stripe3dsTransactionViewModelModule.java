package com.stripe.android.payments.core.injection;

import android.app.Application;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepositoryFactory;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3dsTransactionViewModelModule;", "", "()V", "providesInitChallengeRepository", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;", "application", "Landroid/app/Application;", "args", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module
/* loaded from: classes7.dex */
public final class Stripe3dsTransactionViewModelModule {
    @Provides
    public final InitChallengeRepository providesInitChallengeRepository(Application application, Stripe3ds2TransactionContract.Args args, @IOContext CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        return new InitChallengeRepositoryFactory(application, args.getStripeIntent().isLiveMode(), args.getSdkTransactionId(), args.getConfig().getUiCustomization$payments_core_release().getUiCustomization(), args.getFingerprint().getDirectoryServerEncryption().getRootCerts(), args.getEnableLogging(), workContext).create();
    }
}
