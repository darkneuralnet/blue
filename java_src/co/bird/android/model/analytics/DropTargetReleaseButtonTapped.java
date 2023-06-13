package co.bird.android.model.analytics;

import co.bird.android.model.constant.NestPurpose;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/analytics/DropTargetReleaseButtonTapped;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "nestPurpose", "Lco/bird/android/model/constant/NestPurpose;", "(Lco/bird/android/model/constant/NestPurpose;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DropTargetReleaseButtonTapped extends LegacyAnalyticsEvent {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NestPurpose.values().length];
            try {
                iArr[NestPurpose.DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropTargetReleaseButtonTapped(NestPurpose nestPurpose) {
        super(Type.DROP_TARGET_RELEASE_BUTTON_TAPPED, null, 2, null);
        Intrinsics.checkNotNullParameter(nestPurpose, "nestPurpose");
        getProperties().put("screen", "nest details");
        if (WhenMappings.$EnumSwitchMapping$0[nestPurpose.ordinal()] == 1) {
            getProperties().put("type", "delivery");
        } else {
            getProperties().put("type", "drop");
        }
    }
}
