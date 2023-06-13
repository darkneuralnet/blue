package com.stripe.android.financialconnections.navigation;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/financialconnections/navigation/NavigationManager;", "", "Lcom/stripe/android/financialconnections/navigation/NavigationCommand;", "directions", "", "navigate", "LZC0;", "externalScope", "LZC0;", "LBX2;", "commands", "LBX2;", "getCommands", "()LBX2;", "setCommands", "(LBX2;)V", "<init>", "(LZC0;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class NavigationManager {
    private BX2<NavigationCommand> commands;
    private final ZC0 externalScope;

    public NavigationManager(ZC0 externalScope) {
        Intrinsics.checkNotNullParameter(externalScope, "externalScope");
        this.externalScope = externalScope;
        this.commands = C36748Vy5.m79031b(0, 0, null, 7, null);
    }

    public final BX2<NavigationCommand> getCommands() {
        return this.commands;
    }

    public final void navigate(NavigationCommand directions) {
        Intrinsics.checkNotNullParameter(directions, "directions");
        Log.e("NavigationManager", "navigate: " + directions);
        Z30.m73800d(this.externalScope, null, null, new NavigationManager$navigate$1(this, directions, null), 3, null);
    }

    public final void setCommands(BX2<NavigationCommand> bx2) {
        Intrinsics.checkNotNullParameter(bx2, "<set-?>");
        this.commands = bx2;
    }
}
