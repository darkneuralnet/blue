.class public final LAY7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKT8;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzp;

.field public c:Z

.field public d:Lgt8;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzp;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LAY7;->b:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzp;

    iput-object p1, p0, LAY7;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(Lg32;)Lp06;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    iget-object v0, p0, LAY7;->d:Lgt8;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LAY7;->zzb()V

    :cond_0
    iget-object v0, p0, LAY7;->d:Lgt8;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lg32;->g()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lg32;->d()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p1}, Lg32;->k()I

    move-result v1

    invoke-static {v1}, Lsp0;->a(I)I

    move-result v1

    goto :goto_0

    :cond_1
    invoke-static {}, LpX1;->g()LpX1;

    move-result-object v0

    invoke-virtual {v0, p1}, LpX1;->f(Lg32;)Landroid/graphics/Bitmap;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    move v7, v1

    invoke-static {v0}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object v0

    new-instance v8, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzd;

    invoke-virtual {p1}, Lg32;->l()I

    move-result v2

    invoke-virtual {p1}, Lg32;->h()I

    move-result v3

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzd;-><init>(IIIJI)V

    :try_start_0
    iget-object v1, p0, LAY7;->d:Lgt8;

    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgt8;

    invoke-virtual {v1, v0, v8}, Lgt8;->f5(LWO1;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzd;)[Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Lg32;->f()Landroid/graphics/Matrix;

    move-result-object p1

    invoke-static {v0, p1}, LiH8;->a([Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;Landroid/graphics/Matrix;)Lp06;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/mlkit/common/MlKitException;

    const-string v1, "Failed to run legacy text recognizer."

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2, p1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v0

    :cond_2
    new-instance p1, Lcom/google/mlkit/common/MlKitException;

    const-string v0, "Waiting for the text recognition module to be downloaded. Please wait."

    const/16 v1, 0xe

    invoke-direct {p1, v0, v1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;I)V

    throw p1
.end method

.method public final zzb()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    iget-object v0, p0, LAY7;->d:Lgt8;

    if-nez v0, :cond_1

    const/16 v0, 0xd

    :try_start_0
    iget-object v1, p0, LAY7;->a:Landroid/content/Context;

    sget-object v2, Lcom/google/android/gms/dynamite/DynamiteModule;->b:Lcom/google/android/gms/dynamite/DynamiteModule$a;

    const-string v3, "com.google.android.gms.vision.dynamite"

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$a;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object v1

    const-string v2, "com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, LOG8;->c5(Landroid/os/IBinder;)LsN8;

    move-result-object v1

    iget-object v2, p0, LAY7;->a:Landroid/content/Context;

    invoke-static {v2}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object v2

    iget-object v3, p0, LAY7;->b:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzp;

    invoke-interface {v1, v2, v3}, LsN8;->w1(LWO1;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzp;)Lgt8;

    move-result-object v1

    iput-object v1, p0, LAY7;->d:Lgt8;

    if-nez v1, :cond_0

    iget-boolean v1, p0, LAY7;->c:Z

    if-nez v1, :cond_0

    const-string v1, "LegacyTextDelegate"

    const-string v2, "Request OCR optional module download."

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, LAY7;->a:Landroid/content/Context;

    const-string v2, "ocr"

    invoke-static {v1, v2}, Lmy3;->c(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, LAY7;->c:Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v1

    new-instance v2, Lcom/google/mlkit/common/MlKitException;

    const-string v3, "Failed to load deprecated vision dynamite module."

    invoke-direct {v2, v3, v0, v1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v2

    :catch_1
    move-exception v1

    new-instance v2, Lcom/google/mlkit/common/MlKitException;

    const-string v3, "Failed to create legacy text recognizer."

    invoke-direct {v2, v3, v0, v1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v2

    :cond_1
    return-void
.end method

.method public final zzc()V
    .locals 3

    iget-object v0, p0, LAY7;->d:Lgt8;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Lgt8;->zzd()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "LegacyTextDelegate"

    const-string v2, "Failed to release legacy text recognizer."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, LAY7;->d:Lgt8;

    :cond_0
    return-void
.end method
