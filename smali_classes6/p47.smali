.class public final Lp47;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LLu6;

.field public c:LL37;

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;LLu6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lp47;->e:Z

    iput-object p1, p0, Lp47;->a:Landroid/content/Context;

    iput-object p2, p0, Lp47;->b:LLu6;

    return-void
.end method

.method public static a(Landroid/content/Context;LLu6;)Lp47;
    .locals 1

    new-instance v0, Lp47;

    invoke-direct {v0, p0, p1}, Lp47;-><init>(Landroid/content/Context;LLu6;)V

    return-object v0
.end method


# virtual methods
.method public final b(LWO1;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;Z)Li77;
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    invoke-virtual/range {p0 .. p0}, Lp47;->c()LL77;

    move-result-object v2

    invoke-virtual {v2}, LL77;->e()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v2}, Li77;->e(LL77;)Li77;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v2, 0x2

    :try_start_0
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;->s()I

    move-result v3

    const/4 v4, -0x1

    const-wide/16 v5, 0x3e8

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-ne v3, v4, :cond_2

    invoke-static/range {p1 .. p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Bitmap;

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v4

    sget-object v10, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    if-eq v4, v10, :cond_1

    const-string v4, "PipelineManager"

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Input bitmap is not ARGB_8888 config. Converting it to ARGB_8888 from "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v4, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isMutable()Z

    move-result v10

    invoke-virtual {v3, v4, v10}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v3

    :cond_1
    iget-object v4, v1, Lp47;->c:LL37;

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LL37;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v10

    mul-long/2addr v10, v5

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;->u()I

    move-result v5

    invoke-static {v5}, LS47;->b(I)I

    move-result v5

    invoke-virtual {v4, v10, v11, v3, v5}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->g(JLandroid/graphics/Bitmap;I)LI57;

    move-result-object v2

    goto/16 :goto_0

    :cond_2
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;->s()I

    move-result v3

    const/16 v4, 0x23

    if-ne v3, v4, :cond_3

    invoke-static/range {p1 .. p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/media/Image;

    invoke-virtual {v3}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v3

    iget-object v4, v1, Lp47;->c:LL37;

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, LL37;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v11

    mul-long/2addr v11, v5

    aget-object v4, v3, v8

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/media/Image$Plane;

    invoke-virtual {v4}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v13

    aget-object v4, v3, v9

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/media/Image$Plane;

    invoke-virtual {v4}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v14

    aget-object v4, v3, v2

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/media/Image$Plane;

    invoke-virtual {v4}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v15

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;->v()I

    move-result v16

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;->y()I

    move-result v17

    aget-object v4, v3, v8

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/media/Image$Plane;

    invoke-virtual {v4}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v18

    aget-object v4, v3, v9

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/media/Image$Plane;

    invoke-virtual {v4}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v19

    aget-object v3, v3, v9

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/media/Image$Plane;

    invoke-virtual {v3}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v20

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;->u()I

    move-result v3

    invoke-static {v3}, LS47;->b(I)I

    move-result v21

    invoke-virtual/range {v10 .. v21}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->h(JLjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIIIII)LI57;

    move-result-object v2

    goto :goto_0

    :cond_3
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;->s()I

    move-result v3

    const/16 v4, 0x11

    if-ne v3, v4, :cond_4

    invoke-static/range {p1 .. p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-static {v3}, LpX1;->a(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-object v4, v1, Lp47;->c:LL37;

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LL37;

    invoke-static {v3, v0}, LS47;->a(Ljava/nio/ByteBuffer;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;)LyY6;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->c(LyY6;)LI57;

    move-result-object v2

    goto :goto_0

    :cond_4
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;->s()I

    move-result v3

    const v4, 0x32315659

    if-ne v3, v4, :cond_16

    invoke-static/range {p1 .. p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-static {v3, v9}, LpX1;->k(Ljava/nio/ByteBuffer;Z)Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-object v4, v1, Lp47;->c:LL37;

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LL37;

    invoke-static {v3, v0}, LS47;->a(Ljava/nio/ByteBuffer;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;)LyY6;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->c(LyY6;)LI57;

    move-result-object v2
    :try_end_0
    .catch Lcom/google/mlkit/common/MlKitException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-virtual {v2}, LI57;->c()Z

    move-result v3

    if-nez v3, :cond_5

    new-instance v0, Landroid/os/RemoteException;

    const-string v2, "VisionKit pipeline returns empty result."

    invoke-direct {v0, v2}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    invoke-static {v7, v0}, LL77;->c(ILandroid/os/RemoteException;)LL77;

    move-result-object v0

    invoke-static {v0}, Li77;->e(LL77;)Li77;

    move-result-object v0

    return-object v0

    :cond_5
    invoke-virtual {v2}, LI57;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, LsY1;->b()LsY1;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;->v()I

    move-result v4

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;->y()I

    move-result v5

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;->u()I

    move-result v0

    invoke-virtual {v3, v4, v5, v0}, LsY1;->e(III)Landroid/graphics/Matrix;

    move-result-object v0

    iget-boolean v3, v1, Lp47;->e:Z

    new-instance v4, LwQ6;

    invoke-static {}, LL77;->d()LL77;

    move-result-object v5

    check-cast v2, Lo07;

    invoke-virtual {v2}, Lo07;->I()LJR6;

    move-result-object v2

    invoke-virtual {v2}, LJR6;->H()Ljava/util/List;

    move-result-object v2

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_6
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LHR6;

    invoke-virtual {v13}, LHR6;->G()I

    move-result v14

    const/4 v15, 0x6

    if-ne v14, v15, :cond_6

    invoke-virtual {v13}, LHR6;->J()LgR6;

    move-result-object v14

    invoke-static {v14}, LD27;->b(LgR6;)Lm87;

    move-result-object v14

    invoke-static {v14}, LD27;->c(Lm87;)Ljava/util/List;

    move-result-object v15

    new-instance v8, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zboq;

    invoke-virtual {v13}, LHR6;->F()Ljava/lang/String;

    move-result-object v16

    invoke-static {v15, v0}, LD27;->a(Ljava/util/List;Landroid/graphics/Matrix;)Landroid/graphics/Rect;

    move-result-object v17

    invoke-virtual {v13}, LHR6;->H()F

    move-result v19

    invoke-virtual {v14}, Lm87;->E()F

    move-result v20

    move-object v14, v15

    move-object v15, v8

    move-object/from16 v18, v14

    invoke-direct/range {v15 .. v20}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zboq;-><init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;FF)V

    invoke-virtual {v13}, LHR6;->I()I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v10, v13}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_7

    invoke-interface {v10, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LU57;

    goto :goto_2

    :cond_7
    new-instance v14, LU57;

    invoke-direct {v14}, LU57;-><init>()V

    invoke-interface {v10, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v13, v14

    :goto_2
    invoke-static {v13}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LU57;

    invoke-virtual {v13, v8}, LU57;->a(Ljava/lang/Object;)LU57;

    const/4 v8, 0x0

    goto :goto_1

    :cond_8
    const/4 v8, 0x0

    :goto_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v12

    if-ge v8, v12, :cond_c

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LHR6;

    invoke-virtual {v12}, LHR6;->G()I

    move-result v13

    if-eq v13, v9, :cond_9

    goto/16 :goto_6

    :cond_9
    invoke-virtual {v12}, LHR6;->J()LgR6;

    move-result-object v13

    invoke-static {v13}, LD27;->b(LgR6;)Lm87;

    move-result-object v13

    invoke-static {v13}, LD27;->c(Lm87;)Ljava/util/List;

    move-result-object v15

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v10, v14}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_a

    invoke-interface {v10, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LU57;

    invoke-static {v14}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LU57;

    invoke-virtual {v14}, LU57;->b()LX57;

    move-result-object v14

    goto :goto_4

    :cond_a
    invoke-static {}, LX57;->o()LX57;

    move-result-object v14

    :goto_4
    new-instance v9, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zboi;

    invoke-virtual {v12}, LHR6;->F()Ljava/lang/String;

    move-result-object v16

    invoke-static {v15, v0}, LD27;->a(Ljava/util/List;Landroid/graphics/Matrix;)Landroid/graphics/Rect;

    move-result-object v17

    invoke-virtual {v12}, LHR6;->K()LsR6;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, LsR6;->G()Ljava/util/List;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Li37;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v12}, LHR6;->H()F

    move-result v19

    invoke-virtual {v13}, Lm87;->E()F

    move-result v20

    invoke-static {v14}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v21, v13

    check-cast v21, Ljava/util/List;

    move-object v14, v9

    move-object v13, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v13

    invoke-direct/range {v14 .. v21}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zboi;-><init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;FFLjava/util/List;)V

    invoke-virtual {v12}, LHR6;->I()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v6, v12}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    invoke-interface {v6, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LU57;

    goto :goto_5

    :cond_b
    new-instance v13, LU57;

    invoke-direct {v13}, LU57;-><init>()V

    invoke-interface {v6, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v12, v13

    :goto_5
    invoke-static {v12}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LU57;

    invoke-virtual {v12, v9}, LU57;->a(Ljava/lang/Object;)LU57;

    :goto_6
    add-int/lit8 v8, v8, 0x1

    const/4 v9, 0x1

    goto/16 :goto_3

    :cond_c
    const/4 v8, 0x0

    :goto_7
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v9

    if-ge v8, v9, :cond_10

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LHR6;

    invoke-virtual {v9}, LHR6;->G()I

    move-result v10

    if-eq v10, v7, :cond_d

    goto/16 :goto_a

    :cond_d
    invoke-virtual {v9}, LHR6;->J()LgR6;

    move-result-object v10

    invoke-static {v10}, LD27;->b(LgR6;)Lm87;

    move-result-object v10

    invoke-static {v10}, LD27;->c(Lm87;)Ljava/util/List;

    move-result-object v15

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v6, v12}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    invoke-interface {v6, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LU57;

    invoke-static {v12}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LU57;

    invoke-virtual {v12}, LU57;->b()LX57;

    move-result-object v12

    goto :goto_8

    :cond_e
    invoke-static {}, LX57;->o()LX57;

    move-result-object v12

    :goto_8
    new-instance v14, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbok;

    invoke-virtual {v9}, LHR6;->F()Ljava/lang/String;

    move-result-object v13

    invoke-static {v15, v0}, LD27;->a(Ljava/util/List;Landroid/graphics/Matrix;)Landroid/graphics/Rect;

    move-result-object v16

    invoke-virtual {v9}, LHR6;->K()LsR6;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, LsR6;->G()Ljava/util/List;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Li37;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v17

    invoke-static {v12}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v18, v12

    check-cast v18, Ljava/util/List;

    invoke-virtual {v9}, LHR6;->H()F

    move-result v19

    invoke-virtual {v10}, Lm87;->E()F

    move-result v10

    move-object v12, v14

    move-object v7, v14

    move-object/from16 v14, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move/from16 v18, v19

    move/from16 v19, v10

    invoke-direct/range {v12 .. v19}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbok;-><init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;Ljava/util/List;FF)V

    invoke-virtual {v9}, LHR6;->I()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v11, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LU57;

    goto :goto_9

    :cond_f
    new-instance v10, LU57;

    invoke-direct {v10}, LU57;-><init>()V

    invoke-virtual {v9}, LHR6;->I()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v11, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v9, v10

    :goto_9
    invoke-static {v9}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LU57;

    invoke-virtual {v9, v7}, LU57;->a(Ljava/lang/Object;)LU57;

    :goto_a
    add-int/lit8 v8, v8, 0x1

    const/4 v7, 0x3

    goto/16 :goto_7

    :cond_10
    new-instance v6, LU57;

    invoke-direct {v6}, LU57;-><init>()V

    const/4 v7, 0x0

    :goto_b
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_13

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LHR6;

    invoke-virtual {v8}, LHR6;->G()I

    move-result v9

    const/4 v10, 0x4

    if-eq v9, v10, :cond_11

    goto :goto_c

    :cond_11
    invoke-virtual {v8}, LHR6;->J()LgR6;

    move-result-object v9

    invoke-static {v9}, LD27;->b(LgR6;)Lm87;

    move-result-object v9

    invoke-static {v9}, LD27;->c(Lm87;)Ljava/util/List;

    move-result-object v15

    invoke-static {}, LX57;->o()LX57;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v11, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_12

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LU57;

    invoke-static {v9}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LU57;

    invoke-virtual {v9}, LU57;->b()LX57;

    move-result-object v9

    invoke-interface {v11, v10}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_12
    new-instance v10, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbog;

    sget-object v12, LE67;->a:LG57;

    sget-object v13, Lw57;->a:Lw57;

    invoke-static {v9, v13}, Lg67;->a(Ljava/util/List;LF57;)Ljava/util/List;

    move-result-object v13

    invoke-virtual {v12, v13}, LG57;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v15, v0}, LD27;->a(Ljava/util/List;Landroid/graphics/Matrix;)Landroid/graphics/Rect;

    move-result-object v14

    invoke-virtual {v8}, LHR6;->K()LsR6;

    move-result-object v8

    invoke-virtual {v8}, LsR6;->G()Ljava/util/List;

    move-result-object v8

    invoke-static {v8}, Li37;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v16

    invoke-static {v9}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v17, v8

    check-cast v17, Ljava/util/List;

    move-object v12, v10

    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbog;-><init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v6, v10}, LU57;->a(Ljava/lang/Object;)LU57;

    :goto_c
    add-int/lit8 v7, v7, 0x1

    goto :goto_b

    :cond_13
    invoke-interface {v11}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LU57;

    invoke-virtual {v2}, LU57;->b()LX57;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x0

    :goto_d
    if-ge v8, v7, :cond_14

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbok;

    new-instance v15, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbog;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbok;->v()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbok;->s()Landroid/graphics/Rect;

    move-result-object v12

    invoke-virtual {v9}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbok;->E()Ljava/util/List;

    move-result-object v13

    invoke-virtual {v9}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbok;->u()Ljava/lang/String;

    move-result-object v14

    invoke-static {v9}, LX57;->s(Ljava/lang/Object;)LX57;

    move-result-object v9

    move-object v10, v15

    move-object/from16 p1, v0

    move-object v0, v15

    move-object v15, v9

    invoke-direct/range {v10 .. v15}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbog;-><init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v6, v0}, LU57;->a(Ljava/lang/Object;)LU57;

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, p1

    goto :goto_d

    :cond_15
    invoke-virtual {v6}, LU57;->b()LX57;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbom;

    sget-object v6, LE67;->a:LG57;

    sget-object v7, La67;->a:La67;

    invoke-static {v0, v7}, Lg67;->a(Ljava/util/List;LF57;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {v6, v7}, LG57;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v2, v6, v0}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbom;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-static {}, LX57;->o()LX57;

    move-result-object v0

    invoke-direct {v4, v5, v2, v0, v3}, LwQ6;-><init>(LL77;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbom;LX57;Z)V

    const/4 v0, 0x0

    iput-boolean v0, v1, Lp47;->e:Z

    return-object v4

    :cond_16
    :try_start_1
    new-instance v3, Lcom/google/mlkit/common/MlKitException;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;->s()I

    move-result v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unsupported image format: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x3

    invoke-direct {v3, v0, v4}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;I)V

    throw v3
    :try_end_1
    .catch Lcom/google/mlkit/common/MlKitException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    new-instance v3, Landroid/os/RemoteException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "Failed to process input image."

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v3}, LL77;->c(ILandroid/os/RemoteException;)LL77;

    move-result-object v0

    invoke-static {v0}, Li77;->e(LL77;)Li77;

    move-result-object v0

    return-object v0
.end method

.method public final c()LL77;
    .locals 8

    iget-boolean v0, p0, Lp47;->d:Z

    if-eqz v0, :cond_0

    invoke-static {}, LL77;->d()LL77;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lp47;->c:LL37;

    const/4 v1, 0x1

    if-nez v0, :cond_3

    iget-object v0, p0, Lp47;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/libraries/vision/visionkit/pipeline/AndroidAssetUtil;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "PipelineManager"

    const-string v2, "Failed to initiate native asset manager."

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    new-instance v0, LL37;

    iget-object v2, p0, Lp47;->b:LLu6;

    invoke-virtual {v2}, LLu6;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, LLu6;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, LLu6;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, LuZ6;->F()LoZ6;

    move-result-object v5

    invoke-static {}, LW07;->F()LQ07;

    move-result-object v6

    invoke-static {}, LzY6;->E()LtY6;

    move-result-object v7

    invoke-virtual {v7, v4}, LtY6;->z(Ljava/lang/String;)LtY6;

    invoke-virtual {v7, v3}, LtY6;->t(Ljava/lang/String;)LtY6;

    invoke-virtual {v7, v1}, LtY6;->A(Z)LtY6;

    invoke-virtual {v7, v1}, LtY6;->w(Z)LtY6;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {}, Lr87;->E()Lq87;

    move-result-object v3

    invoke-static {}, Lv87;->E()Lt87;

    move-result-object v4

    invoke-virtual {v4, v2}, Lt87;->t(Ljava/lang/String;)Lt87;

    invoke-virtual {v3, v4}, Lq87;->t(Lt87;)Lq87;

    invoke-virtual {v7, v3}, LtY6;->y(Lq87;)LtY6;

    :cond_2
    invoke-virtual {v6, v7}, LQ07;->y(LtY6;)LQ07;

    invoke-static {}, LP47;->E()LM47;

    move-result-object v2

    const-string v3, "PassThroughCoarseClassifier"

    invoke-virtual {v2, v3}, LM47;->t(Ljava/lang/String;)LM47;

    invoke-virtual {v6, v2}, LQ07;->w(LM47;)LQ07;

    invoke-virtual {v5, v6}, LoZ6;->t(LQ07;)LoZ6;

    invoke-static {}, LF27;->E()LA27;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, LA27;->t(I)LA27;

    invoke-virtual {v5, v2}, LoZ6;->w(LA27;)LoZ6;

    invoke-virtual {v5}, Lab7;->o()Lfb7;

    move-result-object v2

    check-cast v2, LuZ6;

    iget-object v3, p0, Lp47;->b:LLu6;

    invoke-virtual {v3}, LLu6;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "mlkit_google_ocr_pipeline"

    invoke-direct {v0, v2, v3, v4}, LL37;-><init>(LuZ6;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lp47;->c:LL37;

    :cond_3
    :try_start_0
    iget-object v0, p0, Lp47;->c:LL37;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LL37;

    invoke-virtual {v0}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->e()V
    :try_end_0
    .catch Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException; {:try_start_0 .. :try_end_0} :catch_0

    iput-boolean v1, p0, Lp47;->d:Z

    invoke-static {}, LL77;->d()LL77;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v2, Landroid/os/RemoteException;

    invoke-virtual {v0}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;->getRootCauseMessage()LI57;

    move-result-object v0

    const-string v3, ""

    invoke-virtual {v0, v3}, LI57;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v3, "Failed to initialize detector. "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v2}, LL77;->c(ILandroid/os/RemoteException;)LL77;

    move-result-object v0

    return-object v0
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lp47;->c:LL37;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lp47;->d:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->f()V

    :cond_0
    iget-object v0, p0, Lp47;->c:LL37;

    invoke-virtual {v0}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->d()V

    const/4 v0, 0x0

    iput-object v0, p0, Lp47;->c:LL37;

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lp47;->d:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lp47;->e:Z

    return-void
.end method
