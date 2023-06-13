package com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di;

import android.app.Application;
import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import dagger.Module;
import dagger.Provides;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0007¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelModule;", "", "()V", "providePaymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "appContext", "Landroid/content/Context;", "providePublishableKey", "Lkotlin/Function0;", "", "providesAppContext", "application", "Landroid/app/Application;", "providesEnableLogging", "", "providesProductUsage", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module(subcomponents = {USBankAccountFormViewModelSubcomponent.class})
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelModule */
/* loaded from: classes7.dex */
public final class USBankAccountFormViewModelModule {
    @Provides
    public final PaymentConfiguration providePaymentConfiguration(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        return PaymentConfiguration.Companion.getInstance(appContext);
    }

    @Provides
    public final Function0<String> providePublishableKey(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        return new USBankAccountFormViewModelModule$providePublishableKey$1(appContext);
    }

    @Provides
    public final Context providesAppContext(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return application;
    }

    @Provides
    public final boolean providesEnableLogging() {
        return false;
    }

    @Provides
    public final Set<String> providesProductUsage() {
        Set<String> emptySet;
        emptySet = SetsKt__SetsKt.emptySet();
        return emptySet;
    }
}
