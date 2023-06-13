package co.bird.android.model.analytics;

import co.bird.android.model.contractor.ContractorDataFieldKind;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b6\u0018\u00002\u00020\u0001B#\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m28432d2 = {"Lco/bird/android/model/analytics/ChargerOnboardingStepEvent;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "type", "Lco/bird/android/model/analytics/Type;", "kind", "Lco/bird/android/model/contractor/ContractorDataFieldKind;", "description", "", "(Lco/bird/android/model/analytics/Type;Lco/bird/android/model/contractor/ContractorDataFieldKind;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nLegacyAnalyticsEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyAnalyticsEvent.kt\nco/bird/android/model/analytics/ChargerOnboardingStepEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1309:1\n1#2:1310\n*E\n"})
/* loaded from: classes4.dex */
public abstract class ChargerOnboardingStepEvent extends LegacyAnalyticsEvent {
    public /* synthetic */ ChargerOnboardingStepEvent(Type type, ContractorDataFieldKind contractorDataFieldKind, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, contractorDataFieldKind, str);
    }

    private ChargerOnboardingStepEvent(Type type, ContractorDataFieldKind contractorDataFieldKind, String str) {
        super(type, null, 2, null);
        Map<String, Object> properties = getProperties();
        String lowerCase = contractorDataFieldKind.name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        properties.put("kind", lowerCase);
        if (str != null) {
            getProperties().put("description", str);
        }
    }

    public /* synthetic */ ChargerOnboardingStepEvent(Type type, ContractorDataFieldKind contractorDataFieldKind, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, contractorDataFieldKind, (i & 4) != 0 ? null : str, null);
    }
}
