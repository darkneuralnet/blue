package com.stripe.android.financialconnections.features.attachpayment;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;
@Subcomponent
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentSubcomponent;", "", "viewModel", "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;", "getViewModel", "()Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;", "Builder", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface AttachPaymentSubcomponent {

    @Subcomponent.Builder
    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentSubcomponent$Builder;", "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentSubcomponent;", "initialState", "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface Builder {
        AttachPaymentSubcomponent build();

        @BindsInstance
        Builder initialState(AttachPaymentState attachPaymentState);
    }

    AttachPaymentViewModel getViewModel();
}
