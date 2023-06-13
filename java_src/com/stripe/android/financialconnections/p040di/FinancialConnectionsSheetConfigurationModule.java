package com.stripe.android.financialconnections.p040di;

import android.app.Application;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetConfigurationModule;", "", "()V", "providesApplicationId", "", "application", "Landroid/app/Application;", "providesEnableLogging", "", "providesPublishableKey", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "providesStripeAccountId", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetConfigurationModule */
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetConfigurationModule {
    public static final FinancialConnectionsSheetConfigurationModule INSTANCE = new FinancialConnectionsSheetConfigurationModule();

    private FinancialConnectionsSheetConfigurationModule() {
    }

    @Provides
    public final String providesApplicationId(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        String packageName = application.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "application.packageName");
        return packageName;
    }

    @Provides
    public final boolean providesEnableLogging() {
        return false;
    }

    @Provides
    public final String providesPublishableKey(FinancialConnectionsSheet.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return configuration.getPublishableKey();
    }

    @Provides
    public final String providesStripeAccountId(FinancialConnectionsSheet.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return configuration.getStripeAccountId();
    }
}
