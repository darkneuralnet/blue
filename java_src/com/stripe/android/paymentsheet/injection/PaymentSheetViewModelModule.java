package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.paymentsheet.DefaultPrefsRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.PrefsRepository;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;", "", "starterArgs", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;", "(Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;)V", "provideArgs", "providePrefsRepository", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "appContext", "Landroid/content/Context;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module
/* loaded from: classes7.dex */
public final class PaymentSheetViewModelModule {
    private final PaymentSheetContractV2.Args starterArgs;

    public PaymentSheetViewModelModule(PaymentSheetContractV2.Args starterArgs) {
        Intrinsics.checkNotNullParameter(starterArgs, "starterArgs");
        this.starterArgs = starterArgs;
    }

    @Provides
    public final PaymentSheetContractV2.Args provideArgs() {
        return this.starterArgs;
    }

    @Provides
    public final PrefsRepository providePrefsRepository(Context appContext, @IOContext CoroutineContext workContext) {
        String str;
        PaymentSheet.CustomerConfiguration customer;
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        PaymentSheet.Configuration config$paymentsheet_release = this.starterArgs.getConfig$paymentsheet_release();
        if (config$paymentsheet_release != null && (customer = config$paymentsheet_release.getCustomer()) != null) {
            str = customer.getId();
        } else {
            str = null;
        }
        return new DefaultPrefsRepository(appContext, str, workContext);
    }
}
