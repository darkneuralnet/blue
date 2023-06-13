package com.stripe.android.link.model;

import androidx.lifecycle.C11747p;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkScreen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b2\u00103J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u000f\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018J\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0006R\"\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R0\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00064"}, m28432d2 = {"Lcom/stripe/android/link/model/Navigator;", "", "Lcom/stripe/android/link/LinkScreen;", "target", "", "clearBackStack", "", "navigateTo", "(Lcom/stripe/android/link/LinkScreen;Z)Lkotlin/Unit;", "", "key", "value", "setResult", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlin/Unit;", "T", "LEu1;", "kotlin.jvm.PlatformType", "getResultFlow", "userInitiated", "onBack", "Lcom/stripe/android/link/LinkActivityResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "dismiss", "(Lcom/stripe/android/link/LinkActivityResult;)Lkotlin/Unit;", "Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;", "reason", "cancel", "isOnRootScreen", "()Ljava/lang/Boolean;", "unregister", "userNavigationEnabled", "Z", "getUserNavigationEnabled", "()Z", "setUserNavigationEnabled", "(Z)V", "LOY2;", "navigationController", "LOY2;", "getNavigationController", "()LOY2;", "setNavigationController", "(LOY2;)V", "Lkotlin/Function1;", "onDismiss", "Lkotlin/jvm/functions/Function1;", "getOnDismiss", "()Lkotlin/jvm/functions/Function1;", "setOnDismiss", "(Lkotlin/jvm/functions/Function1;)V", "<init>", "()V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class Navigator {
    private OY2 navigationController;
    private Function1<? super LinkActivityResult, Unit> onDismiss;
    private boolean userNavigationEnabled = true;

    public static /* synthetic */ Unit navigateTo$default(Navigator navigator, LinkScreen linkScreen, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return navigator.navigateTo(linkScreen, z);
    }

    public final void cancel(LinkActivityResult.Canceled.Reason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        dismiss(new LinkActivityResult.Canceled(reason));
    }

    public final Unit dismiss(LinkActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Function1<? super LinkActivityResult, Unit> function1 = this.onDismiss;
        if (function1 != null) {
            function1.invoke(result);
            return Unit.INSTANCE;
        }
        return null;
    }

    public final OY2 getNavigationController() {
        return this.navigationController;
    }

    public final Function1<LinkActivityResult, Unit> getOnDismiss() {
        return this.onDismiss;
    }

    public final <T> InterfaceC32730Eu1<T> getResultFlow(String key) {
        AY2 m110202y;
        C11747p m115579i;
        C49882uX2<T> m66946g;
        Intrinsics.checkNotNullParameter(key, "key");
        OY2 oy2 = this.navigationController;
        if (oy2 != null && (m110202y = oy2.m110202y()) != null && (m115579i = m110202y.m115579i()) != null && (m66946g = m115579i.m66946g(key)) != null) {
            return C44189kv1.m28165a(m66946g);
        }
        return null;
    }

    public final boolean getUserNavigationEnabled() {
        return this.userNavigationEnabled;
    }

    public final Boolean isOnRootScreen() {
        OY2 oy2 = this.navigationController;
        if (oy2 != null) {
            return Boolean.valueOf(NavigatorKt.isOnRootScreen(oy2));
        }
        return null;
    }

    public final Unit navigateTo(LinkScreen target, boolean z) {
        Intrinsics.checkNotNullParameter(target, "target");
        OY2 oy2 = this.navigationController;
        if (oy2 != null) {
            oy2.m110247O(target.getRoute(), new Navigator$navigateTo$1$1(z, oy2));
            return Unit.INSTANCE;
        }
        return null;
    }

    public final void onBack(boolean z) {
        OY2 oy2;
        if ((!z || this.userNavigationEnabled) && (oy2 = this.navigationController) != null && !oy2.m110243S()) {
            cancel(LinkActivityResult.Canceled.Reason.BackPressed);
        }
    }

    public final void setNavigationController(OY2 oy2) {
        this.navigationController = oy2;
    }

    public final void setOnDismiss(Function1<? super LinkActivityResult, Unit> function1) {
        this.onDismiss = function1;
    }

    public final Unit setResult(String key, Object value) {
        AY2 m110256F;
        C11747p m115579i;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        OY2 oy2 = this.navigationController;
        if (oy2 != null && (m110256F = oy2.m110256F()) != null && (m115579i = m110256F.m115579i()) != null) {
            m115579i.m66940m(key, value);
            return Unit.INSTANCE;
        }
        return null;
    }

    public final void setUserNavigationEnabled(boolean z) {
        this.userNavigationEnabled = z;
    }

    public final void unregister() {
        this.onDismiss = null;
        this.navigationController = null;
    }
}
