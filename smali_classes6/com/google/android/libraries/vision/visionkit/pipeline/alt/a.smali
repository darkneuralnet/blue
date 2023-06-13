.class public Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LkZ6;
.implements LwZ6;


# instance fields
.field public final a:LAY6;

.field public final b:LuQ6;

.field public c:J

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:LOa7;


# direct methods
.method public constructor <init>(LuZ6;Ljava/lang/String;)V
    .locals 12

    invoke-static {}, LOa7;->b()LOa7;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-static {}, LOa7;->a()LOa7;

    move-result-object p2

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, LuZ6;->K()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, LnY6;

    invoke-direct {v0, p0}, LnY6;-><init>(LkZ6;)V

    iput-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->b:LuQ6;

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LuZ6;->J()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/NativePipelineImpl;

    invoke-direct {v0, p0, p0, p2}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/NativePipelineImpl;-><init>(LkZ6;LwZ6;LOa7;)V

    iput-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->b:LuQ6;

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/NativePipelineImpl;

    const-string v1, "mlkit_google_ocr_pipeline"

    invoke-direct {v0, v1, p0, p0, p2}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/NativePipelineImpl;-><init>(Ljava/lang/String;LkZ6;LwZ6;LOa7;)V

    iput-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->b:LuQ6;

    :goto_0
    invoke-virtual {p1}, LuZ6;->L()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, LAY6;

    invoke-virtual {p1}, LuZ6;->E()I

    move-result v1

    invoke-direct {v0, v1}, LAY6;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->a:LAY6;

    goto :goto_1

    :cond_3
    new-instance v0, LAY6;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, LAY6;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->a:LAY6;

    :goto_1
    iput-object p2, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->g:LOa7;

    iget-object p2, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->b:LuQ6;

    invoke-interface {p2}, LuQ6;->initializeFrameManager()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->d:J

    iget-object p2, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->b:LuQ6;

    invoke-interface {p2, v0, v1}, LuQ6;->initializeFrameBufferReleaseCallback(J)J

    move-result-wide v4

    iput-wide v4, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->e:J

    iget-object p2, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->b:LuQ6;

    invoke-interface {p2}, LuQ6;->initializeResultsCallback()J

    move-result-wide v6

    iput-wide v6, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->f:J

    iget-object v2, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->b:LuQ6;

    invoke-virtual {p1}, Lea7;->b()[B

    move-result-object v3

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    invoke-interface/range {v2 .. v11}, LuQ6;->initialize([BJJJJ)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->c:J

    return-void
.end method


# virtual methods
.method public final a(Lo07;)V
    .locals 2

    sget-object v0, Lb07;->b:Lb07;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Pipeline received results: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p0, p1, v1}, Lb07;->b(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final b(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->a:LAY6;

    invoke-virtual {v0, p1, p2}, LAY6;->a(J)V

    return-void
.end method

.method public final c(LyY6;)LI57;
    .locals 13

    iget-wide v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->a:LAY6;

    invoke-virtual {p1}, LyY6;->a()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, LAY6;->b(Ljava/lang/Object;J)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->b:LuQ6;

    iget-wide v2, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->c:J

    iget-wide v4, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->d:J

    invoke-virtual {p1}, LyY6;->a()J

    move-result-wide v6

    invoke-virtual {p1}, LyY6;->c()[B

    move-result-object v8

    invoke-virtual {p1}, LyY6;->b()Ld07;

    move-result-object v0

    invoke-virtual {v0}, Ld07;->b()I

    move-result v9

    invoke-virtual {p1}, LyY6;->b()Ld07;

    move-result-object v0

    invoke-virtual {v0}, Ld07;->a()I

    move-result v10

    invoke-virtual {p1}, LyY6;->d()I

    move-result v0

    add-int/lit8 v11, v0, -0x1

    invoke-virtual {p1}, LyY6;->e()I

    move-result p1

    add-int/lit8 v12, p1, -0x1

    invoke-interface/range {v1 .. v12}, LuQ6;->process(JJJ[BIIII)[B

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {}, LI57;->d()LI57;

    move-result-object p1

    return-object p1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->g:LOa7;

    invoke-static {p1, v0}, Lo07;->H([BLOa7;)Lo07;

    move-result-object p1

    invoke-static {p1}, LI57;->e(Ljava/lang/Object;)LI57;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Could not parse results"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    invoke-static {}, LI57;->d()LI57;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Pipeline has been closed or was not initialized"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized d()V
    .locals 14

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->c:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->b:LuQ6;

    invoke-interface {v4, v0, v1}, LuQ6;->stop(J)Z

    iget-object v5, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->b:LuQ6;

    iget-wide v6, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->c:J

    iget-wide v8, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->d:J

    iget-wide v10, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->e:J

    iget-wide v12, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->f:J

    invoke-interface/range {v5 .. v13}, LuQ6;->close(JJJJ)V

    iput-wide v2, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->c:J

    iget-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->b:LuQ6;

    invoke-interface {v0}, LuQ6;->y()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final e()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;
        }
    .end annotation

    iget-wide v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->c:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    :try_start_0
    iget-object v2, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->b:LuQ6;

    invoke-interface {v2, v0, v1}, LuQ6;->start(J)V

    iget-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->b:LuQ6;

    iget-wide v1, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->c:J

    invoke-interface {v0, v1, v2}, LuQ6;->waitUntilIdle(J)V
    :try_end_0
    .catch Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->b:LuQ6;

    iget-wide v2, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->c:J

    invoke-interface {v1, v2, v3}, LuQ6;->stop(J)Z

    throw v0

    :cond_0
    new-instance v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;

    sget-object v1, Lv07;->l:Lv07;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const-string v2, "Pipeline has been closed or was not initialized"

    invoke-direct {v0, v1, v2}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;-><init>(ILjava/lang/String;)V

    throw v0
.end method

.method public final f()V
    .locals 4

    iget-wide v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->c:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->b:LuQ6;

    invoke-interface {v2, v0, v1}, LuQ6;->stop(J)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Pipeline did not stop successfully."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Pipeline has been closed or was not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g(JLandroid/graphics/Bitmap;I)LI57;
    .locals 13

    move-object v1, p0

    iget-wide v2, v1, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->c:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_2

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    if-ne v0, v2, :cond_1

    iget-object v3, v1, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->b:LuQ6;

    iget-wide v4, v1, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->c:J

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v9

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v10

    const/4 v11, 0x0

    add-int/lit8 v12, p4, -0x1

    move-wide v6, p1

    move-object/from16 v8, p3

    invoke-interface/range {v3 .. v12}, LuQ6;->processBitmap(JJLandroid/graphics/Bitmap;IIII)[B

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, LI57;->d()LI57;

    move-result-object v0

    return-object v0

    :cond_0
    :try_start_0
    iget-object v2, v1, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->g:LOa7;

    invoke-static {v0, v2}, Lo07;->H([BLOa7;)Lo07;

    move-result-object v0

    invoke-static {v0}, LI57;->e(Ljava/lang/Object;)LI57;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Could not parse results"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Unsupported bitmap config "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Pipeline has been closed or was not initialized"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h(JLjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIIIII)LI57;
    .locals 16

    move-object/from16 v1, p0

    iget-wide v2, v1, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->c:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_2

    invoke-virtual/range {p3 .. p3}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p4 .. p4}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p5 .. p5}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v2, v1, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->b:LuQ6;

    iget-wide v3, v1, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->c:J

    add-int/lit8 v15, p11, -0x1

    move-wide/from16 v5, p1

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move/from16 v10, p6

    move/from16 v11, p7

    move/from16 v12, p8

    move/from16 v13, p9

    move/from16 v14, p10

    invoke-interface/range {v2 .. v15}, LuQ6;->processYuvFrame(JJLjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIIIII)[B

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, LI57;->d()LI57;

    move-result-object v0

    return-object v0

    :cond_0
    :try_start_0
    iget-object v2, v1, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->g:LOa7;

    invoke-static {v0, v2}, Lo07;->H([BLOa7;)Lo07;

    move-result-object v0

    invoke-static {v0}, LI57;->e(Ljava/lang/Object;)LI57;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Could not parse results"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Byte buffers are not direct."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Pipeline has been closed or was not initialized"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
