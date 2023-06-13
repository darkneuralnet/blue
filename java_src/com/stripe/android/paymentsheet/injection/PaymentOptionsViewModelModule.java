package com.stripe.android.paymentsheet.injection;

import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.InjectorKt;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelModule;", "", "()V", "provideDummyInjectorKey", "", "provideEventReporterMode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module(subcomponents = {PaymentOptionsViewModelSubcomponent.class, FormViewModelSubcomponent.class})
/* loaded from: classes7.dex */
public final class PaymentOptionsViewModelModule {
    @Provides
    @InjectorKey
    public final String provideDummyInjectorKey() {
        return InjectorKt.DUMMY_INJECTOR_KEY;
    }

    @Provides
    public final EventReporter.Mode provideEventReporterMode() {
        return EventReporter.Mode.Custom;
    }
}
