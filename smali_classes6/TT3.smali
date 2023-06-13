.class public LTT3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LtQ7;

.field public final c:Z

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/List;

.field public final f:LqC7;

.field public final g:LAo7;

.field public final h:Ltn7;

.field public i:LCY7;

.field public j:Z

.field public k:Z

.field public l:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "mlkitcommonpipeline"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LtQ7;ZLAo7;Ltn7;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LTT3;->d:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LTT3;->e:Ljava/util/List;

    new-instance v0, LqC7;

    const-wide/16 v1, 0xa

    invoke-direct {v0, v1, v2}, LqC7;-><init>(J)V

    iput-object v0, p0, LTT3;->f:LqC7;

    const/4 v0, 0x1

    iput-boolean v0, p0, LTT3;->k:Z

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LTT3;->l:J

    iput-object p1, p0, LTT3;->a:Landroid/content/Context;

    iput-object p2, p0, LTT3;->b:LtQ7;

    iput-boolean p3, p0, LTT3;->c:Z

    iput-object p4, p0, LTT3;->g:LAo7;

    iput-object p5, p0, LTT3;->h:Ltn7;

    return-void
.end method

.method public static a(Landroid/content/Context;LIu6;)LTT3;
    .locals 7
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    invoke-virtual {p1}, LIu6;->j()Z

    move-result v3

    new-instance v6, LTT3;

    const-string v0, "vision-internal-vkp"

    invoke-static {v0}, Lgp7;->b(Ljava/lang/String;)LAo7;

    move-result-object v4

    invoke-static {}, Ltn7;->a()Ltn7;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ltn7;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, LTT3;-><init>(Landroid/content/Context;LtQ7;ZLAo7;Ltn7;)V

    return-object v6
.end method


# virtual methods
.method public b(Lg32;Lcom/google/mlkit/vision/common/internal/VisionImageMetadataParcel;)LJu6;
    .locals 22
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    iget-boolean v2, v1, LTT3;->c:Z

    const-string v3, "PipelineManager"

    if-nez v2, :cond_0

    invoke-static {}, LKu6;->f()LKu6;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iget-wide v6, v1, LTT3;->l:J

    const-wide/16 v8, 0x0

    cmp-long v2, v6, v8

    if-lez v2, :cond_1

    sub-long v6, v4, v6

    const-wide/16 v8, 0x12c

    cmp-long v2, v6, v8

    if-lez v2, :cond_1

    const-string v2, "Pipeline is reset."

    invoke-static {v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual/range {p0 .. p0}, LTT3;->d()V

    invoke-virtual/range {p0 .. p0}, LTT3;->c()LKu6;

    move-result-object v2

    goto :goto_0

    :cond_1
    iput-wide v4, v1, LTT3;->l:J

    invoke-static {}, LKu6;->f()LKu6;

    move-result-object v2

    :goto_0
    invoke-virtual {v2}, LKu6;->c()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v2}, LJu6;->f(LKu6;)LJu6;

    move-result-object v0

    return-object v0

    :cond_2
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lg32;->g()I

    move-result v2

    const/4 v4, -0x1

    const-wide/16 v5, 0x3e8

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-ne v2, v4, :cond_4

    invoke-virtual/range {p1 .. p1}, Lg32;->d()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v4

    sget-object v10, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    if-eq v4, v10, :cond_3

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v10

    add-int/lit8 v10, v10, 0x46

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v10}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v10, "Input bitmap is not ARGB_8888 config. Converting it to ARGB_8888 from "

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isMutable()Z

    move-result v4

    invoke-virtual {v2, v3, v4}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v2

    :cond_3
    iget-object v3, v1, LTT3;->i:LCY7;

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LCY7;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v10

    mul-long/2addr v10, v5

    iget v4, v0, Lcom/google/mlkit/vision/common/internal/VisionImageMetadataParcel;->e:I

    invoke-static {v4}, LJ68;->a(I)I

    move-result v4

    invoke-virtual {v3, v10, v11, v2, v4}, Lcom/google/android/libraries/vision/visionkit/pipeline/a;->h(JLandroid/graphics/Bitmap;I)LLP8;

    move-result-object v2

    goto/16 :goto_1

    :cond_4
    invoke-virtual/range {p1 .. p1}, Lg32;->g()I

    move-result v2

    const/16 v3, 0x23

    if-ne v2, v3, :cond_5

    invoke-virtual/range {p1 .. p1}, Lg32;->j()[Landroid/media/Image$Plane;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Landroid/media/Image$Plane;

    iget-object v3, v1, LTT3;->i:LCY7;

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, LCY7;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    mul-long v11, v3, v5

    aget-object v3, v2, v8

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/media/Image$Plane;

    invoke-virtual {v3}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v13

    aget-object v3, v2, v9

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/media/Image$Plane;

    invoke-virtual {v3}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v14

    aget-object v3, v2, v7

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/media/Image$Plane;

    invoke-virtual {v3}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lg32;->l()I

    move-result v16

    invoke-virtual/range {p1 .. p1}, Lg32;->h()I

    move-result v17

    aget-object v3, v2, v8

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/media/Image$Plane;

    invoke-virtual {v3}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v18

    aget-object v3, v2, v9

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/media/Image$Plane;

    invoke-virtual {v3}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v19

    aget-object v2, v2, v9

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/media/Image$Plane;

    invoke-virtual {v2}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v20

    iget v2, v0, Lcom/google/mlkit/vision/common/internal/VisionImageMetadataParcel;->e:I

    invoke-static {v2}, LJ68;->a(I)I

    move-result v21

    invoke-virtual/range {v10 .. v21}, Lcom/google/android/libraries/vision/visionkit/pipeline/a;->i(JLjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIIIII)LLP8;

    move-result-object v2

    goto :goto_1

    :cond_5
    invoke-static {}, LpX1;->g()LpX1;

    move-result-object v2

    move-object/from16 v3, p1

    invoke-virtual {v2, v3, v9}, LpX1;->e(Lg32;Z)Ljava/nio/ByteBuffer;

    move-result-object v2

    iget-object v3, v1, LTT3;->i:LCY7;

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LCY7;

    new-instance v4, LNH7;

    invoke-direct {v4}, LNH7;-><init>()V

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {v4, v2}, LNH7;->a([B)LNH7;

    iget v2, v0, Lcom/google/mlkit/vision/common/internal/VisionImageMetadataParcel;->e:I

    invoke-static {v2}, LJ68;->a(I)I

    move-result v2

    invoke-virtual {v4, v2}, LNH7;->f(I)LNH7;

    new-instance v2, LlV7;

    iget v10, v0, Lcom/google/mlkit/vision/common/internal/VisionImageMetadataParcel;->b:I

    iget v11, v0, Lcom/google/mlkit/vision/common/internal/VisionImageMetadataParcel;->c:I

    invoke-direct {v2, v10, v11}, LlV7;-><init>(II)V

    invoke-virtual {v4, v2}, LNH7;->b(LlV7;)LNH7;

    iget-wide v10, v0, Lcom/google/mlkit/vision/common/internal/VisionImageMetadataParcel;->d:J

    mul-long/2addr v10, v5

    invoke-virtual {v4, v10, v11}, LNH7;->c(J)LNH7;

    invoke-virtual {v4, v7}, LNH7;->e(I)LNH7;

    invoke-virtual {v4}, LNH7;->d()LFI7;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/google/android/libraries/vision/visionkit/pipeline/a;->d(LFI7;)LLP8;

    move-result-object v2
    :try_end_0
    .catch Lcom/google/mlkit/common/MlKitException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    invoke-virtual {v2}, LLP8;->c()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_12

    iget-object v3, v1, LTT3;->i:LCY7;

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LCY7;

    invoke-virtual {v3}, Lcom/google/android/libraries/vision/visionkit/pipeline/a;->c()LLP8;

    move-result-object v3

    invoke-static {}, LnY7;->F()LnY7;

    move-result-object v5

    invoke-virtual {v3, v5}, LLP8;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LnY7;

    invoke-virtual {v3}, Leu7;->h()LZt7;

    move-result-object v3

    check-cast v3, LfQ7;

    iget-object v5, v1, LTT3;->d:Ljava/util/List;

    invoke-virtual {v3, v5}, LfQ7;->p(Ljava/lang/Iterable;)LfQ7;

    invoke-virtual {v3}, LZt7;->l()Leu7;

    move-result-object v3

    check-cast v3, LnY7;

    iget-object v5, v1, LTT3;->d:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->clear()V

    invoke-virtual {v3}, LnY7;->H()Ljava/util/List;

    move-result-object v5

    iget-object v6, v1, LTT3;->f:LqC7;

    invoke-virtual {v6, v5}, LqC7;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_6

    iget-object v6, v1, LTT3;->g:LAo7;

    invoke-static {}, LOm9;->E()LIm9;

    move-result-object v10

    invoke-virtual {v10, v5}, LIm9;->q(Ljava/lang/Iterable;)LIm9;

    invoke-static {v10}, LBo7;->d(LIm9;)Lso7;

    move-result-object v5

    sget-object v10, LWk7;->u1:LWk7;

    invoke-virtual {v6, v5, v10}, LAo7;->b(Lso7;LWk7;)V

    :cond_6
    invoke-virtual {v2}, LLP8;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LSZ7;

    invoke-virtual/range {p2 .. p2}, Lcom/google/mlkit/vision/common/internal/VisionImageMetadataParcel;->s()Landroid/graphics/Matrix;

    move-result-object v0

    iget-boolean v14, v1, LTT3;->k:Z

    invoke-virtual {v3}, LnY7;->D()I

    move-result v5

    if-nez v5, :cond_8

    :cond_7
    move-object v15, v4

    goto :goto_4

    :cond_8
    invoke-virtual {v3}, LnY7;->H()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v5, v8

    :cond_9
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lzz7;

    invoke-virtual {v6}, Lzz7;->E()Ldz7;

    move-result-object v6

    invoke-virtual {v6}, Ldz7;->E()LZy7;

    move-result-object v10

    invoke-virtual {v6}, Ldz7;->H()I

    move-result v11

    const/4 v12, 0x4

    if-ne v11, v12, :cond_9

    invoke-virtual {v6}, Ldz7;->I()I

    move-result v5

    if-ne v5, v7, :cond_a

    invoke-virtual {v6}, Ldz7;->D()LPy7;

    move-result-object v5

    invoke-virtual {v5}, LPy7;->F()LMz7;

    move-result-object v5

    invoke-virtual {v5}, LMz7;->F()I

    move-result v5

    if-ne v5, v7, :cond_a

    invoke-virtual {v10}, LZy7;->I()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual {v10}, LZy7;->D()LXy7;

    move-result-object v5

    invoke-virtual {v5}, LXy7;->F()Z

    move-result v5

    if-nez v5, :cond_a

    invoke-virtual {v10}, LZy7;->D()LXy7;

    move-result-object v5

    invoke-virtual {v5}, LXy7;->G()Z

    move-result v5

    if-nez v5, :cond_a

    invoke-virtual {v10}, LZy7;->H()Z

    move-result v5

    if-nez v5, :cond_a

    invoke-virtual {v10}, LZy7;->G()Z

    move-result v5

    if-nez v5, :cond_a

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_3

    :cond_a
    move v5, v9

    goto :goto_2

    :cond_b
    if-eqz v5, :cond_7

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_3
    move-object v15, v3

    :goto_4
    new-instance v3, LlT8;

    invoke-direct {v3}, LlT8;-><init>()V

    invoke-virtual {v2}, LSZ7;->I()LHK8;

    move-result-object v5

    move v6, v8

    :goto_5
    invoke-virtual {v5}, LHK8;->D()I

    move-result v7

    if-ge v6, v7, :cond_f

    invoke-virtual {v5, v6}, LHK8;->E(I)LYJ8;

    move-result-object v7

    invoke-virtual {v7}, LYJ8;->F()Ldq8;

    move-result-object v9

    new-instance v10, Landroid/graphics/RectF;

    invoke-virtual {v9}, Ldq8;->E()I

    move-result v11

    int-to-float v11, v11

    invoke-virtual {v9}, Ldq8;->F()I

    move-result v12

    int-to-float v12, v12

    invoke-virtual {v9}, Ldq8;->E()I

    move-result v13

    invoke-virtual {v9}, Ldq8;->G()I

    move-result v16

    add-int v13, v13, v16

    int-to-float v13, v13

    invoke-virtual {v9}, Ldq8;->F()I

    move-result v16

    invoke-virtual {v9}, Ldq8;->D()I

    move-result v9

    add-int v9, v16, v9

    int-to-float v9, v9

    invoke-direct {v10, v11, v12, v13, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    if-eqz v0, :cond_c

    invoke-virtual {v0, v10}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    :cond_c
    new-instance v9, Landroid/graphics/Rect;

    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v10, v9}, Landroid/graphics/RectF;->round(Landroid/graphics/Rect;)V

    invoke-virtual {v7}, LYJ8;->I()Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-virtual {v7}, LYJ8;->E()J

    move-result-wide v10

    long-to-int v10, v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    goto :goto_6

    :cond_d
    move-object v10, v4

    :goto_6
    new-instance v11, LlT8;

    invoke-direct {v11}, LlT8;-><init>()V

    move v12, v8

    :goto_7
    invoke-virtual {v7}, LYJ8;->D()I

    move-result v13

    if-ge v12, v13, :cond_e

    invoke-virtual {v7, v12}, LYJ8;->G(I)LJs8;

    move-result-object v13

    invoke-static {v13}, LGu6;->e(LJs8;)LGu6;

    move-result-object v13

    invoke-virtual {v11, v13}, LlT8;->c(Ljava/lang/Object;)LlT8;

    add-int/lit8 v12, v12, 0x1

    goto :goto_7

    :cond_e
    new-instance v7, Luu;

    invoke-virtual {v11}, LlT8;->d()LvU8;

    move-result-object v11

    invoke-direct {v7, v9, v10, v11}, Luu;-><init>(Landroid/graphics/Rect;Ljava/lang/Integer;Ljava/util/List;)V

    invoke-virtual {v3, v7}, LlT8;->c(Ljava/lang/Object;)LlT8;

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_f
    new-instance v0, LlT8;

    invoke-direct {v0}, LlT8;-><init>()V

    invoke-virtual {v2}, LSZ7;->H()LeE8;

    move-result-object v2

    invoke-virtual {v2}, LeE8;->F()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LNE8;

    invoke-virtual {v4}, LNE8;->E()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJs8;

    invoke-static {v5}, LGu6;->e(LJs8;)LGu6;

    move-result-object v5

    invoke-virtual {v0, v5}, LlT8;->c(Ljava/lang/Object;)LlT8;

    goto :goto_8

    :cond_11
    new-instance v2, Lwu;

    invoke-static {}, LKu6;->f()LKu6;

    move-result-object v11

    invoke-virtual {v3}, LlT8;->d()LvU8;

    move-result-object v12

    invoke-virtual {v0}, LlT8;->d()LvU8;

    move-result-object v13

    move-object v10, v2

    invoke-direct/range {v10 .. v15}, Lwu;-><init>(LKu6;Ljava/util/List;Ljava/util/List;ZLjava/lang/Boolean;)V

    iput-boolean v8, v1, LTT3;->k:Z

    return-object v2

    :cond_12
    new-instance v0, Lxu;

    invoke-static {}, LmV8;->u()LmV8;

    move-result-object v2

    invoke-direct {v0, v8, v4, v2}, Lxu;-><init>(ZLcom/google/mlkit/common/MlKitException;Ljava/util/Set;)V

    invoke-static {v0}, LJu6;->f(LKu6;)LJu6;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    invoke-static {v0}, LKu6;->e(Lcom/google/mlkit/common/MlKitException;)LKu6;

    move-result-object v0

    invoke-static {v0}, LJu6;->f(LKu6;)LJu6;

    move-result-object v0

    return-object v0
.end method

.method public c()LKu6;
    .locals 14
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    const-string v0, "com.google.perception"

    iget-boolean v1, p0, LTT3;->j:Z

    if-eqz v1, :cond_0

    invoke-static {}, LKu6;->f()LKu6;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v1, p0, LTT3;->i:LCY7;

    const-string v2, "Failed to initialize detector. "

    const/4 v3, 0x3

    const/4 v4, 0x1

    if-nez v1, :cond_8

    :try_start_0
    iget-object v1, p0, LTT3;->b:LtQ7;

    instance-of v5, v1, LHu6;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v6, "PipelineManager"

    if-eqz v5, :cond_1

    :try_start_1
    check-cast v1, LHu6;

    invoke-virtual {v1}, LHu6;->a()F

    move-result v0

    invoke-virtual {v1}, LHu6;->b()I

    move-result v5

    invoke-virtual {v1}, LHu6;->c()Lfv2;

    iget-object v1, p0, LTT3;->a:Landroid/content/Context;

    invoke-static {v1, v0, v5}, LVk8;->a(Landroid/content/Context;FI)LuS7;

    move-result-object v0

    goto/16 :goto_4

    :cond_1
    check-cast v1, LIu6;

    invoke-virtual {v1}, LIu6;->b()F

    invoke-virtual {v1}, LIu6;->c()I

    invoke-virtual {v1}, LIu6;->d()Lfv2;

    invoke-virtual {v1}, LIu6;->h()Z

    move-result v5

    if-nez v5, :cond_2

    sget-object v5, Ljl8;->a:LVF8;

    :goto_0
    move-object v10, v5

    goto :goto_1

    :cond_2
    invoke-static {}, Ljl8;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5}, LTT3;->f(Ljava/lang/String;)Lnx8;

    move-result-object v5

    invoke-static {v5}, Ljl8;->e(Lnx8;)LVF8;

    move-result-object v5

    goto :goto_0

    :goto_1
    invoke-virtual {v1}, LIu6;->g()Z

    move-result v5

    const/4 v7, 0x2

    if-eq v4, v5, :cond_3

    move v5, v3

    goto :goto_2

    :cond_3
    move v5, v7

    :goto_2
    invoke-static {}, Ljl8;->h()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, v8}, LTT3;->f(Ljava/lang/String;)Lnx8;

    move-result-object v9

    invoke-virtual {v1}, LIu6;->g()Z

    move-result v8

    if-eqz v8, :cond_4

    iget-object v8, p0, LTT3;->h:Ltn7;

    invoke-virtual {v1}, LIu6;->e()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, LIu6;->f()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v11, v12, v0, v7}, Ltn7;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lfx7;

    move-result-object v8

    const-string v11, "Fetching acceleration allowlist"

    invoke-static {v6, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v11, p0, LTT3;->h:Ltn7;

    invoke-virtual {v1}, LIu6;->e()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, LIu6;->f()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v12, v13, v0, v7}, Ltn7;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/google/android/gms/tasks/Task;

    move-object v13, v8

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    move-object v13, v0

    :goto_3
    invoke-virtual {v1}, LIu6;->j()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v7, p0, LTT3;->a:Landroid/content/Context;

    invoke-virtual {v1}, LIu6;->i()Z

    move-result v8

    const-wide/32 v11, 0x493e0

    invoke-static/range {v7 .. v13}, Ljl8;->d(Landroid/content/Context;ZLnx8;LVF8;JLfx7;)Lj38;

    move-result-object v0

    invoke-virtual {v0, v5}, Lj38;->H(I)Lj38;

    invoke-static {v0}, Ljl8;->b(Lj38;)LuS7;

    move-result-object v0

    goto :goto_4

    :cond_5
    iget-object v0, p0, LTT3;->a:Landroid/content/Context;

    invoke-virtual {v1}, LIu6;->i()Z

    move-result v1

    invoke-static {v0, v1, v9, v10}, Ljl8;->c(Landroid/content/Context;ZLnx8;LVF8;)Lj38;

    move-result-object v0

    invoke-virtual {v0, v5}, Lj38;->H(I)Lj38;

    if-eqz v13, :cond_6

    invoke-virtual {v0, v13}, Lj38;->r(Lfx7;)Lj38;

    :cond_6
    invoke-static {v0}, Ljl8;->a(Lj38;)LuS7;

    move-result-object v0

    :goto_4
    invoke-virtual {v0}, Leu7;->h()LZt7;

    move-result-object v0

    check-cast v0, LfS7;

    invoke-static {}, Lrm8;->D()LEe8;

    move-result-object v1

    invoke-virtual {v1, v4}, LEe8;->p(Z)LEe8;

    iget-object v5, p0, LTT3;->a:Landroid/content/Context;

    new-instance v7, Ljava/io/File;

    invoke-virtual {v5}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v5

    const-string v8, "com.google.mlkit.acceleration"

    invoke-direct {v7, v5, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_7

    invoke-virtual {v7}, Ljava/io/File;->mkdir()Z

    move-result v5

    if-nez v5, :cond_7

    iget-object v5, p0, LTT3;->d:Ljava/util/List;

    invoke-static {}, Lzz7;->F()Ljz7;

    move-result-object v8

    invoke-virtual {v8, v3}, Ljz7;->p(I)Ljz7;

    invoke-virtual {v8}, LZt7;->l()Leu7;

    move-result-object v8

    check-cast v8, Lzz7;

    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v5, "Failed to create acceleration storage dir"

    invoke-static {v6, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, LEe8;->q(Ljava/lang/String;)LEe8;

    invoke-virtual {v0, v1}, LfS7;->p(LEe8;)LfS7;

    invoke-virtual {v0}, LZt7;->l()Leu7;

    move-result-object v0

    check-cast v0, LuS7;

    new-instance v1, LCY7;

    invoke-direct {v1, v0}, LCY7;-><init>(LuS7;)V

    iput-object v1, p0, LTT3;->i:LCY7;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    invoke-virtual {p0}, LTT3;->e()V

    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    const/4 v3, 0x5

    invoke-direct {v1, v2, v3, v0}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    invoke-static {v1}, LKu6;->e(Lcom/google/mlkit/common/MlKitException;)LKu6;

    move-result-object v0

    return-object v0

    :cond_8
    :goto_5
    :try_start_2
    iget-object v0, p0, LTT3;->i:LCY7;

    invoke-virtual {v0}, Lcom/google/android/libraries/vision/visionkit/pipeline/a;->f()V
    :try_end_2
    .catch Lcom/google/android/libraries/vision/visionkit/pipeline/PipelineException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {p0}, LTT3;->e()V

    invoke-static {}, Lcom/google/android/libraries/intelligence/acceleration/ProcessStateObserver;->a()Lcom/google/android/libraries/intelligence/acceleration/ProcessStateObserver;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/libraries/intelligence/acceleration/ProcessStateObserver;->b()V

    iput-boolean v4, p0, LTT3;->j:Z

    invoke-static {}, LKu6;->f()LKu6;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :catch_1
    move-exception v0

    :try_start_3
    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    invoke-virtual {v0}, Lcom/google/android/libraries/vision/visionkit/pipeline/PipelineException;->getRootCauseMessage()LLP8;

    move-result-object v5

    const-string v6, ""

    invoke-virtual {v5, v6}, LLP8;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_9

    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_6

    :cond_9
    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v2, v5

    :goto_6
    invoke-direct {v1, v2, v3}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;I)V

    new-instance v2, LbV8;

    invoke-direct {v2}, LbV8;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/libraries/vision/visionkit/pipeline/PipelineException;->getStatusCode()LKS7;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    new-instance v6, Lyu;

    invoke-direct {v6, v4, v5}, Lyu;-><init>(II)V

    invoke-virtual {v2, v6}, LbV8;->c(Ljava/lang/Object;)LbV8;

    invoke-virtual {v0}, Lcom/google/android/libraries/vision/visionkit/pipeline/PipelineException;->getComponentStatuses()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lil7;

    invoke-virtual {v5}, Lil7;->E()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lvq7;

    invoke-virtual {v7}, Lvq7;->F()Ljava/lang/String;

    move-result-object v8

    const-string v9, "tflite::support::TfLiteSupportStatus"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eq v4, v8, :cond_b

    move v8, v6

    goto :goto_8

    :cond_b
    move v8, v3

    :goto_8
    invoke-virtual {v7}, Lvq7;->D()I

    move-result v7

    new-instance v9, Lyu;

    invoke-direct {v9, v8, v7}, Lyu;-><init>(II)V

    invoke-virtual {v2, v9}, LbV8;->c(Ljava/lang/Object;)LbV8;

    goto :goto_7

    :cond_c
    new-instance v0, Lxu;

    invoke-virtual {v2}, LbV8;->d()LmV8;

    move-result-object v2

    invoke-direct {v0, v6, v1, v2}, Lxu;-><init>(ZLcom/google/mlkit/common/MlKitException;Ljava/util/Set;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-virtual {p0}, LTT3;->e()V

    return-object v0

    :goto_9
    invoke-virtual {p0}, LTT3;->e()V

    throw v0
.end method

.method public d()V
    .locals 2
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    iget-object v0, p0, LTT3;->i:LCY7;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, LTT3;->j:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/libraries/vision/visionkit/pipeline/a;->g()V

    :cond_0
    iget-object v0, p0, LTT3;->i:LCY7;

    invoke-virtual {v0}, Lcom/google/android/libraries/vision/visionkit/pipeline/a;->e()V

    const/4 v0, 0x0

    iput-object v0, p0, LTT3;->i:LCY7;

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, LTT3;->j:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, LTT3;->k:Z

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LTT3;->l:J

    invoke-virtual {p0}, LTT3;->e()V

    return-void
.end method

.method public final e()V
    .locals 4

    iget-object v0, p0, LTT3;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/res/AssetFileDescriptor;

    if-eqz v1, :cond_0

    :try_start_0
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "PipelineManager"

    const-string v3, "Failed to close asset model file."

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_1
    iget-object v0, p0, LTT3;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final f(Ljava/lang/String;)Lnx8;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LTT3;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p1

    iget-object v0, p0, LTT3;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lnx8;->G()Lcx8;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->getParcelFileDescriptor()Landroid/os/ParcelFileDescriptor;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->getFd()I

    move-result v1

    invoke-virtual {v0, v1}, Lcx8;->p(I)Lcx8;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcx8;->r(J)Lcx8;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcx8;->q(J)Lcx8;

    invoke-virtual {v0}, LZt7;->l()Leu7;

    move-result-object p1

    check-cast p1, Lnx8;

    return-object p1
.end method
