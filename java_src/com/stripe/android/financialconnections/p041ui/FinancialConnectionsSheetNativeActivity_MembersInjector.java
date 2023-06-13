package com.stripe.android.financialconnections.p041ui;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.navigation.NavigationManager;
import com.stripe.android.uicore.image.StripeImageLoader;
import dagger.MembersInjector;
/* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity_MembersInjector */
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeActivity_MembersInjector implements MembersInjector<FinancialConnectionsSheetNativeActivity> {
    private final Y94<StripeImageLoader> imageLoaderProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<NavigationManager> navigationManagerProvider;

    public FinancialConnectionsSheetNativeActivity_MembersInjector(Y94<NavigationManager> y94, Y94<Logger> y942, Y94<StripeImageLoader> y943) {
        this.navigationManagerProvider = y94;
        this.loggerProvider = y942;
        this.imageLoaderProvider = y943;
    }

    public static MembersInjector<FinancialConnectionsSheetNativeActivity> create(Y94<NavigationManager> y94, Y94<Logger> y942, Y94<StripeImageLoader> y943) {
        return new FinancialConnectionsSheetNativeActivity_MembersInjector(y94, y942, y943);
    }

    public static void injectImageLoader(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, StripeImageLoader stripeImageLoader) {
        financialConnectionsSheetNativeActivity.imageLoader = stripeImageLoader;
    }

    public static void injectLogger(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, Logger logger) {
        financialConnectionsSheetNativeActivity.logger = logger;
    }

    public static void injectNavigationManager(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, NavigationManager navigationManager) {
        financialConnectionsSheetNativeActivity.navigationManager = navigationManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity) {
        injectNavigationManager(financialConnectionsSheetNativeActivity, this.navigationManagerProvider.get());
        injectLogger(financialConnectionsSheetNativeActivity, this.loggerProvider.get());
        injectImageLoader(financialConnectionsSheetNativeActivity, this.imageLoaderProvider.get());
    }
}
