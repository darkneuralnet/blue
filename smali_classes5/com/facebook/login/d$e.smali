.class public Lcom/facebook/login/d$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/login/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# static fields
.field public static a:Lcom/facebook/login/c;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;)Lcom/facebook/login/c;
    .locals 0

    invoke-static {p0}, Lcom/facebook/login/d$e;->b(Landroid/content/Context;)Lcom/facebook/login/c;

    move-result-object p0

    return-object p0
.end method

.method public static declared-synchronized b(Landroid/content/Context;)Lcom/facebook/login/c;
    .locals 3

    const-class v0, Lcom/facebook/login/d$e;

    monitor-enter v0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/facebook/a;->e()Landroid/content/Context;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    if-nez p0, :cond_1

    monitor-exit v0

    const/4 p0, 0x0

    return-object p0

    :cond_1
    :try_start_1
    sget-object v1, Lcom/facebook/login/d$e;->a:Lcom/facebook/login/c;

    if-nez v1, :cond_2

    new-instance v1, Lcom/facebook/login/c;

    invoke-static {}, Lcom/facebook/a;->f()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/facebook/login/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    sput-object v1, Lcom/facebook/login/d$e;->a:Lcom/facebook/login/c;

    :cond_2
    sget-object p0, Lcom/facebook/login/d$e;->a:Lcom/facebook/login/c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
