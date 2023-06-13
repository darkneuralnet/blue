package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.debug.DebugConfiguration;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.utils.Experiment;
import com.stripe.android.financialconnections.utils.ExperimentsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;", "", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "debugConfiguration", "Lcom/stripe/android/financialconnections/debug/DebugConfiguration;", "(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/debug/DebugConfiguration;)V", "logExposure", "", "manifest", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nativeAuthFlowEnabled", "", "nativeKillSwitchActive", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nNativeAuthFlowRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeAuthFlowRouter.kt\ncom/stripe/android/financialconnections/domain/NativeAuthFlowRouter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,50:1\n1#2:51\n187#3,3:52\n*S KotlinDebug\n*F\n+ 1 NativeAuthFlowRouter.kt\ncom/stripe/android/financialconnections/domain/NativeAuthFlowRouter\n*L\n41#1:52,3\n*E\n"})
/* loaded from: classes7.dex */
public final class NativeAuthFlowRouter {
    public static final Companion Companion = new Companion(null);
    private static final String EXPERIMENT_VALUE_NATIVE_TREATMENT = "treatment";
    private static final String FEATURE_KEY_NATIVE_KILLSWITCH = "bank_connections_mobile_native_version_killswitch";
    private final DebugConfiguration debugConfiguration;
    private final FinancialConnectionsAnalyticsTracker eventTracker;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter$Companion;", "", "()V", "EXPERIMENT_VALUE_NATIVE_TREATMENT", "", "FEATURE_KEY_NATIVE_KILLSWITCH", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public NativeAuthFlowRouter(FinancialConnectionsAnalyticsTracker eventTracker, DebugConfiguration debugConfiguration) {
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(debugConfiguration, "debugConfiguration");
        this.eventTracker = eventTracker;
        this.debugConfiguration = debugConfiguration;
    }

    private final boolean nativeKillSwitchActive(FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        boolean z;
        Map<String, Boolean> features = financialConnectionsSessionManifest.getFeatures();
        if (features == null) {
            return true;
        }
        if (!features.isEmpty()) {
            for (Map.Entry<String, Boolean> entry : features.entrySet()) {
                if (Intrinsics.areEqual(entry.getKey(), FEATURE_KEY_NATIVE_KILLSWITCH) && entry.getValue().booleanValue()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Object logExposure(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Boolean overridenNative$financial_connections_release = this.debugConfiguration.getOverridenNative$financial_connections_release();
        if (overridenNative$financial_connections_release != null) {
            overridenNative$financial_connections_release.booleanValue();
            return Unit.INSTANCE;
        } else if (!nativeKillSwitchActive(financialConnectionsSessionManifest)) {
            Object trackExposure = ExperimentsKt.trackExposure(this.eventTracker, Experiment.CONNECTIONS_MOBILE_NATIVE, financialConnectionsSessionManifest, continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (trackExposure == coroutine_suspended) {
                return trackExposure;
            }
            return Unit.INSTANCE;
        } else {
            return Unit.INSTANCE;
        }
    }

    public final boolean nativeAuthFlowEnabled(FinancialConnectionsSessionManifest manifest) {
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        Boolean overridenNative$financial_connections_release = this.debugConfiguration.getOverridenNative$financial_connections_release();
        if (overridenNative$financial_connections_release != null) {
            return overridenNative$financial_connections_release.booleanValue();
        }
        boolean nativeKillSwitchActive = nativeKillSwitchActive(manifest);
        boolean areEqual = Intrinsics.areEqual(ExperimentsKt.experimentAssignment(manifest, Experiment.CONNECTIONS_MOBILE_NATIVE), EXPERIMENT_VALUE_NATIVE_TREATMENT);
        if (!nativeKillSwitchActive && areEqual) {
            return true;
        }
        return false;
    }
}
