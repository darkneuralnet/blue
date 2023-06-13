package com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di;

import android.app.Application;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
@Component(modules = {CoroutineContextModule.class, USBankAccountFormViewModelModule.class, StripeRepositoryModule.class, CoreCommonModule.class})
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormComponent;", "", "inject", "", "factory", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Factory;", "Builder", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormComponent */
/* loaded from: classes7.dex */
public interface USBankAccountFormComponent {

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormComponent$Builder;", "", "application", "Landroid/app/Application;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormComponent;", "injectorKey", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @Component.Builder
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormComponent$Builder */
    /* loaded from: classes7.dex */
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        USBankAccountFormComponent build();

        @BindsInstance
        Builder injectorKey(@InjectorKey String str);
    }

    void inject(USBankAccountFormViewModel.Factory factory);
}
