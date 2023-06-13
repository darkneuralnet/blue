package com.stripe.android.financialconnections.utils;

import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a%\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m28432d2 = {"experimentAssignment", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "experiment", "Lcom/stripe/android/financialconnections/utils/Experiment;", "experimentPresent", "", "trackExposure", "", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "manifest", "(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/utils/Experiment;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ExperimentsKt {
    public static final String experimentAssignment(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, Experiment experiment) {
        Intrinsics.checkNotNullParameter(financialConnectionsSessionManifest, "<this>");
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Map<String, String> experimentAssignments = financialConnectionsSessionManifest.getExperimentAssignments();
        if (experimentAssignments != null) {
            return experimentAssignments.get(experiment.getKey());
        }
        return null;
    }

    public static final boolean experimentPresent(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, Experiment experiment) {
        Intrinsics.checkNotNullParameter(financialConnectionsSessionManifest, "<this>");
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        if (experimentAssignment(financialConnectionsSessionManifest, experiment) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object trackExposure(FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, Experiment experiment, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, Continuation<? super Unit> continuation) {
        ExperimentsKt$trackExposure$1 experimentsKt$trackExposure$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof ExperimentsKt$trackExposure$1) {
            experimentsKt$trackExposure$1 = (ExperimentsKt$trackExposure$1) continuation;
            int i2 = experimentsKt$trackExposure$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                experimentsKt$trackExposure$1.label = i2 - Integer.MIN_VALUE;
                Object obj = experimentsKt$trackExposure$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = experimentsKt$trackExposure$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        ((Result) obj).m116792unboximpl();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    String assignmentEventId = financialConnectionsSessionManifest.getAssignmentEventId();
                    String accountholderToken = financialConnectionsSessionManifest.getAccountholderToken();
                    if (experimentPresent(financialConnectionsSessionManifest, experiment) && assignmentEventId != null && accountholderToken != null) {
                        FinancialConnectionsEvent exposure = new FinancialConnectionsEvent.Exposure(experiment.getKey(), assignmentEventId, accountholderToken);
                        experimentsKt$trackExposure$1.label = 1;
                        if (financialConnectionsAnalyticsTracker.mo116345trackgIAlus(exposure, experimentsKt$trackExposure$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        experimentsKt$trackExposure$1 = new ExperimentsKt$trackExposure$1(continuation);
        Object obj2 = experimentsKt$trackExposure$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = experimentsKt$trackExposure$1.label;
        if (i == 0) {
        }
        return Unit.INSTANCE;
    }
}
