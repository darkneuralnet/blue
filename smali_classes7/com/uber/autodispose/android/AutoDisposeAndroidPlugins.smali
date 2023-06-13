.class public final Lcom/uber/autodispose/android/AutoDisposeAndroidPlugins;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:Lio/reactivex/functions/e;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lio/reactivex/functions/e;)Z
    .locals 1

    if-eqz p0, :cond_1

    sget-object v0, Lcom/uber/autodispose/android/AutoDisposeAndroidPlugins;->a:Lio/reactivex/functions/e;

    if-nez v0, :cond_0

    :try_start_0
    invoke-interface {p0}, Lio/reactivex/functions/e;->a()Z

    move-result p0

    return p0

    :cond_0
    invoke-interface {v0}, Lio/reactivex/functions/e;->a()Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    invoke-static {p0}, Lio/reactivex/exceptions/a;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "defaultChecker == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
