.class public final LvB5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation


# static fields
.field public static c:LvB5;


# instance fields
.field public final a:Lko1;

.field public final b:LMC7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LvB5;

    invoke-direct {v0}, LvB5;-><init>()V

    const-class v1, LvB5;

    monitor-enter v1

    :try_start_0
    sput-object v0, LvB5;->c:LvB5;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lko1;

    invoke-direct {v0}, Lko1;-><init>()V

    iput-object v0, p0, LvB5;->a:Lko1;

    new-instance v0, LMC7;

    invoke-direct {v0}, LMC7;-><init>()V

    iput-object v0, p0, LvB5;->b:LMC7;

    return-void
.end method

.method public static a()Lko1;
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    invoke-static {}, LvB5;->b()LvB5;

    move-result-object v0

    iget-object v0, v0, LvB5;->a:Lko1;

    return-object v0
.end method

.method public static b()LvB5;
    .locals 2

    const-class v0, LvB5;

    monitor-enter v0

    :try_start_0
    sget-object v1, LvB5;->c:LvB5;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
