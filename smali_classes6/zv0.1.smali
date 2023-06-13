.class public Lzv0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LEv0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/google/firebase/remoteconfig/internal/e;

.field public final c:Lcom/google/firebase/remoteconfig/internal/c;

.field public final d:LAm1;

.field public final e:LSm1;

.field public final f:LMu0;

.field public final g:Landroid/content/Context;

.field public final h:Ljava/lang/String;

.field public final i:Lcom/google/firebase/remoteconfig/internal/d;

.field public final j:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>(LAm1;LSm1;Lcom/google/firebase/remoteconfig/internal/c;LMu0;Landroid/content/Context;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/d;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 12

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v8, Ljava/util/LinkedHashSet;

    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v8, v0, Lzv0;->a:Ljava/util/Set;

    new-instance v11, Lcom/google/firebase/remoteconfig/internal/e;

    move-object v1, v11

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    invoke-direct/range {v1 .. v10}, Lcom/google/firebase/remoteconfig/internal/e;-><init>(LAm1;LSm1;Lcom/google/firebase/remoteconfig/internal/c;LMu0;Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lcom/google/firebase/remoteconfig/internal/d;Ljava/util/concurrent/ScheduledExecutorService;)V

    iput-object v11, v0, Lzv0;->b:Lcom/google/firebase/remoteconfig/internal/e;

    move-object v1, p1

    iput-object v1, v0, Lzv0;->d:LAm1;

    move-object v1, p3

    iput-object v1, v0, Lzv0;->c:Lcom/google/firebase/remoteconfig/internal/c;

    move-object v1, p2

    iput-object v1, v0, Lzv0;->e:LSm1;

    move-object/from16 v1, p4

    iput-object v1, v0, Lzv0;->f:LMu0;

    move-object/from16 v1, p5

    iput-object v1, v0, Lzv0;->g:Landroid/content/Context;

    move-object/from16 v1, p6

    iput-object v1, v0, Lzv0;->h:Ljava/lang/String;

    move-object/from16 v1, p7

    iput-object v1, v0, Lzv0;->i:Lcom/google/firebase/remoteconfig/internal/d;

    move-object/from16 v1, p8

    iput-object v1, v0, Lzv0;->j:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lzv0;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lzv0;->b:Lcom/google/firebase/remoteconfig/internal/e;

    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/internal/e;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lzv0;->b:Lcom/google/firebase/remoteconfig/internal/e;

    invoke-virtual {v0, p1}, Lcom/google/firebase/remoteconfig/internal/e;->y(Z)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lzv0;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
