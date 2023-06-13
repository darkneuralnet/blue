package com.appboy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import bo.app.C12511a1;
import bo.app.C12521a5;
import bo.app.C12530b;
import bo.app.C12553b4;
import bo.app.C12558c0;
import bo.app.C12582d4;
import bo.app.C12656g1;
import bo.app.C12660g4;
import bo.app.C12663g6;
import bo.app.C12703h1;
import bo.app.C12722h4;
import bo.app.C12749j;
import bo.app.C12811k0;
import bo.app.C12832l;
import bo.app.C13048q3;
import bo.app.C13057q6;
import bo.app.C13165u4;
import bo.app.C13176v3;
import bo.app.C13179v4;
import bo.app.C13194w5;
import bo.app.C13197x;
import bo.app.C13199x0;
import bo.app.C13203x4;
import bo.app.C13205y;
import bo.app.EnumC12867l1;
import bo.app.InterfaceC12565c2;
import bo.app.InterfaceC12579d2;
import bo.app.InterfaceC12658g2;
import bo.app.InterfaceC12742i2;
import bo.app.InterfaceC12792j2;
import bo.app.InterfaceC13160u1;
import bo.app.InterfaceC13200x1;
import bo.app.InterfaceC13231y1;
import bo.app.ThreadFactoryC13173v0;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.appboy.Appboy;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.events.IEventSubscriber;
import com.appboy.events.IValueCallback;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import p000.U10;
/* loaded from: classes.dex */
public class Appboy {
    protected static volatile InterfaceC40906fO1 sCustomNotificationFactory;
    protected static volatile IBrazeEndpointProvider sEndpointProvider;
    protected static volatile C13179v4 sSdkEnablementProvider;
    private final Context mApplicationContext;
    volatile C12832l mBrazeGeofenceManager;
    volatile InterfaceC13231y1 mBrazeManager;
    private volatile C50185v20 mBrazeUser;
    protected X10 mConfigurationProvider;
    volatile C13205y mContentCardsStorageProvider;
    protected volatile C13057q6 mDependencyProvider;
    volatile InterfaceC12565c2 mDeviceDataProvider;
    protected InterfaceC12579d2 mDeviceIdReader;
    private volatile InterfaceC12658g2 mErrorPublisher;
    protected InterfaceC12658g2 mExternalIEventMessenger;
    private volatile C12656g1 mFeedStorageProvider;
    private InterfaceC40313eO1 mImageLoader;
    protected Boolean mIsApiKeyPresent = null;
    protected volatile boolean mIsInstanceStopped = false;
    private volatile InterfaceC12742i2 mLocationManager;
    private C13048q3 mOfflineUserStorageProvider;
    protected InterfaceC12792j2 mRegistrationDataProvider;
    volatile C13165u4 mSdkAuthenticationCache;
    protected volatile C12521a5 mServerConfigStorageProvider;
    private C13194w5 mTestUserDeviceLoggingManager;
    protected volatile C12663g6 mTriggerManager;
    private final C13199x0 mUncaughtUserDependencyExceptionHandler;
    protected final C13203x4 mUserDependencyExecutor;
    private static final String TAG = C43664k20.m29433n(P10.class);
    private static final Set<String> KNOWN_APP_CRAWLER_DEVICE_MODELS = new HashSet(Collections.singletonList("calypso appcrawler"));
    private static final Set<String> NECESSARY_APPBOY_SDK_PERMISSIONS = new HashSet(Arrays.asList("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"));
    protected static volatile P10 sInstance = null;
    protected static final Object sBrazeEndpointProviderLock = new Object();
    protected static volatile boolean sMockNetworkRequestsAndDropEvents = false;
    protected static volatile boolean sOutboundNetworkRequestsOffline = false;
    private static final List<U10> sPendingConfigurations = new ArrayList();
    private static final U10 sClearConfigSentinel = new U10.C8173a().m82144a();

    public Appboy(final Context context) {
        long nanoTime = System.nanoTime();
        String str = TAG;
        C43664k20.m29438i(str, "Braze SDK Initializing");
        Context applicationContext = context.getApplicationContext();
        this.mApplicationContext = applicationContext;
        String str2 = Build.MODEL;
        if (str2 != null && KNOWN_APP_CRAWLER_DEVICE_MODELS.contains(str2.toLowerCase(Locale.US))) {
            C43664k20.m29431p(str, "Device build model matches a known crawler. Enabling mock network request mode. Device model: " + str2);
            enableMockAppboyNetworkRequestsAndDropEventsMode();
        }
        this.mImageLoader = new C49871uW0(applicationContext);
        this.mExternalIEventMessenger = new C12511a1(getSdkEnablementProvider(applicationContext));
        ThreadFactoryC13173v0 threadFactoryC13173v0 = new ThreadFactoryC13173v0("Appboy-User-Dependency-Thread");
        C13199x0 c13199x0 = new C13199x0(this.mExternalIEventMessenger);
        this.mUncaughtUserDependencyExceptionHandler = c13199x0;
        threadFactoryC13173v0.m62879a(c13199x0);
        C13203x4 c13203x4 = new C13203x4("singleton_user_dependency_serial_executor_identifier", threadFactoryC13173v0);
        this.mUserDependencyExecutor = c13203x4;
        c13203x4.execute(new Runnable() { // from class: Ql
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$new$0(context);
            }
        });
        long nanoTime2 = System.nanoTime();
        C43664k20.m29438i(str, "Braze SDK loaded in " + TimeUnit.MILLISECONDS.convert(nanoTime2 - nanoTime, TimeUnit.NANOSECONDS) + " ms.");
    }

    public static boolean configure(Context context, U10 u10) {
        String str = TAG;
        C43664k20.m29438i(str, "Braze.configure() called with configuration: " + u10);
        synchronized (Appboy.class) {
            if (sInstance != null && !sInstance.mIsInstanceStopped && Boolean.TRUE.equals(sInstance.mIsApiKeyPresent)) {
                C43664k20.m29431p(str, "Braze.configure() cannot be called while the singleton is still live.");
                return false;
            }
            if (u10 != null) {
                sPendingConfigurations.add(u10);
            } else {
                C43664k20.m29431p(str, "Braze.configure() called with a null config; Clearing all configuration values.");
                sPendingConfigurations.add(sClearConfigSentinel);
            }
            return true;
        }
    }

    public static boolean enableMockAppboyNetworkRequestsAndDropEventsMode() {
        if (sInstance == null) {
            synchronized (Appboy.class) {
                if (sInstance == null) {
                    if (sMockNetworkRequestsAndDropEvents) {
                        C43664k20.m29431p(TAG, "Braze network requests already being mocked. Note that events dispatched in this mode are dropped.");
                    } else {
                        C43664k20.m29431p(TAG, "Braze network requests will be mocked. Events dispatched in this mode will be dropped.");
                        sMockNetworkRequestsAndDropEvents = true;
                    }
                    return true;
                }
            }
        }
        C43664k20.m29421z(TAG, "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called.");
        return false;
    }

    public static Uri getApiEndpoint(Uri uri) {
        synchronized (sBrazeEndpointProviderLock) {
            if (sEndpointProvider != null) {
                try {
                    Uri apiEndpoint = sEndpointProvider.getApiEndpoint(uri);
                    if (apiEndpoint != null) {
                        return apiEndpoint;
                    }
                } catch (Exception unused) {
                    C43664k20.m29421z(TAG, "Caught exception trying to get a Braze API endpoint from the AppboyEndpointProvider. Using the original URI");
                }
            }
            return uri;
        }
    }

    public static String getConfiguredApiKey(X10 x10) {
        try {
            return x10.getBrazeApiKey().toString();
        } catch (Exception e) {
            C43664k20.m29434m(TAG, "Caught exception while retrieving API key.", e);
            return null;
        }
    }

    public static InterfaceC40906fO1 getCustomBrazeNotificationFactory() {
        return sCustomNotificationFactory;
    }

    public static P10 getInstance(Context context) {
        if (shouldAllowSingletonInitialization()) {
            synchronized (Appboy.class) {
                if (shouldAllowSingletonInitialization()) {
                    sInstance = new P10(context);
                    sInstance.mIsInstanceStopped = false;
                    return sInstance;
                }
            }
        }
        return sInstance;
    }

    public static boolean getOutboundNetworkRequestsOffline() {
        return sOutboundNetworkRequestsOffline;
    }

    public static C13179v4 getSdkEnablementProvider(Context context) {
        if (sSdkEnablementProvider == null) {
            sSdkEnablementProvider = new C13179v4(context);
        }
        return sSdkEnablementProvider;
    }

    public static boolean isDisabled() {
        if (sSdkEnablementProvider == null) {
            C43664k20.m29438i(TAG, "SDK enablement provider was null. Returning SDK as enabled.");
            return false;
        } else if (sInstance != null && Boolean.FALSE.equals(sInstance.mIsApiKeyPresent)) {
            C43664k20.m29421z(TAG, "API key not present. Actions will not be performed on the SDK.");
            return true;
        } else {
            boolean m62861a = sSdkEnablementProvider.m62861a();
            if (m62861a) {
                C43664k20.m29421z(TAG, "SDK is disabled. Actions will not be performed on the SDK.");
            }
            return m62861a;
        }
    }

    private boolean isEphemeralEventKey(String str) {
        if (!this.mConfigurationProvider.isEphemeralEventsEnabled()) {
            return false;
        }
        String str2 = TAG;
        C43664k20.m29424w(str2, "Ephemeral events enabled");
        Set<String> ephemeralEventKeys = this.mConfigurationProvider.getEphemeralEventKeys();
        boolean contains = ephemeralEventKeys.contains(str);
        C43664k20.m29424w(str2, "Checking event key [" + str + "] against ephemeral event list " + ephemeralEventKeys + " and got match?: " + contains);
        return contains;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addSerializedCardJsonToStorage$31(String str, String str2) {
        try {
            this.mContentCardsStorageProvider.m62815a(new C13197x(str), str2);
            this.mExternalIEventMessenger.mo63715a((InterfaceC12658g2) this.mContentCardsStorageProvider.m62807b(), (Class<InterfaceC12658g2>) C40779fA0.class);
        } catch (Exception e) {
            String str3 = TAG;
            C43664k20.m29434m(str3, "Failed to update ContentCard storage provider with single card update. User id: " + str2 + " Serialized json: " + str, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$changeUser$14(String str, String str2) {
        try {
            if (C43318jS5.m30596h(str)) {
                C43664k20.m29421z(TAG, "ArgumentException: userId passed to changeUser was null or empty. The current user will remain the active user.");
            } else if (C43318jS5.m30603a(str) > 997) {
                String str3 = TAG;
                C43664k20.m29421z(str3, "Rejected user id with byte length longer than 997. Not changing user. Input user id: " + str);
            } else {
                String m9348d = this.mBrazeUser.m9348d();
                if (m9348d.equals(str)) {
                    String str4 = TAG;
                    C43664k20.m29431p(str4, "Received request to change current user " + str + " to the same user id. Not changing user.");
                    if (!C43318jS5.m30597g(str2)) {
                        C43664k20.m29438i(str4, "Set sdk auth signature on changeUser call: " + str2);
                        this.mSdkAuthenticationCache.m62887a(str2);
                        return;
                    }
                    return;
                }
                if (m9348d.equals("")) {
                    String str5 = TAG;
                    C43664k20.m29431p(str5, "Changing anonymous user to " + str);
                    this.mOfflineUserStorageProvider.m63094a(str);
                    this.mBrazeUser.m9352A(str);
                } else {
                    String str6 = TAG;
                    C43664k20.m29431p(str6, "Changing current user " + m9348d + " to new user " + str + InstructionFileId.DOT);
                    this.mExternalIEventMessenger.mo63715a((InterfaceC12658g2) new FeedUpdatedEvent(new ArrayList(), str, false, C46287oT0.m21027i()), (Class<InterfaceC12658g2>) FeedUpdatedEvent.class);
                }
                this.mBrazeManager.mo62746d();
                this.mOfflineUserStorageProvider.m63094a(str);
                C13057q6 c13057q6 = this.mDependencyProvider;
                setUserSpecificMemberVariablesAndStartDispatch(new C13057q6(this.mApplicationContext, this.mOfflineUserStorageProvider, this.mConfigurationProvider, this.mExternalIEventMessenger, this.mDeviceIdReader, this.mRegistrationDataProvider, sMockNetworkRequestsAndDropEvents, sOutboundNetworkRequestsOffline, this.mTestUserDeviceLoggingManager));
                if (!C43318jS5.m30597g(str2)) {
                    String str7 = TAG;
                    C43664k20.m29438i(str7, "Set sdk auth signature on changeUser call: " + str2);
                    this.mSdkAuthenticationCache.m62887a(str2);
                }
                this.mDependencyProvider.m63073o().m63126h();
                this.mBrazeManager.mo62747c();
                this.mBrazeManager.mo62755a(new C13176v3.C13177a().m62866b());
                requestContentCardsRefresh(false);
                c13057q6.m63072p();
            }
        } catch (Exception e) {
            String str8 = TAG;
            C43664k20.m29450A(str8, "Failed to set external id to: " + str, e);
            publishError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$closeSession$2(Activity activity) {
        try {
            if (activity == null) {
                C43664k20.m29421z(TAG, "Cannot close session with null activity.");
            } else {
                this.mBrazeManager.closeSession(activity);
            }
        } catch (Exception e) {
            C43664k20.m29450A(TAG, "Failed to close session.", e);
            publishError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCurrentUser$16(IValueCallback iValueCallback) {
        if (this.mBrazeUser != null) {
            iValueCallback.onSuccess(this.mBrazeUser);
        } else {
            iValueCallback.onError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleInAppMessageTestPush$35(Intent intent) {
        try {
            requestTriggersIfInAppMessageTestPush(intent, this.mBrazeManager);
        } catch (Exception e) {
            C43664k20.m29450A(TAG, "Error handling test in-app message push", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$logCustomEvent$3(String str, C48407s20 c48407s20) {
        boolean mo62756a;
        try {
            if (!C51781xj6.m4783e(str, this.mServerConfigStorageProvider)) {
                String str2 = TAG;
                C43664k20.m29421z(str2, "Logged custom event with name " + str + " was invalid. Not logging custom event to Braze.");
            } else if (c48407s20 != null && c48407s20.m14853y()) {
                String str3 = TAG;
                C43664k20.m29421z(str3, "Custom event with name " + str + " logged with invalid properties. Not logging custom event to Braze.");
            } else {
                String m4786b = C51781xj6.m4786b(str);
                InterfaceC13160u1 m63580a = C12749j.m63580a(m4786b, c48407s20);
                if (isEphemeralEventKey(m4786b)) {
                    mo62756a = this.mServerConfigStorageProvider.m63929l();
                } else {
                    mo62756a = this.mBrazeManager.mo62756a(m63580a);
                }
                if (mo62756a) {
                    this.mTriggerManager.mo62891a(new C12558c0(m4786b, c48407s20, m63580a));
                }
            }
        } catch (Exception e) {
            String str4 = TAG;
            C43664k20.m29450A(str4, "Failed to log custom event: " + str, e);
            publishError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$logFeedDisplayed$9() {
        try {
            this.mBrazeManager.mo62756a(C12749j.m63579e());
        } catch (Exception e) {
            C43664k20.m29450A(TAG, "Failed to log that the feed was displayed.", e);
            publishError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$logLocationRecordedEventFromLocationUpdate$32(InterfaceC13200x1 interfaceC13200x1) {
        try {
            this.mBrazeManager.mo62756a(C12749j.m63583a(interfaceC13200x1));
        } catch (Exception e) {
            C43664k20.m29450A(TAG, "Failed to log location recorded event.", e);
            publishError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$logPurchase$4(String str, String str2, BigDecimal bigDecimal, int i, C48407s20 c48407s20) {
        try {
            if (!C51781xj6.m4782f(str, str2, bigDecimal, i, this.mServerConfigStorageProvider)) {
                C43664k20.m29421z(TAG, "Log purchase input was invalid. Not logging in-app purchase to Braze.");
            } else if (c48407s20 != null && c48407s20.m14853y()) {
                C43664k20.m29421z(TAG, "Purchase logged with invalid properties. Not logging custom event to Braze.");
            } else {
                String m4786b = C51781xj6.m4786b(str);
                InterfaceC13160u1 m63581a = C12749j.m63581a(m4786b, str2, bigDecimal, i, c48407s20);
                if (this.mBrazeManager.mo62756a(m63581a)) {
                    this.mTriggerManager.mo62891a(new C12553b4(m4786b, c48407s20, m63581a));
                }
            }
        } catch (Exception e) {
            String str3 = TAG;
            C43664k20.m29450A(str3, "Failed to log purchase event of " + str, e);
            publishError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$logPushNotificationActionClicked$7(String str, String str2, String str3) {
        try {
            if (C43318jS5.m30597g(str)) {
                C43664k20.m29421z(TAG, "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification action clicked.");
            } else if (C43318jS5.m30597g(str2)) {
                C43664k20.m29421z(TAG, "Action ID cannot be null or blank");
            } else {
                this.mBrazeManager.mo62756a(C12582d4.m63844a(str, str2, str3));
            }
        } catch (Exception e) {
            C43664k20.m29450A(TAG, "Failed to log push notification action clicked.", e);
            publishError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$logPushNotificationOpened$6(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("cid");
            if (!C43318jS5.m30597g(stringExtra)) {
                String str = TAG;
                C43664k20.m29431p(str, "Logging push click. Campaign Id: " + stringExtra);
                this.mBrazeManager.mo62756a(C12660g4.m63711d(stringExtra));
            } else {
                C43664k20.m29431p(TAG, "No campaign Id associated with this notification (this is expected for test sends). Not logging push click.");
            }
            requestTriggersIfInAppMessageTestPush(intent, this.mBrazeManager);
        } catch (Exception e) {
            C43664k20.m29450A(TAG, "Error logging push notification", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$logPushStoryPageClicked$8(String str, String str2) {
        try {
            if (!C51781xj6.m4780h(str, str2)) {
                C43664k20.m29421z(TAG, "Push story page click input was invalid. Not logging in-app purchase to Appboy.");
            } else {
                this.mBrazeManager.mo62756a(C12749j.m63582a(str, str2));
            }
        } catch (Exception e) {
            String str3 = TAG;
            C43664k20.m29450A(str3, "Failed to log push story page clicked for page id: " + str2 + " cid: " + str, e);
            publishError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Context context) {
        applyPendingRuntimeConfiguration();
        X10 x10 = new X10(this.mApplicationContext);
        this.mConfigurationProvider = x10;
        this.mIsApiKeyPresent = Boolean.valueOf(!C43318jS5.m30597g(getConfiguredApiKey(x10)));
        C43664k20.m29428s(this.mConfigurationProvider.getLoggerInitialLogLevel());
        C43664k20.m29439h();
        C13194w5 c13194w5 = new C13194w5();
        this.mTestUserDeviceLoggingManager = c13194w5;
        C43664k20.m29426u(c13194w5);
        if (getSdkEnablementProvider(context).m62861a()) {
            setOutboundNetworkRequestsOffline(true);
        }
        this.mDeviceIdReader = new C12811k0(this.mApplicationContext);
        this.mOfflineUserStorageProvider = new C13048q3(this.mApplicationContext);
        this.mRegistrationDataProvider = new C12722h4(this.mApplicationContext, this.mConfigurationProvider);
        if (!C43318jS5.m30597g(this.mConfigurationProvider.getCustomEndpoint())) {
            setConfiguredCustomEndpoint(this.mConfigurationProvider.getCustomEndpoint());
        }
        try {
            if (this.mConfigurationProvider.isFirebaseCloudMessagingRegistrationEnabled()) {
                C12703h1 c12703h1 = new C12703h1(context, this.mRegistrationDataProvider);
                if (c12703h1.m63635a()) {
                    String str = TAG;
                    C43664k20.m29431p(str, "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.");
                    String firebaseCloudMessagingSenderIdKey = this.mConfigurationProvider.getFirebaseCloudMessagingSenderIdKey();
                    if (firebaseCloudMessagingSenderIdKey != null) {
                        c12703h1.m63633a(firebaseCloudMessagingSenderIdKey);
                    } else {
                        C43664k20.m29431p(str, "Firebase Cloud Messaging sender ID was null. Not registering.");
                    }
                } else {
                    C43664k20.m29421z(TAG, "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.");
                }
            } else {
                C43664k20.m29431p(TAG, "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.");
            }
            if (this.mConfigurationProvider.isAdmMessagingRegistrationEnabled()) {
                if (C12530b.m63916a(this.mApplicationContext)) {
                    C43664k20.m29431p(TAG, "Amazon Device Messaging found. Setting up Amazon Device Messaging");
                    new C12530b(this.mApplicationContext, this.mRegistrationDataProvider).m63917a();
                } else {
                    C43664k20.m29421z(TAG, "ADM manifest requirements not met. Braze will not register for ADM.");
                }
            } else {
                C43664k20.m29431p(TAG, "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.");
            }
            verifyProperSdkSetup();
        } catch (Exception e) {
            C43664k20.m29434m(TAG, "Failed to setup pre SDK tasks", e);
        }
        C43664k20.m29424w(TAG, "Starting up a new user dependency manager");
        try {
            setUserSpecificMemberVariablesAndStartDispatch(new C13057q6(this.mApplicationContext, this.mOfflineUserStorageProvider, this.mConfigurationProvider, this.mExternalIEventMessenger, this.mDeviceIdReader, this.mRegistrationDataProvider, sMockNetworkRequestsAndDropEvents, sOutboundNetworkRequestsOffline, this.mTestUserDeviceLoggingManager));
        } catch (Exception e2) {
            C43664k20.m29434m(TAG, "Failed to startup user dependency manager.", e2);
            publishError(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openSession$1(Activity activity) {
        try {
            if (activity == null) {
                C43664k20.m29421z(TAG, "Cannot open session with null activity.");
            } else {
                this.mBrazeManager.openSession(activity);
            }
        } catch (Exception e) {
            C43664k20.m29434m(TAG, "Failed to open session.", e);
            publishError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$recordGeofenceTransition$28(String str, EnumC12867l1 enumC12867l1) {
        try {
            if (this.mBrazeGeofenceManager != null) {
                this.mBrazeGeofenceManager.m63434b(str, enumC12867l1);
            } else {
                C43664k20.m29438i(TAG, "Geofence manager was null. Not posting geofence report");
            }
        } catch (Exception e) {
            C43664k20.m29450A(TAG, "Failed to post geofence report.", e);
            publishError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerPushToken$17(String str) {
        try {
            this.mRegistrationDataProvider.mo63487a(str);
            requestImmediateDataFlush();
        } catch (Exception e) {
            String str2 = TAG;
            C43664k20.m29450A(str2, "Failed to set the push token " + str, e);
            publishError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestContentCardsRefresh$12(boolean z) {
        try {
            if (z) {
                this.mExternalIEventMessenger.mo63715a((InterfaceC12658g2) this.mContentCardsStorageProvider.m62807b(), (Class<InterfaceC12658g2>) C40779fA0.class);
            } else if (this.mServerConfigStorageProvider.m63930k()) {
                this.mBrazeManager.mo62759a(this.mContentCardsStorageProvider.m62798e(), this.mContentCardsStorageProvider.m62796f());
            } else {
                C43664k20.m29438i(TAG, "Content Cards is not enabled, skipping API call to refresh");
            }
        } catch (Exception e) {
            String str = TAG;
            C43664k20.m29450A(str, "Failed to request Content Cards refresh. Requesting from cache: " + z, e);
            publishError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestFeedRefresh$11() {
        try {
            this.mBrazeManager.mo62755a(new C13176v3.C13177a().m62866b());
        } catch (Exception e) {
            C43664k20.m29450A(TAG, "Failed to request refresh of feed.", e);
            publishError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestFeedRefreshFromCache$10() {
        try {
            this.mExternalIEventMessenger.mo63715a((InterfaceC12658g2) this.mFeedStorageProvider.m63728a(), (Class<InterfaceC12658g2>) FeedUpdatedEvent.class);
        } catch (JSONException e) {
            C43664k20.m29450A(TAG, "Failed to retrieve and publish feed from offline cache.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestGeofenceRefresh$29(InterfaceC13200x1 interfaceC13200x1) {
        try {
            if (this.mBrazeGeofenceManager != null) {
                this.mBrazeGeofenceManager.m63442a(interfaceC13200x1);
            } else {
                C43664k20.m29438i(TAG, "Geofence manager was null. Not requesting geofence refresh.");
            }
        } catch (Exception e) {
            C43664k20.m29450A(TAG, "Failed to request geofence refresh.", e);
            publishError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestGeofenceRefresh$30(boolean z) {
        try {
            if (this.mBrazeGeofenceManager != null) {
                this.mBrazeGeofenceManager.m63433b(z);
            } else {
                C43664k20.m29438i(TAG, "Geofence manager was null. Not requesting geofence refresh.");
            }
        } catch (Exception e) {
            String str = TAG;
            C43664k20.m29450A(str, "Failed to request geofence refresh with rate limit ignore: " + z, e);
            publishError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestGeofencesInitialization$33() {
        try {
            if (this.mBrazeGeofenceManager != null) {
                this.mBrazeGeofenceManager.m63436b();
            } else {
                C43664k20.m29438i(TAG, "Geofence manager was null. Not initializing geofences.");
            }
        } catch (Exception e) {
            C43664k20.m29450A(TAG, "Failed to initialize geofences with the geofence manager.", e);
            publishError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestImmediateDataFlush$13() {
        try {
            this.mBrazeManager.mo62749b();
        } catch (Exception e) {
            C43664k20.m29450A(TAG, "Failed to request data flush.", e);
            publishError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestSingleLocationUpdate$34() {
        try {
            if (this.mLocationManager != null) {
                this.mLocationManager.mo63288a();
            } else {
                C43664k20.m29438i(TAG, "Location manager was null. Not requesting single location update.");
            }
        } catch (Exception e) {
            C43664k20.m29450A(TAG, "Failed to request single location update", e);
            publishError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$retryInAppMessage$36(C44563lZ1 c44563lZ1) {
        try {
            this.mTriggerManager.mo62890a(c44563lZ1.m27151c(), c44563lZ1.m27152b());
        } catch (Exception e) {
            String str = TAG;
            C43664k20.m29450A(str, "Error retrying In-App Message from event " + c44563lZ1, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAppboyManagerAndSyncPolicyOffline$38(boolean z) {
        this.mBrazeManager.mo62750a(z);
        this.mDependencyProvider.m63083e().m63770a(z);
        if (this.mImageLoader != null) {
            String str = TAG;
            C43664k20.m29438i(str, "Setting the image loader deny network downloads to " + z);
            this.mImageLoader.mo10196d(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Uri lambda$setConfiguredCustomEndpoint$39(String str, Uri uri) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String encodedAuthority = parse.getEncodedAuthority();
        Uri.Builder buildUpon = uri.buildUpon();
        if (!C43318jS5.m30597g(scheme) && !C43318jS5.m30597g(encodedAuthority)) {
            buildUpon.encodedAuthority(encodedAuthority);
            buildUpon.scheme(scheme);
            return buildUpon.build();
        }
        return buildUpon.encodedAuthority(str).build();
    }

    private void publishError(Throwable th) {
        if (this.mErrorPublisher == null) {
            C43664k20.m29434m(TAG, "Cannot publish error on null publisher. This is usually the result of a missing API key.", th);
            return;
        }
        try {
            this.mErrorPublisher.mo63715a((InterfaceC12658g2) th, (Class<InterfaceC12658g2>) Throwable.class);
        } catch (Exception e) {
            String str = TAG;
            C43664k20.m29434m(str, "Failed to log throwable: " + th, e);
        }
    }

    public static void requestTriggersIfInAppMessageTestPush(Intent intent, InterfaceC13231y1 interfaceC13231y1) {
        if (interfaceC13231y1 == null) {
            C43664k20.m29421z(TAG, "Triggers requested for test in-app message with null AppboyManager. Doing nothing.");
            return;
        }
        String stringExtra = intent.getStringExtra("ab_push_fetch_test_triggers_key");
        if (stringExtra != null && stringExtra.equals("true")) {
            C43664k20.m29431p(TAG, "Push contained key for fetching test triggers, fetching triggers.");
            interfaceC13231y1.mo62755a(new C13176v3.C13177a().m62862c());
        }
    }

    public static void setConfiguredCustomEndpoint(final String str) {
        synchronized (sBrazeEndpointProviderLock) {
            setEndpointProvider(new IBrazeEndpointProvider() { // from class: Jl
                @Override // com.appboy.IBrazeEndpointProvider
                public final Uri getApiEndpoint(Uri uri) {
                    Uri lambda$setConfiguredCustomEndpoint$39;
                    lambda$setConfiguredCustomEndpoint$39 = Appboy.lambda$setConfiguredCustomEndpoint$39(str, uri);
                    return lambda$setConfiguredCustomEndpoint$39;
                }
            });
        }
    }

    public static void setEndpointProvider(IBrazeEndpointProvider iBrazeEndpointProvider) {
        synchronized (sBrazeEndpointProviderLock) {
            sEndpointProvider = iBrazeEndpointProvider;
        }
    }

    public static void setOutboundNetworkRequestsOffline(boolean z) {
        String str;
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Braze SDK outbound network requests are now ");
        if (z) {
            str = "disabled";
        } else {
            str = "enabled";
        }
        sb.append(str);
        C43664k20.m29431p(str2, sb.toString());
        synchronized (Appboy.class) {
            sOutboundNetworkRequestsOffline = z;
            if (sInstance != null) {
                sInstance.setAppboyManagerAndSyncPolicyOffline(z);
            }
        }
    }

    private void setUserSpecificMemberVariablesAndStartDispatch(C13057q6 c13057q6) {
        this.mDependencyProvider = c13057q6;
        this.mBrazeManager = c13057q6.m63085c();
        this.mServerConfigStorageProvider = c13057q6.m63075m();
        this.mTriggerManager = c13057q6.m63074n();
        this.mBrazeGeofenceManager = c13057q6.m63077k();
        this.mContentCardsStorageProvider = c13057q6.m63084d();
        this.mLocationManager = c13057q6.m63086b();
        this.mDeviceDataProvider = c13057q6.m63082f();
        this.mSdkAuthenticationCache = c13057q6.m63076l();
        this.mBrazeUser = new C50185v20(c13057q6.m63073o(), this.mBrazeManager, this.mOfflineUserStorageProvider.m63095a(), c13057q6.m63086b(), this.mServerConfigStorageProvider);
        c13057q6.m63081g().m62656a(c13057q6.m63080h());
        c13057q6.m63088a().m63788d();
        this.mErrorPublisher = c13057q6.m63080h();
        this.mUncaughtUserDependencyExceptionHandler.m62825a(this.mErrorPublisher);
        this.mFeedStorageProvider = c13057q6.m63078j();
        this.mTriggerManager = c13057q6.m63074n();
        c13057q6.m63079i().m63882a(c13057q6.m63088a());
        this.mTestUserDeviceLoggingManager.m62839a(this.mBrazeManager);
        this.mTestUserDeviceLoggingManager.m62836a(this.mServerConfigStorageProvider.m63926o());
    }

    public static boolean shouldAllowSingletonInitialization() {
        if (sInstance == null) {
            C43664k20.m29424w(TAG, "The instance is null. Allowing instance initialization");
            return true;
        } else if (sInstance.mIsInstanceStopped) {
            C43664k20.m29438i(TAG, "The instance was stopped. Allowing instance initialization");
            return true;
        } else if (Boolean.FALSE.equals(sInstance.mIsApiKeyPresent)) {
            C43664k20.m29438i(TAG, "No API key was found previously. Allowing instance initialization");
            return true;
        } else {
            return false;
        }
    }

    private void verifyProperSdkSetup() {
        boolean z = true;
        for (String str : NECESSARY_APPBOY_SDK_PERMISSIONS) {
            if (!C39750dR3.m44274b(this.mApplicationContext, str)) {
                C43664k20.m29421z(TAG, "The Braze SDK requires the permission " + str + ". Check your AndroidManifest.");
                z = false;
            }
        }
        if (this.mConfigurationProvider.getBrazeApiKey().toString().equals("")) {
            C43664k20.m29421z(TAG, "The Braze SDK requires a non-empty API key. Check your braze.xml or BrazeConfig.");
            z = false;
        }
        if (!z) {
            C43664k20.m29421z(TAG, "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/docs/developer_guide/platform_integration_guides/android/initial_sdk_setup/android_sdk_integration/");
        }
    }

    public void addSerializedCardJsonToStorage(final String str, final String str2) {
        if (isDisabled()) {
            return;
        }
        if (C43318jS5.m30597g(str)) {
            String str3 = TAG;
            C43664k20.m29421z(str3, "Cannot add null or blank card json to storage. Returning. User id: " + str2 + " Serialized json: " + str);
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: Tl
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$addSerializedCardJsonToStorage$31(str, str2);
            }
        });
    }

    public <T> void addSingleSynchronousSubscription(IEventSubscriber<T> iEventSubscriber, Class<T> cls) {
        try {
            this.mExternalIEventMessenger.mo63714b(iEventSubscriber, cls);
        } catch (Exception e) {
            String str = TAG;
            C43664k20.m29450A(str, "Failed to add synchronous subscriber for class: " + cls, e);
            publishError(e);
        }
    }

    public void applyPendingRuntimeConfiguration() {
        C43664k20.m29438i(TAG, "Applying any pending runtime configuration values");
        C41641gd5 c41641gd5 = new C41641gd5(this.mApplicationContext);
        for (U10 u10 : sPendingConfigurations) {
            if (u10 == sClearConfigSentinel) {
                C43664k20.m29424w(TAG, "Clearing config values");
                c41641gd5.m37968b();
            } else {
                String str = TAG;
                C43664k20.m29424w(str, "Setting pending config object: " + u10);
                c41641gd5.m37956n(u10);
            }
        }
        sPendingConfigurations.clear();
    }

    public void changeUser(String str) {
        changeUser(str, null);
    }

    public void closeSession(final Activity activity) {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: Rl
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$closeSession$2(activity);
            }
        });
    }

    public void getCurrentUser(final IValueCallback<C50185v20> iValueCallback) {
        if (isDisabled()) {
            iValueCallback.onError();
            return;
        }
        try {
            this.mUserDependencyExecutor.execute(new Runnable() { // from class: El
                @Override // java.lang.Runnable
                public final void run() {
                    Appboy.this.lambda$getCurrentUser$16(iValueCallback);
                }
            });
        } catch (Exception e) {
            C43664k20.m29450A(TAG, "Failed to retrieve the current user.", e);
            iValueCallback.onError();
            publishError(e);
        }
    }

    public InterfaceC40313eO1 getImageLoader() {
        if (this.mImageLoader == null) {
            C43664k20.m29438i(TAG, "The Image Loader was null. Creating a new Image Loader and returning it.");
            this.mImageLoader = new C49871uW0(this.mApplicationContext);
        }
        return this.mImageLoader;
    }

    public void handleInAppMessageTestPush(final Intent intent) {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: Nl
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$handleInAppMessageTestPush$35(intent);
            }
        });
    }

    public void logCustomEvent(String str) {
        logCustomEvent(str, null);
    }

    public void logFeedDisplayed() {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: xl
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$logFeedDisplayed$9();
            }
        });
    }

    public void logLocationRecordedEventFromLocationUpdate(final InterfaceC13200x1 interfaceC13200x1) {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: Hl
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$logLocationRecordedEventFromLocationUpdate$32(interfaceC13200x1);
            }
        });
    }

    public void logPurchase(final String str, final String str2, final BigDecimal bigDecimal, final int i, C48407s20 c48407s20) {
        C48407s20 m14857e;
        if (isDisabled()) {
            return;
        }
        if (c48407s20 != null) {
            try {
                m14857e = c48407s20.m14857e();
            } catch (Exception e) {
                String str3 = TAG;
                C43664k20.m29450A(str3, "Failed to log purchase event of " + str, e);
                publishError(e);
                return;
            }
        } else {
            m14857e = null;
        }
        final C48407s20 c48407s202 = m14857e;
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: Il
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$logPurchase$4(str, str2, bigDecimal, i, c48407s202);
            }
        });
    }

    public void logPushNotificationActionClicked(final String str, final String str2, final String str3) {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: Sl
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$logPushNotificationActionClicked$7(str, str2, str3);
            }
        });
    }

    public void logPushNotificationOpened(final Intent intent) {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: Pl
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$logPushNotificationOpened$6(intent);
            }
        });
    }

    public void logPushStoryPageClicked(final String str, final String str2) {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: wl
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$logPushStoryPageClicked$8(str, str2);
            }
        });
    }

    public void openSession(final Activity activity) {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: Ml
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$openSession$1(activity);
            }
        });
    }

    public void recordGeofenceTransition(final String str, final EnumC12867l1 enumC12867l1) {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: Bl
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$recordGeofenceTransition$28(str, enumC12867l1);
            }
        });
    }

    public void registerPushToken(final String str) {
        if (isDisabled()) {
            return;
        }
        if (C43318jS5.m30597g(str)) {
            C43664k20.m29421z(TAG, "Push token must not be null or blank. Not registering for push with Braze.");
            return;
        }
        String str2 = TAG;
        C43664k20.m29431p(str2, "Push token " + str + " registered and immediately being flushed.");
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: Ol
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$registerPushToken$17(str);
            }
        });
    }

    public <T> void removeSingleSubscription(IEventSubscriber<T> iEventSubscriber, Class<T> cls) {
        if (iEventSubscriber != null) {
            try {
                this.mExternalIEventMessenger.mo63713c(iEventSubscriber, cls);
            } catch (Exception e) {
                String str = TAG;
                C43664k20.m29450A(str, "Failed to remove " + cls.getName() + " subscriber.", e);
                publishError(e);
            }
        }
    }

    public void requestContentCardsRefresh(final boolean z) {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: ul
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$requestContentCardsRefresh$12(z);
            }
        });
    }

    public void requestFeedRefresh() {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: Fl
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$requestFeedRefresh$11();
            }
        });
    }

    public void requestFeedRefreshFromCache() {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: zl
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$requestFeedRefreshFromCache$10();
            }
        });
    }

    public void requestGeofenceRefresh(final InterfaceC13200x1 interfaceC13200x1) {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: Al
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$requestGeofenceRefresh$29(interfaceC13200x1);
            }
        });
    }

    public void requestGeofencesInitialization() {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: Kl
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$requestGeofencesInitialization$33();
            }
        });
    }

    public void requestImmediateDataFlush() {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: Gl
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$requestImmediateDataFlush$13();
            }
        });
    }

    public void requestLocationInitialization() {
        C43664k20.m29438i(TAG, "Location permissions were granted. Requesting geofence and location initialization.");
        requestGeofencesInitialization();
        requestSingleLocationUpdate();
    }

    public void requestSingleLocationUpdate() {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: Ll
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$requestSingleLocationUpdate$34();
            }
        });
    }

    public void retryInAppMessage(final C44563lZ1 c44563lZ1) {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: yl
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$retryInAppMessage$36(c44563lZ1);
            }
        });
    }

    public void setAppboyManagerAndSyncPolicyOffline(final boolean z) {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: Dl
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$setAppboyManagerAndSyncPolicyOffline$38(z);
            }
        });
    }

    public void subscribeToContentCardsUpdates(IEventSubscriber<C40779fA0> iEventSubscriber) {
        try {
            this.mExternalIEventMessenger.mo63716a((IEventSubscriber) iEventSubscriber, C40779fA0.class);
        } catch (Exception e) {
            C43664k20.m29450A(TAG, "Failed to add subscriber for Content Cards updates.", e);
            publishError(e);
        }
    }

    public void subscribeToFeedUpdates(IEventSubscriber<FeedUpdatedEvent> iEventSubscriber) {
        try {
            this.mExternalIEventMessenger.mo63716a((IEventSubscriber) iEventSubscriber, FeedUpdatedEvent.class);
        } catch (Exception e) {
            C43664k20.m29450A(TAG, "Failed to add subscriber for feed updates.", e);
            publishError(e);
        }
    }

    public void subscribeToNewInAppMessages(IEventSubscriber<C44563lZ1> iEventSubscriber) {
        try {
            this.mExternalIEventMessenger.mo63716a((IEventSubscriber) iEventSubscriber, C44563lZ1.class);
        } catch (Exception e) {
            C43664k20.m29450A(TAG, "Failed to add subscriber to new in-app messages.", e);
            publishError(e);
        }
    }

    public void changeUser(final String str, final String str2) {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: Cl
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$changeUser$14(str, str2);
            }
        });
    }

    public void logCustomEvent(final String str, C48407s20 c48407s20) {
        final C48407s20 m14857e;
        if (isDisabled()) {
            return;
        }
        if (c48407s20 != null) {
            try {
                m14857e = c48407s20.m14857e();
            } catch (Exception e) {
                String str2 = TAG;
                C43664k20.m29450A(str2, "Failed to log custom event: " + str, e);
                publishError(e);
                return;
            }
        } else {
            m14857e = null;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: tl
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$logCustomEvent$3(str, m14857e);
            }
        });
    }

    public void requestGeofenceRefresh(final boolean z) {
        if (isDisabled()) {
            return;
        }
        this.mUserDependencyExecutor.execute(new Runnable() { // from class: vl
            @Override // java.lang.Runnable
            public final void run() {
                Appboy.this.lambda$requestGeofenceRefresh$30(z);
            }
        });
    }
}
