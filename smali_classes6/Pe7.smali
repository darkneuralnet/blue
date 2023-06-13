.class public final LPe7;
.super LO19;
.source "SourceFile"


# static fields
.field public static final h:Lcom/google/android/gms/common/internal/GmsLogger;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;

.field public final c:LVl7;

.field public final d:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

.field public final e:LmC7;

.field public final f:LaY8;

.field public g:J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/common/internal/GmsLogger;

    const-string v1, "FaceDetector"

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/internal/GmsLogger;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LPe7;->h:Lcom/google/android/gms/common/internal/GmsLogger;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;LmC7;)V
    .locals 7

    invoke-direct {p0}, LO19;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LPe7;->g:J

    iput-object p1, p0, LPe7;->a:Landroid/content/Context;

    iput-object p2, p0, LPe7;->b:Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->zzc()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {}, LGu7;->u()LQt7;

    move-result-object v4

    const-string v5, "models"

    invoke-virtual {v4, v5}, LQt7;->t(Ljava/lang/String;)LQt7;

    invoke-virtual {v4}, LFa9;->m()Lub9;

    move-result-object v4

    check-cast v4, LGu7;

    invoke-static {}, LVl7;->u()LZk7;

    move-result-object v5

    invoke-static {}, LKn7;->u()LRm7;

    move-result-object v6

    invoke-virtual {v6, v4}, LRm7;->w(LGu7;)LRm7;

    invoke-virtual {v6, v4}, LRm7;->t(LGu7;)LRm7;

    invoke-virtual {v6, v4}, LRm7;->y(LGu7;)LRm7;

    invoke-virtual {v5, v6}, LZk7;->w(LRm7;)LZk7;

    invoke-static {}, LAq9;->u()LCo9;

    move-result-object v6

    invoke-virtual {v6, v4}, LCo9;->p(LGu7;)LCo9;

    invoke-virtual {v6, v4}, LCo9;->t(LGu7;)LCo9;

    invoke-virtual {v5, v6}, LZk7;->p(LCo9;)LZk7;

    invoke-static {}, Lls7;->u()Lwr7;

    move-result-object v6

    invoke-virtual {v6, v4}, Lwr7;->t(LGu7;)Lwr7;

    invoke-virtual {v6, v4}, Lwr7;->w(LGu7;)Lwr7;

    invoke-virtual {v6, v4}, Lwr7;->y(LGu7;)Lwr7;

    invoke-virtual {v6, v4}, Lwr7;->p(LGu7;)Lwr7;

    invoke-virtual {v5, v6}, LZk7;->z(Lwr7;)LZk7;

    invoke-virtual {v5, v0}, LZk7;->B(Z)LZk7;

    if-nez v0, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->x()Z

    move-result v4

    if-eqz v4, :cond_1

    move v1, v2

    :cond_1
    invoke-virtual {v5, v1}, LZk7;->t(Z)LZk7;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->s()F

    move-result v1

    invoke-virtual {v5, v1}, LZk7;->A(F)LZk7;

    invoke-virtual {v5, v2}, LZk7;->C(Z)LZk7;

    if-eqz v0, :cond_2

    const/4 p2, 0x4

    invoke-virtual {v5, p2}, LZk7;->H(I)LZk7;

    invoke-virtual {v5, p2}, LZk7;->G(I)LZk7;

    goto :goto_3

    :cond_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->v()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v2, :cond_4

    if-eq v0, v3, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v5, v1}, LZk7;->H(I)LZk7;

    goto :goto_1

    :cond_4
    invoke-virtual {v5, v3}, LZk7;->H(I)LZk7;

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->zzd()I

    move-result v0

    if-eq v0, v2, :cond_6

    if-eq v0, v3, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v5, v1}, LZk7;->G(I)LZk7;

    goto :goto_2

    :cond_6
    invoke-virtual {v5, v3}, LZk7;->G(I)LZk7;

    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->u()I

    move-result p2

    if-eq p2, v2, :cond_8

    if-eq p2, v3, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v5, v1}, LZk7;->D(I)LZk7;

    goto :goto_3

    :cond_8
    invoke-virtual {v5, v3}, LZk7;->D(I)LZk7;

    :goto_3
    invoke-virtual {v5}, LFa9;->m()Lub9;

    move-result-object p2

    check-cast p2, LVl7;

    iput-object p2, p0, LPe7;->c:LVl7;

    iput-object p3, p0, LPe7;->d:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

    iput-object p4, p0, LPe7;->e:LmC7;

    invoke-static {p1}, LaY8;->a(Landroid/content/Context;)LaY8;

    move-result-object p2

    iput-object p2, p0, LPe7;->f:LaY8;

    invoke-static {p1}, LMG8;->a(Landroid/content/Context;)V

    return-void
.end method

.method public static e5(I)I
    .locals 3

    const/4 v0, 0x1

    if-eqz p0, :cond_3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p0, v1, :cond_1

    if-ne p0, v0, :cond_0

    return v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x28

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Unsupported rotation degree: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return v0

    :cond_2
    const/4 p0, 0x4

    return p0

    :cond_3
    return v0
.end method


# virtual methods
.method public final c4(LWO1;Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;)Ljava/util/List;
    .locals 30
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v3, p2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;->s()I

    move-result v4

    const/4 v5, -0x1

    const/4 v6, 0x1

    const/4 v9, 0x2

    if-eq v4, v5, :cond_7

    const/16 v5, 0x11

    if-eq v4, v5, :cond_6

    const/16 v5, 0x23

    if-eq v4, v5, :cond_1

    const v5, 0x32315659

    if-ne v4, v5, :cond_0

    invoke-static/range {p1 .. p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/nio/ByteBuffer;

    const/4 v5, 0x7

    invoke-virtual {v0, v4, v3, v5}, LPe7;->f5(Ljava/nio/ByteBuffer;Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;I)Ljava/util/List;

    move-result-object v4

    goto/16 :goto_1

    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;->s()I

    move-result v1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v4, 0x37

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Unsupported image format "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " at API "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "FaceDetector"

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v3, v0, LPe7;->f:LaY8;

    const/16 v4, 0x639f

    const/4 v5, 0x1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    move-wide v6, v7

    move-wide v8, v9

    invoke-virtual/range {v3 .. v9}, LaY8;->c(IIJJ)V

    invoke-static {v1}, Lu68;->a(Ljava/lang/String;)Landroid/os/RemoteException;

    move-result-object v1

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/media/Image;

    invoke-virtual {v4}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v4

    const/4 v5, 0x0

    aget-object v10, v4, v5

    invoke-virtual {v10}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v14

    aget-object v10, v4, v6

    invoke-virtual {v10}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v15

    aget-object v10, v4, v9

    invoke-virtual {v10}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v16

    invoke-static {}, Led9;->u()Ld99;

    move-result-object v10

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;->zzd()I

    move-result v11

    invoke-virtual {v10, v11}, Ld99;->w(I)Ld99;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;->zza()I

    move-result v11

    invoke-virtual {v10, v11}, Ld99;->p(I)Ld99;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;->zzc()I

    move-result v11

    invoke-static {v11}, LPe7;->e5(I)I

    move-result v11

    invoke-virtual {v10, v11}, Ld99;->z(I)Ld99;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;->u()J

    move-result-wide v11

    const-wide/16 v17, 0x0

    cmp-long v11, v11, v17

    if-lez v11, :cond_2

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;->u()J

    move-result-wide v11

    const-wide/16 v17, 0x3e8

    mul-long v11, v11, v17

    invoke-virtual {v10, v11, v12}, Ld99;->t(J)Ld99;

    :cond_2
    invoke-virtual {v10}, LFa9;->m()Lub9;

    move-result-object v10

    move-object/from16 v29, v10

    check-cast v29, Led9;

    invoke-virtual {v14}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v10

    if-eqz v10, :cond_3

    iget-object v11, v0, LPe7;->d:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

    iget-wide v12, v0, LPe7;->g:J

    aget-object v10, v4, v5

    invoke-virtual {v10}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v17

    aget-object v10, v4, v6

    invoke-virtual {v10}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v18

    aget-object v10, v4, v9

    invoke-virtual {v10}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v19

    aget-object v5, v4, v5

    invoke-virtual {v5}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v20

    aget-object v5, v4, v6

    invoke-virtual {v5}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v21

    aget-object v4, v4, v9

    invoke-virtual {v4}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v22

    move-object/from16 v23, v29

    invoke-virtual/range {v11 .. v23}, Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;->e(JLjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIIIIILed9;)Lck7;

    move-result-object v4

    goto/16 :goto_0

    :cond_3
    invoke-virtual {v14}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-virtual {v14}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v10

    if-nez v10, :cond_4

    iget-object v10, v0, LPe7;->d:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

    iget-wide v11, v0, LPe7;->g:J

    invoke-virtual {v14}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v20

    invoke-virtual {v15}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v21

    invoke-virtual/range {v16 .. v16}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v22

    aget-object v13, v4, v5

    invoke-virtual {v13}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v23

    aget-object v13, v4, v6

    invoke-virtual {v13}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v24

    aget-object v13, v4, v9

    invoke-virtual {v13}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v25

    aget-object v5, v4, v5

    invoke-virtual {v5}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v26

    aget-object v5, v4, v6

    invoke-virtual {v5}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v27

    aget-object v4, v4, v9

    invoke-virtual {v4}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v28

    move-object/from16 v17, v10

    move-wide/from16 v18, v11

    invoke-virtual/range {v17 .. v29}, Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;->c(J[B[B[BIIIIIILed9;)Lck7;

    move-result-object v4

    goto :goto_0

    :cond_4
    invoke-virtual {v14}, Ljava/nio/Buffer;->remaining()I

    move-result v10

    new-array v10, v10, [B

    invoke-virtual {v14, v10}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v15}, Ljava/nio/Buffer;->remaining()I

    move-result v11

    new-array v11, v11, [B

    invoke-virtual {v14, v10}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-virtual/range {v16 .. v16}, Ljava/nio/Buffer;->remaining()I

    move-result v12

    new-array v12, v12, [B

    invoke-virtual {v14, v10}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    iget-object v13, v0, LPe7;->d:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

    iget-wide v14, v0, LPe7;->g:J

    aget-object v16, v4, v5

    invoke-virtual/range {v16 .. v16}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v23

    aget-object v16, v4, v6

    invoke-virtual/range {v16 .. v16}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v24

    aget-object v16, v4, v9

    invoke-virtual/range {v16 .. v16}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v25

    aget-object v5, v4, v5

    invoke-virtual {v5}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v26

    aget-object v5, v4, v6

    invoke-virtual {v5}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v27

    aget-object v4, v4, v9

    invoke-virtual {v4}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v28

    move-object/from16 v17, v13

    move-wide/from16 v18, v14

    move-object/from16 v20, v10

    move-object/from16 v21, v11

    move-object/from16 v22, v12

    invoke-virtual/range {v17 .. v29}, Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;->c(J[B[B[BIIIIIILed9;)Lck7;

    move-result-object v4

    :goto_0
    if-eqz v4, :cond_5

    invoke-virtual {v0, v4}, LPe7;->d5(Lck7;)Ljava/util/List;

    move-result-object v4

    goto :goto_1

    :cond_5
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    goto :goto_1

    :cond_6
    invoke-static/range {p1 .. p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v4, v3, v9}, LPe7;->f5(Ljava/nio/ByteBuffer;Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;I)Ljava/util/List;

    move-result-object v4

    goto :goto_1

    :cond_7
    invoke-static/range {p1 .. p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Bitmap;

    invoke-static {v4, v6}, LOX7;->a(Landroid/graphics/Bitmap;Z)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {v0, v4, v3, v9}, LPe7;->f5(Ljava/nio/ByteBuffer;Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;I)Ljava/util/List;

    move-result-object v4

    :goto_1
    move-object v10, v4

    iget-object v4, v0, LPe7;->e:LmC7;

    iget-object v5, v0, LPe7;->b:Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v11

    sub-long/2addr v11, v1

    move-object v1, v4

    move-object v2, v5

    move-object/from16 v3, p2

    move-object v4, v10

    move-wide v5, v11

    invoke-virtual/range {v1 .. v6}, LmC7;->a(Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;Ljava/util/List;J)V

    iget-object v3, v0, LPe7;->f:LaY8;

    const/16 v4, 0x639f

    const/4 v5, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    move-wide v6, v7

    move-wide v8, v1

    invoke-virtual/range {v3 .. v9}, LaY8;->c(IIJJ)V

    return-object v10
.end method

.method public final d5(Lck7;)Ljava/util/List;
    .locals 28

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p1 .. p1}, Lck7;->w()Lup9;

    move-result-object v2

    invoke-virtual {v2}, Lup9;->w()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljp9;

    iget-object v4, v0, LPe7;->c:LVl7;

    invoke-virtual {v4}, LVl7;->D()I

    move-result v4

    const/4 v6, 0x2

    const/4 v7, 0x3

    const/4 v8, 0x1

    const/4 v9, -0x1

    if-ne v4, v7, :cond_8

    invoke-virtual {v3}, Ljp9;->G()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/high16 v11, -0x40800000    # -1.0f

    const/high16 v12, -0x40800000    # -1.0f

    const/high16 v13, -0x40800000    # -1.0f

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LHn9;

    invoke-virtual {v14}, LHn9;->w()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    move-result v5

    const v10, -0x73ae198e

    if-eq v5, v10, :cond_2

    const v10, -0x6d89eac3

    if-eq v5, v10, :cond_1

    const v10, 0x19bd4

    if-eq v5, v10, :cond_0

    goto :goto_2

    :cond_0
    const-string v5, "joy"

    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    goto :goto_3

    :cond_1
    const-string v5, "right_eye_closed"

    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_3

    :cond_2
    const-string v5, "left_eye_closed"

    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v8

    goto :goto_3

    :cond_3
    :goto_2
    move v5, v9

    :goto_3
    if-eqz v5, :cond_6

    const/high16 v10, 0x3f800000    # 1.0f

    if-eq v5, v8, :cond_5

    if-eq v5, v6, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v14}, LHn9;->u()F

    move-result v5

    sub-float v11, v10, v5

    goto :goto_1

    :cond_5
    invoke-virtual {v14}, LHn9;->u()F

    move-result v5

    sub-float v13, v10, v5

    goto :goto_1

    :cond_6
    invoke-virtual {v14}, LHn9;->u()F

    move-result v12

    goto :goto_1

    :cond_7
    move/from16 v23, v11

    move/from16 v24, v12

    move/from16 v22, v13

    goto :goto_4

    :cond_8
    const/high16 v22, -0x40800000    # -1.0f

    const/high16 v23, -0x40800000    # -1.0f

    const/high16 v24, -0x40800000    # -1.0f

    :goto_4
    iget-object v4, v0, LPe7;->c:LVl7;

    invoke-virtual {v4}, LVl7;->E()I

    move-result v4

    const-string v5, "FaceDetector"

    const/4 v14, 0x6

    const/16 v15, 0xa

    const/16 v6, 0x9

    const/4 v10, 0x4

    if-ne v4, v7, :cond_e

    invoke-virtual {v3}, Ljp9;->w()Ljava/util/List;

    move-result-object v4

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Lgp9;

    invoke-virtual/range {v19 .. v19}, Lgp9;->x()I

    move-result v20

    add-int/lit8 v11, v20, -0x1

    if-eqz v11, :cond_b

    if-eq v11, v8, :cond_a

    if-eq v11, v6, :cond_9

    packed-switch v11, :pswitch_data_0

    packed-switch v11, :pswitch_data_1

    sget-object v6, LPe7;->h:Lcom/google/android/gms/common/internal/GmsLogger;

    const-string v8, "Unknown landmark type: "

    invoke-static {v11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v5, v8}, Lcom/google/android/gms/common/internal/GmsLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    move v6, v9

    goto :goto_6

    :pswitch_0
    const/16 v6, 0x8

    goto :goto_6

    :pswitch_1
    const/4 v6, 0x2

    goto :goto_6

    :pswitch_2
    const/16 v6, 0x9

    goto :goto_6

    :pswitch_3
    const/4 v6, 0x3

    goto :goto_6

    :pswitch_4
    const/4 v6, 0x7

    goto :goto_6

    :pswitch_5
    const/4 v6, 0x1

    goto :goto_6

    :pswitch_6
    const/16 v6, 0xb

    goto :goto_6

    :pswitch_7
    const/4 v6, 0x5

    goto :goto_6

    :pswitch_8
    const/4 v6, 0x0

    goto :goto_6

    :cond_9
    move v6, v14

    goto :goto_6

    :cond_a
    move v6, v15

    goto :goto_6

    :cond_b
    move v6, v10

    :goto_6
    if-ltz v6, :cond_c

    new-instance v8, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmq;

    new-instance v11, Landroid/graphics/PointF;

    invoke-virtual/range {v19 .. v19}, Lgp9;->u()F

    move-result v12

    invoke-virtual/range {v19 .. v19}, Lgp9;->v()F

    move-result v13

    invoke-direct {v11, v12, v13}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-direct {v8, v6, v11}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmq;-><init>(ILandroid/graphics/PointF;)V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_c
    const/16 v6, 0x9

    const/4 v8, 0x1

    goto :goto_5

    :cond_d
    move-object v4, v7

    goto :goto_7

    :cond_e
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_7
    iget-object v6, v0, LPe7;->c:LVl7;

    invoke-virtual {v6}, LVl7;->E()I

    move-result v6

    if-ne v6, v10, :cond_12

    sget-object v6, Lxv7;->a:Lhb9;

    invoke-virtual {v3, v6}, LTa9;->v(Lx89;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_11

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LHi7;

    invoke-virtual {v8}, LHi7;->x()I

    move-result v11

    add-int/2addr v11, v9

    packed-switch v11, :pswitch_data_2

    sget-object v12, LPe7;->h:Lcom/google/android/gms/common/internal/GmsLogger;

    new-instance v13, Ljava/lang/StringBuilder;

    const/16 v10, 0x21

    invoke-direct {v13, v10}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v10, "Unknown contour type: "

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v12, v5, v10}, Lcom/google/android/gms/common/internal/GmsLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    move v11, v9

    goto :goto_9

    :pswitch_9
    const/16 v11, 0xf

    goto :goto_9

    :pswitch_a
    const/16 v11, 0xe

    goto :goto_9

    :pswitch_b
    const/16 v11, 0xd

    goto :goto_9

    :pswitch_c
    const/16 v11, 0xc

    goto :goto_9

    :pswitch_d
    const/16 v11, 0xb

    goto :goto_9

    :pswitch_e
    move v11, v15

    goto :goto_9

    :pswitch_f
    const/16 v11, 0x9

    goto :goto_9

    :pswitch_10
    const/16 v11, 0x8

    goto :goto_9

    :pswitch_11
    const/4 v11, 0x7

    goto :goto_9

    :pswitch_12
    move v11, v14

    goto :goto_9

    :pswitch_13
    const/4 v11, 0x5

    goto :goto_9

    :pswitch_14
    move v11, v10

    goto :goto_9

    :pswitch_15
    const/4 v11, 0x3

    goto :goto_9

    :pswitch_16
    const/4 v11, 0x2

    goto :goto_9

    :pswitch_17
    const/4 v11, 0x1

    :goto_9
    if-eq v11, v9, :cond_10

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v8}, LHi7;->w()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_f

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lpy9;

    new-instance v13, Landroid/graphics/PointF;

    invoke-virtual {v12}, Lpy9;->u()F

    move-result v9

    invoke-virtual {v12}, Lpy9;->v()F

    move-result v12

    invoke-direct {v13, v9, v12}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v10, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v9, -0x1

    goto :goto_a

    :cond_f
    new-instance v8, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmf;

    invoke-direct {v8, v11, v10}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmf;-><init>(ILjava/util/List;)V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v9, -0x1

    :cond_10
    const/4 v10, 0x4

    goto/16 :goto_8

    :cond_11
    move-object/from16 v27, v7

    goto :goto_b

    :cond_12
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v27, v5

    :goto_b
    invoke-virtual {v3}, Ljp9;->D()LNn9;

    move-result-object v5

    new-instance v6, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmj;

    invoke-virtual {v3}, Ljp9;->C()J

    move-result-wide v7

    long-to-int v7, v7

    new-instance v8, Landroid/graphics/Rect;

    invoke-virtual {v5}, LNn9;->u()F

    move-result v9

    float-to-int v9, v9

    invoke-virtual {v5}, LNn9;->w()F

    move-result v10

    float-to-int v10, v10

    invoke-virtual {v5}, LNn9;->v()F

    move-result v11

    float-to-int v11, v11

    invoke-virtual {v5}, LNn9;->x()F

    move-result v5

    float-to-int v5, v5

    invoke-direct {v8, v9, v10, v11, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v3}, Ljp9;->A()F

    move-result v19

    invoke-virtual {v3}, Ljp9;->z()F

    move-result v20

    invoke-virtual {v3}, Ljp9;->B()F

    move-result v21

    invoke-virtual {v3}, Ljp9;->x()Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-virtual {v3}, Ljp9;->y()F

    move-result v10

    move/from16 v25, v10

    goto :goto_c

    :cond_13
    const/high16 v25, -0x40800000    # -1.0f

    :goto_c
    move-object/from16 v16, v6

    move/from16 v17, v7

    move-object/from16 v18, v8

    move-object/from16 v26, v4

    invoke-direct/range {v16 .. v27}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmj;-><init>(ILandroid/graphics/Rect;FFFFFFFLjava/util/List;Ljava/util/List;)V

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_14
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xee
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method

.method public final f5(Ljava/nio/ByteBuffer;Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;I)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-static {}, Led9;->u()Ld99;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;->zzd()I

    move-result v1

    invoke-virtual {v0, v1}, Ld99;->w(I)Ld99;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;->zza()I

    move-result v1

    invoke-virtual {v0, v1}, Ld99;->p(I)Ld99;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;->zzc()I

    move-result v1

    invoke-static {v1}, LPe7;->e5(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ld99;->z(I)Ld99;

    invoke-virtual {v0, p3}, Ld99;->y(I)Ld99;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;->u()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long p3, v1, v3

    if-lez p3, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;->u()J

    move-result-wide p2

    const-wide/16 v1, 0x3e8

    mul-long/2addr p2, v1

    invoke-virtual {v0, p2, p3}, Ld99;->t(J)Ld99;

    :cond_0
    invoke-virtual {v0}, LFa9;->m()Lub9;

    move-result-object p2

    check-cast p2, Led9;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result p3

    if-eqz p3, :cond_1

    iget-object p3, p0, LPe7;->d:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

    iget-wide v0, p0, LPe7;->g:J

    invoke-virtual {p3, v0, v1, p1, p2}, Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;->d(JLjava/nio/ByteBuffer;Led9;)Lck7;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p3

    if-nez p3, :cond_2

    iget-object p3, p0, LPe7;->d:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

    iget-wide v0, p0, LPe7;->g:J

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    invoke-virtual {p3, v0, v1, p1, p2}, Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;->b(J[BLed9;)Lck7;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p3

    new-array p3, p3, [B

    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    iget-object p1, p0, LPe7;->d:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

    iget-wide v0, p0, LPe7;->g:J

    invoke-virtual {p1, v0, v1, p3, p2}, Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;->b(J[BLed9;)Lck7;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_3

    invoke-virtual {p0, p1}, LPe7;->d5(Lck7;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    return-object p1
.end method

.method public final zzc()V
    .locals 3

    iget-object v0, p0, LPe7;->d:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

    iget-object v1, p0, LPe7;->c:LVl7;

    iget-object v2, p0, LPe7;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;->a(LVl7;Landroid/content/res/AssetManager;)J

    move-result-wide v0

    iput-wide v0, p0, LPe7;->g:J

    iget-object v0, p0, LPe7;->e:LmC7;

    iget-object v1, p0, LPe7;->b:Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;

    invoke-virtual {v0, v1}, LmC7;->c(Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;)V

    return-void
.end method

.method public final zzd()V
    .locals 4

    iget-wide v0, p0, LPe7;->g:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    iget-object v2, p0, LPe7;->d:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;->f(J)V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LPe7;->g:J

    :cond_0
    return-void
.end method
