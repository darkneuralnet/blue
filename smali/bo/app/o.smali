.class public final Lbo/app/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbo/app/i2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbo/app/o$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0008\u0010\u0005\u001a\u00020\u0008H\u0017R\u0014\u0010\u000b\u001a\u00020\u00088BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0015"
    }
    d2 = {
        "Lbo/app/o;",
        "Lbo/app/i2;",
        "",
        "provider",
        "",
        "a",
        "Lbo/app/x1;",
        "location",
        "",
        "c",
        "()Z",
        "isLocationCollectionEnabled",
        "Landroid/content/Context;",
        "context",
        "Lbo/app/y1;",
        "brazeManager",
        "LX10;",
        "appConfigurationProvider",
        "<init>",
        "(Landroid/content/Context;Lbo/app/y1;LX10;)V",
        "b",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lbo/app/o$b;

.field private static final h:J


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lbo/app/y1;

.field private final c:LX10;

.field private final d:Lbo/app/x3;

.field private final e:Landroid/location/LocationManager;

.field private f:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lcom/appboy/enums/LocationProviderName;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbo/app/o$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbo/app/o$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbo/app/o;->g:Lbo/app/o$b;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lbo/app/o;->h:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lbo/app/y1;LX10;)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brazeManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appConfigurationProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbo/app/o;->a:Landroid/content/Context;

    iput-object p2, p0, Lbo/app/o;->b:Lbo/app/y1;

    iput-object p3, p0, Lbo/app/o;->c:LX10;

    new-instance p2, Lbo/app/x3;

    new-instance v0, Lbo/app/v0;

    invoke-direct {v0}, Lbo/app/v0;-><init>()V

    const-string v1, "braze_location_manager_parallel_executor_identifier"

    invoke-direct {p2, v1, v0}, Lbo/app/x3;-><init>(Ljava/lang/String;Ljava/util/concurrent/ThreadFactory;)V

    iput-object p2, p0, Lbo/app/o;->d:Lbo/app/x3;

    const-string p2, "location"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, Landroid/location/LocationManager;

    iput-object p1, p0, Lbo/app/o;->e:Landroid/location/LocationManager;

    sget-object p1, Lcom/appboy/enums/LocationProviderName;->PASSIVE:Lcom/appboy/enums/LocationProviderName;

    sget-object p2, Lcom/appboy/enums/LocationProviderName;->NETWORK:Lcom/appboy/enums/LocationProviderName;

    invoke-static {p1, p2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object p1

    iput-object p1, p0, Lbo/app/o;->f:Ljava/util/EnumSet;

    invoke-virtual {p3}, LX10;->getCustomLocationProviderNames()Ljava/util/EnumSet;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p3}, LX10;->getCustomLocationProviderNames()Ljava/util/EnumSet;

    move-result-object p1

    iput-object p1, p0, Lbo/app/o;->f:Ljava/util/EnumSet;

    sget-object v0, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->f:Lk20$a;

    new-instance v5, Lbo/app/o$a;

    invoke-direct {v5, p0}, Lbo/app/o$a;-><init>(Lbo/app/o;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type android.location.LocationManager"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic a(Lbo/app/o;)Ljava/util/EnumSet;
    .locals 0

    iget-object p0, p0, Lbo/app/o;->f:Ljava/util/EnumSet;

    return-object p0
.end method

.method private static final a(Lbo/app/o;Landroid/location/Location;)V
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lk20;->a:Lk20;

    new-instance v6, Lbo/app/o$k;

    invoke-direct {v6, p1}, Lbo/app/o$k;-><init>(Landroid/location/Location;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    if-eqz p1, :cond_0

    new-instance v0, Lbo/app/n;

    invoke-direct {v0, p1}, Lbo/app/n;-><init>(Landroid/location/Location;)V

    invoke-virtual {p0, v0}, Lbo/app/o;->a(Lbo/app/x1;)Z

    :cond_0
    return-void
.end method

.method private final a(Ljava/lang/String;)V
    .locals 4

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.appboy.action.receiver.SINGLE_LOCATION_UPDATE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lbo/app/o;->a:Landroid/content/Context;

    const-class v2, Lcom/braze/receivers/BrazeActionReceiver;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "Intent(Constants.BRAZE_A\u2026tionReceiver::class.java)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lb62;->c()I

    move-result v1

    const/high16 v2, 0x8000000

    or-int/2addr v1, v2

    iget-object v2, p0, Lbo/app/o;->a:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iget-object v1, p0, Lbo/app/o;->e:Landroid/location/LocationManager;

    invoke-virtual {v1, p1, v0}, Landroid/location/LocationManager;->requestSingleUpdate(Ljava/lang/String;Landroid/app/PendingIntent;)V

    return-void
.end method

.method public static final synthetic b()J
    .locals 2

    sget-wide v0, Lbo/app/o;->h:J

    return-wide v0
.end method

.method public static synthetic b(Lbo/app/o;Landroid/location/Location;)V
    .locals 0

    invoke-static {p0, p1}, Lbo/app/o;->a(Lbo/app/o;Landroid/location/Location;)V

    return-void
.end method

.method private final c()Z
    .locals 9

    iget-object v0, p0, Lbo/app/o;->c:LX10;

    invoke-virtual {v0}, LX10;->isLocationCollectionEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->d:Lk20$a;

    sget-object v6, Lbo/app/o$c;->b:Lbo/app/o$c;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->d:Lk20$a;

    sget-object v6, Lbo/app/o$d;->b:Lbo/app/o$d;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a()Z
    .locals 12

    invoke-direct {p0}, Lbo/app/o;->c()Z

    move-result v0

    const/4 v9, 0x0

    if-nez v0, :cond_0

    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->d:Lk20$a;

    sget-object v6, Lbo/app/o$f;->b:Lbo/app/o$f;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return v9

    :cond_0
    iget-object v0, p0, Lbo/app/o;->a:Landroid/content/Context;

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v0, v1}, LdR3;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    iget-object v1, p0, Lbo/app/o;->a:Landroid/content/Context;

    const-string v2, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v1, v2}, LdR3;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    if-nez v0, :cond_1

    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->d:Lk20$a;

    sget-object v6, Lbo/app/o$g;->b:Lbo/app/o$g;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return v9

    :cond_1
    const/4 v10, 0x1

    if-eqz v0, :cond_2

    sget-object v2, Lbo/app/o;->g:Lbo/app/o$b;

    iget-object v3, p0, Lbo/app/o;->e:Landroid/location/LocationManager;

    invoke-virtual {v2, v3}, Lbo/app/o$b;->a(Landroid/location/LocationManager;)Landroid/location/Location;

    move-result-object v11

    if-eqz v11, :cond_2

    sget-object v1, Lk20;->a:Lk20;

    new-instance v6, Lbo/app/o$h;

    invoke-direct {v6, v11}, Lbo/app/o$h;-><init>(Landroid/location/Location;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v0, Lbo/app/n;

    invoke-direct {v0, v11}, Lbo/app/n;-><init>(Landroid/location/Location;)V

    invoke-virtual {p0, v0}, Lbo/app/o;->a(Lbo/app/x1;)Z

    return v10

    :cond_2
    sget-object v2, Lbo/app/o;->g:Lbo/app/o$b;

    iget-object v3, p0, Lbo/app/o;->e:Landroid/location/LocationManager;

    iget-object v4, p0, Lbo/app/o;->f:Ljava/util/EnumSet;

    const-string v5, "allowedLocationProviders"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v4, v0, v1}, Lbo/app/o$b;->a(Landroid/location/LocationManager;Ljava/util/EnumSet;ZZ)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    sget-object v1, Lk20;->a:Lk20;

    sget-object v6, Lbo/app/o$i;->b:Lbo/app/o$i;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return v9

    :cond_3
    sget-object v1, Lk20;->a:Lk20;

    new-instance v6, Lbo/app/o$j;

    invoke-direct {v6, v0}, Lbo/app/o$j;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_4

    iget-object v1, p0, Lbo/app/o;->e:Landroid/location/LocationManager;

    iget-object v2, p0, Lbo/app/o;->d:Lbo/app/x3;

    new-instance v3, LHO6;

    invoke-direct {v3, p0}, LHO6;-><init>(Lbo/app/o;)V

    const/4 v4, 0x0

    invoke-static {v1, v0, v4, v2, v3}, LGO6;->a(Landroid/location/LocationManager;Ljava/lang/String;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V

    goto :goto_0

    :cond_4
    invoke-direct {p0, v0}, Lbo/app/o;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move v9, v10

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v4, v0

    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->e:Lk20$a;

    sget-object v6, Lbo/app/o$m;->b:Lbo/app/o$m;

    const/4 v5, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v4, v0

    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->e:Lk20$a;

    sget-object v6, Lbo/app/o$l;->b:Lbo/app/o$l;

    const/4 v5, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_1
    return v9
.end method

.method public a(Lbo/app/x1;)Z
    .locals 8

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lbo/app/j;->h:Lbo/app/j$a;

    invoke-virtual {v0, p1}, Lbo/app/j$a;->a(Lbo/app/x1;)Lbo/app/u1;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbo/app/o;->b:Lbo/app/y1;

    invoke-interface {v0, p1}, Lbo/app/y1;->a(Lbo/app/u1;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const/4 p1, 0x1

    goto :goto_1

    :catch_0
    move-exception p1

    move-object v3, p1

    sget-object v0, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->e:Lk20$a;

    sget-object v5, Lbo/app/o$e;->b:Lbo/app/o$e;

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    const/4 p1, 0x0

    :goto_1
    return p1
.end method
