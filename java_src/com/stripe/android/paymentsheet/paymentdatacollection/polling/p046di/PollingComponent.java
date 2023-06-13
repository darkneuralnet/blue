package com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di;

import android.app.Application;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel;
import com.stripe.android.polling.IntentStatusPoller;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
@Component(modules = {CoroutineContextModule.class, PollingViewModelModule.class, StripeRepositoryModule.class, CoreCommonModule.class})
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingComponent;", "", "inject", "", "factory", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;", "Builder", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingComponent */
/* loaded from: classes7.dex */
public interface PollingComponent {

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H'J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0012\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\tH'J\b\u0010\f\u001a\u00020\u000bH&¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingComponent$Builder;", "", "Landroid/app/Application;", "application", "Lcom/stripe/android/polling/IntentStatusPoller$Config;", "config", "LSC0;", "dispatcher", "ioDispatcher", "", "injectorKey", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingComponent;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component.Builder
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingComponent$Builder */
    /* loaded from: classes7.dex */
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        PollingComponent build();

        @BindsInstance
        Builder config(IntentStatusPoller.Config config);

        @BindsInstance
        Builder injectorKey(@InjectorKey String str);

        @BindsInstance
        Builder ioDispatcher(SC0 sc0);
    }

    void inject(PollingViewModel.Factory factory);
}
