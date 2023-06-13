.class public final Landroidx/camera/camera2/Camera2Config;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/Camera2Config$DefaultProvider;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;)LVf6;
    .locals 0

    invoke-static {p0}, Landroidx/camera/camera2/Camera2Config;->e(Landroid/content/Context;)LVf6;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)Lxb0;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/camera/camera2/Camera2Config;->d(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)Lxb0;

    move-result-object p0

    return-object p0
.end method

.method public static c()Lzc0;
    .locals 4

    new-instance v0, Lda0;

    invoke-direct {v0}, Lda0;-><init>()V

    new-instance v1, Lea0;

    invoke-direct {v1}, Lea0;-><init>()V

    new-instance v2, Lfa0;

    invoke-direct {v2}, Lfa0;-><init>()V

    new-instance v3, Lzc0$a;

    invoke-direct {v3}, Lzc0$a;-><init>()V

    invoke-virtual {v3, v0}, Lzc0$a;->c(LFb0$a;)Lzc0$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lzc0$a;->d(Lxb0$a;)Lzc0$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lzc0$a;->g(LVf6$c;)Lzc0$a;

    move-result-object v0

    invoke-virtual {v0}, Lzc0$a;->a()Lzc0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)Lxb0;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/InitializationException;
        }
    .end annotation

    :try_start_0
    new-instance v0, Lga0;

    invoke-direct {v0, p0, p1, p2}, Lga0;-><init>(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)V
    :try_end_0
    .catch Landroidx/camera/core/CameraUnavailableException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Landroidx/camera/core/InitializationException;

    invoke-direct {p1, p0}, Landroidx/camera/core/InitializationException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static synthetic e(Landroid/content/Context;)LVf6;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/InitializationException;
        }
    .end annotation

    new-instance v0, Lma0;

    invoke-direct {v0, p0}, Lma0;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
