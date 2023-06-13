package co.bird.android.model.analytics;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.AnnouncementContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lco/bird/android/model/analytics/AnnouncementShown;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "announcementId", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/constant/AnnouncementContext;", "title", "(Ljava/lang/String;Lco/bird/android/model/constant/AnnouncementContext;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nLegacyAnalyticsEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyAnalyticsEvent.kt\nco/bird/android/model/analytics/AnnouncementShown\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1309:1\n1#2:1310\n*E\n"})
/* loaded from: classes4.dex */
public final class AnnouncementShown extends LegacyAnalyticsEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnouncementShown(String announcementId, AnnouncementContext context, String str) {
        super(Type.ANNOUNCEMENT_SHOWN, null, 2, null);
        Intrinsics.checkNotNullParameter(announcementId, "announcementId");
        Intrinsics.checkNotNullParameter(context, "context");
        getProperties().put("announcement_id", announcementId);
        getProperties().put(CoreConstants.CONTEXT_SCOPE_VALUE, context.name());
        if (str != null) {
            getProperties().put("title", str);
        }
    }
}
