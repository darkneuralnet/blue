package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.p049ui.core.forms.resources.injection.ResourceRepositoryModule;
import com.stripe.android.p049ui.core.injection.FormControllerModule;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.AddressElementViewModel;
import com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel;
import com.stripe.android.paymentsheet.addresselement.InputAddressViewModel;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Component(modules = {PaymentSheetCommonModule.class, CoroutineContextModule.class, StripeRepositoryModule.class, CoreCommonModule.class, AddressElementViewModelModule.class, FormControllerModule.class, ResourceRepositoryModule.class})
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\nH&¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelFactoryComponent;", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "()V", "inject", "", "injectable", "Lcom/stripe/android/core/injection/Injectable;", "factory", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel$Factory;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;", "Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$Factory;", "Builder", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class AddressElementViewModelFactoryComponent implements NonFallbackInjector {

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelFactoryComponent$Builder;", "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelFactoryComponent;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "starterArgs", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @Component.Builder
    /* loaded from: classes7.dex */
    public interface Builder {
        AddressElementViewModelFactoryComponent build();

        @BindsInstance
        Builder context(Context context);

        @BindsInstance
        Builder starterArgs(AddressElementActivityContract.Args args);
    }

    @Override // com.stripe.android.core.injection.Injector
    public void inject(Injectable<?> injectable) {
        Intrinsics.checkNotNullParameter(injectable, "injectable");
        if (injectable instanceof AddressElementViewModel.Factory) {
            inject((AddressElementViewModel.Factory) injectable);
        } else if (injectable instanceof InputAddressViewModel.Factory) {
            inject((InputAddressViewModel.Factory) injectable);
        } else if (injectable instanceof AutocompleteViewModel.Factory) {
            inject((AutocompleteViewModel.Factory) injectable);
        } else {
            throw new IllegalArgumentException("invalid Injectable " + injectable + " requested in " + this);
        }
    }

    public abstract void inject(AddressElementViewModel.Factory factory);

    public abstract void inject(AutocompleteViewModel.Factory factory);

    public abstract void inject(InputAddressViewModel.Factory factory);
}
