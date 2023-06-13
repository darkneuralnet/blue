package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.navigation.NavigationManager;
/* loaded from: classes7.dex */
public final class GoNext_Factory implements InterfaceC48812sj1<GoNext> {
    private final Y94<Logger> loggerProvider;
    private final Y94<NavigationManager> navigationManagerProvider;

    public GoNext_Factory(Y94<NavigationManager> y94, Y94<Logger> y942) {
        this.navigationManagerProvider = y94;
        this.loggerProvider = y942;
    }

    public static GoNext_Factory create(Y94<NavigationManager> y94, Y94<Logger> y942) {
        return new GoNext_Factory(y94, y942);
    }

    public static GoNext newInstance(NavigationManager navigationManager, Logger logger) {
        return new GoNext(navigationManager, logger);
    }

    @Override // p000.Y94
    public GoNext get() {
        return newInstance(this.navigationManagerProvider.get(), this.loggerProvider.get());
    }
}
