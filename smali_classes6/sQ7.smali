.class public final LsQ7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKT8;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lx26;

.field public c:Z

.field public d:Z

.field public final e:Lmm9;

.field public f:Ljo9;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lx26;Lmm9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LsQ7;->a:Landroid/content/Context;

    iput-object p2, p0, LsQ7;->b:Lx26;

    iput-object p3, p0, LsQ7;->e:Lmm9;

    return-void
.end method

.method public static b(Lx26;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsi;
    .locals 8

    new-instance v7, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsi;

    invoke-interface {p0}, Lx26;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0}, Lx26;->g()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lx26;->f()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x8

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x7

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x6

    goto :goto_0

    :pswitch_3
    const/4 v0, 0x5

    goto :goto_0

    :pswitch_4
    const/4 v0, 0x4

    goto :goto_0

    :pswitch_5
    const/4 v0, 0x3

    goto :goto_0

    :pswitch_6
    const/4 v0, 0x2

    :goto_0
    const/4 v4, 0x1

    add-int/lit8 v5, v0, -0x1

    invoke-interface {p0}, Lx26;->e()Ljava/lang/String;

    move-result-object v6

    move-object v0, v7

    move-object v3, p1

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsi;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;)V

    return-object v7

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Lg32;)Lp06;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    iget-object v0, p0, LsQ7;->f:Ljo9;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LsQ7;->zzb()V

    :cond_0
    iget-object v0, p0, LsQ7;->f:Ljo9;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljo9;

    iget-boolean v1, p0, LsQ7;->c:Z

    const/16 v2, 0xd

    if-nez v1, :cond_1

    :try_start_0
    invoke-virtual {v0}, Ljo9;->zze()V

    const/4 v1, 0x1

    iput-boolean v1, p0, LsQ7;->c:Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v0, p0, LsQ7;->b:Lx26;

    invoke-interface {v0}, Lx26;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    const-string v3, "Failed to init text recognizer "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, v2, p1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1

    :cond_1
    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrr;

    invoke-virtual {p1}, Lg32;->g()I

    move-result v4

    invoke-virtual {p1}, Lg32;->l()I

    move-result v5

    invoke-virtual {p1}, Lg32;->h()I

    move-result v6

    invoke-virtual {p1}, Lg32;->k()I

    move-result v3

    invoke-static {v3}, Lsp0;->a(I)I

    move-result v7

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrr;-><init>(IIIIJ)V

    invoke-static {}, LsY1;->b()LsY1;

    move-result-object v3

    invoke-virtual {v3, p1}, LsY1;->a(Lg32;)LWO1;

    move-result-object v3

    :try_start_1
    invoke-virtual {v0, v3, v1}, Ljo9;->f5(LWO1;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrr;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsg;

    move-result-object v0

    new-instance v1, Lp06;

    invoke-virtual {p1}, Lg32;->f()Landroid/graphics/Matrix;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lp06;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsg;Landroid/graphics/Matrix;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v1

    :catch_1
    move-exception p1

    iget-object v0, p0, LsQ7;->b:Lx26;

    invoke-interface {v0}, Lx26;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    const-string v3, "Failed to run text recognizer "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, v2, p1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1
.end method

.method public final zzb()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    iget-object v0, p0, LsQ7;->f:Ljo9;

    if-nez v0, :cond_6

    const/16 v0, 0xd

    const/4 v1, 0x1

    :try_start_0
    iget-object v2, p0, LsQ7;->b:Lx26;

    instance-of v3, v2, LJC7;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    check-cast v2, LJC7;

    invoke-interface {v2}, LJC7;->zza()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v4

    :goto_0
    iget-object v5, p0, LsQ7;->b:Lx26;

    invoke-interface {v5}, Lx26;->d()Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v3, p0, LsQ7;->a:Landroid/content/Context;

    sget-object v4, Lcom/google/android/gms/dynamite/DynamiteModule;->c:Lcom/google/android/gms/dynamite/DynamiteModule$a;

    iget-object v5, p0, LsQ7;->b:Lx26;

    invoke-interface {v5}, Lx26;->i()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$a;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object v3

    const-string v4, "com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator"

    invoke-virtual {v3, v4}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v3

    invoke-static {v3}, Lso9;->c5(Landroid/os/IBinder;)Lxo9;

    move-result-object v3

    iget-object v4, p0, LsQ7;->a:Landroid/content/Context;

    invoke-static {v4}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object v4

    iget-object v5, p0, LsQ7;->b:Lx26;

    invoke-static {v5, v2}, LsQ7;->b(Lx26;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsi;

    move-result-object v2

    invoke-interface {v3, v4, v2}, Lxo9;->t0(LWO1;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsi;)Ljo9;

    move-result-object v2

    goto :goto_1

    :cond_1
    if-eqz v3, :cond_2

    iget-object v3, p0, LsQ7;->a:Landroid/content/Context;

    sget-object v5, Lcom/google/android/gms/dynamite/DynamiteModule;->b:Lcom/google/android/gms/dynamite/DynamiteModule$a;

    iget-object v6, p0, LsQ7;->b:Lx26;

    invoke-interface {v6}, Lx26;->i()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v5, v6}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$a;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object v3

    const-string v5, "com.google.android.gms.vision.text.mlkit.CommonTextRecognizerCreator"

    invoke-virtual {v3, v5}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v3

    invoke-static {v3}, LZn9;->c5(Landroid/os/IBinder;)Leo9;

    move-result-object v3

    iget-object v5, p0, LsQ7;->a:Landroid/content/Context;

    invoke-static {v5}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object v5

    iget-object v6, p0, LsQ7;->b:Lx26;

    invoke-static {v6, v2}, LsQ7;->b(Lx26;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsi;

    move-result-object v2

    invoke-interface {v3, v5, v4, v2}, Leo9;->t3(LWO1;LWO1;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsi;)Ljo9;

    move-result-object v2

    goto :goto_1

    :cond_2
    iget-object v3, p0, LsQ7;->a:Landroid/content/Context;

    sget-object v4, Lcom/google/android/gms/dynamite/DynamiteModule;->b:Lcom/google/android/gms/dynamite/DynamiteModule$a;

    iget-object v5, p0, LsQ7;->b:Lx26;

    invoke-interface {v5}, Lx26;->i()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$a;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object v3

    const-string v4, "com.google.android.gms.vision.text.mlkit.TextRecognizerCreator"

    invoke-virtual {v3, v4}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v3

    invoke-static {v3}, Lso9;->c5(Landroid/os/IBinder;)Lxo9;

    move-result-object v3

    iget-object v4, p0, LsQ7;->b:Lx26;

    invoke-interface {v4}, Lx26;->f()I

    move-result v4

    if-ne v4, v1, :cond_3

    iget-object v2, p0, LsQ7;->a:Landroid/content/Context;

    invoke-static {v2}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object v2

    invoke-interface {v3, v2}, Lxo9;->M3(LWO1;)Ljo9;

    move-result-object v2

    goto :goto_1

    :cond_3
    iget-object v4, p0, LsQ7;->a:Landroid/content/Context;

    invoke-static {v4}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object v4

    iget-object v5, p0, LsQ7;->b:Lx26;

    invoke-static {v5, v2}, LsQ7;->b(Lx26;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsi;

    move-result-object v2

    invoke-interface {v3, v4, v2}, Lxo9;->t0(LWO1;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsi;)Ljo9;

    move-result-object v2

    :goto_1
    iput-object v2, p0, LsQ7;->f:Ljo9;

    iget-object v2, p0, LsQ7;->e:Lmm9;

    iget-object v3, p0, LsQ7;->b:Lx26;

    invoke-interface {v3}, Lx26;->d()Z

    move-result v3

    sget-object v4, LV39;->c:LV39;

    invoke-static {v2, v3, v4}, LXx2;->b(Lmm9;ZLV39;)V
    :try_end_0
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    iget-object v2, p0, LsQ7;->e:Lmm9;

    iget-object v3, p0, LsQ7;->b:Lx26;

    invoke-interface {v3}, Lx26;->d()Z

    move-result v3

    sget-object v4, LV39;->E:LV39;

    invoke-static {v2, v3, v4}, LXx2;->b(Lmm9;ZLV39;)V

    iget-object v2, p0, LsQ7;->b:Lx26;

    invoke-interface {v2}, Lx26;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/mlkit/common/MlKitException;

    const-string v4, "Failed to create text recognizer "

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2, v0, v1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v3

    :catch_1
    move-exception v2

    iget-object v3, p0, LsQ7;->e:Lmm9;

    iget-object v4, p0, LsQ7;->b:Lx26;

    invoke-interface {v4}, Lx26;->d()Z

    move-result v4

    sget-object v5, LV39;->D:LV39;

    invoke-static {v3, v4, v5}, LXx2;->b(Lmm9;ZLV39;)V

    iget-object v3, p0, LsQ7;->b:Lx26;

    invoke-interface {v3}, Lx26;->d()Z

    move-result v3

    if-nez v3, :cond_5

    iget-boolean v0, p0, LsQ7;->d:Z

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    iget-object v0, p0, LsQ7;->a:Landroid/content/Context;

    iget-object v2, p0, LsQ7;->b:Lx26;

    invoke-static {v2}, Lm26;->a(Lx26;)[Lcom/google/android/gms/common/Feature;

    move-result-object v2

    invoke-static {v0, v2}, Lmy3;->e(Landroid/content/Context;[Lcom/google/android/gms/common/Feature;)V

    iput-boolean v1, p0, LsQ7;->d:Z

    :goto_2
    new-instance v0, Lcom/google/mlkit/common/MlKitException;

    const-string v1, "Waiting for the text optional module to be downloaded. Please wait."

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_5
    new-instance v3, Lcom/google/mlkit/common/MlKitException;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, LsQ7;->b:Lx26;

    invoke-interface {v5}, Lx26;->b()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v1

    const-string v1, "Failed to load text module %s. %s"

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1, v0, v2}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v3

    :cond_6
    return-void
.end method

.method public final zzc()V
    .locals 3

    iget-object v0, p0, LsQ7;->f:Ljo9;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Ljo9;->g5()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, LsQ7;->b:Lx26;

    invoke-interface {v1}, Lx26;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Failed to release text recognizer "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "DecoupledTextDelegate"

    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, LsQ7;->f:Ljo9;

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, LsQ7;->c:Z

    return-void
.end method
