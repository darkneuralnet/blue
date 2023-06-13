package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.NavigationCommand;
import com.stripe.android.financialconnections.navigation.NavigationManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J)\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/GoNext;", "", "navigationManager", "Lcom/stripe/android/financialconnections/navigation/NavigationManager;", "logger", "Lcom/stripe/android/core/Logger;", "(Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/core/Logger;)V", "invoke", "Lcom/stripe/android/financialconnections/navigation/NavigationCommand;", "nextPane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "args", "", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class GoNext {
    private final Logger logger;
    private final NavigationManager navigationManager;

    public GoNext(NavigationManager navigationManager, Logger logger) {
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.navigationManager = navigationManager;
        this.logger = logger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavigationCommand invoke$default(GoNext goNext, FinancialConnectionsSessionManifest.Pane pane, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = MapsKt__MapsKt.emptyMap();
        }
        return goNext.invoke(pane, map);
    }

    public final NavigationCommand invoke(FinancialConnectionsSessionManifest.Pane nextPane, Map<String, ? extends Object> args) {
        Intrinsics.checkNotNullParameter(nextPane, "nextPane");
        Intrinsics.checkNotNullParameter(args, "args");
        NavigationCommand navigationCommand = GoNextKt.toNavigationCommand(nextPane, this.logger, args);
        Logger logger = this.logger;
        String destination = navigationCommand.getDestination();
        logger.debug("Navigating to next pane: " + destination);
        this.navigationManager.navigate(navigationCommand);
        return navigationCommand;
    }
}
