package p000;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016JN\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¨\u0006\u0017"}, m28432d2 = {"Lhz1;", "", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "scopeProvider", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LTq4;", "reactiveConfig", "LV74;", "promoManager", "LEa;", "analyticsManager", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Landroid/view/View;", "rootView", "Ljz1;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module
/* renamed from: hz1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42450hz1 {
    @Provides
    /* renamed from: a */
    public final InterfaceC43636jz1 m35423a(ScopeProvider scope, LifecycleScopeProvider<EnumC7097RE> scopeProvider, Context context, C36207Tq4 reactiveConfig, V74 promoManager, InterfaceC1880Ea analyticsManager, BaseActivity activity, View rootView) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        C2621G3 m105895a = C2621G3.m105895a(rootView);
        Intrinsics.checkNotNullExpressionValue(m105895a, "bind(rootView)");
        return new C52529yz1(scope, new C31839Az1(activity, m105895a), context, reactiveConfig, promoManager, analyticsManager);
    }
}
