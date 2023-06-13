package co.bird.android.model.analytics;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/model/analytics/SmartlockUnlockError;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "lockKind", "", "timeElapsed", "", "errorType", "scannedMacAddresses", "", "scanFailureReason", "", "rawThrowable", "", "rideId", "(Ljava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Throwable;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nLegacyAnalyticsEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyAnalyticsEvent.kt\nco/bird/android/model/analytics/SmartlockUnlockError\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1309:1\n1#2:1310\n*E\n"})
/* loaded from: classes4.dex */
public final class SmartlockUnlockError extends LegacyAnalyticsEvent {
    public /* synthetic */ SmartlockUnlockError(String str, long j, String str2, List list, Integer num, Throwable th, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, list, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : th, (i & 64) != 0 ? null : str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartlockUnlockError(String lockKind, long j, String errorType, List<String> scannedMacAddresses, Integer num, Throwable th, String str) {
        super(Type.SMARTLOCK_UNLOCK_ERROR, null, 2, null);
        String joinToString$default;
        Intrinsics.checkNotNullParameter(lockKind, "lockKind");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(scannedMacAddresses, "scannedMacAddresses");
        getProperties().put("lock_kind", lockKind);
        getProperties().put("time_elapsed", Long.valueOf(j));
        getProperties().put("error", errorType);
        if (th != null) {
            try {
                Map<String, Object> properties = getProperties();
                String simpleName = th.getClass().getSimpleName();
                String message = th.getMessage();
                message = message == null ? th.toString() : message;
                properties.put("raw_throwable", simpleName + ": " + message);
            } catch (Throwable unused) {
            }
        }
        Map<String, Object> properties2 = getProperties();
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(scannedMacAddresses, ",", null, null, 0, null, null, 62, null);
        properties2.put("scanned_mac_addresses", joinToString$default);
        if (num != null) {
            num.intValue();
            getProperties().put("scan_failure_reason", num);
        }
        if (str != null) {
            getProperties().put("ride_id", str);
        }
    }
}
