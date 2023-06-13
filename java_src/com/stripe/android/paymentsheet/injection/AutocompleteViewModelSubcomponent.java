package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;
@Subcomponent
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent;", "", "autoCompleteViewModel", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;", "getAutoCompleteViewModel", "()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;", "Builder", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface AutocompleteViewModelSubcomponent {

    @Subcomponent.Builder
    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;", "", "application", "Landroid/app/Application;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent;", "configuration", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        AutocompleteViewModelSubcomponent build();

        @BindsInstance
        Builder configuration(AutocompleteViewModel.Args args);
    }

    AutocompleteViewModel getAutoCompleteViewModel();
}
