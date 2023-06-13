package com.stripe.android.link.injection;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityViewModel;
import com.stripe.android.link.p042ui.cardedit.CardEditViewModel;
import com.stripe.android.link.p042ui.paymentmethod.PaymentMethodViewModel;
import com.stripe.android.link.p042ui.signup.SignUpViewModel;
import com.stripe.android.link.p042ui.verification.VerificationViewModel;
import com.stripe.android.link.p042ui.wallet.WalletViewModel;
import com.stripe.android.p049ui.core.forms.resources.injection.ResourceRepositoryModule;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import dagger.BindsInstance;
import dagger.Component;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Component(modules = {LinkActivityContractArgsModule.class, LinkCommonModule.class, CoroutineContextModule.class, StripeRepositoryModule.class, CoreCommonModule.class, ResourceRepositoryModule.class})
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\rH&¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent;", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "()V", "inject", "", "injectable", "Lcom/stripe/android/core/injection/Injectable;", "factory", "Lcom/stripe/android/link/LinkActivityViewModel$Factory;", "Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;", "Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;", "Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;", "Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;", "Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;", "Builder", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class LinkViewModelFactoryComponent implements NonFallbackInjector {

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0012\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u0018\u0010\b\u001a\u00020\u00002\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH'J\u0018\u0010\u000b\u001a\u00020\u00002\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH'J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH'J\u001a\u0010\u000f\u001a\u00020\u00002\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\fH'¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;", "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING, "", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "", "", "publishableKeyProvider", "Lkotlin/Function0;", "starterArgs", "Lcom/stripe/android/link/LinkActivityContract$Args;", "stripeAccountIdProvider", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @Component.Builder
    /* loaded from: classes7.dex */
    public interface Builder {
        LinkViewModelFactoryComponent build();

        @BindsInstance
        Builder context(Context context);

        @BindsInstance
        Builder enableLogging(boolean z);

        @BindsInstance
        Builder productUsage(Set<String> set);

        @BindsInstance
        Builder publishableKeyProvider(Function0<String> function0);

        @BindsInstance
        Builder starterArgs(LinkActivityContract.Args args);

        @BindsInstance
        Builder stripeAccountIdProvider(Function0<String> function0);
    }

    @Override // com.stripe.android.core.injection.Injector
    public void inject(Injectable<?> injectable) {
        Intrinsics.checkNotNullParameter(injectable, "injectable");
        if (injectable instanceof LinkActivityViewModel.Factory) {
            inject((LinkActivityViewModel.Factory) injectable);
        } else if (injectable instanceof SignUpViewModel.Factory) {
            inject((SignUpViewModel.Factory) injectable);
        } else if (injectable instanceof VerificationViewModel.Factory) {
            inject((VerificationViewModel.Factory) injectable);
        } else if (injectable instanceof WalletViewModel.Factory) {
            inject((WalletViewModel.Factory) injectable);
        } else if (injectable instanceof PaymentMethodViewModel.Factory) {
            inject((PaymentMethodViewModel.Factory) injectable);
        } else if (injectable instanceof CardEditViewModel.Factory) {
            inject((CardEditViewModel.Factory) injectable);
        } else {
            throw new IllegalArgumentException("invalid Injectable " + injectable + " requested in " + this);
        }
    }

    public abstract void inject(LinkActivityViewModel.Factory factory);

    public abstract void inject(CardEditViewModel.Factory factory);

    public abstract void inject(PaymentMethodViewModel.Factory factory);

    public abstract void inject(SignUpViewModel.Factory factory);

    public abstract void inject(VerificationViewModel.Factory factory);

    public abstract void inject(WalletViewModel.Factory factory);
}
