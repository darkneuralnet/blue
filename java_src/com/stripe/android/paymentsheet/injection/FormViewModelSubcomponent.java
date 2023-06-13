package com.stripe.android.paymentsheet.injection;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;
@Subcomponent
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent;", "", "viewModel", "Lcom/stripe/android/paymentsheet/forms/FormViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/forms/FormViewModel;", "Builder", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface FormViewModelSubcomponent {

    @Subcomponent.Builder
    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\b\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\b\u0010\n\u001a\u00020\tH&¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;", "", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "args", "formArguments", "LEu1;", "", "saveForFutureUseVisibleFlow", "showCheckboxFlow", "Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public interface Builder {
        FormViewModelSubcomponent build();

        @BindsInstance
        Builder formArguments(FormArguments formArguments);

        @BindsInstance
        Builder showCheckboxFlow(InterfaceC32730Eu1<Boolean> interfaceC32730Eu1);
    }

    FormViewModel getViewModel();
}
