.class public Lcom/appboy/Appboy;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final KNOWN_APP_CRAWLER_DEVICE_MODELS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final NECESSARY_APPBOY_SDK_PERMISSIONS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String;

.field protected static final sBrazeEndpointProviderLock:Ljava/lang/Object;

.field private static final sClearConfigSentinel:LU10;

.field protected static volatile sCustomNotificationFactory:LfO1;

.field protected static volatile sEndpointProvider:Lcom/appboy/IBrazeEndpointProvider;

.field protected static volatile sInstance:LP10;

.field protected static volatile sMockNetworkRequestsAndDropEvents:Z

.field protected static volatile sOutboundNetworkRequestsOffline:Z

.field private static final sPendingConfigurations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LU10;",
            ">;"
        }
    .end annotation
.end field

.field protected static volatile sSdkEnablementProvider:Lbo/app/v4;


# instance fields
.field private final mApplicationContext:Landroid/content/Context;

.field volatile mBrazeGeofenceManager:Lbo/app/l;

.field volatile mBrazeManager:Lbo/app/y1;

.field private volatile mBrazeUser:Lv20;

.field protected mConfigurationProvider:LX10;

.field volatile mContentCardsStorageProvider:Lbo/app/y;

.field protected volatile mDependencyProvider:Lbo/app/q6;

.field volatile mDeviceDataProvider:Lbo/app/c2;

.field protected mDeviceIdReader:Lbo/app/d2;

.field private volatile mErrorPublisher:Lbo/app/g2;

.field protected mExternalIEventMessenger:Lbo/app/g2;

.field private volatile mFeedStorageProvider:Lbo/app/g1;

.field private mImageLoader:LeO1;

.field protected mIsApiKeyPresent:Ljava/lang/Boolean;

.field protected volatile mIsInstanceStopped:Z

.field private volatile mLocationManager:Lbo/app/i2;

.field private mOfflineUserStorageProvider:Lbo/app/q3;

.field protected mRegistrationDataProvider:Lbo/app/j2;

.field volatile mSdkAuthenticationCache:Lbo/app/u4;

.field protected volatile mServerConfigStorageProvider:Lbo/app/a5;

.field private mTestUserDeviceLoggingManager:Lbo/app/w5;

.field protected volatile mTriggerManager:Lbo/app/g6;

.field private final mUncaughtUserDependencyExceptionHandler:Lbo/app/x0;

.field protected final mUserDependencyExecutor:Lbo/app/x4;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, LP10;

    invoke-static {v0}, Lk20;->n(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/util/HashSet;

    const-string v1, "calypso appcrawler"

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/appboy/Appboy;->KNOWN_APP_CRAWLER_DEVICE_MODELS:Ljava/util/Set;

    new-instance v0, Ljava/util/HashSet;

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    const-string v2, "android.permission.INTERNET"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/appboy/Appboy;->NECESSARY_APPBOY_SDK_PERMISSIONS:Ljava/util/Set;

    const/4 v0, 0x0

    sput-object v0, Lcom/appboy/Appboy;->sInstance:LP10;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/appboy/Appboy;->sBrazeEndpointProviderLock:Ljava/lang/Object;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/appboy/Appboy;->sMockNetworkRequestsAndDropEvents:Z

    sput-boolean v0, Lcom/appboy/Appboy;->sOutboundNetworkRequestsOffline:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/appboy/Appboy;->sPendingConfigurations:Ljava/util/List;

    new-instance v0, LU10$a;

    invoke-direct {v0}, LU10$a;-><init>()V

    invoke-virtual {v0}, LU10$a;->a()LU10;

    move-result-object v0

    sput-object v0, Lcom/appboy/Appboy;->sClearConfigSentinel:LU10;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/appboy/Appboy;->mIsApiKeyPresent:Ljava/lang/Boolean;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/appboy/Appboy;->mIsInstanceStopped:Z

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sget-object v2, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v3, "Braze SDK Initializing"

    invoke-static {v2, v3}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iput-object v3, p0, Lcom/appboy/Appboy;->mApplicationContext:Landroid/content/Context;

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    if-eqz v4, :cond_0

    sget-object v5, Lcom/appboy/Appboy;->KNOWN_APP_CRAWLER_DEVICE_MODELS:Ljava/util/Set;

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v4, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Device build model matches a known crawler. Enabling mock network request mode. Device model: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/appboy/Appboy;->enableMockAppboyNetworkRequestsAndDropEventsMode()Z

    :cond_0
    new-instance v4, LuW0;

    invoke-direct {v4, v3}, LuW0;-><init>(Landroid/content/Context;)V

    iput-object v4, p0, Lcom/appboy/Appboy;->mImageLoader:LeO1;

    new-instance v4, Lbo/app/a1;

    invoke-static {v3}, Lcom/appboy/Appboy;->getSdkEnablementProvider(Landroid/content/Context;)Lbo/app/v4;

    move-result-object v3

    invoke-direct {v4, v3}, Lbo/app/a1;-><init>(Lbo/app/v4;)V

    iput-object v4, p0, Lcom/appboy/Appboy;->mExternalIEventMessenger:Lbo/app/g2;

    new-instance v3, Lbo/app/v0;

    const-string v4, "Appboy-User-Dependency-Thread"

    invoke-direct {v3, v4}, Lbo/app/v0;-><init>(Ljava/lang/String;)V

    new-instance v4, Lbo/app/x0;

    iget-object v5, p0, Lcom/appboy/Appboy;->mExternalIEventMessenger:Lbo/app/g2;

    invoke-direct {v4, v5}, Lbo/app/x0;-><init>(Lbo/app/g2;)V

    iput-object v4, p0, Lcom/appboy/Appboy;->mUncaughtUserDependencyExceptionHandler:Lbo/app/x0;

    invoke-virtual {v3, v4}, Lbo/app/v0;->a(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    new-instance v4, Lbo/app/x4;

    const-string v5, "singleton_user_dependency_serial_executor_identifier"

    invoke-direct {v4, v5, v3}, Lbo/app/x4;-><init>(Ljava/lang/String;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v4, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v3, LQl;

    invoke-direct {v3, p0, p1}, LQl;-><init>(Lcom/appboy/Appboy;Landroid/content/Context;)V

    invoke-virtual {v4, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Braze SDK loaded in "

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    sub-long/2addr v3, v0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v5, v3, v4, v0}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " ms."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic A(Lcom/appboy/Appboy;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/appboy/Appboy;->lambda$logPushStoryPageClicked$8(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/appboy/Appboy;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->lambda$setAppboyManagerAndSyncPolicyOffline$38(Z)V

    return-void
.end method

.method public static synthetic b(Lcom/appboy/Appboy;)V
    .locals 0

    invoke-direct {p0}, Lcom/appboy/Appboy;->lambda$requestSingleLocationUpdate$34()V

    return-void
.end method

.method public static synthetic c(Lcom/appboy/Appboy;Lcom/appboy/events/IValueCallback;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->lambda$getCurrentUser$16(Lcom/appboy/events/IValueCallback;)V

    return-void
.end method

.method public static configure(Landroid/content/Context;LU10;)Z
    .locals 3

    sget-object p0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Braze.configure() called with configuration: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-class v0, Lcom/appboy/Appboy;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/appboy/Appboy;->sInstance:LP10;

    if-eqz v1, :cond_0

    sget-object v1, Lcom/appboy/Appboy;->sInstance:LP10;

    iget-boolean v1, v1, Lcom/appboy/Appboy;->mIsInstanceStopped:Z

    if-nez v1, :cond_0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v2, Lcom/appboy/Appboy;->sInstance:LP10;

    iget-object v2, v2, Lcom/appboy/Appboy;->mIsApiKeyPresent:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p1, "Braze.configure() cannot be called while the singleton is still live."

    invoke-static {p0, p1}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit v0

    const/4 p0, 0x0

    return p0

    :cond_0
    if-eqz p1, :cond_1

    sget-object p0, Lcom/appboy/Appboy;->sPendingConfigurations:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const-string p1, "Braze.configure() called with a null config; Clearing all configuration values."

    invoke-static {p0, p1}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Lcom/appboy/Appboy;->sPendingConfigurations:Ljava/util/List;

    sget-object p1, Lcom/appboy/Appboy;->sClearConfigSentinel:LU10;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    monitor-exit v0

    const/4 p0, 0x1

    return p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static synthetic d(Lcom/appboy/Appboy;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/appboy/Appboy;->lambda$changeUser$14(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic e(Ljava/lang/String;Landroid/net/Uri;)Landroid/net/Uri;
    .locals 0

    invoke-static {p0, p1}, Lcom/appboy/Appboy;->lambda$setConfiguredCustomEndpoint$39(Ljava/lang/String;Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static enableMockAppboyNetworkRequestsAndDropEventsMode()Z
    .locals 4

    sget-object v0, Lcom/appboy/Appboy;->sInstance:LP10;

    if-nez v0, :cond_2

    const-class v0, Lcom/appboy/Appboy;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/appboy/Appboy;->sInstance:LP10;

    if-nez v1, :cond_1

    sget-boolean v1, Lcom/appboy/Appboy;->sMockNetworkRequestsAndDropEvents:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v3, "Braze network requests already being mocked. Note that events dispatched in this mode are dropped."

    invoke-static {v1, v3}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v3, "Braze network requests will be mocked. Events dispatched in this mode will be dropped."

    invoke-static {v1, v3}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    sput-boolean v2, Lcom/appboy/Appboy;->sMockNetworkRequestsAndDropEvents:Z

    :goto_0
    monitor-exit v0

    return v2

    :cond_1
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    :goto_1
    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called."

    invoke-static {v0, v1}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic f(Lcom/appboy/Appboy;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/appboy/Appboy;->lambda$addSerializedCardJsonToStorage$31(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic g(Lcom/appboy/Appboy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/appboy/Appboy;->lambda$logPushNotificationActionClicked$7(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static getApiEndpoint(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 3

    sget-object v0, Lcom/appboy/Appboy;->sBrazeEndpointProviderLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/appboy/Appboy;->sEndpointProvider:Lcom/appboy/IBrazeEndpointProvider;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    :try_start_1
    sget-object v1, Lcom/appboy/Appboy;->sEndpointProvider:Lcom/appboy/IBrazeEndpointProvider;

    invoke-interface {v1, p0}, Lcom/appboy/IBrazeEndpointProvider;->getApiEndpoint(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_0

    :try_start_2
    monitor-exit v0

    return-object v1

    :catch_0
    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v2, "Caught exception trying to get a Braze API endpoint from the AppboyEndpointProvider. Using the original URI"

    invoke-static {v1, v2}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static getConfiguredApiKey(LX10;)Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, LX10;->getBrazeApiKey()Lbo/app/i;

    move-result-object p0

    invoke-virtual {p0}, Lbo/app/i;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Caught exception while retrieving API key."

    invoke-static {v0, v1, p0}, Lk20;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static getCustomBrazeNotificationFactory()LfO1;
    .locals 1

    sget-object v0, Lcom/appboy/Appboy;->sCustomNotificationFactory:LfO1;

    return-object v0
.end method

.method public static getInstance(Landroid/content/Context;)LP10;
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->shouldAllowSingletonInitialization()Z

    move-result v0

    if-eqz v0, :cond_1

    const-class v0, Lcom/appboy/Appboy;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/appboy/Appboy;->shouldAllowSingletonInitialization()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, LP10;

    invoke-direct {v1, p0}, LP10;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/appboy/Appboy;->sInstance:LP10;

    sget-object p0, Lcom/appboy/Appboy;->sInstance:LP10;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/appboy/Appboy;->mIsInstanceStopped:Z

    sget-object p0, Lcom/appboy/Appboy;->sInstance:LP10;

    monitor-exit v0

    return-object p0

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/appboy/Appboy;->sInstance:LP10;

    return-object p0
.end method

.method public static getOutboundNetworkRequestsOffline()Z
    .locals 1

    sget-boolean v0, Lcom/appboy/Appboy;->sOutboundNetworkRequestsOffline:Z

    return v0
.end method

.method public static getSdkEnablementProvider(Landroid/content/Context;)Lbo/app/v4;
    .locals 1

    sget-object v0, Lcom/appboy/Appboy;->sSdkEnablementProvider:Lbo/app/v4;

    if-nez v0, :cond_0

    new-instance v0, Lbo/app/v4;

    invoke-direct {v0, p0}, Lbo/app/v4;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/appboy/Appboy;->sSdkEnablementProvider:Lbo/app/v4;

    :cond_0
    sget-object p0, Lcom/appboy/Appboy;->sSdkEnablementProvider:Lbo/app/v4;

    return-object p0
.end method

.method public static synthetic h(Lcom/appboy/Appboy;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->lambda$handleInAppMessageTestPush$35(Landroid/content/Intent;)V

    return-void
.end method

.method public static synthetic i(Lcom/appboy/Appboy;)V
    .locals 0

    invoke-direct {p0}, Lcom/appboy/Appboy;->lambda$requestFeedRefresh$11()V

    return-void
.end method

.method public static isDisabled()Z
    .locals 3

    sget-object v0, Lcom/appboy/Appboy;->sSdkEnablementProvider:Lbo/app/v4;

    if-nez v0, :cond_0

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "SDK enablement provider was null. Returning SDK as enabled."

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    sget-object v0, Lcom/appboy/Appboy;->sInstance:LP10;

    if-eqz v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v1, Lcom/appboy/Appboy;->sInstance:LP10;

    iget-object v1, v1, Lcom/appboy/Appboy;->mIsApiKeyPresent:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "API key not present. Actions will not be performed on the SDK."

    invoke-static {v0, v1}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    return v0

    :cond_1
    sget-object v0, Lcom/appboy/Appboy;->sSdkEnablementProvider:Lbo/app/v4;

    invoke-virtual {v0}, Lbo/app/v4;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v2, "SDK is disabled. Actions will not be performed on the SDK."

    invoke-static {v1, v2}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return v0
.end method

.method private isEphemeralEventKey(Ljava/lang/String;)Z
    .locals 5

    iget-object v0, p0, Lcom/appboy/Appboy;->mConfigurationProvider:LX10;

    invoke-virtual {v0}, LX10;->isEphemeralEventsEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Ephemeral events enabled"

    invoke-static {v0, v1}, Lk20;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/appboy/Appboy;->mConfigurationProvider:LX10;

    invoke-virtual {v1}, LX10;->getEphemeralEventKeys()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Checking event key ["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "] against ephemeral event list "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " and got match?: "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lk20;->w(Ljava/lang/String;Ljava/lang/String;)V

    return v2
.end method

.method public static synthetic j(Lcom/appboy/Appboy;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->lambda$closeSession$2(Landroid/app/Activity;)V

    return-void
.end method

.method public static synthetic k(Lcom/appboy/Appboy;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->lambda$requestGeofenceRefresh$30(Z)V

    return-void
.end method

.method public static synthetic l(Lcom/appboy/Appboy;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->lambda$logPushNotificationOpened$6(Landroid/content/Intent;)V

    return-void
.end method

.method private synthetic lambda$addSerializedCardJsonToStorage$31(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    :try_start_0
    new-instance v0, Lbo/app/x;

    invoke-direct {v0, p1}, Lbo/app/x;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/appboy/Appboy;->mContentCardsStorageProvider:Lbo/app/y;

    invoke-virtual {v1, v0, p2}, Lbo/app/y;->a(Lbo/app/x;Ljava/lang/String;)LfA0;

    iget-object v0, p0, Lcom/appboy/Appboy;->mExternalIEventMessenger:Lbo/app/g2;

    iget-object v1, p0, Lcom/appboy/Appboy;->mContentCardsStorageProvider:Lbo/app/y;

    invoke-virtual {v1}, Lbo/app/y;->b()LfA0;

    move-result-object v1

    const-class v2, LfA0;

    invoke-interface {v0, v1, v2}, Lbo/app/g2;->a(Ljava/lang/Object;Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to update ContentCard storage provider with single card update. User id: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " Serialized json: "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v0}, Lk20;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$changeUser$14(Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    :try_start_0
    invoke-static {p1}, LjS5;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v0, "ArgumentException: userId passed to changeUser was null or empty. The current user will remain the active user."

    invoke-static {p2, v0}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p1}, LjS5;->a(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e5

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    sget-object p2, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Rejected user id with byte length longer than 997. Not changing user. Input user id: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeUser:Lv20;

    invoke-virtual {v0}, Lv20;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "Set sdk auth signature on changeUser call: "

    if-eqz v1, :cond_2

    :try_start_1
    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Received request to change current user "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " to the same user id. Not changing user."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2}, LjS5;->g(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appboy/Appboy;->mSdkAuthenticationCache:Lbo/app/u4;

    invoke-virtual {v0, p2}, Lbo/app/u4;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_2
    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Changing anonymous user to "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appboy/Appboy;->mOfflineUserStorageProvider:Lbo/app/q3;

    invoke-virtual {v0, p1}, Lbo/app/q3;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeUser:Lv20;

    invoke-virtual {v0, p1}, Lv20;->A(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Changing current user "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " to new user "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/appboy/events/FeedUpdatedEvent;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v6, 0x0

    invoke-static {}, LoT0;->i()J

    move-result-wide v7

    move-object v3, v0

    move-object v5, p1

    invoke-direct/range {v3 .. v8}, Lcom/appboy/events/FeedUpdatedEvent;-><init>(Ljava/util/List;Ljava/lang/String;ZJ)V

    iget-object v1, p0, Lcom/appboy/Appboy;->mExternalIEventMessenger:Lbo/app/g2;

    const-class v3, Lcom/appboy/events/FeedUpdatedEvent;

    invoke-interface {v1, v0, v3}, Lbo/app/g2;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    :goto_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    invoke-interface {v0}, Lbo/app/y1;->d()V

    iget-object v0, p0, Lcom/appboy/Appboy;->mOfflineUserStorageProvider:Lbo/app/q3;

    invoke-virtual {v0, p1}, Lbo/app/q3;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appboy/Appboy;->mDependencyProvider:Lbo/app/q6;

    new-instance v1, Lbo/app/q6;

    iget-object v4, p0, Lcom/appboy/Appboy;->mApplicationContext:Landroid/content/Context;

    iget-object v5, p0, Lcom/appboy/Appboy;->mOfflineUserStorageProvider:Lbo/app/q3;

    iget-object v6, p0, Lcom/appboy/Appboy;->mConfigurationProvider:LX10;

    iget-object v7, p0, Lcom/appboy/Appboy;->mExternalIEventMessenger:Lbo/app/g2;

    iget-object v8, p0, Lcom/appboy/Appboy;->mDeviceIdReader:Lbo/app/d2;

    iget-object v9, p0, Lcom/appboy/Appboy;->mRegistrationDataProvider:Lbo/app/j2;

    sget-boolean v10, Lcom/appboy/Appboy;->sMockNetworkRequestsAndDropEvents:Z

    sget-boolean v11, Lcom/appboy/Appboy;->sOutboundNetworkRequestsOffline:Z

    iget-object v12, p0, Lcom/appboy/Appboy;->mTestUserDeviceLoggingManager:Lbo/app/w5;

    move-object v3, v1

    invoke-direct/range {v3 .. v12}, Lbo/app/q6;-><init>(Landroid/content/Context;Lbo/app/q3;LX10;Lbo/app/g2;Lbo/app/d2;Lbo/app/j2;ZZLbo/app/w5;)V

    invoke-direct {p0, v1}, Lcom/appboy/Appboy;->setUserSpecificMemberVariablesAndStartDispatch(Lbo/app/q6;)V

    invoke-static {p2}, LjS5;->g(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/appboy/Appboy;->mSdkAuthenticationCache:Lbo/app/u4;

    invoke-virtual {v1, p2}, Lbo/app/u4;->a(Ljava/lang/String;)V

    :cond_4
    iget-object p2, p0, Lcom/appboy/Appboy;->mDependencyProvider:Lbo/app/q6;

    invoke-virtual {p2}, Lbo/app/q6;->o()Lbo/app/p6;

    move-result-object p2

    invoke-virtual {p2}, Lbo/app/p6;->h()V

    iget-object p2, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    invoke-interface {p2}, Lbo/app/y1;->c()V

    iget-object p2, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    new-instance v1, Lbo/app/v3$a;

    invoke-direct {v1}, Lbo/app/v3$a;-><init>()V

    invoke-virtual {v1}, Lbo/app/v3$a;->b()Lbo/app/v3$a;

    move-result-object v1

    invoke-interface {p2, v1}, Lbo/app/y1;->a(Lbo/app/v3$a;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Lcom/appboy/Appboy;->requestContentCardsRefresh(Z)V

    invoke-virtual {v0}, Lbo/app/q6;->p()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to set external id to: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p2}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p2}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :cond_5
    :goto_1
    return-void
.end method

.method private synthetic lambda$closeSession$2(Landroid/app/Activity;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    sget-object p1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v0, "Cannot close session with null activity."

    invoke-static {p1, v0}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    invoke-interface {v0, p1}, Lbo/app/y1;->closeSession(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Failed to close session."

    invoke-static {v0, v1, p1}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$getCurrentUser$16(Lcom/appboy/events/IValueCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeUser:Lv20;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeUser:Lv20;

    invoke-interface {p1, v0}, Lcom/appboy/events/IValueCallback;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lcom/appboy/events/IValueCallback;->onError()V

    :goto_0
    return-void
.end method

.method private synthetic lambda$handleInAppMessageTestPush$35(Landroid/content/Intent;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    invoke-static {p1, v0}, Lcom/appboy/Appboy;->requestTriggersIfInAppMessageTestPush(Landroid/content/Intent;Lbo/app/y1;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Error handling test in-app message push"

    invoke-static {v0, v1, p1}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$logCustomEvent$3(Ljava/lang/String;Ls20;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mServerConfigStorageProvider:Lbo/app/a5;

    invoke-static {p1, v0}, Lxj6;->e(Ljava/lang/String;Lbo/app/a5;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p2, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Logged custom event with name "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " was invalid. Not logging custom event to Braze."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ls20;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p2, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Custom event with name "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " logged with invalid properties. Not logging custom event to Braze."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {p1}, Lxj6;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Lbo/app/j;->a(Ljava/lang/String;Ls20;)Lbo/app/u1;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->isEphemeralEventKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/appboy/Appboy;->mServerConfigStorageProvider:Lbo/app/a5;

    invoke-virtual {v1}, Lbo/app/a5;->l()Z

    move-result v1

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    invoke-interface {v1, v0}, Lbo/app/y1;->a(Lbo/app/u1;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/appboy/Appboy;->mTriggerManager:Lbo/app/g6;

    new-instance v2, Lbo/app/c0;

    invoke-direct {v2, p1, p2, v0}, Lbo/app/c0;-><init>(Ljava/lang/String;Ls20;Lbo/app/u1;)V

    invoke-virtual {v1, v2}, Lbo/app/g6;->a(Lbo/app/t2;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to log custom event: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p2}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p2}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    return-void
.end method

.method private synthetic lambda$logFeedDisplayed$9()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    invoke-static {}, Lbo/app/j;->e()Lbo/app/u1;

    move-result-object v1

    invoke-interface {v0, v1}, Lbo/app/y1;->a(Lbo/app/u1;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v2, "Failed to log that the feed was displayed."

    invoke-static {v1, v2, v0}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, v0}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$logLocationRecordedEventFromLocationUpdate$32(Lbo/app/x1;)V
    .locals 2

    :try_start_0
    invoke-static {p1}, Lbo/app/j;->a(Lbo/app/x1;)Lbo/app/u1;

    move-result-object p1

    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    invoke-interface {v0, p1}, Lbo/app/y1;->a(Lbo/app/u1;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Failed to log location recorded event."

    invoke-static {v0, v1, p1}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$logPurchase$4(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILs20;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mServerConfigStorageProvider:Lbo/app/a5;

    invoke-static {p1, p2, p3, p4, v0}, Lxj6;->f(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILbo/app/a5;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p2, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string p3, "Log purchase input was invalid. Not logging in-app purchase to Braze."

    invoke-static {p2, p3}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz p5, :cond_1

    invoke-virtual {p5}, Ls20;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p2, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string p3, "Purchase logged with invalid properties. Not logging custom event to Braze."

    invoke-static {p2, p3}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {p1}, Lxj6;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2, p3, p4, p5}, Lbo/app/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILs20;)Lbo/app/u1;

    move-result-object p2

    iget-object p3, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    invoke-interface {p3, p2}, Lbo/app/y1;->a(Lbo/app/u1;)Z

    move-result p3

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/appboy/Appboy;->mTriggerManager:Lbo/app/g6;

    new-instance p4, Lbo/app/b4;

    invoke-direct {p4, p1, p5, p2}, Lbo/app/b4;-><init>(Ljava/lang/String;Ls20;Lbo/app/u1;)V

    invoke-virtual {p3, p4}, Lbo/app/g6;->a(Lbo/app/t2;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    sget-object p3, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "Failed to log purchase event of "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1, p2}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p2}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private synthetic lambda$logPushNotificationActionClicked$7(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    :try_start_0
    invoke-static {p1}, LjS5;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string p2, "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification action clicked."

    invoke-static {p1, p2}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p2}, LjS5;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string p2, "Action ID cannot be null or blank"

    invoke-static {p1, p2}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    invoke-static {p1, p2, p3}, Lbo/app/d4;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbo/app/u1;

    move-result-object p1

    invoke-interface {v0, p1}, Lbo/app/y1;->a(Lbo/app/u1;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object p2, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string p3, "Failed to log push notification action clicked."

    invoke-static {p2, p3, p1}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$logPushNotificationOpened$6(Landroid/content/Intent;)V
    .locals 4

    :try_start_0
    const-string v0, "cid"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LjS5;->g(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Logging push click. Campaign Id: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    invoke-static {v0}, Lbo/app/g4;->d(Ljava/lang/String;)Lbo/app/g4;

    move-result-object v0

    invoke-interface {v1, v0}, Lbo/app/y1;->a(Lbo/app/u1;)Z

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "No campaign Id associated with this notification (this is expected for test sends). Not logging push click."

    invoke-static {v0, v1}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    invoke-static {p1, v0}, Lcom/appboy/Appboy;->requestTriggersIfInAppMessageTestPush(Landroid/content/Intent;Lbo/app/y1;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Error logging push notification"

    invoke-static {v0, v1, p1}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method private synthetic lambda$logPushStoryPageClicked$8(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    :try_start_0
    invoke-static {p1, p2}, Lxj6;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Push story page click input was invalid. Not logging in-app purchase to Appboy."

    invoke-static {v0, v1}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    invoke-static {p1, p2}, Lbo/app/j;->a(Ljava/lang/String;Ljava/lang/String;)Lbo/app/u1;

    move-result-object v1

    invoke-interface {v0, v1}, Lbo/app/y1;->a(Lbo/app/u1;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to log push story page clicked for page id: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " cid: "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v0}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, v0}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$new$0(Landroid/content/Context;)V
    .locals 11

    invoke-virtual {p0}, Lcom/appboy/Appboy;->applyPendingRuntimeConfiguration()V

    new-instance v0, LX10;

    iget-object v1, p0, Lcom/appboy/Appboy;->mApplicationContext:Landroid/content/Context;

    invoke-direct {v0, v1}, LX10;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/appboy/Appboy;->mConfigurationProvider:LX10;

    invoke-static {v0}, Lcom/appboy/Appboy;->getConfiguredApiKey(LX10;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LjS5;->g(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/appboy/Appboy;->mIsApiKeyPresent:Ljava/lang/Boolean;

    iget-object v0, p0, Lcom/appboy/Appboy;->mConfigurationProvider:LX10;

    invoke-virtual {v0}, LX10;->getLoggerInitialLogLevel()I

    move-result v0

    invoke-static {v0}, Lk20;->s(I)V

    invoke-static {}, Lk20;->h()V

    new-instance v0, Lbo/app/w5;

    invoke-direct {v0}, Lbo/app/w5;-><init>()V

    iput-object v0, p0, Lcom/appboy/Appboy;->mTestUserDeviceLoggingManager:Lbo/app/w5;

    invoke-static {v0}, Lk20;->u(Lbo/app/w5;)V

    invoke-static {p1}, Lcom/appboy/Appboy;->getSdkEnablementProvider(Landroid/content/Context;)Lbo/app/v4;

    move-result-object v0

    invoke-virtual {v0}, Lbo/app/v4;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v1}, Lcom/appboy/Appboy;->setOutboundNetworkRequestsOffline(Z)V

    :cond_0
    new-instance v0, Lbo/app/k0;

    iget-object v1, p0, Lcom/appboy/Appboy;->mApplicationContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lbo/app/k0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/appboy/Appboy;->mDeviceIdReader:Lbo/app/d2;

    new-instance v0, Lbo/app/q3;

    iget-object v1, p0, Lcom/appboy/Appboy;->mApplicationContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lbo/app/q3;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/appboy/Appboy;->mOfflineUserStorageProvider:Lbo/app/q3;

    new-instance v0, Lbo/app/h4;

    iget-object v1, p0, Lcom/appboy/Appboy;->mApplicationContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/appboy/Appboy;->mConfigurationProvider:LX10;

    invoke-direct {v0, v1, v2}, Lbo/app/h4;-><init>(Landroid/content/Context;LX10;)V

    iput-object v0, p0, Lcom/appboy/Appboy;->mRegistrationDataProvider:Lbo/app/j2;

    iget-object v0, p0, Lcom/appboy/Appboy;->mConfigurationProvider:LX10;

    invoke-virtual {v0}, LX10;->getCustomEndpoint()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LjS5;->g(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/appboy/Appboy;->mConfigurationProvider:LX10;

    invoke-virtual {v0}, LX10;->getCustomEndpoint()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appboy/Appboy;->setConfiguredCustomEndpoint(Ljava/lang/String;)V

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mConfigurationProvider:LX10;

    invoke-virtual {v0}, LX10;->isFirebaseCloudMessagingRegistrationEnabled()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lbo/app/h1;

    iget-object v1, p0, Lcom/appboy/Appboy;->mRegistrationDataProvider:Lbo/app/j2;

    invoke-direct {v0, p1, v1}, Lbo/app/h1;-><init>(Landroid/content/Context;Lbo/app/j2;)V

    invoke-virtual {v0}, Lbo/app/h1;->a()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging."

    invoke-static {p1, v1}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/appboy/Appboy;->mConfigurationProvider:LX10;

    invoke-virtual {v1}, LX10;->getFirebaseCloudMessagingSenderIdKey()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0, v1}, Lbo/app/h1;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string v0, "Firebase Cloud Messaging sender ID was null. Not registering."

    invoke-static {p1, v0}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    sget-object p1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v0, "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging."

    invoke-static {p1, v0}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    sget-object p1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v0, "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging."

    invoke-static {p1, v0}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lcom/appboy/Appboy;->mConfigurationProvider:LX10;

    invoke-virtual {p1}, LX10;->isAdmMessagingRegistrationEnabled()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/appboy/Appboy;->mApplicationContext:Landroid/content/Context;

    invoke-static {p1}, Lbo/app/b;->a(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v0, "Amazon Device Messaging found. Setting up Amazon Device Messaging"

    invoke-static {p1, v0}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lbo/app/b;

    iget-object v0, p0, Lcom/appboy/Appboy;->mApplicationContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/appboy/Appboy;->mRegistrationDataProvider:Lbo/app/j2;

    invoke-direct {p1, v0, v1}, Lbo/app/b;-><init>(Landroid/content/Context;Lbo/app/j2;)V

    invoke-virtual {p1}, Lbo/app/b;->a()V

    goto :goto_1

    :cond_5
    sget-object p1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v0, "ADM manifest requirements not met. Braze will not register for ADM."

    invoke-static {p1, v0}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    sget-object p1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v0, "Automatic ADM registration not enabled in configuration. Braze will not register for ADM."

    invoke-static {p1, v0}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    invoke-direct {p0}, Lcom/appboy/Appboy;->verifyProperSdkSetup()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Failed to setup pre SDK tasks"

    invoke-static {v0, v1, p1}, Lk20;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    sget-object p1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v0, "Starting up a new user dependency manager"

    invoke-static {p1, v0}, Lk20;->w(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    new-instance p1, Lbo/app/q6;

    iget-object v2, p0, Lcom/appboy/Appboy;->mApplicationContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/appboy/Appboy;->mOfflineUserStorageProvider:Lbo/app/q3;

    iget-object v4, p0, Lcom/appboy/Appboy;->mConfigurationProvider:LX10;

    iget-object v5, p0, Lcom/appboy/Appboy;->mExternalIEventMessenger:Lbo/app/g2;

    iget-object v6, p0, Lcom/appboy/Appboy;->mDeviceIdReader:Lbo/app/d2;

    iget-object v7, p0, Lcom/appboy/Appboy;->mRegistrationDataProvider:Lbo/app/j2;

    sget-boolean v8, Lcom/appboy/Appboy;->sMockNetworkRequestsAndDropEvents:Z

    sget-boolean v9, Lcom/appboy/Appboy;->sOutboundNetworkRequestsOffline:Z

    iget-object v10, p0, Lcom/appboy/Appboy;->mTestUserDeviceLoggingManager:Lbo/app/w5;

    move-object v1, p1

    invoke-direct/range {v1 .. v10}, Lbo/app/q6;-><init>(Landroid/content/Context;Lbo/app/q3;LX10;Lbo/app/g2;Lbo/app/d2;Lbo/app/j2;ZZLbo/app/w5;)V

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->setUserSpecificMemberVariablesAndStartDispatch(Lbo/app/q6;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception p1

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Failed to startup user dependency manager."

    invoke-static {v0, v1, p1}, Lk20;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method

.method private synthetic lambda$openSession$1(Landroid/app/Activity;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    sget-object p1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v0, "Cannot open session with null activity."

    invoke-static {p1, v0}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    invoke-interface {v0, p1}, Lbo/app/y1;->openSession(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Failed to open session."

    invoke-static {v0, v1, p1}, Lk20;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$recordGeofenceTransition$28(Ljava/lang/String;Lbo/app/l1;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeGeofenceManager:Lbo/app/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeGeofenceManager:Lbo/app/l;

    invoke-virtual {v0, p1, p2}, Lbo/app/l;->b(Ljava/lang/String;Lbo/app/l1;)V

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string p2, "Geofence manager was null. Not posting geofence report"

    invoke-static {p1, p2}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object p2, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v0, "Failed to post geofence report."

    invoke-static {p2, v0, p1}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$registerPushToken$17(Ljava/lang/String;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mRegistrationDataProvider:Lbo/app/j2;

    invoke-interface {v0, p1}, Lbo/app/j2;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/appboy/Appboy;->requestImmediateDataFlush()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to set the push token "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v0}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, v0}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$requestContentCardsRefresh$12(Z)V
    .locals 5

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mExternalIEventMessenger:Lbo/app/g2;

    iget-object v1, p0, Lcom/appboy/Appboy;->mContentCardsStorageProvider:Lbo/app/y;

    invoke-virtual {v1}, Lbo/app/y;->b()LfA0;

    move-result-object v1

    const-class v2, LfA0;

    invoke-interface {v0, v1, v2}, Lbo/app/g2;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mServerConfigStorageProvider:Lbo/app/a5;

    invoke-virtual {v0}, Lbo/app/a5;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    iget-object v1, p0, Lcom/appboy/Appboy;->mContentCardsStorageProvider:Lbo/app/y;

    invoke-virtual {v1}, Lbo/app/y;->e()J

    move-result-wide v1

    iget-object v3, p0, Lcom/appboy/Appboy;->mContentCardsStorageProvider:Lbo/app/y;

    invoke-virtual {v3}, Lbo/app/y;->f()J

    move-result-wide v3

    invoke-interface {v0, v1, v2, v3, v4}, Lbo/app/y1;->a(JJ)V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Content Cards is not enabled, skipping API call to refresh"

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to request Content Cards refresh. Requesting from cache: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v0}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, v0}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$requestFeedRefresh$11()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    new-instance v1, Lbo/app/v3$a;

    invoke-direct {v1}, Lbo/app/v3$a;-><init>()V

    invoke-virtual {v1}, Lbo/app/v3$a;->b()Lbo/app/v3$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lbo/app/y1;->a(Lbo/app/v3$a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v2, "Failed to request refresh of feed."

    invoke-static {v1, v2, v0}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, v0}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$requestFeedRefreshFromCache$10()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mExternalIEventMessenger:Lbo/app/g2;

    iget-object v1, p0, Lcom/appboy/Appboy;->mFeedStorageProvider:Lbo/app/g1;

    invoke-virtual {v1}, Lbo/app/g1;->a()Lcom/appboy/events/FeedUpdatedEvent;

    move-result-object v1

    const-class v2, Lcom/appboy/events/FeedUpdatedEvent;

    invoke-interface {v0, v1, v2}, Lbo/app/g2;->a(Ljava/lang/Object;Ljava/lang/Class;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v2, "Failed to retrieve and publish feed from offline cache."

    invoke-static {v1, v2, v0}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$requestGeofenceRefresh$29(Lbo/app/x1;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeGeofenceManager:Lbo/app/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeGeofenceManager:Lbo/app/l;

    invoke-virtual {v0, p1}, Lbo/app/l;->a(Lbo/app/x1;)V

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v0, "Geofence manager was null. Not requesting geofence refresh."

    invoke-static {p1, v0}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Failed to request geofence refresh."

    invoke-static {v0, v1, p1}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$requestGeofenceRefresh$30(Z)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeGeofenceManager:Lbo/app/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeGeofenceManager:Lbo/app/l;

    invoke-virtual {v0, p1}, Lbo/app/l;->b(Z)V

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Geofence manager was null. Not requesting geofence refresh."

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to request geofence refresh with rate limit ignore: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v0}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, v0}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$requestGeofencesInitialization$33()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeGeofenceManager:Lbo/app/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeGeofenceManager:Lbo/app/l;

    invoke-virtual {v0}, Lbo/app/l;->b()V

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Geofence manager was null. Not initializing geofences."

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v2, "Failed to initialize geofences with the geofence manager."

    invoke-static {v1, v2, v0}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, v0}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$requestImmediateDataFlush$13()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    invoke-interface {v0}, Lbo/app/y1;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v2, "Failed to request data flush."

    invoke-static {v1, v2, v0}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, v0}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$requestSingleLocationUpdate$34()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mLocationManager:Lbo/app/i2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/appboy/Appboy;->mLocationManager:Lbo/app/i2;

    invoke-interface {v0}, Lbo/app/i2;->a()Z

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Location manager was null. Not requesting single location update."

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v2, "Failed to request single location update"

    invoke-static {v1, v2, v0}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, v0}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$retryInAppMessage$36(LlZ1;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mTriggerManager:Lbo/app/g6;

    invoke-virtual {p1}, LlZ1;->c()Lbo/app/t2;

    move-result-object v1

    invoke-virtual {p1}, LlZ1;->b()Lbo/app/y2;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbo/app/g6;->a(Lbo/app/t2;Lbo/app/y2;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error retrying In-App Message from event "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v0}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$setAppboyManagerAndSyncPolicyOffline$38(Z)V
    .locals 3

    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    invoke-interface {v0, p1}, Lbo/app/y1;->a(Z)V

    iget-object v0, p0, Lcom/appboy/Appboy;->mDependencyProvider:Lbo/app/q6;

    invoke-virtual {v0}, Lbo/app/q6;->e()Lbo/app/f0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lbo/app/f0;->a(Z)V

    iget-object v0, p0, Lcom/appboy/Appboy;->mImageLoader:LeO1;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Setting the image loader deny network downloads to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appboy/Appboy;->mImageLoader:LeO1;

    invoke-interface {v0, p1}, LeO1;->d(Z)V

    :cond_0
    return-void
.end method

.method private static synthetic lambda$setConfiguredCustomEndpoint$39(Ljava/lang/String;Landroid/net/Uri;)Landroid/net/Uri;
    .locals 3

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Landroid/net/Uri;->getEncodedAuthority()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-static {v1}, LjS5;->g(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0}, LjS5;->g(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/net/Uri$Builder;->encodedAuthority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    invoke-virtual {p1, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    invoke-virtual {p1, p0}, Landroid/net/Uri$Builder;->encodedAuthority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/appboy/Appboy;)V
    .locals 0

    invoke-direct {p0}, Lcom/appboy/Appboy;->lambda$logFeedDisplayed$9()V

    return-void
.end method

.method public static synthetic n(Lcom/appboy/Appboy;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILs20;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/appboy/Appboy;->lambda$logPurchase$4(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILs20;)V

    return-void
.end method

.method public static synthetic o(Lcom/appboy/Appboy;Ljava/lang/String;Lbo/app/l1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/appboy/Appboy;->lambda$recordGeofenceTransition$28(Ljava/lang/String;Lbo/app/l1;)V

    return-void
.end method

.method public static synthetic p(Lcom/appboy/Appboy;Lbo/app/x1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->lambda$logLocationRecordedEventFromLocationUpdate$32(Lbo/app/x1;)V

    return-void
.end method

.method private publishError(Ljava/lang/Throwable;)V
    .locals 4

    iget-object v0, p0, Lcom/appboy/Appboy;->mErrorPublisher:Lbo/app/g2;

    if-nez v0, :cond_0

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Cannot publish error on null publisher. This is usually the result of a missing API key."

    invoke-static {v0, v1, p1}, Lk20;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mErrorPublisher:Lbo/app/g2;

    const-class v1, Ljava/lang/Throwable;

    invoke-interface {v0, p1, v1}, Lbo/app/g2;->a(Ljava/lang/Object;Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to log throwable: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v0}, Lk20;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static synthetic q(Lcom/appboy/Appboy;Ljava/lang/String;Ls20;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/appboy/Appboy;->lambda$logCustomEvent$3(Ljava/lang/String;Ls20;)V

    return-void
.end method

.method public static synthetic r(Lcom/appboy/Appboy;)V
    .locals 0

    invoke-direct {p0}, Lcom/appboy/Appboy;->lambda$requestGeofencesInitialization$33()V

    return-void
.end method

.method public static requestTriggersIfInAppMessageTestPush(Landroid/content/Intent;Lbo/app/y1;)V
    .locals 1

    if-nez p1, :cond_0

    sget-object p0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string p1, "Triggers requested for test in-app message with null AppboyManager. Doing nothing."

    invoke-static {p0, p1}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "ab_push_fetch_test_triggers_key"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string v0, "true"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v0, "Push contained key for fetching test triggers, fetching triggers."

    invoke-static {p0, v0}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Lbo/app/v3$a;

    invoke-direct {p0}, Lbo/app/v3$a;-><init>()V

    invoke-virtual {p0}, Lbo/app/v3$a;->c()Lbo/app/v3$a;

    move-result-object p0

    invoke-interface {p1, p0}, Lbo/app/y1;->a(Lbo/app/v3$a;)V

    :cond_1
    return-void
.end method

.method public static synthetic s(Lcom/appboy/Appboy;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->lambda$registerPushToken$17(Ljava/lang/String;)V

    return-void
.end method

.method public static setConfiguredCustomEndpoint(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/appboy/Appboy;->sBrazeEndpointProviderLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, LJl;

    invoke-direct {v1, p0}, LJl;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/appboy/Appboy;->setEndpointProvider(Lcom/appboy/IBrazeEndpointProvider;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static setEndpointProvider(Lcom/appboy/IBrazeEndpointProvider;)V
    .locals 1

    sget-object v0, Lcom/appboy/Appboy;->sBrazeEndpointProviderLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sput-object p0, Lcom/appboy/Appboy;->sEndpointProvider:Lcom/appboy/IBrazeEndpointProvider;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static setOutboundNetworkRequestsOffline(Z)V
    .locals 3

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Braze SDK outbound network requests are now "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p0, :cond_0

    const-string v2, "disabled"

    goto :goto_0

    :cond_0
    const-string v2, "enabled"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    const-class v0, Lcom/appboy/Appboy;

    monitor-enter v0

    :try_start_0
    sput-boolean p0, Lcom/appboy/Appboy;->sOutboundNetworkRequestsOffline:Z

    sget-object v1, Lcom/appboy/Appboy;->sInstance:LP10;

    if-eqz v1, :cond_1

    sget-object v1, Lcom/appboy/Appboy;->sInstance:LP10;

    invoke-virtual {v1, p0}, Lcom/appboy/Appboy;->setAppboyManagerAndSyncPolicyOffline(Z)V

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private setUserSpecificMemberVariablesAndStartDispatch(Lbo/app/q6;)V
    .locals 7

    iput-object p1, p0, Lcom/appboy/Appboy;->mDependencyProvider:Lbo/app/q6;

    invoke-virtual {p1}, Lbo/app/q6;->c()Lbo/app/p;

    move-result-object v0

    iput-object v0, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    invoke-virtual {p1}, Lbo/app/q6;->m()Lbo/app/a5;

    move-result-object v0

    iput-object v0, p0, Lcom/appboy/Appboy;->mServerConfigStorageProvider:Lbo/app/a5;

    invoke-virtual {p1}, Lbo/app/q6;->n()Lbo/app/g6;

    move-result-object v0

    iput-object v0, p0, Lcom/appboy/Appboy;->mTriggerManager:Lbo/app/g6;

    invoke-virtual {p1}, Lbo/app/q6;->k()Lbo/app/l;

    move-result-object v0

    iput-object v0, p0, Lcom/appboy/Appboy;->mBrazeGeofenceManager:Lbo/app/l;

    invoke-virtual {p1}, Lbo/app/q6;->d()Lbo/app/y;

    move-result-object v0

    iput-object v0, p0, Lcom/appboy/Appboy;->mContentCardsStorageProvider:Lbo/app/y;

    invoke-virtual {p1}, Lbo/app/q6;->b()Lbo/app/o;

    move-result-object v0

    iput-object v0, p0, Lcom/appboy/Appboy;->mLocationManager:Lbo/app/i2;

    invoke-virtual {p1}, Lbo/app/q6;->f()Lbo/app/c2;

    move-result-object v0

    iput-object v0, p0, Lcom/appboy/Appboy;->mDeviceDataProvider:Lbo/app/c2;

    invoke-virtual {p1}, Lbo/app/q6;->l()Lbo/app/u4;

    move-result-object v0

    iput-object v0, p0, Lcom/appboy/Appboy;->mSdkAuthenticationCache:Lbo/app/u4;

    new-instance v0, Lv20;

    invoke-virtual {p1}, Lbo/app/q6;->o()Lbo/app/p6;

    move-result-object v2

    iget-object v3, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    iget-object v1, p0, Lcom/appboy/Appboy;->mOfflineUserStorageProvider:Lbo/app/q3;

    invoke-virtual {v1}, Lbo/app/q3;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lbo/app/q6;->b()Lbo/app/o;

    move-result-object v5

    iget-object v6, p0, Lcom/appboy/Appboy;->mServerConfigStorageProvider:Lbo/app/a5;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lv20;-><init>(Lbo/app/p6;Lbo/app/y1;Ljava/lang/String;Lbo/app/i2;Lbo/app/a5;)V

    iput-object v0, p0, Lcom/appboy/Appboy;->mBrazeUser:Lv20;

    invoke-virtual {p1}, Lbo/app/q6;->g()Lbo/app/z0;

    move-result-object v0

    invoke-virtual {p1}, Lbo/app/q6;->h()Lbo/app/a1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbo/app/z0;->a(Lbo/app/g2;)V

    invoke-virtual {p1}, Lbo/app/q6;->a()Lbo/app/f;

    move-result-object v0

    invoke-virtual {v0}, Lbo/app/f;->d()V

    invoke-virtual {p1}, Lbo/app/q6;->h()Lbo/app/a1;

    move-result-object v0

    iput-object v0, p0, Lcom/appboy/Appboy;->mErrorPublisher:Lbo/app/g2;

    iget-object v0, p0, Lcom/appboy/Appboy;->mUncaughtUserDependencyExceptionHandler:Lbo/app/x0;

    iget-object v1, p0, Lcom/appboy/Appboy;->mErrorPublisher:Lbo/app/g2;

    invoke-virtual {v0, v1}, Lbo/app/x0;->a(Lbo/app/g2;)V

    invoke-virtual {p1}, Lbo/app/q6;->j()Lbo/app/g1;

    move-result-object v0

    iput-object v0, p0, Lcom/appboy/Appboy;->mFeedStorageProvider:Lbo/app/g1;

    invoke-virtual {p1}, Lbo/app/q6;->n()Lbo/app/g6;

    move-result-object v0

    iput-object v0, p0, Lcom/appboy/Appboy;->mTriggerManager:Lbo/app/g6;

    invoke-virtual {p1}, Lbo/app/q6;->i()Lbo/app/c1;

    move-result-object v0

    invoke-virtual {p1}, Lbo/app/q6;->a()Lbo/app/f;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbo/app/c1;->a(Lbo/app/e2;)V

    iget-object p1, p0, Lcom/appboy/Appboy;->mTestUserDeviceLoggingManager:Lbo/app/w5;

    iget-object v0, p0, Lcom/appboy/Appboy;->mBrazeManager:Lbo/app/y1;

    invoke-virtual {p1, v0}, Lbo/app/w5;->a(Lbo/app/y1;)V

    iget-object p1, p0, Lcom/appboy/Appboy;->mTestUserDeviceLoggingManager:Lbo/app/w5;

    iget-object v0, p0, Lcom/appboy/Appboy;->mServerConfigStorageProvider:Lbo/app/a5;

    invoke-virtual {v0}, Lbo/app/a5;->o()Z

    move-result v0

    invoke-virtual {p1, v0}, Lbo/app/w5;->a(Z)V

    return-void
.end method

.method public static shouldAllowSingletonInitialization()Z
    .locals 3

    sget-object v0, Lcom/appboy/Appboy;->sInstance:LP10;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v2, "The instance is null. Allowing instance initialization"

    invoke-static {v0, v2}, Lk20;->w(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    sget-object v0, Lcom/appboy/Appboy;->sInstance:LP10;

    iget-boolean v0, v0, Lcom/appboy/Appboy;->mIsInstanceStopped:Z

    if-eqz v0, :cond_1

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v2, "The instance was stopped. Allowing instance initialization"

    invoke-static {v0, v2}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v2, Lcom/appboy/Appboy;->sInstance:LP10;

    iget-object v2, v2, Lcom/appboy/Appboy;->mIsApiKeyPresent:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v2, "No API key was found previously. Allowing instance initialization"

    invoke-static {v0, v2}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic t(Lcom/appboy/Appboy;LlZ1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->lambda$retryInAppMessage$36(LlZ1;)V

    return-void
.end method

.method public static synthetic u(Lcom/appboy/Appboy;)V
    .locals 0

    invoke-direct {p0}, Lcom/appboy/Appboy;->lambda$requestImmediateDataFlush$13()V

    return-void
.end method

.method public static synthetic v(Lcom/appboy/Appboy;)V
    .locals 0

    invoke-direct {p0}, Lcom/appboy/Appboy;->lambda$requestFeedRefreshFromCache$10()V

    return-void
.end method

.method private verifyProperSdkSetup()V
    .locals 6

    sget-object v0, Lcom/appboy/Appboy;->NECESSARY_APPBOY_SDK_PERMISSIONS:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v4, p0, Lcom/appboy/Appboy;->mApplicationContext:Landroid/content/Context;

    invoke-static {v4, v2}, LdR3;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "The Braze SDK requires the permission "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ". Check your AndroidManifest."

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    move v1, v3

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/appboy/Appboy;->mConfigurationProvider:LX10;

    invoke-virtual {v0}, LX10;->getBrazeApiKey()Lbo/app/i;

    move-result-object v0

    invoke-virtual {v0}, Lbo/app/i;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "The Braze SDK requires a non-empty API key. Check your braze.xml or BrazeConfig."

    invoke-static {v0, v1}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    move v1, v3

    :cond_2
    if-nez v1, :cond_3

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/docs/developer_guide/platform_integration_guides/android/initial_sdk_setup/android_sdk_integration/"

    invoke-static {v0, v1}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public static synthetic w(Lcom/appboy/Appboy;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->lambda$requestContentCardsRefresh$12(Z)V

    return-void
.end method

.method public static synthetic x(Lcom/appboy/Appboy;Lbo/app/x1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->lambda$requestGeofenceRefresh$29(Lbo/app/x1;)V

    return-void
.end method

.method public static synthetic y(Lcom/appboy/Appboy;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->lambda$new$0(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic z(Lcom/appboy/Appboy;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->lambda$openSession$1(Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public addSerializedCardJsonToStorage(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, LjS5;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot add null or blank card json to storage. Returning. User id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " Serialized json: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, LTl;

    invoke-direct {v1, p0, p1, p2}, LTl;-><init>(Lcom/appboy/Appboy;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public addSingleSynchronousSubscription(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/appboy/events/IEventSubscriber<",
            "TT;>;",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mExternalIEventMessenger:Lbo/app/g2;

    invoke-interface {v0, p1, p2}, Lbo/app/g2;->b(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to add synchronous subscriber for class: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2, p1}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public applyPendingRuntimeConfiguration()V
    .locals 6

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Applying any pending runtime configuration values"

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lgd5;

    iget-object v1, p0, Lcom/appboy/Appboy;->mApplicationContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lgd5;-><init>(Landroid/content/Context;)V

    sget-object v1, Lcom/appboy/Appboy;->sPendingConfigurations:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LU10;

    sget-object v3, Lcom/appboy/Appboy;->sClearConfigSentinel:LU10;

    if-ne v2, v3, :cond_0

    sget-object v2, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v3, "Clearing config values"

    invoke-static {v2, v3}, Lk20;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lgd5;->b()V

    goto :goto_0

    :cond_0
    sget-object v3, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Setting pending config object: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lk20;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lgd5;->n(LU10;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/appboy/Appboy;->sPendingConfigurations:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public changeUser(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/appboy/Appboy;->changeUser(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public changeUser(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, LCl;

    invoke-direct {v1, p0, p1, p2}, LCl;-><init>(Lcom/appboy/Appboy;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public closeSession(Landroid/app/Activity;)V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, LRl;

    invoke-direct {v1, p0, p1}, LRl;-><init>(Lcom/appboy/Appboy;Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getCurrentUser(Lcom/appboy/events/IValueCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appboy/events/IValueCallback<",
            "Lv20;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/appboy/events/IValueCallback;->onError()V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, LEl;

    invoke-direct {v1, p0, p1}, LEl;-><init>(Lcom/appboy/Appboy;Lcom/appboy/events/IValueCallback;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v2, "Failed to retrieve the current user."

    invoke-static {v1, v2, v0}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p1}, Lcom/appboy/events/IValueCallback;->onError()V

    invoke-direct {p0, v0}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public getImageLoader()LeO1;
    .locals 2

    iget-object v0, p0, Lcom/appboy/Appboy;->mImageLoader:LeO1;

    if-nez v0, :cond_0

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "The Image Loader was null. Creating a new Image Loader and returning it."

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LuW0;

    iget-object v1, p0, Lcom/appboy/Appboy;->mApplicationContext:Landroid/content/Context;

    invoke-direct {v0, v1}, LuW0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/appboy/Appboy;->mImageLoader:LeO1;

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mImageLoader:LeO1;

    return-object v0
.end method

.method public handleInAppMessageTestPush(Landroid/content/Intent;)V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, LNl;

    invoke-direct {v1, p0, p1}, LNl;-><init>(Lcom/appboy/Appboy;Landroid/content/Intent;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public logCustomEvent(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/appboy/Appboy;->logCustomEvent(Ljava/lang/String;Ls20;)V

    return-void
.end method

.method public logCustomEvent(Ljava/lang/String;Ls20;)V
    .locals 3

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    :try_start_0
    invoke-virtual {p2}, Ls20;->e()Ls20;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to log custom event: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p2}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p2}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    const/4 p2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, Ltl;

    invoke-direct {v1, p0, p1, p2}, Ltl;-><init>(Lcom/appboy/Appboy;Ljava/lang/String;Ls20;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public logFeedDisplayed()V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, Lxl;

    invoke-direct {v1, p0}, Lxl;-><init>(Lcom/appboy/Appboy;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public logLocationRecordedEventFromLocationUpdate(Lbo/app/x1;)V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, LHl;

    invoke-direct {v1, p0, p1}, LHl;-><init>(Lcom/appboy/Appboy;Lbo/app/x1;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public logPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILs20;)V
    .locals 8

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p5, :cond_1

    :try_start_0
    invoke-virtual {p5}, Ls20;->e()Ls20;

    move-result-object p5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    sget-object p3, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "Failed to log purchase event of "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1, p2}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p2}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    const/4 p5, 0x0

    :goto_0
    move-object v6, p5

    iget-object p5, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v7, LIl;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v6}, LIl;-><init>(Lcom/appboy/Appboy;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILs20;)V

    invoke-virtual {p5, v7}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public logPushNotificationActionClicked(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, LSl;

    invoke-direct {v1, p0, p1, p2, p3}, LSl;-><init>(Lcom/appboy/Appboy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public logPushNotificationOpened(Landroid/content/Intent;)V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, LPl;

    invoke-direct {v1, p0, p1}, LPl;-><init>(Lcom/appboy/Appboy;Landroid/content/Intent;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public logPushStoryPageClicked(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, Lwl;

    invoke-direct {v1, p0, p1, p2}, Lwl;-><init>(Lcom/appboy/Appboy;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public openSession(Landroid/app/Activity;)V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, LMl;

    invoke-direct {v1, p0, p1}, LMl;-><init>(Lcom/appboy/Appboy;Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public recordGeofenceTransition(Ljava/lang/String;Lbo/app/l1;)V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, LBl;

    invoke-direct {v1, p0, p1, p2}, LBl;-><init>(Lcom/appboy/Appboy;Ljava/lang/String;Lbo/app/l1;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public registerPushToken(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, LjS5;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v0, "Push token must not be null or blank. Not registering for push with Braze."

    invoke-static {p1, v0}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Push token "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " registered and immediately being flushed."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, LOl;

    invoke-direct {v1, p0, p1}, LOl;-><init>(Lcom/appboy/Appboy;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public removeSingleSubscription(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/appboy/events/IEventSubscriber<",
            "TT;>;",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mExternalIEventMessenger:Lbo/app/g2;

    invoke-interface {v0, p1, p2}, Lbo/app/g2;->c(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to remove "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " subscriber."

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2, p1}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public requestContentCardsRefresh(Z)V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, Lul;

    invoke-direct {v1, p0, p1}, Lul;-><init>(Lcom/appboy/Appboy;Z)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public requestFeedRefresh()V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, LFl;

    invoke-direct {v1, p0}, LFl;-><init>(Lcom/appboy/Appboy;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public requestFeedRefreshFromCache()V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, Lzl;

    invoke-direct {v1, p0}, Lzl;-><init>(Lcom/appboy/Appboy;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public requestGeofenceRefresh(Lbo/app/x1;)V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, LAl;

    invoke-direct {v1, p0, p1}, LAl;-><init>(Lcom/appboy/Appboy;Lbo/app/x1;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public requestGeofenceRefresh(Z)V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, Lvl;

    invoke-direct {v1, p0, p1}, Lvl;-><init>(Lcom/appboy/Appboy;Z)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public requestGeofencesInitialization()V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, LKl;

    invoke-direct {v1, p0}, LKl;-><init>(Lcom/appboy/Appboy;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public requestImmediateDataFlush()V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, LGl;

    invoke-direct {v1, p0}, LGl;-><init>(Lcom/appboy/Appboy;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public requestLocationInitialization()V
    .locals 2

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Location permissions were granted. Requesting geofence and location initialization."

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/appboy/Appboy;->requestGeofencesInitialization()V

    invoke-virtual {p0}, Lcom/appboy/Appboy;->requestSingleLocationUpdate()V

    return-void
.end method

.method public requestSingleLocationUpdate()V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, LLl;

    invoke-direct {v1, p0}, LLl;-><init>(Lcom/appboy/Appboy;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public retryInAppMessage(LlZ1;)V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, Lyl;

    invoke-direct {v1, p0, p1}, Lyl;-><init>(Lcom/appboy/Appboy;LlZ1;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setAppboyManagerAndSyncPolicyOffline(Z)V
    .locals 2

    invoke-static {}, Lcom/appboy/Appboy;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mUserDependencyExecutor:Lbo/app/x4;

    new-instance v1, LDl;

    invoke-direct {v1, p0, p1}, LDl;-><init>(Lcom/appboy/Appboy;Z)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public subscribeToContentCardsUpdates(Lcom/appboy/events/IEventSubscriber;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appboy/events/IEventSubscriber<",
            "LfA0;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mExternalIEventMessenger:Lbo/app/g2;

    const-class v1, LfA0;

    invoke-interface {v0, p1, v1}, Lbo/app/g2;->a(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Failed to add subscriber for Content Cards updates."

    invoke-static {v0, v1, p1}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public subscribeToFeedUpdates(Lcom/appboy/events/IEventSubscriber;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appboy/events/IEventSubscriber<",
            "Lcom/appboy/events/FeedUpdatedEvent;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mExternalIEventMessenger:Lbo/app/g2;

    const-class v1, Lcom/appboy/events/FeedUpdatedEvent;

    invoke-interface {v0, p1, v1}, Lbo/app/g2;->a(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Failed to add subscriber for feed updates."

    invoke-static {v0, v1, p1}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public subscribeToNewInAppMessages(Lcom/appboy/events/IEventSubscriber;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appboy/events/IEventSubscriber<",
            "LlZ1;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/appboy/Appboy;->mExternalIEventMessenger:Lbo/app/g2;

    const-class v1, LlZ1;

    invoke-interface {v0, p1, v1}, Lbo/app/g2;->a(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lcom/appboy/Appboy;->TAG:Ljava/lang/String;

    const-string v1, "Failed to add subscriber to new in-app messages."

    invoke-static {v0, v1, p1}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p1}, Lcom/appboy/Appboy;->publishError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
