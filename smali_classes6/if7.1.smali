.class public final Lif7;
.super LO19;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LVl7;

.field public final c:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

.field public d:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;)V
    .locals 9

    invoke-direct {p0}, LO19;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lif7;->d:J

    iput-object p1, p0, Lif7;->a:Landroid/content/Context;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->zzc()I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne p1, v2, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    invoke-static {}, LGu7;->u()LQt7;

    move-result-object v3

    const-string v4, "models_bundled"

    invoke-virtual {v3, v4}, LQt7;->t(Ljava/lang/String;)LQt7;

    invoke-virtual {v3}, LFa9;->m()Lub9;

    move-result-object v3

    check-cast v3, LGu7;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->v()I

    move-result v5

    invoke-static {}, LKn7;->u()LRm7;

    move-result-object v6

    invoke-static {}, LGu7;->u()LQt7;

    move-result-object v7

    invoke-virtual {v7, v4}, LQt7;->t(Ljava/lang/String;)LQt7;

    if-ne v5, v2, :cond_1

    const-string v8, "fssd_medium_8bit_v5.tflite"

    goto :goto_1

    :cond_1
    const-string v8, "fssd_25_8bit_v2.tflite"

    :goto_1
    invoke-virtual {v7, v8}, LQt7;->p(Ljava/lang/String;)LQt7;

    invoke-virtual {v7}, LFa9;->m()Lub9;

    move-result-object v7

    check-cast v7, LGu7;

    invoke-virtual {v6, v7}, LRm7;->w(LGu7;)LRm7;

    invoke-static {}, LGu7;->u()LQt7;

    move-result-object v7

    invoke-virtual {v7, v4}, LQt7;->t(Ljava/lang/String;)LQt7;

    if-ne v5, v2, :cond_2

    const-string v8, "fssd_medium_8bit_gray_v5.tflite"

    goto :goto_2

    :cond_2
    const-string v8, "fssd_25_8bit_gray_v2.tflite"

    :goto_2
    invoke-virtual {v7, v8}, LQt7;->p(Ljava/lang/String;)LQt7;

    invoke-virtual {v7}, LFa9;->m()Lub9;

    move-result-object v7

    check-cast v7, LGu7;

    invoke-virtual {v6, v7}, LRm7;->t(LGu7;)LRm7;

    invoke-static {}, LGu7;->u()LQt7;

    move-result-object v7

    invoke-virtual {v7, v4}, LQt7;->t(Ljava/lang/String;)LQt7;

    if-ne v5, v2, :cond_3

    const-string v4, "fssd_anchors_v5.pb"

    goto :goto_3

    :cond_3
    const-string v4, "fssd_anchors_v2.pb"

    :goto_3
    invoke-virtual {v7, v4}, LQt7;->p(Ljava/lang/String;)LQt7;

    invoke-virtual {v7}, LFa9;->m()Lub9;

    move-result-object v4

    check-cast v4, LGu7;

    invoke-virtual {v6, v4}, LRm7;->p(LGu7;)LRm7;

    invoke-virtual {v6, v3}, LRm7;->y(LGu7;)LRm7;

    invoke-virtual {v6}, LFa9;->m()Lub9;

    move-result-object v4

    check-cast v4, LKn7;

    invoke-static {}, LVl7;->u()LZk7;

    move-result-object v5

    invoke-virtual {v5, v4}, LZk7;->y(LKn7;)LZk7;

    invoke-static {}, LAq9;->u()LCo9;

    move-result-object v4

    invoke-virtual {v4, v3}, LCo9;->p(LGu7;)LCo9;

    invoke-virtual {v4, v3}, LCo9;->t(LGu7;)LCo9;

    invoke-virtual {v5, v4}, LZk7;->p(LCo9;)LZk7;

    invoke-static {}, Lls7;->u()Lwr7;

    move-result-object v4

    invoke-virtual {v4, v3}, Lwr7;->t(LGu7;)Lwr7;

    invoke-virtual {v4, v3}, Lwr7;->w(LGu7;)Lwr7;

    invoke-virtual {v4, v3}, Lwr7;->y(LGu7;)Lwr7;

    invoke-virtual {v4, v3}, Lwr7;->p(LGu7;)Lwr7;

    invoke-virtual {v5, v4}, LZk7;->z(Lwr7;)LZk7;

    invoke-virtual {v5, p1}, LZk7;->B(Z)LZk7;

    if-nez p1, :cond_4

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->x()Z

    move-result v3

    if-eqz v3, :cond_4

    move v0, v1

    :cond_4
    invoke-virtual {v5, v0}, LZk7;->t(Z)LZk7;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->s()F

    move-result v0

    invoke-virtual {v5, v0}, LZk7;->A(F)LZk7;

    invoke-virtual {v5, v1}, LZk7;->C(Z)LZk7;

    if-eqz p1, :cond_5

    const/4 p1, 0x4

    invoke-virtual {v5, p1}, LZk7;->H(I)LZk7;

    invoke-virtual {v5, p1}, LZk7;->G(I)LZk7;

    goto :goto_6

    :cond_5
    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->v()I

    move-result p1

    const/4 v0, 0x3

    if-eq p1, v1, :cond_7

    if-eq p1, v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v5, v0}, LZk7;->H(I)LZk7;

    goto :goto_4

    :cond_7
    invoke-virtual {v5, v2}, LZk7;->H(I)LZk7;

    :goto_4
    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->zzd()I

    move-result p1

    if-eq p1, v1, :cond_9

    if-eq p1, v2, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {v5, v0}, LZk7;->G(I)LZk7;

    goto :goto_5

    :cond_9
    invoke-virtual {v5, v2}, LZk7;->G(I)LZk7;

    :goto_5
    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->u()I

    move-result p1

    if-eq p1, v1, :cond_b

    if-eq p1, v2, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {v5, v0}, LZk7;->D(I)LZk7;

    goto :goto_6

    :cond_b
    invoke-virtual {v5, v2}, LZk7;->D(I)LZk7;

    :goto_6
    invoke-virtual {v5}, LFa9;->m()Lub9;

    move-result-object p1

    check-cast p1, LVl7;

    iput-object p1, p0, Lif7;->b:LVl7;

    iput-object p3, p0, Lif7;->c:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

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
    .locals 26
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;->s()I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eq v2, v3, :cond_7

    const/16 v3, 0x11

    if-eq v2, v3, :cond_6

    const/16 v3, 0x23

    if-eq v2, v3, :cond_1

    const v3, 0x32315659

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/nio/ByteBuffer;

    const/4 v3, 0x7

    invoke-virtual {v0, v2, v1, v3}, Lif7;->f5(Ljava/nio/ByteBuffer;Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;I)Ljava/util/List;

    move-result-object v1

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

    const-string v2, "ThickFaceDetector"

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v2, Landroid/os/RemoteException;

    invoke-direct {v2, v1}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    invoke-static/range {p1 .. p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/media/Image;

    invoke-virtual {v2}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v2

    const/4 v3, 0x0

    aget-object v6, v2, v3

    invoke-virtual {v6}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v10

    aget-object v6, v2, v4

    invoke-virtual {v6}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v11

    aget-object v6, v2, v5

    invoke-virtual {v6}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v12

    invoke-static {}, Led9;->u()Ld99;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;->zzd()I

    move-result v7

    invoke-virtual {v6, v7}, Ld99;->w(I)Ld99;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;->zza()I

    move-result v7

    invoke-virtual {v6, v7}, Ld99;->p(I)Ld99;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;->zzc()I

    move-result v7

    invoke-static {v7}, Lif7;->e5(I)I

    move-result v7

    invoke-virtual {v6, v7}, Ld99;->z(I)Ld99;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;->u()J

    move-result-wide v7

    const-wide/16 v13, 0x0

    cmp-long v7, v7, v13

    if-lez v7, :cond_2

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;->u()J

    move-result-wide v7

    const-wide/16 v13, 0x3e8

    mul-long/2addr v7, v13

    invoke-virtual {v6, v7, v8}, Ld99;->t(J)Ld99;

    :cond_2
    invoke-virtual {v6}, LFa9;->m()Lub9;

    move-result-object v1

    move-object/from16 v25, v1

    check-cast v25, Led9;

    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v7, v0, Lif7;->c:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

    iget-wide v8, v0, Lif7;->d:J

    aget-object v1, v2, v3

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v13

    aget-object v1, v2, v4

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v14

    aget-object v1, v2, v5

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v15

    aget-object v1, v2, v3

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v16

    aget-object v1, v2, v4

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v17

    aget-object v1, v2, v5

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v18

    move-object/from16 v19, v25

    invoke-virtual/range {v7 .. v19}, Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;->e(JLjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIIIIILed9;)Lck7;

    move-result-object v1

    goto/16 :goto_0

    :cond_3
    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v1

    if-nez v1, :cond_4

    iget-object v13, v0, Lif7;->c:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

    iget-wide v14, v0, Lif7;->d:J

    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v16

    invoke-virtual {v11}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v17

    invoke-virtual {v12}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v18

    aget-object v1, v2, v3

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v19

    aget-object v1, v2, v4

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v20

    aget-object v1, v2, v5

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v21

    aget-object v1, v2, v3

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v22

    aget-object v1, v2, v4

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v23

    aget-object v1, v2, v5

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v24

    invoke-virtual/range {v13 .. v25}, Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;->c(J[B[B[BIIIIIILed9;)Lck7;

    move-result-object v1

    goto :goto_0

    :cond_4
    invoke-virtual {v10}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {v10, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v11}, Ljava/nio/Buffer;->remaining()I

    move-result v6

    new-array v6, v6, [B

    invoke-virtual {v10, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v12}, Ljava/nio/Buffer;->remaining()I

    move-result v7

    new-array v7, v7, [B

    invoke-virtual {v10, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    iget-object v13, v0, Lif7;->c:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

    iget-wide v14, v0, Lif7;->d:J

    aget-object v8, v2, v3

    invoke-virtual {v8}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v19

    aget-object v8, v2, v4

    invoke-virtual {v8}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v20

    aget-object v8, v2, v5

    invoke-virtual {v8}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v21

    aget-object v3, v2, v3

    invoke-virtual {v3}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v22

    aget-object v3, v2, v4

    invoke-virtual {v3}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v23

    aget-object v2, v2, v5

    invoke-virtual {v2}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v24

    move-object/from16 v16, v1

    move-object/from16 v17, v6

    move-object/from16 v18, v7

    invoke-virtual/range {v13 .. v25}, Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;->c(J[B[B[BIIIIIILed9;)Lck7;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_5

    invoke-virtual {v0, v1}, Lif7;->d5(Lck7;)Ljava/util/List;

    move-result-object v1

    goto :goto_1

    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    goto :goto_1

    :cond_6
    invoke-static/range {p1 .. p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v2, v1, v5}, Lif7;->f5(Ljava/nio/ByteBuffer;Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;I)Ljava/util/List;

    move-result-object v1

    goto :goto_1

    :cond_7
    invoke-static/range {p1 .. p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;

    invoke-static {v2, v4}, LOX7;->a(Landroid/graphics/Bitmap;Z)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v0, v2, v1, v5}, Lif7;->f5(Ljava/nio/ByteBuffer;Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmd;I)Ljava/util/List;

    move-result-object v1

    :goto_1
    return-object v1
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

    iget-object v4, v0, Lif7;->b:LVl7;

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
    iget-object v4, v0, Lif7;->b:LVl7;

    invoke-virtual {v4}, LVl7;->E()I

    move-result v4

    const-string v5, "ThickFaceDetector"

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

    const-string v6, "Unknown landmark type: "

    invoke-static {v11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

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
    move v6, v8

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

    new-instance v11, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmq;

    new-instance v8, Landroid/graphics/PointF;

    invoke-virtual/range {v19 .. v19}, Lgp9;->u()F

    move-result v12

    invoke-virtual/range {v19 .. v19}, Lgp9;->v()F

    move-result v13

    invoke-direct {v8, v12, v13}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-direct {v11, v6, v8}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmq;-><init>(ILandroid/graphics/PointF;)V

    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/16 v6, 0x9

    const/4 v8, 0x1

    goto :goto_5

    :cond_c
    const/16 v6, 0x9

    goto :goto_5

    :cond_d
    move-object v4, v7

    goto :goto_7

    :cond_e
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_7
    iget-object v6, v0, Lif7;->b:LVl7;

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

    :cond_f
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

    new-instance v12, Ljava/lang/StringBuilder;

    const/16 v13, 0x21

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v13, "Unknown contour type: "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v5, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

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
    if-eq v11, v9, :cond_f

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v8}, LHi7;->w()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_10

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lpy9;

    new-instance v9, Landroid/graphics/PointF;

    invoke-virtual {v13}, Lpy9;->u()F

    move-result v10

    invoke-virtual {v13}, Lpy9;->v()F

    move-result v13

    invoke-direct {v9, v10, v13}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v12, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v9, -0x1

    const/4 v10, 0x4

    goto :goto_a

    :cond_10
    new-instance v8, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmf;

    invoke-direct {v8, v11, v12}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmf;-><init>(ILjava/util/List;)V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v9, -0x1

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

    invoke-static {v1}, Lif7;->e5(I)I

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

    iget-object p3, p0, Lif7;->c:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

    iget-wide v0, p0, Lif7;->d:J

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

    iget-object p3, p0, Lif7;->c:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

    iget-wide v0, p0, Lif7;->d:J

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

    iget-object p1, p0, Lif7;->c:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

    iget-wide v0, p0, Lif7;->d:J

    invoke-virtual {p1, v0, v1, p3, p2}, Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;->b(J[BLed9;)Lck7;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_3

    invoke-virtual {p0, p1}, Lif7;->d5(Lck7;)Ljava/util/List;

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

    iget-object v0, p0, Lif7;->c:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

    iget-object v1, p0, Lif7;->b:LVl7;

    iget-object v2, p0, Lif7;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;->a(LVl7;Landroid/content/res/AssetManager;)J

    move-result-wide v0

    iput-wide v0, p0, Lif7;->d:J

    return-void
.end method

.method public final zzd()V
    .locals 4

    iget-wide v0, p0, Lif7;->d:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    iget-object v2, p0, Lif7;->c:Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;->f(J)V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lif7;->d:J

    :cond_0
    return-void
.end method
