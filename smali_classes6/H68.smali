.class public final LH68;
.super LLE2;
.source "SourceFile"


# static fields
.field public static final l:LsY1;


# instance fields
.field public final d:LMd3;

.field public final e:LyU2;

.field public final f:LSe9;

.field public final g:Lif9;

.field public final h:LGi9;

.field public final i:LX29;

.field public j:LTT3;

.field public k:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, LsY1;->b()LsY1;

    move-result-object v0

    sput-object v0, LH68;->l:LsY1;

    return-void
.end method

.method public constructor <init>(LyU2;LMd3;)V
    .locals 2

    const-string v0, "object-detection"

    invoke-static {v0}, Lyg9;->b(Ljava/lang/String;)LSe9;

    move-result-object v0

    invoke-direct {p0}, LLE2;-><init>()V

    const-string v1, "Context can not be null"

    invoke-static {p1, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ObjectDetectorOptions can not be null"

    invoke-static {p2, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, LH68;->f:LSe9;

    invoke-virtual {p1}, LyU2;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lif9;->a(Landroid/content/Context;)Lif9;

    move-result-object v0

    iput-object v0, p0, LH68;->g:Lif9;

    iput-object p2, p0, LH68;->d:LMd3;

    iput-object p1, p0, LH68;->e:LyU2;

    invoke-static {p2}, LDA8;->b(LMd3;)LX29;

    move-result-object p1

    iput-object p1, p0, LH68;->i:LX29;

    invoke-static {}, LGi9;->f()LGi9;

    move-result-object p1

    iput-object p1, p0, LH68;->h:LGi9;

    return-void
.end method


# virtual methods
.method public final declared-synchronized b()V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, LH68;->h:LGi9;

    invoke-static {}, Lcom/google/android/gms/common/internal/LibraryVersion;->getInstance()Lcom/google/android/gms/common/internal/LibraryVersion;

    move-result-object v3

    const-string v4, "object-detection"

    invoke-virtual {v3, v4}, Lcom/google/android/gms/common/internal/LibraryVersion;->getVersion(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "object-detection:"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v2, v3}, LGi9;->k(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v2, p0, LH68;->h:LGi9;

    invoke-virtual {v2}, LGi9;->b()Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catch_0
    move-exception v2

    goto :goto_1

    :catch_1
    move-exception v2

    :goto_1
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "remoteConfig.loadAndActivate failed: "

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_1
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_2
    const-string v3, "BundledODTTask"

    invoke-static {v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_3
    iget-object v2, p0, LH68;->h:LGi9;

    const-string v3, "vision_object_detection_enable_acceleration"

    invoke-virtual {v2, v3}, LGi9;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, LH68;->k:Z

    const-string v2, "BundledODTTask"

    const/4 v3, 0x4

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-boolean v2, p0, LH68;->k:Z

    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v4, 0x29

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "isRemoteConfigAccelerationEnabled = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, "BundledODTTask"

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object v2, p0, LH68;->h:LGi9;

    sget-wide v3, LGi9;->o:J

    invoke-virtual {v2, v3, v4}, LGi9;->a(J)Lcom/google/android/gms/tasks/Task;

    iget-object v2, p0, LH68;->j:LTT3;

    if-nez v2, :cond_4

    iget-object v2, p0, LH68;->e:LyU2;

    invoke-virtual {v2}, LyU2;->b()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, LH68;->d:LMd3;

    invoke-virtual {v3}, LNd3;->a()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_3

    goto :goto_4

    :cond_3
    const/4 v4, 0x0

    :goto_4
    move v5, v4

    iget-object v3, p0, LH68;->d:LMd3;

    invoke-virtual {v3}, LNd3;->d()Z

    move-result v6

    iget-object v3, p0, LH68;->d:LMd3;

    invoke-virtual {v3}, LNd3;->c()Z

    move-result v7

    iget-boolean v8, p0, LH68;->k:Z

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static/range {v5 .. v11}, LIu6;->a(ZZZZFILfv2;)LIu6;

    move-result-object v3

    invoke-static {v2, v3}, LTT3;->a(Landroid/content/Context;LIu6;)LTT3;

    move-result-object v2

    iput-object v2, p0, LH68;->j:LTT3;

    :cond_4
    iget-object v2, p0, LH68;->j:LTT3;

    invoke-virtual {v2}, LTT3;->c()LKu6;

    move-result-object v2

    invoke-virtual {v2}, LKu6;->c()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    sget-object v5, LcW8;->u:LcW8;

    sub-long/2addr v3, v0

    invoke-virtual {p0, v5, v2, v3, v4}, LH68;->m(LcW8;LKu6;J)V

    invoke-virtual {v2}, LKu6;->d()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :cond_5
    :try_start_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    sget-object v5, LcW8;->c:LcW8;

    sub-long/2addr v3, v0

    invoke-virtual {p0, v5, v2, v3, v4}, LH68;->m(LcW8;LKu6;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized d()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LH68;->j:LTT3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LTT3;->d()V

    const/4 v0, 0x0

    iput-object v0, p0, LH68;->j:LTT3;

    :cond_0
    iget-object v0, p0, LH68;->f:LSe9;

    new-instance v1, LyW8;

    invoke-direct {v1}, LyW8;-><init>()V

    sget-object v2, LTV8;->e:LTV8;

    invoke-virtual {v1, v2}, LyW8;->e(LTV8;)LyW8;

    invoke-static {v1}, Lqf9;->d(LyW8;)Lqf9;

    move-result-object v1

    sget-object v2, LmW8;->R:LmW8;

    invoke-virtual {v0, v1, v2}, LSe9;->d(Lqf9;LmW8;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final bridge synthetic i(LNE2;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    check-cast p1, Lg32;

    invoke-virtual {p0, p1}, LH68;->j(Lg32;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized j(Lg32;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    move-object/from16 v10, p0

    move-object/from16 v0, p1

    monitor-enter p0

    :try_start_0
    const-string v1, "Mobile vision input can not be null"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    iget-object v1, v10, LH68;->j:LTT3;

    if-nez v1, :cond_0

    const-string v0, "BundledODTTask"

    const-string v1, "Object detector is not initialized."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Lg32;->g()I

    move-result v1

    const/16 v2, 0x23

    const/4 v3, 0x1

    if-ne v1, v2, :cond_1

    invoke-static {}, LpX1;->g()LpX1;

    move-result-object v1

    invoke-virtual {v1, v0, v3}, LpX1;->e(Lg32;Z)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lg32;->l()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lg32;->h()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Lg32;->k()I

    move-result v5

    const/16 v6, 0x11

    invoke-static {v1, v2, v4, v5, v6}, Lg32;->a(Ljava/nio/ByteBuffer;IIII)Lg32;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    iget-object v2, v10, LH68;->j:LTT3;

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LTT3;

    new-instance v4, Lcom/google/mlkit/vision/common/internal/VisionImageMetadataParcel;

    invoke-virtual/range {p1 .. p1}, Lg32;->l()I

    move-result v12

    invoke-virtual/range {p1 .. p1}, Lg32;->h()I

    move-result v13

    const/4 v14, 0x0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v15

    invoke-virtual/range {p1 .. p1}, Lg32;->k()I

    move-result v5

    invoke-static {v5}, Lsp0;->a(I)I

    move-result v17

    move-object v11, v4

    invoke-direct/range {v11 .. v17}, Lcom/google/mlkit/vision/common/internal/VisionImageMetadataParcel;-><init>(IIIJI)V

    invoke-virtual {v2, v1, v4}, LTT3;->b(Lg32;Lcom/google/mlkit/vision/common/internal/VisionImageMetadataParcel;)LJu6;

    move-result-object v1

    invoke-virtual {v1}, LJu6;->c()LKu6;

    move-result-object v11

    invoke-virtual {v11}, LKu6;->c()Z

    move-result v2

    if-nez v2, :cond_2

    sget-object v2, LcW8;->r0:LcW8;

    invoke-static {}, Lbw7;->s()Lbw7;

    move-result-object v5

    invoke-virtual {v1}, LJu6;->e()Z

    move-result v6

    invoke-virtual {v1}, LJu6;->d()Ljava/lang/Boolean;

    move-result-object v7

    move-object/from16 v1, p0

    move-object v3, v11

    move-object/from16 v4, p1

    invoke-virtual/range {v1 .. v9}, LH68;->l(LcW8;LKu6;Lg32;Ljava/util/List;ZLjava/lang/Boolean;J)V

    invoke-virtual {v11}, LKu6;->d()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_2
    :try_start_2
    invoke-virtual {v1}, LJu6;->a()Ljava/util/List;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lg32;->f()Landroid/graphics/Matrix;

    move-result-object v4

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_3

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move-object v12, v2

    goto/16 :goto_8

    :cond_3
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LFu6;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v6}, LFu6;->b()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_f

    invoke-virtual {v6}, LFu6;->b()Ljava/util/List;

    move-result-object v12

    const/4 v13, 0x0

    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LGu6;

    invoke-virtual {v12}, LGu6;->a()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    move-result v14

    const/4 v13, 0x3

    const/4 v15, 0x2

    sparse-switch v14, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    const-string v14, "/g/11fhycwtxg"

    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    move v12, v13

    goto :goto_3

    :sswitch_1
    const-string v14, "/m/05s2s"

    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    const/4 v12, 0x4

    goto :goto_3

    :sswitch_2
    const-string v14, "/m/02wbm"

    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    move v12, v15

    goto :goto_3

    :sswitch_3
    const-string v14, "/g/11g0srrsqr"

    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    move v12, v3

    goto :goto_3

    :sswitch_4
    const-string v14, "/g/11g0srqwrg"

    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    const/4 v12, 0x0

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v12, -0x1

    :goto_3
    if-eqz v12, :cond_9

    if-eq v12, v3, :cond_8

    if-eq v12, v15, :cond_7

    if-eq v12, v13, :cond_6

    const/4 v14, 0x4

    if-eq v12, v14, :cond_5

    const/4 v12, 0x0

    goto :goto_4

    :cond_5
    const-string v12, "Plant"

    goto :goto_4

    :cond_6
    const-string v12, "Place"

    goto :goto_4

    :cond_7
    const-string v12, "Food"

    goto :goto_4

    :cond_8
    const-string v12, "Fashion good"

    goto :goto_4

    :cond_9
    const-string v12, "Home good"

    :goto_4
    if-eqz v12, :cond_f

    invoke-virtual {v6}, LFu6;->b()Ljava/util/List;

    move-result-object v14

    const/4 v13, 0x0

    invoke-interface {v14, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LGu6;

    invoke-virtual {v14}, LGu6;->c()F

    move-result v14

    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    move-result v17

    sparse-switch v17, :sswitch_data_1

    goto :goto_5

    :sswitch_5
    const-string v13, "Plant"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    const/4 v13, 0x4

    goto :goto_6

    :sswitch_6
    const-string v13, "Place"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    const/4 v13, 0x3

    goto :goto_6

    :sswitch_7
    const-string v13, "Food"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    move v13, v15

    goto :goto_6

    :sswitch_8
    const-string v13, "Home good"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    move v13, v3

    goto :goto_6

    :sswitch_9
    const-string v13, "Fashion good"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    const/4 v13, 0x0

    goto :goto_6

    :cond_a
    :goto_5
    const/4 v13, -0x1

    :goto_6
    if-eqz v13, :cond_e

    if-eq v13, v3, :cond_d

    if-eq v13, v15, :cond_c

    const/4 v3, 0x3

    if-eq v13, v3, :cond_b

    const/4 v15, 0x4

    if-eq v13, v15, :cond_c

    const/4 v13, -0x1

    goto :goto_7

    :cond_b
    move v13, v3

    goto :goto_7

    :cond_c
    move v13, v15

    goto :goto_7

    :cond_d
    const/4 v13, 0x1

    goto :goto_7

    :cond_e
    const/4 v13, 0x0

    :goto_7
    new-instance v3, LU11$a;

    invoke-direct {v3, v12, v14, v13}, LU11$a;-><init>(Ljava/lang/String;FI)V

    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    invoke-virtual {v6}, LFu6;->a()Landroid/graphics/Rect;

    move-result-object v3

    if-eqz v4, :cond_10

    invoke-static {v3, v4}, Lsp0;->e(Landroid/graphics/Rect;Landroid/graphics/Matrix;)V

    :cond_10
    new-instance v12, LU11;

    invoke-virtual {v6}, LFu6;->c()Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v12, v3, v6, v7}, LU11;-><init>(Landroid/graphics/Rect;Ljava/lang/Integer;Ljava/util/List;)V

    invoke-interface {v5, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x1

    goto/16 :goto_1

    :cond_11
    move-object v12, v5

    :goto_8
    sget-object v2, LcW8;->c:LcW8;

    invoke-virtual {v1}, LJu6;->e()Z

    move-result v6

    invoke-virtual {v1}, LJu6;->d()Ljava/lang/Boolean;

    move-result-object v7

    move-object/from16 v1, p0

    move-object v3, v11

    move-object/from16 v4, p1

    move-object v5, v12

    invoke-virtual/range {v1 .. v9}, LH68;->l(LcW8;LKu6;Lg32;Ljava/util/List;ZLjava/lang/Boolean;J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v12

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x22d671e6 -> :sswitch_4
        -0x22d60c9f -> :sswitch_3
        -0x14b0d571 -> :sswitch_2
        -0x14af8d22 -> :sswitch_1
        0x1111ba4f -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x392285bb -> :sswitch_9
        -0xdca30c2 -> :sswitch_8
        0x21807e -> :sswitch_7
        0x499e8e7 -> :sswitch_6
        0x499ea4b -> :sswitch_5
    .end sparse-switch
.end method

.method public final synthetic k(Ljava/util/List;JLcW8;LKu6;ZLjava/lang/Boolean;Lg32;)Lqf9;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p7

    move-object/from16 v2, p8

    new-instance v3, LSt7;

    invoke-direct {v3}, LSt7;-><init>()V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, -0x1

    if-eqz v5, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LU11;

    new-instance v7, LmY8;

    invoke-direct {v7}, LmY8;-><init>()V

    invoke-virtual {v5}, LU11;->b()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_7

    invoke-virtual {v5}, LU11;->b()Ljava/util/List;

    move-result-object v8

    const/4 v9, 0x0

    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LU11$a;

    invoke-virtual {v8}, LU11$a;->c()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v11

    const/4 v12, 0x4

    const/4 v13, 0x3

    const/4 v14, 0x2

    const/4 v15, 0x1

    sparse-switch v11, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v9, "Plant"

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    move v6, v12

    goto :goto_1

    :sswitch_1
    const-string v9, "Place"

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    move v6, v13

    goto :goto_1

    :sswitch_2
    const-string v9, "Food"

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    move v6, v14

    goto :goto_1

    :sswitch_3
    const-string v11, "Home good"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    move v6, v9

    goto :goto_1

    :sswitch_4
    const-string v9, "Fashion good"

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    move v6, v15

    :cond_0
    :goto_1
    if-eqz v6, :cond_6

    if-eq v6, v15, :cond_5

    if-eq v6, v14, :cond_4

    if-eq v6, v13, :cond_3

    if-eq v6, v12, :cond_2

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v6

    const-string v9, "Unexpected category: "

    if-eqz v6, :cond_1

    invoke-virtual {v9, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_1
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v9}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_2
    const-string v9, "ObjectsLoggingUtils"

    invoke-static {v9, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v6, LvY8;->c:LvY8;

    goto :goto_3

    :cond_2
    sget-object v6, LvY8;->i:LvY8;

    goto :goto_3

    :cond_3
    sget-object v6, LvY8;->h:LvY8;

    goto :goto_3

    :cond_4
    sget-object v6, LvY8;->g:LvY8;

    goto :goto_3

    :cond_5
    sget-object v6, LvY8;->e:LvY8;

    goto :goto_3

    :cond_6
    sget-object v6, LvY8;->d:LvY8;

    :goto_3
    invoke-virtual {v7, v6}, LmY8;->a(LvY8;)LmY8;

    invoke-virtual {v8}, LU11$a;->a()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v7, v6}, LmY8;->b(Ljava/lang/Float;)LmY8;

    :cond_7
    invoke-virtual {v5}, LU11;->c()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_8

    invoke-virtual {v7, v5}, LmY8;->c(Ljava/lang/Integer;)LmY8;

    :cond_8
    invoke-virtual {v7}, LmY8;->e()LOY8;

    move-result-object v5

    invoke-virtual {v3, v5}, LSt7;->d(Ljava/lang/Object;)LSt7;

    goto/16 :goto_0

    :cond_9
    new-instance v4, LlU8;

    invoke-direct {v4}, LlU8;-><init>()V

    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v5}, LlU8;->d(Ljava/lang/Long;)LlU8;

    move-object/from16 v5, p4

    invoke-virtual {v4, v5}, LlU8;->e(LcW8;)LlU8;

    invoke-static/range {p5 .. p5}, LDA8;->a(LKu6;)Lbw7;

    move-result-object v5

    invoke-virtual {v4, v5}, LlU8;->h(Lbw7;)LlU8;

    invoke-static/range {p6 .. p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v4, v5}, LlU8;->g(Ljava/lang/Boolean;)LlU8;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v4, v5}, LlU8;->b(Ljava/lang/Boolean;)LlU8;

    invoke-virtual {v4, v5}, LlU8;->c(Ljava/lang/Boolean;)LlU8;

    iget-boolean v5, v0, LH68;->k:Z

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v4, v5}, LlU8;->i(Ljava/lang/Boolean;)LlU8;

    if-eqz v1, :cond_a

    invoke-virtual {v4, v1}, LlU8;->f(Ljava/lang/Boolean;)LlU8;

    :cond_a
    new-instance v1, LyW8;

    invoke-direct {v1}, LyW8;-><init>()V

    sget-object v5, LTV8;->e:LTV8;

    invoke-virtual {v1, v5}, LyW8;->e(LTV8;)LyW8;

    new-instance v5, Lt39;

    invoke-direct {v5}, Lt39;-><init>()V

    invoke-virtual {v4}, LlU8;->j()LFU8;

    move-result-object v4

    invoke-virtual {v5, v4}, Lt39;->g(LFU8;)Lt39;

    sget-object v4, LH68;->l:LsY1;

    invoke-virtual {v4, v2}, LsY1;->c(Lg32;)I

    move-result v7

    invoke-virtual {v4, v2}, LsY1;->d(Lg32;)I

    move-result v2

    new-instance v4, LFS8;

    invoke-direct {v4}, LFS8;-><init>()V

    if-eq v7, v6, :cond_f

    const/16 v6, 0x23

    if-eq v7, v6, :cond_e

    const v6, 0x32315659

    if-eq v7, v6, :cond_d

    const/16 v6, 0x10

    if-eq v7, v6, :cond_c

    const/16 v6, 0x11

    if-eq v7, v6, :cond_b

    sget-object v6, LQS8;->c:LQS8;

    goto :goto_4

    :cond_b
    sget-object v6, LQS8;->e:LQS8;

    goto :goto_4

    :cond_c
    sget-object v6, LQS8;->d:LQS8;

    goto :goto_4

    :cond_d
    sget-object v6, LQS8;->f:LQS8;

    goto :goto_4

    :cond_e
    sget-object v6, LQS8;->g:LQS8;

    goto :goto_4

    :cond_f
    sget-object v6, LQS8;->i:LQS8;

    :goto_4
    invoke-virtual {v4, v6}, LFS8;->a(LQS8;)LFS8;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v4, v2}, LFS8;->b(Ljava/lang/Integer;)LFS8;

    invoke-virtual {v4}, LFS8;->d()LmT8;

    move-result-object v2

    invoke-virtual {v5, v2}, Lt39;->f(LmT8;)Lt39;

    iget-object v2, v0, LH68;->i:LX29;

    invoke-virtual {v5, v2}, Lt39;->e(LX29;)Lt39;

    invoke-virtual {v3}, LSt7;->e()Lbw7;

    move-result-object v2

    invoke-virtual {v5, v2}, Lt39;->h(Lbw7;)Lt39;

    invoke-virtual {v5}, Lt39;->i()LL39;

    move-result-object v2

    invoke-virtual {v1, v2}, LyW8;->h(LL39;)LyW8;

    invoke-static {v1}, Lqf9;->d(LyW8;)Lqf9;

    move-result-object v1

    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x392285bb -> :sswitch_4
        -0xdca30c2 -> :sswitch_3
        0x21807e -> :sswitch_2
        0x499e8e7 -> :sswitch_1
        0x499ea4b -> :sswitch_0
    .end sparse-switch
.end method

.method public final l(LcW8;LKu6;Lg32;Ljava/util/List;ZLjava/lang/Boolean;J)V
    .locals 14

    move-object v10, p0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long v11, v0, p7

    new-instance v13, LyY7;

    move-object v0, v13

    move-object v1, p0

    move-object/from16 v2, p4

    move-wide v3, v11

    move-object v5, p1

    move-object/from16 v6, p2

    move/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p3

    invoke-direct/range {v0 .. v9}, LyY7;-><init>(LH68;Ljava/util/List;JLcW8;LKu6;ZLjava/lang/Boolean;Lg32;)V

    iget-object v0, v10, LH68;->f:LSe9;

    sget-object v1, LmW8;->Q:LmW8;

    invoke-virtual {v0, v13, v1}, LSe9;->f(LyY7;LmW8;)V

    new-instance v0, Leg8;

    invoke-direct {v0}, Leg8;-><init>()V

    iget-object v1, v10, LH68;->i:LX29;

    invoke-virtual {v0, v1}, Leg8;->a(LX29;)Leg8;

    move-object v1, p1

    invoke-virtual {v0, p1}, Leg8;->b(LcW8;)Leg8;

    invoke-static/range {p5 .. p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Leg8;->d(Ljava/lang/Boolean;)Leg8;

    invoke-interface/range {p4 .. p4}, Ljava/util/List;->isEmpty()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Leg8;->c(Ljava/lang/Boolean;)Leg8;

    invoke-virtual {v0}, Leg8;->e()LJg8;

    move-result-object v5

    sget-object v8, LqQ7;->a:LqQ7;

    iget-object v3, v10, LH68;->f:LSe9;

    sget-object v4, LmW8;->B1:LmW8;

    invoke-static {}, LME2;->d()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v13, Lie9;

    const/4 v9, 0x0

    move-object v2, v13

    move-wide v6, v11

    invoke-direct/range {v2 .. v9}, Lie9;-><init>(LSe9;LmW8;Ljava/lang/Object;JLqQ7;[B)V

    invoke-interface {v0, v13}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v0, v10, LH68;->g:Lif9;

    const/16 v4, 0x5ef6

    invoke-virtual {p1}, LcW8;->zza()I

    move-result v1

    sub-long v5, v2, v11

    move-object p1, v0

    move/from16 p2, v4

    move/from16 p3, v1

    move-wide/from16 p4, v5

    move-wide/from16 p6, v2

    invoke-virtual/range {p1 .. p7}, Lif9;->c(IIJJ)V

    return-void
.end method

.method public final m(LcW8;LKu6;J)V
    .locals 4

    iget-object v0, p0, LH68;->f:LSe9;

    new-instance v1, LyW8;

    invoke-direct {v1}, LyW8;-><init>()V

    sget-object v2, LTV8;->e:LTV8;

    invoke-virtual {v1, v2}, LyW8;->e(LTV8;)LyW8;

    new-instance v2, LU39;

    invoke-direct {v2}, LU39;-><init>()V

    iget-object v3, p0, LH68;->i:LX29;

    invoke-virtual {v2, v3}, LU39;->d(LX29;)LU39;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {v2, p3}, LU39;->g(Ljava/lang/Long;)LU39;

    invoke-virtual {v2, p1}, LU39;->e(LcW8;)LU39;

    invoke-static {p2}, LDA8;->a(LKu6;)Lbw7;

    move-result-object p1

    invoke-virtual {v2, p1}, LU39;->f(Lbw7;)LU39;

    invoke-virtual {v2}, LU39;->h()Ll49;

    move-result-object p1

    invoke-virtual {v1, p1}, LyW8;->i(Ll49;)LyW8;

    invoke-static {v1}, Lqf9;->d(LyW8;)Lqf9;

    move-result-object p1

    sget-object p2, LmW8;->P:LmW8;

    invoke-virtual {v0, p1, p2}, LSe9;->d(Lqf9;LmW8;)V

    return-void
.end method
