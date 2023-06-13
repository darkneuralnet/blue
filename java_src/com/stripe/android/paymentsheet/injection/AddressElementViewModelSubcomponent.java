package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import androidx.lifecycle.C11747p;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.AddressElementViewModel;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;
@Subcomponent
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelSubcomponent;", "", "viewModel", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;", "Builder", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface AddressElementViewModelSubcomponent {

    @Subcomponent.Builder
    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H'J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H'J\b\u0010\n\u001a\u00020\tH&¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelSubcomponent$Builder;", "", "Landroid/app/Application;", "application", "Landroidx/lifecycle/p;", "handle", "savedStateHandle", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "args", "Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelSubcomponent;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        @BindsInstance
        Builder args(AddressElementActivityContract.Args args);

        AddressElementViewModelSubcomponent build();

        @BindsInstance
        Builder savedStateHandle(C11747p c11747p);
    }

    AddressElementViewModel getViewModel();
}
