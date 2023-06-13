.class public final Lny2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u000c\u0010\u0008\u001a\u00020\u0005*\u00020\u0007H\u0002\u00a8\u0006\t"
    }
    d2 = {
        "Lco/bird/android/model/User;",
        "Landroid/content/Context;",
        "context",
        "Lco/bird/android/model/wire/configs/Config;",
        "config",
        "",
        "b",
        "",
        "a",
        "login_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Ljava/lang/Throwable;)Z
    .locals 1

    :goto_0
    if-eqz p0, :cond_1

    instance-of v0, p0, Lco/bird/android/coreinterface/manager/AuthRejectionException;

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final synthetic access$isAuthException(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-static {p0}, Lny2;->a(Ljava/lang/Throwable;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$needsUpdate(Lco/bird/android/model/User;Landroid/content/Context;Lco/bird/android/model/wire/configs/Config;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lny2;->b(Lco/bird/android/model/User;Landroid/content/Context;Lco/bird/android/model/wire/configs/Config;)Z

    move-result p0

    return p0
.end method

.method public static final b(Lco/bird/android/model/User;Landroid/content/Context;Lco/bird/android/model/wire/configs/Config;)Z
    .locals 4

    new-instance v0, Lco/bird/android/model/Version;

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/Config;->getAndroidMinVersion()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lco/bird/android/model/Version;-><init>(Ljava/lang/String;)V

    new-instance v1, Lco/bird/android/model/Version;

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/Config;->getAndroidChargerMinVersion()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, p2}, Lco/bird/android/model/Version;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    invoke-virtual {p2, p1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    iget-object p1, p1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    new-instance p2, Lco/bird/android/model/Version;

    const-string v3, "appVersion"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lco/bird/android/model/Version;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lco/bird/android/model/Version;->compareTo(Lco/bird/android/model/Version;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/model/User;->getCanCharge()Ljava/lang/Boolean;

    move-result-object p0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {p2, v1}, Lco/bird/android/model/Version;->compareTo(Lco/bird/android/model/Version;)I

    move-result p0

    if-gez p0, :cond_1

    :cond_0
    const/4 v2, 0x1

    :cond_1
    return v2
.end method
