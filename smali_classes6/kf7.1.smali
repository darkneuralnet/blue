.class public final Lkf7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGC7;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lhj1;

.field public c:Z

.field public d:Z

.field public e:Z

.field public final f:Ly49;

.field public g:Lo89;

.field public h:Lo89;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lhj1;Ly49;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkf7;->a:Landroid/content/Context;

    iput-object p2, p0, Lkf7;->b:Lhj1;

    iput-object p3, p0, Lkf7;->f:Ly49;

    return-void
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "com.google.mlkit.dynamite.face"

    invoke-static {p0, v0}, Lcom/google/android/gms/dynamite/DynamiteModule;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static f(Lo89;Lg32;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    invoke-virtual {p1}, Lg32;->g()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-static {}, LpX1;->g()LpX1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, LpX1;->e(Lg32;Z)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p1}, Lg32;->l()I

    move-result v1

    invoke-virtual {p1}, Lg32;->h()I

    move-result v2

    invoke-virtual {p1}, Lg32;->k()I

    move-result p1

    const/16 v3, 0x11

    invoke-static {v0, v1, v2, p1, v3}, Lg32;->a(Ljava/nio/ByteBuffer;IIII)Lg32;

    move-result-object p1

    :cond_0
    new-instance v7, Lcom/google/android/gms/internal/mlkit_vision_face/zznn;

    invoke-virtual {p1}, Lg32;->g()I

    move-result v1

    invoke-virtual {p1}, Lg32;->l()I

    move-result v2

    invoke-virtual {p1}, Lg32;->h()I

    move-result v3

    invoke-virtual {p1}, Lg32;->k()I

    move-result v0

    invoke-static {v0}, Lsp0;->a(I)I

    move-result v4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/mlkit_vision_face/zznn;-><init>(IIIIJ)V

    invoke-static {}, LsY1;->b()LsY1;

    move-result-object v0

    invoke-virtual {v0, p1}, LsY1;->a(Lg32;)LWO1;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0, v0, v7}, Lo89;->f5(LWO1;Lcom/google/android/gms/internal/mlkit_vision_face/zznn;)Ljava/util/List;

    move-result-object p0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/mlkit_vision_face/zznt;

    new-instance v2, Ldj1;

    invoke-virtual {p1}, Lg32;->f()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Ldj1;-><init>(Lcom/google/android/gms/internal/mlkit_vision_face/zznt;Landroid/graphics/Matrix;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lcom/google/mlkit/common/MlKitException;

    const-string v0, "Failed to run face detector."

    const/16 v1, 0xd

    invoke-direct {p1, v0, v1, p0}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public final a(Lg32;)Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    iget-object v0, p0, Lkf7;->h:Lo89;

    if-nez v0, :cond_0

    iget-object v0, p0, Lkf7;->g:Lo89;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkf7;->zzd()Z

    :cond_0
    iget-boolean v0, p0, Lkf7;->c:Z

    if-nez v0, :cond_3

    :try_start_0
    iget-object v0, p0, Lkf7;->h:Lo89;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lo89;->zze()V

    :cond_1
    iget-object v0, p0, Lkf7;->g:Lo89;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lo89;->zze()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkf7;->c:Z

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/mlkit/common/MlKitException;

    const-string v1, "Failed to init face detector."

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2, p1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v0

    :cond_3
    :goto_0
    iget-object v0, p0, Lkf7;->h:Lo89;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-static {v0, p1}, Lkf7;->f(Lo89;Lg32;)Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lkf7;->b:Lhj1;

    invoke-virtual {v2}, Lhj1;->g()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-static {v0}, LAt8;->k(Ljava/util/List;)V

    goto :goto_1

    :cond_4
    move-object v0, v1

    :cond_5
    :goto_1
    iget-object v2, p0, Lkf7;->g:Lo89;

    if-eqz v2, :cond_6

    invoke-static {v2, p1}, Lkf7;->f(Lo89;Lg32;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, LAt8;->k(Ljava/util/List;)V

    :cond_6
    new-instance p1, Landroid/util/Pair;

    invoke-direct {p1, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public final c(Lcom/google/android/gms/dynamite/DynamiteModule$a;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/mlkit_vision_face/zznr;)Lo89;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lkf7;->a:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$a;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, LE89;->c5(Landroid/os/IBinder;)LM89;

    move-result-object p1

    iget-object p2, p0, Lkf7;->a:Landroid/content/Context;

    invoke-static {p2}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object p2

    invoke-interface {p1, p2, p4}, LM89;->U0(LWO1;Lcom/google/android/gms/internal/mlkit_vision_face/zznr;)Lo89;

    move-result-object p1

    return-object p1
.end method

.method public final d()V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lkf7;->b:Lhj1;

    invoke-virtual {v0}, Lhj1;->c()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lkf7;->g:Lo89;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zznr;

    iget-object v2, p0, Lkf7;->b:Lhj1;

    invoke-virtual {v2}, Lhj1;->e()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x2

    const/4 v7, 0x0

    iget-object v2, p0, Lkf7;->b:Lhj1;

    invoke-virtual {v2}, Lhj1;->a()F

    move-result v8

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/mlkit_vision_face/zznr;-><init>(IIIIZF)V

    invoke-virtual {p0, v0}, Lkf7;->e(Lcom/google/android/gms/internal/mlkit_vision_face/zznr;)Lo89;

    move-result-object v0

    iput-object v0, p0, Lkf7;->g:Lo89;

    :cond_0
    iget-object v0, p0, Lkf7;->b:Lhj1;

    invoke-virtual {v0}, Lhj1;->d()I

    move-result v0

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lkf7;->b:Lhj1;

    invoke-virtual {v0}, Lhj1;->b()I

    move-result v0

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lkf7;->b:Lhj1;

    invoke-virtual {v0}, Lhj1;->e()I

    move-result v0

    if-ne v0, v1, :cond_3

    :cond_1
    iget-object v0, p0, Lkf7;->h:Lo89;

    if-nez v0, :cond_3

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zznr;

    iget-object v1, p0, Lkf7;->b:Lhj1;

    invoke-virtual {v1}, Lhj1;->e()I

    move-result v2

    iget-object v1, p0, Lkf7;->b:Lhj1;

    invoke-virtual {v1}, Lhj1;->d()I

    move-result v3

    iget-object v1, p0, Lkf7;->b:Lhj1;

    invoke-virtual {v1}, Lhj1;->b()I

    move-result v4

    const/4 v5, 0x1

    iget-object v1, p0, Lkf7;->b:Lhj1;

    invoke-virtual {v1}, Lhj1;->g()Z

    move-result v6

    iget-object v1, p0, Lkf7;->b:Lhj1;

    invoke-virtual {v1}, Lhj1;->a()F

    move-result v7

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/mlkit_vision_face/zznr;-><init>(IIIIZF)V

    invoke-virtual {p0, v0}, Lkf7;->e(Lcom/google/android/gms/internal/mlkit_vision_face/zznr;)Lo89;

    move-result-object v0

    iput-object v0, p0, Lkf7;->h:Lo89;

    return-void

    :cond_2
    iget-object v0, p0, Lkf7;->h:Lo89;

    if-nez v0, :cond_3

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zznr;

    iget-object v1, p0, Lkf7;->b:Lhj1;

    invoke-virtual {v1}, Lhj1;->e()I

    move-result v2

    iget-object v1, p0, Lkf7;->b:Lhj1;

    invoke-virtual {v1}, Lhj1;->d()I

    move-result v3

    iget-object v1, p0, Lkf7;->b:Lhj1;

    invoke-virtual {v1}, Lhj1;->b()I

    move-result v4

    const/4 v5, 0x1

    iget-object v1, p0, Lkf7;->b:Lhj1;

    invoke-virtual {v1}, Lhj1;->g()Z

    move-result v6

    iget-object v1, p0, Lkf7;->b:Lhj1;

    invoke-virtual {v1}, Lhj1;->a()F

    move-result v7

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/mlkit_vision_face/zznr;-><init>(IIIIZF)V

    invoke-virtual {p0, v0}, Lkf7;->e(Lcom/google/android/gms/internal/mlkit_vision_face/zznr;)Lo89;

    move-result-object v0

    iput-object v0, p0, Lkf7;->h:Lo89;

    :cond_3
    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/mlkit_vision_face/zznr;)Lo89;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-boolean v0, p0, Lkf7;->d:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->c:Lcom/google/android/gms/dynamite/DynamiteModule$a;

    const-string v1, "com.google.mlkit.dynamite.face"

    const-string v2, "com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator"

    invoke-virtual {p0, v0, v1, v2, p1}, Lkf7;->c(Lcom/google/android/gms/dynamite/DynamiteModule$a;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/mlkit_vision_face/zznr;)Lo89;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->b:Lcom/google/android/gms/dynamite/DynamiteModule$a;

    const-string v1, "com.google.android.gms.vision.face"

    const-string v2, "com.google.android.gms.vision.face.mlkit.FaceDetectorCreator"

    invoke-virtual {p0, v0, v1, v2, p1}, Lkf7;->c(Lcom/google/android/gms/dynamite/DynamiteModule$a;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/mlkit_vision_face/zznr;)Lo89;

    move-result-object p1

    return-object p1
.end method

.method public final zzb()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lkf7;->h:Lo89;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lo89;->g5()V

    iput-object v1, p0, Lkf7;->h:Lo89;

    :cond_0
    iget-object v0, p0, Lkf7;->g:Lo89;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lo89;->g5()V

    iput-object v1, p0, Lkf7;->g:Lo89;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "DecoupledFaceDelegate"

    const-string v2, "Failed to release face detector."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkf7;->c:Z

    return-void
.end method

.method public final zzd()Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    iget-object v0, p0, Lkf7;->h:Lo89;

    if-nez v0, :cond_3

    iget-object v0, p0, Lkf7;->g:Lo89;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lkf7;->a:Landroid/content/Context;

    const-string v1, "com.google.mlkit.dynamite.face"

    invoke-static {v0, v1}, Lcom/google/android/gms/dynamite/DynamiteModule;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    const/16 v2, 0xd

    if-lez v0, :cond_1

    iput-boolean v1, p0, Lkf7;->d:Z

    :try_start_0
    invoke-virtual {p0}, Lkf7;->d()V
    :try_end_0
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    const-string v3, "Failed to create thick face detector."

    invoke-direct {v1, v3, v2, v0}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    const-string v3, "Failed to load the bundled face module."

    invoke-direct {v1, v3, v2, v0}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkf7;->d:Z

    :try_start_1
    invoke-virtual {p0}, Lkf7;->d()V
    :try_end_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_2

    :goto_0
    iget-object v0, p0, Lkf7;->f:Ly49;

    iget-boolean v1, p0, Lkf7;->d:Z

    sget-object v2, LZN8;->c:LZN8;

    invoke-static {v0, v1, v2}, LhH8;->c(Ly49;ZLZN8;)V

    iget-boolean v0, p0, Lkf7;->d:Z

    return v0

    :catch_2
    move-exception v0

    iget-object v1, p0, Lkf7;->f:Ly49;

    iget-boolean v3, p0, Lkf7;->d:Z

    sget-object v4, LZN8;->E:LZN8;

    invoke-static {v1, v3, v4}, LhH8;->c(Ly49;ZLZN8;)V

    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    const-string v3, "Failed to create thin face detector."

    invoke-direct {v1, v3, v2, v0}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1

    :catch_3
    iget-boolean v0, p0, Lkf7;->e:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lkf7;->a:Landroid/content/Context;

    const-string v2, "face"

    invoke-static {v0, v2}, Lmy3;->c(Landroid/content/Context;Ljava/lang/String;)V

    iput-boolean v1, p0, Lkf7;->e:Z

    :cond_2
    iget-object v0, p0, Lkf7;->f:Ly49;

    iget-boolean v1, p0, Lkf7;->d:Z

    sget-object v2, LZN8;->D:LZN8;

    invoke-static {v0, v1, v2}, LhH8;->c(Ly49;ZLZN8;)V

    new-instance v0, Lcom/google/mlkit/common/MlKitException;

    const-string v1, "Waiting for the face module to be downloaded. Please wait."

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_3
    :goto_1
    iget-boolean v0, p0, Lkf7;->d:Z

    return v0
.end method
