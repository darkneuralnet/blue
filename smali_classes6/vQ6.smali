.class public final LvQ6;
.super LO77;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public e:Lp47;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, LO77;-><init>()V

    iput-object p1, p0, LvQ6;->a:Landroid/content/Context;

    iput-object p2, p0, LvQ6;->b:Ljava/lang/String;

    iput-object p3, p0, LvQ6;->c:Ljava/lang/String;

    iput-object p4, p0, LvQ6;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b0(LWO1;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbom;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, LvQ6;->e:Lp47;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp47;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Lp47;->b(LWO1;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;Z)Li77;

    move-result-object p1

    invoke-virtual {p1}, Li77;->c()LL77;

    move-result-object p2

    invoke-virtual {p2}, LL77;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Li77;->b()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbom;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p2}, LL77;->b()LI57;

    move-result-object p1

    invoke-virtual {p1}, LI57;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :cond_1
    new-instance p1, Landroid/os/RemoteException;

    const-string p2, "Process is started without initiation."

    invoke-direct {p1, p2}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final y(LWO1;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;)[Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbf;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance p1, Landroid/os/RemoteException;

    const-string p2, "#recognizeBitmap should not be triggered from text thick client."

    invoke-direct {p1, p2}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zbc()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, LvQ6;->e:Lp47;

    if-nez v0, :cond_3

    const-string v0, "mlkit_google_ocr_pipeline"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    iget-object v0, p0, LvQ6;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LvQ6;->d:Ljava/lang/String;

    goto :goto_1

    :cond_1
    :goto_0
    const-string v0, ""

    :goto_1
    iget-object v1, p0, LvQ6;->b:Ljava/lang/String;

    iget-object v2, p0, LvQ6;->c:Ljava/lang/String;

    invoke-static {v1, v2, v0}, LLu6;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LLu6$a;

    move-result-object v0

    iget-object v1, p0, LvQ6;->a:Landroid/content/Context;

    invoke-virtual {v0}, LLu6$a;->a()LLu6;

    move-result-object v0

    invoke-static {v1, v0}, Lp47;->a(Landroid/content/Context;LLu6;)Lp47;

    move-result-object v0

    iput-object v0, p0, LvQ6;->e:Lp47;

    invoke-virtual {v0}, Lp47;->c()LL77;

    move-result-object v0

    invoke-virtual {v0}, LL77;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, LL77;->b()LI57;

    move-result-object v0

    invoke-virtual {v0}, LI57;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    :cond_3
    :goto_2
    return-void
.end method

.method public final zbd()V
    .locals 1

    iget-object v0, p0, LvQ6;->e:Lp47;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lp47;->d()V

    const/4 v0, 0x0

    iput-object v0, p0, LvQ6;->e:Lp47;

    :cond_0
    return-void
.end method
