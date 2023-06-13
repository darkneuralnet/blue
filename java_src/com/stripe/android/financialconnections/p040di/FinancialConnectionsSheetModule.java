package com.stripe.android.financialconnections.p040di;

import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import dagger.Module;
import dagger.Provides;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule;", "", "()V", "providesFinancialConnectionsManifestRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "requestExecutor", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "apiOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "locale", "Ljava/util/Locale;", "logger", "Lcom/stripe/android/core/Logger;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetModule */
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetModule {
    public static final FinancialConnectionsSheetModule INSTANCE = new FinancialConnectionsSheetModule();

    private FinancialConnectionsSheetModule() {
    }

    @Provides
    public final FinancialConnectionsManifestRepository providesFinancialConnectionsManifestRepository(FinancialConnectionsRequestExecutor requestExecutor, ApiRequest.Factory apiRequestFactory, ApiRequest.Options apiOptions, Locale locale, Logger logger) {
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
        Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
        Intrinsics.checkNotNullParameter(logger, "logger");
        FinancialConnectionsManifestRepository.Companion companion = FinancialConnectionsManifestRepository.Companion;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Locale locale2 = locale;
        Intrinsics.checkNotNullExpressionValue(locale2, "locale ?: Locale.getDefault()");
        return companion.invoke(requestExecutor, apiRequestFactory, apiOptions, logger, locale2, null);
    }
}
