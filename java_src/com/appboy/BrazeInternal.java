package com.appboy;

import android.content.Context;
import android.content.Intent;
import bo.app.EnumC12867l1;
import bo.app.InterfaceC13200x1;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007J\"\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0007J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u001e"}, m28432d2 = {"Lcom/appboy/BrazeInternal;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "ignoreRateLimit", "", "requestGeofenceRefresh", "Lbo/app/x1;", "location", "", "geofenceId", "Lbo/app/l1;", "transitionType", "recordGeofenceTransition", "serializedCardJson", "userId", "addSerializedContentCardToStorage", "logLocationRecordedEvent", "Landroid/content/Intent;", "intent", "handleInAppMessageTestPush", "applyPendingRuntimeConfiguration", "LlZ1;", "inAppMessageEvent", "retryInAppMessage", "Lcom/appboy/Appboy;", "getInstance", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class BrazeInternal {
    public static final BrazeInternal INSTANCE = new BrazeInternal();

    private BrazeInternal() {
    }

    @JvmStatic
    public static final void addSerializedContentCardToStorage(Context context, String serializedCardJson, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serializedCardJson, "serializedCardJson");
        INSTANCE.getInstance(context).addSerializedCardJsonToStorage(serializedCardJson, str);
    }

    @JvmStatic
    public static final void applyPendingRuntimeConfiguration(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.getInstance(context).applyPendingRuntimeConfiguration();
    }

    private final Appboy getInstance(Context context) {
        P10 appboy = Appboy.getInstance(context);
        if (appboy != null) {
            return appboy;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.appboy.Appboy");
    }

    @JvmStatic
    public static final void handleInAppMessageTestPush(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        INSTANCE.getInstance(context).handleInAppMessageTestPush(intent);
    }

    @JvmStatic
    public static final void logLocationRecordedEvent(Context context, InterfaceC13200x1 location) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        INSTANCE.getInstance(context).logLocationRecordedEventFromLocationUpdate(location);
    }

    @JvmStatic
    public static final void recordGeofenceTransition(Context context, String geofenceId, EnumC12867l1 transitionType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(geofenceId, "geofenceId");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        INSTANCE.getInstance(context).recordGeofenceTransition(geofenceId, transitionType);
    }

    @JvmStatic
    public static final void requestGeofenceRefresh(Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.getInstance(context).requestGeofenceRefresh(z);
    }

    @JvmStatic
    public static final void retryInAppMessage(Context context, C44563lZ1 inAppMessageEvent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessageEvent, "inAppMessageEvent");
        INSTANCE.getInstance(context).retryInAppMessage(inAppMessageEvent);
    }

    @JvmStatic
    public static final void requestGeofenceRefresh(Context context, InterfaceC13200x1 location) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        INSTANCE.getInstance(context).requestGeofenceRefresh(location);
    }
}
