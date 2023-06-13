.class public final LzZ8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGC7;


# instance fields
.field public a:Z

.field public final b:Landroid/content/Context;

.field public final c:Lhj1;

.field public final d:I

.field public final e:Ly49;

.field public f:LLG8;

.field public g:LLG8;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lhj1;Ly49;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzZ8;->b:Landroid/content/Context;

    iput-object p2, p0, LzZ8;->c:Lhj1;

    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailabilityLight;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->getApkVersion(Landroid/content/Context;)I

    move-result p1

    iput p1, p0, LzZ8;->d:I

    iput-object p3, p0, LzZ8;->e:Ly49;

    return-void
.end method

.method public static b(I)I
    .locals 3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x28

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Invalid classification type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static c(I)I
    .locals 3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x22

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Invalid landmark type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static d(I)I
    .locals 3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x1e

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Invalid mode type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(Lg32;)Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    iget-object v0, p0, LzZ8;->f:LLG8;

    if-nez v0, :cond_0

    iget-object v0, p0, LzZ8;->g:LLG8;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LzZ8;->zzd()Z

    :cond_0
    iget-object v0, p0, LzZ8;->f:LLG8;

    if-nez v0, :cond_2

    iget-object v1, p0, LzZ8;->g:LLG8;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/google/mlkit/common/MlKitException;

    const-string v0, "Waiting for the face detection module to be downloaded. Please wait."

    const/16 v1, 0xe

    invoke-direct {p1, v0, v1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;I)V

    throw p1

    :cond_2
    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0, p1}, LzZ8;->e(LLG8;Lg32;)Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, LzZ8;->c:Lhj1;

    invoke-virtual {v2}, Lhj1;->g()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {v0}, LAt8;->k(Ljava/util/List;)V

    goto :goto_1

    :cond_3
    move-object v0, v1

    :cond_4
    :goto_1
    iget-object v2, p0, LzZ8;->g:LLG8;

    if-eqz v2, :cond_5

    invoke-virtual {p0, v2, p1}, LzZ8;->e(LLG8;Lg32;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, LAt8;->k(Ljava/util/List;)V

    :cond_5
    new-instance p1, Landroid/util/Pair;

    invoke-direct {p1, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public final e(LLG8;Lg32;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    :try_start_0
    new-instance v11, Lcom/google/android/gms/internal/mlkit_vision_face/zzp;

    invoke-virtual/range {p2 .. p2}, Lg32;->l()I

    move-result v2

    invoke-virtual/range {p2 .. p2}, Lg32;->h()I

    move-result v3

    const/4 v4, 0x0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    invoke-virtual/range {p2 .. p2}, Lg32;->k()I

    move-result v0

    invoke-static {v0}, Lsp0;->a(I)I

    move-result v7

    move-object v1, v11

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/mlkit_vision_face/zzp;-><init>(IIIJI)V

    invoke-virtual/range {p2 .. p2}, Lg32;->g()I

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    const/16 v1, 0x23

    const/4 v12, 0x0

    if-ne v0, v1, :cond_0

    move-object v13, p0

    :try_start_1
    iget v0, v13, LzZ8;->d:I

    const v1, 0xc02a560

    if-lt v0, v1, :cond_1

    invoke-virtual/range {p2 .. p2}, Lg32;->j()[Landroid/media/Image$Plane;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/media/Image$Plane;

    aget-object v1, v0, v12

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {v1}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object v2

    const/4 v1, 0x1

    aget-object v3, v0, v1

    invoke-virtual {v3}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-static {v3}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object v3

    const/4 v4, 0x2

    aget-object v5, v0, v4

    invoke-virtual {v5}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-static {v5}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object v5

    aget-object v6, v0, v12

    invoke-virtual {v6}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v6

    aget-object v7, v0, v1

    invoke-virtual {v7}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v7

    aget-object v8, v0, v4

    invoke-virtual {v8}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v8

    aget-object v9, v0, v12

    invoke-virtual {v9}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v9

    aget-object v1, v0, v1

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v10

    aget-object v0, v0, v4

    invoke-virtual {v0}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v0

    move-object v1, p1

    move-object v4, v5

    move v5, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v10

    move v10, v0

    invoke-virtual/range {v1 .. v11}, LLG8;->g5(LWO1;LWO1;LWO1;IIIIIILcom/google/android/gms/internal/mlkit_vision_face/zzp;)[Lcom/google/android/gms/internal/mlkit_vision_face/zzf;

    move-result-object v0

    move-object/from16 v1, p2

    goto :goto_0

    :cond_0
    move-object v13, p0

    :cond_1
    invoke-static {}, LpX1;->g()LpX1;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1, v12}, LpX1;->e(Lg32;Z)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object v0

    move-object v2, p1

    invoke-virtual {p1, v0, v11}, LLG8;->f5(LWO1;Lcom/google/android/gms/internal/mlkit_vision_face/zzp;)[Lcom/google/android/gms/internal/mlkit_vision_face/zzf;

    move-result-object v0
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    array-length v3, v0

    :goto_1
    if-ge v12, v3, :cond_2

    aget-object v4, v0, v12

    new-instance v5, Ldj1;

    invoke-virtual/range {p2 .. p2}, Lg32;->f()Landroid/graphics/Matrix;

    move-result-object v6

    invoke-direct {v5, v4, v6}, Ldj1;-><init>(Lcom/google/android/gms/internal/mlkit_vision_face/zzf;Landroid/graphics/Matrix;)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_2
    return-object v2

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v13, p0

    :goto_2
    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    const-string v2, "Failed to detect with legacy face detector"

    const/16 v3, 0xd

    invoke-direct {v1, v2, v3, v0}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1
.end method

.method public final zzb()V
    .locals 4

    iget-object v0, p0, LzZ8;->f:LLG8;

    const-string v1, "Failed to release legacy face detector."

    const-string v2, "LegacyFaceDelegate"

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, LLG8;->zzd()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    iput-object v3, p0, LzZ8;->f:LLG8;

    :cond_0
    iget-object v0, p0, LzZ8;->g:LLG8;

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {v0}, LLG8;->zzd()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    iput-object v3, p0, LzZ8;->g:LLG8;

    :cond_1
    return-void
.end method

.method public final zzd()Z
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    iget-object v0, p0, LzZ8;->f:LLG8;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    iget-object v0, p0, LzZ8;->g:LLG8;

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const/16 v0, 0xd

    :try_start_0
    iget-object v2, p0, LzZ8;->b:Landroid/content/Context;

    sget-object v3, Lcom/google/android/gms/dynamite/DynamiteModule;->b:Lcom/google/android/gms/dynamite/DynamiteModule$a;

    const-string v4, "com.google.android.gms.vision.dynamite"

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$a;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object v2

    const-string v3, "com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v2

    invoke-static {v2}, LrT8;->c5(Landroid/os/IBinder;)LfZ8;

    move-result-object v2

    iget-object v3, p0, LzZ8;->b:Landroid/content/Context;

    invoke-static {v3}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object v3

    iget-object v4, p0, LzZ8;->c:Lhj1;

    invoke-virtual {v4}, Lhj1;->c()I

    move-result v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_3

    iget-object v4, p0, LzZ8;->g:LLG8;

    if-nez v4, :cond_1

    new-instance v4, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;

    const/4 v7, 0x2

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    iget-object v6, p0, LzZ8;->c:Lhj1;

    invoke-virtual {v6}, Lhj1;->a()F

    move-result v12

    move-object v6, v4

    invoke-direct/range {v6 .. v12}, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;-><init>(IIIZZF)V

    invoke-interface {v2, v3, v4}, LfZ8;->J4(LWO1;Lcom/google/android/gms/internal/mlkit_vision_face/zzh;)LLG8;

    move-result-object v4

    iput-object v4, p0, LzZ8;->g:LLG8;

    :cond_1
    iget-object v4, p0, LzZ8;->c:Lhj1;

    invoke-virtual {v4}, Lhj1;->d()I

    move-result v4

    if-eq v4, v5, :cond_2

    iget-object v4, p0, LzZ8;->c:Lhj1;

    invoke-virtual {v4}, Lhj1;->b()I

    move-result v4

    if-eq v4, v5, :cond_2

    iget-object v4, p0, LzZ8;->c:Lhj1;

    invoke-virtual {v4}, Lhj1;->e()I

    move-result v4

    if-ne v4, v5, :cond_4

    :cond_2
    iget-object v4, p0, LzZ8;->f:LLG8;

    if-nez v4, :cond_4

    new-instance v4, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;

    iget-object v5, p0, LzZ8;->c:Lhj1;

    invoke-virtual {v5}, Lhj1;->e()I

    move-result v5

    invoke-static {v5}, LzZ8;->d(I)I

    move-result v6

    iget-object v5, p0, LzZ8;->c:Lhj1;

    invoke-virtual {v5}, Lhj1;->d()I

    move-result v5

    invoke-static {v5}, LzZ8;->c(I)I

    move-result v7

    iget-object v5, p0, LzZ8;->c:Lhj1;

    invoke-virtual {v5}, Lhj1;->b()I

    move-result v5

    invoke-static {v5}, LzZ8;->b(I)I

    move-result v8

    const/4 v9, 0x0

    iget-object v5, p0, LzZ8;->c:Lhj1;

    invoke-virtual {v5}, Lhj1;->g()Z

    move-result v10

    iget-object v5, p0, LzZ8;->c:Lhj1;

    invoke-virtual {v5}, Lhj1;->a()F

    move-result v11

    move-object v5, v4

    invoke-direct/range {v5 .. v11}, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;-><init>(IIIZZF)V

    invoke-interface {v2, v3, v4}, LfZ8;->J4(LWO1;Lcom/google/android/gms/internal/mlkit_vision_face/zzh;)LLG8;

    move-result-object v2

    iput-object v2, p0, LzZ8;->f:LLG8;

    goto :goto_0

    :cond_3
    iget-object v4, p0, LzZ8;->f:LLG8;

    if-nez v4, :cond_4

    new-instance v4, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;

    iget-object v5, p0, LzZ8;->c:Lhj1;

    invoke-virtual {v5}, Lhj1;->e()I

    move-result v5

    invoke-static {v5}, LzZ8;->d(I)I

    move-result v6

    iget-object v5, p0, LzZ8;->c:Lhj1;

    invoke-virtual {v5}, Lhj1;->d()I

    move-result v5

    invoke-static {v5}, LzZ8;->c(I)I

    move-result v7

    iget-object v5, p0, LzZ8;->c:Lhj1;

    invoke-virtual {v5}, Lhj1;->b()I

    move-result v5

    invoke-static {v5}, LzZ8;->b(I)I

    move-result v8

    const/4 v9, 0x0

    iget-object v5, p0, LzZ8;->c:Lhj1;

    invoke-virtual {v5}, Lhj1;->g()Z

    move-result v10

    iget-object v5, p0, LzZ8;->c:Lhj1;

    invoke-virtual {v5}, Lhj1;->a()F

    move-result v11

    move-object v5, v4

    invoke-direct/range {v5 .. v11}, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;-><init>(IIIZZF)V

    invoke-interface {v2, v3, v4}, LfZ8;->J4(LWO1;Lcom/google/android/gms/internal/mlkit_vision_face/zzh;)LLG8;

    move-result-object v2

    iput-object v2, p0, LzZ8;->f:LLG8;

    :cond_4
    :goto_0
    iget-object v2, p0, LzZ8;->f:LLG8;

    if-nez v2, :cond_5

    iget-object v2, p0, LzZ8;->g:LLG8;

    if-nez v2, :cond_5

    iget-boolean v2, p0, LzZ8;->a:Z

    if-nez v2, :cond_5

    const-string v2, "LegacyFaceDelegate"

    const-string v3, "Request face optional module download."

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v2, p0, LzZ8;->b:Landroid/content/Context;

    const-string v3, "barcode"

    invoke-static {v2, v3}, Lmy3;->c(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v2, 0x1

    iput-boolean v2, p0, LzZ8;->a:Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_5
    iget-object v0, p0, LzZ8;->e:Ly49;

    sget-object v2, LZN8;->c:LZN8;

    invoke-static {v0, v1, v2}, LhH8;->c(Ly49;ZLZN8;)V

    return v1

    :catch_0
    move-exception v1

    new-instance v2, Lcom/google/mlkit/common/MlKitException;

    const-string v3, "Failed to load deprecated vision dynamite module."

    invoke-direct {v2, v3, v0, v1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v2

    :catch_1
    move-exception v1

    new-instance v2, Lcom/google/mlkit/common/MlKitException;

    const-string v3, "Failed to create legacy face detector."

    invoke-direct {v2, v3, v0, v1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v2

    :cond_6
    :goto_1
    return v1
.end method
