package com.stripe.android.financialconnections.p040di;

import android.app.Application;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerSubcomponent;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentSubcomponent;
import com.stripe.android.financialconnections.features.consent.ConsentSubcomponent;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerSubcomponent;
import com.stripe.android.financialconnections.features.manualentry.ManualEntrySubcomponent;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthSubcomponent;
import com.stripe.android.financialconnections.features.reset.ResetSubcomponent;
import com.stripe.android.financialconnections.features.success.SuccessSubcomponent;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.NavigationManager;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import com.stripe.android.uicore.image.StripeImageLoader;
import dagger.Module;
import dagger.Provides;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0007J>\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;", "", "()V", "providesFinancialConnectionsAccountsRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;", "requestExecutor", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "apiOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "logger", "Lcom/stripe/android/core/Logger;", "providesFinancialConnectionsInstitutionsRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;", "providesFinancialConnectionsManifestRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "locale", "Ljava/util/Locale;", "initialSynchronizeSessionResponse", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "providesImageLoader", "Lcom/stripe/android/uicore/image/StripeImageLoader;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/app/Application;", "providesNavigationManager", "Lcom/stripe/android/financialconnections/navigation/NavigationManager;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module(subcomponents = {ConsentSubcomponent.class, ManualEntrySubcomponent.class, InstitutionPickerSubcomponent.class, PartnerAuthSubcomponent.class, SuccessSubcomponent.class, AccountPickerSubcomponent.class, AttachPaymentSubcomponent.class, ResetSubcomponent.class})
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeModule */
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeModule {
    @Provides
    public final FinancialConnectionsAccountsRepository providesFinancialConnectionsAccountsRepository(FinancialConnectionsRequestExecutor requestExecutor, ApiRequest.Options apiOptions, ApiRequest.Factory apiRequestFactory, Logger logger) {
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
        Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return FinancialConnectionsAccountsRepository.Companion.invoke(requestExecutor, apiRequestFactory, apiOptions, logger);
    }

    @Provides
    public final FinancialConnectionsInstitutionsRepository providesFinancialConnectionsInstitutionsRepository(FinancialConnectionsRequestExecutor requestExecutor, ApiRequest.Factory apiRequestFactory, ApiRequest.Options apiOptions) {
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
        Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
        return FinancialConnectionsInstitutionsRepository.Companion.invoke(requestExecutor, apiOptions, apiRequestFactory);
    }

    @Provides
    public final FinancialConnectionsManifestRepository providesFinancialConnectionsManifestRepository(FinancialConnectionsRequestExecutor requestExecutor, ApiRequest.Factory apiRequestFactory, ApiRequest.Options apiOptions, Locale locale, Logger logger, SynchronizeSessionResponse synchronizeSessionResponse) {
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
        return companion.invoke(requestExecutor, apiRequestFactory, apiOptions, logger, locale2, synchronizeSessionResponse);
    }

    @Provides
    public final StripeImageLoader providesImageLoader(Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new StripeImageLoader(context, null, null, null, null, 14, null);
    }

    @Provides
    public final NavigationManager providesNavigationManager() {
        return new NavigationManager(C37824aD0.m71790a(XU5.m76946b(null, 1, null).plus(T41.m84378a())));
    }
}
