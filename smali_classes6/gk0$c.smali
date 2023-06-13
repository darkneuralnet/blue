.class public abstract Lgk0$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgk0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Landroid/bluetooth/BluetoothAdapter;
    .locals 1

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static b()Lio/reactivex/E;
    .locals 1

    new-instance v0, Lze5;

    invoke-direct {v0}, Lze5;-><init>()V

    invoke-static {v0}, Lio/reactivex/plugins/a;->e(Ljava/util/concurrent/ThreadFactory;)Lio/reactivex/E;

    move-result-object v0

    return-object v0
.end method

.method public static c()Ljava/util/concurrent/ExecutorService;
    .locals 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/util/concurrent/ExecutorService;)Lio/reactivex/E;
    .locals 0

    invoke-static {p0}, Lio/reactivex/schedulers/a;->b(Ljava/util/concurrent/Executor;)Lio/reactivex/E;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroid/content/Context;)Landroid/bluetooth/BluetoothManager;
    .locals 1

    const-string v0, "bluetooth"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/bluetooth/BluetoothManager;

    return-object p0
.end method

.method public static f()Lio/reactivex/E;
    .locals 1

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    return-object v0
.end method

.method public static g()Ljava/util/concurrent/ExecutorService;
    .locals 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static h(Landroid/content/Context;)Landroid/content/ContentResolver;
    .locals 0

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    return-object p0
.end method

.method public static i()I
    .locals 1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    return v0
.end method

.method public static j()[B
    .locals 1

    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->DISABLE_NOTIFICATION_VALUE:[B

    return-object v0
.end method

.method public static k()[B
    .locals 1

    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_INDICATION_VALUE:[B

    return-object v0
.end method

.method public static l()[B
    .locals 1

    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_NOTIFICATION_VALUE:[B

    return-object v0
.end method

.method public static m(Ljava/util/concurrent/ExecutorService;Lio/reactivex/E;Ljava/util/concurrent/ExecutorService;)Lgk0$b;
    .locals 1

    new-instance v0, Lgk0$c$a;

    invoke-direct {v0, p0, p1, p2}, Lgk0$c$a;-><init>(Ljava/util/concurrent/ExecutorService;Lio/reactivex/E;Ljava/util/concurrent/ExecutorService;)V

    return-object v0
.end method

.method public static n(Landroid/content/Context;I)Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    const/16 v0, 0x14

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string p1, "android.hardware.type.watch"

    invoke-virtual {p0, p1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static o(ILZ94;LZ94;)LZ92;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LZ94<",
            "Laa2;",
            ">;",
            "LZ94<",
            "Lda2;",
            ">;)",
            "LZ92;"
        }
    .end annotation

    const/16 v0, 0x1a

    if-ge p0, v0, :cond_0

    invoke-interface {p1}, LZ94;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LZ92;

    return-object p0

    :cond_0
    invoke-interface {p2}, LZ94;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LZ92;

    return-object p0
.end method

.method public static p(Landroid/content/Context;)Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v2, 0x1000

    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    move v1, v0

    :goto_0
    iget-object v2, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    array-length v3, v2

    if-ge v1, v3, :cond_2

    const-string v3, "android.permission.BLUETOOTH_SCAN"

    aget-object v2, v2, v1

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    aget p0, p0, v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/high16 v1, 0x10000

    and-int/2addr p0, v1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0

    :catch_0
    move-exception p0

    const-string v1, "Could not find application PackageInfo"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, Lye5;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    return v0
.end method

.method public static q(Landroid/content/Context;)Landroid/location/LocationManager;
    .locals 1

    const-string v0, "location"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/location/LocationManager;

    return-object p0
.end method

.method public static r(ILKw2;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LKw2;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x17

    if-ge p0, v0, :cond_0

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0}, Lde3;->b(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LKw2;->a()Lio/reactivex/Observable;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static s(ILZ94;LZ94;LZ94;)LNw2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LZ94<",
            "LOw2;",
            ">;",
            "LZ94<",
            "LQw2;",
            ">;",
            "LZ94<",
            "LSw2;",
            ">;)",
            "LNw2;"
        }
    .end annotation

    const/16 v0, 0x17

    if-ge p0, v0, :cond_0

    invoke-interface {p1}, LZ94;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LNw2;

    return-object p0

    :cond_0
    const/16 p1, 0x1f

    if-ge p0, p1, :cond_1

    invoke-interface {p2}, LZ94;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LNw2;

    return-object p0

    :cond_1
    invoke-interface {p3}, LZ94;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LNw2;

    return-object p0
.end method

.method public static t(II)[[Ljava/lang/String;
    .locals 1

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    const/16 p1, 0x1f

    const/4 v0, 0x0

    if-ge p0, p1, :cond_0

    new-array p0, v0, [[Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 p0, 0x1

    new-array p0, p0, [[Ljava/lang/String;

    const-string p1, "android.permission.BLUETOOTH_CONNECT"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    aput-object p1, p0, v0

    return-object p0
.end method

.method public static u(IIZ)[[Ljava/lang/String;
    .locals 3

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    const/16 p1, 0x17

    const/4 v0, 0x0

    if-ge p0, p1, :cond_0

    new-array p0, v0, [[Ljava/lang/String;

    return-object p0

    :cond_0
    const/16 p1, 0x1d

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v2, 0x1

    if-ge p0, p1, :cond_1

    new-array p0, v2, [[Ljava/lang/String;

    const-string p1, "android.permission.ACCESS_COARSE_LOCATION"

    filled-new-array {p1, v1}, [Ljava/lang/String;

    move-result-object p1

    aput-object p1, p0, v0

    return-object p0

    :cond_1
    const/16 p1, 0x1f

    if-ge p0, p1, :cond_2

    new-array p0, v2, [[Ljava/lang/String;

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object p1

    aput-object p1, p0, v0

    return-object p0

    :cond_2
    const-string p0, "android.permission.BLUETOOTH_SCAN"

    if-eqz p2, :cond_3

    new-array p1, v2, [[Ljava/lang/String;

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    aput-object p0, p1, v0

    return-object p1

    :cond_3
    const/4 p1, 0x2

    new-array p1, p1, [[Ljava/lang/String;

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    aput-object p0, p1, v0

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object p0

    aput-object p0, p1, v2

    return-object p1
.end method

.method public static v(ILZ94;LZ94;)Luk5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LZ94<",
            "Lvk5;",
            ">;",
            "LZ94<",
            "Lxk5;",
            ">;)",
            "Luk5;"
        }
    .end annotation

    const/16 v0, 0x18

    if-ge p0, v0, :cond_0

    invoke-interface {p1}, LZ94;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Luk5;

    return-object p0

    :cond_0
    invoke-interface {p2}, LZ94;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Luk5;

    return-object p0
.end method

.method public static w(ILZ94;LZ94;LZ94;)Lcl5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LZ94<",
            "Ldl5;",
            ">;",
            "LZ94<",
            "Lfl5;",
            ">;",
            "LZ94<",
            "Lhl5;",
            ">;)",
            "Lcl5;"
        }
    .end annotation

    const/16 v0, 0x15

    if-ge p0, v0, :cond_0

    invoke-interface {p1}, LZ94;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcl5;

    return-object p0

    :cond_0
    const/16 p1, 0x17

    if-ge p0, p1, :cond_1

    invoke-interface {p2}, LZ94;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcl5;

    return-object p0

    :cond_1
    invoke-interface {p3}, LZ94;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcl5;

    return-object p0
.end method

.method public static x(Landroid/content/Context;)I
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    iget p0, p0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    const p0, 0x7fffffff

    return p0
.end method
