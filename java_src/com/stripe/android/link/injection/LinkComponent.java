package com.stripe.android.link.injection;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityViewModel;
import com.stripe.android.link.p042ui.cardedit.CardEditViewModel;
import com.stripe.android.link.p042ui.paymentmethod.PaymentMethodViewModel;
import com.stripe.android.link.p042ui.signup.SignUpViewModel;
import com.stripe.android.link.p042ui.verification.VerificationViewModel;
import com.stripe.android.link.p042ui.wallet.WalletViewModel;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;
@Subcomponent(modules = {LinkActivityContractArgsModule.class})
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/link/injection/LinkComponent;", "", "()V", "inject", "", "factory", "Lcom/stripe/android/link/LinkActivityViewModel$Factory;", "Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;", "Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;", "Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;", "Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;", "Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;", "Builder", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class LinkComponent {

    @Subcomponent.Builder
    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/link/injection/LinkComponent$Builder;", "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/stripe/android/link/injection/LinkComponent;", "starterArgs", "Lcom/stripe/android/link/LinkActivityContract$Args;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface Builder {
        LinkComponent build();

        @BindsInstance
        Builder starterArgs(LinkActivityContract.Args args);
    }

    public abstract void inject(LinkActivityViewModel.Factory factory);

    public abstract void inject(CardEditViewModel.Factory factory);

    public abstract void inject(PaymentMethodViewModel.Factory factory);

    public abstract void inject(SignUpViewModel.Factory factory);

    public abstract void inject(VerificationViewModel.Factory factory);

    public abstract void inject(WalletViewModel.Factory factory);
}
