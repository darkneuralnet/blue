package com.stripe.android.paymentsheet.injection;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.paymentsheet.addresselement.InputAddressViewModel;
import dagger.Subcomponent;
import kotlin.Metadata;
@Subcomponent
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/InputAddressViewModelSubcomponent;", "", "inputAddressViewModel", "Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;", "getInputAddressViewModel", "()Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;", "Builder", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface InputAddressViewModelSubcomponent {

    @Subcomponent.Builder
    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/InputAddressViewModelSubcomponent$Builder;", "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/stripe/android/paymentsheet/injection/InputAddressViewModelSubcomponent;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface Builder {
        InputAddressViewModelSubcomponent build();
    }

    InputAddressViewModel getInputAddressViewModel();
}
