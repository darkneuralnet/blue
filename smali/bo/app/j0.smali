.class public final Lbo/app/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbo/app/c2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbo/app/j0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0011B\'\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u00a2\u0006\u0004\u0008,\u0010-J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\u0008\u0010\u0006\u001a\u00020\u0005H\u0002J\u0008\u0010\u0008\u001a\u00020\u0007H\u0002J\u0008\u0010\n\u001a\u00020\tH\u0002J\u0008\u0010\u000b\u001a\u00020\tH\u0002J\u0008\u0010\u000c\u001a\u00020\tH\u0007R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0010R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u0013\u0010 \u001a\u0004\u0018\u00010\u00028G\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u0010R\u0013\u0010#\u001a\u0004\u0018\u00010\t8G\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"\u00a8\u0006."
    }
    d2 = {
        "Lbo/app/j0;",
        "Lbo/app/c2;",
        "",
        "k",
        "l",
        "Ljava/util/Locale;",
        "m",
        "Ljava/util/TimeZone;",
        "n",
        "",
        "j",
        "i",
        "f",
        "hostAppVersion",
        "Ljava/lang/String;",
        "c",
        "()Ljava/lang/String;",
        "a",
        "hostAppSemanticVersionCode",
        "Lbo/app/h0;",
        "d",
        "()Lbo/app/h0;",
        "device",
        "b",
        "dirtyDevice",
        "getDeviceId",
        "deviceId",
        "Landroid/content/pm/PackageInfo;",
        "g",
        "()Landroid/content/pm/PackageInfo;",
        "packageInfo",
        "e",
        "googleAdvertisingId",
        "h",
        "()Ljava/lang/Boolean;",
        "isAdTrackingEnabled",
        "Landroid/content/Context;",
        "context",
        "LX10;",
        "configurationProvider",
        "Lbo/app/d2;",
        "deviceIdProvider",
        "Lbo/app/i0;",
        "deviceCache",
        "<init>",
        "(Landroid/content/Context;LX10;Lbo/app/d2;Lbo/app/i0;)V",
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
.field public static final g:Lbo/app/j0$a;


# instance fields
.field private a:Landroid/content/Context;

.field private final b:LX10;

.field private final c:Lbo/app/d2;

.field private final d:Lbo/app/i0;

.field private final e:Ljava/lang/String;

.field public final f:Landroid/content/SharedPreferences;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbo/app/j0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbo/app/j0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbo/app/j0;->g:Lbo/app/j0$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LX10;Lbo/app/d2;Lbo/app/i0;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceIdProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceCache"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbo/app/j0;->a:Landroid/content/Context;

    iput-object p2, p0, Lbo/app/j0;->b:LX10;

    iput-object p3, p0, Lbo/app/j0;->c:Lbo/app/d2;

    iput-object p4, p0, Lbo/app/j0;->d:Lbo/app/i0;

    invoke-virtual {p0}, Lbo/app/j0;->g()Landroid/content/pm/PackageInfo;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    :goto_0
    iput-object p1, p0, Lbo/app/j0;->e:Ljava/lang/String;

    iget-object p1, p0, Lbo/app/j0;->a:Landroid/content/Context;

    const-string p2, "com.appboy.managers.device_data_provider"

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lbo/app/j0;->f:Landroid/content/SharedPreferences;

    return-void
.end method

.method private final i()Z
    .locals 11

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lbo/app/j0;->a:Landroid/content/Context;

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Landroid/app/ActivityManager;

    invoke-static {v0}, LfO6;->a(Landroid/app/ActivityManager;)Z

    move-result v2

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type android.app.ActivityManager"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    move-object v6, v0

    sget-object v3, Lk20;->a:Lk20;

    sget-object v5, Lk20$a;->e:Lk20$a;

    sget-object v8, Lbo/app/j0$d;->b:Lbo/app/j0$d;

    const/4 v7, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    move-object v4, p0

    invoke-static/range {v3 .. v10}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_0
    return v2
.end method

.method private final j()Z
    .locals 2

    iget-object v0, p0, Lbo/app/j0;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final k()Ljava/lang/String;
    .locals 1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final l()Ljava/lang/String;
    .locals 9

    :try_start_0
    iget-object v0, p0, Lbo/app/j0;->a:Landroid/content/Context;

    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type android.telephony.TelephonyManager"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    move-object v4, v0

    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->e:Lk20$a;

    sget-object v6, Lbo/app/j0$f;->b:Lbo/app/j0$f;

    const/4 v5, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private final m()Ljava/util/Locale;
    .locals 2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "getDefault()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final n()Ljava/util/TimeZone;
    .locals 2

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    const-string v1, "getDefault()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 9

    invoke-virtual {p0}, Lbo/app/j0;->g()Landroid/content/pm/PackageInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_0

    invoke-static {v0}, LHD3;->a(Landroid/content/pm/PackageInfo;)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-static {v0}, LJD3;->a(Landroid/content/pm/PackageInfo;)J

    move-result-wide v0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ".0.0.0"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    sget-object v1, Lk20;->a:Lk20;

    sget-object v6, Lbo/app/j0$c;->b:Lbo/app/j0$c;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public b()Lbo/app/h0;
    .locals 2

    iget-object v0, p0, Lbo/app/j0;->d:Lbo/app/i0;

    invoke-virtual {p0}, Lbo/app/j0;->d()Lbo/app/h0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbo/app/i0;->a(Lbo/app/h0;)V

    iget-object v0, p0, Lbo/app/j0;->d:Lbo/app/i0;

    invoke-virtual {v0}, Lbo/app/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbo/app/h0;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbo/app/j0;->e:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lbo/app/h0;
    .locals 4

    new-instance v0, Lbo/app/h0$a;

    iget-object v1, p0, Lbo/app/j0;->b:LX10;

    invoke-direct {v0, v1}, Lbo/app/h0$a;-><init>(LX10;)V

    invoke-direct {p0}, Lbo/app/j0;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbo/app/h0$a;->a(Ljava/lang/String;)Lbo/app/h0$a;

    move-result-object v0

    invoke-direct {p0}, Lbo/app/j0;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbo/app/h0$a;->b(Ljava/lang/String;)Lbo/app/h0$a;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lbo/app/h0$a;->e(Ljava/lang/String;)Lbo/app/h0$a;

    move-result-object v0

    sget-object v1, Lbo/app/j0;->g:Lbo/app/j0$a;

    invoke-direct {p0}, Lbo/app/j0;->m()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Lbo/app/j0$a;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lbo/app/h0$a;->d(Ljava/lang/String;)Lbo/app/h0$a;

    move-result-object v0

    invoke-direct {p0}, Lbo/app/j0;->n()Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lbo/app/h0$a;->g(Ljava/lang/String;)Lbo/app/h0$a;

    move-result-object v0

    iget-object v2, p0, Lbo/app/j0;->a:Landroid/content/Context;

    invoke-direct {p0}, Lbo/app/j0;->j()Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbo/app/j0$a;->a(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbo/app/h0$a;->f(Ljava/lang/String;)Lbo/app/h0$a;

    move-result-object v0

    invoke-virtual {p0}, Lbo/app/j0;->f()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbo/app/h0$a;->c(Ljava/lang/Boolean;)Lbo/app/h0$a;

    move-result-object v0

    invoke-direct {p0}, Lbo/app/j0;->i()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbo/app/h0$a;->b(Ljava/lang/Boolean;)Lbo/app/h0$a;

    move-result-object v0

    invoke-virtual {p0}, Lbo/app/j0;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbo/app/h0$a;->c(Ljava/lang/String;)Lbo/app/h0$a;

    move-result-object v0

    invoke-virtual {p0}, Lbo/app/j0;->h()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbo/app/h0$a;->a(Ljava/lang/Boolean;)Lbo/app/h0$a;

    move-result-object v0

    invoke-virtual {v0}, Lbo/app/h0$a;->a()Lbo/app/h0;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lbo/app/j0;->f:Landroid/content/SharedPreferences;

    const-string v1, "google_ad_id"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f()Z
    .locals 2

    iget-object v0, p0, Lbo/app/j0;->a:Landroid/content/Context;

    const-string v1, "notification"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Landroid/app/NotificationManager;

    invoke-virtual {v0}, Landroid/app/NotificationManager;->areNotificationsEnabled()Z

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g()Landroid/content/pm/PackageInfo;
    .locals 14

    iget-object v0, p0, Lbo/app/j0;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/16 v4, 0x21

    :try_start_0
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v5, v4, :cond_0

    iget-object v5, p0, Lbo/app/j0;->a:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-static {v1, v2}, LD74;->a(J)Landroid/content/pm/PackageManager$PackageInfoFlags;

    move-result-object v6

    invoke-static {v5, v0, v6}, LE74;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v5, p0, Lbo/app/j0;->a:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {v5, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v5

    move-object v9, v5

    sget-object v6, Lk20;->a:Lk20;

    sget-object v8, Lk20$a;->e:Lk20$a;

    new-instance v11, Lbo/app/j0$e;

    invoke-direct {v11, v0}, Lbo/app/j0$e;-><init>(Ljava/lang/String;)V

    const/4 v10, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object v7, p0

    invoke-static/range {v6 .. v13}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object v0, p0, Lbo/app/j0;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v5, v4, :cond_1

    iget-object v3, p0, Lbo/app/j0;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-static {v1, v2}, LD74;->a(J)Landroid/content/pm/PackageManager$PackageInfoFlags;

    move-result-object v1

    invoke-static {v3, v0, v1}, LeO6;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    move-result-object v0

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lbo/app/j0;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-virtual {v1, v0, v3}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbo/app/j0;->c:Lbo/app/d2;

    invoke-interface {v0}, Lbo/app/d2;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h()Ljava/lang/Boolean;
    .locals 3

    iget-object v0, p0, Lbo/app/j0;->f:Landroid/content/SharedPreferences;

    const-string v1, "ad_tracking_enabled"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbo/app/j0;->f:Landroid/content/SharedPreferences;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0
.end method
