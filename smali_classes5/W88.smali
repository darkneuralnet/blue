.class public final LW88;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile b:LW88;

.field public static final c:LW88;


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LW88;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LW88;-><init>(Z)V

    sput-object v0, LW88;->c:LW88;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LW88;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, LW88;->a:Ljava/util/Map;

    return-void
.end method

.method public static a()LW88;
    .locals 2

    sget-object v0, LW88;->b:LW88;

    if-nez v0, :cond_1

    const-class v1, LW88;

    monitor-enter v1

    :try_start_0
    sget-object v0, LW88;->b:LW88;

    if-nez v0, :cond_0

    sget-object v0, LW88;->c:LW88;

    sput-object v0, LW88;->b:LW88;

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method
