package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import bo.app.C12730i;
import bo.app.C13109s0;
import bo.app.C13143t0;
import ch.qos.logback.core.CoreConstants;
import com.appboy.enums.DeviceKey;
import com.appboy.enums.LocationProviderName;
import com.appboy.enums.SdkFlavor;
import com.appboy.support.PackageUtils;
import com.facebook.share.internal.C17296a;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C41945h80;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 g2\u00020\u0001:\u0002hiB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\be\u0010fJ4\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010 \u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b \u0010\u0015R\u0011\u0010!\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b!\u0010\u0015R\u0011\u0010\"\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0015R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0011\u0010,\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010.\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b-\u0010%R\u0017\u00101\u001a\u00020#8F¢\u0006\f\u0012\u0004\b0\u0010\u0011\u001a\u0004\b/\u0010%R\u0013\u00103\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b2\u0010\u000fR\u0011\u00105\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b4\u0010\u0015R\u0011\u00106\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b6\u0010\u0015R\u0011\u00108\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b7\u0010\u000fR\u0011\u0010:\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b9\u0010\u000fR\u0011\u0010<\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b;\u0010%R\u0017\u0010?\u001a\u00020#8G¢\u0006\f\u0012\u0004\b>\u0010\u0011\u001a\u0004\b=\u0010%R\u0013\u0010C\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010D\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bD\u0010\u0015R\u0013\u0010F\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bE\u0010\u000fR\u0011\u0010G\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bG\u0010\u0015R\u0011\u0010H\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bH\u0010\u0015R\u0011\u0010I\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bI\u0010\u0015R\u0013\u0010K\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bJ\u0010\u000fR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020L0\b8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010P\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bP\u0010\u0015R\u0011\u0010Q\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bQ\u0010\u0015R\u0011\u0010R\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bR\u0010\u0015R\u0011\u0010S\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bS\u0010\u0015R\u0011\u0010T\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bT\u0010\u0015R\u0011\u0010U\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bU\u0010\u0015R\u0011\u0010W\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bV\u0010%R\u0013\u0010Y\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bX\u0010\u000fR\u0011\u0010[\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bZ\u0010%R\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020\\0\b8F¢\u0006\u0006\u001a\u0004\b]\u0010NR\u0011\u0010_\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b_\u0010\u0015R\u0011\u0010`\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b`\u0010\u0015R\u0011\u0010a\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\ba\u0010\u0015R\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020b0\b8F¢\u0006\u0006\u001a\u0004\bc\u0010N¨\u0006j"}, m28432d2 = {"LX10;", "Lh80;", "", "E", "Ljava/lang/Class;", "targetEnumClass", "LX10$b;", "configField", "Ljava/util/EnumSet;", "getGenericEnumSetFromStringSet", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "", "getServerTarget", "()Ljava/lang/String;", "getServerTarget$annotations", "()V", "serverTarget", "", "isEphemeralEventsEnabled", "()Z", "", "getEphemeralEventKeys", "()Ljava/util/Set;", "ephemeralEventKeys", "getBaseUrlForRequests", "baseUrlForRequests", "Lbo/app/i;", "getBrazeApiKey", "()Lbo/app/i;", "brazeApiKey", "isAdmMessagingRegistrationEnabled", "isLocationCollectionEnabled", "isGeofencesEnabled", "", "getSmallNotificationIconResourceId", "()I", "smallNotificationIconResourceId", "getLargeNotificationIconResourceId", "largeNotificationIconResourceId", "", "getTriggerActionMinimumTimeIntervalInSeconds", "()J", "triggerActionMinimumTimeIntervalInSeconds", "getSessionTimeoutSeconds", "sessionTimeoutSeconds", "getVersionCode", "getVersionCode$annotations", "versionCode", "getCustomEndpoint", "customEndpoint", "getDoesHandlePushDeepLinksAutomatically", "doesHandlePushDeepLinksAutomatically", "isNewsfeedVisualIndicatorOn", "getDefaultNotificationChannelName", "defaultNotificationChannelName", "getDefaultNotificationChannelDescription", "defaultNotificationChannelDescription", "getApplicationIconResourceId", "applicationIconResourceId", "getDefaultNotificationAccentColor", "getDefaultNotificationAccentColor$annotations", "defaultNotificationAccentColor", "Lcom/appboy/enums/SdkFlavor;", "getSdkFlavor", "()Lcom/appboy/enums/SdkFlavor;", "sdkFlavor", "isPushDeepLinkBackStackActivityEnabled", "getPushDeepLinkBackStackActivityClassName", "pushDeepLinkBackStackActivityClassName", "isSessionStartBasedTimeoutEnabled", "isFirebaseCloudMessagingRegistrationEnabled", "isContentCardsUnreadVisualIndicatorEnabled", "getFirebaseCloudMessagingSenderIdKey", "firebaseCloudMessagingSenderIdKey", "Lcom/appboy/enums/DeviceKey;", "getDeviceObjectAllowlist", "()Ljava/util/EnumSet;", "deviceObjectAllowlist", "isDeviceObjectAllowlistEnabled", "isInAppMessageAccessibilityExclusiveModeEnabled", "isPushWakeScreenForNotificationEnabled", "isPushNotificationHtmlRenderingEnabled", "isInAppMessageTestPushEagerDisplayEnabled", "isAutomaticGeofenceRequestsEnabled", "getLoggerInitialLogLevel", "loggerInitialLogLevel", "getCustomHtmlWebViewActivityClassName", "customHtmlWebViewActivityClassName", "getInAppMessageWebViewClientOnPageFinishedMaxWaitMs", "inAppMessageWebViewClientOnPageFinishedMaxWaitMs", "Lcom/appboy/enums/LocationProviderName;", "getCustomLocationProviderNames", "customLocationProviderNames", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled", "isSdkAuthenticationEnabled", "isTouchModeRequiredForHtmlInAppMessages", "Lu20;", "getSdkMetadata", "sdkMetadata", "<init>", "(Landroid/content/Context;)V", "Companion", C17296a.f69688o, "b", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: X10 */
/* loaded from: classes2.dex */
public class X10 extends C41945h80 {
    public static final C9268a Companion = new C9268a(null);
    public static final int DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS = (int) TimeUnit.SECONDS.toMillis(15);
    private final Context context;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\f\n\u0004\b\b\u0010\t\u0012\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\f\n\u0004\b\u000b\u0010\t\u0012\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u0012\u0004\b\u0010\u0010\u0006¨\u0006\u0012"}, m28432d2 = {"LX10$a;", "", "", "DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS", "I", "getDEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS$annotations", "()V", "", "DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION_DEFAULT_VALUE", "Ljava/lang/String;", "getDEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION_DEFAULT_VALUE$annotations", "DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE", "getDEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE$annotations", "DEFAULT_SESSION_TIMEOUT_SECONDS", "DEFAULT_TRIGGER_MINIMUM_INTERVAL", "MAX_ALLOWED_EPHEMERAL_EVENTS", "getMAX_ALLOWED_EPHEMERAL_EVENTS$annotations", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: X10$a */
    /* loaded from: classes2.dex */
    public static final class C9268a {
        public /* synthetic */ C9268a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C9268a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, m28432d2 = {"LX10$b;", "", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: X10$b */
    /* loaded from: classes2.dex */
    public enum EnumC9269b {
        EPHEMERAL_EVENTS_ENABLED("com_braze_ephemeral_events_enabled"),
        EPHEMERAL_EVENTS_KEYS("com_braze_ephemeral_events_keys"),
        API_KEY("com_braze_api_key"),
        SERVER_TARGET_KEY("com_braze_server_target"),
        ADM_MESSAGING_REGISTRATION_ENABLED_KEY("com_braze_push_adm_messaging_registration_enabled"),
        SMALL_NOTIFICATION_ICON_KEY("com_braze_push_small_notification_icon"),
        LARGE_NOTIFICATION_ICON_KEY("com_braze_push_large_notification_icon"),
        SESSION_TIMEOUT_KEY("com_braze_session_timeout"),
        ENABLE_LOCATION_COLLECTION_KEY("com_braze_enable_location_collection"),
        DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY("com_braze_default_notification_accent_color"),
        TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS("com_braze_trigger_action_minimum_time_interval_seconds"),
        HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY("com_braze_handle_push_deep_links_automatically"),
        NEWSFEED_UNREAD_VISUAL_INDICATOR_ON("com_braze_newsfeed_unread_visual_indicator_on"),
        SDK_FLAVOR("com_braze_sdk_flavor"),
        CUSTOM_ENDPOINT("com_braze_custom_endpoint"),
        DEFAULT_NOTIFICATION_CHANNEL_NAME("com_braze_default_notification_channel_name"),
        DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION("com_braze_default_notification_channel_description"),
        PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY("com_braze_push_deep_link_back_stack_activity_enabled"),
        PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY("com_braze_push_deep_link_back_stack_activity_class_name"),
        SESSION_START_BASED_TIMEOUT_ENABLED_KEY("com_braze_session_start_based_timeout_enabled"),
        FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY("com_braze_firebase_cloud_messaging_registration_enabled"),
        FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY("com_braze_firebase_cloud_messaging_sender_id"),
        CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED("com_braze_content_cards_unread_visual_indicator_enabled"),
        DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY("com_braze_device_object_whitelisting_enabled"),
        DEVICE_OBJECT_ALLOWLIST_VALUE("com_braze_device_object_whitelist"),
        IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED("com_braze_device_in_app_message_accessibility_exclusive_mode_enabled"),
        PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED("com_braze_push_wake_screen_for_notification_enabled"),
        PUSH_NOTIFICATION_HTML_RENDERING_ENABLED("com_braze_push_notification_html_rendering_enabled"),
        GEOFENCES_ENABLED("com_braze_geofences_enabled"),
        IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY("com_braze_in_app_message_push_test_eager_display_enabled"),
        LOGGER_INITIAL_LOG_LEVEL("com_braze_logger_initial_log_level"),
        CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY("com_braze_custom_html_webview_activity_class_name"),
        GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY("com_braze_automatic_geofence_requests_enabled"),
        CUSTOM_LOCATION_PROVIDERS_LIST_KEY("com_braze_custom_location_providers_list"),
        IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY("com_braze_in_app_message_webview_client_max_onpagefinished_wait_ms"),
        FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY("com_braze_firebase_messaging_service_automatically_register_on_new_token"),
        SDK_AUTH_ENABLED("com_braze_sdk_authentication_enabled"),
        REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY("com_braze_require_touch_mode_for_html_in_app_messages"),
        DATA_SYNC_BAD_NETWORK_INTERVAL_KEY("com_braze_data_flush_interval_bad_network"),
        DATA_SYNC_GOOD_NETWORK_INTERVAL_KEY("com_braze_data_flush_interval_good_network"),
        DATA_SYNC_GREAT_NETWORK_INTERVAL_KEY("com_braze_data_flush_interval_great_network"),
        SDK_METADATA_INTERNAL_KEY("com_braze_internal_sdk_metadata"),
        SDK_METADATA_PUBLIC_KEY("com_braze_sdk_metadata");
        

        /* renamed from: b */
        public final String f42513b;

        EnumC9269b(String str) {
            this.f42513b = str;
        }

        /* renamed from: b */
        public final String m77562b() {
            return this.f42513b;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: X10$c */
    /* loaded from: classes2.dex */
    public static final class C9270c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f42514g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9270c(String str) {
            super(0);
            this.f42514g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Couldn't find application icon for package: ", this.f42514g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: X10$d */
    /* loaded from: classes2.dex */
    public static final class C9271d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9271d f42515g = new C9271d();

        public C9271d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "****************************************************";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: X10$e */
    /* loaded from: classes2.dex */
    public static final class C9272e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9272e f42516g = new C9272e();

        public C9272e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Found an override api key. Using it to configure the Braze SDK";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: X10$f */
    /* loaded from: classes2.dex */
    public static final class C9273f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9273f f42517g = new C9273f();

        public C9273f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "****************************************************";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: X10$g */
    /* loaded from: classes2.dex */
    public static final class C9274g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9274g f42518g = new C9274g();

        public C9274g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "**                                                **";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: X10$h */
    /* loaded from: classes2.dex */
    public static final class C9275h extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9275h f42519g = new C9275h();

        public C9275h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "**                 !! WARNING !!                  **";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: X10$i */
    /* loaded from: classes2.dex */
    public static final class C9276i extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9276i f42520g = new C9276i();

        public C9276i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "**                                                **";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: X10$j */
    /* loaded from: classes2.dex */
    public static final class C9277j extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9277j f42521g = new C9277j();

        public C9277j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "**     No API key set in res/values/braze.xml     **";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: X10$k */
    /* loaded from: classes2.dex */
    public static final class C9278k extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9278k f42522g = new C9278k();

        public C9278k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "** No cached API Key found from Braze.configure   **";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: X10$l */
    /* loaded from: classes2.dex */
    public static final class C9279l extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9279l f42523g = new C9279l();

        public C9279l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "**          Braze functionality disabled          **";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: X10$m */
    /* loaded from: classes2.dex */
    public static final class C9280m extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9280m f42524g = new C9280m();

        public C9280m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "**                                                **";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: X10$n */
    /* loaded from: classes2.dex */
    public static final class C9281n extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9281n f42525g = new C9281n();

        public C9281n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Using default notification accent color found in resources";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: X10$o */
    /* loaded from: classes2.dex */
    public static final class C9282o extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9282o f42526g = new C9282o();

        public C9282o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "More than 12 ephemeral/graylisted events detected. Only using first 12 events. Please truncate this list!";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: X10$p */
    /* loaded from: classes2.dex */
    public static final class C9283p extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9283p f42527g = new C9283p();

        public C9283p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Exception while parsing stored SDK flavor. Returning null.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: X10$q */
    /* loaded from: classes2.dex */
    public static final class C9284q extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9284q f42528g = new C9284q();

        public C9284q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Unable to read the version code.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X10(Context context) {
        super(context, false, null, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final <E extends Enum<E>> EnumSet<E> getGenericEnumSetFromStringSet(Class<E> cls, EnumC9269b enumC9269b) {
        String m77562b = enumC9269b.m77562b();
        if (getConfigurationCache().containsKey(m77562b)) {
            Object obj = getConfigurationCache().get(m77562b);
            if (obj != null) {
                return (EnumSet) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.util.EnumSet<E of com.braze.configuration.BrazeConfigurationProvider.getGenericEnumSetFromStringSet>");
        }
        Set<String> stringSetValue = getStringSetValue(enumC9269b.m77562b(), new HashSet());
        if (stringSetValue == null) {
            stringSetValue = new HashSet<>();
        }
        EnumSet<E> m62987a = C13109s0.m62987a(cls, stringSetValue);
        getConfigurationCache().put(m77562b, m62987a);
        return m62987a;
    }

    private final String getServerTarget() {
        String stringValue = getStringValue(EnumC9269b.SERVER_TARGET_KEY.m77562b(), "PROD");
        return stringValue == null ? "PROD" : stringValue;
    }

    public final int getApplicationIconResourceId() {
        int i;
        ApplicationInfo applicationInfo;
        PackageManager.ApplicationInfoFlags of;
        if (getConfigurationCache().containsKey("application_icon")) {
            Object obj = getConfigurationCache().get("application_icon");
            if (obj != null) {
                return ((Integer) obj).intValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        String packageName = this.context.getPackageName();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = this.context.getPackageManager();
                of = PackageManager.ApplicationInfoFlags.of(0L);
                applicationInfo = packageManager.getApplicationInfo(packageName, of);
            } else {
                applicationInfo = this.context.getPackageManager().getApplicationInfo(packageName, 0);
            }
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "if (Build.VERSION.SDK_IN… 0)\n                    }");
            i = applicationInfo.icon;
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C9270c(packageName), 4, null);
            i = 0;
        }
        getConfigurationCache().put("application_icon", Integer.valueOf(i));
        return i;
    }

    public final String getBaseUrlForRequests() {
        String serverTarget = getServerTarget();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = serverTarget.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return Intrinsics.areEqual("STAGING", upperCase) ? "https://sondheim.braze.com/api/v3/" : "https://sdk.iad-01.braze.com/api/v3/";
    }

    public final C12730i getBrazeApiKey() {
        String m77562b = EnumC9269b.API_KEY.m77562b();
        String str = (String) getConfigurationCache().get(m77562b);
        if (str == null) {
            str = getRuntimeAppConfigurationProvider().m37962h(m77562b, null);
            if (str != null) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C9272e.f42516g, 6, null);
            } else {
                str = getStringValue(m77562b, null);
            }
            if (str != null) {
                getConfigurationCache().put(m77562b, str);
            }
        }
        if (str != null) {
            return new C12730i(str);
        }
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.EnumC25082a enumC25082a = C43664k20.EnumC25082a.W;
        C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, C9273f.f42517g, 6, null);
        C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, C9274g.f42518g, 6, null);
        C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, C9275h.f42519g, 6, null);
        C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, C9276i.f42520g, 6, null);
        C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, C9277j.f42521g, 6, null);
        C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, C9278k.f42522g, 6, null);
        C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, C9279l.f42523g, 6, null);
        C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, C9280m.f42524g, 6, null);
        C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, C9271d.f42515g, 6, null);
        throw new RuntimeException("Unable to read the Braze API key from the res/values/braze.xml file or from runtime configuration via BrazeConfig. See log for more details.");
    }

    public final String getCustomEndpoint() {
        return getStringValue(EnumC9269b.CUSTOM_ENDPOINT.m77562b(), null);
    }

    public final String getCustomHtmlWebViewActivityClassName() {
        return getStringValue(EnumC9269b.CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY.m77562b(), "");
    }

    public final EnumSet<LocationProviderName> getCustomLocationProviderNames() {
        return getGenericEnumSetFromStringSet(LocationProviderName.class, EnumC9269b.CUSTOM_LOCATION_PROVIDERS_LIST_KEY);
    }

    public final int getDefaultNotificationAccentColor() {
        Integer colorValue = getColorValue(EnumC9269b.DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY.m77562b());
        if (colorValue != null) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C9281n.f42525g, 7, null);
            return colorValue.intValue();
        }
        return 0;
    }

    public final String getDefaultNotificationChannelDescription() {
        String stringValue = getStringValue(EnumC9269b.DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION.m77562b(), "");
        if (stringValue == null) {
            return "";
        }
        return stringValue;
    }

    public final String getDefaultNotificationChannelName() {
        String stringValue = getStringValue(EnumC9269b.DEFAULT_NOTIFICATION_CHANNEL_NAME.m77562b(), "General");
        if (stringValue == null) {
            return "General";
        }
        return stringValue;
    }

    public final EnumSet<DeviceKey> getDeviceObjectAllowlist() {
        return getGenericEnumSetFromStringSet(DeviceKey.class, EnumC9269b.DEVICE_OBJECT_ALLOWLIST_VALUE);
    }

    public final boolean getDoesHandlePushDeepLinksAutomatically() {
        return getBooleanValue(EnumC9269b.HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY.m77562b(), false);
    }

    public final Set<String> getEphemeralEventKeys() {
        Set<String> emptySet;
        List take;
        Set<String> set;
        String m77562b = EnumC9269b.EPHEMERAL_EVENTS_KEYS.m77562b();
        emptySet = SetsKt__SetsKt.emptySet();
        Set<String> stringSetValue = getStringSetValue(m77562b, emptySet);
        if (stringSetValue == null) {
            stringSetValue = SetsKt__SetsKt.emptySet();
        }
        if (stringSetValue.size() > 12) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C9282o.f42526g, 6, null);
        }
        take = CollectionsKt___CollectionsKt.take(stringSetValue, 12);
        set = CollectionsKt___CollectionsKt.toSet(take);
        return set;
    }

    public final String getFirebaseCloudMessagingSenderIdKey() {
        return getStringValue(EnumC9269b.FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY.m77562b(), null);
    }

    public final int getInAppMessageWebViewClientOnPageFinishedMaxWaitMs() {
        return getIntValue(EnumC9269b.IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY.m77562b(), DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS);
    }

    public final int getLargeNotificationIconResourceId() {
        return getDrawableValue(EnumC9269b.LARGE_NOTIFICATION_ICON_KEY.m77562b(), 0);
    }

    public final int getLoggerInitialLogLevel() {
        return getIntValue(EnumC9269b.LOGGER_INITIAL_LOG_LEVEL.m77562b(), 4);
    }

    public final String getPushDeepLinkBackStackActivityClassName() {
        return getStringValue(EnumC9269b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY.m77562b(), "");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SdkFlavor getSdkFlavor() {
        boolean z;
        boolean isBlank;
        String stringValue = getStringValue(EnumC9269b.SDK_FLAVOR.m77562b(), null);
        if (stringValue != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(stringValue);
            if (!isBlank) {
                z = false;
                if (!z) {
                    return null;
                }
                try {
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String upperCase = stringValue.toUpperCase(US);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    return SdkFlavor.valueOf(upperCase);
                } catch (Exception e) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C9283p.f42527g, 4, null);
                    return null;
                }
            }
        }
        z = true;
        if (!z) {
        }
    }

    public final EnumSet<EnumC49593u20> getSdkMetadata() {
        String upperCase;
        EnumC49593u20[] values;
        int length;
        int i;
        String m77562b = EnumC9269b.SDK_METADATA_INTERNAL_KEY.m77562b();
        C41945h80.EnumC22555b enumC22555b = C41945h80.EnumC22555b.STRING_ARRAY;
        Object resourceConfigurationValue = getResourceConfigurationValue(enumC22555b, m77562b, new HashSet());
        if (resourceConfigurationValue != null) {
            Set<String> asMutableSet = TypeIntrinsics.asMutableSet(resourceConfigurationValue);
            String m77562b2 = EnumC9269b.SDK_METADATA_PUBLIC_KEY.m77562b();
            Object resourceConfigurationValue2 = getResourceConfigurationValue(enumC22555b, m77562b2, new HashSet());
            if (resourceConfigurationValue2 != null) {
                Set set = (Set) resourceConfigurationValue2;
                Object runtimeConfigurationValue = getRuntimeConfigurationValue(enumC22555b, m77562b2, new HashSet());
                if (runtimeConfigurationValue != null) {
                    asMutableSet.addAll(set);
                    asMutableSet.addAll((Set) runtimeConfigurationValue);
                    C13109s0 c13109s0 = C13109s0.f59272a;
                    EnumSet<EnumC49593u20> result = EnumSet.noneOf(EnumC49593u20.class);
                    for (String str : asMutableSet) {
                        try {
                            C13109s0 c13109s02 = C13109s0.f59272a;
                            Locale US = Locale.US;
                            Intrinsics.checkNotNullExpressionValue(US, "US");
                            upperCase = str.toUpperCase(US);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                            values = EnumC49593u20.values();
                            length = values.length;
                            i = 0;
                        } catch (Exception e) {
                            C43664k20.m29442e(C43664k20.f93782a, C13109s0.f59272a, C43664k20.EnumC25082a.E, e, false, new C13143t0(str), 4, null);
                        }
                        while (i < length) {
                            EnumC49593u20 enumC49593u20 = values[i];
                            i++;
                            if (Intrinsics.areEqual(enumC49593u20.name(), upperCase)) {
                                result.add(enumC49593u20);
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    Intrinsics.checkNotNullExpressionValue(result, "result");
                    return result;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
    }

    public final int getSessionTimeoutSeconds() {
        return getIntValue(EnumC9269b.SESSION_TIMEOUT_KEY.m77562b(), 10);
    }

    public final int getSmallNotificationIconResourceId() {
        return getDrawableValue(EnumC9269b.SMALL_NOTIFICATION_ICON_KEY.m77562b(), 0);
    }

    public final long getTriggerActionMinimumTimeIntervalInSeconds() {
        return getIntValue(EnumC9269b.TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS.m77562b(), 30);
    }

    public final int getVersionCode() {
        int i;
        if (getConfigurationCache().containsKey("version_code")) {
            Object obj = getConfigurationCache().get("version_code");
            if (obj != null) {
                return ((Integer) obj).intValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        try {
            i = this.context.getPackageManager().getPackageInfo(PackageUtils.getResourcePackageName(this.context), 0).versionCode;
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C9284q.f42528g, 4, null);
            i = -1;
        }
        getConfigurationCache().put("version_code", Integer.valueOf(i));
        return i;
    }

    public final boolean isAdmMessagingRegistrationEnabled() {
        return getBooleanValue(EnumC9269b.ADM_MESSAGING_REGISTRATION_ENABLED_KEY.m77562b(), false);
    }

    public final boolean isAutomaticGeofenceRequestsEnabled() {
        return getBooleanValue(EnumC9269b.GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY.m77562b(), true);
    }

    public final boolean isContentCardsUnreadVisualIndicatorEnabled() {
        return getBooleanValue(EnumC9269b.CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED.m77562b(), true);
    }

    public final boolean isDeviceObjectAllowlistEnabled() {
        return getBooleanValue(EnumC9269b.DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY.m77562b(), false);
    }

    public final boolean isEphemeralEventsEnabled() {
        return getBooleanValue(EnumC9269b.EPHEMERAL_EVENTS_ENABLED.m77562b(), false);
    }

    public final boolean isFirebaseCloudMessagingRegistrationEnabled() {
        return getBooleanValue(EnumC9269b.FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY.m77562b(), false);
    }

    public final boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled() {
        return getBooleanValue(EnumC9269b.FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY.m77562b(), isFirebaseCloudMessagingRegistrationEnabled());
    }

    public final boolean isGeofencesEnabled() {
        return getBooleanValue(EnumC9269b.GEOFENCES_ENABLED.m77562b(), isLocationCollectionEnabled());
    }

    public final boolean isInAppMessageAccessibilityExclusiveModeEnabled() {
        return getBooleanValue(EnumC9269b.IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED.m77562b(), false);
    }

    public final boolean isInAppMessageTestPushEagerDisplayEnabled() {
        return getBooleanValue(EnumC9269b.IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY.m77562b(), true);
    }

    public final boolean isLocationCollectionEnabled() {
        return getBooleanValue(EnumC9269b.ENABLE_LOCATION_COLLECTION_KEY.m77562b(), false);
    }

    public final boolean isNewsfeedVisualIndicatorOn() {
        return getBooleanValue(EnumC9269b.NEWSFEED_UNREAD_VISUAL_INDICATOR_ON.m77562b(), true);
    }

    public final boolean isPushDeepLinkBackStackActivityEnabled() {
        return getBooleanValue(EnumC9269b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY.m77562b(), true);
    }

    public final boolean isPushNotificationHtmlRenderingEnabled() {
        return getBooleanValue(EnumC9269b.PUSH_NOTIFICATION_HTML_RENDERING_ENABLED.m77562b(), false);
    }

    public final boolean isPushWakeScreenForNotificationEnabled() {
        return getBooleanValue(EnumC9269b.PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED.m77562b(), true);
    }

    public final boolean isSdkAuthenticationEnabled() {
        return getBooleanValue(EnumC9269b.SDK_AUTH_ENABLED.m77562b(), false);
    }

    public final boolean isSessionStartBasedTimeoutEnabled() {
        return getBooleanValue(EnumC9269b.SESSION_START_BASED_TIMEOUT_ENABLED_KEY.m77562b(), false);
    }

    public final boolean isTouchModeRequiredForHtmlInAppMessages() {
        return getBooleanValue(EnumC9269b.REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY.m77562b(), true);
    }
}
