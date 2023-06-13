package co.bird.android.model.wire.configs;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0006"}, m28432d2 = {"combinedIncentive", "", "Lco/bird/android/model/wire/configs/AutoPayPlanConfig;", "includeGoogleIncentive", "", "hasGooglePayIncentive", "model-wire_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAutoPayPlanConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoPayPlanConfig.kt\nco/bird/android/model/wire/configs/AutoPayPlanConfigKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
/* loaded from: classes4.dex */
public final class AutoPayPlanConfigKt {
    public static final int combinedIncentive(AutoPayPlanConfig autoPayPlanConfig, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(autoPayPlanConfig, "<this>");
        int incentiveAmount = autoPayPlanConfig.getIncentiveAmount();
        Integer valueOf = Integer.valueOf(autoPayPlanConfig.getGooglePayIncentiveAmount());
        valueOf.intValue();
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = 0;
        }
        return incentiveAmount + i;
    }

    public static final boolean hasGooglePayIncentive(AutoPayPlanConfig autoPayPlanConfig) {
        Intrinsics.checkNotNullParameter(autoPayPlanConfig, "<this>");
        if (autoPayPlanConfig.getGooglePayIncentiveAmount() > 0) {
            return true;
        }
        return false;
    }
}
